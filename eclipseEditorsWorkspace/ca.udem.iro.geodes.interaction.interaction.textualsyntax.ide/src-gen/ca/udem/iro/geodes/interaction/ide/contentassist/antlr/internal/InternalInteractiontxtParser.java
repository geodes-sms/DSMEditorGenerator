package ca.udem.iro.geodes.interaction.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ca.udem.iro.geodes.interaction.services.InteractiontxtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInteractiontxtParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'focusElement'", "'add'", "'rem'", "'copy'", "'InteractionRule'", "'Condition'", "'{'", "'}'", "'---'", "'-->'", "'----->'", "'Effect'", "'Interface'", "'value'", "'='", "'\"'", "'Lang'", "'Canvas'", "'Var'", "','", "'element'", "'Operation'", "'op'", "'['", "']'", "'from'", "'not'", "'focus'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__10=10;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalInteractiontxtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInteractiontxtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInteractiontxtParser.tokenNames; }
    public String getGrammarFileName() { return "InternalInteractiontxt.g"; }


    	private InteractiontxtGrammarAccess grammarAccess;

    	public void setGrammarAccess(InteractiontxtGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalInteractiontxt.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:54:1: ( ruleModel EOF )
            // InternalInteractiontxt.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalInteractiontxt.g:62:1: ruleModel : ( ( rule__Model__InteractionsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:66:2: ( ( ( rule__Model__InteractionsAssignment )* ) )
            // InternalInteractiontxt.g:67:2: ( ( rule__Model__InteractionsAssignment )* )
            {
            // InternalInteractiontxt.g:67:2: ( ( rule__Model__InteractionsAssignment )* )
            // InternalInteractiontxt.g:68:3: ( rule__Model__InteractionsAssignment )*
            {
             before(grammarAccess.getModelAccess().getInteractionsAssignment()); 
            // InternalInteractiontxt.g:69:3: ( rule__Model__InteractionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalInteractiontxt.g:69:4: rule__Model__InteractionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__InteractionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getInteractionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCElement"
    // InternalInteractiontxt.g:78:1: entryRuleCElement : ruleCElement EOF ;
    public final void entryRuleCElement() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:79:1: ( ruleCElement EOF )
            // InternalInteractiontxt.g:80:1: ruleCElement EOF
            {
             before(grammarAccess.getCElementRule()); 
            pushFollow(FOLLOW_1);
            ruleCElement();

            state._fsp--;

             after(grammarAccess.getCElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCElement"


    // $ANTLR start "ruleCElement"
    // InternalInteractiontxt.g:87:1: ruleCElement : ( ( rule__CElement__Alternatives ) ) ;
    public final void ruleCElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:91:2: ( ( ( rule__CElement__Alternatives ) ) )
            // InternalInteractiontxt.g:92:2: ( ( rule__CElement__Alternatives ) )
            {
            // InternalInteractiontxt.g:92:2: ( ( rule__CElement__Alternatives ) )
            // InternalInteractiontxt.g:93:3: ( rule__CElement__Alternatives )
            {
             before(grammarAccess.getCElementAccess().getAlternatives()); 
            // InternalInteractiontxt.g:94:3: ( rule__CElement__Alternatives )
            // InternalInteractiontxt.g:94:4: rule__CElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCElement"


    // $ANTLR start "entryRuleAElement"
    // InternalInteractiontxt.g:103:1: entryRuleAElement : ruleAElement EOF ;
    public final void entryRuleAElement() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:104:1: ( ruleAElement EOF )
            // InternalInteractiontxt.g:105:1: ruleAElement EOF
            {
             before(grammarAccess.getAElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAElement();

            state._fsp--;

             after(grammarAccess.getAElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAElement"


    // $ANTLR start "ruleAElement"
    // InternalInteractiontxt.g:112:1: ruleAElement : ( ( rule__AElement__Alternatives ) ) ;
    public final void ruleAElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:116:2: ( ( ( rule__AElement__Alternatives ) ) )
            // InternalInteractiontxt.g:117:2: ( ( rule__AElement__Alternatives ) )
            {
            // InternalInteractiontxt.g:117:2: ( ( rule__AElement__Alternatives ) )
            // InternalInteractiontxt.g:118:3: ( rule__AElement__Alternatives )
            {
             before(grammarAccess.getAElementAccess().getAlternatives()); 
            // InternalInteractiontxt.g:119:3: ( rule__AElement__Alternatives )
            // InternalInteractiontxt.g:119:4: rule__AElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAElement"


    // $ANTLR start "entryRuleInteraction"
    // InternalInteractiontxt.g:128:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:129:1: ( ruleInteraction EOF )
            // InternalInteractiontxt.g:130:1: ruleInteraction EOF
            {
             before(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getInteractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalInteractiontxt.g:137:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:141:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalInteractiontxt.g:142:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalInteractiontxt.g:142:2: ( ( rule__Interaction__Group__0 ) )
            // InternalInteractiontxt.g:143:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalInteractiontxt.g:144:3: ( rule__Interaction__Group__0 )
            // InternalInteractiontxt.g:144:4: rule__Interaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleEString"
    // InternalInteractiontxt.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:154:1: ( ruleEString EOF )
            // InternalInteractiontxt.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalInteractiontxt.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalInteractiontxt.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalInteractiontxt.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalInteractiontxt.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalInteractiontxt.g:169:3: ( rule__EString__Alternatives )
            // InternalInteractiontxt.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCondition"
    // InternalInteractiontxt.g:178:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:179:1: ( ruleCondition EOF )
            // InternalInteractiontxt.g:180:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalInteractiontxt.g:187:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:191:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalInteractiontxt.g:192:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalInteractiontxt.g:192:2: ( ( rule__Condition__Group__0 ) )
            // InternalInteractiontxt.g:193:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalInteractiontxt.g:194:3: ( rule__Condition__Group__0 )
            // InternalInteractiontxt.g:194:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleStartTransition"
    // InternalInteractiontxt.g:203:1: entryRuleStartTransition : ruleStartTransition EOF ;
    public final void entryRuleStartTransition() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:204:1: ( ruleStartTransition EOF )
            // InternalInteractiontxt.g:205:1: ruleStartTransition EOF
            {
             before(grammarAccess.getStartTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleStartTransition();

            state._fsp--;

             after(grammarAccess.getStartTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartTransition"


    // $ANTLR start "ruleStartTransition"
    // InternalInteractiontxt.g:212:1: ruleStartTransition : ( ( rule__StartTransition__Group__0 ) ) ;
    public final void ruleStartTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:216:2: ( ( ( rule__StartTransition__Group__0 ) ) )
            // InternalInteractiontxt.g:217:2: ( ( rule__StartTransition__Group__0 ) )
            {
            // InternalInteractiontxt.g:217:2: ( ( rule__StartTransition__Group__0 ) )
            // InternalInteractiontxt.g:218:3: ( rule__StartTransition__Group__0 )
            {
             before(grammarAccess.getStartTransitionAccess().getGroup()); 
            // InternalInteractiontxt.g:219:3: ( rule__StartTransition__Group__0 )
            // InternalInteractiontxt.g:219:4: rule__StartTransition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartTransition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartTransition"


    // $ANTLR start "entryRuleTransition"
    // InternalInteractiontxt.g:228:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:229:1: ( ruleTransition EOF )
            // InternalInteractiontxt.g:230:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalInteractiontxt.g:237:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:241:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalInteractiontxt.g:242:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalInteractiontxt.g:242:2: ( ( rule__Transition__Group__0 ) )
            // InternalInteractiontxt.g:243:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalInteractiontxt.g:244:3: ( rule__Transition__Group__0 )
            // InternalInteractiontxt.g:244:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleAction"
    // InternalInteractiontxt.g:253:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:254:1: ( ruleAction EOF )
            // InternalInteractiontxt.g:255:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalInteractiontxt.g:262:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:266:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalInteractiontxt.g:267:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalInteractiontxt.g:267:2: ( ( rule__Action__Group__0 ) )
            // InternalInteractiontxt.g:268:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalInteractiontxt.g:269:3: ( rule__Action__Group__0 )
            // InternalInteractiontxt.g:269:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCIElement"
    // InternalInteractiontxt.g:278:1: entryRuleCIElement : ruleCIElement EOF ;
    public final void entryRuleCIElement() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:279:1: ( ruleCIElement EOF )
            // InternalInteractiontxt.g:280:1: ruleCIElement EOF
            {
             before(grammarAccess.getCIElementRule()); 
            pushFollow(FOLLOW_1);
            ruleCIElement();

            state._fsp--;

             after(grammarAccess.getCIElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCIElement"


    // $ANTLR start "ruleCIElement"
    // InternalInteractiontxt.g:287:1: ruleCIElement : ( ( rule__CIElement__Group__0 ) ) ;
    public final void ruleCIElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:291:2: ( ( ( rule__CIElement__Group__0 ) ) )
            // InternalInteractiontxt.g:292:2: ( ( rule__CIElement__Group__0 ) )
            {
            // InternalInteractiontxt.g:292:2: ( ( rule__CIElement__Group__0 ) )
            // InternalInteractiontxt.g:293:3: ( rule__CIElement__Group__0 )
            {
             before(grammarAccess.getCIElementAccess().getGroup()); 
            // InternalInteractiontxt.g:294:3: ( rule__CIElement__Group__0 )
            // InternalInteractiontxt.g:294:4: rule__CIElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CIElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCIElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCIElement"


    // $ANTLR start "entryRuleCLElement"
    // InternalInteractiontxt.g:303:1: entryRuleCLElement : ruleCLElement EOF ;
    public final void entryRuleCLElement() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:304:1: ( ruleCLElement EOF )
            // InternalInteractiontxt.g:305:1: ruleCLElement EOF
            {
             before(grammarAccess.getCLElementRule()); 
            pushFollow(FOLLOW_1);
            ruleCLElement();

            state._fsp--;

             after(grammarAccess.getCLElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCLElement"


    // $ANTLR start "ruleCLElement"
    // InternalInteractiontxt.g:312:1: ruleCLElement : ( ( rule__CLElement__Group__0 ) ) ;
    public final void ruleCLElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:316:2: ( ( ( rule__CLElement__Group__0 ) ) )
            // InternalInteractiontxt.g:317:2: ( ( rule__CLElement__Group__0 ) )
            {
            // InternalInteractiontxt.g:317:2: ( ( rule__CLElement__Group__0 ) )
            // InternalInteractiontxt.g:318:3: ( rule__CLElement__Group__0 )
            {
             before(grammarAccess.getCLElementAccess().getGroup()); 
            // InternalInteractiontxt.g:319:3: ( rule__CLElement__Group__0 )
            // InternalInteractiontxt.g:319:4: rule__CLElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CLElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCLElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCLElement"


    // $ANTLR start "entryRuleCCanvas"
    // InternalInteractiontxt.g:328:1: entryRuleCCanvas : ruleCCanvas EOF ;
    public final void entryRuleCCanvas() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:329:1: ( ruleCCanvas EOF )
            // InternalInteractiontxt.g:330:1: ruleCCanvas EOF
            {
             before(grammarAccess.getCCanvasRule()); 
            pushFollow(FOLLOW_1);
            ruleCCanvas();

            state._fsp--;

             after(grammarAccess.getCCanvasRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCCanvas"


    // $ANTLR start "ruleCCanvas"
    // InternalInteractiontxt.g:337:1: ruleCCanvas : ( ( rule__CCanvas__Group__0 ) ) ;
    public final void ruleCCanvas() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:341:2: ( ( ( rule__CCanvas__Group__0 ) ) )
            // InternalInteractiontxt.g:342:2: ( ( rule__CCanvas__Group__0 ) )
            {
            // InternalInteractiontxt.g:342:2: ( ( rule__CCanvas__Group__0 ) )
            // InternalInteractiontxt.g:343:3: ( rule__CCanvas__Group__0 )
            {
             before(grammarAccess.getCCanvasAccess().getGroup()); 
            // InternalInteractiontxt.g:344:3: ( rule__CCanvas__Group__0 )
            // InternalInteractiontxt.g:344:4: rule__CCanvas__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CCanvas__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCCanvasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCCanvas"


    // $ANTLR start "entryRuleCVElement"
    // InternalInteractiontxt.g:353:1: entryRuleCVElement : ruleCVElement EOF ;
    public final void entryRuleCVElement() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:354:1: ( ruleCVElement EOF )
            // InternalInteractiontxt.g:355:1: ruleCVElement EOF
            {
             before(grammarAccess.getCVElementRule()); 
            pushFollow(FOLLOW_1);
            ruleCVElement();

            state._fsp--;

             after(grammarAccess.getCVElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCVElement"


    // $ANTLR start "ruleCVElement"
    // InternalInteractiontxt.g:362:1: ruleCVElement : ( ( rule__CVElement__Group__0 ) ) ;
    public final void ruleCVElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:366:2: ( ( ( rule__CVElement__Group__0 ) ) )
            // InternalInteractiontxt.g:367:2: ( ( rule__CVElement__Group__0 ) )
            {
            // InternalInteractiontxt.g:367:2: ( ( rule__CVElement__Group__0 ) )
            // InternalInteractiontxt.g:368:3: ( rule__CVElement__Group__0 )
            {
             before(grammarAccess.getCVElementAccess().getGroup()); 
            // InternalInteractiontxt.g:369:3: ( rule__CVElement__Group__0 )
            // InternalInteractiontxt.g:369:4: rule__CVElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCVElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCVElement"


    // $ANTLR start "entryRuleAIElement"
    // InternalInteractiontxt.g:378:1: entryRuleAIElement : ruleAIElement EOF ;
    public final void entryRuleAIElement() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:379:1: ( ruleAIElement EOF )
            // InternalInteractiontxt.g:380:1: ruleAIElement EOF
            {
             before(grammarAccess.getAIElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAIElement();

            state._fsp--;

             after(grammarAccess.getAIElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAIElement"


    // $ANTLR start "ruleAIElement"
    // InternalInteractiontxt.g:387:1: ruleAIElement : ( ( rule__AIElement__Group__0 ) ) ;
    public final void ruleAIElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:391:2: ( ( ( rule__AIElement__Group__0 ) ) )
            // InternalInteractiontxt.g:392:2: ( ( rule__AIElement__Group__0 ) )
            {
            // InternalInteractiontxt.g:392:2: ( ( rule__AIElement__Group__0 ) )
            // InternalInteractiontxt.g:393:3: ( rule__AIElement__Group__0 )
            {
             before(grammarAccess.getAIElementAccess().getGroup()); 
            // InternalInteractiontxt.g:394:3: ( rule__AIElement__Group__0 )
            // InternalInteractiontxt.g:394:4: rule__AIElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AIElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAIElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAIElement"


    // $ANTLR start "entryRuleAOElement"
    // InternalInteractiontxt.g:403:1: entryRuleAOElement : ruleAOElement EOF ;
    public final void entryRuleAOElement() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:404:1: ( ruleAOElement EOF )
            // InternalInteractiontxt.g:405:1: ruleAOElement EOF
            {
             before(grammarAccess.getAOElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAOElement();

            state._fsp--;

             after(grammarAccess.getAOElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAOElement"


    // $ANTLR start "ruleAOElement"
    // InternalInteractiontxt.g:412:1: ruleAOElement : ( ( rule__AOElement__Group__0 ) ) ;
    public final void ruleAOElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:416:2: ( ( ( rule__AOElement__Group__0 ) ) )
            // InternalInteractiontxt.g:417:2: ( ( rule__AOElement__Group__0 ) )
            {
            // InternalInteractiontxt.g:417:2: ( ( rule__AOElement__Group__0 ) )
            // InternalInteractiontxt.g:418:3: ( rule__AOElement__Group__0 )
            {
             before(grammarAccess.getAOElementAccess().getGroup()); 
            // InternalInteractiontxt.g:419:3: ( rule__AOElement__Group__0 )
            // InternalInteractiontxt.g:419:4: rule__AOElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AOElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAOElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAOElement"


    // $ANTLR start "entryRuleALElement"
    // InternalInteractiontxt.g:428:1: entryRuleALElement : ruleALElement EOF ;
    public final void entryRuleALElement() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:429:1: ( ruleALElement EOF )
            // InternalInteractiontxt.g:430:1: ruleALElement EOF
            {
             before(grammarAccess.getALElementRule()); 
            pushFollow(FOLLOW_1);
            ruleALElement();

            state._fsp--;

             after(grammarAccess.getALElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleALElement"


    // $ANTLR start "ruleALElement"
    // InternalInteractiontxt.g:437:1: ruleALElement : ( ( rule__ALElement__Group__0 ) ) ;
    public final void ruleALElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:441:2: ( ( ( rule__ALElement__Group__0 ) ) )
            // InternalInteractiontxt.g:442:2: ( ( rule__ALElement__Group__0 ) )
            {
            // InternalInteractiontxt.g:442:2: ( ( rule__ALElement__Group__0 ) )
            // InternalInteractiontxt.g:443:3: ( rule__ALElement__Group__0 )
            {
             before(grammarAccess.getALElementAccess().getGroup()); 
            // InternalInteractiontxt.g:444:3: ( rule__ALElement__Group__0 )
            // InternalInteractiontxt.g:444:4: rule__ALElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleALElement"


    // $ANTLR start "entryRuleACanvas"
    // InternalInteractiontxt.g:453:1: entryRuleACanvas : ruleACanvas EOF ;
    public final void entryRuleACanvas() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:454:1: ( ruleACanvas EOF )
            // InternalInteractiontxt.g:455:1: ruleACanvas EOF
            {
             before(grammarAccess.getACanvasRule()); 
            pushFollow(FOLLOW_1);
            ruleACanvas();

            state._fsp--;

             after(grammarAccess.getACanvasRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACanvas"


    // $ANTLR start "ruleACanvas"
    // InternalInteractiontxt.g:462:1: ruleACanvas : ( ( rule__ACanvas__Group__0 ) ) ;
    public final void ruleACanvas() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:466:2: ( ( ( rule__ACanvas__Group__0 ) ) )
            // InternalInteractiontxt.g:467:2: ( ( rule__ACanvas__Group__0 ) )
            {
            // InternalInteractiontxt.g:467:2: ( ( rule__ACanvas__Group__0 ) )
            // InternalInteractiontxt.g:468:3: ( rule__ACanvas__Group__0 )
            {
             before(grammarAccess.getACanvasAccess().getGroup()); 
            // InternalInteractiontxt.g:469:3: ( rule__ACanvas__Group__0 )
            // InternalInteractiontxt.g:469:4: rule__ACanvas__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ACanvas__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getACanvasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACanvas"


    // $ANTLR start "entryRuleAVElement"
    // InternalInteractiontxt.g:478:1: entryRuleAVElement : ruleAVElement EOF ;
    public final void entryRuleAVElement() throws RecognitionException {
        try {
            // InternalInteractiontxt.g:479:1: ( ruleAVElement EOF )
            // InternalInteractiontxt.g:480:1: ruleAVElement EOF
            {
             before(grammarAccess.getAVElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAVElement();

            state._fsp--;

             after(grammarAccess.getAVElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAVElement"


    // $ANTLR start "ruleAVElement"
    // InternalInteractiontxt.g:487:1: ruleAVElement : ( ( rule__AVElement__Group__0 ) ) ;
    public final void ruleAVElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:491:2: ( ( ( rule__AVElement__Group__0 ) ) )
            // InternalInteractiontxt.g:492:2: ( ( rule__AVElement__Group__0 ) )
            {
            // InternalInteractiontxt.g:492:2: ( ( rule__AVElement__Group__0 ) )
            // InternalInteractiontxt.g:493:3: ( rule__AVElement__Group__0 )
            {
             before(grammarAccess.getAVElementAccess().getGroup()); 
            // InternalInteractiontxt.g:494:3: ( rule__AVElement__Group__0 )
            // InternalInteractiontxt.g:494:4: rule__AVElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAVElement"


    // $ANTLR start "rule__CElement__Alternatives"
    // InternalInteractiontxt.g:502:1: rule__CElement__Alternatives : ( ( ruleCIElement ) | ( ruleCLElement ) | ( ruleCVElement ) | ( ruleCCanvas ) );
    public final void rule__CElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:506:1: ( ( ruleCIElement ) | ( ruleCLElement ) | ( ruleCVElement ) | ( ruleCCanvas ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt2=2;
                    }
                    break;
                case 22:
                    {
                    alt2=1;
                    }
                    break;
                case 28:
                    {
                    alt2=3;
                    }
                    break;
                case 27:
                    {
                    alt2=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 37:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt2=4;
                    }
                    break;
                case 26:
                    {
                    alt2=2;
                    }
                    break;
                case 22:
                    {
                    alt2=1;
                    }
                    break;
                case 28:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case 22:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalInteractiontxt.g:507:2: ( ruleCIElement )
                    {
                    // InternalInteractiontxt.g:507:2: ( ruleCIElement )
                    // InternalInteractiontxt.g:508:3: ruleCIElement
                    {
                     before(grammarAccess.getCElementAccess().getCIElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCIElement();

                    state._fsp--;

                     after(grammarAccess.getCElementAccess().getCIElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:513:2: ( ruleCLElement )
                    {
                    // InternalInteractiontxt.g:513:2: ( ruleCLElement )
                    // InternalInteractiontxt.g:514:3: ruleCLElement
                    {
                     before(grammarAccess.getCElementAccess().getCLElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCLElement();

                    state._fsp--;

                     after(grammarAccess.getCElementAccess().getCLElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInteractiontxt.g:519:2: ( ruleCVElement )
                    {
                    // InternalInteractiontxt.g:519:2: ( ruleCVElement )
                    // InternalInteractiontxt.g:520:3: ruleCVElement
                    {
                     before(grammarAccess.getCElementAccess().getCVElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCVElement();

                    state._fsp--;

                     after(grammarAccess.getCElementAccess().getCVElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalInteractiontxt.g:525:2: ( ruleCCanvas )
                    {
                    // InternalInteractiontxt.g:525:2: ( ruleCCanvas )
                    // InternalInteractiontxt.g:526:3: ruleCCanvas
                    {
                     before(grammarAccess.getCElementAccess().getCCanvasParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCCanvas();

                    state._fsp--;

                     after(grammarAccess.getCElementAccess().getCCanvasParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CElement__Alternatives"


    // $ANTLR start "rule__AElement__Alternatives"
    // InternalInteractiontxt.g:535:1: rule__AElement__Alternatives : ( ( ruleAIElement ) | ( ruleAOElement ) | ( ruleALElement ) | ( ruleAVElement ) | ( ruleACanvas ) );
    public final void rule__AElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:539:1: ( ( ruleAIElement ) | ( ruleAOElement ) | ( ruleALElement ) | ( ruleAVElement ) | ( ruleACanvas ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 27:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalInteractiontxt.g:540:2: ( ruleAIElement )
                    {
                    // InternalInteractiontxt.g:540:2: ( ruleAIElement )
                    // InternalInteractiontxt.g:541:3: ruleAIElement
                    {
                     before(grammarAccess.getAElementAccess().getAIElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAIElement();

                    state._fsp--;

                     after(grammarAccess.getAElementAccess().getAIElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:546:2: ( ruleAOElement )
                    {
                    // InternalInteractiontxt.g:546:2: ( ruleAOElement )
                    // InternalInteractiontxt.g:547:3: ruleAOElement
                    {
                     before(grammarAccess.getAElementAccess().getAOElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAOElement();

                    state._fsp--;

                     after(grammarAccess.getAElementAccess().getAOElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInteractiontxt.g:552:2: ( ruleALElement )
                    {
                    // InternalInteractiontxt.g:552:2: ( ruleALElement )
                    // InternalInteractiontxt.g:553:3: ruleALElement
                    {
                     before(grammarAccess.getAElementAccess().getALElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleALElement();

                    state._fsp--;

                     after(grammarAccess.getAElementAccess().getALElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalInteractiontxt.g:558:2: ( ruleAVElement )
                    {
                    // InternalInteractiontxt.g:558:2: ( ruleAVElement )
                    // InternalInteractiontxt.g:559:3: ruleAVElement
                    {
                     before(grammarAccess.getAElementAccess().getAVElementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAVElement();

                    state._fsp--;

                     after(grammarAccess.getAElementAccess().getAVElementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalInteractiontxt.g:564:2: ( ruleACanvas )
                    {
                    // InternalInteractiontxt.g:564:2: ( ruleACanvas )
                    // InternalInteractiontxt.g:565:3: ruleACanvas
                    {
                     before(grammarAccess.getAElementAccess().getACanvasParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleACanvas();

                    state._fsp--;

                     after(grammarAccess.getAElementAccess().getACanvasParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalInteractiontxt.g:574:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:578:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalInteractiontxt.g:579:2: ( RULE_STRING )
                    {
                    // InternalInteractiontxt.g:579:2: ( RULE_STRING )
                    // InternalInteractiontxt.g:580:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:585:2: ( RULE_ID )
                    {
                    // InternalInteractiontxt.g:585:2: ( RULE_ID )
                    // InternalInteractiontxt.g:586:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__CIElement__Alternatives_1"
    // InternalInteractiontxt.g:595:1: rule__CIElement__Alternatives_1 : ( ( ( rule__CIElement__IsNegativeAssignment_1_0 ) ) | ( ( rule__CIElement__IsFocusAssignment_1_1 ) ) );
    public final void rule__CIElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:599:1: ( ( ( rule__CIElement__IsNegativeAssignment_1_0 ) ) | ( ( rule__CIElement__IsFocusAssignment_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalInteractiontxt.g:600:2: ( ( rule__CIElement__IsNegativeAssignment_1_0 ) )
                    {
                    // InternalInteractiontxt.g:600:2: ( ( rule__CIElement__IsNegativeAssignment_1_0 ) )
                    // InternalInteractiontxt.g:601:3: ( rule__CIElement__IsNegativeAssignment_1_0 )
                    {
                     before(grammarAccess.getCIElementAccess().getIsNegativeAssignment_1_0()); 
                    // InternalInteractiontxt.g:602:3: ( rule__CIElement__IsNegativeAssignment_1_0 )
                    // InternalInteractiontxt.g:602:4: rule__CIElement__IsNegativeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CIElement__IsNegativeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCIElementAccess().getIsNegativeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:606:2: ( ( rule__CIElement__IsFocusAssignment_1_1 ) )
                    {
                    // InternalInteractiontxt.g:606:2: ( ( rule__CIElement__IsFocusAssignment_1_1 ) )
                    // InternalInteractiontxt.g:607:3: ( rule__CIElement__IsFocusAssignment_1_1 )
                    {
                     before(grammarAccess.getCIElementAccess().getIsFocusAssignment_1_1()); 
                    // InternalInteractiontxt.g:608:3: ( rule__CIElement__IsFocusAssignment_1_1 )
                    // InternalInteractiontxt.g:608:4: rule__CIElement__IsFocusAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CIElement__IsFocusAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCIElementAccess().getIsFocusAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Alternatives_1"


    // $ANTLR start "rule__CIElement__Alternatives_5_2"
    // InternalInteractiontxt.g:616:1: rule__CIElement__Alternatives_5_2 : ( ( ( rule__CIElement__Group_5_2_0__0 ) ) | ( ( rule__CIElement__ValueAssignment_5_2_1 ) ) );
    public final void rule__CIElement__Alternatives_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:620:1: ( ( ( rule__CIElement__Group_5_2_0__0 ) ) | ( ( rule__CIElement__ValueAssignment_5_2_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==10) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalInteractiontxt.g:621:2: ( ( rule__CIElement__Group_5_2_0__0 ) )
                    {
                    // InternalInteractiontxt.g:621:2: ( ( rule__CIElement__Group_5_2_0__0 ) )
                    // InternalInteractiontxt.g:622:3: ( rule__CIElement__Group_5_2_0__0 )
                    {
                     before(grammarAccess.getCIElementAccess().getGroup_5_2_0()); 
                    // InternalInteractiontxt.g:623:3: ( rule__CIElement__Group_5_2_0__0 )
                    // InternalInteractiontxt.g:623:4: rule__CIElement__Group_5_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CIElement__Group_5_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCIElementAccess().getGroup_5_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:627:2: ( ( rule__CIElement__ValueAssignment_5_2_1 ) )
                    {
                    // InternalInteractiontxt.g:627:2: ( ( rule__CIElement__ValueAssignment_5_2_1 ) )
                    // InternalInteractiontxt.g:628:3: ( rule__CIElement__ValueAssignment_5_2_1 )
                    {
                     before(grammarAccess.getCIElementAccess().getValueAssignment_5_2_1()); 
                    // InternalInteractiontxt.g:629:3: ( rule__CIElement__ValueAssignment_5_2_1 )
                    // InternalInteractiontxt.g:629:4: rule__CIElement__ValueAssignment_5_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CIElement__ValueAssignment_5_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCIElementAccess().getValueAssignment_5_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Alternatives_5_2"


    // $ANTLR start "rule__CIElement__ValueAlternatives_5_2_1_0"
    // InternalInteractiontxt.g:637:1: rule__CIElement__ValueAlternatives_5_2_1_0 : ( ( 'focusElement' ) | ( ruleEString ) );
    public final void rule__CIElement__ValueAlternatives_5_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:641:1: ( ( 'focusElement' ) | ( ruleEString ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==10) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalInteractiontxt.g:642:2: ( 'focusElement' )
                    {
                    // InternalInteractiontxt.g:642:2: ( 'focusElement' )
                    // InternalInteractiontxt.g:643:3: 'focusElement'
                    {
                     before(grammarAccess.getCIElementAccess().getValueFocusElementKeyword_5_2_1_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getCIElementAccess().getValueFocusElementKeyword_5_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:648:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:648:2: ( ruleEString )
                    // InternalInteractiontxt.g:649:3: ruleEString
                    {
                     before(grammarAccess.getCIElementAccess().getValueEStringParserRuleCall_5_2_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getCIElementAccess().getValueEStringParserRuleCall_5_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__ValueAlternatives_5_2_1_0"


    // $ANTLR start "rule__CLElement__Alternatives_1"
    // InternalInteractiontxt.g:658:1: rule__CLElement__Alternatives_1 : ( ( ( rule__CLElement__IsNegativeAssignment_1_0 ) ) | ( ( rule__CLElement__IsFocusAssignment_1_1 ) ) );
    public final void rule__CLElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:662:1: ( ( ( rule__CLElement__IsNegativeAssignment_1_0 ) ) | ( ( rule__CLElement__IsFocusAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalInteractiontxt.g:663:2: ( ( rule__CLElement__IsNegativeAssignment_1_0 ) )
                    {
                    // InternalInteractiontxt.g:663:2: ( ( rule__CLElement__IsNegativeAssignment_1_0 ) )
                    // InternalInteractiontxt.g:664:3: ( rule__CLElement__IsNegativeAssignment_1_0 )
                    {
                     before(grammarAccess.getCLElementAccess().getIsNegativeAssignment_1_0()); 
                    // InternalInteractiontxt.g:665:3: ( rule__CLElement__IsNegativeAssignment_1_0 )
                    // InternalInteractiontxt.g:665:4: rule__CLElement__IsNegativeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CLElement__IsNegativeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCLElementAccess().getIsNegativeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:669:2: ( ( rule__CLElement__IsFocusAssignment_1_1 ) )
                    {
                    // InternalInteractiontxt.g:669:2: ( ( rule__CLElement__IsFocusAssignment_1_1 ) )
                    // InternalInteractiontxt.g:670:3: ( rule__CLElement__IsFocusAssignment_1_1 )
                    {
                     before(grammarAccess.getCLElementAccess().getIsFocusAssignment_1_1()); 
                    // InternalInteractiontxt.g:671:3: ( rule__CLElement__IsFocusAssignment_1_1 )
                    // InternalInteractiontxt.g:671:4: rule__CLElement__IsFocusAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CLElement__IsFocusAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCLElementAccess().getIsFocusAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Alternatives_1"


    // $ANTLR start "rule__CLElement__Alternatives_5_2"
    // InternalInteractiontxt.g:679:1: rule__CLElement__Alternatives_5_2 : ( ( ( rule__CLElement__Group_5_2_0__0 ) ) | ( ( rule__CLElement__ValueAssignment_5_2_1 ) ) );
    public final void rule__CLElement__Alternatives_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:683:1: ( ( ( rule__CLElement__Group_5_2_0__0 ) ) | ( ( rule__CLElement__ValueAssignment_5_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==10) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalInteractiontxt.g:684:2: ( ( rule__CLElement__Group_5_2_0__0 ) )
                    {
                    // InternalInteractiontxt.g:684:2: ( ( rule__CLElement__Group_5_2_0__0 ) )
                    // InternalInteractiontxt.g:685:3: ( rule__CLElement__Group_5_2_0__0 )
                    {
                     before(grammarAccess.getCLElementAccess().getGroup_5_2_0()); 
                    // InternalInteractiontxt.g:686:3: ( rule__CLElement__Group_5_2_0__0 )
                    // InternalInteractiontxt.g:686:4: rule__CLElement__Group_5_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CLElement__Group_5_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCLElementAccess().getGroup_5_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:690:2: ( ( rule__CLElement__ValueAssignment_5_2_1 ) )
                    {
                    // InternalInteractiontxt.g:690:2: ( ( rule__CLElement__ValueAssignment_5_2_1 ) )
                    // InternalInteractiontxt.g:691:3: ( rule__CLElement__ValueAssignment_5_2_1 )
                    {
                     before(grammarAccess.getCLElementAccess().getValueAssignment_5_2_1()); 
                    // InternalInteractiontxt.g:692:3: ( rule__CLElement__ValueAssignment_5_2_1 )
                    // InternalInteractiontxt.g:692:4: rule__CLElement__ValueAssignment_5_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CLElement__ValueAssignment_5_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCLElementAccess().getValueAssignment_5_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Alternatives_5_2"


    // $ANTLR start "rule__CLElement__ValueAlternatives_5_2_1_0"
    // InternalInteractiontxt.g:700:1: rule__CLElement__ValueAlternatives_5_2_1_0 : ( ( 'focusElement' ) | ( ruleEString ) );
    public final void rule__CLElement__ValueAlternatives_5_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:704:1: ( ( 'focusElement' ) | ( ruleEString ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==10) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalInteractiontxt.g:705:2: ( 'focusElement' )
                    {
                    // InternalInteractiontxt.g:705:2: ( 'focusElement' )
                    // InternalInteractiontxt.g:706:3: 'focusElement'
                    {
                     before(grammarAccess.getCLElementAccess().getValueFocusElementKeyword_5_2_1_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getCLElementAccess().getValueFocusElementKeyword_5_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:711:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:711:2: ( ruleEString )
                    // InternalInteractiontxt.g:712:3: ruleEString
                    {
                     before(grammarAccess.getCLElementAccess().getValueEStringParserRuleCall_5_2_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getCLElementAccess().getValueEStringParserRuleCall_5_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__ValueAlternatives_5_2_1_0"


    // $ANTLR start "rule__CCanvas__Alternatives_1"
    // InternalInteractiontxt.g:721:1: rule__CCanvas__Alternatives_1 : ( ( ( rule__CCanvas__IsNegativeAssignment_1_0 ) ) | ( ( rule__CCanvas__IsFocusAssignment_1_1 ) ) );
    public final void rule__CCanvas__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:725:1: ( ( ( rule__CCanvas__IsNegativeAssignment_1_0 ) ) | ( ( rule__CCanvas__IsFocusAssignment_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            else if ( (LA11_0==37) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalInteractiontxt.g:726:2: ( ( rule__CCanvas__IsNegativeAssignment_1_0 ) )
                    {
                    // InternalInteractiontxt.g:726:2: ( ( rule__CCanvas__IsNegativeAssignment_1_0 ) )
                    // InternalInteractiontxt.g:727:3: ( rule__CCanvas__IsNegativeAssignment_1_0 )
                    {
                     before(grammarAccess.getCCanvasAccess().getIsNegativeAssignment_1_0()); 
                    // InternalInteractiontxt.g:728:3: ( rule__CCanvas__IsNegativeAssignment_1_0 )
                    // InternalInteractiontxt.g:728:4: rule__CCanvas__IsNegativeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CCanvas__IsNegativeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCCanvasAccess().getIsNegativeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:732:2: ( ( rule__CCanvas__IsFocusAssignment_1_1 ) )
                    {
                    // InternalInteractiontxt.g:732:2: ( ( rule__CCanvas__IsFocusAssignment_1_1 ) )
                    // InternalInteractiontxt.g:733:3: ( rule__CCanvas__IsFocusAssignment_1_1 )
                    {
                     before(grammarAccess.getCCanvasAccess().getIsFocusAssignment_1_1()); 
                    // InternalInteractiontxt.g:734:3: ( rule__CCanvas__IsFocusAssignment_1_1 )
                    // InternalInteractiontxt.g:734:4: rule__CCanvas__IsFocusAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CCanvas__IsFocusAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCCanvasAccess().getIsFocusAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Alternatives_1"


    // $ANTLR start "rule__CVElement__Alternatives_1"
    // InternalInteractiontxt.g:742:1: rule__CVElement__Alternatives_1 : ( ( ( rule__CVElement__IsNegativeAssignment_1_0 ) ) | ( ( rule__CVElement__IsFocusAssignment_1_1 ) ) );
    public final void rule__CVElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:746:1: ( ( ( rule__CVElement__IsNegativeAssignment_1_0 ) ) | ( ( rule__CVElement__IsFocusAssignment_1_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            else if ( (LA12_0==37) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalInteractiontxt.g:747:2: ( ( rule__CVElement__IsNegativeAssignment_1_0 ) )
                    {
                    // InternalInteractiontxt.g:747:2: ( ( rule__CVElement__IsNegativeAssignment_1_0 ) )
                    // InternalInteractiontxt.g:748:3: ( rule__CVElement__IsNegativeAssignment_1_0 )
                    {
                     before(grammarAccess.getCVElementAccess().getIsNegativeAssignment_1_0()); 
                    // InternalInteractiontxt.g:749:3: ( rule__CVElement__IsNegativeAssignment_1_0 )
                    // InternalInteractiontxt.g:749:4: rule__CVElement__IsNegativeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CVElement__IsNegativeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCVElementAccess().getIsNegativeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:753:2: ( ( rule__CVElement__IsFocusAssignment_1_1 ) )
                    {
                    // InternalInteractiontxt.g:753:2: ( ( rule__CVElement__IsFocusAssignment_1_1 ) )
                    // InternalInteractiontxt.g:754:3: ( rule__CVElement__IsFocusAssignment_1_1 )
                    {
                     before(grammarAccess.getCVElementAccess().getIsFocusAssignment_1_1()); 
                    // InternalInteractiontxt.g:755:3: ( rule__CVElement__IsFocusAssignment_1_1 )
                    // InternalInteractiontxt.g:755:4: rule__CVElement__IsFocusAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CVElement__IsFocusAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCVElementAccess().getIsFocusAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Alternatives_1"


    // $ANTLR start "rule__CVElement__Alternatives_5"
    // InternalInteractiontxt.g:763:1: rule__CVElement__Alternatives_5 : ( ( ( rule__CVElement__Group_5_0__0 ) ) | ( ( rule__CVElement__Group_5_1__0 ) ) );
    public final void rule__CVElement__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:767:1: ( ( ( rule__CVElement__Group_5_0__0 ) ) | ( ( rule__CVElement__Group_5_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalInteractiontxt.g:768:2: ( ( rule__CVElement__Group_5_0__0 ) )
                    {
                    // InternalInteractiontxt.g:768:2: ( ( rule__CVElement__Group_5_0__0 ) )
                    // InternalInteractiontxt.g:769:3: ( rule__CVElement__Group_5_0__0 )
                    {
                     before(grammarAccess.getCVElementAccess().getGroup_5_0()); 
                    // InternalInteractiontxt.g:770:3: ( rule__CVElement__Group_5_0__0 )
                    // InternalInteractiontxt.g:770:4: rule__CVElement__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CVElement__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCVElementAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:774:2: ( ( rule__CVElement__Group_5_1__0 ) )
                    {
                    // InternalInteractiontxt.g:774:2: ( ( rule__CVElement__Group_5_1__0 ) )
                    // InternalInteractiontxt.g:775:3: ( rule__CVElement__Group_5_1__0 )
                    {
                     before(grammarAccess.getCVElementAccess().getGroup_5_1()); 
                    // InternalInteractiontxt.g:776:3: ( rule__CVElement__Group_5_1__0 )
                    // InternalInteractiontxt.g:776:4: rule__CVElement__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CVElement__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCVElementAccess().getGroup_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Alternatives_5"


    // $ANTLR start "rule__CVElement__Alternatives_5_0_2"
    // InternalInteractiontxt.g:784:1: rule__CVElement__Alternatives_5_0_2 : ( ( ( rule__CVElement__ValueAssignment_5_0_2_0 ) ) | ( ( rule__CVElement__Group_5_0_2_1__0 ) ) );
    public final void rule__CVElement__Alternatives_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:788:1: ( ( ( rule__CVElement__ValueAssignment_5_0_2_0 ) ) | ( ( rule__CVElement__Group_5_0_2_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||LA14_0==10) ) {
                alt14=1;
            }
            else if ( (LA14_0==25) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalInteractiontxt.g:789:2: ( ( rule__CVElement__ValueAssignment_5_0_2_0 ) )
                    {
                    // InternalInteractiontxt.g:789:2: ( ( rule__CVElement__ValueAssignment_5_0_2_0 ) )
                    // InternalInteractiontxt.g:790:3: ( rule__CVElement__ValueAssignment_5_0_2_0 )
                    {
                     before(grammarAccess.getCVElementAccess().getValueAssignment_5_0_2_0()); 
                    // InternalInteractiontxt.g:791:3: ( rule__CVElement__ValueAssignment_5_0_2_0 )
                    // InternalInteractiontxt.g:791:4: rule__CVElement__ValueAssignment_5_0_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CVElement__ValueAssignment_5_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCVElementAccess().getValueAssignment_5_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:795:2: ( ( rule__CVElement__Group_5_0_2_1__0 ) )
                    {
                    // InternalInteractiontxt.g:795:2: ( ( rule__CVElement__Group_5_0_2_1__0 ) )
                    // InternalInteractiontxt.g:796:3: ( rule__CVElement__Group_5_0_2_1__0 )
                    {
                     before(grammarAccess.getCVElementAccess().getGroup_5_0_2_1()); 
                    // InternalInteractiontxt.g:797:3: ( rule__CVElement__Group_5_0_2_1__0 )
                    // InternalInteractiontxt.g:797:4: rule__CVElement__Group_5_0_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CVElement__Group_5_0_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCVElementAccess().getGroup_5_0_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Alternatives_5_0_2"


    // $ANTLR start "rule__CVElement__ValueAlternatives_5_0_2_0_0"
    // InternalInteractiontxt.g:805:1: rule__CVElement__ValueAlternatives_5_0_2_0_0 : ( ( 'focusElement' ) | ( ruleEString ) );
    public final void rule__CVElement__ValueAlternatives_5_0_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:809:1: ( ( 'focusElement' ) | ( ruleEString ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==10) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalInteractiontxt.g:810:2: ( 'focusElement' )
                    {
                    // InternalInteractiontxt.g:810:2: ( 'focusElement' )
                    // InternalInteractiontxt.g:811:3: 'focusElement'
                    {
                     before(grammarAccess.getCVElementAccess().getValueFocusElementKeyword_5_0_2_0_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getCVElementAccess().getValueFocusElementKeyword_5_0_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:816:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:816:2: ( ruleEString )
                    // InternalInteractiontxt.g:817:3: ruleEString
                    {
                     before(grammarAccess.getCVElementAccess().getValueEStringParserRuleCall_5_0_2_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getCVElementAccess().getValueEStringParserRuleCall_5_0_2_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__ValueAlternatives_5_0_2_0_0"


    // $ANTLR start "rule__AOElement__Alternatives_4_2"
    // InternalInteractiontxt.g:826:1: rule__AOElement__Alternatives_4_2 : ( ( ( rule__AOElement__ValueAssignment_4_2_0 ) ) | ( ( rule__AOElement__Group_4_2_1__0 ) ) );
    public final void rule__AOElement__Alternatives_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:830:1: ( ( ( rule__AOElement__ValueAssignment_4_2_0 ) ) | ( ( rule__AOElement__Group_4_2_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==10) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalInteractiontxt.g:831:2: ( ( rule__AOElement__ValueAssignment_4_2_0 ) )
                    {
                    // InternalInteractiontxt.g:831:2: ( ( rule__AOElement__ValueAssignment_4_2_0 ) )
                    // InternalInteractiontxt.g:832:3: ( rule__AOElement__ValueAssignment_4_2_0 )
                    {
                     before(grammarAccess.getAOElementAccess().getValueAssignment_4_2_0()); 
                    // InternalInteractiontxt.g:833:3: ( rule__AOElement__ValueAssignment_4_2_0 )
                    // InternalInteractiontxt.g:833:4: rule__AOElement__ValueAssignment_4_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AOElement__ValueAssignment_4_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAOElementAccess().getValueAssignment_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:837:2: ( ( rule__AOElement__Group_4_2_1__0 ) )
                    {
                    // InternalInteractiontxt.g:837:2: ( ( rule__AOElement__Group_4_2_1__0 ) )
                    // InternalInteractiontxt.g:838:3: ( rule__AOElement__Group_4_2_1__0 )
                    {
                     before(grammarAccess.getAOElementAccess().getGroup_4_2_1()); 
                    // InternalInteractiontxt.g:839:3: ( rule__AOElement__Group_4_2_1__0 )
                    // InternalInteractiontxt.g:839:4: rule__AOElement__Group_4_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AOElement__Group_4_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAOElementAccess().getGroup_4_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Alternatives_4_2"


    // $ANTLR start "rule__AOElement__ValueAlternatives_4_2_0_0"
    // InternalInteractiontxt.g:847:1: rule__AOElement__ValueAlternatives_4_2_0_0 : ( ( 'focusElement' ) | ( ruleEString ) );
    public final void rule__AOElement__ValueAlternatives_4_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:851:1: ( ( 'focusElement' ) | ( ruleEString ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==10) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalInteractiontxt.g:852:2: ( 'focusElement' )
                    {
                    // InternalInteractiontxt.g:852:2: ( 'focusElement' )
                    // InternalInteractiontxt.g:853:3: 'focusElement'
                    {
                     before(grammarAccess.getAOElementAccess().getValueFocusElementKeyword_4_2_0_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getAOElementAccess().getValueFocusElementKeyword_4_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:858:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:858:2: ( ruleEString )
                    // InternalInteractiontxt.g:859:3: ruleEString
                    {
                     before(grammarAccess.getAOElementAccess().getValueEStringParserRuleCall_4_2_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getAOElementAccess().getValueEStringParserRuleCall_4_2_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__ValueAlternatives_4_2_0_0"


    // $ANTLR start "rule__ALElement__Alternatives_4"
    // InternalInteractiontxt.g:868:1: rule__ALElement__Alternatives_4 : ( ( ( rule__ALElement__Group_4_0__0 ) ) | ( ( rule__ALElement__Group_4_1__0 ) ) );
    public final void rule__ALElement__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:872:1: ( ( ( rule__ALElement__Group_4_0__0 ) ) | ( ( rule__ALElement__Group_4_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==23) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalInteractiontxt.g:873:2: ( ( rule__ALElement__Group_4_0__0 ) )
                    {
                    // InternalInteractiontxt.g:873:2: ( ( rule__ALElement__Group_4_0__0 ) )
                    // InternalInteractiontxt.g:874:3: ( rule__ALElement__Group_4_0__0 )
                    {
                     before(grammarAccess.getALElementAccess().getGroup_4_0()); 
                    // InternalInteractiontxt.g:875:3: ( rule__ALElement__Group_4_0__0 )
                    // InternalInteractiontxt.g:875:4: rule__ALElement__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALElement__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getALElementAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:879:2: ( ( rule__ALElement__Group_4_1__0 ) )
                    {
                    // InternalInteractiontxt.g:879:2: ( ( rule__ALElement__Group_4_1__0 ) )
                    // InternalInteractiontxt.g:880:3: ( rule__ALElement__Group_4_1__0 )
                    {
                     before(grammarAccess.getALElementAccess().getGroup_4_1()); 
                    // InternalInteractiontxt.g:881:3: ( rule__ALElement__Group_4_1__0 )
                    // InternalInteractiontxt.g:881:4: rule__ALElement__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALElement__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getALElementAccess().getGroup_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Alternatives_4"


    // $ANTLR start "rule__ALElement__OperationAlternatives_4_0_2_0"
    // InternalInteractiontxt.g:889:1: rule__ALElement__OperationAlternatives_4_0_2_0 : ( ( 'add' ) | ( 'rem' ) | ( ruleEString ) );
    public final void rule__ALElement__OperationAlternatives_4_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:893:1: ( ( 'add' ) | ( 'rem' ) | ( ruleEString ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt19=1;
                }
                break;
            case 12:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalInteractiontxt.g:894:2: ( 'add' )
                    {
                    // InternalInteractiontxt.g:894:2: ( 'add' )
                    // InternalInteractiontxt.g:895:3: 'add'
                    {
                     before(grammarAccess.getALElementAccess().getOperationAddKeyword_4_0_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getALElementAccess().getOperationAddKeyword_4_0_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:900:2: ( 'rem' )
                    {
                    // InternalInteractiontxt.g:900:2: ( 'rem' )
                    // InternalInteractiontxt.g:901:3: 'rem'
                    {
                     before(grammarAccess.getALElementAccess().getOperationRemKeyword_4_0_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getALElementAccess().getOperationRemKeyword_4_0_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInteractiontxt.g:906:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:906:2: ( ruleEString )
                    // InternalInteractiontxt.g:907:3: ruleEString
                    {
                     before(grammarAccess.getALElementAccess().getOperationEStringParserRuleCall_4_0_2_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getALElementAccess().getOperationEStringParserRuleCall_4_0_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__OperationAlternatives_4_0_2_0"


    // $ANTLR start "rule__ALElement__Alternatives_4_0_3_3"
    // InternalInteractiontxt.g:916:1: rule__ALElement__Alternatives_4_0_3_3 : ( ( ( rule__ALElement__Group_4_0_3_3_0__0 ) ) | ( ( rule__ALElement__ValueAssignment_4_0_3_3_1 ) ) );
    public final void rule__ALElement__Alternatives_4_0_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:920:1: ( ( ( rule__ALElement__Group_4_0_3_3_0__0 ) ) | ( ( rule__ALElement__ValueAssignment_4_0_3_3_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||LA20_0==10) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalInteractiontxt.g:921:2: ( ( rule__ALElement__Group_4_0_3_3_0__0 ) )
                    {
                    // InternalInteractiontxt.g:921:2: ( ( rule__ALElement__Group_4_0_3_3_0__0 ) )
                    // InternalInteractiontxt.g:922:3: ( rule__ALElement__Group_4_0_3_3_0__0 )
                    {
                     before(grammarAccess.getALElementAccess().getGroup_4_0_3_3_0()); 
                    // InternalInteractiontxt.g:923:3: ( rule__ALElement__Group_4_0_3_3_0__0 )
                    // InternalInteractiontxt.g:923:4: rule__ALElement__Group_4_0_3_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALElement__Group_4_0_3_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getALElementAccess().getGroup_4_0_3_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:927:2: ( ( rule__ALElement__ValueAssignment_4_0_3_3_1 ) )
                    {
                    // InternalInteractiontxt.g:927:2: ( ( rule__ALElement__ValueAssignment_4_0_3_3_1 ) )
                    // InternalInteractiontxt.g:928:3: ( rule__ALElement__ValueAssignment_4_0_3_3_1 )
                    {
                     before(grammarAccess.getALElementAccess().getValueAssignment_4_0_3_3_1()); 
                    // InternalInteractiontxt.g:929:3: ( rule__ALElement__ValueAssignment_4_0_3_3_1 )
                    // InternalInteractiontxt.g:929:4: rule__ALElement__ValueAssignment_4_0_3_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALElement__ValueAssignment_4_0_3_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getALElementAccess().getValueAssignment_4_0_3_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Alternatives_4_0_3_3"


    // $ANTLR start "rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0"
    // InternalInteractiontxt.g:937:1: rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0 : ( ( 'focusElement' ) | ( ruleEString ) );
    public final void rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:941:1: ( ( 'focusElement' ) | ( ruleEString ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==10) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalInteractiontxt.g:942:2: ( 'focusElement' )
                    {
                    // InternalInteractiontxt.g:942:2: ( 'focusElement' )
                    // InternalInteractiontxt.g:943:3: 'focusElement'
                    {
                     before(grammarAccess.getALElementAccess().getValueFocusElementKeyword_4_0_3_3_0_1_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getALElementAccess().getValueFocusElementKeyword_4_0_3_3_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:948:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:948:2: ( ruleEString )
                    // InternalInteractiontxt.g:949:3: ruleEString
                    {
                     before(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_0_3_3_0_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_0_3_3_0_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0"


    // $ANTLR start "rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0"
    // InternalInteractiontxt.g:958:1: rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0 : ( ( 'focusElement' ) | ( ruleEString ) );
    public final void rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:962:1: ( ( 'focusElement' ) | ( ruleEString ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==10) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalInteractiontxt.g:963:2: ( 'focusElement' )
                    {
                    // InternalInteractiontxt.g:963:2: ( 'focusElement' )
                    // InternalInteractiontxt.g:964:3: 'focusElement'
                    {
                     before(grammarAccess.getALElementAccess().getValueFocusElementKeyword_4_0_3_3_0_2_1_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getALElementAccess().getValueFocusElementKeyword_4_0_3_3_0_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:969:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:969:2: ( ruleEString )
                    // InternalInteractiontxt.g:970:3: ruleEString
                    {
                     before(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_0_3_3_0_2_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_0_3_3_0_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0"


    // $ANTLR start "rule__ALElement__ValueAlternatives_4_0_3_3_1_0"
    // InternalInteractiontxt.g:979:1: rule__ALElement__ValueAlternatives_4_0_3_3_1_0 : ( ( 'focusElement' ) | ( ruleEString ) );
    public final void rule__ALElement__ValueAlternatives_4_0_3_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:983:1: ( ( 'focusElement' ) | ( ruleEString ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==10) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalInteractiontxt.g:984:2: ( 'focusElement' )
                    {
                    // InternalInteractiontxt.g:984:2: ( 'focusElement' )
                    // InternalInteractiontxt.g:985:3: 'focusElement'
                    {
                     before(grammarAccess.getALElementAccess().getValueFocusElementKeyword_4_0_3_3_1_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getALElementAccess().getValueFocusElementKeyword_4_0_3_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:990:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:990:2: ( ruleEString )
                    // InternalInteractiontxt.g:991:3: ruleEString
                    {
                     before(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_0_3_3_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_0_3_3_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__ValueAlternatives_4_0_3_3_1_0"


    // $ANTLR start "rule__AVElement__Alternatives_4"
    // InternalInteractiontxt.g:1000:1: rule__AVElement__Alternatives_4 : ( ( ( rule__AVElement__Group_4_0__0 ) ) | ( ( rule__AVElement__Group_4_1__0 ) ) | ( ( rule__AVElement__Group_4_2__0 ) ) );
    public final void rule__AVElement__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1004:1: ( ( ( rule__AVElement__Group_4_0__0 ) ) | ( ( rule__AVElement__Group_4_1__0 ) ) | ( ( rule__AVElement__Group_4_2__0 ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt24=1;
                }
                break;
            case 23:
                {
                alt24=2;
                }
                break;
            case 30:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalInteractiontxt.g:1005:2: ( ( rule__AVElement__Group_4_0__0 ) )
                    {
                    // InternalInteractiontxt.g:1005:2: ( ( rule__AVElement__Group_4_0__0 ) )
                    // InternalInteractiontxt.g:1006:3: ( rule__AVElement__Group_4_0__0 )
                    {
                     before(grammarAccess.getAVElementAccess().getGroup_4_0()); 
                    // InternalInteractiontxt.g:1007:3: ( rule__AVElement__Group_4_0__0 )
                    // InternalInteractiontxt.g:1007:4: rule__AVElement__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AVElement__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAVElementAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:1011:2: ( ( rule__AVElement__Group_4_1__0 ) )
                    {
                    // InternalInteractiontxt.g:1011:2: ( ( rule__AVElement__Group_4_1__0 ) )
                    // InternalInteractiontxt.g:1012:3: ( rule__AVElement__Group_4_1__0 )
                    {
                     before(grammarAccess.getAVElementAccess().getGroup_4_1()); 
                    // InternalInteractiontxt.g:1013:3: ( rule__AVElement__Group_4_1__0 )
                    // InternalInteractiontxt.g:1013:4: rule__AVElement__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AVElement__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAVElementAccess().getGroup_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInteractiontxt.g:1017:2: ( ( rule__AVElement__Group_4_2__0 ) )
                    {
                    // InternalInteractiontxt.g:1017:2: ( ( rule__AVElement__Group_4_2__0 ) )
                    // InternalInteractiontxt.g:1018:3: ( rule__AVElement__Group_4_2__0 )
                    {
                     before(grammarAccess.getAVElementAccess().getGroup_4_2()); 
                    // InternalInteractiontxt.g:1019:3: ( rule__AVElement__Group_4_2__0 )
                    // InternalInteractiontxt.g:1019:4: rule__AVElement__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AVElement__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAVElementAccess().getGroup_4_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Alternatives_4"


    // $ANTLR start "rule__AVElement__OperationAlternatives_4_0_2_0"
    // InternalInteractiontxt.g:1027:1: rule__AVElement__OperationAlternatives_4_0_2_0 : ( ( 'copy' ) | ( ruleEString ) );
    public final void rule__AVElement__OperationAlternatives_4_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1031:1: ( ( 'copy' ) | ( ruleEString ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalInteractiontxt.g:1032:2: ( 'copy' )
                    {
                    // InternalInteractiontxt.g:1032:2: ( 'copy' )
                    // InternalInteractiontxt.g:1033:3: 'copy'
                    {
                     before(grammarAccess.getAVElementAccess().getOperationCopyKeyword_4_0_2_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAVElementAccess().getOperationCopyKeyword_4_0_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:1038:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:1038:2: ( ruleEString )
                    // InternalInteractiontxt.g:1039:3: ruleEString
                    {
                     before(grammarAccess.getAVElementAccess().getOperationEStringParserRuleCall_4_0_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getAVElementAccess().getOperationEStringParserRuleCall_4_0_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__OperationAlternatives_4_0_2_0"


    // $ANTLR start "rule__AVElement__ValueAlternatives_4_0_6_0"
    // InternalInteractiontxt.g:1048:1: rule__AVElement__ValueAlternatives_4_0_6_0 : ( ( 'focusElement' ) | ( ruleEString ) );
    public final void rule__AVElement__ValueAlternatives_4_0_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1052:1: ( ( 'focusElement' ) | ( ruleEString ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==10) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalInteractiontxt.g:1053:2: ( 'focusElement' )
                    {
                    // InternalInteractiontxt.g:1053:2: ( 'focusElement' )
                    // InternalInteractiontxt.g:1054:3: 'focusElement'
                    {
                     before(grammarAccess.getAVElementAccess().getValueFocusElementKeyword_4_0_6_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getAVElementAccess().getValueFocusElementKeyword_4_0_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:1059:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:1059:2: ( ruleEString )
                    // InternalInteractiontxt.g:1060:3: ruleEString
                    {
                     before(grammarAccess.getAVElementAccess().getValueEStringParserRuleCall_4_0_6_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getAVElementAccess().getValueEStringParserRuleCall_4_0_6_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__ValueAlternatives_4_0_6_0"


    // $ANTLR start "rule__AVElement__Alternatives_4_1_2"
    // InternalInteractiontxt.g:1069:1: rule__AVElement__Alternatives_4_1_2 : ( ( ( rule__AVElement__Group_4_1_2_0__0 ) ) | ( ( rule__AVElement__ValueAssignment_4_1_2_1 ) ) );
    public final void rule__AVElement__Alternatives_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1073:1: ( ( ( rule__AVElement__Group_4_1_2_0__0 ) ) | ( ( rule__AVElement__ValueAssignment_4_1_2_1 ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||LA27_0==10) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalInteractiontxt.g:1074:2: ( ( rule__AVElement__Group_4_1_2_0__0 ) )
                    {
                    // InternalInteractiontxt.g:1074:2: ( ( rule__AVElement__Group_4_1_2_0__0 ) )
                    // InternalInteractiontxt.g:1075:3: ( rule__AVElement__Group_4_1_2_0__0 )
                    {
                     before(grammarAccess.getAVElementAccess().getGroup_4_1_2_0()); 
                    // InternalInteractiontxt.g:1076:3: ( rule__AVElement__Group_4_1_2_0__0 )
                    // InternalInteractiontxt.g:1076:4: rule__AVElement__Group_4_1_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AVElement__Group_4_1_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAVElementAccess().getGroup_4_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:1080:2: ( ( rule__AVElement__ValueAssignment_4_1_2_1 ) )
                    {
                    // InternalInteractiontxt.g:1080:2: ( ( rule__AVElement__ValueAssignment_4_1_2_1 ) )
                    // InternalInteractiontxt.g:1081:3: ( rule__AVElement__ValueAssignment_4_1_2_1 )
                    {
                     before(grammarAccess.getAVElementAccess().getValueAssignment_4_1_2_1()); 
                    // InternalInteractiontxt.g:1082:3: ( rule__AVElement__ValueAssignment_4_1_2_1 )
                    // InternalInteractiontxt.g:1082:4: rule__AVElement__ValueAssignment_4_1_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AVElement__ValueAssignment_4_1_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAVElementAccess().getValueAssignment_4_1_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Alternatives_4_1_2"


    // $ANTLR start "rule__AVElement__ValueAlternatives_4_1_2_1_0"
    // InternalInteractiontxt.g:1090:1: rule__AVElement__ValueAlternatives_4_1_2_1_0 : ( ( 'focusElement' ) | ( ruleEString ) );
    public final void rule__AVElement__ValueAlternatives_4_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1094:1: ( ( 'focusElement' ) | ( ruleEString ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==10) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalInteractiontxt.g:1095:2: ( 'focusElement' )
                    {
                    // InternalInteractiontxt.g:1095:2: ( 'focusElement' )
                    // InternalInteractiontxt.g:1096:3: 'focusElement'
                    {
                     before(grammarAccess.getAVElementAccess().getValueFocusElementKeyword_4_1_2_1_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getAVElementAccess().getValueFocusElementKeyword_4_1_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:1101:2: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:1101:2: ( ruleEString )
                    // InternalInteractiontxt.g:1102:3: ruleEString
                    {
                     before(grammarAccess.getAVElementAccess().getValueEStringParserRuleCall_4_1_2_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getAVElementAccess().getValueEStringParserRuleCall_4_1_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__ValueAlternatives_4_1_2_1_0"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalInteractiontxt.g:1111:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1115:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalInteractiontxt.g:1116:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Interaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0"


    // $ANTLR start "rule__Interaction__Group__0__Impl"
    // InternalInteractiontxt.g:1123:1: rule__Interaction__Group__0__Impl : ( 'InteractionRule' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1127:1: ( ( 'InteractionRule' ) )
            // InternalInteractiontxt.g:1128:1: ( 'InteractionRule' )
            {
            // InternalInteractiontxt.g:1128:1: ( 'InteractionRule' )
            // InternalInteractiontxt.g:1129:2: 'InteractionRule'
            {
             before(grammarAccess.getInteractionAccess().getInteractionRuleKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getInteractionRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__0__Impl"


    // $ANTLR start "rule__Interaction__Group__1"
    // InternalInteractiontxt.g:1138:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1142:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalInteractiontxt.g:1143:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Interaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1"


    // $ANTLR start "rule__Interaction__Group__1__Impl"
    // InternalInteractiontxt.g:1150:1: rule__Interaction__Group__1__Impl : ( ( rule__Interaction__NameAssignment_1 ) ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1154:1: ( ( ( rule__Interaction__NameAssignment_1 ) ) )
            // InternalInteractiontxt.g:1155:1: ( ( rule__Interaction__NameAssignment_1 ) )
            {
            // InternalInteractiontxt.g:1155:1: ( ( rule__Interaction__NameAssignment_1 ) )
            // InternalInteractiontxt.g:1156:2: ( rule__Interaction__NameAssignment_1 )
            {
             before(grammarAccess.getInteractionAccess().getNameAssignment_1()); 
            // InternalInteractiontxt.g:1157:2: ( rule__Interaction__NameAssignment_1 )
            // InternalInteractiontxt.g:1157:3: rule__Interaction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__1__Impl"


    // $ANTLR start "rule__Interaction__Group__2"
    // InternalInteractiontxt.g:1165:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1169:1: ( rule__Interaction__Group__2__Impl )
            // InternalInteractiontxt.g:1170:2: rule__Interaction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2"


    // $ANTLR start "rule__Interaction__Group__2__Impl"
    // InternalInteractiontxt.g:1176:1: rule__Interaction__Group__2__Impl : ( ( rule__Interaction__ConditionAssignment_2 ) ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1180:1: ( ( ( rule__Interaction__ConditionAssignment_2 ) ) )
            // InternalInteractiontxt.g:1181:1: ( ( rule__Interaction__ConditionAssignment_2 ) )
            {
            // InternalInteractiontxt.g:1181:1: ( ( rule__Interaction__ConditionAssignment_2 ) )
            // InternalInteractiontxt.g:1182:2: ( rule__Interaction__ConditionAssignment_2 )
            {
             before(grammarAccess.getInteractionAccess().getConditionAssignment_2()); 
            // InternalInteractiontxt.g:1183:2: ( rule__Interaction__ConditionAssignment_2 )
            // InternalInteractiontxt.g:1183:3: rule__Interaction__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalInteractiontxt.g:1192:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1196:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalInteractiontxt.g:1197:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalInteractiontxt.g:1204:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1208:1: ( ( () ) )
            // InternalInteractiontxt.g:1209:1: ( () )
            {
            // InternalInteractiontxt.g:1209:1: ( () )
            // InternalInteractiontxt.g:1210:2: ()
            {
             before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            // InternalInteractiontxt.g:1211:2: ()
            // InternalInteractiontxt.g:1211:3: 
            {
            }

             after(grammarAccess.getConditionAccess().getConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalInteractiontxt.g:1219:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1223:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalInteractiontxt.g:1224:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalInteractiontxt.g:1231:1: rule__Condition__Group__1__Impl : ( 'Condition' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1235:1: ( ( 'Condition' ) )
            // InternalInteractiontxt.g:1236:1: ( 'Condition' )
            {
            // InternalInteractiontxt.g:1236:1: ( 'Condition' )
            // InternalInteractiontxt.g:1237:2: 'Condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalInteractiontxt.g:1246:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1250:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalInteractiontxt.g:1251:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalInteractiontxt.g:1258:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__IdAssignment_2 )? ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1262:1: ( ( ( rule__Condition__IdAssignment_2 )? ) )
            // InternalInteractiontxt.g:1263:1: ( ( rule__Condition__IdAssignment_2 )? )
            {
            // InternalInteractiontxt.g:1263:1: ( ( rule__Condition__IdAssignment_2 )? )
            // InternalInteractiontxt.g:1264:2: ( rule__Condition__IdAssignment_2 )?
            {
             before(grammarAccess.getConditionAccess().getIdAssignment_2()); 
            // InternalInteractiontxt.g:1265:2: ( rule__Condition__IdAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalInteractiontxt.g:1265:3: rule__Condition__IdAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__IdAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalInteractiontxt.g:1273:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1277:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalInteractiontxt.g:1278:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalInteractiontxt.g:1285:1: rule__Condition__Group__3__Impl : ( '{' ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1289:1: ( ( '{' ) )
            // InternalInteractiontxt.g:1290:1: ( '{' )
            {
            // InternalInteractiontxt.g:1290:1: ( '{' )
            // InternalInteractiontxt.g:1291:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalInteractiontxt.g:1300:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1304:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalInteractiontxt.g:1305:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Condition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalInteractiontxt.g:1312:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__ElementsAssignment_4 )* ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1316:1: ( ( ( rule__Condition__ElementsAssignment_4 )* ) )
            // InternalInteractiontxt.g:1317:1: ( ( rule__Condition__ElementsAssignment_4 )* )
            {
            // InternalInteractiontxt.g:1317:1: ( ( rule__Condition__ElementsAssignment_4 )* )
            // InternalInteractiontxt.g:1318:2: ( rule__Condition__ElementsAssignment_4 )*
            {
             before(grammarAccess.getConditionAccess().getElementsAssignment_4()); 
            // InternalInteractiontxt.g:1319:2: ( rule__Condition__ElementsAssignment_4 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22||(LA30_0>=26 && LA30_0<=28)||(LA30_0>=36 && LA30_0<=37)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalInteractiontxt.g:1319:3: rule__Condition__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Condition__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // InternalInteractiontxt.g:1327:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl rule__Condition__Group__6 ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1331:1: ( rule__Condition__Group__5__Impl rule__Condition__Group__6 )
            // InternalInteractiontxt.g:1332:2: rule__Condition__Group__5__Impl rule__Condition__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Condition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // InternalInteractiontxt.g:1339:1: rule__Condition__Group__5__Impl : ( '}' ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1343:1: ( ( '}' ) )
            // InternalInteractiontxt.g:1344:1: ( '}' )
            {
            // InternalInteractiontxt.g:1344:1: ( '}' )
            // InternalInteractiontxt.g:1345:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group__6"
    // InternalInteractiontxt.g:1354:1: rule__Condition__Group__6 : rule__Condition__Group__6__Impl ;
    public final void rule__Condition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1358:1: ( rule__Condition__Group__6__Impl )
            // InternalInteractiontxt.g:1359:2: rule__Condition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__6"


    // $ANTLR start "rule__Condition__Group__6__Impl"
    // InternalInteractiontxt.g:1365:1: rule__Condition__Group__6__Impl : ( ( rule__Condition__TransitionAssignment_6 ) ) ;
    public final void rule__Condition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1369:1: ( ( ( rule__Condition__TransitionAssignment_6 ) ) )
            // InternalInteractiontxt.g:1370:1: ( ( rule__Condition__TransitionAssignment_6 ) )
            {
            // InternalInteractiontxt.g:1370:1: ( ( rule__Condition__TransitionAssignment_6 ) )
            // InternalInteractiontxt.g:1371:2: ( rule__Condition__TransitionAssignment_6 )
            {
             before(grammarAccess.getConditionAccess().getTransitionAssignment_6()); 
            // InternalInteractiontxt.g:1372:2: ( rule__Condition__TransitionAssignment_6 )
            // InternalInteractiontxt.g:1372:3: rule__Condition__TransitionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Condition__TransitionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getTransitionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__6__Impl"


    // $ANTLR start "rule__StartTransition__Group__0"
    // InternalInteractiontxt.g:1381:1: rule__StartTransition__Group__0 : rule__StartTransition__Group__0__Impl rule__StartTransition__Group__1 ;
    public final void rule__StartTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1385:1: ( rule__StartTransition__Group__0__Impl rule__StartTransition__Group__1 )
            // InternalInteractiontxt.g:1386:2: rule__StartTransition__Group__0__Impl rule__StartTransition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StartTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartTransition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTransition__Group__0"


    // $ANTLR start "rule__StartTransition__Group__0__Impl"
    // InternalInteractiontxt.g:1393:1: rule__StartTransition__Group__0__Impl : ( '---' ) ;
    public final void rule__StartTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1397:1: ( ( '---' ) )
            // InternalInteractiontxt.g:1398:1: ( '---' )
            {
            // InternalInteractiontxt.g:1398:1: ( '---' )
            // InternalInteractiontxt.g:1399:2: '---'
            {
             before(grammarAccess.getStartTransitionAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStartTransitionAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTransition__Group__0__Impl"


    // $ANTLR start "rule__StartTransition__Group__1"
    // InternalInteractiontxt.g:1408:1: rule__StartTransition__Group__1 : rule__StartTransition__Group__1__Impl rule__StartTransition__Group__2 ;
    public final void rule__StartTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1412:1: ( rule__StartTransition__Group__1__Impl rule__StartTransition__Group__2 )
            // InternalInteractiontxt.g:1413:2: rule__StartTransition__Group__1__Impl rule__StartTransition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__StartTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartTransition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTransition__Group__1"


    // $ANTLR start "rule__StartTransition__Group__1__Impl"
    // InternalInteractiontxt.g:1420:1: rule__StartTransition__Group__1__Impl : ( ( rule__StartTransition__EventAssignment_1 ) ) ;
    public final void rule__StartTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1424:1: ( ( ( rule__StartTransition__EventAssignment_1 ) ) )
            // InternalInteractiontxt.g:1425:1: ( ( rule__StartTransition__EventAssignment_1 ) )
            {
            // InternalInteractiontxt.g:1425:1: ( ( rule__StartTransition__EventAssignment_1 ) )
            // InternalInteractiontxt.g:1426:2: ( rule__StartTransition__EventAssignment_1 )
            {
             before(grammarAccess.getStartTransitionAccess().getEventAssignment_1()); 
            // InternalInteractiontxt.g:1427:2: ( rule__StartTransition__EventAssignment_1 )
            // InternalInteractiontxt.g:1427:3: rule__StartTransition__EventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StartTransition__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartTransitionAccess().getEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTransition__Group__1__Impl"


    // $ANTLR start "rule__StartTransition__Group__2"
    // InternalInteractiontxt.g:1435:1: rule__StartTransition__Group__2 : rule__StartTransition__Group__2__Impl rule__StartTransition__Group__3 ;
    public final void rule__StartTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1439:1: ( rule__StartTransition__Group__2__Impl rule__StartTransition__Group__3 )
            // InternalInteractiontxt.g:1440:2: rule__StartTransition__Group__2__Impl rule__StartTransition__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__StartTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartTransition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTransition__Group__2"


    // $ANTLR start "rule__StartTransition__Group__2__Impl"
    // InternalInteractiontxt.g:1447:1: rule__StartTransition__Group__2__Impl : ( '-->' ) ;
    public final void rule__StartTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1451:1: ( ( '-->' ) )
            // InternalInteractiontxt.g:1452:1: ( '-->' )
            {
            // InternalInteractiontxt.g:1452:1: ( '-->' )
            // InternalInteractiontxt.g:1453:2: '-->'
            {
             before(grammarAccess.getStartTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStartTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTransition__Group__2__Impl"


    // $ANTLR start "rule__StartTransition__Group__3"
    // InternalInteractiontxt.g:1462:1: rule__StartTransition__Group__3 : rule__StartTransition__Group__3__Impl ;
    public final void rule__StartTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1466:1: ( rule__StartTransition__Group__3__Impl )
            // InternalInteractiontxt.g:1467:2: rule__StartTransition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartTransition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTransition__Group__3"


    // $ANTLR start "rule__StartTransition__Group__3__Impl"
    // InternalInteractiontxt.g:1473:1: rule__StartTransition__Group__3__Impl : ( ( rule__StartTransition__ActionAssignment_3 ) ) ;
    public final void rule__StartTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1477:1: ( ( ( rule__StartTransition__ActionAssignment_3 ) ) )
            // InternalInteractiontxt.g:1478:1: ( ( rule__StartTransition__ActionAssignment_3 ) )
            {
            // InternalInteractiontxt.g:1478:1: ( ( rule__StartTransition__ActionAssignment_3 ) )
            // InternalInteractiontxt.g:1479:2: ( rule__StartTransition__ActionAssignment_3 )
            {
             before(grammarAccess.getStartTransitionAccess().getActionAssignment_3()); 
            // InternalInteractiontxt.g:1480:2: ( rule__StartTransition__ActionAssignment_3 )
            // InternalInteractiontxt.g:1480:3: rule__StartTransition__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StartTransition__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStartTransitionAccess().getActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTransition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalInteractiontxt.g:1489:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1493:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalInteractiontxt.g:1494:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalInteractiontxt.g:1501:1: rule__Transition__Group__0__Impl : ( '----->' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1505:1: ( ( '----->' ) )
            // InternalInteractiontxt.g:1506:1: ( '----->' )
            {
            // InternalInteractiontxt.g:1506:1: ( '----->' )
            // InternalInteractiontxt.g:1507:2: '----->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalInteractiontxt.g:1516:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1520:1: ( rule__Transition__Group__1__Impl )
            // InternalInteractiontxt.g:1521:2: rule__Transition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalInteractiontxt.g:1527:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__ActionAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1531:1: ( ( ( rule__Transition__ActionAssignment_1 ) ) )
            // InternalInteractiontxt.g:1532:1: ( ( rule__Transition__ActionAssignment_1 ) )
            {
            // InternalInteractiontxt.g:1532:1: ( ( rule__Transition__ActionAssignment_1 ) )
            // InternalInteractiontxt.g:1533:2: ( rule__Transition__ActionAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getActionAssignment_1()); 
            // InternalInteractiontxt.g:1534:2: ( rule__Transition__ActionAssignment_1 )
            // InternalInteractiontxt.g:1534:3: rule__Transition__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalInteractiontxt.g:1543:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1547:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalInteractiontxt.g:1548:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalInteractiontxt.g:1555:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1559:1: ( ( () ) )
            // InternalInteractiontxt.g:1560:1: ( () )
            {
            // InternalInteractiontxt.g:1560:1: ( () )
            // InternalInteractiontxt.g:1561:2: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // InternalInteractiontxt.g:1562:2: ()
            // InternalInteractiontxt.g:1562:3: 
            {
            }

             after(grammarAccess.getActionAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalInteractiontxt.g:1570:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1574:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalInteractiontxt.g:1575:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalInteractiontxt.g:1582:1: rule__Action__Group__1__Impl : ( 'Effect' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1586:1: ( ( 'Effect' ) )
            // InternalInteractiontxt.g:1587:1: ( 'Effect' )
            {
            // InternalInteractiontxt.g:1587:1: ( 'Effect' )
            // InternalInteractiontxt.g:1588:2: 'Effect'
            {
             before(grammarAccess.getActionAccess().getEffectKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getEffectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalInteractiontxt.g:1597:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1601:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalInteractiontxt.g:1602:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalInteractiontxt.g:1609:1: rule__Action__Group__2__Impl : ( ( rule__Action__IdAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1613:1: ( ( ( rule__Action__IdAssignment_2 )? ) )
            // InternalInteractiontxt.g:1614:1: ( ( rule__Action__IdAssignment_2 )? )
            {
            // InternalInteractiontxt.g:1614:1: ( ( rule__Action__IdAssignment_2 )? )
            // InternalInteractiontxt.g:1615:2: ( rule__Action__IdAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getIdAssignment_2()); 
            // InternalInteractiontxt.g:1616:2: ( rule__Action__IdAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalInteractiontxt.g:1616:3: rule__Action__IdAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__IdAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalInteractiontxt.g:1624:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1628:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalInteractiontxt.g:1629:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalInteractiontxt.g:1636:1: rule__Action__Group__3__Impl : ( '{' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1640:1: ( ( '{' ) )
            // InternalInteractiontxt.g:1641:1: ( '{' )
            {
            // InternalInteractiontxt.g:1641:1: ( '{' )
            // InternalInteractiontxt.g:1642:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalInteractiontxt.g:1651:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1655:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalInteractiontxt.g:1656:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalInteractiontxt.g:1663:1: rule__Action__Group__4__Impl : ( ( rule__Action__ElementsAssignment_4 )* ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1667:1: ( ( ( rule__Action__ElementsAssignment_4 )* ) )
            // InternalInteractiontxt.g:1668:1: ( ( rule__Action__ElementsAssignment_4 )* )
            {
            // InternalInteractiontxt.g:1668:1: ( ( rule__Action__ElementsAssignment_4 )* )
            // InternalInteractiontxt.g:1669:2: ( rule__Action__ElementsAssignment_4 )*
            {
             before(grammarAccess.getActionAccess().getElementsAssignment_4()); 
            // InternalInteractiontxt.g:1670:2: ( rule__Action__ElementsAssignment_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==22||(LA32_0>=26 && LA32_0<=28)||LA32_0==31) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalInteractiontxt.g:1670:3: rule__Action__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Action__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalInteractiontxt.g:1678:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1682:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalInteractiontxt.g:1683:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalInteractiontxt.g:1690:1: rule__Action__Group__5__Impl : ( '}' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1694:1: ( ( '}' ) )
            // InternalInteractiontxt.g:1695:1: ( '}' )
            {
            // InternalInteractiontxt.g:1695:1: ( '}' )
            // InternalInteractiontxt.g:1696:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalInteractiontxt.g:1705:1: rule__Action__Group__6 : rule__Action__Group__6__Impl ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1709:1: ( rule__Action__Group__6__Impl )
            // InternalInteractiontxt.g:1710:2: rule__Action__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalInteractiontxt.g:1716:1: rule__Action__Group__6__Impl : ( ( rule__Action__TransitionAssignment_6 )? ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1720:1: ( ( ( rule__Action__TransitionAssignment_6 )? ) )
            // InternalInteractiontxt.g:1721:1: ( ( rule__Action__TransitionAssignment_6 )? )
            {
            // InternalInteractiontxt.g:1721:1: ( ( rule__Action__TransitionAssignment_6 )? )
            // InternalInteractiontxt.g:1722:2: ( rule__Action__TransitionAssignment_6 )?
            {
             before(grammarAccess.getActionAccess().getTransitionAssignment_6()); 
            // InternalInteractiontxt.g:1723:2: ( rule__Action__TransitionAssignment_6 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalInteractiontxt.g:1723:3: rule__Action__TransitionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__TransitionAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getTransitionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__CIElement__Group__0"
    // InternalInteractiontxt.g:1732:1: rule__CIElement__Group__0 : rule__CIElement__Group__0__Impl rule__CIElement__Group__1 ;
    public final void rule__CIElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1736:1: ( rule__CIElement__Group__0__Impl rule__CIElement__Group__1 )
            // InternalInteractiontxt.g:1737:2: rule__CIElement__Group__0__Impl rule__CIElement__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CIElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__0"


    // $ANTLR start "rule__CIElement__Group__0__Impl"
    // InternalInteractiontxt.g:1744:1: rule__CIElement__Group__0__Impl : ( () ) ;
    public final void rule__CIElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1748:1: ( ( () ) )
            // InternalInteractiontxt.g:1749:1: ( () )
            {
            // InternalInteractiontxt.g:1749:1: ( () )
            // InternalInteractiontxt.g:1750:2: ()
            {
             before(grammarAccess.getCIElementAccess().getCIElementAction_0()); 
            // InternalInteractiontxt.g:1751:2: ()
            // InternalInteractiontxt.g:1751:3: 
            {
            }

             after(grammarAccess.getCIElementAccess().getCIElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__0__Impl"


    // $ANTLR start "rule__CIElement__Group__1"
    // InternalInteractiontxt.g:1759:1: rule__CIElement__Group__1 : rule__CIElement__Group__1__Impl rule__CIElement__Group__2 ;
    public final void rule__CIElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1763:1: ( rule__CIElement__Group__1__Impl rule__CIElement__Group__2 )
            // InternalInteractiontxt.g:1764:2: rule__CIElement__Group__1__Impl rule__CIElement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CIElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__1"


    // $ANTLR start "rule__CIElement__Group__1__Impl"
    // InternalInteractiontxt.g:1771:1: rule__CIElement__Group__1__Impl : ( ( rule__CIElement__Alternatives_1 )? ) ;
    public final void rule__CIElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1775:1: ( ( ( rule__CIElement__Alternatives_1 )? ) )
            // InternalInteractiontxt.g:1776:1: ( ( rule__CIElement__Alternatives_1 )? )
            {
            // InternalInteractiontxt.g:1776:1: ( ( rule__CIElement__Alternatives_1 )? )
            // InternalInteractiontxt.g:1777:2: ( rule__CIElement__Alternatives_1 )?
            {
             before(grammarAccess.getCIElementAccess().getAlternatives_1()); 
            // InternalInteractiontxt.g:1778:2: ( rule__CIElement__Alternatives_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=36 && LA34_0<=37)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalInteractiontxt.g:1778:3: rule__CIElement__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CIElement__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCIElementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__1__Impl"


    // $ANTLR start "rule__CIElement__Group__2"
    // InternalInteractiontxt.g:1786:1: rule__CIElement__Group__2 : rule__CIElement__Group__2__Impl rule__CIElement__Group__3 ;
    public final void rule__CIElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1790:1: ( rule__CIElement__Group__2__Impl rule__CIElement__Group__3 )
            // InternalInteractiontxt.g:1791:2: rule__CIElement__Group__2__Impl rule__CIElement__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CIElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__2"


    // $ANTLR start "rule__CIElement__Group__2__Impl"
    // InternalInteractiontxt.g:1798:1: rule__CIElement__Group__2__Impl : ( 'Interface' ) ;
    public final void rule__CIElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1802:1: ( ( 'Interface' ) )
            // InternalInteractiontxt.g:1803:1: ( 'Interface' )
            {
            // InternalInteractiontxt.g:1803:1: ( 'Interface' )
            // InternalInteractiontxt.g:1804:2: 'Interface'
            {
             before(grammarAccess.getCIElementAccess().getInterfaceKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCIElementAccess().getInterfaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__2__Impl"


    // $ANTLR start "rule__CIElement__Group__3"
    // InternalInteractiontxt.g:1813:1: rule__CIElement__Group__3 : rule__CIElement__Group__3__Impl rule__CIElement__Group__4 ;
    public final void rule__CIElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1817:1: ( rule__CIElement__Group__3__Impl rule__CIElement__Group__4 )
            // InternalInteractiontxt.g:1818:2: rule__CIElement__Group__3__Impl rule__CIElement__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__CIElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__3"


    // $ANTLR start "rule__CIElement__Group__3__Impl"
    // InternalInteractiontxt.g:1825:1: rule__CIElement__Group__3__Impl : ( ( rule__CIElement__IdAssignment_3 ) ) ;
    public final void rule__CIElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1829:1: ( ( ( rule__CIElement__IdAssignment_3 ) ) )
            // InternalInteractiontxt.g:1830:1: ( ( rule__CIElement__IdAssignment_3 ) )
            {
            // InternalInteractiontxt.g:1830:1: ( ( rule__CIElement__IdAssignment_3 ) )
            // InternalInteractiontxt.g:1831:2: ( rule__CIElement__IdAssignment_3 )
            {
             before(grammarAccess.getCIElementAccess().getIdAssignment_3()); 
            // InternalInteractiontxt.g:1832:2: ( rule__CIElement__IdAssignment_3 )
            // InternalInteractiontxt.g:1832:3: rule__CIElement__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CIElement__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCIElementAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__3__Impl"


    // $ANTLR start "rule__CIElement__Group__4"
    // InternalInteractiontxt.g:1840:1: rule__CIElement__Group__4 : rule__CIElement__Group__4__Impl rule__CIElement__Group__5 ;
    public final void rule__CIElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1844:1: ( rule__CIElement__Group__4__Impl rule__CIElement__Group__5 )
            // InternalInteractiontxt.g:1845:2: rule__CIElement__Group__4__Impl rule__CIElement__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__CIElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__4"


    // $ANTLR start "rule__CIElement__Group__4__Impl"
    // InternalInteractiontxt.g:1852:1: rule__CIElement__Group__4__Impl : ( '{' ) ;
    public final void rule__CIElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1856:1: ( ( '{' ) )
            // InternalInteractiontxt.g:1857:1: ( '{' )
            {
            // InternalInteractiontxt.g:1857:1: ( '{' )
            // InternalInteractiontxt.g:1858:2: '{'
            {
             before(grammarAccess.getCIElementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCIElementAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__4__Impl"


    // $ANTLR start "rule__CIElement__Group__5"
    // InternalInteractiontxt.g:1867:1: rule__CIElement__Group__5 : rule__CIElement__Group__5__Impl rule__CIElement__Group__6 ;
    public final void rule__CIElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1871:1: ( rule__CIElement__Group__5__Impl rule__CIElement__Group__6 )
            // InternalInteractiontxt.g:1872:2: rule__CIElement__Group__5__Impl rule__CIElement__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__CIElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__5"


    // $ANTLR start "rule__CIElement__Group__5__Impl"
    // InternalInteractiontxt.g:1879:1: rule__CIElement__Group__5__Impl : ( ( rule__CIElement__Group_5__0 )? ) ;
    public final void rule__CIElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1883:1: ( ( ( rule__CIElement__Group_5__0 )? ) )
            // InternalInteractiontxt.g:1884:1: ( ( rule__CIElement__Group_5__0 )? )
            {
            // InternalInteractiontxt.g:1884:1: ( ( rule__CIElement__Group_5__0 )? )
            // InternalInteractiontxt.g:1885:2: ( rule__CIElement__Group_5__0 )?
            {
             before(grammarAccess.getCIElementAccess().getGroup_5()); 
            // InternalInteractiontxt.g:1886:2: ( rule__CIElement__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalInteractiontxt.g:1886:3: rule__CIElement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CIElement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCIElementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__5__Impl"


    // $ANTLR start "rule__CIElement__Group__6"
    // InternalInteractiontxt.g:1894:1: rule__CIElement__Group__6 : rule__CIElement__Group__6__Impl ;
    public final void rule__CIElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1898:1: ( rule__CIElement__Group__6__Impl )
            // InternalInteractiontxt.g:1899:2: rule__CIElement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CIElement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__6"


    // $ANTLR start "rule__CIElement__Group__6__Impl"
    // InternalInteractiontxt.g:1905:1: rule__CIElement__Group__6__Impl : ( '}' ) ;
    public final void rule__CIElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1909:1: ( ( '}' ) )
            // InternalInteractiontxt.g:1910:1: ( '}' )
            {
            // InternalInteractiontxt.g:1910:1: ( '}' )
            // InternalInteractiontxt.g:1911:2: '}'
            {
             before(grammarAccess.getCIElementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCIElementAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group__6__Impl"


    // $ANTLR start "rule__CIElement__Group_5__0"
    // InternalInteractiontxt.g:1921:1: rule__CIElement__Group_5__0 : rule__CIElement__Group_5__0__Impl rule__CIElement__Group_5__1 ;
    public final void rule__CIElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1925:1: ( rule__CIElement__Group_5__0__Impl rule__CIElement__Group_5__1 )
            // InternalInteractiontxt.g:1926:2: rule__CIElement__Group_5__0__Impl rule__CIElement__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__CIElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIElement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5__0"


    // $ANTLR start "rule__CIElement__Group_5__0__Impl"
    // InternalInteractiontxt.g:1933:1: rule__CIElement__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__CIElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1937:1: ( ( 'value' ) )
            // InternalInteractiontxt.g:1938:1: ( 'value' )
            {
            // InternalInteractiontxt.g:1938:1: ( 'value' )
            // InternalInteractiontxt.g:1939:2: 'value'
            {
             before(grammarAccess.getCIElementAccess().getValueKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCIElementAccess().getValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5__0__Impl"


    // $ANTLR start "rule__CIElement__Group_5__1"
    // InternalInteractiontxt.g:1948:1: rule__CIElement__Group_5__1 : rule__CIElement__Group_5__1__Impl rule__CIElement__Group_5__2 ;
    public final void rule__CIElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1952:1: ( rule__CIElement__Group_5__1__Impl rule__CIElement__Group_5__2 )
            // InternalInteractiontxt.g:1953:2: rule__CIElement__Group_5__1__Impl rule__CIElement__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__CIElement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIElement__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5__1"


    // $ANTLR start "rule__CIElement__Group_5__1__Impl"
    // InternalInteractiontxt.g:1960:1: rule__CIElement__Group_5__1__Impl : ( '=' ) ;
    public final void rule__CIElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1964:1: ( ( '=' ) )
            // InternalInteractiontxt.g:1965:1: ( '=' )
            {
            // InternalInteractiontxt.g:1965:1: ( '=' )
            // InternalInteractiontxt.g:1966:2: '='
            {
             before(grammarAccess.getCIElementAccess().getEqualsSignKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCIElementAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5__1__Impl"


    // $ANTLR start "rule__CIElement__Group_5__2"
    // InternalInteractiontxt.g:1975:1: rule__CIElement__Group_5__2 : rule__CIElement__Group_5__2__Impl ;
    public final void rule__CIElement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1979:1: ( rule__CIElement__Group_5__2__Impl )
            // InternalInteractiontxt.g:1980:2: rule__CIElement__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CIElement__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5__2"


    // $ANTLR start "rule__CIElement__Group_5__2__Impl"
    // InternalInteractiontxt.g:1986:1: rule__CIElement__Group_5__2__Impl : ( ( rule__CIElement__Alternatives_5_2 ) ) ;
    public final void rule__CIElement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:1990:1: ( ( ( rule__CIElement__Alternatives_5_2 ) ) )
            // InternalInteractiontxt.g:1991:1: ( ( rule__CIElement__Alternatives_5_2 ) )
            {
            // InternalInteractiontxt.g:1991:1: ( ( rule__CIElement__Alternatives_5_2 ) )
            // InternalInteractiontxt.g:1992:2: ( rule__CIElement__Alternatives_5_2 )
            {
             before(grammarAccess.getCIElementAccess().getAlternatives_5_2()); 
            // InternalInteractiontxt.g:1993:2: ( rule__CIElement__Alternatives_5_2 )
            // InternalInteractiontxt.g:1993:3: rule__CIElement__Alternatives_5_2
            {
            pushFollow(FOLLOW_2);
            rule__CIElement__Alternatives_5_2();

            state._fsp--;


            }

             after(grammarAccess.getCIElementAccess().getAlternatives_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5__2__Impl"


    // $ANTLR start "rule__CIElement__Group_5_2_0__0"
    // InternalInteractiontxt.g:2002:1: rule__CIElement__Group_5_2_0__0 : rule__CIElement__Group_5_2_0__0__Impl rule__CIElement__Group_5_2_0__1 ;
    public final void rule__CIElement__Group_5_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2006:1: ( rule__CIElement__Group_5_2_0__0__Impl rule__CIElement__Group_5_2_0__1 )
            // InternalInteractiontxt.g:2007:2: rule__CIElement__Group_5_2_0__0__Impl rule__CIElement__Group_5_2_0__1
            {
            pushFollow(FOLLOW_4);
            rule__CIElement__Group_5_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIElement__Group_5_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5_2_0__0"


    // $ANTLR start "rule__CIElement__Group_5_2_0__0__Impl"
    // InternalInteractiontxt.g:2014:1: rule__CIElement__Group_5_2_0__0__Impl : ( '\"' ) ;
    public final void rule__CIElement__Group_5_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2018:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:2019:1: ( '\"' )
            {
            // InternalInteractiontxt.g:2019:1: ( '\"' )
            // InternalInteractiontxt.g:2020:2: '\"'
            {
             before(grammarAccess.getCIElementAccess().getQuotationMarkKeyword_5_2_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCIElementAccess().getQuotationMarkKeyword_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5_2_0__0__Impl"


    // $ANTLR start "rule__CIElement__Group_5_2_0__1"
    // InternalInteractiontxt.g:2029:1: rule__CIElement__Group_5_2_0__1 : rule__CIElement__Group_5_2_0__1__Impl rule__CIElement__Group_5_2_0__2 ;
    public final void rule__CIElement__Group_5_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2033:1: ( rule__CIElement__Group_5_2_0__1__Impl rule__CIElement__Group_5_2_0__2 )
            // InternalInteractiontxt.g:2034:2: rule__CIElement__Group_5_2_0__1__Impl rule__CIElement__Group_5_2_0__2
            {
            pushFollow(FOLLOW_20);
            rule__CIElement__Group_5_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIElement__Group_5_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5_2_0__1"


    // $ANTLR start "rule__CIElement__Group_5_2_0__1__Impl"
    // InternalInteractiontxt.g:2041:1: rule__CIElement__Group_5_2_0__1__Impl : ( ( rule__CIElement__ValueAssignment_5_2_0_1 ) ) ;
    public final void rule__CIElement__Group_5_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2045:1: ( ( ( rule__CIElement__ValueAssignment_5_2_0_1 ) ) )
            // InternalInteractiontxt.g:2046:1: ( ( rule__CIElement__ValueAssignment_5_2_0_1 ) )
            {
            // InternalInteractiontxt.g:2046:1: ( ( rule__CIElement__ValueAssignment_5_2_0_1 ) )
            // InternalInteractiontxt.g:2047:2: ( rule__CIElement__ValueAssignment_5_2_0_1 )
            {
             before(grammarAccess.getCIElementAccess().getValueAssignment_5_2_0_1()); 
            // InternalInteractiontxt.g:2048:2: ( rule__CIElement__ValueAssignment_5_2_0_1 )
            // InternalInteractiontxt.g:2048:3: rule__CIElement__ValueAssignment_5_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CIElement__ValueAssignment_5_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCIElementAccess().getValueAssignment_5_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5_2_0__1__Impl"


    // $ANTLR start "rule__CIElement__Group_5_2_0__2"
    // InternalInteractiontxt.g:2056:1: rule__CIElement__Group_5_2_0__2 : rule__CIElement__Group_5_2_0__2__Impl ;
    public final void rule__CIElement__Group_5_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2060:1: ( rule__CIElement__Group_5_2_0__2__Impl )
            // InternalInteractiontxt.g:2061:2: rule__CIElement__Group_5_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CIElement__Group_5_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5_2_0__2"


    // $ANTLR start "rule__CIElement__Group_5_2_0__2__Impl"
    // InternalInteractiontxt.g:2067:1: rule__CIElement__Group_5_2_0__2__Impl : ( ( rule__CIElement__OperationAssignment_5_2_0_2 ) ) ;
    public final void rule__CIElement__Group_5_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2071:1: ( ( ( rule__CIElement__OperationAssignment_5_2_0_2 ) ) )
            // InternalInteractiontxt.g:2072:1: ( ( rule__CIElement__OperationAssignment_5_2_0_2 ) )
            {
            // InternalInteractiontxt.g:2072:1: ( ( rule__CIElement__OperationAssignment_5_2_0_2 ) )
            // InternalInteractiontxt.g:2073:2: ( rule__CIElement__OperationAssignment_5_2_0_2 )
            {
             before(grammarAccess.getCIElementAccess().getOperationAssignment_5_2_0_2()); 
            // InternalInteractiontxt.g:2074:2: ( rule__CIElement__OperationAssignment_5_2_0_2 )
            // InternalInteractiontxt.g:2074:3: rule__CIElement__OperationAssignment_5_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CIElement__OperationAssignment_5_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCIElementAccess().getOperationAssignment_5_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__Group_5_2_0__2__Impl"


    // $ANTLR start "rule__CLElement__Group__0"
    // InternalInteractiontxt.g:2083:1: rule__CLElement__Group__0 : rule__CLElement__Group__0__Impl rule__CLElement__Group__1 ;
    public final void rule__CLElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2087:1: ( rule__CLElement__Group__0__Impl rule__CLElement__Group__1 )
            // InternalInteractiontxt.g:2088:2: rule__CLElement__Group__0__Impl rule__CLElement__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__CLElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__0"


    // $ANTLR start "rule__CLElement__Group__0__Impl"
    // InternalInteractiontxt.g:2095:1: rule__CLElement__Group__0__Impl : ( () ) ;
    public final void rule__CLElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2099:1: ( ( () ) )
            // InternalInteractiontxt.g:2100:1: ( () )
            {
            // InternalInteractiontxt.g:2100:1: ( () )
            // InternalInteractiontxt.g:2101:2: ()
            {
             before(grammarAccess.getCLElementAccess().getCLElementAction_0()); 
            // InternalInteractiontxt.g:2102:2: ()
            // InternalInteractiontxt.g:2102:3: 
            {
            }

             after(grammarAccess.getCLElementAccess().getCLElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__0__Impl"


    // $ANTLR start "rule__CLElement__Group__1"
    // InternalInteractiontxt.g:2110:1: rule__CLElement__Group__1 : rule__CLElement__Group__1__Impl rule__CLElement__Group__2 ;
    public final void rule__CLElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2114:1: ( rule__CLElement__Group__1__Impl rule__CLElement__Group__2 )
            // InternalInteractiontxt.g:2115:2: rule__CLElement__Group__1__Impl rule__CLElement__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CLElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__1"


    // $ANTLR start "rule__CLElement__Group__1__Impl"
    // InternalInteractiontxt.g:2122:1: rule__CLElement__Group__1__Impl : ( ( rule__CLElement__Alternatives_1 )? ) ;
    public final void rule__CLElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2126:1: ( ( ( rule__CLElement__Alternatives_1 )? ) )
            // InternalInteractiontxt.g:2127:1: ( ( rule__CLElement__Alternatives_1 )? )
            {
            // InternalInteractiontxt.g:2127:1: ( ( rule__CLElement__Alternatives_1 )? )
            // InternalInteractiontxt.g:2128:2: ( rule__CLElement__Alternatives_1 )?
            {
             before(grammarAccess.getCLElementAccess().getAlternatives_1()); 
            // InternalInteractiontxt.g:2129:2: ( rule__CLElement__Alternatives_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=36 && LA36_0<=37)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalInteractiontxt.g:2129:3: rule__CLElement__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CLElement__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCLElementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__1__Impl"


    // $ANTLR start "rule__CLElement__Group__2"
    // InternalInteractiontxt.g:2137:1: rule__CLElement__Group__2 : rule__CLElement__Group__2__Impl rule__CLElement__Group__3 ;
    public final void rule__CLElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2141:1: ( rule__CLElement__Group__2__Impl rule__CLElement__Group__3 )
            // InternalInteractiontxt.g:2142:2: rule__CLElement__Group__2__Impl rule__CLElement__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CLElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__2"


    // $ANTLR start "rule__CLElement__Group__2__Impl"
    // InternalInteractiontxt.g:2149:1: rule__CLElement__Group__2__Impl : ( 'Lang' ) ;
    public final void rule__CLElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2153:1: ( ( 'Lang' ) )
            // InternalInteractiontxt.g:2154:1: ( 'Lang' )
            {
            // InternalInteractiontxt.g:2154:1: ( 'Lang' )
            // InternalInteractiontxt.g:2155:2: 'Lang'
            {
             before(grammarAccess.getCLElementAccess().getLangKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCLElementAccess().getLangKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__2__Impl"


    // $ANTLR start "rule__CLElement__Group__3"
    // InternalInteractiontxt.g:2164:1: rule__CLElement__Group__3 : rule__CLElement__Group__3__Impl rule__CLElement__Group__4 ;
    public final void rule__CLElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2168:1: ( rule__CLElement__Group__3__Impl rule__CLElement__Group__4 )
            // InternalInteractiontxt.g:2169:2: rule__CLElement__Group__3__Impl rule__CLElement__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__CLElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__3"


    // $ANTLR start "rule__CLElement__Group__3__Impl"
    // InternalInteractiontxt.g:2176:1: rule__CLElement__Group__3__Impl : ( ( rule__CLElement__IdAssignment_3 ) ) ;
    public final void rule__CLElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2180:1: ( ( ( rule__CLElement__IdAssignment_3 ) ) )
            // InternalInteractiontxt.g:2181:1: ( ( rule__CLElement__IdAssignment_3 ) )
            {
            // InternalInteractiontxt.g:2181:1: ( ( rule__CLElement__IdAssignment_3 ) )
            // InternalInteractiontxt.g:2182:2: ( rule__CLElement__IdAssignment_3 )
            {
             before(grammarAccess.getCLElementAccess().getIdAssignment_3()); 
            // InternalInteractiontxt.g:2183:2: ( rule__CLElement__IdAssignment_3 )
            // InternalInteractiontxt.g:2183:3: rule__CLElement__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CLElement__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCLElementAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__3__Impl"


    // $ANTLR start "rule__CLElement__Group__4"
    // InternalInteractiontxt.g:2191:1: rule__CLElement__Group__4 : rule__CLElement__Group__4__Impl rule__CLElement__Group__5 ;
    public final void rule__CLElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2195:1: ( rule__CLElement__Group__4__Impl rule__CLElement__Group__5 )
            // InternalInteractiontxt.g:2196:2: rule__CLElement__Group__4__Impl rule__CLElement__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__CLElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__4"


    // $ANTLR start "rule__CLElement__Group__4__Impl"
    // InternalInteractiontxt.g:2203:1: rule__CLElement__Group__4__Impl : ( '{' ) ;
    public final void rule__CLElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2207:1: ( ( '{' ) )
            // InternalInteractiontxt.g:2208:1: ( '{' )
            {
            // InternalInteractiontxt.g:2208:1: ( '{' )
            // InternalInteractiontxt.g:2209:2: '{'
            {
             before(grammarAccess.getCLElementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCLElementAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__4__Impl"


    // $ANTLR start "rule__CLElement__Group__5"
    // InternalInteractiontxt.g:2218:1: rule__CLElement__Group__5 : rule__CLElement__Group__5__Impl rule__CLElement__Group__6 ;
    public final void rule__CLElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2222:1: ( rule__CLElement__Group__5__Impl rule__CLElement__Group__6 )
            // InternalInteractiontxt.g:2223:2: rule__CLElement__Group__5__Impl rule__CLElement__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__CLElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__5"


    // $ANTLR start "rule__CLElement__Group__5__Impl"
    // InternalInteractiontxt.g:2230:1: rule__CLElement__Group__5__Impl : ( ( rule__CLElement__Group_5__0 )? ) ;
    public final void rule__CLElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2234:1: ( ( ( rule__CLElement__Group_5__0 )? ) )
            // InternalInteractiontxt.g:2235:1: ( ( rule__CLElement__Group_5__0 )? )
            {
            // InternalInteractiontxt.g:2235:1: ( ( rule__CLElement__Group_5__0 )? )
            // InternalInteractiontxt.g:2236:2: ( rule__CLElement__Group_5__0 )?
            {
             before(grammarAccess.getCLElementAccess().getGroup_5()); 
            // InternalInteractiontxt.g:2237:2: ( rule__CLElement__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalInteractiontxt.g:2237:3: rule__CLElement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CLElement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCLElementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__5__Impl"


    // $ANTLR start "rule__CLElement__Group__6"
    // InternalInteractiontxt.g:2245:1: rule__CLElement__Group__6 : rule__CLElement__Group__6__Impl ;
    public final void rule__CLElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2249:1: ( rule__CLElement__Group__6__Impl )
            // InternalInteractiontxt.g:2250:2: rule__CLElement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CLElement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__6"


    // $ANTLR start "rule__CLElement__Group__6__Impl"
    // InternalInteractiontxt.g:2256:1: rule__CLElement__Group__6__Impl : ( '}' ) ;
    public final void rule__CLElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2260:1: ( ( '}' ) )
            // InternalInteractiontxt.g:2261:1: ( '}' )
            {
            // InternalInteractiontxt.g:2261:1: ( '}' )
            // InternalInteractiontxt.g:2262:2: '}'
            {
             before(grammarAccess.getCLElementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCLElementAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group__6__Impl"


    // $ANTLR start "rule__CLElement__Group_5__0"
    // InternalInteractiontxt.g:2272:1: rule__CLElement__Group_5__0 : rule__CLElement__Group_5__0__Impl rule__CLElement__Group_5__1 ;
    public final void rule__CLElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2276:1: ( rule__CLElement__Group_5__0__Impl rule__CLElement__Group_5__1 )
            // InternalInteractiontxt.g:2277:2: rule__CLElement__Group_5__0__Impl rule__CLElement__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__CLElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLElement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5__0"


    // $ANTLR start "rule__CLElement__Group_5__0__Impl"
    // InternalInteractiontxt.g:2284:1: rule__CLElement__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__CLElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2288:1: ( ( 'value' ) )
            // InternalInteractiontxt.g:2289:1: ( 'value' )
            {
            // InternalInteractiontxt.g:2289:1: ( 'value' )
            // InternalInteractiontxt.g:2290:2: 'value'
            {
             before(grammarAccess.getCLElementAccess().getValueKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCLElementAccess().getValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5__0__Impl"


    // $ANTLR start "rule__CLElement__Group_5__1"
    // InternalInteractiontxt.g:2299:1: rule__CLElement__Group_5__1 : rule__CLElement__Group_5__1__Impl rule__CLElement__Group_5__2 ;
    public final void rule__CLElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2303:1: ( rule__CLElement__Group_5__1__Impl rule__CLElement__Group_5__2 )
            // InternalInteractiontxt.g:2304:2: rule__CLElement__Group_5__1__Impl rule__CLElement__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__CLElement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLElement__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5__1"


    // $ANTLR start "rule__CLElement__Group_5__1__Impl"
    // InternalInteractiontxt.g:2311:1: rule__CLElement__Group_5__1__Impl : ( '=' ) ;
    public final void rule__CLElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2315:1: ( ( '=' ) )
            // InternalInteractiontxt.g:2316:1: ( '=' )
            {
            // InternalInteractiontxt.g:2316:1: ( '=' )
            // InternalInteractiontxt.g:2317:2: '='
            {
             before(grammarAccess.getCLElementAccess().getEqualsSignKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCLElementAccess().getEqualsSignKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5__1__Impl"


    // $ANTLR start "rule__CLElement__Group_5__2"
    // InternalInteractiontxt.g:2326:1: rule__CLElement__Group_5__2 : rule__CLElement__Group_5__2__Impl ;
    public final void rule__CLElement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2330:1: ( rule__CLElement__Group_5__2__Impl )
            // InternalInteractiontxt.g:2331:2: rule__CLElement__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CLElement__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5__2"


    // $ANTLR start "rule__CLElement__Group_5__2__Impl"
    // InternalInteractiontxt.g:2337:1: rule__CLElement__Group_5__2__Impl : ( ( rule__CLElement__Alternatives_5_2 ) ) ;
    public final void rule__CLElement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2341:1: ( ( ( rule__CLElement__Alternatives_5_2 ) ) )
            // InternalInteractiontxt.g:2342:1: ( ( rule__CLElement__Alternatives_5_2 ) )
            {
            // InternalInteractiontxt.g:2342:1: ( ( rule__CLElement__Alternatives_5_2 ) )
            // InternalInteractiontxt.g:2343:2: ( rule__CLElement__Alternatives_5_2 )
            {
             before(grammarAccess.getCLElementAccess().getAlternatives_5_2()); 
            // InternalInteractiontxt.g:2344:2: ( rule__CLElement__Alternatives_5_2 )
            // InternalInteractiontxt.g:2344:3: rule__CLElement__Alternatives_5_2
            {
            pushFollow(FOLLOW_2);
            rule__CLElement__Alternatives_5_2();

            state._fsp--;


            }

             after(grammarAccess.getCLElementAccess().getAlternatives_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5__2__Impl"


    // $ANTLR start "rule__CLElement__Group_5_2_0__0"
    // InternalInteractiontxt.g:2353:1: rule__CLElement__Group_5_2_0__0 : rule__CLElement__Group_5_2_0__0__Impl rule__CLElement__Group_5_2_0__1 ;
    public final void rule__CLElement__Group_5_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2357:1: ( rule__CLElement__Group_5_2_0__0__Impl rule__CLElement__Group_5_2_0__1 )
            // InternalInteractiontxt.g:2358:2: rule__CLElement__Group_5_2_0__0__Impl rule__CLElement__Group_5_2_0__1
            {
            pushFollow(FOLLOW_4);
            rule__CLElement__Group_5_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLElement__Group_5_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5_2_0__0"


    // $ANTLR start "rule__CLElement__Group_5_2_0__0__Impl"
    // InternalInteractiontxt.g:2365:1: rule__CLElement__Group_5_2_0__0__Impl : ( '\"' ) ;
    public final void rule__CLElement__Group_5_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2369:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:2370:1: ( '\"' )
            {
            // InternalInteractiontxt.g:2370:1: ( '\"' )
            // InternalInteractiontxt.g:2371:2: '\"'
            {
             before(grammarAccess.getCLElementAccess().getQuotationMarkKeyword_5_2_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCLElementAccess().getQuotationMarkKeyword_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5_2_0__0__Impl"


    // $ANTLR start "rule__CLElement__Group_5_2_0__1"
    // InternalInteractiontxt.g:2380:1: rule__CLElement__Group_5_2_0__1 : rule__CLElement__Group_5_2_0__1__Impl rule__CLElement__Group_5_2_0__2 ;
    public final void rule__CLElement__Group_5_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2384:1: ( rule__CLElement__Group_5_2_0__1__Impl rule__CLElement__Group_5_2_0__2 )
            // InternalInteractiontxt.g:2385:2: rule__CLElement__Group_5_2_0__1__Impl rule__CLElement__Group_5_2_0__2
            {
            pushFollow(FOLLOW_20);
            rule__CLElement__Group_5_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CLElement__Group_5_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5_2_0__1"


    // $ANTLR start "rule__CLElement__Group_5_2_0__1__Impl"
    // InternalInteractiontxt.g:2392:1: rule__CLElement__Group_5_2_0__1__Impl : ( ( rule__CLElement__ValueAssignment_5_2_0_1 ) ) ;
    public final void rule__CLElement__Group_5_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2396:1: ( ( ( rule__CLElement__ValueAssignment_5_2_0_1 ) ) )
            // InternalInteractiontxt.g:2397:1: ( ( rule__CLElement__ValueAssignment_5_2_0_1 ) )
            {
            // InternalInteractiontxt.g:2397:1: ( ( rule__CLElement__ValueAssignment_5_2_0_1 ) )
            // InternalInteractiontxt.g:2398:2: ( rule__CLElement__ValueAssignment_5_2_0_1 )
            {
             before(grammarAccess.getCLElementAccess().getValueAssignment_5_2_0_1()); 
            // InternalInteractiontxt.g:2399:2: ( rule__CLElement__ValueAssignment_5_2_0_1 )
            // InternalInteractiontxt.g:2399:3: rule__CLElement__ValueAssignment_5_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CLElement__ValueAssignment_5_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCLElementAccess().getValueAssignment_5_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5_2_0__1__Impl"


    // $ANTLR start "rule__CLElement__Group_5_2_0__2"
    // InternalInteractiontxt.g:2407:1: rule__CLElement__Group_5_2_0__2 : rule__CLElement__Group_5_2_0__2__Impl ;
    public final void rule__CLElement__Group_5_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2411:1: ( rule__CLElement__Group_5_2_0__2__Impl )
            // InternalInteractiontxt.g:2412:2: rule__CLElement__Group_5_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CLElement__Group_5_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5_2_0__2"


    // $ANTLR start "rule__CLElement__Group_5_2_0__2__Impl"
    // InternalInteractiontxt.g:2418:1: rule__CLElement__Group_5_2_0__2__Impl : ( ( rule__CLElement__OperationAssignment_5_2_0_2 ) ) ;
    public final void rule__CLElement__Group_5_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2422:1: ( ( ( rule__CLElement__OperationAssignment_5_2_0_2 ) ) )
            // InternalInteractiontxt.g:2423:1: ( ( rule__CLElement__OperationAssignment_5_2_0_2 ) )
            {
            // InternalInteractiontxt.g:2423:1: ( ( rule__CLElement__OperationAssignment_5_2_0_2 ) )
            // InternalInteractiontxt.g:2424:2: ( rule__CLElement__OperationAssignment_5_2_0_2 )
            {
             before(grammarAccess.getCLElementAccess().getOperationAssignment_5_2_0_2()); 
            // InternalInteractiontxt.g:2425:2: ( rule__CLElement__OperationAssignment_5_2_0_2 )
            // InternalInteractiontxt.g:2425:3: rule__CLElement__OperationAssignment_5_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CLElement__OperationAssignment_5_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCLElementAccess().getOperationAssignment_5_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__Group_5_2_0__2__Impl"


    // $ANTLR start "rule__CCanvas__Group__0"
    // InternalInteractiontxt.g:2434:1: rule__CCanvas__Group__0 : rule__CCanvas__Group__0__Impl rule__CCanvas__Group__1 ;
    public final void rule__CCanvas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2438:1: ( rule__CCanvas__Group__0__Impl rule__CCanvas__Group__1 )
            // InternalInteractiontxt.g:2439:2: rule__CCanvas__Group__0__Impl rule__CCanvas__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__CCanvas__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CCanvas__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__0"


    // $ANTLR start "rule__CCanvas__Group__0__Impl"
    // InternalInteractiontxt.g:2446:1: rule__CCanvas__Group__0__Impl : ( () ) ;
    public final void rule__CCanvas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2450:1: ( ( () ) )
            // InternalInteractiontxt.g:2451:1: ( () )
            {
            // InternalInteractiontxt.g:2451:1: ( () )
            // InternalInteractiontxt.g:2452:2: ()
            {
             before(grammarAccess.getCCanvasAccess().getCCanvasAction_0()); 
            // InternalInteractiontxt.g:2453:2: ()
            // InternalInteractiontxt.g:2453:3: 
            {
            }

             after(grammarAccess.getCCanvasAccess().getCCanvasAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__0__Impl"


    // $ANTLR start "rule__CCanvas__Group__1"
    // InternalInteractiontxt.g:2461:1: rule__CCanvas__Group__1 : rule__CCanvas__Group__1__Impl rule__CCanvas__Group__2 ;
    public final void rule__CCanvas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2465:1: ( rule__CCanvas__Group__1__Impl rule__CCanvas__Group__2 )
            // InternalInteractiontxt.g:2466:2: rule__CCanvas__Group__1__Impl rule__CCanvas__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__CCanvas__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CCanvas__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__1"


    // $ANTLR start "rule__CCanvas__Group__1__Impl"
    // InternalInteractiontxt.g:2473:1: rule__CCanvas__Group__1__Impl : ( ( rule__CCanvas__Alternatives_1 )? ) ;
    public final void rule__CCanvas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2477:1: ( ( ( rule__CCanvas__Alternatives_1 )? ) )
            // InternalInteractiontxt.g:2478:1: ( ( rule__CCanvas__Alternatives_1 )? )
            {
            // InternalInteractiontxt.g:2478:1: ( ( rule__CCanvas__Alternatives_1 )? )
            // InternalInteractiontxt.g:2479:2: ( rule__CCanvas__Alternatives_1 )?
            {
             before(grammarAccess.getCCanvasAccess().getAlternatives_1()); 
            // InternalInteractiontxt.g:2480:2: ( rule__CCanvas__Alternatives_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=36 && LA38_0<=37)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalInteractiontxt.g:2480:3: rule__CCanvas__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CCanvas__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCCanvasAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__1__Impl"


    // $ANTLR start "rule__CCanvas__Group__2"
    // InternalInteractiontxt.g:2488:1: rule__CCanvas__Group__2 : rule__CCanvas__Group__2__Impl rule__CCanvas__Group__3 ;
    public final void rule__CCanvas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2492:1: ( rule__CCanvas__Group__2__Impl rule__CCanvas__Group__3 )
            // InternalInteractiontxt.g:2493:2: rule__CCanvas__Group__2__Impl rule__CCanvas__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__CCanvas__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CCanvas__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__2"


    // $ANTLR start "rule__CCanvas__Group__2__Impl"
    // InternalInteractiontxt.g:2500:1: rule__CCanvas__Group__2__Impl : ( 'Canvas' ) ;
    public final void rule__CCanvas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2504:1: ( ( 'Canvas' ) )
            // InternalInteractiontxt.g:2505:1: ( 'Canvas' )
            {
            // InternalInteractiontxt.g:2505:1: ( 'Canvas' )
            // InternalInteractiontxt.g:2506:2: 'Canvas'
            {
             before(grammarAccess.getCCanvasAccess().getCanvasKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCCanvasAccess().getCanvasKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__2__Impl"


    // $ANTLR start "rule__CCanvas__Group__3"
    // InternalInteractiontxt.g:2515:1: rule__CCanvas__Group__3 : rule__CCanvas__Group__3__Impl rule__CCanvas__Group__4 ;
    public final void rule__CCanvas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2519:1: ( rule__CCanvas__Group__3__Impl rule__CCanvas__Group__4 )
            // InternalInteractiontxt.g:2520:2: rule__CCanvas__Group__3__Impl rule__CCanvas__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__CCanvas__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CCanvas__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__3"


    // $ANTLR start "rule__CCanvas__Group__3__Impl"
    // InternalInteractiontxt.g:2527:1: rule__CCanvas__Group__3__Impl : ( '{' ) ;
    public final void rule__CCanvas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2531:1: ( ( '{' ) )
            // InternalInteractiontxt.g:2532:1: ( '{' )
            {
            // InternalInteractiontxt.g:2532:1: ( '{' )
            // InternalInteractiontxt.g:2533:2: '{'
            {
             before(grammarAccess.getCCanvasAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCCanvasAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__3__Impl"


    // $ANTLR start "rule__CCanvas__Group__4"
    // InternalInteractiontxt.g:2542:1: rule__CCanvas__Group__4 : rule__CCanvas__Group__4__Impl rule__CCanvas__Group__5 ;
    public final void rule__CCanvas__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2546:1: ( rule__CCanvas__Group__4__Impl rule__CCanvas__Group__5 )
            // InternalInteractiontxt.g:2547:2: rule__CCanvas__Group__4__Impl rule__CCanvas__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__CCanvas__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CCanvas__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__4"


    // $ANTLR start "rule__CCanvas__Group__4__Impl"
    // InternalInteractiontxt.g:2554:1: rule__CCanvas__Group__4__Impl : ( ( rule__CCanvas__Group_4__0 )? ) ;
    public final void rule__CCanvas__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2558:1: ( ( ( rule__CCanvas__Group_4__0 )? ) )
            // InternalInteractiontxt.g:2559:1: ( ( rule__CCanvas__Group_4__0 )? )
            {
            // InternalInteractiontxt.g:2559:1: ( ( rule__CCanvas__Group_4__0 )? )
            // InternalInteractiontxt.g:2560:2: ( rule__CCanvas__Group_4__0 )?
            {
             before(grammarAccess.getCCanvasAccess().getGroup_4()); 
            // InternalInteractiontxt.g:2561:2: ( rule__CCanvas__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==23) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalInteractiontxt.g:2561:3: rule__CCanvas__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CCanvas__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCCanvasAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__4__Impl"


    // $ANTLR start "rule__CCanvas__Group__5"
    // InternalInteractiontxt.g:2569:1: rule__CCanvas__Group__5 : rule__CCanvas__Group__5__Impl ;
    public final void rule__CCanvas__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2573:1: ( rule__CCanvas__Group__5__Impl )
            // InternalInteractiontxt.g:2574:2: rule__CCanvas__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CCanvas__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__5"


    // $ANTLR start "rule__CCanvas__Group__5__Impl"
    // InternalInteractiontxt.g:2580:1: rule__CCanvas__Group__5__Impl : ( '}' ) ;
    public final void rule__CCanvas__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2584:1: ( ( '}' ) )
            // InternalInteractiontxt.g:2585:1: ( '}' )
            {
            // InternalInteractiontxt.g:2585:1: ( '}' )
            // InternalInteractiontxt.g:2586:2: '}'
            {
             before(grammarAccess.getCCanvasAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCCanvasAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group__5__Impl"


    // $ANTLR start "rule__CCanvas__Group_4__0"
    // InternalInteractiontxt.g:2596:1: rule__CCanvas__Group_4__0 : rule__CCanvas__Group_4__0__Impl rule__CCanvas__Group_4__1 ;
    public final void rule__CCanvas__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2600:1: ( rule__CCanvas__Group_4__0__Impl rule__CCanvas__Group_4__1 )
            // InternalInteractiontxt.g:2601:2: rule__CCanvas__Group_4__0__Impl rule__CCanvas__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__CCanvas__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CCanvas__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group_4__0"


    // $ANTLR start "rule__CCanvas__Group_4__0__Impl"
    // InternalInteractiontxt.g:2608:1: rule__CCanvas__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__CCanvas__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2612:1: ( ( 'value' ) )
            // InternalInteractiontxt.g:2613:1: ( 'value' )
            {
            // InternalInteractiontxt.g:2613:1: ( 'value' )
            // InternalInteractiontxt.g:2614:2: 'value'
            {
             before(grammarAccess.getCCanvasAccess().getValueKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCCanvasAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group_4__0__Impl"


    // $ANTLR start "rule__CCanvas__Group_4__1"
    // InternalInteractiontxt.g:2623:1: rule__CCanvas__Group_4__1 : rule__CCanvas__Group_4__1__Impl rule__CCanvas__Group_4__2 ;
    public final void rule__CCanvas__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2627:1: ( rule__CCanvas__Group_4__1__Impl rule__CCanvas__Group_4__2 )
            // InternalInteractiontxt.g:2628:2: rule__CCanvas__Group_4__1__Impl rule__CCanvas__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__CCanvas__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CCanvas__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group_4__1"


    // $ANTLR start "rule__CCanvas__Group_4__1__Impl"
    // InternalInteractiontxt.g:2635:1: rule__CCanvas__Group_4__1__Impl : ( '=' ) ;
    public final void rule__CCanvas__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2639:1: ( ( '=' ) )
            // InternalInteractiontxt.g:2640:1: ( '=' )
            {
            // InternalInteractiontxt.g:2640:1: ( '=' )
            // InternalInteractiontxt.g:2641:2: '='
            {
             before(grammarAccess.getCCanvasAccess().getEqualsSignKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCCanvasAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group_4__1__Impl"


    // $ANTLR start "rule__CCanvas__Group_4__2"
    // InternalInteractiontxt.g:2650:1: rule__CCanvas__Group_4__2 : rule__CCanvas__Group_4__2__Impl ;
    public final void rule__CCanvas__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2654:1: ( rule__CCanvas__Group_4__2__Impl )
            // InternalInteractiontxt.g:2655:2: rule__CCanvas__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CCanvas__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group_4__2"


    // $ANTLR start "rule__CCanvas__Group_4__2__Impl"
    // InternalInteractiontxt.g:2661:1: rule__CCanvas__Group_4__2__Impl : ( ( rule__CCanvas__ValueAssignment_4_2 ) ) ;
    public final void rule__CCanvas__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2665:1: ( ( ( rule__CCanvas__ValueAssignment_4_2 ) ) )
            // InternalInteractiontxt.g:2666:1: ( ( rule__CCanvas__ValueAssignment_4_2 ) )
            {
            // InternalInteractiontxt.g:2666:1: ( ( rule__CCanvas__ValueAssignment_4_2 ) )
            // InternalInteractiontxt.g:2667:2: ( rule__CCanvas__ValueAssignment_4_2 )
            {
             before(grammarAccess.getCCanvasAccess().getValueAssignment_4_2()); 
            // InternalInteractiontxt.g:2668:2: ( rule__CCanvas__ValueAssignment_4_2 )
            // InternalInteractiontxt.g:2668:3: rule__CCanvas__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__CCanvas__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCCanvasAccess().getValueAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__Group_4__2__Impl"


    // $ANTLR start "rule__CVElement__Group__0"
    // InternalInteractiontxt.g:2677:1: rule__CVElement__Group__0 : rule__CVElement__Group__0__Impl rule__CVElement__Group__1 ;
    public final void rule__CVElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2681:1: ( rule__CVElement__Group__0__Impl rule__CVElement__Group__1 )
            // InternalInteractiontxt.g:2682:2: rule__CVElement__Group__0__Impl rule__CVElement__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__CVElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__0"


    // $ANTLR start "rule__CVElement__Group__0__Impl"
    // InternalInteractiontxt.g:2689:1: rule__CVElement__Group__0__Impl : ( () ) ;
    public final void rule__CVElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2693:1: ( ( () ) )
            // InternalInteractiontxt.g:2694:1: ( () )
            {
            // InternalInteractiontxt.g:2694:1: ( () )
            // InternalInteractiontxt.g:2695:2: ()
            {
             before(grammarAccess.getCVElementAccess().getCVElementAction_0()); 
            // InternalInteractiontxt.g:2696:2: ()
            // InternalInteractiontxt.g:2696:3: 
            {
            }

             after(grammarAccess.getCVElementAccess().getCVElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__0__Impl"


    // $ANTLR start "rule__CVElement__Group__1"
    // InternalInteractiontxt.g:2704:1: rule__CVElement__Group__1 : rule__CVElement__Group__1__Impl rule__CVElement__Group__2 ;
    public final void rule__CVElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2708:1: ( rule__CVElement__Group__1__Impl rule__CVElement__Group__2 )
            // InternalInteractiontxt.g:2709:2: rule__CVElement__Group__1__Impl rule__CVElement__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__CVElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__1"


    // $ANTLR start "rule__CVElement__Group__1__Impl"
    // InternalInteractiontxt.g:2716:1: rule__CVElement__Group__1__Impl : ( ( rule__CVElement__Alternatives_1 )? ) ;
    public final void rule__CVElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2720:1: ( ( ( rule__CVElement__Alternatives_1 )? ) )
            // InternalInteractiontxt.g:2721:1: ( ( rule__CVElement__Alternatives_1 )? )
            {
            // InternalInteractiontxt.g:2721:1: ( ( rule__CVElement__Alternatives_1 )? )
            // InternalInteractiontxt.g:2722:2: ( rule__CVElement__Alternatives_1 )?
            {
             before(grammarAccess.getCVElementAccess().getAlternatives_1()); 
            // InternalInteractiontxt.g:2723:2: ( rule__CVElement__Alternatives_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=36 && LA40_0<=37)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalInteractiontxt.g:2723:3: rule__CVElement__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CVElement__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCVElementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__1__Impl"


    // $ANTLR start "rule__CVElement__Group__2"
    // InternalInteractiontxt.g:2731:1: rule__CVElement__Group__2 : rule__CVElement__Group__2__Impl rule__CVElement__Group__3 ;
    public final void rule__CVElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2735:1: ( rule__CVElement__Group__2__Impl rule__CVElement__Group__3 )
            // InternalInteractiontxt.g:2736:2: rule__CVElement__Group__2__Impl rule__CVElement__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CVElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__2"


    // $ANTLR start "rule__CVElement__Group__2__Impl"
    // InternalInteractiontxt.g:2743:1: rule__CVElement__Group__2__Impl : ( 'Var' ) ;
    public final void rule__CVElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2747:1: ( ( 'Var' ) )
            // InternalInteractiontxt.g:2748:1: ( 'Var' )
            {
            // InternalInteractiontxt.g:2748:1: ( 'Var' )
            // InternalInteractiontxt.g:2749:2: 'Var'
            {
             before(grammarAccess.getCVElementAccess().getVarKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getVarKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__2__Impl"


    // $ANTLR start "rule__CVElement__Group__3"
    // InternalInteractiontxt.g:2758:1: rule__CVElement__Group__3 : rule__CVElement__Group__3__Impl rule__CVElement__Group__4 ;
    public final void rule__CVElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2762:1: ( rule__CVElement__Group__3__Impl rule__CVElement__Group__4 )
            // InternalInteractiontxt.g:2763:2: rule__CVElement__Group__3__Impl rule__CVElement__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__CVElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__3"


    // $ANTLR start "rule__CVElement__Group__3__Impl"
    // InternalInteractiontxt.g:2770:1: rule__CVElement__Group__3__Impl : ( ( rule__CVElement__IdAssignment_3 ) ) ;
    public final void rule__CVElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2774:1: ( ( ( rule__CVElement__IdAssignment_3 ) ) )
            // InternalInteractiontxt.g:2775:1: ( ( rule__CVElement__IdAssignment_3 ) )
            {
            // InternalInteractiontxt.g:2775:1: ( ( rule__CVElement__IdAssignment_3 ) )
            // InternalInteractiontxt.g:2776:2: ( rule__CVElement__IdAssignment_3 )
            {
             before(grammarAccess.getCVElementAccess().getIdAssignment_3()); 
            // InternalInteractiontxt.g:2777:2: ( rule__CVElement__IdAssignment_3 )
            // InternalInteractiontxt.g:2777:3: rule__CVElement__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCVElementAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__3__Impl"


    // $ANTLR start "rule__CVElement__Group__4"
    // InternalInteractiontxt.g:2785:1: rule__CVElement__Group__4 : rule__CVElement__Group__4__Impl rule__CVElement__Group__5 ;
    public final void rule__CVElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2789:1: ( rule__CVElement__Group__4__Impl rule__CVElement__Group__5 )
            // InternalInteractiontxt.g:2790:2: rule__CVElement__Group__4__Impl rule__CVElement__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__CVElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__4"


    // $ANTLR start "rule__CVElement__Group__4__Impl"
    // InternalInteractiontxt.g:2797:1: rule__CVElement__Group__4__Impl : ( '{' ) ;
    public final void rule__CVElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2801:1: ( ( '{' ) )
            // InternalInteractiontxt.g:2802:1: ( '{' )
            {
            // InternalInteractiontxt.g:2802:1: ( '{' )
            // InternalInteractiontxt.g:2803:2: '{'
            {
             before(grammarAccess.getCVElementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__4__Impl"


    // $ANTLR start "rule__CVElement__Group__5"
    // InternalInteractiontxt.g:2812:1: rule__CVElement__Group__5 : rule__CVElement__Group__5__Impl rule__CVElement__Group__6 ;
    public final void rule__CVElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2816:1: ( rule__CVElement__Group__5__Impl rule__CVElement__Group__6 )
            // InternalInteractiontxt.g:2817:2: rule__CVElement__Group__5__Impl rule__CVElement__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__CVElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__5"


    // $ANTLR start "rule__CVElement__Group__5__Impl"
    // InternalInteractiontxt.g:2824:1: rule__CVElement__Group__5__Impl : ( ( rule__CVElement__Alternatives_5 )? ) ;
    public final void rule__CVElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2828:1: ( ( ( rule__CVElement__Alternatives_5 )? ) )
            // InternalInteractiontxt.g:2829:1: ( ( rule__CVElement__Alternatives_5 )? )
            {
            // InternalInteractiontxt.g:2829:1: ( ( rule__CVElement__Alternatives_5 )? )
            // InternalInteractiontxt.g:2830:2: ( rule__CVElement__Alternatives_5 )?
            {
             before(grammarAccess.getCVElementAccess().getAlternatives_5()); 
            // InternalInteractiontxt.g:2831:2: ( rule__CVElement__Alternatives_5 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==23||LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalInteractiontxt.g:2831:3: rule__CVElement__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__CVElement__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCVElementAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__5__Impl"


    // $ANTLR start "rule__CVElement__Group__6"
    // InternalInteractiontxt.g:2839:1: rule__CVElement__Group__6 : rule__CVElement__Group__6__Impl ;
    public final void rule__CVElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2843:1: ( rule__CVElement__Group__6__Impl )
            // InternalInteractiontxt.g:2844:2: rule__CVElement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__6"


    // $ANTLR start "rule__CVElement__Group__6__Impl"
    // InternalInteractiontxt.g:2850:1: rule__CVElement__Group__6__Impl : ( '}' ) ;
    public final void rule__CVElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2854:1: ( ( '}' ) )
            // InternalInteractiontxt.g:2855:1: ( '}' )
            {
            // InternalInteractiontxt.g:2855:1: ( '}' )
            // InternalInteractiontxt.g:2856:2: '}'
            {
             before(grammarAccess.getCVElementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group__6__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0__0"
    // InternalInteractiontxt.g:2866:1: rule__CVElement__Group_5_0__0 : rule__CVElement__Group_5_0__0__Impl rule__CVElement__Group_5_0__1 ;
    public final void rule__CVElement__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2870:1: ( rule__CVElement__Group_5_0__0__Impl rule__CVElement__Group_5_0__1 )
            // InternalInteractiontxt.g:2871:2: rule__CVElement__Group_5_0__0__Impl rule__CVElement__Group_5_0__1
            {
            pushFollow(FOLLOW_18);
            rule__CVElement__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0__0"


    // $ANTLR start "rule__CVElement__Group_5_0__0__Impl"
    // InternalInteractiontxt.g:2878:1: rule__CVElement__Group_5_0__0__Impl : ( 'value' ) ;
    public final void rule__CVElement__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2882:1: ( ( 'value' ) )
            // InternalInteractiontxt.g:2883:1: ( 'value' )
            {
            // InternalInteractiontxt.g:2883:1: ( 'value' )
            // InternalInteractiontxt.g:2884:2: 'value'
            {
             before(grammarAccess.getCVElementAccess().getValueKeyword_5_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getValueKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0__0__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0__1"
    // InternalInteractiontxt.g:2893:1: rule__CVElement__Group_5_0__1 : rule__CVElement__Group_5_0__1__Impl rule__CVElement__Group_5_0__2 ;
    public final void rule__CVElement__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2897:1: ( rule__CVElement__Group_5_0__1__Impl rule__CVElement__Group_5_0__2 )
            // InternalInteractiontxt.g:2898:2: rule__CVElement__Group_5_0__1__Impl rule__CVElement__Group_5_0__2
            {
            pushFollow(FOLLOW_19);
            rule__CVElement__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0__1"


    // $ANTLR start "rule__CVElement__Group_5_0__1__Impl"
    // InternalInteractiontxt.g:2905:1: rule__CVElement__Group_5_0__1__Impl : ( '=' ) ;
    public final void rule__CVElement__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2909:1: ( ( '=' ) )
            // InternalInteractiontxt.g:2910:1: ( '=' )
            {
            // InternalInteractiontxt.g:2910:1: ( '=' )
            // InternalInteractiontxt.g:2911:2: '='
            {
             before(grammarAccess.getCVElementAccess().getEqualsSignKeyword_5_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getEqualsSignKeyword_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0__1__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0__2"
    // InternalInteractiontxt.g:2920:1: rule__CVElement__Group_5_0__2 : rule__CVElement__Group_5_0__2__Impl rule__CVElement__Group_5_0__3 ;
    public final void rule__CVElement__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2924:1: ( rule__CVElement__Group_5_0__2__Impl rule__CVElement__Group_5_0__3 )
            // InternalInteractiontxt.g:2925:2: rule__CVElement__Group_5_0__2__Impl rule__CVElement__Group_5_0__3
            {
            pushFollow(FOLLOW_25);
            rule__CVElement__Group_5_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0__2"


    // $ANTLR start "rule__CVElement__Group_5_0__2__Impl"
    // InternalInteractiontxt.g:2932:1: rule__CVElement__Group_5_0__2__Impl : ( ( rule__CVElement__Alternatives_5_0_2 ) ) ;
    public final void rule__CVElement__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2936:1: ( ( ( rule__CVElement__Alternatives_5_0_2 ) ) )
            // InternalInteractiontxt.g:2937:1: ( ( rule__CVElement__Alternatives_5_0_2 ) )
            {
            // InternalInteractiontxt.g:2937:1: ( ( rule__CVElement__Alternatives_5_0_2 ) )
            // InternalInteractiontxt.g:2938:2: ( rule__CVElement__Alternatives_5_0_2 )
            {
             before(grammarAccess.getCVElementAccess().getAlternatives_5_0_2()); 
            // InternalInteractiontxt.g:2939:2: ( rule__CVElement__Alternatives_5_0_2 )
            // InternalInteractiontxt.g:2939:3: rule__CVElement__Alternatives_5_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__Alternatives_5_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCVElementAccess().getAlternatives_5_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0__2__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0__3"
    // InternalInteractiontxt.g:2947:1: rule__CVElement__Group_5_0__3 : rule__CVElement__Group_5_0__3__Impl ;
    public final void rule__CVElement__Group_5_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2951:1: ( rule__CVElement__Group_5_0__3__Impl )
            // InternalInteractiontxt.g:2952:2: rule__CVElement__Group_5_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0__3"


    // $ANTLR start "rule__CVElement__Group_5_0__3__Impl"
    // InternalInteractiontxt.g:2958:1: rule__CVElement__Group_5_0__3__Impl : ( ( rule__CVElement__Group_5_0_3__0 )? ) ;
    public final void rule__CVElement__Group_5_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2962:1: ( ( ( rule__CVElement__Group_5_0_3__0 )? ) )
            // InternalInteractiontxt.g:2963:1: ( ( rule__CVElement__Group_5_0_3__0 )? )
            {
            // InternalInteractiontxt.g:2963:1: ( ( rule__CVElement__Group_5_0_3__0 )? )
            // InternalInteractiontxt.g:2964:2: ( rule__CVElement__Group_5_0_3__0 )?
            {
             before(grammarAccess.getCVElementAccess().getGroup_5_0_3()); 
            // InternalInteractiontxt.g:2965:2: ( rule__CVElement__Group_5_0_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==29) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalInteractiontxt.g:2965:3: rule__CVElement__Group_5_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CVElement__Group_5_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCVElementAccess().getGroup_5_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0__3__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0_2_1__0"
    // InternalInteractiontxt.g:2974:1: rule__CVElement__Group_5_0_2_1__0 : rule__CVElement__Group_5_0_2_1__0__Impl rule__CVElement__Group_5_0_2_1__1 ;
    public final void rule__CVElement__Group_5_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2978:1: ( rule__CVElement__Group_5_0_2_1__0__Impl rule__CVElement__Group_5_0_2_1__1 )
            // InternalInteractiontxt.g:2979:2: rule__CVElement__Group_5_0_2_1__0__Impl rule__CVElement__Group_5_0_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__CVElement__Group_5_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_2_1__0"


    // $ANTLR start "rule__CVElement__Group_5_0_2_1__0__Impl"
    // InternalInteractiontxt.g:2986:1: rule__CVElement__Group_5_0_2_1__0__Impl : ( '\"' ) ;
    public final void rule__CVElement__Group_5_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:2990:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:2991:1: ( '\"' )
            {
            // InternalInteractiontxt.g:2991:1: ( '\"' )
            // InternalInteractiontxt.g:2992:2: '\"'
            {
             before(grammarAccess.getCVElementAccess().getQuotationMarkKeyword_5_0_2_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getQuotationMarkKeyword_5_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_2_1__0__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0_2_1__1"
    // InternalInteractiontxt.g:3001:1: rule__CVElement__Group_5_0_2_1__1 : rule__CVElement__Group_5_0_2_1__1__Impl rule__CVElement__Group_5_0_2_1__2 ;
    public final void rule__CVElement__Group_5_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3005:1: ( rule__CVElement__Group_5_0_2_1__1__Impl rule__CVElement__Group_5_0_2_1__2 )
            // InternalInteractiontxt.g:3006:2: rule__CVElement__Group_5_0_2_1__1__Impl rule__CVElement__Group_5_0_2_1__2
            {
            pushFollow(FOLLOW_20);
            rule__CVElement__Group_5_0_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_2_1__1"


    // $ANTLR start "rule__CVElement__Group_5_0_2_1__1__Impl"
    // InternalInteractiontxt.g:3013:1: rule__CVElement__Group_5_0_2_1__1__Impl : ( ( rule__CVElement__ValueAssignment_5_0_2_1_1 ) ) ;
    public final void rule__CVElement__Group_5_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3017:1: ( ( ( rule__CVElement__ValueAssignment_5_0_2_1_1 ) ) )
            // InternalInteractiontxt.g:3018:1: ( ( rule__CVElement__ValueAssignment_5_0_2_1_1 ) )
            {
            // InternalInteractiontxt.g:3018:1: ( ( rule__CVElement__ValueAssignment_5_0_2_1_1 ) )
            // InternalInteractiontxt.g:3019:2: ( rule__CVElement__ValueAssignment_5_0_2_1_1 )
            {
             before(grammarAccess.getCVElementAccess().getValueAssignment_5_0_2_1_1()); 
            // InternalInteractiontxt.g:3020:2: ( rule__CVElement__ValueAssignment_5_0_2_1_1 )
            // InternalInteractiontxt.g:3020:3: rule__CVElement__ValueAssignment_5_0_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__ValueAssignment_5_0_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCVElementAccess().getValueAssignment_5_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_2_1__1__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0_2_1__2"
    // InternalInteractiontxt.g:3028:1: rule__CVElement__Group_5_0_2_1__2 : rule__CVElement__Group_5_0_2_1__2__Impl ;
    public final void rule__CVElement__Group_5_0_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3032:1: ( rule__CVElement__Group_5_0_2_1__2__Impl )
            // InternalInteractiontxt.g:3033:2: rule__CVElement__Group_5_0_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_2_1__2"


    // $ANTLR start "rule__CVElement__Group_5_0_2_1__2__Impl"
    // InternalInteractiontxt.g:3039:1: rule__CVElement__Group_5_0_2_1__2__Impl : ( '\"' ) ;
    public final void rule__CVElement__Group_5_0_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3043:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:3044:1: ( '\"' )
            {
            // InternalInteractiontxt.g:3044:1: ( '\"' )
            // InternalInteractiontxt.g:3045:2: '\"'
            {
             before(grammarAccess.getCVElementAccess().getQuotationMarkKeyword_5_0_2_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getQuotationMarkKeyword_5_0_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_2_1__2__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0_3__0"
    // InternalInteractiontxt.g:3055:1: rule__CVElement__Group_5_0_3__0 : rule__CVElement__Group_5_0_3__0__Impl rule__CVElement__Group_5_0_3__1 ;
    public final void rule__CVElement__Group_5_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3059:1: ( rule__CVElement__Group_5_0_3__0__Impl rule__CVElement__Group_5_0_3__1 )
            // InternalInteractiontxt.g:3060:2: rule__CVElement__Group_5_0_3__0__Impl rule__CVElement__Group_5_0_3__1
            {
            pushFollow(FOLLOW_26);
            rule__CVElement__Group_5_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_3__0"


    // $ANTLR start "rule__CVElement__Group_5_0_3__0__Impl"
    // InternalInteractiontxt.g:3067:1: rule__CVElement__Group_5_0_3__0__Impl : ( ',' ) ;
    public final void rule__CVElement__Group_5_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3071:1: ( ( ',' ) )
            // InternalInteractiontxt.g:3072:1: ( ',' )
            {
            // InternalInteractiontxt.g:3072:1: ( ',' )
            // InternalInteractiontxt.g:3073:2: ','
            {
             before(grammarAccess.getCVElementAccess().getCommaKeyword_5_0_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getCommaKeyword_5_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_3__0__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0_3__1"
    // InternalInteractiontxt.g:3082:1: rule__CVElement__Group_5_0_3__1 : rule__CVElement__Group_5_0_3__1__Impl rule__CVElement__Group_5_0_3__2 ;
    public final void rule__CVElement__Group_5_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3086:1: ( rule__CVElement__Group_5_0_3__1__Impl rule__CVElement__Group_5_0_3__2 )
            // InternalInteractiontxt.g:3087:2: rule__CVElement__Group_5_0_3__1__Impl rule__CVElement__Group_5_0_3__2
            {
            pushFollow(FOLLOW_18);
            rule__CVElement__Group_5_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_3__1"


    // $ANTLR start "rule__CVElement__Group_5_0_3__1__Impl"
    // InternalInteractiontxt.g:3094:1: rule__CVElement__Group_5_0_3__1__Impl : ( 'element' ) ;
    public final void rule__CVElement__Group_5_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3098:1: ( ( 'element' ) )
            // InternalInteractiontxt.g:3099:1: ( 'element' )
            {
            // InternalInteractiontxt.g:3099:1: ( 'element' )
            // InternalInteractiontxt.g:3100:2: 'element'
            {
             before(grammarAccess.getCVElementAccess().getElementKeyword_5_0_3_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getElementKeyword_5_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_3__1__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0_3__2"
    // InternalInteractiontxt.g:3109:1: rule__CVElement__Group_5_0_3__2 : rule__CVElement__Group_5_0_3__2__Impl rule__CVElement__Group_5_0_3__3 ;
    public final void rule__CVElement__Group_5_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3113:1: ( rule__CVElement__Group_5_0_3__2__Impl rule__CVElement__Group_5_0_3__3 )
            // InternalInteractiontxt.g:3114:2: rule__CVElement__Group_5_0_3__2__Impl rule__CVElement__Group_5_0_3__3
            {
            pushFollow(FOLLOW_4);
            rule__CVElement__Group_5_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_3__2"


    // $ANTLR start "rule__CVElement__Group_5_0_3__2__Impl"
    // InternalInteractiontxt.g:3121:1: rule__CVElement__Group_5_0_3__2__Impl : ( '=' ) ;
    public final void rule__CVElement__Group_5_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3125:1: ( ( '=' ) )
            // InternalInteractiontxt.g:3126:1: ( '=' )
            {
            // InternalInteractiontxt.g:3126:1: ( '=' )
            // InternalInteractiontxt.g:3127:2: '='
            {
             before(grammarAccess.getCVElementAccess().getEqualsSignKeyword_5_0_3_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getEqualsSignKeyword_5_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_3__2__Impl"


    // $ANTLR start "rule__CVElement__Group_5_0_3__3"
    // InternalInteractiontxt.g:3136:1: rule__CVElement__Group_5_0_3__3 : rule__CVElement__Group_5_0_3__3__Impl ;
    public final void rule__CVElement__Group_5_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3140:1: ( rule__CVElement__Group_5_0_3__3__Impl )
            // InternalInteractiontxt.g:3141:2: rule__CVElement__Group_5_0_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_0_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_3__3"


    // $ANTLR start "rule__CVElement__Group_5_0_3__3__Impl"
    // InternalInteractiontxt.g:3147:1: rule__CVElement__Group_5_0_3__3__Impl : ( ( rule__CVElement__ElementAssignment_5_0_3_3 ) ) ;
    public final void rule__CVElement__Group_5_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3151:1: ( ( ( rule__CVElement__ElementAssignment_5_0_3_3 ) ) )
            // InternalInteractiontxt.g:3152:1: ( ( rule__CVElement__ElementAssignment_5_0_3_3 ) )
            {
            // InternalInteractiontxt.g:3152:1: ( ( rule__CVElement__ElementAssignment_5_0_3_3 ) )
            // InternalInteractiontxt.g:3153:2: ( rule__CVElement__ElementAssignment_5_0_3_3 )
            {
             before(grammarAccess.getCVElementAccess().getElementAssignment_5_0_3_3()); 
            // InternalInteractiontxt.g:3154:2: ( rule__CVElement__ElementAssignment_5_0_3_3 )
            // InternalInteractiontxt.g:3154:3: rule__CVElement__ElementAssignment_5_0_3_3
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__ElementAssignment_5_0_3_3();

            state._fsp--;


            }

             after(grammarAccess.getCVElementAccess().getElementAssignment_5_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_0_3__3__Impl"


    // $ANTLR start "rule__CVElement__Group_5_1__0"
    // InternalInteractiontxt.g:3163:1: rule__CVElement__Group_5_1__0 : rule__CVElement__Group_5_1__0__Impl rule__CVElement__Group_5_1__1 ;
    public final void rule__CVElement__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3167:1: ( rule__CVElement__Group_5_1__0__Impl rule__CVElement__Group_5_1__1 )
            // InternalInteractiontxt.g:3168:2: rule__CVElement__Group_5_1__0__Impl rule__CVElement__Group_5_1__1
            {
            pushFollow(FOLLOW_18);
            rule__CVElement__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_1__0"


    // $ANTLR start "rule__CVElement__Group_5_1__0__Impl"
    // InternalInteractiontxt.g:3175:1: rule__CVElement__Group_5_1__0__Impl : ( 'element' ) ;
    public final void rule__CVElement__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3179:1: ( ( 'element' ) )
            // InternalInteractiontxt.g:3180:1: ( 'element' )
            {
            // InternalInteractiontxt.g:3180:1: ( 'element' )
            // InternalInteractiontxt.g:3181:2: 'element'
            {
             before(grammarAccess.getCVElementAccess().getElementKeyword_5_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getElementKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_1__0__Impl"


    // $ANTLR start "rule__CVElement__Group_5_1__1"
    // InternalInteractiontxt.g:3190:1: rule__CVElement__Group_5_1__1 : rule__CVElement__Group_5_1__1__Impl rule__CVElement__Group_5_1__2 ;
    public final void rule__CVElement__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3194:1: ( rule__CVElement__Group_5_1__1__Impl rule__CVElement__Group_5_1__2 )
            // InternalInteractiontxt.g:3195:2: rule__CVElement__Group_5_1__1__Impl rule__CVElement__Group_5_1__2
            {
            pushFollow(FOLLOW_4);
            rule__CVElement__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_1__1"


    // $ANTLR start "rule__CVElement__Group_5_1__1__Impl"
    // InternalInteractiontxt.g:3202:1: rule__CVElement__Group_5_1__1__Impl : ( '=' ) ;
    public final void rule__CVElement__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3206:1: ( ( '=' ) )
            // InternalInteractiontxt.g:3207:1: ( '=' )
            {
            // InternalInteractiontxt.g:3207:1: ( '=' )
            // InternalInteractiontxt.g:3208:2: '='
            {
             before(grammarAccess.getCVElementAccess().getEqualsSignKeyword_5_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getEqualsSignKeyword_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_1__1__Impl"


    // $ANTLR start "rule__CVElement__Group_5_1__2"
    // InternalInteractiontxt.g:3217:1: rule__CVElement__Group_5_1__2 : rule__CVElement__Group_5_1__2__Impl ;
    public final void rule__CVElement__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3221:1: ( rule__CVElement__Group_5_1__2__Impl )
            // InternalInteractiontxt.g:3222:2: rule__CVElement__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__Group_5_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_1__2"


    // $ANTLR start "rule__CVElement__Group_5_1__2__Impl"
    // InternalInteractiontxt.g:3228:1: rule__CVElement__Group_5_1__2__Impl : ( ( rule__CVElement__ElementAssignment_5_1_2 ) ) ;
    public final void rule__CVElement__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3232:1: ( ( ( rule__CVElement__ElementAssignment_5_1_2 ) ) )
            // InternalInteractiontxt.g:3233:1: ( ( rule__CVElement__ElementAssignment_5_1_2 ) )
            {
            // InternalInteractiontxt.g:3233:1: ( ( rule__CVElement__ElementAssignment_5_1_2 ) )
            // InternalInteractiontxt.g:3234:2: ( rule__CVElement__ElementAssignment_5_1_2 )
            {
             before(grammarAccess.getCVElementAccess().getElementAssignment_5_1_2()); 
            // InternalInteractiontxt.g:3235:2: ( rule__CVElement__ElementAssignment_5_1_2 )
            // InternalInteractiontxt.g:3235:3: rule__CVElement__ElementAssignment_5_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__ElementAssignment_5_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCVElementAccess().getElementAssignment_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__Group_5_1__2__Impl"


    // $ANTLR start "rule__AIElement__Group__0"
    // InternalInteractiontxt.g:3244:1: rule__AIElement__Group__0 : rule__AIElement__Group__0__Impl rule__AIElement__Group__1 ;
    public final void rule__AIElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3248:1: ( rule__AIElement__Group__0__Impl rule__AIElement__Group__1 )
            // InternalInteractiontxt.g:3249:2: rule__AIElement__Group__0__Impl rule__AIElement__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__AIElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__0"


    // $ANTLR start "rule__AIElement__Group__0__Impl"
    // InternalInteractiontxt.g:3256:1: rule__AIElement__Group__0__Impl : ( () ) ;
    public final void rule__AIElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3260:1: ( ( () ) )
            // InternalInteractiontxt.g:3261:1: ( () )
            {
            // InternalInteractiontxt.g:3261:1: ( () )
            // InternalInteractiontxt.g:3262:2: ()
            {
             before(grammarAccess.getAIElementAccess().getAIElementAction_0()); 
            // InternalInteractiontxt.g:3263:2: ()
            // InternalInteractiontxt.g:3263:3: 
            {
            }

             after(grammarAccess.getAIElementAccess().getAIElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__0__Impl"


    // $ANTLR start "rule__AIElement__Group__1"
    // InternalInteractiontxt.g:3271:1: rule__AIElement__Group__1 : rule__AIElement__Group__1__Impl rule__AIElement__Group__2 ;
    public final void rule__AIElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3275:1: ( rule__AIElement__Group__1__Impl rule__AIElement__Group__2 )
            // InternalInteractiontxt.g:3276:2: rule__AIElement__Group__1__Impl rule__AIElement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AIElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__1"


    // $ANTLR start "rule__AIElement__Group__1__Impl"
    // InternalInteractiontxt.g:3283:1: rule__AIElement__Group__1__Impl : ( 'Interface' ) ;
    public final void rule__AIElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3287:1: ( ( 'Interface' ) )
            // InternalInteractiontxt.g:3288:1: ( 'Interface' )
            {
            // InternalInteractiontxt.g:3288:1: ( 'Interface' )
            // InternalInteractiontxt.g:3289:2: 'Interface'
            {
             before(grammarAccess.getAIElementAccess().getInterfaceKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAIElementAccess().getInterfaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__1__Impl"


    // $ANTLR start "rule__AIElement__Group__2"
    // InternalInteractiontxt.g:3298:1: rule__AIElement__Group__2 : rule__AIElement__Group__2__Impl rule__AIElement__Group__3 ;
    public final void rule__AIElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3302:1: ( rule__AIElement__Group__2__Impl rule__AIElement__Group__3 )
            // InternalInteractiontxt.g:3303:2: rule__AIElement__Group__2__Impl rule__AIElement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__AIElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__2"


    // $ANTLR start "rule__AIElement__Group__2__Impl"
    // InternalInteractiontxt.g:3310:1: rule__AIElement__Group__2__Impl : ( ( rule__AIElement__IdAssignment_2 ) ) ;
    public final void rule__AIElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3314:1: ( ( ( rule__AIElement__IdAssignment_2 ) ) )
            // InternalInteractiontxt.g:3315:1: ( ( rule__AIElement__IdAssignment_2 ) )
            {
            // InternalInteractiontxt.g:3315:1: ( ( rule__AIElement__IdAssignment_2 ) )
            // InternalInteractiontxt.g:3316:2: ( rule__AIElement__IdAssignment_2 )
            {
             before(grammarAccess.getAIElementAccess().getIdAssignment_2()); 
            // InternalInteractiontxt.g:3317:2: ( rule__AIElement__IdAssignment_2 )
            // InternalInteractiontxt.g:3317:3: rule__AIElement__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AIElement__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAIElementAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__2__Impl"


    // $ANTLR start "rule__AIElement__Group__3"
    // InternalInteractiontxt.g:3325:1: rule__AIElement__Group__3 : rule__AIElement__Group__3__Impl rule__AIElement__Group__4 ;
    public final void rule__AIElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3329:1: ( rule__AIElement__Group__3__Impl rule__AIElement__Group__4 )
            // InternalInteractiontxt.g:3330:2: rule__AIElement__Group__3__Impl rule__AIElement__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__AIElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__3"


    // $ANTLR start "rule__AIElement__Group__3__Impl"
    // InternalInteractiontxt.g:3337:1: rule__AIElement__Group__3__Impl : ( '{' ) ;
    public final void rule__AIElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3341:1: ( ( '{' ) )
            // InternalInteractiontxt.g:3342:1: ( '{' )
            {
            // InternalInteractiontxt.g:3342:1: ( '{' )
            // InternalInteractiontxt.g:3343:2: '{'
            {
             before(grammarAccess.getAIElementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAIElementAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__3__Impl"


    // $ANTLR start "rule__AIElement__Group__4"
    // InternalInteractiontxt.g:3352:1: rule__AIElement__Group__4 : rule__AIElement__Group__4__Impl rule__AIElement__Group__5 ;
    public final void rule__AIElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3356:1: ( rule__AIElement__Group__4__Impl rule__AIElement__Group__5 )
            // InternalInteractiontxt.g:3357:2: rule__AIElement__Group__4__Impl rule__AIElement__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__AIElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__4"


    // $ANTLR start "rule__AIElement__Group__4__Impl"
    // InternalInteractiontxt.g:3364:1: rule__AIElement__Group__4__Impl : ( ( rule__AIElement__Group_4__0 )? ) ;
    public final void rule__AIElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3368:1: ( ( ( rule__AIElement__Group_4__0 )? ) )
            // InternalInteractiontxt.g:3369:1: ( ( rule__AIElement__Group_4__0 )? )
            {
            // InternalInteractiontxt.g:3369:1: ( ( rule__AIElement__Group_4__0 )? )
            // InternalInteractiontxt.g:3370:2: ( rule__AIElement__Group_4__0 )?
            {
             before(grammarAccess.getAIElementAccess().getGroup_4()); 
            // InternalInteractiontxt.g:3371:2: ( rule__AIElement__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalInteractiontxt.g:3371:3: rule__AIElement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AIElement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAIElementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__4__Impl"


    // $ANTLR start "rule__AIElement__Group__5"
    // InternalInteractiontxt.g:3379:1: rule__AIElement__Group__5 : rule__AIElement__Group__5__Impl ;
    public final void rule__AIElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3383:1: ( rule__AIElement__Group__5__Impl )
            // InternalInteractiontxt.g:3384:2: rule__AIElement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AIElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__5"


    // $ANTLR start "rule__AIElement__Group__5__Impl"
    // InternalInteractiontxt.g:3390:1: rule__AIElement__Group__5__Impl : ( '}' ) ;
    public final void rule__AIElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3394:1: ( ( '}' ) )
            // InternalInteractiontxt.g:3395:1: ( '}' )
            {
            // InternalInteractiontxt.g:3395:1: ( '}' )
            // InternalInteractiontxt.g:3396:2: '}'
            {
             before(grammarAccess.getAIElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAIElementAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group__5__Impl"


    // $ANTLR start "rule__AIElement__Group_4__0"
    // InternalInteractiontxt.g:3406:1: rule__AIElement__Group_4__0 : rule__AIElement__Group_4__0__Impl rule__AIElement__Group_4__1 ;
    public final void rule__AIElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3410:1: ( rule__AIElement__Group_4__0__Impl rule__AIElement__Group_4__1 )
            // InternalInteractiontxt.g:3411:2: rule__AIElement__Group_4__0__Impl rule__AIElement__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__AIElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIElement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group_4__0"


    // $ANTLR start "rule__AIElement__Group_4__0__Impl"
    // InternalInteractiontxt.g:3418:1: rule__AIElement__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__AIElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3422:1: ( ( 'value' ) )
            // InternalInteractiontxt.g:3423:1: ( 'value' )
            {
            // InternalInteractiontxt.g:3423:1: ( 'value' )
            // InternalInteractiontxt.g:3424:2: 'value'
            {
             before(grammarAccess.getAIElementAccess().getValueKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAIElementAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group_4__0__Impl"


    // $ANTLR start "rule__AIElement__Group_4__1"
    // InternalInteractiontxt.g:3433:1: rule__AIElement__Group_4__1 : rule__AIElement__Group_4__1__Impl rule__AIElement__Group_4__2 ;
    public final void rule__AIElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3437:1: ( rule__AIElement__Group_4__1__Impl rule__AIElement__Group_4__2 )
            // InternalInteractiontxt.g:3438:2: rule__AIElement__Group_4__1__Impl rule__AIElement__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__AIElement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIElement__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group_4__1"


    // $ANTLR start "rule__AIElement__Group_4__1__Impl"
    // InternalInteractiontxt.g:3445:1: rule__AIElement__Group_4__1__Impl : ( '=' ) ;
    public final void rule__AIElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3449:1: ( ( '=' ) )
            // InternalInteractiontxt.g:3450:1: ( '=' )
            {
            // InternalInteractiontxt.g:3450:1: ( '=' )
            // InternalInteractiontxt.g:3451:2: '='
            {
             before(grammarAccess.getAIElementAccess().getEqualsSignKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAIElementAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group_4__1__Impl"


    // $ANTLR start "rule__AIElement__Group_4__2"
    // InternalInteractiontxt.g:3460:1: rule__AIElement__Group_4__2 : rule__AIElement__Group_4__2__Impl rule__AIElement__Group_4__3 ;
    public final void rule__AIElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3464:1: ( rule__AIElement__Group_4__2__Impl rule__AIElement__Group_4__3 )
            // InternalInteractiontxt.g:3465:2: rule__AIElement__Group_4__2__Impl rule__AIElement__Group_4__3
            {
            pushFollow(FOLLOW_4);
            rule__AIElement__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIElement__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group_4__2"


    // $ANTLR start "rule__AIElement__Group_4__2__Impl"
    // InternalInteractiontxt.g:3472:1: rule__AIElement__Group_4__2__Impl : ( '\"' ) ;
    public final void rule__AIElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3476:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:3477:1: ( '\"' )
            {
            // InternalInteractiontxt.g:3477:1: ( '\"' )
            // InternalInteractiontxt.g:3478:2: '\"'
            {
             before(grammarAccess.getAIElementAccess().getQuotationMarkKeyword_4_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAIElementAccess().getQuotationMarkKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group_4__2__Impl"


    // $ANTLR start "rule__AIElement__Group_4__3"
    // InternalInteractiontxt.g:3487:1: rule__AIElement__Group_4__3 : rule__AIElement__Group_4__3__Impl rule__AIElement__Group_4__4 ;
    public final void rule__AIElement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3491:1: ( rule__AIElement__Group_4__3__Impl rule__AIElement__Group_4__4 )
            // InternalInteractiontxt.g:3492:2: rule__AIElement__Group_4__3__Impl rule__AIElement__Group_4__4
            {
            pushFollow(FOLLOW_20);
            rule__AIElement__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIElement__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group_4__3"


    // $ANTLR start "rule__AIElement__Group_4__3__Impl"
    // InternalInteractiontxt.g:3499:1: rule__AIElement__Group_4__3__Impl : ( ( rule__AIElement__ValueAssignment_4_3 ) ) ;
    public final void rule__AIElement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3503:1: ( ( ( rule__AIElement__ValueAssignment_4_3 ) ) )
            // InternalInteractiontxt.g:3504:1: ( ( rule__AIElement__ValueAssignment_4_3 ) )
            {
            // InternalInteractiontxt.g:3504:1: ( ( rule__AIElement__ValueAssignment_4_3 ) )
            // InternalInteractiontxt.g:3505:2: ( rule__AIElement__ValueAssignment_4_3 )
            {
             before(grammarAccess.getAIElementAccess().getValueAssignment_4_3()); 
            // InternalInteractiontxt.g:3506:2: ( rule__AIElement__ValueAssignment_4_3 )
            // InternalInteractiontxt.g:3506:3: rule__AIElement__ValueAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__AIElement__ValueAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getAIElementAccess().getValueAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group_4__3__Impl"


    // $ANTLR start "rule__AIElement__Group_4__4"
    // InternalInteractiontxt.g:3514:1: rule__AIElement__Group_4__4 : rule__AIElement__Group_4__4__Impl ;
    public final void rule__AIElement__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3518:1: ( rule__AIElement__Group_4__4__Impl )
            // InternalInteractiontxt.g:3519:2: rule__AIElement__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AIElement__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group_4__4"


    // $ANTLR start "rule__AIElement__Group_4__4__Impl"
    // InternalInteractiontxt.g:3525:1: rule__AIElement__Group_4__4__Impl : ( '\"' ) ;
    public final void rule__AIElement__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3529:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:3530:1: ( '\"' )
            {
            // InternalInteractiontxt.g:3530:1: ( '\"' )
            // InternalInteractiontxt.g:3531:2: '\"'
            {
             before(grammarAccess.getAIElementAccess().getQuotationMarkKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAIElementAccess().getQuotationMarkKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__Group_4__4__Impl"


    // $ANTLR start "rule__AOElement__Group__0"
    // InternalInteractiontxt.g:3541:1: rule__AOElement__Group__0 : rule__AOElement__Group__0__Impl rule__AOElement__Group__1 ;
    public final void rule__AOElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3545:1: ( rule__AOElement__Group__0__Impl rule__AOElement__Group__1 )
            // InternalInteractiontxt.g:3546:2: rule__AOElement__Group__0__Impl rule__AOElement__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AOElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AOElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__0"


    // $ANTLR start "rule__AOElement__Group__0__Impl"
    // InternalInteractiontxt.g:3553:1: rule__AOElement__Group__0__Impl : ( () ) ;
    public final void rule__AOElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3557:1: ( ( () ) )
            // InternalInteractiontxt.g:3558:1: ( () )
            {
            // InternalInteractiontxt.g:3558:1: ( () )
            // InternalInteractiontxt.g:3559:2: ()
            {
             before(grammarAccess.getAOElementAccess().getAOElementAction_0()); 
            // InternalInteractiontxt.g:3560:2: ()
            // InternalInteractiontxt.g:3560:3: 
            {
            }

             after(grammarAccess.getAOElementAccess().getAOElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__0__Impl"


    // $ANTLR start "rule__AOElement__Group__1"
    // InternalInteractiontxt.g:3568:1: rule__AOElement__Group__1 : rule__AOElement__Group__1__Impl rule__AOElement__Group__2 ;
    public final void rule__AOElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3572:1: ( rule__AOElement__Group__1__Impl rule__AOElement__Group__2 )
            // InternalInteractiontxt.g:3573:2: rule__AOElement__Group__1__Impl rule__AOElement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AOElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AOElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__1"


    // $ANTLR start "rule__AOElement__Group__1__Impl"
    // InternalInteractiontxt.g:3580:1: rule__AOElement__Group__1__Impl : ( 'Operation' ) ;
    public final void rule__AOElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3584:1: ( ( 'Operation' ) )
            // InternalInteractiontxt.g:3585:1: ( 'Operation' )
            {
            // InternalInteractiontxt.g:3585:1: ( 'Operation' )
            // InternalInteractiontxt.g:3586:2: 'Operation'
            {
             before(grammarAccess.getAOElementAccess().getOperationKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAOElementAccess().getOperationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__1__Impl"


    // $ANTLR start "rule__AOElement__Group__2"
    // InternalInteractiontxt.g:3595:1: rule__AOElement__Group__2 : rule__AOElement__Group__2__Impl rule__AOElement__Group__3 ;
    public final void rule__AOElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3599:1: ( rule__AOElement__Group__2__Impl rule__AOElement__Group__3 )
            // InternalInteractiontxt.g:3600:2: rule__AOElement__Group__2__Impl rule__AOElement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__AOElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AOElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__2"


    // $ANTLR start "rule__AOElement__Group__2__Impl"
    // InternalInteractiontxt.g:3607:1: rule__AOElement__Group__2__Impl : ( ( rule__AOElement__OperationAssignment_2 ) ) ;
    public final void rule__AOElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3611:1: ( ( ( rule__AOElement__OperationAssignment_2 ) ) )
            // InternalInteractiontxt.g:3612:1: ( ( rule__AOElement__OperationAssignment_2 ) )
            {
            // InternalInteractiontxt.g:3612:1: ( ( rule__AOElement__OperationAssignment_2 ) )
            // InternalInteractiontxt.g:3613:2: ( rule__AOElement__OperationAssignment_2 )
            {
             before(grammarAccess.getAOElementAccess().getOperationAssignment_2()); 
            // InternalInteractiontxt.g:3614:2: ( rule__AOElement__OperationAssignment_2 )
            // InternalInteractiontxt.g:3614:3: rule__AOElement__OperationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AOElement__OperationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAOElementAccess().getOperationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__2__Impl"


    // $ANTLR start "rule__AOElement__Group__3"
    // InternalInteractiontxt.g:3622:1: rule__AOElement__Group__3 : rule__AOElement__Group__3__Impl rule__AOElement__Group__4 ;
    public final void rule__AOElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3626:1: ( rule__AOElement__Group__3__Impl rule__AOElement__Group__4 )
            // InternalInteractiontxt.g:3627:2: rule__AOElement__Group__3__Impl rule__AOElement__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__AOElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AOElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__3"


    // $ANTLR start "rule__AOElement__Group__3__Impl"
    // InternalInteractiontxt.g:3634:1: rule__AOElement__Group__3__Impl : ( '{' ) ;
    public final void rule__AOElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3638:1: ( ( '{' ) )
            // InternalInteractiontxt.g:3639:1: ( '{' )
            {
            // InternalInteractiontxt.g:3639:1: ( '{' )
            // InternalInteractiontxt.g:3640:2: '{'
            {
             before(grammarAccess.getAOElementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAOElementAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__3__Impl"


    // $ANTLR start "rule__AOElement__Group__4"
    // InternalInteractiontxt.g:3649:1: rule__AOElement__Group__4 : rule__AOElement__Group__4__Impl rule__AOElement__Group__5 ;
    public final void rule__AOElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3653:1: ( rule__AOElement__Group__4__Impl rule__AOElement__Group__5 )
            // InternalInteractiontxt.g:3654:2: rule__AOElement__Group__4__Impl rule__AOElement__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__AOElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AOElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__4"


    // $ANTLR start "rule__AOElement__Group__4__Impl"
    // InternalInteractiontxt.g:3661:1: rule__AOElement__Group__4__Impl : ( ( rule__AOElement__Group_4__0 )? ) ;
    public final void rule__AOElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3665:1: ( ( ( rule__AOElement__Group_4__0 )? ) )
            // InternalInteractiontxt.g:3666:1: ( ( rule__AOElement__Group_4__0 )? )
            {
            // InternalInteractiontxt.g:3666:1: ( ( rule__AOElement__Group_4__0 )? )
            // InternalInteractiontxt.g:3667:2: ( rule__AOElement__Group_4__0 )?
            {
             before(grammarAccess.getAOElementAccess().getGroup_4()); 
            // InternalInteractiontxt.g:3668:2: ( rule__AOElement__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==23) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalInteractiontxt.g:3668:3: rule__AOElement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AOElement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAOElementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__4__Impl"


    // $ANTLR start "rule__AOElement__Group__5"
    // InternalInteractiontxt.g:3676:1: rule__AOElement__Group__5 : rule__AOElement__Group__5__Impl ;
    public final void rule__AOElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3680:1: ( rule__AOElement__Group__5__Impl )
            // InternalInteractiontxt.g:3681:2: rule__AOElement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AOElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__5"


    // $ANTLR start "rule__AOElement__Group__5__Impl"
    // InternalInteractiontxt.g:3687:1: rule__AOElement__Group__5__Impl : ( '}' ) ;
    public final void rule__AOElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3691:1: ( ( '}' ) )
            // InternalInteractiontxt.g:3692:1: ( '}' )
            {
            // InternalInteractiontxt.g:3692:1: ( '}' )
            // InternalInteractiontxt.g:3693:2: '}'
            {
             before(grammarAccess.getAOElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAOElementAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group__5__Impl"


    // $ANTLR start "rule__AOElement__Group_4__0"
    // InternalInteractiontxt.g:3703:1: rule__AOElement__Group_4__0 : rule__AOElement__Group_4__0__Impl rule__AOElement__Group_4__1 ;
    public final void rule__AOElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3707:1: ( rule__AOElement__Group_4__0__Impl rule__AOElement__Group_4__1 )
            // InternalInteractiontxt.g:3708:2: rule__AOElement__Group_4__0__Impl rule__AOElement__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__AOElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AOElement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4__0"


    // $ANTLR start "rule__AOElement__Group_4__0__Impl"
    // InternalInteractiontxt.g:3715:1: rule__AOElement__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__AOElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3719:1: ( ( 'value' ) )
            // InternalInteractiontxt.g:3720:1: ( 'value' )
            {
            // InternalInteractiontxt.g:3720:1: ( 'value' )
            // InternalInteractiontxt.g:3721:2: 'value'
            {
             before(grammarAccess.getAOElementAccess().getValueKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAOElementAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4__0__Impl"


    // $ANTLR start "rule__AOElement__Group_4__1"
    // InternalInteractiontxt.g:3730:1: rule__AOElement__Group_4__1 : rule__AOElement__Group_4__1__Impl rule__AOElement__Group_4__2 ;
    public final void rule__AOElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3734:1: ( rule__AOElement__Group_4__1__Impl rule__AOElement__Group_4__2 )
            // InternalInteractiontxt.g:3735:2: rule__AOElement__Group_4__1__Impl rule__AOElement__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__AOElement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AOElement__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4__1"


    // $ANTLR start "rule__AOElement__Group_4__1__Impl"
    // InternalInteractiontxt.g:3742:1: rule__AOElement__Group_4__1__Impl : ( '=' ) ;
    public final void rule__AOElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3746:1: ( ( '=' ) )
            // InternalInteractiontxt.g:3747:1: ( '=' )
            {
            // InternalInteractiontxt.g:3747:1: ( '=' )
            // InternalInteractiontxt.g:3748:2: '='
            {
             before(grammarAccess.getAOElementAccess().getEqualsSignKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAOElementAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4__1__Impl"


    // $ANTLR start "rule__AOElement__Group_4__2"
    // InternalInteractiontxt.g:3757:1: rule__AOElement__Group_4__2 : rule__AOElement__Group_4__2__Impl ;
    public final void rule__AOElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3761:1: ( rule__AOElement__Group_4__2__Impl )
            // InternalInteractiontxt.g:3762:2: rule__AOElement__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AOElement__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4__2"


    // $ANTLR start "rule__AOElement__Group_4__2__Impl"
    // InternalInteractiontxt.g:3768:1: rule__AOElement__Group_4__2__Impl : ( ( rule__AOElement__Alternatives_4_2 )? ) ;
    public final void rule__AOElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3772:1: ( ( ( rule__AOElement__Alternatives_4_2 )? ) )
            // InternalInteractiontxt.g:3773:1: ( ( rule__AOElement__Alternatives_4_2 )? )
            {
            // InternalInteractiontxt.g:3773:1: ( ( rule__AOElement__Alternatives_4_2 )? )
            // InternalInteractiontxt.g:3774:2: ( rule__AOElement__Alternatives_4_2 )?
            {
             before(grammarAccess.getAOElementAccess().getAlternatives_4_2()); 
            // InternalInteractiontxt.g:3775:2: ( rule__AOElement__Alternatives_4_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||LA45_0==10||LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalInteractiontxt.g:3775:3: rule__AOElement__Alternatives_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AOElement__Alternatives_4_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAOElementAccess().getAlternatives_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4__2__Impl"


    // $ANTLR start "rule__AOElement__Group_4_2_1__0"
    // InternalInteractiontxt.g:3784:1: rule__AOElement__Group_4_2_1__0 : rule__AOElement__Group_4_2_1__0__Impl rule__AOElement__Group_4_2_1__1 ;
    public final void rule__AOElement__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3788:1: ( rule__AOElement__Group_4_2_1__0__Impl rule__AOElement__Group_4_2_1__1 )
            // InternalInteractiontxt.g:3789:2: rule__AOElement__Group_4_2_1__0__Impl rule__AOElement__Group_4_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__AOElement__Group_4_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AOElement__Group_4_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4_2_1__0"


    // $ANTLR start "rule__AOElement__Group_4_2_1__0__Impl"
    // InternalInteractiontxt.g:3796:1: rule__AOElement__Group_4_2_1__0__Impl : ( '\"' ) ;
    public final void rule__AOElement__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3800:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:3801:1: ( '\"' )
            {
            // InternalInteractiontxt.g:3801:1: ( '\"' )
            // InternalInteractiontxt.g:3802:2: '\"'
            {
             before(grammarAccess.getAOElementAccess().getQuotationMarkKeyword_4_2_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAOElementAccess().getQuotationMarkKeyword_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4_2_1__0__Impl"


    // $ANTLR start "rule__AOElement__Group_4_2_1__1"
    // InternalInteractiontxt.g:3811:1: rule__AOElement__Group_4_2_1__1 : rule__AOElement__Group_4_2_1__1__Impl rule__AOElement__Group_4_2_1__2 ;
    public final void rule__AOElement__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3815:1: ( rule__AOElement__Group_4_2_1__1__Impl rule__AOElement__Group_4_2_1__2 )
            // InternalInteractiontxt.g:3816:2: rule__AOElement__Group_4_2_1__1__Impl rule__AOElement__Group_4_2_1__2
            {
            pushFollow(FOLLOW_20);
            rule__AOElement__Group_4_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AOElement__Group_4_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4_2_1__1"


    // $ANTLR start "rule__AOElement__Group_4_2_1__1__Impl"
    // InternalInteractiontxt.g:3823:1: rule__AOElement__Group_4_2_1__1__Impl : ( ( rule__AOElement__ValueAssignment_4_2_1_1 ) ) ;
    public final void rule__AOElement__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3827:1: ( ( ( rule__AOElement__ValueAssignment_4_2_1_1 ) ) )
            // InternalInteractiontxt.g:3828:1: ( ( rule__AOElement__ValueAssignment_4_2_1_1 ) )
            {
            // InternalInteractiontxt.g:3828:1: ( ( rule__AOElement__ValueAssignment_4_2_1_1 ) )
            // InternalInteractiontxt.g:3829:2: ( rule__AOElement__ValueAssignment_4_2_1_1 )
            {
             before(grammarAccess.getAOElementAccess().getValueAssignment_4_2_1_1()); 
            // InternalInteractiontxt.g:3830:2: ( rule__AOElement__ValueAssignment_4_2_1_1 )
            // InternalInteractiontxt.g:3830:3: rule__AOElement__ValueAssignment_4_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AOElement__ValueAssignment_4_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAOElementAccess().getValueAssignment_4_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4_2_1__1__Impl"


    // $ANTLR start "rule__AOElement__Group_4_2_1__2"
    // InternalInteractiontxt.g:3838:1: rule__AOElement__Group_4_2_1__2 : rule__AOElement__Group_4_2_1__2__Impl ;
    public final void rule__AOElement__Group_4_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3842:1: ( rule__AOElement__Group_4_2_1__2__Impl )
            // InternalInteractiontxt.g:3843:2: rule__AOElement__Group_4_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AOElement__Group_4_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4_2_1__2"


    // $ANTLR start "rule__AOElement__Group_4_2_1__2__Impl"
    // InternalInteractiontxt.g:3849:1: rule__AOElement__Group_4_2_1__2__Impl : ( '\"' ) ;
    public final void rule__AOElement__Group_4_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3853:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:3854:1: ( '\"' )
            {
            // InternalInteractiontxt.g:3854:1: ( '\"' )
            // InternalInteractiontxt.g:3855:2: '\"'
            {
             before(grammarAccess.getAOElementAccess().getQuotationMarkKeyword_4_2_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAOElementAccess().getQuotationMarkKeyword_4_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__Group_4_2_1__2__Impl"


    // $ANTLR start "rule__ALElement__Group__0"
    // InternalInteractiontxt.g:3865:1: rule__ALElement__Group__0 : rule__ALElement__Group__0__Impl rule__ALElement__Group__1 ;
    public final void rule__ALElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3869:1: ( rule__ALElement__Group__0__Impl rule__ALElement__Group__1 )
            // InternalInteractiontxt.g:3870:2: rule__ALElement__Group__0__Impl rule__ALElement__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__ALElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__0"


    // $ANTLR start "rule__ALElement__Group__0__Impl"
    // InternalInteractiontxt.g:3877:1: rule__ALElement__Group__0__Impl : ( () ) ;
    public final void rule__ALElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3881:1: ( ( () ) )
            // InternalInteractiontxt.g:3882:1: ( () )
            {
            // InternalInteractiontxt.g:3882:1: ( () )
            // InternalInteractiontxt.g:3883:2: ()
            {
             before(grammarAccess.getALElementAccess().getALElementAction_0()); 
            // InternalInteractiontxt.g:3884:2: ()
            // InternalInteractiontxt.g:3884:3: 
            {
            }

             after(grammarAccess.getALElementAccess().getALElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__0__Impl"


    // $ANTLR start "rule__ALElement__Group__1"
    // InternalInteractiontxt.g:3892:1: rule__ALElement__Group__1 : rule__ALElement__Group__1__Impl rule__ALElement__Group__2 ;
    public final void rule__ALElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3896:1: ( rule__ALElement__Group__1__Impl rule__ALElement__Group__2 )
            // InternalInteractiontxt.g:3897:2: rule__ALElement__Group__1__Impl rule__ALElement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ALElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__1"


    // $ANTLR start "rule__ALElement__Group__1__Impl"
    // InternalInteractiontxt.g:3904:1: rule__ALElement__Group__1__Impl : ( 'Lang' ) ;
    public final void rule__ALElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3908:1: ( ( 'Lang' ) )
            // InternalInteractiontxt.g:3909:1: ( 'Lang' )
            {
            // InternalInteractiontxt.g:3909:1: ( 'Lang' )
            // InternalInteractiontxt.g:3910:2: 'Lang'
            {
             before(grammarAccess.getALElementAccess().getLangKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getLangKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__1__Impl"


    // $ANTLR start "rule__ALElement__Group__2"
    // InternalInteractiontxt.g:3919:1: rule__ALElement__Group__2 : rule__ALElement__Group__2__Impl rule__ALElement__Group__3 ;
    public final void rule__ALElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3923:1: ( rule__ALElement__Group__2__Impl rule__ALElement__Group__3 )
            // InternalInteractiontxt.g:3924:2: rule__ALElement__Group__2__Impl rule__ALElement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ALElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__2"


    // $ANTLR start "rule__ALElement__Group__2__Impl"
    // InternalInteractiontxt.g:3931:1: rule__ALElement__Group__2__Impl : ( ( rule__ALElement__IdAssignment_2 ) ) ;
    public final void rule__ALElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3935:1: ( ( ( rule__ALElement__IdAssignment_2 ) ) )
            // InternalInteractiontxt.g:3936:1: ( ( rule__ALElement__IdAssignment_2 ) )
            {
            // InternalInteractiontxt.g:3936:1: ( ( rule__ALElement__IdAssignment_2 ) )
            // InternalInteractiontxt.g:3937:2: ( rule__ALElement__IdAssignment_2 )
            {
             before(grammarAccess.getALElementAccess().getIdAssignment_2()); 
            // InternalInteractiontxt.g:3938:2: ( rule__ALElement__IdAssignment_2 )
            // InternalInteractiontxt.g:3938:3: rule__ALElement__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__2__Impl"


    // $ANTLR start "rule__ALElement__Group__3"
    // InternalInteractiontxt.g:3946:1: rule__ALElement__Group__3 : rule__ALElement__Group__3__Impl rule__ALElement__Group__4 ;
    public final void rule__ALElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3950:1: ( rule__ALElement__Group__3__Impl rule__ALElement__Group__4 )
            // InternalInteractiontxt.g:3951:2: rule__ALElement__Group__3__Impl rule__ALElement__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__ALElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__3"


    // $ANTLR start "rule__ALElement__Group__3__Impl"
    // InternalInteractiontxt.g:3958:1: rule__ALElement__Group__3__Impl : ( '{' ) ;
    public final void rule__ALElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3962:1: ( ( '{' ) )
            // InternalInteractiontxt.g:3963:1: ( '{' )
            {
            // InternalInteractiontxt.g:3963:1: ( '{' )
            // InternalInteractiontxt.g:3964:2: '{'
            {
             before(grammarAccess.getALElementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__3__Impl"


    // $ANTLR start "rule__ALElement__Group__4"
    // InternalInteractiontxt.g:3973:1: rule__ALElement__Group__4 : rule__ALElement__Group__4__Impl rule__ALElement__Group__5 ;
    public final void rule__ALElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3977:1: ( rule__ALElement__Group__4__Impl rule__ALElement__Group__5 )
            // InternalInteractiontxt.g:3978:2: rule__ALElement__Group__4__Impl rule__ALElement__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__ALElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__4"


    // $ANTLR start "rule__ALElement__Group__4__Impl"
    // InternalInteractiontxt.g:3985:1: rule__ALElement__Group__4__Impl : ( ( rule__ALElement__Alternatives_4 )? ) ;
    public final void rule__ALElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:3989:1: ( ( ( rule__ALElement__Alternatives_4 )? ) )
            // InternalInteractiontxt.g:3990:1: ( ( rule__ALElement__Alternatives_4 )? )
            {
            // InternalInteractiontxt.g:3990:1: ( ( rule__ALElement__Alternatives_4 )? )
            // InternalInteractiontxt.g:3991:2: ( rule__ALElement__Alternatives_4 )?
            {
             before(grammarAccess.getALElementAccess().getAlternatives_4()); 
            // InternalInteractiontxt.g:3992:2: ( rule__ALElement__Alternatives_4 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==23||LA46_0==32) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalInteractiontxt.g:3992:3: rule__ALElement__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALElement__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getALElementAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__4__Impl"


    // $ANTLR start "rule__ALElement__Group__5"
    // InternalInteractiontxt.g:4000:1: rule__ALElement__Group__5 : rule__ALElement__Group__5__Impl ;
    public final void rule__ALElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4004:1: ( rule__ALElement__Group__5__Impl )
            // InternalInteractiontxt.g:4005:2: rule__ALElement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__5"


    // $ANTLR start "rule__ALElement__Group__5__Impl"
    // InternalInteractiontxt.g:4011:1: rule__ALElement__Group__5__Impl : ( '}' ) ;
    public final void rule__ALElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4015:1: ( ( '}' ) )
            // InternalInteractiontxt.g:4016:1: ( '}' )
            {
            // InternalInteractiontxt.g:4016:1: ( '}' )
            // InternalInteractiontxt.g:4017:2: '}'
            {
             before(grammarAccess.getALElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group__5__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0__0"
    // InternalInteractiontxt.g:4027:1: rule__ALElement__Group_4_0__0 : rule__ALElement__Group_4_0__0__Impl rule__ALElement__Group_4_0__1 ;
    public final void rule__ALElement__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4031:1: ( rule__ALElement__Group_4_0__0__Impl rule__ALElement__Group_4_0__1 )
            // InternalInteractiontxt.g:4032:2: rule__ALElement__Group_4_0__0__Impl rule__ALElement__Group_4_0__1
            {
            pushFollow(FOLLOW_18);
            rule__ALElement__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0__0"


    // $ANTLR start "rule__ALElement__Group_4_0__0__Impl"
    // InternalInteractiontxt.g:4039:1: rule__ALElement__Group_4_0__0__Impl : ( 'op' ) ;
    public final void rule__ALElement__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4043:1: ( ( 'op' ) )
            // InternalInteractiontxt.g:4044:1: ( 'op' )
            {
            // InternalInteractiontxt.g:4044:1: ( 'op' )
            // InternalInteractiontxt.g:4045:2: 'op'
            {
             before(grammarAccess.getALElementAccess().getOpKeyword_4_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getOpKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0__0__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0__1"
    // InternalInteractiontxt.g:4054:1: rule__ALElement__Group_4_0__1 : rule__ALElement__Group_4_0__1__Impl rule__ALElement__Group_4_0__2 ;
    public final void rule__ALElement__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4058:1: ( rule__ALElement__Group_4_0__1__Impl rule__ALElement__Group_4_0__2 )
            // InternalInteractiontxt.g:4059:2: rule__ALElement__Group_4_0__1__Impl rule__ALElement__Group_4_0__2
            {
            pushFollow(FOLLOW_31);
            rule__ALElement__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0__1"


    // $ANTLR start "rule__ALElement__Group_4_0__1__Impl"
    // InternalInteractiontxt.g:4066:1: rule__ALElement__Group_4_0__1__Impl : ( '=' ) ;
    public final void rule__ALElement__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4070:1: ( ( '=' ) )
            // InternalInteractiontxt.g:4071:1: ( '=' )
            {
            // InternalInteractiontxt.g:4071:1: ( '=' )
            // InternalInteractiontxt.g:4072:2: '='
            {
             before(grammarAccess.getALElementAccess().getEqualsSignKeyword_4_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getEqualsSignKeyword_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0__1__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0__2"
    // InternalInteractiontxt.g:4081:1: rule__ALElement__Group_4_0__2 : rule__ALElement__Group_4_0__2__Impl rule__ALElement__Group_4_0__3 ;
    public final void rule__ALElement__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4085:1: ( rule__ALElement__Group_4_0__2__Impl rule__ALElement__Group_4_0__3 )
            // InternalInteractiontxt.g:4086:2: rule__ALElement__Group_4_0__2__Impl rule__ALElement__Group_4_0__3
            {
            pushFollow(FOLLOW_25);
            rule__ALElement__Group_4_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0__2"


    // $ANTLR start "rule__ALElement__Group_4_0__2__Impl"
    // InternalInteractiontxt.g:4093:1: rule__ALElement__Group_4_0__2__Impl : ( ( rule__ALElement__OperationAssignment_4_0_2 ) ) ;
    public final void rule__ALElement__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4097:1: ( ( ( rule__ALElement__OperationAssignment_4_0_2 ) ) )
            // InternalInteractiontxt.g:4098:1: ( ( rule__ALElement__OperationAssignment_4_0_2 ) )
            {
            // InternalInteractiontxt.g:4098:1: ( ( rule__ALElement__OperationAssignment_4_0_2 ) )
            // InternalInteractiontxt.g:4099:2: ( rule__ALElement__OperationAssignment_4_0_2 )
            {
             before(grammarAccess.getALElementAccess().getOperationAssignment_4_0_2()); 
            // InternalInteractiontxt.g:4100:2: ( rule__ALElement__OperationAssignment_4_0_2 )
            // InternalInteractiontxt.g:4100:3: rule__ALElement__OperationAssignment_4_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__OperationAssignment_4_0_2();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getOperationAssignment_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0__2__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0__3"
    // InternalInteractiontxt.g:4108:1: rule__ALElement__Group_4_0__3 : rule__ALElement__Group_4_0__3__Impl ;
    public final void rule__ALElement__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4112:1: ( rule__ALElement__Group_4_0__3__Impl )
            // InternalInteractiontxt.g:4113:2: rule__ALElement__Group_4_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0__3"


    // $ANTLR start "rule__ALElement__Group_4_0__3__Impl"
    // InternalInteractiontxt.g:4119:1: rule__ALElement__Group_4_0__3__Impl : ( ( rule__ALElement__Group_4_0_3__0 )? ) ;
    public final void rule__ALElement__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4123:1: ( ( ( rule__ALElement__Group_4_0_3__0 )? ) )
            // InternalInteractiontxt.g:4124:1: ( ( rule__ALElement__Group_4_0_3__0 )? )
            {
            // InternalInteractiontxt.g:4124:1: ( ( rule__ALElement__Group_4_0_3__0 )? )
            // InternalInteractiontxt.g:4125:2: ( rule__ALElement__Group_4_0_3__0 )?
            {
             before(grammarAccess.getALElementAccess().getGroup_4_0_3()); 
            // InternalInteractiontxt.g:4126:2: ( rule__ALElement__Group_4_0_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==29) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalInteractiontxt.g:4126:3: rule__ALElement__Group_4_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ALElement__Group_4_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getALElementAccess().getGroup_4_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0__3__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0_3__0"
    // InternalInteractiontxt.g:4135:1: rule__ALElement__Group_4_0_3__0 : rule__ALElement__Group_4_0_3__0__Impl rule__ALElement__Group_4_0_3__1 ;
    public final void rule__ALElement__Group_4_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4139:1: ( rule__ALElement__Group_4_0_3__0__Impl rule__ALElement__Group_4_0_3__1 )
            // InternalInteractiontxt.g:4140:2: rule__ALElement__Group_4_0_3__0__Impl rule__ALElement__Group_4_0_3__1
            {
            pushFollow(FOLLOW_32);
            rule__ALElement__Group_4_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3__0"


    // $ANTLR start "rule__ALElement__Group_4_0_3__0__Impl"
    // InternalInteractiontxt.g:4147:1: rule__ALElement__Group_4_0_3__0__Impl : ( ',' ) ;
    public final void rule__ALElement__Group_4_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4151:1: ( ( ',' ) )
            // InternalInteractiontxt.g:4152:1: ( ',' )
            {
            // InternalInteractiontxt.g:4152:1: ( ',' )
            // InternalInteractiontxt.g:4153:2: ','
            {
             before(grammarAccess.getALElementAccess().getCommaKeyword_4_0_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getCommaKeyword_4_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3__0__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0_3__1"
    // InternalInteractiontxt.g:4162:1: rule__ALElement__Group_4_0_3__1 : rule__ALElement__Group_4_0_3__1__Impl rule__ALElement__Group_4_0_3__2 ;
    public final void rule__ALElement__Group_4_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4166:1: ( rule__ALElement__Group_4_0_3__1__Impl rule__ALElement__Group_4_0_3__2 )
            // InternalInteractiontxt.g:4167:2: rule__ALElement__Group_4_0_3__1__Impl rule__ALElement__Group_4_0_3__2
            {
            pushFollow(FOLLOW_18);
            rule__ALElement__Group_4_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3__1"


    // $ANTLR start "rule__ALElement__Group_4_0_3__1__Impl"
    // InternalInteractiontxt.g:4174:1: rule__ALElement__Group_4_0_3__1__Impl : ( 'value' ) ;
    public final void rule__ALElement__Group_4_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4178:1: ( ( 'value' ) )
            // InternalInteractiontxt.g:4179:1: ( 'value' )
            {
            // InternalInteractiontxt.g:4179:1: ( 'value' )
            // InternalInteractiontxt.g:4180:2: 'value'
            {
             before(grammarAccess.getALElementAccess().getValueKeyword_4_0_3_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getValueKeyword_4_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3__1__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0_3__2"
    // InternalInteractiontxt.g:4189:1: rule__ALElement__Group_4_0_3__2 : rule__ALElement__Group_4_0_3__2__Impl rule__ALElement__Group_4_0_3__3 ;
    public final void rule__ALElement__Group_4_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4193:1: ( rule__ALElement__Group_4_0_3__2__Impl rule__ALElement__Group_4_0_3__3 )
            // InternalInteractiontxt.g:4194:2: rule__ALElement__Group_4_0_3__2__Impl rule__ALElement__Group_4_0_3__3
            {
            pushFollow(FOLLOW_33);
            rule__ALElement__Group_4_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3__2"


    // $ANTLR start "rule__ALElement__Group_4_0_3__2__Impl"
    // InternalInteractiontxt.g:4201:1: rule__ALElement__Group_4_0_3__2__Impl : ( '=' ) ;
    public final void rule__ALElement__Group_4_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4205:1: ( ( '=' ) )
            // InternalInteractiontxt.g:4206:1: ( '=' )
            {
            // InternalInteractiontxt.g:4206:1: ( '=' )
            // InternalInteractiontxt.g:4207:2: '='
            {
             before(grammarAccess.getALElementAccess().getEqualsSignKeyword_4_0_3_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getEqualsSignKeyword_4_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3__2__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0_3__3"
    // InternalInteractiontxt.g:4216:1: rule__ALElement__Group_4_0_3__3 : rule__ALElement__Group_4_0_3__3__Impl ;
    public final void rule__ALElement__Group_4_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4220:1: ( rule__ALElement__Group_4_0_3__3__Impl )
            // InternalInteractiontxt.g:4221:2: rule__ALElement__Group_4_0_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3__3"


    // $ANTLR start "rule__ALElement__Group_4_0_3__3__Impl"
    // InternalInteractiontxt.g:4227:1: rule__ALElement__Group_4_0_3__3__Impl : ( ( rule__ALElement__Alternatives_4_0_3_3 ) ) ;
    public final void rule__ALElement__Group_4_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4231:1: ( ( ( rule__ALElement__Alternatives_4_0_3_3 ) ) )
            // InternalInteractiontxt.g:4232:1: ( ( rule__ALElement__Alternatives_4_0_3_3 ) )
            {
            // InternalInteractiontxt.g:4232:1: ( ( rule__ALElement__Alternatives_4_0_3_3 ) )
            // InternalInteractiontxt.g:4233:2: ( rule__ALElement__Alternatives_4_0_3_3 )
            {
             before(grammarAccess.getALElementAccess().getAlternatives_4_0_3_3()); 
            // InternalInteractiontxt.g:4234:2: ( rule__ALElement__Alternatives_4_0_3_3 )
            // InternalInteractiontxt.g:4234:3: rule__ALElement__Alternatives_4_0_3_3
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__Alternatives_4_0_3_3();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getAlternatives_4_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3__3__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0__0"
    // InternalInteractiontxt.g:4243:1: rule__ALElement__Group_4_0_3_3_0__0 : rule__ALElement__Group_4_0_3_3_0__0__Impl rule__ALElement__Group_4_0_3_3_0__1 ;
    public final void rule__ALElement__Group_4_0_3_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4247:1: ( rule__ALElement__Group_4_0_3_3_0__0__Impl rule__ALElement__Group_4_0_3_3_0__1 )
            // InternalInteractiontxt.g:4248:2: rule__ALElement__Group_4_0_3_3_0__0__Impl rule__ALElement__Group_4_0_3_3_0__1
            {
            pushFollow(FOLLOW_34);
            rule__ALElement__Group_4_0_3_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0__0"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0__0__Impl"
    // InternalInteractiontxt.g:4255:1: rule__ALElement__Group_4_0_3_3_0__0__Impl : ( '[' ) ;
    public final void rule__ALElement__Group_4_0_3_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4259:1: ( ( '[' ) )
            // InternalInteractiontxt.g:4260:1: ( '[' )
            {
            // InternalInteractiontxt.g:4260:1: ( '[' )
            // InternalInteractiontxt.g:4261:2: '['
            {
             before(grammarAccess.getALElementAccess().getLeftSquareBracketKeyword_4_0_3_3_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getLeftSquareBracketKeyword_4_0_3_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0__0__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0__1"
    // InternalInteractiontxt.g:4270:1: rule__ALElement__Group_4_0_3_3_0__1 : rule__ALElement__Group_4_0_3_3_0__1__Impl rule__ALElement__Group_4_0_3_3_0__2 ;
    public final void rule__ALElement__Group_4_0_3_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4274:1: ( rule__ALElement__Group_4_0_3_3_0__1__Impl rule__ALElement__Group_4_0_3_3_0__2 )
            // InternalInteractiontxt.g:4275:2: rule__ALElement__Group_4_0_3_3_0__1__Impl rule__ALElement__Group_4_0_3_3_0__2
            {
            pushFollow(FOLLOW_25);
            rule__ALElement__Group_4_0_3_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0__1"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0__1__Impl"
    // InternalInteractiontxt.g:4282:1: rule__ALElement__Group_4_0_3_3_0__1__Impl : ( ( rule__ALElement__ValueAssignment_4_0_3_3_0_1 ) ) ;
    public final void rule__ALElement__Group_4_0_3_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4286:1: ( ( ( rule__ALElement__ValueAssignment_4_0_3_3_0_1 ) ) )
            // InternalInteractiontxt.g:4287:1: ( ( rule__ALElement__ValueAssignment_4_0_3_3_0_1 ) )
            {
            // InternalInteractiontxt.g:4287:1: ( ( rule__ALElement__ValueAssignment_4_0_3_3_0_1 ) )
            // InternalInteractiontxt.g:4288:2: ( rule__ALElement__ValueAssignment_4_0_3_3_0_1 )
            {
             before(grammarAccess.getALElementAccess().getValueAssignment_4_0_3_3_0_1()); 
            // InternalInteractiontxt.g:4289:2: ( rule__ALElement__ValueAssignment_4_0_3_3_0_1 )
            // InternalInteractiontxt.g:4289:3: rule__ALElement__ValueAssignment_4_0_3_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__ValueAssignment_4_0_3_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getValueAssignment_4_0_3_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0__1__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0__2"
    // InternalInteractiontxt.g:4297:1: rule__ALElement__Group_4_0_3_3_0__2 : rule__ALElement__Group_4_0_3_3_0__2__Impl rule__ALElement__Group_4_0_3_3_0__3 ;
    public final void rule__ALElement__Group_4_0_3_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4301:1: ( rule__ALElement__Group_4_0_3_3_0__2__Impl rule__ALElement__Group_4_0_3_3_0__3 )
            // InternalInteractiontxt.g:4302:2: rule__ALElement__Group_4_0_3_3_0__2__Impl rule__ALElement__Group_4_0_3_3_0__3
            {
            pushFollow(FOLLOW_35);
            rule__ALElement__Group_4_0_3_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0__2"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0__2__Impl"
    // InternalInteractiontxt.g:4309:1: rule__ALElement__Group_4_0_3_3_0__2__Impl : ( ( rule__ALElement__Group_4_0_3_3_0_2__0 ) ) ;
    public final void rule__ALElement__Group_4_0_3_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4313:1: ( ( ( rule__ALElement__Group_4_0_3_3_0_2__0 ) ) )
            // InternalInteractiontxt.g:4314:1: ( ( rule__ALElement__Group_4_0_3_3_0_2__0 ) )
            {
            // InternalInteractiontxt.g:4314:1: ( ( rule__ALElement__Group_4_0_3_3_0_2__0 ) )
            // InternalInteractiontxt.g:4315:2: ( rule__ALElement__Group_4_0_3_3_0_2__0 )
            {
             before(grammarAccess.getALElementAccess().getGroup_4_0_3_3_0_2()); 
            // InternalInteractiontxt.g:4316:2: ( rule__ALElement__Group_4_0_3_3_0_2__0 )
            // InternalInteractiontxt.g:4316:3: rule__ALElement__Group_4_0_3_3_0_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3_3_0_2__0();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getGroup_4_0_3_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0__2__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0__3"
    // InternalInteractiontxt.g:4324:1: rule__ALElement__Group_4_0_3_3_0__3 : rule__ALElement__Group_4_0_3_3_0__3__Impl ;
    public final void rule__ALElement__Group_4_0_3_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4328:1: ( rule__ALElement__Group_4_0_3_3_0__3__Impl )
            // InternalInteractiontxt.g:4329:2: rule__ALElement__Group_4_0_3_3_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3_3_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0__3"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0__3__Impl"
    // InternalInteractiontxt.g:4335:1: rule__ALElement__Group_4_0_3_3_0__3__Impl : ( ']' ) ;
    public final void rule__ALElement__Group_4_0_3_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4339:1: ( ( ']' ) )
            // InternalInteractiontxt.g:4340:1: ( ']' )
            {
            // InternalInteractiontxt.g:4340:1: ( ']' )
            // InternalInteractiontxt.g:4341:2: ']'
            {
             before(grammarAccess.getALElementAccess().getRightSquareBracketKeyword_4_0_3_3_0_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getRightSquareBracketKeyword_4_0_3_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0__3__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0_2__0"
    // InternalInteractiontxt.g:4351:1: rule__ALElement__Group_4_0_3_3_0_2__0 : rule__ALElement__Group_4_0_3_3_0_2__0__Impl rule__ALElement__Group_4_0_3_3_0_2__1 ;
    public final void rule__ALElement__Group_4_0_3_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4355:1: ( rule__ALElement__Group_4_0_3_3_0_2__0__Impl rule__ALElement__Group_4_0_3_3_0_2__1 )
            // InternalInteractiontxt.g:4356:2: rule__ALElement__Group_4_0_3_3_0_2__0__Impl rule__ALElement__Group_4_0_3_3_0_2__1
            {
            pushFollow(FOLLOW_34);
            rule__ALElement__Group_4_0_3_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3_3_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0_2__0"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0_2__0__Impl"
    // InternalInteractiontxt.g:4363:1: rule__ALElement__Group_4_0_3_3_0_2__0__Impl : ( ',' ) ;
    public final void rule__ALElement__Group_4_0_3_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4367:1: ( ( ',' ) )
            // InternalInteractiontxt.g:4368:1: ( ',' )
            {
            // InternalInteractiontxt.g:4368:1: ( ',' )
            // InternalInteractiontxt.g:4369:2: ','
            {
             before(grammarAccess.getALElementAccess().getCommaKeyword_4_0_3_3_0_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getCommaKeyword_4_0_3_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0_2__0__Impl"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0_2__1"
    // InternalInteractiontxt.g:4378:1: rule__ALElement__Group_4_0_3_3_0_2__1 : rule__ALElement__Group_4_0_3_3_0_2__1__Impl ;
    public final void rule__ALElement__Group_4_0_3_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4382:1: ( rule__ALElement__Group_4_0_3_3_0_2__1__Impl )
            // InternalInteractiontxt.g:4383:2: rule__ALElement__Group_4_0_3_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_0_3_3_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0_2__1"


    // $ANTLR start "rule__ALElement__Group_4_0_3_3_0_2__1__Impl"
    // InternalInteractiontxt.g:4389:1: rule__ALElement__Group_4_0_3_3_0_2__1__Impl : ( ( rule__ALElement__ValueAssignment_4_0_3_3_0_2_1 ) ) ;
    public final void rule__ALElement__Group_4_0_3_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4393:1: ( ( ( rule__ALElement__ValueAssignment_4_0_3_3_0_2_1 ) ) )
            // InternalInteractiontxt.g:4394:1: ( ( rule__ALElement__ValueAssignment_4_0_3_3_0_2_1 ) )
            {
            // InternalInteractiontxt.g:4394:1: ( ( rule__ALElement__ValueAssignment_4_0_3_3_0_2_1 ) )
            // InternalInteractiontxt.g:4395:2: ( rule__ALElement__ValueAssignment_4_0_3_3_0_2_1 )
            {
             before(grammarAccess.getALElementAccess().getValueAssignment_4_0_3_3_0_2_1()); 
            // InternalInteractiontxt.g:4396:2: ( rule__ALElement__ValueAssignment_4_0_3_3_0_2_1 )
            // InternalInteractiontxt.g:4396:3: rule__ALElement__ValueAssignment_4_0_3_3_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__ValueAssignment_4_0_3_3_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getValueAssignment_4_0_3_3_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_0_3_3_0_2__1__Impl"


    // $ANTLR start "rule__ALElement__Group_4_1__0"
    // InternalInteractiontxt.g:4405:1: rule__ALElement__Group_4_1__0 : rule__ALElement__Group_4_1__0__Impl rule__ALElement__Group_4_1__1 ;
    public final void rule__ALElement__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4409:1: ( rule__ALElement__Group_4_1__0__Impl rule__ALElement__Group_4_1__1 )
            // InternalInteractiontxt.g:4410:2: rule__ALElement__Group_4_1__0__Impl rule__ALElement__Group_4_1__1
            {
            pushFollow(FOLLOW_18);
            rule__ALElement__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_1__0"


    // $ANTLR start "rule__ALElement__Group_4_1__0__Impl"
    // InternalInteractiontxt.g:4417:1: rule__ALElement__Group_4_1__0__Impl : ( 'value' ) ;
    public final void rule__ALElement__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4421:1: ( ( 'value' ) )
            // InternalInteractiontxt.g:4422:1: ( 'value' )
            {
            // InternalInteractiontxt.g:4422:1: ( 'value' )
            // InternalInteractiontxt.g:4423:2: 'value'
            {
             before(grammarAccess.getALElementAccess().getValueKeyword_4_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getValueKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_1__0__Impl"


    // $ANTLR start "rule__ALElement__Group_4_1__1"
    // InternalInteractiontxt.g:4432:1: rule__ALElement__Group_4_1__1 : rule__ALElement__Group_4_1__1__Impl rule__ALElement__Group_4_1__2 ;
    public final void rule__ALElement__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4436:1: ( rule__ALElement__Group_4_1__1__Impl rule__ALElement__Group_4_1__2 )
            // InternalInteractiontxt.g:4437:2: rule__ALElement__Group_4_1__1__Impl rule__ALElement__Group_4_1__2
            {
            pushFollow(FOLLOW_20);
            rule__ALElement__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_1__1"


    // $ANTLR start "rule__ALElement__Group_4_1__1__Impl"
    // InternalInteractiontxt.g:4444:1: rule__ALElement__Group_4_1__1__Impl : ( '=' ) ;
    public final void rule__ALElement__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4448:1: ( ( '=' ) )
            // InternalInteractiontxt.g:4449:1: ( '=' )
            {
            // InternalInteractiontxt.g:4449:1: ( '=' )
            // InternalInteractiontxt.g:4450:2: '='
            {
             before(grammarAccess.getALElementAccess().getEqualsSignKeyword_4_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getEqualsSignKeyword_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_1__1__Impl"


    // $ANTLR start "rule__ALElement__Group_4_1__2"
    // InternalInteractiontxt.g:4459:1: rule__ALElement__Group_4_1__2 : rule__ALElement__Group_4_1__2__Impl rule__ALElement__Group_4_1__3 ;
    public final void rule__ALElement__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4463:1: ( rule__ALElement__Group_4_1__2__Impl rule__ALElement__Group_4_1__3 )
            // InternalInteractiontxt.g:4464:2: rule__ALElement__Group_4_1__2__Impl rule__ALElement__Group_4_1__3
            {
            pushFollow(FOLLOW_4);
            rule__ALElement__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_1__2"


    // $ANTLR start "rule__ALElement__Group_4_1__2__Impl"
    // InternalInteractiontxt.g:4471:1: rule__ALElement__Group_4_1__2__Impl : ( '\"' ) ;
    public final void rule__ALElement__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4475:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:4476:1: ( '\"' )
            {
            // InternalInteractiontxt.g:4476:1: ( '\"' )
            // InternalInteractiontxt.g:4477:2: '\"'
            {
             before(grammarAccess.getALElementAccess().getQuotationMarkKeyword_4_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getQuotationMarkKeyword_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_1__2__Impl"


    // $ANTLR start "rule__ALElement__Group_4_1__3"
    // InternalInteractiontxt.g:4486:1: rule__ALElement__Group_4_1__3 : rule__ALElement__Group_4_1__3__Impl rule__ALElement__Group_4_1__4 ;
    public final void rule__ALElement__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4490:1: ( rule__ALElement__Group_4_1__3__Impl rule__ALElement__Group_4_1__4 )
            // InternalInteractiontxt.g:4491:2: rule__ALElement__Group_4_1__3__Impl rule__ALElement__Group_4_1__4
            {
            pushFollow(FOLLOW_20);
            rule__ALElement__Group_4_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_1__3"


    // $ANTLR start "rule__ALElement__Group_4_1__3__Impl"
    // InternalInteractiontxt.g:4498:1: rule__ALElement__Group_4_1__3__Impl : ( ( rule__ALElement__ValueAssignment_4_1_3 ) ) ;
    public final void rule__ALElement__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4502:1: ( ( ( rule__ALElement__ValueAssignment_4_1_3 ) ) )
            // InternalInteractiontxt.g:4503:1: ( ( rule__ALElement__ValueAssignment_4_1_3 ) )
            {
            // InternalInteractiontxt.g:4503:1: ( ( rule__ALElement__ValueAssignment_4_1_3 ) )
            // InternalInteractiontxt.g:4504:2: ( rule__ALElement__ValueAssignment_4_1_3 )
            {
             before(grammarAccess.getALElementAccess().getValueAssignment_4_1_3()); 
            // InternalInteractiontxt.g:4505:2: ( rule__ALElement__ValueAssignment_4_1_3 )
            // InternalInteractiontxt.g:4505:3: rule__ALElement__ValueAssignment_4_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__ValueAssignment_4_1_3();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getValueAssignment_4_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_1__3__Impl"


    // $ANTLR start "rule__ALElement__Group_4_1__4"
    // InternalInteractiontxt.g:4513:1: rule__ALElement__Group_4_1__4 : rule__ALElement__Group_4_1__4__Impl ;
    public final void rule__ALElement__Group_4_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4517:1: ( rule__ALElement__Group_4_1__4__Impl )
            // InternalInteractiontxt.g:4518:2: rule__ALElement__Group_4_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__Group_4_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_1__4"


    // $ANTLR start "rule__ALElement__Group_4_1__4__Impl"
    // InternalInteractiontxt.g:4524:1: rule__ALElement__Group_4_1__4__Impl : ( '\"' ) ;
    public final void rule__ALElement__Group_4_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4528:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:4529:1: ( '\"' )
            {
            // InternalInteractiontxt.g:4529:1: ( '\"' )
            // InternalInteractiontxt.g:4530:2: '\"'
            {
             before(grammarAccess.getALElementAccess().getQuotationMarkKeyword_4_1_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getALElementAccess().getQuotationMarkKeyword_4_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__Group_4_1__4__Impl"


    // $ANTLR start "rule__ACanvas__Group__0"
    // InternalInteractiontxt.g:4540:1: rule__ACanvas__Group__0 : rule__ACanvas__Group__0__Impl rule__ACanvas__Group__1 ;
    public final void rule__ACanvas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4544:1: ( rule__ACanvas__Group__0__Impl rule__ACanvas__Group__1 )
            // InternalInteractiontxt.g:4545:2: rule__ACanvas__Group__0__Impl rule__ACanvas__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ACanvas__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACanvas__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group__0"


    // $ANTLR start "rule__ACanvas__Group__0__Impl"
    // InternalInteractiontxt.g:4552:1: rule__ACanvas__Group__0__Impl : ( () ) ;
    public final void rule__ACanvas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4556:1: ( ( () ) )
            // InternalInteractiontxt.g:4557:1: ( () )
            {
            // InternalInteractiontxt.g:4557:1: ( () )
            // InternalInteractiontxt.g:4558:2: ()
            {
             before(grammarAccess.getACanvasAccess().getACanvasAction_0()); 
            // InternalInteractiontxt.g:4559:2: ()
            // InternalInteractiontxt.g:4559:3: 
            {
            }

             after(grammarAccess.getACanvasAccess().getACanvasAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group__0__Impl"


    // $ANTLR start "rule__ACanvas__Group__1"
    // InternalInteractiontxt.g:4567:1: rule__ACanvas__Group__1 : rule__ACanvas__Group__1__Impl rule__ACanvas__Group__2 ;
    public final void rule__ACanvas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4571:1: ( rule__ACanvas__Group__1__Impl rule__ACanvas__Group__2 )
            // InternalInteractiontxt.g:4572:2: rule__ACanvas__Group__1__Impl rule__ACanvas__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ACanvas__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACanvas__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group__1"


    // $ANTLR start "rule__ACanvas__Group__1__Impl"
    // InternalInteractiontxt.g:4579:1: rule__ACanvas__Group__1__Impl : ( 'Canvas' ) ;
    public final void rule__ACanvas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4583:1: ( ( 'Canvas' ) )
            // InternalInteractiontxt.g:4584:1: ( 'Canvas' )
            {
            // InternalInteractiontxt.g:4584:1: ( 'Canvas' )
            // InternalInteractiontxt.g:4585:2: 'Canvas'
            {
             before(grammarAccess.getACanvasAccess().getCanvasKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getACanvasAccess().getCanvasKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group__1__Impl"


    // $ANTLR start "rule__ACanvas__Group__2"
    // InternalInteractiontxt.g:4594:1: rule__ACanvas__Group__2 : rule__ACanvas__Group__2__Impl rule__ACanvas__Group__3 ;
    public final void rule__ACanvas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4598:1: ( rule__ACanvas__Group__2__Impl rule__ACanvas__Group__3 )
            // InternalInteractiontxt.g:4599:2: rule__ACanvas__Group__2__Impl rule__ACanvas__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ACanvas__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACanvas__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group__2"


    // $ANTLR start "rule__ACanvas__Group__2__Impl"
    // InternalInteractiontxt.g:4606:1: rule__ACanvas__Group__2__Impl : ( '{' ) ;
    public final void rule__ACanvas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4610:1: ( ( '{' ) )
            // InternalInteractiontxt.g:4611:1: ( '{' )
            {
            // InternalInteractiontxt.g:4611:1: ( '{' )
            // InternalInteractiontxt.g:4612:2: '{'
            {
             before(grammarAccess.getACanvasAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getACanvasAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group__2__Impl"


    // $ANTLR start "rule__ACanvas__Group__3"
    // InternalInteractiontxt.g:4621:1: rule__ACanvas__Group__3 : rule__ACanvas__Group__3__Impl rule__ACanvas__Group__4 ;
    public final void rule__ACanvas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4625:1: ( rule__ACanvas__Group__3__Impl rule__ACanvas__Group__4 )
            // InternalInteractiontxt.g:4626:2: rule__ACanvas__Group__3__Impl rule__ACanvas__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ACanvas__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACanvas__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group__3"


    // $ANTLR start "rule__ACanvas__Group__3__Impl"
    // InternalInteractiontxt.g:4633:1: rule__ACanvas__Group__3__Impl : ( ( rule__ACanvas__Group_3__0 )? ) ;
    public final void rule__ACanvas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4637:1: ( ( ( rule__ACanvas__Group_3__0 )? ) )
            // InternalInteractiontxt.g:4638:1: ( ( rule__ACanvas__Group_3__0 )? )
            {
            // InternalInteractiontxt.g:4638:1: ( ( rule__ACanvas__Group_3__0 )? )
            // InternalInteractiontxt.g:4639:2: ( rule__ACanvas__Group_3__0 )?
            {
             before(grammarAccess.getACanvasAccess().getGroup_3()); 
            // InternalInteractiontxt.g:4640:2: ( rule__ACanvas__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==23) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalInteractiontxt.g:4640:3: rule__ACanvas__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ACanvas__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getACanvasAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group__3__Impl"


    // $ANTLR start "rule__ACanvas__Group__4"
    // InternalInteractiontxt.g:4648:1: rule__ACanvas__Group__4 : rule__ACanvas__Group__4__Impl ;
    public final void rule__ACanvas__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4652:1: ( rule__ACanvas__Group__4__Impl )
            // InternalInteractiontxt.g:4653:2: rule__ACanvas__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ACanvas__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group__4"


    // $ANTLR start "rule__ACanvas__Group__4__Impl"
    // InternalInteractiontxt.g:4659:1: rule__ACanvas__Group__4__Impl : ( '}' ) ;
    public final void rule__ACanvas__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4663:1: ( ( '}' ) )
            // InternalInteractiontxt.g:4664:1: ( '}' )
            {
            // InternalInteractiontxt.g:4664:1: ( '}' )
            // InternalInteractiontxt.g:4665:2: '}'
            {
             before(grammarAccess.getACanvasAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getACanvasAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group__4__Impl"


    // $ANTLR start "rule__ACanvas__Group_3__0"
    // InternalInteractiontxt.g:4675:1: rule__ACanvas__Group_3__0 : rule__ACanvas__Group_3__0__Impl rule__ACanvas__Group_3__1 ;
    public final void rule__ACanvas__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4679:1: ( rule__ACanvas__Group_3__0__Impl rule__ACanvas__Group_3__1 )
            // InternalInteractiontxt.g:4680:2: rule__ACanvas__Group_3__0__Impl rule__ACanvas__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__ACanvas__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACanvas__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group_3__0"


    // $ANTLR start "rule__ACanvas__Group_3__0__Impl"
    // InternalInteractiontxt.g:4687:1: rule__ACanvas__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__ACanvas__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4691:1: ( ( 'value' ) )
            // InternalInteractiontxt.g:4692:1: ( 'value' )
            {
            // InternalInteractiontxt.g:4692:1: ( 'value' )
            // InternalInteractiontxt.g:4693:2: 'value'
            {
             before(grammarAccess.getACanvasAccess().getValueKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getACanvasAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group_3__0__Impl"


    // $ANTLR start "rule__ACanvas__Group_3__1"
    // InternalInteractiontxt.g:4702:1: rule__ACanvas__Group_3__1 : rule__ACanvas__Group_3__1__Impl rule__ACanvas__Group_3__2 ;
    public final void rule__ACanvas__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4706:1: ( rule__ACanvas__Group_3__1__Impl rule__ACanvas__Group_3__2 )
            // InternalInteractiontxt.g:4707:2: rule__ACanvas__Group_3__1__Impl rule__ACanvas__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__ACanvas__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACanvas__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group_3__1"


    // $ANTLR start "rule__ACanvas__Group_3__1__Impl"
    // InternalInteractiontxt.g:4714:1: rule__ACanvas__Group_3__1__Impl : ( '=' ) ;
    public final void rule__ACanvas__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4718:1: ( ( '=' ) )
            // InternalInteractiontxt.g:4719:1: ( '=' )
            {
            // InternalInteractiontxt.g:4719:1: ( '=' )
            // InternalInteractiontxt.g:4720:2: '='
            {
             before(grammarAccess.getACanvasAccess().getEqualsSignKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getACanvasAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group_3__1__Impl"


    // $ANTLR start "rule__ACanvas__Group_3__2"
    // InternalInteractiontxt.g:4729:1: rule__ACanvas__Group_3__2 : rule__ACanvas__Group_3__2__Impl rule__ACanvas__Group_3__3 ;
    public final void rule__ACanvas__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4733:1: ( rule__ACanvas__Group_3__2__Impl rule__ACanvas__Group_3__3 )
            // InternalInteractiontxt.g:4734:2: rule__ACanvas__Group_3__2__Impl rule__ACanvas__Group_3__3
            {
            pushFollow(FOLLOW_4);
            rule__ACanvas__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACanvas__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group_3__2"


    // $ANTLR start "rule__ACanvas__Group_3__2__Impl"
    // InternalInteractiontxt.g:4741:1: rule__ACanvas__Group_3__2__Impl : ( '\"' ) ;
    public final void rule__ACanvas__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4745:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:4746:1: ( '\"' )
            {
            // InternalInteractiontxt.g:4746:1: ( '\"' )
            // InternalInteractiontxt.g:4747:2: '\"'
            {
             before(grammarAccess.getACanvasAccess().getQuotationMarkKeyword_3_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getACanvasAccess().getQuotationMarkKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group_3__2__Impl"


    // $ANTLR start "rule__ACanvas__Group_3__3"
    // InternalInteractiontxt.g:4756:1: rule__ACanvas__Group_3__3 : rule__ACanvas__Group_3__3__Impl rule__ACanvas__Group_3__4 ;
    public final void rule__ACanvas__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4760:1: ( rule__ACanvas__Group_3__3__Impl rule__ACanvas__Group_3__4 )
            // InternalInteractiontxt.g:4761:2: rule__ACanvas__Group_3__3__Impl rule__ACanvas__Group_3__4
            {
            pushFollow(FOLLOW_20);
            rule__ACanvas__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACanvas__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group_3__3"


    // $ANTLR start "rule__ACanvas__Group_3__3__Impl"
    // InternalInteractiontxt.g:4768:1: rule__ACanvas__Group_3__3__Impl : ( ( rule__ACanvas__ValueAssignment_3_3 ) ) ;
    public final void rule__ACanvas__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4772:1: ( ( ( rule__ACanvas__ValueAssignment_3_3 ) ) )
            // InternalInteractiontxt.g:4773:1: ( ( rule__ACanvas__ValueAssignment_3_3 ) )
            {
            // InternalInteractiontxt.g:4773:1: ( ( rule__ACanvas__ValueAssignment_3_3 ) )
            // InternalInteractiontxt.g:4774:2: ( rule__ACanvas__ValueAssignment_3_3 )
            {
             before(grammarAccess.getACanvasAccess().getValueAssignment_3_3()); 
            // InternalInteractiontxt.g:4775:2: ( rule__ACanvas__ValueAssignment_3_3 )
            // InternalInteractiontxt.g:4775:3: rule__ACanvas__ValueAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__ACanvas__ValueAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getACanvasAccess().getValueAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group_3__3__Impl"


    // $ANTLR start "rule__ACanvas__Group_3__4"
    // InternalInteractiontxt.g:4783:1: rule__ACanvas__Group_3__4 : rule__ACanvas__Group_3__4__Impl ;
    public final void rule__ACanvas__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4787:1: ( rule__ACanvas__Group_3__4__Impl )
            // InternalInteractiontxt.g:4788:2: rule__ACanvas__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ACanvas__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group_3__4"


    // $ANTLR start "rule__ACanvas__Group_3__4__Impl"
    // InternalInteractiontxt.g:4794:1: rule__ACanvas__Group_3__4__Impl : ( '\"' ) ;
    public final void rule__ACanvas__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4798:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:4799:1: ( '\"' )
            {
            // InternalInteractiontxt.g:4799:1: ( '\"' )
            // InternalInteractiontxt.g:4800:2: '\"'
            {
             before(grammarAccess.getACanvasAccess().getQuotationMarkKeyword_3_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getACanvasAccess().getQuotationMarkKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__Group_3__4__Impl"


    // $ANTLR start "rule__AVElement__Group__0"
    // InternalInteractiontxt.g:4810:1: rule__AVElement__Group__0 : rule__AVElement__Group__0__Impl rule__AVElement__Group__1 ;
    public final void rule__AVElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4814:1: ( rule__AVElement__Group__0__Impl rule__AVElement__Group__1 )
            // InternalInteractiontxt.g:4815:2: rule__AVElement__Group__0__Impl rule__AVElement__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__AVElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__0"


    // $ANTLR start "rule__AVElement__Group__0__Impl"
    // InternalInteractiontxt.g:4822:1: rule__AVElement__Group__0__Impl : ( () ) ;
    public final void rule__AVElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4826:1: ( ( () ) )
            // InternalInteractiontxt.g:4827:1: ( () )
            {
            // InternalInteractiontxt.g:4827:1: ( () )
            // InternalInteractiontxt.g:4828:2: ()
            {
             before(grammarAccess.getAVElementAccess().getAVElementAction_0()); 
            // InternalInteractiontxt.g:4829:2: ()
            // InternalInteractiontxt.g:4829:3: 
            {
            }

             after(grammarAccess.getAVElementAccess().getAVElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__0__Impl"


    // $ANTLR start "rule__AVElement__Group__1"
    // InternalInteractiontxt.g:4837:1: rule__AVElement__Group__1 : rule__AVElement__Group__1__Impl rule__AVElement__Group__2 ;
    public final void rule__AVElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4841:1: ( rule__AVElement__Group__1__Impl rule__AVElement__Group__2 )
            // InternalInteractiontxt.g:4842:2: rule__AVElement__Group__1__Impl rule__AVElement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AVElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__1"


    // $ANTLR start "rule__AVElement__Group__1__Impl"
    // InternalInteractiontxt.g:4849:1: rule__AVElement__Group__1__Impl : ( 'Var' ) ;
    public final void rule__AVElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4853:1: ( ( 'Var' ) )
            // InternalInteractiontxt.g:4854:1: ( 'Var' )
            {
            // InternalInteractiontxt.g:4854:1: ( 'Var' )
            // InternalInteractiontxt.g:4855:2: 'Var'
            {
             before(grammarAccess.getAVElementAccess().getVarKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__1__Impl"


    // $ANTLR start "rule__AVElement__Group__2"
    // InternalInteractiontxt.g:4864:1: rule__AVElement__Group__2 : rule__AVElement__Group__2__Impl rule__AVElement__Group__3 ;
    public final void rule__AVElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4868:1: ( rule__AVElement__Group__2__Impl rule__AVElement__Group__3 )
            // InternalInteractiontxt.g:4869:2: rule__AVElement__Group__2__Impl rule__AVElement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__AVElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__2"


    // $ANTLR start "rule__AVElement__Group__2__Impl"
    // InternalInteractiontxt.g:4876:1: rule__AVElement__Group__2__Impl : ( ( rule__AVElement__IdAssignment_2 ) ) ;
    public final void rule__AVElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4880:1: ( ( ( rule__AVElement__IdAssignment_2 ) ) )
            // InternalInteractiontxt.g:4881:1: ( ( rule__AVElement__IdAssignment_2 ) )
            {
            // InternalInteractiontxt.g:4881:1: ( ( rule__AVElement__IdAssignment_2 ) )
            // InternalInteractiontxt.g:4882:2: ( rule__AVElement__IdAssignment_2 )
            {
             before(grammarAccess.getAVElementAccess().getIdAssignment_2()); 
            // InternalInteractiontxt.g:4883:2: ( rule__AVElement__IdAssignment_2 )
            // InternalInteractiontxt.g:4883:3: rule__AVElement__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__2__Impl"


    // $ANTLR start "rule__AVElement__Group__3"
    // InternalInteractiontxt.g:4891:1: rule__AVElement__Group__3 : rule__AVElement__Group__3__Impl rule__AVElement__Group__4 ;
    public final void rule__AVElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4895:1: ( rule__AVElement__Group__3__Impl rule__AVElement__Group__4 )
            // InternalInteractiontxt.g:4896:2: rule__AVElement__Group__3__Impl rule__AVElement__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__AVElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__3"


    // $ANTLR start "rule__AVElement__Group__3__Impl"
    // InternalInteractiontxt.g:4903:1: rule__AVElement__Group__3__Impl : ( '{' ) ;
    public final void rule__AVElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4907:1: ( ( '{' ) )
            // InternalInteractiontxt.g:4908:1: ( '{' )
            {
            // InternalInteractiontxt.g:4908:1: ( '{' )
            // InternalInteractiontxt.g:4909:2: '{'
            {
             before(grammarAccess.getAVElementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__3__Impl"


    // $ANTLR start "rule__AVElement__Group__4"
    // InternalInteractiontxt.g:4918:1: rule__AVElement__Group__4 : rule__AVElement__Group__4__Impl rule__AVElement__Group__5 ;
    public final void rule__AVElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4922:1: ( rule__AVElement__Group__4__Impl rule__AVElement__Group__5 )
            // InternalInteractiontxt.g:4923:2: rule__AVElement__Group__4__Impl rule__AVElement__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__AVElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__4"


    // $ANTLR start "rule__AVElement__Group__4__Impl"
    // InternalInteractiontxt.g:4930:1: rule__AVElement__Group__4__Impl : ( ( rule__AVElement__Alternatives_4 )? ) ;
    public final void rule__AVElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4934:1: ( ( ( rule__AVElement__Alternatives_4 )? ) )
            // InternalInteractiontxt.g:4935:1: ( ( rule__AVElement__Alternatives_4 )? )
            {
            // InternalInteractiontxt.g:4935:1: ( ( rule__AVElement__Alternatives_4 )? )
            // InternalInteractiontxt.g:4936:2: ( rule__AVElement__Alternatives_4 )?
            {
             before(grammarAccess.getAVElementAccess().getAlternatives_4()); 
            // InternalInteractiontxt.g:4937:2: ( rule__AVElement__Alternatives_4 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==23||LA49_0==30||LA49_0==32) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalInteractiontxt.g:4937:3: rule__AVElement__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__AVElement__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAVElementAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__4__Impl"


    // $ANTLR start "rule__AVElement__Group__5"
    // InternalInteractiontxt.g:4945:1: rule__AVElement__Group__5 : rule__AVElement__Group__5__Impl ;
    public final void rule__AVElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4949:1: ( rule__AVElement__Group__5__Impl )
            // InternalInteractiontxt.g:4950:2: rule__AVElement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__5"


    // $ANTLR start "rule__AVElement__Group__5__Impl"
    // InternalInteractiontxt.g:4956:1: rule__AVElement__Group__5__Impl : ( '}' ) ;
    public final void rule__AVElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4960:1: ( ( '}' ) )
            // InternalInteractiontxt.g:4961:1: ( '}' )
            {
            // InternalInteractiontxt.g:4961:1: ( '}' )
            // InternalInteractiontxt.g:4962:2: '}'
            {
             before(grammarAccess.getAVElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group__5__Impl"


    // $ANTLR start "rule__AVElement__Group_4_0__0"
    // InternalInteractiontxt.g:4972:1: rule__AVElement__Group_4_0__0 : rule__AVElement__Group_4_0__0__Impl rule__AVElement__Group_4_0__1 ;
    public final void rule__AVElement__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4976:1: ( rule__AVElement__Group_4_0__0__Impl rule__AVElement__Group_4_0__1 )
            // InternalInteractiontxt.g:4977:2: rule__AVElement__Group_4_0__0__Impl rule__AVElement__Group_4_0__1
            {
            pushFollow(FOLLOW_18);
            rule__AVElement__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__0"


    // $ANTLR start "rule__AVElement__Group_4_0__0__Impl"
    // InternalInteractiontxt.g:4984:1: rule__AVElement__Group_4_0__0__Impl : ( 'op' ) ;
    public final void rule__AVElement__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:4988:1: ( ( 'op' ) )
            // InternalInteractiontxt.g:4989:1: ( 'op' )
            {
            // InternalInteractiontxt.g:4989:1: ( 'op' )
            // InternalInteractiontxt.g:4990:2: 'op'
            {
             before(grammarAccess.getAVElementAccess().getOpKeyword_4_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getOpKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__0__Impl"


    // $ANTLR start "rule__AVElement__Group_4_0__1"
    // InternalInteractiontxt.g:4999:1: rule__AVElement__Group_4_0__1 : rule__AVElement__Group_4_0__1__Impl rule__AVElement__Group_4_0__2 ;
    public final void rule__AVElement__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5003:1: ( rule__AVElement__Group_4_0__1__Impl rule__AVElement__Group_4_0__2 )
            // InternalInteractiontxt.g:5004:2: rule__AVElement__Group_4_0__1__Impl rule__AVElement__Group_4_0__2
            {
            pushFollow(FOLLOW_39);
            rule__AVElement__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__1"


    // $ANTLR start "rule__AVElement__Group_4_0__1__Impl"
    // InternalInteractiontxt.g:5011:1: rule__AVElement__Group_4_0__1__Impl : ( '=' ) ;
    public final void rule__AVElement__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5015:1: ( ( '=' ) )
            // InternalInteractiontxt.g:5016:1: ( '=' )
            {
            // InternalInteractiontxt.g:5016:1: ( '=' )
            // InternalInteractiontxt.g:5017:2: '='
            {
             before(grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__1__Impl"


    // $ANTLR start "rule__AVElement__Group_4_0__2"
    // InternalInteractiontxt.g:5026:1: rule__AVElement__Group_4_0__2 : rule__AVElement__Group_4_0__2__Impl rule__AVElement__Group_4_0__3 ;
    public final void rule__AVElement__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5030:1: ( rule__AVElement__Group_4_0__2__Impl rule__AVElement__Group_4_0__3 )
            // InternalInteractiontxt.g:5031:2: rule__AVElement__Group_4_0__2__Impl rule__AVElement__Group_4_0__3
            {
            pushFollow(FOLLOW_25);
            rule__AVElement__Group_4_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__2"


    // $ANTLR start "rule__AVElement__Group_4_0__2__Impl"
    // InternalInteractiontxt.g:5038:1: rule__AVElement__Group_4_0__2__Impl : ( ( rule__AVElement__OperationAssignment_4_0_2 ) ) ;
    public final void rule__AVElement__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5042:1: ( ( ( rule__AVElement__OperationAssignment_4_0_2 ) ) )
            // InternalInteractiontxt.g:5043:1: ( ( rule__AVElement__OperationAssignment_4_0_2 ) )
            {
            // InternalInteractiontxt.g:5043:1: ( ( rule__AVElement__OperationAssignment_4_0_2 ) )
            // InternalInteractiontxt.g:5044:2: ( rule__AVElement__OperationAssignment_4_0_2 )
            {
             before(grammarAccess.getAVElementAccess().getOperationAssignment_4_0_2()); 
            // InternalInteractiontxt.g:5045:2: ( rule__AVElement__OperationAssignment_4_0_2 )
            // InternalInteractiontxt.g:5045:3: rule__AVElement__OperationAssignment_4_0_2
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__OperationAssignment_4_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getOperationAssignment_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__2__Impl"


    // $ANTLR start "rule__AVElement__Group_4_0__3"
    // InternalInteractiontxt.g:5053:1: rule__AVElement__Group_4_0__3 : rule__AVElement__Group_4_0__3__Impl rule__AVElement__Group_4_0__4 ;
    public final void rule__AVElement__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5057:1: ( rule__AVElement__Group_4_0__3__Impl rule__AVElement__Group_4_0__4 )
            // InternalInteractiontxt.g:5058:2: rule__AVElement__Group_4_0__3__Impl rule__AVElement__Group_4_0__4
            {
            pushFollow(FOLLOW_40);
            rule__AVElement__Group_4_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__3"


    // $ANTLR start "rule__AVElement__Group_4_0__3__Impl"
    // InternalInteractiontxt.g:5065:1: rule__AVElement__Group_4_0__3__Impl : ( ',' ) ;
    public final void rule__AVElement__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5069:1: ( ( ',' ) )
            // InternalInteractiontxt.g:5070:1: ( ',' )
            {
            // InternalInteractiontxt.g:5070:1: ( ',' )
            // InternalInteractiontxt.g:5071:2: ','
            {
             before(grammarAccess.getAVElementAccess().getCommaKeyword_4_0_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getCommaKeyword_4_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__3__Impl"


    // $ANTLR start "rule__AVElement__Group_4_0__4"
    // InternalInteractiontxt.g:5080:1: rule__AVElement__Group_4_0__4 : rule__AVElement__Group_4_0__4__Impl rule__AVElement__Group_4_0__5 ;
    public final void rule__AVElement__Group_4_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5084:1: ( rule__AVElement__Group_4_0__4__Impl rule__AVElement__Group_4_0__5 )
            // InternalInteractiontxt.g:5085:2: rule__AVElement__Group_4_0__4__Impl rule__AVElement__Group_4_0__5
            {
            pushFollow(FOLLOW_18);
            rule__AVElement__Group_4_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__4"


    // $ANTLR start "rule__AVElement__Group_4_0__4__Impl"
    // InternalInteractiontxt.g:5092:1: rule__AVElement__Group_4_0__4__Impl : ( 'from' ) ;
    public final void rule__AVElement__Group_4_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5096:1: ( ( 'from' ) )
            // InternalInteractiontxt.g:5097:1: ( 'from' )
            {
            // InternalInteractiontxt.g:5097:1: ( 'from' )
            // InternalInteractiontxt.g:5098:2: 'from'
            {
             before(grammarAccess.getAVElementAccess().getFromKeyword_4_0_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getFromKeyword_4_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__4__Impl"


    // $ANTLR start "rule__AVElement__Group_4_0__5"
    // InternalInteractiontxt.g:5107:1: rule__AVElement__Group_4_0__5 : rule__AVElement__Group_4_0__5__Impl rule__AVElement__Group_4_0__6 ;
    public final void rule__AVElement__Group_4_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5111:1: ( rule__AVElement__Group_4_0__5__Impl rule__AVElement__Group_4_0__6 )
            // InternalInteractiontxt.g:5112:2: rule__AVElement__Group_4_0__5__Impl rule__AVElement__Group_4_0__6
            {
            pushFollow(FOLLOW_34);
            rule__AVElement__Group_4_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__5"


    // $ANTLR start "rule__AVElement__Group_4_0__5__Impl"
    // InternalInteractiontxt.g:5119:1: rule__AVElement__Group_4_0__5__Impl : ( '=' ) ;
    public final void rule__AVElement__Group_4_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5123:1: ( ( '=' ) )
            // InternalInteractiontxt.g:5124:1: ( '=' )
            {
            // InternalInteractiontxt.g:5124:1: ( '=' )
            // InternalInteractiontxt.g:5125:2: '='
            {
             before(grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_0_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__5__Impl"


    // $ANTLR start "rule__AVElement__Group_4_0__6"
    // InternalInteractiontxt.g:5134:1: rule__AVElement__Group_4_0__6 : rule__AVElement__Group_4_0__6__Impl ;
    public final void rule__AVElement__Group_4_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5138:1: ( rule__AVElement__Group_4_0__6__Impl )
            // InternalInteractiontxt.g:5139:2: rule__AVElement__Group_4_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__6"


    // $ANTLR start "rule__AVElement__Group_4_0__6__Impl"
    // InternalInteractiontxt.g:5145:1: rule__AVElement__Group_4_0__6__Impl : ( ( rule__AVElement__ValueAssignment_4_0_6 ) ) ;
    public final void rule__AVElement__Group_4_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5149:1: ( ( ( rule__AVElement__ValueAssignment_4_0_6 ) ) )
            // InternalInteractiontxt.g:5150:1: ( ( rule__AVElement__ValueAssignment_4_0_6 ) )
            {
            // InternalInteractiontxt.g:5150:1: ( ( rule__AVElement__ValueAssignment_4_0_6 ) )
            // InternalInteractiontxt.g:5151:2: ( rule__AVElement__ValueAssignment_4_0_6 )
            {
             before(grammarAccess.getAVElementAccess().getValueAssignment_4_0_6()); 
            // InternalInteractiontxt.g:5152:2: ( rule__AVElement__ValueAssignment_4_0_6 )
            // InternalInteractiontxt.g:5152:3: rule__AVElement__ValueAssignment_4_0_6
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__ValueAssignment_4_0_6();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getValueAssignment_4_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_0__6__Impl"


    // $ANTLR start "rule__AVElement__Group_4_1__0"
    // InternalInteractiontxt.g:5161:1: rule__AVElement__Group_4_1__0 : rule__AVElement__Group_4_1__0__Impl rule__AVElement__Group_4_1__1 ;
    public final void rule__AVElement__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5165:1: ( rule__AVElement__Group_4_1__0__Impl rule__AVElement__Group_4_1__1 )
            // InternalInteractiontxt.g:5166:2: rule__AVElement__Group_4_1__0__Impl rule__AVElement__Group_4_1__1
            {
            pushFollow(FOLLOW_18);
            rule__AVElement__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1__0"


    // $ANTLR start "rule__AVElement__Group_4_1__0__Impl"
    // InternalInteractiontxt.g:5173:1: rule__AVElement__Group_4_1__0__Impl : ( 'value' ) ;
    public final void rule__AVElement__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5177:1: ( ( 'value' ) )
            // InternalInteractiontxt.g:5178:1: ( 'value' )
            {
            // InternalInteractiontxt.g:5178:1: ( 'value' )
            // InternalInteractiontxt.g:5179:2: 'value'
            {
             before(grammarAccess.getAVElementAccess().getValueKeyword_4_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getValueKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1__0__Impl"


    // $ANTLR start "rule__AVElement__Group_4_1__1"
    // InternalInteractiontxt.g:5188:1: rule__AVElement__Group_4_1__1 : rule__AVElement__Group_4_1__1__Impl rule__AVElement__Group_4_1__2 ;
    public final void rule__AVElement__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5192:1: ( rule__AVElement__Group_4_1__1__Impl rule__AVElement__Group_4_1__2 )
            // InternalInteractiontxt.g:5193:2: rule__AVElement__Group_4_1__1__Impl rule__AVElement__Group_4_1__2
            {
            pushFollow(FOLLOW_19);
            rule__AVElement__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1__1"


    // $ANTLR start "rule__AVElement__Group_4_1__1__Impl"
    // InternalInteractiontxt.g:5200:1: rule__AVElement__Group_4_1__1__Impl : ( '=' ) ;
    public final void rule__AVElement__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5204:1: ( ( '=' ) )
            // InternalInteractiontxt.g:5205:1: ( '=' )
            {
            // InternalInteractiontxt.g:5205:1: ( '=' )
            // InternalInteractiontxt.g:5206:2: '='
            {
             before(grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1__1__Impl"


    // $ANTLR start "rule__AVElement__Group_4_1__2"
    // InternalInteractiontxt.g:5215:1: rule__AVElement__Group_4_1__2 : rule__AVElement__Group_4_1__2__Impl ;
    public final void rule__AVElement__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5219:1: ( rule__AVElement__Group_4_1__2__Impl )
            // InternalInteractiontxt.g:5220:2: rule__AVElement__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1__2"


    // $ANTLR start "rule__AVElement__Group_4_1__2__Impl"
    // InternalInteractiontxt.g:5226:1: rule__AVElement__Group_4_1__2__Impl : ( ( rule__AVElement__Alternatives_4_1_2 ) ) ;
    public final void rule__AVElement__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5230:1: ( ( ( rule__AVElement__Alternatives_4_1_2 ) ) )
            // InternalInteractiontxt.g:5231:1: ( ( rule__AVElement__Alternatives_4_1_2 ) )
            {
            // InternalInteractiontxt.g:5231:1: ( ( rule__AVElement__Alternatives_4_1_2 ) )
            // InternalInteractiontxt.g:5232:2: ( rule__AVElement__Alternatives_4_1_2 )
            {
             before(grammarAccess.getAVElementAccess().getAlternatives_4_1_2()); 
            // InternalInteractiontxt.g:5233:2: ( rule__AVElement__Alternatives_4_1_2 )
            // InternalInteractiontxt.g:5233:3: rule__AVElement__Alternatives_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__Alternatives_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getAlternatives_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1__2__Impl"


    // $ANTLR start "rule__AVElement__Group_4_1_2_0__0"
    // InternalInteractiontxt.g:5242:1: rule__AVElement__Group_4_1_2_0__0 : rule__AVElement__Group_4_1_2_0__0__Impl rule__AVElement__Group_4_1_2_0__1 ;
    public final void rule__AVElement__Group_4_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5246:1: ( rule__AVElement__Group_4_1_2_0__0__Impl rule__AVElement__Group_4_1_2_0__1 )
            // InternalInteractiontxt.g:5247:2: rule__AVElement__Group_4_1_2_0__0__Impl rule__AVElement__Group_4_1_2_0__1
            {
            pushFollow(FOLLOW_4);
            rule__AVElement__Group_4_1_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_1_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1_2_0__0"


    // $ANTLR start "rule__AVElement__Group_4_1_2_0__0__Impl"
    // InternalInteractiontxt.g:5254:1: rule__AVElement__Group_4_1_2_0__0__Impl : ( '\"' ) ;
    public final void rule__AVElement__Group_4_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5258:1: ( ( '\"' ) )
            // InternalInteractiontxt.g:5259:1: ( '\"' )
            {
            // InternalInteractiontxt.g:5259:1: ( '\"' )
            // InternalInteractiontxt.g:5260:2: '\"'
            {
             before(grammarAccess.getAVElementAccess().getQuotationMarkKeyword_4_1_2_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getQuotationMarkKeyword_4_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1_2_0__0__Impl"


    // $ANTLR start "rule__AVElement__Group_4_1_2_0__1"
    // InternalInteractiontxt.g:5269:1: rule__AVElement__Group_4_1_2_0__1 : rule__AVElement__Group_4_1_2_0__1__Impl rule__AVElement__Group_4_1_2_0__2 ;
    public final void rule__AVElement__Group_4_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5273:1: ( rule__AVElement__Group_4_1_2_0__1__Impl rule__AVElement__Group_4_1_2_0__2 )
            // InternalInteractiontxt.g:5274:2: rule__AVElement__Group_4_1_2_0__1__Impl rule__AVElement__Group_4_1_2_0__2
            {
            pushFollow(FOLLOW_20);
            rule__AVElement__Group_4_1_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_1_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1_2_0__1"


    // $ANTLR start "rule__AVElement__Group_4_1_2_0__1__Impl"
    // InternalInteractiontxt.g:5281:1: rule__AVElement__Group_4_1_2_0__1__Impl : ( ( rule__AVElement__ValueAssignment_4_1_2_0_1 ) ) ;
    public final void rule__AVElement__Group_4_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5285:1: ( ( ( rule__AVElement__ValueAssignment_4_1_2_0_1 ) ) )
            // InternalInteractiontxt.g:5286:1: ( ( rule__AVElement__ValueAssignment_4_1_2_0_1 ) )
            {
            // InternalInteractiontxt.g:5286:1: ( ( rule__AVElement__ValueAssignment_4_1_2_0_1 ) )
            // InternalInteractiontxt.g:5287:2: ( rule__AVElement__ValueAssignment_4_1_2_0_1 )
            {
             before(grammarAccess.getAVElementAccess().getValueAssignment_4_1_2_0_1()); 
            // InternalInteractiontxt.g:5288:2: ( rule__AVElement__ValueAssignment_4_1_2_0_1 )
            // InternalInteractiontxt.g:5288:3: rule__AVElement__ValueAssignment_4_1_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__ValueAssignment_4_1_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getValueAssignment_4_1_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1_2_0__1__Impl"


    // $ANTLR start "rule__AVElement__Group_4_1_2_0__2"
    // InternalInteractiontxt.g:5296:1: rule__AVElement__Group_4_1_2_0__2 : rule__AVElement__Group_4_1_2_0__2__Impl ;
    public final void rule__AVElement__Group_4_1_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5300:1: ( rule__AVElement__Group_4_1_2_0__2__Impl )
            // InternalInteractiontxt.g:5301:2: rule__AVElement__Group_4_1_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_1_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1_2_0__2"


    // $ANTLR start "rule__AVElement__Group_4_1_2_0__2__Impl"
    // InternalInteractiontxt.g:5307:1: rule__AVElement__Group_4_1_2_0__2__Impl : ( ( rule__AVElement__OperationAssignment_4_1_2_0_2 ) ) ;
    public final void rule__AVElement__Group_4_1_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5311:1: ( ( ( rule__AVElement__OperationAssignment_4_1_2_0_2 ) ) )
            // InternalInteractiontxt.g:5312:1: ( ( rule__AVElement__OperationAssignment_4_1_2_0_2 ) )
            {
            // InternalInteractiontxt.g:5312:1: ( ( rule__AVElement__OperationAssignment_4_1_2_0_2 ) )
            // InternalInteractiontxt.g:5313:2: ( rule__AVElement__OperationAssignment_4_1_2_0_2 )
            {
             before(grammarAccess.getAVElementAccess().getOperationAssignment_4_1_2_0_2()); 
            // InternalInteractiontxt.g:5314:2: ( rule__AVElement__OperationAssignment_4_1_2_0_2 )
            // InternalInteractiontxt.g:5314:3: rule__AVElement__OperationAssignment_4_1_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__OperationAssignment_4_1_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getOperationAssignment_4_1_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_1_2_0__2__Impl"


    // $ANTLR start "rule__AVElement__Group_4_2__0"
    // InternalInteractiontxt.g:5323:1: rule__AVElement__Group_4_2__0 : rule__AVElement__Group_4_2__0__Impl rule__AVElement__Group_4_2__1 ;
    public final void rule__AVElement__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5327:1: ( rule__AVElement__Group_4_2__0__Impl rule__AVElement__Group_4_2__1 )
            // InternalInteractiontxt.g:5328:2: rule__AVElement__Group_4_2__0__Impl rule__AVElement__Group_4_2__1
            {
            pushFollow(FOLLOW_18);
            rule__AVElement__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_2__0"


    // $ANTLR start "rule__AVElement__Group_4_2__0__Impl"
    // InternalInteractiontxt.g:5335:1: rule__AVElement__Group_4_2__0__Impl : ( 'element' ) ;
    public final void rule__AVElement__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5339:1: ( ( 'element' ) )
            // InternalInteractiontxt.g:5340:1: ( 'element' )
            {
            // InternalInteractiontxt.g:5340:1: ( 'element' )
            // InternalInteractiontxt.g:5341:2: 'element'
            {
             before(grammarAccess.getAVElementAccess().getElementKeyword_4_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getElementKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_2__0__Impl"


    // $ANTLR start "rule__AVElement__Group_4_2__1"
    // InternalInteractiontxt.g:5350:1: rule__AVElement__Group_4_2__1 : rule__AVElement__Group_4_2__1__Impl rule__AVElement__Group_4_2__2 ;
    public final void rule__AVElement__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5354:1: ( rule__AVElement__Group_4_2__1__Impl rule__AVElement__Group_4_2__2 )
            // InternalInteractiontxt.g:5355:2: rule__AVElement__Group_4_2__1__Impl rule__AVElement__Group_4_2__2
            {
            pushFollow(FOLLOW_4);
            rule__AVElement__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_2__1"


    // $ANTLR start "rule__AVElement__Group_4_2__1__Impl"
    // InternalInteractiontxt.g:5362:1: rule__AVElement__Group_4_2__1__Impl : ( '=' ) ;
    public final void rule__AVElement__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5366:1: ( ( '=' ) )
            // InternalInteractiontxt.g:5367:1: ( '=' )
            {
            // InternalInteractiontxt.g:5367:1: ( '=' )
            // InternalInteractiontxt.g:5368:2: '='
            {
             before(grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_2_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_2__1__Impl"


    // $ANTLR start "rule__AVElement__Group_4_2__2"
    // InternalInteractiontxt.g:5377:1: rule__AVElement__Group_4_2__2 : rule__AVElement__Group_4_2__2__Impl ;
    public final void rule__AVElement__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5381:1: ( rule__AVElement__Group_4_2__2__Impl )
            // InternalInteractiontxt.g:5382:2: rule__AVElement__Group_4_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__Group_4_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_2__2"


    // $ANTLR start "rule__AVElement__Group_4_2__2__Impl"
    // InternalInteractiontxt.g:5388:1: rule__AVElement__Group_4_2__2__Impl : ( ( rule__AVElement__ElementAssignment_4_2_2 ) ) ;
    public final void rule__AVElement__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5392:1: ( ( ( rule__AVElement__ElementAssignment_4_2_2 ) ) )
            // InternalInteractiontxt.g:5393:1: ( ( rule__AVElement__ElementAssignment_4_2_2 ) )
            {
            // InternalInteractiontxt.g:5393:1: ( ( rule__AVElement__ElementAssignment_4_2_2 ) )
            // InternalInteractiontxt.g:5394:2: ( rule__AVElement__ElementAssignment_4_2_2 )
            {
             before(grammarAccess.getAVElementAccess().getElementAssignment_4_2_2()); 
            // InternalInteractiontxt.g:5395:2: ( rule__AVElement__ElementAssignment_4_2_2 )
            // InternalInteractiontxt.g:5395:3: rule__AVElement__ElementAssignment_4_2_2
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__ElementAssignment_4_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getElementAssignment_4_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__Group_4_2__2__Impl"


    // $ANTLR start "rule__Model__InteractionsAssignment"
    // InternalInteractiontxt.g:5404:1: rule__Model__InteractionsAssignment : ( ruleInteraction ) ;
    public final void rule__Model__InteractionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5408:1: ( ( ruleInteraction ) )
            // InternalInteractiontxt.g:5409:2: ( ruleInteraction )
            {
            // InternalInteractiontxt.g:5409:2: ( ruleInteraction )
            // InternalInteractiontxt.g:5410:3: ruleInteraction
            {
             before(grammarAccess.getModelAccess().getInteractionsInteractionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getModelAccess().getInteractionsInteractionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InteractionsAssignment"


    // $ANTLR start "rule__Interaction__NameAssignment_1"
    // InternalInteractiontxt.g:5419:1: rule__Interaction__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Interaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5423:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5424:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5424:2: ( ruleEString )
            // InternalInteractiontxt.g:5425:3: ruleEString
            {
             before(grammarAccess.getInteractionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__NameAssignment_1"


    // $ANTLR start "rule__Interaction__ConditionAssignment_2"
    // InternalInteractiontxt.g:5434:1: rule__Interaction__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Interaction__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5438:1: ( ( ruleCondition ) )
            // InternalInteractiontxt.g:5439:2: ( ruleCondition )
            {
            // InternalInteractiontxt.g:5439:2: ( ruleCondition )
            // InternalInteractiontxt.g:5440:3: ruleCondition
            {
             before(grammarAccess.getInteractionAccess().getConditionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getConditionConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interaction__ConditionAssignment_2"


    // $ANTLR start "rule__Condition__IdAssignment_2"
    // InternalInteractiontxt.g:5449:1: rule__Condition__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Condition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5453:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5454:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5454:2: ( ruleEString )
            // InternalInteractiontxt.g:5455:3: ruleEString
            {
             before(grammarAccess.getConditionAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__IdAssignment_2"


    // $ANTLR start "rule__Condition__ElementsAssignment_4"
    // InternalInteractiontxt.g:5464:1: rule__Condition__ElementsAssignment_4 : ( ruleCElement ) ;
    public final void rule__Condition__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5468:1: ( ( ruleCElement ) )
            // InternalInteractiontxt.g:5469:2: ( ruleCElement )
            {
            // InternalInteractiontxt.g:5469:2: ( ruleCElement )
            // InternalInteractiontxt.g:5470:3: ruleCElement
            {
             before(grammarAccess.getConditionAccess().getElementsCElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCElement();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getElementsCElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ElementsAssignment_4"


    // $ANTLR start "rule__Condition__TransitionAssignment_6"
    // InternalInteractiontxt.g:5479:1: rule__Condition__TransitionAssignment_6 : ( ruleStartTransition ) ;
    public final void rule__Condition__TransitionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5483:1: ( ( ruleStartTransition ) )
            // InternalInteractiontxt.g:5484:2: ( ruleStartTransition )
            {
            // InternalInteractiontxt.g:5484:2: ( ruleStartTransition )
            // InternalInteractiontxt.g:5485:3: ruleStartTransition
            {
             before(grammarAccess.getConditionAccess().getTransitionStartTransitionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStartTransition();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getTransitionStartTransitionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__TransitionAssignment_6"


    // $ANTLR start "rule__StartTransition__EventAssignment_1"
    // InternalInteractiontxt.g:5494:1: rule__StartTransition__EventAssignment_1 : ( ruleEString ) ;
    public final void rule__StartTransition__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5498:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5499:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5499:2: ( ruleEString )
            // InternalInteractiontxt.g:5500:3: ruleEString
            {
             before(grammarAccess.getStartTransitionAccess().getEventEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStartTransitionAccess().getEventEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTransition__EventAssignment_1"


    // $ANTLR start "rule__StartTransition__ActionAssignment_3"
    // InternalInteractiontxt.g:5509:1: rule__StartTransition__ActionAssignment_3 : ( ruleAction ) ;
    public final void rule__StartTransition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5513:1: ( ( ruleAction ) )
            // InternalInteractiontxt.g:5514:2: ( ruleAction )
            {
            // InternalInteractiontxt.g:5514:2: ( ruleAction )
            // InternalInteractiontxt.g:5515:3: ruleAction
            {
             before(grammarAccess.getStartTransitionAccess().getActionActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStartTransitionAccess().getActionActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTransition__ActionAssignment_3"


    // $ANTLR start "rule__Transition__ActionAssignment_1"
    // InternalInteractiontxt.g:5524:1: rule__Transition__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__Transition__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5528:1: ( ( ruleAction ) )
            // InternalInteractiontxt.g:5529:2: ( ruleAction )
            {
            // InternalInteractiontxt.g:5529:2: ( ruleAction )
            // InternalInteractiontxt.g:5530:3: ruleAction
            {
             before(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionAssignment_1"


    // $ANTLR start "rule__Action__IdAssignment_2"
    // InternalInteractiontxt.g:5539:1: rule__Action__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Action__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5543:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5544:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5544:2: ( ruleEString )
            // InternalInteractiontxt.g:5545:3: ruleEString
            {
             before(grammarAccess.getActionAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__IdAssignment_2"


    // $ANTLR start "rule__Action__ElementsAssignment_4"
    // InternalInteractiontxt.g:5554:1: rule__Action__ElementsAssignment_4 : ( ruleAElement ) ;
    public final void rule__Action__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5558:1: ( ( ruleAElement ) )
            // InternalInteractiontxt.g:5559:2: ( ruleAElement )
            {
            // InternalInteractiontxt.g:5559:2: ( ruleAElement )
            // InternalInteractiontxt.g:5560:3: ruleAElement
            {
             before(grammarAccess.getActionAccess().getElementsAElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAElement();

            state._fsp--;

             after(grammarAccess.getActionAccess().getElementsAElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ElementsAssignment_4"


    // $ANTLR start "rule__Action__TransitionAssignment_6"
    // InternalInteractiontxt.g:5569:1: rule__Action__TransitionAssignment_6 : ( ruleTransition ) ;
    public final void rule__Action__TransitionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5573:1: ( ( ruleTransition ) )
            // InternalInteractiontxt.g:5574:2: ( ruleTransition )
            {
            // InternalInteractiontxt.g:5574:2: ( ruleTransition )
            // InternalInteractiontxt.g:5575:3: ruleTransition
            {
             before(grammarAccess.getActionAccess().getTransitionTransitionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getActionAccess().getTransitionTransitionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TransitionAssignment_6"


    // $ANTLR start "rule__CIElement__IsNegativeAssignment_1_0"
    // InternalInteractiontxt.g:5584:1: rule__CIElement__IsNegativeAssignment_1_0 : ( ( 'not' ) ) ;
    public final void rule__CIElement__IsNegativeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5588:1: ( ( ( 'not' ) ) )
            // InternalInteractiontxt.g:5589:2: ( ( 'not' ) )
            {
            // InternalInteractiontxt.g:5589:2: ( ( 'not' ) )
            // InternalInteractiontxt.g:5590:3: ( 'not' )
            {
             before(grammarAccess.getCIElementAccess().getIsNegativeNotKeyword_1_0_0()); 
            // InternalInteractiontxt.g:5591:3: ( 'not' )
            // InternalInteractiontxt.g:5592:4: 'not'
            {
             before(grammarAccess.getCIElementAccess().getIsNegativeNotKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCIElementAccess().getIsNegativeNotKeyword_1_0_0()); 

            }

             after(grammarAccess.getCIElementAccess().getIsNegativeNotKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__IsNegativeAssignment_1_0"


    // $ANTLR start "rule__CIElement__IsFocusAssignment_1_1"
    // InternalInteractiontxt.g:5603:1: rule__CIElement__IsFocusAssignment_1_1 : ( ( 'focus' ) ) ;
    public final void rule__CIElement__IsFocusAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5607:1: ( ( ( 'focus' ) ) )
            // InternalInteractiontxt.g:5608:2: ( ( 'focus' ) )
            {
            // InternalInteractiontxt.g:5608:2: ( ( 'focus' ) )
            // InternalInteractiontxt.g:5609:3: ( 'focus' )
            {
             before(grammarAccess.getCIElementAccess().getIsFocusFocusKeyword_1_1_0()); 
            // InternalInteractiontxt.g:5610:3: ( 'focus' )
            // InternalInteractiontxt.g:5611:4: 'focus'
            {
             before(grammarAccess.getCIElementAccess().getIsFocusFocusKeyword_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCIElementAccess().getIsFocusFocusKeyword_1_1_0()); 

            }

             after(grammarAccess.getCIElementAccess().getIsFocusFocusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__IsFocusAssignment_1_1"


    // $ANTLR start "rule__CIElement__IdAssignment_3"
    // InternalInteractiontxt.g:5622:1: rule__CIElement__IdAssignment_3 : ( ruleEString ) ;
    public final void rule__CIElement__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5626:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5627:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5627:2: ( ruleEString )
            // InternalInteractiontxt.g:5628:3: ruleEString
            {
             before(grammarAccess.getCIElementAccess().getIdEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCIElementAccess().getIdEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__IdAssignment_3"


    // $ANTLR start "rule__CIElement__ValueAssignment_5_2_0_1"
    // InternalInteractiontxt.g:5637:1: rule__CIElement__ValueAssignment_5_2_0_1 : ( ruleEString ) ;
    public final void rule__CIElement__ValueAssignment_5_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5641:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5642:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5642:2: ( ruleEString )
            // InternalInteractiontxt.g:5643:3: ruleEString
            {
             before(grammarAccess.getCIElementAccess().getValueEStringParserRuleCall_5_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCIElementAccess().getValueEStringParserRuleCall_5_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__ValueAssignment_5_2_0_1"


    // $ANTLR start "rule__CIElement__OperationAssignment_5_2_0_2"
    // InternalInteractiontxt.g:5652:1: rule__CIElement__OperationAssignment_5_2_0_2 : ( ( '\"' ) ) ;
    public final void rule__CIElement__OperationAssignment_5_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5656:1: ( ( ( '\"' ) ) )
            // InternalInteractiontxt.g:5657:2: ( ( '\"' ) )
            {
            // InternalInteractiontxt.g:5657:2: ( ( '\"' ) )
            // InternalInteractiontxt.g:5658:3: ( '\"' )
            {
             before(grammarAccess.getCIElementAccess().getOperationQuotationMarkKeyword_5_2_0_2_0()); 
            // InternalInteractiontxt.g:5659:3: ( '\"' )
            // InternalInteractiontxt.g:5660:4: '\"'
            {
             before(grammarAccess.getCIElementAccess().getOperationQuotationMarkKeyword_5_2_0_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCIElementAccess().getOperationQuotationMarkKeyword_5_2_0_2_0()); 

            }

             after(grammarAccess.getCIElementAccess().getOperationQuotationMarkKeyword_5_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__OperationAssignment_5_2_0_2"


    // $ANTLR start "rule__CIElement__ValueAssignment_5_2_1"
    // InternalInteractiontxt.g:5671:1: rule__CIElement__ValueAssignment_5_2_1 : ( ( rule__CIElement__ValueAlternatives_5_2_1_0 ) ) ;
    public final void rule__CIElement__ValueAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5675:1: ( ( ( rule__CIElement__ValueAlternatives_5_2_1_0 ) ) )
            // InternalInteractiontxt.g:5676:2: ( ( rule__CIElement__ValueAlternatives_5_2_1_0 ) )
            {
            // InternalInteractiontxt.g:5676:2: ( ( rule__CIElement__ValueAlternatives_5_2_1_0 ) )
            // InternalInteractiontxt.g:5677:3: ( rule__CIElement__ValueAlternatives_5_2_1_0 )
            {
             before(grammarAccess.getCIElementAccess().getValueAlternatives_5_2_1_0()); 
            // InternalInteractiontxt.g:5678:3: ( rule__CIElement__ValueAlternatives_5_2_1_0 )
            // InternalInteractiontxt.g:5678:4: rule__CIElement__ValueAlternatives_5_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CIElement__ValueAlternatives_5_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCIElementAccess().getValueAlternatives_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIElement__ValueAssignment_5_2_1"


    // $ANTLR start "rule__CLElement__IsNegativeAssignment_1_0"
    // InternalInteractiontxt.g:5686:1: rule__CLElement__IsNegativeAssignment_1_0 : ( ( 'not' ) ) ;
    public final void rule__CLElement__IsNegativeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5690:1: ( ( ( 'not' ) ) )
            // InternalInteractiontxt.g:5691:2: ( ( 'not' ) )
            {
            // InternalInteractiontxt.g:5691:2: ( ( 'not' ) )
            // InternalInteractiontxt.g:5692:3: ( 'not' )
            {
             before(grammarAccess.getCLElementAccess().getIsNegativeNotKeyword_1_0_0()); 
            // InternalInteractiontxt.g:5693:3: ( 'not' )
            // InternalInteractiontxt.g:5694:4: 'not'
            {
             before(grammarAccess.getCLElementAccess().getIsNegativeNotKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCLElementAccess().getIsNegativeNotKeyword_1_0_0()); 

            }

             after(grammarAccess.getCLElementAccess().getIsNegativeNotKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__IsNegativeAssignment_1_0"


    // $ANTLR start "rule__CLElement__IsFocusAssignment_1_1"
    // InternalInteractiontxt.g:5705:1: rule__CLElement__IsFocusAssignment_1_1 : ( ( 'focus' ) ) ;
    public final void rule__CLElement__IsFocusAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5709:1: ( ( ( 'focus' ) ) )
            // InternalInteractiontxt.g:5710:2: ( ( 'focus' ) )
            {
            // InternalInteractiontxt.g:5710:2: ( ( 'focus' ) )
            // InternalInteractiontxt.g:5711:3: ( 'focus' )
            {
             before(grammarAccess.getCLElementAccess().getIsFocusFocusKeyword_1_1_0()); 
            // InternalInteractiontxt.g:5712:3: ( 'focus' )
            // InternalInteractiontxt.g:5713:4: 'focus'
            {
             before(grammarAccess.getCLElementAccess().getIsFocusFocusKeyword_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCLElementAccess().getIsFocusFocusKeyword_1_1_0()); 

            }

             after(grammarAccess.getCLElementAccess().getIsFocusFocusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__IsFocusAssignment_1_1"


    // $ANTLR start "rule__CLElement__IdAssignment_3"
    // InternalInteractiontxt.g:5724:1: rule__CLElement__IdAssignment_3 : ( ruleEString ) ;
    public final void rule__CLElement__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5728:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5729:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5729:2: ( ruleEString )
            // InternalInteractiontxt.g:5730:3: ruleEString
            {
             before(grammarAccess.getCLElementAccess().getIdEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCLElementAccess().getIdEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__IdAssignment_3"


    // $ANTLR start "rule__CLElement__ValueAssignment_5_2_0_1"
    // InternalInteractiontxt.g:5739:1: rule__CLElement__ValueAssignment_5_2_0_1 : ( ruleEString ) ;
    public final void rule__CLElement__ValueAssignment_5_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5743:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5744:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5744:2: ( ruleEString )
            // InternalInteractiontxt.g:5745:3: ruleEString
            {
             before(grammarAccess.getCLElementAccess().getValueEStringParserRuleCall_5_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCLElementAccess().getValueEStringParserRuleCall_5_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__ValueAssignment_5_2_0_1"


    // $ANTLR start "rule__CLElement__OperationAssignment_5_2_0_2"
    // InternalInteractiontxt.g:5754:1: rule__CLElement__OperationAssignment_5_2_0_2 : ( ( '\"' ) ) ;
    public final void rule__CLElement__OperationAssignment_5_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5758:1: ( ( ( '\"' ) ) )
            // InternalInteractiontxt.g:5759:2: ( ( '\"' ) )
            {
            // InternalInteractiontxt.g:5759:2: ( ( '\"' ) )
            // InternalInteractiontxt.g:5760:3: ( '\"' )
            {
             before(grammarAccess.getCLElementAccess().getOperationQuotationMarkKeyword_5_2_0_2_0()); 
            // InternalInteractiontxt.g:5761:3: ( '\"' )
            // InternalInteractiontxt.g:5762:4: '\"'
            {
             before(grammarAccess.getCLElementAccess().getOperationQuotationMarkKeyword_5_2_0_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCLElementAccess().getOperationQuotationMarkKeyword_5_2_0_2_0()); 

            }

             after(grammarAccess.getCLElementAccess().getOperationQuotationMarkKeyword_5_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__OperationAssignment_5_2_0_2"


    // $ANTLR start "rule__CLElement__ValueAssignment_5_2_1"
    // InternalInteractiontxt.g:5773:1: rule__CLElement__ValueAssignment_5_2_1 : ( ( rule__CLElement__ValueAlternatives_5_2_1_0 ) ) ;
    public final void rule__CLElement__ValueAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5777:1: ( ( ( rule__CLElement__ValueAlternatives_5_2_1_0 ) ) )
            // InternalInteractiontxt.g:5778:2: ( ( rule__CLElement__ValueAlternatives_5_2_1_0 ) )
            {
            // InternalInteractiontxt.g:5778:2: ( ( rule__CLElement__ValueAlternatives_5_2_1_0 ) )
            // InternalInteractiontxt.g:5779:3: ( rule__CLElement__ValueAlternatives_5_2_1_0 )
            {
             before(grammarAccess.getCLElementAccess().getValueAlternatives_5_2_1_0()); 
            // InternalInteractiontxt.g:5780:3: ( rule__CLElement__ValueAlternatives_5_2_1_0 )
            // InternalInteractiontxt.g:5780:4: rule__CLElement__ValueAlternatives_5_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CLElement__ValueAlternatives_5_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCLElementAccess().getValueAlternatives_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLElement__ValueAssignment_5_2_1"


    // $ANTLR start "rule__CCanvas__IsNegativeAssignment_1_0"
    // InternalInteractiontxt.g:5788:1: rule__CCanvas__IsNegativeAssignment_1_0 : ( ( 'not' ) ) ;
    public final void rule__CCanvas__IsNegativeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5792:1: ( ( ( 'not' ) ) )
            // InternalInteractiontxt.g:5793:2: ( ( 'not' ) )
            {
            // InternalInteractiontxt.g:5793:2: ( ( 'not' ) )
            // InternalInteractiontxt.g:5794:3: ( 'not' )
            {
             before(grammarAccess.getCCanvasAccess().getIsNegativeNotKeyword_1_0_0()); 
            // InternalInteractiontxt.g:5795:3: ( 'not' )
            // InternalInteractiontxt.g:5796:4: 'not'
            {
             before(grammarAccess.getCCanvasAccess().getIsNegativeNotKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCCanvasAccess().getIsNegativeNotKeyword_1_0_0()); 

            }

             after(grammarAccess.getCCanvasAccess().getIsNegativeNotKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__IsNegativeAssignment_1_0"


    // $ANTLR start "rule__CCanvas__IsFocusAssignment_1_1"
    // InternalInteractiontxt.g:5807:1: rule__CCanvas__IsFocusAssignment_1_1 : ( ( 'focus' ) ) ;
    public final void rule__CCanvas__IsFocusAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5811:1: ( ( ( 'focus' ) ) )
            // InternalInteractiontxt.g:5812:2: ( ( 'focus' ) )
            {
            // InternalInteractiontxt.g:5812:2: ( ( 'focus' ) )
            // InternalInteractiontxt.g:5813:3: ( 'focus' )
            {
             before(grammarAccess.getCCanvasAccess().getIsFocusFocusKeyword_1_1_0()); 
            // InternalInteractiontxt.g:5814:3: ( 'focus' )
            // InternalInteractiontxt.g:5815:4: 'focus'
            {
             before(grammarAccess.getCCanvasAccess().getIsFocusFocusKeyword_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCCanvasAccess().getIsFocusFocusKeyword_1_1_0()); 

            }

             after(grammarAccess.getCCanvasAccess().getIsFocusFocusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__IsFocusAssignment_1_1"


    // $ANTLR start "rule__CCanvas__ValueAssignment_4_2"
    // InternalInteractiontxt.g:5826:1: rule__CCanvas__ValueAssignment_4_2 : ( ruleEString ) ;
    public final void rule__CCanvas__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5830:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5831:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5831:2: ( ruleEString )
            // InternalInteractiontxt.g:5832:3: ruleEString
            {
             before(grammarAccess.getCCanvasAccess().getValueEStringParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCCanvasAccess().getValueEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CCanvas__ValueAssignment_4_2"


    // $ANTLR start "rule__CVElement__IsNegativeAssignment_1_0"
    // InternalInteractiontxt.g:5841:1: rule__CVElement__IsNegativeAssignment_1_0 : ( ( 'not' ) ) ;
    public final void rule__CVElement__IsNegativeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5845:1: ( ( ( 'not' ) ) )
            // InternalInteractiontxt.g:5846:2: ( ( 'not' ) )
            {
            // InternalInteractiontxt.g:5846:2: ( ( 'not' ) )
            // InternalInteractiontxt.g:5847:3: ( 'not' )
            {
             before(grammarAccess.getCVElementAccess().getIsNegativeNotKeyword_1_0_0()); 
            // InternalInteractiontxt.g:5848:3: ( 'not' )
            // InternalInteractiontxt.g:5849:4: 'not'
            {
             before(grammarAccess.getCVElementAccess().getIsNegativeNotKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getIsNegativeNotKeyword_1_0_0()); 

            }

             after(grammarAccess.getCVElementAccess().getIsNegativeNotKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__IsNegativeAssignment_1_0"


    // $ANTLR start "rule__CVElement__IsFocusAssignment_1_1"
    // InternalInteractiontxt.g:5860:1: rule__CVElement__IsFocusAssignment_1_1 : ( ( 'focus' ) ) ;
    public final void rule__CVElement__IsFocusAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5864:1: ( ( ( 'focus' ) ) )
            // InternalInteractiontxt.g:5865:2: ( ( 'focus' ) )
            {
            // InternalInteractiontxt.g:5865:2: ( ( 'focus' ) )
            // InternalInteractiontxt.g:5866:3: ( 'focus' )
            {
             before(grammarAccess.getCVElementAccess().getIsFocusFocusKeyword_1_1_0()); 
            // InternalInteractiontxt.g:5867:3: ( 'focus' )
            // InternalInteractiontxt.g:5868:4: 'focus'
            {
             before(grammarAccess.getCVElementAccess().getIsFocusFocusKeyword_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCVElementAccess().getIsFocusFocusKeyword_1_1_0()); 

            }

             after(grammarAccess.getCVElementAccess().getIsFocusFocusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__IsFocusAssignment_1_1"


    // $ANTLR start "rule__CVElement__IdAssignment_3"
    // InternalInteractiontxt.g:5879:1: rule__CVElement__IdAssignment_3 : ( ruleEString ) ;
    public final void rule__CVElement__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5883:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5884:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5884:2: ( ruleEString )
            // InternalInteractiontxt.g:5885:3: ruleEString
            {
             before(grammarAccess.getCVElementAccess().getIdEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCVElementAccess().getIdEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__IdAssignment_3"


    // $ANTLR start "rule__CVElement__ValueAssignment_5_0_2_0"
    // InternalInteractiontxt.g:5894:1: rule__CVElement__ValueAssignment_5_0_2_0 : ( ( rule__CVElement__ValueAlternatives_5_0_2_0_0 ) ) ;
    public final void rule__CVElement__ValueAssignment_5_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5898:1: ( ( ( rule__CVElement__ValueAlternatives_5_0_2_0_0 ) ) )
            // InternalInteractiontxt.g:5899:2: ( ( rule__CVElement__ValueAlternatives_5_0_2_0_0 ) )
            {
            // InternalInteractiontxt.g:5899:2: ( ( rule__CVElement__ValueAlternatives_5_0_2_0_0 ) )
            // InternalInteractiontxt.g:5900:3: ( rule__CVElement__ValueAlternatives_5_0_2_0_0 )
            {
             before(grammarAccess.getCVElementAccess().getValueAlternatives_5_0_2_0_0()); 
            // InternalInteractiontxt.g:5901:3: ( rule__CVElement__ValueAlternatives_5_0_2_0_0 )
            // InternalInteractiontxt.g:5901:4: rule__CVElement__ValueAlternatives_5_0_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CVElement__ValueAlternatives_5_0_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCVElementAccess().getValueAlternatives_5_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__ValueAssignment_5_0_2_0"


    // $ANTLR start "rule__CVElement__ValueAssignment_5_0_2_1_1"
    // InternalInteractiontxt.g:5909:1: rule__CVElement__ValueAssignment_5_0_2_1_1 : ( ruleEString ) ;
    public final void rule__CVElement__ValueAssignment_5_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5913:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5914:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5914:2: ( ruleEString )
            // InternalInteractiontxt.g:5915:3: ruleEString
            {
             before(grammarAccess.getCVElementAccess().getValueEStringParserRuleCall_5_0_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCVElementAccess().getValueEStringParserRuleCall_5_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__ValueAssignment_5_0_2_1_1"


    // $ANTLR start "rule__CVElement__ElementAssignment_5_0_3_3"
    // InternalInteractiontxt.g:5924:1: rule__CVElement__ElementAssignment_5_0_3_3 : ( ( ruleEString ) ) ;
    public final void rule__CVElement__ElementAssignment_5_0_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5928:1: ( ( ( ruleEString ) ) )
            // InternalInteractiontxt.g:5929:2: ( ( ruleEString ) )
            {
            // InternalInteractiontxt.g:5929:2: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5930:3: ( ruleEString )
            {
             before(grammarAccess.getCVElementAccess().getElementCAElementCrossReference_5_0_3_3_0()); 
            // InternalInteractiontxt.g:5931:3: ( ruleEString )
            // InternalInteractiontxt.g:5932:4: ruleEString
            {
             before(grammarAccess.getCVElementAccess().getElementCAElementEStringParserRuleCall_5_0_3_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCVElementAccess().getElementCAElementEStringParserRuleCall_5_0_3_3_0_1()); 

            }

             after(grammarAccess.getCVElementAccess().getElementCAElementCrossReference_5_0_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__ElementAssignment_5_0_3_3"


    // $ANTLR start "rule__CVElement__ElementAssignment_5_1_2"
    // InternalInteractiontxt.g:5943:1: rule__CVElement__ElementAssignment_5_1_2 : ( ( ruleEString ) ) ;
    public final void rule__CVElement__ElementAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5947:1: ( ( ( ruleEString ) ) )
            // InternalInteractiontxt.g:5948:2: ( ( ruleEString ) )
            {
            // InternalInteractiontxt.g:5948:2: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5949:3: ( ruleEString )
            {
             before(grammarAccess.getCVElementAccess().getElementCAElementCrossReference_5_1_2_0()); 
            // InternalInteractiontxt.g:5950:3: ( ruleEString )
            // InternalInteractiontxt.g:5951:4: ruleEString
            {
             before(grammarAccess.getCVElementAccess().getElementCAElementEStringParserRuleCall_5_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCVElementAccess().getElementCAElementEStringParserRuleCall_5_1_2_0_1()); 

            }

             after(grammarAccess.getCVElementAccess().getElementCAElementCrossReference_5_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CVElement__ElementAssignment_5_1_2"


    // $ANTLR start "rule__AIElement__IdAssignment_2"
    // InternalInteractiontxt.g:5962:1: rule__AIElement__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__AIElement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5966:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5967:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5967:2: ( ruleEString )
            // InternalInteractiontxt.g:5968:3: ruleEString
            {
             before(grammarAccess.getAIElementAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAIElementAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__IdAssignment_2"


    // $ANTLR start "rule__AIElement__ValueAssignment_4_3"
    // InternalInteractiontxt.g:5977:1: rule__AIElement__ValueAssignment_4_3 : ( ruleEString ) ;
    public final void rule__AIElement__ValueAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5981:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5982:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5982:2: ( ruleEString )
            // InternalInteractiontxt.g:5983:3: ruleEString
            {
             before(grammarAccess.getAIElementAccess().getValueEStringParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAIElementAccess().getValueEStringParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIElement__ValueAssignment_4_3"


    // $ANTLR start "rule__AOElement__OperationAssignment_2"
    // InternalInteractiontxt.g:5992:1: rule__AOElement__OperationAssignment_2 : ( ruleEString ) ;
    public final void rule__AOElement__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:5996:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:5997:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:5997:2: ( ruleEString )
            // InternalInteractiontxt.g:5998:3: ruleEString
            {
             before(grammarAccess.getAOElementAccess().getOperationEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAOElementAccess().getOperationEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__OperationAssignment_2"


    // $ANTLR start "rule__AOElement__ValueAssignment_4_2_0"
    // InternalInteractiontxt.g:6007:1: rule__AOElement__ValueAssignment_4_2_0 : ( ( rule__AOElement__ValueAlternatives_4_2_0_0 ) ) ;
    public final void rule__AOElement__ValueAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6011:1: ( ( ( rule__AOElement__ValueAlternatives_4_2_0_0 ) ) )
            // InternalInteractiontxt.g:6012:2: ( ( rule__AOElement__ValueAlternatives_4_2_0_0 ) )
            {
            // InternalInteractiontxt.g:6012:2: ( ( rule__AOElement__ValueAlternatives_4_2_0_0 ) )
            // InternalInteractiontxt.g:6013:3: ( rule__AOElement__ValueAlternatives_4_2_0_0 )
            {
             before(grammarAccess.getAOElementAccess().getValueAlternatives_4_2_0_0()); 
            // InternalInteractiontxt.g:6014:3: ( rule__AOElement__ValueAlternatives_4_2_0_0 )
            // InternalInteractiontxt.g:6014:4: rule__AOElement__ValueAlternatives_4_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AOElement__ValueAlternatives_4_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAOElementAccess().getValueAlternatives_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__ValueAssignment_4_2_0"


    // $ANTLR start "rule__AOElement__ValueAssignment_4_2_1_1"
    // InternalInteractiontxt.g:6022:1: rule__AOElement__ValueAssignment_4_2_1_1 : ( ruleEString ) ;
    public final void rule__AOElement__ValueAssignment_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6026:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:6027:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:6027:2: ( ruleEString )
            // InternalInteractiontxt.g:6028:3: ruleEString
            {
             before(grammarAccess.getAOElementAccess().getValueEStringParserRuleCall_4_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAOElementAccess().getValueEStringParserRuleCall_4_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AOElement__ValueAssignment_4_2_1_1"


    // $ANTLR start "rule__ALElement__IdAssignment_2"
    // InternalInteractiontxt.g:6037:1: rule__ALElement__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__ALElement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6041:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:6042:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:6042:2: ( ruleEString )
            // InternalInteractiontxt.g:6043:3: ruleEString
            {
             before(grammarAccess.getALElementAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getALElementAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__IdAssignment_2"


    // $ANTLR start "rule__ALElement__OperationAssignment_4_0_2"
    // InternalInteractiontxt.g:6052:1: rule__ALElement__OperationAssignment_4_0_2 : ( ( rule__ALElement__OperationAlternatives_4_0_2_0 ) ) ;
    public final void rule__ALElement__OperationAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6056:1: ( ( ( rule__ALElement__OperationAlternatives_4_0_2_0 ) ) )
            // InternalInteractiontxt.g:6057:2: ( ( rule__ALElement__OperationAlternatives_4_0_2_0 ) )
            {
            // InternalInteractiontxt.g:6057:2: ( ( rule__ALElement__OperationAlternatives_4_0_2_0 ) )
            // InternalInteractiontxt.g:6058:3: ( rule__ALElement__OperationAlternatives_4_0_2_0 )
            {
             before(grammarAccess.getALElementAccess().getOperationAlternatives_4_0_2_0()); 
            // InternalInteractiontxt.g:6059:3: ( rule__ALElement__OperationAlternatives_4_0_2_0 )
            // InternalInteractiontxt.g:6059:4: rule__ALElement__OperationAlternatives_4_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__OperationAlternatives_4_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getOperationAlternatives_4_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__OperationAssignment_4_0_2"


    // $ANTLR start "rule__ALElement__ValueAssignment_4_0_3_3_0_1"
    // InternalInteractiontxt.g:6067:1: rule__ALElement__ValueAssignment_4_0_3_3_0_1 : ( ( rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0 ) ) ;
    public final void rule__ALElement__ValueAssignment_4_0_3_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6071:1: ( ( ( rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0 ) ) )
            // InternalInteractiontxt.g:6072:2: ( ( rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0 ) )
            {
            // InternalInteractiontxt.g:6072:2: ( ( rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0 ) )
            // InternalInteractiontxt.g:6073:3: ( rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0 )
            {
             before(grammarAccess.getALElementAccess().getValueAlternatives_4_0_3_3_0_1_0()); 
            // InternalInteractiontxt.g:6074:3: ( rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0 )
            // InternalInteractiontxt.g:6074:4: rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__ValueAlternatives_4_0_3_3_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getValueAlternatives_4_0_3_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__ValueAssignment_4_0_3_3_0_1"


    // $ANTLR start "rule__ALElement__ValueAssignment_4_0_3_3_0_2_1"
    // InternalInteractiontxt.g:6082:1: rule__ALElement__ValueAssignment_4_0_3_3_0_2_1 : ( ( rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0 ) ) ;
    public final void rule__ALElement__ValueAssignment_4_0_3_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6086:1: ( ( ( rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0 ) ) )
            // InternalInteractiontxt.g:6087:2: ( ( rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0 ) )
            {
            // InternalInteractiontxt.g:6087:2: ( ( rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0 ) )
            // InternalInteractiontxt.g:6088:3: ( rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0 )
            {
             before(grammarAccess.getALElementAccess().getValueAlternatives_4_0_3_3_0_2_1_0()); 
            // InternalInteractiontxt.g:6089:3: ( rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0 )
            // InternalInteractiontxt.g:6089:4: rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__ValueAlternatives_4_0_3_3_0_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getValueAlternatives_4_0_3_3_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__ValueAssignment_4_0_3_3_0_2_1"


    // $ANTLR start "rule__ALElement__ValueAssignment_4_0_3_3_1"
    // InternalInteractiontxt.g:6097:1: rule__ALElement__ValueAssignment_4_0_3_3_1 : ( ( rule__ALElement__ValueAlternatives_4_0_3_3_1_0 ) ) ;
    public final void rule__ALElement__ValueAssignment_4_0_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6101:1: ( ( ( rule__ALElement__ValueAlternatives_4_0_3_3_1_0 ) ) )
            // InternalInteractiontxt.g:6102:2: ( ( rule__ALElement__ValueAlternatives_4_0_3_3_1_0 ) )
            {
            // InternalInteractiontxt.g:6102:2: ( ( rule__ALElement__ValueAlternatives_4_0_3_3_1_0 ) )
            // InternalInteractiontxt.g:6103:3: ( rule__ALElement__ValueAlternatives_4_0_3_3_1_0 )
            {
             before(grammarAccess.getALElementAccess().getValueAlternatives_4_0_3_3_1_0()); 
            // InternalInteractiontxt.g:6104:3: ( rule__ALElement__ValueAlternatives_4_0_3_3_1_0 )
            // InternalInteractiontxt.g:6104:4: rule__ALElement__ValueAlternatives_4_0_3_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ALElement__ValueAlternatives_4_0_3_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getALElementAccess().getValueAlternatives_4_0_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__ValueAssignment_4_0_3_3_1"


    // $ANTLR start "rule__ALElement__ValueAssignment_4_1_3"
    // InternalInteractiontxt.g:6112:1: rule__ALElement__ValueAssignment_4_1_3 : ( ruleEString ) ;
    public final void rule__ALElement__ValueAssignment_4_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6116:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:6117:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:6117:2: ( ruleEString )
            // InternalInteractiontxt.g:6118:3: ruleEString
            {
             before(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ALElement__ValueAssignment_4_1_3"


    // $ANTLR start "rule__ACanvas__ValueAssignment_3_3"
    // InternalInteractiontxt.g:6127:1: rule__ACanvas__ValueAssignment_3_3 : ( ruleEString ) ;
    public final void rule__ACanvas__ValueAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6131:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:6132:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:6132:2: ( ruleEString )
            // InternalInteractiontxt.g:6133:3: ruleEString
            {
             before(grammarAccess.getACanvasAccess().getValueEStringParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getACanvasAccess().getValueEStringParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACanvas__ValueAssignment_3_3"


    // $ANTLR start "rule__AVElement__IdAssignment_2"
    // InternalInteractiontxt.g:6142:1: rule__AVElement__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__AVElement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6146:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:6147:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:6147:2: ( ruleEString )
            // InternalInteractiontxt.g:6148:3: ruleEString
            {
             before(grammarAccess.getAVElementAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAVElementAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__IdAssignment_2"


    // $ANTLR start "rule__AVElement__OperationAssignment_4_0_2"
    // InternalInteractiontxt.g:6157:1: rule__AVElement__OperationAssignment_4_0_2 : ( ( rule__AVElement__OperationAlternatives_4_0_2_0 ) ) ;
    public final void rule__AVElement__OperationAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6161:1: ( ( ( rule__AVElement__OperationAlternatives_4_0_2_0 ) ) )
            // InternalInteractiontxt.g:6162:2: ( ( rule__AVElement__OperationAlternatives_4_0_2_0 ) )
            {
            // InternalInteractiontxt.g:6162:2: ( ( rule__AVElement__OperationAlternatives_4_0_2_0 ) )
            // InternalInteractiontxt.g:6163:3: ( rule__AVElement__OperationAlternatives_4_0_2_0 )
            {
             before(grammarAccess.getAVElementAccess().getOperationAlternatives_4_0_2_0()); 
            // InternalInteractiontxt.g:6164:3: ( rule__AVElement__OperationAlternatives_4_0_2_0 )
            // InternalInteractiontxt.g:6164:4: rule__AVElement__OperationAlternatives_4_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__OperationAlternatives_4_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getOperationAlternatives_4_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__OperationAssignment_4_0_2"


    // $ANTLR start "rule__AVElement__ValueAssignment_4_0_6"
    // InternalInteractiontxt.g:6172:1: rule__AVElement__ValueAssignment_4_0_6 : ( ( rule__AVElement__ValueAlternatives_4_0_6_0 ) ) ;
    public final void rule__AVElement__ValueAssignment_4_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6176:1: ( ( ( rule__AVElement__ValueAlternatives_4_0_6_0 ) ) )
            // InternalInteractiontxt.g:6177:2: ( ( rule__AVElement__ValueAlternatives_4_0_6_0 ) )
            {
            // InternalInteractiontxt.g:6177:2: ( ( rule__AVElement__ValueAlternatives_4_0_6_0 ) )
            // InternalInteractiontxt.g:6178:3: ( rule__AVElement__ValueAlternatives_4_0_6_0 )
            {
             before(grammarAccess.getAVElementAccess().getValueAlternatives_4_0_6_0()); 
            // InternalInteractiontxt.g:6179:3: ( rule__AVElement__ValueAlternatives_4_0_6_0 )
            // InternalInteractiontxt.g:6179:4: rule__AVElement__ValueAlternatives_4_0_6_0
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__ValueAlternatives_4_0_6_0();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getValueAlternatives_4_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__ValueAssignment_4_0_6"


    // $ANTLR start "rule__AVElement__ValueAssignment_4_1_2_0_1"
    // InternalInteractiontxt.g:6187:1: rule__AVElement__ValueAssignment_4_1_2_0_1 : ( ruleEString ) ;
    public final void rule__AVElement__ValueAssignment_4_1_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6191:1: ( ( ruleEString ) )
            // InternalInteractiontxt.g:6192:2: ( ruleEString )
            {
            // InternalInteractiontxt.g:6192:2: ( ruleEString )
            // InternalInteractiontxt.g:6193:3: ruleEString
            {
             before(grammarAccess.getAVElementAccess().getValueEStringParserRuleCall_4_1_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAVElementAccess().getValueEStringParserRuleCall_4_1_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__ValueAssignment_4_1_2_0_1"


    // $ANTLR start "rule__AVElement__OperationAssignment_4_1_2_0_2"
    // InternalInteractiontxt.g:6202:1: rule__AVElement__OperationAssignment_4_1_2_0_2 : ( ( '\"' ) ) ;
    public final void rule__AVElement__OperationAssignment_4_1_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6206:1: ( ( ( '\"' ) ) )
            // InternalInteractiontxt.g:6207:2: ( ( '\"' ) )
            {
            // InternalInteractiontxt.g:6207:2: ( ( '\"' ) )
            // InternalInteractiontxt.g:6208:3: ( '\"' )
            {
             before(grammarAccess.getAVElementAccess().getOperationQuotationMarkKeyword_4_1_2_0_2_0()); 
            // InternalInteractiontxt.g:6209:3: ( '\"' )
            // InternalInteractiontxt.g:6210:4: '\"'
            {
             before(grammarAccess.getAVElementAccess().getOperationQuotationMarkKeyword_4_1_2_0_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAVElementAccess().getOperationQuotationMarkKeyword_4_1_2_0_2_0()); 

            }

             after(grammarAccess.getAVElementAccess().getOperationQuotationMarkKeyword_4_1_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__OperationAssignment_4_1_2_0_2"


    // $ANTLR start "rule__AVElement__ValueAssignment_4_1_2_1"
    // InternalInteractiontxt.g:6221:1: rule__AVElement__ValueAssignment_4_1_2_1 : ( ( rule__AVElement__ValueAlternatives_4_1_2_1_0 ) ) ;
    public final void rule__AVElement__ValueAssignment_4_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6225:1: ( ( ( rule__AVElement__ValueAlternatives_4_1_2_1_0 ) ) )
            // InternalInteractiontxt.g:6226:2: ( ( rule__AVElement__ValueAlternatives_4_1_2_1_0 ) )
            {
            // InternalInteractiontxt.g:6226:2: ( ( rule__AVElement__ValueAlternatives_4_1_2_1_0 ) )
            // InternalInteractiontxt.g:6227:3: ( rule__AVElement__ValueAlternatives_4_1_2_1_0 )
            {
             before(grammarAccess.getAVElementAccess().getValueAlternatives_4_1_2_1_0()); 
            // InternalInteractiontxt.g:6228:3: ( rule__AVElement__ValueAlternatives_4_1_2_1_0 )
            // InternalInteractiontxt.g:6228:4: rule__AVElement__ValueAlternatives_4_1_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AVElement__ValueAlternatives_4_1_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAVElementAccess().getValueAlternatives_4_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__ValueAssignment_4_1_2_1"


    // $ANTLR start "rule__AVElement__ElementAssignment_4_2_2"
    // InternalInteractiontxt.g:6236:1: rule__AVElement__ElementAssignment_4_2_2 : ( ( ruleEString ) ) ;
    public final void rule__AVElement__ElementAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInteractiontxt.g:6240:1: ( ( ( ruleEString ) ) )
            // InternalInteractiontxt.g:6241:2: ( ( ruleEString ) )
            {
            // InternalInteractiontxt.g:6241:2: ( ( ruleEString ) )
            // InternalInteractiontxt.g:6242:3: ( ruleEString )
            {
             before(grammarAccess.getAVElementAccess().getElementCAElementCrossReference_4_2_2_0()); 
            // InternalInteractiontxt.g:6243:3: ( ruleEString )
            // InternalInteractiontxt.g:6244:4: ruleEString
            {
             before(grammarAccess.getAVElementAccess().getElementCAElementEStringParserRuleCall_4_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAVElementAccess().getElementCAElementEStringParserRuleCall_4_2_2_0_1()); 

            }

             after(grammarAccess.getAVElementAccess().getElementCAElementCrossReference_4_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AVElement__ElementAssignment_4_2_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000301C420000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000301C400002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000009C420000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000009C400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000430L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000301C400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040820000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100820000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000430L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000009C400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000140820000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});

}