Requires Python 3.7



Intended format:
NewModel # E1 | f:I:newModel:_ # --- select --> # E2 | _:O:3001:newModel #

*********************
Grammar:
*********************
RULE = RULE_NAME # CONDITION_NAME | ALPHA (, ALPHA)* # --- event --> # EFFECT_NAME | ALPHA (, ALPHA)* #
ALPHA = (FOCUS,NOTHING):(INT_ELEM,LANG_ELEM):ELEMENT_NAME:VALUE
FOCUS = f
NOTHING = _
INT_ELEM = I
LANG_ELEM = L
VALUE = ([0-9]+,_)
RULE_NAME = R + VALUE
CONDITION_NAME = C + VALUE
EFFECT_NAME = E + VALUE

*********************
Logic
*********************
Number of rules: 1,10,25,50,100,200,400,600,800,1000
Number of files: 10
10 layers
Set of 10 INT_ELEM
Set of 10 LANG_ELEM
VALUE 50% new 50% reuse of INT/LANG ELEM
List of ALPHAS is 1-10. First ALPHA in CONDITION is FOCUS=f

*********************
Expected result
*********************
R rules such that:
  1 condition:
    1 context element
    1-10 int or lang element:
      1 value new or reused 50%
  1 effect:
    1-10 int or lang element:
      1 value new or reused 50%
Across 10 layers