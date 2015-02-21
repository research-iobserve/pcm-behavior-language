package org.spp.cocome.behavior.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.spp.cocome.behavior.services.BehaviorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBehaviorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_CHARACTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'repository'", "'import'", "'realize'", "'{'", "'}'", "'var'", "'val'", "'const'", "'='", "'iface'", "'operation'", "'if'", "'('", "')'", "'else'", "'for'", "':'", "'['", "']'", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'instanceof'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'!'", "'as'", "'++'", "'--'", "'new'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int RULE_CHARACTER=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBehaviorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBehaviorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBehaviorParser.tokenNames; }
    public String getGrammarFileName() { return "../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g"; }



     	private BehaviorGrammarAccess grammarAccess;
     	
        public InternalBehaviorParser(TokenStream input, BehaviorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BehaviorModel";	
       	}
       	
       	@Override
       	protected BehaviorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBehaviorModel"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:67:1: entryRuleBehaviorModel returns [EObject current=null] : iv_ruleBehaviorModel= ruleBehaviorModel EOF ;
    public final EObject entryRuleBehaviorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorModel = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:68:2: (iv_ruleBehaviorModel= ruleBehaviorModel EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:69:2: iv_ruleBehaviorModel= ruleBehaviorModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviorModelRule()); 
            }
            pushFollow(FOLLOW_ruleBehaviorModel_in_entryRuleBehaviorModel75);
            iv_ruleBehaviorModel=ruleBehaviorModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehaviorModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBehaviorModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBehaviorModel"


    // $ANTLR start "ruleBehaviorModel"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:76:1: ruleBehaviorModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) ) ;
    public final EObject ruleBehaviorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_repositories_3_0 = null;

        EObject lv_componentImpl_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleBehaviorModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBehaviorModelAccess().getPackageKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:86:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBehaviorModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBehaviorModel143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBehaviorModelRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:102:2: ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }
                else if ( (LA1_0==13) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:102:3: ( (lv_imports_2_0= ruleImport ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:102:3: ( (lv_imports_2_0= ruleImport ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBehaviorModelAccess().getImportsImportParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleBehaviorModel165);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBehaviorModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:121:6: ( (lv_repositories_3_0= ruleRepositoryReference ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:121:6: ( (lv_repositories_3_0= ruleRepositoryReference ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:122:1: (lv_repositories_3_0= ruleRepositoryReference )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:122:1: (lv_repositories_3_0= ruleRepositoryReference )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:123:3: lv_repositories_3_0= ruleRepositoryReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBehaviorModelAccess().getRepositoriesRepositoryReferenceParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRepositoryReference_in_ruleBehaviorModel192);
            	    lv_repositories_3_0=ruleRepositoryReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBehaviorModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"repositories",
            	              		lv_repositories_3_0, 
            	              		"RepositoryReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:139:4: ( (lv_componentImpl_4_0= ruleComponentImpl ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:140:1: (lv_componentImpl_4_0= ruleComponentImpl )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:140:1: (lv_componentImpl_4_0= ruleComponentImpl )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:141:3: lv_componentImpl_4_0= ruleComponentImpl
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBehaviorModelAccess().getComponentImplComponentImplParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleComponentImpl_in_ruleBehaviorModel215);
            lv_componentImpl_4_0=ruleComponentImpl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBehaviorModelRule());
              	        }
                     		set(
                     			current, 
                     			"componentImpl",
                      		lv_componentImpl_4_0, 
                      		"ComponentImpl");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBehaviorModel"


    // $ANTLR start "entryRuleRepositoryReference"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:165:1: entryRuleRepositoryReference returns [EObject current=null] : iv_ruleRepositoryReference= ruleRepositoryReference EOF ;
    public final EObject entryRuleRepositoryReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryReference = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:166:2: (iv_ruleRepositoryReference= ruleRepositoryReference EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:167:2: iv_ruleRepositoryReference= ruleRepositoryReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepositoryReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleRepositoryReference_in_entryRuleRepositoryReference251);
            iv_ruleRepositoryReference=ruleRepositoryReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepositoryReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepositoryReference261); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRepositoryReference"


    // $ANTLR start "ruleRepositoryReference"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:174:1: ruleRepositoryReference returns [EObject current=null] : (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRepositoryReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:177:28: ( (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:178:1: (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:178:1: (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:178:3: otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRepositoryReference298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRepositoryReferenceAccess().getRepositoryKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:182:1: ( (lv_reference_1_0= RULE_STRING ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:183:1: (lv_reference_1_0= RULE_STRING )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:183:1: (lv_reference_1_0= RULE_STRING )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:184:3: lv_reference_1_0= RULE_STRING
            {
            lv_reference_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRepositoryReference315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_reference_1_0, grammarAccess.getRepositoryReferenceAccess().getReferenceSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRepositoryReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"reference",
                      		lv_reference_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRepositoryReference"


    // $ANTLR start "entryRuleImport"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:208:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:209:2: (iv_ruleImport= ruleImport EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:210:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport356);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport366); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:217:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:220:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:221:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:221:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:221:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:225:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:226:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:226:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:227:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport424);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleComponentImpl"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:251:1: entryRuleComponentImpl returns [EObject current=null] : iv_ruleComponentImpl= ruleComponentImpl EOF ;
    public final EObject entryRuleComponentImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImpl = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:252:2: (iv_ruleComponentImpl= ruleComponentImpl EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:253:2: iv_ruleComponentImpl= ruleComponentImpl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentImplRule()); 
            }
            pushFollow(FOLLOW_ruleComponentImpl_in_entryRuleComponentImpl460);
            iv_ruleComponentImpl=ruleComponentImpl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentImpl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentImpl470); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentImpl"


    // $ANTLR start "ruleComponentImpl"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:260:1: ruleComponentImpl returns [EObject current=null] : (otherlv_0= 'realize' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_localDeclarations_3_1= ruleVariableDecl | lv_localDeclarations_3_2= ruleConstantDecl ) ) )* ( (lv_interfaces_4_0= ruleInterfaceRealization ) )* otherlv_5= '}' ) ;
    public final EObject ruleComponentImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_localDeclarations_3_1 = null;

        EObject lv_localDeclarations_3_2 = null;

        EObject lv_interfaces_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:263:28: ( (otherlv_0= 'realize' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_localDeclarations_3_1= ruleVariableDecl | lv_localDeclarations_3_2= ruleConstantDecl ) ) )* ( (lv_interfaces_4_0= ruleInterfaceRealization ) )* otherlv_5= '}' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:264:1: (otherlv_0= 'realize' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_localDeclarations_3_1= ruleVariableDecl | lv_localDeclarations_3_2= ruleConstantDecl ) ) )* ( (lv_interfaces_4_0= ruleInterfaceRealization ) )* otherlv_5= '}' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:264:1: (otherlv_0= 'realize' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_localDeclarations_3_1= ruleVariableDecl | lv_localDeclarations_3_2= ruleConstantDecl ) ) )* ( (lv_interfaces_4_0= ruleInterfaceRealization ) )* otherlv_5= '}' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:264:3: otherlv_0= 'realize' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( ( (lv_localDeclarations_3_1= ruleVariableDecl | lv_localDeclarations_3_2= ruleConstantDecl ) ) )* ( (lv_interfaces_4_0= ruleInterfaceRealization ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleComponentImpl507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentImplAccess().getRealizeKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:268:1: ( ( ruleQualifiedName ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:269:1: ( ruleQualifiedName )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:269:1: ( ruleQualifiedName )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:270:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentImplRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentImplAccess().getRefComponentComponentCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleComponentImpl530);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleComponentImpl542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getComponentImplAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:287:1: ( ( (lv_localDeclarations_3_1= ruleVariableDecl | lv_localDeclarations_3_2= ruleConstantDecl ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=20)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:288:1: ( (lv_localDeclarations_3_1= ruleVariableDecl | lv_localDeclarations_3_2= ruleConstantDecl ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:288:1: ( (lv_localDeclarations_3_1= ruleVariableDecl | lv_localDeclarations_3_2= ruleConstantDecl ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:289:1: (lv_localDeclarations_3_1= ruleVariableDecl | lv_localDeclarations_3_2= ruleConstantDecl )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:289:1: (lv_localDeclarations_3_1= ruleVariableDecl | lv_localDeclarations_3_2= ruleConstantDecl )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( ((LA2_0>=18 && LA2_0<=19)) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==20) ) {
            	        alt2=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:290:3: lv_localDeclarations_3_1= ruleVariableDecl
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentImplAccess().getLocalDeclarationsVariableDeclParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDecl_in_ruleComponentImpl565);
            	            lv_localDeclarations_3_1=ruleVariableDecl();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getComponentImplRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"localDeclarations",
            	                      		lv_localDeclarations_3_1, 
            	                      		"VariableDecl");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:305:8: lv_localDeclarations_3_2= ruleConstantDecl
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentImplAccess().getLocalDeclarationsConstantDeclParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleConstantDecl_in_ruleComponentImpl584);
            	            lv_localDeclarations_3_2=ruleConstantDecl();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getComponentImplRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"localDeclarations",
            	                      		lv_localDeclarations_3_2, 
            	                      		"ConstantDecl");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:323:3: ( (lv_interfaces_4_0= ruleInterfaceRealization ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:324:1: (lv_interfaces_4_0= ruleInterfaceRealization )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:324:1: (lv_interfaces_4_0= ruleInterfaceRealization )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:325:3: lv_interfaces_4_0= ruleInterfaceRealization
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentImplAccess().getInterfacesInterfaceRealizationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInterfaceRealization_in_ruleComponentImpl609);
            	    lv_interfaces_4_0=ruleInterfaceRealization();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComponentImplRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interfaces",
            	              		lv_interfaces_4_0, 
            	              		"InterfaceRealization");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleComponentImpl622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getComponentImplAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComponentImpl"


    // $ANTLR start "entryRuleVariableDecl"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:353:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:354:2: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:355:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl658);
            iv_ruleVariableDecl=ruleVariableDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDecl668); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDecl"


    // $ANTLR start "ruleVariableDecl"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:362:1: ruleVariableDecl returns [EObject current=null] : ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token lv_modifier_0_1=null;
        Token lv_modifier_0_2=null;
        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:365:28: ( ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:366:1: ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:366:1: ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:366:2: ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:366:2: ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:367:1: ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:367:1: ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:368:1: (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:368:1: (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:369:3: lv_modifier_0_1= 'var'
                    {
                    lv_modifier_0_1=(Token)match(input,18,FOLLOW_18_in_ruleVariableDecl713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modifier_0_1, grammarAccess.getVariableDeclAccess().getModifierVarKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclRule());
                      	        }
                             		setWithLastConsumed(current, "modifier", lv_modifier_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:381:8: lv_modifier_0_2= 'val'
                    {
                    lv_modifier_0_2=(Token)match(input,19,FOLLOW_19_in_ruleVariableDecl742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_modifier_0_2, grammarAccess.getVariableDeclAccess().getModifierValKeyword_0_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclRule());
                      	        }
                             		setWithLastConsumed(current, "modifier", lv_modifier_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:396:2: ( (lv_type_1_0= ruleDeclarationTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:397:1: (lv_type_1_0= ruleDeclarationTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:397:1: (lv_type_1_0= ruleDeclarationTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:398:3: lv_type_1_0= ruleDeclarationTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclarationTypeReference_in_ruleVariableDecl779);
            lv_type_1_0=ruleDeclarationTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"DeclarationTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:414:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:415:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:415:1: (lv_name_2_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:416:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDecl796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVariableDeclAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableDecl"


    // $ANTLR start "entryRuleConstantDecl"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:440:1: entryRuleConstantDecl returns [EObject current=null] : iv_ruleConstantDecl= ruleConstantDecl EOF ;
    public final EObject entryRuleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDecl = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:441:2: (iv_ruleConstantDecl= ruleConstantDecl EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:442:2: iv_ruleConstantDecl= ruleConstantDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDeclRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDecl_in_entryRuleConstantDecl837);
            iv_ruleConstantDecl=ruleConstantDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDecl847); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantDecl"


    // $ANTLR start "ruleConstantDecl"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:449:1: ruleConstantDecl returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleConstantDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:452:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:453:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:453:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:453:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleConstantDecl884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDeclAccess().getConstKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:457:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:458:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:458:1: (lv_name_1_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:459:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDecl901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantDeclAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDeclRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleConstantDecl918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantDeclAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:479:1: ( (lv_value_3_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:480:1: (lv_value_3_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:480:1: (lv_value_3_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:481:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleConstantDecl939);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantDeclRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstantDecl"


    // $ANTLR start "entryRuleInterfaceRealization"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:505:1: entryRuleInterfaceRealization returns [EObject current=null] : iv_ruleInterfaceRealization= ruleInterfaceRealization EOF ;
    public final EObject entryRuleInterfaceRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceRealization = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:506:2: (iv_ruleInterfaceRealization= ruleInterfaceRealization EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:507:2: iv_ruleInterfaceRealization= ruleInterfaceRealization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRealizationRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceRealization_in_entryRuleInterfaceRealization975);
            iv_ruleInterfaceRealization=ruleInterfaceRealization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceRealization; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceRealization985); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceRealization"


    // $ANTLR start "ruleInterfaceRealization"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:514:1: ruleInterfaceRealization returns [EObject current=null] : (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* ) ;
    public final EObject ruleInterfaceRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_methods_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:517:28: ( (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:518:1: (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:518:1: (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:518:3: otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleInterfaceRealization1022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInterfaceRealizationAccess().getIfaceKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:522:1: ( ( ruleQualifiedName ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:523:1: ( ruleQualifiedName )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:523:1: ( ruleQualifiedName )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:524:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInterfaceRealizationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceRealizationAccess().getRefInterfaceInterfaceCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceRealization1045);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:537:2: ( (lv_methods_2_0= ruleMethodImpl ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:538:1: (lv_methods_2_0= ruleMethodImpl )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:538:1: (lv_methods_2_0= ruleMethodImpl )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:539:3: lv_methods_2_0= ruleMethodImpl
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceRealizationAccess().getMethodsMethodImplParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMethodImpl_in_ruleInterfaceRealization1066);
            	    lv_methods_2_0=ruleMethodImpl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceRealizationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"methods",
            	              		lv_methods_2_0, 
            	              		"MethodImpl");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInterfaceRealization"


    // $ANTLR start "entryRuleMethodImpl"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:563:1: entryRuleMethodImpl returns [EObject current=null] : iv_ruleMethodImpl= ruleMethodImpl EOF ;
    public final EObject entryRuleMethodImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodImpl = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:564:2: (iv_ruleMethodImpl= ruleMethodImpl EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:565:2: iv_ruleMethodImpl= ruleMethodImpl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodImplRule()); 
            }
            pushFollow(FOLLOW_ruleMethodImpl_in_entryRuleMethodImpl1103);
            iv_ruleMethodImpl=ruleMethodImpl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodImpl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodImpl1113); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodImpl"


    // $ANTLR start "ruleMethodImpl"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:572:1: ruleMethodImpl returns [EObject current=null] : (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) ) ;
    public final EObject ruleMethodImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:575:28: ( (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:576:1: (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:576:1: (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:576:3: otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMethodImpl1150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMethodImplAccess().getOperationKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:580:1: ( ( ruleQualifiedName ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:581:1: ( ruleQualifiedName )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:581:1: ( ruleQualifiedName )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:582:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodImplRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodImplAccess().getRefMethodMethodDeclCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethodImpl1173);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:595:2: ( (lv_body_2_0= ruleBlockStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:596:1: (lv_body_2_0= ruleBlockStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:596:1: (lv_body_2_0= ruleBlockStatement )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:597:3: lv_body_2_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodImplAccess().getBodyBlockStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_ruleMethodImpl1194);
            lv_body_2_0=ruleBlockStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodImplRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"BlockStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethodImpl"


    // $ANTLR start "entryRuleStatement"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:621:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:622:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:623:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1230);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1240); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:630:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_LoopStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:633:28: ( (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:634:1: (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:634:1: (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:635:5: this_IfStatement_0= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement1287);
                    this_IfStatement_0=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:645:5: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleStatement1314);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:655:5: this_LoopStatement_2= ruleLoopStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLoopStatement_in_ruleStatement1341);
                    this_LoopStatement_2=ruleLoopStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LoopStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleIfStatement"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:671:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:672:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:673:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement1376);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement1386); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:680:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expr_2_0 = null;

        EObject lv_ifStatement_4_0 = null;

        EObject lv_elseStatement_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:683:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:684:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:684:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:684:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleIfStatement1423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleIfStatement1435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:692:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:693:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:693:1: (lv_expr_2_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:694:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement1456);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleIfStatement1468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:714:1: ( (lv_ifStatement_4_0= ruleBlockStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:715:1: (lv_ifStatement_4_0= ruleBlockStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:715:1: (lv_ifStatement_4_0= ruleBlockStatement )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:716:3: lv_ifStatement_4_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfStatementBlockStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_ruleIfStatement1489);
            lv_ifStatement_4_0=ruleBlockStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"ifStatement",
                      		lv_ifStatement_4_0, 
                      		"BlockStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:732:2: (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:732:4: otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleIfStatement1502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:736:1: ( (lv_elseStatement_6_0= ruleBlockStatement ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:737:1: (lv_elseStatement_6_0= ruleBlockStatement )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:737:1: (lv_elseStatement_6_0= ruleBlockStatement )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:738:3: lv_elseStatement_6_0= ruleBlockStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementBlockStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockStatement_in_ruleIfStatement1523);
                    lv_elseStatement_6_0=ruleBlockStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_6_0, 
                              		"BlockStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleBlockStatement"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:762:1: entryRuleBlockStatement returns [EObject current=null] : iv_ruleBlockStatement= ruleBlockStatement EOF ;
    public final EObject entryRuleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:763:2: (iv_ruleBlockStatement= ruleBlockStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:764:2: iv_ruleBlockStatement= ruleBlockStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement1561);
            iv_ruleBlockStatement=ruleBlockStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockStatement1571); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBlockStatement"


    // $ANTLR start "ruleBlockStatement"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:771:1: ruleBlockStatement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlockStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:774:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:775:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:775:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:775:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:775:2: ()
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:776:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockStatementAccess().getBlockStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleBlockStatement1617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:785:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==24||LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:786:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:786:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:787:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockStatementAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleBlockStatement1638);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleBlockStatement1651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBlockStatementAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBlockStatement"


    // $ANTLR start "entryRuleAssignment"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:815:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:816:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:817:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1687);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1697); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:824:1: ruleAssignment returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:827:28: ( ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:828:1: ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:828:1: ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:828:2: ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:828:2: ( (lv_variable_0_0= ruleVariableCall ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:829:1: (lv_variable_0_0= ruleVariableCall )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:829:1: (lv_variable_0_0= ruleVariableCall )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:830:3: lv_variable_0_0= ruleVariableCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableCallParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableCall_in_ruleAssignment1743);
            lv_variable_0_0=ruleVariableCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_0_0, 
                      		"VariableCall");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAssignment1755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:850:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:851:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:851:1: (lv_expression_2_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:852:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1776);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleLoopStatement"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:876:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:877:2: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:878:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopStatementRule()); 
            }
            pushFollow(FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement1812);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopStatement1822); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:885:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variable_2_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_statement_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:888:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:889:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:889:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:889:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleLoopStatement1859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLoopStatement1871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:897:1: ( (lv_variable_2_0= ruleVariableDecl ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:898:1: (lv_variable_2_0= ruleVariableDecl )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:898:1: (lv_variable_2_0= ruleVariableDecl )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:899:3: lv_variable_2_0= ruleVariableDecl
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getVariableVariableDeclParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDecl_in_ruleLoopStatement1892);
            lv_variable_2_0=ruleVariableDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopStatementRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_2_0, 
                      		"VariableDecl");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleLoopStatement1904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLoopStatementAccess().getColonKeyword_3());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:919:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:920:1: (lv_expression_4_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:920:1: (lv_expression_4_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:921:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLoopStatement1925);
            lv_expression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleLoopStatement1937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLoopStatementAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:941:1: ( (lv_statement_6_0= ruleBlockStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:942:1: (lv_statement_6_0= ruleBlockStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:942:1: (lv_statement_6_0= ruleBlockStatement )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:943:3: lv_statement_6_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementBlockStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_ruleLoopStatement1958);
            lv_statement_6_0=ruleBlockStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopStatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_6_0, 
                      		"BlockStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleVariableCall"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:967:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:968:2: (iv_ruleVariableCall= ruleVariableCall EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:969:2: iv_ruleVariableCall= ruleVariableCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableCallRule()); 
            }
            pushFollow(FOLLOW_ruleVariableCall_in_entryRuleVariableCall1994);
            iv_ruleVariableCall=ruleVariableCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableCall2004); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableCall"


    // $ANTLR start "ruleVariableCall"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:976:1: ruleVariableCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) ;
    public final EObject ruleVariableCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_index_2_0 = null;

        EObject lv_subProperty_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:979:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:980:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:980:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:980:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:980:2: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:981:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:981:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:982:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableCall2049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableCallAccess().getVariableVariableDeclCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:993:2: (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:993:4: otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleVariableCall2062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableCallAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:997:1: ( (lv_index_2_0= ruleExpression ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_CHARACTER)||(LA10_0>=42 && LA10_0<=43)||LA10_0==48||(LA10_0>=52 && LA10_0<=54)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:998:1: (lv_index_2_0= ruleExpression )
                            {
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:998:1: (lv_index_2_0= ruleExpression )
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:999:3: lv_index_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariableCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleVariableCall2083);
                            lv_index_2_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVariableCallRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"index",
                                      		lv_index_2_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleVariableCall2096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getVariableCallAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1019:3: (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1019:5: otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleVariableCall2111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableCallAccess().getFullStopKeyword_2_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1023:1: ( (lv_subProperty_5_0= rulePropertyCall ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1024:1: (lv_subProperty_5_0= rulePropertyCall )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1024:1: (lv_subProperty_5_0= rulePropertyCall )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1025:3: lv_subProperty_5_0= rulePropertyCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyCall_in_ruleVariableCall2132);
                    lv_subProperty_5_0=rulePropertyCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableCallRule());
                      	        }
                             		set(
                             			current, 
                             			"subProperty",
                              		lv_subProperty_5_0, 
                              		"PropertyCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableCall"


    // $ANTLR start "entryRulePropertyCall"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1049:1: entryRulePropertyCall returns [EObject current=null] : iv_rulePropertyCall= rulePropertyCall EOF ;
    public final EObject entryRulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCall = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1050:2: (iv_rulePropertyCall= rulePropertyCall EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1051:2: iv_rulePropertyCall= rulePropertyCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyCallRule()); 
            }
            pushFollow(FOLLOW_rulePropertyCall_in_entryRulePropertyCall2170);
            iv_rulePropertyCall=rulePropertyCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCall2180); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyCall"


    // $ANTLR start "rulePropertyCall"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1058:1: rulePropertyCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) ;
    public final EObject rulePropertyCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_index_2_0 = null;

        EObject lv_subProperty_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1061:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1062:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1062:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1062:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1062:2: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1063:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1063:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1064:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyCall2225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPropertyCallAccess().getPropertyPropertyCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1075:2: (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1075:4: otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulePropertyCall2238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPropertyCallAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1079:1: ( (lv_index_2_0= ruleExpression ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_CHARACTER)||(LA13_0>=42 && LA13_0<=43)||LA13_0==48||(LA13_0>=52 && LA13_0<=54)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1080:1: (lv_index_2_0= ruleExpression )
                            {
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1080:1: (lv_index_2_0= ruleExpression )
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1081:3: lv_index_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPropertyCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePropertyCall2259);
                            lv_index_2_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPropertyCallRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"index",
                                      		lv_index_2_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_rulePropertyCall2272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyCallAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1101:3: (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1101:5: otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_rulePropertyCall2287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyCallAccess().getFullStopKeyword_2_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1105:1: ( (lv_subProperty_5_0= rulePropertyCall ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1106:1: (lv_subProperty_5_0= rulePropertyCall )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1106:1: (lv_subProperty_5_0= rulePropertyCall )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1107:3: lv_subProperty_5_0= rulePropertyCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyCall_in_rulePropertyCall2308);
                    lv_subProperty_5_0=rulePropertyCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyCallRule());
                      	        }
                             		set(
                             			current, 
                             			"subProperty",
                              		lv_subProperty_5_0, 
                              		"PropertyCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyCall"


    // $ANTLR start "entryRuleExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1131:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1132:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1133:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2346);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2356); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1140:1: ruleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1143:28: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1144:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1144:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1145:5: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleExpression2403);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1153:1: ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) && (synpred1_InternalBehavior())) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1153:2: ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1153:2: ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1153:3: ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1160:6: ( () ( (lv_feature_2_0= '||' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1160:7: () ( (lv_feature_2_0= '||' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1160:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1161:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1166:2: ( (lv_feature_2_0= '||' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1167:1: (lv_feature_2_0= '||' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1167:1: (lv_feature_2_0= '||' )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1168:3: lv_feature_2_0= '||'
            	    {
            	    lv_feature_2_0=(Token)match(input,33,FOLLOW_33_in_ruleExpression2454); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_feature_2_0, grammarAccess.getExpressionAccess().getFeatureVerticalLineVerticalLineKeyword_1_0_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "feature", lv_feature_2_0, "||");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1181:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1182:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1182:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1183:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleExpression2490);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1207:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1208:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1209:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression2528);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression2538); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1216:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1219:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1220:1: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1220:1: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1221:5: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2585);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1229:1: ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) && (synpred2_InternalBehavior())) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1229:2: ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1229:2: ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1229:3: ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1236:6: ( () ( (lv_feature_2_0= '&&' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1236:7: () ( (lv_feature_2_0= '&&' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1236:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1237:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1242:2: ( (lv_feature_2_0= '&&' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1243:1: (lv_feature_2_0= '&&' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1243:1: (lv_feature_2_0= '&&' )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1244:3: lv_feature_2_0= '&&'
            	    {
            	    lv_feature_2_0=(Token)match(input,34,FOLLOW_34_in_ruleAndExpression2636); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_feature_2_0, grammarAccess.getAndExpressionAccess().getFeatureAmpersandAmpersandKeyword_1_0_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "feature", lv_feature_2_0, "&&");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1257:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1258:1: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1258:1: (lv_right_3_0= ruleRelationalExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1259:3: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2672);
            	    lv_right_3_0=ruleRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"RelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1283:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1284:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1285:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2710);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression2720); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1292:1: ruleRelationalExpression returns [EObject current=null] : (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        Token lv_feature_2_3=null;
        Token lv_feature_2_4=null;
        Token lv_feature_2_5=null;
        Token lv_feature_2_6=null;
        EObject this_OtherExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1295:28: ( (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1296:1: (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1296:1: (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1297:5: this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOtherExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOtherExpression_in_ruleRelationalExpression2767);
            this_OtherExpression_0=ruleOtherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OtherExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1305:1: ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) && (synpred3_InternalBehavior())) {
                    alt19=1;
                }
                else if ( (LA19_0==36) && (synpred3_InternalBehavior())) {
                    alt19=1;
                }
                else if ( (LA19_0==37) && (synpred3_InternalBehavior())) {
                    alt19=1;
                }
                else if ( (LA19_0==38) && (synpred3_InternalBehavior())) {
                    alt19=1;
                }
                else if ( (LA19_0==39) && (synpred3_InternalBehavior())) {
                    alt19=1;
                }
                else if ( (LA19_0==40) && (synpred3_InternalBehavior())) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1305:2: ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1305:2: ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1305:3: ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1330:6: ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1330:7: () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1330:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1331:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationalExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1336:2: ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1337:1: ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1337:1: ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1338:1: (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1338:1: (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' )
            	    int alt18=6;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt18=5;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt18=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1339:3: lv_feature_2_1= '=='
            	            {
            	            lv_feature_2_1=(Token)match(input,35,FOLLOW_35_in_ruleRelationalExpression2895); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_1, grammarAccess.getRelationalExpressionAccess().getFeatureEqualsSignEqualsSignKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1351:8: lv_feature_2_2= '!='
            	            {
            	            lv_feature_2_2=(Token)match(input,36,FOLLOW_36_in_ruleRelationalExpression2924); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_2, grammarAccess.getRelationalExpressionAccess().getFeatureExclamationMarkEqualsSignKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1363:8: lv_feature_2_3= '>'
            	            {
            	            lv_feature_2_3=(Token)match(input,37,FOLLOW_37_in_ruleRelationalExpression2953); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_3, grammarAccess.getRelationalExpressionAccess().getFeatureGreaterThanSignKeyword_1_0_0_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1375:8: lv_feature_2_4= '<'
            	            {
            	            lv_feature_2_4=(Token)match(input,38,FOLLOW_38_in_ruleRelationalExpression2982); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_4, grammarAccess.getRelationalExpressionAccess().getFeatureLessThanSignKeyword_1_0_0_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_4, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1387:8: lv_feature_2_5= '>='
            	            {
            	            lv_feature_2_5=(Token)match(input,39,FOLLOW_39_in_ruleRelationalExpression3011); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_5, grammarAccess.getRelationalExpressionAccess().getFeatureGreaterThanSignEqualsSignKeyword_1_0_0_1_0_4());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_5, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1399:8: lv_feature_2_6= '<='
            	            {
            	            lv_feature_2_6=(Token)match(input,40,FOLLOW_40_in_ruleRelationalExpression3040); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_6, grammarAccess.getRelationalExpressionAccess().getFeatureLessThanSignEqualsSignKeyword_1_0_0_1_0_5());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_6, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1414:4: ( (lv_right_3_0= ruleOtherExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1415:1: (lv_right_3_0= ruleOtherExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1415:1: (lv_right_3_0= ruleOtherExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1416:3: lv_right_3_0= ruleOtherExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightOtherExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherExpression_in_ruleRelationalExpression3079);
            	    lv_right_3_0=ruleOtherExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"OtherExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleOtherExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1440:1: entryRuleOtherExpression returns [EObject current=null] : iv_ruleOtherExpression= ruleOtherExpression EOF ;
    public final EObject entryRuleOtherExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1441:2: (iv_ruleOtherExpression= ruleOtherExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1442:2: iv_ruleOtherExpression= ruleOtherExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOtherExpression_in_entryRuleOtherExpression3117);
            iv_ruleOtherExpression=ruleOtherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherExpression3127); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOtherExpression"


    // $ANTLR start "ruleOtherExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1449:1: ruleOtherExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? ) ;
    public final EObject ruleOtherExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1452:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1453:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1453:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1454:5: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOtherExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleOtherExpression3174);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1462:1: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) && (synpred4_InternalBehavior())) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1462:2: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleTypeReference ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1462:2: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1462:3: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1464:5: ( () otherlv_2= 'instanceof' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1464:6: () otherlv_2= 'instanceof'
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1464:6: ()
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1465:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getOtherExpressionAccess().getInstanceOfExpressionExpressionAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleOtherExpression3209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOtherExpressionAccess().getInstanceofKeyword_1_0_0_1());
                          
                    }

                    }


                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1474:3: ( (lv_type_3_0= ruleTypeReference ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1475:1: (lv_type_3_0= ruleTypeReference )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1475:1: (lv_type_3_0= ruleTypeReference )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1476:3: lv_type_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOtherExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleOtherExpression3232);
                    lv_type_3_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOtherExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"TypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOtherExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1500:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1501:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1502:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3270);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression3280); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1509:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1512:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1513:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1513:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1514:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3327);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1522:1: ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) && (synpred5_InternalBehavior())) {
                    alt22=1;
                }
                else if ( (LA22_0==43) && (synpred5_InternalBehavior())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1522:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1522:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1522:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1535:6: ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1535:7: () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1535:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1536:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1541:2: ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1542:1: ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1542:1: ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1543:1: (lv_feature_2_1= '+' | lv_feature_2_2= '-' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1543:1: (lv_feature_2_1= '+' | lv_feature_2_2= '-' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==42) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==43) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1544:3: lv_feature_2_1= '+'
            	            {
            	            lv_feature_2_1=(Token)match(input,42,FOLLOW_42_in_ruleAdditiveExpression3399); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_1, grammarAccess.getAdditiveExpressionAccess().getFeaturePlusSignKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1556:8: lv_feature_2_2= '-'
            	            {
            	            lv_feature_2_2=(Token)match(input,43,FOLLOW_43_in_ruleAdditiveExpression3428); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_2, grammarAccess.getAdditiveExpressionAccess().getFeatureHyphenMinusKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1571:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1572:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1572:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1573:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3467);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"MultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1597:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1598:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1599:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3505);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression3515); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1606:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        Token lv_feature_2_3=null;
        Token lv_feature_2_4=null;
        EObject this_UnaryOperation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1609:28: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1610:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1610:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1611:5: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression3562);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1619:1: ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==44) && (synpred6_InternalBehavior())) {
                    alt24=1;
                }
                else if ( (LA24_0==45) && (synpred6_InternalBehavior())) {
                    alt24=1;
                }
                else if ( (LA24_0==46) && (synpred6_InternalBehavior())) {
                    alt24=1;
                }
                else if ( (LA24_0==47) && (synpred6_InternalBehavior())) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1619:2: ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1619:2: ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1619:3: ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1638:6: ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1638:7: () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1638:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1639:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:2: ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1645:1: ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1645:1: ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1646:1: (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1646:1: (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case 44:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1647:3: lv_feature_2_1= '*'
            	            {
            	            lv_feature_2_1=(Token)match(input,44,FOLLOW_44_in_ruleMultiplicativeExpression3662); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_1, grammarAccess.getMultiplicativeExpressionAccess().getFeatureAsteriskKeyword_1_0_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1659:8: lv_feature_2_2= '/'
            	            {
            	            lv_feature_2_2=(Token)match(input,45,FOLLOW_45_in_ruleMultiplicativeExpression3691); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_2, grammarAccess.getMultiplicativeExpressionAccess().getFeatureSolidusKeyword_1_0_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1671:8: lv_feature_2_3= '%'
            	            {
            	            lv_feature_2_3=(Token)match(input,46,FOLLOW_46_in_ruleMultiplicativeExpression3720); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_3, grammarAccess.getMultiplicativeExpressionAccess().getFeaturePercentSignKeyword_1_0_0_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1683:8: lv_feature_2_4= '**'
            	            {
            	            lv_feature_2_4=(Token)match(input,47,FOLLOW_47_in_ruleMultiplicativeExpression3749); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_feature_2_4, grammarAccess.getMultiplicativeExpressionAccess().getFeatureAsteriskAsteriskKeyword_1_0_0_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "feature", lv_feature_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1698:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1699:1: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1699:1: (lv_right_3_0= ruleUnaryOperation )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1700:3: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression3788);
            	    lv_right_3_0=ruleUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"UnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryOperation"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1724:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1725:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1726:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation3826);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation3836); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1733:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_1_0=null;
        EObject lv_operand_2_0 = null;

        EObject this_CastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1736:28: ( ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1737:1: ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1737:1: ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==48) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_CHARACTER)||(LA25_0>=42 && LA25_0<=43)||(LA25_0>=52 && LA25_0<=54)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1737:2: ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1737:2: ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1737:3: () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1737:3: ()
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1738:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnaryOperationAccess().getUnaryExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1743:2: ( (lv_feature_1_0= '!' ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1744:1: (lv_feature_1_0= '!' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1744:1: (lv_feature_1_0= '!' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1745:3: lv_feature_1_0= '!'
                    {
                    lv_feature_1_0=(Token)match(input,48,FOLLOW_48_in_ruleUnaryOperation3889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_feature_1_0, grammarAccess.getUnaryOperationAccess().getFeatureExclamationMarkKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnaryOperationRule());
                      	        }
                             		setWithLastConsumed(current, "feature", lv_feature_1_0, "!");
                      	    
                    }

                    }


                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1758:2: ( (lv_operand_2_0= ruleUnaryOperation ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1759:1: (lv_operand_2_0= ruleUnaryOperation )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1759:1: (lv_operand_2_0= ruleUnaryOperation )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1760:3: lv_operand_2_0= ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperandUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleUnaryOperation3923);
                    lv_operand_2_0=ruleUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"UnaryOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1778:5: this_CastedExpression_3= ruleCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOperationAccess().getCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCastedExpression_in_ruleUnaryOperation3952);
                    this_CastedExpression_3=ruleCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleCastedExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1794:1: entryRuleCastedExpression returns [EObject current=null] : iv_ruleCastedExpression= ruleCastedExpression EOF ;
    public final EObject entryRuleCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastedExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1795:2: (iv_ruleCastedExpression= ruleCastedExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1796:2: iv_ruleCastedExpression= ruleCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCastedExpression_in_entryRuleCastedExpression3987);
            iv_ruleCastedExpression=ruleCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastedExpression3997); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCastedExpression"


    // $ANTLR start "ruleCastedExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1803:1: ruleCastedExpression returns [EObject current=null] : (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PostfixOperation_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1806:28: ( (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1807:1: (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1807:1: (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1808:5: this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCastedExpressionAccess().getPostfixOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePostfixOperation_in_ruleCastedExpression4044);
            this_PostfixOperation_0=rulePostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PostfixOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1816:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleTypeReference ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==49) && (synpred7_InternalBehavior())) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1816:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleTypeReference ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1816:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1816:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1818:5: ( () otherlv_2= 'as' )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1818:6: () otherlv_2= 'as'
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1818:6: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1819:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCastedExpressionAccess().getCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleCastedExpression4079); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1828:3: ( (lv_type_3_0= ruleTypeReference ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1829:1: (lv_type_3_0= ruleTypeReference )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1829:1: (lv_type_3_0= ruleTypeReference )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1830:3: lv_type_3_0= ruleTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCastedExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeReference_in_ruleCastedExpression4102);
            	    lv_type_3_0=ruleTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"TypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCastedExpression"


    // $ANTLR start "entryRulePostfixOperation"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1854:1: entryRulePostfixOperation returns [EObject current=null] : iv_rulePostfixOperation= rulePostfixOperation EOF ;
    public final EObject entryRulePostfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixOperation = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1855:2: (iv_rulePostfixOperation= rulePostfixOperation EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1856:2: iv_rulePostfixOperation= rulePostfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixOperationRule()); 
            }
            pushFollow(FOLLOW_rulePostfixOperation_in_entryRulePostfixOperation4140);
            iv_rulePostfixOperation=rulePostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixOperation4150); if (state.failed) return current;

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
    // $ANTLR end "entryRulePostfixOperation"


    // $ANTLR start "rulePostfixOperation"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1863:1: rulePostfixOperation returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? ) ;
    public final EObject rulePostfixOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_PrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1866:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1867:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1867:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1868:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPostfixOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rulePostfixOperation4197);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1876:1: ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) && (synpred8_InternalBehavior())) {
                alt28=1;
            }
            else if ( (LA28_0==51) && (synpred8_InternalBehavior())) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1876:2: ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1889:6: ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1889:7: () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1889:7: ()
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1890:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixOperationAccess().getPostfixOperationOperandAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1895:2: ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1896:1: ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1896:1: ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1897:1: (lv_feature_2_1= '++' | lv_feature_2_2= '--' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1897:1: (lv_feature_2_1= '++' | lv_feature_2_2= '--' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==50) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==51) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1898:3: lv_feature_2_1= '++'
                            {
                            lv_feature_2_1=(Token)match(input,50,FOLLOW_50_in_rulePostfixOperation4268); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_feature_2_1, grammarAccess.getPostfixOperationAccess().getFeaturePlusSignPlusSignKeyword_1_0_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPostfixOperationRule());
                              	        }
                                     		setWithLastConsumed(current, "feature", lv_feature_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1910:8: lv_feature_2_2= '--'
                            {
                            lv_feature_2_2=(Token)match(input,51,FOLLOW_51_in_rulePostfixOperation4297); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_feature_2_2, grammarAccess.getPostfixOperationAccess().getFeatureHyphenMinusHyphenMinusKeyword_1_0_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPostfixOperationRule());
                              	        }
                                     		setWithLastConsumed(current, "feature", lv_feature_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePostfixOperation"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1933:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1934:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1935:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4352);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4362); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1942:1: rulePrimaryExpression returns [EObject current=null] : (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_Literal_2= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InstantiationExpression_0 = null;

        EObject this_VariableCall_1 = null;

        EObject this_Literal_2 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1945:28: ( (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_Literal_2= ruleLiteral ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1946:1: (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_Literal_2= ruleLiteral )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1946:1: (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_Literal_2= ruleLiteral )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt29=1;
                }
                break;
            case RULE_ID:
                {
                alt29=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_CHARACTER:
            case 42:
            case 43:
            case 53:
            case 54:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1947:5: this_InstantiationExpression_0= ruleInstantiationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInstantiationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstantiationExpression_in_rulePrimaryExpression4409);
                    this_InstantiationExpression_0=ruleInstantiationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstantiationExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1957:5: this_VariableCall_1= ruleVariableCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableCall_in_rulePrimaryExpression4436);
                    this_VariableCall_1=ruleVariableCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableCall_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1967:5: this_Literal_2= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression4463);
                    this_Literal_2=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleInstantiationExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1983:1: entryRuleInstantiationExpression returns [EObject current=null] : iv_ruleInstantiationExpression= ruleInstantiationExpression EOF ;
    public final EObject entryRuleInstantiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiationExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1984:2: (iv_ruleInstantiationExpression= ruleInstantiationExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1985:2: iv_ruleInstantiationExpression= ruleInstantiationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstantiationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstantiationExpression_in_entryRuleInstantiationExpression4498);
            iv_ruleInstantiationExpression=ruleInstantiationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstantiationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationExpression4508); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstantiationExpression"


    // $ANTLR start "ruleInstantiationExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1992:1: ruleInstantiationExpression returns [EObject current=null] : (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleInstantiationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_parameters_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1995:28: ( (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1996:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1996:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1996:3: otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleInstantiationExpression4545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstantiationExpressionAccess().getNewKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2000:1: ( (lv_type_1_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2001:1: (lv_type_1_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2001:1: (lv_type_1_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2002:3: lv_type_1_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstantiationExpressionAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleInstantiationExpression4566);
            lv_type_1_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstantiationExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleInstantiationExpression4578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInstantiationExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2022:1: ( (lv_parameters_3_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2023:1: (lv_parameters_3_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2023:1: (lv_parameters_3_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2024:3: lv_parameters_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstantiationExpressionAccess().getParametersExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInstantiationExpression4599);
            lv_parameters_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInstantiationExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"parameters",
                      		lv_parameters_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleInstantiationExpression4611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInstantiationExpressionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInstantiationExpression"


    // $ANTLR start "entryRuleTypeReference"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2052:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2053:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2054:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference4647);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference4657); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2061:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2064:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2065:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2065:1: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2066:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2066:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2067:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeReference4701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleCollectionType"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2086:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2087:2: (iv_ruleCollectionType= ruleCollectionType EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2088:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionType_in_entryRuleCollectionType4736);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType4746); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2095:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2098:28: ( ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2099:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2099:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2099:2: ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2099:2: ( (lv_reference_0_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2100:1: (lv_reference_0_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2100:1: (lv_reference_0_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2101:3: lv_reference_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleCollectionType4792);
            lv_reference_0_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
              	        }
                     		set(
                     			current, 
                     			"reference",
                      		lv_reference_0_0, 
                      		"TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleCollectionType4804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2121:1: ( (lv_size_2_0= RULE_INT ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2122:1: (lv_size_2_0= RULE_INT )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2122:1: (lv_size_2_0= RULE_INT )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2123:3: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCollectionType4821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_size_2_0, grammarAccess.getCollectionTypeAccess().getSizeINTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCollectionTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"size",
                              		lv_size_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleCollectionType4839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleMapType"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2151:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2152:2: (iv_ruleMapType= ruleMapType EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2153:2: iv_ruleMapType= ruleMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeRule()); 
            }
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType4875);
            iv_ruleMapType=ruleMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType4885); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2160:1: ruleMapType returns [EObject current=null] : ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;

        EObject lv_keyType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2163:28: ( ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2164:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2164:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2164:2: ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2164:2: ( (lv_reference_0_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2165:1: (lv_reference_0_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2165:1: (lv_reference_0_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2166:3: lv_reference_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleMapType4931);
            lv_reference_0_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
              	        }
                     		set(
                     			current, 
                     			"reference",
                      		lv_reference_0_0, 
                      		"TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleMapType4943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2186:1: ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2186:2: ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>'
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2186:2: ( (lv_keyType_2_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2187:1: (lv_keyType_2_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2187:1: (lv_keyType_2_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2188:3: lv_keyType_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeTypeReferenceParserRuleCall_2_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleMapType4965);
            lv_keyType_2_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
              	        }
                     		set(
                     			current, 
                     			"keyType",
                      		lv_keyType_2_0, 
                      		"TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleMapType4977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_2_1());
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleDeclarationTypeReference"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2216:1: entryRuleDeclarationTypeReference returns [EObject current=null] : iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF ;
    public final EObject entryRuleDeclarationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationTypeReference = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2217:2: (iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2218:2: iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleDeclarationTypeReference_in_entryRuleDeclarationTypeReference5014);
            iv_ruleDeclarationTypeReference=ruleDeclarationTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationTypeReference5024); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeclarationTypeReference"


    // $ANTLR start "ruleDeclarationTypeReference"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2225:1: ruleDeclarationTypeReference returns [EObject current=null] : (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType ) ;
    public final EObject ruleDeclarationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_TypeReference_0 = null;

        EObject this_CollectionType_1 = null;

        EObject this_MapType_2 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2228:28: ( (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2229:1: (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2229:1: (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    alt31=3;
                    }
                    break;
                case 30:
                    {
                    alt31=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                    {
                    alt31=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2230:5: this_TypeReference_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleDeclarationTypeReference5071);
                    this_TypeReference_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2240:5: this_CollectionType_1= ruleCollectionType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getCollectionTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionType_in_ruleDeclarationTypeReference5098);
                    this_CollectionType_1=ruleCollectionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2250:5: this_MapType_2= ruleMapType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMapType_in_ruleDeclarationTypeReference5125);
                    this_MapType_2=ruleMapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDeclarationTypeReference"


    // $ANTLR start "entryRuleLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2266:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2267:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2268:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5160);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5170); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2275:1: ruleLiteral returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteral_0 = null;

        EObject this_NumberLiteral_1 = null;

        EObject this_CharLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2278:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2279:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2279:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 53:
            case 54:
                {
                alt32=1;
                }
                break;
            case RULE_INT:
            case 42:
            case 43:
                {
                alt32=2;
                }
                break;
            case RULE_CHARACTER:
                {
                alt32=3;
                }
                break;
            case RULE_STRING:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2280:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral5217);
                    this_BooleanLiteral_0=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2290:5: this_NumberLiteral_1= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral5244);
                    this_NumberLiteral_1=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2300:5: this_CharLiteral_2= ruleCharLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCharLiteral_in_ruleLiteral5271);
                    this_CharLiteral_2=ruleCharLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CharLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2310:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral5298);
                    this_StringLiteral_3=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2326:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2327:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2328:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5333);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral5343); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2335:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2338:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2339:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2339:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2340:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2340:1: (lv_value_0_0= RULE_STRING )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2341:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral5384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleCharLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2365:1: entryRuleCharLiteral returns [EObject current=null] : iv_ruleCharLiteral= ruleCharLiteral EOF ;
    public final EObject entryRuleCharLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2366:2: (iv_ruleCharLiteral= ruleCharLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2367:2: iv_ruleCharLiteral= ruleCharLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCharLiteral_in_entryRuleCharLiteral5424);
            iv_ruleCharLiteral=ruleCharLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLiteral5434); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2374:1: ruleCharLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_CHARACTER ) ) ;
    public final EObject ruleCharLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2377:28: ( ( (lv_value_0_0= RULE_CHARACTER ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2378:1: ( (lv_value_0_0= RULE_CHARACTER ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2378:1: ( (lv_value_0_0= RULE_CHARACTER ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2379:1: (lv_value_0_0= RULE_CHARACTER )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2379:1: (lv_value_0_0= RULE_CHARACTER )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2380:3: lv_value_0_0= RULE_CHARACTER
            {
            lv_value_0_0=(Token)match(input,RULE_CHARACTER,FOLLOW_RULE_CHARACTER_in_ruleCharLiteral5475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getCharLiteralAccess().getValueCHARACTERTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCharLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"CHARACTER");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2404:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2405:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2406:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5515);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral5525); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2413:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2416:28: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2417:1: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2417:1: ( (lv_value_0_0= ruleNUMBER ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2418:1: (lv_value_0_0= ruleNUMBER )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2418:1: (lv_value_0_0= ruleNUMBER )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2419:3: lv_value_0_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNUMBER_in_ruleNumberLiteral5570);
            lv_value_0_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"NUMBER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2443:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2444:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2445:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5605);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral5615); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2452:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2455:28: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2456:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2456:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2457:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2457:1: (lv_value_0_0= ruleBOOLEAN )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2458:3: lv_value_0_0= ruleBOOLEAN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral5660);
            lv_value_0_0=ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBooleanLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"BOOLEAN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2482:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2483:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2484:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5696);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5707); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2491:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2494:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2495:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2495:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2495:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2502:1: (kw= '.' this_ID_2= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==32) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==RULE_ID) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2503:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedName5766); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5781); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2523:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2524:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2525:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard5829);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard5840); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2532:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2535:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2536:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2536:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2537:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard5887);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2547:1: (kw= '.' kw= '*' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2548:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedNameWithWildcard5906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleQualifiedNameWithWildcard5919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2567:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2568:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2569:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEANRule()); 
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN5962);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN5973); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2576:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2579:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2580:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2580:1: (kw= 'true' | kw= 'false' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            else if ( (LA35_0==54) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2581:2: kw= 'true'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleBOOLEAN6011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2588:2: kw= 'false'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleBOOLEAN6030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNUMBER"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2601:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2602:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2603:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER6071);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER6082); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2610:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2613:28: ( ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2614:1: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2614:1: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=42 && LA37_0<=43)) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_INT) ) {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==32) ) {
                    alt37=2;
                }
                else if ( (LA37_2==EOF||LA37_2==RULE_ID||(LA37_2>=17 && LA37_2<=20)||LA37_2==22||LA37_2==24||LA37_2==26||LA37_2==28||LA37_2==31||(LA37_2>=33 && LA37_2<=47)||(LA37_2>=49 && LA37_2<=51)) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2614:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2614:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2614:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2614:3: (kw= '+' | kw= '-' )?
                    int alt36=3;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==42) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==43) ) {
                        alt36=2;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2615:2: kw= '+'
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleNUMBER6122); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBERAccess().getPlusSignKeyword_0_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2622:2: kw= '-'
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleNUMBER6141); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER6158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2635:6: (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2635:6: (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2635:11: this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER6186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleNUMBER6204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER6219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_5, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNUMBER"

    // $ANTLR start synpred1_InternalBehavior
    public final void synpred1_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1153:3: ( ( () ( ( '||' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1153:4: ( () ( ( '||' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1153:4: ( () ( ( '||' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1153:5: () ( ( '||' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1153:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1154:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1154:2: ( ( '||' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1155:1: ( '||' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1155:1: ( '||' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1156:2: '||'
        {
        match(input,33,FOLLOW_33_in_synpred1_InternalBehavior2423); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalBehavior

    // $ANTLR start synpred2_InternalBehavior
    public final void synpred2_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1229:3: ( ( () ( ( '&&' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1229:4: ( () ( ( '&&' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1229:4: ( () ( ( '&&' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1229:5: () ( ( '&&' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1229:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1230:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1230:2: ( ( '&&' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1231:1: ( '&&' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1231:1: ( '&&' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1232:2: '&&'
        {
        match(input,34,FOLLOW_34_in_synpred2_InternalBehavior2605); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalBehavior

    // $ANTLR start synpred3_InternalBehavior
    public final void synpred3_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1305:3: ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1305:4: ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1305:4: ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1305:5: () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1305:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1306:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1306:2: ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1307:1: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1307:1: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1308:1: ( '==' | '!=' | '>' | '<' | '>=' | '<=' )
        {
        if ( (input.LA(1)>=35 && input.LA(1)<=40) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalBehavior

    // $ANTLR start synpred4_InternalBehavior
    public final void synpred4_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1462:3: ( ( () 'instanceof' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1462:4: ( () 'instanceof' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1462:4: ( () 'instanceof' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1462:5: () 'instanceof'
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1462:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1463:1: 
        {
        }

        match(input,41,FOLLOW_41_in_synpred4_InternalBehavior3190); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalBehavior

    // $ANTLR start synpred5_InternalBehavior
    public final void synpred5_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1522:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1522:4: ( () ( ( ( '+' | '-' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1522:4: ( () ( ( ( '+' | '-' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1522:5: () ( ( ( '+' | '-' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1522:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1523:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1523:2: ( ( ( '+' | '-' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1524:1: ( ( '+' | '-' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1524:1: ( ( '+' | '-' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1525:1: ( '+' | '-' )
        {
        if ( (input.LA(1)>=42 && input.LA(1)<=43) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalBehavior

    // $ANTLR start synpred6_InternalBehavior
    public final void synpred6_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1619:3: ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1619:4: ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1619:4: ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1619:5: () ( ( ( '*' | '/' | '%' | '**' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1619:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1620:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1620:2: ( ( ( '*' | '/' | '%' | '**' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1621:1: ( ( '*' | '/' | '%' | '**' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1621:1: ( ( '*' | '/' | '%' | '**' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1622:1: ( '*' | '/' | '%' | '**' )
        {
        if ( (input.LA(1)>=44 && input.LA(1)<=47) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalBehavior

    // $ANTLR start synpred7_InternalBehavior
    public final void synpred7_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1816:3: ( ( () 'as' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1816:4: ( () 'as' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1816:4: ( () 'as' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1816:5: () 'as'
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1816:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1817:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred7_InternalBehavior4060); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalBehavior

    // $ANTLR start synpred8_InternalBehavior
    public final void synpred8_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1876:2: ( ( () ( ( ( '++' | '--' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1876:3: ( () ( ( ( '++' | '--' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1876:3: ( () ( ( ( '++' | '--' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1876:4: () ( ( ( '++' | '--' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1876:4: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1877:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1877:2: ( ( ( '++' | '--' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1878:1: ( ( '++' | '--' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1878:1: ( ( '++' | '--' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1879:1: ( '++' | '--' )
        {
        if ( (input.LA(1)>=50 && input.LA(1)<=51) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalBehavior

    // Delegated rules

    public final boolean synpred6_InternalBehavior() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalBehavior_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalBehavior() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalBehavior_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalBehavior() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalBehavior_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalBehavior() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalBehavior_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalBehavior() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalBehavior_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalBehavior() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalBehavior_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalBehavior() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBehavior_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalBehavior() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalBehavior_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleBehaviorModel_in_entryRuleBehaviorModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBehaviorModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBehaviorModel122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBehaviorModel143 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleBehaviorModel165 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_ruleRepositoryReference_in_ruleBehaviorModel192 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_ruleComponentImpl_in_ruleBehaviorModel215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepositoryReference_in_entryRuleRepositoryReference251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepositoryReference261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRepositoryReference298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRepositoryReference315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport403 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentImpl_in_entryRuleComponentImpl460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentImpl470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleComponentImpl507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComponentImpl530 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponentImpl542 = new BitSet(new long[]{0x00000000005E0000L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleComponentImpl565 = new BitSet(new long[]{0x00000000005E0000L});
    public static final BitSet FOLLOW_ruleConstantDecl_in_ruleComponentImpl584 = new BitSet(new long[]{0x00000000005E0000L});
    public static final BitSet FOLLOW_ruleInterfaceRealization_in_ruleComponentImpl609 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleComponentImpl622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDecl668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleVariableDecl713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19_in_ruleVariableDecl742 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclarationTypeReference_in_ruleVariableDecl779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDecl796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDecl_in_entryRuleConstantDecl837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDecl847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConstantDecl884 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDecl901 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstantDecl918 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConstantDecl939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceRealization_in_entryRuleInterfaceRealization975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceRealization985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInterfaceRealization1022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceRealization1045 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleMethodImpl_in_ruleInterfaceRealization1066 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleMethodImpl_in_entryRuleMethodImpl1103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodImpl1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMethodImpl1150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethodImpl1173 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleMethodImpl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleStatement1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_ruleStatement1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement1376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleIfStatement1423 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleIfStatement1435 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement1456 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleIfStatement1468 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleIfStatement1489 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleIfStatement1502 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleIfStatement1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockStatement1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBlockStatement1617 = new BitSet(new long[]{0x0000000011020020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlockStatement1638 = new BitSet(new long[]{0x0000000011020020L});
    public static final BitSet FOLLOW_17_in_ruleBlockStatement1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCall_in_ruleAssignment1743 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAssignment1755 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopStatement1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLoopStatement1859 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLoopStatement1871 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleLoopStatement1892 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLoopStatement1904 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLoopStatement1925 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLoopStatement1937 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleLoopStatement1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCall_in_entryRuleVariableCall1994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableCall2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableCall2049 = new BitSet(new long[]{0x0000000140000002L});
    public static final BitSet FOLLOW_30_in_ruleVariableCall2062 = new BitSet(new long[]{0x00710C00800000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableCall2083 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleVariableCall2096 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleVariableCall2111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyCall_in_ruleVariableCall2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCall_in_entryRulePropertyCall2170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCall2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyCall2225 = new BitSet(new long[]{0x0000000140000002L});
    public static final BitSet FOLLOW_30_in_rulePropertyCall2238 = new BitSet(new long[]{0x00710C00800000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyCall2259 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePropertyCall2272 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulePropertyCall2287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyCall_in_rulePropertyCall2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleExpression2403 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleExpression2454 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleExpression2490 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression2528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2585 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleAndExpression2636 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2672 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherExpression_in_ruleRelationalExpression2767 = new BitSet(new long[]{0x000001F800000002L});
    public static final BitSet FOLLOW_35_in_ruleRelationalExpression2895 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_36_in_ruleRelationalExpression2924 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_37_in_ruleRelationalExpression2953 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_38_in_ruleRelationalExpression2982 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_39_in_ruleRelationalExpression3011 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_40_in_ruleRelationalExpression3040 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleOtherExpression_in_ruleRelationalExpression3079 = new BitSet(new long[]{0x000001F800000002L});
    public static final BitSet FOLLOW_ruleOtherExpression_in_entryRuleOtherExpression3117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherExpression3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleOtherExpression3174 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleOtherExpression3209 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleOtherExpression3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3327 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleAdditiveExpression3399 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_43_in_ruleAdditiveExpression3428 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3467 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression3562 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultiplicativeExpression3662 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_45_in_ruleMultiplicativeExpression3691 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_46_in_ruleMultiplicativeExpression3720 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_47_in_ruleMultiplicativeExpression3749 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression3788 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation3826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleUnaryOperation3889 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleUnaryOperation3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastedExpression_in_ruleUnaryOperation3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastedExpression_in_entryRuleCastedExpression3987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastedExpression3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperation_in_ruleCastedExpression4044 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCastedExpression4079 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleCastedExpression4102 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperation_in_entryRulePostfixOperation4140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixOperation4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePostfixOperation4197 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_rulePostfixOperation4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePostfixOperation4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationExpression_in_rulePrimaryExpression4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCall_in_rulePrimaryExpression4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationExpression_in_entryRuleInstantiationExpression4498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationExpression4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInstantiationExpression4545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleInstantiationExpression4566 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleInstantiationExpression4578 = new BitSet(new long[]{0x00710C00000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInstantiationExpression4599 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleInstantiationExpression4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference4647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeReference4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_entryRuleCollectionType4736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleCollectionType4792 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCollectionType4804 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCollectionType4821 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCollectionType4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType4875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleMapType4931 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMapType4943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleMapType4965 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMapType4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeReference_in_entryRuleDeclarationTypeReference5014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationTypeReference5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleDeclarationTypeReference5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_ruleDeclarationTypeReference5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleDeclarationTypeReference5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLiteral_in_ruleLiteral5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLiteral_in_entryRuleCharLiteral5424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLiteral5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_in_ruleCharLiteral5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleNumberLiteral5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5747 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedName5766 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5781 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard5829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard5887 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedNameWithWildcard5906 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleQualifiedNameWithWildcard5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN5962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBOOLEAN6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBOOLEAN6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER6071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNUMBER6122 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43_in_ruleNUMBER6141 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER6186 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNUMBER6204 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred1_InternalBehavior2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred2_InternalBehavior2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalBehavior2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred4_InternalBehavior3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_InternalBehavior3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred6_InternalBehavior3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred7_InternalBehavior4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred8_InternalBehavior4215 = new BitSet(new long[]{0x0000000000000002L});

}