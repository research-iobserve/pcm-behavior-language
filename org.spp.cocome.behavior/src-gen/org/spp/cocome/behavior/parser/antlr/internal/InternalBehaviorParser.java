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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_CHARACTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'repository'", "'import'", "'realize'", "'{'", "'post-construct'", "'pre-destroy'", "'}'", "'action'", "'var'", "'val'", "'const'", "'='", "'iface'", "'operation'", "'if'", "'('", "')'", "'else'", "'for'", "':'", "'['", "']'", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'instanceof'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'!'", "'as'", "'++'", "'--'", "'query'", "'new'", "'true'", "'false'", "'stateless'", "'stateful'", "'singleton'", "'store'", "'update'", "'delete'"
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
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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

            if ( ((LA2_0>=59 && LA2_0<=61)) ) {
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:736:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement | this_DataAccessStatement_3= ruleDataAccessStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_LoopStatement_2 = null;

        EObject this_DataAccessStatement_3 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:739:28: ( (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement | this_DataAccessStatement_3= ruleDataAccessStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:740:1: (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement | this_DataAccessStatement_3= ruleDataAccessStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:740:1: (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement | this_DataAccessStatement_3= ruleDataAccessStatement )
            int alt10=4;
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
            case 62:
            case 63:
            case 64:
                {
                alt10=4;
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
                case 4 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:771:5: this_DataAccessStatement_3= ruleDataAccessStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDataAccessStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataAccessStatement_in_ruleStatement1566);
                    this_DataAccessStatement_3=ruleDataAccessStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataAccessStatement_3; 
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:787:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:788:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:789:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement1601);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement1611); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:796:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:799:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:800:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:800:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:800:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleIfStatement1648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleIfStatement1660); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:808:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:809:1: (lv_expr_2_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:809:1: (lv_expr_2_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:810:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement1681);
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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleIfStatement1693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:830:1: ( (lv_ifStatement_4_0= ruleBlockStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:831:1: (lv_ifStatement_4_0= ruleBlockStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:831:1: (lv_ifStatement_4_0= ruleBlockStatement )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:832:3: lv_ifStatement_4_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfStatementBlockStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_ruleIfStatement1714);
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

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:848:2: (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:848:4: otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleIfStatement1727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:852:1: ( (lv_elseStatement_6_0= ruleBlockStatement ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:853:1: (lv_elseStatement_6_0= ruleBlockStatement )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:853:1: (lv_elseStatement_6_0= ruleBlockStatement )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:854:3: lv_elseStatement_6_0= ruleBlockStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementBlockStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockStatement_in_ruleIfStatement1748);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:878:1: entryRuleBlockStatement returns [EObject current=null] : iv_ruleBlockStatement= ruleBlockStatement EOF ;
    public final EObject entryRuleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:879:2: (iv_ruleBlockStatement= ruleBlockStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:880:2: iv_ruleBlockStatement= ruleBlockStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement1786);
            iv_ruleBlockStatement=ruleBlockStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockStatement1796); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:887:1: ruleBlockStatement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlockStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:890:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:891:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:891:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:891:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:891:2: ()
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:892:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockStatementAccess().getBlockStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleBlockStatement1842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:901:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==27||LA12_0==31||(LA12_0>=62 && LA12_0<=64)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:902:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:902:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:903:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockStatementAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleBlockStatement1863);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBlockStatement1876); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:931:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:932:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:933:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1912);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1922); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:940:1: ruleAssignment returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:943:28: ( ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:944:1: ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:944:1: ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:944:2: ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:944:2: ( (lv_variable_0_0= ruleVariableCall ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:945:1: (lv_variable_0_0= ruleVariableCall )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:945:1: (lv_variable_0_0= ruleVariableCall )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:946:3: lv_variable_0_0= ruleVariableCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableCallParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableCall_in_ruleAssignment1968);
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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAssignment1980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:966:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:967:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:967:1: (lv_expression_2_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:968:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment2001);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:992:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:993:2: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:994:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopStatementRule()); 
            }
            pushFollow(FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement2037);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopStatement2047); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1001:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1004:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1005:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1005:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1005:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleLoopStatement2084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleLoopStatement2096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1013:1: ( (lv_variable_2_0= ruleVariableDecl ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1014:1: (lv_variable_2_0= ruleVariableDecl )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1014:1: (lv_variable_2_0= ruleVariableDecl )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1015:3: lv_variable_2_0= ruleVariableDecl
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getVariableVariableDeclParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDecl_in_ruleLoopStatement2117);
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleLoopStatement2129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLoopStatementAccess().getColonKeyword_3());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1035:1: ( (lv_expression_4_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1036:1: (lv_expression_4_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1036:1: (lv_expression_4_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1037:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLoopStatement2150);
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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleLoopStatement2162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLoopStatementAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1057:1: ( (lv_statement_6_0= ruleBlockStatement ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1058:1: (lv_statement_6_0= ruleBlockStatement )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1058:1: (lv_statement_6_0= ruleBlockStatement )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1059:3: lv_statement_6_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementBlockStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_ruleLoopStatement2183);
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


    // $ANTLR start "entryRuleDataAccessStatement"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1083:1: entryRuleDataAccessStatement returns [EObject current=null] : iv_ruleDataAccessStatement= ruleDataAccessStatement EOF ;
    public final EObject entryRuleDataAccessStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccessStatement = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1084:2: (iv_ruleDataAccessStatement= ruleDataAccessStatement EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1085:2: iv_ruleDataAccessStatement= ruleDataAccessStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataAccessStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDataAccessStatement_in_entryRuleDataAccessStatement2219);
            iv_ruleDataAccessStatement=ruleDataAccessStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataAccessStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAccessStatement2229); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataAccessStatement"


    // $ANTLR start "ruleDataAccessStatement"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1092:1: ruleDataAccessStatement returns [EObject current=null] : ( ( (lv_operation_0_0= ruleDataAccessOperation ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDataAccessStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_operation_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1095:28: ( ( ( (lv_operation_0_0= ruleDataAccessOperation ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1096:1: ( ( (lv_operation_0_0= ruleDataAccessOperation ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1096:1: ( ( (lv_operation_0_0= ruleDataAccessOperation ) ) ( (otherlv_1= RULE_ID ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1096:2: ( (lv_operation_0_0= ruleDataAccessOperation ) ) ( (otherlv_1= RULE_ID ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1096:2: ( (lv_operation_0_0= ruleDataAccessOperation ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1097:1: (lv_operation_0_0= ruleDataAccessOperation )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1097:1: (lv_operation_0_0= ruleDataAccessOperation )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1098:3: lv_operation_0_0= ruleDataAccessOperation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataAccessStatementAccess().getOperationDataAccessOperationEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataAccessOperation_in_ruleDataAccessStatement2275);
            lv_operation_0_0=ruleDataAccessOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataAccessStatementRule());
              	        }
                     		set(
                     			current, 
                     			"operation",
                      		lv_operation_0_0, 
                      		"DataAccessOperation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1114:2: ( (otherlv_1= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1115:1: (otherlv_1= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1115:1: (otherlv_1= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1116:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDataAccessStatementRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccessStatement2295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getDataAccessStatementAccess().getVariableVariableDeclCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleDataAccessStatement"


    // $ANTLR start "entryRuleVariableCall"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1135:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1136:2: (iv_ruleVariableCall= ruleVariableCall EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1137:2: iv_ruleVariableCall= ruleVariableCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableCallRule()); 
            }
            pushFollow(FOLLOW_ruleVariableCall_in_entryRuleVariableCall2331);
            iv_ruleVariableCall=ruleVariableCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableCall2341); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1144:1: ruleVariableCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1147:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1148:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1148:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1148:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1148:2: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1149:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1149:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1150:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableCall2386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableCallAccess().getVariableVariableDeclCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1161:2: (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1161:4: otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleVariableCall2399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableCallAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1165:1: ( (lv_index_2_0= ruleExpression ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_CHARACTER)||(LA13_0>=45 && LA13_0<=46)||LA13_0==51||(LA13_0>=55 && LA13_0<=58)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1166:1: (lv_index_2_0= ruleExpression )
                            {
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1166:1: (lv_index_2_0= ruleExpression )
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1167:3: lv_index_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariableCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleVariableCall2420);
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

                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleVariableCall2433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getVariableCallAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1187:3: (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1187:5: otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleVariableCall2448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableCallAccess().getFullStopKeyword_2_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1191:1: ( (lv_subProperty_5_0= rulePropertyCall ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1192:1: (lv_subProperty_5_0= rulePropertyCall )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1192:1: (lv_subProperty_5_0= rulePropertyCall )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1193:3: lv_subProperty_5_0= rulePropertyCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyCall_in_ruleVariableCall2469);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1217:1: entryRulePropertyCall returns [EObject current=null] : iv_rulePropertyCall= rulePropertyCall EOF ;
    public final EObject entryRulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCall = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1218:2: (iv_rulePropertyCall= rulePropertyCall EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1219:2: iv_rulePropertyCall= rulePropertyCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyCallRule()); 
            }
            pushFollow(FOLLOW_rulePropertyCall_in_entryRulePropertyCall2507);
            iv_rulePropertyCall=rulePropertyCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyCall2517); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1226:1: rulePropertyCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1229:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1230:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1230:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1230:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1230:2: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1231:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1231:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1232:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyCall2562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPropertyCallAccess().getPropertyPropertyCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1243:2: (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1243:4: otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_rulePropertyCall2575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPropertyCallAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1247:1: ( (lv_index_2_0= ruleExpression ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_CHARACTER)||(LA16_0>=45 && LA16_0<=46)||LA16_0==51||(LA16_0>=55 && LA16_0<=58)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1248:1: (lv_index_2_0= ruleExpression )
                            {
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1248:1: (lv_index_2_0= ruleExpression )
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1249:3: lv_index_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPropertyCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePropertyCall2596);
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

                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_rulePropertyCall2609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyCallAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1269:3: (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1269:5: otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_rulePropertyCall2624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyCallAccess().getFullStopKeyword_2_0());
                          
                    }
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1273:1: ( (lv_subProperty_5_0= rulePropertyCall ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1274:1: (lv_subProperty_5_0= rulePropertyCall )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1274:1: (lv_subProperty_5_0= rulePropertyCall )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1275:3: lv_subProperty_5_0= rulePropertyCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyCall_in_rulePropertyCall2645);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1299:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1300:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1301:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2683);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2693); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1308:1: ruleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1311:28: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1312:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1312:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1313:5: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleExpression2740);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1321:1: ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) && (synpred1_InternalBehavior())) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1321:2: ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1321:2: ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1321:3: ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1328:6: ( () ( (lv_feature_2_0= '||' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1328:7: () ( (lv_feature_2_0= '||' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1328:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1329:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1334:2: ( (lv_feature_2_0= '||' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:1: (lv_feature_2_0= '||' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1335:1: (lv_feature_2_0= '||' )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1336:3: lv_feature_2_0= '||'
            	    {
            	    lv_feature_2_0=(Token)match(input,36,FOLLOW_36_in_ruleExpression2791); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1349:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1350:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1350:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1351:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleExpression2827);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1375:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1376:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1377:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression2865);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression2875); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1384:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1387:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1388:1: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1388:1: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1389:5: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2922);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1397:1: ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) && (synpred2_InternalBehavior())) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1397:2: ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1397:2: ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1397:3: ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1404:6: ( () ( (lv_feature_2_0= '&&' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1404:7: () ( (lv_feature_2_0= '&&' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1404:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1405:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1410:2: ( (lv_feature_2_0= '&&' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:1: (lv_feature_2_0= '&&' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1411:1: (lv_feature_2_0= '&&' )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1412:3: lv_feature_2_0= '&&'
            	    {
            	    lv_feature_2_0=(Token)match(input,37,FOLLOW_37_in_ruleAndExpression2973); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1425:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1426:1: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1426:1: (lv_right_3_0= ruleRelationalExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1427:3: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression3009);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1451:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1452:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1453:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3047);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression3057); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1460:1: ruleRelationalExpression returns [EObject current=null] : (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1463:28: ( (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1464:1: (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1464:1: (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1465:5: this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOtherExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOtherExpression_in_ruleRelationalExpression3104);
            this_OtherExpression_0=ruleOtherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OtherExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1473:1: ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )*
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
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1473:2: ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1473:2: ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1473:3: ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1498:6: ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1498:7: () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1498:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1499:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1504:2: ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1505:1: ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1505:1: ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1506:1: (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1506:1: (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' )
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1507:3: lv_feature_2_1= '=='
            	            {
            	            lv_feature_2_1=(Token)match(input,38,FOLLOW_38_in_ruleRelationalExpression3232); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1519:8: lv_feature_2_2= '!='
            	            {
            	            lv_feature_2_2=(Token)match(input,39,FOLLOW_39_in_ruleRelationalExpression3261); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1531:8: lv_feature_2_3= '>'
            	            {
            	            lv_feature_2_3=(Token)match(input,40,FOLLOW_40_in_ruleRelationalExpression3290); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1543:8: lv_feature_2_4= '<'
            	            {
            	            lv_feature_2_4=(Token)match(input,41,FOLLOW_41_in_ruleRelationalExpression3319); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1555:8: lv_feature_2_5= '>='
            	            {
            	            lv_feature_2_5=(Token)match(input,42,FOLLOW_42_in_ruleRelationalExpression3348); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1567:8: lv_feature_2_6= '<='
            	            {
            	            lv_feature_2_6=(Token)match(input,43,FOLLOW_43_in_ruleRelationalExpression3377); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1582:4: ( (lv_right_3_0= ruleOtherExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1583:1: (lv_right_3_0= ruleOtherExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1583:1: (lv_right_3_0= ruleOtherExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1584:3: lv_right_3_0= ruleOtherExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightOtherExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherExpression_in_ruleRelationalExpression3416);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1608:1: entryRuleOtherExpression returns [EObject current=null] : iv_ruleOtherExpression= ruleOtherExpression EOF ;
    public final EObject entryRuleOtherExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1609:2: (iv_ruleOtherExpression= ruleOtherExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1610:2: iv_ruleOtherExpression= ruleOtherExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOtherExpression_in_entryRuleOtherExpression3454);
            iv_ruleOtherExpression=ruleOtherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherExpression3464); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1617:1: ruleOtherExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? ) ;
    public final EObject ruleOtherExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1620:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1621:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1621:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1622:5: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOtherExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleOtherExpression3511);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1630:1: ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) && (synpred4_InternalBehavior())) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1630:2: ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1630:2: ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1630:3: ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1637:6: ( () ( (lv_feature_2_0= 'instanceof' ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1637:7: () ( (lv_feature_2_0= 'instanceof' ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1637:7: ()
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1638:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1643:2: ( (lv_feature_2_0= 'instanceof' ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:1: (lv_feature_2_0= 'instanceof' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1644:1: (lv_feature_2_0= 'instanceof' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1645:3: lv_feature_2_0= 'instanceof'
                    {
                    lv_feature_2_0=(Token)match(input,44,FOLLOW_44_in_ruleOtherExpression3562); if (state.failed) return current;
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

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1658:4: ( (lv_type_3_0= ruleTypeReference ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1659:1: (lv_type_3_0= ruleTypeReference )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1659:1: (lv_type_3_0= ruleTypeReference )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1660:3: lv_type_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOtherExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleOtherExpression3598);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1684:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1685:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1686:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3636);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression3646); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1693:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1696:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1697:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1697:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1698:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3693);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1706:1: ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
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
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1706:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1706:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1706:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1719:6: ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1719:7: () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1719:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1720:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1725:2: ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1726:1: ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1726:1: ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1727:1: (lv_feature_2_1= '+' | lv_feature_2_2= '-' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1727:1: (lv_feature_2_1= '+' | lv_feature_2_2= '-' )
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1728:3: lv_feature_2_1= '+'
            	            {
            	            lv_feature_2_1=(Token)match(input,45,FOLLOW_45_in_ruleAdditiveExpression3765); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1740:8: lv_feature_2_2= '-'
            	            {
            	            lv_feature_2_2=(Token)match(input,46,FOLLOW_46_in_ruleAdditiveExpression3794); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1755:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1756:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1756:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1757:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3833);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1781:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1782:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1783:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3871);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression3881); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1790:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
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
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1793:28: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1794:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1794:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1795:5: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression3928);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1803:1: ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
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
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1803:2: ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1803:2: ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1803:3: ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1822:6: ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1822:7: () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1822:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1823:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1828:2: ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1829:1: ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1829:1: ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1830:1: (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1830:1: (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' )
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1831:3: lv_feature_2_1= '*'
            	            {
            	            lv_feature_2_1=(Token)match(input,47,FOLLOW_47_in_ruleMultiplicativeExpression4028); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1843:8: lv_feature_2_2= '/'
            	            {
            	            lv_feature_2_2=(Token)match(input,48,FOLLOW_48_in_ruleMultiplicativeExpression4057); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1855:8: lv_feature_2_3= '%'
            	            {
            	            lv_feature_2_3=(Token)match(input,49,FOLLOW_49_in_ruleMultiplicativeExpression4086); if (state.failed) return current;
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
            	            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1867:8: lv_feature_2_4= '**'
            	            {
            	            lv_feature_2_4=(Token)match(input,50,FOLLOW_50_in_ruleMultiplicativeExpression4115); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1882:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1883:1: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1883:1: (lv_right_3_0= ruleUnaryOperation )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1884:3: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression4154);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1908:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1909:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1910:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation4192);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation4202); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1917:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_1_0=null;
        EObject lv_operand_2_0 = null;

        EObject this_CastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1920:28: ( ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1921:1: ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1921:1: ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_CHARACTER)||(LA28_0>=45 && LA28_0<=46)||(LA28_0>=55 && LA28_0<=58)) ) {
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1921:2: ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1921:2: ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1921:3: () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1921:3: ()
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1922:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnaryOperationAccess().getExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1927:2: ( (lv_feature_1_0= '!' ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1928:1: (lv_feature_1_0= '!' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1928:1: (lv_feature_1_0= '!' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1929:3: lv_feature_1_0= '!'
                    {
                    lv_feature_1_0=(Token)match(input,51,FOLLOW_51_in_ruleUnaryOperation4255); if (state.failed) return current;
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

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1942:2: ( (lv_operand_2_0= ruleUnaryOperation ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1943:1: (lv_operand_2_0= ruleUnaryOperation )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1943:1: (lv_operand_2_0= ruleUnaryOperation )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1944:3: lv_operand_2_0= ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperandUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleUnaryOperation4289);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1962:5: this_CastedExpression_3= ruleCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOperationAccess().getCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCastedExpression_in_ruleUnaryOperation4318);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1978:1: entryRuleCastedExpression returns [EObject current=null] : iv_ruleCastedExpression= ruleCastedExpression EOF ;
    public final EObject entryRuleCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastedExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1979:2: (iv_ruleCastedExpression= ruleCastedExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1980:2: iv_ruleCastedExpression= ruleCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCastedExpression_in_entryRuleCastedExpression4353);
            iv_ruleCastedExpression=ruleCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastedExpression4363); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1987:1: ruleCastedExpression returns [EObject current=null] : (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleCastedExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_PostfixOperation_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1990:28: ( (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1991:1: (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1991:1: (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1992:5: this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCastedExpressionAccess().getPostfixOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePostfixOperation_in_ruleCastedExpression4410);
            this_PostfixOperation_0=rulePostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PostfixOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2000:1: ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==52) && (synpred7_InternalBehavior())) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2000:2: ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2000:2: ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2000:3: ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2007:6: ( () ( (lv_feature_2_0= 'as' ) ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2007:7: () ( (lv_feature_2_0= 'as' ) )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2007:7: ()
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2008:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2013:2: ( (lv_feature_2_0= 'as' ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2014:1: (lv_feature_2_0= 'as' )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2014:1: (lv_feature_2_0= 'as' )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2015:3: lv_feature_2_0= 'as'
            	    {
            	    lv_feature_2_0=(Token)match(input,52,FOLLOW_52_in_ruleCastedExpression4461); if (state.failed) return current;
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

            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2028:4: ( (lv_type_3_0= ruleTypeReference ) )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2029:1: (lv_type_3_0= ruleTypeReference )
            	    {
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2029:1: (lv_type_3_0= ruleTypeReference )
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2030:3: lv_type_3_0= ruleTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCastedExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeReference_in_ruleCastedExpression4497);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2054:1: entryRulePostfixOperation returns [EObject current=null] : iv_rulePostfixOperation= rulePostfixOperation EOF ;
    public final EObject entryRulePostfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixOperation = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2055:2: (iv_rulePostfixOperation= rulePostfixOperation EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2056:2: iv_rulePostfixOperation= rulePostfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixOperationRule()); 
            }
            pushFollow(FOLLOW_rulePostfixOperation_in_entryRulePostfixOperation4535);
            iv_rulePostfixOperation=rulePostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixOperation4545); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2063:1: rulePostfixOperation returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? ) ;
    public final EObject rulePostfixOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_PrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2066:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2067:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2067:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2068:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPostfixOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rulePostfixOperation4592);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2076:1: ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )?
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2076:2: ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2089:6: ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2089:7: () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2089:7: ()
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2090:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2095:2: ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2096:1: ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2096:1: ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2097:1: (lv_feature_2_1= '++' | lv_feature_2_2= '--' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2097:1: (lv_feature_2_1= '++' | lv_feature_2_2= '--' )
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
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2098:3: lv_feature_2_1= '++'
                            {
                            lv_feature_2_1=(Token)match(input,53,FOLLOW_53_in_rulePostfixOperation4663); if (state.failed) return current;
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
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2110:8: lv_feature_2_2= '--'
                            {
                            lv_feature_2_2=(Token)match(input,54,FOLLOW_54_in_rulePostfixOperation4692); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2133:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2134:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2135:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4747);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4757); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2142:1: rulePrimaryExpression returns [EObject current=null] : (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_DataQuery_2= ruleDataQuery | this_Literal_3= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InstantiationExpression_0 = null;

        EObject this_VariableCall_1 = null;

        EObject this_DataQuery_2 = null;

        EObject this_Literal_3 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2145:28: ( (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_DataQuery_2= ruleDataQuery | this_Literal_3= ruleLiteral ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2146:1: (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_DataQuery_2= ruleDataQuery | this_Literal_3= ruleLiteral )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2146:1: (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_DataQuery_2= ruleDataQuery | this_Literal_3= ruleLiteral )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt32=1;
                }
                break;
            case RULE_ID:
                {
                alt32=2;
                }
                break;
            case 55:
                {
                alt32=3;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_CHARACTER:
            case 45:
            case 46:
            case 57:
            case 58:
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2147:5: this_InstantiationExpression_0= ruleInstantiationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInstantiationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstantiationExpression_in_rulePrimaryExpression4804);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2157:5: this_VariableCall_1= ruleVariableCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableCall_in_rulePrimaryExpression4831);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2167:5: this_DataQuery_2= ruleDataQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getDataQueryParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataQuery_in_rulePrimaryExpression4858);
                    this_DataQuery_2=ruleDataQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataQuery_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2177:5: this_Literal_3= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression4885);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_3; 
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


    // $ANTLR start "entryRuleDataQuery"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2193:1: entryRuleDataQuery returns [EObject current=null] : iv_ruleDataQuery= ruleDataQuery EOF ;
    public final EObject entryRuleDataQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataQuery = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2194:2: (iv_ruleDataQuery= ruleDataQuery EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2195:2: iv_ruleDataQuery= ruleDataQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataQueryRule()); 
            }
            pushFollow(FOLLOW_ruleDataQuery_in_entryRuleDataQuery4920);
            iv_ruleDataQuery=ruleDataQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataQuery4930); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataQuery"


    // $ANTLR start "ruleDataQuery"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2202:1: ruleDataQuery returns [EObject current=null] : (otherlv_0= 'query' ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_query_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDataQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_query_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2205:28: ( (otherlv_0= 'query' ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_query_2_0= RULE_STRING ) ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2206:1: (otherlv_0= 'query' ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_query_2_0= RULE_STRING ) ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2206:1: (otherlv_0= 'query' ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_query_2_0= RULE_STRING ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2206:3: otherlv_0= 'query' ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_query_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleDataQuery4967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataQueryAccess().getQueryKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2210:1: ( (lv_type_1_0= ruleDeclarationTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2211:1: (lv_type_1_0= ruleDeclarationTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2211:1: (lv_type_1_0= ruleDeclarationTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2212:3: lv_type_1_0= ruleDeclarationTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataQueryAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclarationTypeReference_in_ruleDataQuery4988);
            lv_type_1_0=ruleDeclarationTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataQueryRule());
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

            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2228:2: ( (lv_query_2_0= RULE_STRING ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2229:1: (lv_query_2_0= RULE_STRING )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2229:1: (lv_query_2_0= RULE_STRING )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2230:3: lv_query_2_0= RULE_STRING
            {
            lv_query_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataQuery5005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_query_2_0, grammarAccess.getDataQueryAccess().getQuerySTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDataQueryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"query",
                      		lv_query_2_0, 
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
    // $ANTLR end "ruleDataQuery"


    // $ANTLR start "entryRuleInstantiationExpression"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2254:1: entryRuleInstantiationExpression returns [EObject current=null] : iv_ruleInstantiationExpression= ruleInstantiationExpression EOF ;
    public final EObject entryRuleInstantiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiationExpression = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2255:2: (iv_ruleInstantiationExpression= ruleInstantiationExpression EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2256:2: iv_ruleInstantiationExpression= ruleInstantiationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstantiationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstantiationExpression_in_entryRuleInstantiationExpression5046);
            iv_ruleInstantiationExpression=ruleInstantiationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstantiationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationExpression5056); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2263:1: ruleInstantiationExpression returns [EObject current=null] : (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleInstantiationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_parameters_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2266:28: ( (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2267:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2267:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2267:3: otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleInstantiationExpression5093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstantiationExpressionAccess().getNewKeyword_0());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2271:1: ( (lv_type_1_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2272:1: (lv_type_1_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2272:1: (lv_type_1_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2273:3: lv_type_1_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstantiationExpressionAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleInstantiationExpression5114);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleInstantiationExpression5126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInstantiationExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2293:1: ( (lv_parameters_3_0= ruleExpression ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2294:1: (lv_parameters_3_0= ruleExpression )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2294:1: (lv_parameters_3_0= ruleExpression )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2295:3: lv_parameters_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstantiationExpressionAccess().getParametersExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInstantiationExpression5147);
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

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleInstantiationExpression5159); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDeclarationTypeReference"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2323:1: entryRuleDeclarationTypeReference returns [EObject current=null] : iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF ;
    public final EObject entryRuleDeclarationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationTypeReference = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2324:2: (iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2325:2: iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleDeclarationTypeReference_in_entryRuleDeclarationTypeReference5195);
            iv_ruleDeclarationTypeReference=ruleDeclarationTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationTypeReference5205); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2332:1: ruleDeclarationTypeReference returns [EObject current=null] : (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType ) ;
    public final EObject ruleDeclarationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_TypeReference_0 = null;

        EObject this_CollectionType_1 = null;

        EObject this_MapType_2 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2335:28: ( (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2336:1: (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2336:1: (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt33=3;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                    {
                    alt33=1;
                    }
                    break;
                case 33:
                    {
                    alt33=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2337:5: this_TypeReference_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleDeclarationTypeReference5252);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2347:5: this_CollectionType_1= ruleCollectionType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getCollectionTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionType_in_ruleDeclarationTypeReference5279);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2357:5: this_MapType_2= ruleMapType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMapType_in_ruleDeclarationTypeReference5306);
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


    // $ANTLR start "entryRuleTypeReference"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2373:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2374:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2375:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference5341);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference5351); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2382:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2385:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2386:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2386:1: ( (otherlv_0= RULE_ID ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2387:1: (otherlv_0= RULE_ID )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2387:1: (otherlv_0= RULE_ID )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2388:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeReference5395); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2407:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2408:2: (iv_ruleCollectionType= ruleCollectionType EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2409:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionType_in_entryRuleCollectionType5430);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType5440); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2416:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2419:28: ( ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2420:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2420:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2420:2: ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2420:2: ( (lv_reference_0_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2421:1: (lv_reference_0_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2421:1: (lv_reference_0_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2422:3: lv_reference_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleCollectionType5486);
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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleCollectionType5498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2442:1: ( (lv_size_2_0= RULE_INT ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2443:1: (lv_size_2_0= RULE_INT )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2443:1: (lv_size_2_0= RULE_INT )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2444:3: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCollectionType5515); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleCollectionType5533); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2472:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2473:2: (iv_ruleMapType= ruleMapType EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2474:2: iv_ruleMapType= ruleMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeRule()); 
            }
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType5569);
            iv_ruleMapType=ruleMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType5579); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2481:1: ruleMapType returns [EObject current=null] : ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;

        EObject lv_keyType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2484:28: ( ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2485:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2485:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2485:2: ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2485:2: ( (lv_reference_0_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2486:1: (lv_reference_0_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2486:1: (lv_reference_0_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2487:3: lv_reference_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleMapType5625);
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

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleMapType5637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2507:1: ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2507:2: ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>'
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2507:2: ( (lv_keyType_2_0= ruleTypeReference ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2508:1: (lv_keyType_2_0= ruleTypeReference )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2508:1: (lv_keyType_2_0= ruleTypeReference )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2509:3: lv_keyType_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeTypeReferenceParserRuleCall_2_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeReference_in_ruleMapType5659);
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

            otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleMapType5671); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLiteral"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2537:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2538:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2539:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5708);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5718); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2546:1: ruleLiteral returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteral_0 = null;

        EObject this_NumberLiteral_1 = null;

        EObject this_CharLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2549:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2550:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2550:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2551:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral5765);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2561:5: this_NumberLiteral_1= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral5792);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2571:5: this_CharLiteral_2= ruleCharLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCharLiteral_in_ruleLiteral5819);
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2581:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral5846);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2597:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2598:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2599:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5881);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral5891); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2606:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2609:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2610:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2610:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2611:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2611:1: (lv_value_0_0= RULE_STRING )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2612:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral5932); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2636:1: entryRuleCharLiteral returns [EObject current=null] : iv_ruleCharLiteral= ruleCharLiteral EOF ;
    public final EObject entryRuleCharLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2637:2: (iv_ruleCharLiteral= ruleCharLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2638:2: iv_ruleCharLiteral= ruleCharLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleCharLiteral_in_entryRuleCharLiteral5972);
            iv_ruleCharLiteral=ruleCharLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharLiteral5982); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2645:1: ruleCharLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_CHARACTER ) ) ;
    public final EObject ruleCharLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2648:28: ( ( (lv_value_0_0= RULE_CHARACTER ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2649:1: ( (lv_value_0_0= RULE_CHARACTER ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2649:1: ( (lv_value_0_0= RULE_CHARACTER ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2650:1: (lv_value_0_0= RULE_CHARACTER )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2650:1: (lv_value_0_0= RULE_CHARACTER )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2651:3: lv_value_0_0= RULE_CHARACTER
            {
            lv_value_0_0=(Token)match(input,RULE_CHARACTER,FOLLOW_RULE_CHARACTER_in_ruleCharLiteral6023); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2675:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2676:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2677:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6063);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral6073); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2684:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2687:28: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2688:1: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2688:1: ( (lv_value_0_0= ruleNUMBER ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2689:1: (lv_value_0_0= ruleNUMBER )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2689:1: (lv_value_0_0= ruleNUMBER )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2690:3: lv_value_0_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNUMBER_in_ruleNumberLiteral6118);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2714:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2715:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2716:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6153);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral6163); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2723:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2726:28: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2727:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2727:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2728:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2728:1: (lv_value_0_0= ruleBOOLEAN )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2729:3: lv_value_0_0= ruleBOOLEAN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral6208);
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2753:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2754:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2755:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6244);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName6255); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2762:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2765:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2766:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2766:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2766:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2773:1: (kw= '.' this_ID_2= RULE_ID )*
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
            	    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2774:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleQualifiedName6314); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName6329); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2794:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2795:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2796:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard6377);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard6388); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2803:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2806:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2807:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2807:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2808:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard6435);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2818:1: (kw= '.' kw= '*' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2819:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleQualifiedNameWithWildcard6454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleQualifiedNameWithWildcard6467); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2838:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2839:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2840:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEANRule()); 
            }
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN6510);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN6521); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2847:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2850:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2851:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2851:1: (kw= 'true' | kw= 'false' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            else if ( (LA38_0==58) ) {
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2852:2: kw= 'true'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleBOOLEAN6559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2859:2: kw= 'false'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleBOOLEAN6578); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2872:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2873:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2874:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER6619);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER6630); if (state.failed) return current;

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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2881:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2884:28: ( ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2885:1: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2885:1: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) )
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
                else if ( (LA40_2==EOF||LA40_2==RULE_ID||(LA40_2>=17 && LA40_2<=19)||(LA40_2>=21 && LA40_2<=23)||LA40_2==25||LA40_2==27||LA40_2==29||LA40_2==31||LA40_2==34||(LA40_2>=36 && LA40_2<=50)||(LA40_2>=52 && LA40_2<=54)||(LA40_2>=62 && LA40_2<=64)) ) {
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2885:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2885:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2885:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2885:3: (kw= '+' | kw= '-' )?
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
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2886:2: kw= '+'
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleNUMBER6670); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBERAccess().getPlusSignKeyword_0_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2893:2: kw= '-'
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleNUMBER6689); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER6706); if (state.failed) return current;
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2906:6: (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2906:6: (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2906:11: this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER6734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
                          
                    }
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleNUMBER6752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER6767); if (state.failed) return current;
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
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2934:1: ruleComponentKind returns [Enumerator current=null] : ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) ) ;
    public final Enumerator ruleComponentKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2936:28: ( ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2937:1: ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2937:1: ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt41=1;
                }
                break;
            case 60:
                {
                alt41=2;
                }
                break;
            case 61:
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
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2937:2: (enumLiteral_0= 'stateless' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2937:2: (enumLiteral_0= 'stateless' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2937:4: enumLiteral_0= 'stateless'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleComponentKind6827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComponentKindAccess().getSTATELESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComponentKindAccess().getSTATELESSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2943:6: (enumLiteral_1= 'stateful' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2943:6: (enumLiteral_1= 'stateful' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2943:8: enumLiteral_1= 'stateful'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleComponentKind6844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComponentKindAccess().getSTATEFULEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComponentKindAccess().getSTATEFULEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2949:6: (enumLiteral_2= 'singleton' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2949:6: (enumLiteral_2= 'singleton' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2949:8: enumLiteral_2= 'singleton'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleComponentKind6861); if (state.failed) return current;
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


    // $ANTLR start "ruleDataAccessOperation"
    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2959:1: ruleDataAccessOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'store' ) | (enumLiteral_1= 'update' ) | (enumLiteral_2= 'delete' ) ) ;
    public final Enumerator ruleDataAccessOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2961:28: ( ( (enumLiteral_0= 'store' ) | (enumLiteral_1= 'update' ) | (enumLiteral_2= 'delete' ) ) )
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2962:1: ( (enumLiteral_0= 'store' ) | (enumLiteral_1= 'update' ) | (enumLiteral_2= 'delete' ) )
            {
            // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2962:1: ( (enumLiteral_0= 'store' ) | (enumLiteral_1= 'update' ) | (enumLiteral_2= 'delete' ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt42=1;
                }
                break;
            case 63:
                {
                alt42=2;
                }
                break;
            case 64:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2962:2: (enumLiteral_0= 'store' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2962:2: (enumLiteral_0= 'store' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2962:4: enumLiteral_0= 'store'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleDataAccessOperation6906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDataAccessOperationAccess().getSTOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDataAccessOperationAccess().getSTOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2968:6: (enumLiteral_1= 'update' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2968:6: (enumLiteral_1= 'update' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2968:8: enumLiteral_1= 'update'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleDataAccessOperation6923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDataAccessOperationAccess().getUPDATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDataAccessOperationAccess().getUPDATEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2974:6: (enumLiteral_2= 'delete' )
                    {
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2974:6: (enumLiteral_2= 'delete' )
                    // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2974:8: enumLiteral_2= 'delete'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_64_in_ruleDataAccessOperation6940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDataAccessOperationAccess().getDELETEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDataAccessOperationAccess().getDELETEEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleDataAccessOperation"

    // $ANTLR start synpred1_InternalBehavior
    public final void synpred1_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1321:3: ( ( () ( ( '||' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1321:4: ( () ( ( '||' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1321:4: ( () ( ( '||' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1321:5: () ( ( '||' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1321:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1322:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1322:2: ( ( '||' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1323:1: ( '||' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1323:1: ( '||' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1324:2: '||'
        {
        match(input,36,FOLLOW_36_in_synpred1_InternalBehavior2760); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalBehavior

    // $ANTLR start synpred2_InternalBehavior
    public final void synpred2_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1397:3: ( ( () ( ( '&&' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1397:4: ( () ( ( '&&' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1397:4: ( () ( ( '&&' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1397:5: () ( ( '&&' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1397:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1398:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1398:2: ( ( '&&' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1399:1: ( '&&' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1399:1: ( '&&' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1400:2: '&&'
        {
        match(input,37,FOLLOW_37_in_synpred2_InternalBehavior2942); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalBehavior

    // $ANTLR start synpred3_InternalBehavior
    public final void synpred3_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1473:3: ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1473:4: ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1473:4: ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1473:5: () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1473:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1474:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1474:2: ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1475:1: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1475:1: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1476:1: ( '==' | '!=' | '>' | '<' | '>=' | '<=' )
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
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1630:3: ( ( () ( ( 'instanceof' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1630:4: ( () ( ( 'instanceof' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1630:4: ( () ( ( 'instanceof' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1630:5: () ( ( 'instanceof' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1630:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1631:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1631:2: ( ( 'instanceof' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1632:1: ( 'instanceof' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1632:1: ( 'instanceof' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1633:2: 'instanceof'
        {
        match(input,44,FOLLOW_44_in_synpred4_InternalBehavior3531); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalBehavior

    // $ANTLR start synpred5_InternalBehavior
    public final void synpred5_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1706:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1706:4: ( () ( ( ( '+' | '-' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1706:4: ( () ( ( ( '+' | '-' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1706:5: () ( ( ( '+' | '-' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1706:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1707:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1707:2: ( ( ( '+' | '-' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1708:1: ( ( '+' | '-' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1708:1: ( ( '+' | '-' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1709:1: ( '+' | '-' )
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
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1803:3: ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1803:4: ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1803:4: ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1803:5: () ( ( ( '*' | '/' | '%' | '**' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1803:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1804:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1804:2: ( ( ( '*' | '/' | '%' | '**' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1805:1: ( ( '*' | '/' | '%' | '**' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1805:1: ( ( '*' | '/' | '%' | '**' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:1806:1: ( '*' | '/' | '%' | '**' )
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
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2000:3: ( ( () ( ( 'as' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2000:4: ( () ( ( 'as' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2000:4: ( () ( ( 'as' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2000:5: () ( ( 'as' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2000:5: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2001:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2001:2: ( ( 'as' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2002:1: ( 'as' )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2002:1: ( 'as' )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2003:2: 'as'
        {
        match(input,52,FOLLOW_52_in_synpred7_InternalBehavior4430); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalBehavior

    // $ANTLR start synpred8_InternalBehavior
    public final void synpred8_InternalBehavior_fragment() throws RecognitionException {   
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2076:2: ( ( () ( ( ( '++' | '--' ) ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2076:3: ( () ( ( ( '++' | '--' ) ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2076:3: ( () ( ( ( '++' | '--' ) ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2076:4: () ( ( ( '++' | '--' ) ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2076:4: ()
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2077:1: 
        {
        }

        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2077:2: ( ( ( '++' | '--' ) ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2078:1: ( ( '++' | '--' ) )
        {
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2078:1: ( ( '++' | '--' ) )
        // ../org.spp.cocome.behavior/src-gen/org/spp/cocome/behavior/parser/antlr/internal/InternalBehavior.g:2079:1: ( '++' | '--' )
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
    public static final BitSet FOLLOW_15_in_ruleComponentImpl507 = new BitSet(new long[]{0x3800000000000020L});
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
    public static final BitSet FOLLOW_24_in_ruleConstantDecl1116 = new BitSet(new long[]{0x07886000000000F0L});
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
    public static final BitSet FOLLOW_ruleDataAccessStatement_in_ruleStatement1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement1601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIfStatement1648 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIfStatement1660 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement1681 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIfStatement1693 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleIfStatement1714 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleIfStatement1727 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleIfStatement1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement1786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockStatement1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBlockStatement1842 = new BitSet(new long[]{0xC000000088080020L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlockStatement1863 = new BitSet(new long[]{0xC000000088080020L,0x0000000000000001L});
    public static final BitSet FOLLOW_19_in_ruleBlockStatement1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCall_in_ruleAssignment1968 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssignment1980 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopStatement_in_entryRuleLoopStatement2037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopStatement2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLoopStatement2084 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLoopStatement2096 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleLoopStatement2117 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLoopStatement2129 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLoopStatement2150 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLoopStatement2162 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleLoopStatement2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAccessStatement_in_entryRuleDataAccessStatement2219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAccessStatement2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAccessOperation_in_ruleDataAccessStatement2275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccessStatement2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCall_in_entryRuleVariableCall2331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableCall2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableCall2386 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_33_in_ruleVariableCall2399 = new BitSet(new long[]{0x07886004000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableCall2420 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleVariableCall2433 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleVariableCall2448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyCall_in_ruleVariableCall2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyCall_in_entryRulePropertyCall2507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyCall2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyCall2562 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_33_in_rulePropertyCall2575 = new BitSet(new long[]{0x07886004000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyCall2596 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePropertyCall2609 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_rulePropertyCall2624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyCall_in_rulePropertyCall2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleExpression2740 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleExpression2791 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleExpression2827 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression2865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2922 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleAndExpression2973 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression3009 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherExpression_in_ruleRelationalExpression3104 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_38_in_ruleRelationalExpression3232 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_39_in_ruleRelationalExpression3261 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_40_in_ruleRelationalExpression3290 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_41_in_ruleRelationalExpression3319 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_42_in_ruleRelationalExpression3348 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_43_in_ruleRelationalExpression3377 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_ruleOtherExpression_in_ruleRelationalExpression3416 = new BitSet(new long[]{0x00000FC000000002L});
    public static final BitSet FOLLOW_ruleOtherExpression_in_entryRuleOtherExpression3454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherExpression3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleOtherExpression3511 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleOtherExpression3562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleOtherExpression3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3693 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleAdditiveExpression3765 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_46_in_ruleAdditiveExpression3794 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3833 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression3928 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_47_in_ruleMultiplicativeExpression4028 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_48_in_ruleMultiplicativeExpression4057 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_49_in_ruleMultiplicativeExpression4086 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_50_in_ruleMultiplicativeExpression4115 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleMultiplicativeExpression4154 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation4192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleUnaryOperation4255 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleUnaryOperation4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastedExpression_in_ruleUnaryOperation4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastedExpression_in_entryRuleCastedExpression4353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastedExpression4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperation_in_ruleCastedExpression4410 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCastedExpression4461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleCastedExpression4497 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperation_in_entryRulePostfixOperation4535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixOperation4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePostfixOperation4592 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_53_in_rulePostfixOperation4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePostfixOperation4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationExpression_in_rulePrimaryExpression4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCall_in_rulePrimaryExpression4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataQuery_in_rulePrimaryExpression4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataQuery_in_entryRuleDataQuery4920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataQuery4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDataQuery4967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclarationTypeReference_in_ruleDataQuery4988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataQuery5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationExpression_in_entryRuleInstantiationExpression5046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationExpression5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInstantiationExpression5093 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleInstantiationExpression5114 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInstantiationExpression5126 = new BitSet(new long[]{0x07886000000000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInstantiationExpression5147 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInstantiationExpression5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeReference_in_entryRuleDeclarationTypeReference5195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationTypeReference5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleDeclarationTypeReference5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_ruleDeclarationTypeReference5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleDeclarationTypeReference5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference5341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeReference5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_entryRuleCollectionType5430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleCollectionType5486 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCollectionType5498 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCollectionType5515 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCollectionType5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType5569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleMapType5625 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleMapType5637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleMapType5659 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMapType5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLiteral_in_ruleLiteral5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharLiteral_in_entryRuleCharLiteral5972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharLiteral5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_in_ruleCharLiteral6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral6063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleNumberLiteral6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral6153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6295 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleQualifiedName6314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6329 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard6377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard6435 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleQualifiedNameWithWildcard6454 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleQualifiedNameWithWildcard6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN6510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBOOLEAN6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBOOLEAN6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER6619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNUMBER6670 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46_in_ruleNUMBER6689 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER6734 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleNUMBER6752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER6767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleComponentKind6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleComponentKind6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleComponentKind6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDataAccessOperation6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDataAccessOperation6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDataAccessOperation6940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred1_InternalBehavior2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred2_InternalBehavior2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalBehavior3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred4_InternalBehavior3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_InternalBehavior3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred6_InternalBehavior3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred7_InternalBehavior4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred8_InternalBehavior4610 = new BitSet(new long[]{0x0000000000000002L});

}