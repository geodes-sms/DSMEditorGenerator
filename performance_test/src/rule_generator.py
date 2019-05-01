import random, os

###### Constants ######
EMPTY = '_'
CONTEXT = 'f'
INTERFACE_ELEMENT = 'I'
LANGUAGE_ELEMENT = 'L'
CRUD = ('add','rem','update')
######

replicas = 5            # number of models of same rule size
rule_sizes = [1,5]+[i for i in range(10,301,10)]    # the number of rules to generate
max_elem = 10           # maximum number of interface or language elements per state. minimum is 1
int_lang_ratio = .5     # probability of an element being a language or interface element
reuse_new_ratio = .5    # probability of an element to be reused from another rule
empty_weight = [False] * 4 + [True] * 6    # weight for an interface element to be empty in the effect

class Params:
    def __init__(self):
        self.rule_id = 1             # last id of a rule, when generating multiple rules
        self.last_int_values = [0] * max_elem    # last new value assigned per interface element
        self.last_lang_elem = 0      # last id of a language element

class Stats:
    def __init__(self, name):
        self.rule_name = name
        self.alphas = 0
        self.layers = 0
        self.lang_elements = 0
        self.reused_elements = 0
        self.min_cond_size = 1
        self.max_cond_size = 0
        self.avg_cond_size = 0.0
        self.min_eff_size = 1
        self.max_eff_size = 0
        self.avg_eff_size = 0.0

    def __str__(self):
        return """
Statistics for %s********************
Alphas: %d
Reused elements: %d
Layers (and interface elements) used: %d
Language elements used: %d
Min condition size:%d
Max condition size:%d
Avg condition size:%d
Min effect size:%d
Max effect size:%d
Avg effect size:%d
""" % (self.rule_name,self.alphas,self.reused_elements,self.layers,self.lang_elements,self.min_cond_size,self.max_cond_size,self.avg_cond_size,self.min_eff_size,self.max_eff_size,self.avg_eff_size)
    


def generateElement(focus,isEffect,stats,params):
    element = dict()
    if focus: element['context'] = CONTEXT
    else: element['context'] = EMPTY

    isLang = random.random() > int_lang_ratio       # should it be a language or interface element
    isReused = random.random() > reuse_new_ratio    # should it be a new or reused element
    if isLang:
        element['type'] = LANGUAGE_ELEMENT
        if isReused:
            if params.last_lang_elem == 0: params.last_lang_elem += 1
            element['id'] = random.randint(1, max(params.last_lang_elem,max_elem))
            stats.reused_elements += 1
        else:
            if params.last_lang_elem < max_elem:
                params.last_lang_elem += 1
                element['id'] = params.last_lang_elem
            else:
                element['id'] = random.randint(1, max_elem)
        if isEffect:
            element['value'] = random.choice(CRUD)
        else:
            element['value'] = EMPTY
    else: # is interface
        element['type'] = INTERFACE_ELEMENT
        element['id'] = random.randint(1, max_elem)     # choose one element
        if not isEffect: # is condition
          isEmpty = random.choice(empty_weight)
          if isEmpty:
            element['value'] = EMPTY
          else:
            isReused = True
        if isReused:
            val = random.randint(0, params.last_int_values[element['id']-1])   # a used value for this interface element id
            if val == 0: val = EMPTY
            element['value'] = val
            stats.reused_elements += 1
        else:
            params.last_int_values[element['id']-1] += 1
            element['value'] = params.last_int_values[element['id']-1]   # a new value for this interface element id
    return element

def generateRule(stats,params):
    # Building the data structure for a rule
    r = {'id':params.rule_id}
    params.rule_id += 1
    # Elements in the condition
    focus = True
    rule = 'R{r[id]} # C{r[id]} | '.format(r=r)
    n = random.randint(1, max_elem)
    for i in range(n):
        element = generateElement(focus,False,stats,params)
        if focus: focus = False   # exactly one context element in the rule
        rule += '{c[context]}:{c[type]}:E{c[id]}:{c[value]}'.format(c=element)
        if i < n - 1:
            rule += ','
    stats.min_cond_size = min(stats.min_cond_size,n)
    stats.max_cond_size = max(stats.max_cond_size,n)
    stats.avg_cond_size += n
    # Elements in the effect
    rule += ' # --- event --> # E{r[id]} | '.format(r=r)
    n = random.randint(1, max_elem)
    for i in range(n):
        element = generateElement(False,True,stats,params)
        rule += '{c[context]}:{c[type]}:E{c[id]}:{c[value]}'.format(c=element)
        if i < n - 1:
            rule += ','
    stats.min_eff_size = min(stats.min_eff_size,n)
    stats.max_eff_size = max(stats.max_eff_size,n)
    stats.avg_eff_size += n
    return rule + ' #\n'


###### Run the program ######
for seed in range(1,replicas+1):
    random.seed(seed)  # to reproduce the same output on every execution
    seed_name = chr(ord('V') + seed - 1)
    folder = 'Seed_' + seed_name
    if not os.path.exists(folder):
        os.makedirs(folder)
    folder += os.path.sep
    with open(folder + 'Statistics.txt', 'w') as statsFile:
        for num_rules in rule_sizes:
            rule_name = 'Synthetic' + str(num_rules) + seed_name
            stats = Stats(rule_name)
            params = Params()
            with open(folder + rule_name + '.interactionTxt', 'w') as ruleFile:
                for _ in range(num_rules):
                    rule = generateRule(stats,params)
                    ruleFile.write(rule)
                stats.avg_cond_size /= num_rules
                stats.avg_eff_size /= num_rules
            stats.alphas = sum(params.last_int_values) + params.last_lang_elem   # unique element values
            stats.layers = [1 for i in range(len(params.last_int_values)) if params.last_int_values[i] > 0]
            stats.layers = sum(stats.layers)
            stats.lang_elements = params.last_lang_elem
            statsFile.write(str(stats))
