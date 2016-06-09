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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_CHARACTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'repository'", "'import'", "'realize'", "'{'", "'post-construct'", "'pre-destroy'", "'}'", "'action'", "'var'", "'val'", "'const'", "'='", "'iface'", "'operation'", "'if'", "'('", "')'", "'else'", "'for'", "':'", "'return'", "'['", "']'", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'instanceof'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'!'", "'as'", "'++'", "'--'", "'query'", "','", "'new'", "'true'", "'false'", "'stateless'", "'stateful'", "'singleton'", "'store'", "'update'", "'delete'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    public String getGrammarFileName() { return "InternalBehavior.g"; }



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
    // InternalBehavior.g:68:1: entryRuleBehaviorModel returns [EObject current=null] : iv_ruleBehaviorModel= ruleBehaviorModel EOF ;
    public final EObject entryRuleBehaviorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorModel = null;


        try {
            // InternalBehavior.g:69:2: (iv_ruleBehaviorModel= ruleBehaviorModel EOF )
            // InternalBehavior.g:70:2: iv_ruleBehaviorModel= ruleBehaviorModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviorModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorModel=ruleBehaviorModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehaviorModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:77:1: ruleBehaviorModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) ) ;
    public final EObject ruleBehaviorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_repositories_3_0 = null;

        EObject lv_componentImpl_4_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:80:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) ) )
            // InternalBehavior.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) )
            {
            // InternalBehavior.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) ) )
            // InternalBehavior.g:81:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )* ( (lv_componentImpl_4_0= ruleComponentImpl ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBehaviorModelAccess().getPackageKeyword_0());
                  
            }
            // InternalBehavior.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalBehavior.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalBehavior.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // InternalBehavior.g:87:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBehaviorModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
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
                      		"org.spp.cocome.behavior.Behavior.QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalBehavior.g:103:2: ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_repositories_3_0= ruleRepositoryReference ) ) )*
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
            	    // InternalBehavior.g:103:3: ( (lv_imports_2_0= ruleImport ) )
            	    {
            	    // InternalBehavior.g:103:3: ( (lv_imports_2_0= ruleImport ) )
            	    // InternalBehavior.g:104:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalBehavior.g:104:1: (lv_imports_2_0= ruleImport )
            	    // InternalBehavior.g:105:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBehaviorModelAccess().getImportsImportParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
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
            	              		"org.spp.cocome.behavior.Behavior.Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBehavior.g:122:6: ( (lv_repositories_3_0= ruleRepositoryReference ) )
            	    {
            	    // InternalBehavior.g:122:6: ( (lv_repositories_3_0= ruleRepositoryReference ) )
            	    // InternalBehavior.g:123:1: (lv_repositories_3_0= ruleRepositoryReference )
            	    {
            	    // InternalBehavior.g:123:1: (lv_repositories_3_0= ruleRepositoryReference )
            	    // InternalBehavior.g:124:3: lv_repositories_3_0= ruleRepositoryReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBehaviorModelAccess().getRepositoriesRepositoryReferenceParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
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
            	              		"org.spp.cocome.behavior.Behavior.RepositoryReference");
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

            // InternalBehavior.g:140:4: ( (lv_componentImpl_4_0= ruleComponentImpl ) )
            // InternalBehavior.g:141:1: (lv_componentImpl_4_0= ruleComponentImpl )
            {
            // InternalBehavior.g:141:1: (lv_componentImpl_4_0= ruleComponentImpl )
            // InternalBehavior.g:142:3: lv_componentImpl_4_0= ruleComponentImpl
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBehaviorModelAccess().getComponentImplComponentImplParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.spp.cocome.behavior.Behavior.ComponentImpl");
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
    // InternalBehavior.g:166:1: entryRuleRepositoryReference returns [EObject current=null] : iv_ruleRepositoryReference= ruleRepositoryReference EOF ;
    public final EObject entryRuleRepositoryReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryReference = null;


        try {
            // InternalBehavior.g:167:2: (iv_ruleRepositoryReference= ruleRepositoryReference EOF )
            // InternalBehavior.g:168:2: iv_ruleRepositoryReference= ruleRepositoryReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepositoryReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRepositoryReference=ruleRepositoryReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepositoryReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:175:1: ruleRepositoryReference returns [EObject current=null] : (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRepositoryReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_reference_1_0=null;

         enterRule(); 
            
        try {
            // InternalBehavior.g:178:28: ( (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) ) )
            // InternalBehavior.g:179:1: (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) )
            {
            // InternalBehavior.g:179:1: (otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) ) )
            // InternalBehavior.g:179:3: otherlv_0= 'repository' ( (lv_reference_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRepositoryReferenceAccess().getRepositoryKeyword_0());
                  
            }
            // InternalBehavior.g:183:1: ( (lv_reference_1_0= RULE_STRING ) )
            // InternalBehavior.g:184:1: (lv_reference_1_0= RULE_STRING )
            {
            // InternalBehavior.g:184:1: (lv_reference_1_0= RULE_STRING )
            // InternalBehavior.g:185:3: lv_reference_1_0= RULE_STRING
            {
            lv_reference_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // InternalBehavior.g:209:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBehavior.g:210:2: (iv_ruleImport= ruleImport EOF )
            // InternalBehavior.g:211:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:218:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:221:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalBehavior.g:222:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalBehavior.g:222:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalBehavior.g:222:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // InternalBehavior.g:226:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalBehavior.g:227:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalBehavior.g:227:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalBehavior.g:228:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.spp.cocome.behavior.Behavior.QualifiedNameWithWildcard");
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
    // InternalBehavior.g:252:1: entryRuleComponentImpl returns [EObject current=null] : iv_ruleComponentImpl= ruleComponentImpl EOF ;
    public final EObject entryRuleComponentImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImpl = null;


        try {
            // InternalBehavior.g:253:2: (iv_ruleComponentImpl= ruleComponentImpl EOF )
            // InternalBehavior.g:254:2: iv_ruleComponentImpl= ruleComponentImpl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentImplRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponentImpl=ruleComponentImpl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentImpl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:261:1: ruleComponentImpl returns [EObject current=null] : (otherlv_0= 'realize' ( (lv_kind_1_0= ruleComponentKind ) )? ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )* (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )? (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )? ( (lv_interfaces_9_0= ruleInterfaceRealization ) )* otherlv_10= '}' ) ;
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
            // InternalBehavior.g:264:28: ( (otherlv_0= 'realize' ( (lv_kind_1_0= ruleComponentKind ) )? ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )* (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )? (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )? ( (lv_interfaces_9_0= ruleInterfaceRealization ) )* otherlv_10= '}' ) )
            // InternalBehavior.g:265:1: (otherlv_0= 'realize' ( (lv_kind_1_0= ruleComponentKind ) )? ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )* (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )? (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )? ( (lv_interfaces_9_0= ruleInterfaceRealization ) )* otherlv_10= '}' )
            {
            // InternalBehavior.g:265:1: (otherlv_0= 'realize' ( (lv_kind_1_0= ruleComponentKind ) )? ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )* (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )? (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )? ( (lv_interfaces_9_0= ruleInterfaceRealization ) )* otherlv_10= '}' )
            // InternalBehavior.g:265:3: otherlv_0= 'realize' ( (lv_kind_1_0= ruleComponentKind ) )? ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )* (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )? (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )? ( (lv_interfaces_9_0= ruleInterfaceRealization ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentImplAccess().getRealizeKeyword_0());
                  
            }
            // InternalBehavior.g:269:1: ( (lv_kind_1_0= ruleComponentKind ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=61 && LA2_0<=63)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBehavior.g:270:1: (lv_kind_1_0= ruleComponentKind )
                    {
                    // InternalBehavior.g:270:1: (lv_kind_1_0= ruleComponentKind )
                    // InternalBehavior.g:271:3: lv_kind_1_0= ruleComponentKind
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentImplAccess().getKindComponentKindEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_3);
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
                              		"org.spp.cocome.behavior.Behavior.ComponentKind");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalBehavior.g:287:3: ( ( ruleQualifiedName ) )
            // InternalBehavior.g:288:1: ( ruleQualifiedName )
            {
            // InternalBehavior.g:288:1: ( ruleQualifiedName )
            // InternalBehavior.g:289:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentImplRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentImplAccess().getRefComponentComponentCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComponentImplAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalBehavior.g:306:1: ( ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBehavior.g:307:1: ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) )
            	    {
            	    // InternalBehavior.g:307:1: ( (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl ) )
            	    // InternalBehavior.g:308:1: (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl )
            	    {
            	    // InternalBehavior.g:308:1: (lv_localDeclarations_4_1= ruleVariableDecl | lv_localDeclarations_4_2= ruleConstantDecl )
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
            	            // InternalBehavior.g:309:3: lv_localDeclarations_4_1= ruleVariableDecl
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentImplAccess().getLocalDeclarationsVariableDeclParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_8);
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
            	                      		"org.spp.cocome.behavior.Behavior.VariableDecl");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBehavior.g:324:8: lv_localDeclarations_4_2= ruleConstantDecl
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComponentImplAccess().getLocalDeclarationsConstantDeclParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_8);
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
            	                      		"org.spp.cocome.behavior.Behavior.ConstantDecl");
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

            // InternalBehavior.g:342:3: (otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBehavior.g:342:5: otherlv_5= 'post-construct' ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getComponentImplAccess().getPostConstructKeyword_5_0());
                          
                    }
                    // InternalBehavior.g:346:1: ( (lv_postConstruct_6_0= ruleLifeCycleMethod ) )
                    // InternalBehavior.g:347:1: (lv_postConstruct_6_0= ruleLifeCycleMethod )
                    {
                    // InternalBehavior.g:347:1: (lv_postConstruct_6_0= ruleLifeCycleMethod )
                    // InternalBehavior.g:348:3: lv_postConstruct_6_0= ruleLifeCycleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentImplAccess().getPostConstructLifeCycleMethodParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_10);
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
                              		"org.spp.cocome.behavior.Behavior.LifeCycleMethod");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalBehavior.g:364:4: (otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBehavior.g:364:6: otherlv_7= 'pre-destroy' ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getComponentImplAccess().getPreDestroyKeyword_6_0());
                          
                    }
                    // InternalBehavior.g:368:1: ( (lv_preDestroy_8_0= ruleLifeCycleMethod ) )
                    // InternalBehavior.g:369:1: (lv_preDestroy_8_0= ruleLifeCycleMethod )
                    {
                    // InternalBehavior.g:369:1: (lv_preDestroy_8_0= ruleLifeCycleMethod )
                    // InternalBehavior.g:370:3: lv_preDestroy_8_0= ruleLifeCycleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComponentImplAccess().getPreDestroyLifeCycleMethodParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
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
                              		"org.spp.cocome.behavior.Behavior.LifeCycleMethod");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalBehavior.g:386:4: ( (lv_interfaces_9_0= ruleInterfaceRealization ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBehavior.g:387:1: (lv_interfaces_9_0= ruleInterfaceRealization )
            	    {
            	    // InternalBehavior.g:387:1: (lv_interfaces_9_0= ruleInterfaceRealization )
            	    // InternalBehavior.g:388:3: lv_interfaces_9_0= ruleInterfaceRealization
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComponentImplAccess().getInterfacesInterfaceRealizationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_11);
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
            	              		"org.spp.cocome.behavior.Behavior.InterfaceRealization");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:416:1: entryRuleLifeCycleMethod returns [EObject current=null] : iv_ruleLifeCycleMethod= ruleLifeCycleMethod EOF ;
    public final EObject entryRuleLifeCycleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLifeCycleMethod = null;


        try {
            // InternalBehavior.g:417:2: (iv_ruleLifeCycleMethod= ruleLifeCycleMethod EOF )
            // InternalBehavior.g:418:2: iv_ruleLifeCycleMethod= ruleLifeCycleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLifeCycleMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLifeCycleMethod=ruleLifeCycleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLifeCycleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:425:1: ruleLifeCycleMethod returns [EObject current=null] : (otherlv_0= 'action' ( (lv_body_1_0= ruleBlockStatement ) ) ) ;
    public final EObject ruleLifeCycleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:428:28: ( (otherlv_0= 'action' ( (lv_body_1_0= ruleBlockStatement ) ) ) )
            // InternalBehavior.g:429:1: (otherlv_0= 'action' ( (lv_body_1_0= ruleBlockStatement ) ) )
            {
            // InternalBehavior.g:429:1: (otherlv_0= 'action' ( (lv_body_1_0= ruleBlockStatement ) ) )
            // InternalBehavior.g:429:3: otherlv_0= 'action' ( (lv_body_1_0= ruleBlockStatement ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLifeCycleMethodAccess().getActionKeyword_0());
                  
            }
            // InternalBehavior.g:433:1: ( (lv_body_1_0= ruleBlockStatement ) )
            // InternalBehavior.g:434:1: (lv_body_1_0= ruleBlockStatement )
            {
            // InternalBehavior.g:434:1: (lv_body_1_0= ruleBlockStatement )
            // InternalBehavior.g:435:3: lv_body_1_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLifeCycleMethodAccess().getBodyBlockStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.spp.cocome.behavior.Behavior.BlockStatement");
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
    // InternalBehavior.g:461:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalBehavior.g:462:2: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalBehavior.g:463:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDecl=ruleVariableDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:470:1: ruleVariableDecl returns [EObject current=null] : ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token lv_modifier_0_1=null;
        Token lv_modifier_0_2=null;
        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:473:28: ( ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalBehavior.g:474:1: ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalBehavior.g:474:1: ( ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalBehavior.g:474:2: ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) ) ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalBehavior.g:474:2: ( ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) ) )
            // InternalBehavior.g:475:1: ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) )
            {
            // InternalBehavior.g:475:1: ( (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' ) )
            // InternalBehavior.g:476:1: (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' )
            {
            // InternalBehavior.g:476:1: (lv_modifier_0_1= 'var' | lv_modifier_0_2= 'val' )
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
                    // InternalBehavior.g:477:3: lv_modifier_0_1= 'var'
                    {
                    lv_modifier_0_1=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
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
                    // InternalBehavior.g:489:8: lv_modifier_0_2= 'val'
                    {
                    lv_modifier_0_2=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
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

            // InternalBehavior.g:504:2: ( (lv_type_1_0= ruleDeclarationTypeReference ) )
            // InternalBehavior.g:505:1: (lv_type_1_0= ruleDeclarationTypeReference )
            {
            // InternalBehavior.g:505:1: (lv_type_1_0= ruleDeclarationTypeReference )
            // InternalBehavior.g:506:3: lv_type_1_0= ruleDeclarationTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_3);
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
                      		"org.spp.cocome.behavior.Behavior.DeclarationTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalBehavior.g:522:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalBehavior.g:523:1: (lv_name_2_0= RULE_ID )
            {
            // InternalBehavior.g:523:1: (lv_name_2_0= RULE_ID )
            // InternalBehavior.g:524:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
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
    // InternalBehavior.g:548:1: entryRuleConstantDecl returns [EObject current=null] : iv_ruleConstantDecl= ruleConstantDecl EOF ;
    public final EObject entryRuleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDecl = null;


        try {
            // InternalBehavior.g:549:2: (iv_ruleConstantDecl= ruleConstantDecl EOF )
            // InternalBehavior.g:550:2: iv_ruleConstantDecl= ruleConstantDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstantDecl=ruleConstantDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:557:1: ruleConstantDecl returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleConstantDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:560:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // InternalBehavior.g:561:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // InternalBehavior.g:561:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // InternalBehavior.g:561:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDeclAccess().getConstKeyword_0());
                  
            }
            // InternalBehavior.g:565:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalBehavior.g:566:1: (lv_name_1_0= RULE_ID )
            {
            // InternalBehavior.g:566:1: (lv_name_1_0= RULE_ID )
            // InternalBehavior.g:567:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantDeclAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalBehavior.g:587:1: ( (lv_value_3_0= ruleExpression ) )
            // InternalBehavior.g:588:1: (lv_value_3_0= ruleExpression )
            {
            // InternalBehavior.g:588:1: (lv_value_3_0= ruleExpression )
            // InternalBehavior.g:589:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.spp.cocome.behavior.Behavior.Expression");
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
    // InternalBehavior.g:613:1: entryRuleInterfaceRealization returns [EObject current=null] : iv_ruleInterfaceRealization= ruleInterfaceRealization EOF ;
    public final EObject entryRuleInterfaceRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceRealization = null;


        try {
            // InternalBehavior.g:614:2: (iv_ruleInterfaceRealization= ruleInterfaceRealization EOF )
            // InternalBehavior.g:615:2: iv_ruleInterfaceRealization= ruleInterfaceRealization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRealizationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceRealization=ruleInterfaceRealization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceRealization; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:622:1: ruleInterfaceRealization returns [EObject current=null] : (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* ) ;
    public final EObject ruleInterfaceRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_methods_2_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:625:28: ( (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* ) )
            // InternalBehavior.g:626:1: (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* )
            {
            // InternalBehavior.g:626:1: (otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )* )
            // InternalBehavior.g:626:3: otherlv_0= 'iface' ( ( ruleQualifiedName ) ) ( (lv_methods_2_0= ruleMethodImpl ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInterfaceRealizationAccess().getIfaceKeyword_0());
                  
            }
            // InternalBehavior.g:630:1: ( ( ruleQualifiedName ) )
            // InternalBehavior.g:631:1: ( ruleQualifiedName )
            {
            // InternalBehavior.g:631:1: ( ruleQualifiedName )
            // InternalBehavior.g:632:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInterfaceRealizationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceRealizationAccess().getRefInterfaceInterfaceCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalBehavior.g:645:2: ( (lv_methods_2_0= ruleMethodImpl ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBehavior.g:646:1: (lv_methods_2_0= ruleMethodImpl )
            	    {
            	    // InternalBehavior.g:646:1: (lv_methods_2_0= ruleMethodImpl )
            	    // InternalBehavior.g:647:3: lv_methods_2_0= ruleMethodImpl
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceRealizationAccess().getMethodsMethodImplParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_14);
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
            	              		"org.spp.cocome.behavior.Behavior.MethodImpl");
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
    // InternalBehavior.g:671:1: entryRuleMethodImpl returns [EObject current=null] : iv_ruleMethodImpl= ruleMethodImpl EOF ;
    public final EObject entryRuleMethodImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodImpl = null;


        try {
            // InternalBehavior.g:672:2: (iv_ruleMethodImpl= ruleMethodImpl EOF )
            // InternalBehavior.g:673:2: iv_ruleMethodImpl= ruleMethodImpl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodImplRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodImpl=ruleMethodImpl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodImpl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:680:1: ruleMethodImpl returns [EObject current=null] : (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) ) ;
    public final EObject ruleMethodImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:683:28: ( (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) ) )
            // InternalBehavior.g:684:1: (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) )
            {
            // InternalBehavior.g:684:1: (otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) ) )
            // InternalBehavior.g:684:3: otherlv_0= 'operation' ( ( ruleQualifiedName ) ) ( (lv_body_2_0= ruleBlockStatement ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMethodImplAccess().getOperationKeyword_0());
                  
            }
            // InternalBehavior.g:688:1: ( ( ruleQualifiedName ) )
            // InternalBehavior.g:689:1: ( ruleQualifiedName )
            {
            // InternalBehavior.g:689:1: ( ruleQualifiedName )
            // InternalBehavior.g:690:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodImplRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodImplAccess().getRefMethodMethodDeclCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalBehavior.g:703:2: ( (lv_body_2_0= ruleBlockStatement ) )
            // InternalBehavior.g:704:1: (lv_body_2_0= ruleBlockStatement )
            {
            // InternalBehavior.g:704:1: (lv_body_2_0= ruleBlockStatement )
            // InternalBehavior.g:705:3: lv_body_2_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodImplAccess().getBodyBlockStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.spp.cocome.behavior.Behavior.BlockStatement");
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
    // InternalBehavior.g:729:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalBehavior.g:730:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalBehavior.g:731:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:738:1: ruleStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement | this_DataAccessStatement_3= ruleDataAccessStatement | this_ReturnStatement_4= ruleReturnStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_LoopStatement_2 = null;

        EObject this_DataAccessStatement_3 = null;

        EObject this_ReturnStatement_4 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:741:28: ( (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement | this_DataAccessStatement_3= ruleDataAccessStatement | this_ReturnStatement_4= ruleReturnStatement ) )
            // InternalBehavior.g:742:1: (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement | this_DataAccessStatement_3= ruleDataAccessStatement | this_ReturnStatement_4= ruleReturnStatement )
            {
            // InternalBehavior.g:742:1: (this_IfStatement_0= ruleIfStatement | this_Assignment_1= ruleAssignment | this_LoopStatement_2= ruleLoopStatement | this_DataAccessStatement_3= ruleDataAccessStatement | this_ReturnStatement_4= ruleReturnStatement )
            int alt10=5;
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
            case 64:
            case 65:
            case 66:
                {
                alt10=4;
                }
                break;
            case 33:
                {
                alt10=5;
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
                    // InternalBehavior.g:743:5: this_IfStatement_0= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:753:5: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:763:5: this_LoopStatement_2= ruleLoopStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:773:5: this_DataAccessStatement_3= ruleDataAccessStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDataAccessStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_DataAccessStatement_3=ruleDataAccessStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataAccessStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalBehavior.g:783:5: this_ReturnStatement_4= ruleReturnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ReturnStatement_4=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnStatement_4; 
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
    // InternalBehavior.g:799:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalBehavior.g:800:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalBehavior.g:801:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:808:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? ) ;
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
            // InternalBehavior.g:811:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? ) )
            // InternalBehavior.g:812:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? )
            {
            // InternalBehavior.g:812:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )? )
            // InternalBehavior.g:812:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifStatement_4_0= ruleBlockStatement ) ) (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalBehavior.g:820:1: ( (lv_expr_2_0= ruleExpression ) )
            // InternalBehavior.g:821:1: (lv_expr_2_0= ruleExpression )
            {
            // InternalBehavior.g:821:1: (lv_expr_2_0= ruleExpression )
            // InternalBehavior.g:822:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_16);
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
                      		"org.spp.cocome.behavior.Behavior.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalBehavior.g:842:1: ( (lv_ifStatement_4_0= ruleBlockStatement ) )
            // InternalBehavior.g:843:1: (lv_ifStatement_4_0= ruleBlockStatement )
            {
            // InternalBehavior.g:843:1: (lv_ifStatement_4_0= ruleBlockStatement )
            // InternalBehavior.g:844:3: lv_ifStatement_4_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfStatementBlockStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
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
                      		"org.spp.cocome.behavior.Behavior.BlockStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalBehavior.g:860:2: (otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBehavior.g:860:4: otherlv_5= 'else' ( (lv_elseStatement_6_0= ruleBlockStatement ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }
                    // InternalBehavior.g:864:1: ( (lv_elseStatement_6_0= ruleBlockStatement ) )
                    // InternalBehavior.g:865:1: (lv_elseStatement_6_0= ruleBlockStatement )
                    {
                    // InternalBehavior.g:865:1: (lv_elseStatement_6_0= ruleBlockStatement )
                    // InternalBehavior.g:866:3: lv_elseStatement_6_0= ruleBlockStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementBlockStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"org.spp.cocome.behavior.Behavior.BlockStatement");
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
    // InternalBehavior.g:890:1: entryRuleBlockStatement returns [EObject current=null] : iv_ruleBlockStatement= ruleBlockStatement EOF ;
    public final EObject entryRuleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockStatement = null;


        try {
            // InternalBehavior.g:891:2: (iv_ruleBlockStatement= ruleBlockStatement EOF )
            // InternalBehavior.g:892:2: iv_ruleBlockStatement= ruleBlockStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlockStatement=ruleBlockStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:899:1: ruleBlockStatement returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlockStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:902:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalBehavior.g:903:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalBehavior.g:903:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalBehavior.g:903:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalBehavior.g:903:2: ()
            // InternalBehavior.g:904:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockStatementAccess().getBlockStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockStatementAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalBehavior.g:913:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==27||LA12_0==31||LA12_0==33||(LA12_0>=64 && LA12_0<=66)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBehavior.g:914:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalBehavior.g:914:1: (lv_statements_2_0= ruleStatement )
            	    // InternalBehavior.g:915:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockStatementAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_18);
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
            	              		"org.spp.cocome.behavior.Behavior.Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:943:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalBehavior.g:944:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalBehavior.g:945:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:952:1: ruleAssignment returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:955:28: ( ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalBehavior.g:956:1: ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalBehavior.g:956:1: ( ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalBehavior.g:956:2: ( (lv_variable_0_0= ruleVariableCall ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalBehavior.g:956:2: ( (lv_variable_0_0= ruleVariableCall ) )
            // InternalBehavior.g:957:1: (lv_variable_0_0= ruleVariableCall )
            {
            // InternalBehavior.g:957:1: (lv_variable_0_0= ruleVariableCall )
            // InternalBehavior.g:958:3: lv_variable_0_0= ruleVariableCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableCallParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_12);
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
                      		"org.spp.cocome.behavior.Behavior.VariableCall");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalBehavior.g:978:1: ( (lv_expression_2_0= ruleExpression ) )
            // InternalBehavior.g:979:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalBehavior.g:979:1: (lv_expression_2_0= ruleExpression )
            // InternalBehavior.g:980:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.spp.cocome.behavior.Behavior.Expression");
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
    // InternalBehavior.g:1004:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalBehavior.g:1005:2: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalBehavior.g:1006:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1013:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) ) ;
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
            // InternalBehavior.g:1016:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) ) )
            // InternalBehavior.g:1017:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) )
            {
            // InternalBehavior.g:1017:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) ) )
            // InternalBehavior.g:1017:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_variable_2_0= ruleVariableDecl ) ) otherlv_3= ':' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ')' ( (lv_statement_6_0= ruleBlockStatement ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalBehavior.g:1025:1: ( (lv_variable_2_0= ruleVariableDecl ) )
            // InternalBehavior.g:1026:1: (lv_variable_2_0= ruleVariableDecl )
            {
            // InternalBehavior.g:1026:1: (lv_variable_2_0= ruleVariableDecl )
            // InternalBehavior.g:1027:3: lv_variable_2_0= ruleVariableDecl
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getVariableVariableDeclParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_20);
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
                      		"org.spp.cocome.behavior.Behavior.VariableDecl");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLoopStatementAccess().getColonKeyword_3());
                  
            }
            // InternalBehavior.g:1047:1: ( (lv_expression_4_0= ruleExpression ) )
            // InternalBehavior.g:1048:1: (lv_expression_4_0= ruleExpression )
            {
            // InternalBehavior.g:1048:1: (lv_expression_4_0= ruleExpression )
            // InternalBehavior.g:1049:3: lv_expression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_16);
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
                      		"org.spp.cocome.behavior.Behavior.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLoopStatementAccess().getRightParenthesisKeyword_5());
                  
            }
            // InternalBehavior.g:1069:1: ( (lv_statement_6_0= ruleBlockStatement ) )
            // InternalBehavior.g:1070:1: (lv_statement_6_0= ruleBlockStatement )
            {
            // InternalBehavior.g:1070:1: (lv_statement_6_0= ruleBlockStatement )
            // InternalBehavior.g:1071:3: lv_statement_6_0= ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementBlockStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.spp.cocome.behavior.Behavior.BlockStatement");
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
    // InternalBehavior.g:1095:1: entryRuleDataAccessStatement returns [EObject current=null] : iv_ruleDataAccessStatement= ruleDataAccessStatement EOF ;
    public final EObject entryRuleDataAccessStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccessStatement = null;


        try {
            // InternalBehavior.g:1096:2: (iv_ruleDataAccessStatement= ruleDataAccessStatement EOF )
            // InternalBehavior.g:1097:2: iv_ruleDataAccessStatement= ruleDataAccessStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataAccessStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataAccessStatement=ruleDataAccessStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataAccessStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1104:1: ruleDataAccessStatement returns [EObject current=null] : ( ( (lv_operation_0_0= ruleDataAccessOperation ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDataAccessStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_operation_0_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:1107:28: ( ( ( (lv_operation_0_0= ruleDataAccessOperation ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBehavior.g:1108:1: ( ( (lv_operation_0_0= ruleDataAccessOperation ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBehavior.g:1108:1: ( ( (lv_operation_0_0= ruleDataAccessOperation ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalBehavior.g:1108:2: ( (lv_operation_0_0= ruleDataAccessOperation ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalBehavior.g:1108:2: ( (lv_operation_0_0= ruleDataAccessOperation ) )
            // InternalBehavior.g:1109:1: (lv_operation_0_0= ruleDataAccessOperation )
            {
            // InternalBehavior.g:1109:1: (lv_operation_0_0= ruleDataAccessOperation )
            // InternalBehavior.g:1110:3: lv_operation_0_0= ruleDataAccessOperation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataAccessStatementAccess().getOperationDataAccessOperationEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_3);
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
                      		"org.spp.cocome.behavior.Behavior.DataAccessOperation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalBehavior.g:1126:2: ( (otherlv_1= RULE_ID ) )
            // InternalBehavior.g:1127:1: (otherlv_1= RULE_ID )
            {
            // InternalBehavior.g:1127:1: (otherlv_1= RULE_ID )
            // InternalBehavior.g:1128:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDataAccessStatementRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleReturnStatement"
    // InternalBehavior.g:1147:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalBehavior.g:1148:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalBehavior.g:1149:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalBehavior.g:1156:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:1159:28: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalBehavior.g:1160:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalBehavior.g:1160:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalBehavior.g:1160:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
                  
            }
            // InternalBehavior.g:1164:1: ( (lv_expression_1_0= ruleExpression ) )
            // InternalBehavior.g:1165:1: (lv_expression_1_0= ruleExpression )
            {
            // InternalBehavior.g:1165:1: (lv_expression_1_0= ruleExpression )
            // InternalBehavior.g:1166:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"org.spp.cocome.behavior.Behavior.Expression");
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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleVariableCall"
    // InternalBehavior.g:1190:1: entryRuleVariableCall returns [EObject current=null] : iv_ruleVariableCall= ruleVariableCall EOF ;
    public final EObject entryRuleVariableCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCall = null;


        try {
            // InternalBehavior.g:1191:2: (iv_ruleVariableCall= ruleVariableCall EOF )
            // InternalBehavior.g:1192:2: iv_ruleVariableCall= ruleVariableCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableCall=ruleVariableCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1199:1: ruleVariableCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) ;
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
            // InternalBehavior.g:1202:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) )
            // InternalBehavior.g:1203:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            {
            // InternalBehavior.g:1203:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            // InternalBehavior.g:1203:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            {
            // InternalBehavior.g:1203:2: ( (otherlv_0= RULE_ID ) )
            // InternalBehavior.g:1204:1: (otherlv_0= RULE_ID )
            {
            // InternalBehavior.g:1204:1: (otherlv_0= RULE_ID )
            // InternalBehavior.g:1205:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableCallAccess().getVariableVariableDeclCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalBehavior.g:1216:2: (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBehavior.g:1216:4: otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVariableCallAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // InternalBehavior.g:1220:1: ( (lv_index_2_0= ruleExpression ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_CHARACTER)||(LA13_0>=46 && LA13_0<=47)||LA13_0==52||LA13_0==56||(LA13_0>=58 && LA13_0<=60)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalBehavior.g:1221:1: (lv_index_2_0= ruleExpression )
                            {
                            // InternalBehavior.g:1221:1: (lv_index_2_0= ruleExpression )
                            // InternalBehavior.g:1222:3: lv_index_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVariableCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_23);
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
                                      		"org.spp.cocome.behavior.Behavior.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getVariableCallAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // InternalBehavior.g:1242:3: (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBehavior.g:1242:5: otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariableCallAccess().getFullStopKeyword_2_0());
                          
                    }
                    // InternalBehavior.g:1246:1: ( (lv_subProperty_5_0= rulePropertyCall ) )
                    // InternalBehavior.g:1247:1: (lv_subProperty_5_0= rulePropertyCall )
                    {
                    // InternalBehavior.g:1247:1: (lv_subProperty_5_0= rulePropertyCall )
                    // InternalBehavior.g:1248:3: lv_subProperty_5_0= rulePropertyCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"org.spp.cocome.behavior.Behavior.PropertyCall");
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
    // InternalBehavior.g:1272:1: entryRulePropertyCall returns [EObject current=null] : iv_rulePropertyCall= rulePropertyCall EOF ;
    public final EObject entryRulePropertyCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyCall = null;


        try {
            // InternalBehavior.g:1273:2: (iv_rulePropertyCall= rulePropertyCall EOF )
            // InternalBehavior.g:1274:2: iv_rulePropertyCall= rulePropertyCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyCall=rulePropertyCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1281:1: rulePropertyCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) ;
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
            // InternalBehavior.g:1284:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? ) )
            // InternalBehavior.g:1285:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            {
            // InternalBehavior.g:1285:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )? )
            // InternalBehavior.g:1285:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )? (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            {
            // InternalBehavior.g:1285:2: ( (otherlv_0= RULE_ID ) )
            // InternalBehavior.g:1286:1: (otherlv_0= RULE_ID )
            {
            // InternalBehavior.g:1286:1: (otherlv_0= RULE_ID )
            // InternalBehavior.g:1287:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyCallRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPropertyCallAccess().getPropertyPropertyCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalBehavior.g:1298:2: (otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBehavior.g:1298:4: otherlv_1= '[' ( (lv_index_2_0= ruleExpression ) )? otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPropertyCallAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // InternalBehavior.g:1302:1: ( (lv_index_2_0= ruleExpression ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_CHARACTER)||(LA16_0>=46 && LA16_0<=47)||LA16_0==52||LA16_0==56||(LA16_0>=58 && LA16_0<=60)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalBehavior.g:1303:1: (lv_index_2_0= ruleExpression )
                            {
                            // InternalBehavior.g:1303:1: (lv_index_2_0= ruleExpression )
                            // InternalBehavior.g:1304:3: lv_index_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPropertyCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_23);
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
                                      		"org.spp.cocome.behavior.Behavior.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPropertyCallAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // InternalBehavior.g:1324:3: (otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBehavior.g:1324:5: otherlv_4= '.' ( (lv_subProperty_5_0= rulePropertyCall ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyCallAccess().getFullStopKeyword_2_0());
                          
                    }
                    // InternalBehavior.g:1328:1: ( (lv_subProperty_5_0= rulePropertyCall ) )
                    // InternalBehavior.g:1329:1: (lv_subProperty_5_0= rulePropertyCall )
                    {
                    // InternalBehavior.g:1329:1: (lv_subProperty_5_0= rulePropertyCall )
                    // InternalBehavior.g:1330:3: lv_subProperty_5_0= rulePropertyCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"org.spp.cocome.behavior.Behavior.PropertyCall");
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
    // InternalBehavior.g:1354:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalBehavior.g:1355:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalBehavior.g:1356:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1363:1: ruleExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:1366:28: ( (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalBehavior.g:1367:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalBehavior.g:1367:1: (this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalBehavior.g:1368:5: this_AndExpression_0= ruleAndExpression ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_25);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBehavior.g:1376:1: ( ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) && (synpred1_InternalBehavior())) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBehavior.g:1376:2: ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalBehavior.g:1376:2: ( ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) ) )
            	    // InternalBehavior.g:1376:3: ( ( () ( ( '||' ) ) ) )=> ( () ( (lv_feature_2_0= '||' ) ) )
            	    {
            	    // InternalBehavior.g:1383:6: ( () ( (lv_feature_2_0= '||' ) ) )
            	    // InternalBehavior.g:1383:7: () ( (lv_feature_2_0= '||' ) )
            	    {
            	    // InternalBehavior.g:1383:7: ()
            	    // InternalBehavior.g:1384:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBehavior.g:1389:2: ( (lv_feature_2_0= '||' ) )
            	    // InternalBehavior.g:1390:1: (lv_feature_2_0= '||' )
            	    {
            	    // InternalBehavior.g:1390:1: (lv_feature_2_0= '||' )
            	    // InternalBehavior.g:1391:3: lv_feature_2_0= '||'
            	    {
            	    lv_feature_2_0=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
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

            	    // InternalBehavior.g:1404:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalBehavior.g:1405:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalBehavior.g:1405:1: (lv_right_3_0= ruleAndExpression )
            	    // InternalBehavior.g:1406:3: lv_right_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_25);
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
            	              		"org.spp.cocome.behavior.Behavior.AndExpression");
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
    // InternalBehavior.g:1430:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalBehavior.g:1431:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalBehavior.g:1432:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1439:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:1442:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalBehavior.g:1443:1: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalBehavior.g:1443:1: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalBehavior.g:1444:5: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_26);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBehavior.g:1452:1: ( ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) && (synpred2_InternalBehavior())) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBehavior.g:1452:2: ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalBehavior.g:1452:2: ( ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) ) )
            	    // InternalBehavior.g:1452:3: ( ( () ( ( '&&' ) ) ) )=> ( () ( (lv_feature_2_0= '&&' ) ) )
            	    {
            	    // InternalBehavior.g:1459:6: ( () ( (lv_feature_2_0= '&&' ) ) )
            	    // InternalBehavior.g:1459:7: () ( (lv_feature_2_0= '&&' ) )
            	    {
            	    // InternalBehavior.g:1459:7: ()
            	    // InternalBehavior.g:1460:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBehavior.g:1465:2: ( (lv_feature_2_0= '&&' ) )
            	    // InternalBehavior.g:1466:1: (lv_feature_2_0= '&&' )
            	    {
            	    // InternalBehavior.g:1466:1: (lv_feature_2_0= '&&' )
            	    // InternalBehavior.g:1467:3: lv_feature_2_0= '&&'
            	    {
            	    lv_feature_2_0=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
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

            	    // InternalBehavior.g:1480:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalBehavior.g:1481:1: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalBehavior.g:1481:1: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalBehavior.g:1482:3: lv_right_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
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
            	              		"org.spp.cocome.behavior.Behavior.RelationalExpression");
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
    // InternalBehavior.g:1506:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalBehavior.g:1507:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalBehavior.g:1508:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1515:1: ruleRelationalExpression returns [EObject current=null] : (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* ) ;
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
            // InternalBehavior.g:1518:28: ( (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* ) )
            // InternalBehavior.g:1519:1: (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* )
            {
            // InternalBehavior.g:1519:1: (this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )* )
            // InternalBehavior.g:1520:5: this_OtherExpression_0= ruleOtherExpression ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOtherExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_27);
            this_OtherExpression_0=ruleOtherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OtherExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBehavior.g:1528:1: ( ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) && (synpred3_InternalBehavior())) {
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
                else if ( (LA22_0==44) && (synpred3_InternalBehavior())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBehavior.g:1528:2: ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) ) ( (lv_right_3_0= ruleOtherExpression ) )
            	    {
            	    // InternalBehavior.g:1528:2: ( ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) ) )
            	    // InternalBehavior.g:1528:3: ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) )
            	    {
            	    // InternalBehavior.g:1553:6: ( () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) ) )
            	    // InternalBehavior.g:1553:7: () ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) )
            	    {
            	    // InternalBehavior.g:1553:7: ()
            	    // InternalBehavior.g:1554:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBehavior.g:1559:2: ( ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) ) )
            	    // InternalBehavior.g:1560:1: ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) )
            	    {
            	    // InternalBehavior.g:1560:1: ( (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' ) )
            	    // InternalBehavior.g:1561:1: (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' )
            	    {
            	    // InternalBehavior.g:1561:1: (lv_feature_2_1= '==' | lv_feature_2_2= '!=' | lv_feature_2_3= '>' | lv_feature_2_4= '<' | lv_feature_2_5= '>=' | lv_feature_2_6= '<=' )
            	    int alt21=6;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt21=5;
            	        }
            	        break;
            	    case 44:
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
            	            // InternalBehavior.g:1562:3: lv_feature_2_1= '=='
            	            {
            	            lv_feature_2_1=(Token)match(input,39,FOLLOW_13); if (state.failed) return current;
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
            	            // InternalBehavior.g:1574:8: lv_feature_2_2= '!='
            	            {
            	            lv_feature_2_2=(Token)match(input,40,FOLLOW_13); if (state.failed) return current;
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
            	            // InternalBehavior.g:1586:8: lv_feature_2_3= '>'
            	            {
            	            lv_feature_2_3=(Token)match(input,41,FOLLOW_13); if (state.failed) return current;
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
            	            // InternalBehavior.g:1598:8: lv_feature_2_4= '<'
            	            {
            	            lv_feature_2_4=(Token)match(input,42,FOLLOW_13); if (state.failed) return current;
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
            	            // InternalBehavior.g:1610:8: lv_feature_2_5= '>='
            	            {
            	            lv_feature_2_5=(Token)match(input,43,FOLLOW_13); if (state.failed) return current;
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
            	            // InternalBehavior.g:1622:8: lv_feature_2_6= '<='
            	            {
            	            lv_feature_2_6=(Token)match(input,44,FOLLOW_13); if (state.failed) return current;
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

            	    // InternalBehavior.g:1637:4: ( (lv_right_3_0= ruleOtherExpression ) )
            	    // InternalBehavior.g:1638:1: (lv_right_3_0= ruleOtherExpression )
            	    {
            	    // InternalBehavior.g:1638:1: (lv_right_3_0= ruleOtherExpression )
            	    // InternalBehavior.g:1639:3: lv_right_3_0= ruleOtherExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightOtherExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
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
            	              		"org.spp.cocome.behavior.Behavior.OtherExpression");
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
    // InternalBehavior.g:1663:1: entryRuleOtherExpression returns [EObject current=null] : iv_ruleOtherExpression= ruleOtherExpression EOF ;
    public final EObject entryRuleOtherExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherExpression = null;


        try {
            // InternalBehavior.g:1664:2: (iv_ruleOtherExpression= ruleOtherExpression EOF )
            // InternalBehavior.g:1665:2: iv_ruleOtherExpression= ruleOtherExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOtherExpression=ruleOtherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1672:1: ruleOtherExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? ) ;
    public final EObject ruleOtherExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:1675:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? ) )
            // InternalBehavior.g:1676:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? )
            {
            // InternalBehavior.g:1676:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )? )
            // InternalBehavior.g:1677:5: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOtherExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_28);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBehavior.g:1685:1: ( ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) && (synpred4_InternalBehavior())) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBehavior.g:1685:2: ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) )
                    {
                    // InternalBehavior.g:1685:2: ( ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) ) )
                    // InternalBehavior.g:1685:3: ( ( () ( ( 'instanceof' ) ) ) )=> ( () ( (lv_feature_2_0= 'instanceof' ) ) )
                    {
                    // InternalBehavior.g:1692:6: ( () ( (lv_feature_2_0= 'instanceof' ) ) )
                    // InternalBehavior.g:1692:7: () ( (lv_feature_2_0= 'instanceof' ) )
                    {
                    // InternalBehavior.g:1692:7: ()
                    // InternalBehavior.g:1693:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalBehavior.g:1698:2: ( (lv_feature_2_0= 'instanceof' ) )
                    // InternalBehavior.g:1699:1: (lv_feature_2_0= 'instanceof' )
                    {
                    // InternalBehavior.g:1699:1: (lv_feature_2_0= 'instanceof' )
                    // InternalBehavior.g:1700:3: lv_feature_2_0= 'instanceof'
                    {
                    lv_feature_2_0=(Token)match(input,45,FOLLOW_3); if (state.failed) return current;
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

                    // InternalBehavior.g:1713:4: ( (lv_type_3_0= ruleTypeReference ) )
                    // InternalBehavior.g:1714:1: (lv_type_3_0= ruleTypeReference )
                    {
                    // InternalBehavior.g:1714:1: (lv_type_3_0= ruleTypeReference )
                    // InternalBehavior.g:1715:3: lv_type_3_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOtherExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"org.spp.cocome.behavior.Behavior.TypeReference");
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
    // InternalBehavior.g:1739:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalBehavior.g:1740:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalBehavior.g:1741:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1748:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:1751:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalBehavior.g:1752:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalBehavior.g:1752:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalBehavior.g:1753:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_29);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBehavior.g:1761:1: ( ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) && (synpred5_InternalBehavior())) {
                    alt25=1;
                }
                else if ( (LA25_0==47) && (synpred5_InternalBehavior())) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBehavior.g:1761:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalBehavior.g:1761:2: ( ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) ) )
            	    // InternalBehavior.g:1761:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) )
            	    {
            	    // InternalBehavior.g:1774:6: ( () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) ) )
            	    // InternalBehavior.g:1774:7: () ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) )
            	    {
            	    // InternalBehavior.g:1774:7: ()
            	    // InternalBehavior.g:1775:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBehavior.g:1780:2: ( ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) ) )
            	    // InternalBehavior.g:1781:1: ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) )
            	    {
            	    // InternalBehavior.g:1781:1: ( (lv_feature_2_1= '+' | lv_feature_2_2= '-' ) )
            	    // InternalBehavior.g:1782:1: (lv_feature_2_1= '+' | lv_feature_2_2= '-' )
            	    {
            	    // InternalBehavior.g:1782:1: (lv_feature_2_1= '+' | lv_feature_2_2= '-' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==46) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==47) ) {
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
            	            // InternalBehavior.g:1783:3: lv_feature_2_1= '+'
            	            {
            	            lv_feature_2_1=(Token)match(input,46,FOLLOW_13); if (state.failed) return current;
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
            	            // InternalBehavior.g:1795:8: lv_feature_2_2= '-'
            	            {
            	            lv_feature_2_2=(Token)match(input,47,FOLLOW_13); if (state.failed) return current;
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

            	    // InternalBehavior.g:1810:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalBehavior.g:1811:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalBehavior.g:1811:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalBehavior.g:1812:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_29);
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
            	              		"org.spp.cocome.behavior.Behavior.MultiplicativeExpression");
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
    // InternalBehavior.g:1836:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalBehavior.g:1837:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalBehavior.g:1838:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1845:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) ;
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
            // InternalBehavior.g:1848:28: ( (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* ) )
            // InternalBehavior.g:1849:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            {
            // InternalBehavior.g:1849:1: (this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )* )
            // InternalBehavior.g:1850:5: this_UnaryOperation_0= ruleUnaryOperation ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_30);
            this_UnaryOperation_0=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBehavior.g:1858:1: ( ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==48) && (synpred6_InternalBehavior())) {
                    alt27=1;
                }
                else if ( (LA27_0==49) && (synpred6_InternalBehavior())) {
                    alt27=1;
                }
                else if ( (LA27_0==50) && (synpred6_InternalBehavior())) {
                    alt27=1;
                }
                else if ( (LA27_0==51) && (synpred6_InternalBehavior())) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBehavior.g:1858:2: ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) ) ( (lv_right_3_0= ruleUnaryOperation ) )
            	    {
            	    // InternalBehavior.g:1858:2: ( ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) ) )
            	    // InternalBehavior.g:1858:3: ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) )
            	    {
            	    // InternalBehavior.g:1877:6: ( () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) ) )
            	    // InternalBehavior.g:1877:7: () ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) )
            	    {
            	    // InternalBehavior.g:1877:7: ()
            	    // InternalBehavior.g:1878:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBehavior.g:1883:2: ( ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) ) )
            	    // InternalBehavior.g:1884:1: ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) )
            	    {
            	    // InternalBehavior.g:1884:1: ( (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' ) )
            	    // InternalBehavior.g:1885:1: (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' )
            	    {
            	    // InternalBehavior.g:1885:1: (lv_feature_2_1= '*' | lv_feature_2_2= '/' | lv_feature_2_3= '%' | lv_feature_2_4= '**' )
            	    int alt26=4;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case 51:
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
            	            // InternalBehavior.g:1886:3: lv_feature_2_1= '*'
            	            {
            	            lv_feature_2_1=(Token)match(input,48,FOLLOW_13); if (state.failed) return current;
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
            	            // InternalBehavior.g:1898:8: lv_feature_2_2= '/'
            	            {
            	            lv_feature_2_2=(Token)match(input,49,FOLLOW_13); if (state.failed) return current;
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
            	            // InternalBehavior.g:1910:8: lv_feature_2_3= '%'
            	            {
            	            lv_feature_2_3=(Token)match(input,50,FOLLOW_13); if (state.failed) return current;
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
            	            // InternalBehavior.g:1922:8: lv_feature_2_4= '**'
            	            {
            	            lv_feature_2_4=(Token)match(input,51,FOLLOW_13); if (state.failed) return current;
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

            	    // InternalBehavior.g:1937:4: ( (lv_right_3_0= ruleUnaryOperation ) )
            	    // InternalBehavior.g:1938:1: (lv_right_3_0= ruleUnaryOperation )
            	    {
            	    // InternalBehavior.g:1938:1: (lv_right_3_0= ruleUnaryOperation )
            	    // InternalBehavior.g:1939:3: lv_right_3_0= ruleUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"org.spp.cocome.behavior.Behavior.UnaryOperation");
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
    // InternalBehavior.g:1963:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // InternalBehavior.g:1964:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // InternalBehavior.g:1965:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:1972:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_1_0=null;
        EObject lv_operand_2_0 = null;

        EObject this_CastedExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:1975:28: ( ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression ) )
            // InternalBehavior.g:1976:1: ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression )
            {
            // InternalBehavior.g:1976:1: ( ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) ) | this_CastedExpression_3= ruleCastedExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_CHARACTER)||(LA28_0>=46 && LA28_0<=47)||LA28_0==56||(LA28_0>=58 && LA28_0<=60)) ) {
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
                    // InternalBehavior.g:1976:2: ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    {
                    // InternalBehavior.g:1976:2: ( () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) ) )
                    // InternalBehavior.g:1976:3: () ( (lv_feature_1_0= '!' ) ) ( (lv_operand_2_0= ruleUnaryOperation ) )
                    {
                    // InternalBehavior.g:1976:3: ()
                    // InternalBehavior.g:1977:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnaryOperationAccess().getExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalBehavior.g:1982:2: ( (lv_feature_1_0= '!' ) )
                    // InternalBehavior.g:1983:1: (lv_feature_1_0= '!' )
                    {
                    // InternalBehavior.g:1983:1: (lv_feature_1_0= '!' )
                    // InternalBehavior.g:1984:3: lv_feature_1_0= '!'
                    {
                    lv_feature_1_0=(Token)match(input,52,FOLLOW_13); if (state.failed) return current;
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

                    // InternalBehavior.g:1997:2: ( (lv_operand_2_0= ruleUnaryOperation ) )
                    // InternalBehavior.g:1998:1: (lv_operand_2_0= ruleUnaryOperation )
                    {
                    // InternalBehavior.g:1998:1: (lv_operand_2_0= ruleUnaryOperation )
                    // InternalBehavior.g:1999:3: lv_operand_2_0= ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperandUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"org.spp.cocome.behavior.Behavior.UnaryOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:2017:5: this_CastedExpression_3= ruleCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOperationAccess().getCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalBehavior.g:2033:1: entryRuleCastedExpression returns [EObject current=null] : iv_ruleCastedExpression= ruleCastedExpression EOF ;
    public final EObject entryRuleCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastedExpression = null;


        try {
            // InternalBehavior.g:2034:2: (iv_ruleCastedExpression= ruleCastedExpression EOF )
            // InternalBehavior.g:2035:2: iv_ruleCastedExpression= ruleCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCastedExpression=ruleCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2042:1: ruleCastedExpression returns [EObject current=null] : (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleCastedExpression() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_0=null;
        EObject this_PostfixOperation_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2045:28: ( (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* ) )
            // InternalBehavior.g:2046:1: (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* )
            {
            // InternalBehavior.g:2046:1: (this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )* )
            // InternalBehavior.g:2047:5: this_PostfixOperation_0= rulePostfixOperation ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCastedExpressionAccess().getPostfixOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_31);
            this_PostfixOperation_0=rulePostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PostfixOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBehavior.g:2055:1: ( ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==53) && (synpred7_InternalBehavior())) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBehavior.g:2055:2: ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) ) ( (lv_type_3_0= ruleTypeReference ) )
            	    {
            	    // InternalBehavior.g:2055:2: ( ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) ) )
            	    // InternalBehavior.g:2055:3: ( ( () ( ( 'as' ) ) ) )=> ( () ( (lv_feature_2_0= 'as' ) ) )
            	    {
            	    // InternalBehavior.g:2062:6: ( () ( (lv_feature_2_0= 'as' ) ) )
            	    // InternalBehavior.g:2062:7: () ( (lv_feature_2_0= 'as' ) )
            	    {
            	    // InternalBehavior.g:2062:7: ()
            	    // InternalBehavior.g:2063:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalBehavior.g:2068:2: ( (lv_feature_2_0= 'as' ) )
            	    // InternalBehavior.g:2069:1: (lv_feature_2_0= 'as' )
            	    {
            	    // InternalBehavior.g:2069:1: (lv_feature_2_0= 'as' )
            	    // InternalBehavior.g:2070:3: lv_feature_2_0= 'as'
            	    {
            	    lv_feature_2_0=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
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

            	    // InternalBehavior.g:2083:4: ( (lv_type_3_0= ruleTypeReference ) )
            	    // InternalBehavior.g:2084:1: (lv_type_3_0= ruleTypeReference )
            	    {
            	    // InternalBehavior.g:2084:1: (lv_type_3_0= ruleTypeReference )
            	    // InternalBehavior.g:2085:3: lv_type_3_0= ruleTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCastedExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_31);
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
            	              		"org.spp.cocome.behavior.Behavior.TypeReference");
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
    // InternalBehavior.g:2109:1: entryRulePostfixOperation returns [EObject current=null] : iv_rulePostfixOperation= rulePostfixOperation EOF ;
    public final EObject entryRulePostfixOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixOperation = null;


        try {
            // InternalBehavior.g:2110:2: (iv_rulePostfixOperation= rulePostfixOperation EOF )
            // InternalBehavior.g:2111:2: iv_rulePostfixOperation= rulePostfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostfixOperation=rulePostfixOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2118:1: rulePostfixOperation returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? ) ;
    public final EObject rulePostfixOperation() throws RecognitionException {
        EObject current = null;

        Token lv_feature_2_1=null;
        Token lv_feature_2_2=null;
        EObject this_PrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2121:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? ) )
            // InternalBehavior.g:2122:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? )
            {
            // InternalBehavior.g:2122:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )? )
            // InternalBehavior.g:2123:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPostfixOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_32);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBehavior.g:2131:1: ( ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) && (synpred8_InternalBehavior())) {
                alt31=1;
            }
            else if ( (LA31_0==55) && (synpred8_InternalBehavior())) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBehavior.g:2131:2: ( ( () ( ( ( '++' | '--' ) ) ) ) )=> ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) )
                    {
                    // InternalBehavior.g:2144:6: ( () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) ) )
                    // InternalBehavior.g:2144:7: () ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) )
                    {
                    // InternalBehavior.g:2144:7: ()
                    // InternalBehavior.g:2145:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalBehavior.g:2150:2: ( ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) ) )
                    // InternalBehavior.g:2151:1: ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) )
                    {
                    // InternalBehavior.g:2151:1: ( (lv_feature_2_1= '++' | lv_feature_2_2= '--' ) )
                    // InternalBehavior.g:2152:1: (lv_feature_2_1= '++' | lv_feature_2_2= '--' )
                    {
                    // InternalBehavior.g:2152:1: (lv_feature_2_1= '++' | lv_feature_2_2= '--' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==54) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==55) ) {
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
                            // InternalBehavior.g:2153:3: lv_feature_2_1= '++'
                            {
                            lv_feature_2_1=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
                            // InternalBehavior.g:2165:8: lv_feature_2_2= '--'
                            {
                            lv_feature_2_2=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:2188:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalBehavior.g:2189:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalBehavior.g:2190:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2197:1: rulePrimaryExpression returns [EObject current=null] : (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_DataQuery_2= ruleDataQuery | this_Literal_3= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InstantiationExpression_0 = null;

        EObject this_VariableCall_1 = null;

        EObject this_DataQuery_2 = null;

        EObject this_Literal_3 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2200:28: ( (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_DataQuery_2= ruleDataQuery | this_Literal_3= ruleLiteral ) )
            // InternalBehavior.g:2201:1: (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_DataQuery_2= ruleDataQuery | this_Literal_3= ruleLiteral )
            {
            // InternalBehavior.g:2201:1: (this_InstantiationExpression_0= ruleInstantiationExpression | this_VariableCall_1= ruleVariableCall | this_DataQuery_2= ruleDataQuery | this_Literal_3= ruleLiteral )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt32=1;
                }
                break;
            case RULE_ID:
                {
                alt32=2;
                }
                break;
            case 56:
                {
                alt32=3;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_CHARACTER:
            case 46:
            case 47:
            case 59:
            case 60:
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
                    // InternalBehavior.g:2202:5: this_InstantiationExpression_0= ruleInstantiationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInstantiationExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:2212:5: this_VariableCall_1= ruleVariableCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:2222:5: this_DataQuery_2= ruleDataQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getDataQueryParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:2232:5: this_Literal_3= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalBehavior.g:2248:1: entryRuleDataQuery returns [EObject current=null] : iv_ruleDataQuery= ruleDataQuery EOF ;
    public final EObject entryRuleDataQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataQuery = null;


        try {
            // InternalBehavior.g:2249:2: (iv_ruleDataQuery= ruleDataQuery EOF )
            // InternalBehavior.g:2250:2: iv_ruleDataQuery= ruleDataQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataQuery=ruleDataQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2257:1: ruleDataQuery returns [EObject current=null] : (otherlv_0= 'query' ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_query_2_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleDataQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2260:28: ( (otherlv_0= 'query' ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_query_2_0= ruleQueryExpression ) ) ) )
            // InternalBehavior.g:2261:1: (otherlv_0= 'query' ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_query_2_0= ruleQueryExpression ) ) )
            {
            // InternalBehavior.g:2261:1: (otherlv_0= 'query' ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_query_2_0= ruleQueryExpression ) ) )
            // InternalBehavior.g:2261:3: otherlv_0= 'query' ( (lv_type_1_0= ruleDeclarationTypeReference ) ) ( (lv_query_2_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDataQueryAccess().getQueryKeyword_0());
                  
            }
            // InternalBehavior.g:2265:1: ( (lv_type_1_0= ruleDeclarationTypeReference ) )
            // InternalBehavior.g:2266:1: (lv_type_1_0= ruleDeclarationTypeReference )
            {
            // InternalBehavior.g:2266:1: (lv_type_1_0= ruleDeclarationTypeReference )
            // InternalBehavior.g:2267:3: lv_type_1_0= ruleDeclarationTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataQueryAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
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
                      		"org.spp.cocome.behavior.Behavior.DeclarationTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalBehavior.g:2283:2: ( (lv_query_2_0= ruleQueryExpression ) )
            // InternalBehavior.g:2284:1: (lv_query_2_0= ruleQueryExpression )
            {
            // InternalBehavior.g:2284:1: (lv_query_2_0= ruleQueryExpression )
            // InternalBehavior.g:2285:3: lv_query_2_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDataQueryAccess().getQueryQueryExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_query_2_0=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDataQueryRule());
              	        }
                     		set(
                     			current, 
                     			"query",
                      		lv_query_2_0, 
                      		"org.spp.cocome.behavior.Behavior.QueryExpression");
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
    // $ANTLR end "ruleDataQuery"


    // $ANTLR start "entryRuleQueryExpression"
    // InternalBehavior.g:2309:1: entryRuleQueryExpression returns [EObject current=null] : iv_ruleQueryExpression= ruleQueryExpression EOF ;
    public final EObject entryRuleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryExpression = null;


        try {
            // InternalBehavior.g:2310:2: (iv_ruleQueryExpression= ruleQueryExpression EOF )
            // InternalBehavior.g:2311:2: iv_ruleQueryExpression= ruleQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQueryExpression=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryExpression"


    // $ANTLR start "ruleQueryExpression"
    // InternalBehavior.g:2318:1: ruleQueryExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleQueryElement ) ) (otherlv_1= ',' ( (lv_right_2_0= ruleQueryExpression ) ) )? ) ;
    public final EObject ruleQueryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2321:28: ( ( ( (lv_left_0_0= ruleQueryElement ) ) (otherlv_1= ',' ( (lv_right_2_0= ruleQueryExpression ) ) )? ) )
            // InternalBehavior.g:2322:1: ( ( (lv_left_0_0= ruleQueryElement ) ) (otherlv_1= ',' ( (lv_right_2_0= ruleQueryExpression ) ) )? )
            {
            // InternalBehavior.g:2322:1: ( ( (lv_left_0_0= ruleQueryElement ) ) (otherlv_1= ',' ( (lv_right_2_0= ruleQueryExpression ) ) )? )
            // InternalBehavior.g:2322:2: ( (lv_left_0_0= ruleQueryElement ) ) (otherlv_1= ',' ( (lv_right_2_0= ruleQueryExpression ) ) )?
            {
            // InternalBehavior.g:2322:2: ( (lv_left_0_0= ruleQueryElement ) )
            // InternalBehavior.g:2323:1: (lv_left_0_0= ruleQueryElement )
            {
            // InternalBehavior.g:2323:1: (lv_left_0_0= ruleQueryElement )
            // InternalBehavior.g:2324:3: lv_left_0_0= ruleQueryElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQueryExpressionAccess().getLeftQueryElementParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_33);
            lv_left_0_0=ruleQueryElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQueryExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"org.spp.cocome.behavior.Behavior.QueryElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalBehavior.g:2340:2: (otherlv_1= ',' ( (lv_right_2_0= ruleQueryExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBehavior.g:2340:4: otherlv_1= ',' ( (lv_right_2_0= ruleQueryExpression ) )
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getQueryExpressionAccess().getCommaKeyword_1_0());
                          
                    }
                    // InternalBehavior.g:2344:1: ( (lv_right_2_0= ruleQueryExpression ) )
                    // InternalBehavior.g:2345:1: (lv_right_2_0= ruleQueryExpression )
                    {
                    // InternalBehavior.g:2345:1: (lv_right_2_0= ruleQueryExpression )
                    // InternalBehavior.g:2346:3: lv_right_2_0= ruleQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQueryExpressionAccess().getRightQueryExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleQueryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQueryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_2_0, 
                              		"org.spp.cocome.behavior.Behavior.QueryExpression");
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
    // $ANTLR end "ruleQueryExpression"


    // $ANTLR start "entryRuleQueryElement"
    // InternalBehavior.g:2370:1: entryRuleQueryElement returns [EObject current=null] : iv_ruleQueryElement= ruleQueryElement EOF ;
    public final EObject entryRuleQueryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryElement = null;


        try {
            // InternalBehavior.g:2371:2: (iv_ruleQueryElement= ruleQueryElement EOF )
            // InternalBehavior.g:2372:2: iv_ruleQueryElement= ruleQueryElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQueryElement=ruleQueryElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryElement"


    // $ANTLR start "ruleQueryElement"
    // InternalBehavior.g:2379:1: ruleQueryElement returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_TypedValueReference_1= ruleTypedValueReference ) ;
    public final EObject ruleQueryElement() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_TypedValueReference_1 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2382:28: ( (this_StringLiteral_0= ruleStringLiteral | this_TypedValueReference_1= ruleTypedValueReference ) )
            // InternalBehavior.g:2383:1: (this_StringLiteral_0= ruleStringLiteral | this_TypedValueReference_1= ruleTypedValueReference )
            {
            // InternalBehavior.g:2383:1: (this_StringLiteral_0= ruleStringLiteral | this_TypedValueReference_1= ruleTypedValueReference )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalBehavior.g:2384:5: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQueryElementAccess().getStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalBehavior.g:2394:5: this_TypedValueReference_1= ruleTypedValueReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQueryElementAccess().getTypedValueReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_TypedValueReference_1=ruleTypedValueReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedValueReference_1; 
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
    // $ANTLR end "ruleQueryElement"


    // $ANTLR start "entryRuleTypedValueReference"
    // InternalBehavior.g:2410:1: entryRuleTypedValueReference returns [EObject current=null] : iv_ruleTypedValueReference= ruleTypedValueReference EOF ;
    public final EObject entryRuleTypedValueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedValueReference = null;


        try {
            // InternalBehavior.g:2411:2: (iv_ruleTypedValueReference= ruleTypedValueReference EOF )
            // InternalBehavior.g:2412:2: iv_ruleTypedValueReference= ruleTypedValueReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedValueReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypedValueReference=ruleTypedValueReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedValueReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedValueReference"


    // $ANTLR start "ruleTypedValueReference"
    // InternalBehavior.g:2419:1: ruleTypedValueReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypedValueReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalBehavior.g:2422:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBehavior.g:2423:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBehavior.g:2423:1: ( (otherlv_0= RULE_ID ) )
            // InternalBehavior.g:2424:1: (otherlv_0= RULE_ID )
            {
            // InternalBehavior.g:2424:1: (otherlv_0= RULE_ID )
            // InternalBehavior.g:2425:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypedValueReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTypedValueReferenceAccess().getTypedValueTypedValueCrossReference_0()); 
              	
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
    // $ANTLR end "ruleTypedValueReference"


    // $ANTLR start "entryRuleInstantiationExpression"
    // InternalBehavior.g:2444:1: entryRuleInstantiationExpression returns [EObject current=null] : iv_ruleInstantiationExpression= ruleInstantiationExpression EOF ;
    public final EObject entryRuleInstantiationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiationExpression = null;


        try {
            // InternalBehavior.g:2445:2: (iv_ruleInstantiationExpression= ruleInstantiationExpression EOF )
            // InternalBehavior.g:2446:2: iv_ruleInstantiationExpression= ruleInstantiationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstantiationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstantiationExpression=ruleInstantiationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstantiationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2453:1: ruleInstantiationExpression returns [EObject current=null] : (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleInstantiationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_parameters_3_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2456:28: ( (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalBehavior.g:2457:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalBehavior.g:2457:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalBehavior.g:2457:3: otherlv_0= 'new' ( (lv_type_1_0= ruleTypeReference ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstantiationExpressionAccess().getNewKeyword_0());
                  
            }
            // InternalBehavior.g:2461:1: ( (lv_type_1_0= ruleTypeReference ) )
            // InternalBehavior.g:2462:1: (lv_type_1_0= ruleTypeReference )
            {
            // InternalBehavior.g:2462:1: (lv_type_1_0= ruleTypeReference )
            // InternalBehavior.g:2463:3: lv_type_1_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstantiationExpressionAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
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
                      		"org.spp.cocome.behavior.Behavior.TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInstantiationExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalBehavior.g:2483:1: ( (lv_parameters_3_0= ruleExpression ) )
            // InternalBehavior.g:2484:1: (lv_parameters_3_0= ruleExpression )
            {
            // InternalBehavior.g:2484:1: (lv_parameters_3_0= ruleExpression )
            // InternalBehavior.g:2485:3: lv_parameters_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstantiationExpressionAccess().getParametersExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_16);
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
                      		"org.spp.cocome.behavior.Behavior.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:2513:1: entryRuleDeclarationTypeReference returns [EObject current=null] : iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF ;
    public final EObject entryRuleDeclarationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationTypeReference = null;


        try {
            // InternalBehavior.g:2514:2: (iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF )
            // InternalBehavior.g:2515:2: iv_ruleDeclarationTypeReference= ruleDeclarationTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclarationTypeReference=ruleDeclarationTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2522:1: ruleDeclarationTypeReference returns [EObject current=null] : (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType ) ;
    public final EObject ruleDeclarationTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_TypeReference_0 = null;

        EObject this_CollectionType_1 = null;

        EObject this_MapType_2 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2525:28: ( (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType ) )
            // InternalBehavior.g:2526:1: (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType )
            {
            // InternalBehavior.g:2526:1: (this_TypeReference_0= ruleTypeReference | this_CollectionType_1= ruleCollectionType | this_MapType_2= ruleMapType )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    alt35=3;
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case RULE_ID:
                    {
                    alt35=1;
                    }
                    break;
                case 34:
                    {
                    alt35=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalBehavior.g:2527:5: this_TypeReference_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:2537:5: this_CollectionType_1= ruleCollectionType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getCollectionTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:2547:5: this_MapType_2= ruleMapType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalBehavior.g:2563:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalBehavior.g:2564:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalBehavior.g:2565:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2572:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalBehavior.g:2575:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBehavior.g:2576:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBehavior.g:2576:1: ( (otherlv_0= RULE_ID ) )
            // InternalBehavior.g:2577:1: (otherlv_0= RULE_ID )
            {
            // InternalBehavior.g:2577:1: (otherlv_0= RULE_ID )
            // InternalBehavior.g:2578:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:2597:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalBehavior.g:2598:2: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalBehavior.g:2599:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2606:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2609:28: ( ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // InternalBehavior.g:2610:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // InternalBehavior.g:2610:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            // InternalBehavior.g:2610:2: ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // InternalBehavior.g:2610:2: ( (lv_reference_0_0= ruleTypeReference ) )
            // InternalBehavior.g:2611:1: (lv_reference_0_0= ruleTypeReference )
            {
            // InternalBehavior.g:2611:1: (lv_reference_0_0= ruleTypeReference )
            // InternalBehavior.g:2612:3: lv_reference_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
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
                      		"org.spp.cocome.behavior.Behavior.TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // InternalBehavior.g:2632:1: ( (lv_size_2_0= RULE_INT ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBehavior.g:2633:1: (lv_size_2_0= RULE_INT )
                    {
                    // InternalBehavior.g:2633:1: (lv_size_2_0= RULE_INT )
                    // InternalBehavior.g:2634:3: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_23); if (state.failed) return current;
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
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:2662:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalBehavior.g:2663:2: (iv_ruleMapType= ruleMapType EOF )
            // InternalBehavior.g:2664:2: iv_ruleMapType= ruleMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapType=ruleMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2671:1: ruleMapType returns [EObject current=null] : ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_reference_0_0 = null;

        EObject lv_keyType_2_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2674:28: ( ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) ) )
            // InternalBehavior.g:2675:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) )
            {
            // InternalBehavior.g:2675:1: ( ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' ) )
            // InternalBehavior.g:2675:2: ( (lv_reference_0_0= ruleTypeReference ) ) otherlv_1= '<' ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' )
            {
            // InternalBehavior.g:2675:2: ( (lv_reference_0_0= ruleTypeReference ) )
            // InternalBehavior.g:2676:1: (lv_reference_0_0= ruleTypeReference )
            {
            // InternalBehavior.g:2676:1: (lv_reference_0_0= ruleTypeReference )
            // InternalBehavior.g:2677:3: lv_reference_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_36);
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
                      		"org.spp.cocome.behavior.Behavior.TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1());
                  
            }
            // InternalBehavior.g:2697:1: ( ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>' )
            // InternalBehavior.g:2697:2: ( (lv_keyType_2_0= ruleTypeReference ) ) otherlv_3= '>'
            {
            // InternalBehavior.g:2697:2: ( (lv_keyType_2_0= ruleTypeReference ) )
            // InternalBehavior.g:2698:1: (lv_keyType_2_0= ruleTypeReference )
            {
            // InternalBehavior.g:2698:1: (lv_keyType_2_0= ruleTypeReference )
            // InternalBehavior.g:2699:3: lv_keyType_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeTypeReferenceParserRuleCall_2_0_0()); 
              	    
            }
            pushFollow(FOLLOW_37);
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
                      		"org.spp.cocome.behavior.Behavior.TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:2727:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalBehavior.g:2728:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalBehavior.g:2729:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2736:1: ruleLiteral returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteral_0 = null;

        EObject this_NumberLiteral_1 = null;

        EObject this_CharLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2739:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // InternalBehavior.g:2740:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // InternalBehavior.g:2740:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NumberLiteral_1= ruleNumberLiteral | this_CharLiteral_2= ruleCharLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 59:
            case 60:
                {
                alt37=1;
                }
                break;
            case RULE_INT:
            case 46:
            case 47:
                {
                alt37=2;
                }
                break;
            case RULE_CHARACTER:
                {
                alt37=3;
                }
                break;
            case RULE_STRING:
                {
                alt37=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalBehavior.g:2741:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:2751:5: this_NumberLiteral_1= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:2761:5: this_CharLiteral_2= ruleCharLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalBehavior.g:2771:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalBehavior.g:2787:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalBehavior.g:2788:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalBehavior.g:2789:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2796:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalBehavior.g:2799:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalBehavior.g:2800:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalBehavior.g:2800:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalBehavior.g:2801:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalBehavior.g:2801:1: (lv_value_0_0= RULE_STRING )
            // InternalBehavior.g:2802:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // InternalBehavior.g:2826:1: entryRuleCharLiteral returns [EObject current=null] : iv_ruleCharLiteral= ruleCharLiteral EOF ;
    public final EObject entryRuleCharLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLiteral = null;


        try {
            // InternalBehavior.g:2827:2: (iv_ruleCharLiteral= ruleCharLiteral EOF )
            // InternalBehavior.g:2828:2: iv_ruleCharLiteral= ruleCharLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCharLiteral=ruleCharLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2835:1: ruleCharLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_CHARACTER ) ) ;
    public final EObject ruleCharLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalBehavior.g:2838:28: ( ( (lv_value_0_0= RULE_CHARACTER ) ) )
            // InternalBehavior.g:2839:1: ( (lv_value_0_0= RULE_CHARACTER ) )
            {
            // InternalBehavior.g:2839:1: ( (lv_value_0_0= RULE_CHARACTER ) )
            // InternalBehavior.g:2840:1: (lv_value_0_0= RULE_CHARACTER )
            {
            // InternalBehavior.g:2840:1: (lv_value_0_0= RULE_CHARACTER )
            // InternalBehavior.g:2841:3: lv_value_0_0= RULE_CHARACTER
            {
            lv_value_0_0=(Token)match(input,RULE_CHARACTER,FOLLOW_2); if (state.failed) return current;
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
                      		"org.spp.cocome.behavior.Behavior.CHARACTER");
              	    
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
    // InternalBehavior.g:2865:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalBehavior.g:2866:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalBehavior.g:2867:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2874:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2877:28: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // InternalBehavior.g:2878:1: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // InternalBehavior.g:2878:1: ( (lv_value_0_0= ruleNUMBER ) )
            // InternalBehavior.g:2879:1: (lv_value_0_0= ruleNUMBER )
            {
            // InternalBehavior.g:2879:1: (lv_value_0_0= ruleNUMBER )
            // InternalBehavior.g:2880:3: lv_value_0_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.spp.cocome.behavior.Behavior.NUMBER");
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
    // InternalBehavior.g:2904:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalBehavior.g:2905:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalBehavior.g:2906:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2913:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2916:28: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // InternalBehavior.g:2917:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // InternalBehavior.g:2917:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // InternalBehavior.g:2918:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // InternalBehavior.g:2918:1: (lv_value_0_0= ruleBOOLEAN )
            // InternalBehavior.g:2919:3: lv_value_0_0= ruleBOOLEAN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.spp.cocome.behavior.Behavior.BOOLEAN");
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
    // InternalBehavior.g:2943:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalBehavior.g:2944:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalBehavior.g:2945:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2952:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalBehavior.g:2955:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBehavior.g:2956:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBehavior.g:2956:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBehavior.g:2956:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalBehavior.g:2963:1: (kw= '.' this_ID_2= RULE_ID )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==36) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==RULE_ID) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalBehavior.g:2964:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalBehavior.g:2984:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalBehavior.g:2985:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalBehavior.g:2986:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:2993:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalBehavior.g:2996:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalBehavior.g:2997:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalBehavior.g:2997:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalBehavior.g:2998:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_24);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalBehavior.g:3008:1: (kw= '.' kw= '*' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBehavior.g:3009:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:3028:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalBehavior.g:3029:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalBehavior.g:3030:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBOOLEANRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBOOLEAN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:3037:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalBehavior.g:3040:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalBehavior.g:3041:1: (kw= 'true' | kw= 'false' )
            {
            // InternalBehavior.g:3041:1: (kw= 'true' | kw= 'false' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==59) ) {
                alt40=1;
            }
            else if ( (LA40_0==60) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalBehavior.g:3042:2: kw= 'true'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalBehavior.g:3049:2: kw= 'false'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:3062:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalBehavior.g:3063:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalBehavior.g:3064:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalBehavior.g:3071:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // InternalBehavior.g:3074:28: ( ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) ) )
            // InternalBehavior.g:3075:1: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) )
            {
            // InternalBehavior.g:3075:1: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) | (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=46 && LA42_0<=47)) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_INT) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==36) ) {
                    alt42=2;
                }
                else if ( (LA42_2==EOF||LA42_2==RULE_ID||(LA42_2>=17 && LA42_2<=19)||(LA42_2>=21 && LA42_2<=23)||LA42_2==25||LA42_2==27||LA42_2==29||LA42_2==31||LA42_2==33||LA42_2==35||(LA42_2>=37 && LA42_2<=51)||(LA42_2>=53 && LA42_2<=55)||(LA42_2>=64 && LA42_2<=66)) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalBehavior.g:3075:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
                    {
                    // InternalBehavior.g:3075:2: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
                    // InternalBehavior.g:3075:3: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
                    {
                    // InternalBehavior.g:3075:3: (kw= '+' | kw= '-' )?
                    int alt41=3;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==46) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==47) ) {
                        alt41=2;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalBehavior.g:3076:2: kw= '+'
                            {
                            kw=(Token)match(input,46,FOLLOW_39); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBERAccess().getPlusSignKeyword_0_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalBehavior.g:3083:2: kw= '-'
                            {
                            kw=(Token)match(input,47,FOLLOW_39); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
                    // InternalBehavior.g:3096:6: (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT )
                    {
                    // InternalBehavior.g:3096:6: (this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT )
                    // InternalBehavior.g:3096:11: this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
                          
                    }
                    kw=(Token)match(input,36,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
                          
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:3124:1: ruleComponentKind returns [Enumerator current=null] : ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) ) ;
    public final Enumerator ruleComponentKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalBehavior.g:3126:28: ( ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) ) )
            // InternalBehavior.g:3127:1: ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) )
            {
            // InternalBehavior.g:3127:1: ( (enumLiteral_0= 'stateless' ) | (enumLiteral_1= 'stateful' ) | (enumLiteral_2= 'singleton' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt43=1;
                }
                break;
            case 62:
                {
                alt43=2;
                }
                break;
            case 63:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalBehavior.g:3127:2: (enumLiteral_0= 'stateless' )
                    {
                    // InternalBehavior.g:3127:2: (enumLiteral_0= 'stateless' )
                    // InternalBehavior.g:3127:4: enumLiteral_0= 'stateless'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComponentKindAccess().getSTATELESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComponentKindAccess().getSTATELESSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:3133:6: (enumLiteral_1= 'stateful' )
                    {
                    // InternalBehavior.g:3133:6: (enumLiteral_1= 'stateful' )
                    // InternalBehavior.g:3133:8: enumLiteral_1= 'stateful'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComponentKindAccess().getSTATEFULEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComponentKindAccess().getSTATEFULEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:3139:6: (enumLiteral_2= 'singleton' )
                    {
                    // InternalBehavior.g:3139:6: (enumLiteral_2= 'singleton' )
                    // InternalBehavior.g:3139:8: enumLiteral_2= 'singleton'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
    // InternalBehavior.g:3149:1: ruleDataAccessOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'store' ) | (enumLiteral_1= 'update' ) | (enumLiteral_2= 'delete' ) ) ;
    public final Enumerator ruleDataAccessOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalBehavior.g:3151:28: ( ( (enumLiteral_0= 'store' ) | (enumLiteral_1= 'update' ) | (enumLiteral_2= 'delete' ) ) )
            // InternalBehavior.g:3152:1: ( (enumLiteral_0= 'store' ) | (enumLiteral_1= 'update' ) | (enumLiteral_2= 'delete' ) )
            {
            // InternalBehavior.g:3152:1: ( (enumLiteral_0= 'store' ) | (enumLiteral_1= 'update' ) | (enumLiteral_2= 'delete' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt44=1;
                }
                break;
            case 65:
                {
                alt44=2;
                }
                break;
            case 66:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalBehavior.g:3152:2: (enumLiteral_0= 'store' )
                    {
                    // InternalBehavior.g:3152:2: (enumLiteral_0= 'store' )
                    // InternalBehavior.g:3152:4: enumLiteral_0= 'store'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDataAccessOperationAccess().getSTOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDataAccessOperationAccess().getSTOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:3158:6: (enumLiteral_1= 'update' )
                    {
                    // InternalBehavior.g:3158:6: (enumLiteral_1= 'update' )
                    // InternalBehavior.g:3158:8: enumLiteral_1= 'update'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDataAccessOperationAccess().getUPDATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDataAccessOperationAccess().getUPDATEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:3164:6: (enumLiteral_2= 'delete' )
                    {
                    // InternalBehavior.g:3164:6: (enumLiteral_2= 'delete' )
                    // InternalBehavior.g:3164:8: enumLiteral_2= 'delete'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
        // InternalBehavior.g:1376:3: ( ( () ( ( '||' ) ) ) )
        // InternalBehavior.g:1376:4: ( () ( ( '||' ) ) )
        {
        // InternalBehavior.g:1376:4: ( () ( ( '||' ) ) )
        // InternalBehavior.g:1376:5: () ( ( '||' ) )
        {
        // InternalBehavior.g:1376:5: ()
        // InternalBehavior.g:1377:1: 
        {
        }

        // InternalBehavior.g:1377:2: ( ( '||' ) )
        // InternalBehavior.g:1378:1: ( '||' )
        {
        // InternalBehavior.g:1378:1: ( '||' )
        // InternalBehavior.g:1379:2: '||'
        {
        match(input,37,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalBehavior

    // $ANTLR start synpred2_InternalBehavior
    public final void synpred2_InternalBehavior_fragment() throws RecognitionException {   
        // InternalBehavior.g:1452:3: ( ( () ( ( '&&' ) ) ) )
        // InternalBehavior.g:1452:4: ( () ( ( '&&' ) ) )
        {
        // InternalBehavior.g:1452:4: ( () ( ( '&&' ) ) )
        // InternalBehavior.g:1452:5: () ( ( '&&' ) )
        {
        // InternalBehavior.g:1452:5: ()
        // InternalBehavior.g:1453:1: 
        {
        }

        // InternalBehavior.g:1453:2: ( ( '&&' ) )
        // InternalBehavior.g:1454:1: ( '&&' )
        {
        // InternalBehavior.g:1454:1: ( '&&' )
        // InternalBehavior.g:1455:2: '&&'
        {
        match(input,38,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalBehavior

    // $ANTLR start synpred3_InternalBehavior
    public final void synpred3_InternalBehavior_fragment() throws RecognitionException {   
        // InternalBehavior.g:1528:3: ( ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) ) )
        // InternalBehavior.g:1528:4: ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) )
        {
        // InternalBehavior.g:1528:4: ( () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) ) )
        // InternalBehavior.g:1528:5: () ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) )
        {
        // InternalBehavior.g:1528:5: ()
        // InternalBehavior.g:1529:1: 
        {
        }

        // InternalBehavior.g:1529:2: ( ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) ) )
        // InternalBehavior.g:1530:1: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) )
        {
        // InternalBehavior.g:1530:1: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) )
        // InternalBehavior.g:1531:1: ( '==' | '!=' | '>' | '<' | '>=' | '<=' )
        {
        if ( (input.LA(1)>=39 && input.LA(1)<=44) ) {
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
        // InternalBehavior.g:1685:3: ( ( () ( ( 'instanceof' ) ) ) )
        // InternalBehavior.g:1685:4: ( () ( ( 'instanceof' ) ) )
        {
        // InternalBehavior.g:1685:4: ( () ( ( 'instanceof' ) ) )
        // InternalBehavior.g:1685:5: () ( ( 'instanceof' ) )
        {
        // InternalBehavior.g:1685:5: ()
        // InternalBehavior.g:1686:1: 
        {
        }

        // InternalBehavior.g:1686:2: ( ( 'instanceof' ) )
        // InternalBehavior.g:1687:1: ( 'instanceof' )
        {
        // InternalBehavior.g:1687:1: ( 'instanceof' )
        // InternalBehavior.g:1688:2: 'instanceof'
        {
        match(input,45,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalBehavior

    // $ANTLR start synpred5_InternalBehavior
    public final void synpred5_InternalBehavior_fragment() throws RecognitionException {   
        // InternalBehavior.g:1761:3: ( ( () ( ( ( '+' | '-' ) ) ) ) )
        // InternalBehavior.g:1761:4: ( () ( ( ( '+' | '-' ) ) ) )
        {
        // InternalBehavior.g:1761:4: ( () ( ( ( '+' | '-' ) ) ) )
        // InternalBehavior.g:1761:5: () ( ( ( '+' | '-' ) ) )
        {
        // InternalBehavior.g:1761:5: ()
        // InternalBehavior.g:1762:1: 
        {
        }

        // InternalBehavior.g:1762:2: ( ( ( '+' | '-' ) ) )
        // InternalBehavior.g:1763:1: ( ( '+' | '-' ) )
        {
        // InternalBehavior.g:1763:1: ( ( '+' | '-' ) )
        // InternalBehavior.g:1764:1: ( '+' | '-' )
        {
        if ( (input.LA(1)>=46 && input.LA(1)<=47) ) {
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
        // InternalBehavior.g:1858:3: ( ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) ) )
        // InternalBehavior.g:1858:4: ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) )
        {
        // InternalBehavior.g:1858:4: ( () ( ( ( '*' | '/' | '%' | '**' ) ) ) )
        // InternalBehavior.g:1858:5: () ( ( ( '*' | '/' | '%' | '**' ) ) )
        {
        // InternalBehavior.g:1858:5: ()
        // InternalBehavior.g:1859:1: 
        {
        }

        // InternalBehavior.g:1859:2: ( ( ( '*' | '/' | '%' | '**' ) ) )
        // InternalBehavior.g:1860:1: ( ( '*' | '/' | '%' | '**' ) )
        {
        // InternalBehavior.g:1860:1: ( ( '*' | '/' | '%' | '**' ) )
        // InternalBehavior.g:1861:1: ( '*' | '/' | '%' | '**' )
        {
        if ( (input.LA(1)>=48 && input.LA(1)<=51) ) {
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
        // InternalBehavior.g:2055:3: ( ( () ( ( 'as' ) ) ) )
        // InternalBehavior.g:2055:4: ( () ( ( 'as' ) ) )
        {
        // InternalBehavior.g:2055:4: ( () ( ( 'as' ) ) )
        // InternalBehavior.g:2055:5: () ( ( 'as' ) )
        {
        // InternalBehavior.g:2055:5: ()
        // InternalBehavior.g:2056:1: 
        {
        }

        // InternalBehavior.g:2056:2: ( ( 'as' ) )
        // InternalBehavior.g:2057:1: ( 'as' )
        {
        // InternalBehavior.g:2057:1: ( 'as' )
        // InternalBehavior.g:2058:2: 'as'
        {
        match(input,53,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalBehavior

    // $ANTLR start synpred8_InternalBehavior
    public final void synpred8_InternalBehavior_fragment() throws RecognitionException {   
        // InternalBehavior.g:2131:2: ( ( () ( ( ( '++' | '--' ) ) ) ) )
        // InternalBehavior.g:2131:3: ( () ( ( ( '++' | '--' ) ) ) )
        {
        // InternalBehavior.g:2131:3: ( () ( ( ( '++' | '--' ) ) ) )
        // InternalBehavior.g:2131:4: () ( ( ( '++' | '--' ) ) )
        {
        // InternalBehavior.g:2131:4: ()
        // InternalBehavior.g:2132:1: 
        {
        }

        // InternalBehavior.g:2132:2: ( ( ( '++' | '--' ) ) )
        // InternalBehavior.g:2133:1: ( ( '++' | '--' ) )
        {
        // InternalBehavior.g:2133:1: ( ( '++' | '--' ) )
        // InternalBehavior.g:2134:1: ( '++' | '--' )
        {
        if ( (input.LA(1)>=54 && input.LA(1)<=55) ) {
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xE000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002EE0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000020C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x1D10C000000000F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000288080020L,0x0000000000000007L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1D10C008000000F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00001F8000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});

}