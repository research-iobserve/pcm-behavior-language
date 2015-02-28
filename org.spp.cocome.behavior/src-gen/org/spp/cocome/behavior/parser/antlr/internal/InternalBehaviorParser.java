package org.spp.cocome.behavior.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_CHARACTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'repository'", "'import'", "'realize'", "'{'", "'post-construct'", "'pre-destroy'", "'}'", "'action'", "'var'", "'val'", "'const'", "'='", "'iface'", "'operation'", "'if'", "'('", "')'", "'else'", "'for'", "':'", "'['", "']'", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'instanceof'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'!'", "'as'", "'++'", "'--'", "'new'", "'true'", "'false'", "'stateless'", "'stateful'", "'singleton'"
    };
    public static final int T__50=50;
    public static final int RULE_CHARACTER=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:68:1: entryRuleBehaviorModel returns [EObject current=null] : iv_ruleBehaviorModel= ruleBehaviorModel EOF ;
    public final EObject entryRuleBehaviorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorModel = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:69:2: (iv_ruleBehaviorModel= ruleBehaviorModel EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:70:2: iv_ruleBehaviorModel= ruleBehaviorModel EOF
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:77:1: ruleBehaviorModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) ) ;
    public final EObject ruleBehaviorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_repositories_3_0 = null;

        EObject lv_componentImpl_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:80:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:81:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleBehaviorModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBehaviorModelAccess().getPackageKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:87:3: lv_name_1_0= ruleQualifiedName
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

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:103:2: ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )*
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
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:103:3: ( (lv_imports_2_0= ruleImport ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:103:3: ( (lv_imports_2_0= ruleImport ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:104:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:104:1: (lv_imports_2_0= ruleImport )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:105:3: lv_imports_2_0= ruleImport
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
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:122:6: ( (lv_repositories_3_0= ruleRepositoryReference ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:122:6: ( (lv_repositories_3_0= ruleRepositoryReference ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:123:1: (lv_repositories_3_0= ruleRepositoryReference )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:123:1: (lv_repositories_3_0= ruleRepositoryReference )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:124:3: lv_repositories_3_0= ruleRepositoryReference
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

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:140:4: ( (lv_componentImpl_4_0= ruleComponentImpl ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:141:1: (lv_componentImpl_4_0= ruleComponentImpl )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:141:1: (lv_componentImpl_4_0= ruleComponentImpl )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:142:3: lv_componentImpl_4_0= ruleComponentImpl
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:166:1: entryRuleRepositoryReference returns [EObject current=null] : iv_ruleRepositoryReference= ruleRepositoryReference EOF ;
    public final EObject entryRuleRepositoryReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryReference = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:167:2: (iv_ruleRepositoryReference= ruleRepositoryReference EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:168:2: iv_ruleRepositoryReference= ruleRepositoryReference EOF
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:175:1: ruleRepositoryReference returns [EObject current=null] : (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRepositoryReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:178:28: ( (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:179:1: (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:179:1: (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:179:3: otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRepositoryReference298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRepositoryReferenceAccess().getRepositoryKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:183:1: ( (lv_reference_1_0= RULE_STRING ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:184:1: (lv_reference_1_0= RULE_STRING )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:184:1: (lv_reference_1_0= RULE_STRING )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:185:3: lv_reference_1_0= RULE_STRING
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:209:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:210:2: (iv_ruleImport= ruleImport EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:211:2: iv_ruleImport= ruleImport EOF
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:218:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:221:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:222:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:222:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:222:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:226:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:227:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:227:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:228:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:252:1: entryRuleComponentImpl returns [EObject current=null] : iv_ruleComponentImpl= ruleComponentImpl EOF ;
    public final EObject entryRuleComponentImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImpl = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:253:2: (iv_ruleComponentImpl= ruleComponentImpl EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:254:2: iv_ruleComponentImpl= ruleComponentImpl EOF
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:261:1: ruleComponentImpl returns [EObject current=null] : (otherlv_0= 'realize' ( (lv_kind_1_0= ruleComponentKind ) )? ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )* (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )? (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )? ( (lv_interfaces_9_0= ruleInterfaceRealization ) )* otherlv_10= '}' ) ;
    public final EObject ruleComponentImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Enumerator lv_kind_1_0 = null;

        EObject lv_localDeclarations_4_1 = null;

        EObject lv_localDeclarations_4_2 = null;

        EObject lv_postConstruct_6_0 = null;

        EObject lv_preDestroy_8_0 = null;

        EObject lv_interfaces_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:264:28: ( (otherlv_0= 'realize' ( (lv_kind_1_0= ruleComponentKind ) )? ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )* (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )? (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )? ( (lv_interfaces_9_0= ruleInterfaceRealization ) )* otherlv_10= '}' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:265:1: (otherlv_0= 'realize' ( (lv_kind_1_0= ruleComponentKind ) )? ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )* (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )? (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )? ( (lv_interfaces_9_0= ruleInterfaceRealization ) )* otherlv_10= '}' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:265:1: (otherlv_0= 'realize' ( (lv_kind_1_0= ruleComponentKind ) )? ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )* (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )? (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )? ( (lv_interfaces_9_0= ruleInterfaceRealization ) )* otherlv_10= '}' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:265:3: otherlv_0= 'realize' ( (lv_kind_1_0= ruleComponentKind ) )? ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )* (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )? (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )? ( (lv_interfaces_9_0= ruleInterfaceRealization ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleComponentImpl507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentImplAccess().getRealizeKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:269:1: ( (lv_kind_1_0= ruleComponentKind ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=58 && LA2_0<=60)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:270:1: (lv_kind_1_0= ruleComponentKind )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:270:1: (lv_kind_1_0= ruleComponentKind )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:271:3: lv_kind_1_0= ruleComponentKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentImplAccess().getKindComponentKindEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComponentKind_in_ruleComponentImpl528);
                    lv_kind_1_0=ruleComponentKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentImplRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_1_0, 
                              		"ComponentKind");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:287:3: ( ( ruleQualifiedName ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:288:1: ( ruleQualifiedName )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:288:1: ( ruleQualifiedName )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:289:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentImplRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentImplAccess().getRefComponentComponentCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleComponentImpl552);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleComponentImpl564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComponentImplAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:306:1: ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:307:1: ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:307:1: ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:308:1: (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:308:1: (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( ((LA3_0>=21 && LA3_0<=22)) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==23) ) {
            	        alt3=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:309:3: lv_localDeclarations_4_1= ruleVariableDecl
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentImplAccess().getLocalDeclarationsVariableDeclParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVariableDecl_in_ruleComponentImpl587);
            	            lv_localDeclarations_4_1=ruleVariableDecl();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getComponentImplRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"localDeclarations",
            	                      		lv_localDeclarations_4_1, 
            	                      		"VariableDecl");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:324:8: lv_localDeclarations_4_2= ruleConstantDecl
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentImplAccess().getLocalDeclarationsConstantDeclParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleConstantDecl_in_ruleComponentImpl606);
            	            lv_localDeclarations_4_2=ruleConstantDecl();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getComponentImplRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"localDeclarations",
            	                      		lv_localDeclarations_4_2, 
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
            	    break loop4;
                }
            } while (true);

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:342:3: (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:342:5: otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleComponentImpl623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getComponentImplAccess().getPostConstructKeyword_5_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:346:1: ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:347:1: (lv_postConstruct_6_0= ruleLifeCycleMethod )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:347:1: (lv_postConstruct_6_0= ruleLifeCycleMethod )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:348:3: lv_postConstruct_6_0= ruleLifeCycleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentImplAccess().getPostConstructLifeCycleMethodParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLifeCycleMethod_in_ruleComponentImpl644);
                    lv_postConstruct_6_0=ruleLifeCycleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentImplRule());
                      	        }
                             		set(
                             			current, 
                             			"postConstruct",
                              		lv_postConstruct_6_0, 
                              		"LifeCycleMethod");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:364:4: (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:364:6: otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleComponentImpl659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getComponentImplAccess().getPreDestroyKeyword_6_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:368:1: ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:369:1: (lv_preDestroy_8_0= ruleLifeCycleMethod )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:369:1: (lv_preDestroy_8_0= ruleLifeCycleMethod )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:370:3: lv_preDestroy_8_0= ruleLifeCycleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentImplAccess().getPreDestroyLifeCycleMethodParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLifeCycleMethod_in_ruleComponentImpl680);
                    lv_preDestroy_8_0=ruleLifeCycleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComponentImplRule());
                      	        }
                             		set(
                             			current, 
                             			"preDestroy",
                              		lv_preDestroy_8_0, 
                              		"LifeCycleMethod");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:386:4: ( (lv_interfaces_9_0= ruleInterfaceRealization ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:387:1: (lv_interfaces_9_0= ruleInterfaceRealization )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:387:1: (lv_interfaces_9_0= ruleInterfaceRealization )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:388:3: lv_interfaces_9_0= ruleInterfaceRealization
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentImplAccess().getInterfacesInterfaceRealizationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInterfaceRealization_in_ruleComponentImpl703);
            	    lv_interfaces_9_0=ruleInterfaceRealization();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComponentImplRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interfaces",
            	              		lv_interfaces_9_0, 
            	              		"InterfaceRealization");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleComponentImpl716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getComponentImplAccess().getRightCurlyBracketKeyword_8());
                  
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


    // $ANTLR start "entryRuleLifeCycleMethod"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:416:1: entryRuleLifeCycleMethod returns [EObject current=null] : iv_ruleLifeCycleMethod= ruleLifeCycleMethod EOF ;
    public final EObject entryRuleLifeCycleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLifeCycleMethod = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:417:2: (iv_ruleLifeCycleMethod= ruleLifeCycleMethod EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:418:2: iv_ruleLifeCycleMethod= ruleLifeCycleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLifeCycleMethodRule()); 
            }
            pushFollow(FOLLOW_ruleLifeCycleMethod_in_entryRuleLifeCycleMethod752);
            iv_ruleLifeCycleMethod=ruleLifeCycleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLifeCycleMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLifeCycleMethod762); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLifeCycleMethod"


    // $ANTLR start "ruleLifeCycleMethod"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:425:1: ruleLifeCycleMethod returns [EObject current=null] : (otherlv_0= 'action' ( (lv_body_1_0= ruleBlockStatement ) ) ) ;
    public final EObject ruleLifeCycleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:428:28: ( (otherlv_0= 'action' ( (lv_body_1_0= ruleBlockStatement ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:429:1: (otherlv_0= 'action' ( (lv_body_1_0= ruleBlockStatement ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:429:1: (otherlv_0= 'action' ( (lv_body_1_0= ruleBlockStatement ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:429:3: otherlv_0= 'action' ( (lv_body_1_0= ruleBlockStatement ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleLifeCycleMethod799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLifeCycleMethodAccess().getActionKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:433:1: ( (lv_body_1_0= ruleBlockStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:434:1: (lv_body_1_0= ruleBlockStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:434:1: (lv_body_1_0= ruleBlockStatement )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:435:3: lv_body_1_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLifeCycleMethodAccess().getBodyBlockStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_ruleLifeCycleMethod820);
            lv_body_1_0=ruleBlockStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLifeCycleMethodRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_1_0, 
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
    // $ANTLR end "ruleLifeCycleMethod"


    // $ANTLR start "entryRuleVariableDecl"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:459:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:460:2: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:461:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl856);
            iv_ruleVariableDecl=ruleVariableDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDecl866); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:468:1: ruleVariableDecl returns [EObject current=null] : ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token lv_modifier_0_1=null;
        Token lv_modifier_0_2=null;
        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:471:28: ( ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:472:1: ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:472:1: ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:472:2: ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:472:2: ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:473:1: ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:473:1: ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:474:1: (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:474:1: (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:475:3: lv_modifier_0_1= 'var'
                    {
                    lv_modifier_0_1=(Token)match(input,21,FOLLOW_21_in_ruleVariableDecl911); if (state.failed) return current;
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:487:8: lv_modifier_0_2= 'val'
                    {
                    lv_modifier_0_2=(Token)match(input,22,FOLLOW_22_in_ruleVariableDecl940); if (state.failed) return current;
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

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:502:2: ( (lv_type_1_0= ruleDeclarationTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:503:1: (lv_type_1_0= ruleDeclarationTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:503:1: (lv_type_1_0= ruleDeclarationTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:504:3: lv_type_1_0= ruleDeclarationTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclarationTypeReference_in_ruleVariableDecl977);
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

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:520:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:521:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:521:1: (lv_name_2_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:522:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDecl994); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:546:1: entryRuleConstantDecl returns [EObject current=null] : iv_ruleConstantDecl= ruleConstantDecl EOF ;
    public final EObject entryRuleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDecl = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:547:2: (iv_ruleConstantDecl= ruleConstantDecl EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:548:2: iv_ruleConstantDecl= ruleConstantDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDeclRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDecl_in_entryRuleConstantDecl1035);
            iv_ruleConstantDecl=ruleConstantDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDecl1045); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:555:1: ruleConstantDecl returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleConstantDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:558:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:559:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:559:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:559:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleConstantDecl1082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDeclAccess().getConstKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:563:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:564:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:564:1: (lv_name_1_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:565:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDecl1099); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleConstantDecl1116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantDeclAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:585:1: ( (lv_value_3_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:586:1: (lv_value_3_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:586:1: (lv_value_3_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:587:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleConstantDecl1137);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:611:1: entryRuleInterfaceRealization returns [EObject current=null] : iv_ruleInterfaceRealization= ruleInterfaceRealization EOF ;
    public final EObject entryRuleInterfaceRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceRealization = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:612:2: (iv_ruleInterfaceRealization= ruleInterfaceRealization EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:613:2: iv_ruleInterfaceRealization= ruleInterfaceRealization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRealizationRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceRealization_in_entryRuleInterfaceRealization1173);
            iv_ruleInterfaceRealization=ruleInterfaceRealization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceRealization; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceRealization1183); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:620:1: ruleInterfaceRealization returns [EObject current=null] : (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* ) ;
    public final EObject ruleInterfaceRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_methods_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:623:28: ( (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:624:1: (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:624:1: (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:624:3: otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleInterfaceRealization1220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInterfaceRealizationAccess().getIfaceKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:628:1: ( ( ruleQualifiedName ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:629:1: ( ruleQualifiedName )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:629:1: ( ruleQualifiedName )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:630:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInterfaceRealizationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceRealizationAccess().getRefInterfaceInterfaceCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterfaceRealization1243);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:643:2: ( (lv_methods_2_0= ruleMethodImpl ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:644:1: (lv_methods_2_0= ruleMethodImpl )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:644:1: (lv_methods_2_0= ruleMethodImpl )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:645:3: lv_methods_2_0= ruleMethodImpl
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceRealizationAccess().getMethodsMethodImplParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMethodImpl_in_ruleInterfaceRealization1264);
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
            	    break loop9;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:669:1: entryRuleMethodImpl returns [EObject current=null] : iv_ruleMethodImpl= ruleMethodImpl EOF ;
    public final EObject entryRuleMethodImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodImpl = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:670:2: (iv_ruleMethodImpl= ruleMethodImpl EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:671:2: iv_ruleMethodImpl= ruleMethodImpl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodImplRule()); 
            }
            pushFollow(FOLLOW_ruleMethodImpl_in_entryRuleMethodImpl1301);
            iv_ruleMethodImpl=ruleMethodImpl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodImpl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodImpl1311); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:678:1: ruleMethodImpl returns [EObject current=null] : (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) ) ;
    public final EObject ruleMethodImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:681:28: ( (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:682:1: (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:682:1: (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:682:3: otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMethodImpl1348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMethodImplAccess().getOperationKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:686:1: ( ( ruleQualifiedName ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:687:1: ( ruleQualifiedName )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:687:1: ( ruleQualifiedName )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:688:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodImplRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodImplAccess().getRefMethodMethodDeclCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethodImpl1371);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:701:2: ( (lv_body_2_0= ruleBlockStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:702:1: (lv_body_2_0= ruleBlockStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:702:1: (lv_body_2_0= ruleBlockStatement )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:703:3: lv_body_2_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodImplAccess().getBodyBlockStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_ruleMethodImpl1392);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:727:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:728:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:729:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1428);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1438); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:736:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_LoopStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:739:28: ( (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:740:1: (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:740:1: (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:741:5: this_IfStatement_0= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleStatement1485);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:751:5: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleStatement1512);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:761:5: this_LoopStatement_2= ruleLoopStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLoopStatement_in_ruleStatement1539);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:777:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:778:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:779:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement1574);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement1584); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:786:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:789:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:790:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:790:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:790:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleIfStatement1621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleIfStatement1633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:798:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:799:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:799:1: (lv_expr_2_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:800:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement1654);
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleIfStatement1666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:820:1: ( (lv_ifStatement_4_0= ruleBlockStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:821:1: (lv_ifStatement_4_0= ruleBlockStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:821:1: (lv_ifStatement_4_0= ruleBlockStatement )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:822:3: lv_ifStatement_4_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfStatementBlockStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_ruleIfStatement1687);
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

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:838:2: (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:838:4: otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleIfStatement1700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:842:1: ( (lv_elseStatement_6_0= ruleBlockStatement ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:843:1: (lv_elseStatement_6_0= ruleBlockStatement )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:843:1: (lv_elseStatement_6_0= ruleBlockStatement )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:844:3: lv_elseStatement_6_0= ruleBlockStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementBlockStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockStatement_in_ruleIfStatement1721);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:868:1: entryRuleBlockStatement returns [EObject current=null] : iv_ruleBlockStatement= ruleBlockStatement EOF ;
    public final EObject entryRuleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:869:2: (iv_ruleBlockStatement= ruleBlockStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:870:2: iv_ruleBlockStatement= ruleBlockStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement1759);
            iv_ruleBlockStatement=ruleBlockStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockStatement1769); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:877:1: ruleBlockStatement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlockStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:880:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:881:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:881:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:881:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:881:2: ()
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:882:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockStatementAccess().getBlockStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleBlockStatement1815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:891:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==27||LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:892:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:892:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:893:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockStatementAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleBlockStatement1836);
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
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBlockStatement1849); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:921:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:922:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:923:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1885);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1895); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:930:1: ruleAssignment returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:933:28: ( ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:934:1: ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:934:1: ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:934:2: ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:934:2: ( (lv_variable_0_0= ruleVariableCall ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:935:1: (lv_variable_0_0= ruleVariableCall )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:935:1: (lv_variable_0_0= ruleVariableCall )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:936:3: lv_variable_0_0= ruleVariableCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableCallParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableCall_in_ruleAssignment1941);
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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAssignment1953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:956:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:957:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:957:1: (lv_expression_2_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:958:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment1974);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:982:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:983:2: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:984:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopStatementRule()); 
            }
            pushFollow(FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement2010);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopStatement2020); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:991:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:994:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:995:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:995:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:995:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleLoopStatement2057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleLoopStatement2069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1003:1: ( (lv_variable_2_0= ruleVariableDecl ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1004:1: (lv_variable_2_0= ruleVariableDecl )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1004:1: (lv_variable_2_0= ruleVariableDecl )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1005:3: lv_variable_2_0= ruleVariableDecl
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getVariableVariableDeclParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDecl_in_ruleLoopStatement2090);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleLoopStatement2102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLoopStatementAccess().getColonKeyword_3());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1025:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1026:1: (lv_expression_4_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1026:1: (lv_expression_4_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1027:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLoopStatement2123);
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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleLoopStatement2135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLoopStatementAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1047:1: ( (lv_statement_6_0= ruleBlockStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1048:1: (lv_statement_6_0= ruleBlockStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1048:1: (lv_statement_6_0= ruleBlockStatement )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1049:3: lv_statement_6_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementBlockStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_ruleLoopStatement2156);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1073:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1074:2: (iv_ruleVariableCall= ruleVariableCall EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1075:2: iv_ruleVariableCall= ruleVariableCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableCallRule()); 
            }
            pushFollow(FOLLOW_ruleVariableCall_in_entryRuleVariableCall2192);
            iv_ruleVariableCall=ruleVariableCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableCall2202); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1082:1: ruleVariableCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1085:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1086:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1086:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1086:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1086:2: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1087:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1087:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1088:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableCall2247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableCallAccess().getVariableVariableDeclCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1099:2: (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1099:4: otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleVariableCall2260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableCallAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1103:1: ( (lv_index_2_0= ruleExpression ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_CHARACTER)||(LA13_0>=45 && LA13_0<=46)||LA13_0==51||(LA13_0>=55 && LA13_0<=57)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1104:1: (lv_index_2_0= ruleExpression )
                            {
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1104:1: (lv_index_2_0= ruleExpression )
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1105:3: lv_index_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariableCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleVariableCall2281);
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

                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleVariableCall2294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getVariableCallAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1125:3: (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1125:5: otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleVariableCall2309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableCallAccess().getFullStopKeyword_2_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1129:1: ( (lv_subProperty_5_0= rulePropertyCall ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1130:1: (lv_subProperty_5_0= rulePropertyCall )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1130:1: (lv_subProperty_5_0= rulePropertyCall )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1131:3: lv_subProperty_5_0= rulePropertyCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyCall_in_ruleVariableCall2330);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1155:1: entryRulePropertyCall returns [EObject current=null] : iv_rulePropertyCall= rulePropertyCall EOF ;
    public final EObject entryRulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCall = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1156:2: (iv_rulePropertyCall= rulePropertyCall EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1157:2: iv_rulePropertyCall= rulePropertyCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyCallRule()); 
            }
            pushFollow(FOLLOW_rulePropertyCall_in_entryRulePropertyCall2368);
            iv_rulePropertyCall=rulePropertyCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCall2378); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1164:1: rulePropertyCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1167:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1168:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1168:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1168:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1168:2: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1169:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1169:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1170:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyCall2423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPropertyCallAccess().getPropertyPropertyCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1181:2: (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1181:4: otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_rulePropertyCall2436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPropertyCallAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1185:1: ( (lv_index_2_0= ruleExpression ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_CHARACTER)||(LA16_0>=45 && LA16_0<=46)||LA16_0==51||(LA16_0>=55 && LA16_0<=57)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1186:1: (lv_index_2_0= ruleExpression )
                            {
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1186:1: (lv_index_2_0= ruleExpression )
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1187:3: lv_index_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPropertyCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePropertyCall2457);
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

                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_rulePropertyCall2470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyCallAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1207:3: (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1207:5: otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_rulePropertyCall2485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyCallAccess().getFullStopKeyword_2_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1211:1: ( (lv_subProperty_5_0= rulePropertyCall ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1212:1: (lv_subProperty_5_0= rulePropertyCall )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1212:1: (lv_subProperty_5_0= rulePropertyCall )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1213:3: lv_subProperty_5_0= rulePropertyCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyCall_in_rulePropertyCall2506);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1237:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1238:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1239:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2544);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2554); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1246:1: ruleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1249:28: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1250:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1250:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1251:5: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleExpression2601);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1259:1: ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) && (synpred1_InternalBehavior())) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1259:2: ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1259:2: ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1259:3: ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1266:6: ( () ( (lv_feature_2_0= '||' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1266:7: () ( (lv_feature_2_0= '||' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1266:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1267:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionAccess().getBinaryOperationLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1272:2: ( (lv_feature_2_0= '||' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1273:1: (lv_feature_2_0= '||' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1273:1: (lv_feature_2_0= '||' )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1274:3: lv_feature_2_0= '||'
            	    {
            	    lv_feature_2_0=(Token)match(input,36,FOLLOW_36_in_ruleExpression2652); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1287:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1288:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1288:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1289:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleExpression2688);
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1313:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1314:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1315:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression2726);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression2736); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1322:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1325:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1326:1: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1326:1: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1327:5: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2783);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:1: ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) && (synpred2_InternalBehavior())) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:2: ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:2: ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:3: ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1342:6: ( () ( (lv_feature_2_0= '&&' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1342:7: () ( (lv_feature_2_0= '&&' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1342:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1343:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1348:2: ( (lv_feature_2_0= '&&' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1349:1: (lv_feature_2_0= '&&' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1349:1: (lv_feature_2_0= '&&' )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1350:3: lv_feature_2_0= '&&'
            	    {
            	    lv_feature_2_0=(Token)match(input,37,FOLLOW_37_in_ruleAndExpression2834); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1363:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1364:1: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1364:1: (lv_right_3_0= ruleRelationalExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1365:3: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2870);
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
            	    break loop20;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1389:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1390:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1391:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2908);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression2918); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1398:1: ruleRelationalExpression returns [EObject current=null] : (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1401:28: ( (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1402:1: (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1402:1: (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1403:5: this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOtherExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOtherExpression_in_ruleRelationalExpression2965);
            this_OtherExpression_0=ruleOtherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OtherExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:1: ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) && (synpred3_InternalBehavior())) {
                    alt22=1;
                }
                else if ( (LA22_0==39) && (synpred3_InternalBehavior())) {
                    alt22=1;
                }
                else if ( (LA22_0==40) && (synpred3_InternalBehavior())) {
                    alt22=1;
                }
                else if ( (LA22_0==41) && (synpred3_InternalBehavior())) {
                    alt22=1;
                }
                else if ( (LA22_0==42) && (synpred3_InternalBehavior())) {
                    alt22=1;
                }
                else if ( (LA22_0==43) && (synpred3_InternalBehavior())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:2: ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:2: ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:3: ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1436:6: ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1436:7: () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1436:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1437:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1442:2: ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1443:1: ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1443:1: ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1444:1: (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1444:1: (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' )
            	    int alt21=6;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt21=5;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt21=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1445:3: lv_feature_2_1= '=='
            	            {
            	            lv_feature_2_1=(Token)match(input,38,FOLLOW_38_in_ruleRelationalExpression3093); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1457:8: lv_feature_2_2= '!='
            	            {
            	            lv_feature_2_2=(Token)match(input,39,FOLLOW_39_in_ruleRelationalExpression3122); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1469:8: lv_feature_2_3= '>'
            	            {
            	            lv_feature_2_3=(Token)match(input,40,FOLLOW_40_in_ruleRelationalExpression3151); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1481:8: lv_feature_2_4= '<'
            	            {
            	            lv_feature_2_4=(Token)match(input,41,FOLLOW_41_in_ruleRelationalExpression3180); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1493:8: lv_feature_2_5= '>='
            	            {
            	            lv_feature_2_5=(Token)match(input,42,FOLLOW_42_in_ruleRelationalExpression3209); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1505:8: lv_feature_2_6= '<='
            	            {
            	            lv_feature_2_6=(Token)match(input,43,FOLLOW_43_in_ruleRelationalExpression3238); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1520:4: ( (lv_right_3_0= ruleOtherExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1521:1: (lv_right_3_0= ruleOtherExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1521:1: (lv_right_3_0= ruleOtherExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1522:3: lv_right_3_0= ruleOtherExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightOtherExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherExpression_in_ruleRelationalExpression3277);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleOtherExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1546:1: entryRuleOtherExpression returns [EObject current=null] : iv_ruleOtherExpression= ruleOtherExpression EOF ;
    public final EObject entryRuleOtherExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1547:2: (iv_ruleOtherExpression= ruleOtherExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1548:2: iv_ruleOtherExpression= ruleOtherExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOtherExpression_in_entryRuleOtherExpression3315);
            iv_ruleOtherExpression=ruleOtherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherExpression3325); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1555:1: ruleOtherExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? ) ;
    public final EObject ruleOtherExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1558:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1559:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1559:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1560:5: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOtherExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleOtherExpression3372);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1568:1: ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) && (synpred4_InternalBehavior())) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1568:2: ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1568:2: ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1568:3: ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1575:6: ( () ( (lv_feature_2_0= 'instanceof' ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1575:7: () ( (lv_feature_2_0= 'instanceof' ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1575:7: ()
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1576:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1581:2: ( (lv_feature_2_0= 'instanceof' ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1582:1: (lv_feature_2_0= 'instanceof' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1582:1: (lv_feature_2_0= 'instanceof' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1583:3: lv_feature_2_0= 'instanceof'
                    {
                    lv_feature_2_0=(Token)match(input,44,FOLLOW_44_in_ruleOtherExpression3423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_feature_2_0, grammarAccess.getOtherExpressionAccess().getFeatureInstanceofKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOtherExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "feature", lv_feature_2_0, "instanceof");
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1596:4: ( (lv_type_3_0= ruleTypeReference ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1597:1: (lv_type_3_0= ruleTypeReference )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1597:1: (lv_type_3_0= ruleTypeReference )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1598:3: lv_type_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOtherExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleOtherExpression3459);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1622:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1623:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1624:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3497);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression3507); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1631:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1634:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1635:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1635:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1636:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3554);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:1: ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==45) && (synpred5_InternalBehavior())) {
                    alt25=1;
                }
                else if ( (LA25_0==46) && (synpred5_InternalBehavior())) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1657:6: ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1657:7: () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1657:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1658:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1663:2: ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1664:1: ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1664:1: ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1665:1: (lv_feature_2_1= '+' | lv_feature_2_2= '-' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1665:1: (lv_feature_2_1= '+' | lv_feature_2_2= '-' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==45) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==46) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1666:3: lv_feature_2_1= '+'
            	            {
            	            lv_feature_2_1=(Token)match(input,45,FOLLOW_45_in_ruleAdditiveExpression3626); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1678:8: lv_feature_2_2= '-'
            	            {
            	            lv_feature_2_2=(Token)match(input,46,FOLLOW_46_in_ruleAdditiveExpression3655); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1693:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1694:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1694:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1695:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3694);
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
            	    break loop25;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1719:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1720:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1721:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3732);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression3742); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1728:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1731:28: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1732:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1732:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1733:5: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression3789);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1741:1: ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==47) && (synpred6_InternalBehavior())) {
                    alt27=1;
                }
                else if ( (LA27_0==48) && (synpred6_InternalBehavior())) {
                    alt27=1;
                }
                else if ( (LA27_0==49) && (synpred6_InternalBehavior())) {
                    alt27=1;
                }
                else if ( (LA27_0==50) && (synpred6_InternalBehavior())) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1741:2: ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1741:2: ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1741:3: ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1760:6: ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1760:7: () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1760:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1761:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1766:2: ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1767:1: ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1767:1: ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1768:1: (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1768:1: (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' )
            	    int alt26=4;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1769:3: lv_feature_2_1= '*'
            	            {
            	            lv_feature_2_1=(Token)match(input,47,FOLLOW_47_in_ruleMultiplicativeExpression3889); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1781:8: lv_feature_2_2= '/'
            	            {
            	            lv_feature_2_2=(Token)match(input,48,FOLLOW_48_in_ruleMultiplicativeExpression3918); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1793:8: lv_feature_2_3= '%'
            	            {
            	            lv_feature_2_3=(Token)match(input,49,FOLLOW_49_in_ruleMultiplicativeExpression3947); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1805:8: lv_feature_2_4= '**'
            	            {
            	            lv_feature_2_4=(Token)match(input,50,FOLLOW_50_in_ruleMultiplicativeExpression3976); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1820:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1821:1: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1821:1: (lv_right_3_0= ruleUnaryOperation )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1822:3: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression4015);
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
            	    break loop27;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1846:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1847:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1848:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation4053);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation4063); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1855:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_1_0=null;
        EObject lv_operand_2_0 = null;

        EObject this_CastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1858:28: ( ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1859:1: ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1859:1: ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_CHARACTER)||(LA28_0>=45 && LA28_0<=46)||(LA28_0>=55 && LA28_0<=57)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1859:2: ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1859:2: ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1859:3: () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1859:3: ()
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1860:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnaryOperationAccess().getExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1865:2: ( (lv_feature_1_0= '!' ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1866:1: (lv_feature_1_0= '!' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1866:1: (lv_feature_1_0= '!' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1867:3: lv_feature_1_0= '!'
                    {
                    lv_feature_1_0=(Token)match(input,51,FOLLOW_51_in_ruleUnaryOperation4116); if (state.failed) return current;
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

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1880:2: ( (lv_operand_2_0= ruleUnaryOperation ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1881:1: (lv_operand_2_0= ruleUnaryOperation )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1881:1: (lv_operand_2_0= ruleUnaryOperation )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1882:3: lv_operand_2_0= ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperandUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleUnaryOperation4150);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1900:5: this_CastedExpression_3= ruleCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOperationAccess().getCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCastedExpression_in_ruleUnaryOperation4179);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1916:1: entryRuleCastedExpression returns [EObject current=null] : iv_ruleCastedExpression= ruleCastedExpression EOF ;
    public final EObject entryRuleCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastedExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1917:2: (iv_ruleCastedExpression= ruleCastedExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1918:2: iv_ruleCastedExpression= ruleCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCastedExpression_in_entryRuleCastedExpression4214);
            iv_ruleCastedExpression=ruleCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastedExpression4224); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1925:1: ruleCastedExpression returns [EObject current=null] : (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleCastedExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_PostfixOperation_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1928:28: ( (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1929:1: (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1929:1: (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1930:5: this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCastedExpressionAccess().getPostfixOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePostfixOperation_in_ruleCastedExpression4271);
            this_PostfixOperation_0=rulePostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PostfixOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1938:1: ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==52) && (synpred7_InternalBehavior())) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1938:2: ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1938:2: ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1938:3: ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1945:6: ( () ( (lv_feature_2_0= 'as' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1945:7: () ( (lv_feature_2_0= 'as' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1945:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1946:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1951:2: ( (lv_feature_2_0= 'as' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1952:1: (lv_feature_2_0= 'as' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1952:1: (lv_feature_2_0= 'as' )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1953:3: lv_feature_2_0= 'as'
            	    {
            	    lv_feature_2_0=(Token)match(input,52,FOLLOW_52_in_ruleCastedExpression4322); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_feature_2_0, grammarAccess.getCastedExpressionAccess().getFeatureAsKeyword_1_0_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getCastedExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "feature", lv_feature_2_0, "as");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1966:4: ( (lv_type_3_0= ruleTypeReference ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1967:1: (lv_type_3_0= ruleTypeReference )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1967:1: (lv_type_3_0= ruleTypeReference )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1968:3: lv_type_3_0= ruleTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCastedExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeReference_in_ruleCastedExpression4358);
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
            	    break loop29;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1992:1: entryRulePostfixOperation returns [EObject current=null] : iv_rulePostfixOperation= rulePostfixOperation EOF ;
    public final EObject entryRulePostfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixOperation = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1993:2: (iv_rulePostfixOperation= rulePostfixOperation EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1994:2: iv_rulePostfixOperation= rulePostfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixOperationRule()); 
            }
            pushFollow(FOLLOW_rulePostfixOperation_in_entryRulePostfixOperation4396);
            iv_rulePostfixOperation=rulePostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixOperation4406); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2001:1: rulePostfixOperation returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? ) ;
    public final EObject rulePostfixOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_PrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2004:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2005:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2005:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2006:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPostfixOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rulePostfixOperation4453);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2014:1: ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) && (synpred8_InternalBehavior())) {
                alt31=1;
            }
            else if ( (LA31_0==54) && (synpred8_InternalBehavior())) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2014:2: ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2027:6: ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2027:7: () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2027:7: ()
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2028:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2033:2: ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2034:1: ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2034:1: ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2035:1: (lv_feature_2_1= '++' | lv_feature_2_2= '--' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2035:1: (lv_feature_2_1= '++' | lv_feature_2_2= '--' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==53) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==54) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2036:3: lv_feature_2_1= '++'
                            {
                            lv_feature_2_1=(Token)match(input,53,FOLLOW_53_in_rulePostfixOperation4524); if (state.failed) return current;
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
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2048:8: lv_feature_2_2= '--'
                            {
                            lv_feature_2_2=(Token)match(input,54,FOLLOW_54_in_rulePostfixOperation4553); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2071:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2072:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2073:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4608);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4618); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2080:1: rulePrimaryExpression returns [EObject current=null] : (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_Literal_2= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InstantiationExpression_0 = null;

        EObject this_VariableCall_1 = null;

        EObject this_Literal_2 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2083:28: ( (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_Literal_2= ruleLiteral ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2084:1: (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_Literal_2= ruleLiteral )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2084:1: (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_Literal_2= ruleLiteral )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt32=1;
                }
                break;
            case RULE_ID:
                {
                alt32=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_CHARACTER:
            case 45:
            case 46:
            case 56:
            case 57:
                {
                alt32=3;
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2085:5: this_InstantiationExpression_0= ruleInstantiationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInstantiationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstantiationExpression_in_rulePrimaryExpression4665);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2095:5: this_VariableCall_1= ruleVariableCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableCall_in_rulePrimaryExpression4692);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2105:5: this_Literal_2= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression4719);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2121:1: entryRuleInstantiationExpression returns [EObject current=null] : iv_ruleInstantiationExpression= ruleInstantiationExpression EOF ;
    public final EObject entryRuleInstantiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiationExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2122:2: (iv_ruleInstantiationExpression= ruleInstantiationExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2123:2: iv_ruleInstantiationExpression= ruleInstantiationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstantiationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstantiationExpression_in_entryRuleInstantiationExpression4754);
            iv_ruleInstantiationExpression=ruleInstantiationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstantiationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationExpression4764); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2130:1: ruleInstantiationExpression returns [EObject current=null] : (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleInstantiationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_parameters_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2133:28: ( (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2134:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2134:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2134:3: otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleInstantiationExpression4801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstantiationExpressionAccess().getNewKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2138:1: ( (lv_type_1_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2139:1: (lv_type_1_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2139:1: (lv_type_1_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2140:3: lv_type_1_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstantiationExpressionAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleInstantiationExpression4822);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleInstantiationExpression4834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInstantiationExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2160:1: ( (lv_parameters_3_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2161:1: (lv_parameters_3_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2161:1: (lv_parameters_3_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2162:3: lv_parameters_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstantiationExpressionAccess().getParametersExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInstantiationExpression4855);
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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleInstantiationExpression4867); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2190:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2191:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2192:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference4903);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference4913); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2199:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2202:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2203:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2203:1: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2204:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2204:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2205:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeReference4957); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2224:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2225:2: (iv_ruleCollectionType= ruleCollectionType EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2226:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionType_in_entryRuleCollectionType4992);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType5002); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2233:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2236:28: ( ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2237:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2237:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2237:2: ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2237:2: ( (lv_reference_0_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2238:1: (lv_reference_0_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2238:1: (lv_reference_0_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2239:3: lv_reference_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleCollectionType5048);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleCollectionType5060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2259:1: ( (lv_size_2_0= RULE_INT ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2260:1: (lv_size_2_0= RULE_INT )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2260:1: (lv_size_2_0= RULE_INT )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2261:3: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCollectionType5077); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleCollectionType5095); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2289:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2290:2: (iv_ruleMapType= ruleMapType EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2291:2: iv_ruleMapType= ruleMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeRule()); 
            }
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType5131);
            iv_ruleMapType=ruleMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType5141); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2298:1: ruleMapType returns [EObject current=null] : ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;

        EObject lv_keyType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2301:28: ( ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2302:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2302:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2302:2: ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2302:2: ( (lv_reference_0_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2303:1: (lv_reference_0_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2303:1: (lv_reference_0_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2304:3: lv_reference_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleMapType5187);
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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleMapType5199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2324:1: ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2324:2: ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>'
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2324:2: ( (lv_keyType_2_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2325:1: (lv_keyType_2_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2325:1: (lv_keyType_2_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2326:3: lv_keyType_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeTypeReferenceParserRuleCall_2_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleMapType5221);
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

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleMapType5233); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2354:1: entryRuleDeclarationTypeReference returns [EObject current=null] : iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF ;
    public final EObject entryRuleDeclarationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationTypeReference = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2355:2: (iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2356:2: iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleDeclarationTypeReference_in_entryRuleDeclarationTypeReference5270);
            iv_ruleDeclarationTypeReference=ruleDeclarationTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationTypeReference5280); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2363:1: ruleDeclarationTypeReference returns [EObject current=null] : (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType ) ;
    public final EObject ruleDeclarationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_TypeReference_0 = null;

        EObject this_CollectionType_1 = null;

        EObject this_MapType_2 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2366:28: ( (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2367:1: (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2367:1: (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt34=3;
                    }
                    break;
                case 33:
                    {
                    alt34=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                    {
                    alt34=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2368:5: this_TypeReference_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleDeclarationTypeReference5327);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2378:5: this_CollectionType_1= ruleCollectionType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getCollectionTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionType_in_ruleDeclarationTypeReference5354);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2388:5: this_MapType_2= ruleMapType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMapType_in_ruleDeclarationTypeReference5381);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2404:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2405:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2406:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5416);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5426); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2413:1: ruleLiteral returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteral_0 = null;

        EObject this_NumberLiteral_1 = null;

        EObject this_CharLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2416:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2417:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2417:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 56:
            case 57:
                {
                alt35=1;
                }
                break;
            case RULE_INT:
            case 45:
            case 46:
                {
                alt35=2;
                }
                break;
            case RULE_CHARACTER:
                {
                alt35=3;
                }
                break;
            case RULE_STRING:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2418:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral5473);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2428:5: this_NumberLiteral_1= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral5500);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2438:5: this_CharLiteral_2= ruleCharLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCharLiteral_in_ruleLiteral5527);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2448:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral5554);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2464:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2465:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2466:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5589);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral5599); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2473:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2476:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2477:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2477:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2478:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2478:1: (lv_value_0_0= RULE_STRING )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2479:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral5640); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2503:1: entryRuleCharLiteral returns [EObject current=null] : iv_ruleCharLiteral= ruleCharLiteral EOF ;
    public final EObject entryRuleCharLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2504:2: (iv_ruleCharLiteral= ruleCharLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2505:2: iv_ruleCharLiteral= ruleCharLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCharLiteral_in_entryRuleCharLiteral5680);
            iv_ruleCharLiteral=ruleCharLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLiteral5690); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2512:1: ruleCharLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_CHARACTER ) ) ;
    public final EObject ruleCharLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2515:28: ( ( (lv_value_0_0= RULE_CHARACTER ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2516:1: ( (lv_value_0_0= RULE_CHARACTER ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2516:1: ( (lv_value_0_0= RULE_CHARACTER ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2517:1: (lv_value_0_0= RULE_CHARACTER )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2517:1: (lv_value_0_0= RULE_CHARACTER )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2518:3: lv_value_0_0= RULE_CHARACTER
            {
            lv_value_0_0=(Token)match(input,RULE_CHARACTER,FOLLOW_RULE_CHARACTER_in_ruleCharLiteral5731); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2542:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2543:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2544:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5771);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral5781); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2551:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2554:28: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2555:1: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2555:1: ( (lv_value_0_0= ruleNUMBER ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2556:1: (lv_value_0_0= ruleNUMBER )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2556:1: (lv_value_0_0= ruleNUMBER )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2557:3: lv_value_0_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNUMBER_in_ruleNumberLiteral5826);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2581:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2582:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2583:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5861);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral5871); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2590:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2593:28: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2594:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2594:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2595:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2595:1: (lv_value_0_0= ruleBOOLEAN )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2596:3: lv_value_0_0= ruleBOOLEAN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral5916);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2620:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2621:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2622:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5952);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5963); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2629:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2632:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2633:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2633:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2633:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2640:1: (kw= '.' this_ID_2= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==35) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==RULE_ID) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2641:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleQualifiedName6022); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6037); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2661:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2662:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2663:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard6085);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard6096); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2670:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2673:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2674:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2674:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2675:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard6143);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2685:1: (kw= '.' kw= '*' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2686:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleQualifiedNameWithWildcard6162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleQualifiedNameWithWildcard6175); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2705:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2706:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2707:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEANRule()); 
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN6218);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN6229); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2714:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2717:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2718:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2718:1: (kw= 'true' | kw= 'false' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            else if ( (LA38_0==57) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2719:2: kw= 'true'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleBOOLEAN6267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2726:2: kw= 'false'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleBOOLEAN6286); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2739:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2740:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2741:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER6327);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER6338); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2748:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2751:28: ( ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2752:1: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2752:1: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=45 && LA40_0<=46)) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_INT) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==35) ) {
                    alt40=2;
                }
                else if ( (LA40_2==EOF||LA40_2==RULE_ID||(LA40_2>=17 && LA40_2<=19)||(LA40_2>=21 && LA40_2<=23)||LA40_2==25||LA40_2==27||LA40_2==29||LA40_2==31||LA40_2==34||(LA40_2>=36 && LA40_2<=50)||(LA40_2>=52 && LA40_2<=54)) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2752:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2752:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2752:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2752:3: (kw= '+' | kw= '-' )?
                    int alt39=3;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==45) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==46) ) {
                        alt39=2;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2753:2: kw= '+'
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleNUMBER6378); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBERAccess().getPlusSignKeyword_0_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2760:2: kw= '-'
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleNUMBER6397); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER6414); if (state.failed) return current;
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2773:6: (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2773:6: (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2773:11: this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER6442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
                          
                    }
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleNUMBER6460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER6475); if (state.failed) return current;
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


    // $ANTLR start "ruleComponentKind"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2801:1: ruleComponentKind returns [Enumerator current=null] : ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) ) ;
    public final Enumerator ruleComponentKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2803:28: ( ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2804:1: ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2804:1: ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt41=1;
                }
                break;
            case 59:
                {
                alt41=2;
                }
                break;
            case 60:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2804:2: (enumLiteral_0= 'stateless' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2804:2: (enumLiteral_0= 'stateless' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2804:4: enumLiteral_0= 'stateless'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleComponentKind6535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComponentKindAccess().getSTATELESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComponentKindAccess().getSTATELESSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2810:6: (enumLiteral_1= 'stateful' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2810:6: (enumLiteral_1= 'stateful' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2810:8: enumLiteral_1= 'stateful'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleComponentKind6552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComponentKindAccess().getSTATEFULEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComponentKindAccess().getSTATEFULEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2816:6: (enumLiteral_2= 'singleton' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2816:6: (enumLiteral_2= 'singleton' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2816:8: enumLiteral_2= 'singleton'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_60_in_ruleComponentKind6569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComponentKindAccess().getSINGLETONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComponentKindAccess().getSINGLETONEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleComponentKind"

    // $ANTLR start synpred1_InternalBehavior
    public final void synpred1_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1259:3: ( ( () ( ( '||' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1259:4: ( () ( ( '||' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1259:4: ( () ( ( '||' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1259:5: () ( ( '||' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1259:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1260:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1260:2: ( ( '||' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1261:1: ( '||' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1261:1: ( '||' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1262:2: '||'
        {
        match(input,36,FOLLOW_36_in_synpred1_InternalBehavior2621); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalBehavior

    // $ANTLR start synpred2_InternalBehavior
    public final void synpred2_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:3: ( ( () ( ( '&&' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:4: ( () ( ( '&&' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:4: ( () ( ( '&&' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:5: () ( ( '&&' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1336:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1336:2: ( ( '&&' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1337:1: ( '&&' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1337:1: ( '&&' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1338:2: '&&'
        {
        match(input,37,FOLLOW_37_in_synpred2_InternalBehavior2803); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalBehavior

    // $ANTLR start synpred3_InternalBehavior
    public final void synpred3_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:3: ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:4: ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:4: ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:5: () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1412:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1412:2: ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1413:1: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1413:1: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1414:1: ( '==' | '!=' | '>' | '<' | '>=' | '<=' )
        {
        if ( (input.LA(1)>=38 && input.LA(1)<=43) ) {
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
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1568:3: ( ( () ( ( 'instanceof' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1568:4: ( () ( ( 'instanceof' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1568:4: ( () ( ( 'instanceof' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1568:5: () ( ( 'instanceof' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1568:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1569:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1569:2: ( ( 'instanceof' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1570:1: ( 'instanceof' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1570:1: ( 'instanceof' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1571:2: 'instanceof'
        {
        match(input,44,FOLLOW_44_in_synpred4_InternalBehavior3392); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalBehavior

    // $ANTLR start synpred5_InternalBehavior
    public final void synpred5_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:4: ( () ( ( ( '+' | '-' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:4: ( () ( ( ( '+' | '-' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:5: () ( ( ( '+' | '-' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1645:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1645:2: ( ( ( '+' | '-' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1646:1: ( ( '+' | '-' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1646:1: ( ( '+' | '-' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1647:1: ( '+' | '-' )
        {
        if ( (input.LA(1)>=45 && input.LA(1)<=46) ) {
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
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1741:3: ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1741:4: ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1741:4: ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1741:5: () ( ( ( '*' | '/' | '%' | '**' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1741:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1742:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1742:2: ( ( ( '*' | '/' | '%' | '**' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1743:1: ( ( '*' | '/' | '%' | '**' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1743:1: ( ( '*' | '/' | '%' | '**' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1744:1: ( '*' | '/' | '%' | '**' )
        {
        if ( (input.LA(1)>=47 && input.LA(1)<=50) ) {
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
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1938:3: ( ( () ( ( 'as' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1938:4: ( () ( ( 'as' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1938:4: ( () ( ( 'as' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1938:5: () ( ( 'as' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1938:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1939:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1939:2: ( ( 'as' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1940:1: ( 'as' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1940:1: ( 'as' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1941:2: 'as'
        {
        match(input,52,FOLLOW_52_in_synpred7_InternalBehavior4291); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalBehavior

    // $ANTLR start synpred8_InternalBehavior
    public final void synpred8_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2014:2: ( ( () ( ( ( '++' | '--' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2014:3: ( () ( ( ( '++' | '--' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2014:3: ( () ( ( ( '++' | '--' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2014:4: () ( ( ( '++' | '--' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2014:4: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2015:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2015:2: ( ( ( '++' | '--' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2016:1: ( ( '++' | '--' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2016:1: ( ( '++' | '--' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2017:1: ( '++' | '--' )
        {
        if ( (input.LA(1)>=53 && input.LA(1)<=54) ) {
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
    public static final BitSet FOLLOW_15_in_ruleComponentImpl507 = new BitSet(new long[]{0x1C00000000000020L});
    public static final BitSet FOLLOW_ruleComponentKind_in_ruleComponentImpl528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComponentImpl552 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponentImpl564 = new BitSet(new long[]{0x0000000002EE0000L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleComponentImpl587 = new BitSet(new long[]{0x0000000002EE0000L});
    public static final BitSet FOLLOW_ruleConstantDecl_in_ruleComponentImpl606 = new BitSet(new long[]{0x0000000002EE0000L});
    public static final BitSet FOLLOW_17_in_ruleComponentImpl623 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleLifeCycleMethod_in_ruleComponentImpl644 = new BitSet(new long[]{0x00000000020C0000L});
    public static final BitSet FOLLOW_18_in_ruleComponentImpl659 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleLifeCycleMethod_in_ruleComponentImpl680 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_ruleInterfaceRealization_in_ruleComponentImpl703 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_19_in_ruleComponentImpl716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLifeCycleMethod_in_entryRuleLifeCycleMethod752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLifeCycleMethod762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleLifeCycleMethod799 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleLifeCycleMethod820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDecl866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVariableDecl911 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22_in_ruleVariableDecl940 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclarationTypeReference_in_ruleVariableDecl977 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDecl994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDecl_in_entryRuleConstantDecl1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDecl1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleConstantDecl1082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDecl1099 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConstantDecl1116 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConstantDecl1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceRealization_in_entryRuleInterfaceRealization1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceRealization1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleInterfaceRealization1220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceRealization1243 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleMethodImpl_in_ruleInterfaceRealization1264 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleMethodImpl_in_entryRuleMethodImpl1301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodImpl1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMethodImpl1348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethodImpl1371 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleMethodImpl1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleStatement1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleStatement1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_ruleStatement1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIfStatement1621 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIfStatement1633 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement1654 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIfStatement1666 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleIfStatement1687 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleIfStatement1700 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleIfStatement1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockStatement1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBlockStatement1815 = new BitSet(new long[]{0x0000000088080020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlockStatement1836 = new BitSet(new long[]{0x0000000088080020L});
    public static final BitSet FOLLOW_19_in_ruleBlockStatement1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCall_in_ruleAssignment1941 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssignment1953 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement2010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopStatement2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLoopStatement2057 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLoopStatement2069 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleLoopStatement2090 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLoopStatement2102 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLoopStatement2123 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLoopStatement2135 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleLoopStatement2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCall_in_entryRuleVariableCall2192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableCall2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableCall2247 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_33_in_ruleVariableCall2260 = new BitSet(new long[]{0x03886004000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableCall2281 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleVariableCall2294 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleVariableCall2309 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyCall_in_ruleVariableCall2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCall_in_entryRulePropertyCall2368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCall2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyCall2423 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_33_in_rulePropertyCall2436 = new BitSet(new long[]{0x03886004000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyCall2457 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePropertyCall2470 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_rulePropertyCall2485 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyCall_in_rulePropertyCall2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleExpression2601 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleExpression2652 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleExpression2688 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression2726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2783 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleAndExpression2834 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2870 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherExpression_in_ruleRelationalExpression2965 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_38_in_ruleRelationalExpression3093 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_39_in_ruleRelationalExpression3122 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_40_in_ruleRelationalExpression3151 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_41_in_ruleRelationalExpression3180 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_42_in_ruleRelationalExpression3209 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_43_in_ruleRelationalExpression3238 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleOtherExpression_in_ruleRelationalExpression3277 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_ruleOtherExpression_in_entryRuleOtherExpression3315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherExpression3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleOtherExpression3372 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleOtherExpression3423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleOtherExpression3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3554 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleAdditiveExpression3626 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_46_in_ruleAdditiveExpression3655 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3694 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression3789 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_47_in_ruleMultiplicativeExpression3889 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_48_in_ruleMultiplicativeExpression3918 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_49_in_ruleMultiplicativeExpression3947 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_50_in_ruleMultiplicativeExpression3976 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression4015 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation4053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleUnaryOperation4116 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleUnaryOperation4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastedExpression_in_ruleUnaryOperation4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastedExpression_in_entryRuleCastedExpression4214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastedExpression4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperation_in_ruleCastedExpression4271 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCastedExpression4322 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleCastedExpression4358 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperation_in_entryRulePostfixOperation4396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixOperation4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePostfixOperation4453 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_53_in_rulePostfixOperation4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePostfixOperation4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationExpression_in_rulePrimaryExpression4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCall_in_rulePrimaryExpression4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationExpression_in_entryRuleInstantiationExpression4754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationExpression4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInstantiationExpression4801 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleInstantiationExpression4822 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInstantiationExpression4834 = new BitSet(new long[]{0x03886000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInstantiationExpression4855 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInstantiationExpression4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference4903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeReference4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_entryRuleCollectionType4992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleCollectionType5048 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCollectionType5060 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCollectionType5077 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCollectionType5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType5131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleMapType5187 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleMapType5199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleMapType5221 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMapType5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeReference_in_entryRuleDeclarationTypeReference5270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationTypeReference5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleDeclarationTypeReference5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_ruleDeclarationTypeReference5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleDeclarationTypeReference5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLiteral_in_ruleLiteral5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLiteral_in_entryRuleCharLiteral5680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLiteral5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_in_ruleCharLiteral5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleNumberLiteral5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6003 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleQualifiedName6022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6037 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard6085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard6143 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleQualifiedNameWithWildcard6162 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleQualifiedNameWithWildcard6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN6218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBOOLEAN6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBOOLEAN6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER6327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER6338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNUMBER6378 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46_in_ruleNUMBER6397 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER6442 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleNUMBER6460 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleComponentKind6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleComponentKind6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleComponentKind6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred1_InternalBehavior2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred2_InternalBehavior2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalBehavior2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred4_InternalBehavior3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_InternalBehavior3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred6_InternalBehavior3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred7_InternalBehavior4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred8_InternalBehavior4471 = new BitSet(new long[]{0x0000000000000002L});

}