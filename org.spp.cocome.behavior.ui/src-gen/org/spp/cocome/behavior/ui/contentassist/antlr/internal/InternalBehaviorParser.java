package org.spp.cocome.behavior.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.spp.cocome.behavior.services.BehaviorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBehaviorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_CHARACTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'val'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'++'", "'--'", "'true'", "'false'", "'stateless'", "'stateful'", "'singleton'", "'store'", "'update'", "'delete'", "'package'", "'repository'", "'import'", "'realize'", "'{'", "'}'", "'post-construct'", "'pre-destroy'", "'action'", "'const'", "'='", "'iface'", "'operation'", "'if'", "'('", "')'", "'else'", "'for'", "':'", "'return'", "'['", "']'", "'.'", "'query'", "','", "'new'", "'||'", "'&&'", "'instanceof'", "'!'", "'as'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=6;
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
     	
        public void setGrammarAccess(BehaviorGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleBehaviorModel"
    // InternalBehavior.g:61:1: entryRuleBehaviorModel : ruleBehaviorModel EOF ;
    public final void entryRuleBehaviorModel() throws RecognitionException {
        try {
            // InternalBehavior.g:62:1: ( ruleBehaviorModel EOF )
            // InternalBehavior.g:63:1: ruleBehaviorModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBehaviorModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBehaviorModel"


    // $ANTLR start "ruleBehaviorModel"
    // InternalBehavior.g:70:1: ruleBehaviorModel : ( ( rule__BehaviorModel__Group__0 ) ) ;
    public final void ruleBehaviorModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:74:2: ( ( ( rule__BehaviorModel__Group__0 ) ) )
            // InternalBehavior.g:75:1: ( ( rule__BehaviorModel__Group__0 ) )
            {
            // InternalBehavior.g:75:1: ( ( rule__BehaviorModel__Group__0 ) )
            // InternalBehavior.g:76:1: ( rule__BehaviorModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorModelAccess().getGroup()); 
            }
            // InternalBehavior.g:77:1: ( rule__BehaviorModel__Group__0 )
            // InternalBehavior.g:77:2: rule__BehaviorModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorModelAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleBehaviorModel"


    // $ANTLR start "entryRuleRepositoryReference"
    // InternalBehavior.g:89:1: entryRuleRepositoryReference : ruleRepositoryReference EOF ;
    public final void entryRuleRepositoryReference() throws RecognitionException {
        try {
            // InternalBehavior.g:90:1: ( ruleRepositoryReference EOF )
            // InternalBehavior.g:91:1: ruleRepositoryReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRepositoryReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRepositoryReference"


    // $ANTLR start "ruleRepositoryReference"
    // InternalBehavior.g:98:1: ruleRepositoryReference : ( ( rule__RepositoryReference__Group__0 ) ) ;
    public final void ruleRepositoryReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:102:2: ( ( ( rule__RepositoryReference__Group__0 ) ) )
            // InternalBehavior.g:103:1: ( ( rule__RepositoryReference__Group__0 ) )
            {
            // InternalBehavior.g:103:1: ( ( rule__RepositoryReference__Group__0 ) )
            // InternalBehavior.g:104:1: ( rule__RepositoryReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryReferenceAccess().getGroup()); 
            }
            // InternalBehavior.g:105:1: ( rule__RepositoryReference__Group__0 )
            // InternalBehavior.g:105:2: rule__RepositoryReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryReferenceAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRepositoryReference"


    // $ANTLR start "entryRuleImport"
    // InternalBehavior.g:117:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalBehavior.g:118:1: ( ruleImport EOF )
            // InternalBehavior.g:119:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalBehavior.g:126:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:130:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalBehavior.g:131:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalBehavior.g:131:1: ( ( rule__Import__Group__0 ) )
            // InternalBehavior.g:132:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalBehavior.g:133:1: ( rule__Import__Group__0 )
            // InternalBehavior.g:133:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleComponentImpl"
    // InternalBehavior.g:145:1: entryRuleComponentImpl : ruleComponentImpl EOF ;
    public final void entryRuleComponentImpl() throws RecognitionException {
        try {
            // InternalBehavior.g:146:1: ( ruleComponentImpl EOF )
            // InternalBehavior.g:147:1: ruleComponentImpl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComponentImpl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComponentImpl"


    // $ANTLR start "ruleComponentImpl"
    // InternalBehavior.g:154:1: ruleComponentImpl : ( ( rule__ComponentImpl__Group__0 ) ) ;
    public final void ruleComponentImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:158:2: ( ( ( rule__ComponentImpl__Group__0 ) ) )
            // InternalBehavior.g:159:1: ( ( rule__ComponentImpl__Group__0 ) )
            {
            // InternalBehavior.g:159:1: ( ( rule__ComponentImpl__Group__0 ) )
            // InternalBehavior.g:160:1: ( rule__ComponentImpl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getGroup()); 
            }
            // InternalBehavior.g:161:1: ( rule__ComponentImpl__Group__0 )
            // InternalBehavior.g:161:2: rule__ComponentImpl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleComponentImpl"


    // $ANTLR start "entryRuleLifeCycleMethod"
    // InternalBehavior.g:173:1: entryRuleLifeCycleMethod : ruleLifeCycleMethod EOF ;
    public final void entryRuleLifeCycleMethod() throws RecognitionException {
        try {
            // InternalBehavior.g:174:1: ( ruleLifeCycleMethod EOF )
            // InternalBehavior.g:175:1: ruleLifeCycleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifeCycleMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLifeCycleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifeCycleMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLifeCycleMethod"


    // $ANTLR start "ruleLifeCycleMethod"
    // InternalBehavior.g:182:1: ruleLifeCycleMethod : ( ( rule__LifeCycleMethod__Group__0 ) ) ;
    public final void ruleLifeCycleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:186:2: ( ( ( rule__LifeCycleMethod__Group__0 ) ) )
            // InternalBehavior.g:187:1: ( ( rule__LifeCycleMethod__Group__0 ) )
            {
            // InternalBehavior.g:187:1: ( ( rule__LifeCycleMethod__Group__0 ) )
            // InternalBehavior.g:188:1: ( rule__LifeCycleMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifeCycleMethodAccess().getGroup()); 
            }
            // InternalBehavior.g:189:1: ( rule__LifeCycleMethod__Group__0 )
            // InternalBehavior.g:189:2: rule__LifeCycleMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LifeCycleMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifeCycleMethodAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleLifeCycleMethod"


    // $ANTLR start "entryRuleVariableDecl"
    // InternalBehavior.g:203:1: entryRuleVariableDecl : ruleVariableDecl EOF ;
    public final void entryRuleVariableDecl() throws RecognitionException {
        try {
            // InternalBehavior.g:204:1: ( ruleVariableDecl EOF )
            // InternalBehavior.g:205:1: ruleVariableDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableDecl"


    // $ANTLR start "ruleVariableDecl"
    // InternalBehavior.g:212:1: ruleVariableDecl : ( ( rule__VariableDecl__Group__0 ) ) ;
    public final void ruleVariableDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:216:2: ( ( ( rule__VariableDecl__Group__0 ) ) )
            // InternalBehavior.g:217:1: ( ( rule__VariableDecl__Group__0 ) )
            {
            // InternalBehavior.g:217:1: ( ( rule__VariableDecl__Group__0 ) )
            // InternalBehavior.g:218:1: ( rule__VariableDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getGroup()); 
            }
            // InternalBehavior.g:219:1: ( rule__VariableDecl__Group__0 )
            // InternalBehavior.g:219:2: rule__VariableDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleVariableDecl"


    // $ANTLR start "entryRuleConstantDecl"
    // InternalBehavior.g:231:1: entryRuleConstantDecl : ruleConstantDecl EOF ;
    public final void entryRuleConstantDecl() throws RecognitionException {
        try {
            // InternalBehavior.g:232:1: ( ruleConstantDecl EOF )
            // InternalBehavior.g:233:1: ruleConstantDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstantDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstantDecl"


    // $ANTLR start "ruleConstantDecl"
    // InternalBehavior.g:240:1: ruleConstantDecl : ( ( rule__ConstantDecl__Group__0 ) ) ;
    public final void ruleConstantDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:244:2: ( ( ( rule__ConstantDecl__Group__0 ) ) )
            // InternalBehavior.g:245:1: ( ( rule__ConstantDecl__Group__0 ) )
            {
            // InternalBehavior.g:245:1: ( ( rule__ConstantDecl__Group__0 ) )
            // InternalBehavior.g:246:1: ( rule__ConstantDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclAccess().getGroup()); 
            }
            // InternalBehavior.g:247:1: ( rule__ConstantDecl__Group__0 )
            // InternalBehavior.g:247:2: rule__ConstantDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleConstantDecl"


    // $ANTLR start "entryRuleInterfaceRealization"
    // InternalBehavior.g:259:1: entryRuleInterfaceRealization : ruleInterfaceRealization EOF ;
    public final void entryRuleInterfaceRealization() throws RecognitionException {
        try {
            // InternalBehavior.g:260:1: ( ruleInterfaceRealization EOF )
            // InternalBehavior.g:261:1: ruleInterfaceRealization EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRealizationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInterfaceRealization();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRealizationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInterfaceRealization"


    // $ANTLR start "ruleInterfaceRealization"
    // InternalBehavior.g:268:1: ruleInterfaceRealization : ( ( rule__InterfaceRealization__Group__0 ) ) ;
    public final void ruleInterfaceRealization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:272:2: ( ( ( rule__InterfaceRealization__Group__0 ) ) )
            // InternalBehavior.g:273:1: ( ( rule__InterfaceRealization__Group__0 ) )
            {
            // InternalBehavior.g:273:1: ( ( rule__InterfaceRealization__Group__0 ) )
            // InternalBehavior.g:274:1: ( rule__InterfaceRealization__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRealizationAccess().getGroup()); 
            }
            // InternalBehavior.g:275:1: ( rule__InterfaceRealization__Group__0 )
            // InternalBehavior.g:275:2: rule__InterfaceRealization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceRealization__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRealizationAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleInterfaceRealization"


    // $ANTLR start "entryRuleMethodImpl"
    // InternalBehavior.g:287:1: entryRuleMethodImpl : ruleMethodImpl EOF ;
    public final void entryRuleMethodImpl() throws RecognitionException {
        try {
            // InternalBehavior.g:288:1: ( ruleMethodImpl EOF )
            // InternalBehavior.g:289:1: ruleMethodImpl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodImplRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethodImpl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodImplRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethodImpl"


    // $ANTLR start "ruleMethodImpl"
    // InternalBehavior.g:296:1: ruleMethodImpl : ( ( rule__MethodImpl__Group__0 ) ) ;
    public final void ruleMethodImpl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:300:2: ( ( ( rule__MethodImpl__Group__0 ) ) )
            // InternalBehavior.g:301:1: ( ( rule__MethodImpl__Group__0 ) )
            {
            // InternalBehavior.g:301:1: ( ( rule__MethodImpl__Group__0 ) )
            // InternalBehavior.g:302:1: ( rule__MethodImpl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodImplAccess().getGroup()); 
            }
            // InternalBehavior.g:303:1: ( rule__MethodImpl__Group__0 )
            // InternalBehavior.g:303:2: rule__MethodImpl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodImpl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodImplAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMethodImpl"


    // $ANTLR start "entryRuleStatement"
    // InternalBehavior.g:315:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalBehavior.g:316:1: ( ruleStatement EOF )
            // InternalBehavior.g:317:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalBehavior.g:324:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:328:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalBehavior.g:329:1: ( ( rule__Statement__Alternatives ) )
            {
            // InternalBehavior.g:329:1: ( ( rule__Statement__Alternatives ) )
            // InternalBehavior.g:330:1: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalBehavior.g:331:1: ( rule__Statement__Alternatives )
            // InternalBehavior.g:331:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalBehavior.g:343:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalBehavior.g:344:1: ( ruleIfStatement EOF )
            // InternalBehavior.g:345:1: ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalBehavior.g:352:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:356:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalBehavior.g:357:1: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalBehavior.g:357:1: ( ( rule__IfStatement__Group__0 ) )
            // InternalBehavior.g:358:1: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalBehavior.g:359:1: ( rule__IfStatement__Group__0 )
            // InternalBehavior.g:359:2: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleBlockStatement"
    // InternalBehavior.g:371:1: entryRuleBlockStatement : ruleBlockStatement EOF ;
    public final void entryRuleBlockStatement() throws RecognitionException {
        try {
            // InternalBehavior.g:372:1: ( ruleBlockStatement EOF )
            // InternalBehavior.g:373:1: ruleBlockStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlockStatement"


    // $ANTLR start "ruleBlockStatement"
    // InternalBehavior.g:380:1: ruleBlockStatement : ( ( rule__BlockStatement__Group__0 ) ) ;
    public final void ruleBlockStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:384:2: ( ( ( rule__BlockStatement__Group__0 ) ) )
            // InternalBehavior.g:385:1: ( ( rule__BlockStatement__Group__0 ) )
            {
            // InternalBehavior.g:385:1: ( ( rule__BlockStatement__Group__0 ) )
            // InternalBehavior.g:386:1: ( rule__BlockStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockStatementAccess().getGroup()); 
            }
            // InternalBehavior.g:387:1: ( rule__BlockStatement__Group__0 )
            // InternalBehavior.g:387:2: rule__BlockStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleBlockStatement"


    // $ANTLR start "entryRuleAssignment"
    // InternalBehavior.g:399:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalBehavior.g:400:1: ( ruleAssignment EOF )
            // InternalBehavior.g:401:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalBehavior.g:408:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:412:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalBehavior.g:413:1: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalBehavior.g:413:1: ( ( rule__Assignment__Group__0 ) )
            // InternalBehavior.g:414:1: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalBehavior.g:415:1: ( rule__Assignment__Group__0 )
            // InternalBehavior.g:415:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalBehavior.g:427:1: entryRuleLoopStatement : ruleLoopStatement EOF ;
    public final void entryRuleLoopStatement() throws RecognitionException {
        try {
            // InternalBehavior.g:428:1: ( ruleLoopStatement EOF )
            // InternalBehavior.g:429:1: ruleLoopStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLoopStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalBehavior.g:436:1: ruleLoopStatement : ( ( rule__LoopStatement__Group__0 ) ) ;
    public final void ruleLoopStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:440:2: ( ( ( rule__LoopStatement__Group__0 ) ) )
            // InternalBehavior.g:441:1: ( ( rule__LoopStatement__Group__0 ) )
            {
            // InternalBehavior.g:441:1: ( ( rule__LoopStatement__Group__0 ) )
            // InternalBehavior.g:442:1: ( rule__LoopStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getGroup()); 
            }
            // InternalBehavior.g:443:1: ( rule__LoopStatement__Group__0 )
            // InternalBehavior.g:443:2: rule__LoopStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleDataAccessStatement"
    // InternalBehavior.g:455:1: entryRuleDataAccessStatement : ruleDataAccessStatement EOF ;
    public final void entryRuleDataAccessStatement() throws RecognitionException {
        try {
            // InternalBehavior.g:456:1: ( ruleDataAccessStatement EOF )
            // InternalBehavior.g:457:1: ruleDataAccessStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataAccessStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDataAccessStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataAccessStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDataAccessStatement"


    // $ANTLR start "ruleDataAccessStatement"
    // InternalBehavior.g:464:1: ruleDataAccessStatement : ( ( rule__DataAccessStatement__Group__0 ) ) ;
    public final void ruleDataAccessStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:468:2: ( ( ( rule__DataAccessStatement__Group__0 ) ) )
            // InternalBehavior.g:469:1: ( ( rule__DataAccessStatement__Group__0 ) )
            {
            // InternalBehavior.g:469:1: ( ( rule__DataAccessStatement__Group__0 ) )
            // InternalBehavior.g:470:1: ( rule__DataAccessStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataAccessStatementAccess().getGroup()); 
            }
            // InternalBehavior.g:471:1: ( rule__DataAccessStatement__Group__0 )
            // InternalBehavior.g:471:2: rule__DataAccessStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataAccessStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDataAccessStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalBehavior.g:483:1: entryRuleReturnStatement : ruleReturnStatement EOF ;
    public final void entryRuleReturnStatement() throws RecognitionException {
        try {
            // InternalBehavior.g:484:1: ( ruleReturnStatement EOF )
            // InternalBehavior.g:485:1: ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReturnStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalBehavior.g:492:1: ruleReturnStatement : ( ( rule__ReturnStatement__Group__0 ) ) ;
    public final void ruleReturnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:496:2: ( ( ( rule__ReturnStatement__Group__0 ) ) )
            // InternalBehavior.g:497:1: ( ( rule__ReturnStatement__Group__0 ) )
            {
            // InternalBehavior.g:497:1: ( ( rule__ReturnStatement__Group__0 ) )
            // InternalBehavior.g:498:1: ( rule__ReturnStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getGroup()); 
            }
            // InternalBehavior.g:499:1: ( rule__ReturnStatement__Group__0 )
            // InternalBehavior.g:499:2: rule__ReturnStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleVariableCall"
    // InternalBehavior.g:511:1: entryRuleVariableCall : ruleVariableCall EOF ;
    public final void entryRuleVariableCall() throws RecognitionException {
        try {
            // InternalBehavior.g:512:1: ( ruleVariableCall EOF )
            // InternalBehavior.g:513:1: ruleVariableCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableCall"


    // $ANTLR start "ruleVariableCall"
    // InternalBehavior.g:520:1: ruleVariableCall : ( ( rule__VariableCall__Group__0 ) ) ;
    public final void ruleVariableCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:524:2: ( ( ( rule__VariableCall__Group__0 ) ) )
            // InternalBehavior.g:525:1: ( ( rule__VariableCall__Group__0 ) )
            {
            // InternalBehavior.g:525:1: ( ( rule__VariableCall__Group__0 ) )
            // InternalBehavior.g:526:1: ( rule__VariableCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getGroup()); 
            }
            // InternalBehavior.g:527:1: ( rule__VariableCall__Group__0 )
            // InternalBehavior.g:527:2: rule__VariableCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleVariableCall"


    // $ANTLR start "entryRulePropertyCall"
    // InternalBehavior.g:539:1: entryRulePropertyCall : rulePropertyCall EOF ;
    public final void entryRulePropertyCall() throws RecognitionException {
        try {
            // InternalBehavior.g:540:1: ( rulePropertyCall EOF )
            // InternalBehavior.g:541:1: rulePropertyCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePropertyCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertyCall"


    // $ANTLR start "rulePropertyCall"
    // InternalBehavior.g:548:1: rulePropertyCall : ( ( rule__PropertyCall__Group__0 ) ) ;
    public final void rulePropertyCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:552:2: ( ( ( rule__PropertyCall__Group__0 ) ) )
            // InternalBehavior.g:553:1: ( ( rule__PropertyCall__Group__0 ) )
            {
            // InternalBehavior.g:553:1: ( ( rule__PropertyCall__Group__0 ) )
            // InternalBehavior.g:554:1: ( rule__PropertyCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getGroup()); 
            }
            // InternalBehavior.g:555:1: ( rule__PropertyCall__Group__0 )
            // InternalBehavior.g:555:2: rule__PropertyCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePropertyCall"


    // $ANTLR start "entryRuleExpression"
    // InternalBehavior.g:567:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalBehavior.g:568:1: ( ruleExpression EOF )
            // InternalBehavior.g:569:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalBehavior.g:576:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:580:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalBehavior.g:581:1: ( ( rule__Expression__Group__0 ) )
            {
            // InternalBehavior.g:581:1: ( ( rule__Expression__Group__0 ) )
            // InternalBehavior.g:582:1: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalBehavior.g:583:1: ( rule__Expression__Group__0 )
            // InternalBehavior.g:583:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalBehavior.g:595:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalBehavior.g:596:1: ( ruleAndExpression EOF )
            // InternalBehavior.g:597:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalBehavior.g:604:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:608:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalBehavior.g:609:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalBehavior.g:609:1: ( ( rule__AndExpression__Group__0 ) )
            // InternalBehavior.g:610:1: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalBehavior.g:611:1: ( rule__AndExpression__Group__0 )
            // InternalBehavior.g:611:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalBehavior.g:623:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // InternalBehavior.g:624:1: ( ruleRelationalExpression EOF )
            // InternalBehavior.g:625:1: ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalBehavior.g:632:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:636:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // InternalBehavior.g:637:1: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // InternalBehavior.g:637:1: ( ( rule__RelationalExpression__Group__0 ) )
            // InternalBehavior.g:638:1: ( rule__RelationalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            }
            // InternalBehavior.g:639:1: ( rule__RelationalExpression__Group__0 )
            // InternalBehavior.g:639:2: rule__RelationalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleOtherExpression"
    // InternalBehavior.g:651:1: entryRuleOtherExpression : ruleOtherExpression EOF ;
    public final void entryRuleOtherExpression() throws RecognitionException {
        try {
            // InternalBehavior.g:652:1: ( ruleOtherExpression EOF )
            // InternalBehavior.g:653:1: ruleOtherExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOtherExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOtherExpression"


    // $ANTLR start "ruleOtherExpression"
    // InternalBehavior.g:660:1: ruleOtherExpression : ( ( rule__OtherExpression__Group__0 ) ) ;
    public final void ruleOtherExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:664:2: ( ( ( rule__OtherExpression__Group__0 ) ) )
            // InternalBehavior.g:665:1: ( ( rule__OtherExpression__Group__0 ) )
            {
            // InternalBehavior.g:665:1: ( ( rule__OtherExpression__Group__0 ) )
            // InternalBehavior.g:666:1: ( rule__OtherExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getGroup()); 
            }
            // InternalBehavior.g:667:1: ( rule__OtherExpression__Group__0 )
            // InternalBehavior.g:667:2: rule__OtherExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OtherExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOtherExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalBehavior.g:679:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalBehavior.g:680:1: ( ruleAdditiveExpression EOF )
            // InternalBehavior.g:681:1: ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalBehavior.g:688:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:692:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalBehavior.g:693:1: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalBehavior.g:693:1: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalBehavior.g:694:1: ( rule__AdditiveExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            }
            // InternalBehavior.g:695:1: ( rule__AdditiveExpression__Group__0 )
            // InternalBehavior.g:695:2: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalBehavior.g:707:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalBehavior.g:708:1: ( ruleMultiplicativeExpression EOF )
            // InternalBehavior.g:709:1: ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalBehavior.g:716:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:720:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalBehavior.g:721:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalBehavior.g:721:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalBehavior.g:722:1: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalBehavior.g:723:1: ( rule__MultiplicativeExpression__Group__0 )
            // InternalBehavior.g:723:2: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryOperation"
    // InternalBehavior.g:735:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // InternalBehavior.g:736:1: ( ruleUnaryOperation EOF )
            // InternalBehavior.g:737:1: ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // InternalBehavior.g:744:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Alternatives ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:748:2: ( ( ( rule__UnaryOperation__Alternatives ) ) )
            // InternalBehavior.g:749:1: ( ( rule__UnaryOperation__Alternatives ) )
            {
            // InternalBehavior.g:749:1: ( ( rule__UnaryOperation__Alternatives ) )
            // InternalBehavior.g:750:1: ( rule__UnaryOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getAlternatives()); 
            }
            // InternalBehavior.g:751:1: ( rule__UnaryOperation__Alternatives )
            // InternalBehavior.g:751:2: rule__UnaryOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleCastedExpression"
    // InternalBehavior.g:763:1: entryRuleCastedExpression : ruleCastedExpression EOF ;
    public final void entryRuleCastedExpression() throws RecognitionException {
        try {
            // InternalBehavior.g:764:1: ( ruleCastedExpression EOF )
            // InternalBehavior.g:765:1: ruleCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCastedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCastedExpression"


    // $ANTLR start "ruleCastedExpression"
    // InternalBehavior.g:772:1: ruleCastedExpression : ( ( rule__CastedExpression__Group__0 ) ) ;
    public final void ruleCastedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:776:2: ( ( ( rule__CastedExpression__Group__0 ) ) )
            // InternalBehavior.g:777:1: ( ( rule__CastedExpression__Group__0 ) )
            {
            // InternalBehavior.g:777:1: ( ( rule__CastedExpression__Group__0 ) )
            // InternalBehavior.g:778:1: ( rule__CastedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getGroup()); 
            }
            // InternalBehavior.g:779:1: ( rule__CastedExpression__Group__0 )
            // InternalBehavior.g:779:2: rule__CastedExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CastedExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCastedExpression"


    // $ANTLR start "entryRulePostfixOperation"
    // InternalBehavior.g:791:1: entryRulePostfixOperation : rulePostfixOperation EOF ;
    public final void entryRulePostfixOperation() throws RecognitionException {
        try {
            // InternalBehavior.g:792:1: ( rulePostfixOperation EOF )
            // InternalBehavior.g:793:1: rulePostfixOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePostfixOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePostfixOperation"


    // $ANTLR start "rulePostfixOperation"
    // InternalBehavior.g:800:1: rulePostfixOperation : ( ( rule__PostfixOperation__Group__0 ) ) ;
    public final void rulePostfixOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:804:2: ( ( ( rule__PostfixOperation__Group__0 ) ) )
            // InternalBehavior.g:805:1: ( ( rule__PostfixOperation__Group__0 ) )
            {
            // InternalBehavior.g:805:1: ( ( rule__PostfixOperation__Group__0 ) )
            // InternalBehavior.g:806:1: ( rule__PostfixOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixOperationAccess().getGroup()); 
            }
            // InternalBehavior.g:807:1: ( rule__PostfixOperation__Group__0 )
            // InternalBehavior.g:807:2: rule__PostfixOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PostfixOperation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixOperationAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePostfixOperation"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalBehavior.g:819:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalBehavior.g:820:1: ( rulePrimaryExpression EOF )
            // InternalBehavior.g:821:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalBehavior.g:828:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:832:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalBehavior.g:833:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalBehavior.g:833:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalBehavior.g:834:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalBehavior.g:835:1: ( rule__PrimaryExpression__Alternatives )
            // InternalBehavior.g:835:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleDataQuery"
    // InternalBehavior.g:847:1: entryRuleDataQuery : ruleDataQuery EOF ;
    public final void entryRuleDataQuery() throws RecognitionException {
        try {
            // InternalBehavior.g:848:1: ( ruleDataQuery EOF )
            // InternalBehavior.g:849:1: ruleDataQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDataQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDataQuery"


    // $ANTLR start "ruleDataQuery"
    // InternalBehavior.g:856:1: ruleDataQuery : ( ( rule__DataQuery__Group__0 ) ) ;
    public final void ruleDataQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:860:2: ( ( ( rule__DataQuery__Group__0 ) ) )
            // InternalBehavior.g:861:1: ( ( rule__DataQuery__Group__0 ) )
            {
            // InternalBehavior.g:861:1: ( ( rule__DataQuery__Group__0 ) )
            // InternalBehavior.g:862:1: ( rule__DataQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataQueryAccess().getGroup()); 
            }
            // InternalBehavior.g:863:1: ( rule__DataQuery__Group__0 )
            // InternalBehavior.g:863:2: rule__DataQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataQueryAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDataQuery"


    // $ANTLR start "entryRuleQueryExpression"
    // InternalBehavior.g:875:1: entryRuleQueryExpression : ruleQueryExpression EOF ;
    public final void entryRuleQueryExpression() throws RecognitionException {
        try {
            // InternalBehavior.g:876:1: ( ruleQueryExpression EOF )
            // InternalBehavior.g:877:1: ruleQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQueryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQueryExpression"


    // $ANTLR start "ruleQueryExpression"
    // InternalBehavior.g:884:1: ruleQueryExpression : ( ( rule__QueryExpression__Group__0 ) ) ;
    public final void ruleQueryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:888:2: ( ( ( rule__QueryExpression__Group__0 ) ) )
            // InternalBehavior.g:889:1: ( ( rule__QueryExpression__Group__0 ) )
            {
            // InternalBehavior.g:889:1: ( ( rule__QueryExpression__Group__0 ) )
            // InternalBehavior.g:890:1: ( rule__QueryExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryExpressionAccess().getGroup()); 
            }
            // InternalBehavior.g:891:1: ( rule__QueryExpression__Group__0 )
            // InternalBehavior.g:891:2: rule__QueryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQueryExpression"


    // $ANTLR start "entryRuleQueryElement"
    // InternalBehavior.g:903:1: entryRuleQueryElement : ruleQueryElement EOF ;
    public final void entryRuleQueryElement() throws RecognitionException {
        try {
            // InternalBehavior.g:904:1: ( ruleQueryElement EOF )
            // InternalBehavior.g:905:1: ruleQueryElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQueryElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQueryElement"


    // $ANTLR start "ruleQueryElement"
    // InternalBehavior.g:912:1: ruleQueryElement : ( ( rule__QueryElement__Alternatives ) ) ;
    public final void ruleQueryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:916:2: ( ( ( rule__QueryElement__Alternatives ) ) )
            // InternalBehavior.g:917:1: ( ( rule__QueryElement__Alternatives ) )
            {
            // InternalBehavior.g:917:1: ( ( rule__QueryElement__Alternatives ) )
            // InternalBehavior.g:918:1: ( rule__QueryElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryElementAccess().getAlternatives()); 
            }
            // InternalBehavior.g:919:1: ( rule__QueryElement__Alternatives )
            // InternalBehavior.g:919:2: rule__QueryElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QueryElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryElementAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleQueryElement"


    // $ANTLR start "entryRuleTypedValueReference"
    // InternalBehavior.g:931:1: entryRuleTypedValueReference : ruleTypedValueReference EOF ;
    public final void entryRuleTypedValueReference() throws RecognitionException {
        try {
            // InternalBehavior.g:932:1: ( ruleTypedValueReference EOF )
            // InternalBehavior.g:933:1: ruleTypedValueReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedValueReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypedValueReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedValueReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypedValueReference"


    // $ANTLR start "ruleTypedValueReference"
    // InternalBehavior.g:940:1: ruleTypedValueReference : ( ( rule__TypedValueReference__TypedValueAssignment ) ) ;
    public final void ruleTypedValueReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:944:2: ( ( ( rule__TypedValueReference__TypedValueAssignment ) ) )
            // InternalBehavior.g:945:1: ( ( rule__TypedValueReference__TypedValueAssignment ) )
            {
            // InternalBehavior.g:945:1: ( ( rule__TypedValueReference__TypedValueAssignment ) )
            // InternalBehavior.g:946:1: ( rule__TypedValueReference__TypedValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedValueReferenceAccess().getTypedValueAssignment()); 
            }
            // InternalBehavior.g:947:1: ( rule__TypedValueReference__TypedValueAssignment )
            // InternalBehavior.g:947:2: rule__TypedValueReference__TypedValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypedValueReference__TypedValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedValueReferenceAccess().getTypedValueAssignment()); 
            }

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
    // $ANTLR end "ruleTypedValueReference"


    // $ANTLR start "entryRuleInstantiationExpression"
    // InternalBehavior.g:959:1: entryRuleInstantiationExpression : ruleInstantiationExpression EOF ;
    public final void entryRuleInstantiationExpression() throws RecognitionException {
        try {
            // InternalBehavior.g:960:1: ( ruleInstantiationExpression EOF )
            // InternalBehavior.g:961:1: ruleInstantiationExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstantiationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInstantiationExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstantiationExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInstantiationExpression"


    // $ANTLR start "ruleInstantiationExpression"
    // InternalBehavior.g:968:1: ruleInstantiationExpression : ( ( rule__InstantiationExpression__Group__0 ) ) ;
    public final void ruleInstantiationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:972:2: ( ( ( rule__InstantiationExpression__Group__0 ) ) )
            // InternalBehavior.g:973:1: ( ( rule__InstantiationExpression__Group__0 ) )
            {
            // InternalBehavior.g:973:1: ( ( rule__InstantiationExpression__Group__0 ) )
            // InternalBehavior.g:974:1: ( rule__InstantiationExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstantiationExpressionAccess().getGroup()); 
            }
            // InternalBehavior.g:975:1: ( rule__InstantiationExpression__Group__0 )
            // InternalBehavior.g:975:2: rule__InstantiationExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstantiationExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstantiationExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleInstantiationExpression"


    // $ANTLR start "entryRuleDeclarationTypeReference"
    // InternalBehavior.g:987:1: entryRuleDeclarationTypeReference : ruleDeclarationTypeReference EOF ;
    public final void entryRuleDeclarationTypeReference() throws RecognitionException {
        try {
            // InternalBehavior.g:988:1: ( ruleDeclarationTypeReference EOF )
            // InternalBehavior.g:989:1: ruleDeclarationTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclarationTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclarationTypeReference"


    // $ANTLR start "ruleDeclarationTypeReference"
    // InternalBehavior.g:996:1: ruleDeclarationTypeReference : ( ( rule__DeclarationTypeReference__Alternatives ) ) ;
    public final void ruleDeclarationTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1000:2: ( ( ( rule__DeclarationTypeReference__Alternatives ) ) )
            // InternalBehavior.g:1001:1: ( ( rule__DeclarationTypeReference__Alternatives ) )
            {
            // InternalBehavior.g:1001:1: ( ( rule__DeclarationTypeReference__Alternatives ) )
            // InternalBehavior.g:1002:1: ( rule__DeclarationTypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationTypeReferenceAccess().getAlternatives()); 
            }
            // InternalBehavior.g:1003:1: ( rule__DeclarationTypeReference__Alternatives )
            // InternalBehavior.g:1003:2: rule__DeclarationTypeReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeclarationTypeReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationTypeReferenceAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleDeclarationTypeReference"


    // $ANTLR start "entryRuleTypeReference"
    // InternalBehavior.g:1015:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalBehavior.g:1016:1: ( ruleTypeReference EOF )
            // InternalBehavior.g:1017:1: ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalBehavior.g:1024:1: ruleTypeReference : ( ( rule__TypeReference__ReferenceAssignment ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1028:2: ( ( ( rule__TypeReference__ReferenceAssignment ) ) )
            // InternalBehavior.g:1029:1: ( ( rule__TypeReference__ReferenceAssignment ) )
            {
            // InternalBehavior.g:1029:1: ( ( rule__TypeReference__ReferenceAssignment ) )
            // InternalBehavior.g:1030:1: ( rule__TypeReference__ReferenceAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getReferenceAssignment()); 
            }
            // InternalBehavior.g:1031:1: ( rule__TypeReference__ReferenceAssignment )
            // InternalBehavior.g:1031:2: rule__TypeReference__ReferenceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__ReferenceAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getReferenceAssignment()); 
            }

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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleCollectionType"
    // InternalBehavior.g:1043:1: entryRuleCollectionType : ruleCollectionType EOF ;
    public final void entryRuleCollectionType() throws RecognitionException {
        try {
            // InternalBehavior.g:1044:1: ( ruleCollectionType EOF )
            // InternalBehavior.g:1045:1: ruleCollectionType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCollectionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalBehavior.g:1052:1: ruleCollectionType : ( ( rule__CollectionType__Group__0 ) ) ;
    public final void ruleCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1056:2: ( ( ( rule__CollectionType__Group__0 ) ) )
            // InternalBehavior.g:1057:1: ( ( rule__CollectionType__Group__0 ) )
            {
            // InternalBehavior.g:1057:1: ( ( rule__CollectionType__Group__0 ) )
            // InternalBehavior.g:1058:1: ( rule__CollectionType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionTypeAccess().getGroup()); 
            }
            // InternalBehavior.g:1059:1: ( rule__CollectionType__Group__0 )
            // InternalBehavior.g:1059:2: rule__CollectionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionTypeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleMapType"
    // InternalBehavior.g:1071:1: entryRuleMapType : ruleMapType EOF ;
    public final void entryRuleMapType() throws RecognitionException {
        try {
            // InternalBehavior.g:1072:1: ( ruleMapType EOF )
            // InternalBehavior.g:1073:1: ruleMapType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMapType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // InternalBehavior.g:1080:1: ruleMapType : ( ( rule__MapType__Group__0 ) ) ;
    public final void ruleMapType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1084:2: ( ( ( rule__MapType__Group__0 ) ) )
            // InternalBehavior.g:1085:1: ( ( rule__MapType__Group__0 ) )
            {
            // InternalBehavior.g:1085:1: ( ( rule__MapType__Group__0 ) )
            // InternalBehavior.g:1086:1: ( rule__MapType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTypeAccess().getGroup()); 
            }
            // InternalBehavior.g:1087:1: ( rule__MapType__Group__0 )
            // InternalBehavior.g:1087:2: rule__MapType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTypeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleLiteral"
    // InternalBehavior.g:1099:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalBehavior.g:1100:1: ( ruleLiteral EOF )
            // InternalBehavior.g:1101:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalBehavior.g:1108:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1112:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalBehavior.g:1113:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalBehavior.g:1113:1: ( ( rule__Literal__Alternatives ) )
            // InternalBehavior.g:1114:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalBehavior.g:1115:1: ( rule__Literal__Alternatives )
            // InternalBehavior.g:1115:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalBehavior.g:1127:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalBehavior.g:1128:1: ( ruleStringLiteral EOF )
            // InternalBehavior.g:1129:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalBehavior.g:1136:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1140:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalBehavior.g:1141:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalBehavior.g:1141:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalBehavior.g:1142:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // InternalBehavior.g:1143:1: ( rule__StringLiteral__ValueAssignment )
            // InternalBehavior.g:1143:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleCharLiteral"
    // InternalBehavior.g:1155:1: entryRuleCharLiteral : ruleCharLiteral EOF ;
    public final void entryRuleCharLiteral() throws RecognitionException {
        try {
            // InternalBehavior.g:1156:1: ( ruleCharLiteral EOF )
            // InternalBehavior.g:1157:1: ruleCharLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCharLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // InternalBehavior.g:1164:1: ruleCharLiteral : ( ( rule__CharLiteral__ValueAssignment ) ) ;
    public final void ruleCharLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1168:2: ( ( ( rule__CharLiteral__ValueAssignment ) ) )
            // InternalBehavior.g:1169:1: ( ( rule__CharLiteral__ValueAssignment ) )
            {
            // InternalBehavior.g:1169:1: ( ( rule__CharLiteral__ValueAssignment ) )
            // InternalBehavior.g:1170:1: ( rule__CharLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharLiteralAccess().getValueAssignment()); 
            }
            // InternalBehavior.g:1171:1: ( rule__CharLiteral__ValueAssignment )
            // InternalBehavior.g:1171:2: rule__CharLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CharLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharLiteralAccess().getValueAssignment()); 
            }

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
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalBehavior.g:1183:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalBehavior.g:1184:1: ( ruleNumberLiteral EOF )
            // InternalBehavior.g:1185:1: ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalBehavior.g:1192:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1196:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalBehavior.g:1197:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalBehavior.g:1197:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalBehavior.g:1198:1: ( rule__NumberLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            }
            // InternalBehavior.g:1199:1: ( rule__NumberLiteral__ValueAssignment )
            // InternalBehavior.g:1199:2: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            }

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalBehavior.g:1211:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalBehavior.g:1212:1: ( ruleBooleanLiteral EOF )
            // InternalBehavior.g:1213:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalBehavior.g:1220:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1224:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // InternalBehavior.g:1225:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // InternalBehavior.g:1225:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // InternalBehavior.g:1226:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // InternalBehavior.g:1227:1: ( rule__BooleanLiteral__ValueAssignment )
            // InternalBehavior.g:1227:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalBehavior.g:1239:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalBehavior.g:1240:1: ( ruleQualifiedName EOF )
            // InternalBehavior.g:1241:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalBehavior.g:1248:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1252:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalBehavior.g:1253:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalBehavior.g:1253:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalBehavior.g:1254:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalBehavior.g:1255:1: ( rule__QualifiedName__Group__0 )
            // InternalBehavior.g:1255:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalBehavior.g:1267:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalBehavior.g:1268:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalBehavior.g:1269:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalBehavior.g:1276:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1280:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalBehavior.g:1281:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalBehavior.g:1281:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalBehavior.g:1282:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalBehavior.g:1283:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalBehavior.g:1283:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalBehavior.g:1295:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalBehavior.g:1296:1: ( ruleBOOLEAN EOF )
            // InternalBehavior.g:1297:1: ruleBOOLEAN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEANRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEANRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalBehavior.g:1304:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1308:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // InternalBehavior.g:1309:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // InternalBehavior.g:1309:1: ( ( rule__BOOLEAN__Alternatives ) )
            // InternalBehavior.g:1310:1: ( rule__BOOLEAN__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            }
            // InternalBehavior.g:1311:1: ( rule__BOOLEAN__Alternatives )
            // InternalBehavior.g:1311:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOLEAN__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleNUMBER"
    // InternalBehavior.g:1323:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalBehavior.g:1324:1: ( ruleNUMBER EOF )
            // InternalBehavior.g:1325:1: ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalBehavior.g:1332:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1336:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // InternalBehavior.g:1337:1: ( ( rule__NUMBER__Alternatives ) )
            {
            // InternalBehavior.g:1337:1: ( ( rule__NUMBER__Alternatives ) )
            // InternalBehavior.g:1338:1: ( rule__NUMBER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            }
            // InternalBehavior.g:1339:1: ( rule__NUMBER__Alternatives )
            // InternalBehavior.g:1339:2: rule__NUMBER__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "ruleComponentKind"
    // InternalBehavior.g:1352:1: ruleComponentKind : ( ( rule__ComponentKind__Alternatives ) ) ;
    public final void ruleComponentKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1356:1: ( ( ( rule__ComponentKind__Alternatives ) ) )
            // InternalBehavior.g:1357:1: ( ( rule__ComponentKind__Alternatives ) )
            {
            // InternalBehavior.g:1357:1: ( ( rule__ComponentKind__Alternatives ) )
            // InternalBehavior.g:1358:1: ( rule__ComponentKind__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentKindAccess().getAlternatives()); 
            }
            // InternalBehavior.g:1359:1: ( rule__ComponentKind__Alternatives )
            // InternalBehavior.g:1359:2: rule__ComponentKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComponentKind__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentKindAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleComponentKind"


    // $ANTLR start "ruleDataAccessOperation"
    // InternalBehavior.g:1371:1: ruleDataAccessOperation : ( ( rule__DataAccessOperation__Alternatives ) ) ;
    public final void ruleDataAccessOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1375:1: ( ( ( rule__DataAccessOperation__Alternatives ) ) )
            // InternalBehavior.g:1376:1: ( ( rule__DataAccessOperation__Alternatives ) )
            {
            // InternalBehavior.g:1376:1: ( ( rule__DataAccessOperation__Alternatives ) )
            // InternalBehavior.g:1377:1: ( rule__DataAccessOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataAccessOperationAccess().getAlternatives()); 
            }
            // InternalBehavior.g:1378:1: ( rule__DataAccessOperation__Alternatives )
            // InternalBehavior.g:1378:2: rule__DataAccessOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataAccessOperationAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleDataAccessOperation"


    // $ANTLR start "rule__BehaviorModel__Alternatives_2"
    // InternalBehavior.g:1389:1: rule__BehaviorModel__Alternatives_2 : ( ( ( rule__BehaviorModel__ImportsAssignment_2_0 ) ) | ( ( rule__BehaviorModel__RepositoriesAssignment_2_1 ) ) );
    public final void rule__BehaviorModel__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1393:1: ( ( ( rule__BehaviorModel__ImportsAssignment_2_0 ) ) | ( ( rule__BehaviorModel__RepositoriesAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==38) ) {
                alt1=1;
            }
            else if ( (LA1_0==37) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBehavior.g:1394:1: ( ( rule__BehaviorModel__ImportsAssignment_2_0 ) )
                    {
                    // InternalBehavior.g:1394:1: ( ( rule__BehaviorModel__ImportsAssignment_2_0 ) )
                    // InternalBehavior.g:1395:1: ( rule__BehaviorModel__ImportsAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBehaviorModelAccess().getImportsAssignment_2_0()); 
                    }
                    // InternalBehavior.g:1396:1: ( rule__BehaviorModel__ImportsAssignment_2_0 )
                    // InternalBehavior.g:1396:2: rule__BehaviorModel__ImportsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviorModel__ImportsAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBehaviorModelAccess().getImportsAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1400:6: ( ( rule__BehaviorModel__RepositoriesAssignment_2_1 ) )
                    {
                    // InternalBehavior.g:1400:6: ( ( rule__BehaviorModel__RepositoriesAssignment_2_1 ) )
                    // InternalBehavior.g:1401:1: ( rule__BehaviorModel__RepositoriesAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBehaviorModelAccess().getRepositoriesAssignment_2_1()); 
                    }
                    // InternalBehavior.g:1402:1: ( rule__BehaviorModel__RepositoriesAssignment_2_1 )
                    // InternalBehavior.g:1402:2: rule__BehaviorModel__RepositoriesAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviorModel__RepositoriesAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBehaviorModelAccess().getRepositoriesAssignment_2_1()); 
                    }

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
    // $ANTLR end "rule__BehaviorModel__Alternatives_2"


    // $ANTLR start "rule__ComponentImpl__LocalDeclarationsAlternatives_4_0"
    // InternalBehavior.g:1411:1: rule__ComponentImpl__LocalDeclarationsAlternatives_4_0 : ( ( ruleVariableDecl ) | ( ruleConstantDecl ) );
    public final void rule__ComponentImpl__LocalDeclarationsAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1415:1: ( ( ruleVariableDecl ) | ( ruleConstantDecl ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( (LA2_0==45) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBehavior.g:1416:1: ( ruleVariableDecl )
                    {
                    // InternalBehavior.g:1416:1: ( ruleVariableDecl )
                    // InternalBehavior.g:1417:1: ruleVariableDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentImplAccess().getLocalDeclarationsVariableDeclParserRuleCall_4_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentImplAccess().getLocalDeclarationsVariableDeclParserRuleCall_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1422:6: ( ruleConstantDecl )
                    {
                    // InternalBehavior.g:1422:6: ( ruleConstantDecl )
                    // InternalBehavior.g:1423:1: ruleConstantDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentImplAccess().getLocalDeclarationsConstantDeclParserRuleCall_4_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConstantDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentImplAccess().getLocalDeclarationsConstantDeclParserRuleCall_4_0_1()); 
                    }

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
    // $ANTLR end "rule__ComponentImpl__LocalDeclarationsAlternatives_4_0"


    // $ANTLR start "rule__VariableDecl__ModifierAlternatives_0_0"
    // InternalBehavior.g:1433:1: rule__VariableDecl__ModifierAlternatives_0_0 : ( ( 'var' ) | ( 'val' ) );
    public final void rule__VariableDecl__ModifierAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1437:1: ( ( 'var' ) | ( 'val' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBehavior.g:1438:1: ( 'var' )
                    {
                    // InternalBehavior.g:1438:1: ( 'var' )
                    // InternalBehavior.g:1439:1: 'var'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableDeclAccess().getModifierVarKeyword_0_0_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableDeclAccess().getModifierVarKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1446:6: ( 'val' )
                    {
                    // InternalBehavior.g:1446:6: ( 'val' )
                    // InternalBehavior.g:1447:1: 'val'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableDeclAccess().getModifierValKeyword_0_0_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableDeclAccess().getModifierValKeyword_0_0_1()); 
                    }

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
    // $ANTLR end "rule__VariableDecl__ModifierAlternatives_0_0"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalBehavior.g:1459:1: rule__Statement__Alternatives : ( ( ruleIfStatement ) | ( ruleAssignment ) | ( ruleLoopStatement ) | ( ruleDataAccessStatement ) | ( ruleReturnStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1463:1: ( ( ruleIfStatement ) | ( ruleAssignment ) | ( ruleLoopStatement ) | ( ruleDataAccessStatement ) | ( ruleReturnStatement ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 53:
                {
                alt4=3;
                }
                break;
            case 33:
            case 34:
            case 35:
                {
                alt4=4;
                }
                break;
            case 55:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBehavior.g:1464:1: ( ruleIfStatement )
                    {
                    // InternalBehavior.g:1464:1: ( ruleIfStatement )
                    // InternalBehavior.g:1465:1: ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1470:6: ( ruleAssignment )
                    {
                    // InternalBehavior.g:1470:6: ( ruleAssignment )
                    // InternalBehavior.g:1471:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:1476:6: ( ruleLoopStatement )
                    {
                    // InternalBehavior.g:1476:6: ( ruleLoopStatement )
                    // InternalBehavior.g:1477:1: ruleLoopStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLoopStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBehavior.g:1482:6: ( ruleDataAccessStatement )
                    {
                    // InternalBehavior.g:1482:6: ( ruleDataAccessStatement )
                    // InternalBehavior.g:1483:1: ruleDataAccessStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getDataAccessStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDataAccessStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getDataAccessStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBehavior.g:1488:6: ( ruleReturnStatement )
                    {
                    // InternalBehavior.g:1488:6: ( ruleReturnStatement )
                    // InternalBehavior.g:1489:1: ruleReturnStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_4()); 
                    }

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0"
    // InternalBehavior.g:1499:1: rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0 : ( ( '==' ) | ( '!=' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) );
    public final void rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1503:1: ( ( '==' ) | ( '!=' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            case 19:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBehavior.g:1504:1: ( '==' )
                    {
                    // InternalBehavior.g:1504:1: ( '==' )
                    // InternalBehavior.g:1505:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getFeatureEqualsSignEqualsSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getFeatureEqualsSignEqualsSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1512:6: ( '!=' )
                    {
                    // InternalBehavior.g:1512:6: ( '!=' )
                    // InternalBehavior.g:1513:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getFeatureExclamationMarkEqualsSignKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getFeatureExclamationMarkEqualsSignKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:1520:6: ( '>' )
                    {
                    // InternalBehavior.g:1520:6: ( '>' )
                    // InternalBehavior.g:1521:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getFeatureGreaterThanSignKeyword_1_0_0_1_0_2()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getFeatureGreaterThanSignKeyword_1_0_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBehavior.g:1528:6: ( '<' )
                    {
                    // InternalBehavior.g:1528:6: ( '<' )
                    // InternalBehavior.g:1529:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getFeatureLessThanSignKeyword_1_0_0_1_0_3()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getFeatureLessThanSignKeyword_1_0_0_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalBehavior.g:1536:6: ( '>=' )
                    {
                    // InternalBehavior.g:1536:6: ( '>=' )
                    // InternalBehavior.g:1537:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getFeatureGreaterThanSignEqualsSignKeyword_1_0_0_1_0_4()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getFeatureGreaterThanSignEqualsSignKeyword_1_0_0_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalBehavior.g:1544:6: ( '<=' )
                    {
                    // InternalBehavior.g:1544:6: ( '<=' )
                    // InternalBehavior.g:1545:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getFeatureLessThanSignEqualsSignKeyword_1_0_0_1_0_5()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getFeatureLessThanSignEqualsSignKeyword_1_0_0_1_0_5()); 
                    }

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
    // $ANTLR end "rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0"


    // $ANTLR start "rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0"
    // InternalBehavior.g:1557:1: rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1561:1: ( ( '+' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBehavior.g:1562:1: ( '+' )
                    {
                    // InternalBehavior.g:1562:1: ( '+' )
                    // InternalBehavior.g:1563:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveExpressionAccess().getFeaturePlusSignKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveExpressionAccess().getFeaturePlusSignKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1570:6: ( '-' )
                    {
                    // InternalBehavior.g:1570:6: ( '-' )
                    // InternalBehavior.g:1571:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveExpressionAccess().getFeatureHyphenMinusKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveExpressionAccess().getFeatureHyphenMinusKeyword_1_0_0_1_0_1()); 
                    }

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
    // $ANTLR end "rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0"


    // $ANTLR start "rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0"
    // InternalBehavior.g:1583:1: rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) | ( '**' ) );
    public final void rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1587:1: ( ( '*' ) | ( '/' ) | ( '%' ) | ( '**' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBehavior.g:1588:1: ( '*' )
                    {
                    // InternalBehavior.g:1588:1: ( '*' )
                    // InternalBehavior.g:1589:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getFeatureAsteriskKeyword_1_0_0_1_0_0()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getFeatureAsteriskKeyword_1_0_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1596:6: ( '/' )
                    {
                    // InternalBehavior.g:1596:6: ( '/' )
                    // InternalBehavior.g:1597:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getFeatureSolidusKeyword_1_0_0_1_0_1()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getFeatureSolidusKeyword_1_0_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:1604:6: ( '%' )
                    {
                    // InternalBehavior.g:1604:6: ( '%' )
                    // InternalBehavior.g:1605:1: '%'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getFeaturePercentSignKeyword_1_0_0_1_0_2()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getFeaturePercentSignKeyword_1_0_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBehavior.g:1612:6: ( '**' )
                    {
                    // InternalBehavior.g:1612:6: ( '**' )
                    // InternalBehavior.g:1613:1: '**'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getFeatureAsteriskAsteriskKeyword_1_0_0_1_0_3()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getFeatureAsteriskAsteriskKeyword_1_0_0_1_0_3()); 
                    }

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
    // $ANTLR end "rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0"


    // $ANTLR start "rule__UnaryOperation__Alternatives"
    // InternalBehavior.g:1625:1: rule__UnaryOperation__Alternatives : ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( ruleCastedExpression ) );
    public final void rule__UnaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1629:1: ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( ruleCastedExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==65) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_CHARACTER)||(LA8_0>=20 && LA8_0<=21)||(LA8_0>=28 && LA8_0<=29)||LA8_0==59||LA8_0==61) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBehavior.g:1630:1: ( ( rule__UnaryOperation__Group_0__0 ) )
                    {
                    // InternalBehavior.g:1630:1: ( ( rule__UnaryOperation__Group_0__0 ) )
                    // InternalBehavior.g:1631:1: ( rule__UnaryOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getGroup_0()); 
                    }
                    // InternalBehavior.g:1632:1: ( rule__UnaryOperation__Group_0__0 )
                    // InternalBehavior.g:1632:2: rule__UnaryOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryOperation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1636:6: ( ruleCastedExpression )
                    {
                    // InternalBehavior.g:1636:6: ( ruleCastedExpression )
                    // InternalBehavior.g:1637:1: ruleCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getCastedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCastedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperationAccess().getCastedExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__UnaryOperation__Alternatives"


    // $ANTLR start "rule__PostfixOperation__FeatureAlternatives_1_0_1_0"
    // InternalBehavior.g:1647:1: rule__PostfixOperation__FeatureAlternatives_1_0_1_0 : ( ( '++' ) | ( '--' ) );
    public final void rule__PostfixOperation__FeatureAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1651:1: ( ( '++' ) | ( '--' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBehavior.g:1652:1: ( '++' )
                    {
                    // InternalBehavior.g:1652:1: ( '++' )
                    // InternalBehavior.g:1653:1: '++'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPostfixOperationAccess().getFeaturePlusSignPlusSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPostfixOperationAccess().getFeaturePlusSignPlusSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1660:6: ( '--' )
                    {
                    // InternalBehavior.g:1660:6: ( '--' )
                    // InternalBehavior.g:1661:1: '--'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPostfixOperationAccess().getFeatureHyphenMinusHyphenMinusKeyword_1_0_1_0_1()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPostfixOperationAccess().getFeatureHyphenMinusHyphenMinusKeyword_1_0_1_0_1()); 
                    }

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
    // $ANTLR end "rule__PostfixOperation__FeatureAlternatives_1_0_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalBehavior.g:1673:1: rule__PrimaryExpression__Alternatives : ( ( ruleInstantiationExpression ) | ( ruleVariableCall ) | ( ruleDataQuery ) | ( ruleLiteral ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1677:1: ( ( ruleInstantiationExpression ) | ( ruleVariableCall ) | ( ruleDataQuery ) | ( ruleLiteral ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case 59:
                {
                alt10=3;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_CHARACTER:
            case 20:
            case 21:
            case 28:
            case 29:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBehavior.g:1678:1: ( ruleInstantiationExpression )
                    {
                    // InternalBehavior.g:1678:1: ( ruleInstantiationExpression )
                    // InternalBehavior.g:1679:1: ruleInstantiationExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getInstantiationExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInstantiationExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getInstantiationExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1684:6: ( ruleVariableCall )
                    {
                    // InternalBehavior.g:1684:6: ( ruleVariableCall )
                    // InternalBehavior.g:1685:1: ruleVariableCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getVariableCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariableCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getVariableCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:1690:6: ( ruleDataQuery )
                    {
                    // InternalBehavior.g:1690:6: ( ruleDataQuery )
                    // InternalBehavior.g:1691:1: ruleDataQuery
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getDataQueryParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDataQuery();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getDataQueryParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBehavior.g:1696:6: ( ruleLiteral )
                    {
                    // InternalBehavior.g:1696:6: ( ruleLiteral )
                    // InternalBehavior.g:1697:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__QueryElement__Alternatives"
    // InternalBehavior.g:1707:1: rule__QueryElement__Alternatives : ( ( ruleStringLiteral ) | ( ruleTypedValueReference ) );
    public final void rule__QueryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1711:1: ( ( ruleStringLiteral ) | ( ruleTypedValueReference ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBehavior.g:1712:1: ( ruleStringLiteral )
                    {
                    // InternalBehavior.g:1712:1: ( ruleStringLiteral )
                    // InternalBehavior.g:1713:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryElementAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryElementAccess().getStringLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1718:6: ( ruleTypedValueReference )
                    {
                    // InternalBehavior.g:1718:6: ( ruleTypedValueReference )
                    // InternalBehavior.g:1719:1: ruleTypedValueReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryElementAccess().getTypedValueReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypedValueReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryElementAccess().getTypedValueReferenceParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__QueryElement__Alternatives"


    // $ANTLR start "rule__DeclarationTypeReference__Alternatives"
    // InternalBehavior.g:1729:1: rule__DeclarationTypeReference__Alternatives : ( ( ruleTypeReference ) | ( ruleCollectionType ) | ( ruleMapType ) );
    public final void rule__DeclarationTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1733:1: ( ( ruleTypeReference ) | ( ruleCollectionType ) | ( ruleMapType ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt12=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                    {
                    alt12=1;
                    }
                    break;
                case 56:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBehavior.g:1734:1: ( ruleTypeReference )
                    {
                    // InternalBehavior.g:1734:1: ( ruleTypeReference )
                    // InternalBehavior.g:1735:1: ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationTypeReferenceAccess().getTypeReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationTypeReferenceAccess().getTypeReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1740:6: ( ruleCollectionType )
                    {
                    // InternalBehavior.g:1740:6: ( ruleCollectionType )
                    // InternalBehavior.g:1741:1: ruleCollectionType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationTypeReferenceAccess().getCollectionTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCollectionType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationTypeReferenceAccess().getCollectionTypeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:1746:6: ( ruleMapType )
                    {
                    // InternalBehavior.g:1746:6: ( ruleMapType )
                    // InternalBehavior.g:1747:1: ruleMapType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMapType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__DeclarationTypeReference__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalBehavior.g:1757:1: rule__Literal__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleCharLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1761:1: ( ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleCharLiteral ) | ( ruleStringLiteral ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
            case 20:
            case 21:
                {
                alt13=2;
                }
                break;
            case RULE_CHARACTER:
                {
                alt13=3;
                }
                break;
            case RULE_STRING:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalBehavior.g:1762:1: ( ruleBooleanLiteral )
                    {
                    // InternalBehavior.g:1762:1: ( ruleBooleanLiteral )
                    // InternalBehavior.g:1763:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1768:6: ( ruleNumberLiteral )
                    {
                    // InternalBehavior.g:1768:6: ( ruleNumberLiteral )
                    // InternalBehavior.g:1769:1: ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:1774:6: ( ruleCharLiteral )
                    {
                    // InternalBehavior.g:1774:6: ( ruleCharLiteral )
                    // InternalBehavior.g:1775:1: ruleCharLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCharLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBehavior.g:1780:6: ( ruleStringLiteral )
                    {
                    // InternalBehavior.g:1780:6: ( ruleStringLiteral )
                    // InternalBehavior.g:1781:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // InternalBehavior.g:1791:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1795:1: ( ( 'true' ) | ( 'false' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBehavior.g:1796:1: ( 'true' )
                    {
                    // InternalBehavior.g:1796:1: ( 'true' )
                    // InternalBehavior.g:1797:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1804:6: ( 'false' )
                    {
                    // InternalBehavior.g:1804:6: ( 'false' )
                    // InternalBehavior.g:1805:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    }

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
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives"
    // InternalBehavior.g:1817:1: rule__NUMBER__Alternatives : ( ( ( rule__NUMBER__Group_0__0 ) ) | ( ( rule__NUMBER__Group_1__0 ) ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1821:1: ( ( ( rule__NUMBER__Group_0__0 ) ) | ( ( rule__NUMBER__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=20 && LA15_0<=21)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==58) ) {
                    alt15=2;
                }
                else if ( (LA15_2==EOF||LA15_2==RULE_ID||(LA15_2>=12 && LA15_2<=27)||(LA15_2>=33 && LA15_2<=35)||(LA15_2>=41 && LA15_2<=43)||LA15_2==45||LA15_2==47||LA15_2==49||LA15_2==51||LA15_2==53||LA15_2==55||LA15_2==57||(LA15_2>=62 && LA15_2<=64)||LA15_2==66) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalBehavior.g:1822:1: ( ( rule__NUMBER__Group_0__0 ) )
                    {
                    // InternalBehavior.g:1822:1: ( ( rule__NUMBER__Group_0__0 ) )
                    // InternalBehavior.g:1823:1: ( rule__NUMBER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNUMBERAccess().getGroup_0()); 
                    }
                    // InternalBehavior.g:1824:1: ( rule__NUMBER__Group_0__0 )
                    // InternalBehavior.g:1824:2: rule__NUMBER__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNUMBERAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1828:6: ( ( rule__NUMBER__Group_1__0 ) )
                    {
                    // InternalBehavior.g:1828:6: ( ( rule__NUMBER__Group_1__0 ) )
                    // InternalBehavior.g:1829:1: ( rule__NUMBER__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNUMBERAccess().getGroup_1()); 
                    }
                    // InternalBehavior.g:1830:1: ( rule__NUMBER__Group_1__0 )
                    // InternalBehavior.g:1830:2: rule__NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNUMBERAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__NUMBER__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives_0_0"
    // InternalBehavior.g:1839:1: rule__NUMBER__Alternatives_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__NUMBER__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1843:1: ( ( '+' ) | ( '-' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            else if ( (LA16_0==21) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalBehavior.g:1844:1: ( '+' )
                    {
                    // InternalBehavior.g:1844:1: ( '+' )
                    // InternalBehavior.g:1845:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNUMBERAccess().getPlusSignKeyword_0_0_0()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNUMBERAccess().getPlusSignKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1852:6: ( '-' )
                    {
                    // InternalBehavior.g:1852:6: ( '-' )
                    // InternalBehavior.g:1853:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0_0_1()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0_0_1()); 
                    }

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
    // $ANTLR end "rule__NUMBER__Alternatives_0_0"


    // $ANTLR start "rule__ComponentKind__Alternatives"
    // InternalBehavior.g:1865:1: rule__ComponentKind__Alternatives : ( ( ( 'stateless' ) ) | ( ( 'stateful' ) ) | ( ( 'singleton' ) ) );
    public final void rule__ComponentKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1869:1: ( ( ( 'stateless' ) ) | ( ( 'stateful' ) ) | ( ( 'singleton' ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalBehavior.g:1870:1: ( ( 'stateless' ) )
                    {
                    // InternalBehavior.g:1870:1: ( ( 'stateless' ) )
                    // InternalBehavior.g:1871:1: ( 'stateless' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentKindAccess().getSTATELESSEnumLiteralDeclaration_0()); 
                    }
                    // InternalBehavior.g:1872:1: ( 'stateless' )
                    // InternalBehavior.g:1872:3: 'stateless'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentKindAccess().getSTATELESSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1877:6: ( ( 'stateful' ) )
                    {
                    // InternalBehavior.g:1877:6: ( ( 'stateful' ) )
                    // InternalBehavior.g:1878:1: ( 'stateful' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentKindAccess().getSTATEFULEnumLiteralDeclaration_1()); 
                    }
                    // InternalBehavior.g:1879:1: ( 'stateful' )
                    // InternalBehavior.g:1879:3: 'stateful'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentKindAccess().getSTATEFULEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:1884:6: ( ( 'singleton' ) )
                    {
                    // InternalBehavior.g:1884:6: ( ( 'singleton' ) )
                    // InternalBehavior.g:1885:1: ( 'singleton' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComponentKindAccess().getSINGLETONEnumLiteralDeclaration_2()); 
                    }
                    // InternalBehavior.g:1886:1: ( 'singleton' )
                    // InternalBehavior.g:1886:3: 'singleton'
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComponentKindAccess().getSINGLETONEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__ComponentKind__Alternatives"


    // $ANTLR start "rule__DataAccessOperation__Alternatives"
    // InternalBehavior.g:1896:1: rule__DataAccessOperation__Alternatives : ( ( ( 'store' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) );
    public final void rule__DataAccessOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1900:1: ( ( ( 'store' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalBehavior.g:1901:1: ( ( 'store' ) )
                    {
                    // InternalBehavior.g:1901:1: ( ( 'store' ) )
                    // InternalBehavior.g:1902:1: ( 'store' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataAccessOperationAccess().getSTOREEnumLiteralDeclaration_0()); 
                    }
                    // InternalBehavior.g:1903:1: ( 'store' )
                    // InternalBehavior.g:1903:3: 'store'
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataAccessOperationAccess().getSTOREEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:1908:6: ( ( 'update' ) )
                    {
                    // InternalBehavior.g:1908:6: ( ( 'update' ) )
                    // InternalBehavior.g:1909:1: ( 'update' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataAccessOperationAccess().getUPDATEEnumLiteralDeclaration_1()); 
                    }
                    // InternalBehavior.g:1910:1: ( 'update' )
                    // InternalBehavior.g:1910:3: 'update'
                    {
                    match(input,34,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataAccessOperationAccess().getUPDATEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:1915:6: ( ( 'delete' ) )
                    {
                    // InternalBehavior.g:1915:6: ( ( 'delete' ) )
                    // InternalBehavior.g:1916:1: ( 'delete' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataAccessOperationAccess().getDELETEEnumLiteralDeclaration_2()); 
                    }
                    // InternalBehavior.g:1917:1: ( 'delete' )
                    // InternalBehavior.g:1917:3: 'delete'
                    {
                    match(input,35,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataAccessOperationAccess().getDELETEEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__DataAccessOperation__Alternatives"


    // $ANTLR start "rule__BehaviorModel__Group__0"
    // InternalBehavior.g:1929:1: rule__BehaviorModel__Group__0 : rule__BehaviorModel__Group__0__Impl rule__BehaviorModel__Group__1 ;
    public final void rule__BehaviorModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1933:1: ( rule__BehaviorModel__Group__0__Impl rule__BehaviorModel__Group__1 )
            // InternalBehavior.g:1934:2: rule__BehaviorModel__Group__0__Impl rule__BehaviorModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BehaviorModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BehaviorModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorModel__Group__0"


    // $ANTLR start "rule__BehaviorModel__Group__0__Impl"
    // InternalBehavior.g:1941:1: rule__BehaviorModel__Group__0__Impl : ( 'package' ) ;
    public final void rule__BehaviorModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1945:1: ( ( 'package' ) )
            // InternalBehavior.g:1946:1: ( 'package' )
            {
            // InternalBehavior.g:1946:1: ( 'package' )
            // InternalBehavior.g:1947:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorModelAccess().getPackageKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorModelAccess().getPackageKeyword_0()); 
            }

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
    // $ANTLR end "rule__BehaviorModel__Group__0__Impl"


    // $ANTLR start "rule__BehaviorModel__Group__1"
    // InternalBehavior.g:1960:1: rule__BehaviorModel__Group__1 : rule__BehaviorModel__Group__1__Impl rule__BehaviorModel__Group__2 ;
    public final void rule__BehaviorModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1964:1: ( rule__BehaviorModel__Group__1__Impl rule__BehaviorModel__Group__2 )
            // InternalBehavior.g:1965:2: rule__BehaviorModel__Group__1__Impl rule__BehaviorModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BehaviorModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BehaviorModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorModel__Group__1"


    // $ANTLR start "rule__BehaviorModel__Group__1__Impl"
    // InternalBehavior.g:1972:1: rule__BehaviorModel__Group__1__Impl : ( ( rule__BehaviorModel__NameAssignment_1 ) ) ;
    public final void rule__BehaviorModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1976:1: ( ( ( rule__BehaviorModel__NameAssignment_1 ) ) )
            // InternalBehavior.g:1977:1: ( ( rule__BehaviorModel__NameAssignment_1 ) )
            {
            // InternalBehavior.g:1977:1: ( ( rule__BehaviorModel__NameAssignment_1 ) )
            // InternalBehavior.g:1978:1: ( rule__BehaviorModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorModelAccess().getNameAssignment_1()); 
            }
            // InternalBehavior.g:1979:1: ( rule__BehaviorModel__NameAssignment_1 )
            // InternalBehavior.g:1979:2: rule__BehaviorModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorModel__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorModelAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__BehaviorModel__Group__1__Impl"


    // $ANTLR start "rule__BehaviorModel__Group__2"
    // InternalBehavior.g:1989:1: rule__BehaviorModel__Group__2 : rule__BehaviorModel__Group__2__Impl rule__BehaviorModel__Group__3 ;
    public final void rule__BehaviorModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:1993:1: ( rule__BehaviorModel__Group__2__Impl rule__BehaviorModel__Group__3 )
            // InternalBehavior.g:1994:2: rule__BehaviorModel__Group__2__Impl rule__BehaviorModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BehaviorModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BehaviorModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorModel__Group__2"


    // $ANTLR start "rule__BehaviorModel__Group__2__Impl"
    // InternalBehavior.g:2001:1: rule__BehaviorModel__Group__2__Impl : ( ( rule__BehaviorModel__Alternatives_2 )* ) ;
    public final void rule__BehaviorModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2005:1: ( ( ( rule__BehaviorModel__Alternatives_2 )* ) )
            // InternalBehavior.g:2006:1: ( ( rule__BehaviorModel__Alternatives_2 )* )
            {
            // InternalBehavior.g:2006:1: ( ( rule__BehaviorModel__Alternatives_2 )* )
            // InternalBehavior.g:2007:1: ( rule__BehaviorModel__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorModelAccess().getAlternatives_2()); 
            }
            // InternalBehavior.g:2008:1: ( rule__BehaviorModel__Alternatives_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=37 && LA19_0<=38)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBehavior.g:2008:2: rule__BehaviorModel__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__BehaviorModel__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorModelAccess().getAlternatives_2()); 
            }

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
    // $ANTLR end "rule__BehaviorModel__Group__2__Impl"


    // $ANTLR start "rule__BehaviorModel__Group__3"
    // InternalBehavior.g:2018:1: rule__BehaviorModel__Group__3 : rule__BehaviorModel__Group__3__Impl ;
    public final void rule__BehaviorModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2022:1: ( rule__BehaviorModel__Group__3__Impl )
            // InternalBehavior.g:2023:2: rule__BehaviorModel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorModel__Group__3"


    // $ANTLR start "rule__BehaviorModel__Group__3__Impl"
    // InternalBehavior.g:2029:1: rule__BehaviorModel__Group__3__Impl : ( ( rule__BehaviorModel__ComponentImplAssignment_3 ) ) ;
    public final void rule__BehaviorModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2033:1: ( ( ( rule__BehaviorModel__ComponentImplAssignment_3 ) ) )
            // InternalBehavior.g:2034:1: ( ( rule__BehaviorModel__ComponentImplAssignment_3 ) )
            {
            // InternalBehavior.g:2034:1: ( ( rule__BehaviorModel__ComponentImplAssignment_3 ) )
            // InternalBehavior.g:2035:1: ( rule__BehaviorModel__ComponentImplAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorModelAccess().getComponentImplAssignment_3()); 
            }
            // InternalBehavior.g:2036:1: ( rule__BehaviorModel__ComponentImplAssignment_3 )
            // InternalBehavior.g:2036:2: rule__BehaviorModel__ComponentImplAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorModel__ComponentImplAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorModelAccess().getComponentImplAssignment_3()); 
            }

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
    // $ANTLR end "rule__BehaviorModel__Group__3__Impl"


    // $ANTLR start "rule__RepositoryReference__Group__0"
    // InternalBehavior.g:2054:1: rule__RepositoryReference__Group__0 : rule__RepositoryReference__Group__0__Impl rule__RepositoryReference__Group__1 ;
    public final void rule__RepositoryReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2058:1: ( rule__RepositoryReference__Group__0__Impl rule__RepositoryReference__Group__1 )
            // InternalBehavior.g:2059:2: rule__RepositoryReference__Group__0__Impl rule__RepositoryReference__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RepositoryReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RepositoryReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryReference__Group__0"


    // $ANTLR start "rule__RepositoryReference__Group__0__Impl"
    // InternalBehavior.g:2066:1: rule__RepositoryReference__Group__0__Impl : ( 'repository' ) ;
    public final void rule__RepositoryReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2070:1: ( ( 'repository' ) )
            // InternalBehavior.g:2071:1: ( 'repository' )
            {
            // InternalBehavior.g:2071:1: ( 'repository' )
            // InternalBehavior.g:2072:1: 'repository'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryReferenceAccess().getRepositoryKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryReferenceAccess().getRepositoryKeyword_0()); 
            }

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
    // $ANTLR end "rule__RepositoryReference__Group__0__Impl"


    // $ANTLR start "rule__RepositoryReference__Group__1"
    // InternalBehavior.g:2085:1: rule__RepositoryReference__Group__1 : rule__RepositoryReference__Group__1__Impl ;
    public final void rule__RepositoryReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2089:1: ( rule__RepositoryReference__Group__1__Impl )
            // InternalBehavior.g:2090:2: rule__RepositoryReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryReference__Group__1"


    // $ANTLR start "rule__RepositoryReference__Group__1__Impl"
    // InternalBehavior.g:2096:1: rule__RepositoryReference__Group__1__Impl : ( ( rule__RepositoryReference__ReferenceAssignment_1 ) ) ;
    public final void rule__RepositoryReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2100:1: ( ( ( rule__RepositoryReference__ReferenceAssignment_1 ) ) )
            // InternalBehavior.g:2101:1: ( ( rule__RepositoryReference__ReferenceAssignment_1 ) )
            {
            // InternalBehavior.g:2101:1: ( ( rule__RepositoryReference__ReferenceAssignment_1 ) )
            // InternalBehavior.g:2102:1: ( rule__RepositoryReference__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryReferenceAccess().getReferenceAssignment_1()); 
            }
            // InternalBehavior.g:2103:1: ( rule__RepositoryReference__ReferenceAssignment_1 )
            // InternalBehavior.g:2103:2: rule__RepositoryReference__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryReference__ReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryReferenceAccess().getReferenceAssignment_1()); 
            }

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
    // $ANTLR end "rule__RepositoryReference__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalBehavior.g:2117:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2121:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalBehavior.g:2122:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalBehavior.g:2129:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2133:1: ( ( 'import' ) )
            // InternalBehavior.g:2134:1: ( 'import' )
            {
            // InternalBehavior.g:2134:1: ( 'import' )
            // InternalBehavior.g:2135:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalBehavior.g:2148:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2152:1: ( rule__Import__Group__1__Impl )
            // InternalBehavior.g:2153:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalBehavior.g:2159:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2163:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalBehavior.g:2164:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalBehavior.g:2164:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalBehavior.g:2165:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalBehavior.g:2166:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalBehavior.g:2166:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__0"
    // InternalBehavior.g:2180:1: rule__ComponentImpl__Group__0 : rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1 ;
    public final void rule__ComponentImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2184:1: ( rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1 )
            // InternalBehavior.g:2185:2: rule__ComponentImpl__Group__0__Impl rule__ComponentImpl__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ComponentImpl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__0"


    // $ANTLR start "rule__ComponentImpl__Group__0__Impl"
    // InternalBehavior.g:2192:1: rule__ComponentImpl__Group__0__Impl : ( 'realize' ) ;
    public final void rule__ComponentImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2196:1: ( ( 'realize' ) )
            // InternalBehavior.g:2197:1: ( 'realize' )
            {
            // InternalBehavior.g:2197:1: ( 'realize' )
            // InternalBehavior.g:2198:1: 'realize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getRealizeKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getRealizeKeyword_0()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group__0__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__1"
    // InternalBehavior.g:2211:1: rule__ComponentImpl__Group__1 : rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2 ;
    public final void rule__ComponentImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2215:1: ( rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2 )
            // InternalBehavior.g:2216:2: rule__ComponentImpl__Group__1__Impl rule__ComponentImpl__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ComponentImpl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__1"


    // $ANTLR start "rule__ComponentImpl__Group__1__Impl"
    // InternalBehavior.g:2223:1: rule__ComponentImpl__Group__1__Impl : ( ( rule__ComponentImpl__KindAssignment_1 )? ) ;
    public final void rule__ComponentImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2227:1: ( ( ( rule__ComponentImpl__KindAssignment_1 )? ) )
            // InternalBehavior.g:2228:1: ( ( rule__ComponentImpl__KindAssignment_1 )? )
            {
            // InternalBehavior.g:2228:1: ( ( rule__ComponentImpl__KindAssignment_1 )? )
            // InternalBehavior.g:2229:1: ( rule__ComponentImpl__KindAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getKindAssignment_1()); 
            }
            // InternalBehavior.g:2230:1: ( rule__ComponentImpl__KindAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=30 && LA20_0<=32)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBehavior.g:2230:2: rule__ComponentImpl__KindAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentImpl__KindAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getKindAssignment_1()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group__1__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__2"
    // InternalBehavior.g:2240:1: rule__ComponentImpl__Group__2 : rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3 ;
    public final void rule__ComponentImpl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2244:1: ( rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3 )
            // InternalBehavior.g:2245:2: rule__ComponentImpl__Group__2__Impl rule__ComponentImpl__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ComponentImpl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__2"


    // $ANTLR start "rule__ComponentImpl__Group__2__Impl"
    // InternalBehavior.g:2252:1: rule__ComponentImpl__Group__2__Impl : ( ( rule__ComponentImpl__RefComponentAssignment_2 ) ) ;
    public final void rule__ComponentImpl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2256:1: ( ( ( rule__ComponentImpl__RefComponentAssignment_2 ) ) )
            // InternalBehavior.g:2257:1: ( ( rule__ComponentImpl__RefComponentAssignment_2 ) )
            {
            // InternalBehavior.g:2257:1: ( ( rule__ComponentImpl__RefComponentAssignment_2 ) )
            // InternalBehavior.g:2258:1: ( rule__ComponentImpl__RefComponentAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getRefComponentAssignment_2()); 
            }
            // InternalBehavior.g:2259:1: ( rule__ComponentImpl__RefComponentAssignment_2 )
            // InternalBehavior.g:2259:2: rule__ComponentImpl__RefComponentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__RefComponentAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getRefComponentAssignment_2()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group__2__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__3"
    // InternalBehavior.g:2269:1: rule__ComponentImpl__Group__3 : rule__ComponentImpl__Group__3__Impl rule__ComponentImpl__Group__4 ;
    public final void rule__ComponentImpl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2273:1: ( rule__ComponentImpl__Group__3__Impl rule__ComponentImpl__Group__4 )
            // InternalBehavior.g:2274:2: rule__ComponentImpl__Group__3__Impl rule__ComponentImpl__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ComponentImpl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__3"


    // $ANTLR start "rule__ComponentImpl__Group__3__Impl"
    // InternalBehavior.g:2281:1: rule__ComponentImpl__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentImpl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2285:1: ( ( '{' ) )
            // InternalBehavior.g:2286:1: ( '{' )
            {
            // InternalBehavior.g:2286:1: ( '{' )
            // InternalBehavior.g:2287:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getLeftCurlyBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group__3__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__4"
    // InternalBehavior.g:2300:1: rule__ComponentImpl__Group__4 : rule__ComponentImpl__Group__4__Impl rule__ComponentImpl__Group__5 ;
    public final void rule__ComponentImpl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2304:1: ( rule__ComponentImpl__Group__4__Impl rule__ComponentImpl__Group__5 )
            // InternalBehavior.g:2305:2: rule__ComponentImpl__Group__4__Impl rule__ComponentImpl__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ComponentImpl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__4"


    // $ANTLR start "rule__ComponentImpl__Group__4__Impl"
    // InternalBehavior.g:2312:1: rule__ComponentImpl__Group__4__Impl : ( ( rule__ComponentImpl__LocalDeclarationsAssignment_4 )* ) ;
    public final void rule__ComponentImpl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2316:1: ( ( ( rule__ComponentImpl__LocalDeclarationsAssignment_4 )* ) )
            // InternalBehavior.g:2317:1: ( ( rule__ComponentImpl__LocalDeclarationsAssignment_4 )* )
            {
            // InternalBehavior.g:2317:1: ( ( rule__ComponentImpl__LocalDeclarationsAssignment_4 )* )
            // InternalBehavior.g:2318:1: ( rule__ComponentImpl__LocalDeclarationsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getLocalDeclarationsAssignment_4()); 
            }
            // InternalBehavior.g:2319:1: ( rule__ComponentImpl__LocalDeclarationsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=12 && LA21_0<=13)||LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBehavior.g:2319:2: rule__ComponentImpl__LocalDeclarationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentImpl__LocalDeclarationsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getLocalDeclarationsAssignment_4()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group__4__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__5"
    // InternalBehavior.g:2329:1: rule__ComponentImpl__Group__5 : rule__ComponentImpl__Group__5__Impl rule__ComponentImpl__Group__6 ;
    public final void rule__ComponentImpl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2333:1: ( rule__ComponentImpl__Group__5__Impl rule__ComponentImpl__Group__6 )
            // InternalBehavior.g:2334:2: rule__ComponentImpl__Group__5__Impl rule__ComponentImpl__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ComponentImpl__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__5"


    // $ANTLR start "rule__ComponentImpl__Group__5__Impl"
    // InternalBehavior.g:2341:1: rule__ComponentImpl__Group__5__Impl : ( ( rule__ComponentImpl__Group_5__0 )? ) ;
    public final void rule__ComponentImpl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2345:1: ( ( ( rule__ComponentImpl__Group_5__0 )? ) )
            // InternalBehavior.g:2346:1: ( ( rule__ComponentImpl__Group_5__0 )? )
            {
            // InternalBehavior.g:2346:1: ( ( rule__ComponentImpl__Group_5__0 )? )
            // InternalBehavior.g:2347:1: ( rule__ComponentImpl__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getGroup_5()); 
            }
            // InternalBehavior.g:2348:1: ( rule__ComponentImpl__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBehavior.g:2348:2: rule__ComponentImpl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentImpl__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getGroup_5()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group__5__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__6"
    // InternalBehavior.g:2358:1: rule__ComponentImpl__Group__6 : rule__ComponentImpl__Group__6__Impl rule__ComponentImpl__Group__7 ;
    public final void rule__ComponentImpl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2362:1: ( rule__ComponentImpl__Group__6__Impl rule__ComponentImpl__Group__7 )
            // InternalBehavior.g:2363:2: rule__ComponentImpl__Group__6__Impl rule__ComponentImpl__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__ComponentImpl__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__6"


    // $ANTLR start "rule__ComponentImpl__Group__6__Impl"
    // InternalBehavior.g:2370:1: rule__ComponentImpl__Group__6__Impl : ( ( rule__ComponentImpl__Group_6__0 )? ) ;
    public final void rule__ComponentImpl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2374:1: ( ( ( rule__ComponentImpl__Group_6__0 )? ) )
            // InternalBehavior.g:2375:1: ( ( rule__ComponentImpl__Group_6__0 )? )
            {
            // InternalBehavior.g:2375:1: ( ( rule__ComponentImpl__Group_6__0 )? )
            // InternalBehavior.g:2376:1: ( rule__ComponentImpl__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getGroup_6()); 
            }
            // InternalBehavior.g:2377:1: ( rule__ComponentImpl__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBehavior.g:2377:2: rule__ComponentImpl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentImpl__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getGroup_6()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group__6__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__7"
    // InternalBehavior.g:2387:1: rule__ComponentImpl__Group__7 : rule__ComponentImpl__Group__7__Impl rule__ComponentImpl__Group__8 ;
    public final void rule__ComponentImpl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2391:1: ( rule__ComponentImpl__Group__7__Impl rule__ComponentImpl__Group__8 )
            // InternalBehavior.g:2392:2: rule__ComponentImpl__Group__7__Impl rule__ComponentImpl__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__ComponentImpl__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__7"


    // $ANTLR start "rule__ComponentImpl__Group__7__Impl"
    // InternalBehavior.g:2399:1: rule__ComponentImpl__Group__7__Impl : ( ( rule__ComponentImpl__InterfacesAssignment_7 )* ) ;
    public final void rule__ComponentImpl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2403:1: ( ( ( rule__ComponentImpl__InterfacesAssignment_7 )* ) )
            // InternalBehavior.g:2404:1: ( ( rule__ComponentImpl__InterfacesAssignment_7 )* )
            {
            // InternalBehavior.g:2404:1: ( ( rule__ComponentImpl__InterfacesAssignment_7 )* )
            // InternalBehavior.g:2405:1: ( rule__ComponentImpl__InterfacesAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getInterfacesAssignment_7()); 
            }
            // InternalBehavior.g:2406:1: ( rule__ComponentImpl__InterfacesAssignment_7 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==47) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBehavior.g:2406:2: rule__ComponentImpl__InterfacesAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentImpl__InterfacesAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getInterfacesAssignment_7()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group__7__Impl"


    // $ANTLR start "rule__ComponentImpl__Group__8"
    // InternalBehavior.g:2416:1: rule__ComponentImpl__Group__8 : rule__ComponentImpl__Group__8__Impl ;
    public final void rule__ComponentImpl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2420:1: ( rule__ComponentImpl__Group__8__Impl )
            // InternalBehavior.g:2421:2: rule__ComponentImpl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group__8"


    // $ANTLR start "rule__ComponentImpl__Group__8__Impl"
    // InternalBehavior.g:2427:1: rule__ComponentImpl__Group__8__Impl : ( '}' ) ;
    public final void rule__ComponentImpl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2431:1: ( ( '}' ) )
            // InternalBehavior.g:2432:1: ( '}' )
            {
            // InternalBehavior.g:2432:1: ( '}' )
            // InternalBehavior.g:2433:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getRightCurlyBracketKeyword_8()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group__8__Impl"


    // $ANTLR start "rule__ComponentImpl__Group_5__0"
    // InternalBehavior.g:2464:1: rule__ComponentImpl__Group_5__0 : rule__ComponentImpl__Group_5__0__Impl rule__ComponentImpl__Group_5__1 ;
    public final void rule__ComponentImpl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2468:1: ( rule__ComponentImpl__Group_5__0__Impl rule__ComponentImpl__Group_5__1 )
            // InternalBehavior.g:2469:2: rule__ComponentImpl__Group_5__0__Impl rule__ComponentImpl__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__ComponentImpl__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group_5__0"


    // $ANTLR start "rule__ComponentImpl__Group_5__0__Impl"
    // InternalBehavior.g:2476:1: rule__ComponentImpl__Group_5__0__Impl : ( 'post-construct' ) ;
    public final void rule__ComponentImpl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2480:1: ( ( 'post-construct' ) )
            // InternalBehavior.g:2481:1: ( 'post-construct' )
            {
            // InternalBehavior.g:2481:1: ( 'post-construct' )
            // InternalBehavior.g:2482:1: 'post-construct'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getPostConstructKeyword_5_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getPostConstructKeyword_5_0()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group_5__0__Impl"


    // $ANTLR start "rule__ComponentImpl__Group_5__1"
    // InternalBehavior.g:2495:1: rule__ComponentImpl__Group_5__1 : rule__ComponentImpl__Group_5__1__Impl ;
    public final void rule__ComponentImpl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2499:1: ( rule__ComponentImpl__Group_5__1__Impl )
            // InternalBehavior.g:2500:2: rule__ComponentImpl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group_5__1"


    // $ANTLR start "rule__ComponentImpl__Group_5__1__Impl"
    // InternalBehavior.g:2506:1: rule__ComponentImpl__Group_5__1__Impl : ( ( rule__ComponentImpl__PostConstructAssignment_5_1 ) ) ;
    public final void rule__ComponentImpl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2510:1: ( ( ( rule__ComponentImpl__PostConstructAssignment_5_1 ) ) )
            // InternalBehavior.g:2511:1: ( ( rule__ComponentImpl__PostConstructAssignment_5_1 ) )
            {
            // InternalBehavior.g:2511:1: ( ( rule__ComponentImpl__PostConstructAssignment_5_1 ) )
            // InternalBehavior.g:2512:1: ( rule__ComponentImpl__PostConstructAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getPostConstructAssignment_5_1()); 
            }
            // InternalBehavior.g:2513:1: ( rule__ComponentImpl__PostConstructAssignment_5_1 )
            // InternalBehavior.g:2513:2: rule__ComponentImpl__PostConstructAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__PostConstructAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getPostConstructAssignment_5_1()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentImpl__Group_6__0"
    // InternalBehavior.g:2527:1: rule__ComponentImpl__Group_6__0 : rule__ComponentImpl__Group_6__0__Impl rule__ComponentImpl__Group_6__1 ;
    public final void rule__ComponentImpl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2531:1: ( rule__ComponentImpl__Group_6__0__Impl rule__ComponentImpl__Group_6__1 )
            // InternalBehavior.g:2532:2: rule__ComponentImpl__Group_6__0__Impl rule__ComponentImpl__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__ComponentImpl__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group_6__0"


    // $ANTLR start "rule__ComponentImpl__Group_6__0__Impl"
    // InternalBehavior.g:2539:1: rule__ComponentImpl__Group_6__0__Impl : ( 'pre-destroy' ) ;
    public final void rule__ComponentImpl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2543:1: ( ( 'pre-destroy' ) )
            // InternalBehavior.g:2544:1: ( 'pre-destroy' )
            {
            // InternalBehavior.g:2544:1: ( 'pre-destroy' )
            // InternalBehavior.g:2545:1: 'pre-destroy'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getPreDestroyKeyword_6_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getPreDestroyKeyword_6_0()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group_6__0__Impl"


    // $ANTLR start "rule__ComponentImpl__Group_6__1"
    // InternalBehavior.g:2558:1: rule__ComponentImpl__Group_6__1 : rule__ComponentImpl__Group_6__1__Impl ;
    public final void rule__ComponentImpl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2562:1: ( rule__ComponentImpl__Group_6__1__Impl )
            // InternalBehavior.g:2563:2: rule__ComponentImpl__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentImpl__Group_6__1"


    // $ANTLR start "rule__ComponentImpl__Group_6__1__Impl"
    // InternalBehavior.g:2569:1: rule__ComponentImpl__Group_6__1__Impl : ( ( rule__ComponentImpl__PreDestroyAssignment_6_1 ) ) ;
    public final void rule__ComponentImpl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2573:1: ( ( ( rule__ComponentImpl__PreDestroyAssignment_6_1 ) ) )
            // InternalBehavior.g:2574:1: ( ( rule__ComponentImpl__PreDestroyAssignment_6_1 ) )
            {
            // InternalBehavior.g:2574:1: ( ( rule__ComponentImpl__PreDestroyAssignment_6_1 ) )
            // InternalBehavior.g:2575:1: ( rule__ComponentImpl__PreDestroyAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getPreDestroyAssignment_6_1()); 
            }
            // InternalBehavior.g:2576:1: ( rule__ComponentImpl__PreDestroyAssignment_6_1 )
            // InternalBehavior.g:2576:2: rule__ComponentImpl__PreDestroyAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__PreDestroyAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getPreDestroyAssignment_6_1()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__Group_6__1__Impl"


    // $ANTLR start "rule__LifeCycleMethod__Group__0"
    // InternalBehavior.g:2590:1: rule__LifeCycleMethod__Group__0 : rule__LifeCycleMethod__Group__0__Impl rule__LifeCycleMethod__Group__1 ;
    public final void rule__LifeCycleMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2594:1: ( rule__LifeCycleMethod__Group__0__Impl rule__LifeCycleMethod__Group__1 )
            // InternalBehavior.g:2595:2: rule__LifeCycleMethod__Group__0__Impl rule__LifeCycleMethod__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__LifeCycleMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LifeCycleMethod__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LifeCycleMethod__Group__0"


    // $ANTLR start "rule__LifeCycleMethod__Group__0__Impl"
    // InternalBehavior.g:2602:1: rule__LifeCycleMethod__Group__0__Impl : ( 'action' ) ;
    public final void rule__LifeCycleMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2606:1: ( ( 'action' ) )
            // InternalBehavior.g:2607:1: ( 'action' )
            {
            // InternalBehavior.g:2607:1: ( 'action' )
            // InternalBehavior.g:2608:1: 'action'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifeCycleMethodAccess().getActionKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifeCycleMethodAccess().getActionKeyword_0()); 
            }

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
    // $ANTLR end "rule__LifeCycleMethod__Group__0__Impl"


    // $ANTLR start "rule__LifeCycleMethod__Group__1"
    // InternalBehavior.g:2621:1: rule__LifeCycleMethod__Group__1 : rule__LifeCycleMethod__Group__1__Impl ;
    public final void rule__LifeCycleMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2625:1: ( rule__LifeCycleMethod__Group__1__Impl )
            // InternalBehavior.g:2626:2: rule__LifeCycleMethod__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LifeCycleMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LifeCycleMethod__Group__1"


    // $ANTLR start "rule__LifeCycleMethod__Group__1__Impl"
    // InternalBehavior.g:2632:1: rule__LifeCycleMethod__Group__1__Impl : ( ( rule__LifeCycleMethod__BodyAssignment_1 ) ) ;
    public final void rule__LifeCycleMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2636:1: ( ( ( rule__LifeCycleMethod__BodyAssignment_1 ) ) )
            // InternalBehavior.g:2637:1: ( ( rule__LifeCycleMethod__BodyAssignment_1 ) )
            {
            // InternalBehavior.g:2637:1: ( ( rule__LifeCycleMethod__BodyAssignment_1 ) )
            // InternalBehavior.g:2638:1: ( rule__LifeCycleMethod__BodyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifeCycleMethodAccess().getBodyAssignment_1()); 
            }
            // InternalBehavior.g:2639:1: ( rule__LifeCycleMethod__BodyAssignment_1 )
            // InternalBehavior.g:2639:2: rule__LifeCycleMethod__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LifeCycleMethod__BodyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifeCycleMethodAccess().getBodyAssignment_1()); 
            }

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
    // $ANTLR end "rule__LifeCycleMethod__Group__1__Impl"


    // $ANTLR start "rule__VariableDecl__Group__0"
    // InternalBehavior.g:2653:1: rule__VariableDecl__Group__0 : rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 ;
    public final void rule__VariableDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2657:1: ( rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 )
            // InternalBehavior.g:2658:2: rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VariableDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__0"


    // $ANTLR start "rule__VariableDecl__Group__0__Impl"
    // InternalBehavior.g:2665:1: rule__VariableDecl__Group__0__Impl : ( ( rule__VariableDecl__ModifierAssignment_0 ) ) ;
    public final void rule__VariableDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2669:1: ( ( ( rule__VariableDecl__ModifierAssignment_0 ) ) )
            // InternalBehavior.g:2670:1: ( ( rule__VariableDecl__ModifierAssignment_0 ) )
            {
            // InternalBehavior.g:2670:1: ( ( rule__VariableDecl__ModifierAssignment_0 ) )
            // InternalBehavior.g:2671:1: ( rule__VariableDecl__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getModifierAssignment_0()); 
            }
            // InternalBehavior.g:2672:1: ( rule__VariableDecl__ModifierAssignment_0 )
            // InternalBehavior.g:2672:2: rule__VariableDecl__ModifierAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecl__ModifierAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getModifierAssignment_0()); 
            }

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
    // $ANTLR end "rule__VariableDecl__Group__0__Impl"


    // $ANTLR start "rule__VariableDecl__Group__1"
    // InternalBehavior.g:2682:1: rule__VariableDecl__Group__1 : rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 ;
    public final void rule__VariableDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2686:1: ( rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 )
            // InternalBehavior.g:2687:2: rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__VariableDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__1"


    // $ANTLR start "rule__VariableDecl__Group__1__Impl"
    // InternalBehavior.g:2694:1: rule__VariableDecl__Group__1__Impl : ( ( rule__VariableDecl__TypeAssignment_1 ) ) ;
    public final void rule__VariableDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2698:1: ( ( ( rule__VariableDecl__TypeAssignment_1 ) ) )
            // InternalBehavior.g:2699:1: ( ( rule__VariableDecl__TypeAssignment_1 ) )
            {
            // InternalBehavior.g:2699:1: ( ( rule__VariableDecl__TypeAssignment_1 ) )
            // InternalBehavior.g:2700:1: ( rule__VariableDecl__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getTypeAssignment_1()); 
            }
            // InternalBehavior.g:2701:1: ( rule__VariableDecl__TypeAssignment_1 )
            // InternalBehavior.g:2701:2: rule__VariableDecl__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecl__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getTypeAssignment_1()); 
            }

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
    // $ANTLR end "rule__VariableDecl__Group__1__Impl"


    // $ANTLR start "rule__VariableDecl__Group__2"
    // InternalBehavior.g:2711:1: rule__VariableDecl__Group__2 : rule__VariableDecl__Group__2__Impl ;
    public final void rule__VariableDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2715:1: ( rule__VariableDecl__Group__2__Impl )
            // InternalBehavior.g:2716:2: rule__VariableDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__2"


    // $ANTLR start "rule__VariableDecl__Group__2__Impl"
    // InternalBehavior.g:2722:1: rule__VariableDecl__Group__2__Impl : ( ( rule__VariableDecl__NameAssignment_2 ) ) ;
    public final void rule__VariableDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2726:1: ( ( ( rule__VariableDecl__NameAssignment_2 ) ) )
            // InternalBehavior.g:2727:1: ( ( rule__VariableDecl__NameAssignment_2 ) )
            {
            // InternalBehavior.g:2727:1: ( ( rule__VariableDecl__NameAssignment_2 ) )
            // InternalBehavior.g:2728:1: ( rule__VariableDecl__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getNameAssignment_2()); 
            }
            // InternalBehavior.g:2729:1: ( rule__VariableDecl__NameAssignment_2 )
            // InternalBehavior.g:2729:2: rule__VariableDecl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecl__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__VariableDecl__Group__2__Impl"


    // $ANTLR start "rule__ConstantDecl__Group__0"
    // InternalBehavior.g:2745:1: rule__ConstantDecl__Group__0 : rule__ConstantDecl__Group__0__Impl rule__ConstantDecl__Group__1 ;
    public final void rule__ConstantDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2749:1: ( rule__ConstantDecl__Group__0__Impl rule__ConstantDecl__Group__1 )
            // InternalBehavior.g:2750:2: rule__ConstantDecl__Group__0__Impl rule__ConstantDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConstantDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDecl__Group__0"


    // $ANTLR start "rule__ConstantDecl__Group__0__Impl"
    // InternalBehavior.g:2757:1: rule__ConstantDecl__Group__0__Impl : ( 'const' ) ;
    public final void rule__ConstantDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2761:1: ( ( 'const' ) )
            // InternalBehavior.g:2762:1: ( 'const' )
            {
            // InternalBehavior.g:2762:1: ( 'const' )
            // InternalBehavior.g:2763:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclAccess().getConstKeyword_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclAccess().getConstKeyword_0()); 
            }

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
    // $ANTLR end "rule__ConstantDecl__Group__0__Impl"


    // $ANTLR start "rule__ConstantDecl__Group__1"
    // InternalBehavior.g:2776:1: rule__ConstantDecl__Group__1 : rule__ConstantDecl__Group__1__Impl rule__ConstantDecl__Group__2 ;
    public final void rule__ConstantDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2780:1: ( rule__ConstantDecl__Group__1__Impl rule__ConstantDecl__Group__2 )
            // InternalBehavior.g:2781:2: rule__ConstantDecl__Group__1__Impl rule__ConstantDecl__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ConstantDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDecl__Group__1"


    // $ANTLR start "rule__ConstantDecl__Group__1__Impl"
    // InternalBehavior.g:2788:1: rule__ConstantDecl__Group__1__Impl : ( ( rule__ConstantDecl__NameAssignment_1 ) ) ;
    public final void rule__ConstantDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2792:1: ( ( ( rule__ConstantDecl__NameAssignment_1 ) ) )
            // InternalBehavior.g:2793:1: ( ( rule__ConstantDecl__NameAssignment_1 ) )
            {
            // InternalBehavior.g:2793:1: ( ( rule__ConstantDecl__NameAssignment_1 ) )
            // InternalBehavior.g:2794:1: ( rule__ConstantDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclAccess().getNameAssignment_1()); 
            }
            // InternalBehavior.g:2795:1: ( rule__ConstantDecl__NameAssignment_1 )
            // InternalBehavior.g:2795:2: rule__ConstantDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDecl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__ConstantDecl__Group__1__Impl"


    // $ANTLR start "rule__ConstantDecl__Group__2"
    // InternalBehavior.g:2805:1: rule__ConstantDecl__Group__2 : rule__ConstantDecl__Group__2__Impl rule__ConstantDecl__Group__3 ;
    public final void rule__ConstantDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2809:1: ( rule__ConstantDecl__Group__2__Impl rule__ConstantDecl__Group__3 )
            // InternalBehavior.g:2810:2: rule__ConstantDecl__Group__2__Impl rule__ConstantDecl__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ConstantDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConstantDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDecl__Group__2"


    // $ANTLR start "rule__ConstantDecl__Group__2__Impl"
    // InternalBehavior.g:2817:1: rule__ConstantDecl__Group__2__Impl : ( '=' ) ;
    public final void rule__ConstantDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2821:1: ( ( '=' ) )
            // InternalBehavior.g:2822:1: ( '=' )
            {
            // InternalBehavior.g:2822:1: ( '=' )
            // InternalBehavior.g:2823:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclAccess().getEqualsSignKeyword_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclAccess().getEqualsSignKeyword_2()); 
            }

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
    // $ANTLR end "rule__ConstantDecl__Group__2__Impl"


    // $ANTLR start "rule__ConstantDecl__Group__3"
    // InternalBehavior.g:2836:1: rule__ConstantDecl__Group__3 : rule__ConstantDecl__Group__3__Impl ;
    public final void rule__ConstantDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2840:1: ( rule__ConstantDecl__Group__3__Impl )
            // InternalBehavior.g:2841:2: rule__ConstantDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantDecl__Group__3"


    // $ANTLR start "rule__ConstantDecl__Group__3__Impl"
    // InternalBehavior.g:2847:1: rule__ConstantDecl__Group__3__Impl : ( ( rule__ConstantDecl__ValueAssignment_3 ) ) ;
    public final void rule__ConstantDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2851:1: ( ( ( rule__ConstantDecl__ValueAssignment_3 ) ) )
            // InternalBehavior.g:2852:1: ( ( rule__ConstantDecl__ValueAssignment_3 ) )
            {
            // InternalBehavior.g:2852:1: ( ( rule__ConstantDecl__ValueAssignment_3 ) )
            // InternalBehavior.g:2853:1: ( rule__ConstantDecl__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclAccess().getValueAssignment_3()); 
            }
            // InternalBehavior.g:2854:1: ( rule__ConstantDecl__ValueAssignment_3 )
            // InternalBehavior.g:2854:2: rule__ConstantDecl__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstantDecl__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclAccess().getValueAssignment_3()); 
            }

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
    // $ANTLR end "rule__ConstantDecl__Group__3__Impl"


    // $ANTLR start "rule__InterfaceRealization__Group__0"
    // InternalBehavior.g:2872:1: rule__InterfaceRealization__Group__0 : rule__InterfaceRealization__Group__0__Impl rule__InterfaceRealization__Group__1 ;
    public final void rule__InterfaceRealization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2876:1: ( rule__InterfaceRealization__Group__0__Impl rule__InterfaceRealization__Group__1 )
            // InternalBehavior.g:2877:2: rule__InterfaceRealization__Group__0__Impl rule__InterfaceRealization__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InterfaceRealization__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InterfaceRealization__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceRealization__Group__0"


    // $ANTLR start "rule__InterfaceRealization__Group__0__Impl"
    // InternalBehavior.g:2884:1: rule__InterfaceRealization__Group__0__Impl : ( 'iface' ) ;
    public final void rule__InterfaceRealization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2888:1: ( ( 'iface' ) )
            // InternalBehavior.g:2889:1: ( 'iface' )
            {
            // InternalBehavior.g:2889:1: ( 'iface' )
            // InternalBehavior.g:2890:1: 'iface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRealizationAccess().getIfaceKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRealizationAccess().getIfaceKeyword_0()); 
            }

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
    // $ANTLR end "rule__InterfaceRealization__Group__0__Impl"


    // $ANTLR start "rule__InterfaceRealization__Group__1"
    // InternalBehavior.g:2903:1: rule__InterfaceRealization__Group__1 : rule__InterfaceRealization__Group__1__Impl rule__InterfaceRealization__Group__2 ;
    public final void rule__InterfaceRealization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2907:1: ( rule__InterfaceRealization__Group__1__Impl rule__InterfaceRealization__Group__2 )
            // InternalBehavior.g:2908:2: rule__InterfaceRealization__Group__1__Impl rule__InterfaceRealization__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__InterfaceRealization__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InterfaceRealization__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceRealization__Group__1"


    // $ANTLR start "rule__InterfaceRealization__Group__1__Impl"
    // InternalBehavior.g:2915:1: rule__InterfaceRealization__Group__1__Impl : ( ( rule__InterfaceRealization__RefInterfaceAssignment_1 ) ) ;
    public final void rule__InterfaceRealization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2919:1: ( ( ( rule__InterfaceRealization__RefInterfaceAssignment_1 ) ) )
            // InternalBehavior.g:2920:1: ( ( rule__InterfaceRealization__RefInterfaceAssignment_1 ) )
            {
            // InternalBehavior.g:2920:1: ( ( rule__InterfaceRealization__RefInterfaceAssignment_1 ) )
            // InternalBehavior.g:2921:1: ( rule__InterfaceRealization__RefInterfaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRealizationAccess().getRefInterfaceAssignment_1()); 
            }
            // InternalBehavior.g:2922:1: ( rule__InterfaceRealization__RefInterfaceAssignment_1 )
            // InternalBehavior.g:2922:2: rule__InterfaceRealization__RefInterfaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceRealization__RefInterfaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRealizationAccess().getRefInterfaceAssignment_1()); 
            }

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
    // $ANTLR end "rule__InterfaceRealization__Group__1__Impl"


    // $ANTLR start "rule__InterfaceRealization__Group__2"
    // InternalBehavior.g:2932:1: rule__InterfaceRealization__Group__2 : rule__InterfaceRealization__Group__2__Impl ;
    public final void rule__InterfaceRealization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2936:1: ( rule__InterfaceRealization__Group__2__Impl )
            // InternalBehavior.g:2937:2: rule__InterfaceRealization__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceRealization__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterfaceRealization__Group__2"


    // $ANTLR start "rule__InterfaceRealization__Group__2__Impl"
    // InternalBehavior.g:2943:1: rule__InterfaceRealization__Group__2__Impl : ( ( rule__InterfaceRealization__MethodsAssignment_2 )* ) ;
    public final void rule__InterfaceRealization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2947:1: ( ( ( rule__InterfaceRealization__MethodsAssignment_2 )* ) )
            // InternalBehavior.g:2948:1: ( ( rule__InterfaceRealization__MethodsAssignment_2 )* )
            {
            // InternalBehavior.g:2948:1: ( ( rule__InterfaceRealization__MethodsAssignment_2 )* )
            // InternalBehavior.g:2949:1: ( rule__InterfaceRealization__MethodsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRealizationAccess().getMethodsAssignment_2()); 
            }
            // InternalBehavior.g:2950:1: ( rule__InterfaceRealization__MethodsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBehavior.g:2950:2: rule__InterfaceRealization__MethodsAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InterfaceRealization__MethodsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRealizationAccess().getMethodsAssignment_2()); 
            }

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
    // $ANTLR end "rule__InterfaceRealization__Group__2__Impl"


    // $ANTLR start "rule__MethodImpl__Group__0"
    // InternalBehavior.g:2966:1: rule__MethodImpl__Group__0 : rule__MethodImpl__Group__0__Impl rule__MethodImpl__Group__1 ;
    public final void rule__MethodImpl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2970:1: ( rule__MethodImpl__Group__0__Impl rule__MethodImpl__Group__1 )
            // InternalBehavior.g:2971:2: rule__MethodImpl__Group__0__Impl rule__MethodImpl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MethodImpl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodImpl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodImpl__Group__0"


    // $ANTLR start "rule__MethodImpl__Group__0__Impl"
    // InternalBehavior.g:2978:1: rule__MethodImpl__Group__0__Impl : ( 'operation' ) ;
    public final void rule__MethodImpl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:2982:1: ( ( 'operation' ) )
            // InternalBehavior.g:2983:1: ( 'operation' )
            {
            // InternalBehavior.g:2983:1: ( 'operation' )
            // InternalBehavior.g:2984:1: 'operation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodImplAccess().getOperationKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodImplAccess().getOperationKeyword_0()); 
            }

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
    // $ANTLR end "rule__MethodImpl__Group__0__Impl"


    // $ANTLR start "rule__MethodImpl__Group__1"
    // InternalBehavior.g:2997:1: rule__MethodImpl__Group__1 : rule__MethodImpl__Group__1__Impl rule__MethodImpl__Group__2 ;
    public final void rule__MethodImpl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3001:1: ( rule__MethodImpl__Group__1__Impl rule__MethodImpl__Group__2 )
            // InternalBehavior.g:3002:2: rule__MethodImpl__Group__1__Impl rule__MethodImpl__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MethodImpl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodImpl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodImpl__Group__1"


    // $ANTLR start "rule__MethodImpl__Group__1__Impl"
    // InternalBehavior.g:3009:1: rule__MethodImpl__Group__1__Impl : ( ( rule__MethodImpl__RefMethodAssignment_1 ) ) ;
    public final void rule__MethodImpl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3013:1: ( ( ( rule__MethodImpl__RefMethodAssignment_1 ) ) )
            // InternalBehavior.g:3014:1: ( ( rule__MethodImpl__RefMethodAssignment_1 ) )
            {
            // InternalBehavior.g:3014:1: ( ( rule__MethodImpl__RefMethodAssignment_1 ) )
            // InternalBehavior.g:3015:1: ( rule__MethodImpl__RefMethodAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodImplAccess().getRefMethodAssignment_1()); 
            }
            // InternalBehavior.g:3016:1: ( rule__MethodImpl__RefMethodAssignment_1 )
            // InternalBehavior.g:3016:2: rule__MethodImpl__RefMethodAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodImpl__RefMethodAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodImplAccess().getRefMethodAssignment_1()); 
            }

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
    // $ANTLR end "rule__MethodImpl__Group__1__Impl"


    // $ANTLR start "rule__MethodImpl__Group__2"
    // InternalBehavior.g:3026:1: rule__MethodImpl__Group__2 : rule__MethodImpl__Group__2__Impl ;
    public final void rule__MethodImpl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3030:1: ( rule__MethodImpl__Group__2__Impl )
            // InternalBehavior.g:3031:2: rule__MethodImpl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodImpl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodImpl__Group__2"


    // $ANTLR start "rule__MethodImpl__Group__2__Impl"
    // InternalBehavior.g:3037:1: rule__MethodImpl__Group__2__Impl : ( ( rule__MethodImpl__BodyAssignment_2 ) ) ;
    public final void rule__MethodImpl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3041:1: ( ( ( rule__MethodImpl__BodyAssignment_2 ) ) )
            // InternalBehavior.g:3042:1: ( ( rule__MethodImpl__BodyAssignment_2 ) )
            {
            // InternalBehavior.g:3042:1: ( ( rule__MethodImpl__BodyAssignment_2 ) )
            // InternalBehavior.g:3043:1: ( rule__MethodImpl__BodyAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodImplAccess().getBodyAssignment_2()); 
            }
            // InternalBehavior.g:3044:1: ( rule__MethodImpl__BodyAssignment_2 )
            // InternalBehavior.g:3044:2: rule__MethodImpl__BodyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MethodImpl__BodyAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodImplAccess().getBodyAssignment_2()); 
            }

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
    // $ANTLR end "rule__MethodImpl__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalBehavior.g:3060:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3064:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalBehavior.g:3065:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalBehavior.g:3072:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3076:1: ( ( 'if' ) )
            // InternalBehavior.g:3077:1: ( 'if' )
            {
            // InternalBehavior.g:3077:1: ( 'if' )
            // InternalBehavior.g:3078:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalBehavior.g:3091:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3095:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalBehavior.g:3096:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalBehavior.g:3103:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3107:1: ( ( '(' ) )
            // InternalBehavior.g:3108:1: ( '(' )
            {
            // InternalBehavior.g:3108:1: ( '(' )
            // InternalBehavior.g:3109:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalBehavior.g:3122:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3126:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalBehavior.g:3127:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalBehavior.g:3134:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__ExprAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3138:1: ( ( ( rule__IfStatement__ExprAssignment_2 ) ) )
            // InternalBehavior.g:3139:1: ( ( rule__IfStatement__ExprAssignment_2 ) )
            {
            // InternalBehavior.g:3139:1: ( ( rule__IfStatement__ExprAssignment_2 ) )
            // InternalBehavior.g:3140:1: ( rule__IfStatement__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExprAssignment_2()); 
            }
            // InternalBehavior.g:3141:1: ( rule__IfStatement__ExprAssignment_2 )
            // InternalBehavior.g:3141:2: rule__IfStatement__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ExprAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getExprAssignment_2()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalBehavior.g:3151:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3155:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalBehavior.g:3156:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalBehavior.g:3163:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3167:1: ( ( ')' ) )
            // InternalBehavior.g:3168:1: ( ')' )
            {
            // InternalBehavior.g:3168:1: ( ')' )
            // InternalBehavior.g:3169:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalBehavior.g:3182:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3186:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalBehavior.g:3187:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalBehavior.g:3194:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__IfStatementAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3198:1: ( ( ( rule__IfStatement__IfStatementAssignment_4 ) ) )
            // InternalBehavior.g:3199:1: ( ( rule__IfStatement__IfStatementAssignment_4 ) )
            {
            // InternalBehavior.g:3199:1: ( ( rule__IfStatement__IfStatementAssignment_4 ) )
            // InternalBehavior.g:3200:1: ( rule__IfStatement__IfStatementAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfStatementAssignment_4()); 
            }
            // InternalBehavior.g:3201:1: ( rule__IfStatement__IfStatementAssignment_4 )
            // InternalBehavior.g:3201:2: rule__IfStatement__IfStatementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__IfStatementAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfStatementAssignment_4()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalBehavior.g:3211:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3215:1: ( rule__IfStatement__Group__5__Impl )
            // InternalBehavior.g:3216:2: rule__IfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalBehavior.g:3222:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__Group_5__0 )? ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3226:1: ( ( ( rule__IfStatement__Group_5__0 )? ) )
            // InternalBehavior.g:3227:1: ( ( rule__IfStatement__Group_5__0 )? )
            {
            // InternalBehavior.g:3227:1: ( ( rule__IfStatement__Group_5__0 )? )
            // InternalBehavior.g:3228:1: ( rule__IfStatement__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_5()); 
            }
            // InternalBehavior.g:3229:1: ( rule__IfStatement__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBehavior.g:3229:2: rule__IfStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfStatement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup_5()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__0"
    // InternalBehavior.g:3251:1: rule__IfStatement__Group_5__0 : rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 ;
    public final void rule__IfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3255:1: ( rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 )
            // InternalBehavior.g:3256:2: rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__IfStatement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__0"


    // $ANTLR start "rule__IfStatement__Group_5__0__Impl"
    // InternalBehavior.g:3263:1: rule__IfStatement__Group_5__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3267:1: ( ( 'else' ) )
            // InternalBehavior.g:3268:1: ( 'else' )
            {
            // InternalBehavior.g:3268:1: ( 'else' )
            // InternalBehavior.g:3269:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseKeyword_5_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group_5__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_5__1"
    // InternalBehavior.g:3282:1: rule__IfStatement__Group_5__1 : rule__IfStatement__Group_5__1__Impl ;
    public final void rule__IfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3286:1: ( rule__IfStatement__Group_5__1__Impl )
            // InternalBehavior.g:3287:2: rule__IfStatement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_5__1"


    // $ANTLR start "rule__IfStatement__Group_5__1__Impl"
    // InternalBehavior.g:3293:1: rule__IfStatement__Group_5__1__Impl : ( ( rule__IfStatement__ElseStatementAssignment_5_1 ) ) ;
    public final void rule__IfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3297:1: ( ( ( rule__IfStatement__ElseStatementAssignment_5_1 ) ) )
            // InternalBehavior.g:3298:1: ( ( rule__IfStatement__ElseStatementAssignment_5_1 ) )
            {
            // InternalBehavior.g:3298:1: ( ( rule__IfStatement__ElseStatementAssignment_5_1 ) )
            // InternalBehavior.g:3299:1: ( rule__IfStatement__ElseStatementAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseStatementAssignment_5_1()); 
            }
            // InternalBehavior.g:3300:1: ( rule__IfStatement__ElseStatementAssignment_5_1 )
            // InternalBehavior.g:3300:2: rule__IfStatement__ElseStatementAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ElseStatementAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseStatementAssignment_5_1()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group_5__1__Impl"


    // $ANTLR start "rule__BlockStatement__Group__0"
    // InternalBehavior.g:3314:1: rule__BlockStatement__Group__0 : rule__BlockStatement__Group__0__Impl rule__BlockStatement__Group__1 ;
    public final void rule__BlockStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3318:1: ( rule__BlockStatement__Group__0__Impl rule__BlockStatement__Group__1 )
            // InternalBehavior.g:3319:2: rule__BlockStatement__Group__0__Impl rule__BlockStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BlockStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockStatement__Group__0"


    // $ANTLR start "rule__BlockStatement__Group__0__Impl"
    // InternalBehavior.g:3326:1: rule__BlockStatement__Group__0__Impl : ( () ) ;
    public final void rule__BlockStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3330:1: ( ( () ) )
            // InternalBehavior.g:3331:1: ( () )
            {
            // InternalBehavior.g:3331:1: ( () )
            // InternalBehavior.g:3332:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockStatementAccess().getBlockStatementAction_0()); 
            }
            // InternalBehavior.g:3333:1: ()
            // InternalBehavior.g:3335:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockStatementAccess().getBlockStatementAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockStatement__Group__0__Impl"


    // $ANTLR start "rule__BlockStatement__Group__1"
    // InternalBehavior.g:3345:1: rule__BlockStatement__Group__1 : rule__BlockStatement__Group__1__Impl rule__BlockStatement__Group__2 ;
    public final void rule__BlockStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3349:1: ( rule__BlockStatement__Group__1__Impl rule__BlockStatement__Group__2 )
            // InternalBehavior.g:3350:2: rule__BlockStatement__Group__1__Impl rule__BlockStatement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__BlockStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockStatement__Group__1"


    // $ANTLR start "rule__BlockStatement__Group__1__Impl"
    // InternalBehavior.g:3357:1: rule__BlockStatement__Group__1__Impl : ( '{' ) ;
    public final void rule__BlockStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3361:1: ( ( '{' ) )
            // InternalBehavior.g:3362:1: ( '{' )
            {
            // InternalBehavior.g:3362:1: ( '{' )
            // InternalBehavior.g:3363:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockStatementAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockStatementAccess().getLeftCurlyBracketKeyword_1()); 
            }

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
    // $ANTLR end "rule__BlockStatement__Group__1__Impl"


    // $ANTLR start "rule__BlockStatement__Group__2"
    // InternalBehavior.g:3376:1: rule__BlockStatement__Group__2 : rule__BlockStatement__Group__2__Impl rule__BlockStatement__Group__3 ;
    public final void rule__BlockStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3380:1: ( rule__BlockStatement__Group__2__Impl rule__BlockStatement__Group__3 )
            // InternalBehavior.g:3381:2: rule__BlockStatement__Group__2__Impl rule__BlockStatement__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__BlockStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BlockStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockStatement__Group__2"


    // $ANTLR start "rule__BlockStatement__Group__2__Impl"
    // InternalBehavior.g:3388:1: rule__BlockStatement__Group__2__Impl : ( ( rule__BlockStatement__StatementsAssignment_2 )* ) ;
    public final void rule__BlockStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3392:1: ( ( ( rule__BlockStatement__StatementsAssignment_2 )* ) )
            // InternalBehavior.g:3393:1: ( ( rule__BlockStatement__StatementsAssignment_2 )* )
            {
            // InternalBehavior.g:3393:1: ( ( rule__BlockStatement__StatementsAssignment_2 )* )
            // InternalBehavior.g:3394:1: ( rule__BlockStatement__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockStatementAccess().getStatementsAssignment_2()); 
            }
            // InternalBehavior.g:3395:1: ( rule__BlockStatement__StatementsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=33 && LA27_0<=35)||LA27_0==49||LA27_0==53||LA27_0==55) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBehavior.g:3395:2: rule__BlockStatement__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__BlockStatement__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockStatementAccess().getStatementsAssignment_2()); 
            }

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
    // $ANTLR end "rule__BlockStatement__Group__2__Impl"


    // $ANTLR start "rule__BlockStatement__Group__3"
    // InternalBehavior.g:3405:1: rule__BlockStatement__Group__3 : rule__BlockStatement__Group__3__Impl ;
    public final void rule__BlockStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3409:1: ( rule__BlockStatement__Group__3__Impl )
            // InternalBehavior.g:3410:2: rule__BlockStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockStatement__Group__3"


    // $ANTLR start "rule__BlockStatement__Group__3__Impl"
    // InternalBehavior.g:3416:1: rule__BlockStatement__Group__3__Impl : ( '}' ) ;
    public final void rule__BlockStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3420:1: ( ( '}' ) )
            // InternalBehavior.g:3421:1: ( '}' )
            {
            // InternalBehavior.g:3421:1: ( '}' )
            // InternalBehavior.g:3422:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockStatementAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockStatementAccess().getRightCurlyBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__BlockStatement__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalBehavior.g:3443:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3447:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalBehavior.g:3448:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalBehavior.g:3455:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__VariableAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3459:1: ( ( ( rule__Assignment__VariableAssignment_0 ) ) )
            // InternalBehavior.g:3460:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            {
            // InternalBehavior.g:3460:1: ( ( rule__Assignment__VariableAssignment_0 ) )
            // InternalBehavior.g:3461:1: ( rule__Assignment__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }
            // InternalBehavior.g:3462:1: ( rule__Assignment__VariableAssignment_0 )
            // InternalBehavior.g:3462:2: rule__Assignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__VariableAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariableAssignment_0()); 
            }

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
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalBehavior.g:3472:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3476:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalBehavior.g:3477:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalBehavior.g:3484:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3488:1: ( ( '=' ) )
            // InternalBehavior.g:3489:1: ( '=' )
            {
            // InternalBehavior.g:3489:1: ( '=' )
            // InternalBehavior.g:3490:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }

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
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalBehavior.g:3503:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3507:1: ( rule__Assignment__Group__2__Impl )
            // InternalBehavior.g:3508:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalBehavior.g:3514:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3518:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // InternalBehavior.g:3519:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // InternalBehavior.g:3519:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // InternalBehavior.g:3520:1: ( rule__Assignment__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            }
            // InternalBehavior.g:3521:1: ( rule__Assignment__ExpressionAssignment_2 )
            // InternalBehavior.g:3521:2: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            }

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
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__LoopStatement__Group__0"
    // InternalBehavior.g:3537:1: rule__LoopStatement__Group__0 : rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 ;
    public final void rule__LoopStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3541:1: ( rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 )
            // InternalBehavior.g:3542:2: rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__LoopStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__0"


    // $ANTLR start "rule__LoopStatement__Group__0__Impl"
    // InternalBehavior.g:3549:1: rule__LoopStatement__Group__0__Impl : ( 'for' ) ;
    public final void rule__LoopStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3553:1: ( ( 'for' ) )
            // InternalBehavior.g:3554:1: ( 'for' )
            {
            // InternalBehavior.g:3554:1: ( 'for' )
            // InternalBehavior.g:3555:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getForKeyword_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getForKeyword_0()); 
            }

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
    // $ANTLR end "rule__LoopStatement__Group__0__Impl"


    // $ANTLR start "rule__LoopStatement__Group__1"
    // InternalBehavior.g:3568:1: rule__LoopStatement__Group__1 : rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 ;
    public final void rule__LoopStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3572:1: ( rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2 )
            // InternalBehavior.g:3573:2: rule__LoopStatement__Group__1__Impl rule__LoopStatement__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__LoopStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__1"


    // $ANTLR start "rule__LoopStatement__Group__1__Impl"
    // InternalBehavior.g:3580:1: rule__LoopStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__LoopStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3584:1: ( ( '(' ) )
            // InternalBehavior.g:3585:1: ( '(' )
            {
            // InternalBehavior.g:3585:1: ( '(' )
            // InternalBehavior.g:3586:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end "rule__LoopStatement__Group__1__Impl"


    // $ANTLR start "rule__LoopStatement__Group__2"
    // InternalBehavior.g:3599:1: rule__LoopStatement__Group__2 : rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 ;
    public final void rule__LoopStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3603:1: ( rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3 )
            // InternalBehavior.g:3604:2: rule__LoopStatement__Group__2__Impl rule__LoopStatement__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__LoopStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__2"


    // $ANTLR start "rule__LoopStatement__Group__2__Impl"
    // InternalBehavior.g:3611:1: rule__LoopStatement__Group__2__Impl : ( ( rule__LoopStatement__VariableAssignment_2 ) ) ;
    public final void rule__LoopStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3615:1: ( ( ( rule__LoopStatement__VariableAssignment_2 ) ) )
            // InternalBehavior.g:3616:1: ( ( rule__LoopStatement__VariableAssignment_2 ) )
            {
            // InternalBehavior.g:3616:1: ( ( rule__LoopStatement__VariableAssignment_2 ) )
            // InternalBehavior.g:3617:1: ( rule__LoopStatement__VariableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getVariableAssignment_2()); 
            }
            // InternalBehavior.g:3618:1: ( rule__LoopStatement__VariableAssignment_2 )
            // InternalBehavior.g:3618:2: rule__LoopStatement__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__VariableAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getVariableAssignment_2()); 
            }

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
    // $ANTLR end "rule__LoopStatement__Group__2__Impl"


    // $ANTLR start "rule__LoopStatement__Group__3"
    // InternalBehavior.g:3628:1: rule__LoopStatement__Group__3 : rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 ;
    public final void rule__LoopStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3632:1: ( rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4 )
            // InternalBehavior.g:3633:2: rule__LoopStatement__Group__3__Impl rule__LoopStatement__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__LoopStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__3"


    // $ANTLR start "rule__LoopStatement__Group__3__Impl"
    // InternalBehavior.g:3640:1: rule__LoopStatement__Group__3__Impl : ( ':' ) ;
    public final void rule__LoopStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3644:1: ( ( ':' ) )
            // InternalBehavior.g:3645:1: ( ':' )
            {
            // InternalBehavior.g:3645:1: ( ':' )
            // InternalBehavior.g:3646:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getColonKeyword_3()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getColonKeyword_3()); 
            }

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
    // $ANTLR end "rule__LoopStatement__Group__3__Impl"


    // $ANTLR start "rule__LoopStatement__Group__4"
    // InternalBehavior.g:3659:1: rule__LoopStatement__Group__4 : rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5 ;
    public final void rule__LoopStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3663:1: ( rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5 )
            // InternalBehavior.g:3664:2: rule__LoopStatement__Group__4__Impl rule__LoopStatement__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__LoopStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__4"


    // $ANTLR start "rule__LoopStatement__Group__4__Impl"
    // InternalBehavior.g:3671:1: rule__LoopStatement__Group__4__Impl : ( ( rule__LoopStatement__ExpressionAssignment_4 ) ) ;
    public final void rule__LoopStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3675:1: ( ( ( rule__LoopStatement__ExpressionAssignment_4 ) ) )
            // InternalBehavior.g:3676:1: ( ( rule__LoopStatement__ExpressionAssignment_4 ) )
            {
            // InternalBehavior.g:3676:1: ( ( rule__LoopStatement__ExpressionAssignment_4 ) )
            // InternalBehavior.g:3677:1: ( rule__LoopStatement__ExpressionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getExpressionAssignment_4()); 
            }
            // InternalBehavior.g:3678:1: ( rule__LoopStatement__ExpressionAssignment_4 )
            // InternalBehavior.g:3678:2: rule__LoopStatement__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__ExpressionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getExpressionAssignment_4()); 
            }

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
    // $ANTLR end "rule__LoopStatement__Group__4__Impl"


    // $ANTLR start "rule__LoopStatement__Group__5"
    // InternalBehavior.g:3688:1: rule__LoopStatement__Group__5 : rule__LoopStatement__Group__5__Impl rule__LoopStatement__Group__6 ;
    public final void rule__LoopStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3692:1: ( rule__LoopStatement__Group__5__Impl rule__LoopStatement__Group__6 )
            // InternalBehavior.g:3693:2: rule__LoopStatement__Group__5__Impl rule__LoopStatement__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__LoopStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__5"


    // $ANTLR start "rule__LoopStatement__Group__5__Impl"
    // InternalBehavior.g:3700:1: rule__LoopStatement__Group__5__Impl : ( ')' ) ;
    public final void rule__LoopStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3704:1: ( ( ')' ) )
            // InternalBehavior.g:3705:1: ( ')' )
            {
            // InternalBehavior.g:3705:1: ( ')' )
            // InternalBehavior.g:3706:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getRightParenthesisKeyword_5()); 
            }

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
    // $ANTLR end "rule__LoopStatement__Group__5__Impl"


    // $ANTLR start "rule__LoopStatement__Group__6"
    // InternalBehavior.g:3719:1: rule__LoopStatement__Group__6 : rule__LoopStatement__Group__6__Impl ;
    public final void rule__LoopStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3723:1: ( rule__LoopStatement__Group__6__Impl )
            // InternalBehavior.g:3724:2: rule__LoopStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopStatement__Group__6"


    // $ANTLR start "rule__LoopStatement__Group__6__Impl"
    // InternalBehavior.g:3730:1: rule__LoopStatement__Group__6__Impl : ( ( rule__LoopStatement__StatementAssignment_6 ) ) ;
    public final void rule__LoopStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3734:1: ( ( ( rule__LoopStatement__StatementAssignment_6 ) ) )
            // InternalBehavior.g:3735:1: ( ( rule__LoopStatement__StatementAssignment_6 ) )
            {
            // InternalBehavior.g:3735:1: ( ( rule__LoopStatement__StatementAssignment_6 ) )
            // InternalBehavior.g:3736:1: ( rule__LoopStatement__StatementAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getStatementAssignment_6()); 
            }
            // InternalBehavior.g:3737:1: ( rule__LoopStatement__StatementAssignment_6 )
            // InternalBehavior.g:3737:2: rule__LoopStatement__StatementAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__StatementAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getStatementAssignment_6()); 
            }

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
    // $ANTLR end "rule__LoopStatement__Group__6__Impl"


    // $ANTLR start "rule__DataAccessStatement__Group__0"
    // InternalBehavior.g:3761:1: rule__DataAccessStatement__Group__0 : rule__DataAccessStatement__Group__0__Impl rule__DataAccessStatement__Group__1 ;
    public final void rule__DataAccessStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3765:1: ( rule__DataAccessStatement__Group__0__Impl rule__DataAccessStatement__Group__1 )
            // InternalBehavior.g:3766:2: rule__DataAccessStatement__Group__0__Impl rule__DataAccessStatement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataAccessStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DataAccessStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessStatement__Group__0"


    // $ANTLR start "rule__DataAccessStatement__Group__0__Impl"
    // InternalBehavior.g:3773:1: rule__DataAccessStatement__Group__0__Impl : ( ( rule__DataAccessStatement__OperationAssignment_0 ) ) ;
    public final void rule__DataAccessStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3777:1: ( ( ( rule__DataAccessStatement__OperationAssignment_0 ) ) )
            // InternalBehavior.g:3778:1: ( ( rule__DataAccessStatement__OperationAssignment_0 ) )
            {
            // InternalBehavior.g:3778:1: ( ( rule__DataAccessStatement__OperationAssignment_0 ) )
            // InternalBehavior.g:3779:1: ( rule__DataAccessStatement__OperationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataAccessStatementAccess().getOperationAssignment_0()); 
            }
            // InternalBehavior.g:3780:1: ( rule__DataAccessStatement__OperationAssignment_0 )
            // InternalBehavior.g:3780:2: rule__DataAccessStatement__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessStatement__OperationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataAccessStatementAccess().getOperationAssignment_0()); 
            }

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
    // $ANTLR end "rule__DataAccessStatement__Group__0__Impl"


    // $ANTLR start "rule__DataAccessStatement__Group__1"
    // InternalBehavior.g:3790:1: rule__DataAccessStatement__Group__1 : rule__DataAccessStatement__Group__1__Impl ;
    public final void rule__DataAccessStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3794:1: ( rule__DataAccessStatement__Group__1__Impl )
            // InternalBehavior.g:3795:2: rule__DataAccessStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccessStatement__Group__1"


    // $ANTLR start "rule__DataAccessStatement__Group__1__Impl"
    // InternalBehavior.g:3801:1: rule__DataAccessStatement__Group__1__Impl : ( ( rule__DataAccessStatement__VariableAssignment_1 ) ) ;
    public final void rule__DataAccessStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3805:1: ( ( ( rule__DataAccessStatement__VariableAssignment_1 ) ) )
            // InternalBehavior.g:3806:1: ( ( rule__DataAccessStatement__VariableAssignment_1 ) )
            {
            // InternalBehavior.g:3806:1: ( ( rule__DataAccessStatement__VariableAssignment_1 ) )
            // InternalBehavior.g:3807:1: ( rule__DataAccessStatement__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataAccessStatementAccess().getVariableAssignment_1()); 
            }
            // InternalBehavior.g:3808:1: ( rule__DataAccessStatement__VariableAssignment_1 )
            // InternalBehavior.g:3808:2: rule__DataAccessStatement__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataAccessStatement__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataAccessStatementAccess().getVariableAssignment_1()); 
            }

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
    // $ANTLR end "rule__DataAccessStatement__Group__1__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__0"
    // InternalBehavior.g:3822:1: rule__ReturnStatement__Group__0 : rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 ;
    public final void rule__ReturnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3826:1: ( rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 )
            // InternalBehavior.g:3827:2: rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ReturnStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__0"


    // $ANTLR start "rule__ReturnStatement__Group__0__Impl"
    // InternalBehavior.g:3834:1: rule__ReturnStatement__Group__0__Impl : ( 'return' ) ;
    public final void rule__ReturnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3838:1: ( ( 'return' ) )
            // InternalBehavior.g:3839:1: ( 'return' )
            {
            // InternalBehavior.g:3839:1: ( 'return' )
            // InternalBehavior.g:3840:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getReturnKeyword_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getReturnKeyword_0()); 
            }

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
    // $ANTLR end "rule__ReturnStatement__Group__0__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__1"
    // InternalBehavior.g:3853:1: rule__ReturnStatement__Group__1 : rule__ReturnStatement__Group__1__Impl ;
    public final void rule__ReturnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3857:1: ( rule__ReturnStatement__Group__1__Impl )
            // InternalBehavior.g:3858:2: rule__ReturnStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__1"


    // $ANTLR start "rule__ReturnStatement__Group__1__Impl"
    // InternalBehavior.g:3864:1: rule__ReturnStatement__Group__1__Impl : ( ( rule__ReturnStatement__ExpressionAssignment_1 ) ) ;
    public final void rule__ReturnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3868:1: ( ( ( rule__ReturnStatement__ExpressionAssignment_1 ) ) )
            // InternalBehavior.g:3869:1: ( ( rule__ReturnStatement__ExpressionAssignment_1 ) )
            {
            // InternalBehavior.g:3869:1: ( ( rule__ReturnStatement__ExpressionAssignment_1 ) )
            // InternalBehavior.g:3870:1: ( rule__ReturnStatement__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getExpressionAssignment_1()); 
            }
            // InternalBehavior.g:3871:1: ( rule__ReturnStatement__ExpressionAssignment_1 )
            // InternalBehavior.g:3871:2: rule__ReturnStatement__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatement__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getExpressionAssignment_1()); 
            }

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
    // $ANTLR end "rule__ReturnStatement__Group__1__Impl"


    // $ANTLR start "rule__VariableCall__Group__0"
    // InternalBehavior.g:3885:1: rule__VariableCall__Group__0 : rule__VariableCall__Group__0__Impl rule__VariableCall__Group__1 ;
    public final void rule__VariableCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3889:1: ( rule__VariableCall__Group__0__Impl rule__VariableCall__Group__1 )
            // InternalBehavior.g:3890:2: rule__VariableCall__Group__0__Impl rule__VariableCall__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__VariableCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCall__Group__0"


    // $ANTLR start "rule__VariableCall__Group__0__Impl"
    // InternalBehavior.g:3897:1: rule__VariableCall__Group__0__Impl : ( ( rule__VariableCall__VariableAssignment_0 ) ) ;
    public final void rule__VariableCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3901:1: ( ( ( rule__VariableCall__VariableAssignment_0 ) ) )
            // InternalBehavior.g:3902:1: ( ( rule__VariableCall__VariableAssignment_0 ) )
            {
            // InternalBehavior.g:3902:1: ( ( rule__VariableCall__VariableAssignment_0 ) )
            // InternalBehavior.g:3903:1: ( rule__VariableCall__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getVariableAssignment_0()); 
            }
            // InternalBehavior.g:3904:1: ( rule__VariableCall__VariableAssignment_0 )
            // InternalBehavior.g:3904:2: rule__VariableCall__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableCall__VariableAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getVariableAssignment_0()); 
            }

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
    // $ANTLR end "rule__VariableCall__Group__0__Impl"


    // $ANTLR start "rule__VariableCall__Group__1"
    // InternalBehavior.g:3914:1: rule__VariableCall__Group__1 : rule__VariableCall__Group__1__Impl rule__VariableCall__Group__2 ;
    public final void rule__VariableCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3918:1: ( rule__VariableCall__Group__1__Impl rule__VariableCall__Group__2 )
            // InternalBehavior.g:3919:2: rule__VariableCall__Group__1__Impl rule__VariableCall__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__VariableCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCall__Group__1"


    // $ANTLR start "rule__VariableCall__Group__1__Impl"
    // InternalBehavior.g:3926:1: rule__VariableCall__Group__1__Impl : ( ( rule__VariableCall__Group_1__0 )? ) ;
    public final void rule__VariableCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3930:1: ( ( ( rule__VariableCall__Group_1__0 )? ) )
            // InternalBehavior.g:3931:1: ( ( rule__VariableCall__Group_1__0 )? )
            {
            // InternalBehavior.g:3931:1: ( ( rule__VariableCall__Group_1__0 )? )
            // InternalBehavior.g:3932:1: ( rule__VariableCall__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getGroup_1()); 
            }
            // InternalBehavior.g:3933:1: ( rule__VariableCall__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBehavior.g:3933:2: rule__VariableCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableCall__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__VariableCall__Group__1__Impl"


    // $ANTLR start "rule__VariableCall__Group__2"
    // InternalBehavior.g:3943:1: rule__VariableCall__Group__2 : rule__VariableCall__Group__2__Impl ;
    public final void rule__VariableCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3947:1: ( rule__VariableCall__Group__2__Impl )
            // InternalBehavior.g:3948:2: rule__VariableCall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCall__Group__2"


    // $ANTLR start "rule__VariableCall__Group__2__Impl"
    // InternalBehavior.g:3954:1: rule__VariableCall__Group__2__Impl : ( ( rule__VariableCall__Group_2__0 )? ) ;
    public final void rule__VariableCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3958:1: ( ( ( rule__VariableCall__Group_2__0 )? ) )
            // InternalBehavior.g:3959:1: ( ( rule__VariableCall__Group_2__0 )? )
            {
            // InternalBehavior.g:3959:1: ( ( rule__VariableCall__Group_2__0 )? )
            // InternalBehavior.g:3960:1: ( rule__VariableCall__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getGroup_2()); 
            }
            // InternalBehavior.g:3961:1: ( rule__VariableCall__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBehavior.g:3961:2: rule__VariableCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableCall__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__VariableCall__Group__2__Impl"


    // $ANTLR start "rule__VariableCall__Group_1__0"
    // InternalBehavior.g:3977:1: rule__VariableCall__Group_1__0 : rule__VariableCall__Group_1__0__Impl rule__VariableCall__Group_1__1 ;
    public final void rule__VariableCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3981:1: ( rule__VariableCall__Group_1__0__Impl rule__VariableCall__Group_1__1 )
            // InternalBehavior.g:3982:2: rule__VariableCall__Group_1__0__Impl rule__VariableCall__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__VariableCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCall__Group_1__0"


    // $ANTLR start "rule__VariableCall__Group_1__0__Impl"
    // InternalBehavior.g:3989:1: rule__VariableCall__Group_1__0__Impl : ( '[' ) ;
    public final void rule__VariableCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:3993:1: ( ( '[' ) )
            // InternalBehavior.g:3994:1: ( '[' )
            {
            // InternalBehavior.g:3994:1: ( '[' )
            // InternalBehavior.g:3995:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getLeftSquareBracketKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__VariableCall__Group_1__0__Impl"


    // $ANTLR start "rule__VariableCall__Group_1__1"
    // InternalBehavior.g:4008:1: rule__VariableCall__Group_1__1 : rule__VariableCall__Group_1__1__Impl rule__VariableCall__Group_1__2 ;
    public final void rule__VariableCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4012:1: ( rule__VariableCall__Group_1__1__Impl rule__VariableCall__Group_1__2 )
            // InternalBehavior.g:4013:2: rule__VariableCall__Group_1__1__Impl rule__VariableCall__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__VariableCall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCall__Group_1__1"


    // $ANTLR start "rule__VariableCall__Group_1__1__Impl"
    // InternalBehavior.g:4020:1: rule__VariableCall__Group_1__1__Impl : ( ( rule__VariableCall__IndexAssignment_1_1 )? ) ;
    public final void rule__VariableCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4024:1: ( ( ( rule__VariableCall__IndexAssignment_1_1 )? ) )
            // InternalBehavior.g:4025:1: ( ( rule__VariableCall__IndexAssignment_1_1 )? )
            {
            // InternalBehavior.g:4025:1: ( ( rule__VariableCall__IndexAssignment_1_1 )? )
            // InternalBehavior.g:4026:1: ( rule__VariableCall__IndexAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getIndexAssignment_1_1()); 
            }
            // InternalBehavior.g:4027:1: ( rule__VariableCall__IndexAssignment_1_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_CHARACTER)||(LA30_0>=20 && LA30_0<=21)||(LA30_0>=28 && LA30_0<=29)||LA30_0==59||LA30_0==61||LA30_0==65) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBehavior.g:4027:2: rule__VariableCall__IndexAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableCall__IndexAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getIndexAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__VariableCall__Group_1__1__Impl"


    // $ANTLR start "rule__VariableCall__Group_1__2"
    // InternalBehavior.g:4037:1: rule__VariableCall__Group_1__2 : rule__VariableCall__Group_1__2__Impl ;
    public final void rule__VariableCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4041:1: ( rule__VariableCall__Group_1__2__Impl )
            // InternalBehavior.g:4042:2: rule__VariableCall__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCall__Group_1__2"


    // $ANTLR start "rule__VariableCall__Group_1__2__Impl"
    // InternalBehavior.g:4048:1: rule__VariableCall__Group_1__2__Impl : ( ']' ) ;
    public final void rule__VariableCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4052:1: ( ( ']' ) )
            // InternalBehavior.g:4053:1: ( ']' )
            {
            // InternalBehavior.g:4053:1: ( ']' )
            // InternalBehavior.g:4054:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getRightSquareBracketKeyword_1_2()); 
            }

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
    // $ANTLR end "rule__VariableCall__Group_1__2__Impl"


    // $ANTLR start "rule__VariableCall__Group_2__0"
    // InternalBehavior.g:4073:1: rule__VariableCall__Group_2__0 : rule__VariableCall__Group_2__0__Impl rule__VariableCall__Group_2__1 ;
    public final void rule__VariableCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4077:1: ( rule__VariableCall__Group_2__0__Impl rule__VariableCall__Group_2__1 )
            // InternalBehavior.g:4078:2: rule__VariableCall__Group_2__0__Impl rule__VariableCall__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__VariableCall__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCall__Group_2__0"


    // $ANTLR start "rule__VariableCall__Group_2__0__Impl"
    // InternalBehavior.g:4085:1: rule__VariableCall__Group_2__0__Impl : ( '.' ) ;
    public final void rule__VariableCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4089:1: ( ( '.' ) )
            // InternalBehavior.g:4090:1: ( '.' )
            {
            // InternalBehavior.g:4090:1: ( '.' )
            // InternalBehavior.g:4091:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getFullStopKeyword_2_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getFullStopKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__VariableCall__Group_2__0__Impl"


    // $ANTLR start "rule__VariableCall__Group_2__1"
    // InternalBehavior.g:4104:1: rule__VariableCall__Group_2__1 : rule__VariableCall__Group_2__1__Impl ;
    public final void rule__VariableCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4108:1: ( rule__VariableCall__Group_2__1__Impl )
            // InternalBehavior.g:4109:2: rule__VariableCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableCall__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCall__Group_2__1"


    // $ANTLR start "rule__VariableCall__Group_2__1__Impl"
    // InternalBehavior.g:4115:1: rule__VariableCall__Group_2__1__Impl : ( ( rule__VariableCall__SubPropertyAssignment_2_1 ) ) ;
    public final void rule__VariableCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4119:1: ( ( ( rule__VariableCall__SubPropertyAssignment_2_1 ) ) )
            // InternalBehavior.g:4120:1: ( ( rule__VariableCall__SubPropertyAssignment_2_1 ) )
            {
            // InternalBehavior.g:4120:1: ( ( rule__VariableCall__SubPropertyAssignment_2_1 ) )
            // InternalBehavior.g:4121:1: ( rule__VariableCall__SubPropertyAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getSubPropertyAssignment_2_1()); 
            }
            // InternalBehavior.g:4122:1: ( rule__VariableCall__SubPropertyAssignment_2_1 )
            // InternalBehavior.g:4122:2: rule__VariableCall__SubPropertyAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableCall__SubPropertyAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getSubPropertyAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__VariableCall__Group_2__1__Impl"


    // $ANTLR start "rule__PropertyCall__Group__0"
    // InternalBehavior.g:4136:1: rule__PropertyCall__Group__0 : rule__PropertyCall__Group__0__Impl rule__PropertyCall__Group__1 ;
    public final void rule__PropertyCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4140:1: ( rule__PropertyCall__Group__0__Impl rule__PropertyCall__Group__1 )
            // InternalBehavior.g:4141:2: rule__PropertyCall__Group__0__Impl rule__PropertyCall__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__PropertyCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCall__Group__0"


    // $ANTLR start "rule__PropertyCall__Group__0__Impl"
    // InternalBehavior.g:4148:1: rule__PropertyCall__Group__0__Impl : ( ( rule__PropertyCall__PropertyAssignment_0 ) ) ;
    public final void rule__PropertyCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4152:1: ( ( ( rule__PropertyCall__PropertyAssignment_0 ) ) )
            // InternalBehavior.g:4153:1: ( ( rule__PropertyCall__PropertyAssignment_0 ) )
            {
            // InternalBehavior.g:4153:1: ( ( rule__PropertyCall__PropertyAssignment_0 ) )
            // InternalBehavior.g:4154:1: ( rule__PropertyCall__PropertyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getPropertyAssignment_0()); 
            }
            // InternalBehavior.g:4155:1: ( rule__PropertyCall__PropertyAssignment_0 )
            // InternalBehavior.g:4155:2: rule__PropertyCall__PropertyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCall__PropertyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getPropertyAssignment_0()); 
            }

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
    // $ANTLR end "rule__PropertyCall__Group__0__Impl"


    // $ANTLR start "rule__PropertyCall__Group__1"
    // InternalBehavior.g:4165:1: rule__PropertyCall__Group__1 : rule__PropertyCall__Group__1__Impl rule__PropertyCall__Group__2 ;
    public final void rule__PropertyCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4169:1: ( rule__PropertyCall__Group__1__Impl rule__PropertyCall__Group__2 )
            // InternalBehavior.g:4170:2: rule__PropertyCall__Group__1__Impl rule__PropertyCall__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__PropertyCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCall__Group__1"


    // $ANTLR start "rule__PropertyCall__Group__1__Impl"
    // InternalBehavior.g:4177:1: rule__PropertyCall__Group__1__Impl : ( ( rule__PropertyCall__Group_1__0 )? ) ;
    public final void rule__PropertyCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4181:1: ( ( ( rule__PropertyCall__Group_1__0 )? ) )
            // InternalBehavior.g:4182:1: ( ( rule__PropertyCall__Group_1__0 )? )
            {
            // InternalBehavior.g:4182:1: ( ( rule__PropertyCall__Group_1__0 )? )
            // InternalBehavior.g:4183:1: ( rule__PropertyCall__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getGroup_1()); 
            }
            // InternalBehavior.g:4184:1: ( rule__PropertyCall__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==56) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBehavior.g:4184:2: rule__PropertyCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyCall__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__PropertyCall__Group__1__Impl"


    // $ANTLR start "rule__PropertyCall__Group__2"
    // InternalBehavior.g:4194:1: rule__PropertyCall__Group__2 : rule__PropertyCall__Group__2__Impl ;
    public final void rule__PropertyCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4198:1: ( rule__PropertyCall__Group__2__Impl )
            // InternalBehavior.g:4199:2: rule__PropertyCall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCall__Group__2"


    // $ANTLR start "rule__PropertyCall__Group__2__Impl"
    // InternalBehavior.g:4205:1: rule__PropertyCall__Group__2__Impl : ( ( rule__PropertyCall__Group_2__0 )? ) ;
    public final void rule__PropertyCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4209:1: ( ( ( rule__PropertyCall__Group_2__0 )? ) )
            // InternalBehavior.g:4210:1: ( ( rule__PropertyCall__Group_2__0 )? )
            {
            // InternalBehavior.g:4210:1: ( ( rule__PropertyCall__Group_2__0 )? )
            // InternalBehavior.g:4211:1: ( rule__PropertyCall__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getGroup_2()); 
            }
            // InternalBehavior.g:4212:1: ( rule__PropertyCall__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBehavior.g:4212:2: rule__PropertyCall__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyCall__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__PropertyCall__Group__2__Impl"


    // $ANTLR start "rule__PropertyCall__Group_1__0"
    // InternalBehavior.g:4228:1: rule__PropertyCall__Group_1__0 : rule__PropertyCall__Group_1__0__Impl rule__PropertyCall__Group_1__1 ;
    public final void rule__PropertyCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4232:1: ( rule__PropertyCall__Group_1__0__Impl rule__PropertyCall__Group_1__1 )
            // InternalBehavior.g:4233:2: rule__PropertyCall__Group_1__0__Impl rule__PropertyCall__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__PropertyCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyCall__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCall__Group_1__0"


    // $ANTLR start "rule__PropertyCall__Group_1__0__Impl"
    // InternalBehavior.g:4240:1: rule__PropertyCall__Group_1__0__Impl : ( '[' ) ;
    public final void rule__PropertyCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4244:1: ( ( '[' ) )
            // InternalBehavior.g:4245:1: ( '[' )
            {
            // InternalBehavior.g:4245:1: ( '[' )
            // InternalBehavior.g:4246:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getLeftSquareBracketKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__PropertyCall__Group_1__0__Impl"


    // $ANTLR start "rule__PropertyCall__Group_1__1"
    // InternalBehavior.g:4259:1: rule__PropertyCall__Group_1__1 : rule__PropertyCall__Group_1__1__Impl rule__PropertyCall__Group_1__2 ;
    public final void rule__PropertyCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4263:1: ( rule__PropertyCall__Group_1__1__Impl rule__PropertyCall__Group_1__2 )
            // InternalBehavior.g:4264:2: rule__PropertyCall__Group_1__1__Impl rule__PropertyCall__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__PropertyCall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyCall__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCall__Group_1__1"


    // $ANTLR start "rule__PropertyCall__Group_1__1__Impl"
    // InternalBehavior.g:4271:1: rule__PropertyCall__Group_1__1__Impl : ( ( rule__PropertyCall__IndexAssignment_1_1 )? ) ;
    public final void rule__PropertyCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4275:1: ( ( ( rule__PropertyCall__IndexAssignment_1_1 )? ) )
            // InternalBehavior.g:4276:1: ( ( rule__PropertyCall__IndexAssignment_1_1 )? )
            {
            // InternalBehavior.g:4276:1: ( ( rule__PropertyCall__IndexAssignment_1_1 )? )
            // InternalBehavior.g:4277:1: ( rule__PropertyCall__IndexAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getIndexAssignment_1_1()); 
            }
            // InternalBehavior.g:4278:1: ( rule__PropertyCall__IndexAssignment_1_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_CHARACTER)||(LA33_0>=20 && LA33_0<=21)||(LA33_0>=28 && LA33_0<=29)||LA33_0==59||LA33_0==61||LA33_0==65) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBehavior.g:4278:2: rule__PropertyCall__IndexAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyCall__IndexAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getIndexAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__PropertyCall__Group_1__1__Impl"


    // $ANTLR start "rule__PropertyCall__Group_1__2"
    // InternalBehavior.g:4288:1: rule__PropertyCall__Group_1__2 : rule__PropertyCall__Group_1__2__Impl ;
    public final void rule__PropertyCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4292:1: ( rule__PropertyCall__Group_1__2__Impl )
            // InternalBehavior.g:4293:2: rule__PropertyCall__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCall__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCall__Group_1__2"


    // $ANTLR start "rule__PropertyCall__Group_1__2__Impl"
    // InternalBehavior.g:4299:1: rule__PropertyCall__Group_1__2__Impl : ( ']' ) ;
    public final void rule__PropertyCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4303:1: ( ( ']' ) )
            // InternalBehavior.g:4304:1: ( ']' )
            {
            // InternalBehavior.g:4304:1: ( ']' )
            // InternalBehavior.g:4305:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getRightSquareBracketKeyword_1_2()); 
            }

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
    // $ANTLR end "rule__PropertyCall__Group_1__2__Impl"


    // $ANTLR start "rule__PropertyCall__Group_2__0"
    // InternalBehavior.g:4324:1: rule__PropertyCall__Group_2__0 : rule__PropertyCall__Group_2__0__Impl rule__PropertyCall__Group_2__1 ;
    public final void rule__PropertyCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4328:1: ( rule__PropertyCall__Group_2__0__Impl rule__PropertyCall__Group_2__1 )
            // InternalBehavior.g:4329:2: rule__PropertyCall__Group_2__0__Impl rule__PropertyCall__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__PropertyCall__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyCall__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCall__Group_2__0"


    // $ANTLR start "rule__PropertyCall__Group_2__0__Impl"
    // InternalBehavior.g:4336:1: rule__PropertyCall__Group_2__0__Impl : ( '.' ) ;
    public final void rule__PropertyCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4340:1: ( ( '.' ) )
            // InternalBehavior.g:4341:1: ( '.' )
            {
            // InternalBehavior.g:4341:1: ( '.' )
            // InternalBehavior.g:4342:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getFullStopKeyword_2_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getFullStopKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__PropertyCall__Group_2__0__Impl"


    // $ANTLR start "rule__PropertyCall__Group_2__1"
    // InternalBehavior.g:4355:1: rule__PropertyCall__Group_2__1 : rule__PropertyCall__Group_2__1__Impl ;
    public final void rule__PropertyCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4359:1: ( rule__PropertyCall__Group_2__1__Impl )
            // InternalBehavior.g:4360:2: rule__PropertyCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCall__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyCall__Group_2__1"


    // $ANTLR start "rule__PropertyCall__Group_2__1__Impl"
    // InternalBehavior.g:4366:1: rule__PropertyCall__Group_2__1__Impl : ( ( rule__PropertyCall__SubPropertyAssignment_2_1 ) ) ;
    public final void rule__PropertyCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4370:1: ( ( ( rule__PropertyCall__SubPropertyAssignment_2_1 ) ) )
            // InternalBehavior.g:4371:1: ( ( rule__PropertyCall__SubPropertyAssignment_2_1 ) )
            {
            // InternalBehavior.g:4371:1: ( ( rule__PropertyCall__SubPropertyAssignment_2_1 ) )
            // InternalBehavior.g:4372:1: ( rule__PropertyCall__SubPropertyAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getSubPropertyAssignment_2_1()); 
            }
            // InternalBehavior.g:4373:1: ( rule__PropertyCall__SubPropertyAssignment_2_1 )
            // InternalBehavior.g:4373:2: rule__PropertyCall__SubPropertyAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyCall__SubPropertyAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getSubPropertyAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__PropertyCall__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalBehavior.g:4387:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4391:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalBehavior.g:4392:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalBehavior.g:4399:1: rule__Expression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4403:1: ( ( ruleAndExpression ) )
            // InternalBehavior.g:4404:1: ( ruleAndExpression )
            {
            // InternalBehavior.g:4404:1: ( ruleAndExpression )
            // InternalBehavior.g:4405:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalBehavior.g:4416:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4420:1: ( rule__Expression__Group__1__Impl )
            // InternalBehavior.g:4421:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalBehavior.g:4427:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4431:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalBehavior.g:4432:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalBehavior.g:4432:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalBehavior.g:4433:1: ( rule__Expression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalBehavior.g:4434:1: ( rule__Expression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==62) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBehavior.g:4434:2: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalBehavior.g:4448:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4452:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalBehavior.g:4453:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalBehavior.g:4460:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Group_1_0__0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4464:1: ( ( ( rule__Expression__Group_1_0__0 ) ) )
            // InternalBehavior.g:4465:1: ( ( rule__Expression__Group_1_0__0 ) )
            {
            // InternalBehavior.g:4465:1: ( ( rule__Expression__Group_1_0__0 ) )
            // InternalBehavior.g:4466:1: ( rule__Expression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1_0()); 
            }
            // InternalBehavior.g:4467:1: ( rule__Expression__Group_1_0__0 )
            // InternalBehavior.g:4467:2: rule__Expression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalBehavior.g:4477:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4481:1: ( rule__Expression__Group_1__1__Impl )
            // InternalBehavior.g:4482:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalBehavior.g:4488:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4492:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalBehavior.g:4493:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalBehavior.g:4493:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalBehavior.g:4494:1: ( rule__Expression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalBehavior.g:4495:1: ( rule__Expression__RightAssignment_1_1 )
            // InternalBehavior.g:4495:2: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__0"
    // InternalBehavior.g:4509:1: rule__Expression__Group_1_0__0 : rule__Expression__Group_1_0__0__Impl ;
    public final void rule__Expression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4513:1: ( rule__Expression__Group_1_0__0__Impl )
            // InternalBehavior.g:4514:2: rule__Expression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0__0"


    // $ANTLR start "rule__Expression__Group_1_0__0__Impl"
    // InternalBehavior.g:4520:1: rule__Expression__Group_1_0__0__Impl : ( ( rule__Expression__Group_1_0_0__0 ) ) ;
    public final void rule__Expression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4524:1: ( ( ( rule__Expression__Group_1_0_0__0 ) ) )
            // InternalBehavior.g:4525:1: ( ( rule__Expression__Group_1_0_0__0 ) )
            {
            // InternalBehavior.g:4525:1: ( ( rule__Expression__Group_1_0_0__0 ) )
            // InternalBehavior.g:4526:1: ( rule__Expression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalBehavior.g:4527:1: ( rule__Expression__Group_1_0_0__0 )
            // InternalBehavior.g:4527:2: rule__Expression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__Expression__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__0"
    // InternalBehavior.g:4539:1: rule__Expression__Group_1_0_0__0 : rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 ;
    public final void rule__Expression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4543:1: ( rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 )
            // InternalBehavior.g:4544:2: rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_26);
            rule__Expression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0"


    // $ANTLR start "rule__Expression__Group_1_0_0__0__Impl"
    // InternalBehavior.g:4551:1: rule__Expression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4555:1: ( ( () ) )
            // InternalBehavior.g:4556:1: ( () )
            {
            // InternalBehavior.g:4556:1: ( () )
            // InternalBehavior.g:4557:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0_0_0()); 
            }
            // InternalBehavior.g:4558:1: ()
            // InternalBehavior.g:4560:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__1"
    // InternalBehavior.g:4570:1: rule__Expression__Group_1_0_0__1 : rule__Expression__Group_1_0_0__1__Impl ;
    public final void rule__Expression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4574:1: ( rule__Expression__Group_1_0_0__1__Impl )
            // InternalBehavior.g:4575:2: rule__Expression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__1"


    // $ANTLR start "rule__Expression__Group_1_0_0__1__Impl"
    // InternalBehavior.g:4581:1: rule__Expression__Group_1_0_0__1__Impl : ( ( rule__Expression__FeatureAssignment_1_0_0_1 ) ) ;
    public final void rule__Expression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4585:1: ( ( ( rule__Expression__FeatureAssignment_1_0_0_1 ) ) )
            // InternalBehavior.g:4586:1: ( ( rule__Expression__FeatureAssignment_1_0_0_1 ) )
            {
            // InternalBehavior.g:4586:1: ( ( rule__Expression__FeatureAssignment_1_0_0_1 ) )
            // InternalBehavior.g:4587:1: ( rule__Expression__FeatureAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }
            // InternalBehavior.g:4588:1: ( rule__Expression__FeatureAssignment_1_0_0_1 )
            // InternalBehavior.g:4588:2: rule__Expression__FeatureAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__FeatureAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__Expression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalBehavior.g:4602:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4606:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalBehavior.g:4607:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalBehavior.g:4614:1: rule__AndExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4618:1: ( ( ruleRelationalExpression ) )
            // InternalBehavior.g:4619:1: ( ruleRelationalExpression )
            {
            // InternalBehavior.g:4619:1: ( ruleRelationalExpression )
            // InternalBehavior.g:4620:1: ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalBehavior.g:4631:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4635:1: ( rule__AndExpression__Group__1__Impl )
            // InternalBehavior.g:4636:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalBehavior.g:4642:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4646:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalBehavior.g:4647:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalBehavior.g:4647:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalBehavior.g:4648:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalBehavior.g:4649:1: ( rule__AndExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==63) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBehavior.g:4649:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalBehavior.g:4663:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4667:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalBehavior.g:4668:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalBehavior.g:4675:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__Group_1_0__0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4679:1: ( ( ( rule__AndExpression__Group_1_0__0 ) ) )
            // InternalBehavior.g:4680:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            {
            // InternalBehavior.g:4680:1: ( ( rule__AndExpression__Group_1_0__0 ) )
            // InternalBehavior.g:4681:1: ( rule__AndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalBehavior.g:4682:1: ( rule__AndExpression__Group_1_0__0 )
            // InternalBehavior.g:4682:2: rule__AndExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalBehavior.g:4692:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4696:1: ( rule__AndExpression__Group_1__1__Impl )
            // InternalBehavior.g:4697:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalBehavior.g:4703:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4707:1: ( ( ( rule__AndExpression__RightAssignment_1_1 ) ) )
            // InternalBehavior.g:4708:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            {
            // InternalBehavior.g:4708:1: ( ( rule__AndExpression__RightAssignment_1_1 ) )
            // InternalBehavior.g:4709:1: ( rule__AndExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalBehavior.g:4710:1: ( rule__AndExpression__RightAssignment_1_1 )
            // InternalBehavior.g:4710:2: rule__AndExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1_0__0"
    // InternalBehavior.g:4724:1: rule__AndExpression__Group_1_0__0 : rule__AndExpression__Group_1_0__0__Impl ;
    public final void rule__AndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4728:1: ( rule__AndExpression__Group_1_0__0__Impl )
            // InternalBehavior.g:4729:2: rule__AndExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1_0__0"


    // $ANTLR start "rule__AndExpression__Group_1_0__0__Impl"
    // InternalBehavior.g:4735:1: rule__AndExpression__Group_1_0__0__Impl : ( ( rule__AndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4739:1: ( ( ( rule__AndExpression__Group_1_0_0__0 ) ) )
            // InternalBehavior.g:4740:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            {
            // InternalBehavior.g:4740:1: ( ( rule__AndExpression__Group_1_0_0__0 ) )
            // InternalBehavior.g:4741:1: ( rule__AndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalBehavior.g:4742:1: ( rule__AndExpression__Group_1_0_0__0 )
            // InternalBehavior.g:4742:2: rule__AndExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__0"
    // InternalBehavior.g:4754:1: rule__AndExpression__Group_1_0_0__0 : rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 ;
    public final void rule__AndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4758:1: ( rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1 )
            // InternalBehavior.g:4759:2: rule__AndExpression__Group_1_0_0__0__Impl rule__AndExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_28);
            rule__AndExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1_0_0__0"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__0__Impl"
    // InternalBehavior.g:4766:1: rule__AndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4770:1: ( ( () ) )
            // InternalBehavior.g:4771:1: ( () )
            {
            // InternalBehavior.g:4771:1: ( () )
            // InternalBehavior.g:4772:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0()); 
            }
            // InternalBehavior.g:4773:1: ()
            // InternalBehavior.g:4775:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__1"
    // InternalBehavior.g:4785:1: rule__AndExpression__Group_1_0_0__1 : rule__AndExpression__Group_1_0_0__1__Impl ;
    public final void rule__AndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4789:1: ( rule__AndExpression__Group_1_0_0__1__Impl )
            // InternalBehavior.g:4790:2: rule__AndExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1_0_0__1"


    // $ANTLR start "rule__AndExpression__Group_1_0_0__1__Impl"
    // InternalBehavior.g:4796:1: rule__AndExpression__Group_1_0_0__1__Impl : ( ( rule__AndExpression__FeatureAssignment_1_0_0_1 ) ) ;
    public final void rule__AndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4800:1: ( ( ( rule__AndExpression__FeatureAssignment_1_0_0_1 ) ) )
            // InternalBehavior.g:4801:1: ( ( rule__AndExpression__FeatureAssignment_1_0_0_1 ) )
            {
            // InternalBehavior.g:4801:1: ( ( rule__AndExpression__FeatureAssignment_1_0_0_1 ) )
            // InternalBehavior.g:4802:1: ( rule__AndExpression__FeatureAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }
            // InternalBehavior.g:4803:1: ( rule__AndExpression__FeatureAssignment_1_0_0_1 )
            // InternalBehavior.g:4803:2: rule__AndExpression__FeatureAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__FeatureAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__0"
    // InternalBehavior.g:4817:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4821:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalBehavior.g:4822:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__RelationalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__0"


    // $ANTLR start "rule__RelationalExpression__Group__0__Impl"
    // InternalBehavior.g:4829:1: rule__RelationalExpression__Group__0__Impl : ( ruleOtherExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4833:1: ( ( ruleOtherExpression ) )
            // InternalBehavior.g:4834:1: ( ruleOtherExpression )
            {
            // InternalBehavior.g:4834:1: ( ruleOtherExpression )
            // InternalBehavior.g:4835:1: ruleOtherExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOtherExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOtherExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOtherExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__1"
    // InternalBehavior.g:4846:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4850:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalBehavior.g:4851:2: rule__RelationalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__1"


    // $ANTLR start "rule__RelationalExpression__Group__1__Impl"
    // InternalBehavior.g:4857:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4861:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalBehavior.g:4862:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalBehavior.g:4862:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalBehavior.g:4863:1: ( rule__RelationalExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }
            // InternalBehavior.g:4864:1: ( rule__RelationalExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=14 && LA36_0<=19)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBehavior.g:4864:2: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__0"
    // InternalBehavior.g:4878:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4882:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalBehavior.g:4883:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__RelationalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__0"


    // $ANTLR start "rule__RelationalExpression__Group_1__0__Impl"
    // InternalBehavior.g:4890:1: rule__RelationalExpression__Group_1__0__Impl : ( ( rule__RelationalExpression__Group_1_0__0 ) ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4894:1: ( ( ( rule__RelationalExpression__Group_1_0__0 ) ) )
            // InternalBehavior.g:4895:1: ( ( rule__RelationalExpression__Group_1_0__0 ) )
            {
            // InternalBehavior.g:4895:1: ( ( rule__RelationalExpression__Group_1_0__0 ) )
            // InternalBehavior.g:4896:1: ( rule__RelationalExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0()); 
            }
            // InternalBehavior.g:4897:1: ( rule__RelationalExpression__Group_1_0__0 )
            // InternalBehavior.g:4897:2: rule__RelationalExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__1"
    // InternalBehavior.g:4907:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4911:1: ( rule__RelationalExpression__Group_1__1__Impl )
            // InternalBehavior.g:4912:2: rule__RelationalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__1"


    // $ANTLR start "rule__RelationalExpression__Group_1__1__Impl"
    // InternalBehavior.g:4918:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__RightAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4922:1: ( ( ( rule__RelationalExpression__RightAssignment_1_1 ) ) )
            // InternalBehavior.g:4923:1: ( ( rule__RelationalExpression__RightAssignment_1_1 ) )
            {
            // InternalBehavior.g:4923:1: ( ( rule__RelationalExpression__RightAssignment_1_1 ) )
            // InternalBehavior.g:4924:1: ( rule__RelationalExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalBehavior.g:4925:1: ( rule__RelationalExpression__RightAssignment_1_1 )
            // InternalBehavior.g:4925:2: rule__RelationalExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1_0__0"
    // InternalBehavior.g:4939:1: rule__RelationalExpression__Group_1_0__0 : rule__RelationalExpression__Group_1_0__0__Impl ;
    public final void rule__RelationalExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4943:1: ( rule__RelationalExpression__Group_1_0__0__Impl )
            // InternalBehavior.g:4944:2: rule__RelationalExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1_0__0"


    // $ANTLR start "rule__RelationalExpression__Group_1_0__0__Impl"
    // InternalBehavior.g:4950:1: rule__RelationalExpression__Group_1_0__0__Impl : ( ( rule__RelationalExpression__Group_1_0_0__0 ) ) ;
    public final void rule__RelationalExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4954:1: ( ( ( rule__RelationalExpression__Group_1_0_0__0 ) ) )
            // InternalBehavior.g:4955:1: ( ( rule__RelationalExpression__Group_1_0_0__0 ) )
            {
            // InternalBehavior.g:4955:1: ( ( rule__RelationalExpression__Group_1_0_0__0 ) )
            // InternalBehavior.g:4956:1: ( rule__RelationalExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalBehavior.g:4957:1: ( rule__RelationalExpression__Group_1_0_0__0 )
            // InternalBehavior.g:4957:2: rule__RelationalExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1_0_0__0"
    // InternalBehavior.g:4969:1: rule__RelationalExpression__Group_1_0_0__0 : rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1 ;
    public final void rule__RelationalExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4973:1: ( rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1 )
            // InternalBehavior.g:4974:2: rule__RelationalExpression__Group_1_0_0__0__Impl rule__RelationalExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_30);
            rule__RelationalExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1_0_0__0"


    // $ANTLR start "rule__RelationalExpression__Group_1_0_0__0__Impl"
    // InternalBehavior.g:4981:1: rule__RelationalExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:4985:1: ( ( () ) )
            // InternalBehavior.g:4986:1: ( () )
            {
            // InternalBehavior.g:4986:1: ( () )
            // InternalBehavior.g:4987:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0()); 
            }
            // InternalBehavior.g:4988:1: ()
            // InternalBehavior.g:4990:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1_0_0__1"
    // InternalBehavior.g:5000:1: rule__RelationalExpression__Group_1_0_0__1 : rule__RelationalExpression__Group_1_0_0__1__Impl ;
    public final void rule__RelationalExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5004:1: ( rule__RelationalExpression__Group_1_0_0__1__Impl )
            // InternalBehavior.g:5005:2: rule__RelationalExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1_0_0__1"


    // $ANTLR start "rule__RelationalExpression__Group_1_0_0__1__Impl"
    // InternalBehavior.g:5011:1: rule__RelationalExpression__Group_1_0_0__1__Impl : ( ( rule__RelationalExpression__FeatureAssignment_1_0_0_1 ) ) ;
    public final void rule__RelationalExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5015:1: ( ( ( rule__RelationalExpression__FeatureAssignment_1_0_0_1 ) ) )
            // InternalBehavior.g:5016:1: ( ( rule__RelationalExpression__FeatureAssignment_1_0_0_1 ) )
            {
            // InternalBehavior.g:5016:1: ( ( rule__RelationalExpression__FeatureAssignment_1_0_0_1 ) )
            // InternalBehavior.g:5017:1: ( rule__RelationalExpression__FeatureAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }
            // InternalBehavior.g:5018:1: ( rule__RelationalExpression__FeatureAssignment_1_0_0_1 )
            // InternalBehavior.g:5018:2: rule__RelationalExpression__FeatureAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__FeatureAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__OtherExpression__Group__0"
    // InternalBehavior.g:5032:1: rule__OtherExpression__Group__0 : rule__OtherExpression__Group__0__Impl rule__OtherExpression__Group__1 ;
    public final void rule__OtherExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5036:1: ( rule__OtherExpression__Group__0__Impl rule__OtherExpression__Group__1 )
            // InternalBehavior.g:5037:2: rule__OtherExpression__Group__0__Impl rule__OtherExpression__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__OtherExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OtherExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherExpression__Group__0"


    // $ANTLR start "rule__OtherExpression__Group__0__Impl"
    // InternalBehavior.g:5044:1: rule__OtherExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__OtherExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5048:1: ( ( ruleAdditiveExpression ) )
            // InternalBehavior.g:5049:1: ( ruleAdditiveExpression )
            {
            // InternalBehavior.g:5049:1: ( ruleAdditiveExpression )
            // InternalBehavior.g:5050:1: ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__OtherExpression__Group__0__Impl"


    // $ANTLR start "rule__OtherExpression__Group__1"
    // InternalBehavior.g:5061:1: rule__OtherExpression__Group__1 : rule__OtherExpression__Group__1__Impl ;
    public final void rule__OtherExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5065:1: ( rule__OtherExpression__Group__1__Impl )
            // InternalBehavior.g:5066:2: rule__OtherExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherExpression__Group__1"


    // $ANTLR start "rule__OtherExpression__Group__1__Impl"
    // InternalBehavior.g:5072:1: rule__OtherExpression__Group__1__Impl : ( ( rule__OtherExpression__Group_1__0 )? ) ;
    public final void rule__OtherExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5076:1: ( ( ( rule__OtherExpression__Group_1__0 )? ) )
            // InternalBehavior.g:5077:1: ( ( rule__OtherExpression__Group_1__0 )? )
            {
            // InternalBehavior.g:5077:1: ( ( rule__OtherExpression__Group_1__0 )? )
            // InternalBehavior.g:5078:1: ( rule__OtherExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getGroup_1()); 
            }
            // InternalBehavior.g:5079:1: ( rule__OtherExpression__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==64) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBehavior.g:5079:2: rule__OtherExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OtherExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__OtherExpression__Group__1__Impl"


    // $ANTLR start "rule__OtherExpression__Group_1__0"
    // InternalBehavior.g:5093:1: rule__OtherExpression__Group_1__0 : rule__OtherExpression__Group_1__0__Impl rule__OtherExpression__Group_1__1 ;
    public final void rule__OtherExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5097:1: ( rule__OtherExpression__Group_1__0__Impl rule__OtherExpression__Group_1__1 )
            // InternalBehavior.g:5098:2: rule__OtherExpression__Group_1__0__Impl rule__OtherExpression__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__OtherExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OtherExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherExpression__Group_1__0"


    // $ANTLR start "rule__OtherExpression__Group_1__0__Impl"
    // InternalBehavior.g:5105:1: rule__OtherExpression__Group_1__0__Impl : ( ( rule__OtherExpression__Group_1_0__0 ) ) ;
    public final void rule__OtherExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5109:1: ( ( ( rule__OtherExpression__Group_1_0__0 ) ) )
            // InternalBehavior.g:5110:1: ( ( rule__OtherExpression__Group_1_0__0 ) )
            {
            // InternalBehavior.g:5110:1: ( ( rule__OtherExpression__Group_1_0__0 ) )
            // InternalBehavior.g:5111:1: ( rule__OtherExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getGroup_1_0()); 
            }
            // InternalBehavior.g:5112:1: ( rule__OtherExpression__Group_1_0__0 )
            // InternalBehavior.g:5112:2: rule__OtherExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__OtherExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__OtherExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OtherExpression__Group_1__1"
    // InternalBehavior.g:5122:1: rule__OtherExpression__Group_1__1 : rule__OtherExpression__Group_1__1__Impl ;
    public final void rule__OtherExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5126:1: ( rule__OtherExpression__Group_1__1__Impl )
            // InternalBehavior.g:5127:2: rule__OtherExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherExpression__Group_1__1"


    // $ANTLR start "rule__OtherExpression__Group_1__1__Impl"
    // InternalBehavior.g:5133:1: rule__OtherExpression__Group_1__1__Impl : ( ( rule__OtherExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__OtherExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5137:1: ( ( ( rule__OtherExpression__TypeAssignment_1_1 ) ) )
            // InternalBehavior.g:5138:1: ( ( rule__OtherExpression__TypeAssignment_1_1 ) )
            {
            // InternalBehavior.g:5138:1: ( ( rule__OtherExpression__TypeAssignment_1_1 ) )
            // InternalBehavior.g:5139:1: ( rule__OtherExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getTypeAssignment_1_1()); 
            }
            // InternalBehavior.g:5140:1: ( rule__OtherExpression__TypeAssignment_1_1 )
            // InternalBehavior.g:5140:2: rule__OtherExpression__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherExpression__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getTypeAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__OtherExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OtherExpression__Group_1_0__0"
    // InternalBehavior.g:5154:1: rule__OtherExpression__Group_1_0__0 : rule__OtherExpression__Group_1_0__0__Impl ;
    public final void rule__OtherExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5158:1: ( rule__OtherExpression__Group_1_0__0__Impl )
            // InternalBehavior.g:5159:2: rule__OtherExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherExpression__Group_1_0__0"


    // $ANTLR start "rule__OtherExpression__Group_1_0__0__Impl"
    // InternalBehavior.g:5165:1: rule__OtherExpression__Group_1_0__0__Impl : ( ( rule__OtherExpression__Group_1_0_0__0 ) ) ;
    public final void rule__OtherExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5169:1: ( ( ( rule__OtherExpression__Group_1_0_0__0 ) ) )
            // InternalBehavior.g:5170:1: ( ( rule__OtherExpression__Group_1_0_0__0 ) )
            {
            // InternalBehavior.g:5170:1: ( ( rule__OtherExpression__Group_1_0_0__0 ) )
            // InternalBehavior.g:5171:1: ( rule__OtherExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalBehavior.g:5172:1: ( rule__OtherExpression__Group_1_0_0__0 )
            // InternalBehavior.g:5172:2: rule__OtherExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__OtherExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__OtherExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__OtherExpression__Group_1_0_0__0"
    // InternalBehavior.g:5184:1: rule__OtherExpression__Group_1_0_0__0 : rule__OtherExpression__Group_1_0_0__0__Impl rule__OtherExpression__Group_1_0_0__1 ;
    public final void rule__OtherExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5188:1: ( rule__OtherExpression__Group_1_0_0__0__Impl rule__OtherExpression__Group_1_0_0__1 )
            // InternalBehavior.g:5189:2: rule__OtherExpression__Group_1_0_0__0__Impl rule__OtherExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_32);
            rule__OtherExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OtherExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherExpression__Group_1_0_0__0"


    // $ANTLR start "rule__OtherExpression__Group_1_0_0__0__Impl"
    // InternalBehavior.g:5196:1: rule__OtherExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__OtherExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5200:1: ( ( () ) )
            // InternalBehavior.g:5201:1: ( () )
            {
            // InternalBehavior.g:5201:1: ( () )
            // InternalBehavior.g:5202:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0()); 
            }
            // InternalBehavior.g:5203:1: ()
            // InternalBehavior.g:5205:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__OtherExpression__Group_1_0_0__1"
    // InternalBehavior.g:5215:1: rule__OtherExpression__Group_1_0_0__1 : rule__OtherExpression__Group_1_0_0__1__Impl ;
    public final void rule__OtherExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5219:1: ( rule__OtherExpression__Group_1_0_0__1__Impl )
            // InternalBehavior.g:5220:2: rule__OtherExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherExpression__Group_1_0_0__1"


    // $ANTLR start "rule__OtherExpression__Group_1_0_0__1__Impl"
    // InternalBehavior.g:5226:1: rule__OtherExpression__Group_1_0_0__1__Impl : ( ( rule__OtherExpression__FeatureAssignment_1_0_0_1 ) ) ;
    public final void rule__OtherExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5230:1: ( ( ( rule__OtherExpression__FeatureAssignment_1_0_0_1 ) ) )
            // InternalBehavior.g:5231:1: ( ( rule__OtherExpression__FeatureAssignment_1_0_0_1 ) )
            {
            // InternalBehavior.g:5231:1: ( ( rule__OtherExpression__FeatureAssignment_1_0_0_1 ) )
            // InternalBehavior.g:5232:1: ( rule__OtherExpression__FeatureAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }
            // InternalBehavior.g:5233:1: ( rule__OtherExpression__FeatureAssignment_1_0_0_1 )
            // InternalBehavior.g:5233:2: rule__OtherExpression__FeatureAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__OtherExpression__FeatureAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__OtherExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalBehavior.g:5247:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5251:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalBehavior.g:5252:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // InternalBehavior.g:5259:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5263:1: ( ( ruleMultiplicativeExpression ) )
            // InternalBehavior.g:5264:1: ( ruleMultiplicativeExpression )
            {
            // InternalBehavior.g:5264:1: ( ruleMultiplicativeExpression )
            // InternalBehavior.g:5265:1: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // InternalBehavior.g:5276:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5280:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalBehavior.g:5281:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // InternalBehavior.g:5287:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5291:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalBehavior.g:5292:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalBehavior.g:5292:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalBehavior.g:5293:1: ( rule__AdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalBehavior.g:5294:1: ( rule__AdditiveExpression__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=20 && LA38_0<=21)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBehavior.g:5294:2: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0"
    // InternalBehavior.g:5308:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5312:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalBehavior.g:5313:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0__Impl"
    // InternalBehavior.g:5320:1: rule__AdditiveExpression__Group_1__0__Impl : ( ( rule__AdditiveExpression__Group_1_0__0 ) ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5324:1: ( ( ( rule__AdditiveExpression__Group_1_0__0 ) ) )
            // InternalBehavior.g:5325:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
            {
            // InternalBehavior.g:5325:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
            // InternalBehavior.g:5326:1: ( rule__AdditiveExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); 
            }
            // InternalBehavior.g:5327:1: ( rule__AdditiveExpression__Group_1_0__0 )
            // InternalBehavior.g:5327:2: rule__AdditiveExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1"
    // InternalBehavior.g:5337:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5341:1: ( rule__AdditiveExpression__Group_1__1__Impl )
            // InternalBehavior.g:5342:2: rule__AdditiveExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1__Impl"
    // InternalBehavior.g:5348:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5352:1: ( ( ( rule__AdditiveExpression__RightAssignment_1_1 ) ) )
            // InternalBehavior.g:5353:1: ( ( rule__AdditiveExpression__RightAssignment_1_1 ) )
            {
            // InternalBehavior.g:5353:1: ( ( rule__AdditiveExpression__RightAssignment_1_1 ) )
            // InternalBehavior.g:5354:1: ( rule__AdditiveExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalBehavior.g:5355:1: ( rule__AdditiveExpression__RightAssignment_1_1 )
            // InternalBehavior.g:5355:2: rule__AdditiveExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0__0"
    // InternalBehavior.g:5369:1: rule__AdditiveExpression__Group_1_0__0 : rule__AdditiveExpression__Group_1_0__0__Impl ;
    public final void rule__AdditiveExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5373:1: ( rule__AdditiveExpression__Group_1_0__0__Impl )
            // InternalBehavior.g:5374:2: rule__AdditiveExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_0__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0__0__Impl"
    // InternalBehavior.g:5380:1: rule__AdditiveExpression__Group_1_0__0__Impl : ( ( rule__AdditiveExpression__Group_1_0_0__0 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5384:1: ( ( ( rule__AdditiveExpression__Group_1_0_0__0 ) ) )
            // InternalBehavior.g:5385:1: ( ( rule__AdditiveExpression__Group_1_0_0__0 ) )
            {
            // InternalBehavior.g:5385:1: ( ( rule__AdditiveExpression__Group_1_0_0__0 ) )
            // InternalBehavior.g:5386:1: ( rule__AdditiveExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalBehavior.g:5387:1: ( rule__AdditiveExpression__Group_1_0_0__0 )
            // InternalBehavior.g:5387:2: rule__AdditiveExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0_0__0"
    // InternalBehavior.g:5399:1: rule__AdditiveExpression__Group_1_0_0__0 : rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1 ;
    public final void rule__AdditiveExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5403:1: ( rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1 )
            // InternalBehavior.g:5404:2: rule__AdditiveExpression__Group_1_0_0__0__Impl rule__AdditiveExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_33);
            rule__AdditiveExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_0_0__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0_0__0__Impl"
    // InternalBehavior.g:5411:1: rule__AdditiveExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5415:1: ( ( () ) )
            // InternalBehavior.g:5416:1: ( () )
            {
            // InternalBehavior.g:5416:1: ( () )
            // InternalBehavior.g:5417:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0()); 
            }
            // InternalBehavior.g:5418:1: ()
            // InternalBehavior.g:5420:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0_0__1"
    // InternalBehavior.g:5430:1: rule__AdditiveExpression__Group_1_0_0__1 : rule__AdditiveExpression__Group_1_0_0__1__Impl ;
    public final void rule__AdditiveExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5434:1: ( rule__AdditiveExpression__Group_1_0_0__1__Impl )
            // InternalBehavior.g:5435:2: rule__AdditiveExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_0_0__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0_0__1__Impl"
    // InternalBehavior.g:5441:1: rule__AdditiveExpression__Group_1_0_0__1__Impl : ( ( rule__AdditiveExpression__FeatureAssignment_1_0_0_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5445:1: ( ( ( rule__AdditiveExpression__FeatureAssignment_1_0_0_1 ) ) )
            // InternalBehavior.g:5446:1: ( ( rule__AdditiveExpression__FeatureAssignment_1_0_0_1 ) )
            {
            // InternalBehavior.g:5446:1: ( ( rule__AdditiveExpression__FeatureAssignment_1_0_0_1 ) )
            // InternalBehavior.g:5447:1: ( rule__AdditiveExpression__FeatureAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }
            // InternalBehavior.g:5448:1: ( rule__AdditiveExpression__FeatureAssignment_1_0_0_1 )
            // InternalBehavior.g:5448:2: rule__AdditiveExpression__FeatureAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__FeatureAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalBehavior.g:5462:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5466:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalBehavior.g:5467:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalBehavior.g:5474:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryOperation ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5478:1: ( ( ruleUnaryOperation ) )
            // InternalBehavior.g:5479:1: ( ruleUnaryOperation )
            {
            // InternalBehavior.g:5479:1: ( ruleUnaryOperation )
            // InternalBehavior.g:5480:1: ruleUnaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getUnaryOperationParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalBehavior.g:5491:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5495:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalBehavior.g:5496:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalBehavior.g:5502:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5506:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalBehavior.g:5507:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalBehavior.g:5507:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalBehavior.g:5508:1: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalBehavior.g:5509:1: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=22 && LA39_0<=25)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalBehavior.g:5509:2: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // InternalBehavior.g:5523:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5527:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalBehavior.g:5528:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // InternalBehavior.g:5535:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5539:1: ( ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalBehavior.g:5540:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalBehavior.g:5540:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
            // InternalBehavior.g:5541:1: ( rule__MultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalBehavior.g:5542:1: ( rule__MultiplicativeExpression__Group_1_0__0 )
            // InternalBehavior.g:5542:2: rule__MultiplicativeExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalBehavior.g:5552:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5556:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // InternalBehavior.g:5557:2: rule__MultiplicativeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // InternalBehavior.g:5563:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5567:1: ( ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) ) )
            // InternalBehavior.g:5568:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            {
            // InternalBehavior.g:5568:1: ( ( rule__MultiplicativeExpression__RightAssignment_1_1 ) )
            // InternalBehavior.g:5569:1: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalBehavior.g:5570:1: ( rule__MultiplicativeExpression__RightAssignment_1_1 )
            // InternalBehavior.g:5570:2: rule__MultiplicativeExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0__0"
    // InternalBehavior.g:5584:1: rule__MultiplicativeExpression__Group_1_0__0 : rule__MultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5588:1: ( rule__MultiplicativeExpression__Group_1_0__0__Impl )
            // InternalBehavior.g:5589:2: rule__MultiplicativeExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0__0__Impl"
    // InternalBehavior.g:5595:1: rule__MultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5599:1: ( ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalBehavior.g:5600:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalBehavior.g:5600:1: ( ( rule__MultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalBehavior.g:5601:1: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalBehavior.g:5602:1: ( rule__MultiplicativeExpression__Group_1_0_0__0 )
            // InternalBehavior.g:5602:2: rule__MultiplicativeExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__0"
    // InternalBehavior.g:5614:1: rule__MultiplicativeExpression__Group_1_0_0__0 : rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5618:1: ( rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1 )
            // InternalBehavior.g:5619:2: rule__MultiplicativeExpression__Group_1_0_0__0__Impl rule__MultiplicativeExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_35);
            rule__MultiplicativeExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__0__Impl"
    // InternalBehavior.g:5626:1: rule__MultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5630:1: ( ( () ) )
            // InternalBehavior.g:5631:1: ( () )
            {
            // InternalBehavior.g:5631:1: ( () )
            // InternalBehavior.g:5632:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0()); 
            }
            // InternalBehavior.g:5633:1: ()
            // InternalBehavior.g:5635:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__1"
    // InternalBehavior.g:5645:1: rule__MultiplicativeExpression__Group_1_0_0__1 : rule__MultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5649:1: ( rule__MultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalBehavior.g:5650:2: rule__MultiplicativeExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0_0__1__Impl"
    // InternalBehavior.g:5656:1: rule__MultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5660:1: ( ( ( rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1 ) ) )
            // InternalBehavior.g:5661:1: ( ( rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1 ) )
            {
            // InternalBehavior.g:5661:1: ( ( rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1 ) )
            // InternalBehavior.g:5662:1: ( rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }
            // InternalBehavior.g:5663:1: ( rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1 )
            // InternalBehavior.g:5663:2: rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_0__0"
    // InternalBehavior.g:5677:1: rule__UnaryOperation__Group_0__0 : rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 ;
    public final void rule__UnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5681:1: ( rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 )
            // InternalBehavior.g:5682:2: rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1
            {
            pushFollow(FOLLOW_37);
            rule__UnaryOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__0"


    // $ANTLR start "rule__UnaryOperation__Group_0__0__Impl"
    // InternalBehavior.g:5689:1: rule__UnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5693:1: ( ( () ) )
            // InternalBehavior.g:5694:1: ( () )
            {
            // InternalBehavior.g:5694:1: ( () )
            // InternalBehavior.g:5695:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getExpressionAction_0_0()); 
            }
            // InternalBehavior.g:5696:1: ()
            // InternalBehavior.g:5698:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_0__1"
    // InternalBehavior.g:5708:1: rule__UnaryOperation__Group_0__1 : rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 ;
    public final void rule__UnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5712:1: ( rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 )
            // InternalBehavior.g:5713:2: rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__UnaryOperation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__1"


    // $ANTLR start "rule__UnaryOperation__Group_0__1__Impl"
    // InternalBehavior.g:5720:1: rule__UnaryOperation__Group_0__1__Impl : ( ( rule__UnaryOperation__FeatureAssignment_0_1 ) ) ;
    public final void rule__UnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5724:1: ( ( ( rule__UnaryOperation__FeatureAssignment_0_1 ) ) )
            // InternalBehavior.g:5725:1: ( ( rule__UnaryOperation__FeatureAssignment_0_1 ) )
            {
            // InternalBehavior.g:5725:1: ( ( rule__UnaryOperation__FeatureAssignment_0_1 ) )
            // InternalBehavior.g:5726:1: ( rule__UnaryOperation__FeatureAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getFeatureAssignment_0_1()); 
            }
            // InternalBehavior.g:5727:1: ( rule__UnaryOperation__FeatureAssignment_0_1 )
            // InternalBehavior.g:5727:2: rule__UnaryOperation__FeatureAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__FeatureAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getFeatureAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__UnaryOperation__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_0__2"
    // InternalBehavior.g:5737:1: rule__UnaryOperation__Group_0__2 : rule__UnaryOperation__Group_0__2__Impl ;
    public final void rule__UnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5741:1: ( rule__UnaryOperation__Group_0__2__Impl )
            // InternalBehavior.g:5742:2: rule__UnaryOperation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__2"


    // $ANTLR start "rule__UnaryOperation__Group_0__2__Impl"
    // InternalBehavior.g:5748:1: rule__UnaryOperation__Group_0__2__Impl : ( ( rule__UnaryOperation__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5752:1: ( ( ( rule__UnaryOperation__OperandAssignment_0_2 ) ) )
            // InternalBehavior.g:5753:1: ( ( rule__UnaryOperation__OperandAssignment_0_2 ) )
            {
            // InternalBehavior.g:5753:1: ( ( rule__UnaryOperation__OperandAssignment_0_2 ) )
            // InternalBehavior.g:5754:1: ( rule__UnaryOperation__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2()); 
            }
            // InternalBehavior.g:5755:1: ( rule__UnaryOperation__OperandAssignment_0_2 )
            // InternalBehavior.g:5755:2: rule__UnaryOperation__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__OperandAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getOperandAssignment_0_2()); 
            }

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
    // $ANTLR end "rule__UnaryOperation__Group_0__2__Impl"


    // $ANTLR start "rule__CastedExpression__Group__0"
    // InternalBehavior.g:5771:1: rule__CastedExpression__Group__0 : rule__CastedExpression__Group__0__Impl rule__CastedExpression__Group__1 ;
    public final void rule__CastedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5775:1: ( rule__CastedExpression__Group__0__Impl rule__CastedExpression__Group__1 )
            // InternalBehavior.g:5776:2: rule__CastedExpression__Group__0__Impl rule__CastedExpression__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__CastedExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CastedExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CastedExpression__Group__0"


    // $ANTLR start "rule__CastedExpression__Group__0__Impl"
    // InternalBehavior.g:5783:1: rule__CastedExpression__Group__0__Impl : ( rulePostfixOperation ) ;
    public final void rule__CastedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5787:1: ( ( rulePostfixOperation ) )
            // InternalBehavior.g:5788:1: ( rulePostfixOperation )
            {
            // InternalBehavior.g:5788:1: ( rulePostfixOperation )
            // InternalBehavior.g:5789:1: rulePostfixOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getPostfixOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePostfixOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getPostfixOperationParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__CastedExpression__Group__0__Impl"


    // $ANTLR start "rule__CastedExpression__Group__1"
    // InternalBehavior.g:5800:1: rule__CastedExpression__Group__1 : rule__CastedExpression__Group__1__Impl ;
    public final void rule__CastedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5804:1: ( rule__CastedExpression__Group__1__Impl )
            // InternalBehavior.g:5805:2: rule__CastedExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CastedExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CastedExpression__Group__1"


    // $ANTLR start "rule__CastedExpression__Group__1__Impl"
    // InternalBehavior.g:5811:1: rule__CastedExpression__Group__1__Impl : ( ( rule__CastedExpression__Group_1__0 )* ) ;
    public final void rule__CastedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5815:1: ( ( ( rule__CastedExpression__Group_1__0 )* ) )
            // InternalBehavior.g:5816:1: ( ( rule__CastedExpression__Group_1__0 )* )
            {
            // InternalBehavior.g:5816:1: ( ( rule__CastedExpression__Group_1__0 )* )
            // InternalBehavior.g:5817:1: ( rule__CastedExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getGroup_1()); 
            }
            // InternalBehavior.g:5818:1: ( rule__CastedExpression__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==66) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalBehavior.g:5818:2: rule__CastedExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__CastedExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__CastedExpression__Group__1__Impl"


    // $ANTLR start "rule__CastedExpression__Group_1__0"
    // InternalBehavior.g:5832:1: rule__CastedExpression__Group_1__0 : rule__CastedExpression__Group_1__0__Impl rule__CastedExpression__Group_1__1 ;
    public final void rule__CastedExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5836:1: ( rule__CastedExpression__Group_1__0__Impl rule__CastedExpression__Group_1__1 )
            // InternalBehavior.g:5837:2: rule__CastedExpression__Group_1__0__Impl rule__CastedExpression__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__CastedExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CastedExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CastedExpression__Group_1__0"


    // $ANTLR start "rule__CastedExpression__Group_1__0__Impl"
    // InternalBehavior.g:5844:1: rule__CastedExpression__Group_1__0__Impl : ( ( rule__CastedExpression__Group_1_0__0 ) ) ;
    public final void rule__CastedExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5848:1: ( ( ( rule__CastedExpression__Group_1_0__0 ) ) )
            // InternalBehavior.g:5849:1: ( ( rule__CastedExpression__Group_1_0__0 ) )
            {
            // InternalBehavior.g:5849:1: ( ( rule__CastedExpression__Group_1_0__0 ) )
            // InternalBehavior.g:5850:1: ( rule__CastedExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getGroup_1_0()); 
            }
            // InternalBehavior.g:5851:1: ( rule__CastedExpression__Group_1_0__0 )
            // InternalBehavior.g:5851:2: rule__CastedExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__CastedExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__CastedExpression__Group_1__0__Impl"


    // $ANTLR start "rule__CastedExpression__Group_1__1"
    // InternalBehavior.g:5861:1: rule__CastedExpression__Group_1__1 : rule__CastedExpression__Group_1__1__Impl ;
    public final void rule__CastedExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5865:1: ( rule__CastedExpression__Group_1__1__Impl )
            // InternalBehavior.g:5866:2: rule__CastedExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CastedExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CastedExpression__Group_1__1"


    // $ANTLR start "rule__CastedExpression__Group_1__1__Impl"
    // InternalBehavior.g:5872:1: rule__CastedExpression__Group_1__1__Impl : ( ( rule__CastedExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__CastedExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5876:1: ( ( ( rule__CastedExpression__TypeAssignment_1_1 ) ) )
            // InternalBehavior.g:5877:1: ( ( rule__CastedExpression__TypeAssignment_1_1 ) )
            {
            // InternalBehavior.g:5877:1: ( ( rule__CastedExpression__TypeAssignment_1_1 ) )
            // InternalBehavior.g:5878:1: ( rule__CastedExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getTypeAssignment_1_1()); 
            }
            // InternalBehavior.g:5879:1: ( rule__CastedExpression__TypeAssignment_1_1 )
            // InternalBehavior.g:5879:2: rule__CastedExpression__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CastedExpression__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getTypeAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__CastedExpression__Group_1__1__Impl"


    // $ANTLR start "rule__CastedExpression__Group_1_0__0"
    // InternalBehavior.g:5893:1: rule__CastedExpression__Group_1_0__0 : rule__CastedExpression__Group_1_0__0__Impl ;
    public final void rule__CastedExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5897:1: ( rule__CastedExpression__Group_1_0__0__Impl )
            // InternalBehavior.g:5898:2: rule__CastedExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CastedExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CastedExpression__Group_1_0__0"


    // $ANTLR start "rule__CastedExpression__Group_1_0__0__Impl"
    // InternalBehavior.g:5904:1: rule__CastedExpression__Group_1_0__0__Impl : ( ( rule__CastedExpression__Group_1_0_0__0 ) ) ;
    public final void rule__CastedExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5908:1: ( ( ( rule__CastedExpression__Group_1_0_0__0 ) ) )
            // InternalBehavior.g:5909:1: ( ( rule__CastedExpression__Group_1_0_0__0 ) )
            {
            // InternalBehavior.g:5909:1: ( ( rule__CastedExpression__Group_1_0_0__0 ) )
            // InternalBehavior.g:5910:1: ( rule__CastedExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalBehavior.g:5911:1: ( rule__CastedExpression__Group_1_0_0__0 )
            // InternalBehavior.g:5911:2: rule__CastedExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__CastedExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__CastedExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__CastedExpression__Group_1_0_0__0"
    // InternalBehavior.g:5923:1: rule__CastedExpression__Group_1_0_0__0 : rule__CastedExpression__Group_1_0_0__0__Impl rule__CastedExpression__Group_1_0_0__1 ;
    public final void rule__CastedExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5927:1: ( rule__CastedExpression__Group_1_0_0__0__Impl rule__CastedExpression__Group_1_0_0__1 )
            // InternalBehavior.g:5928:2: rule__CastedExpression__Group_1_0_0__0__Impl rule__CastedExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_38);
            rule__CastedExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CastedExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CastedExpression__Group_1_0_0__0"


    // $ANTLR start "rule__CastedExpression__Group_1_0_0__0__Impl"
    // InternalBehavior.g:5935:1: rule__CastedExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__CastedExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5939:1: ( ( () ) )
            // InternalBehavior.g:5940:1: ( () )
            {
            // InternalBehavior.g:5940:1: ( () )
            // InternalBehavior.g:5941:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0()); 
            }
            // InternalBehavior.g:5942:1: ()
            // InternalBehavior.g:5944:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CastedExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__CastedExpression__Group_1_0_0__1"
    // InternalBehavior.g:5954:1: rule__CastedExpression__Group_1_0_0__1 : rule__CastedExpression__Group_1_0_0__1__Impl ;
    public final void rule__CastedExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5958:1: ( rule__CastedExpression__Group_1_0_0__1__Impl )
            // InternalBehavior.g:5959:2: rule__CastedExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CastedExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CastedExpression__Group_1_0_0__1"


    // $ANTLR start "rule__CastedExpression__Group_1_0_0__1__Impl"
    // InternalBehavior.g:5965:1: rule__CastedExpression__Group_1_0_0__1__Impl : ( ( rule__CastedExpression__FeatureAssignment_1_0_0_1 ) ) ;
    public final void rule__CastedExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5969:1: ( ( ( rule__CastedExpression__FeatureAssignment_1_0_0_1 ) ) )
            // InternalBehavior.g:5970:1: ( ( rule__CastedExpression__FeatureAssignment_1_0_0_1 ) )
            {
            // InternalBehavior.g:5970:1: ( ( rule__CastedExpression__FeatureAssignment_1_0_0_1 ) )
            // InternalBehavior.g:5971:1: ( rule__CastedExpression__FeatureAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }
            // InternalBehavior.g:5972:1: ( rule__CastedExpression__FeatureAssignment_1_0_0_1 )
            // InternalBehavior.g:5972:2: rule__CastedExpression__FeatureAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CastedExpression__FeatureAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getFeatureAssignment_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__CastedExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PostfixOperation__Group__0"
    // InternalBehavior.g:5986:1: rule__PostfixOperation__Group__0 : rule__PostfixOperation__Group__0__Impl rule__PostfixOperation__Group__1 ;
    public final void rule__PostfixOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:5990:1: ( rule__PostfixOperation__Group__0__Impl rule__PostfixOperation__Group__1 )
            // InternalBehavior.g:5991:2: rule__PostfixOperation__Group__0__Impl rule__PostfixOperation__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__PostfixOperation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PostfixOperation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixOperation__Group__0"


    // $ANTLR start "rule__PostfixOperation__Group__0__Impl"
    // InternalBehavior.g:5998:1: rule__PostfixOperation__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__PostfixOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6002:1: ( ( rulePrimaryExpression ) )
            // InternalBehavior.g:6003:1: ( rulePrimaryExpression )
            {
            // InternalBehavior.g:6003:1: ( rulePrimaryExpression )
            // InternalBehavior.g:6004:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__PostfixOperation__Group__0__Impl"


    // $ANTLR start "rule__PostfixOperation__Group__1"
    // InternalBehavior.g:6015:1: rule__PostfixOperation__Group__1 : rule__PostfixOperation__Group__1__Impl ;
    public final void rule__PostfixOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6019:1: ( rule__PostfixOperation__Group__1__Impl )
            // InternalBehavior.g:6020:2: rule__PostfixOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PostfixOperation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixOperation__Group__1"


    // $ANTLR start "rule__PostfixOperation__Group__1__Impl"
    // InternalBehavior.g:6026:1: rule__PostfixOperation__Group__1__Impl : ( ( rule__PostfixOperation__Group_1__0 )? ) ;
    public final void rule__PostfixOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6030:1: ( ( ( rule__PostfixOperation__Group_1__0 )? ) )
            // InternalBehavior.g:6031:1: ( ( rule__PostfixOperation__Group_1__0 )? )
            {
            // InternalBehavior.g:6031:1: ( ( rule__PostfixOperation__Group_1__0 )? )
            // InternalBehavior.g:6032:1: ( rule__PostfixOperation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixOperationAccess().getGroup_1()); 
            }
            // InternalBehavior.g:6033:1: ( rule__PostfixOperation__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=26 && LA41_0<=27)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBehavior.g:6033:2: rule__PostfixOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PostfixOperation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixOperationAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__PostfixOperation__Group__1__Impl"


    // $ANTLR start "rule__PostfixOperation__Group_1__0"
    // InternalBehavior.g:6047:1: rule__PostfixOperation__Group_1__0 : rule__PostfixOperation__Group_1__0__Impl ;
    public final void rule__PostfixOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6051:1: ( rule__PostfixOperation__Group_1__0__Impl )
            // InternalBehavior.g:6052:2: rule__PostfixOperation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PostfixOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixOperation__Group_1__0"


    // $ANTLR start "rule__PostfixOperation__Group_1__0__Impl"
    // InternalBehavior.g:6058:1: rule__PostfixOperation__Group_1__0__Impl : ( ( rule__PostfixOperation__Group_1_0__0 ) ) ;
    public final void rule__PostfixOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6062:1: ( ( ( rule__PostfixOperation__Group_1_0__0 ) ) )
            // InternalBehavior.g:6063:1: ( ( rule__PostfixOperation__Group_1_0__0 ) )
            {
            // InternalBehavior.g:6063:1: ( ( rule__PostfixOperation__Group_1_0__0 ) )
            // InternalBehavior.g:6064:1: ( rule__PostfixOperation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixOperationAccess().getGroup_1_0()); 
            }
            // InternalBehavior.g:6065:1: ( rule__PostfixOperation__Group_1_0__0 )
            // InternalBehavior.g:6065:2: rule__PostfixOperation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__PostfixOperation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixOperationAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__PostfixOperation__Group_1__0__Impl"


    // $ANTLR start "rule__PostfixOperation__Group_1_0__0"
    // InternalBehavior.g:6077:1: rule__PostfixOperation__Group_1_0__0 : rule__PostfixOperation__Group_1_0__0__Impl rule__PostfixOperation__Group_1_0__1 ;
    public final void rule__PostfixOperation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6081:1: ( rule__PostfixOperation__Group_1_0__0__Impl rule__PostfixOperation__Group_1_0__1 )
            // InternalBehavior.g:6082:2: rule__PostfixOperation__Group_1_0__0__Impl rule__PostfixOperation__Group_1_0__1
            {
            pushFollow(FOLLOW_40);
            rule__PostfixOperation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PostfixOperation__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixOperation__Group_1_0__0"


    // $ANTLR start "rule__PostfixOperation__Group_1_0__0__Impl"
    // InternalBehavior.g:6089:1: rule__PostfixOperation__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PostfixOperation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6093:1: ( ( () ) )
            // InternalBehavior.g:6094:1: ( () )
            {
            // InternalBehavior.g:6094:1: ( () )
            // InternalBehavior.g:6095:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0()); 
            }
            // InternalBehavior.g:6096:1: ()
            // InternalBehavior.g:6098:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixOperation__Group_1_0__0__Impl"


    // $ANTLR start "rule__PostfixOperation__Group_1_0__1"
    // InternalBehavior.g:6108:1: rule__PostfixOperation__Group_1_0__1 : rule__PostfixOperation__Group_1_0__1__Impl ;
    public final void rule__PostfixOperation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6112:1: ( rule__PostfixOperation__Group_1_0__1__Impl )
            // InternalBehavior.g:6113:2: rule__PostfixOperation__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PostfixOperation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostfixOperation__Group_1_0__1"


    // $ANTLR start "rule__PostfixOperation__Group_1_0__1__Impl"
    // InternalBehavior.g:6119:1: rule__PostfixOperation__Group_1_0__1__Impl : ( ( rule__PostfixOperation__FeatureAssignment_1_0_1 ) ) ;
    public final void rule__PostfixOperation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6123:1: ( ( ( rule__PostfixOperation__FeatureAssignment_1_0_1 ) ) )
            // InternalBehavior.g:6124:1: ( ( rule__PostfixOperation__FeatureAssignment_1_0_1 ) )
            {
            // InternalBehavior.g:6124:1: ( ( rule__PostfixOperation__FeatureAssignment_1_0_1 ) )
            // InternalBehavior.g:6125:1: ( rule__PostfixOperation__FeatureAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixOperationAccess().getFeatureAssignment_1_0_1()); 
            }
            // InternalBehavior.g:6126:1: ( rule__PostfixOperation__FeatureAssignment_1_0_1 )
            // InternalBehavior.g:6126:2: rule__PostfixOperation__FeatureAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PostfixOperation__FeatureAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixOperationAccess().getFeatureAssignment_1_0_1()); 
            }

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
    // $ANTLR end "rule__PostfixOperation__Group_1_0__1__Impl"


    // $ANTLR start "rule__DataQuery__Group__0"
    // InternalBehavior.g:6140:1: rule__DataQuery__Group__0 : rule__DataQuery__Group__0__Impl rule__DataQuery__Group__1 ;
    public final void rule__DataQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6144:1: ( rule__DataQuery__Group__0__Impl rule__DataQuery__Group__1 )
            // InternalBehavior.g:6145:2: rule__DataQuery__Group__0__Impl rule__DataQuery__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DataQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataQuery__Group__0"


    // $ANTLR start "rule__DataQuery__Group__0__Impl"
    // InternalBehavior.g:6152:1: rule__DataQuery__Group__0__Impl : ( 'query' ) ;
    public final void rule__DataQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6156:1: ( ( 'query' ) )
            // InternalBehavior.g:6157:1: ( 'query' )
            {
            // InternalBehavior.g:6157:1: ( 'query' )
            // InternalBehavior.g:6158:1: 'query'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataQueryAccess().getQueryKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataQueryAccess().getQueryKeyword_0()); 
            }

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
    // $ANTLR end "rule__DataQuery__Group__0__Impl"


    // $ANTLR start "rule__DataQuery__Group__1"
    // InternalBehavior.g:6171:1: rule__DataQuery__Group__1 : rule__DataQuery__Group__1__Impl rule__DataQuery__Group__2 ;
    public final void rule__DataQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6175:1: ( rule__DataQuery__Group__1__Impl rule__DataQuery__Group__2 )
            // InternalBehavior.g:6176:2: rule__DataQuery__Group__1__Impl rule__DataQuery__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DataQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DataQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataQuery__Group__1"


    // $ANTLR start "rule__DataQuery__Group__1__Impl"
    // InternalBehavior.g:6183:1: rule__DataQuery__Group__1__Impl : ( ( rule__DataQuery__TypeAssignment_1 ) ) ;
    public final void rule__DataQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6187:1: ( ( ( rule__DataQuery__TypeAssignment_1 ) ) )
            // InternalBehavior.g:6188:1: ( ( rule__DataQuery__TypeAssignment_1 ) )
            {
            // InternalBehavior.g:6188:1: ( ( rule__DataQuery__TypeAssignment_1 ) )
            // InternalBehavior.g:6189:1: ( rule__DataQuery__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataQueryAccess().getTypeAssignment_1()); 
            }
            // InternalBehavior.g:6190:1: ( rule__DataQuery__TypeAssignment_1 )
            // InternalBehavior.g:6190:2: rule__DataQuery__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataQuery__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataQueryAccess().getTypeAssignment_1()); 
            }

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
    // $ANTLR end "rule__DataQuery__Group__1__Impl"


    // $ANTLR start "rule__DataQuery__Group__2"
    // InternalBehavior.g:6200:1: rule__DataQuery__Group__2 : rule__DataQuery__Group__2__Impl ;
    public final void rule__DataQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6204:1: ( rule__DataQuery__Group__2__Impl )
            // InternalBehavior.g:6205:2: rule__DataQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataQuery__Group__2"


    // $ANTLR start "rule__DataQuery__Group__2__Impl"
    // InternalBehavior.g:6211:1: rule__DataQuery__Group__2__Impl : ( ( rule__DataQuery__QueryAssignment_2 ) ) ;
    public final void rule__DataQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6215:1: ( ( ( rule__DataQuery__QueryAssignment_2 ) ) )
            // InternalBehavior.g:6216:1: ( ( rule__DataQuery__QueryAssignment_2 ) )
            {
            // InternalBehavior.g:6216:1: ( ( rule__DataQuery__QueryAssignment_2 ) )
            // InternalBehavior.g:6217:1: ( rule__DataQuery__QueryAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataQueryAccess().getQueryAssignment_2()); 
            }
            // InternalBehavior.g:6218:1: ( rule__DataQuery__QueryAssignment_2 )
            // InternalBehavior.g:6218:2: rule__DataQuery__QueryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataQuery__QueryAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataQueryAccess().getQueryAssignment_2()); 
            }

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
    // $ANTLR end "rule__DataQuery__Group__2__Impl"


    // $ANTLR start "rule__QueryExpression__Group__0"
    // InternalBehavior.g:6234:1: rule__QueryExpression__Group__0 : rule__QueryExpression__Group__0__Impl rule__QueryExpression__Group__1 ;
    public final void rule__QueryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6238:1: ( rule__QueryExpression__Group__0__Impl rule__QueryExpression__Group__1 )
            // InternalBehavior.g:6239:2: rule__QueryExpression__Group__0__Impl rule__QueryExpression__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__QueryExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QueryExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryExpression__Group__0"


    // $ANTLR start "rule__QueryExpression__Group__0__Impl"
    // InternalBehavior.g:6246:1: rule__QueryExpression__Group__0__Impl : ( ( rule__QueryExpression__LeftAssignment_0 ) ) ;
    public final void rule__QueryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6250:1: ( ( ( rule__QueryExpression__LeftAssignment_0 ) ) )
            // InternalBehavior.g:6251:1: ( ( rule__QueryExpression__LeftAssignment_0 ) )
            {
            // InternalBehavior.g:6251:1: ( ( rule__QueryExpression__LeftAssignment_0 ) )
            // InternalBehavior.g:6252:1: ( rule__QueryExpression__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryExpressionAccess().getLeftAssignment_0()); 
            }
            // InternalBehavior.g:6253:1: ( rule__QueryExpression__LeftAssignment_0 )
            // InternalBehavior.g:6253:2: rule__QueryExpression__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QueryExpression__LeftAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryExpressionAccess().getLeftAssignment_0()); 
            }

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
    // $ANTLR end "rule__QueryExpression__Group__0__Impl"


    // $ANTLR start "rule__QueryExpression__Group__1"
    // InternalBehavior.g:6263:1: rule__QueryExpression__Group__1 : rule__QueryExpression__Group__1__Impl ;
    public final void rule__QueryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6267:1: ( rule__QueryExpression__Group__1__Impl )
            // InternalBehavior.g:6268:2: rule__QueryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryExpression__Group__1"


    // $ANTLR start "rule__QueryExpression__Group__1__Impl"
    // InternalBehavior.g:6274:1: rule__QueryExpression__Group__1__Impl : ( ( rule__QueryExpression__Group_1__0 )? ) ;
    public final void rule__QueryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6278:1: ( ( ( rule__QueryExpression__Group_1__0 )? ) )
            // InternalBehavior.g:6279:1: ( ( rule__QueryExpression__Group_1__0 )? )
            {
            // InternalBehavior.g:6279:1: ( ( rule__QueryExpression__Group_1__0 )? )
            // InternalBehavior.g:6280:1: ( rule__QueryExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryExpressionAccess().getGroup_1()); 
            }
            // InternalBehavior.g:6281:1: ( rule__QueryExpression__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==60) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBehavior.g:6281:2: rule__QueryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__QueryExpression__Group__1__Impl"


    // $ANTLR start "rule__QueryExpression__Group_1__0"
    // InternalBehavior.g:6295:1: rule__QueryExpression__Group_1__0 : rule__QueryExpression__Group_1__0__Impl rule__QueryExpression__Group_1__1 ;
    public final void rule__QueryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6299:1: ( rule__QueryExpression__Group_1__0__Impl rule__QueryExpression__Group_1__1 )
            // InternalBehavior.g:6300:2: rule__QueryExpression__Group_1__0__Impl rule__QueryExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__QueryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QueryExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryExpression__Group_1__0"


    // $ANTLR start "rule__QueryExpression__Group_1__0__Impl"
    // InternalBehavior.g:6307:1: rule__QueryExpression__Group_1__0__Impl : ( ',' ) ;
    public final void rule__QueryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6311:1: ( ( ',' ) )
            // InternalBehavior.g:6312:1: ( ',' )
            {
            // InternalBehavior.g:6312:1: ( ',' )
            // InternalBehavior.g:6313:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryExpressionAccess().getCommaKeyword_1_0()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryExpressionAccess().getCommaKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__QueryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__QueryExpression__Group_1__1"
    // InternalBehavior.g:6326:1: rule__QueryExpression__Group_1__1 : rule__QueryExpression__Group_1__1__Impl ;
    public final void rule__QueryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6330:1: ( rule__QueryExpression__Group_1__1__Impl )
            // InternalBehavior.g:6331:2: rule__QueryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryExpression__Group_1__1"


    // $ANTLR start "rule__QueryExpression__Group_1__1__Impl"
    // InternalBehavior.g:6337:1: rule__QueryExpression__Group_1__1__Impl : ( ( rule__QueryExpression__RightAssignment_1_1 ) ) ;
    public final void rule__QueryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6341:1: ( ( ( rule__QueryExpression__RightAssignment_1_1 ) ) )
            // InternalBehavior.g:6342:1: ( ( rule__QueryExpression__RightAssignment_1_1 ) )
            {
            // InternalBehavior.g:6342:1: ( ( rule__QueryExpression__RightAssignment_1_1 ) )
            // InternalBehavior.g:6343:1: ( rule__QueryExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalBehavior.g:6344:1: ( rule__QueryExpression__RightAssignment_1_1 )
            // InternalBehavior.g:6344:2: rule__QueryExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryExpressionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__QueryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__InstantiationExpression__Group__0"
    // InternalBehavior.g:6358:1: rule__InstantiationExpression__Group__0 : rule__InstantiationExpression__Group__0__Impl rule__InstantiationExpression__Group__1 ;
    public final void rule__InstantiationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6362:1: ( rule__InstantiationExpression__Group__0__Impl rule__InstantiationExpression__Group__1 )
            // InternalBehavior.g:6363:2: rule__InstantiationExpression__Group__0__Impl rule__InstantiationExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InstantiationExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InstantiationExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationExpression__Group__0"


    // $ANTLR start "rule__InstantiationExpression__Group__0__Impl"
    // InternalBehavior.g:6370:1: rule__InstantiationExpression__Group__0__Impl : ( 'new' ) ;
    public final void rule__InstantiationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6374:1: ( ( 'new' ) )
            // InternalBehavior.g:6375:1: ( 'new' )
            {
            // InternalBehavior.g:6375:1: ( 'new' )
            // InternalBehavior.g:6376:1: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstantiationExpressionAccess().getNewKeyword_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstantiationExpressionAccess().getNewKeyword_0()); 
            }

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
    // $ANTLR end "rule__InstantiationExpression__Group__0__Impl"


    // $ANTLR start "rule__InstantiationExpression__Group__1"
    // InternalBehavior.g:6389:1: rule__InstantiationExpression__Group__1 : rule__InstantiationExpression__Group__1__Impl rule__InstantiationExpression__Group__2 ;
    public final void rule__InstantiationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6393:1: ( rule__InstantiationExpression__Group__1__Impl rule__InstantiationExpression__Group__2 )
            // InternalBehavior.g:6394:2: rule__InstantiationExpression__Group__1__Impl rule__InstantiationExpression__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__InstantiationExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InstantiationExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationExpression__Group__1"


    // $ANTLR start "rule__InstantiationExpression__Group__1__Impl"
    // InternalBehavior.g:6401:1: rule__InstantiationExpression__Group__1__Impl : ( ( rule__InstantiationExpression__TypeAssignment_1 ) ) ;
    public final void rule__InstantiationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6405:1: ( ( ( rule__InstantiationExpression__TypeAssignment_1 ) ) )
            // InternalBehavior.g:6406:1: ( ( rule__InstantiationExpression__TypeAssignment_1 ) )
            {
            // InternalBehavior.g:6406:1: ( ( rule__InstantiationExpression__TypeAssignment_1 ) )
            // InternalBehavior.g:6407:1: ( rule__InstantiationExpression__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstantiationExpressionAccess().getTypeAssignment_1()); 
            }
            // InternalBehavior.g:6408:1: ( rule__InstantiationExpression__TypeAssignment_1 )
            // InternalBehavior.g:6408:2: rule__InstantiationExpression__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstantiationExpression__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstantiationExpressionAccess().getTypeAssignment_1()); 
            }

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
    // $ANTLR end "rule__InstantiationExpression__Group__1__Impl"


    // $ANTLR start "rule__InstantiationExpression__Group__2"
    // InternalBehavior.g:6418:1: rule__InstantiationExpression__Group__2 : rule__InstantiationExpression__Group__2__Impl rule__InstantiationExpression__Group__3 ;
    public final void rule__InstantiationExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6422:1: ( rule__InstantiationExpression__Group__2__Impl rule__InstantiationExpression__Group__3 )
            // InternalBehavior.g:6423:2: rule__InstantiationExpression__Group__2__Impl rule__InstantiationExpression__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__InstantiationExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InstantiationExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationExpression__Group__2"


    // $ANTLR start "rule__InstantiationExpression__Group__2__Impl"
    // InternalBehavior.g:6430:1: rule__InstantiationExpression__Group__2__Impl : ( '(' ) ;
    public final void rule__InstantiationExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6434:1: ( ( '(' ) )
            // InternalBehavior.g:6435:1: ( '(' )
            {
            // InternalBehavior.g:6435:1: ( '(' )
            // InternalBehavior.g:6436:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstantiationExpressionAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstantiationExpressionAccess().getLeftParenthesisKeyword_2()); 
            }

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
    // $ANTLR end "rule__InstantiationExpression__Group__2__Impl"


    // $ANTLR start "rule__InstantiationExpression__Group__3"
    // InternalBehavior.g:6449:1: rule__InstantiationExpression__Group__3 : rule__InstantiationExpression__Group__3__Impl rule__InstantiationExpression__Group__4 ;
    public final void rule__InstantiationExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6453:1: ( rule__InstantiationExpression__Group__3__Impl rule__InstantiationExpression__Group__4 )
            // InternalBehavior.g:6454:2: rule__InstantiationExpression__Group__3__Impl rule__InstantiationExpression__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__InstantiationExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InstantiationExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationExpression__Group__3"


    // $ANTLR start "rule__InstantiationExpression__Group__3__Impl"
    // InternalBehavior.g:6461:1: rule__InstantiationExpression__Group__3__Impl : ( ( rule__InstantiationExpression__ParametersAssignment_3 ) ) ;
    public final void rule__InstantiationExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6465:1: ( ( ( rule__InstantiationExpression__ParametersAssignment_3 ) ) )
            // InternalBehavior.g:6466:1: ( ( rule__InstantiationExpression__ParametersAssignment_3 ) )
            {
            // InternalBehavior.g:6466:1: ( ( rule__InstantiationExpression__ParametersAssignment_3 ) )
            // InternalBehavior.g:6467:1: ( rule__InstantiationExpression__ParametersAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstantiationExpressionAccess().getParametersAssignment_3()); 
            }
            // InternalBehavior.g:6468:1: ( rule__InstantiationExpression__ParametersAssignment_3 )
            // InternalBehavior.g:6468:2: rule__InstantiationExpression__ParametersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InstantiationExpression__ParametersAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstantiationExpressionAccess().getParametersAssignment_3()); 
            }

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
    // $ANTLR end "rule__InstantiationExpression__Group__3__Impl"


    // $ANTLR start "rule__InstantiationExpression__Group__4"
    // InternalBehavior.g:6478:1: rule__InstantiationExpression__Group__4 : rule__InstantiationExpression__Group__4__Impl ;
    public final void rule__InstantiationExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6482:1: ( rule__InstantiationExpression__Group__4__Impl )
            // InternalBehavior.g:6483:2: rule__InstantiationExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstantiationExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationExpression__Group__4"


    // $ANTLR start "rule__InstantiationExpression__Group__4__Impl"
    // InternalBehavior.g:6489:1: rule__InstantiationExpression__Group__4__Impl : ( ')' ) ;
    public final void rule__InstantiationExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6493:1: ( ( ')' ) )
            // InternalBehavior.g:6494:1: ( ')' )
            {
            // InternalBehavior.g:6494:1: ( ')' )
            // InternalBehavior.g:6495:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstantiationExpressionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstantiationExpressionAccess().getRightParenthesisKeyword_4()); 
            }

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
    // $ANTLR end "rule__InstantiationExpression__Group__4__Impl"


    // $ANTLR start "rule__CollectionType__Group__0"
    // InternalBehavior.g:6518:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6522:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // InternalBehavior.g:6523:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__CollectionType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__0"


    // $ANTLR start "rule__CollectionType__Group__0__Impl"
    // InternalBehavior.g:6530:1: rule__CollectionType__Group__0__Impl : ( ( rule__CollectionType__ReferenceAssignment_0 ) ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6534:1: ( ( ( rule__CollectionType__ReferenceAssignment_0 ) ) )
            // InternalBehavior.g:6535:1: ( ( rule__CollectionType__ReferenceAssignment_0 ) )
            {
            // InternalBehavior.g:6535:1: ( ( rule__CollectionType__ReferenceAssignment_0 ) )
            // InternalBehavior.g:6536:1: ( rule__CollectionType__ReferenceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionTypeAccess().getReferenceAssignment_0()); 
            }
            // InternalBehavior.g:6537:1: ( rule__CollectionType__ReferenceAssignment_0 )
            // InternalBehavior.g:6537:2: rule__CollectionType__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__ReferenceAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionTypeAccess().getReferenceAssignment_0()); 
            }

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
    // $ANTLR end "rule__CollectionType__Group__0__Impl"


    // $ANTLR start "rule__CollectionType__Group__1"
    // InternalBehavior.g:6547:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6551:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // InternalBehavior.g:6552:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__CollectionType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__1"


    // $ANTLR start "rule__CollectionType__Group__1__Impl"
    // InternalBehavior.g:6559:1: rule__CollectionType__Group__1__Impl : ( '[' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6563:1: ( ( '[' ) )
            // InternalBehavior.g:6564:1: ( '[' )
            {
            // InternalBehavior.g:6564:1: ( '[' )
            // InternalBehavior.g:6565:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionTypeAccess().getLeftSquareBracketKeyword_1()); 
            }

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
    // $ANTLR end "rule__CollectionType__Group__1__Impl"


    // $ANTLR start "rule__CollectionType__Group__2"
    // InternalBehavior.g:6578:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6582:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // InternalBehavior.g:6583:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__CollectionType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__2"


    // $ANTLR start "rule__CollectionType__Group__2__Impl"
    // InternalBehavior.g:6590:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__SizeAssignment_2 )? ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6594:1: ( ( ( rule__CollectionType__SizeAssignment_2 )? ) )
            // InternalBehavior.g:6595:1: ( ( rule__CollectionType__SizeAssignment_2 )? )
            {
            // InternalBehavior.g:6595:1: ( ( rule__CollectionType__SizeAssignment_2 )? )
            // InternalBehavior.g:6596:1: ( rule__CollectionType__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionTypeAccess().getSizeAssignment_2()); 
            }
            // InternalBehavior.g:6597:1: ( rule__CollectionType__SizeAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBehavior.g:6597:2: rule__CollectionType__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CollectionType__SizeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionTypeAccess().getSizeAssignment_2()); 
            }

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
    // $ANTLR end "rule__CollectionType__Group__2__Impl"


    // $ANTLR start "rule__CollectionType__Group__3"
    // InternalBehavior.g:6607:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6611:1: ( rule__CollectionType__Group__3__Impl )
            // InternalBehavior.g:6612:2: rule__CollectionType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollectionType__Group__3"


    // $ANTLR start "rule__CollectionType__Group__3__Impl"
    // InternalBehavior.g:6618:1: rule__CollectionType__Group__3__Impl : ( ']' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6622:1: ( ( ']' ) )
            // InternalBehavior.g:6623:1: ( ']' )
            {
            // InternalBehavior.g:6623:1: ( ']' )
            // InternalBehavior.g:6624:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionTypeAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionTypeAccess().getRightSquareBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__CollectionType__Group__3__Impl"


    // $ANTLR start "rule__MapType__Group__0"
    // InternalBehavior.g:6645:1: rule__MapType__Group__0 : rule__MapType__Group__0__Impl rule__MapType__Group__1 ;
    public final void rule__MapType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6649:1: ( rule__MapType__Group__0__Impl rule__MapType__Group__1 )
            // InternalBehavior.g:6650:2: rule__MapType__Group__0__Impl rule__MapType__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__MapType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0"


    // $ANTLR start "rule__MapType__Group__0__Impl"
    // InternalBehavior.g:6657:1: rule__MapType__Group__0__Impl : ( ( rule__MapType__ReferenceAssignment_0 ) ) ;
    public final void rule__MapType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6661:1: ( ( ( rule__MapType__ReferenceAssignment_0 ) ) )
            // InternalBehavior.g:6662:1: ( ( rule__MapType__ReferenceAssignment_0 ) )
            {
            // InternalBehavior.g:6662:1: ( ( rule__MapType__ReferenceAssignment_0 ) )
            // InternalBehavior.g:6663:1: ( rule__MapType__ReferenceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTypeAccess().getReferenceAssignment_0()); 
            }
            // InternalBehavior.g:6664:1: ( rule__MapType__ReferenceAssignment_0 )
            // InternalBehavior.g:6664:2: rule__MapType__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MapType__ReferenceAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTypeAccess().getReferenceAssignment_0()); 
            }

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
    // $ANTLR end "rule__MapType__Group__0__Impl"


    // $ANTLR start "rule__MapType__Group__1"
    // InternalBehavior.g:6674:1: rule__MapType__Group__1 : rule__MapType__Group__1__Impl rule__MapType__Group__2 ;
    public final void rule__MapType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6678:1: ( rule__MapType__Group__1__Impl rule__MapType__Group__2 )
            // InternalBehavior.g:6679:2: rule__MapType__Group__1__Impl rule__MapType__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MapType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1"


    // $ANTLR start "rule__MapType__Group__1__Impl"
    // InternalBehavior.g:6686:1: rule__MapType__Group__1__Impl : ( '<' ) ;
    public final void rule__MapType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6690:1: ( ( '<' ) )
            // InternalBehavior.g:6691:1: ( '<' )
            {
            // InternalBehavior.g:6691:1: ( '<' )
            // InternalBehavior.g:6692:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1()); 
            }

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
    // $ANTLR end "rule__MapType__Group__1__Impl"


    // $ANTLR start "rule__MapType__Group__2"
    // InternalBehavior.g:6705:1: rule__MapType__Group__2 : rule__MapType__Group__2__Impl ;
    public final void rule__MapType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6709:1: ( rule__MapType__Group__2__Impl )
            // InternalBehavior.g:6710:2: rule__MapType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2"


    // $ANTLR start "rule__MapType__Group__2__Impl"
    // InternalBehavior.g:6716:1: rule__MapType__Group__2__Impl : ( ( rule__MapType__Group_2__0 ) ) ;
    public final void rule__MapType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6720:1: ( ( ( rule__MapType__Group_2__0 ) ) )
            // InternalBehavior.g:6721:1: ( ( rule__MapType__Group_2__0 ) )
            {
            // InternalBehavior.g:6721:1: ( ( rule__MapType__Group_2__0 ) )
            // InternalBehavior.g:6722:1: ( rule__MapType__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTypeAccess().getGroup_2()); 
            }
            // InternalBehavior.g:6723:1: ( rule__MapType__Group_2__0 )
            // InternalBehavior.g:6723:2: rule__MapType__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__MapType__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTypeAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__MapType__Group__2__Impl"


    // $ANTLR start "rule__MapType__Group_2__0"
    // InternalBehavior.g:6739:1: rule__MapType__Group_2__0 : rule__MapType__Group_2__0__Impl rule__MapType__Group_2__1 ;
    public final void rule__MapType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6743:1: ( rule__MapType__Group_2__0__Impl rule__MapType__Group_2__1 )
            // InternalBehavior.g:6744:2: rule__MapType__Group_2__0__Impl rule__MapType__Group_2__1
            {
            pushFollow(FOLLOW_45);
            rule__MapType__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MapType__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_2__0"


    // $ANTLR start "rule__MapType__Group_2__0__Impl"
    // InternalBehavior.g:6751:1: rule__MapType__Group_2__0__Impl : ( ( rule__MapType__KeyTypeAssignment_2_0 ) ) ;
    public final void rule__MapType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6755:1: ( ( ( rule__MapType__KeyTypeAssignment_2_0 ) ) )
            // InternalBehavior.g:6756:1: ( ( rule__MapType__KeyTypeAssignment_2_0 ) )
            {
            // InternalBehavior.g:6756:1: ( ( rule__MapType__KeyTypeAssignment_2_0 ) )
            // InternalBehavior.g:6757:1: ( rule__MapType__KeyTypeAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTypeAccess().getKeyTypeAssignment_2_0()); 
            }
            // InternalBehavior.g:6758:1: ( rule__MapType__KeyTypeAssignment_2_0 )
            // InternalBehavior.g:6758:2: rule__MapType__KeyTypeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MapType__KeyTypeAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTypeAccess().getKeyTypeAssignment_2_0()); 
            }

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
    // $ANTLR end "rule__MapType__Group_2__0__Impl"


    // $ANTLR start "rule__MapType__Group_2__1"
    // InternalBehavior.g:6768:1: rule__MapType__Group_2__1 : rule__MapType__Group_2__1__Impl ;
    public final void rule__MapType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6772:1: ( rule__MapType__Group_2__1__Impl )
            // InternalBehavior.g:6773:2: rule__MapType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapType__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group_2__1"


    // $ANTLR start "rule__MapType__Group_2__1__Impl"
    // InternalBehavior.g:6779:1: rule__MapType__Group_2__1__Impl : ( '>' ) ;
    public final void rule__MapType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6783:1: ( ( '>' ) )
            // InternalBehavior.g:6784:1: ( '>' )
            {
            // InternalBehavior.g:6784:1: ( '>' )
            // InternalBehavior.g:6785:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_2_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_2_1()); 
            }

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
    // $ANTLR end "rule__MapType__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalBehavior.g:6802:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6806:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalBehavior.g:6807:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalBehavior.g:6814:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6818:1: ( ( RULE_ID ) )
            // InternalBehavior.g:6819:1: ( RULE_ID )
            {
            // InternalBehavior.g:6819:1: ( RULE_ID )
            // InternalBehavior.g:6820:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalBehavior.g:6831:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6835:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalBehavior.g:6836:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalBehavior.g:6842:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6846:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalBehavior.g:6847:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalBehavior.g:6847:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalBehavior.g:6848:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalBehavior.g:6849:1: ( rule__QualifiedName__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==58) ) {
                    int LA44_2 = input.LA(2);

                    if ( (LA44_2==RULE_ID) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // InternalBehavior.g:6849:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalBehavior.g:6863:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6867:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalBehavior.g:6868:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalBehavior.g:6875:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6879:1: ( ( '.' ) )
            // InternalBehavior.g:6880:1: ( '.' )
            {
            // InternalBehavior.g:6880:1: ( '.' )
            // InternalBehavior.g:6881:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalBehavior.g:6894:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6898:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalBehavior.g:6899:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalBehavior.g:6905:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6909:1: ( ( RULE_ID ) )
            // InternalBehavior.g:6910:1: ( RULE_ID )
            {
            // InternalBehavior.g:6910:1: ( RULE_ID )
            // InternalBehavior.g:6911:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalBehavior.g:6926:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6930:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalBehavior.g:6931:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalBehavior.g:6938:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6942:1: ( ( ruleQualifiedName ) )
            // InternalBehavior.g:6943:1: ( ruleQualifiedName )
            {
            // InternalBehavior.g:6943:1: ( ruleQualifiedName )
            // InternalBehavior.g:6944:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalBehavior.g:6955:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6959:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalBehavior.g:6960:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalBehavior.g:6966:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6970:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // InternalBehavior.g:6971:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // InternalBehavior.g:6971:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // InternalBehavior.g:6972:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // InternalBehavior.g:6973:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBehavior.g:6973:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedNameWithWildcard__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0"
    // InternalBehavior.g:6987:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:6991:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // InternalBehavior.g:6992:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_48);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0__Impl"
    // InternalBehavior.g:6999:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7003:1: ( ( '.' ) )
            // InternalBehavior.g:7004:1: ( '.' )
            {
            // InternalBehavior.g:7004:1: ( '.' )
            // InternalBehavior.g:7005:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1"
    // InternalBehavior.g:7018:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7022:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // InternalBehavior.g:7023:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1__Impl"
    // InternalBehavior.g:7029:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7033:1: ( ( '*' ) )
            // InternalBehavior.g:7034:1: ( '*' )
            {
            // InternalBehavior.g:7034:1: ( '*' )
            // InternalBehavior.g:7035:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_0__0"
    // InternalBehavior.g:7052:1: rule__NUMBER__Group_0__0 : rule__NUMBER__Group_0__0__Impl rule__NUMBER__Group_0__1 ;
    public final void rule__NUMBER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7056:1: ( rule__NUMBER__Group_0__0__Impl rule__NUMBER__Group_0__1 )
            // InternalBehavior.g:7057:2: rule__NUMBER__Group_0__0__Impl rule__NUMBER__Group_0__1
            {
            pushFollow(FOLLOW_49);
            rule__NUMBER__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_0__0"


    // $ANTLR start "rule__NUMBER__Group_0__0__Impl"
    // InternalBehavior.g:7064:1: rule__NUMBER__Group_0__0__Impl : ( ( rule__NUMBER__Alternatives_0_0 )? ) ;
    public final void rule__NUMBER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7068:1: ( ( ( rule__NUMBER__Alternatives_0_0 )? ) )
            // InternalBehavior.g:7069:1: ( ( rule__NUMBER__Alternatives_0_0 )? )
            {
            // InternalBehavior.g:7069:1: ( ( rule__NUMBER__Alternatives_0_0 )? )
            // InternalBehavior.g:7070:1: ( rule__NUMBER__Alternatives_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getAlternatives_0_0()); 
            }
            // InternalBehavior.g:7071:1: ( rule__NUMBER__Alternatives_0_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=20 && LA46_0<=21)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBehavior.g:7071:2: rule__NUMBER__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Alternatives_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getAlternatives_0_0()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group_0__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_0__1"
    // InternalBehavior.g:7081:1: rule__NUMBER__Group_0__1 : rule__NUMBER__Group_0__1__Impl ;
    public final void rule__NUMBER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7085:1: ( rule__NUMBER__Group_0__1__Impl )
            // InternalBehavior.g:7086:2: rule__NUMBER__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_0__1"


    // $ANTLR start "rule__NUMBER__Group_0__1__Impl"
    // InternalBehavior.g:7092:1: rule__NUMBER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7096:1: ( ( RULE_INT ) )
            // InternalBehavior.g:7097:1: ( RULE_INT )
            {
            // InternalBehavior.g:7097:1: ( RULE_INT )
            // InternalBehavior.g:7098:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group_0__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__0"
    // InternalBehavior.g:7113:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7117:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalBehavior.g:7118:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__NUMBER__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__0"


    // $ANTLR start "rule__NUMBER__Group_1__0__Impl"
    // InternalBehavior.g:7125:1: rule__NUMBER__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7129:1: ( ( RULE_INT ) )
            // InternalBehavior.g:7130:1: ( RULE_INT )
            {
            // InternalBehavior.g:7130:1: ( RULE_INT )
            // InternalBehavior.g:7131:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group_1__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__1"
    // InternalBehavior.g:7142:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7146:1: ( rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 )
            // InternalBehavior.g:7147:2: rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2
            {
            pushFollow(FOLLOW_50);
            rule__NUMBER__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__1"


    // $ANTLR start "rule__NUMBER__Group_1__1__Impl"
    // InternalBehavior.g:7154:1: rule__NUMBER__Group_1__1__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7158:1: ( ( '.' ) )
            // InternalBehavior.g:7159:1: ( '.' )
            {
            // InternalBehavior.g:7159:1: ( '.' )
            // InternalBehavior.g:7160:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group_1__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__2"
    // InternalBehavior.g:7173:1: rule__NUMBER__Group_1__2 : rule__NUMBER__Group_1__2__Impl ;
    public final void rule__NUMBER__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7177:1: ( rule__NUMBER__Group_1__2__Impl )
            // InternalBehavior.g:7178:2: rule__NUMBER__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__2"


    // $ANTLR start "rule__NUMBER__Group_1__2__Impl"
    // InternalBehavior.g:7184:1: rule__NUMBER__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7188:1: ( ( RULE_INT ) )
            // InternalBehavior.g:7189:1: ( RULE_INT )
            {
            // InternalBehavior.g:7189:1: ( RULE_INT )
            // InternalBehavior.g:7190:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group_1__2__Impl"


    // $ANTLR start "rule__BehaviorModel__NameAssignment_1"
    // InternalBehavior.g:7208:1: rule__BehaviorModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__BehaviorModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7212:1: ( ( ruleQualifiedName ) )
            // InternalBehavior.g:7213:1: ( ruleQualifiedName )
            {
            // InternalBehavior.g:7213:1: ( ruleQualifiedName )
            // InternalBehavior.g:7214:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__BehaviorModel__NameAssignment_1"


    // $ANTLR start "rule__BehaviorModel__ImportsAssignment_2_0"
    // InternalBehavior.g:7223:1: rule__BehaviorModel__ImportsAssignment_2_0 : ( ruleImport ) ;
    public final void rule__BehaviorModel__ImportsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7227:1: ( ( ruleImport ) )
            // InternalBehavior.g:7228:1: ( ruleImport )
            {
            // InternalBehavior.g:7228:1: ( ruleImport )
            // InternalBehavior.g:7229:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorModelAccess().getImportsImportParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorModelAccess().getImportsImportParserRuleCall_2_0_0()); 
            }

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
    // $ANTLR end "rule__BehaviorModel__ImportsAssignment_2_0"


    // $ANTLR start "rule__BehaviorModel__RepositoriesAssignment_2_1"
    // InternalBehavior.g:7238:1: rule__BehaviorModel__RepositoriesAssignment_2_1 : ( ruleRepositoryReference ) ;
    public final void rule__BehaviorModel__RepositoriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7242:1: ( ( ruleRepositoryReference ) )
            // InternalBehavior.g:7243:1: ( ruleRepositoryReference )
            {
            // InternalBehavior.g:7243:1: ( ruleRepositoryReference )
            // InternalBehavior.g:7244:1: ruleRepositoryReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorModelAccess().getRepositoriesRepositoryReferenceParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRepositoryReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorModelAccess().getRepositoriesRepositoryReferenceParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__BehaviorModel__RepositoriesAssignment_2_1"


    // $ANTLR start "rule__BehaviorModel__ComponentImplAssignment_3"
    // InternalBehavior.g:7253:1: rule__BehaviorModel__ComponentImplAssignment_3 : ( ruleComponentImpl ) ;
    public final void rule__BehaviorModel__ComponentImplAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7257:1: ( ( ruleComponentImpl ) )
            // InternalBehavior.g:7258:1: ( ruleComponentImpl )
            {
            // InternalBehavior.g:7258:1: ( ruleComponentImpl )
            // InternalBehavior.g:7259:1: ruleComponentImpl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorModelAccess().getComponentImplComponentImplParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComponentImpl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorModelAccess().getComponentImplComponentImplParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__BehaviorModel__ComponentImplAssignment_3"


    // $ANTLR start "rule__RepositoryReference__ReferenceAssignment_1"
    // InternalBehavior.g:7268:1: rule__RepositoryReference__ReferenceAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RepositoryReference__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7272:1: ( ( RULE_STRING ) )
            // InternalBehavior.g:7273:1: ( RULE_STRING )
            {
            // InternalBehavior.g:7273:1: ( RULE_STRING )
            // InternalBehavior.g:7274:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRepositoryReferenceAccess().getReferenceSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRepositoryReferenceAccess().getReferenceSTRINGTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__RepositoryReference__ReferenceAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalBehavior.g:7283:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7287:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalBehavior.g:7288:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalBehavior.g:7288:1: ( ruleQualifiedNameWithWildcard )
            // InternalBehavior.g:7289:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__ComponentImpl__KindAssignment_1"
    // InternalBehavior.g:7298:1: rule__ComponentImpl__KindAssignment_1 : ( ruleComponentKind ) ;
    public final void rule__ComponentImpl__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7302:1: ( ( ruleComponentKind ) )
            // InternalBehavior.g:7303:1: ( ruleComponentKind )
            {
            // InternalBehavior.g:7303:1: ( ruleComponentKind )
            // InternalBehavior.g:7304:1: ruleComponentKind
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getKindComponentKindEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComponentKind();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getKindComponentKindEnumRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__KindAssignment_1"


    // $ANTLR start "rule__ComponentImpl__RefComponentAssignment_2"
    // InternalBehavior.g:7313:1: rule__ComponentImpl__RefComponentAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentImpl__RefComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7317:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBehavior.g:7318:1: ( ( ruleQualifiedName ) )
            {
            // InternalBehavior.g:7318:1: ( ( ruleQualifiedName ) )
            // InternalBehavior.g:7319:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getRefComponentComponentCrossReference_2_0()); 
            }
            // InternalBehavior.g:7320:1: ( ruleQualifiedName )
            // InternalBehavior.g:7321:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getRefComponentComponentQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getRefComponentComponentQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getRefComponentComponentCrossReference_2_0()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__RefComponentAssignment_2"


    // $ANTLR start "rule__ComponentImpl__LocalDeclarationsAssignment_4"
    // InternalBehavior.g:7332:1: rule__ComponentImpl__LocalDeclarationsAssignment_4 : ( ( rule__ComponentImpl__LocalDeclarationsAlternatives_4_0 ) ) ;
    public final void rule__ComponentImpl__LocalDeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7336:1: ( ( ( rule__ComponentImpl__LocalDeclarationsAlternatives_4_0 ) ) )
            // InternalBehavior.g:7337:1: ( ( rule__ComponentImpl__LocalDeclarationsAlternatives_4_0 ) )
            {
            // InternalBehavior.g:7337:1: ( ( rule__ComponentImpl__LocalDeclarationsAlternatives_4_0 ) )
            // InternalBehavior.g:7338:1: ( rule__ComponentImpl__LocalDeclarationsAlternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getLocalDeclarationsAlternatives_4_0()); 
            }
            // InternalBehavior.g:7339:1: ( rule__ComponentImpl__LocalDeclarationsAlternatives_4_0 )
            // InternalBehavior.g:7339:2: rule__ComponentImpl__LocalDeclarationsAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentImpl__LocalDeclarationsAlternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getLocalDeclarationsAlternatives_4_0()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__LocalDeclarationsAssignment_4"


    // $ANTLR start "rule__ComponentImpl__PostConstructAssignment_5_1"
    // InternalBehavior.g:7348:1: rule__ComponentImpl__PostConstructAssignment_5_1 : ( ruleLifeCycleMethod ) ;
    public final void rule__ComponentImpl__PostConstructAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7352:1: ( ( ruleLifeCycleMethod ) )
            // InternalBehavior.g:7353:1: ( ruleLifeCycleMethod )
            {
            // InternalBehavior.g:7353:1: ( ruleLifeCycleMethod )
            // InternalBehavior.g:7354:1: ruleLifeCycleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getPostConstructLifeCycleMethodParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLifeCycleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getPostConstructLifeCycleMethodParserRuleCall_5_1_0()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__PostConstructAssignment_5_1"


    // $ANTLR start "rule__ComponentImpl__PreDestroyAssignment_6_1"
    // InternalBehavior.g:7363:1: rule__ComponentImpl__PreDestroyAssignment_6_1 : ( ruleLifeCycleMethod ) ;
    public final void rule__ComponentImpl__PreDestroyAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7367:1: ( ( ruleLifeCycleMethod ) )
            // InternalBehavior.g:7368:1: ( ruleLifeCycleMethod )
            {
            // InternalBehavior.g:7368:1: ( ruleLifeCycleMethod )
            // InternalBehavior.g:7369:1: ruleLifeCycleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getPreDestroyLifeCycleMethodParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLifeCycleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getPreDestroyLifeCycleMethodParserRuleCall_6_1_0()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__PreDestroyAssignment_6_1"


    // $ANTLR start "rule__ComponentImpl__InterfacesAssignment_7"
    // InternalBehavior.g:7378:1: rule__ComponentImpl__InterfacesAssignment_7 : ( ruleInterfaceRealization ) ;
    public final void rule__ComponentImpl__InterfacesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7382:1: ( ( ruleInterfaceRealization ) )
            // InternalBehavior.g:7383:1: ( ruleInterfaceRealization )
            {
            // InternalBehavior.g:7383:1: ( ruleInterfaceRealization )
            // InternalBehavior.g:7384:1: ruleInterfaceRealization
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentImplAccess().getInterfacesInterfaceRealizationParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInterfaceRealization();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentImplAccess().getInterfacesInterfaceRealizationParserRuleCall_7_0()); 
            }

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
    // $ANTLR end "rule__ComponentImpl__InterfacesAssignment_7"


    // $ANTLR start "rule__LifeCycleMethod__BodyAssignment_1"
    // InternalBehavior.g:7393:1: rule__LifeCycleMethod__BodyAssignment_1 : ( ruleBlockStatement ) ;
    public final void rule__LifeCycleMethod__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7397:1: ( ( ruleBlockStatement ) )
            // InternalBehavior.g:7398:1: ( ruleBlockStatement )
            {
            // InternalBehavior.g:7398:1: ( ruleBlockStatement )
            // InternalBehavior.g:7399:1: ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLifeCycleMethodAccess().getBodyBlockStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLifeCycleMethodAccess().getBodyBlockStatementParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__LifeCycleMethod__BodyAssignment_1"


    // $ANTLR start "rule__VariableDecl__ModifierAssignment_0"
    // InternalBehavior.g:7408:1: rule__VariableDecl__ModifierAssignment_0 : ( ( rule__VariableDecl__ModifierAlternatives_0_0 ) ) ;
    public final void rule__VariableDecl__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7412:1: ( ( ( rule__VariableDecl__ModifierAlternatives_0_0 ) ) )
            // InternalBehavior.g:7413:1: ( ( rule__VariableDecl__ModifierAlternatives_0_0 ) )
            {
            // InternalBehavior.g:7413:1: ( ( rule__VariableDecl__ModifierAlternatives_0_0 ) )
            // InternalBehavior.g:7414:1: ( rule__VariableDecl__ModifierAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getModifierAlternatives_0_0()); 
            }
            // InternalBehavior.g:7415:1: ( rule__VariableDecl__ModifierAlternatives_0_0 )
            // InternalBehavior.g:7415:2: rule__VariableDecl__ModifierAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecl__ModifierAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getModifierAlternatives_0_0()); 
            }

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
    // $ANTLR end "rule__VariableDecl__ModifierAssignment_0"


    // $ANTLR start "rule__VariableDecl__TypeAssignment_1"
    // InternalBehavior.g:7424:1: rule__VariableDecl__TypeAssignment_1 : ( ruleDeclarationTypeReference ) ;
    public final void rule__VariableDecl__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7428:1: ( ( ruleDeclarationTypeReference ) )
            // InternalBehavior.g:7429:1: ( ruleDeclarationTypeReference )
            {
            // InternalBehavior.g:7429:1: ( ruleDeclarationTypeReference )
            // InternalBehavior.g:7430:1: ruleDeclarationTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclarationTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__VariableDecl__TypeAssignment_1"


    // $ANTLR start "rule__VariableDecl__NameAssignment_2"
    // InternalBehavior.g:7439:1: rule__VariableDecl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7443:1: ( ( RULE_ID ) )
            // InternalBehavior.g:7444:1: ( RULE_ID )
            {
            // InternalBehavior.g:7444:1: ( RULE_ID )
            // InternalBehavior.g:7445:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclAccess().getNameIDTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__VariableDecl__NameAssignment_2"


    // $ANTLR start "rule__ConstantDecl__NameAssignment_1"
    // InternalBehavior.g:7454:1: rule__ConstantDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstantDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7458:1: ( ( RULE_ID ) )
            // InternalBehavior.g:7459:1: ( RULE_ID )
            {
            // InternalBehavior.g:7459:1: ( RULE_ID )
            // InternalBehavior.g:7460:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__ConstantDecl__NameAssignment_1"


    // $ANTLR start "rule__ConstantDecl__ValueAssignment_3"
    // InternalBehavior.g:7469:1: rule__ConstantDecl__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__ConstantDecl__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7473:1: ( ( ruleExpression ) )
            // InternalBehavior.g:7474:1: ( ruleExpression )
            {
            // InternalBehavior.g:7474:1: ( ruleExpression )
            // InternalBehavior.g:7475:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantDeclAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantDeclAccess().getValueExpressionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__ConstantDecl__ValueAssignment_3"


    // $ANTLR start "rule__InterfaceRealization__RefInterfaceAssignment_1"
    // InternalBehavior.g:7484:1: rule__InterfaceRealization__RefInterfaceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__InterfaceRealization__RefInterfaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7488:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBehavior.g:7489:1: ( ( ruleQualifiedName ) )
            {
            // InternalBehavior.g:7489:1: ( ( ruleQualifiedName ) )
            // InternalBehavior.g:7490:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRealizationAccess().getRefInterfaceInterfaceCrossReference_1_0()); 
            }
            // InternalBehavior.g:7491:1: ( ruleQualifiedName )
            // InternalBehavior.g:7492:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRealizationAccess().getRefInterfaceInterfaceQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRealizationAccess().getRefInterfaceInterfaceQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRealizationAccess().getRefInterfaceInterfaceCrossReference_1_0()); 
            }

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
    // $ANTLR end "rule__InterfaceRealization__RefInterfaceAssignment_1"


    // $ANTLR start "rule__InterfaceRealization__MethodsAssignment_2"
    // InternalBehavior.g:7503:1: rule__InterfaceRealization__MethodsAssignment_2 : ( ruleMethodImpl ) ;
    public final void rule__InterfaceRealization__MethodsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7507:1: ( ( ruleMethodImpl ) )
            // InternalBehavior.g:7508:1: ( ruleMethodImpl )
            {
            // InternalBehavior.g:7508:1: ( ruleMethodImpl )
            // InternalBehavior.g:7509:1: ruleMethodImpl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInterfaceRealizationAccess().getMethodsMethodImplParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethodImpl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInterfaceRealizationAccess().getMethodsMethodImplParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__InterfaceRealization__MethodsAssignment_2"


    // $ANTLR start "rule__MethodImpl__RefMethodAssignment_1"
    // InternalBehavior.g:7518:1: rule__MethodImpl__RefMethodAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MethodImpl__RefMethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7522:1: ( ( ( ruleQualifiedName ) ) )
            // InternalBehavior.g:7523:1: ( ( ruleQualifiedName ) )
            {
            // InternalBehavior.g:7523:1: ( ( ruleQualifiedName ) )
            // InternalBehavior.g:7524:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodImplAccess().getRefMethodMethodDeclCrossReference_1_0()); 
            }
            // InternalBehavior.g:7525:1: ( ruleQualifiedName )
            // InternalBehavior.g:7526:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodImplAccess().getRefMethodMethodDeclQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodImplAccess().getRefMethodMethodDeclQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodImplAccess().getRefMethodMethodDeclCrossReference_1_0()); 
            }

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
    // $ANTLR end "rule__MethodImpl__RefMethodAssignment_1"


    // $ANTLR start "rule__MethodImpl__BodyAssignment_2"
    // InternalBehavior.g:7537:1: rule__MethodImpl__BodyAssignment_2 : ( ruleBlockStatement ) ;
    public final void rule__MethodImpl__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7541:1: ( ( ruleBlockStatement ) )
            // InternalBehavior.g:7542:1: ( ruleBlockStatement )
            {
            // InternalBehavior.g:7542:1: ( ruleBlockStatement )
            // InternalBehavior.g:7543:1: ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodImplAccess().getBodyBlockStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodImplAccess().getBodyBlockStatementParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__MethodImpl__BodyAssignment_2"


    // $ANTLR start "rule__IfStatement__ExprAssignment_2"
    // InternalBehavior.g:7552:1: rule__IfStatement__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7556:1: ( ( ruleExpression ) )
            // InternalBehavior.g:7557:1: ( ruleExpression )
            {
            // InternalBehavior.g:7557:1: ( ruleExpression )
            // InternalBehavior.g:7558:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getExprExpressionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__ExprAssignment_2"


    // $ANTLR start "rule__IfStatement__IfStatementAssignment_4"
    // InternalBehavior.g:7567:1: rule__IfStatement__IfStatementAssignment_4 : ( ruleBlockStatement ) ;
    public final void rule__IfStatement__IfStatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7571:1: ( ( ruleBlockStatement ) )
            // InternalBehavior.g:7572:1: ( ruleBlockStatement )
            {
            // InternalBehavior.g:7572:1: ( ruleBlockStatement )
            // InternalBehavior.g:7573:1: ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getIfStatementBlockStatementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getIfStatementBlockStatementParserRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__IfStatementAssignment_4"


    // $ANTLR start "rule__IfStatement__ElseStatementAssignment_5_1"
    // InternalBehavior.g:7582:1: rule__IfStatement__ElseStatementAssignment_5_1 : ( ruleBlockStatement ) ;
    public final void rule__IfStatement__ElseStatementAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7586:1: ( ( ruleBlockStatement ) )
            // InternalBehavior.g:7587:1: ( ruleBlockStatement )
            {
            // InternalBehavior.g:7587:1: ( ruleBlockStatement )
            // InternalBehavior.g:7588:1: ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseStatementBlockStatementParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseStatementBlockStatementParserRuleCall_5_1_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__ElseStatementAssignment_5_1"


    // $ANTLR start "rule__BlockStatement__StatementsAssignment_2"
    // InternalBehavior.g:7597:1: rule__BlockStatement__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__BlockStatement__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7601:1: ( ( ruleStatement ) )
            // InternalBehavior.g:7602:1: ( ruleStatement )
            {
            // InternalBehavior.g:7602:1: ( ruleStatement )
            // InternalBehavior.g:7603:1: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockStatementAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockStatementAccess().getStatementsStatementParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__BlockStatement__StatementsAssignment_2"


    // $ANTLR start "rule__Assignment__VariableAssignment_0"
    // InternalBehavior.g:7612:1: rule__Assignment__VariableAssignment_0 : ( ruleVariableCall ) ;
    public final void rule__Assignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7616:1: ( ( ruleVariableCall ) )
            // InternalBehavior.g:7617:1: ( ruleVariableCall )
            {
            // InternalBehavior.g:7617:1: ( ruleVariableCall )
            // InternalBehavior.g:7618:1: ruleVariableCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableVariableCallParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariableCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariableVariableCallParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Assignment__VariableAssignment_0"


    // $ANTLR start "rule__Assignment__ExpressionAssignment_2"
    // InternalBehavior.g:7627:1: rule__Assignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7631:1: ( ( ruleExpression ) )
            // InternalBehavior.g:7632:1: ( ruleExpression )
            {
            // InternalBehavior.g:7632:1: ( ruleExpression )
            // InternalBehavior.g:7633:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Assignment__ExpressionAssignment_2"


    // $ANTLR start "rule__LoopStatement__VariableAssignment_2"
    // InternalBehavior.g:7642:1: rule__LoopStatement__VariableAssignment_2 : ( ruleVariableDecl ) ;
    public final void rule__LoopStatement__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7646:1: ( ( ruleVariableDecl ) )
            // InternalBehavior.g:7647:1: ( ruleVariableDecl )
            {
            // InternalBehavior.g:7647:1: ( ruleVariableDecl )
            // InternalBehavior.g:7648:1: ruleVariableDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getVariableVariableDeclParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariableDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getVariableVariableDeclParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__LoopStatement__VariableAssignment_2"


    // $ANTLR start "rule__LoopStatement__ExpressionAssignment_4"
    // InternalBehavior.g:7657:1: rule__LoopStatement__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__LoopStatement__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7661:1: ( ( ruleExpression ) )
            // InternalBehavior.g:7662:1: ( ruleExpression )
            {
            // InternalBehavior.g:7662:1: ( ruleExpression )
            // InternalBehavior.g:7663:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getExpressionExpressionParserRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__LoopStatement__ExpressionAssignment_4"


    // $ANTLR start "rule__LoopStatement__StatementAssignment_6"
    // InternalBehavior.g:7672:1: rule__LoopStatement__StatementAssignment_6 : ( ruleBlockStatement ) ;
    public final void rule__LoopStatement__StatementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7676:1: ( ( ruleBlockStatement ) )
            // InternalBehavior.g:7677:1: ( ruleBlockStatement )
            {
            // InternalBehavior.g:7677:1: ( ruleBlockStatement )
            // InternalBehavior.g:7678:1: ruleBlockStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getStatementBlockStatementParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getStatementBlockStatementParserRuleCall_6_0()); 
            }

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
    // $ANTLR end "rule__LoopStatement__StatementAssignment_6"


    // $ANTLR start "rule__DataAccessStatement__OperationAssignment_0"
    // InternalBehavior.g:7687:1: rule__DataAccessStatement__OperationAssignment_0 : ( ruleDataAccessOperation ) ;
    public final void rule__DataAccessStatement__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7691:1: ( ( ruleDataAccessOperation ) )
            // InternalBehavior.g:7692:1: ( ruleDataAccessOperation )
            {
            // InternalBehavior.g:7692:1: ( ruleDataAccessOperation )
            // InternalBehavior.g:7693:1: ruleDataAccessOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataAccessStatementAccess().getOperationDataAccessOperationEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDataAccessOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataAccessStatementAccess().getOperationDataAccessOperationEnumRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__DataAccessStatement__OperationAssignment_0"


    // $ANTLR start "rule__DataAccessStatement__VariableAssignment_1"
    // InternalBehavior.g:7702:1: rule__DataAccessStatement__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataAccessStatement__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7706:1: ( ( ( RULE_ID ) ) )
            // InternalBehavior.g:7707:1: ( ( RULE_ID ) )
            {
            // InternalBehavior.g:7707:1: ( ( RULE_ID ) )
            // InternalBehavior.g:7708:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataAccessStatementAccess().getVariableVariableDeclCrossReference_1_0()); 
            }
            // InternalBehavior.g:7709:1: ( RULE_ID )
            // InternalBehavior.g:7710:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataAccessStatementAccess().getVariableVariableDeclIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataAccessStatementAccess().getVariableVariableDeclIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataAccessStatementAccess().getVariableVariableDeclCrossReference_1_0()); 
            }

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
    // $ANTLR end "rule__DataAccessStatement__VariableAssignment_1"


    // $ANTLR start "rule__ReturnStatement__ExpressionAssignment_1"
    // InternalBehavior.g:7721:1: rule__ReturnStatement__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ReturnStatement__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7725:1: ( ( ruleExpression ) )
            // InternalBehavior.g:7726:1: ( ruleExpression )
            {
            // InternalBehavior.g:7726:1: ( ruleExpression )
            // InternalBehavior.g:7727:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__ReturnStatement__ExpressionAssignment_1"


    // $ANTLR start "rule__VariableCall__VariableAssignment_0"
    // InternalBehavior.g:7736:1: rule__VariableCall__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__VariableCall__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7740:1: ( ( ( RULE_ID ) ) )
            // InternalBehavior.g:7741:1: ( ( RULE_ID ) )
            {
            // InternalBehavior.g:7741:1: ( ( RULE_ID ) )
            // InternalBehavior.g:7742:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getVariableVariableDeclCrossReference_0_0()); 
            }
            // InternalBehavior.g:7743:1: ( RULE_ID )
            // InternalBehavior.g:7744:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getVariableVariableDeclIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getVariableVariableDeclIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getVariableVariableDeclCrossReference_0_0()); 
            }

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
    // $ANTLR end "rule__VariableCall__VariableAssignment_0"


    // $ANTLR start "rule__VariableCall__IndexAssignment_1_1"
    // InternalBehavior.g:7755:1: rule__VariableCall__IndexAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__VariableCall__IndexAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7759:1: ( ( ruleExpression ) )
            // InternalBehavior.g:7760:1: ( ruleExpression )
            {
            // InternalBehavior.g:7760:1: ( ruleExpression )
            // InternalBehavior.g:7761:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__VariableCall__IndexAssignment_1_1"


    // $ANTLR start "rule__VariableCall__SubPropertyAssignment_2_1"
    // InternalBehavior.g:7770:1: rule__VariableCall__SubPropertyAssignment_2_1 : ( rulePropertyCall ) ;
    public final void rule__VariableCall__SubPropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7774:1: ( ( rulePropertyCall ) )
            // InternalBehavior.g:7775:1: ( rulePropertyCall )
            {
            // InternalBehavior.g:7775:1: ( rulePropertyCall )
            // InternalBehavior.g:7776:1: rulePropertyCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePropertyCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__VariableCall__SubPropertyAssignment_2_1"


    // $ANTLR start "rule__PropertyCall__PropertyAssignment_0"
    // InternalBehavior.g:7785:1: rule__PropertyCall__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyCall__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7789:1: ( ( ( RULE_ID ) ) )
            // InternalBehavior.g:7790:1: ( ( RULE_ID ) )
            {
            // InternalBehavior.g:7790:1: ( ( RULE_ID ) )
            // InternalBehavior.g:7791:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getPropertyPropertyCrossReference_0_0()); 
            }
            // InternalBehavior.g:7792:1: ( RULE_ID )
            // InternalBehavior.g:7793:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getPropertyPropertyIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getPropertyPropertyIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getPropertyPropertyCrossReference_0_0()); 
            }

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
    // $ANTLR end "rule__PropertyCall__PropertyAssignment_0"


    // $ANTLR start "rule__PropertyCall__IndexAssignment_1_1"
    // InternalBehavior.g:7804:1: rule__PropertyCall__IndexAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__PropertyCall__IndexAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7808:1: ( ( ruleExpression ) )
            // InternalBehavior.g:7809:1: ( ruleExpression )
            {
            // InternalBehavior.g:7809:1: ( ruleExpression )
            // InternalBehavior.g:7810:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getIndexExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__PropertyCall__IndexAssignment_1_1"


    // $ANTLR start "rule__PropertyCall__SubPropertyAssignment_2_1"
    // InternalBehavior.g:7819:1: rule__PropertyCall__SubPropertyAssignment_2_1 : ( rulePropertyCall ) ;
    public final void rule__PropertyCall__SubPropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7823:1: ( ( rulePropertyCall ) )
            // InternalBehavior.g:7824:1: ( rulePropertyCall )
            {
            // InternalBehavior.g:7824:1: ( rulePropertyCall )
            // InternalBehavior.g:7825:1: rulePropertyCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePropertyCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyCallAccess().getSubPropertyPropertyCallParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__PropertyCall__SubPropertyAssignment_2_1"


    // $ANTLR start "rule__Expression__FeatureAssignment_1_0_0_1"
    // InternalBehavior.g:7834:1: rule__Expression__FeatureAssignment_1_0_0_1 : ( ( '||' ) ) ;
    public final void rule__Expression__FeatureAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7838:1: ( ( ( '||' ) ) )
            // InternalBehavior.g:7839:1: ( ( '||' ) )
            {
            // InternalBehavior.g:7839:1: ( ( '||' ) )
            // InternalBehavior.g:7840:1: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getFeatureVerticalLineVerticalLineKeyword_1_0_0_1_0()); 
            }
            // InternalBehavior.g:7841:1: ( '||' )
            // InternalBehavior.g:7842:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getFeatureVerticalLineVerticalLineKeyword_1_0_0_1_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getFeatureVerticalLineVerticalLineKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getFeatureVerticalLineVerticalLineKeyword_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__Expression__FeatureAssignment_1_0_0_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // InternalBehavior.g:7857:1: rule__Expression__RightAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7861:1: ( ( ruleAndExpression ) )
            // InternalBehavior.g:7862:1: ( ruleAndExpression )
            {
            // InternalBehavior.g:7862:1: ( ruleAndExpression )
            // InternalBehavior.g:7863:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRightAndExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__AndExpression__FeatureAssignment_1_0_0_1"
    // InternalBehavior.g:7872:1: rule__AndExpression__FeatureAssignment_1_0_0_1 : ( ( '&&' ) ) ;
    public final void rule__AndExpression__FeatureAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7876:1: ( ( ( '&&' ) ) )
            // InternalBehavior.g:7877:1: ( ( '&&' ) )
            {
            // InternalBehavior.g:7877:1: ( ( '&&' ) )
            // InternalBehavior.g:7878:1: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getFeatureAmpersandAmpersandKeyword_1_0_0_1_0()); 
            }
            // InternalBehavior.g:7879:1: ( '&&' )
            // InternalBehavior.g:7880:1: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getFeatureAmpersandAmpersandKeyword_1_0_0_1_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getFeatureAmpersandAmpersandKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getFeatureAmpersandAmpersandKeyword_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__FeatureAssignment_1_0_0_1"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_1"
    // InternalBehavior.g:7895:1: rule__AndExpression__RightAssignment_1_1 : ( ruleRelationalExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7899:1: ( ( ruleRelationalExpression ) )
            // InternalBehavior.g:7900:1: ( ruleRelationalExpression )
            {
            // InternalBehavior.g:7900:1: ( ruleRelationalExpression )
            // InternalBehavior.g:7901:1: ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightRelationalExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__RightAssignment_1_1"


    // $ANTLR start "rule__RelationalExpression__FeatureAssignment_1_0_0_1"
    // InternalBehavior.g:7910:1: rule__RelationalExpression__FeatureAssignment_1_0_0_1 : ( ( rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__RelationalExpression__FeatureAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7914:1: ( ( ( rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0 ) ) )
            // InternalBehavior.g:7915:1: ( ( rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0 ) )
            {
            // InternalBehavior.g:7915:1: ( ( rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0 ) )
            // InternalBehavior.g:7916:1: ( rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getFeatureAlternatives_1_0_0_1_0()); 
            }
            // InternalBehavior.g:7917:1: ( rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0 )
            // InternalBehavior.g:7917:2: rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationalExpression__FeatureAlternatives_1_0_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getFeatureAlternatives_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__FeatureAssignment_1_0_0_1"


    // $ANTLR start "rule__RelationalExpression__RightAssignment_1_1"
    // InternalBehavior.g:7926:1: rule__RelationalExpression__RightAssignment_1_1 : ( ruleOtherExpression ) ;
    public final void rule__RelationalExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7930:1: ( ( ruleOtherExpression ) )
            // InternalBehavior.g:7931:1: ( ruleOtherExpression )
            {
            // InternalBehavior.g:7931:1: ( ruleOtherExpression )
            // InternalBehavior.g:7932:1: ruleOtherExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRightOtherExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOtherExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getRightOtherExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__RightAssignment_1_1"


    // $ANTLR start "rule__OtherExpression__FeatureAssignment_1_0_0_1"
    // InternalBehavior.g:7941:1: rule__OtherExpression__FeatureAssignment_1_0_0_1 : ( ( 'instanceof' ) ) ;
    public final void rule__OtherExpression__FeatureAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7945:1: ( ( ( 'instanceof' ) ) )
            // InternalBehavior.g:7946:1: ( ( 'instanceof' ) )
            {
            // InternalBehavior.g:7946:1: ( ( 'instanceof' ) )
            // InternalBehavior.g:7947:1: ( 'instanceof' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getFeatureInstanceofKeyword_1_0_0_1_0()); 
            }
            // InternalBehavior.g:7948:1: ( 'instanceof' )
            // InternalBehavior.g:7949:1: 'instanceof'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getFeatureInstanceofKeyword_1_0_0_1_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getFeatureInstanceofKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getFeatureInstanceofKeyword_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__OtherExpression__FeatureAssignment_1_0_0_1"


    // $ANTLR start "rule__OtherExpression__TypeAssignment_1_1"
    // InternalBehavior.g:7964:1: rule__OtherExpression__TypeAssignment_1_1 : ( ruleTypeReference ) ;
    public final void rule__OtherExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7968:1: ( ( ruleTypeReference ) )
            // InternalBehavior.g:7969:1: ( ruleTypeReference )
            {
            // InternalBehavior.g:7969:1: ( ruleTypeReference )
            // InternalBehavior.g:7970:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__OtherExpression__TypeAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpression__FeatureAssignment_1_0_0_1"
    // InternalBehavior.g:7979:1: rule__AdditiveExpression__FeatureAssignment_1_0_0_1 : ( ( rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__AdditiveExpression__FeatureAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7983:1: ( ( ( rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0 ) ) )
            // InternalBehavior.g:7984:1: ( ( rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0 ) )
            {
            // InternalBehavior.g:7984:1: ( ( rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0 ) )
            // InternalBehavior.g:7985:1: ( rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getFeatureAlternatives_1_0_0_1_0()); 
            }
            // InternalBehavior.g:7986:1: ( rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0 )
            // InternalBehavior.g:7986:2: rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__FeatureAlternatives_1_0_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getFeatureAlternatives_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__FeatureAssignment_1_0_0_1"


    // $ANTLR start "rule__AdditiveExpression__RightAssignment_1_1"
    // InternalBehavior.g:7995:1: rule__AdditiveExpression__RightAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:7999:1: ( ( ruleMultiplicativeExpression ) )
            // InternalBehavior.g:8000:1: ( ruleMultiplicativeExpression )
            {
            // InternalBehavior.g:8000:1: ( ruleMultiplicativeExpression )
            // InternalBehavior.g:8001:1: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__RightAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1"
    // InternalBehavior.g:8010:1: rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1 : ( ( rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0 ) ) ;
    public final void rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8014:1: ( ( ( rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0 ) ) )
            // InternalBehavior.g:8015:1: ( ( rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0 ) )
            {
            // InternalBehavior.g:8015:1: ( ( rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0 ) )
            // InternalBehavior.g:8016:1: ( rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getFeatureAlternatives_1_0_0_1_0()); 
            }
            // InternalBehavior.g:8017:1: ( rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0 )
            // InternalBehavior.g:8017:2: rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__FeatureAlternatives_1_0_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getFeatureAlternatives_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__FeatureAssignment_1_0_0_1"


    // $ANTLR start "rule__MultiplicativeExpression__RightAssignment_1_1"
    // InternalBehavior.g:8026:1: rule__MultiplicativeExpression__RightAssignment_1_1 : ( ruleUnaryOperation ) ;
    public final void rule__MultiplicativeExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8030:1: ( ( ruleUnaryOperation ) )
            // InternalBehavior.g:8031:1: ( ruleUnaryOperation )
            {
            // InternalBehavior.g:8031:1: ( ruleUnaryOperation )
            // InternalBehavior.g:8032:1: ruleUnaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getRightUnaryOperationParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__RightAssignment_1_1"


    // $ANTLR start "rule__UnaryOperation__FeatureAssignment_0_1"
    // InternalBehavior.g:8041:1: rule__UnaryOperation__FeatureAssignment_0_1 : ( ( '!' ) ) ;
    public final void rule__UnaryOperation__FeatureAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8045:1: ( ( ( '!' ) ) )
            // InternalBehavior.g:8046:1: ( ( '!' ) )
            {
            // InternalBehavior.g:8046:1: ( ( '!' ) )
            // InternalBehavior.g:8047:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getFeatureExclamationMarkKeyword_0_1_0()); 
            }
            // InternalBehavior.g:8048:1: ( '!' )
            // InternalBehavior.g:8049:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getFeatureExclamationMarkKeyword_0_1_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getFeatureExclamationMarkKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getFeatureExclamationMarkKeyword_0_1_0()); 
            }

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
    // $ANTLR end "rule__UnaryOperation__FeatureAssignment_0_1"


    // $ANTLR start "rule__UnaryOperation__OperandAssignment_0_2"
    // InternalBehavior.g:8064:1: rule__UnaryOperation__OperandAssignment_0_2 : ( ruleUnaryOperation ) ;
    public final void rule__UnaryOperation__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8068:1: ( ( ruleUnaryOperation ) )
            // InternalBehavior.g:8069:1: ( ruleUnaryOperation )
            {
            // InternalBehavior.g:8069:1: ( ruleUnaryOperation )
            // InternalBehavior.g:8070:1: ruleUnaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getOperandUnaryOperationParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getOperandUnaryOperationParserRuleCall_0_2_0()); 
            }

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
    // $ANTLR end "rule__UnaryOperation__OperandAssignment_0_2"


    // $ANTLR start "rule__CastedExpression__FeatureAssignment_1_0_0_1"
    // InternalBehavior.g:8079:1: rule__CastedExpression__FeatureAssignment_1_0_0_1 : ( ( 'as' ) ) ;
    public final void rule__CastedExpression__FeatureAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8083:1: ( ( ( 'as' ) ) )
            // InternalBehavior.g:8084:1: ( ( 'as' ) )
            {
            // InternalBehavior.g:8084:1: ( ( 'as' ) )
            // InternalBehavior.g:8085:1: ( 'as' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getFeatureAsKeyword_1_0_0_1_0()); 
            }
            // InternalBehavior.g:8086:1: ( 'as' )
            // InternalBehavior.g:8087:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getFeatureAsKeyword_1_0_0_1_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getFeatureAsKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getFeatureAsKeyword_1_0_0_1_0()); 
            }

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
    // $ANTLR end "rule__CastedExpression__FeatureAssignment_1_0_0_1"


    // $ANTLR start "rule__CastedExpression__TypeAssignment_1_1"
    // InternalBehavior.g:8102:1: rule__CastedExpression__TypeAssignment_1_1 : ( ruleTypeReference ) ;
    public final void rule__CastedExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8106:1: ( ( ruleTypeReference ) )
            // InternalBehavior.g:8107:1: ( ruleTypeReference )
            {
            // InternalBehavior.g:8107:1: ( ruleTypeReference )
            // InternalBehavior.g:8108:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCastedExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCastedExpressionAccess().getTypeTypeReferenceParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__CastedExpression__TypeAssignment_1_1"


    // $ANTLR start "rule__PostfixOperation__FeatureAssignment_1_0_1"
    // InternalBehavior.g:8117:1: rule__PostfixOperation__FeatureAssignment_1_0_1 : ( ( rule__PostfixOperation__FeatureAlternatives_1_0_1_0 ) ) ;
    public final void rule__PostfixOperation__FeatureAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8121:1: ( ( ( rule__PostfixOperation__FeatureAlternatives_1_0_1_0 ) ) )
            // InternalBehavior.g:8122:1: ( ( rule__PostfixOperation__FeatureAlternatives_1_0_1_0 ) )
            {
            // InternalBehavior.g:8122:1: ( ( rule__PostfixOperation__FeatureAlternatives_1_0_1_0 ) )
            // InternalBehavior.g:8123:1: ( rule__PostfixOperation__FeatureAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPostfixOperationAccess().getFeatureAlternatives_1_0_1_0()); 
            }
            // InternalBehavior.g:8124:1: ( rule__PostfixOperation__FeatureAlternatives_1_0_1_0 )
            // InternalBehavior.g:8124:2: rule__PostfixOperation__FeatureAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PostfixOperation__FeatureAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPostfixOperationAccess().getFeatureAlternatives_1_0_1_0()); 
            }

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
    // $ANTLR end "rule__PostfixOperation__FeatureAssignment_1_0_1"


    // $ANTLR start "rule__DataQuery__TypeAssignment_1"
    // InternalBehavior.g:8133:1: rule__DataQuery__TypeAssignment_1 : ( ruleDeclarationTypeReference ) ;
    public final void rule__DataQuery__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8137:1: ( ( ruleDeclarationTypeReference ) )
            // InternalBehavior.g:8138:1: ( ruleDeclarationTypeReference )
            {
            // InternalBehavior.g:8138:1: ( ruleDeclarationTypeReference )
            // InternalBehavior.g:8139:1: ruleDeclarationTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataQueryAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclarationTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataQueryAccess().getTypeDeclarationTypeReferenceParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__DataQuery__TypeAssignment_1"


    // $ANTLR start "rule__DataQuery__QueryAssignment_2"
    // InternalBehavior.g:8148:1: rule__DataQuery__QueryAssignment_2 : ( ruleQueryExpression ) ;
    public final void rule__DataQuery__QueryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8152:1: ( ( ruleQueryExpression ) )
            // InternalBehavior.g:8153:1: ( ruleQueryExpression )
            {
            // InternalBehavior.g:8153:1: ( ruleQueryExpression )
            // InternalBehavior.g:8154:1: ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataQueryAccess().getQueryQueryExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQueryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataQueryAccess().getQueryQueryExpressionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__DataQuery__QueryAssignment_2"


    // $ANTLR start "rule__QueryExpression__LeftAssignment_0"
    // InternalBehavior.g:8163:1: rule__QueryExpression__LeftAssignment_0 : ( ruleQueryElement ) ;
    public final void rule__QueryExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8167:1: ( ( ruleQueryElement ) )
            // InternalBehavior.g:8168:1: ( ruleQueryElement )
            {
            // InternalBehavior.g:8168:1: ( ruleQueryElement )
            // InternalBehavior.g:8169:1: ruleQueryElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryExpressionAccess().getLeftQueryElementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQueryElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryExpressionAccess().getLeftQueryElementParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__QueryExpression__LeftAssignment_0"


    // $ANTLR start "rule__QueryExpression__RightAssignment_1_1"
    // InternalBehavior.g:8178:1: rule__QueryExpression__RightAssignment_1_1 : ( ruleQueryExpression ) ;
    public final void rule__QueryExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8182:1: ( ( ruleQueryExpression ) )
            // InternalBehavior.g:8183:1: ( ruleQueryExpression )
            {
            // InternalBehavior.g:8183:1: ( ruleQueryExpression )
            // InternalBehavior.g:8184:1: ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryExpressionAccess().getRightQueryExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQueryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryExpressionAccess().getRightQueryExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__QueryExpression__RightAssignment_1_1"


    // $ANTLR start "rule__TypedValueReference__TypedValueAssignment"
    // InternalBehavior.g:8193:1: rule__TypedValueReference__TypedValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TypedValueReference__TypedValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8197:1: ( ( ( RULE_ID ) ) )
            // InternalBehavior.g:8198:1: ( ( RULE_ID ) )
            {
            // InternalBehavior.g:8198:1: ( ( RULE_ID ) )
            // InternalBehavior.g:8199:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedValueReferenceAccess().getTypedValueTypedValueCrossReference_0()); 
            }
            // InternalBehavior.g:8200:1: ( RULE_ID )
            // InternalBehavior.g:8201:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedValueReferenceAccess().getTypedValueTypedValueIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedValueReferenceAccess().getTypedValueTypedValueIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedValueReferenceAccess().getTypedValueTypedValueCrossReference_0()); 
            }

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
    // $ANTLR end "rule__TypedValueReference__TypedValueAssignment"


    // $ANTLR start "rule__InstantiationExpression__TypeAssignment_1"
    // InternalBehavior.g:8212:1: rule__InstantiationExpression__TypeAssignment_1 : ( ruleTypeReference ) ;
    public final void rule__InstantiationExpression__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8216:1: ( ( ruleTypeReference ) )
            // InternalBehavior.g:8217:1: ( ruleTypeReference )
            {
            // InternalBehavior.g:8217:1: ( ruleTypeReference )
            // InternalBehavior.g:8218:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstantiationExpressionAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstantiationExpressionAccess().getTypeTypeReferenceParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__InstantiationExpression__TypeAssignment_1"


    // $ANTLR start "rule__InstantiationExpression__ParametersAssignment_3"
    // InternalBehavior.g:8227:1: rule__InstantiationExpression__ParametersAssignment_3 : ( ruleExpression ) ;
    public final void rule__InstantiationExpression__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8231:1: ( ( ruleExpression ) )
            // InternalBehavior.g:8232:1: ( ruleExpression )
            {
            // InternalBehavior.g:8232:1: ( ruleExpression )
            // InternalBehavior.g:8233:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstantiationExpressionAccess().getParametersExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstantiationExpressionAccess().getParametersExpressionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__InstantiationExpression__ParametersAssignment_3"


    // $ANTLR start "rule__TypeReference__ReferenceAssignment"
    // InternalBehavior.g:8242:1: rule__TypeReference__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8246:1: ( ( ( RULE_ID ) ) )
            // InternalBehavior.g:8247:1: ( ( RULE_ID ) )
            {
            // InternalBehavior.g:8247:1: ( ( RULE_ID ) )
            // InternalBehavior.g:8248:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_0()); 
            }
            // InternalBehavior.g:8249:1: ( RULE_ID )
            // InternalBehavior.g:8250:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_0()); 
            }

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
    // $ANTLR end "rule__TypeReference__ReferenceAssignment"


    // $ANTLR start "rule__CollectionType__ReferenceAssignment_0"
    // InternalBehavior.g:8261:1: rule__CollectionType__ReferenceAssignment_0 : ( ruleTypeReference ) ;
    public final void rule__CollectionType__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8265:1: ( ( ruleTypeReference ) )
            // InternalBehavior.g:8266:1: ( ruleTypeReference )
            {
            // InternalBehavior.g:8266:1: ( ruleTypeReference )
            // InternalBehavior.g:8267:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__CollectionType__ReferenceAssignment_0"


    // $ANTLR start "rule__CollectionType__SizeAssignment_2"
    // InternalBehavior.g:8276:1: rule__CollectionType__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__CollectionType__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8280:1: ( ( RULE_INT ) )
            // InternalBehavior.g:8281:1: ( RULE_INT )
            {
            // InternalBehavior.g:8281:1: ( RULE_INT )
            // InternalBehavior.g:8282:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectionTypeAccess().getSizeINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectionTypeAccess().getSizeINTTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__CollectionType__SizeAssignment_2"


    // $ANTLR start "rule__MapType__ReferenceAssignment_0"
    // InternalBehavior.g:8291:1: rule__MapType__ReferenceAssignment_0 : ( ruleTypeReference ) ;
    public final void rule__MapType__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8295:1: ( ( ruleTypeReference ) )
            // InternalBehavior.g:8296:1: ( ruleTypeReference )
            {
            // InternalBehavior.g:8296:1: ( ruleTypeReference )
            // InternalBehavior.g:8297:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__MapType__ReferenceAssignment_0"


    // $ANTLR start "rule__MapType__KeyTypeAssignment_2_0"
    // InternalBehavior.g:8306:1: rule__MapType__KeyTypeAssignment_2_0 : ( ruleTypeReference ) ;
    public final void rule__MapType__KeyTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8310:1: ( ( ruleTypeReference ) )
            // InternalBehavior.g:8311:1: ( ruleTypeReference )
            {
            // InternalBehavior.g:8311:1: ( ruleTypeReference )
            // InternalBehavior.g:8312:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMapTypeAccess().getKeyTypeTypeReferenceParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMapTypeAccess().getKeyTypeTypeReferenceParserRuleCall_2_0_0()); 
            }

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
    // $ANTLR end "rule__MapType__KeyTypeAssignment_2_0"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalBehavior.g:8321:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8325:1: ( ( RULE_STRING ) )
            // InternalBehavior.g:8326:1: ( RULE_STRING )
            {
            // InternalBehavior.g:8326:1: ( RULE_STRING )
            // InternalBehavior.g:8327:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__CharLiteral__ValueAssignment"
    // InternalBehavior.g:8336:1: rule__CharLiteral__ValueAssignment : ( RULE_CHARACTER ) ;
    public final void rule__CharLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8340:1: ( ( RULE_CHARACTER ) )
            // InternalBehavior.g:8341:1: ( RULE_CHARACTER )
            {
            // InternalBehavior.g:8341:1: ( RULE_CHARACTER )
            // InternalBehavior.g:8342:1: RULE_CHARACTER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharLiteralAccess().getValueCHARACTERTerminalRuleCall_0()); 
            }
            match(input,RULE_CHARACTER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharLiteralAccess().getValueCHARACTERTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__CharLiteral__ValueAssignment"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalBehavior.g:8351:1: rule__NumberLiteral__ValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8355:1: ( ( ruleNUMBER ) )
            // InternalBehavior.g:8356:1: ( ruleNUMBER )
            {
            // InternalBehavior.g:8356:1: ( ruleNUMBER )
            // InternalBehavior.g:8357:1: ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // InternalBehavior.g:8366:1: rule__BooleanLiteral__ValueAssignment : ( ruleBOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalBehavior.g:8370:1: ( ( ruleBOOLEAN ) )
            // InternalBehavior.g:8371:1: ( ruleBOOLEAN )
            {
            // InternalBehavior.g:8371:1: ( ruleBOOLEAN )
            // InternalBehavior.g:8372:1: ruleBOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBOOLEAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001C0000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000AE0000003000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200000003002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x28000000303000F0L,0x0000000000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00A2020E00000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00A2000E00000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2A000000303000F0L,0x0000000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000FC002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000020L});

}