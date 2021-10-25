package ca.udem.iro.geodes.interaction.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ca.udem.iro.geodes.interaction.services.InteractiontxtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInteractiontxtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InteractionRule'", "'Condition'", "'{'", "'}'", "'---'", "'-->'", "'----->'", "'Effect'", "'not'", "'focus'", "'Interface'", "'value'", "'='", "'\"'", "'focusElement'", "'Lang'", "'Canvas'", "'Var'", "','", "'element'", "'Operation'", "'op'", "'add'", "'rem'", "'['", "']'", "'copy'", "'from'"
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

        public InternalInteractiontxtParser(TokenStream input, InteractiontxtGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected InteractiontxtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalInteractiontxt.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalInteractiontxt.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalInteractiontxt.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalInteractiontxt.g:71:1: ruleModel returns [EObject current=null] : ( (lv_interactions_0_0= ruleInteraction ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_interactions_0_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:77:2: ( ( (lv_interactions_0_0= ruleInteraction ) )* )
            // InternalInteractiontxt.g:78:2: ( (lv_interactions_0_0= ruleInteraction ) )*
            {
            // InternalInteractiontxt.g:78:2: ( (lv_interactions_0_0= ruleInteraction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalInteractiontxt.g:79:3: (lv_interactions_0_0= ruleInteraction )
            	    {
            	    // InternalInteractiontxt.g:79:3: (lv_interactions_0_0= ruleInteraction )
            	    // InternalInteractiontxt.g:80:4: lv_interactions_0_0= ruleInteraction
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getInteractionsInteractionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_interactions_0_0=ruleInteraction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"interactions",
            	    					lv_interactions_0_0,
            	    					"ca.udem.iro.geodes.interaction.Interactiontxt.Interaction");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCElement"
    // InternalInteractiontxt.g:100:1: entryRuleCElement returns [EObject current=null] : iv_ruleCElement= ruleCElement EOF ;
    public final EObject entryRuleCElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCElement = null;


        try {
            // InternalInteractiontxt.g:100:49: (iv_ruleCElement= ruleCElement EOF )
            // InternalInteractiontxt.g:101:2: iv_ruleCElement= ruleCElement EOF
            {
             newCompositeNode(grammarAccess.getCElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCElement=ruleCElement();

            state._fsp--;

             current =iv_ruleCElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCElement"


    // $ANTLR start "ruleCElement"
    // InternalInteractiontxt.g:107:1: ruleCElement returns [EObject current=null] : (this_CIElement_0= ruleCIElement | this_CLElement_1= ruleCLElement | this_CVElement_2= ruleCVElement | this_CCanvas_3= ruleCCanvas ) ;
    public final EObject ruleCElement() throws RecognitionException {
        EObject current = null;

        EObject this_CIElement_0 = null;

        EObject this_CLElement_1 = null;

        EObject this_CVElement_2 = null;

        EObject this_CCanvas_3 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:113:2: ( (this_CIElement_0= ruleCIElement | this_CLElement_1= ruleCLElement | this_CVElement_2= ruleCVElement | this_CCanvas_3= ruleCCanvas ) )
            // InternalInteractiontxt.g:114:2: (this_CIElement_0= ruleCIElement | this_CLElement_1= ruleCLElement | this_CVElement_2= ruleCVElement | this_CCanvas_3= ruleCCanvas )
            {
            // InternalInteractiontxt.g:114:2: (this_CIElement_0= ruleCIElement | this_CLElement_1= ruleCLElement | this_CVElement_2= ruleCVElement | this_CCanvas_3= ruleCCanvas )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt2=3;
                    }
                    break;
                case 20:
                    {
                    alt2=1;
                    }
                    break;
                case 26:
                    {
                    alt2=4;
                    }
                    break;
                case 25:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 19:
                {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt2=2;
                    }
                    break;
                case 27:
                    {
                    alt2=3;
                    }
                    break;
                case 20:
                    {
                    alt2=1;
                    }
                    break;
                case 26:
                    {
                    alt2=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case 20:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 26:
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
                    // InternalInteractiontxt.g:115:3: this_CIElement_0= ruleCIElement
                    {

                    			newCompositeNode(grammarAccess.getCElementAccess().getCIElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CIElement_0=ruleCIElement();

                    state._fsp--;


                    			current = this_CIElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:124:3: this_CLElement_1= ruleCLElement
                    {

                    			newCompositeNode(grammarAccess.getCElementAccess().getCLElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CLElement_1=ruleCLElement();

                    state._fsp--;


                    			current = this_CLElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalInteractiontxt.g:133:3: this_CVElement_2= ruleCVElement
                    {

                    			newCompositeNode(grammarAccess.getCElementAccess().getCVElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CVElement_2=ruleCVElement();

                    state._fsp--;


                    			current = this_CVElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalInteractiontxt.g:142:3: this_CCanvas_3= ruleCCanvas
                    {

                    			newCompositeNode(grammarAccess.getCElementAccess().getCCanvasParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CCanvas_3=ruleCCanvas();

                    state._fsp--;


                    			current = this_CCanvas_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCElement"


    // $ANTLR start "entryRuleAElement"
    // InternalInteractiontxt.g:154:1: entryRuleAElement returns [EObject current=null] : iv_ruleAElement= ruleAElement EOF ;
    public final EObject entryRuleAElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAElement = null;


        try {
            // InternalInteractiontxt.g:154:49: (iv_ruleAElement= ruleAElement EOF )
            // InternalInteractiontxt.g:155:2: iv_ruleAElement= ruleAElement EOF
            {
             newCompositeNode(grammarAccess.getAElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAElement=ruleAElement();

            state._fsp--;

             current =iv_ruleAElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAElement"


    // $ANTLR start "ruleAElement"
    // InternalInteractiontxt.g:161:1: ruleAElement returns [EObject current=null] : (this_AIElement_0= ruleAIElement | this_AOElement_1= ruleAOElement | this_ALElement_2= ruleALElement | this_AVElement_3= ruleAVElement | this_ACanvas_4= ruleACanvas ) ;
    public final EObject ruleAElement() throws RecognitionException {
        EObject current = null;

        EObject this_AIElement_0 = null;

        EObject this_AOElement_1 = null;

        EObject this_ALElement_2 = null;

        EObject this_AVElement_3 = null;

        EObject this_ACanvas_4 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:167:2: ( (this_AIElement_0= ruleAIElement | this_AOElement_1= ruleAOElement | this_ALElement_2= ruleALElement | this_AVElement_3= ruleAVElement | this_ACanvas_4= ruleACanvas ) )
            // InternalInteractiontxt.g:168:2: (this_AIElement_0= ruleAIElement | this_AOElement_1= ruleAOElement | this_ALElement_2= ruleALElement | this_AVElement_3= ruleAVElement | this_ACanvas_4= ruleACanvas )
            {
            // InternalInteractiontxt.g:168:2: (this_AIElement_0= ruleAIElement | this_AOElement_1= ruleAOElement | this_ALElement_2= ruleALElement | this_AVElement_3= ruleAVElement | this_ACanvas_4= ruleACanvas )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 26:
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
                    // InternalInteractiontxt.g:169:3: this_AIElement_0= ruleAIElement
                    {

                    			newCompositeNode(grammarAccess.getAElementAccess().getAIElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AIElement_0=ruleAIElement();

                    state._fsp--;


                    			current = this_AIElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:178:3: this_AOElement_1= ruleAOElement
                    {

                    			newCompositeNode(grammarAccess.getAElementAccess().getAOElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AOElement_1=ruleAOElement();

                    state._fsp--;


                    			current = this_AOElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalInteractiontxt.g:187:3: this_ALElement_2= ruleALElement
                    {

                    			newCompositeNode(grammarAccess.getAElementAccess().getALElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ALElement_2=ruleALElement();

                    state._fsp--;


                    			current = this_ALElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalInteractiontxt.g:196:3: this_AVElement_3= ruleAVElement
                    {

                    			newCompositeNode(grammarAccess.getAElementAccess().getAVElementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AVElement_3=ruleAVElement();

                    state._fsp--;


                    			current = this_AVElement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalInteractiontxt.g:205:3: this_ACanvas_4= ruleACanvas
                    {

                    			newCompositeNode(grammarAccess.getAElementAccess().getACanvasParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ACanvas_4=ruleACanvas();

                    state._fsp--;


                    			current = this_ACanvas_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAElement"


    // $ANTLR start "entryRuleInteraction"
    // InternalInteractiontxt.g:217:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalInteractiontxt.g:217:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalInteractiontxt.g:218:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalInteractiontxt.g:224:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'InteractionRule' ( (lv_name_1_0= ruleEString ) ) ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:230:2: ( (otherlv_0= 'InteractionRule' ( (lv_name_1_0= ruleEString ) ) ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalInteractiontxt.g:231:2: (otherlv_0= 'InteractionRule' ( (lv_name_1_0= ruleEString ) ) ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalInteractiontxt.g:231:2: (otherlv_0= 'InteractionRule' ( (lv_name_1_0= ruleEString ) ) ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalInteractiontxt.g:232:3: otherlv_0= 'InteractionRule' ( (lv_name_1_0= ruleEString ) ) ( (lv_condition_2_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,10,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionRuleKeyword_0());
            		
            // InternalInteractiontxt.g:236:3: ( (lv_name_1_0= ruleEString ) )
            // InternalInteractiontxt.g:237:4: (lv_name_1_0= ruleEString )
            {
            // InternalInteractiontxt.g:237:4: (lv_name_1_0= ruleEString )
            // InternalInteractiontxt.g:238:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInteractiontxt.g:255:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalInteractiontxt.g:256:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalInteractiontxt.g:256:4: (lv_condition_2_0= ruleCondition )
            // InternalInteractiontxt.g:257:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleEString"
    // InternalInteractiontxt.g:278:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalInteractiontxt.g:278:47: (iv_ruleEString= ruleEString EOF )
            // InternalInteractiontxt.g:279:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalInteractiontxt.g:285:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalInteractiontxt.g:291:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalInteractiontxt.g:292:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalInteractiontxt.g:292:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalInteractiontxt.g:293:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:301:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCondition"
    // InternalInteractiontxt.g:312:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalInteractiontxt.g:312:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalInteractiontxt.g:313:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalInteractiontxt.g:319:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= 'Condition' ( (lv_id_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleCElement ) )* otherlv_5= '}' ( (lv_transition_6_0= ruleStartTransition ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_transition_6_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:325:2: ( ( () otherlv_1= 'Condition' ( (lv_id_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleCElement ) )* otherlv_5= '}' ( (lv_transition_6_0= ruleStartTransition ) ) ) )
            // InternalInteractiontxt.g:326:2: ( () otherlv_1= 'Condition' ( (lv_id_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleCElement ) )* otherlv_5= '}' ( (lv_transition_6_0= ruleStartTransition ) ) )
            {
            // InternalInteractiontxt.g:326:2: ( () otherlv_1= 'Condition' ( (lv_id_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleCElement ) )* otherlv_5= '}' ( (lv_transition_6_0= ruleStartTransition ) ) )
            // InternalInteractiontxt.g:327:3: () otherlv_1= 'Condition' ( (lv_id_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleCElement ) )* otherlv_5= '}' ( (lv_transition_6_0= ruleStartTransition ) )
            {
            // InternalInteractiontxt.g:327:3: ()
            // InternalInteractiontxt.g:328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
            		
            // InternalInteractiontxt.g:338:3: ( (lv_id_2_0= ruleEString ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalInteractiontxt.g:339:4: (lv_id_2_0= ruleEString )
                    {
                    // InternalInteractiontxt.g:339:4: (lv_id_2_0= ruleEString )
                    // InternalInteractiontxt.g:340:5: lv_id_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getIdEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_id_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"id",
                    						lv_id_2_0,
                    						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInteractiontxt.g:361:3: ( (lv_elements_4_0= ruleCElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=18 && LA6_0<=20)||(LA6_0>=25 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalInteractiontxt.g:362:4: (lv_elements_4_0= ruleCElement )
            	    {
            	    // InternalInteractiontxt.g:362:4: (lv_elements_4_0= ruleCElement )
            	    // InternalInteractiontxt.g:363:5: lv_elements_4_0= ruleCElement
            	    {

            	    					newCompositeNode(grammarAccess.getConditionAccess().getElementsCElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_elements_4_0=ruleCElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"ca.udem.iro.geodes.interaction.Interactiontxt.CElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalInteractiontxt.g:384:3: ( (lv_transition_6_0= ruleStartTransition ) )
            // InternalInteractiontxt.g:385:4: (lv_transition_6_0= ruleStartTransition )
            {
            // InternalInteractiontxt.g:385:4: (lv_transition_6_0= ruleStartTransition )
            // InternalInteractiontxt.g:386:5: lv_transition_6_0= ruleStartTransition
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getTransitionStartTransitionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_transition_6_0=ruleStartTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_6_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.StartTransition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleStartTransition"
    // InternalInteractiontxt.g:407:1: entryRuleStartTransition returns [EObject current=null] : iv_ruleStartTransition= ruleStartTransition EOF ;
    public final EObject entryRuleStartTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartTransition = null;


        try {
            // InternalInteractiontxt.g:407:56: (iv_ruleStartTransition= ruleStartTransition EOF )
            // InternalInteractiontxt.g:408:2: iv_ruleStartTransition= ruleStartTransition EOF
            {
             newCompositeNode(grammarAccess.getStartTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartTransition=ruleStartTransition();

            state._fsp--;

             current =iv_ruleStartTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartTransition"


    // $ANTLR start "ruleStartTransition"
    // InternalInteractiontxt.g:414:1: ruleStartTransition returns [EObject current=null] : (otherlv_0= '---' ( (lv_event_1_0= ruleEString ) ) otherlv_2= '-->' ( (lv_action_3_0= ruleAction ) ) ) ;
    public final EObject ruleStartTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_event_1_0 = null;

        EObject lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:420:2: ( (otherlv_0= '---' ( (lv_event_1_0= ruleEString ) ) otherlv_2= '-->' ( (lv_action_3_0= ruleAction ) ) ) )
            // InternalInteractiontxt.g:421:2: (otherlv_0= '---' ( (lv_event_1_0= ruleEString ) ) otherlv_2= '-->' ( (lv_action_3_0= ruleAction ) ) )
            {
            // InternalInteractiontxt.g:421:2: (otherlv_0= '---' ( (lv_event_1_0= ruleEString ) ) otherlv_2= '-->' ( (lv_action_3_0= ruleAction ) ) )
            // InternalInteractiontxt.g:422:3: otherlv_0= '---' ( (lv_event_1_0= ruleEString ) ) otherlv_2= '-->' ( (lv_action_3_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStartTransitionAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0());
            		
            // InternalInteractiontxt.g:426:3: ( (lv_event_1_0= ruleEString ) )
            // InternalInteractiontxt.g:427:4: (lv_event_1_0= ruleEString )
            {
            // InternalInteractiontxt.g:427:4: (lv_event_1_0= ruleEString )
            // InternalInteractiontxt.g:428:5: lv_event_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStartTransitionAccess().getEventEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_event_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartTransitionRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_1_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getStartTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalInteractiontxt.g:449:3: ( (lv_action_3_0= ruleAction ) )
            // InternalInteractiontxt.g:450:4: (lv_action_3_0= ruleAction )
            {
            // InternalInteractiontxt.g:450:4: (lv_action_3_0= ruleAction )
            // InternalInteractiontxt.g:451:5: lv_action_3_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStartTransitionAccess().getActionActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_3_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartTransitionRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_3_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartTransition"


    // $ANTLR start "entryRuleTransition"
    // InternalInteractiontxt.g:472:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalInteractiontxt.g:472:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalInteractiontxt.g:473:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalInteractiontxt.g:479:1: ruleTransition returns [EObject current=null] : (otherlv_0= '----->' ( (lv_action_1_0= ruleAction ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_action_1_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:485:2: ( (otherlv_0= '----->' ( (lv_action_1_0= ruleAction ) ) ) )
            // InternalInteractiontxt.g:486:2: (otherlv_0= '----->' ( (lv_action_1_0= ruleAction ) ) )
            {
            // InternalInteractiontxt.g:486:2: (otherlv_0= '----->' ( (lv_action_1_0= ruleAction ) ) )
            // InternalInteractiontxt.g:487:3: otherlv_0= '----->' ( (lv_action_1_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalInteractiontxt.g:491:3: ( (lv_action_1_0= ruleAction ) )
            // InternalInteractiontxt.g:492:4: (lv_action_1_0= ruleAction )
            {
            // InternalInteractiontxt.g:492:4: (lv_action_1_0= ruleAction )
            // InternalInteractiontxt.g:493:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_1_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_1_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleAction"
    // InternalInteractiontxt.g:514:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalInteractiontxt.g:514:47: (iv_ruleAction= ruleAction EOF )
            // InternalInteractiontxt.g:515:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalInteractiontxt.g:521:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'Effect' ( (lv_id_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleAElement ) )* otherlv_5= '}' ( (lv_transition_6_0= ruleTransition ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_transition_6_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:527:2: ( ( () otherlv_1= 'Effect' ( (lv_id_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleAElement ) )* otherlv_5= '}' ( (lv_transition_6_0= ruleTransition ) )? ) )
            // InternalInteractiontxt.g:528:2: ( () otherlv_1= 'Effect' ( (lv_id_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleAElement ) )* otherlv_5= '}' ( (lv_transition_6_0= ruleTransition ) )? )
            {
            // InternalInteractiontxt.g:528:2: ( () otherlv_1= 'Effect' ( (lv_id_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleAElement ) )* otherlv_5= '}' ( (lv_transition_6_0= ruleTransition ) )? )
            // InternalInteractiontxt.g:529:3: () otherlv_1= 'Effect' ( (lv_id_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_elements_4_0= ruleAElement ) )* otherlv_5= '}' ( (lv_transition_6_0= ruleTransition ) )?
            {
            // InternalInteractiontxt.g:529:3: ()
            // InternalInteractiontxt.g:530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getEffectKeyword_1());
            		
            // InternalInteractiontxt.g:540:3: ( (lv_id_2_0= ruleEString ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalInteractiontxt.g:541:4: (lv_id_2_0= ruleEString )
                    {
                    // InternalInteractiontxt.g:541:4: (lv_id_2_0= ruleEString )
                    // InternalInteractiontxt.g:542:5: lv_id_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getIdEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_id_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"id",
                    						lv_id_2_0,
                    						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInteractiontxt.g:563:3: ( (lv_elements_4_0= ruleAElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20||(LA8_0>=25 && LA8_0<=27)||LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalInteractiontxt.g:564:4: (lv_elements_4_0= ruleAElement )
            	    {
            	    // InternalInteractiontxt.g:564:4: (lv_elements_4_0= ruleAElement )
            	    // InternalInteractiontxt.g:565:5: lv_elements_4_0= ruleAElement
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getElementsAElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_elements_4_0=ruleAElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"ca.udem.iro.geodes.interaction.Interactiontxt.AElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalInteractiontxt.g:586:3: ( (lv_transition_6_0= ruleTransition ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalInteractiontxt.g:587:4: (lv_transition_6_0= ruleTransition )
                    {
                    // InternalInteractiontxt.g:587:4: (lv_transition_6_0= ruleTransition )
                    // InternalInteractiontxt.g:588:5: lv_transition_6_0= ruleTransition
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getTransitionTransitionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_transition_6_0=ruleTransition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"transition",
                    						lv_transition_6_0,
                    						"ca.udem.iro.geodes.interaction.Interactiontxt.Transition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCIElement"
    // InternalInteractiontxt.g:609:1: entryRuleCIElement returns [EObject current=null] : iv_ruleCIElement= ruleCIElement EOF ;
    public final EObject entryRuleCIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCIElement = null;


        try {
            // InternalInteractiontxt.g:609:50: (iv_ruleCIElement= ruleCIElement EOF )
            // InternalInteractiontxt.g:610:2: iv_ruleCIElement= ruleCIElement EOF
            {
             newCompositeNode(grammarAccess.getCIElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCIElement=ruleCIElement();

            state._fsp--;

             current =iv_ruleCIElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCIElement"


    // $ANTLR start "ruleCIElement"
    // InternalInteractiontxt.g:616:1: ruleCIElement returns [EObject current=null] : ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Interface' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleCIElement() throws RecognitionException {
        EObject current = null;

        Token lv_isNegative_1_0=null;
        Token lv_isFocus_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_operation_10_0=null;
        Token lv_value_11_1=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;

        AntlrDatatypeRuleToken lv_value_11_2 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:622:2: ( ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Interface' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )? otherlv_12= '}' ) )
            // InternalInteractiontxt.g:623:2: ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Interface' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )? otherlv_12= '}' )
            {
            // InternalInteractiontxt.g:623:2: ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Interface' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )? otherlv_12= '}' )
            // InternalInteractiontxt.g:624:3: () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Interface' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )? otherlv_12= '}'
            {
            // InternalInteractiontxt.g:624:3: ()
            // InternalInteractiontxt.g:625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCIElementAccess().getCIElementAction_0(),
            					current);
            			

            }

            // InternalInteractiontxt.g:631:3: ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // InternalInteractiontxt.g:632:4: ( (lv_isNegative_1_0= 'not' ) )
                    {
                    // InternalInteractiontxt.g:632:4: ( (lv_isNegative_1_0= 'not' ) )
                    // InternalInteractiontxt.g:633:5: (lv_isNegative_1_0= 'not' )
                    {
                    // InternalInteractiontxt.g:633:5: (lv_isNegative_1_0= 'not' )
                    // InternalInteractiontxt.g:634:6: lv_isNegative_1_0= 'not'
                    {
                    lv_isNegative_1_0=(Token)match(input,18,FOLLOW_14); 

                    						newLeafNode(lv_isNegative_1_0, grammarAccess.getCIElementAccess().getIsNegativeNotKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCIElementRule());
                    						}
                    						setWithLastConsumed(current, "isNegative", true, "not");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:647:4: ( (lv_isFocus_2_0= 'focus' ) )
                    {
                    // InternalInteractiontxt.g:647:4: ( (lv_isFocus_2_0= 'focus' ) )
                    // InternalInteractiontxt.g:648:5: (lv_isFocus_2_0= 'focus' )
                    {
                    // InternalInteractiontxt.g:648:5: (lv_isFocus_2_0= 'focus' )
                    // InternalInteractiontxt.g:649:6: lv_isFocus_2_0= 'focus'
                    {
                    lv_isFocus_2_0=(Token)match(input,19,FOLLOW_14); 

                    						newLeafNode(lv_isFocus_2_0, grammarAccess.getCIElementAccess().getIsFocusFocusKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCIElementRule());
                    						}
                    						setWithLastConsumed(current, "isFocus", true, "focus");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCIElementAccess().getInterfaceKeyword_2());
            		
            // InternalInteractiontxt.g:666:3: ( (lv_id_4_0= ruleEString ) )
            // InternalInteractiontxt.g:667:4: (lv_id_4_0= ruleEString )
            {
            // InternalInteractiontxt.g:667:4: (lv_id_4_0= ruleEString )
            // InternalInteractiontxt.g:668:5: lv_id_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCIElementAccess().getIdEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_id_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCIElementRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_4_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getCIElementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalInteractiontxt.g:689:3: (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalInteractiontxt.g:690:4: otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getCIElementAccess().getValueKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getCIElementAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalInteractiontxt.g:698:4: ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==23) ) {
                        alt12=1;
                    }
                    else if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||LA12_0==24) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalInteractiontxt.g:699:5: (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) )
                            {
                            // InternalInteractiontxt.g:699:5: (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) )
                            // InternalInteractiontxt.g:700:6: otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) )
                            {
                            otherlv_8=(Token)match(input,23,FOLLOW_4); 

                            						newLeafNode(otherlv_8, grammarAccess.getCIElementAccess().getQuotationMarkKeyword_5_2_0_0());
                            					
                            // InternalInteractiontxt.g:704:6: ( (lv_value_9_0= ruleEString ) )
                            // InternalInteractiontxt.g:705:7: (lv_value_9_0= ruleEString )
                            {
                            // InternalInteractiontxt.g:705:7: (lv_value_9_0= ruleEString )
                            // InternalInteractiontxt.g:706:8: lv_value_9_0= ruleEString
                            {

                            								newCompositeNode(grammarAccess.getCIElementAccess().getValueEStringParserRuleCall_5_2_0_1_0());
                            							
                            pushFollow(FOLLOW_18);
                            lv_value_9_0=ruleEString();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getCIElementRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_9_0,
                            									"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalInteractiontxt.g:723:6: ( (lv_operation_10_0= '\"' ) )
                            // InternalInteractiontxt.g:724:7: (lv_operation_10_0= '\"' )
                            {
                            // InternalInteractiontxt.g:724:7: (lv_operation_10_0= '\"' )
                            // InternalInteractiontxt.g:725:8: lv_operation_10_0= '\"'
                            {
                            lv_operation_10_0=(Token)match(input,23,FOLLOW_19); 

                            								newLeafNode(lv_operation_10_0, grammarAccess.getCIElementAccess().getOperationQuotationMarkKeyword_5_2_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCIElementRule());
                            								}
                            								setWithLastConsumed(current, "operation", lv_operation_10_0, "\"");
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalInteractiontxt.g:739:5: ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) )
                            {
                            // InternalInteractiontxt.g:739:5: ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) )
                            // InternalInteractiontxt.g:740:6: ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) )
                            {
                            // InternalInteractiontxt.g:740:6: ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) )
                            // InternalInteractiontxt.g:741:7: (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString )
                            {
                            // InternalInteractiontxt.g:741:7: (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString )
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==24) ) {
                                alt11=1;
                            }
                            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                                alt11=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 0, input);

                                throw nvae;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalInteractiontxt.g:742:8: lv_value_11_1= 'focusElement'
                                    {
                                    lv_value_11_1=(Token)match(input,24,FOLLOW_19); 

                                    								newLeafNode(lv_value_11_1, grammarAccess.getCIElementAccess().getValueFocusElementKeyword_5_2_1_0_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getCIElementRule());
                                    								}
                                    								setWithLastConsumed(current, "value", lv_value_11_1, null);
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalInteractiontxt.g:753:8: lv_value_11_2= ruleEString
                                    {

                                    								newCompositeNode(grammarAccess.getCIElementAccess().getValueEStringParserRuleCall_5_2_1_0_1());
                                    							
                                    pushFollow(FOLLOW_19);
                                    lv_value_11_2=ruleEString();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getCIElementRule());
                                    								}
                                    								set(
                                    									current,
                                    									"value",
                                    									lv_value_11_2,
                                    									"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCIElementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCIElement"


    // $ANTLR start "entryRuleCLElement"
    // InternalInteractiontxt.g:781:1: entryRuleCLElement returns [EObject current=null] : iv_ruleCLElement= ruleCLElement EOF ;
    public final EObject entryRuleCLElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCLElement = null;


        try {
            // InternalInteractiontxt.g:781:50: (iv_ruleCLElement= ruleCLElement EOF )
            // InternalInteractiontxt.g:782:2: iv_ruleCLElement= ruleCLElement EOF
            {
             newCompositeNode(grammarAccess.getCLElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCLElement=ruleCLElement();

            state._fsp--;

             current =iv_ruleCLElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCLElement"


    // $ANTLR start "ruleCLElement"
    // InternalInteractiontxt.g:788:1: ruleCLElement returns [EObject current=null] : ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Lang' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleCLElement() throws RecognitionException {
        EObject current = null;

        Token lv_isNegative_1_0=null;
        Token lv_isFocus_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_operation_10_0=null;
        Token lv_value_11_1=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;

        AntlrDatatypeRuleToken lv_value_11_2 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:794:2: ( ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Lang' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )? otherlv_12= '}' ) )
            // InternalInteractiontxt.g:795:2: ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Lang' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )? otherlv_12= '}' )
            {
            // InternalInteractiontxt.g:795:2: ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Lang' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )? otherlv_12= '}' )
            // InternalInteractiontxt.g:796:3: () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Lang' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )? otherlv_12= '}'
            {
            // InternalInteractiontxt.g:796:3: ()
            // InternalInteractiontxt.g:797:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCLElementAccess().getCLElementAction_0(),
            					current);
            			

            }

            // InternalInteractiontxt.g:803:3: ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            else if ( (LA14_0==19) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalInteractiontxt.g:804:4: ( (lv_isNegative_1_0= 'not' ) )
                    {
                    // InternalInteractiontxt.g:804:4: ( (lv_isNegative_1_0= 'not' ) )
                    // InternalInteractiontxt.g:805:5: (lv_isNegative_1_0= 'not' )
                    {
                    // InternalInteractiontxt.g:805:5: (lv_isNegative_1_0= 'not' )
                    // InternalInteractiontxt.g:806:6: lv_isNegative_1_0= 'not'
                    {
                    lv_isNegative_1_0=(Token)match(input,18,FOLLOW_20); 

                    						newLeafNode(lv_isNegative_1_0, grammarAccess.getCLElementAccess().getIsNegativeNotKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCLElementRule());
                    						}
                    						setWithLastConsumed(current, "isNegative", true, "not");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:819:4: ( (lv_isFocus_2_0= 'focus' ) )
                    {
                    // InternalInteractiontxt.g:819:4: ( (lv_isFocus_2_0= 'focus' ) )
                    // InternalInteractiontxt.g:820:5: (lv_isFocus_2_0= 'focus' )
                    {
                    // InternalInteractiontxt.g:820:5: (lv_isFocus_2_0= 'focus' )
                    // InternalInteractiontxt.g:821:6: lv_isFocus_2_0= 'focus'
                    {
                    lv_isFocus_2_0=(Token)match(input,19,FOLLOW_20); 

                    						newLeafNode(lv_isFocus_2_0, grammarAccess.getCLElementAccess().getIsFocusFocusKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCLElementRule());
                    						}
                    						setWithLastConsumed(current, "isFocus", true, "focus");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCLElementAccess().getLangKeyword_2());
            		
            // InternalInteractiontxt.g:838:3: ( (lv_id_4_0= ruleEString ) )
            // InternalInteractiontxt.g:839:4: (lv_id_4_0= ruleEString )
            {
            // InternalInteractiontxt.g:839:4: (lv_id_4_0= ruleEString )
            // InternalInteractiontxt.g:840:5: lv_id_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCLElementAccess().getIdEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_id_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCLElementRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_4_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getCLElementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalInteractiontxt.g:861:3: (otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalInteractiontxt.g:862:4: otherlv_6= 'value' otherlv_7= '=' ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getCLElementAccess().getValueKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getCLElementAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalInteractiontxt.g:870:4: ( (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) ) | ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==23) ) {
                        alt16=1;
                    }
                    else if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==24) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalInteractiontxt.g:871:5: (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) )
                            {
                            // InternalInteractiontxt.g:871:5: (otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) ) )
                            // InternalInteractiontxt.g:872:6: otherlv_8= '\"' ( (lv_value_9_0= ruleEString ) ) ( (lv_operation_10_0= '\"' ) )
                            {
                            otherlv_8=(Token)match(input,23,FOLLOW_4); 

                            						newLeafNode(otherlv_8, grammarAccess.getCLElementAccess().getQuotationMarkKeyword_5_2_0_0());
                            					
                            // InternalInteractiontxt.g:876:6: ( (lv_value_9_0= ruleEString ) )
                            // InternalInteractiontxt.g:877:7: (lv_value_9_0= ruleEString )
                            {
                            // InternalInteractiontxt.g:877:7: (lv_value_9_0= ruleEString )
                            // InternalInteractiontxt.g:878:8: lv_value_9_0= ruleEString
                            {

                            								newCompositeNode(grammarAccess.getCLElementAccess().getValueEStringParserRuleCall_5_2_0_1_0());
                            							
                            pushFollow(FOLLOW_18);
                            lv_value_9_0=ruleEString();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getCLElementRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_9_0,
                            									"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalInteractiontxt.g:895:6: ( (lv_operation_10_0= '\"' ) )
                            // InternalInteractiontxt.g:896:7: (lv_operation_10_0= '\"' )
                            {
                            // InternalInteractiontxt.g:896:7: (lv_operation_10_0= '\"' )
                            // InternalInteractiontxt.g:897:8: lv_operation_10_0= '\"'
                            {
                            lv_operation_10_0=(Token)match(input,23,FOLLOW_19); 

                            								newLeafNode(lv_operation_10_0, grammarAccess.getCLElementAccess().getOperationQuotationMarkKeyword_5_2_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCLElementRule());
                            								}
                            								setWithLastConsumed(current, "operation", lv_operation_10_0, "\"");
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalInteractiontxt.g:911:5: ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) )
                            {
                            // InternalInteractiontxt.g:911:5: ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) )
                            // InternalInteractiontxt.g:912:6: ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) )
                            {
                            // InternalInteractiontxt.g:912:6: ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) )
                            // InternalInteractiontxt.g:913:7: (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString )
                            {
                            // InternalInteractiontxt.g:913:7: (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString )
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==24) ) {
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
                                    // InternalInteractiontxt.g:914:8: lv_value_11_1= 'focusElement'
                                    {
                                    lv_value_11_1=(Token)match(input,24,FOLLOW_19); 

                                    								newLeafNode(lv_value_11_1, grammarAccess.getCLElementAccess().getValueFocusElementKeyword_5_2_1_0_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getCLElementRule());
                                    								}
                                    								setWithLastConsumed(current, "value", lv_value_11_1, null);
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalInteractiontxt.g:925:8: lv_value_11_2= ruleEString
                                    {

                                    								newCompositeNode(grammarAccess.getCLElementAccess().getValueEStringParserRuleCall_5_2_1_0_1());
                                    							
                                    pushFollow(FOLLOW_19);
                                    lv_value_11_2=ruleEString();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getCLElementRule());
                                    								}
                                    								set(
                                    									current,
                                    									"value",
                                    									lv_value_11_2,
                                    									"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCLElementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCLElement"


    // $ANTLR start "entryRuleCCanvas"
    // InternalInteractiontxt.g:953:1: entryRuleCCanvas returns [EObject current=null] : iv_ruleCCanvas= ruleCCanvas EOF ;
    public final EObject entryRuleCCanvas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCCanvas = null;


        try {
            // InternalInteractiontxt.g:953:48: (iv_ruleCCanvas= ruleCCanvas EOF )
            // InternalInteractiontxt.g:954:2: iv_ruleCCanvas= ruleCCanvas EOF
            {
             newCompositeNode(grammarAccess.getCCanvasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCCanvas=ruleCCanvas();

            state._fsp--;

             current =iv_ruleCCanvas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCCanvas"


    // $ANTLR start "ruleCCanvas"
    // InternalInteractiontxt.g:960:1: ruleCCanvas returns [EObject current=null] : ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Canvas' otherlv_4= '{' (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleCCanvas() throws RecognitionException {
        EObject current = null;

        Token lv_isNegative_1_0=null;
        Token lv_isFocus_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:966:2: ( ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Canvas' otherlv_4= '{' (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalInteractiontxt.g:967:2: ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Canvas' otherlv_4= '{' (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalInteractiontxt.g:967:2: ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Canvas' otherlv_4= '{' (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalInteractiontxt.g:968:3: () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Canvas' otherlv_4= '{' (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalInteractiontxt.g:968:3: ()
            // InternalInteractiontxt.g:969:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCCanvasAccess().getCCanvasAction_0(),
            					current);
            			

            }

            // InternalInteractiontxt.g:975:3: ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            else if ( (LA18_0==19) ) {
                alt18=2;
            }
            switch (alt18) {
                case 1 :
                    // InternalInteractiontxt.g:976:4: ( (lv_isNegative_1_0= 'not' ) )
                    {
                    // InternalInteractiontxt.g:976:4: ( (lv_isNegative_1_0= 'not' ) )
                    // InternalInteractiontxt.g:977:5: (lv_isNegative_1_0= 'not' )
                    {
                    // InternalInteractiontxt.g:977:5: (lv_isNegative_1_0= 'not' )
                    // InternalInteractiontxt.g:978:6: lv_isNegative_1_0= 'not'
                    {
                    lv_isNegative_1_0=(Token)match(input,18,FOLLOW_21); 

                    						newLeafNode(lv_isNegative_1_0, grammarAccess.getCCanvasAccess().getIsNegativeNotKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCCanvasRule());
                    						}
                    						setWithLastConsumed(current, "isNegative", true, "not");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:991:4: ( (lv_isFocus_2_0= 'focus' ) )
                    {
                    // InternalInteractiontxt.g:991:4: ( (lv_isFocus_2_0= 'focus' ) )
                    // InternalInteractiontxt.g:992:5: (lv_isFocus_2_0= 'focus' )
                    {
                    // InternalInteractiontxt.g:992:5: (lv_isFocus_2_0= 'focus' )
                    // InternalInteractiontxt.g:993:6: lv_isFocus_2_0= 'focus'
                    {
                    lv_isFocus_2_0=(Token)match(input,19,FOLLOW_21); 

                    						newLeafNode(lv_isFocus_2_0, grammarAccess.getCCanvasAccess().getIsFocusFocusKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCCanvasRule());
                    						}
                    						setWithLastConsumed(current, "isFocus", true, "focus");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCCanvasAccess().getCanvasKeyword_2());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getCCanvasAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInteractiontxt.g:1014:3: (otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalInteractiontxt.g:1015:4: otherlv_5= 'value' otherlv_6= '=' ( (lv_value_7_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getCCanvasAccess().getValueKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCCanvasAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalInteractiontxt.g:1023:4: ( (lv_value_7_0= ruleEString ) )
                    // InternalInteractiontxt.g:1024:5: (lv_value_7_0= ruleEString )
                    {
                    // InternalInteractiontxt.g:1024:5: (lv_value_7_0= ruleEString )
                    // InternalInteractiontxt.g:1025:6: lv_value_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCCanvasAccess().getValueEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_value_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCCanvasRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCCanvasAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCCanvas"


    // $ANTLR start "entryRuleCVElement"
    // InternalInteractiontxt.g:1051:1: entryRuleCVElement returns [EObject current=null] : iv_ruleCVElement= ruleCVElement EOF ;
    public final EObject entryRuleCVElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCVElement = null;


        try {
            // InternalInteractiontxt.g:1051:50: (iv_ruleCVElement= ruleCVElement EOF )
            // InternalInteractiontxt.g:1052:2: iv_ruleCVElement= ruleCVElement EOF
            {
             newCompositeNode(grammarAccess.getCVElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCVElement=ruleCVElement();

            state._fsp--;

             current =iv_ruleCVElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCVElement"


    // $ANTLR start "ruleCVElement"
    // InternalInteractiontxt.g:1058:1: ruleCVElement returns [EObject current=null] : ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Var' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' ( (otherlv_6= 'value' otherlv_7= '=' ( ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) ) | (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' ) ) (otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) ) )? ) | (otherlv_16= 'element' otherlv_17= '=' ( ( ruleEString ) ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleCVElement() throws RecognitionException {
        EObject current = null;

        Token lv_isNegative_1_0=null;
        Token lv_isFocus_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_value_8_1=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_value_8_2 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:1064:2: ( ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Var' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' ( (otherlv_6= 'value' otherlv_7= '=' ( ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) ) | (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' ) ) (otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) ) )? ) | (otherlv_16= 'element' otherlv_17= '=' ( ( ruleEString ) ) ) )? otherlv_19= '}' ) )
            // InternalInteractiontxt.g:1065:2: ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Var' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' ( (otherlv_6= 'value' otherlv_7= '=' ( ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) ) | (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' ) ) (otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) ) )? ) | (otherlv_16= 'element' otherlv_17= '=' ( ( ruleEString ) ) ) )? otherlv_19= '}' )
            {
            // InternalInteractiontxt.g:1065:2: ( () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Var' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' ( (otherlv_6= 'value' otherlv_7= '=' ( ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) ) | (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' ) ) (otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) ) )? ) | (otherlv_16= 'element' otherlv_17= '=' ( ( ruleEString ) ) ) )? otherlv_19= '}' )
            // InternalInteractiontxt.g:1066:3: () ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )? otherlv_3= 'Var' ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' ( (otherlv_6= 'value' otherlv_7= '=' ( ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) ) | (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' ) ) (otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) ) )? ) | (otherlv_16= 'element' otherlv_17= '=' ( ( ruleEString ) ) ) )? otherlv_19= '}'
            {
            // InternalInteractiontxt.g:1066:3: ()
            // InternalInteractiontxt.g:1067:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCVElementAccess().getCVElementAction_0(),
            					current);
            			

            }

            // InternalInteractiontxt.g:1073:3: ( ( (lv_isNegative_1_0= 'not' ) ) | ( (lv_isFocus_2_0= 'focus' ) ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            else if ( (LA20_0==19) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // InternalInteractiontxt.g:1074:4: ( (lv_isNegative_1_0= 'not' ) )
                    {
                    // InternalInteractiontxt.g:1074:4: ( (lv_isNegative_1_0= 'not' ) )
                    // InternalInteractiontxt.g:1075:5: (lv_isNegative_1_0= 'not' )
                    {
                    // InternalInteractiontxt.g:1075:5: (lv_isNegative_1_0= 'not' )
                    // InternalInteractiontxt.g:1076:6: lv_isNegative_1_0= 'not'
                    {
                    lv_isNegative_1_0=(Token)match(input,18,FOLLOW_22); 

                    						newLeafNode(lv_isNegative_1_0, grammarAccess.getCVElementAccess().getIsNegativeNotKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCVElementRule());
                    						}
                    						setWithLastConsumed(current, "isNegative", true, "not");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:1089:4: ( (lv_isFocus_2_0= 'focus' ) )
                    {
                    // InternalInteractiontxt.g:1089:4: ( (lv_isFocus_2_0= 'focus' ) )
                    // InternalInteractiontxt.g:1090:5: (lv_isFocus_2_0= 'focus' )
                    {
                    // InternalInteractiontxt.g:1090:5: (lv_isFocus_2_0= 'focus' )
                    // InternalInteractiontxt.g:1091:6: lv_isFocus_2_0= 'focus'
                    {
                    lv_isFocus_2_0=(Token)match(input,19,FOLLOW_22); 

                    						newLeafNode(lv_isFocus_2_0, grammarAccess.getCVElementAccess().getIsFocusFocusKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCVElementRule());
                    						}
                    						setWithLastConsumed(current, "isFocus", true, "focus");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCVElementAccess().getVarKeyword_2());
            		
            // InternalInteractiontxt.g:1108:3: ( (lv_id_4_0= ruleEString ) )
            // InternalInteractiontxt.g:1109:4: (lv_id_4_0= ruleEString )
            {
            // InternalInteractiontxt.g:1109:4: (lv_id_4_0= ruleEString )
            // InternalInteractiontxt.g:1110:5: lv_id_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCVElementAccess().getIdEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_id_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCVElementRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_4_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getCVElementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalInteractiontxt.g:1131:3: ( (otherlv_6= 'value' otherlv_7= '=' ( ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) ) | (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' ) ) (otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) ) )? ) | (otherlv_16= 'element' otherlv_17= '=' ( ( ruleEString ) ) ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            else if ( (LA24_0==29) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // InternalInteractiontxt.g:1132:4: (otherlv_6= 'value' otherlv_7= '=' ( ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) ) | (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' ) ) (otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) ) )? )
                    {
                    // InternalInteractiontxt.g:1132:4: (otherlv_6= 'value' otherlv_7= '=' ( ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) ) | (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' ) ) (otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) ) )? )
                    // InternalInteractiontxt.g:1133:5: otherlv_6= 'value' otherlv_7= '=' ( ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) ) | (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' ) ) (otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) ) )?
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_16); 

                    					newLeafNode(otherlv_6, grammarAccess.getCVElementAccess().getValueKeyword_5_0_0());
                    				
                    otherlv_7=(Token)match(input,22,FOLLOW_17); 

                    					newLeafNode(otherlv_7, grammarAccess.getCVElementAccess().getEqualsSignKeyword_5_0_1());
                    				
                    // InternalInteractiontxt.g:1141:5: ( ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) ) | (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||LA22_0==24) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==23) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalInteractiontxt.g:1142:6: ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) )
                            {
                            // InternalInteractiontxt.g:1142:6: ( ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) ) )
                            // InternalInteractiontxt.g:1143:7: ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) )
                            {
                            // InternalInteractiontxt.g:1143:7: ( (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString ) )
                            // InternalInteractiontxt.g:1144:8: (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString )
                            {
                            // InternalInteractiontxt.g:1144:8: (lv_value_8_1= 'focusElement' | lv_value_8_2= ruleEString )
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==24) ) {
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
                                    // InternalInteractiontxt.g:1145:9: lv_value_8_1= 'focusElement'
                                    {
                                    lv_value_8_1=(Token)match(input,24,FOLLOW_24); 

                                    									newLeafNode(lv_value_8_1, grammarAccess.getCVElementAccess().getValueFocusElementKeyword_5_0_2_0_0_0());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getCVElementRule());
                                    									}
                                    									setWithLastConsumed(current, "value", lv_value_8_1, null);
                                    								

                                    }
                                    break;
                                case 2 :
                                    // InternalInteractiontxt.g:1156:9: lv_value_8_2= ruleEString
                                    {

                                    									newCompositeNode(grammarAccess.getCVElementAccess().getValueEStringParserRuleCall_5_0_2_0_0_1());
                                    								
                                    pushFollow(FOLLOW_24);
                                    lv_value_8_2=ruleEString();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getCVElementRule());
                                    									}
                                    									set(
                                    										current,
                                    										"value",
                                    										lv_value_8_2,
                                    										"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalInteractiontxt.g:1175:6: (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' )
                            {
                            // InternalInteractiontxt.g:1175:6: (otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"' )
                            // InternalInteractiontxt.g:1176:7: otherlv_9= '\"' ( (lv_value_10_0= ruleEString ) ) otherlv_11= '\"'
                            {
                            otherlv_9=(Token)match(input,23,FOLLOW_4); 

                            							newLeafNode(otherlv_9, grammarAccess.getCVElementAccess().getQuotationMarkKeyword_5_0_2_1_0());
                            						
                            // InternalInteractiontxt.g:1180:7: ( (lv_value_10_0= ruleEString ) )
                            // InternalInteractiontxt.g:1181:8: (lv_value_10_0= ruleEString )
                            {
                            // InternalInteractiontxt.g:1181:8: (lv_value_10_0= ruleEString )
                            // InternalInteractiontxt.g:1182:9: lv_value_10_0= ruleEString
                            {

                            									newCompositeNode(grammarAccess.getCVElementAccess().getValueEStringParserRuleCall_5_0_2_1_1_0());
                            								
                            pushFollow(FOLLOW_18);
                            lv_value_10_0=ruleEString();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getCVElementRule());
                            									}
                            									set(
                            										current,
                            										"value",
                            										lv_value_10_0,
                            										"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_11=(Token)match(input,23,FOLLOW_24); 

                            							newLeafNode(otherlv_11, grammarAccess.getCVElementAccess().getQuotationMarkKeyword_5_0_2_1_2());
                            						

                            }


                            }
                            break;

                    }

                    // InternalInteractiontxt.g:1205:5: (otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==28) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalInteractiontxt.g:1206:6: otherlv_12= ',' otherlv_13= 'element' otherlv_14= '=' ( ( ruleEString ) )
                            {
                            otherlv_12=(Token)match(input,28,FOLLOW_25); 

                            						newLeafNode(otherlv_12, grammarAccess.getCVElementAccess().getCommaKeyword_5_0_3_0());
                            					
                            otherlv_13=(Token)match(input,29,FOLLOW_16); 

                            						newLeafNode(otherlv_13, grammarAccess.getCVElementAccess().getElementKeyword_5_0_3_1());
                            					
                            otherlv_14=(Token)match(input,22,FOLLOW_4); 

                            						newLeafNode(otherlv_14, grammarAccess.getCVElementAccess().getEqualsSignKeyword_5_0_3_2());
                            					
                            // InternalInteractiontxt.g:1218:6: ( ( ruleEString ) )
                            // InternalInteractiontxt.g:1219:7: ( ruleEString )
                            {
                            // InternalInteractiontxt.g:1219:7: ( ruleEString )
                            // InternalInteractiontxt.g:1220:8: ruleEString
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCVElementRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getCVElementAccess().getElementCAElementCrossReference_5_0_3_3_0());
                            							
                            pushFollow(FOLLOW_19);
                            ruleEString();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:1237:4: (otherlv_16= 'element' otherlv_17= '=' ( ( ruleEString ) ) )
                    {
                    // InternalInteractiontxt.g:1237:4: (otherlv_16= 'element' otherlv_17= '=' ( ( ruleEString ) ) )
                    // InternalInteractiontxt.g:1238:5: otherlv_16= 'element' otherlv_17= '=' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_16); 

                    					newLeafNode(otherlv_16, grammarAccess.getCVElementAccess().getElementKeyword_5_1_0());
                    				
                    otherlv_17=(Token)match(input,22,FOLLOW_4); 

                    					newLeafNode(otherlv_17, grammarAccess.getCVElementAccess().getEqualsSignKeyword_5_1_1());
                    				
                    // InternalInteractiontxt.g:1246:5: ( ( ruleEString ) )
                    // InternalInteractiontxt.g:1247:6: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:1247:6: ( ruleEString )
                    // InternalInteractiontxt.g:1248:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCVElementRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getCVElementAccess().getElementCAElementCrossReference_5_1_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getCVElementAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCVElement"


    // $ANTLR start "entryRuleAIElement"
    // InternalInteractiontxt.g:1272:1: entryRuleAIElement returns [EObject current=null] : iv_ruleAIElement= ruleAIElement EOF ;
    public final EObject entryRuleAIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIElement = null;


        try {
            // InternalInteractiontxt.g:1272:50: (iv_ruleAIElement= ruleAIElement EOF )
            // InternalInteractiontxt.g:1273:2: iv_ruleAIElement= ruleAIElement EOF
            {
             newCompositeNode(grammarAccess.getAIElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAIElement=ruleAIElement();

            state._fsp--;

             current =iv_ruleAIElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAIElement"


    // $ANTLR start "ruleAIElement"
    // InternalInteractiontxt.g:1279:1: ruleAIElement returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' otherlv_5= '=' otherlv_6= '\"' ( (lv_value_7_0= ruleEString ) ) otherlv_8= '\"' )? otherlv_9= '}' ) ;
    public final EObject ruleAIElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:1285:2: ( ( () otherlv_1= 'Interface' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' otherlv_5= '=' otherlv_6= '\"' ( (lv_value_7_0= ruleEString ) ) otherlv_8= '\"' )? otherlv_9= '}' ) )
            // InternalInteractiontxt.g:1286:2: ( () otherlv_1= 'Interface' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' otherlv_5= '=' otherlv_6= '\"' ( (lv_value_7_0= ruleEString ) ) otherlv_8= '\"' )? otherlv_9= '}' )
            {
            // InternalInteractiontxt.g:1286:2: ( () otherlv_1= 'Interface' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' otherlv_5= '=' otherlv_6= '\"' ( (lv_value_7_0= ruleEString ) ) otherlv_8= '\"' )? otherlv_9= '}' )
            // InternalInteractiontxt.g:1287:3: () otherlv_1= 'Interface' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' otherlv_5= '=' otherlv_6= '\"' ( (lv_value_7_0= ruleEString ) ) otherlv_8= '\"' )? otherlv_9= '}'
            {
            // InternalInteractiontxt.g:1287:3: ()
            // InternalInteractiontxt.g:1288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAIElementAccess().getAIElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAIElementAccess().getInterfaceKeyword_1());
            		
            // InternalInteractiontxt.g:1298:3: ( (lv_id_2_0= ruleEString ) )
            // InternalInteractiontxt.g:1299:4: (lv_id_2_0= ruleEString )
            {
            // InternalInteractiontxt.g:1299:4: (lv_id_2_0= ruleEString )
            // InternalInteractiontxt.g:1300:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAIElementAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAIElementRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAIElementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInteractiontxt.g:1321:3: (otherlv_4= 'value' otherlv_5= '=' otherlv_6= '\"' ( (lv_value_7_0= ruleEString ) ) otherlv_8= '\"' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalInteractiontxt.g:1322:4: otherlv_4= 'value' otherlv_5= '=' otherlv_6= '\"' ( (lv_value_7_0= ruleEString ) ) otherlv_8= '\"'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getAIElementAccess().getValueKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getAIElementAccess().getEqualsSignKeyword_4_1());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAIElementAccess().getQuotationMarkKeyword_4_2());
                    			
                    // InternalInteractiontxt.g:1334:4: ( (lv_value_7_0= ruleEString ) )
                    // InternalInteractiontxt.g:1335:5: (lv_value_7_0= ruleEString )
                    {
                    // InternalInteractiontxt.g:1335:5: (lv_value_7_0= ruleEString )
                    // InternalInteractiontxt.g:1336:6: lv_value_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAIElementAccess().getValueEStringParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_value_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAIElementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getAIElementAccess().getQuotationMarkKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAIElementAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAIElement"


    // $ANTLR start "entryRuleAOElement"
    // InternalInteractiontxt.g:1366:1: entryRuleAOElement returns [EObject current=null] : iv_ruleAOElement= ruleAOElement EOF ;
    public final EObject entryRuleAOElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAOElement = null;


        try {
            // InternalInteractiontxt.g:1366:50: (iv_ruleAOElement= ruleAOElement EOF )
            // InternalInteractiontxt.g:1367:2: iv_ruleAOElement= ruleAOElement EOF
            {
             newCompositeNode(grammarAccess.getAOElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAOElement=ruleAOElement();

            state._fsp--;

             current =iv_ruleAOElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAOElement"


    // $ANTLR start "ruleAOElement"
    // InternalInteractiontxt.g:1373:1: ruleAOElement returns [EObject current=null] : ( () otherlv_1= 'Operation' ( (lv_operation_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' otherlv_5= '=' ( ( ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"' ) )? )? otherlv_10= '}' ) ;
    public final EObject ruleAOElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_value_6_1=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_operation_2_0 = null;

        AntlrDatatypeRuleToken lv_value_6_2 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:1379:2: ( ( () otherlv_1= 'Operation' ( (lv_operation_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' otherlv_5= '=' ( ( ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"' ) )? )? otherlv_10= '}' ) )
            // InternalInteractiontxt.g:1380:2: ( () otherlv_1= 'Operation' ( (lv_operation_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' otherlv_5= '=' ( ( ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"' ) )? )? otherlv_10= '}' )
            {
            // InternalInteractiontxt.g:1380:2: ( () otherlv_1= 'Operation' ( (lv_operation_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' otherlv_5= '=' ( ( ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"' ) )? )? otherlv_10= '}' )
            // InternalInteractiontxt.g:1381:3: () otherlv_1= 'Operation' ( (lv_operation_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' otherlv_5= '=' ( ( ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"' ) )? )? otherlv_10= '}'
            {
            // InternalInteractiontxt.g:1381:3: ()
            // InternalInteractiontxt.g:1382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAOElementAccess().getAOElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAOElementAccess().getOperationKeyword_1());
            		
            // InternalInteractiontxt.g:1392:3: ( (lv_operation_2_0= ruleEString ) )
            // InternalInteractiontxt.g:1393:4: (lv_operation_2_0= ruleEString )
            {
            // InternalInteractiontxt.g:1393:4: (lv_operation_2_0= ruleEString )
            // InternalInteractiontxt.g:1394:5: lv_operation_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAOElementAccess().getOperationEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_operation_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAOElementRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_2_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAOElementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInteractiontxt.g:1415:3: (otherlv_4= 'value' otherlv_5= '=' ( ( ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"' ) )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalInteractiontxt.g:1416:4: otherlv_4= 'value' otherlv_5= '=' ( ( ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"' ) )?
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getAOElementAccess().getValueKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getAOElementAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalInteractiontxt.g:1424:4: ( ( ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) ) ) | (otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"' ) )?
                    int alt27=3;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||LA27_0==24) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==23) ) {
                        alt27=2;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalInteractiontxt.g:1425:5: ( ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) ) )
                            {
                            // InternalInteractiontxt.g:1425:5: ( ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) ) )
                            // InternalInteractiontxt.g:1426:6: ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) )
                            {
                            // InternalInteractiontxt.g:1426:6: ( (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString ) )
                            // InternalInteractiontxt.g:1427:7: (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString )
                            {
                            // InternalInteractiontxt.g:1427:7: (lv_value_6_1= 'focusElement' | lv_value_6_2= ruleEString )
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==24) ) {
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
                                    // InternalInteractiontxt.g:1428:8: lv_value_6_1= 'focusElement'
                                    {
                                    lv_value_6_1=(Token)match(input,24,FOLLOW_19); 

                                    								newLeafNode(lv_value_6_1, grammarAccess.getAOElementAccess().getValueFocusElementKeyword_4_2_0_0_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getAOElementRule());
                                    								}
                                    								setWithLastConsumed(current, "value", lv_value_6_1, null);
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalInteractiontxt.g:1439:8: lv_value_6_2= ruleEString
                                    {

                                    								newCompositeNode(grammarAccess.getAOElementAccess().getValueEStringParserRuleCall_4_2_0_0_1());
                                    							
                                    pushFollow(FOLLOW_19);
                                    lv_value_6_2=ruleEString();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getAOElementRule());
                                    								}
                                    								set(
                                    									current,
                                    									"value",
                                    									lv_value_6_2,
                                    									"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalInteractiontxt.g:1458:5: (otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"' )
                            {
                            // InternalInteractiontxt.g:1458:5: (otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"' )
                            // InternalInteractiontxt.g:1459:6: otherlv_7= '\"' ( (lv_value_8_0= ruleEString ) ) otherlv_9= '\"'
                            {
                            otherlv_7=(Token)match(input,23,FOLLOW_4); 

                            						newLeafNode(otherlv_7, grammarAccess.getAOElementAccess().getQuotationMarkKeyword_4_2_1_0());
                            					
                            // InternalInteractiontxt.g:1463:6: ( (lv_value_8_0= ruleEString ) )
                            // InternalInteractiontxt.g:1464:7: (lv_value_8_0= ruleEString )
                            {
                            // InternalInteractiontxt.g:1464:7: (lv_value_8_0= ruleEString )
                            // InternalInteractiontxt.g:1465:8: lv_value_8_0= ruleEString
                            {

                            								newCompositeNode(grammarAccess.getAOElementAccess().getValueEStringParserRuleCall_4_2_1_1_0());
                            							
                            pushFollow(FOLLOW_18);
                            lv_value_8_0=ruleEString();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getAOElementRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_8_0,
                            									"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_9=(Token)match(input,23,FOLLOW_19); 

                            						newLeafNode(otherlv_9, grammarAccess.getAOElementAccess().getQuotationMarkKeyword_4_2_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAOElementAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAOElement"


    // $ANTLR start "entryRuleALElement"
    // InternalInteractiontxt.g:1497:1: entryRuleALElement returns [EObject current=null] : iv_ruleALElement= ruleALElement EOF ;
    public final EObject entryRuleALElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleALElement = null;


        try {
            // InternalInteractiontxt.g:1497:50: (iv_ruleALElement= ruleALElement EOF )
            // InternalInteractiontxt.g:1498:2: iv_ruleALElement= ruleALElement EOF
            {
             newCompositeNode(grammarAccess.getALElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleALElement=ruleALElement();

            state._fsp--;

             current =iv_ruleALElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleALElement"


    // $ANTLR start "ruleALElement"
    // InternalInteractiontxt.g:1504:1: ruleALElement returns [EObject current=null] : ( () otherlv_1= 'Lang' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) ) )? ) | (otherlv_16= 'value' otherlv_17= '=' otherlv_18= '\"' ( (lv_value_19_0= ruleEString ) ) otherlv_20= '\"' ) )? otherlv_21= '}' ) ;
    public final EObject ruleALElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_operation_6_1=null;
        Token lv_operation_6_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_value_11_1=null;
        Token otherlv_12=null;
        Token lv_value_13_1=null;
        Token otherlv_14=null;
        Token lv_value_15_1=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_operation_6_3 = null;

        AntlrDatatypeRuleToken lv_value_11_2 = null;

        AntlrDatatypeRuleToken lv_value_13_2 = null;

        AntlrDatatypeRuleToken lv_value_15_2 = null;

        AntlrDatatypeRuleToken lv_value_19_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:1510:2: ( ( () otherlv_1= 'Lang' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) ) )? ) | (otherlv_16= 'value' otherlv_17= '=' otherlv_18= '\"' ( (lv_value_19_0= ruleEString ) ) otherlv_20= '\"' ) )? otherlv_21= '}' ) )
            // InternalInteractiontxt.g:1511:2: ( () otherlv_1= 'Lang' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) ) )? ) | (otherlv_16= 'value' otherlv_17= '=' otherlv_18= '\"' ( (lv_value_19_0= ruleEString ) ) otherlv_20= '\"' ) )? otherlv_21= '}' )
            {
            // InternalInteractiontxt.g:1511:2: ( () otherlv_1= 'Lang' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) ) )? ) | (otherlv_16= 'value' otherlv_17= '=' otherlv_18= '\"' ( (lv_value_19_0= ruleEString ) ) otherlv_20= '\"' ) )? otherlv_21= '}' )
            // InternalInteractiontxt.g:1512:3: () otherlv_1= 'Lang' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) ) )? ) | (otherlv_16= 'value' otherlv_17= '=' otherlv_18= '\"' ( (lv_value_19_0= ruleEString ) ) otherlv_20= '\"' ) )? otherlv_21= '}'
            {
            // InternalInteractiontxt.g:1512:3: ()
            // InternalInteractiontxt.g:1513:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getALElementAccess().getALElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getALElementAccess().getLangKeyword_1());
            		
            // InternalInteractiontxt.g:1523:3: ( (lv_id_2_0= ruleEString ) )
            // InternalInteractiontxt.g:1524:4: (lv_id_2_0= ruleEString )
            {
            // InternalInteractiontxt.g:1524:4: (lv_id_2_0= ruleEString )
            // InternalInteractiontxt.g:1525:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getALElementAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getALElementRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getALElementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInteractiontxt.g:1546:3: ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) ) )? ) | (otherlv_16= 'value' otherlv_17= '=' otherlv_18= '\"' ( (lv_value_19_0= ruleEString ) ) otherlv_20= '\"' ) )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            else if ( (LA35_0==21) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // InternalInteractiontxt.g:1547:4: (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) ) )? )
                    {
                    // InternalInteractiontxt.g:1547:4: (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) ) )? )
                    // InternalInteractiontxt.g:1548:5: otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) ) )?
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_16); 

                    					newLeafNode(otherlv_4, grammarAccess.getALElementAccess().getOpKeyword_4_0_0());
                    				
                    otherlv_5=(Token)match(input,22,FOLLOW_28); 

                    					newLeafNode(otherlv_5, grammarAccess.getALElementAccess().getEqualsSignKeyword_4_0_1());
                    				
                    // InternalInteractiontxt.g:1556:5: ( ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) ) )
                    // InternalInteractiontxt.g:1557:6: ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) )
                    {
                    // InternalInteractiontxt.g:1557:6: ( (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString ) )
                    // InternalInteractiontxt.g:1558:7: (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString )
                    {
                    // InternalInteractiontxt.g:1558:7: (lv_operation_6_1= 'add' | lv_operation_6_2= 'rem' | lv_operation_6_3= ruleEString )
                    int alt29=3;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt29=1;
                        }
                        break;
                    case 33:
                        {
                        alt29=2;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_ID:
                        {
                        alt29=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // InternalInteractiontxt.g:1559:8: lv_operation_6_1= 'add'
                            {
                            lv_operation_6_1=(Token)match(input,32,FOLLOW_24); 

                            								newLeafNode(lv_operation_6_1, grammarAccess.getALElementAccess().getOperationAddKeyword_4_0_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getALElementRule());
                            								}
                            								setWithLastConsumed(current, "operation", lv_operation_6_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalInteractiontxt.g:1570:8: lv_operation_6_2= 'rem'
                            {
                            lv_operation_6_2=(Token)match(input,33,FOLLOW_24); 

                            								newLeafNode(lv_operation_6_2, grammarAccess.getALElementAccess().getOperationRemKeyword_4_0_2_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getALElementRule());
                            								}
                            								setWithLastConsumed(current, "operation", lv_operation_6_2, null);
                            							

                            }
                            break;
                        case 3 :
                            // InternalInteractiontxt.g:1581:8: lv_operation_6_3= ruleEString
                            {

                            								newCompositeNode(grammarAccess.getALElementAccess().getOperationEStringParserRuleCall_4_0_2_0_2());
                            							
                            pushFollow(FOLLOW_24);
                            lv_operation_6_3=ruleEString();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getALElementRule());
                            								}
                            								set(
                            									current,
                            									"operation",
                            									lv_operation_6_3,
                            									"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;

                    }


                    }


                    }

                    // InternalInteractiontxt.g:1599:5: (otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==28) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalInteractiontxt.g:1600:6: otherlv_7= ',' otherlv_8= 'value' otherlv_9= '=' ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) )
                            {
                            otherlv_7=(Token)match(input,28,FOLLOW_29); 

                            						newLeafNode(otherlv_7, grammarAccess.getALElementAccess().getCommaKeyword_4_0_3_0());
                            					
                            otherlv_8=(Token)match(input,21,FOLLOW_16); 

                            						newLeafNode(otherlv_8, grammarAccess.getALElementAccess().getValueKeyword_4_0_3_1());
                            					
                            otherlv_9=(Token)match(input,22,FOLLOW_30); 

                            						newLeafNode(otherlv_9, grammarAccess.getALElementAccess().getEqualsSignKeyword_4_0_3_2());
                            					
                            // InternalInteractiontxt.g:1612:6: ( (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' ) | ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) ) )
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==34) ) {
                                alt33=1;
                            }
                            else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)||LA33_0==24) ) {
                                alt33=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 33, 0, input);

                                throw nvae;
                            }
                            switch (alt33) {
                                case 1 :
                                    // InternalInteractiontxt.g:1613:7: (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' )
                                    {
                                    // InternalInteractiontxt.g:1613:7: (otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']' )
                                    // InternalInteractiontxt.g:1614:8: otherlv_10= '[' ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) ) (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) ) otherlv_14= ']'
                                    {
                                    otherlv_10=(Token)match(input,34,FOLLOW_31); 

                                    								newLeafNode(otherlv_10, grammarAccess.getALElementAccess().getLeftSquareBracketKeyword_4_0_3_3_0_0());
                                    							
                                    // InternalInteractiontxt.g:1618:8: ( ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) ) )
                                    // InternalInteractiontxt.g:1619:9: ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) )
                                    {
                                    // InternalInteractiontxt.g:1619:9: ( (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString ) )
                                    // InternalInteractiontxt.g:1620:10: (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString )
                                    {
                                    // InternalInteractiontxt.g:1620:10: (lv_value_11_1= 'focusElement' | lv_value_11_2= ruleEString )
                                    int alt30=2;
                                    int LA30_0 = input.LA(1);

                                    if ( (LA30_0==24) ) {
                                        alt30=1;
                                    }
                                    else if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                                        alt30=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 30, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt30) {
                                        case 1 :
                                            // InternalInteractiontxt.g:1621:11: lv_value_11_1= 'focusElement'
                                            {
                                            lv_value_11_1=(Token)match(input,24,FOLLOW_32); 

                                            											newLeafNode(lv_value_11_1, grammarAccess.getALElementAccess().getValueFocusElementKeyword_4_0_3_3_0_1_0_0());
                                            										

                                            											if (current==null) {
                                            												current = createModelElement(grammarAccess.getALElementRule());
                                            											}
                                            											addWithLastConsumed(current, "value", lv_value_11_1, null);
                                            										

                                            }
                                            break;
                                        case 2 :
                                            // InternalInteractiontxt.g:1632:11: lv_value_11_2= ruleEString
                                            {

                                            											newCompositeNode(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_0_3_3_0_1_0_1());
                                            										
                                            pushFollow(FOLLOW_32);
                                            lv_value_11_2=ruleEString();

                                            state._fsp--;


                                            											if (current==null) {
                                            												current = createModelElementForParent(grammarAccess.getALElementRule());
                                            											}
                                            											add(
                                            												current,
                                            												"value",
                                            												lv_value_11_2,
                                            												"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                                            											afterParserOrEnumRuleCall();
                                            										

                                            }
                                            break;

                                    }


                                    }


                                    }

                                    // InternalInteractiontxt.g:1650:8: (otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) ) )
                                    // InternalInteractiontxt.g:1651:9: otherlv_12= ',' ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) )
                                    {
                                    otherlv_12=(Token)match(input,28,FOLLOW_31); 

                                    									newLeafNode(otherlv_12, grammarAccess.getALElementAccess().getCommaKeyword_4_0_3_3_0_2_0());
                                    								
                                    // InternalInteractiontxt.g:1655:9: ( ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) ) )
                                    // InternalInteractiontxt.g:1656:10: ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) )
                                    {
                                    // InternalInteractiontxt.g:1656:10: ( (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString ) )
                                    // InternalInteractiontxt.g:1657:11: (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString )
                                    {
                                    // InternalInteractiontxt.g:1657:11: (lv_value_13_1= 'focusElement' | lv_value_13_2= ruleEString )
                                    int alt31=2;
                                    int LA31_0 = input.LA(1);

                                    if ( (LA31_0==24) ) {
                                        alt31=1;
                                    }
                                    else if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                                        alt31=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 31, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt31) {
                                        case 1 :
                                            // InternalInteractiontxt.g:1658:12: lv_value_13_1= 'focusElement'
                                            {
                                            lv_value_13_1=(Token)match(input,24,FOLLOW_33); 

                                            												newLeafNode(lv_value_13_1, grammarAccess.getALElementAccess().getValueFocusElementKeyword_4_0_3_3_0_2_1_0_0());
                                            											

                                            												if (current==null) {
                                            													current = createModelElement(grammarAccess.getALElementRule());
                                            												}
                                            												addWithLastConsumed(current, "value", lv_value_13_1, null);
                                            											

                                            }
                                            break;
                                        case 2 :
                                            // InternalInteractiontxt.g:1669:12: lv_value_13_2= ruleEString
                                            {

                                            												newCompositeNode(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_0_3_3_0_2_1_0_1());
                                            											
                                            pushFollow(FOLLOW_33);
                                            lv_value_13_2=ruleEString();

                                            state._fsp--;


                                            												if (current==null) {
                                            													current = createModelElementForParent(grammarAccess.getALElementRule());
                                            												}
                                            												add(
                                            													current,
                                            													"value",
                                            													lv_value_13_2,
                                            													"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                                            												afterParserOrEnumRuleCall();
                                            											

                                            }
                                            break;

                                    }


                                    }


                                    }


                                    }

                                    otherlv_14=(Token)match(input,35,FOLLOW_19); 

                                    								newLeafNode(otherlv_14, grammarAccess.getALElementAccess().getRightSquareBracketKeyword_4_0_3_3_0_3());
                                    							

                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalInteractiontxt.g:1694:7: ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) )
                                    {
                                    // InternalInteractiontxt.g:1694:7: ( ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) ) )
                                    // InternalInteractiontxt.g:1695:8: ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) )
                                    {
                                    // InternalInteractiontxt.g:1695:8: ( (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString ) )
                                    // InternalInteractiontxt.g:1696:9: (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString )
                                    {
                                    // InternalInteractiontxt.g:1696:9: (lv_value_15_1= 'focusElement' | lv_value_15_2= ruleEString )
                                    int alt32=2;
                                    int LA32_0 = input.LA(1);

                                    if ( (LA32_0==24) ) {
                                        alt32=1;
                                    }
                                    else if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                                        alt32=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 32, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt32) {
                                        case 1 :
                                            // InternalInteractiontxt.g:1697:10: lv_value_15_1= 'focusElement'
                                            {
                                            lv_value_15_1=(Token)match(input,24,FOLLOW_19); 

                                            										newLeafNode(lv_value_15_1, grammarAccess.getALElementAccess().getValueFocusElementKeyword_4_0_3_3_1_0_0());
                                            									

                                            										if (current==null) {
                                            											current = createModelElement(grammarAccess.getALElementRule());
                                            										}
                                            										addWithLastConsumed(current, "value", lv_value_15_1, null);
                                            									

                                            }
                                            break;
                                        case 2 :
                                            // InternalInteractiontxt.g:1708:10: lv_value_15_2= ruleEString
                                            {

                                            										newCompositeNode(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_0_3_3_1_0_1());
                                            									
                                            pushFollow(FOLLOW_19);
                                            lv_value_15_2=ruleEString();

                                            state._fsp--;


                                            										if (current==null) {
                                            											current = createModelElementForParent(grammarAccess.getALElementRule());
                                            										}
                                            										add(
                                            											current,
                                            											"value",
                                            											lv_value_15_2,
                                            											"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                                            										afterParserOrEnumRuleCall();
                                            									

                                            }
                                            break;

                                    }


                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:1730:4: (otherlv_16= 'value' otherlv_17= '=' otherlv_18= '\"' ( (lv_value_19_0= ruleEString ) ) otherlv_20= '\"' )
                    {
                    // InternalInteractiontxt.g:1730:4: (otherlv_16= 'value' otherlv_17= '=' otherlv_18= '\"' ( (lv_value_19_0= ruleEString ) ) otherlv_20= '\"' )
                    // InternalInteractiontxt.g:1731:5: otherlv_16= 'value' otherlv_17= '=' otherlv_18= '\"' ( (lv_value_19_0= ruleEString ) ) otherlv_20= '\"'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_16); 

                    					newLeafNode(otherlv_16, grammarAccess.getALElementAccess().getValueKeyword_4_1_0());
                    				
                    otherlv_17=(Token)match(input,22,FOLLOW_18); 

                    					newLeafNode(otherlv_17, grammarAccess.getALElementAccess().getEqualsSignKeyword_4_1_1());
                    				
                    otherlv_18=(Token)match(input,23,FOLLOW_4); 

                    					newLeafNode(otherlv_18, grammarAccess.getALElementAccess().getQuotationMarkKeyword_4_1_2());
                    				
                    // InternalInteractiontxt.g:1743:5: ( (lv_value_19_0= ruleEString ) )
                    // InternalInteractiontxt.g:1744:6: (lv_value_19_0= ruleEString )
                    {
                    // InternalInteractiontxt.g:1744:6: (lv_value_19_0= ruleEString )
                    // InternalInteractiontxt.g:1745:7: lv_value_19_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getALElementAccess().getValueEStringParserRuleCall_4_1_3_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_value_19_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getALElementRule());
                    							}
                    							add(
                    								current,
                    								"value",
                    								lv_value_19_0,
                    								"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_20=(Token)match(input,23,FOLLOW_19); 

                    					newLeafNode(otherlv_20, grammarAccess.getALElementAccess().getQuotationMarkKeyword_4_1_4());
                    				

                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getALElementAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleALElement"


    // $ANTLR start "entryRuleACanvas"
    // InternalInteractiontxt.g:1776:1: entryRuleACanvas returns [EObject current=null] : iv_ruleACanvas= ruleACanvas EOF ;
    public final EObject entryRuleACanvas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACanvas = null;


        try {
            // InternalInteractiontxt.g:1776:48: (iv_ruleACanvas= ruleACanvas EOF )
            // InternalInteractiontxt.g:1777:2: iv_ruleACanvas= ruleACanvas EOF
            {
             newCompositeNode(grammarAccess.getACanvasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleACanvas=ruleACanvas();

            state._fsp--;

             current =iv_ruleACanvas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACanvas"


    // $ANTLR start "ruleACanvas"
    // InternalInteractiontxt.g:1783:1: ruleACanvas returns [EObject current=null] : ( () otherlv_1= 'Canvas' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '=' otherlv_5= '\"' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '\"' )? otherlv_8= '}' ) ;
    public final EObject ruleACanvas() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:1789:2: ( ( () otherlv_1= 'Canvas' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '=' otherlv_5= '\"' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '\"' )? otherlv_8= '}' ) )
            // InternalInteractiontxt.g:1790:2: ( () otherlv_1= 'Canvas' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '=' otherlv_5= '\"' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '\"' )? otherlv_8= '}' )
            {
            // InternalInteractiontxt.g:1790:2: ( () otherlv_1= 'Canvas' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '=' otherlv_5= '\"' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '\"' )? otherlv_8= '}' )
            // InternalInteractiontxt.g:1791:3: () otherlv_1= 'Canvas' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '=' otherlv_5= '\"' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '\"' )? otherlv_8= '}'
            {
            // InternalInteractiontxt.g:1791:3: ()
            // InternalInteractiontxt.g:1792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getACanvasAccess().getACanvasAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getACanvasAccess().getCanvasKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getACanvasAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalInteractiontxt.g:1806:3: (otherlv_3= 'value' otherlv_4= '=' otherlv_5= '\"' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '\"' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalInteractiontxt.g:1807:4: otherlv_3= 'value' otherlv_4= '=' otherlv_5= '\"' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '\"'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getACanvasAccess().getValueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getACanvasAccess().getEqualsSignKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getACanvasAccess().getQuotationMarkKeyword_3_2());
                    			
                    // InternalInteractiontxt.g:1819:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalInteractiontxt.g:1820:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalInteractiontxt.g:1820:5: (lv_value_6_0= ruleEString )
                    // InternalInteractiontxt.g:1821:6: lv_value_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getACanvasAccess().getValueEStringParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_value_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getACanvasRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getACanvasAccess().getQuotationMarkKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getACanvasAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACanvas"


    // $ANTLR start "entryRuleAVElement"
    // InternalInteractiontxt.g:1851:1: entryRuleAVElement returns [EObject current=null] : iv_ruleAVElement= ruleAVElement EOF ;
    public final EObject entryRuleAVElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAVElement = null;


        try {
            // InternalInteractiontxt.g:1851:50: (iv_ruleAVElement= ruleAVElement EOF )
            // InternalInteractiontxt.g:1852:2: iv_ruleAVElement= ruleAVElement EOF
            {
             newCompositeNode(grammarAccess.getAVElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAVElement=ruleAVElement();

            state._fsp--;

             current =iv_ruleAVElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAVElement"


    // $ANTLR start "ruleAVElement"
    // InternalInteractiontxt.g:1858:1: ruleAVElement returns [EObject current=null] : ( () otherlv_1= 'Var' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) ) ) otherlv_7= ',' otherlv_8= 'from' otherlv_9= '=' ( ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) ) ) ) | (otherlv_11= 'value' otherlv_12= '=' ( (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) ) | ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) ) ) ) | (otherlv_17= 'element' otherlv_18= '=' ( ( ruleEString ) ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleAVElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_operation_6_1=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_value_10_1=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_operation_15_0=null;
        Token lv_value_16_1=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_operation_6_2 = null;

        AntlrDatatypeRuleToken lv_value_10_2 = null;

        AntlrDatatypeRuleToken lv_value_14_0 = null;

        AntlrDatatypeRuleToken lv_value_16_2 = null;



        	enterRule();

        try {
            // InternalInteractiontxt.g:1864:2: ( ( () otherlv_1= 'Var' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) ) ) otherlv_7= ',' otherlv_8= 'from' otherlv_9= '=' ( ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) ) ) ) | (otherlv_11= 'value' otherlv_12= '=' ( (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) ) | ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) ) ) ) | (otherlv_17= 'element' otherlv_18= '=' ( ( ruleEString ) ) ) )? otherlv_20= '}' ) )
            // InternalInteractiontxt.g:1865:2: ( () otherlv_1= 'Var' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) ) ) otherlv_7= ',' otherlv_8= 'from' otherlv_9= '=' ( ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) ) ) ) | (otherlv_11= 'value' otherlv_12= '=' ( (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) ) | ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) ) ) ) | (otherlv_17= 'element' otherlv_18= '=' ( ( ruleEString ) ) ) )? otherlv_20= '}' )
            {
            // InternalInteractiontxt.g:1865:2: ( () otherlv_1= 'Var' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) ) ) otherlv_7= ',' otherlv_8= 'from' otherlv_9= '=' ( ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) ) ) ) | (otherlv_11= 'value' otherlv_12= '=' ( (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) ) | ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) ) ) ) | (otherlv_17= 'element' otherlv_18= '=' ( ( ruleEString ) ) ) )? otherlv_20= '}' )
            // InternalInteractiontxt.g:1866:3: () otherlv_1= 'Var' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) ) ) otherlv_7= ',' otherlv_8= 'from' otherlv_9= '=' ( ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) ) ) ) | (otherlv_11= 'value' otherlv_12= '=' ( (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) ) | ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) ) ) ) | (otherlv_17= 'element' otherlv_18= '=' ( ( ruleEString ) ) ) )? otherlv_20= '}'
            {
            // InternalInteractiontxt.g:1866:3: ()
            // InternalInteractiontxt.g:1867:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAVElementAccess().getAVElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAVElementAccess().getVarKeyword_1());
            		
            // InternalInteractiontxt.g:1877:3: ( (lv_id_2_0= ruleEString ) )
            // InternalInteractiontxt.g:1878:4: (lv_id_2_0= ruleEString )
            {
            // InternalInteractiontxt.g:1878:4: (lv_id_2_0= ruleEString )
            // InternalInteractiontxt.g:1879:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAVElementAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAVElementRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getAVElementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalInteractiontxt.g:1900:3: ( (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) ) ) otherlv_7= ',' otherlv_8= 'from' otherlv_9= '=' ( ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) ) ) ) | (otherlv_11= 'value' otherlv_12= '=' ( (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) ) | ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) ) ) ) | (otherlv_17= 'element' otherlv_18= '=' ( ( ruleEString ) ) ) )?
            int alt41=4;
            switch ( input.LA(1) ) {
                case 31:
                    {
                    alt41=1;
                    }
                    break;
                case 21:
                    {
                    alt41=2;
                    }
                    break;
                case 29:
                    {
                    alt41=3;
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // InternalInteractiontxt.g:1901:4: (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) ) ) otherlv_7= ',' otherlv_8= 'from' otherlv_9= '=' ( ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) ) ) )
                    {
                    // InternalInteractiontxt.g:1901:4: (otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) ) ) otherlv_7= ',' otherlv_8= 'from' otherlv_9= '=' ( ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) ) ) )
                    // InternalInteractiontxt.g:1902:5: otherlv_4= 'op' otherlv_5= '=' ( ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) ) ) otherlv_7= ',' otherlv_8= 'from' otherlv_9= '=' ( ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_16); 

                    					newLeafNode(otherlv_4, grammarAccess.getAVElementAccess().getOpKeyword_4_0_0());
                    				
                    otherlv_5=(Token)match(input,22,FOLLOW_35); 

                    					newLeafNode(otherlv_5, grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_0_1());
                    				
                    // InternalInteractiontxt.g:1910:5: ( ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) ) )
                    // InternalInteractiontxt.g:1911:6: ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) )
                    {
                    // InternalInteractiontxt.g:1911:6: ( (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString ) )
                    // InternalInteractiontxt.g:1912:7: (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString )
                    {
                    // InternalInteractiontxt.g:1912:7: (lv_operation_6_1= 'copy' | lv_operation_6_2= ruleEString )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==36) ) {
                        alt37=1;
                    }
                    else if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalInteractiontxt.g:1913:8: lv_operation_6_1= 'copy'
                            {
                            lv_operation_6_1=(Token)match(input,36,FOLLOW_32); 

                            								newLeafNode(lv_operation_6_1, grammarAccess.getAVElementAccess().getOperationCopyKeyword_4_0_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAVElementRule());
                            								}
                            								setWithLastConsumed(current, "operation", lv_operation_6_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalInteractiontxt.g:1924:8: lv_operation_6_2= ruleEString
                            {

                            								newCompositeNode(grammarAccess.getAVElementAccess().getOperationEStringParserRuleCall_4_0_2_0_1());
                            							
                            pushFollow(FOLLOW_32);
                            lv_operation_6_2=ruleEString();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getAVElementRule());
                            								}
                            								set(
                            									current,
                            									"operation",
                            									lv_operation_6_2,
                            									"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;

                    }


                    }


                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_36); 

                    					newLeafNode(otherlv_7, grammarAccess.getAVElementAccess().getCommaKeyword_4_0_3());
                    				
                    otherlv_8=(Token)match(input,37,FOLLOW_16); 

                    					newLeafNode(otherlv_8, grammarAccess.getAVElementAccess().getFromKeyword_4_0_4());
                    				
                    otherlv_9=(Token)match(input,22,FOLLOW_31); 

                    					newLeafNode(otherlv_9, grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_0_5());
                    				
                    // InternalInteractiontxt.g:1954:5: ( ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) ) )
                    // InternalInteractiontxt.g:1955:6: ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) )
                    {
                    // InternalInteractiontxt.g:1955:6: ( (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString ) )
                    // InternalInteractiontxt.g:1956:7: (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString )
                    {
                    // InternalInteractiontxt.g:1956:7: (lv_value_10_1= 'focusElement' | lv_value_10_2= ruleEString )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==24) ) {
                        alt38=1;
                    }
                    else if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalInteractiontxt.g:1957:8: lv_value_10_1= 'focusElement'
                            {
                            lv_value_10_1=(Token)match(input,24,FOLLOW_19); 

                            								newLeafNode(lv_value_10_1, grammarAccess.getAVElementAccess().getValueFocusElementKeyword_4_0_6_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAVElementRule());
                            								}
                            								setWithLastConsumed(current, "value", lv_value_10_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalInteractiontxt.g:1968:8: lv_value_10_2= ruleEString
                            {

                            								newCompositeNode(grammarAccess.getAVElementAccess().getValueEStringParserRuleCall_4_0_6_0_1());
                            							
                            pushFollow(FOLLOW_19);
                            lv_value_10_2=ruleEString();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getAVElementRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_10_2,
                            									"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInteractiontxt.g:1988:4: (otherlv_11= 'value' otherlv_12= '=' ( (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) ) | ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) ) ) )
                    {
                    // InternalInteractiontxt.g:1988:4: (otherlv_11= 'value' otherlv_12= '=' ( (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) ) | ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) ) ) )
                    // InternalInteractiontxt.g:1989:5: otherlv_11= 'value' otherlv_12= '=' ( (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) ) | ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) ) )
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_16); 

                    					newLeafNode(otherlv_11, grammarAccess.getAVElementAccess().getValueKeyword_4_1_0());
                    				
                    otherlv_12=(Token)match(input,22,FOLLOW_17); 

                    					newLeafNode(otherlv_12, grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_1_1());
                    				
                    // InternalInteractiontxt.g:1997:5: ( (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) ) | ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==23) ) {
                        alt40=1;
                    }
                    else if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)||LA40_0==24) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalInteractiontxt.g:1998:6: (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) )
                            {
                            // InternalInteractiontxt.g:1998:6: (otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) ) )
                            // InternalInteractiontxt.g:1999:7: otherlv_13= '\"' ( (lv_value_14_0= ruleEString ) ) ( (lv_operation_15_0= '\"' ) )
                            {
                            otherlv_13=(Token)match(input,23,FOLLOW_4); 

                            							newLeafNode(otherlv_13, grammarAccess.getAVElementAccess().getQuotationMarkKeyword_4_1_2_0_0());
                            						
                            // InternalInteractiontxt.g:2003:7: ( (lv_value_14_0= ruleEString ) )
                            // InternalInteractiontxt.g:2004:8: (lv_value_14_0= ruleEString )
                            {
                            // InternalInteractiontxt.g:2004:8: (lv_value_14_0= ruleEString )
                            // InternalInteractiontxt.g:2005:9: lv_value_14_0= ruleEString
                            {

                            									newCompositeNode(grammarAccess.getAVElementAccess().getValueEStringParserRuleCall_4_1_2_0_1_0());
                            								
                            pushFollow(FOLLOW_18);
                            lv_value_14_0=ruleEString();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getAVElementRule());
                            									}
                            									set(
                            										current,
                            										"value",
                            										lv_value_14_0,
                            										"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalInteractiontxt.g:2022:7: ( (lv_operation_15_0= '\"' ) )
                            // InternalInteractiontxt.g:2023:8: (lv_operation_15_0= '\"' )
                            {
                            // InternalInteractiontxt.g:2023:8: (lv_operation_15_0= '\"' )
                            // InternalInteractiontxt.g:2024:9: lv_operation_15_0= '\"'
                            {
                            lv_operation_15_0=(Token)match(input,23,FOLLOW_19); 

                            									newLeafNode(lv_operation_15_0, grammarAccess.getAVElementAccess().getOperationQuotationMarkKeyword_4_1_2_0_2_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getAVElementRule());
                            									}
                            									setWithLastConsumed(current, "operation", lv_operation_15_0, "\"");
                            								

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalInteractiontxt.g:2038:6: ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) )
                            {
                            // InternalInteractiontxt.g:2038:6: ( ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) ) )
                            // InternalInteractiontxt.g:2039:7: ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) )
                            {
                            // InternalInteractiontxt.g:2039:7: ( (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString ) )
                            // InternalInteractiontxt.g:2040:8: (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString )
                            {
                            // InternalInteractiontxt.g:2040:8: (lv_value_16_1= 'focusElement' | lv_value_16_2= ruleEString )
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==24) ) {
                                alt39=1;
                            }
                            else if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                                alt39=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 0, input);

                                throw nvae;
                            }
                            switch (alt39) {
                                case 1 :
                                    // InternalInteractiontxt.g:2041:9: lv_value_16_1= 'focusElement'
                                    {
                                    lv_value_16_1=(Token)match(input,24,FOLLOW_19); 

                                    									newLeafNode(lv_value_16_1, grammarAccess.getAVElementAccess().getValueFocusElementKeyword_4_1_2_1_0_0());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getAVElementRule());
                                    									}
                                    									setWithLastConsumed(current, "value", lv_value_16_1, null);
                                    								

                                    }
                                    break;
                                case 2 :
                                    // InternalInteractiontxt.g:2052:9: lv_value_16_2= ruleEString
                                    {

                                    									newCompositeNode(grammarAccess.getAVElementAccess().getValueEStringParserRuleCall_4_1_2_1_0_1());
                                    								
                                    pushFollow(FOLLOW_19);
                                    lv_value_16_2=ruleEString();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getAVElementRule());
                                    									}
                                    									set(
                                    										current,
                                    										"value",
                                    										lv_value_16_2,
                                    										"ca.udem.iro.geodes.interaction.Interactiontxt.EString");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalInteractiontxt.g:2073:4: (otherlv_17= 'element' otherlv_18= '=' ( ( ruleEString ) ) )
                    {
                    // InternalInteractiontxt.g:2073:4: (otherlv_17= 'element' otherlv_18= '=' ( ( ruleEString ) ) )
                    // InternalInteractiontxt.g:2074:5: otherlv_17= 'element' otherlv_18= '=' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,29,FOLLOW_16); 

                    					newLeafNode(otherlv_17, grammarAccess.getAVElementAccess().getElementKeyword_4_2_0());
                    				
                    otherlv_18=(Token)match(input,22,FOLLOW_4); 

                    					newLeafNode(otherlv_18, grammarAccess.getAVElementAccess().getEqualsSignKeyword_4_2_1());
                    				
                    // InternalInteractiontxt.g:2082:5: ( ( ruleEString ) )
                    // InternalInteractiontxt.g:2083:6: ( ruleEString )
                    {
                    // InternalInteractiontxt.g:2083:6: ( ruleEString )
                    // InternalInteractiontxt.g:2084:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAVElementRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAVElementAccess().getElementCAElementCrossReference_4_2_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getAVElementAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAVElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000E1C2000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000004E102000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020202000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001802030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080202000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000401000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000A0202000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});

}