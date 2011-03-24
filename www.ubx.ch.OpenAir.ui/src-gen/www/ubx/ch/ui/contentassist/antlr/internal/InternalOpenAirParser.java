package www.ubx.ch.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import www.ubx.ch.services.OpenAirGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenAirParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_REAL", "RULE_SL_COMMENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'Q'", "'R'", "'W'", "'P'", "'GP'", "'TMZ'", "'CTR'", "'Restricted'", "'UKN'", "'ft'", "'m'", "'MSL'", "'m MSL'", "'ft MSL'", "'AGL'", "'m AGL'", "'ft AGL'", "'AMSL'", "'m AMSL'", "'N'", "'S'", "'AC'", "'SP'", "','", "'SB'", "'AN'", "'AL'", "'AH'", "'FL'", "'SFC'", "'GND'", "'UNL'", "'V'", "'X='", "'D='", "'+'", "'-'", "'DC'", "'DP'", "'DA'", "'DB'", "'AT'"
    };
    public static final int RULE_ID=8;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int RULE_REAL=6;
    public static final int RULE_WS=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_ML_COMMENT=9;

        public InternalOpenAirParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g"; }


     
     	private OpenAirGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OpenAirGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleOpenAir
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:61:1: entryRuleOpenAir : ruleOpenAir EOF ;
    public final void entryRuleOpenAir() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:62:1: ( ruleOpenAir EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:63:1: ruleOpenAir EOF
            {
             before(grammarAccess.getOpenAirRule()); 
            pushFollow(FOLLOW_ruleOpenAir_in_entryRuleOpenAir61);
            ruleOpenAir();
            _fsp--;

             after(grammarAccess.getOpenAirRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenAir68); 

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
    // $ANTLR end entryRuleOpenAir


    // $ANTLR start ruleOpenAir
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:70:1: ruleOpenAir : ( ( rule__OpenAir__AirspacesAssignment )* ) ;
    public final void ruleOpenAir() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:74:2: ( ( ( rule__OpenAir__AirspacesAssignment )* ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:75:1: ( ( rule__OpenAir__AirspacesAssignment )* )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:75:1: ( ( rule__OpenAir__AirspacesAssignment )* )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:76:1: ( rule__OpenAir__AirspacesAssignment )*
            {
             before(grammarAccess.getOpenAirAccess().getAirspacesAssignment()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:77:1: ( rule__OpenAir__AirspacesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:77:2: rule__OpenAir__AirspacesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__OpenAir__AirspacesAssignment_in_ruleOpenAir94);
            	    rule__OpenAir__AirspacesAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getOpenAirAccess().getAirspacesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOpenAir


    // $ANTLR start entryRuleAirspace
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:89:1: entryRuleAirspace : ruleAirspace EOF ;
    public final void entryRuleAirspace() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:90:1: ( ruleAirspace EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:91:1: ruleAirspace EOF
            {
             before(grammarAccess.getAirspaceRule()); 
            pushFollow(FOLLOW_ruleAirspace_in_entryRuleAirspace122);
            ruleAirspace();
            _fsp--;

             after(grammarAccess.getAirspaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAirspace129); 

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
    // $ANTLR end entryRuleAirspace


    // $ANTLR start ruleAirspace
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:98:1: ruleAirspace : ( ( rule__Airspace__Group__0 ) ) ;
    public final void ruleAirspace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:102:2: ( ( ( rule__Airspace__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:103:1: ( ( rule__Airspace__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:103:1: ( ( rule__Airspace__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:104:1: ( rule__Airspace__Group__0 )
            {
             before(grammarAccess.getAirspaceAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:105:1: ( rule__Airspace__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:105:2: rule__Airspace__Group__0
            {
            pushFollow(FOLLOW_rule__Airspace__Group__0_in_ruleAirspace155);
            rule__Airspace__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAirspaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAirspace


    // $ANTLR start entryRuleTheDef
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:117:1: entryRuleTheDef : ruleTheDef EOF ;
    public final void entryRuleTheDef() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:118:1: ( ruleTheDef EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:119:1: ruleTheDef EOF
            {
             before(grammarAccess.getTheDefRule()); 
            pushFollow(FOLLOW_ruleTheDef_in_entryRuleTheDef182);
            ruleTheDef();
            _fsp--;

             after(grammarAccess.getTheDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheDef189); 

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
    // $ANTLR end entryRuleTheDef


    // $ANTLR start ruleTheDef
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:126:1: ruleTheDef : ( ( rule__TheDef__Group__0 ) ) ;
    public final void ruleTheDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:130:2: ( ( ( rule__TheDef__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:131:1: ( ( rule__TheDef__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:131:1: ( ( rule__TheDef__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:132:1: ( rule__TheDef__Group__0 )
            {
             before(grammarAccess.getTheDefAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:133:1: ( rule__TheDef__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:133:2: rule__TheDef__Group__0
            {
            pushFollow(FOLLOW_rule__TheDef__Group__0_in_ruleTheDef215);
            rule__TheDef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTheDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTheDef


    // $ANTLR start entryRuleAsClass
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:145:1: entryRuleAsClass : ruleAsClass EOF ;
    public final void entryRuleAsClass() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:146:1: ( ruleAsClass EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:147:1: ruleAsClass EOF
            {
             before(grammarAccess.getAsClassRule()); 
            pushFollow(FOLLOW_ruleAsClass_in_entryRuleAsClass242);
            ruleAsClass();
            _fsp--;

             after(grammarAccess.getAsClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsClass249); 

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
    // $ANTLR end entryRuleAsClass


    // $ANTLR start ruleAsClass
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:154:1: ruleAsClass : ( ( rule__AsClass__Group__0 ) ) ;
    public final void ruleAsClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:158:2: ( ( ( rule__AsClass__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:159:1: ( ( rule__AsClass__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:159:1: ( ( rule__AsClass__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:160:1: ( rule__AsClass__Group__0 )
            {
             before(grammarAccess.getAsClassAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:161:1: ( rule__AsClass__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:161:2: rule__AsClass__Group__0
            {
            pushFollow(FOLLOW_rule__AsClass__Group__0_in_ruleAsClass275);
            rule__AsClass__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAsClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAsClass


    // $ANTLR start entryRuleSP
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:173:1: entryRuleSP : ruleSP EOF ;
    public final void entryRuleSP() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:174:1: ( ruleSP EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:175:1: ruleSP EOF
            {
             before(grammarAccess.getSPRule()); 
            pushFollow(FOLLOW_ruleSP_in_entryRuleSP302);
            ruleSP();
            _fsp--;

             after(grammarAccess.getSPRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSP309); 

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
    // $ANTLR end entryRuleSP


    // $ANTLR start ruleSP
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:182:1: ruleSP : ( ( rule__SP__Group__0 ) ) ;
    public final void ruleSP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:186:2: ( ( ( rule__SP__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:187:1: ( ( rule__SP__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:187:1: ( ( rule__SP__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:188:1: ( rule__SP__Group__0 )
            {
             before(grammarAccess.getSPAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:189:1: ( rule__SP__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:189:2: rule__SP__Group__0
            {
            pushFollow(FOLLOW_rule__SP__Group__0_in_ruleSP335);
            rule__SP__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSP


    // $ANTLR start entryRuleSB
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:201:1: entryRuleSB : ruleSB EOF ;
    public final void entryRuleSB() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:202:1: ( ruleSB EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:203:1: ruleSB EOF
            {
             before(grammarAccess.getSBRule()); 
            pushFollow(FOLLOW_ruleSB_in_entryRuleSB362);
            ruleSB();
            _fsp--;

             after(grammarAccess.getSBRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSB369); 

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
    // $ANTLR end entryRuleSB


    // $ANTLR start ruleSB
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:210:1: ruleSB : ( ( rule__SB__Group__0 ) ) ;
    public final void ruleSB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:214:2: ( ( ( rule__SB__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:215:1: ( ( rule__SB__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:215:1: ( ( rule__SB__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:216:1: ( rule__SB__Group__0 )
            {
             before(grammarAccess.getSBAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:217:1: ( rule__SB__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:217:2: rule__SB__Group__0
            {
            pushFollow(FOLLOW_rule__SB__Group__0_in_ruleSB395);
            rule__SB__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSB


    // $ANTLR start entryRuleAsName
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:229:1: entryRuleAsName : ruleAsName EOF ;
    public final void entryRuleAsName() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:230:1: ( ruleAsName EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:231:1: ruleAsName EOF
            {
             before(grammarAccess.getAsNameRule()); 
            pushFollow(FOLLOW_ruleAsName_in_entryRuleAsName422);
            ruleAsName();
            _fsp--;

             after(grammarAccess.getAsNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsName429); 

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
    // $ANTLR end entryRuleAsName


    // $ANTLR start ruleAsName
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:238:1: ruleAsName : ( ( rule__AsName__Group__0 ) ) ;
    public final void ruleAsName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:242:2: ( ( ( rule__AsName__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:243:1: ( ( rule__AsName__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:243:1: ( ( rule__AsName__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:244:1: ( rule__AsName__Group__0 )
            {
             before(grammarAccess.getAsNameAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:245:1: ( rule__AsName__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:245:2: rule__AsName__Group__0
            {
            pushFollow(FOLLOW_rule__AsName__Group__0_in_ruleAsName455);
            rule__AsName__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAsNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAsName


    // $ANTLR start entryRuleLimites
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:257:1: entryRuleLimites : ruleLimites EOF ;
    public final void entryRuleLimites() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:258:1: ( ruleLimites EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:259:1: ruleLimites EOF
            {
             before(grammarAccess.getLimitesRule()); 
            pushFollow(FOLLOW_ruleLimites_in_entryRuleLimites482);
            ruleLimites();
            _fsp--;

             after(grammarAccess.getLimitesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimites489); 

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
    // $ANTLR end entryRuleLimites


    // $ANTLR start ruleLimites
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:266:1: ruleLimites : ( ( rule__Limites__Alternatives ) ) ;
    public final void ruleLimites() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:270:2: ( ( ( rule__Limites__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:271:1: ( ( rule__Limites__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:271:1: ( ( rule__Limites__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:272:1: ( rule__Limites__Alternatives )
            {
             before(grammarAccess.getLimitesAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:273:1: ( rule__Limites__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:273:2: rule__Limites__Alternatives
            {
            pushFollow(FOLLOW_rule__Limites__Alternatives_in_ruleLimites515);
            rule__Limites__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLimitesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLimites


    // $ANTLR start entryRuleTheGeom
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:285:1: entryRuleTheGeom : ruleTheGeom EOF ;
    public final void entryRuleTheGeom() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:286:1: ( ruleTheGeom EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:287:1: ruleTheGeom EOF
            {
             before(grammarAccess.getTheGeomRule()); 
            pushFollow(FOLLOW_ruleTheGeom_in_entryRuleTheGeom542);
            ruleTheGeom();
            _fsp--;

             after(grammarAccess.getTheGeomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheGeom549); 

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
    // $ANTLR end entryRuleTheGeom


    // $ANTLR start ruleTheGeom
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:294:1: ruleTheGeom : ( ( rule__TheGeom__Alternatives ) ) ;
    public final void ruleTheGeom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:298:2: ( ( ( rule__TheGeom__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:299:1: ( ( rule__TheGeom__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:299:1: ( ( rule__TheGeom__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:300:1: ( rule__TheGeom__Alternatives )
            {
             before(grammarAccess.getTheGeomAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:301:1: ( rule__TheGeom__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:301:2: rule__TheGeom__Alternatives
            {
            pushFollow(FOLLOW_rule__TheGeom__Alternatives_in_ruleTheGeom575);
            rule__TheGeom__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTheGeomAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTheGeom


    // $ANTLR start entryRuleLowLimit
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:313:1: entryRuleLowLimit : ruleLowLimit EOF ;
    public final void entryRuleLowLimit() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:314:1: ( ruleLowLimit EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:315:1: ruleLowLimit EOF
            {
             before(grammarAccess.getLowLimitRule()); 
            pushFollow(FOLLOW_ruleLowLimit_in_entryRuleLowLimit602);
            ruleLowLimit();
            _fsp--;

             after(grammarAccess.getLowLimitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLowLimit609); 

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
    // $ANTLR end entryRuleLowLimit


    // $ANTLR start ruleLowLimit
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:322:1: ruleLowLimit : ( ( rule__LowLimit__Group__0 ) ) ;
    public final void ruleLowLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:326:2: ( ( ( rule__LowLimit__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:327:1: ( ( rule__LowLimit__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:327:1: ( ( rule__LowLimit__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:328:1: ( rule__LowLimit__Group__0 )
            {
             before(grammarAccess.getLowLimitAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:329:1: ( rule__LowLimit__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:329:2: rule__LowLimit__Group__0
            {
            pushFollow(FOLLOW_rule__LowLimit__Group__0_in_ruleLowLimit635);
            rule__LowLimit__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLowLimitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLowLimit


    // $ANTLR start entryRuleHighLimit
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:341:1: entryRuleHighLimit : ruleHighLimit EOF ;
    public final void entryRuleHighLimit() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:342:1: ( ruleHighLimit EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:343:1: ruleHighLimit EOF
            {
             before(grammarAccess.getHighLimitRule()); 
            pushFollow(FOLLOW_ruleHighLimit_in_entryRuleHighLimit662);
            ruleHighLimit();
            _fsp--;

             after(grammarAccess.getHighLimitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighLimit669); 

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
    // $ANTLR end entryRuleHighLimit


    // $ANTLR start ruleHighLimit
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:350:1: ruleHighLimit : ( ( rule__HighLimit__Group__0 ) ) ;
    public final void ruleHighLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:354:2: ( ( ( rule__HighLimit__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:355:1: ( ( rule__HighLimit__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:355:1: ( ( rule__HighLimit__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:356:1: ( rule__HighLimit__Group__0 )
            {
             before(grammarAccess.getHighLimitAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:357:1: ( rule__HighLimit__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:357:2: rule__HighLimit__Group__0
            {
            pushFollow(FOLLOW_rule__HighLimit__Group__0_in_ruleHighLimit695);
            rule__HighLimit__Group__0();
            _fsp--;


            }

             after(grammarAccess.getHighLimitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleHighLimit


    // $ANTLR start entryRuleLimit
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:369:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:370:1: ( ruleLimit EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:371:1: ruleLimit EOF
            {
             before(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_ruleLimit_in_entryRuleLimit722);
            ruleLimit();
            _fsp--;

             after(grammarAccess.getLimitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimit729); 

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
    // $ANTLR end entryRuleLimit


    // $ANTLR start ruleLimit
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:378:1: ruleLimit : ( ( rule__Limit__Alternatives ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:382:2: ( ( ( rule__Limit__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:383:1: ( ( rule__Limit__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:383:1: ( ( rule__Limit__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:384:1: ( rule__Limit__Alternatives )
            {
             before(grammarAccess.getLimitAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:385:1: ( rule__Limit__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:385:2: rule__Limit__Alternatives
            {
            pushFollow(FOLLOW_rule__Limit__Alternatives_in_ruleLimit755);
            rule__Limit__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLimitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLimit


    // $ANTLR start entryRuleFL
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:397:1: entryRuleFL : ruleFL EOF ;
    public final void entryRuleFL() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:398:1: ( ruleFL EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:399:1: ruleFL EOF
            {
             before(grammarAccess.getFLRule()); 
            pushFollow(FOLLOW_ruleFL_in_entryRuleFL782);
            ruleFL();
            _fsp--;

             after(grammarAccess.getFLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFL789); 

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
    // $ANTLR end entryRuleFL


    // $ANTLR start ruleFL
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:406:1: ruleFL : ( ( rule__FL__Group__0 ) ) ;
    public final void ruleFL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:410:2: ( ( ( rule__FL__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:411:1: ( ( rule__FL__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:411:1: ( ( rule__FL__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:412:1: ( rule__FL__Group__0 )
            {
             before(grammarAccess.getFLAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:413:1: ( rule__FL__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:413:2: rule__FL__Group__0
            {
            pushFollow(FOLLOW_rule__FL__Group__0_in_ruleFL815);
            rule__FL__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFL


    // $ANTLR start entryRuleSFC
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:425:1: entryRuleSFC : ruleSFC EOF ;
    public final void entryRuleSFC() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:426:1: ( ruleSFC EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:427:1: ruleSFC EOF
            {
             before(grammarAccess.getSFCRule()); 
            pushFollow(FOLLOW_ruleSFC_in_entryRuleSFC842);
            ruleSFC();
            _fsp--;

             after(grammarAccess.getSFCRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSFC849); 

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
    // $ANTLR end entryRuleSFC


    // $ANTLR start ruleSFC
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:434:1: ruleSFC : ( ( rule__SFC__Group__0 ) ) ;
    public final void ruleSFC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:438:2: ( ( ( rule__SFC__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:439:1: ( ( rule__SFC__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:439:1: ( ( rule__SFC__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:440:1: ( rule__SFC__Group__0 )
            {
             before(grammarAccess.getSFCAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:441:1: ( rule__SFC__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:441:2: rule__SFC__Group__0
            {
            pushFollow(FOLLOW_rule__SFC__Group__0_in_ruleSFC875);
            rule__SFC__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSFCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSFC


    // $ANTLR start entryRuleGND
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:453:1: entryRuleGND : ruleGND EOF ;
    public final void entryRuleGND() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:454:1: ( ruleGND EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:455:1: ruleGND EOF
            {
             before(grammarAccess.getGNDRule()); 
            pushFollow(FOLLOW_ruleGND_in_entryRuleGND902);
            ruleGND();
            _fsp--;

             after(grammarAccess.getGNDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGND909); 

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
    // $ANTLR end entryRuleGND


    // $ANTLR start ruleGND
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:462:1: ruleGND : ( ( rule__GND__Group__0 ) ) ;
    public final void ruleGND() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:466:2: ( ( ( rule__GND__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:467:1: ( ( rule__GND__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:467:1: ( ( rule__GND__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:468:1: ( rule__GND__Group__0 )
            {
             before(grammarAccess.getGNDAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:469:1: ( rule__GND__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:469:2: rule__GND__Group__0
            {
            pushFollow(FOLLOW_rule__GND__Group__0_in_ruleGND935);
            rule__GND__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGNDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGND


    // $ANTLR start entryRuleUNL
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:481:1: entryRuleUNL : ruleUNL EOF ;
    public final void entryRuleUNL() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:482:1: ( ruleUNL EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:483:1: ruleUNL EOF
            {
             before(grammarAccess.getUNLRule()); 
            pushFollow(FOLLOW_ruleUNL_in_entryRuleUNL962);
            ruleUNL();
            _fsp--;

             after(grammarAccess.getUNLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNL969); 

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
    // $ANTLR end entryRuleUNL


    // $ANTLR start ruleUNL
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:490:1: ruleUNL : ( ( rule__UNL__Group__0 ) ) ;
    public final void ruleUNL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:494:2: ( ( ( rule__UNL__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:495:1: ( ( rule__UNL__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:495:1: ( ( rule__UNL__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:496:1: ( rule__UNL__Group__0 )
            {
             before(grammarAccess.getUNLAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:497:1: ( rule__UNL__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:497:2: rule__UNL__Group__0
            {
            pushFollow(FOLLOW_rule__UNL__Group__0_in_ruleUNL995);
            rule__UNL__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUNLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUNL


    // $ANTLR start entryRuleVAL
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:509:1: entryRuleVAL : ruleVAL EOF ;
    public final void entryRuleVAL() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:510:1: ( ruleVAL EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:511:1: ruleVAL EOF
            {
             before(grammarAccess.getVALRule()); 
            pushFollow(FOLLOW_ruleVAL_in_entryRuleVAL1022);
            ruleVAL();
            _fsp--;

             after(grammarAccess.getVALRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAL1029); 

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
    // $ANTLR end entryRuleVAL


    // $ANTLR start ruleVAL
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:518:1: ruleVAL : ( ( rule__VAL__Group__0 ) ) ;
    public final void ruleVAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:522:2: ( ( ( rule__VAL__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:523:1: ( ( rule__VAL__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:523:1: ( ( rule__VAL__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:524:1: ( rule__VAL__Group__0 )
            {
             before(grammarAccess.getVALAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:525:1: ( rule__VAL__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:525:2: rule__VAL__Group__0
            {
            pushFollow(FOLLOW_rule__VAL__Group__0_in_ruleVAL1055);
            rule__VAL__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVAL


    // $ANTLR start entryRuleV
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:537:1: entryRuleV : ruleV EOF ;
    public final void entryRuleV() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:538:1: ( ruleV EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:539:1: ruleV EOF
            {
             before(grammarAccess.getVRule()); 
            pushFollow(FOLLOW_ruleV_in_entryRuleV1082);
            ruleV();
            _fsp--;

             after(grammarAccess.getVRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleV1089); 

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
    // $ANTLR end entryRuleV


    // $ANTLR start ruleV
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:546:1: ruleV : ( ( rule__V__Group__0 ) ) ;
    public final void ruleV() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:550:2: ( ( ( rule__V__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:551:1: ( ( rule__V__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:551:1: ( ( rule__V__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:552:1: ( rule__V__Group__0 )
            {
             before(grammarAccess.getVAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:553:1: ( rule__V__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:553:2: rule__V__Group__0
            {
            pushFollow(FOLLOW_rule__V__Group__0_in_ruleV1115);
            rule__V__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleV


    // $ANTLR start entryRuleVsub
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:565:1: entryRuleVsub : ruleVsub EOF ;
    public final void entryRuleVsub() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:566:1: ( ruleVsub EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:567:1: ruleVsub EOF
            {
             before(grammarAccess.getVsubRule()); 
            pushFollow(FOLLOW_ruleVsub_in_entryRuleVsub1142);
            ruleVsub();
            _fsp--;

             after(grammarAccess.getVsubRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVsub1149); 

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
    // $ANTLR end entryRuleVsub


    // $ANTLR start ruleVsub
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:574:1: ruleVsub : ( ( rule__Vsub__Alternatives ) ) ;
    public final void ruleVsub() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:578:2: ( ( ( rule__Vsub__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:579:1: ( ( rule__Vsub__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:579:1: ( ( rule__Vsub__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:580:1: ( rule__Vsub__Alternatives )
            {
             before(grammarAccess.getVsubAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:581:1: ( rule__Vsub__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:581:2: rule__Vsub__Alternatives
            {
            pushFollow(FOLLOW_rule__Vsub__Alternatives_in_ruleVsub1175);
            rule__Vsub__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getVsubAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVsub


    // $ANTLR start entryRuleDir
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:593:1: entryRuleDir : ruleDir EOF ;
    public final void entryRuleDir() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:594:1: ( ruleDir EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:595:1: ruleDir EOF
            {
             before(grammarAccess.getDirRule()); 
            pushFollow(FOLLOW_ruleDir_in_entryRuleDir1202);
            ruleDir();
            _fsp--;

             after(grammarAccess.getDirRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDir1209); 

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
    // $ANTLR end entryRuleDir


    // $ANTLR start ruleDir
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:602:1: ruleDir : ( ( rule__Dir__Alternatives ) ) ;
    public final void ruleDir() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:606:2: ( ( ( rule__Dir__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:607:1: ( ( rule__Dir__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:607:1: ( ( rule__Dir__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:608:1: ( rule__Dir__Alternatives )
            {
             before(grammarAccess.getDirAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:609:1: ( rule__Dir__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:609:2: rule__Dir__Alternatives
            {
            pushFollow(FOLLOW_rule__Dir__Alternatives_in_ruleDir1235);
            rule__Dir__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDirAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDir


    // $ANTLR start entryRulePlus
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:621:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:622:1: ( rulePlus EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:623:1: rulePlus EOF
            {
             before(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_rulePlus_in_entryRulePlus1262);
            rulePlus();
            _fsp--;

             after(grammarAccess.getPlusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlus1269); 

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
    // $ANTLR end entryRulePlus


    // $ANTLR start rulePlus
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:630:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:634:2: ( ( ( rule__Plus__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:635:1: ( ( rule__Plus__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:635:1: ( ( rule__Plus__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:636:1: ( rule__Plus__Group__0 )
            {
             before(grammarAccess.getPlusAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:637:1: ( rule__Plus__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:637:2: rule__Plus__Group__0
            {
            pushFollow(FOLLOW_rule__Plus__Group__0_in_rulePlus1295);
            rule__Plus__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPlusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePlus


    // $ANTLR start entryRuleMinus
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:649:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:650:1: ( ruleMinus EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:651:1: ruleMinus EOF
            {
             before(grammarAccess.getMinusRule()); 
            pushFollow(FOLLOW_ruleMinus_in_entryRuleMinus1322);
            ruleMinus();
            _fsp--;

             after(grammarAccess.getMinusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinus1329); 

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
    // $ANTLR end entryRuleMinus


    // $ANTLR start ruleMinus
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:658:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:662:2: ( ( ( rule__Minus__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:663:1: ( ( rule__Minus__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:663:1: ( ( rule__Minus__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:664:1: ( rule__Minus__Group__0 )
            {
             before(grammarAccess.getMinusAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:665:1: ( rule__Minus__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:665:2: rule__Minus__Group__0
            {
            pushFollow(FOLLOW_rule__Minus__Group__0_in_ruleMinus1355);
            rule__Minus__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMinus


    // $ANTLR start entryRuleDC
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:677:1: entryRuleDC : ruleDC EOF ;
    public final void entryRuleDC() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:678:1: ( ruleDC EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:679:1: ruleDC EOF
            {
             before(grammarAccess.getDCRule()); 
            pushFollow(FOLLOW_ruleDC_in_entryRuleDC1382);
            ruleDC();
            _fsp--;

             after(grammarAccess.getDCRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDC1389); 

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
    // $ANTLR end entryRuleDC


    // $ANTLR start ruleDC
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:686:1: ruleDC : ( ( rule__DC__Group__0 ) ) ;
    public final void ruleDC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:690:2: ( ( ( rule__DC__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:691:1: ( ( rule__DC__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:691:1: ( ( rule__DC__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:692:1: ( rule__DC__Group__0 )
            {
             before(grammarAccess.getDCAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:693:1: ( rule__DC__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:693:2: rule__DC__Group__0
            {
            pushFollow(FOLLOW_rule__DC__Group__0_in_ruleDC1415);
            rule__DC__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDC


    // $ANTLR start entryRuleDP
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:705:1: entryRuleDP : ruleDP EOF ;
    public final void entryRuleDP() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:706:1: ( ruleDP EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:707:1: ruleDP EOF
            {
             before(grammarAccess.getDPRule()); 
            pushFollow(FOLLOW_ruleDP_in_entryRuleDP1442);
            ruleDP();
            _fsp--;

             after(grammarAccess.getDPRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDP1449); 

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
    // $ANTLR end entryRuleDP


    // $ANTLR start ruleDP
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:714:1: ruleDP : ( ( rule__DP__Group__0 ) ) ;
    public final void ruleDP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:718:2: ( ( ( rule__DP__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:719:1: ( ( rule__DP__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:719:1: ( ( rule__DP__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:720:1: ( rule__DP__Group__0 )
            {
             before(grammarAccess.getDPAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:721:1: ( rule__DP__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:721:2: rule__DP__Group__0
            {
            pushFollow(FOLLOW_rule__DP__Group__0_in_ruleDP1475);
            rule__DP__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDP


    // $ANTLR start entryRulePoint
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:733:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:734:1: ( rulePoint EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:735:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint1502);
            rulePoint();
            _fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint1509); 

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
    // $ANTLR end entryRulePoint


    // $ANTLR start rulePoint
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:742:1: rulePoint : ( ( rule__Point__Alternatives ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:746:2: ( ( ( rule__Point__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:747:1: ( ( rule__Point__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:747:1: ( ( rule__Point__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:748:1: ( rule__Point__Alternatives )
            {
             before(grammarAccess.getPointAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:749:1: ( rule__Point__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:749:2: rule__Point__Alternatives
            {
            pushFollow(FOLLOW_rule__Point__Alternatives_in_rulePoint1535);
            rule__Point__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPointAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePoint


    // $ANTLR start entryRulePoint1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:761:1: entryRulePoint1 : rulePoint1 EOF ;
    public final void entryRulePoint1() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:762:1: ( rulePoint1 EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:763:1: rulePoint1 EOF
            {
             before(grammarAccess.getPoint1Rule()); 
            pushFollow(FOLLOW_rulePoint1_in_entryRulePoint11562);
            rulePoint1();
            _fsp--;

             after(grammarAccess.getPoint1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint11569); 

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
    // $ANTLR end entryRulePoint1


    // $ANTLR start rulePoint1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:770:1: rulePoint1 : ( ( rule__Point1__Group__0 ) ) ;
    public final void rulePoint1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:774:2: ( ( ( rule__Point1__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:775:1: ( ( rule__Point1__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:775:1: ( ( rule__Point1__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:776:1: ( rule__Point1__Group__0 )
            {
             before(grammarAccess.getPoint1Access().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:777:1: ( rule__Point1__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:777:2: rule__Point1__Group__0
            {
            pushFollow(FOLLOW_rule__Point1__Group__0_in_rulePoint11595);
            rule__Point1__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPoint1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePoint1


    // $ANTLR start entryRulePoint2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:789:1: entryRulePoint2 : rulePoint2 EOF ;
    public final void entryRulePoint2() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:790:1: ( rulePoint2 EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:791:1: rulePoint2 EOF
            {
             before(grammarAccess.getPoint2Rule()); 
            pushFollow(FOLLOW_rulePoint2_in_entryRulePoint21622);
            rulePoint2();
            _fsp--;

             after(grammarAccess.getPoint2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint21629); 

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
    // $ANTLR end entryRulePoint2


    // $ANTLR start rulePoint2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:798:1: rulePoint2 : ( ( rule__Point2__Group__0 ) ) ;
    public final void rulePoint2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:802:2: ( ( ( rule__Point2__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:803:1: ( ( rule__Point2__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:803:1: ( ( rule__Point2__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:804:1: ( rule__Point2__Group__0 )
            {
             before(grammarAccess.getPoint2Access().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:805:1: ( rule__Point2__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:805:2: rule__Point2__Group__0
            {
            pushFollow(FOLLOW_rule__Point2__Group__0_in_rulePoint21655);
            rule__Point2__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPoint2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePoint2


    // $ANTLR start entryRulePoint3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:817:1: entryRulePoint3 : rulePoint3 EOF ;
    public final void entryRulePoint3() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:818:1: ( rulePoint3 EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:819:1: rulePoint3 EOF
            {
             before(grammarAccess.getPoint3Rule()); 
            pushFollow(FOLLOW_rulePoint3_in_entryRulePoint31682);
            rulePoint3();
            _fsp--;

             after(grammarAccess.getPoint3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint31689); 

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
    // $ANTLR end entryRulePoint3


    // $ANTLR start rulePoint3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:826:1: rulePoint3 : ( ( rule__Point3__Group__0 ) ) ;
    public final void rulePoint3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:830:2: ( ( ( rule__Point3__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:831:1: ( ( rule__Point3__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:831:1: ( ( rule__Point3__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:832:1: ( rule__Point3__Group__0 )
            {
             before(grammarAccess.getPoint3Access().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:833:1: ( rule__Point3__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:833:2: rule__Point3__Group__0
            {
            pushFollow(FOLLOW_rule__Point3__Group__0_in_rulePoint31715);
            rule__Point3__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPoint3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePoint3


    // $ANTLR start entryRulePoint4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:845:1: entryRulePoint4 : rulePoint4 EOF ;
    public final void entryRulePoint4() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:846:1: ( rulePoint4 EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:847:1: rulePoint4 EOF
            {
             before(grammarAccess.getPoint4Rule()); 
            pushFollow(FOLLOW_rulePoint4_in_entryRulePoint41742);
            rulePoint4();
            _fsp--;

             after(grammarAccess.getPoint4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint41749); 

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
    // $ANTLR end entryRulePoint4


    // $ANTLR start rulePoint4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:854:1: rulePoint4 : ( ( rule__Point4__Group__0 ) ) ;
    public final void rulePoint4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:858:2: ( ( ( rule__Point4__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:859:1: ( ( rule__Point4__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:859:1: ( ( rule__Point4__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:860:1: ( rule__Point4__Group__0 )
            {
             before(grammarAccess.getPoint4Access().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:861:1: ( rule__Point4__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:861:2: rule__Point4__Group__0
            {
            pushFollow(FOLLOW_rule__Point4__Group__0_in_rulePoint41775);
            rule__Point4__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPoint4Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePoint4


    // $ANTLR start entryRuleLongDegr
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:873:1: entryRuleLongDegr : ruleLongDegr EOF ;
    public final void entryRuleLongDegr() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:874:1: ( ruleLongDegr EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:875:1: ruleLongDegr EOF
            {
             before(grammarAccess.getLongDegrRule()); 
            pushFollow(FOLLOW_ruleLongDegr_in_entryRuleLongDegr1802);
            ruleLongDegr();
            _fsp--;

             after(grammarAccess.getLongDegrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongDegr1809); 

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
    // $ANTLR end entryRuleLongDegr


    // $ANTLR start ruleLongDegr
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:882:1: ruleLongDegr : ( ( rule__LongDegr__ValueAssignment ) ) ;
    public final void ruleLongDegr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:886:2: ( ( ( rule__LongDegr__ValueAssignment ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:887:1: ( ( rule__LongDegr__ValueAssignment ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:887:1: ( ( rule__LongDegr__ValueAssignment ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:888:1: ( rule__LongDegr__ValueAssignment )
            {
             before(grammarAccess.getLongDegrAccess().getValueAssignment()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:889:1: ( rule__LongDegr__ValueAssignment )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:889:2: rule__LongDegr__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LongDegr__ValueAssignment_in_ruleLongDegr1835);
            rule__LongDegr__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getLongDegrAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLongDegr


    // $ANTLR start entryRuleLatDegr
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:901:1: entryRuleLatDegr : ruleLatDegr EOF ;
    public final void entryRuleLatDegr() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:902:1: ( ruleLatDegr EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:903:1: ruleLatDegr EOF
            {
             before(grammarAccess.getLatDegrRule()); 
            pushFollow(FOLLOW_ruleLatDegr_in_entryRuleLatDegr1862);
            ruleLatDegr();
            _fsp--;

             after(grammarAccess.getLatDegrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLatDegr1869); 

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
    // $ANTLR end entryRuleLatDegr


    // $ANTLR start ruleLatDegr
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:910:1: ruleLatDegr : ( ( rule__LatDegr__ValueAssignment ) ) ;
    public final void ruleLatDegr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:914:2: ( ( ( rule__LatDegr__ValueAssignment ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:915:1: ( ( rule__LatDegr__ValueAssignment ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:915:1: ( ( rule__LatDegr__ValueAssignment ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:916:1: ( rule__LatDegr__ValueAssignment )
            {
             before(grammarAccess.getLatDegrAccess().getValueAssignment()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:917:1: ( rule__LatDegr__ValueAssignment )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:917:2: rule__LatDegr__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LatDegr__ValueAssignment_in_ruleLatDegr1895);
            rule__LatDegr__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getLatDegrAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLatDegr


    // $ANTLR start entryRuleMinSec
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:929:1: entryRuleMinSec : ruleMinSec EOF ;
    public final void entryRuleMinSec() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:930:1: ( ruleMinSec EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:931:1: ruleMinSec EOF
            {
             before(grammarAccess.getMinSecRule()); 
            pushFollow(FOLLOW_ruleMinSec_in_entryRuleMinSec1922);
            ruleMinSec();
            _fsp--;

             after(grammarAccess.getMinSecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinSec1929); 

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
    // $ANTLR end entryRuleMinSec


    // $ANTLR start ruleMinSec
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:938:1: ruleMinSec : ( ( rule__MinSec__Group__0 ) ) ;
    public final void ruleMinSec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:942:2: ( ( ( rule__MinSec__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:943:1: ( ( rule__MinSec__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:943:1: ( ( rule__MinSec__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:944:1: ( rule__MinSec__Group__0 )
            {
             before(grammarAccess.getMinSecAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:945:1: ( rule__MinSec__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:945:2: rule__MinSec__Group__0
            {
            pushFollow(FOLLOW_rule__MinSec__Group__0_in_ruleMinSec1955);
            rule__MinSec__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMinSecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMinSec


    // $ANTLR start entryRuleSecDec
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:957:1: entryRuleSecDec : ruleSecDec EOF ;
    public final void entryRuleSecDec() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:958:1: ( ruleSecDec EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:959:1: ruleSecDec EOF
            {
             before(grammarAccess.getSecDecRule()); 
            pushFollow(FOLLOW_ruleSecDec_in_entryRuleSecDec1982);
            ruleSecDec();
            _fsp--;

             after(grammarAccess.getSecDecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecDec1989); 

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
    // $ANTLR end entryRuleSecDec


    // $ANTLR start ruleSecDec
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:966:1: ruleSecDec : ( ( rule__SecDec__Group__0 ) ) ;
    public final void ruleSecDec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:970:2: ( ( ( rule__SecDec__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:971:1: ( ( rule__SecDec__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:971:1: ( ( rule__SecDec__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:972:1: ( rule__SecDec__Group__0 )
            {
             before(grammarAccess.getSecDecAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:973:1: ( rule__SecDec__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:973:2: rule__SecDec__Group__0
            {
            pushFollow(FOLLOW_rule__SecDec__Group__0_in_ruleSecDec2015);
            rule__SecDec__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSecDecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSecDec


    // $ANTLR start entryRuleMinDec
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:985:1: entryRuleMinDec : ruleMinDec EOF ;
    public final void entryRuleMinDec() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:986:1: ( ruleMinDec EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:987:1: ruleMinDec EOF
            {
             before(grammarAccess.getMinDecRule()); 
            pushFollow(FOLLOW_ruleMinDec_in_entryRuleMinDec2042);
            ruleMinDec();
            _fsp--;

             after(grammarAccess.getMinDecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinDec2049); 

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
    // $ANTLR end entryRuleMinDec


    // $ANTLR start ruleMinDec
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:994:1: ruleMinDec : ( ( rule__MinDec__Group__0 ) ) ;
    public final void ruleMinDec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:998:2: ( ( ( rule__MinDec__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:999:1: ( ( rule__MinDec__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:999:1: ( ( rule__MinDec__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1000:1: ( rule__MinDec__Group__0 )
            {
             before(grammarAccess.getMinDecAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1001:1: ( rule__MinDec__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1001:2: rule__MinDec__Group__0
            {
            pushFollow(FOLLOW_rule__MinDec__Group__0_in_ruleMinDec2075);
            rule__MinDec__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMinDecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMinDec


    // $ANTLR start entryRuleLongDec
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1013:1: entryRuleLongDec : ruleLongDec EOF ;
    public final void entryRuleLongDec() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1014:1: ( ruleLongDec EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1015:1: ruleLongDec EOF
            {
             before(grammarAccess.getLongDecRule()); 
            pushFollow(FOLLOW_ruleLongDec_in_entryRuleLongDec2102);
            ruleLongDec();
            _fsp--;

             after(grammarAccess.getLongDecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongDec2109); 

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
    // $ANTLR end entryRuleLongDec


    // $ANTLR start ruleLongDec
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1022:1: ruleLongDec : ( ( rule__LongDec__ValueAssignment ) ) ;
    public final void ruleLongDec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1026:2: ( ( ( rule__LongDec__ValueAssignment ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1027:1: ( ( rule__LongDec__ValueAssignment ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1027:1: ( ( rule__LongDec__ValueAssignment ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1028:1: ( rule__LongDec__ValueAssignment )
            {
             before(grammarAccess.getLongDecAccess().getValueAssignment()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1029:1: ( rule__LongDec__ValueAssignment )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1029:2: rule__LongDec__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LongDec__ValueAssignment_in_ruleLongDec2135);
            rule__LongDec__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getLongDecAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLongDec


    // $ANTLR start entryRuleLatDec
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1041:1: entryRuleLatDec : ruleLatDec EOF ;
    public final void entryRuleLatDec() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1042:1: ( ruleLatDec EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1043:1: ruleLatDec EOF
            {
             before(grammarAccess.getLatDecRule()); 
            pushFollow(FOLLOW_ruleLatDec_in_entryRuleLatDec2162);
            ruleLatDec();
            _fsp--;

             after(grammarAccess.getLatDecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLatDec2169); 

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
    // $ANTLR end entryRuleLatDec


    // $ANTLR start ruleLatDec
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1050:1: ruleLatDec : ( ( rule__LatDec__ValueAssignment ) ) ;
    public final void ruleLatDec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1054:2: ( ( ( rule__LatDec__ValueAssignment ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1055:1: ( ( rule__LatDec__ValueAssignment ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1055:1: ( ( rule__LatDec__ValueAssignment ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1056:1: ( rule__LatDec__ValueAssignment )
            {
             before(grammarAccess.getLatDecAccess().getValueAssignment()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1057:1: ( rule__LatDec__ValueAssignment )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1057:2: rule__LatDec__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LatDec__ValueAssignment_in_ruleLatDec2195);
            rule__LatDec__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getLatDecAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLatDec


    // $ANTLR start entryRuleSep
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1069:1: entryRuleSep : ruleSep EOF ;
    public final void entryRuleSep() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1070:1: ( ruleSep EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1071:1: ruleSep EOF
            {
             before(grammarAccess.getSepRule()); 
            pushFollow(FOLLOW_ruleSep_in_entryRuleSep2222);
            ruleSep();
            _fsp--;

             after(grammarAccess.getSepRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSep2229); 

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
    // $ANTLR end entryRuleSep


    // $ANTLR start ruleSep
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1078:1: ruleSep : ( ':' ) ;
    public final void ruleSep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1082:2: ( ( ':' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1083:1: ( ':' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1083:1: ( ':' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1084:1: ':'
            {
             before(grammarAccess.getSepAccess().getColonKeyword()); 
            match(input,12,FOLLOW_12_in_ruleSep2256); 
             after(grammarAccess.getSepAccess().getColonKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSep


    // $ANTLR start entryRuleDA
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1099:1: entryRuleDA : ruleDA EOF ;
    public final void entryRuleDA() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1100:1: ( ruleDA EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1101:1: ruleDA EOF
            {
             before(grammarAccess.getDARule()); 
            pushFollow(FOLLOW_ruleDA_in_entryRuleDA2284);
            ruleDA();
            _fsp--;

             after(grammarAccess.getDARule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDA2291); 

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
    // $ANTLR end entryRuleDA


    // $ANTLR start ruleDA
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1108:1: ruleDA : ( ( rule__DA__Group__0 ) ) ;
    public final void ruleDA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1112:2: ( ( ( rule__DA__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1113:1: ( ( rule__DA__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1113:1: ( ( rule__DA__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1114:1: ( rule__DA__Group__0 )
            {
             before(grammarAccess.getDAAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1115:1: ( rule__DA__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1115:2: rule__DA__Group__0
            {
            pushFollow(FOLLOW_rule__DA__Group__0_in_ruleDA2317);
            rule__DA__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDA


    // $ANTLR start entryRuleDaParams
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1127:1: entryRuleDaParams : ruleDaParams EOF ;
    public final void entryRuleDaParams() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1128:1: ( ruleDaParams EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1129:1: ruleDaParams EOF
            {
             before(grammarAccess.getDaParamsRule()); 
            pushFollow(FOLLOW_ruleDaParams_in_entryRuleDaParams2344);
            ruleDaParams();
            _fsp--;

             after(grammarAccess.getDaParamsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaParams2351); 

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
    // $ANTLR end entryRuleDaParams


    // $ANTLR start ruleDaParams
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1136:1: ruleDaParams : ( ( rule__DaParams__Alternatives ) ) ;
    public final void ruleDaParams() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1140:2: ( ( ( rule__DaParams__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1141:1: ( ( rule__DaParams__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1141:1: ( ( rule__DaParams__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1142:1: ( rule__DaParams__Alternatives )
            {
             before(grammarAccess.getDaParamsAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1143:1: ( rule__DaParams__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1143:2: rule__DaParams__Alternatives
            {
            pushFollow(FOLLOW_rule__DaParams__Alternatives_in_ruleDaParams2377);
            rule__DaParams__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDaParamsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDaParams


    // $ANTLR start entryRuleDaParams1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1155:1: entryRuleDaParams1 : ruleDaParams1 EOF ;
    public final void entryRuleDaParams1() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1156:1: ( ruleDaParams1 EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1157:1: ruleDaParams1 EOF
            {
             before(grammarAccess.getDaParams1Rule()); 
            pushFollow(FOLLOW_ruleDaParams1_in_entryRuleDaParams12404);
            ruleDaParams1();
            _fsp--;

             after(grammarAccess.getDaParams1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaParams12411); 

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
    // $ANTLR end entryRuleDaParams1


    // $ANTLR start ruleDaParams1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1164:1: ruleDaParams1 : ( ( rule__DaParams1__Group__0 ) ) ;
    public final void ruleDaParams1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1168:2: ( ( ( rule__DaParams1__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1169:1: ( ( rule__DaParams1__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1169:1: ( ( rule__DaParams1__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1170:1: ( rule__DaParams1__Group__0 )
            {
             before(grammarAccess.getDaParams1Access().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1171:1: ( rule__DaParams1__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1171:2: rule__DaParams1__Group__0
            {
            pushFollow(FOLLOW_rule__DaParams1__Group__0_in_ruleDaParams12437);
            rule__DaParams1__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDaParams1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDaParams1


    // $ANTLR start entryRuleDaParams2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1183:1: entryRuleDaParams2 : ruleDaParams2 EOF ;
    public final void entryRuleDaParams2() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1184:1: ( ruleDaParams2 EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1185:1: ruleDaParams2 EOF
            {
             before(grammarAccess.getDaParams2Rule()); 
            pushFollow(FOLLOW_ruleDaParams2_in_entryRuleDaParams22464);
            ruleDaParams2();
            _fsp--;

             after(grammarAccess.getDaParams2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaParams22471); 

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
    // $ANTLR end entryRuleDaParams2


    // $ANTLR start ruleDaParams2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1192:1: ruleDaParams2 : ( ( rule__DaParams2__Group__0 ) ) ;
    public final void ruleDaParams2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1196:2: ( ( ( rule__DaParams2__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1197:1: ( ( rule__DaParams2__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1197:1: ( ( rule__DaParams2__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1198:1: ( rule__DaParams2__Group__0 )
            {
             before(grammarAccess.getDaParams2Access().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1199:1: ( rule__DaParams2__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1199:2: rule__DaParams2__Group__0
            {
            pushFollow(FOLLOW_rule__DaParams2__Group__0_in_ruleDaParams22497);
            rule__DaParams2__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDaParams2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDaParams2


    // $ANTLR start entryRuleDB
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1211:1: entryRuleDB : ruleDB EOF ;
    public final void entryRuleDB() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1212:1: ( ruleDB EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1213:1: ruleDB EOF
            {
             before(grammarAccess.getDBRule()); 
            pushFollow(FOLLOW_ruleDB_in_entryRuleDB2524);
            ruleDB();
            _fsp--;

             after(grammarAccess.getDBRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDB2531); 

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
    // $ANTLR end entryRuleDB


    // $ANTLR start ruleDB
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1220:1: ruleDB : ( ( rule__DB__Group__0 ) ) ;
    public final void ruleDB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1224:2: ( ( ( rule__DB__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1225:1: ( ( rule__DB__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1225:1: ( ( rule__DB__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1226:1: ( rule__DB__Group__0 )
            {
             before(grammarAccess.getDBAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1227:1: ( rule__DB__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1227:2: rule__DB__Group__0
            {
            pushFollow(FOLLOW_rule__DB__Group__0_in_ruleDB2557);
            rule__DB__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDB


    // $ANTLR start entryRuleAT
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1239:1: entryRuleAT : ruleAT EOF ;
    public final void entryRuleAT() throws RecognitionException {
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1240:1: ( ruleAT EOF )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1241:1: ruleAT EOF
            {
             before(grammarAccess.getATRule()); 
            pushFollow(FOLLOW_ruleAT_in_entryRuleAT2584);
            ruleAT();
            _fsp--;

             after(grammarAccess.getATRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAT2591); 

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
    // $ANTLR end entryRuleAT


    // $ANTLR start ruleAT
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1248:1: ruleAT : ( ( rule__AT__Group__0 ) ) ;
    public final void ruleAT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1252:2: ( ( ( rule__AT__Group__0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1253:1: ( ( rule__AT__Group__0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1253:1: ( ( rule__AT__Group__0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1254:1: ( rule__AT__Group__0 )
            {
             before(grammarAccess.getATAccess().getGroup()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1255:1: ( rule__AT__Group__0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1255:2: rule__AT__Group__0
            {
            pushFollow(FOLLOW_rule__AT__Group__0_in_ruleAT2617);
            rule__AT__Group__0();
            _fsp--;


            }

             after(grammarAccess.getATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAT


    // $ANTLR start ruleClassType
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1268:1: ruleClassType : ( ( rule__ClassType__Alternatives ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1272:1: ( ( ( rule__ClassType__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1273:1: ( ( rule__ClassType__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1273:1: ( ( rule__ClassType__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1274:1: ( rule__ClassType__Alternatives )
            {
             before(grammarAccess.getClassTypeAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1275:1: ( rule__ClassType__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1275:2: rule__ClassType__Alternatives
            {
            pushFollow(FOLLOW_rule__ClassType__Alternatives_in_ruleClassType2654);
            rule__ClassType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleClassType


    // $ANTLR start ruleUnits
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1287:1: ruleUnits : ( ( rule__Units__Alternatives ) ) ;
    public final void ruleUnits() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1291:1: ( ( ( rule__Units__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1292:1: ( ( rule__Units__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1292:1: ( ( rule__Units__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1293:1: ( rule__Units__Alternatives )
            {
             before(grammarAccess.getUnitsAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1294:1: ( rule__Units__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1294:2: rule__Units__Alternatives
            {
            pushFollow(FOLLOW_rule__Units__Alternatives_in_ruleUnits2690);
            rule__Units__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getUnitsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnits


    // $ANTLR start ruleWE
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1306:1: ruleWE : ( ( rule__WE__Alternatives ) ) ;
    public final void ruleWE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1310:1: ( ( ( rule__WE__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1311:1: ( ( rule__WE__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1311:1: ( ( rule__WE__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1312:1: ( rule__WE__Alternatives )
            {
             before(grammarAccess.getWEAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1313:1: ( rule__WE__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1313:2: rule__WE__Alternatives
            {
            pushFollow(FOLLOW_rule__WE__Alternatives_in_ruleWE2726);
            rule__WE__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getWEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleWE


    // $ANTLR start ruleNS
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1325:1: ruleNS : ( ( rule__NS__Alternatives ) ) ;
    public final void ruleNS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1329:1: ( ( ( rule__NS__Alternatives ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1330:1: ( ( rule__NS__Alternatives ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1330:1: ( ( rule__NS__Alternatives ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1331:1: ( rule__NS__Alternatives )
            {
             before(grammarAccess.getNSAccess().getAlternatives()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1332:1: ( rule__NS__Alternatives )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1332:2: rule__NS__Alternatives
            {
            pushFollow(FOLLOW_rule__NS__Alternatives_in_ruleNS2762);
            rule__NS__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNS


    // $ANTLR start rule__Limites__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1343:1: rule__Limites__Alternatives : ( ( ( rule__Limites__Group_0__0 ) ) | ( ( rule__Limites__Group_1__0 ) ) );
    public final void rule__Limites__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1347:1: ( ( ( rule__Limites__Group_0__0 ) ) | ( ( rule__Limites__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==46) ) {
                alt2=1;
            }
            else if ( (LA2_0==47) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1343:1: rule__Limites__Alternatives : ( ( ( rule__Limites__Group_0__0 ) ) | ( ( rule__Limites__Group_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1348:1: ( ( rule__Limites__Group_0__0 ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1348:1: ( ( rule__Limites__Group_0__0 ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1349:1: ( rule__Limites__Group_0__0 )
                    {
                     before(grammarAccess.getLimitesAccess().getGroup_0()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1350:1: ( rule__Limites__Group_0__0 )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1350:2: rule__Limites__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Limites__Group_0__0_in_rule__Limites__Alternatives2797);
                    rule__Limites__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getLimitesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1354:6: ( ( rule__Limites__Group_1__0 ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1354:6: ( ( rule__Limites__Group_1__0 ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1355:1: ( rule__Limites__Group_1__0 )
                    {
                     before(grammarAccess.getLimitesAccess().getGroup_1()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1356:1: ( rule__Limites__Group_1__0 )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1356:2: rule__Limites__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Limites__Group_1__0_in_rule__Limites__Alternatives2815);
                    rule__Limites__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getLimitesAccess().getGroup_1()); 

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
    // $ANTLR end rule__Limites__Alternatives


    // $ANTLR start rule__TheGeom__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1365:1: rule__TheGeom__Alternatives : ( ( ruleV ) | ( ruleDP ) | ( ruleDA ) | ( ruleDB ) | ( ruleDC ) );
    public final void rule__TheGeom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1369:1: ( ( ruleV ) | ( ruleDP ) | ( ruleDA ) | ( ruleDB ) | ( ruleDC ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt3=1;
                }
                break;
            case 58:
                {
                alt3=2;
                }
                break;
            case 59:
                {
                alt3=3;
                }
                break;
            case 60:
                {
                alt3=4;
                }
                break;
            case 57:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1365:1: rule__TheGeom__Alternatives : ( ( ruleV ) | ( ruleDP ) | ( ruleDA ) | ( ruleDB ) | ( ruleDC ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1370:1: ( ruleV )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1370:1: ( ruleV )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1371:1: ruleV
                    {
                     before(grammarAccess.getTheGeomAccess().getVParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleV_in_rule__TheGeom__Alternatives2848);
                    ruleV();
                    _fsp--;

                     after(grammarAccess.getTheGeomAccess().getVParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1376:6: ( ruleDP )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1376:6: ( ruleDP )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1377:1: ruleDP
                    {
                     before(grammarAccess.getTheGeomAccess().getDPParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDP_in_rule__TheGeom__Alternatives2865);
                    ruleDP();
                    _fsp--;

                     after(grammarAccess.getTheGeomAccess().getDPParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1382:6: ( ruleDA )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1382:6: ( ruleDA )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1383:1: ruleDA
                    {
                     before(grammarAccess.getTheGeomAccess().getDAParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDA_in_rule__TheGeom__Alternatives2882);
                    ruleDA();
                    _fsp--;

                     after(grammarAccess.getTheGeomAccess().getDAParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1388:6: ( ruleDB )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1388:6: ( ruleDB )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1389:1: ruleDB
                    {
                     before(grammarAccess.getTheGeomAccess().getDBParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDB_in_rule__TheGeom__Alternatives2899);
                    ruleDB();
                    _fsp--;

                     after(grammarAccess.getTheGeomAccess().getDBParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1394:6: ( ruleDC )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1394:6: ( ruleDC )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1395:1: ruleDC
                    {
                     before(grammarAccess.getTheGeomAccess().getDCParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDC_in_rule__TheGeom__Alternatives2916);
                    ruleDC();
                    _fsp--;

                     after(grammarAccess.getTheGeomAccess().getDCParserRuleCall_4()); 

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
    // $ANTLR end rule__TheGeom__Alternatives


    // $ANTLR start rule__Limit__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1405:1: rule__Limit__Alternatives : ( ( ruleFL ) | ( ruleSFC ) | ( ruleGND ) | ( ruleUNL ) | ( ruleVAL ) );
    public final void rule__Limit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1409:1: ( ( ruleFL ) | ( ruleSFC ) | ( ruleGND ) | ( ruleUNL ) | ( ruleVAL ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt4=1;
                }
                break;
            case 49:
                {
                alt4=2;
                }
                break;
            case 50:
                {
                alt4=3;
                }
                break;
            case 51:
                {
                alt4=4;
                }
                break;
            case RULE_INT:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1405:1: rule__Limit__Alternatives : ( ( ruleFL ) | ( ruleSFC ) | ( ruleGND ) | ( ruleUNL ) | ( ruleVAL ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1410:1: ( ruleFL )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1410:1: ( ruleFL )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1411:1: ruleFL
                    {
                     before(grammarAccess.getLimitAccess().getFLParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFL_in_rule__Limit__Alternatives2948);
                    ruleFL();
                    _fsp--;

                     after(grammarAccess.getLimitAccess().getFLParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1416:6: ( ruleSFC )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1416:6: ( ruleSFC )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1417:1: ruleSFC
                    {
                     before(grammarAccess.getLimitAccess().getSFCParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSFC_in_rule__Limit__Alternatives2965);
                    ruleSFC();
                    _fsp--;

                     after(grammarAccess.getLimitAccess().getSFCParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1422:6: ( ruleGND )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1422:6: ( ruleGND )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1423:1: ruleGND
                    {
                     before(grammarAccess.getLimitAccess().getGNDParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGND_in_rule__Limit__Alternatives2982);
                    ruleGND();
                    _fsp--;

                     after(grammarAccess.getLimitAccess().getGNDParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1428:6: ( ruleUNL )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1428:6: ( ruleUNL )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1429:1: ruleUNL
                    {
                     before(grammarAccess.getLimitAccess().getUNLParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUNL_in_rule__Limit__Alternatives2999);
                    ruleUNL();
                    _fsp--;

                     after(grammarAccess.getLimitAccess().getUNLParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1434:6: ( ruleVAL )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1434:6: ( ruleVAL )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1435:1: ruleVAL
                    {
                     before(grammarAccess.getLimitAccess().getVALParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleVAL_in_rule__Limit__Alternatives3016);
                    ruleVAL();
                    _fsp--;

                     after(grammarAccess.getLimitAccess().getVALParserRuleCall_4()); 

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
    // $ANTLR end rule__Limit__Alternatives


    // $ANTLR start rule__Vsub__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1445:1: rule__Vsub__Alternatives : ( ( ( rule__Vsub__Group_0__0 ) ) | ( ( rule__Vsub__Group_1__0 ) ) );
    public final void rule__Vsub__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1449:1: ( ( ( rule__Vsub__Group_0__0 ) ) | ( ( rule__Vsub__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==53) ) {
                alt5=1;
            }
            else if ( (LA5_0==54) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1445:1: rule__Vsub__Alternatives : ( ( ( rule__Vsub__Group_0__0 ) ) | ( ( rule__Vsub__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1450:1: ( ( rule__Vsub__Group_0__0 ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1450:1: ( ( rule__Vsub__Group_0__0 ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1451:1: ( rule__Vsub__Group_0__0 )
                    {
                     before(grammarAccess.getVsubAccess().getGroup_0()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1452:1: ( rule__Vsub__Group_0__0 )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1452:2: rule__Vsub__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Vsub__Group_0__0_in_rule__Vsub__Alternatives3048);
                    rule__Vsub__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVsubAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1456:6: ( ( rule__Vsub__Group_1__0 ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1456:6: ( ( rule__Vsub__Group_1__0 ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1457:1: ( rule__Vsub__Group_1__0 )
                    {
                     before(grammarAccess.getVsubAccess().getGroup_1()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1458:1: ( rule__Vsub__Group_1__0 )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1458:2: rule__Vsub__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Vsub__Group_1__0_in_rule__Vsub__Alternatives3066);
                    rule__Vsub__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVsubAccess().getGroup_1()); 

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
    // $ANTLR end rule__Vsub__Alternatives


    // $ANTLR start rule__Dir__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1467:1: rule__Dir__Alternatives : ( ( rulePlus ) | ( ruleMinus ) );
    public final void rule__Dir__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1471:1: ( ( rulePlus ) | ( ruleMinus ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==55) ) {
                alt6=1;
            }
            else if ( (LA6_0==56) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1467:1: rule__Dir__Alternatives : ( ( rulePlus ) | ( ruleMinus ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1472:1: ( rulePlus )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1472:1: ( rulePlus )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1473:1: rulePlus
                    {
                     before(grammarAccess.getDirAccess().getPlusParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePlus_in_rule__Dir__Alternatives3099);
                    rulePlus();
                    _fsp--;

                     after(grammarAccess.getDirAccess().getPlusParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1478:6: ( ruleMinus )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1478:6: ( ruleMinus )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1479:1: ruleMinus
                    {
                     before(grammarAccess.getDirAccess().getMinusParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMinus_in_rule__Dir__Alternatives3116);
                    ruleMinus();
                    _fsp--;

                     after(grammarAccess.getDirAccess().getMinusParserRuleCall_1()); 

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
    // $ANTLR end rule__Dir__Alternatives


    // $ANTLR start rule__Point__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1489:1: rule__Point__Alternatives : ( ( rulePoint1 ) | ( rulePoint2 ) | ( rulePoint3 ) | ( rulePoint4 ) );
    public final void rule__Point__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1493:1: ( ( rulePoint1 ) | ( rulePoint2 ) | ( rulePoint3 ) | ( rulePoint4 ) )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==12) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==RULE_INT) ) {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==12) ) {
                            int LA7_6 = input.LA(5);

                            if ( (LA7_6==RULE_INT) ) {
                                alt7=1;
                            }
                            else if ( (LA7_6==RULE_REAL) ) {
                                alt7=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1489:1: rule__Point__Alternatives : ( ( rulePoint1 ) | ( rulePoint2 ) | ( rulePoint3 ) | ( rulePoint4 ) );", 7, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1489:1: rule__Point__Alternatives : ( ( rulePoint1 ) | ( rulePoint2 ) | ( rulePoint3 ) | ( rulePoint4 ) );", 7, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA7_3==RULE_REAL) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1489:1: rule__Point__Alternatives : ( ( rulePoint1 ) | ( rulePoint2 ) | ( rulePoint3 ) | ( rulePoint4 ) );", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1489:1: rule__Point__Alternatives : ( ( rulePoint1 ) | ( rulePoint2 ) | ( rulePoint3 ) | ( rulePoint4 ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_REAL) ) {
                alt7=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1489:1: rule__Point__Alternatives : ( ( rulePoint1 ) | ( rulePoint2 ) | ( rulePoint3 ) | ( rulePoint4 ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1494:1: ( rulePoint1 )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1494:1: ( rulePoint1 )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1495:1: rulePoint1
                    {
                     before(grammarAccess.getPointAccess().getPoint1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePoint1_in_rule__Point__Alternatives3148);
                    rulePoint1();
                    _fsp--;

                     after(grammarAccess.getPointAccess().getPoint1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1500:6: ( rulePoint2 )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1500:6: ( rulePoint2 )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1501:1: rulePoint2
                    {
                     before(grammarAccess.getPointAccess().getPoint2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePoint2_in_rule__Point__Alternatives3165);
                    rulePoint2();
                    _fsp--;

                     after(grammarAccess.getPointAccess().getPoint2ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1506:6: ( rulePoint3 )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1506:6: ( rulePoint3 )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1507:1: rulePoint3
                    {
                     before(grammarAccess.getPointAccess().getPoint3ParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePoint3_in_rule__Point__Alternatives3182);
                    rulePoint3();
                    _fsp--;

                     after(grammarAccess.getPointAccess().getPoint3ParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1512:6: ( rulePoint4 )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1512:6: ( rulePoint4 )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1513:1: rulePoint4
                    {
                     before(grammarAccess.getPointAccess().getPoint4ParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePoint4_in_rule__Point__Alternatives3199);
                    rulePoint4();
                    _fsp--;

                     after(grammarAccess.getPointAccess().getPoint4ParserRuleCall_3()); 

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
    // $ANTLR end rule__Point__Alternatives


    // $ANTLR start rule__DaParams__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1523:1: rule__DaParams__Alternatives : ( ( ruleDaParams1 ) | ( ruleDaParams2 ) );
    public final void rule__DaParams__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1527:1: ( ( ruleDaParams1 ) | ( ruleDaParams2 ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_REAL) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1523:1: rule__DaParams__Alternatives : ( ( ruleDaParams1 ) | ( ruleDaParams2 ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1528:1: ( ruleDaParams1 )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1528:1: ( ruleDaParams1 )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1529:1: ruleDaParams1
                    {
                     before(grammarAccess.getDaParamsAccess().getDaParams1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDaParams1_in_rule__DaParams__Alternatives3231);
                    ruleDaParams1();
                    _fsp--;

                     after(grammarAccess.getDaParamsAccess().getDaParams1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1534:6: ( ruleDaParams2 )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1534:6: ( ruleDaParams2 )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1535:1: ruleDaParams2
                    {
                     before(grammarAccess.getDaParamsAccess().getDaParams2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDaParams2_in_rule__DaParams__Alternatives3248);
                    ruleDaParams2();
                    _fsp--;

                     after(grammarAccess.getDaParamsAccess().getDaParams2ParserRuleCall_1()); 

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
    // $ANTLR end rule__DaParams__Alternatives


    // $ANTLR start rule__ClassType__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1545:1: rule__ClassType__Alternatives : ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) | ( ( 'Q' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'P' ) ) | ( ( 'GP' ) ) | ( ( 'TMZ' ) ) | ( ( 'CTR' ) ) | ( ( 'Restricted' ) ) | ( ( 'UKN' ) ) );
    public final void rule__ClassType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1549:1: ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) | ( ( 'Q' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'P' ) ) | ( ( 'GP' ) ) | ( ( 'TMZ' ) ) | ( ( 'CTR' ) ) | ( ( 'Restricted' ) ) | ( ( 'UKN' ) ) )
            int alt9=16;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            case 16:
                {
                alt9=4;
                }
                break;
            case 17:
                {
                alt9=5;
                }
                break;
            case 18:
                {
                alt9=6;
                }
                break;
            case 19:
                {
                alt9=7;
                }
                break;
            case 20:
                {
                alt9=8;
                }
                break;
            case 21:
                {
                alt9=9;
                }
                break;
            case 22:
                {
                alt9=10;
                }
                break;
            case 23:
                {
                alt9=11;
                }
                break;
            case 24:
                {
                alt9=12;
                }
                break;
            case 25:
                {
                alt9=13;
                }
                break;
            case 26:
                {
                alt9=14;
                }
                break;
            case 27:
                {
                alt9=15;
                }
                break;
            case 28:
                {
                alt9=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1545:1: rule__ClassType__Alternatives : ( ( ( 'A' ) ) | ( ( 'B' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'E' ) ) | ( ( 'F' ) ) | ( ( 'G' ) ) | ( ( 'Q' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) | ( ( 'P' ) ) | ( ( 'GP' ) ) | ( ( 'TMZ' ) ) | ( ( 'CTR' ) ) | ( ( 'Restricted' ) ) | ( ( 'UKN' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1550:1: ( ( 'A' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1550:1: ( ( 'A' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1551:1: ( 'A' )
                    {
                     before(grammarAccess.getClassTypeAccess().getAEnumLiteralDeclaration_0()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1552:1: ( 'A' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1552:3: 'A'
                    {
                    match(input,13,FOLLOW_13_in_rule__ClassType__Alternatives3281); 

                    }

                     after(grammarAccess.getClassTypeAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1557:6: ( ( 'B' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1557:6: ( ( 'B' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1558:1: ( 'B' )
                    {
                     before(grammarAccess.getClassTypeAccess().getBEnumLiteralDeclaration_1()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1559:1: ( 'B' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1559:3: 'B'
                    {
                    match(input,14,FOLLOW_14_in_rule__ClassType__Alternatives3302); 

                    }

                     after(grammarAccess.getClassTypeAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1564:6: ( ( 'C' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1564:6: ( ( 'C' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1565:1: ( 'C' )
                    {
                     before(grammarAccess.getClassTypeAccess().getCEnumLiteralDeclaration_2()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1566:1: ( 'C' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1566:3: 'C'
                    {
                    match(input,15,FOLLOW_15_in_rule__ClassType__Alternatives3323); 

                    }

                     after(grammarAccess.getClassTypeAccess().getCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1571:6: ( ( 'D' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1571:6: ( ( 'D' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1572:1: ( 'D' )
                    {
                     before(grammarAccess.getClassTypeAccess().getDEnumLiteralDeclaration_3()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1573:1: ( 'D' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1573:3: 'D'
                    {
                    match(input,16,FOLLOW_16_in_rule__ClassType__Alternatives3344); 

                    }

                     after(grammarAccess.getClassTypeAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1578:6: ( ( 'E' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1578:6: ( ( 'E' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1579:1: ( 'E' )
                    {
                     before(grammarAccess.getClassTypeAccess().getEEnumLiteralDeclaration_4()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1580:1: ( 'E' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1580:3: 'E'
                    {
                    match(input,17,FOLLOW_17_in_rule__ClassType__Alternatives3365); 

                    }

                     after(grammarAccess.getClassTypeAccess().getEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1585:6: ( ( 'F' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1585:6: ( ( 'F' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1586:1: ( 'F' )
                    {
                     before(grammarAccess.getClassTypeAccess().getFEnumLiteralDeclaration_5()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1587:1: ( 'F' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1587:3: 'F'
                    {
                    match(input,18,FOLLOW_18_in_rule__ClassType__Alternatives3386); 

                    }

                     after(grammarAccess.getClassTypeAccess().getFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1592:6: ( ( 'G' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1592:6: ( ( 'G' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1593:1: ( 'G' )
                    {
                     before(grammarAccess.getClassTypeAccess().getGEnumLiteralDeclaration_6()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1594:1: ( 'G' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1594:3: 'G'
                    {
                    match(input,19,FOLLOW_19_in_rule__ClassType__Alternatives3407); 

                    }

                     after(grammarAccess.getClassTypeAccess().getGEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1599:6: ( ( 'Q' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1599:6: ( ( 'Q' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1600:1: ( 'Q' )
                    {
                     before(grammarAccess.getClassTypeAccess().getQEnumLiteralDeclaration_7()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1601:1: ( 'Q' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1601:3: 'Q'
                    {
                    match(input,20,FOLLOW_20_in_rule__ClassType__Alternatives3428); 

                    }

                     after(grammarAccess.getClassTypeAccess().getQEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1606:6: ( ( 'R' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1606:6: ( ( 'R' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1607:1: ( 'R' )
                    {
                     before(grammarAccess.getClassTypeAccess().getREnumLiteralDeclaration_8()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1608:1: ( 'R' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1608:3: 'R'
                    {
                    match(input,21,FOLLOW_21_in_rule__ClassType__Alternatives3449); 

                    }

                     after(grammarAccess.getClassTypeAccess().getREnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1613:6: ( ( 'W' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1613:6: ( ( 'W' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1614:1: ( 'W' )
                    {
                     before(grammarAccess.getClassTypeAccess().getWEnumLiteralDeclaration_9()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1615:1: ( 'W' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1615:3: 'W'
                    {
                    match(input,22,FOLLOW_22_in_rule__ClassType__Alternatives3470); 

                    }

                     after(grammarAccess.getClassTypeAccess().getWEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1620:6: ( ( 'P' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1620:6: ( ( 'P' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1621:1: ( 'P' )
                    {
                     before(grammarAccess.getClassTypeAccess().getPEnumLiteralDeclaration_10()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1622:1: ( 'P' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1622:3: 'P'
                    {
                    match(input,23,FOLLOW_23_in_rule__ClassType__Alternatives3491); 

                    }

                     after(grammarAccess.getClassTypeAccess().getPEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1627:6: ( ( 'GP' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1627:6: ( ( 'GP' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1628:1: ( 'GP' )
                    {
                     before(grammarAccess.getClassTypeAccess().getGPEnumLiteralDeclaration_11()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1629:1: ( 'GP' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1629:3: 'GP'
                    {
                    match(input,24,FOLLOW_24_in_rule__ClassType__Alternatives3512); 

                    }

                     after(grammarAccess.getClassTypeAccess().getGPEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1634:6: ( ( 'TMZ' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1634:6: ( ( 'TMZ' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1635:1: ( 'TMZ' )
                    {
                     before(grammarAccess.getClassTypeAccess().getTMZEnumLiteralDeclaration_12()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1636:1: ( 'TMZ' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1636:3: 'TMZ'
                    {
                    match(input,25,FOLLOW_25_in_rule__ClassType__Alternatives3533); 

                    }

                     after(grammarAccess.getClassTypeAccess().getTMZEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1641:6: ( ( 'CTR' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1641:6: ( ( 'CTR' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1642:1: ( 'CTR' )
                    {
                     before(grammarAccess.getClassTypeAccess().getCTREnumLiteralDeclaration_13()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1643:1: ( 'CTR' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1643:3: 'CTR'
                    {
                    match(input,26,FOLLOW_26_in_rule__ClassType__Alternatives3554); 

                    }

                     after(grammarAccess.getClassTypeAccess().getCTREnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1648:6: ( ( 'Restricted' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1648:6: ( ( 'Restricted' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1649:1: ( 'Restricted' )
                    {
                     before(grammarAccess.getClassTypeAccess().getRestrictedEnumLiteralDeclaration_14()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1650:1: ( 'Restricted' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1650:3: 'Restricted'
                    {
                    match(input,27,FOLLOW_27_in_rule__ClassType__Alternatives3575); 

                    }

                     after(grammarAccess.getClassTypeAccess().getRestrictedEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1655:6: ( ( 'UKN' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1655:6: ( ( 'UKN' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1656:1: ( 'UKN' )
                    {
                     before(grammarAccess.getClassTypeAccess().getUKNEnumLiteralDeclaration_15()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1657:1: ( 'UKN' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1657:3: 'UKN'
                    {
                    match(input,28,FOLLOW_28_in_rule__ClassType__Alternatives3596); 

                    }

                     after(grammarAccess.getClassTypeAccess().getUKNEnumLiteralDeclaration_15()); 

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
    // $ANTLR end rule__ClassType__Alternatives


    // $ANTLR start rule__Units__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1667:1: rule__Units__Alternatives : ( ( ( 'ft' ) ) | ( ( 'm' ) ) | ( ( 'MSL' ) ) | ( ( 'm MSL' ) ) | ( ( 'ft MSL' ) ) | ( ( 'AGL' ) ) | ( ( 'm AGL' ) ) | ( ( 'ft AGL' ) ) | ( ( 'AMSL' ) ) | ( ( 'm AMSL' ) ) );
    public final void rule__Units__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1671:1: ( ( ( 'ft' ) ) | ( ( 'm' ) ) | ( ( 'MSL' ) ) | ( ( 'm MSL' ) ) | ( ( 'ft MSL' ) ) | ( ( 'AGL' ) ) | ( ( 'm AGL' ) ) | ( ( 'ft AGL' ) ) | ( ( 'AMSL' ) ) | ( ( 'm AMSL' ) ) )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            case 32:
                {
                alt10=4;
                }
                break;
            case 33:
                {
                alt10=5;
                }
                break;
            case 34:
                {
                alt10=6;
                }
                break;
            case 35:
                {
                alt10=7;
                }
                break;
            case 36:
                {
                alt10=8;
                }
                break;
            case 37:
                {
                alt10=9;
                }
                break;
            case 38:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1667:1: rule__Units__Alternatives : ( ( ( 'ft' ) ) | ( ( 'm' ) ) | ( ( 'MSL' ) ) | ( ( 'm MSL' ) ) | ( ( 'ft MSL' ) ) | ( ( 'AGL' ) ) | ( ( 'm AGL' ) ) | ( ( 'ft AGL' ) ) | ( ( 'AMSL' ) ) | ( ( 'm AMSL' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1672:1: ( ( 'ft' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1672:1: ( ( 'ft' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1673:1: ( 'ft' )
                    {
                     before(grammarAccess.getUnitsAccess().getFeedEnumLiteralDeclaration_0()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1674:1: ( 'ft' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1674:3: 'ft'
                    {
                    match(input,29,FOLLOW_29_in_rule__Units__Alternatives3632); 

                    }

                     after(grammarAccess.getUnitsAccess().getFeedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1679:6: ( ( 'm' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1679:6: ( ( 'm' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1680:1: ( 'm' )
                    {
                     before(grammarAccess.getUnitsAccess().getMeterEnumLiteralDeclaration_1()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1681:1: ( 'm' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1681:3: 'm'
                    {
                    match(input,30,FOLLOW_30_in_rule__Units__Alternatives3653); 

                    }

                     after(grammarAccess.getUnitsAccess().getMeterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1686:6: ( ( 'MSL' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1686:6: ( ( 'MSL' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1687:1: ( 'MSL' )
                    {
                     before(grammarAccess.getUnitsAccess().getMslEnumLiteralDeclaration_2()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1688:1: ( 'MSL' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1688:3: 'MSL'
                    {
                    match(input,31,FOLLOW_31_in_rule__Units__Alternatives3674); 

                    }

                     after(grammarAccess.getUnitsAccess().getMslEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1693:6: ( ( 'm MSL' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1693:6: ( ( 'm MSL' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1694:1: ( 'm MSL' )
                    {
                     before(grammarAccess.getUnitsAccess().getM_mslEnumLiteralDeclaration_3()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1695:1: ( 'm MSL' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1695:3: 'm MSL'
                    {
                    match(input,32,FOLLOW_32_in_rule__Units__Alternatives3695); 

                    }

                     after(grammarAccess.getUnitsAccess().getM_mslEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1700:6: ( ( 'ft MSL' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1700:6: ( ( 'ft MSL' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1701:1: ( 'ft MSL' )
                    {
                     before(grammarAccess.getUnitsAccess().getFt_mslEnumLiteralDeclaration_4()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1702:1: ( 'ft MSL' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1702:3: 'ft MSL'
                    {
                    match(input,33,FOLLOW_33_in_rule__Units__Alternatives3716); 

                    }

                     after(grammarAccess.getUnitsAccess().getFt_mslEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1707:6: ( ( 'AGL' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1707:6: ( ( 'AGL' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1708:1: ( 'AGL' )
                    {
                     before(grammarAccess.getUnitsAccess().getAglEnumLiteralDeclaration_5()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1709:1: ( 'AGL' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1709:3: 'AGL'
                    {
                    match(input,34,FOLLOW_34_in_rule__Units__Alternatives3737); 

                    }

                     after(grammarAccess.getUnitsAccess().getAglEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1714:6: ( ( 'm AGL' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1714:6: ( ( 'm AGL' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1715:1: ( 'm AGL' )
                    {
                     before(grammarAccess.getUnitsAccess().getM_aglEnumLiteralDeclaration_6()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1716:1: ( 'm AGL' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1716:3: 'm AGL'
                    {
                    match(input,35,FOLLOW_35_in_rule__Units__Alternatives3758); 

                    }

                     after(grammarAccess.getUnitsAccess().getM_aglEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1721:6: ( ( 'ft AGL' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1721:6: ( ( 'ft AGL' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1722:1: ( 'ft AGL' )
                    {
                     before(grammarAccess.getUnitsAccess().getFt_AGLEnumLiteralDeclaration_7()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1723:1: ( 'ft AGL' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1723:3: 'ft AGL'
                    {
                    match(input,36,FOLLOW_36_in_rule__Units__Alternatives3779); 

                    }

                     after(grammarAccess.getUnitsAccess().getFt_AGLEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1728:6: ( ( 'AMSL' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1728:6: ( ( 'AMSL' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1729:1: ( 'AMSL' )
                    {
                     before(grammarAccess.getUnitsAccess().getAMSLEnumLiteralDeclaration_8()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1730:1: ( 'AMSL' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1730:3: 'AMSL'
                    {
                    match(input,37,FOLLOW_37_in_rule__Units__Alternatives3800); 

                    }

                     after(grammarAccess.getUnitsAccess().getAMSLEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1735:6: ( ( 'm AMSL' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1735:6: ( ( 'm AMSL' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1736:1: ( 'm AMSL' )
                    {
                     before(grammarAccess.getUnitsAccess().getM_AMSLEnumLiteralDeclaration_9()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1737:1: ( 'm AMSL' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1737:3: 'm AMSL'
                    {
                    match(input,38,FOLLOW_38_in_rule__Units__Alternatives3821); 

                    }

                     after(grammarAccess.getUnitsAccess().getM_AMSLEnumLiteralDeclaration_9()); 

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
    // $ANTLR end rule__Units__Alternatives


    // $ANTLR start rule__WE__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1747:1: rule__WE__Alternatives : ( ( ( 'W' ) ) | ( ( 'E' ) ) );
    public final void rule__WE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1751:1: ( ( ( 'W' ) ) | ( ( 'E' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1747:1: rule__WE__Alternatives : ( ( ( 'W' ) ) | ( ( 'E' ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1752:1: ( ( 'W' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1752:1: ( ( 'W' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1753:1: ( 'W' )
                    {
                     before(grammarAccess.getWEAccess().getWEnumLiteralDeclaration_0()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1754:1: ( 'W' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1754:3: 'W'
                    {
                    match(input,22,FOLLOW_22_in_rule__WE__Alternatives3857); 

                    }

                     after(grammarAccess.getWEAccess().getWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1759:6: ( ( 'E' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1759:6: ( ( 'E' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1760:1: ( 'E' )
                    {
                     before(grammarAccess.getWEAccess().getEEnumLiteralDeclaration_1()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1761:1: ( 'E' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1761:3: 'E'
                    {
                    match(input,17,FOLLOW_17_in_rule__WE__Alternatives3878); 

                    }

                     after(grammarAccess.getWEAccess().getEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__WE__Alternatives


    // $ANTLR start rule__NS__Alternatives
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1771:1: rule__NS__Alternatives : ( ( ( 'N' ) ) | ( ( 'S' ) ) );
    public final void rule__NS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1775:1: ( ( ( 'N' ) ) | ( ( 'S' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            else if ( (LA12_0==40) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1771:1: rule__NS__Alternatives : ( ( ( 'N' ) ) | ( ( 'S' ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1776:1: ( ( 'N' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1776:1: ( ( 'N' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1777:1: ( 'N' )
                    {
                     before(grammarAccess.getNSAccess().getNEnumLiteralDeclaration_0()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1778:1: ( 'N' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1778:3: 'N'
                    {
                    match(input,39,FOLLOW_39_in_rule__NS__Alternatives3914); 

                    }

                     after(grammarAccess.getNSAccess().getNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1783:6: ( ( 'S' ) )
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1783:6: ( ( 'S' ) )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1784:1: ( 'S' )
                    {
                     before(grammarAccess.getNSAccess().getSEnumLiteralDeclaration_1()); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1785:1: ( 'S' )
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1785:3: 'S'
                    {
                    match(input,40,FOLLOW_40_in_rule__NS__Alternatives3935); 

                    }

                     after(grammarAccess.getNSAccess().getSEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__NS__Alternatives


    // $ANTLR start rule__Airspace__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1797:1: rule__Airspace__Group__0 : rule__Airspace__Group__0__Impl rule__Airspace__Group__1 ;
    public final void rule__Airspace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1801:1: ( rule__Airspace__Group__0__Impl rule__Airspace__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1802:2: rule__Airspace__Group__0__Impl rule__Airspace__Group__1
            {
            pushFollow(FOLLOW_rule__Airspace__Group__0__Impl_in_rule__Airspace__Group__03968);
            rule__Airspace__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Airspace__Group__1_in_rule__Airspace__Group__03971);
            rule__Airspace__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Airspace__Group__0


    // $ANTLR start rule__Airspace__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1809:1: rule__Airspace__Group__0__Impl : ( ( rule__Airspace__ThedefAssignment_0 ) ) ;
    public final void rule__Airspace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1813:1: ( ( ( rule__Airspace__ThedefAssignment_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1814:1: ( ( rule__Airspace__ThedefAssignment_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1814:1: ( ( rule__Airspace__ThedefAssignment_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1815:1: ( rule__Airspace__ThedefAssignment_0 )
            {
             before(grammarAccess.getAirspaceAccess().getThedefAssignment_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1816:1: ( rule__Airspace__ThedefAssignment_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1816:2: rule__Airspace__ThedefAssignment_0
            {
            pushFollow(FOLLOW_rule__Airspace__ThedefAssignment_0_in_rule__Airspace__Group__0__Impl3998);
            rule__Airspace__ThedefAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAirspaceAccess().getThedefAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Airspace__Group__0__Impl


    // $ANTLR start rule__Airspace__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1826:1: rule__Airspace__Group__1 : rule__Airspace__Group__1__Impl ;
    public final void rule__Airspace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1830:1: ( rule__Airspace__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1831:2: rule__Airspace__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Airspace__Group__1__Impl_in_rule__Airspace__Group__14028);
            rule__Airspace__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Airspace__Group__1


    // $ANTLR start rule__Airspace__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1837:1: rule__Airspace__Group__1__Impl : ( ( rule__Airspace__ThegeomAssignment_1 )* ) ;
    public final void rule__Airspace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1841:1: ( ( ( rule__Airspace__ThegeomAssignment_1 )* ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1842:1: ( ( rule__Airspace__ThegeomAssignment_1 )* )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1842:1: ( ( rule__Airspace__ThegeomAssignment_1 )* )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1843:1: ( rule__Airspace__ThegeomAssignment_1 )*
            {
             before(grammarAccess.getAirspaceAccess().getThegeomAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1844:1: ( rule__Airspace__ThegeomAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==52||(LA13_0>=57 && LA13_0<=60)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1844:2: rule__Airspace__ThegeomAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Airspace__ThegeomAssignment_1_in_rule__Airspace__Group__1__Impl4055);
            	    rule__Airspace__ThegeomAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAirspaceAccess().getThegeomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Airspace__Group__1__Impl


    // $ANTLR start rule__TheDef__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1858:1: rule__TheDef__Group__0 : rule__TheDef__Group__0__Impl rule__TheDef__Group__1 ;
    public final void rule__TheDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1862:1: ( rule__TheDef__Group__0__Impl rule__TheDef__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1863:2: rule__TheDef__Group__0__Impl rule__TheDef__Group__1
            {
            pushFollow(FOLLOW_rule__TheDef__Group__0__Impl_in_rule__TheDef__Group__04090);
            rule__TheDef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TheDef__Group__1_in_rule__TheDef__Group__04093);
            rule__TheDef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__0


    // $ANTLR start rule__TheDef__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1870:1: rule__TheDef__Group__0__Impl : ( ( rule__TheDef__AsclassAssignment_0 ) ) ;
    public final void rule__TheDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1874:1: ( ( ( rule__TheDef__AsclassAssignment_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1875:1: ( ( rule__TheDef__AsclassAssignment_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1875:1: ( ( rule__TheDef__AsclassAssignment_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1876:1: ( rule__TheDef__AsclassAssignment_0 )
            {
             before(grammarAccess.getTheDefAccess().getAsclassAssignment_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1877:1: ( rule__TheDef__AsclassAssignment_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1877:2: rule__TheDef__AsclassAssignment_0
            {
            pushFollow(FOLLOW_rule__TheDef__AsclassAssignment_0_in_rule__TheDef__Group__0__Impl4120);
            rule__TheDef__AsclassAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTheDefAccess().getAsclassAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__0__Impl


    // $ANTLR start rule__TheDef__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1887:1: rule__TheDef__Group__1 : rule__TheDef__Group__1__Impl rule__TheDef__Group__2 ;
    public final void rule__TheDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1891:1: ( rule__TheDef__Group__1__Impl rule__TheDef__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1892:2: rule__TheDef__Group__1__Impl rule__TheDef__Group__2
            {
            pushFollow(FOLLOW_rule__TheDef__Group__1__Impl_in_rule__TheDef__Group__14150);
            rule__TheDef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TheDef__Group__2_in_rule__TheDef__Group__14153);
            rule__TheDef__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__1


    // $ANTLR start rule__TheDef__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1899:1: rule__TheDef__Group__1__Impl : ( ( rule__TheDef__SpAssignment_1 )* ) ;
    public final void rule__TheDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1903:1: ( ( ( rule__TheDef__SpAssignment_1 )* ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1904:1: ( ( rule__TheDef__SpAssignment_1 )* )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1904:1: ( ( rule__TheDef__SpAssignment_1 )* )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1905:1: ( rule__TheDef__SpAssignment_1 )*
            {
             before(grammarAccess.getTheDefAccess().getSpAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1906:1: ( rule__TheDef__SpAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1906:2: rule__TheDef__SpAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__TheDef__SpAssignment_1_in_rule__TheDef__Group__1__Impl4180);
            	    rule__TheDef__SpAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTheDefAccess().getSpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__1__Impl


    // $ANTLR start rule__TheDef__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1916:1: rule__TheDef__Group__2 : rule__TheDef__Group__2__Impl rule__TheDef__Group__3 ;
    public final void rule__TheDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1920:1: ( rule__TheDef__Group__2__Impl rule__TheDef__Group__3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1921:2: rule__TheDef__Group__2__Impl rule__TheDef__Group__3
            {
            pushFollow(FOLLOW_rule__TheDef__Group__2__Impl_in_rule__TheDef__Group__24211);
            rule__TheDef__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TheDef__Group__3_in_rule__TheDef__Group__24214);
            rule__TheDef__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__2


    // $ANTLR start rule__TheDef__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1928:1: rule__TheDef__Group__2__Impl : ( ( rule__TheDef__SbAssignment_2 )* ) ;
    public final void rule__TheDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1932:1: ( ( ( rule__TheDef__SbAssignment_2 )* ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1933:1: ( ( rule__TheDef__SbAssignment_2 )* )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1933:1: ( ( rule__TheDef__SbAssignment_2 )* )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1934:1: ( rule__TheDef__SbAssignment_2 )*
            {
             before(grammarAccess.getTheDefAccess().getSbAssignment_2()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1935:1: ( rule__TheDef__SbAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1935:2: rule__TheDef__SbAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TheDef__SbAssignment_2_in_rule__TheDef__Group__2__Impl4241);
            	    rule__TheDef__SbAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTheDefAccess().getSbAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__2__Impl


    // $ANTLR start rule__TheDef__Group__3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1945:1: rule__TheDef__Group__3 : rule__TheDef__Group__3__Impl rule__TheDef__Group__4 ;
    public final void rule__TheDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1949:1: ( rule__TheDef__Group__3__Impl rule__TheDef__Group__4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1950:2: rule__TheDef__Group__3__Impl rule__TheDef__Group__4
            {
            pushFollow(FOLLOW_rule__TheDef__Group__3__Impl_in_rule__TheDef__Group__34272);
            rule__TheDef__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TheDef__Group__4_in_rule__TheDef__Group__34275);
            rule__TheDef__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__3


    // $ANTLR start rule__TheDef__Group__3__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1957:1: rule__TheDef__Group__3__Impl : ( ( rule__TheDef__NameAssignment_3 ) ) ;
    public final void rule__TheDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1961:1: ( ( ( rule__TheDef__NameAssignment_3 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1962:1: ( ( rule__TheDef__NameAssignment_3 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1962:1: ( ( rule__TheDef__NameAssignment_3 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1963:1: ( rule__TheDef__NameAssignment_3 )
            {
             before(grammarAccess.getTheDefAccess().getNameAssignment_3()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1964:1: ( rule__TheDef__NameAssignment_3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1964:2: rule__TheDef__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__TheDef__NameAssignment_3_in_rule__TheDef__Group__3__Impl4302);
            rule__TheDef__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getTheDefAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__3__Impl


    // $ANTLR start rule__TheDef__Group__4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1974:1: rule__TheDef__Group__4 : rule__TheDef__Group__4__Impl rule__TheDef__Group__5 ;
    public final void rule__TheDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1978:1: ( rule__TheDef__Group__4__Impl rule__TheDef__Group__5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1979:2: rule__TheDef__Group__4__Impl rule__TheDef__Group__5
            {
            pushFollow(FOLLOW_rule__TheDef__Group__4__Impl_in_rule__TheDef__Group__44332);
            rule__TheDef__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TheDef__Group__5_in_rule__TheDef__Group__44335);
            rule__TheDef__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__4


    // $ANTLR start rule__TheDef__Group__4__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1986:1: rule__TheDef__Group__4__Impl : ( ( rule__TheDef__AtAssignment_4 )* ) ;
    public final void rule__TheDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1990:1: ( ( ( rule__TheDef__AtAssignment_4 )* ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1991:1: ( ( rule__TheDef__AtAssignment_4 )* )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1991:1: ( ( rule__TheDef__AtAssignment_4 )* )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1992:1: ( rule__TheDef__AtAssignment_4 )*
            {
             before(grammarAccess.getTheDefAccess().getAtAssignment_4()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1993:1: ( rule__TheDef__AtAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==61) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1993:2: rule__TheDef__AtAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__TheDef__AtAssignment_4_in_rule__TheDef__Group__4__Impl4362);
            	    rule__TheDef__AtAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTheDefAccess().getAtAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__4__Impl


    // $ANTLR start rule__TheDef__Group__5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2003:1: rule__TheDef__Group__5 : rule__TheDef__Group__5__Impl ;
    public final void rule__TheDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2007:1: ( rule__TheDef__Group__5__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2008:2: rule__TheDef__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__TheDef__Group__5__Impl_in_rule__TheDef__Group__54393);
            rule__TheDef__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__5


    // $ANTLR start rule__TheDef__Group__5__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2014:1: rule__TheDef__Group__5__Impl : ( ( rule__TheDef__LimitAssignment_5 ) ) ;
    public final void rule__TheDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2018:1: ( ( ( rule__TheDef__LimitAssignment_5 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2019:1: ( ( rule__TheDef__LimitAssignment_5 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2019:1: ( ( rule__TheDef__LimitAssignment_5 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2020:1: ( rule__TheDef__LimitAssignment_5 )
            {
             before(grammarAccess.getTheDefAccess().getLimitAssignment_5()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2021:1: ( rule__TheDef__LimitAssignment_5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2021:2: rule__TheDef__LimitAssignment_5
            {
            pushFollow(FOLLOW_rule__TheDef__LimitAssignment_5_in_rule__TheDef__Group__5__Impl4420);
            rule__TheDef__LimitAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getTheDefAccess().getLimitAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__Group__5__Impl


    // $ANTLR start rule__AsClass__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2043:1: rule__AsClass__Group__0 : rule__AsClass__Group__0__Impl rule__AsClass__Group__1 ;
    public final void rule__AsClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2047:1: ( rule__AsClass__Group__0__Impl rule__AsClass__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2048:2: rule__AsClass__Group__0__Impl rule__AsClass__Group__1
            {
            pushFollow(FOLLOW_rule__AsClass__Group__0__Impl_in_rule__AsClass__Group__04462);
            rule__AsClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AsClass__Group__1_in_rule__AsClass__Group__04465);
            rule__AsClass__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsClass__Group__0


    // $ANTLR start rule__AsClass__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2055:1: rule__AsClass__Group__0__Impl : ( () ) ;
    public final void rule__AsClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2059:1: ( ( () ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2060:1: ( () )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2060:1: ( () )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2061:1: ()
            {
             before(grammarAccess.getAsClassAccess().getAsClassAction_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2062:1: ()
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2064:1: 
            {
            }

             after(grammarAccess.getAsClassAccess().getAsClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsClass__Group__0__Impl


    // $ANTLR start rule__AsClass__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2074:1: rule__AsClass__Group__1 : rule__AsClass__Group__1__Impl rule__AsClass__Group__2 ;
    public final void rule__AsClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2078:1: ( rule__AsClass__Group__1__Impl rule__AsClass__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2079:2: rule__AsClass__Group__1__Impl rule__AsClass__Group__2
            {
            pushFollow(FOLLOW_rule__AsClass__Group__1__Impl_in_rule__AsClass__Group__14523);
            rule__AsClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AsClass__Group__2_in_rule__AsClass__Group__14526);
            rule__AsClass__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsClass__Group__1


    // $ANTLR start rule__AsClass__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2086:1: rule__AsClass__Group__1__Impl : ( 'AC' ) ;
    public final void rule__AsClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2090:1: ( ( 'AC' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2091:1: ( 'AC' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2091:1: ( 'AC' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2092:1: 'AC'
            {
             before(grammarAccess.getAsClassAccess().getACKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__AsClass__Group__1__Impl4554); 
             after(grammarAccess.getAsClassAccess().getACKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsClass__Group__1__Impl


    // $ANTLR start rule__AsClass__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2105:1: rule__AsClass__Group__2 : rule__AsClass__Group__2__Impl ;
    public final void rule__AsClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2109:1: ( rule__AsClass__Group__2__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2110:2: rule__AsClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AsClass__Group__2__Impl_in_rule__AsClass__Group__24585);
            rule__AsClass__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsClass__Group__2


    // $ANTLR start rule__AsClass__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2116:1: rule__AsClass__Group__2__Impl : ( ( rule__AsClass__NameAssignment_2 )? ) ;
    public final void rule__AsClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2120:1: ( ( ( rule__AsClass__NameAssignment_2 )? ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2121:1: ( ( rule__AsClass__NameAssignment_2 )? )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2121:1: ( ( rule__AsClass__NameAssignment_2 )? )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2122:1: ( rule__AsClass__NameAssignment_2 )?
            {
             before(grammarAccess.getAsClassAccess().getNameAssignment_2()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2123:1: ( rule__AsClass__NameAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=13 && LA17_0<=28)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2123:2: rule__AsClass__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__AsClass__NameAssignment_2_in_rule__AsClass__Group__2__Impl4612);
                    rule__AsClass__NameAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAsClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsClass__Group__2__Impl


    // $ANTLR start rule__SP__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2139:1: rule__SP__Group__0 : rule__SP__Group__0__Impl rule__SP__Group__1 ;
    public final void rule__SP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2143:1: ( rule__SP__Group__0__Impl rule__SP__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2144:2: rule__SP__Group__0__Impl rule__SP__Group__1
            {
            pushFollow(FOLLOW_rule__SP__Group__0__Impl_in_rule__SP__Group__04649);
            rule__SP__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SP__Group__1_in_rule__SP__Group__04652);
            rule__SP__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__0


    // $ANTLR start rule__SP__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2151:1: rule__SP__Group__0__Impl : ( 'SP' ) ;
    public final void rule__SP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2155:1: ( ( 'SP' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2156:1: ( 'SP' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2156:1: ( 'SP' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2157:1: 'SP'
            {
             before(grammarAccess.getSPAccess().getSPKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__SP__Group__0__Impl4680); 
             after(grammarAccess.getSPAccess().getSPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__0__Impl


    // $ANTLR start rule__SP__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2170:1: rule__SP__Group__1 : rule__SP__Group__1__Impl rule__SP__Group__2 ;
    public final void rule__SP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2174:1: ( rule__SP__Group__1__Impl rule__SP__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2175:2: rule__SP__Group__1__Impl rule__SP__Group__2
            {
            pushFollow(FOLLOW_rule__SP__Group__1__Impl_in_rule__SP__Group__14711);
            rule__SP__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SP__Group__2_in_rule__SP__Group__14714);
            rule__SP__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__1


    // $ANTLR start rule__SP__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2182:1: rule__SP__Group__1__Impl : ( ( rule__SP__Sp0Assignment_1 ) ) ;
    public final void rule__SP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2186:1: ( ( ( rule__SP__Sp0Assignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2187:1: ( ( rule__SP__Sp0Assignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2187:1: ( ( rule__SP__Sp0Assignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2188:1: ( rule__SP__Sp0Assignment_1 )
            {
             before(grammarAccess.getSPAccess().getSp0Assignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2189:1: ( rule__SP__Sp0Assignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2189:2: rule__SP__Sp0Assignment_1
            {
            pushFollow(FOLLOW_rule__SP__Sp0Assignment_1_in_rule__SP__Group__1__Impl4741);
            rule__SP__Sp0Assignment_1();
            _fsp--;


            }

             after(grammarAccess.getSPAccess().getSp0Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__1__Impl


    // $ANTLR start rule__SP__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2199:1: rule__SP__Group__2 : rule__SP__Group__2__Impl rule__SP__Group__3 ;
    public final void rule__SP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2203:1: ( rule__SP__Group__2__Impl rule__SP__Group__3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2204:2: rule__SP__Group__2__Impl rule__SP__Group__3
            {
            pushFollow(FOLLOW_rule__SP__Group__2__Impl_in_rule__SP__Group__24771);
            rule__SP__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SP__Group__3_in_rule__SP__Group__24774);
            rule__SP__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__2


    // $ANTLR start rule__SP__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2211:1: rule__SP__Group__2__Impl : ( ',' ) ;
    public final void rule__SP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2215:1: ( ( ',' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2216:1: ( ',' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2216:1: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2217:1: ','
            {
             before(grammarAccess.getSPAccess().getCommaKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__SP__Group__2__Impl4802); 
             after(grammarAccess.getSPAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__2__Impl


    // $ANTLR start rule__SP__Group__3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2230:1: rule__SP__Group__3 : rule__SP__Group__3__Impl rule__SP__Group__4 ;
    public final void rule__SP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2234:1: ( rule__SP__Group__3__Impl rule__SP__Group__4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2235:2: rule__SP__Group__3__Impl rule__SP__Group__4
            {
            pushFollow(FOLLOW_rule__SP__Group__3__Impl_in_rule__SP__Group__34833);
            rule__SP__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SP__Group__4_in_rule__SP__Group__34836);
            rule__SP__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__3


    // $ANTLR start rule__SP__Group__3__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2242:1: rule__SP__Group__3__Impl : ( ( rule__SP__Sp1Assignment_3 ) ) ;
    public final void rule__SP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2246:1: ( ( ( rule__SP__Sp1Assignment_3 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2247:1: ( ( rule__SP__Sp1Assignment_3 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2247:1: ( ( rule__SP__Sp1Assignment_3 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2248:1: ( rule__SP__Sp1Assignment_3 )
            {
             before(grammarAccess.getSPAccess().getSp1Assignment_3()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2249:1: ( rule__SP__Sp1Assignment_3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2249:2: rule__SP__Sp1Assignment_3
            {
            pushFollow(FOLLOW_rule__SP__Sp1Assignment_3_in_rule__SP__Group__3__Impl4863);
            rule__SP__Sp1Assignment_3();
            _fsp--;


            }

             after(grammarAccess.getSPAccess().getSp1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__3__Impl


    // $ANTLR start rule__SP__Group__4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2259:1: rule__SP__Group__4 : rule__SP__Group__4__Impl rule__SP__Group__5 ;
    public final void rule__SP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2263:1: ( rule__SP__Group__4__Impl rule__SP__Group__5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2264:2: rule__SP__Group__4__Impl rule__SP__Group__5
            {
            pushFollow(FOLLOW_rule__SP__Group__4__Impl_in_rule__SP__Group__44893);
            rule__SP__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SP__Group__5_in_rule__SP__Group__44896);
            rule__SP__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__4


    // $ANTLR start rule__SP__Group__4__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2271:1: rule__SP__Group__4__Impl : ( ',' ) ;
    public final void rule__SP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2275:1: ( ( ',' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2276:1: ( ',' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2276:1: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2277:1: ','
            {
             before(grammarAccess.getSPAccess().getCommaKeyword_4()); 
            match(input,43,FOLLOW_43_in_rule__SP__Group__4__Impl4924); 
             after(grammarAccess.getSPAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__4__Impl


    // $ANTLR start rule__SP__Group__5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2290:1: rule__SP__Group__5 : rule__SP__Group__5__Impl rule__SP__Group__6 ;
    public final void rule__SP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2294:1: ( rule__SP__Group__5__Impl rule__SP__Group__6 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2295:2: rule__SP__Group__5__Impl rule__SP__Group__6
            {
            pushFollow(FOLLOW_rule__SP__Group__5__Impl_in_rule__SP__Group__54955);
            rule__SP__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SP__Group__6_in_rule__SP__Group__54958);
            rule__SP__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__5


    // $ANTLR start rule__SP__Group__5__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2302:1: rule__SP__Group__5__Impl : ( ( rule__SP__Sp2Assignment_5 ) ) ;
    public final void rule__SP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2306:1: ( ( ( rule__SP__Sp2Assignment_5 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2307:1: ( ( rule__SP__Sp2Assignment_5 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2307:1: ( ( rule__SP__Sp2Assignment_5 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2308:1: ( rule__SP__Sp2Assignment_5 )
            {
             before(grammarAccess.getSPAccess().getSp2Assignment_5()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2309:1: ( rule__SP__Sp2Assignment_5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2309:2: rule__SP__Sp2Assignment_5
            {
            pushFollow(FOLLOW_rule__SP__Sp2Assignment_5_in_rule__SP__Group__5__Impl4985);
            rule__SP__Sp2Assignment_5();
            _fsp--;


            }

             after(grammarAccess.getSPAccess().getSp2Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__5__Impl


    // $ANTLR start rule__SP__Group__6
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2319:1: rule__SP__Group__6 : rule__SP__Group__6__Impl rule__SP__Group__7 ;
    public final void rule__SP__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2323:1: ( rule__SP__Group__6__Impl rule__SP__Group__7 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2324:2: rule__SP__Group__6__Impl rule__SP__Group__7
            {
            pushFollow(FOLLOW_rule__SP__Group__6__Impl_in_rule__SP__Group__65015);
            rule__SP__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SP__Group__7_in_rule__SP__Group__65018);
            rule__SP__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__6


    // $ANTLR start rule__SP__Group__6__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2331:1: rule__SP__Group__6__Impl : ( ',' ) ;
    public final void rule__SP__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2335:1: ( ( ',' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2336:1: ( ',' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2336:1: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2337:1: ','
            {
             before(grammarAccess.getSPAccess().getCommaKeyword_6()); 
            match(input,43,FOLLOW_43_in_rule__SP__Group__6__Impl5046); 
             after(grammarAccess.getSPAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__6__Impl


    // $ANTLR start rule__SP__Group__7
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2350:1: rule__SP__Group__7 : rule__SP__Group__7__Impl rule__SP__Group__8 ;
    public final void rule__SP__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2354:1: ( rule__SP__Group__7__Impl rule__SP__Group__8 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2355:2: rule__SP__Group__7__Impl rule__SP__Group__8
            {
            pushFollow(FOLLOW_rule__SP__Group__7__Impl_in_rule__SP__Group__75077);
            rule__SP__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SP__Group__8_in_rule__SP__Group__75080);
            rule__SP__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__7


    // $ANTLR start rule__SP__Group__7__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2362:1: rule__SP__Group__7__Impl : ( ( rule__SP__Sp3Assignment_7 ) ) ;
    public final void rule__SP__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2366:1: ( ( ( rule__SP__Sp3Assignment_7 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2367:1: ( ( rule__SP__Sp3Assignment_7 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2367:1: ( ( rule__SP__Sp3Assignment_7 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2368:1: ( rule__SP__Sp3Assignment_7 )
            {
             before(grammarAccess.getSPAccess().getSp3Assignment_7()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2369:1: ( rule__SP__Sp3Assignment_7 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2369:2: rule__SP__Sp3Assignment_7
            {
            pushFollow(FOLLOW_rule__SP__Sp3Assignment_7_in_rule__SP__Group__7__Impl5107);
            rule__SP__Sp3Assignment_7();
            _fsp--;


            }

             after(grammarAccess.getSPAccess().getSp3Assignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__7__Impl


    // $ANTLR start rule__SP__Group__8
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2379:1: rule__SP__Group__8 : rule__SP__Group__8__Impl rule__SP__Group__9 ;
    public final void rule__SP__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2383:1: ( rule__SP__Group__8__Impl rule__SP__Group__9 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2384:2: rule__SP__Group__8__Impl rule__SP__Group__9
            {
            pushFollow(FOLLOW_rule__SP__Group__8__Impl_in_rule__SP__Group__85137);
            rule__SP__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SP__Group__9_in_rule__SP__Group__85140);
            rule__SP__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__8


    // $ANTLR start rule__SP__Group__8__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2391:1: rule__SP__Group__8__Impl : ( ',' ) ;
    public final void rule__SP__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2395:1: ( ( ',' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2396:1: ( ',' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2396:1: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2397:1: ','
            {
             before(grammarAccess.getSPAccess().getCommaKeyword_8()); 
            match(input,43,FOLLOW_43_in_rule__SP__Group__8__Impl5168); 
             after(grammarAccess.getSPAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__8__Impl


    // $ANTLR start rule__SP__Group__9
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2410:1: rule__SP__Group__9 : rule__SP__Group__9__Impl ;
    public final void rule__SP__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2414:1: ( rule__SP__Group__9__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2415:2: rule__SP__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__SP__Group__9__Impl_in_rule__SP__Group__95199);
            rule__SP__Group__9__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__9


    // $ANTLR start rule__SP__Group__9__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2421:1: rule__SP__Group__9__Impl : ( ( rule__SP__Sp4Assignment_9 ) ) ;
    public final void rule__SP__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2425:1: ( ( ( rule__SP__Sp4Assignment_9 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2426:1: ( ( rule__SP__Sp4Assignment_9 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2426:1: ( ( rule__SP__Sp4Assignment_9 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2427:1: ( rule__SP__Sp4Assignment_9 )
            {
             before(grammarAccess.getSPAccess().getSp4Assignment_9()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2428:1: ( rule__SP__Sp4Assignment_9 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2428:2: rule__SP__Sp4Assignment_9
            {
            pushFollow(FOLLOW_rule__SP__Sp4Assignment_9_in_rule__SP__Group__9__Impl5226);
            rule__SP__Sp4Assignment_9();
            _fsp--;


            }

             after(grammarAccess.getSPAccess().getSp4Assignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Group__9__Impl


    // $ANTLR start rule__SB__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2458:1: rule__SB__Group__0 : rule__SB__Group__0__Impl rule__SB__Group__1 ;
    public final void rule__SB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2462:1: ( rule__SB__Group__0__Impl rule__SB__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2463:2: rule__SB__Group__0__Impl rule__SB__Group__1
            {
            pushFollow(FOLLOW_rule__SB__Group__0__Impl_in_rule__SB__Group__05276);
            rule__SB__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SB__Group__1_in_rule__SB__Group__05279);
            rule__SB__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__0


    // $ANTLR start rule__SB__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2470:1: rule__SB__Group__0__Impl : ( 'SB' ) ;
    public final void rule__SB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2474:1: ( ( 'SB' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2475:1: ( 'SB' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2475:1: ( 'SB' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2476:1: 'SB'
            {
             before(grammarAccess.getSBAccess().getSBKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__SB__Group__0__Impl5307); 
             after(grammarAccess.getSBAccess().getSBKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__0__Impl


    // $ANTLR start rule__SB__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2489:1: rule__SB__Group__1 : rule__SB__Group__1__Impl rule__SB__Group__2 ;
    public final void rule__SB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2493:1: ( rule__SB__Group__1__Impl rule__SB__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2494:2: rule__SB__Group__1__Impl rule__SB__Group__2
            {
            pushFollow(FOLLOW_rule__SB__Group__1__Impl_in_rule__SB__Group__15338);
            rule__SB__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SB__Group__2_in_rule__SB__Group__15341);
            rule__SB__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__1


    // $ANTLR start rule__SB__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2501:1: rule__SB__Group__1__Impl : ( ( rule__SB__SbVal1Assignment_1 ) ) ;
    public final void rule__SB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2505:1: ( ( ( rule__SB__SbVal1Assignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2506:1: ( ( rule__SB__SbVal1Assignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2506:1: ( ( rule__SB__SbVal1Assignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2507:1: ( rule__SB__SbVal1Assignment_1 )
            {
             before(grammarAccess.getSBAccess().getSbVal1Assignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2508:1: ( rule__SB__SbVal1Assignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2508:2: rule__SB__SbVal1Assignment_1
            {
            pushFollow(FOLLOW_rule__SB__SbVal1Assignment_1_in_rule__SB__Group__1__Impl5368);
            rule__SB__SbVal1Assignment_1();
            _fsp--;


            }

             after(grammarAccess.getSBAccess().getSbVal1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__1__Impl


    // $ANTLR start rule__SB__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2518:1: rule__SB__Group__2 : rule__SB__Group__2__Impl rule__SB__Group__3 ;
    public final void rule__SB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2522:1: ( rule__SB__Group__2__Impl rule__SB__Group__3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2523:2: rule__SB__Group__2__Impl rule__SB__Group__3
            {
            pushFollow(FOLLOW_rule__SB__Group__2__Impl_in_rule__SB__Group__25398);
            rule__SB__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SB__Group__3_in_rule__SB__Group__25401);
            rule__SB__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__2


    // $ANTLR start rule__SB__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2530:1: rule__SB__Group__2__Impl : ( ',' ) ;
    public final void rule__SB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2534:1: ( ( ',' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2535:1: ( ',' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2535:1: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2536:1: ','
            {
             before(grammarAccess.getSBAccess().getCommaKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__SB__Group__2__Impl5429); 
             after(grammarAccess.getSBAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__2__Impl


    // $ANTLR start rule__SB__Group__3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2549:1: rule__SB__Group__3 : rule__SB__Group__3__Impl rule__SB__Group__4 ;
    public final void rule__SB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2553:1: ( rule__SB__Group__3__Impl rule__SB__Group__4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2554:2: rule__SB__Group__3__Impl rule__SB__Group__4
            {
            pushFollow(FOLLOW_rule__SB__Group__3__Impl_in_rule__SB__Group__35460);
            rule__SB__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SB__Group__4_in_rule__SB__Group__35463);
            rule__SB__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__3


    // $ANTLR start rule__SB__Group__3__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2561:1: rule__SB__Group__3__Impl : ( ( rule__SB__SbVal2Assignment_3 ) ) ;
    public final void rule__SB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2565:1: ( ( ( rule__SB__SbVal2Assignment_3 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2566:1: ( ( rule__SB__SbVal2Assignment_3 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2566:1: ( ( rule__SB__SbVal2Assignment_3 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2567:1: ( rule__SB__SbVal2Assignment_3 )
            {
             before(grammarAccess.getSBAccess().getSbVal2Assignment_3()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2568:1: ( rule__SB__SbVal2Assignment_3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2568:2: rule__SB__SbVal2Assignment_3
            {
            pushFollow(FOLLOW_rule__SB__SbVal2Assignment_3_in_rule__SB__Group__3__Impl5490);
            rule__SB__SbVal2Assignment_3();
            _fsp--;


            }

             after(grammarAccess.getSBAccess().getSbVal2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__3__Impl


    // $ANTLR start rule__SB__Group__4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2578:1: rule__SB__Group__4 : rule__SB__Group__4__Impl rule__SB__Group__5 ;
    public final void rule__SB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2582:1: ( rule__SB__Group__4__Impl rule__SB__Group__5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2583:2: rule__SB__Group__4__Impl rule__SB__Group__5
            {
            pushFollow(FOLLOW_rule__SB__Group__4__Impl_in_rule__SB__Group__45520);
            rule__SB__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SB__Group__5_in_rule__SB__Group__45523);
            rule__SB__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__4


    // $ANTLR start rule__SB__Group__4__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2590:1: rule__SB__Group__4__Impl : ( ',' ) ;
    public final void rule__SB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2594:1: ( ( ',' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2595:1: ( ',' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2595:1: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2596:1: ','
            {
             before(grammarAccess.getSBAccess().getCommaKeyword_4()); 
            match(input,43,FOLLOW_43_in_rule__SB__Group__4__Impl5551); 
             after(grammarAccess.getSBAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__4__Impl


    // $ANTLR start rule__SB__Group__5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2609:1: rule__SB__Group__5 : rule__SB__Group__5__Impl ;
    public final void rule__SB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2613:1: ( rule__SB__Group__5__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2614:2: rule__SB__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SB__Group__5__Impl_in_rule__SB__Group__55582);
            rule__SB__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__5


    // $ANTLR start rule__SB__Group__5__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2620:1: rule__SB__Group__5__Impl : ( ( rule__SB__SbVal3Assignment_5 ) ) ;
    public final void rule__SB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2624:1: ( ( ( rule__SB__SbVal3Assignment_5 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2625:1: ( ( rule__SB__SbVal3Assignment_5 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2625:1: ( ( rule__SB__SbVal3Assignment_5 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2626:1: ( rule__SB__SbVal3Assignment_5 )
            {
             before(grammarAccess.getSBAccess().getSbVal3Assignment_5()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2627:1: ( rule__SB__SbVal3Assignment_5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2627:2: rule__SB__SbVal3Assignment_5
            {
            pushFollow(FOLLOW_rule__SB__SbVal3Assignment_5_in_rule__SB__Group__5__Impl5609);
            rule__SB__SbVal3Assignment_5();
            _fsp--;


            }

             after(grammarAccess.getSBAccess().getSbVal3Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__Group__5__Impl


    // $ANTLR start rule__AsName__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2649:1: rule__AsName__Group__0 : rule__AsName__Group__0__Impl rule__AsName__Group__1 ;
    public final void rule__AsName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2653:1: ( rule__AsName__Group__0__Impl rule__AsName__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2654:2: rule__AsName__Group__0__Impl rule__AsName__Group__1
            {
            pushFollow(FOLLOW_rule__AsName__Group__0__Impl_in_rule__AsName__Group__05651);
            rule__AsName__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AsName__Group__1_in_rule__AsName__Group__05654);
            rule__AsName__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsName__Group__0


    // $ANTLR start rule__AsName__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2661:1: rule__AsName__Group__0__Impl : ( 'AN' ) ;
    public final void rule__AsName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2665:1: ( ( 'AN' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2666:1: ( 'AN' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2666:1: ( 'AN' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2667:1: 'AN'
            {
             before(grammarAccess.getAsNameAccess().getANKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__AsName__Group__0__Impl5682); 
             after(grammarAccess.getAsNameAccess().getANKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsName__Group__0__Impl


    // $ANTLR start rule__AsName__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2680:1: rule__AsName__Group__1 : rule__AsName__Group__1__Impl ;
    public final void rule__AsName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2684:1: ( rule__AsName__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2685:2: rule__AsName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AsName__Group__1__Impl_in_rule__AsName__Group__15713);
            rule__AsName__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsName__Group__1


    // $ANTLR start rule__AsName__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2691:1: rule__AsName__Group__1__Impl : ( ( rule__AsName__NameAssignment_1 ) ) ;
    public final void rule__AsName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2695:1: ( ( ( rule__AsName__NameAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2696:1: ( ( rule__AsName__NameAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2696:1: ( ( rule__AsName__NameAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2697:1: ( rule__AsName__NameAssignment_1 )
            {
             before(grammarAccess.getAsNameAccess().getNameAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2698:1: ( rule__AsName__NameAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2698:2: rule__AsName__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AsName__NameAssignment_1_in_rule__AsName__Group__1__Impl5740);
            rule__AsName__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAsNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsName__Group__1__Impl


    // $ANTLR start rule__Limites__Group_0__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2712:1: rule__Limites__Group_0__0 : rule__Limites__Group_0__0__Impl rule__Limites__Group_0__1 ;
    public final void rule__Limites__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2716:1: ( rule__Limites__Group_0__0__Impl rule__Limites__Group_0__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2717:2: rule__Limites__Group_0__0__Impl rule__Limites__Group_0__1
            {
            pushFollow(FOLLOW_rule__Limites__Group_0__0__Impl_in_rule__Limites__Group_0__05774);
            rule__Limites__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Limites__Group_0__1_in_rule__Limites__Group_0__05777);
            rule__Limites__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__Group_0__0


    // $ANTLR start rule__Limites__Group_0__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2724:1: rule__Limites__Group_0__0__Impl : ( ( rule__Limites__LowLimitAssignment_0_0 ) ) ;
    public final void rule__Limites__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2728:1: ( ( ( rule__Limites__LowLimitAssignment_0_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2729:1: ( ( rule__Limites__LowLimitAssignment_0_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2729:1: ( ( rule__Limites__LowLimitAssignment_0_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2730:1: ( rule__Limites__LowLimitAssignment_0_0 )
            {
             before(grammarAccess.getLimitesAccess().getLowLimitAssignment_0_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2731:1: ( rule__Limites__LowLimitAssignment_0_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2731:2: rule__Limites__LowLimitAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Limites__LowLimitAssignment_0_0_in_rule__Limites__Group_0__0__Impl5804);
            rule__Limites__LowLimitAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getLimitesAccess().getLowLimitAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__Group_0__0__Impl


    // $ANTLR start rule__Limites__Group_0__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2741:1: rule__Limites__Group_0__1 : rule__Limites__Group_0__1__Impl ;
    public final void rule__Limites__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2745:1: ( rule__Limites__Group_0__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2746:2: rule__Limites__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Limites__Group_0__1__Impl_in_rule__Limites__Group_0__15834);
            rule__Limites__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__Group_0__1


    // $ANTLR start rule__Limites__Group_0__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2752:1: rule__Limites__Group_0__1__Impl : ( ( rule__Limites__HighLimitAssignment_0_1 ) ) ;
    public final void rule__Limites__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2756:1: ( ( ( rule__Limites__HighLimitAssignment_0_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2757:1: ( ( rule__Limites__HighLimitAssignment_0_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2757:1: ( ( rule__Limites__HighLimitAssignment_0_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2758:1: ( rule__Limites__HighLimitAssignment_0_1 )
            {
             before(grammarAccess.getLimitesAccess().getHighLimitAssignment_0_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2759:1: ( rule__Limites__HighLimitAssignment_0_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2759:2: rule__Limites__HighLimitAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Limites__HighLimitAssignment_0_1_in_rule__Limites__Group_0__1__Impl5861);
            rule__Limites__HighLimitAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getLimitesAccess().getHighLimitAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__Group_0__1__Impl


    // $ANTLR start rule__Limites__Group_1__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2773:1: rule__Limites__Group_1__0 : rule__Limites__Group_1__0__Impl rule__Limites__Group_1__1 ;
    public final void rule__Limites__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2777:1: ( rule__Limites__Group_1__0__Impl rule__Limites__Group_1__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2778:2: rule__Limites__Group_1__0__Impl rule__Limites__Group_1__1
            {
            pushFollow(FOLLOW_rule__Limites__Group_1__0__Impl_in_rule__Limites__Group_1__05895);
            rule__Limites__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Limites__Group_1__1_in_rule__Limites__Group_1__05898);
            rule__Limites__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__Group_1__0


    // $ANTLR start rule__Limites__Group_1__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2785:1: rule__Limites__Group_1__0__Impl : ( ( rule__Limites__HeighLimitAssignment_1_0 ) ) ;
    public final void rule__Limites__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2789:1: ( ( ( rule__Limites__HeighLimitAssignment_1_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2790:1: ( ( rule__Limites__HeighLimitAssignment_1_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2790:1: ( ( rule__Limites__HeighLimitAssignment_1_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2791:1: ( rule__Limites__HeighLimitAssignment_1_0 )
            {
             before(grammarAccess.getLimitesAccess().getHeighLimitAssignment_1_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2792:1: ( rule__Limites__HeighLimitAssignment_1_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2792:2: rule__Limites__HeighLimitAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Limites__HeighLimitAssignment_1_0_in_rule__Limites__Group_1__0__Impl5925);
            rule__Limites__HeighLimitAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getLimitesAccess().getHeighLimitAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__Group_1__0__Impl


    // $ANTLR start rule__Limites__Group_1__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2802:1: rule__Limites__Group_1__1 : rule__Limites__Group_1__1__Impl ;
    public final void rule__Limites__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2806:1: ( rule__Limites__Group_1__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2807:2: rule__Limites__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Limites__Group_1__1__Impl_in_rule__Limites__Group_1__15955);
            rule__Limites__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__Group_1__1


    // $ANTLR start rule__Limites__Group_1__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2813:1: rule__Limites__Group_1__1__Impl : ( ( rule__Limites__LowLimitAssignment_1_1 ) ) ;
    public final void rule__Limites__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2817:1: ( ( ( rule__Limites__LowLimitAssignment_1_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2818:1: ( ( rule__Limites__LowLimitAssignment_1_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2818:1: ( ( rule__Limites__LowLimitAssignment_1_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2819:1: ( rule__Limites__LowLimitAssignment_1_1 )
            {
             before(grammarAccess.getLimitesAccess().getLowLimitAssignment_1_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2820:1: ( rule__Limites__LowLimitAssignment_1_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2820:2: rule__Limites__LowLimitAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Limites__LowLimitAssignment_1_1_in_rule__Limites__Group_1__1__Impl5982);
            rule__Limites__LowLimitAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getLimitesAccess().getLowLimitAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__Group_1__1__Impl


    // $ANTLR start rule__LowLimit__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2834:1: rule__LowLimit__Group__0 : rule__LowLimit__Group__0__Impl rule__LowLimit__Group__1 ;
    public final void rule__LowLimit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2838:1: ( rule__LowLimit__Group__0__Impl rule__LowLimit__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2839:2: rule__LowLimit__Group__0__Impl rule__LowLimit__Group__1
            {
            pushFollow(FOLLOW_rule__LowLimit__Group__0__Impl_in_rule__LowLimit__Group__06016);
            rule__LowLimit__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LowLimit__Group__1_in_rule__LowLimit__Group__06019);
            rule__LowLimit__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LowLimit__Group__0


    // $ANTLR start rule__LowLimit__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2846:1: rule__LowLimit__Group__0__Impl : ( 'AL' ) ;
    public final void rule__LowLimit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2850:1: ( ( 'AL' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2851:1: ( 'AL' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2851:1: ( 'AL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2852:1: 'AL'
            {
             before(grammarAccess.getLowLimitAccess().getALKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__LowLimit__Group__0__Impl6047); 
             after(grammarAccess.getLowLimitAccess().getALKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LowLimit__Group__0__Impl


    // $ANTLR start rule__LowLimit__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2865:1: rule__LowLimit__Group__1 : rule__LowLimit__Group__1__Impl ;
    public final void rule__LowLimit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2869:1: ( rule__LowLimit__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2870:2: rule__LowLimit__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LowLimit__Group__1__Impl_in_rule__LowLimit__Group__16078);
            rule__LowLimit__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LowLimit__Group__1


    // $ANTLR start rule__LowLimit__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2876:1: rule__LowLimit__Group__1__Impl : ( ( rule__LowLimit__LlAssignment_1 ) ) ;
    public final void rule__LowLimit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2880:1: ( ( ( rule__LowLimit__LlAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2881:1: ( ( rule__LowLimit__LlAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2881:1: ( ( rule__LowLimit__LlAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2882:1: ( rule__LowLimit__LlAssignment_1 )
            {
             before(grammarAccess.getLowLimitAccess().getLlAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2883:1: ( rule__LowLimit__LlAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2883:2: rule__LowLimit__LlAssignment_1
            {
            pushFollow(FOLLOW_rule__LowLimit__LlAssignment_1_in_rule__LowLimit__Group__1__Impl6105);
            rule__LowLimit__LlAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLowLimitAccess().getLlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LowLimit__Group__1__Impl


    // $ANTLR start rule__HighLimit__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2897:1: rule__HighLimit__Group__0 : rule__HighLimit__Group__0__Impl rule__HighLimit__Group__1 ;
    public final void rule__HighLimit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2901:1: ( rule__HighLimit__Group__0__Impl rule__HighLimit__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2902:2: rule__HighLimit__Group__0__Impl rule__HighLimit__Group__1
            {
            pushFollow(FOLLOW_rule__HighLimit__Group__0__Impl_in_rule__HighLimit__Group__06139);
            rule__HighLimit__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HighLimit__Group__1_in_rule__HighLimit__Group__06142);
            rule__HighLimit__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HighLimit__Group__0


    // $ANTLR start rule__HighLimit__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2909:1: rule__HighLimit__Group__0__Impl : ( 'AH' ) ;
    public final void rule__HighLimit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2913:1: ( ( 'AH' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2914:1: ( 'AH' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2914:1: ( 'AH' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2915:1: 'AH'
            {
             before(grammarAccess.getHighLimitAccess().getAHKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__HighLimit__Group__0__Impl6170); 
             after(grammarAccess.getHighLimitAccess().getAHKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HighLimit__Group__0__Impl


    // $ANTLR start rule__HighLimit__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2928:1: rule__HighLimit__Group__1 : rule__HighLimit__Group__1__Impl ;
    public final void rule__HighLimit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2932:1: ( rule__HighLimit__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2933:2: rule__HighLimit__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__HighLimit__Group__1__Impl_in_rule__HighLimit__Group__16201);
            rule__HighLimit__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HighLimit__Group__1


    // $ANTLR start rule__HighLimit__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2939:1: rule__HighLimit__Group__1__Impl : ( ( rule__HighLimit__HlAssignment_1 ) ) ;
    public final void rule__HighLimit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2943:1: ( ( ( rule__HighLimit__HlAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2944:1: ( ( rule__HighLimit__HlAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2944:1: ( ( rule__HighLimit__HlAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2945:1: ( rule__HighLimit__HlAssignment_1 )
            {
             before(grammarAccess.getHighLimitAccess().getHlAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2946:1: ( rule__HighLimit__HlAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2946:2: rule__HighLimit__HlAssignment_1
            {
            pushFollow(FOLLOW_rule__HighLimit__HlAssignment_1_in_rule__HighLimit__Group__1__Impl6228);
            rule__HighLimit__HlAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getHighLimitAccess().getHlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HighLimit__Group__1__Impl


    // $ANTLR start rule__FL__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2960:1: rule__FL__Group__0 : rule__FL__Group__0__Impl rule__FL__Group__1 ;
    public final void rule__FL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2964:1: ( rule__FL__Group__0__Impl rule__FL__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2965:2: rule__FL__Group__0__Impl rule__FL__Group__1
            {
            pushFollow(FOLLOW_rule__FL__Group__0__Impl_in_rule__FL__Group__06262);
            rule__FL__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FL__Group__1_in_rule__FL__Group__06265);
            rule__FL__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FL__Group__0


    // $ANTLR start rule__FL__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2972:1: rule__FL__Group__0__Impl : ( 'FL' ) ;
    public final void rule__FL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2976:1: ( ( 'FL' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2977:1: ( 'FL' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2977:1: ( 'FL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2978:1: 'FL'
            {
             before(grammarAccess.getFLAccess().getFLKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__FL__Group__0__Impl6293); 
             after(grammarAccess.getFLAccess().getFLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FL__Group__0__Impl


    // $ANTLR start rule__FL__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2991:1: rule__FL__Group__1 : rule__FL__Group__1__Impl ;
    public final void rule__FL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2995:1: ( rule__FL__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:2996:2: rule__FL__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FL__Group__1__Impl_in_rule__FL__Group__16324);
            rule__FL__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FL__Group__1


    // $ANTLR start rule__FL__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3002:1: rule__FL__Group__1__Impl : ( ( rule__FL__ValueAssignment_1 ) ) ;
    public final void rule__FL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3006:1: ( ( ( rule__FL__ValueAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3007:1: ( ( rule__FL__ValueAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3007:1: ( ( rule__FL__ValueAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3008:1: ( rule__FL__ValueAssignment_1 )
            {
             before(grammarAccess.getFLAccess().getValueAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3009:1: ( rule__FL__ValueAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3009:2: rule__FL__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__FL__ValueAssignment_1_in_rule__FL__Group__1__Impl6351);
            rule__FL__ValueAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFLAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FL__Group__1__Impl


    // $ANTLR start rule__SFC__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3023:1: rule__SFC__Group__0 : rule__SFC__Group__0__Impl rule__SFC__Group__1 ;
    public final void rule__SFC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3027:1: ( rule__SFC__Group__0__Impl rule__SFC__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3028:2: rule__SFC__Group__0__Impl rule__SFC__Group__1
            {
            pushFollow(FOLLOW_rule__SFC__Group__0__Impl_in_rule__SFC__Group__06385);
            rule__SFC__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SFC__Group__1_in_rule__SFC__Group__06388);
            rule__SFC__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SFC__Group__0


    // $ANTLR start rule__SFC__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3035:1: rule__SFC__Group__0__Impl : ( () ) ;
    public final void rule__SFC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3039:1: ( ( () ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3040:1: ( () )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3040:1: ( () )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3041:1: ()
            {
             before(grammarAccess.getSFCAccess().getSFCAction_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3042:1: ()
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3044:1: 
            {
            }

             after(grammarAccess.getSFCAccess().getSFCAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SFC__Group__0__Impl


    // $ANTLR start rule__SFC__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3054:1: rule__SFC__Group__1 : rule__SFC__Group__1__Impl ;
    public final void rule__SFC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3058:1: ( rule__SFC__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3059:2: rule__SFC__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SFC__Group__1__Impl_in_rule__SFC__Group__16446);
            rule__SFC__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SFC__Group__1


    // $ANTLR start rule__SFC__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3065:1: rule__SFC__Group__1__Impl : ( 'SFC' ) ;
    public final void rule__SFC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3069:1: ( ( 'SFC' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3070:1: ( 'SFC' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3070:1: ( 'SFC' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3071:1: 'SFC'
            {
             before(grammarAccess.getSFCAccess().getSFCKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__SFC__Group__1__Impl6474); 
             after(grammarAccess.getSFCAccess().getSFCKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SFC__Group__1__Impl


    // $ANTLR start rule__GND__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3088:1: rule__GND__Group__0 : rule__GND__Group__0__Impl rule__GND__Group__1 ;
    public final void rule__GND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3092:1: ( rule__GND__Group__0__Impl rule__GND__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3093:2: rule__GND__Group__0__Impl rule__GND__Group__1
            {
            pushFollow(FOLLOW_rule__GND__Group__0__Impl_in_rule__GND__Group__06509);
            rule__GND__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GND__Group__1_in_rule__GND__Group__06512);
            rule__GND__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GND__Group__0


    // $ANTLR start rule__GND__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3100:1: rule__GND__Group__0__Impl : ( () ) ;
    public final void rule__GND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3104:1: ( ( () ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3105:1: ( () )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3105:1: ( () )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3106:1: ()
            {
             before(grammarAccess.getGNDAccess().getGNDAction_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3107:1: ()
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3109:1: 
            {
            }

             after(grammarAccess.getGNDAccess().getGNDAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GND__Group__0__Impl


    // $ANTLR start rule__GND__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3119:1: rule__GND__Group__1 : rule__GND__Group__1__Impl ;
    public final void rule__GND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3123:1: ( rule__GND__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3124:2: rule__GND__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GND__Group__1__Impl_in_rule__GND__Group__16570);
            rule__GND__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GND__Group__1


    // $ANTLR start rule__GND__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3130:1: rule__GND__Group__1__Impl : ( 'GND' ) ;
    public final void rule__GND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3134:1: ( ( 'GND' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3135:1: ( 'GND' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3135:1: ( 'GND' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3136:1: 'GND'
            {
             before(grammarAccess.getGNDAccess().getGNDKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__GND__Group__1__Impl6598); 
             after(grammarAccess.getGNDAccess().getGNDKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GND__Group__1__Impl


    // $ANTLR start rule__UNL__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3153:1: rule__UNL__Group__0 : rule__UNL__Group__0__Impl rule__UNL__Group__1 ;
    public final void rule__UNL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3157:1: ( rule__UNL__Group__0__Impl rule__UNL__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3158:2: rule__UNL__Group__0__Impl rule__UNL__Group__1
            {
            pushFollow(FOLLOW_rule__UNL__Group__0__Impl_in_rule__UNL__Group__06633);
            rule__UNL__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UNL__Group__1_in_rule__UNL__Group__06636);
            rule__UNL__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UNL__Group__0


    // $ANTLR start rule__UNL__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3165:1: rule__UNL__Group__0__Impl : ( () ) ;
    public final void rule__UNL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3169:1: ( ( () ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3170:1: ( () )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3170:1: ( () )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3171:1: ()
            {
             before(grammarAccess.getUNLAccess().getUNLAction_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3172:1: ()
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3174:1: 
            {
            }

             after(grammarAccess.getUNLAccess().getUNLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UNL__Group__0__Impl


    // $ANTLR start rule__UNL__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3184:1: rule__UNL__Group__1 : rule__UNL__Group__1__Impl ;
    public final void rule__UNL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3188:1: ( rule__UNL__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3189:2: rule__UNL__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UNL__Group__1__Impl_in_rule__UNL__Group__16694);
            rule__UNL__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UNL__Group__1


    // $ANTLR start rule__UNL__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3195:1: rule__UNL__Group__1__Impl : ( 'UNL' ) ;
    public final void rule__UNL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3199:1: ( ( 'UNL' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3200:1: ( 'UNL' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3200:1: ( 'UNL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3201:1: 'UNL'
            {
             before(grammarAccess.getUNLAccess().getUNLKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__UNL__Group__1__Impl6722); 
             after(grammarAccess.getUNLAccess().getUNLKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UNL__Group__1__Impl


    // $ANTLR start rule__VAL__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3218:1: rule__VAL__Group__0 : rule__VAL__Group__0__Impl rule__VAL__Group__1 ;
    public final void rule__VAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3222:1: ( rule__VAL__Group__0__Impl rule__VAL__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3223:2: rule__VAL__Group__0__Impl rule__VAL__Group__1
            {
            pushFollow(FOLLOW_rule__VAL__Group__0__Impl_in_rule__VAL__Group__06757);
            rule__VAL__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VAL__Group__1_in_rule__VAL__Group__06760);
            rule__VAL__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VAL__Group__0


    // $ANTLR start rule__VAL__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3230:1: rule__VAL__Group__0__Impl : ( ( rule__VAL__ValueAssignment_0 ) ) ;
    public final void rule__VAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3234:1: ( ( ( rule__VAL__ValueAssignment_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3235:1: ( ( rule__VAL__ValueAssignment_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3235:1: ( ( rule__VAL__ValueAssignment_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3236:1: ( rule__VAL__ValueAssignment_0 )
            {
             before(grammarAccess.getVALAccess().getValueAssignment_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3237:1: ( rule__VAL__ValueAssignment_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3237:2: rule__VAL__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__VAL__ValueAssignment_0_in_rule__VAL__Group__0__Impl6787);
            rule__VAL__ValueAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getVALAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VAL__Group__0__Impl


    // $ANTLR start rule__VAL__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3247:1: rule__VAL__Group__1 : rule__VAL__Group__1__Impl ;
    public final void rule__VAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3251:1: ( rule__VAL__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3252:2: rule__VAL__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VAL__Group__1__Impl_in_rule__VAL__Group__16817);
            rule__VAL__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VAL__Group__1


    // $ANTLR start rule__VAL__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3258:1: rule__VAL__Group__1__Impl : ( ( rule__VAL__UnitAssignment_1 ) ) ;
    public final void rule__VAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3262:1: ( ( ( rule__VAL__UnitAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3263:1: ( ( rule__VAL__UnitAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3263:1: ( ( rule__VAL__UnitAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3264:1: ( rule__VAL__UnitAssignment_1 )
            {
             before(grammarAccess.getVALAccess().getUnitAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3265:1: ( rule__VAL__UnitAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3265:2: rule__VAL__UnitAssignment_1
            {
            pushFollow(FOLLOW_rule__VAL__UnitAssignment_1_in_rule__VAL__Group__1__Impl6844);
            rule__VAL__UnitAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVALAccess().getUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VAL__Group__1__Impl


    // $ANTLR start rule__V__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3279:1: rule__V__Group__0 : rule__V__Group__0__Impl rule__V__Group__1 ;
    public final void rule__V__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3283:1: ( rule__V__Group__0__Impl rule__V__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3284:2: rule__V__Group__0__Impl rule__V__Group__1
            {
            pushFollow(FOLLOW_rule__V__Group__0__Impl_in_rule__V__Group__06878);
            rule__V__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__V__Group__1_in_rule__V__Group__06881);
            rule__V__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__V__Group__0


    // $ANTLR start rule__V__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3291:1: rule__V__Group__0__Impl : ( 'V' ) ;
    public final void rule__V__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3295:1: ( ( 'V' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3296:1: ( 'V' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3296:1: ( 'V' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3297:1: 'V'
            {
             before(grammarAccess.getVAccess().getVKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__V__Group__0__Impl6909); 
             after(grammarAccess.getVAccess().getVKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__V__Group__0__Impl


    // $ANTLR start rule__V__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3310:1: rule__V__Group__1 : rule__V__Group__1__Impl ;
    public final void rule__V__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3314:1: ( rule__V__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3315:2: rule__V__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__V__Group__1__Impl_in_rule__V__Group__16940);
            rule__V__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__V__Group__1


    // $ANTLR start rule__V__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3321:1: rule__V__Group__1__Impl : ( ( rule__V__VsubAssignment_1 ) ) ;
    public final void rule__V__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3325:1: ( ( ( rule__V__VsubAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3326:1: ( ( rule__V__VsubAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3326:1: ( ( rule__V__VsubAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3327:1: ( rule__V__VsubAssignment_1 )
            {
             before(grammarAccess.getVAccess().getVsubAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3328:1: ( rule__V__VsubAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3328:2: rule__V__VsubAssignment_1
            {
            pushFollow(FOLLOW_rule__V__VsubAssignment_1_in_rule__V__Group__1__Impl6967);
            rule__V__VsubAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVAccess().getVsubAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__V__Group__1__Impl


    // $ANTLR start rule__Vsub__Group_0__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3342:1: rule__Vsub__Group_0__0 : rule__Vsub__Group_0__0__Impl rule__Vsub__Group_0__1 ;
    public final void rule__Vsub__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3346:1: ( rule__Vsub__Group_0__0__Impl rule__Vsub__Group_0__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3347:2: rule__Vsub__Group_0__0__Impl rule__Vsub__Group_0__1
            {
            pushFollow(FOLLOW_rule__Vsub__Group_0__0__Impl_in_rule__Vsub__Group_0__07001);
            rule__Vsub__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Vsub__Group_0__1_in_rule__Vsub__Group_0__07004);
            rule__Vsub__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Vsub__Group_0__0


    // $ANTLR start rule__Vsub__Group_0__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3354:1: rule__Vsub__Group_0__0__Impl : ( 'X=' ) ;
    public final void rule__Vsub__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3358:1: ( ( 'X=' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3359:1: ( 'X=' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3359:1: ( 'X=' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3360:1: 'X='
            {
             before(grammarAccess.getVsubAccess().getXKeyword_0_0()); 
            match(input,53,FOLLOW_53_in_rule__Vsub__Group_0__0__Impl7032); 
             after(grammarAccess.getVsubAccess().getXKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Vsub__Group_0__0__Impl


    // $ANTLR start rule__Vsub__Group_0__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3373:1: rule__Vsub__Group_0__1 : rule__Vsub__Group_0__1__Impl ;
    public final void rule__Vsub__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3377:1: ( rule__Vsub__Group_0__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3378:2: rule__Vsub__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Vsub__Group_0__1__Impl_in_rule__Vsub__Group_0__17063);
            rule__Vsub__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Vsub__Group_0__1


    // $ANTLR start rule__Vsub__Group_0__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3384:1: rule__Vsub__Group_0__1__Impl : ( ( rule__Vsub__XAssignment_0_1 ) ) ;
    public final void rule__Vsub__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3388:1: ( ( ( rule__Vsub__XAssignment_0_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3389:1: ( ( rule__Vsub__XAssignment_0_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3389:1: ( ( rule__Vsub__XAssignment_0_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3390:1: ( rule__Vsub__XAssignment_0_1 )
            {
             before(grammarAccess.getVsubAccess().getXAssignment_0_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3391:1: ( rule__Vsub__XAssignment_0_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3391:2: rule__Vsub__XAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Vsub__XAssignment_0_1_in_rule__Vsub__Group_0__1__Impl7090);
            rule__Vsub__XAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getVsubAccess().getXAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Vsub__Group_0__1__Impl


    // $ANTLR start rule__Vsub__Group_1__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3405:1: rule__Vsub__Group_1__0 : rule__Vsub__Group_1__0__Impl rule__Vsub__Group_1__1 ;
    public final void rule__Vsub__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3409:1: ( rule__Vsub__Group_1__0__Impl rule__Vsub__Group_1__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3410:2: rule__Vsub__Group_1__0__Impl rule__Vsub__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vsub__Group_1__0__Impl_in_rule__Vsub__Group_1__07124);
            rule__Vsub__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Vsub__Group_1__1_in_rule__Vsub__Group_1__07127);
            rule__Vsub__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Vsub__Group_1__0


    // $ANTLR start rule__Vsub__Group_1__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3417:1: rule__Vsub__Group_1__0__Impl : ( 'D=' ) ;
    public final void rule__Vsub__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3421:1: ( ( 'D=' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3422:1: ( 'D=' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3422:1: ( 'D=' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3423:1: 'D='
            {
             before(grammarAccess.getVsubAccess().getDKeyword_1_0()); 
            match(input,54,FOLLOW_54_in_rule__Vsub__Group_1__0__Impl7155); 
             after(grammarAccess.getVsubAccess().getDKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Vsub__Group_1__0__Impl


    // $ANTLR start rule__Vsub__Group_1__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3436:1: rule__Vsub__Group_1__1 : rule__Vsub__Group_1__1__Impl ;
    public final void rule__Vsub__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3440:1: ( rule__Vsub__Group_1__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3441:2: rule__Vsub__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Vsub__Group_1__1__Impl_in_rule__Vsub__Group_1__17186);
            rule__Vsub__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Vsub__Group_1__1


    // $ANTLR start rule__Vsub__Group_1__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3447:1: rule__Vsub__Group_1__1__Impl : ( ( rule__Vsub__DAssignment_1_1 ) ) ;
    public final void rule__Vsub__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3451:1: ( ( ( rule__Vsub__DAssignment_1_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3452:1: ( ( rule__Vsub__DAssignment_1_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3452:1: ( ( rule__Vsub__DAssignment_1_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3453:1: ( rule__Vsub__DAssignment_1_1 )
            {
             before(grammarAccess.getVsubAccess().getDAssignment_1_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3454:1: ( rule__Vsub__DAssignment_1_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3454:2: rule__Vsub__DAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Vsub__DAssignment_1_1_in_rule__Vsub__Group_1__1__Impl7213);
            rule__Vsub__DAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getVsubAccess().getDAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Vsub__Group_1__1__Impl


    // $ANTLR start rule__Plus__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3468:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3472:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3473:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_rule__Plus__Group__0__Impl_in_rule__Plus__Group__07247);
            rule__Plus__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Plus__Group__1_in_rule__Plus__Group__07250);
            rule__Plus__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plus__Group__0


    // $ANTLR start rule__Plus__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3480:1: rule__Plus__Group__0__Impl : ( () ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3484:1: ( ( () ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3485:1: ( () )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3485:1: ( () )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3486:1: ()
            {
             before(grammarAccess.getPlusAccess().getPlusAction_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3487:1: ()
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3489:1: 
            {
            }

             after(grammarAccess.getPlusAccess().getPlusAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plus__Group__0__Impl


    // $ANTLR start rule__Plus__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3499:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3503:1: ( rule__Plus__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3504:2: rule__Plus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Plus__Group__1__Impl_in_rule__Plus__Group__17308);
            rule__Plus__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plus__Group__1


    // $ANTLR start rule__Plus__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3510:1: rule__Plus__Group__1__Impl : ( '+' ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3514:1: ( ( '+' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3515:1: ( '+' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3515:1: ( '+' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3516:1: '+'
            {
             before(grammarAccess.getPlusAccess().getPlusSignKeyword_1()); 
            match(input,55,FOLLOW_55_in_rule__Plus__Group__1__Impl7336); 
             after(grammarAccess.getPlusAccess().getPlusSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Plus__Group__1__Impl


    // $ANTLR start rule__Minus__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3533:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3537:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3538:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_rule__Minus__Group__0__Impl_in_rule__Minus__Group__07371);
            rule__Minus__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Minus__Group__1_in_rule__Minus__Group__07374);
            rule__Minus__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__Group__0


    // $ANTLR start rule__Minus__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3545:1: rule__Minus__Group__0__Impl : ( () ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3549:1: ( ( () ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3550:1: ( () )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3550:1: ( () )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3551:1: ()
            {
             before(grammarAccess.getMinusAccess().getMinusAction_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3552:1: ()
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3554:1: 
            {
            }

             after(grammarAccess.getMinusAccess().getMinusAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__Group__0__Impl


    // $ANTLR start rule__Minus__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3564:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3568:1: ( rule__Minus__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3569:2: rule__Minus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Minus__Group__1__Impl_in_rule__Minus__Group__17432);
            rule__Minus__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__Group__1


    // $ANTLR start rule__Minus__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3575:1: rule__Minus__Group__1__Impl : ( '-' ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3579:1: ( ( '-' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3580:1: ( '-' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3580:1: ( '-' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3581:1: '-'
            {
             before(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1()); 
            match(input,56,FOLLOW_56_in_rule__Minus__Group__1__Impl7460); 
             after(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Minus__Group__1__Impl


    // $ANTLR start rule__DC__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3598:1: rule__DC__Group__0 : rule__DC__Group__0__Impl rule__DC__Group__1 ;
    public final void rule__DC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3602:1: ( rule__DC__Group__0__Impl rule__DC__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3603:2: rule__DC__Group__0__Impl rule__DC__Group__1
            {
            pushFollow(FOLLOW_rule__DC__Group__0__Impl_in_rule__DC__Group__07495);
            rule__DC__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DC__Group__1_in_rule__DC__Group__07498);
            rule__DC__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DC__Group__0


    // $ANTLR start rule__DC__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3610:1: rule__DC__Group__0__Impl : ( 'DC' ) ;
    public final void rule__DC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3614:1: ( ( 'DC' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3615:1: ( 'DC' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3615:1: ( 'DC' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3616:1: 'DC'
            {
             before(grammarAccess.getDCAccess().getDCKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__DC__Group__0__Impl7526); 
             after(grammarAccess.getDCAccess().getDCKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DC__Group__0__Impl


    // $ANTLR start rule__DC__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3629:1: rule__DC__Group__1 : rule__DC__Group__1__Impl ;
    public final void rule__DC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3633:1: ( rule__DC__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3634:2: rule__DC__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DC__Group__1__Impl_in_rule__DC__Group__17557);
            rule__DC__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DC__Group__1


    // $ANTLR start rule__DC__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3640:1: rule__DC__Group__1__Impl : ( ( rule__DC__RadiusAssignment_1 ) ) ;
    public final void rule__DC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3644:1: ( ( ( rule__DC__RadiusAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3645:1: ( ( rule__DC__RadiusAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3645:1: ( ( rule__DC__RadiusAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3646:1: ( rule__DC__RadiusAssignment_1 )
            {
             before(grammarAccess.getDCAccess().getRadiusAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3647:1: ( rule__DC__RadiusAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3647:2: rule__DC__RadiusAssignment_1
            {
            pushFollow(FOLLOW_rule__DC__RadiusAssignment_1_in_rule__DC__Group__1__Impl7584);
            rule__DC__RadiusAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDCAccess().getRadiusAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DC__Group__1__Impl


    // $ANTLR start rule__DP__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3661:1: rule__DP__Group__0 : rule__DP__Group__0__Impl rule__DP__Group__1 ;
    public final void rule__DP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3665:1: ( rule__DP__Group__0__Impl rule__DP__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3666:2: rule__DP__Group__0__Impl rule__DP__Group__1
            {
            pushFollow(FOLLOW_rule__DP__Group__0__Impl_in_rule__DP__Group__07618);
            rule__DP__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DP__Group__1_in_rule__DP__Group__07621);
            rule__DP__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DP__Group__0


    // $ANTLR start rule__DP__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3673:1: rule__DP__Group__0__Impl : ( 'DP' ) ;
    public final void rule__DP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3677:1: ( ( 'DP' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3678:1: ( 'DP' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3678:1: ( 'DP' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3679:1: 'DP'
            {
             before(grammarAccess.getDPAccess().getDPKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__DP__Group__0__Impl7649); 
             after(grammarAccess.getDPAccess().getDPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DP__Group__0__Impl


    // $ANTLR start rule__DP__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3692:1: rule__DP__Group__1 : rule__DP__Group__1__Impl ;
    public final void rule__DP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3696:1: ( rule__DP__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3697:2: rule__DP__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DP__Group__1__Impl_in_rule__DP__Group__17680);
            rule__DP__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DP__Group__1


    // $ANTLR start rule__DP__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3703:1: rule__DP__Group__1__Impl : ( ( rule__DP__DpAssignment_1 ) ) ;
    public final void rule__DP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3707:1: ( ( ( rule__DP__DpAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3708:1: ( ( rule__DP__DpAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3708:1: ( ( rule__DP__DpAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3709:1: ( rule__DP__DpAssignment_1 )
            {
             before(grammarAccess.getDPAccess().getDpAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3710:1: ( rule__DP__DpAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3710:2: rule__DP__DpAssignment_1
            {
            pushFollow(FOLLOW_rule__DP__DpAssignment_1_in_rule__DP__Group__1__Impl7707);
            rule__DP__DpAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDPAccess().getDpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DP__Group__1__Impl


    // $ANTLR start rule__Point1__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3724:1: rule__Point1__Group__0 : rule__Point1__Group__0__Impl rule__Point1__Group__1 ;
    public final void rule__Point1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3728:1: ( rule__Point1__Group__0__Impl rule__Point1__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3729:2: rule__Point1__Group__0__Impl rule__Point1__Group__1
            {
            pushFollow(FOLLOW_rule__Point1__Group__0__Impl_in_rule__Point1__Group__07741);
            rule__Point1__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point1__Group__1_in_rule__Point1__Group__07744);
            rule__Point1__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__0


    // $ANTLR start rule__Point1__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3736:1: rule__Point1__Group__0__Impl : ( ( rule__Point1__LongDAssignment_0 ) ) ;
    public final void rule__Point1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3740:1: ( ( ( rule__Point1__LongDAssignment_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3741:1: ( ( rule__Point1__LongDAssignment_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3741:1: ( ( rule__Point1__LongDAssignment_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3742:1: ( rule__Point1__LongDAssignment_0 )
            {
             before(grammarAccess.getPoint1Access().getLongDAssignment_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3743:1: ( rule__Point1__LongDAssignment_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3743:2: rule__Point1__LongDAssignment_0
            {
            pushFollow(FOLLOW_rule__Point1__LongDAssignment_0_in_rule__Point1__Group__0__Impl7771);
            rule__Point1__LongDAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPoint1Access().getLongDAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__0__Impl


    // $ANTLR start rule__Point1__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3753:1: rule__Point1__Group__1 : rule__Point1__Group__1__Impl rule__Point1__Group__2 ;
    public final void rule__Point1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3757:1: ( rule__Point1__Group__1__Impl rule__Point1__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3758:2: rule__Point1__Group__1__Impl rule__Point1__Group__2
            {
            pushFollow(FOLLOW_rule__Point1__Group__1__Impl_in_rule__Point1__Group__17801);
            rule__Point1__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point1__Group__2_in_rule__Point1__Group__17804);
            rule__Point1__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__1


    // $ANTLR start rule__Point1__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3765:1: rule__Point1__Group__1__Impl : ( ( rule__Point1__LongMAssignment_1 ) ) ;
    public final void rule__Point1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3769:1: ( ( ( rule__Point1__LongMAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3770:1: ( ( rule__Point1__LongMAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3770:1: ( ( rule__Point1__LongMAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3771:1: ( rule__Point1__LongMAssignment_1 )
            {
             before(grammarAccess.getPoint1Access().getLongMAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3772:1: ( rule__Point1__LongMAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3772:2: rule__Point1__LongMAssignment_1
            {
            pushFollow(FOLLOW_rule__Point1__LongMAssignment_1_in_rule__Point1__Group__1__Impl7831);
            rule__Point1__LongMAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPoint1Access().getLongMAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__1__Impl


    // $ANTLR start rule__Point1__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3782:1: rule__Point1__Group__2 : rule__Point1__Group__2__Impl rule__Point1__Group__3 ;
    public final void rule__Point1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3786:1: ( rule__Point1__Group__2__Impl rule__Point1__Group__3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3787:2: rule__Point1__Group__2__Impl rule__Point1__Group__3
            {
            pushFollow(FOLLOW_rule__Point1__Group__2__Impl_in_rule__Point1__Group__27861);
            rule__Point1__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point1__Group__3_in_rule__Point1__Group__27864);
            rule__Point1__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__2


    // $ANTLR start rule__Point1__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3794:1: rule__Point1__Group__2__Impl : ( ( rule__Point1__LongSAssignment_2 ) ) ;
    public final void rule__Point1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3798:1: ( ( ( rule__Point1__LongSAssignment_2 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3799:1: ( ( rule__Point1__LongSAssignment_2 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3799:1: ( ( rule__Point1__LongSAssignment_2 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3800:1: ( rule__Point1__LongSAssignment_2 )
            {
             before(grammarAccess.getPoint1Access().getLongSAssignment_2()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3801:1: ( rule__Point1__LongSAssignment_2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3801:2: rule__Point1__LongSAssignment_2
            {
            pushFollow(FOLLOW_rule__Point1__LongSAssignment_2_in_rule__Point1__Group__2__Impl7891);
            rule__Point1__LongSAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPoint1Access().getLongSAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__2__Impl


    // $ANTLR start rule__Point1__Group__3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3811:1: rule__Point1__Group__3 : rule__Point1__Group__3__Impl rule__Point1__Group__4 ;
    public final void rule__Point1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3815:1: ( rule__Point1__Group__3__Impl rule__Point1__Group__4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3816:2: rule__Point1__Group__3__Impl rule__Point1__Group__4
            {
            pushFollow(FOLLOW_rule__Point1__Group__3__Impl_in_rule__Point1__Group__37921);
            rule__Point1__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point1__Group__4_in_rule__Point1__Group__37924);
            rule__Point1__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__3


    // $ANTLR start rule__Point1__Group__3__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3823:1: rule__Point1__Group__3__Impl : ( ( rule__Point1__NsAssignment_3 ) ) ;
    public final void rule__Point1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3827:1: ( ( ( rule__Point1__NsAssignment_3 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3828:1: ( ( rule__Point1__NsAssignment_3 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3828:1: ( ( rule__Point1__NsAssignment_3 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3829:1: ( rule__Point1__NsAssignment_3 )
            {
             before(grammarAccess.getPoint1Access().getNsAssignment_3()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3830:1: ( rule__Point1__NsAssignment_3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3830:2: rule__Point1__NsAssignment_3
            {
            pushFollow(FOLLOW_rule__Point1__NsAssignment_3_in_rule__Point1__Group__3__Impl7951);
            rule__Point1__NsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPoint1Access().getNsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__3__Impl


    // $ANTLR start rule__Point1__Group__4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3840:1: rule__Point1__Group__4 : rule__Point1__Group__4__Impl rule__Point1__Group__5 ;
    public final void rule__Point1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3844:1: ( rule__Point1__Group__4__Impl rule__Point1__Group__5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3845:2: rule__Point1__Group__4__Impl rule__Point1__Group__5
            {
            pushFollow(FOLLOW_rule__Point1__Group__4__Impl_in_rule__Point1__Group__47981);
            rule__Point1__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point1__Group__5_in_rule__Point1__Group__47984);
            rule__Point1__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__4


    // $ANTLR start rule__Point1__Group__4__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3852:1: rule__Point1__Group__4__Impl : ( ( rule__Point1__LatDAssignment_4 ) ) ;
    public final void rule__Point1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3856:1: ( ( ( rule__Point1__LatDAssignment_4 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3857:1: ( ( rule__Point1__LatDAssignment_4 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3857:1: ( ( rule__Point1__LatDAssignment_4 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3858:1: ( rule__Point1__LatDAssignment_4 )
            {
             before(grammarAccess.getPoint1Access().getLatDAssignment_4()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3859:1: ( rule__Point1__LatDAssignment_4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3859:2: rule__Point1__LatDAssignment_4
            {
            pushFollow(FOLLOW_rule__Point1__LatDAssignment_4_in_rule__Point1__Group__4__Impl8011);
            rule__Point1__LatDAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getPoint1Access().getLatDAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__4__Impl


    // $ANTLR start rule__Point1__Group__5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3869:1: rule__Point1__Group__5 : rule__Point1__Group__5__Impl rule__Point1__Group__6 ;
    public final void rule__Point1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3873:1: ( rule__Point1__Group__5__Impl rule__Point1__Group__6 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3874:2: rule__Point1__Group__5__Impl rule__Point1__Group__6
            {
            pushFollow(FOLLOW_rule__Point1__Group__5__Impl_in_rule__Point1__Group__58041);
            rule__Point1__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point1__Group__6_in_rule__Point1__Group__58044);
            rule__Point1__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__5


    // $ANTLR start rule__Point1__Group__5__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3881:1: rule__Point1__Group__5__Impl : ( ( rule__Point1__LatMAssignment_5 ) ) ;
    public final void rule__Point1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3885:1: ( ( ( rule__Point1__LatMAssignment_5 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3886:1: ( ( rule__Point1__LatMAssignment_5 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3886:1: ( ( rule__Point1__LatMAssignment_5 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3887:1: ( rule__Point1__LatMAssignment_5 )
            {
             before(grammarAccess.getPoint1Access().getLatMAssignment_5()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3888:1: ( rule__Point1__LatMAssignment_5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3888:2: rule__Point1__LatMAssignment_5
            {
            pushFollow(FOLLOW_rule__Point1__LatMAssignment_5_in_rule__Point1__Group__5__Impl8071);
            rule__Point1__LatMAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPoint1Access().getLatMAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__5__Impl


    // $ANTLR start rule__Point1__Group__6
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3898:1: rule__Point1__Group__6 : rule__Point1__Group__6__Impl rule__Point1__Group__7 ;
    public final void rule__Point1__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3902:1: ( rule__Point1__Group__6__Impl rule__Point1__Group__7 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3903:2: rule__Point1__Group__6__Impl rule__Point1__Group__7
            {
            pushFollow(FOLLOW_rule__Point1__Group__6__Impl_in_rule__Point1__Group__68101);
            rule__Point1__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point1__Group__7_in_rule__Point1__Group__68104);
            rule__Point1__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__6


    // $ANTLR start rule__Point1__Group__6__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3910:1: rule__Point1__Group__6__Impl : ( ( rule__Point1__LatSAssignment_6 ) ) ;
    public final void rule__Point1__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3914:1: ( ( ( rule__Point1__LatSAssignment_6 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3915:1: ( ( rule__Point1__LatSAssignment_6 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3915:1: ( ( rule__Point1__LatSAssignment_6 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3916:1: ( rule__Point1__LatSAssignment_6 )
            {
             before(grammarAccess.getPoint1Access().getLatSAssignment_6()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3917:1: ( rule__Point1__LatSAssignment_6 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3917:2: rule__Point1__LatSAssignment_6
            {
            pushFollow(FOLLOW_rule__Point1__LatSAssignment_6_in_rule__Point1__Group__6__Impl8131);
            rule__Point1__LatSAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getPoint1Access().getLatSAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__6__Impl


    // $ANTLR start rule__Point1__Group__7
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3927:1: rule__Point1__Group__7 : rule__Point1__Group__7__Impl ;
    public final void rule__Point1__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3931:1: ( rule__Point1__Group__7__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3932:2: rule__Point1__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Point1__Group__7__Impl_in_rule__Point1__Group__78161);
            rule__Point1__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__7


    // $ANTLR start rule__Point1__Group__7__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3938:1: rule__Point1__Group__7__Impl : ( ( rule__Point1__WeAssignment_7 ) ) ;
    public final void rule__Point1__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3942:1: ( ( ( rule__Point1__WeAssignment_7 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3943:1: ( ( rule__Point1__WeAssignment_7 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3943:1: ( ( rule__Point1__WeAssignment_7 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3944:1: ( rule__Point1__WeAssignment_7 )
            {
             before(grammarAccess.getPoint1Access().getWeAssignment_7()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3945:1: ( rule__Point1__WeAssignment_7 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3945:2: rule__Point1__WeAssignment_7
            {
            pushFollow(FOLLOW_rule__Point1__WeAssignment_7_in_rule__Point1__Group__7__Impl8188);
            rule__Point1__WeAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getPoint1Access().getWeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__Group__7__Impl


    // $ANTLR start rule__Point2__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3971:1: rule__Point2__Group__0 : rule__Point2__Group__0__Impl rule__Point2__Group__1 ;
    public final void rule__Point2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3975:1: ( rule__Point2__Group__0__Impl rule__Point2__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3976:2: rule__Point2__Group__0__Impl rule__Point2__Group__1
            {
            pushFollow(FOLLOW_rule__Point2__Group__0__Impl_in_rule__Point2__Group__08234);
            rule__Point2__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point2__Group__1_in_rule__Point2__Group__08237);
            rule__Point2__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__0


    // $ANTLR start rule__Point2__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3983:1: rule__Point2__Group__0__Impl : ( ( rule__Point2__LongDAssignment_0 ) ) ;
    public final void rule__Point2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3987:1: ( ( ( rule__Point2__LongDAssignment_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3988:1: ( ( rule__Point2__LongDAssignment_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3988:1: ( ( rule__Point2__LongDAssignment_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3989:1: ( rule__Point2__LongDAssignment_0 )
            {
             before(grammarAccess.getPoint2Access().getLongDAssignment_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3990:1: ( rule__Point2__LongDAssignment_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:3990:2: rule__Point2__LongDAssignment_0
            {
            pushFollow(FOLLOW_rule__Point2__LongDAssignment_0_in_rule__Point2__Group__0__Impl8264);
            rule__Point2__LongDAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPoint2Access().getLongDAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__0__Impl


    // $ANTLR start rule__Point2__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4000:1: rule__Point2__Group__1 : rule__Point2__Group__1__Impl rule__Point2__Group__2 ;
    public final void rule__Point2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4004:1: ( rule__Point2__Group__1__Impl rule__Point2__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4005:2: rule__Point2__Group__1__Impl rule__Point2__Group__2
            {
            pushFollow(FOLLOW_rule__Point2__Group__1__Impl_in_rule__Point2__Group__18294);
            rule__Point2__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point2__Group__2_in_rule__Point2__Group__18297);
            rule__Point2__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__1


    // $ANTLR start rule__Point2__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4012:1: rule__Point2__Group__1__Impl : ( ( rule__Point2__LongMfAssignment_1 ) ) ;
    public final void rule__Point2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4016:1: ( ( ( rule__Point2__LongMfAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4017:1: ( ( rule__Point2__LongMfAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4017:1: ( ( rule__Point2__LongMfAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4018:1: ( rule__Point2__LongMfAssignment_1 )
            {
             before(grammarAccess.getPoint2Access().getLongMfAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4019:1: ( rule__Point2__LongMfAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4019:2: rule__Point2__LongMfAssignment_1
            {
            pushFollow(FOLLOW_rule__Point2__LongMfAssignment_1_in_rule__Point2__Group__1__Impl8324);
            rule__Point2__LongMfAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPoint2Access().getLongMfAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__1__Impl


    // $ANTLR start rule__Point2__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4029:1: rule__Point2__Group__2 : rule__Point2__Group__2__Impl rule__Point2__Group__3 ;
    public final void rule__Point2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4033:1: ( rule__Point2__Group__2__Impl rule__Point2__Group__3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4034:2: rule__Point2__Group__2__Impl rule__Point2__Group__3
            {
            pushFollow(FOLLOW_rule__Point2__Group__2__Impl_in_rule__Point2__Group__28354);
            rule__Point2__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point2__Group__3_in_rule__Point2__Group__28357);
            rule__Point2__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__2


    // $ANTLR start rule__Point2__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4041:1: rule__Point2__Group__2__Impl : ( ( rule__Point2__NsAssignment_2 ) ) ;
    public final void rule__Point2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4045:1: ( ( ( rule__Point2__NsAssignment_2 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4046:1: ( ( rule__Point2__NsAssignment_2 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4046:1: ( ( rule__Point2__NsAssignment_2 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4047:1: ( rule__Point2__NsAssignment_2 )
            {
             before(grammarAccess.getPoint2Access().getNsAssignment_2()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4048:1: ( rule__Point2__NsAssignment_2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4048:2: rule__Point2__NsAssignment_2
            {
            pushFollow(FOLLOW_rule__Point2__NsAssignment_2_in_rule__Point2__Group__2__Impl8384);
            rule__Point2__NsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPoint2Access().getNsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__2__Impl


    // $ANTLR start rule__Point2__Group__3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4058:1: rule__Point2__Group__3 : rule__Point2__Group__3__Impl rule__Point2__Group__4 ;
    public final void rule__Point2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4062:1: ( rule__Point2__Group__3__Impl rule__Point2__Group__4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4063:2: rule__Point2__Group__3__Impl rule__Point2__Group__4
            {
            pushFollow(FOLLOW_rule__Point2__Group__3__Impl_in_rule__Point2__Group__38414);
            rule__Point2__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point2__Group__4_in_rule__Point2__Group__38417);
            rule__Point2__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__3


    // $ANTLR start rule__Point2__Group__3__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4070:1: rule__Point2__Group__3__Impl : ( ( rule__Point2__LatDAssignment_3 ) ) ;
    public final void rule__Point2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4074:1: ( ( ( rule__Point2__LatDAssignment_3 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4075:1: ( ( rule__Point2__LatDAssignment_3 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4075:1: ( ( rule__Point2__LatDAssignment_3 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4076:1: ( rule__Point2__LatDAssignment_3 )
            {
             before(grammarAccess.getPoint2Access().getLatDAssignment_3()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4077:1: ( rule__Point2__LatDAssignment_3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4077:2: rule__Point2__LatDAssignment_3
            {
            pushFollow(FOLLOW_rule__Point2__LatDAssignment_3_in_rule__Point2__Group__3__Impl8444);
            rule__Point2__LatDAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPoint2Access().getLatDAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__3__Impl


    // $ANTLR start rule__Point2__Group__4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4087:1: rule__Point2__Group__4 : rule__Point2__Group__4__Impl rule__Point2__Group__5 ;
    public final void rule__Point2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4091:1: ( rule__Point2__Group__4__Impl rule__Point2__Group__5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4092:2: rule__Point2__Group__4__Impl rule__Point2__Group__5
            {
            pushFollow(FOLLOW_rule__Point2__Group__4__Impl_in_rule__Point2__Group__48474);
            rule__Point2__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point2__Group__5_in_rule__Point2__Group__48477);
            rule__Point2__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__4


    // $ANTLR start rule__Point2__Group__4__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4099:1: rule__Point2__Group__4__Impl : ( ( rule__Point2__LatMfAssignment_4 ) ) ;
    public final void rule__Point2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4103:1: ( ( ( rule__Point2__LatMfAssignment_4 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4104:1: ( ( rule__Point2__LatMfAssignment_4 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4104:1: ( ( rule__Point2__LatMfAssignment_4 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4105:1: ( rule__Point2__LatMfAssignment_4 )
            {
             before(grammarAccess.getPoint2Access().getLatMfAssignment_4()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4106:1: ( rule__Point2__LatMfAssignment_4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4106:2: rule__Point2__LatMfAssignment_4
            {
            pushFollow(FOLLOW_rule__Point2__LatMfAssignment_4_in_rule__Point2__Group__4__Impl8504);
            rule__Point2__LatMfAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getPoint2Access().getLatMfAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__4__Impl


    // $ANTLR start rule__Point2__Group__5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4116:1: rule__Point2__Group__5 : rule__Point2__Group__5__Impl ;
    public final void rule__Point2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4120:1: ( rule__Point2__Group__5__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4121:2: rule__Point2__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Point2__Group__5__Impl_in_rule__Point2__Group__58534);
            rule__Point2__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__5


    // $ANTLR start rule__Point2__Group__5__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4127:1: rule__Point2__Group__5__Impl : ( ( rule__Point2__WeAssignment_5 ) ) ;
    public final void rule__Point2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4131:1: ( ( ( rule__Point2__WeAssignment_5 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4132:1: ( ( rule__Point2__WeAssignment_5 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4132:1: ( ( rule__Point2__WeAssignment_5 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4133:1: ( rule__Point2__WeAssignment_5 )
            {
             before(grammarAccess.getPoint2Access().getWeAssignment_5()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4134:1: ( rule__Point2__WeAssignment_5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4134:2: rule__Point2__WeAssignment_5
            {
            pushFollow(FOLLOW_rule__Point2__WeAssignment_5_in_rule__Point2__Group__5__Impl8561);
            rule__Point2__WeAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPoint2Access().getWeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__Group__5__Impl


    // $ANTLR start rule__Point3__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4156:1: rule__Point3__Group__0 : rule__Point3__Group__0__Impl rule__Point3__Group__1 ;
    public final void rule__Point3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4160:1: ( rule__Point3__Group__0__Impl rule__Point3__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4161:2: rule__Point3__Group__0__Impl rule__Point3__Group__1
            {
            pushFollow(FOLLOW_rule__Point3__Group__0__Impl_in_rule__Point3__Group__08603);
            rule__Point3__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point3__Group__1_in_rule__Point3__Group__08606);
            rule__Point3__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__0


    // $ANTLR start rule__Point3__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4168:1: rule__Point3__Group__0__Impl : ( ( rule__Point3__LongDAssignment_0 ) ) ;
    public final void rule__Point3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4172:1: ( ( ( rule__Point3__LongDAssignment_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4173:1: ( ( rule__Point3__LongDAssignment_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4173:1: ( ( rule__Point3__LongDAssignment_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4174:1: ( rule__Point3__LongDAssignment_0 )
            {
             before(grammarAccess.getPoint3Access().getLongDAssignment_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4175:1: ( rule__Point3__LongDAssignment_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4175:2: rule__Point3__LongDAssignment_0
            {
            pushFollow(FOLLOW_rule__Point3__LongDAssignment_0_in_rule__Point3__Group__0__Impl8633);
            rule__Point3__LongDAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPoint3Access().getLongDAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__0__Impl


    // $ANTLR start rule__Point3__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4185:1: rule__Point3__Group__1 : rule__Point3__Group__1__Impl rule__Point3__Group__2 ;
    public final void rule__Point3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4189:1: ( rule__Point3__Group__1__Impl rule__Point3__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4190:2: rule__Point3__Group__1__Impl rule__Point3__Group__2
            {
            pushFollow(FOLLOW_rule__Point3__Group__1__Impl_in_rule__Point3__Group__18663);
            rule__Point3__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point3__Group__2_in_rule__Point3__Group__18666);
            rule__Point3__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__1


    // $ANTLR start rule__Point3__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4197:1: rule__Point3__Group__1__Impl : ( ( rule__Point3__LongMAssignment_1 ) ) ;
    public final void rule__Point3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4201:1: ( ( ( rule__Point3__LongMAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4202:1: ( ( rule__Point3__LongMAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4202:1: ( ( rule__Point3__LongMAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4203:1: ( rule__Point3__LongMAssignment_1 )
            {
             before(grammarAccess.getPoint3Access().getLongMAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4204:1: ( rule__Point3__LongMAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4204:2: rule__Point3__LongMAssignment_1
            {
            pushFollow(FOLLOW_rule__Point3__LongMAssignment_1_in_rule__Point3__Group__1__Impl8693);
            rule__Point3__LongMAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPoint3Access().getLongMAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__1__Impl


    // $ANTLR start rule__Point3__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4214:1: rule__Point3__Group__2 : rule__Point3__Group__2__Impl rule__Point3__Group__3 ;
    public final void rule__Point3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4218:1: ( rule__Point3__Group__2__Impl rule__Point3__Group__3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4219:2: rule__Point3__Group__2__Impl rule__Point3__Group__3
            {
            pushFollow(FOLLOW_rule__Point3__Group__2__Impl_in_rule__Point3__Group__28723);
            rule__Point3__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point3__Group__3_in_rule__Point3__Group__28726);
            rule__Point3__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__2


    // $ANTLR start rule__Point3__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4226:1: rule__Point3__Group__2__Impl : ( ( rule__Point3__LongSAssignment_2 ) ) ;
    public final void rule__Point3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4230:1: ( ( ( rule__Point3__LongSAssignment_2 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4231:1: ( ( rule__Point3__LongSAssignment_2 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4231:1: ( ( rule__Point3__LongSAssignment_2 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4232:1: ( rule__Point3__LongSAssignment_2 )
            {
             before(grammarAccess.getPoint3Access().getLongSAssignment_2()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4233:1: ( rule__Point3__LongSAssignment_2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4233:2: rule__Point3__LongSAssignment_2
            {
            pushFollow(FOLLOW_rule__Point3__LongSAssignment_2_in_rule__Point3__Group__2__Impl8753);
            rule__Point3__LongSAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPoint3Access().getLongSAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__2__Impl


    // $ANTLR start rule__Point3__Group__3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4243:1: rule__Point3__Group__3 : rule__Point3__Group__3__Impl rule__Point3__Group__4 ;
    public final void rule__Point3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4247:1: ( rule__Point3__Group__3__Impl rule__Point3__Group__4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4248:2: rule__Point3__Group__3__Impl rule__Point3__Group__4
            {
            pushFollow(FOLLOW_rule__Point3__Group__3__Impl_in_rule__Point3__Group__38783);
            rule__Point3__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point3__Group__4_in_rule__Point3__Group__38786);
            rule__Point3__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__3


    // $ANTLR start rule__Point3__Group__3__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4255:1: rule__Point3__Group__3__Impl : ( ( rule__Point3__NsAssignment_3 ) ) ;
    public final void rule__Point3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4259:1: ( ( ( rule__Point3__NsAssignment_3 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4260:1: ( ( rule__Point3__NsAssignment_3 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4260:1: ( ( rule__Point3__NsAssignment_3 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4261:1: ( rule__Point3__NsAssignment_3 )
            {
             before(grammarAccess.getPoint3Access().getNsAssignment_3()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4262:1: ( rule__Point3__NsAssignment_3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4262:2: rule__Point3__NsAssignment_3
            {
            pushFollow(FOLLOW_rule__Point3__NsAssignment_3_in_rule__Point3__Group__3__Impl8813);
            rule__Point3__NsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPoint3Access().getNsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__3__Impl


    // $ANTLR start rule__Point3__Group__4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4272:1: rule__Point3__Group__4 : rule__Point3__Group__4__Impl rule__Point3__Group__5 ;
    public final void rule__Point3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4276:1: ( rule__Point3__Group__4__Impl rule__Point3__Group__5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4277:2: rule__Point3__Group__4__Impl rule__Point3__Group__5
            {
            pushFollow(FOLLOW_rule__Point3__Group__4__Impl_in_rule__Point3__Group__48843);
            rule__Point3__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point3__Group__5_in_rule__Point3__Group__48846);
            rule__Point3__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__4


    // $ANTLR start rule__Point3__Group__4__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4284:1: rule__Point3__Group__4__Impl : ( ( rule__Point3__LatDAssignment_4 ) ) ;
    public final void rule__Point3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4288:1: ( ( ( rule__Point3__LatDAssignment_4 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4289:1: ( ( rule__Point3__LatDAssignment_4 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4289:1: ( ( rule__Point3__LatDAssignment_4 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4290:1: ( rule__Point3__LatDAssignment_4 )
            {
             before(grammarAccess.getPoint3Access().getLatDAssignment_4()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4291:1: ( rule__Point3__LatDAssignment_4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4291:2: rule__Point3__LatDAssignment_4
            {
            pushFollow(FOLLOW_rule__Point3__LatDAssignment_4_in_rule__Point3__Group__4__Impl8873);
            rule__Point3__LatDAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getPoint3Access().getLatDAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__4__Impl


    // $ANTLR start rule__Point3__Group__5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4301:1: rule__Point3__Group__5 : rule__Point3__Group__5__Impl rule__Point3__Group__6 ;
    public final void rule__Point3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4305:1: ( rule__Point3__Group__5__Impl rule__Point3__Group__6 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4306:2: rule__Point3__Group__5__Impl rule__Point3__Group__6
            {
            pushFollow(FOLLOW_rule__Point3__Group__5__Impl_in_rule__Point3__Group__58903);
            rule__Point3__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point3__Group__6_in_rule__Point3__Group__58906);
            rule__Point3__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__5


    // $ANTLR start rule__Point3__Group__5__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4313:1: rule__Point3__Group__5__Impl : ( ( rule__Point3__LatMAssignment_5 ) ) ;
    public final void rule__Point3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4317:1: ( ( ( rule__Point3__LatMAssignment_5 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4318:1: ( ( rule__Point3__LatMAssignment_5 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4318:1: ( ( rule__Point3__LatMAssignment_5 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4319:1: ( rule__Point3__LatMAssignment_5 )
            {
             before(grammarAccess.getPoint3Access().getLatMAssignment_5()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4320:1: ( rule__Point3__LatMAssignment_5 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4320:2: rule__Point3__LatMAssignment_5
            {
            pushFollow(FOLLOW_rule__Point3__LatMAssignment_5_in_rule__Point3__Group__5__Impl8933);
            rule__Point3__LatMAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPoint3Access().getLatMAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__5__Impl


    // $ANTLR start rule__Point3__Group__6
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4330:1: rule__Point3__Group__6 : rule__Point3__Group__6__Impl rule__Point3__Group__7 ;
    public final void rule__Point3__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4334:1: ( rule__Point3__Group__6__Impl rule__Point3__Group__7 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4335:2: rule__Point3__Group__6__Impl rule__Point3__Group__7
            {
            pushFollow(FOLLOW_rule__Point3__Group__6__Impl_in_rule__Point3__Group__68963);
            rule__Point3__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point3__Group__7_in_rule__Point3__Group__68966);
            rule__Point3__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__6


    // $ANTLR start rule__Point3__Group__6__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4342:1: rule__Point3__Group__6__Impl : ( ( rule__Point3__LatSAssignment_6 ) ) ;
    public final void rule__Point3__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4346:1: ( ( ( rule__Point3__LatSAssignment_6 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4347:1: ( ( rule__Point3__LatSAssignment_6 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4347:1: ( ( rule__Point3__LatSAssignment_6 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4348:1: ( rule__Point3__LatSAssignment_6 )
            {
             before(grammarAccess.getPoint3Access().getLatSAssignment_6()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4349:1: ( rule__Point3__LatSAssignment_6 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4349:2: rule__Point3__LatSAssignment_6
            {
            pushFollow(FOLLOW_rule__Point3__LatSAssignment_6_in_rule__Point3__Group__6__Impl8993);
            rule__Point3__LatSAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getPoint3Access().getLatSAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__6__Impl


    // $ANTLR start rule__Point3__Group__7
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4359:1: rule__Point3__Group__7 : rule__Point3__Group__7__Impl ;
    public final void rule__Point3__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4363:1: ( rule__Point3__Group__7__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4364:2: rule__Point3__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Point3__Group__7__Impl_in_rule__Point3__Group__79023);
            rule__Point3__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__7


    // $ANTLR start rule__Point3__Group__7__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4370:1: rule__Point3__Group__7__Impl : ( ( rule__Point3__WeAssignment_7 ) ) ;
    public final void rule__Point3__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4374:1: ( ( ( rule__Point3__WeAssignment_7 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4375:1: ( ( rule__Point3__WeAssignment_7 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4375:1: ( ( rule__Point3__WeAssignment_7 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4376:1: ( rule__Point3__WeAssignment_7 )
            {
             before(grammarAccess.getPoint3Access().getWeAssignment_7()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4377:1: ( rule__Point3__WeAssignment_7 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4377:2: rule__Point3__WeAssignment_7
            {
            pushFollow(FOLLOW_rule__Point3__WeAssignment_7_in_rule__Point3__Group__7__Impl9050);
            rule__Point3__WeAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getPoint3Access().getWeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__Group__7__Impl


    // $ANTLR start rule__Point4__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4403:1: rule__Point4__Group__0 : rule__Point4__Group__0__Impl rule__Point4__Group__1 ;
    public final void rule__Point4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4407:1: ( rule__Point4__Group__0__Impl rule__Point4__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4408:2: rule__Point4__Group__0__Impl rule__Point4__Group__1
            {
            pushFollow(FOLLOW_rule__Point4__Group__0__Impl_in_rule__Point4__Group__09096);
            rule__Point4__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point4__Group__1_in_rule__Point4__Group__09099);
            rule__Point4__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__Group__0


    // $ANTLR start rule__Point4__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4415:1: rule__Point4__Group__0__Impl : ( ( rule__Point4__LongDAssignment_0 ) ) ;
    public final void rule__Point4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4419:1: ( ( ( rule__Point4__LongDAssignment_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4420:1: ( ( rule__Point4__LongDAssignment_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4420:1: ( ( rule__Point4__LongDAssignment_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4421:1: ( rule__Point4__LongDAssignment_0 )
            {
             before(grammarAccess.getPoint4Access().getLongDAssignment_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4422:1: ( rule__Point4__LongDAssignment_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4422:2: rule__Point4__LongDAssignment_0
            {
            pushFollow(FOLLOW_rule__Point4__LongDAssignment_0_in_rule__Point4__Group__0__Impl9126);
            rule__Point4__LongDAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPoint4Access().getLongDAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__Group__0__Impl


    // $ANTLR start rule__Point4__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4432:1: rule__Point4__Group__1 : rule__Point4__Group__1__Impl rule__Point4__Group__2 ;
    public final void rule__Point4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4436:1: ( rule__Point4__Group__1__Impl rule__Point4__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4437:2: rule__Point4__Group__1__Impl rule__Point4__Group__2
            {
            pushFollow(FOLLOW_rule__Point4__Group__1__Impl_in_rule__Point4__Group__19156);
            rule__Point4__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point4__Group__2_in_rule__Point4__Group__19159);
            rule__Point4__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__Group__1


    // $ANTLR start rule__Point4__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4444:1: rule__Point4__Group__1__Impl : ( ( rule__Point4__NsAssignment_1 ) ) ;
    public final void rule__Point4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4448:1: ( ( ( rule__Point4__NsAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4449:1: ( ( rule__Point4__NsAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4449:1: ( ( rule__Point4__NsAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4450:1: ( rule__Point4__NsAssignment_1 )
            {
             before(grammarAccess.getPoint4Access().getNsAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4451:1: ( rule__Point4__NsAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4451:2: rule__Point4__NsAssignment_1
            {
            pushFollow(FOLLOW_rule__Point4__NsAssignment_1_in_rule__Point4__Group__1__Impl9186);
            rule__Point4__NsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPoint4Access().getNsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__Group__1__Impl


    // $ANTLR start rule__Point4__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4461:1: rule__Point4__Group__2 : rule__Point4__Group__2__Impl rule__Point4__Group__3 ;
    public final void rule__Point4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4465:1: ( rule__Point4__Group__2__Impl rule__Point4__Group__3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4466:2: rule__Point4__Group__2__Impl rule__Point4__Group__3
            {
            pushFollow(FOLLOW_rule__Point4__Group__2__Impl_in_rule__Point4__Group__29216);
            rule__Point4__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Point4__Group__3_in_rule__Point4__Group__29219);
            rule__Point4__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__Group__2


    // $ANTLR start rule__Point4__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4473:1: rule__Point4__Group__2__Impl : ( ( rule__Point4__LatDAssignment_2 ) ) ;
    public final void rule__Point4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4477:1: ( ( ( rule__Point4__LatDAssignment_2 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4478:1: ( ( rule__Point4__LatDAssignment_2 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4478:1: ( ( rule__Point4__LatDAssignment_2 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4479:1: ( rule__Point4__LatDAssignment_2 )
            {
             before(grammarAccess.getPoint4Access().getLatDAssignment_2()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4480:1: ( rule__Point4__LatDAssignment_2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4480:2: rule__Point4__LatDAssignment_2
            {
            pushFollow(FOLLOW_rule__Point4__LatDAssignment_2_in_rule__Point4__Group__2__Impl9246);
            rule__Point4__LatDAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPoint4Access().getLatDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__Group__2__Impl


    // $ANTLR start rule__Point4__Group__3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4490:1: rule__Point4__Group__3 : rule__Point4__Group__3__Impl ;
    public final void rule__Point4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4494:1: ( rule__Point4__Group__3__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4495:2: rule__Point4__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Point4__Group__3__Impl_in_rule__Point4__Group__39276);
            rule__Point4__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__Group__3


    // $ANTLR start rule__Point4__Group__3__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4501:1: rule__Point4__Group__3__Impl : ( ( rule__Point4__WeAssignment_3 ) ) ;
    public final void rule__Point4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4505:1: ( ( ( rule__Point4__WeAssignment_3 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4506:1: ( ( rule__Point4__WeAssignment_3 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4506:1: ( ( rule__Point4__WeAssignment_3 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4507:1: ( rule__Point4__WeAssignment_3 )
            {
             before(grammarAccess.getPoint4Access().getWeAssignment_3()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4508:1: ( rule__Point4__WeAssignment_3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4508:2: rule__Point4__WeAssignment_3
            {
            pushFollow(FOLLOW_rule__Point4__WeAssignment_3_in_rule__Point4__Group__3__Impl9303);
            rule__Point4__WeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getPoint4Access().getWeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__Group__3__Impl


    // $ANTLR start rule__MinSec__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4526:1: rule__MinSec__Group__0 : rule__MinSec__Group__0__Impl rule__MinSec__Group__1 ;
    public final void rule__MinSec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4530:1: ( rule__MinSec__Group__0__Impl rule__MinSec__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4531:2: rule__MinSec__Group__0__Impl rule__MinSec__Group__1
            {
            pushFollow(FOLLOW_rule__MinSec__Group__0__Impl_in_rule__MinSec__Group__09341);
            rule__MinSec__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MinSec__Group__1_in_rule__MinSec__Group__09344);
            rule__MinSec__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MinSec__Group__0


    // $ANTLR start rule__MinSec__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4538:1: rule__MinSec__Group__0__Impl : ( ruleSep ) ;
    public final void rule__MinSec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4542:1: ( ( ruleSep ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4543:1: ( ruleSep )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4543:1: ( ruleSep )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4544:1: ruleSep
            {
             before(grammarAccess.getMinSecAccess().getSepParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSep_in_rule__MinSec__Group__0__Impl9371);
            ruleSep();
            _fsp--;

             after(grammarAccess.getMinSecAccess().getSepParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MinSec__Group__0__Impl


    // $ANTLR start rule__MinSec__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4555:1: rule__MinSec__Group__1 : rule__MinSec__Group__1__Impl ;
    public final void rule__MinSec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4559:1: ( rule__MinSec__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4560:2: rule__MinSec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MinSec__Group__1__Impl_in_rule__MinSec__Group__19400);
            rule__MinSec__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MinSec__Group__1


    // $ANTLR start rule__MinSec__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4566:1: rule__MinSec__Group__1__Impl : ( ( rule__MinSec__ValueAssignment_1 ) ) ;
    public final void rule__MinSec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4570:1: ( ( ( rule__MinSec__ValueAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4571:1: ( ( rule__MinSec__ValueAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4571:1: ( ( rule__MinSec__ValueAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4572:1: ( rule__MinSec__ValueAssignment_1 )
            {
             before(grammarAccess.getMinSecAccess().getValueAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4573:1: ( rule__MinSec__ValueAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4573:2: rule__MinSec__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__MinSec__ValueAssignment_1_in_rule__MinSec__Group__1__Impl9427);
            rule__MinSec__ValueAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMinSecAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MinSec__Group__1__Impl


    // $ANTLR start rule__SecDec__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4587:1: rule__SecDec__Group__0 : rule__SecDec__Group__0__Impl rule__SecDec__Group__1 ;
    public final void rule__SecDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4591:1: ( rule__SecDec__Group__0__Impl rule__SecDec__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4592:2: rule__SecDec__Group__0__Impl rule__SecDec__Group__1
            {
            pushFollow(FOLLOW_rule__SecDec__Group__0__Impl_in_rule__SecDec__Group__09461);
            rule__SecDec__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecDec__Group__1_in_rule__SecDec__Group__09464);
            rule__SecDec__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecDec__Group__0


    // $ANTLR start rule__SecDec__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4599:1: rule__SecDec__Group__0__Impl : ( ruleSep ) ;
    public final void rule__SecDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4603:1: ( ( ruleSep ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4604:1: ( ruleSep )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4604:1: ( ruleSep )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4605:1: ruleSep
            {
             before(grammarAccess.getSecDecAccess().getSepParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSep_in_rule__SecDec__Group__0__Impl9491);
            ruleSep();
            _fsp--;

             after(grammarAccess.getSecDecAccess().getSepParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecDec__Group__0__Impl


    // $ANTLR start rule__SecDec__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4616:1: rule__SecDec__Group__1 : rule__SecDec__Group__1__Impl ;
    public final void rule__SecDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4620:1: ( rule__SecDec__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4621:2: rule__SecDec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SecDec__Group__1__Impl_in_rule__SecDec__Group__19520);
            rule__SecDec__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecDec__Group__1


    // $ANTLR start rule__SecDec__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4627:1: rule__SecDec__Group__1__Impl : ( ( rule__SecDec__ValueAssignment_1 ) ) ;
    public final void rule__SecDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4631:1: ( ( ( rule__SecDec__ValueAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4632:1: ( ( rule__SecDec__ValueAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4632:1: ( ( rule__SecDec__ValueAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4633:1: ( rule__SecDec__ValueAssignment_1 )
            {
             before(grammarAccess.getSecDecAccess().getValueAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4634:1: ( rule__SecDec__ValueAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4634:2: rule__SecDec__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SecDec__ValueAssignment_1_in_rule__SecDec__Group__1__Impl9547);
            rule__SecDec__ValueAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSecDecAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecDec__Group__1__Impl


    // $ANTLR start rule__MinDec__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4648:1: rule__MinDec__Group__0 : rule__MinDec__Group__0__Impl rule__MinDec__Group__1 ;
    public final void rule__MinDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4652:1: ( rule__MinDec__Group__0__Impl rule__MinDec__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4653:2: rule__MinDec__Group__0__Impl rule__MinDec__Group__1
            {
            pushFollow(FOLLOW_rule__MinDec__Group__0__Impl_in_rule__MinDec__Group__09581);
            rule__MinDec__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MinDec__Group__1_in_rule__MinDec__Group__09584);
            rule__MinDec__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MinDec__Group__0


    // $ANTLR start rule__MinDec__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4660:1: rule__MinDec__Group__0__Impl : ( ruleSep ) ;
    public final void rule__MinDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4664:1: ( ( ruleSep ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4665:1: ( ruleSep )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4665:1: ( ruleSep )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4666:1: ruleSep
            {
             before(grammarAccess.getMinDecAccess().getSepParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSep_in_rule__MinDec__Group__0__Impl9611);
            ruleSep();
            _fsp--;

             after(grammarAccess.getMinDecAccess().getSepParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MinDec__Group__0__Impl


    // $ANTLR start rule__MinDec__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4677:1: rule__MinDec__Group__1 : rule__MinDec__Group__1__Impl ;
    public final void rule__MinDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4681:1: ( rule__MinDec__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4682:2: rule__MinDec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MinDec__Group__1__Impl_in_rule__MinDec__Group__19640);
            rule__MinDec__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MinDec__Group__1


    // $ANTLR start rule__MinDec__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4688:1: rule__MinDec__Group__1__Impl : ( ( rule__MinDec__ValueAssignment_1 ) ) ;
    public final void rule__MinDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4692:1: ( ( ( rule__MinDec__ValueAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4693:1: ( ( rule__MinDec__ValueAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4693:1: ( ( rule__MinDec__ValueAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4694:1: ( rule__MinDec__ValueAssignment_1 )
            {
             before(grammarAccess.getMinDecAccess().getValueAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4695:1: ( rule__MinDec__ValueAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4695:2: rule__MinDec__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__MinDec__ValueAssignment_1_in_rule__MinDec__Group__1__Impl9667);
            rule__MinDec__ValueAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMinDecAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MinDec__Group__1__Impl


    // $ANTLR start rule__DA__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4709:1: rule__DA__Group__0 : rule__DA__Group__0__Impl rule__DA__Group__1 ;
    public final void rule__DA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4713:1: ( rule__DA__Group__0__Impl rule__DA__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4714:2: rule__DA__Group__0__Impl rule__DA__Group__1
            {
            pushFollow(FOLLOW_rule__DA__Group__0__Impl_in_rule__DA__Group__09701);
            rule__DA__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DA__Group__1_in_rule__DA__Group__09704);
            rule__DA__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DA__Group__0


    // $ANTLR start rule__DA__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4721:1: rule__DA__Group__0__Impl : ( 'DA' ) ;
    public final void rule__DA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4725:1: ( ( 'DA' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4726:1: ( 'DA' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4726:1: ( 'DA' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4727:1: 'DA'
            {
             before(grammarAccess.getDAAccess().getDAKeyword_0()); 
            match(input,59,FOLLOW_59_in_rule__DA__Group__0__Impl9732); 
             after(grammarAccess.getDAAccess().getDAKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DA__Group__0__Impl


    // $ANTLR start rule__DA__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4740:1: rule__DA__Group__1 : rule__DA__Group__1__Impl ;
    public final void rule__DA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4744:1: ( rule__DA__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4745:2: rule__DA__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DA__Group__1__Impl_in_rule__DA__Group__19763);
            rule__DA__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DA__Group__1


    // $ANTLR start rule__DA__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4751:1: rule__DA__Group__1__Impl : ( ( rule__DA__DaAssignment_1 ) ) ;
    public final void rule__DA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4755:1: ( ( ( rule__DA__DaAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4756:1: ( ( rule__DA__DaAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4756:1: ( ( rule__DA__DaAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4757:1: ( rule__DA__DaAssignment_1 )
            {
             before(grammarAccess.getDAAccess().getDaAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4758:1: ( rule__DA__DaAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4758:2: rule__DA__DaAssignment_1
            {
            pushFollow(FOLLOW_rule__DA__DaAssignment_1_in_rule__DA__Group__1__Impl9790);
            rule__DA__DaAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDAAccess().getDaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DA__Group__1__Impl


    // $ANTLR start rule__DaParams1__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4772:1: rule__DaParams1__Group__0 : rule__DaParams1__Group__0__Impl rule__DaParams1__Group__1 ;
    public final void rule__DaParams1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4776:1: ( rule__DaParams1__Group__0__Impl rule__DaParams1__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4777:2: rule__DaParams1__Group__0__Impl rule__DaParams1__Group__1
            {
            pushFollow(FOLLOW_rule__DaParams1__Group__0__Impl_in_rule__DaParams1__Group__09824);
            rule__DaParams1__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DaParams1__Group__1_in_rule__DaParams1__Group__09827);
            rule__DaParams1__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__Group__0


    // $ANTLR start rule__DaParams1__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4784:1: rule__DaParams1__Group__0__Impl : ( ( rule__DaParams1__RadiusAssignment_0 ) ) ;
    public final void rule__DaParams1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4788:1: ( ( ( rule__DaParams1__RadiusAssignment_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4789:1: ( ( rule__DaParams1__RadiusAssignment_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4789:1: ( ( rule__DaParams1__RadiusAssignment_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4790:1: ( rule__DaParams1__RadiusAssignment_0 )
            {
             before(grammarAccess.getDaParams1Access().getRadiusAssignment_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4791:1: ( rule__DaParams1__RadiusAssignment_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4791:2: rule__DaParams1__RadiusAssignment_0
            {
            pushFollow(FOLLOW_rule__DaParams1__RadiusAssignment_0_in_rule__DaParams1__Group__0__Impl9854);
            rule__DaParams1__RadiusAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDaParams1Access().getRadiusAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__Group__0__Impl


    // $ANTLR start rule__DaParams1__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4801:1: rule__DaParams1__Group__1 : rule__DaParams1__Group__1__Impl rule__DaParams1__Group__2 ;
    public final void rule__DaParams1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4805:1: ( rule__DaParams1__Group__1__Impl rule__DaParams1__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4806:2: rule__DaParams1__Group__1__Impl rule__DaParams1__Group__2
            {
            pushFollow(FOLLOW_rule__DaParams1__Group__1__Impl_in_rule__DaParams1__Group__19884);
            rule__DaParams1__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DaParams1__Group__2_in_rule__DaParams1__Group__19887);
            rule__DaParams1__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__Group__1


    // $ANTLR start rule__DaParams1__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4813:1: rule__DaParams1__Group__1__Impl : ( ',' ) ;
    public final void rule__DaParams1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4817:1: ( ( ',' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4818:1: ( ',' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4818:1: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4819:1: ','
            {
             before(grammarAccess.getDaParams1Access().getCommaKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__DaParams1__Group__1__Impl9915); 
             after(grammarAccess.getDaParams1Access().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__Group__1__Impl


    // $ANTLR start rule__DaParams1__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4832:1: rule__DaParams1__Group__2 : rule__DaParams1__Group__2__Impl rule__DaParams1__Group__3 ;
    public final void rule__DaParams1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4836:1: ( rule__DaParams1__Group__2__Impl rule__DaParams1__Group__3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4837:2: rule__DaParams1__Group__2__Impl rule__DaParams1__Group__3
            {
            pushFollow(FOLLOW_rule__DaParams1__Group__2__Impl_in_rule__DaParams1__Group__29946);
            rule__DaParams1__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DaParams1__Group__3_in_rule__DaParams1__Group__29949);
            rule__DaParams1__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__Group__2


    // $ANTLR start rule__DaParams1__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4844:1: rule__DaParams1__Group__2__Impl : ( ( rule__DaParams1__AngleStartAssignment_2 ) ) ;
    public final void rule__DaParams1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4848:1: ( ( ( rule__DaParams1__AngleStartAssignment_2 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4849:1: ( ( rule__DaParams1__AngleStartAssignment_2 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4849:1: ( ( rule__DaParams1__AngleStartAssignment_2 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4850:1: ( rule__DaParams1__AngleStartAssignment_2 )
            {
             before(grammarAccess.getDaParams1Access().getAngleStartAssignment_2()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4851:1: ( rule__DaParams1__AngleStartAssignment_2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4851:2: rule__DaParams1__AngleStartAssignment_2
            {
            pushFollow(FOLLOW_rule__DaParams1__AngleStartAssignment_2_in_rule__DaParams1__Group__2__Impl9976);
            rule__DaParams1__AngleStartAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDaParams1Access().getAngleStartAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__Group__2__Impl


    // $ANTLR start rule__DaParams1__Group__3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4861:1: rule__DaParams1__Group__3 : rule__DaParams1__Group__3__Impl rule__DaParams1__Group__4 ;
    public final void rule__DaParams1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4865:1: ( rule__DaParams1__Group__3__Impl rule__DaParams1__Group__4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4866:2: rule__DaParams1__Group__3__Impl rule__DaParams1__Group__4
            {
            pushFollow(FOLLOW_rule__DaParams1__Group__3__Impl_in_rule__DaParams1__Group__310006);
            rule__DaParams1__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DaParams1__Group__4_in_rule__DaParams1__Group__310009);
            rule__DaParams1__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__Group__3


    // $ANTLR start rule__DaParams1__Group__3__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4873:1: rule__DaParams1__Group__3__Impl : ( ',' ) ;
    public final void rule__DaParams1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4877:1: ( ( ',' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4878:1: ( ',' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4878:1: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4879:1: ','
            {
             before(grammarAccess.getDaParams1Access().getCommaKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__DaParams1__Group__3__Impl10037); 
             after(grammarAccess.getDaParams1Access().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__Group__3__Impl


    // $ANTLR start rule__DaParams1__Group__4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4892:1: rule__DaParams1__Group__4 : rule__DaParams1__Group__4__Impl ;
    public final void rule__DaParams1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4896:1: ( rule__DaParams1__Group__4__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4897:2: rule__DaParams1__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DaParams1__Group__4__Impl_in_rule__DaParams1__Group__410068);
            rule__DaParams1__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__Group__4


    // $ANTLR start rule__DaParams1__Group__4__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4903:1: rule__DaParams1__Group__4__Impl : ( ( rule__DaParams1__AngleEndAssignment_4 ) ) ;
    public final void rule__DaParams1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4907:1: ( ( ( rule__DaParams1__AngleEndAssignment_4 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4908:1: ( ( rule__DaParams1__AngleEndAssignment_4 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4908:1: ( ( rule__DaParams1__AngleEndAssignment_4 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4909:1: ( rule__DaParams1__AngleEndAssignment_4 )
            {
             before(grammarAccess.getDaParams1Access().getAngleEndAssignment_4()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4910:1: ( rule__DaParams1__AngleEndAssignment_4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4910:2: rule__DaParams1__AngleEndAssignment_4
            {
            pushFollow(FOLLOW_rule__DaParams1__AngleEndAssignment_4_in_rule__DaParams1__Group__4__Impl10095);
            rule__DaParams1__AngleEndAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getDaParams1Access().getAngleEndAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__Group__4__Impl


    // $ANTLR start rule__DaParams2__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4930:1: rule__DaParams2__Group__0 : rule__DaParams2__Group__0__Impl rule__DaParams2__Group__1 ;
    public final void rule__DaParams2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4934:1: ( rule__DaParams2__Group__0__Impl rule__DaParams2__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4935:2: rule__DaParams2__Group__0__Impl rule__DaParams2__Group__1
            {
            pushFollow(FOLLOW_rule__DaParams2__Group__0__Impl_in_rule__DaParams2__Group__010135);
            rule__DaParams2__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DaParams2__Group__1_in_rule__DaParams2__Group__010138);
            rule__DaParams2__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__Group__0


    // $ANTLR start rule__DaParams2__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4942:1: rule__DaParams2__Group__0__Impl : ( ( rule__DaParams2__RadiusAssignment_0 ) ) ;
    public final void rule__DaParams2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4946:1: ( ( ( rule__DaParams2__RadiusAssignment_0 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4947:1: ( ( rule__DaParams2__RadiusAssignment_0 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4947:1: ( ( rule__DaParams2__RadiusAssignment_0 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4948:1: ( rule__DaParams2__RadiusAssignment_0 )
            {
             before(grammarAccess.getDaParams2Access().getRadiusAssignment_0()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4949:1: ( rule__DaParams2__RadiusAssignment_0 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4949:2: rule__DaParams2__RadiusAssignment_0
            {
            pushFollow(FOLLOW_rule__DaParams2__RadiusAssignment_0_in_rule__DaParams2__Group__0__Impl10165);
            rule__DaParams2__RadiusAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDaParams2Access().getRadiusAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__Group__0__Impl


    // $ANTLR start rule__DaParams2__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4959:1: rule__DaParams2__Group__1 : rule__DaParams2__Group__1__Impl rule__DaParams2__Group__2 ;
    public final void rule__DaParams2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4963:1: ( rule__DaParams2__Group__1__Impl rule__DaParams2__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4964:2: rule__DaParams2__Group__1__Impl rule__DaParams2__Group__2
            {
            pushFollow(FOLLOW_rule__DaParams2__Group__1__Impl_in_rule__DaParams2__Group__110195);
            rule__DaParams2__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DaParams2__Group__2_in_rule__DaParams2__Group__110198);
            rule__DaParams2__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__Group__1


    // $ANTLR start rule__DaParams2__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4971:1: rule__DaParams2__Group__1__Impl : ( ',' ) ;
    public final void rule__DaParams2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4975:1: ( ( ',' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4976:1: ( ',' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4976:1: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4977:1: ','
            {
             before(grammarAccess.getDaParams2Access().getCommaKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__DaParams2__Group__1__Impl10226); 
             after(grammarAccess.getDaParams2Access().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__Group__1__Impl


    // $ANTLR start rule__DaParams2__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4990:1: rule__DaParams2__Group__2 : rule__DaParams2__Group__2__Impl rule__DaParams2__Group__3 ;
    public final void rule__DaParams2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4994:1: ( rule__DaParams2__Group__2__Impl rule__DaParams2__Group__3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:4995:2: rule__DaParams2__Group__2__Impl rule__DaParams2__Group__3
            {
            pushFollow(FOLLOW_rule__DaParams2__Group__2__Impl_in_rule__DaParams2__Group__210257);
            rule__DaParams2__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DaParams2__Group__3_in_rule__DaParams2__Group__210260);
            rule__DaParams2__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__Group__2


    // $ANTLR start rule__DaParams2__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5002:1: rule__DaParams2__Group__2__Impl : ( ( rule__DaParams2__AngleStartAssignment_2 ) ) ;
    public final void rule__DaParams2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5006:1: ( ( ( rule__DaParams2__AngleStartAssignment_2 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5007:1: ( ( rule__DaParams2__AngleStartAssignment_2 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5007:1: ( ( rule__DaParams2__AngleStartAssignment_2 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5008:1: ( rule__DaParams2__AngleStartAssignment_2 )
            {
             before(grammarAccess.getDaParams2Access().getAngleStartAssignment_2()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5009:1: ( rule__DaParams2__AngleStartAssignment_2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5009:2: rule__DaParams2__AngleStartAssignment_2
            {
            pushFollow(FOLLOW_rule__DaParams2__AngleStartAssignment_2_in_rule__DaParams2__Group__2__Impl10287);
            rule__DaParams2__AngleStartAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDaParams2Access().getAngleStartAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__Group__2__Impl


    // $ANTLR start rule__DaParams2__Group__3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5019:1: rule__DaParams2__Group__3 : rule__DaParams2__Group__3__Impl rule__DaParams2__Group__4 ;
    public final void rule__DaParams2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5023:1: ( rule__DaParams2__Group__3__Impl rule__DaParams2__Group__4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5024:2: rule__DaParams2__Group__3__Impl rule__DaParams2__Group__4
            {
            pushFollow(FOLLOW_rule__DaParams2__Group__3__Impl_in_rule__DaParams2__Group__310317);
            rule__DaParams2__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DaParams2__Group__4_in_rule__DaParams2__Group__310320);
            rule__DaParams2__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__Group__3


    // $ANTLR start rule__DaParams2__Group__3__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5031:1: rule__DaParams2__Group__3__Impl : ( ',' ) ;
    public final void rule__DaParams2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5035:1: ( ( ',' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5036:1: ( ',' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5036:1: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5037:1: ','
            {
             before(grammarAccess.getDaParams2Access().getCommaKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__DaParams2__Group__3__Impl10348); 
             after(grammarAccess.getDaParams2Access().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__Group__3__Impl


    // $ANTLR start rule__DaParams2__Group__4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5050:1: rule__DaParams2__Group__4 : rule__DaParams2__Group__4__Impl ;
    public final void rule__DaParams2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5054:1: ( rule__DaParams2__Group__4__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5055:2: rule__DaParams2__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DaParams2__Group__4__Impl_in_rule__DaParams2__Group__410379);
            rule__DaParams2__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__Group__4


    // $ANTLR start rule__DaParams2__Group__4__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5061:1: rule__DaParams2__Group__4__Impl : ( ( rule__DaParams2__AngleEndAssignment_4 ) ) ;
    public final void rule__DaParams2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5065:1: ( ( ( rule__DaParams2__AngleEndAssignment_4 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5066:1: ( ( rule__DaParams2__AngleEndAssignment_4 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5066:1: ( ( rule__DaParams2__AngleEndAssignment_4 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5067:1: ( rule__DaParams2__AngleEndAssignment_4 )
            {
             before(grammarAccess.getDaParams2Access().getAngleEndAssignment_4()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5068:1: ( rule__DaParams2__AngleEndAssignment_4 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5068:2: rule__DaParams2__AngleEndAssignment_4
            {
            pushFollow(FOLLOW_rule__DaParams2__AngleEndAssignment_4_in_rule__DaParams2__Group__4__Impl10406);
            rule__DaParams2__AngleEndAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getDaParams2Access().getAngleEndAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__Group__4__Impl


    // $ANTLR start rule__DB__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5088:1: rule__DB__Group__0 : rule__DB__Group__0__Impl rule__DB__Group__1 ;
    public final void rule__DB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5092:1: ( rule__DB__Group__0__Impl rule__DB__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5093:2: rule__DB__Group__0__Impl rule__DB__Group__1
            {
            pushFollow(FOLLOW_rule__DB__Group__0__Impl_in_rule__DB__Group__010446);
            rule__DB__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DB__Group__1_in_rule__DB__Group__010449);
            rule__DB__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DB__Group__0


    // $ANTLR start rule__DB__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5100:1: rule__DB__Group__0__Impl : ( 'DB' ) ;
    public final void rule__DB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5104:1: ( ( 'DB' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5105:1: ( 'DB' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5105:1: ( 'DB' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5106:1: 'DB'
            {
             before(grammarAccess.getDBAccess().getDBKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__DB__Group__0__Impl10477); 
             after(grammarAccess.getDBAccess().getDBKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DB__Group__0__Impl


    // $ANTLR start rule__DB__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5119:1: rule__DB__Group__1 : rule__DB__Group__1__Impl rule__DB__Group__2 ;
    public final void rule__DB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5123:1: ( rule__DB__Group__1__Impl rule__DB__Group__2 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5124:2: rule__DB__Group__1__Impl rule__DB__Group__2
            {
            pushFollow(FOLLOW_rule__DB__Group__1__Impl_in_rule__DB__Group__110508);
            rule__DB__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DB__Group__2_in_rule__DB__Group__110511);
            rule__DB__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DB__Group__1


    // $ANTLR start rule__DB__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5131:1: rule__DB__Group__1__Impl : ( ( rule__DB__Dp0Assignment_1 ) ) ;
    public final void rule__DB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5135:1: ( ( ( rule__DB__Dp0Assignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5136:1: ( ( rule__DB__Dp0Assignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5136:1: ( ( rule__DB__Dp0Assignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5137:1: ( rule__DB__Dp0Assignment_1 )
            {
             before(grammarAccess.getDBAccess().getDp0Assignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5138:1: ( rule__DB__Dp0Assignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5138:2: rule__DB__Dp0Assignment_1
            {
            pushFollow(FOLLOW_rule__DB__Dp0Assignment_1_in_rule__DB__Group__1__Impl10538);
            rule__DB__Dp0Assignment_1();
            _fsp--;


            }

             after(grammarAccess.getDBAccess().getDp0Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DB__Group__1__Impl


    // $ANTLR start rule__DB__Group__2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5148:1: rule__DB__Group__2 : rule__DB__Group__2__Impl rule__DB__Group__3 ;
    public final void rule__DB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5152:1: ( rule__DB__Group__2__Impl rule__DB__Group__3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5153:2: rule__DB__Group__2__Impl rule__DB__Group__3
            {
            pushFollow(FOLLOW_rule__DB__Group__2__Impl_in_rule__DB__Group__210568);
            rule__DB__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DB__Group__3_in_rule__DB__Group__210571);
            rule__DB__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DB__Group__2


    // $ANTLR start rule__DB__Group__2__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5160:1: rule__DB__Group__2__Impl : ( ( ',' )? ) ;
    public final void rule__DB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5164:1: ( ( ( ',' )? ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5165:1: ( ( ',' )? )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5165:1: ( ( ',' )? )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5166:1: ( ',' )?
            {
             before(grammarAccess.getDBAccess().getCommaKeyword_2()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5167:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5168:2: ','
                    {
                    match(input,43,FOLLOW_43_in_rule__DB__Group__2__Impl10600); 

                    }
                    break;

            }

             after(grammarAccess.getDBAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DB__Group__2__Impl


    // $ANTLR start rule__DB__Group__3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5179:1: rule__DB__Group__3 : rule__DB__Group__3__Impl ;
    public final void rule__DB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5183:1: ( rule__DB__Group__3__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5184:2: rule__DB__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DB__Group__3__Impl_in_rule__DB__Group__310633);
            rule__DB__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DB__Group__3


    // $ANTLR start rule__DB__Group__3__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5190:1: rule__DB__Group__3__Impl : ( ( rule__DB__Dp1Assignment_3 ) ) ;
    public final void rule__DB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5194:1: ( ( ( rule__DB__Dp1Assignment_3 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5195:1: ( ( rule__DB__Dp1Assignment_3 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5195:1: ( ( rule__DB__Dp1Assignment_3 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5196:1: ( rule__DB__Dp1Assignment_3 )
            {
             before(grammarAccess.getDBAccess().getDp1Assignment_3()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5197:1: ( rule__DB__Dp1Assignment_3 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5197:2: rule__DB__Dp1Assignment_3
            {
            pushFollow(FOLLOW_rule__DB__Dp1Assignment_3_in_rule__DB__Group__3__Impl10660);
            rule__DB__Dp1Assignment_3();
            _fsp--;


            }

             after(grammarAccess.getDBAccess().getDp1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DB__Group__3__Impl


    // $ANTLR start rule__AT__Group__0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5215:1: rule__AT__Group__0 : rule__AT__Group__0__Impl rule__AT__Group__1 ;
    public final void rule__AT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5219:1: ( rule__AT__Group__0__Impl rule__AT__Group__1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5220:2: rule__AT__Group__0__Impl rule__AT__Group__1
            {
            pushFollow(FOLLOW_rule__AT__Group__0__Impl_in_rule__AT__Group__010698);
            rule__AT__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AT__Group__1_in_rule__AT__Group__010701);
            rule__AT__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AT__Group__0


    // $ANTLR start rule__AT__Group__0__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5227:1: rule__AT__Group__0__Impl : ( 'AT' ) ;
    public final void rule__AT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5231:1: ( ( 'AT' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5232:1: ( 'AT' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5232:1: ( 'AT' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5233:1: 'AT'
            {
             before(grammarAccess.getATAccess().getATKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__AT__Group__0__Impl10729); 
             after(grammarAccess.getATAccess().getATKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AT__Group__0__Impl


    // $ANTLR start rule__AT__Group__1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5246:1: rule__AT__Group__1 : rule__AT__Group__1__Impl ;
    public final void rule__AT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5250:1: ( rule__AT__Group__1__Impl )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5251:2: rule__AT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AT__Group__1__Impl_in_rule__AT__Group__110760);
            rule__AT__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AT__Group__1


    // $ANTLR start rule__AT__Group__1__Impl
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5257:1: rule__AT__Group__1__Impl : ( ( rule__AT__LpAssignment_1 ) ) ;
    public final void rule__AT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5261:1: ( ( ( rule__AT__LpAssignment_1 ) ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5262:1: ( ( rule__AT__LpAssignment_1 ) )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5262:1: ( ( rule__AT__LpAssignment_1 ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5263:1: ( rule__AT__LpAssignment_1 )
            {
             before(grammarAccess.getATAccess().getLpAssignment_1()); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5264:1: ( rule__AT__LpAssignment_1 )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5264:2: rule__AT__LpAssignment_1
            {
            pushFollow(FOLLOW_rule__AT__LpAssignment_1_in_rule__AT__Group__1__Impl10787);
            rule__AT__LpAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getATAccess().getLpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AT__Group__1__Impl


    // $ANTLR start rule__OpenAir__AirspacesAssignment
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5279:1: rule__OpenAir__AirspacesAssignment : ( ruleAirspace ) ;
    public final void rule__OpenAir__AirspacesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5283:1: ( ( ruleAirspace ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5284:1: ( ruleAirspace )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5284:1: ( ruleAirspace )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5285:1: ruleAirspace
            {
             before(grammarAccess.getOpenAirAccess().getAirspacesAirspaceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAirspace_in_rule__OpenAir__AirspacesAssignment10826);
            ruleAirspace();
            _fsp--;

             after(grammarAccess.getOpenAirAccess().getAirspacesAirspaceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OpenAir__AirspacesAssignment


    // $ANTLR start rule__Airspace__ThedefAssignment_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5294:1: rule__Airspace__ThedefAssignment_0 : ( ruleTheDef ) ;
    public final void rule__Airspace__ThedefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5298:1: ( ( ruleTheDef ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5299:1: ( ruleTheDef )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5299:1: ( ruleTheDef )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5300:1: ruleTheDef
            {
             before(grammarAccess.getAirspaceAccess().getThedefTheDefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTheDef_in_rule__Airspace__ThedefAssignment_010857);
            ruleTheDef();
            _fsp--;

             after(grammarAccess.getAirspaceAccess().getThedefTheDefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Airspace__ThedefAssignment_0


    // $ANTLR start rule__Airspace__ThegeomAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5309:1: rule__Airspace__ThegeomAssignment_1 : ( ruleTheGeom ) ;
    public final void rule__Airspace__ThegeomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5313:1: ( ( ruleTheGeom ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5314:1: ( ruleTheGeom )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5314:1: ( ruleTheGeom )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5315:1: ruleTheGeom
            {
             before(grammarAccess.getAirspaceAccess().getThegeomTheGeomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTheGeom_in_rule__Airspace__ThegeomAssignment_110888);
            ruleTheGeom();
            _fsp--;

             after(grammarAccess.getAirspaceAccess().getThegeomTheGeomParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Airspace__ThegeomAssignment_1


    // $ANTLR start rule__TheDef__AsclassAssignment_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5324:1: rule__TheDef__AsclassAssignment_0 : ( ruleAsClass ) ;
    public final void rule__TheDef__AsclassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5328:1: ( ( ruleAsClass ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5329:1: ( ruleAsClass )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5329:1: ( ruleAsClass )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5330:1: ruleAsClass
            {
             before(grammarAccess.getTheDefAccess().getAsclassAsClassParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAsClass_in_rule__TheDef__AsclassAssignment_010919);
            ruleAsClass();
            _fsp--;

             after(grammarAccess.getTheDefAccess().getAsclassAsClassParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__AsclassAssignment_0


    // $ANTLR start rule__TheDef__SpAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5339:1: rule__TheDef__SpAssignment_1 : ( ruleSP ) ;
    public final void rule__TheDef__SpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5343:1: ( ( ruleSP ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5344:1: ( ruleSP )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5344:1: ( ruleSP )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5345:1: ruleSP
            {
             before(grammarAccess.getTheDefAccess().getSpSPParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSP_in_rule__TheDef__SpAssignment_110950);
            ruleSP();
            _fsp--;

             after(grammarAccess.getTheDefAccess().getSpSPParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__SpAssignment_1


    // $ANTLR start rule__TheDef__SbAssignment_2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5354:1: rule__TheDef__SbAssignment_2 : ( ruleSB ) ;
    public final void rule__TheDef__SbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5358:1: ( ( ruleSB ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5359:1: ( ruleSB )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5359:1: ( ruleSB )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5360:1: ruleSB
            {
             before(grammarAccess.getTheDefAccess().getSbSBParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSB_in_rule__TheDef__SbAssignment_210981);
            ruleSB();
            _fsp--;

             after(grammarAccess.getTheDefAccess().getSbSBParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__SbAssignment_2


    // $ANTLR start rule__TheDef__NameAssignment_3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5369:1: rule__TheDef__NameAssignment_3 : ( ruleAsName ) ;
    public final void rule__TheDef__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5373:1: ( ( ruleAsName ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5374:1: ( ruleAsName )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5374:1: ( ruleAsName )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5375:1: ruleAsName
            {
             before(grammarAccess.getTheDefAccess().getNameAsNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAsName_in_rule__TheDef__NameAssignment_311012);
            ruleAsName();
            _fsp--;

             after(grammarAccess.getTheDefAccess().getNameAsNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__NameAssignment_3


    // $ANTLR start rule__TheDef__AtAssignment_4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5384:1: rule__TheDef__AtAssignment_4 : ( ruleAT ) ;
    public final void rule__TheDef__AtAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5388:1: ( ( ruleAT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5389:1: ( ruleAT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5389:1: ( ruleAT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5390:1: ruleAT
            {
             before(grammarAccess.getTheDefAccess().getAtATParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAT_in_rule__TheDef__AtAssignment_411043);
            ruleAT();
            _fsp--;

             after(grammarAccess.getTheDefAccess().getAtATParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__AtAssignment_4


    // $ANTLR start rule__TheDef__LimitAssignment_5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5399:1: rule__TheDef__LimitAssignment_5 : ( ruleLimites ) ;
    public final void rule__TheDef__LimitAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5403:1: ( ( ruleLimites ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5404:1: ( ruleLimites )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5404:1: ( ruleLimites )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5405:1: ruleLimites
            {
             before(grammarAccess.getTheDefAccess().getLimitLimitesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleLimites_in_rule__TheDef__LimitAssignment_511074);
            ruleLimites();
            _fsp--;

             after(grammarAccess.getTheDefAccess().getLimitLimitesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TheDef__LimitAssignment_5


    // $ANTLR start rule__AsClass__NameAssignment_2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5414:1: rule__AsClass__NameAssignment_2 : ( ruleClassType ) ;
    public final void rule__AsClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5418:1: ( ( ruleClassType ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5419:1: ( ruleClassType )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5419:1: ( ruleClassType )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5420:1: ruleClassType
            {
             before(grammarAccess.getAsClassAccess().getNameClassTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleClassType_in_rule__AsClass__NameAssignment_211105);
            ruleClassType();
            _fsp--;

             after(grammarAccess.getAsClassAccess().getNameClassTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsClass__NameAssignment_2


    // $ANTLR start rule__SP__Sp0Assignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5429:1: rule__SP__Sp0Assignment_1 : ( RULE_INT ) ;
    public final void rule__SP__Sp0Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5433:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5434:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5434:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5435:1: RULE_INT
            {
             before(grammarAccess.getSPAccess().getSp0INTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SP__Sp0Assignment_111136); 
             after(grammarAccess.getSPAccess().getSp0INTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Sp0Assignment_1


    // $ANTLR start rule__SP__Sp1Assignment_3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5444:1: rule__SP__Sp1Assignment_3 : ( RULE_INT ) ;
    public final void rule__SP__Sp1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5448:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5449:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5449:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5450:1: RULE_INT
            {
             before(grammarAccess.getSPAccess().getSp1INTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SP__Sp1Assignment_311167); 
             after(grammarAccess.getSPAccess().getSp1INTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Sp1Assignment_3


    // $ANTLR start rule__SP__Sp2Assignment_5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5459:1: rule__SP__Sp2Assignment_5 : ( RULE_INT ) ;
    public final void rule__SP__Sp2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5463:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5464:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5464:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5465:1: RULE_INT
            {
             before(grammarAccess.getSPAccess().getSp2INTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SP__Sp2Assignment_511198); 
             after(grammarAccess.getSPAccess().getSp2INTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Sp2Assignment_5


    // $ANTLR start rule__SP__Sp3Assignment_7
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5474:1: rule__SP__Sp3Assignment_7 : ( RULE_INT ) ;
    public final void rule__SP__Sp3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5478:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5479:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5479:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5480:1: RULE_INT
            {
             before(grammarAccess.getSPAccess().getSp3INTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SP__Sp3Assignment_711229); 
             after(grammarAccess.getSPAccess().getSp3INTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Sp3Assignment_7


    // $ANTLR start rule__SP__Sp4Assignment_9
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5489:1: rule__SP__Sp4Assignment_9 : ( RULE_INT ) ;
    public final void rule__SP__Sp4Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5493:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5494:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5494:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5495:1: RULE_INT
            {
             before(grammarAccess.getSPAccess().getSp4INTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SP__Sp4Assignment_911260); 
             after(grammarAccess.getSPAccess().getSp4INTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SP__Sp4Assignment_9


    // $ANTLR start rule__SB__SbVal1Assignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5504:1: rule__SB__SbVal1Assignment_1 : ( RULE_INT ) ;
    public final void rule__SB__SbVal1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5508:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5509:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5509:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5510:1: RULE_INT
            {
             before(grammarAccess.getSBAccess().getSbVal1INTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SB__SbVal1Assignment_111291); 
             after(grammarAccess.getSBAccess().getSbVal1INTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__SbVal1Assignment_1


    // $ANTLR start rule__SB__SbVal2Assignment_3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5519:1: rule__SB__SbVal2Assignment_3 : ( RULE_INT ) ;
    public final void rule__SB__SbVal2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5523:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5524:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5524:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5525:1: RULE_INT
            {
             before(grammarAccess.getSBAccess().getSbVal2INTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SB__SbVal2Assignment_311322); 
             after(grammarAccess.getSBAccess().getSbVal2INTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__SbVal2Assignment_3


    // $ANTLR start rule__SB__SbVal3Assignment_5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5534:1: rule__SB__SbVal3Assignment_5 : ( RULE_INT ) ;
    public final void rule__SB__SbVal3Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5538:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5539:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5539:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5540:1: RULE_INT
            {
             before(grammarAccess.getSBAccess().getSbVal3INTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SB__SbVal3Assignment_511353); 
             after(grammarAccess.getSBAccess().getSbVal3INTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SB__SbVal3Assignment_5


    // $ANTLR start rule__AsName__NameAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5549:1: rule__AsName__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AsName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5553:1: ( ( RULE_STRING ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5554:1: ( RULE_STRING )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5554:1: ( RULE_STRING )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5555:1: RULE_STRING
            {
             before(grammarAccess.getAsNameAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AsName__NameAssignment_111384); 
             after(grammarAccess.getAsNameAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AsName__NameAssignment_1


    // $ANTLR start rule__Limites__LowLimitAssignment_0_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5564:1: rule__Limites__LowLimitAssignment_0_0 : ( ruleLowLimit ) ;
    public final void rule__Limites__LowLimitAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5568:1: ( ( ruleLowLimit ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5569:1: ( ruleLowLimit )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5569:1: ( ruleLowLimit )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5570:1: ruleLowLimit
            {
             before(grammarAccess.getLimitesAccess().getLowLimitLowLimitParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleLowLimit_in_rule__Limites__LowLimitAssignment_0_011415);
            ruleLowLimit();
            _fsp--;

             after(grammarAccess.getLimitesAccess().getLowLimitLowLimitParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__LowLimitAssignment_0_0


    // $ANTLR start rule__Limites__HighLimitAssignment_0_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5579:1: rule__Limites__HighLimitAssignment_0_1 : ( ruleHighLimit ) ;
    public final void rule__Limites__HighLimitAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5583:1: ( ( ruleHighLimit ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5584:1: ( ruleHighLimit )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5584:1: ( ruleHighLimit )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5585:1: ruleHighLimit
            {
             before(grammarAccess.getLimitesAccess().getHighLimitHighLimitParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleHighLimit_in_rule__Limites__HighLimitAssignment_0_111446);
            ruleHighLimit();
            _fsp--;

             after(grammarAccess.getLimitesAccess().getHighLimitHighLimitParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__HighLimitAssignment_0_1


    // $ANTLR start rule__Limites__HeighLimitAssignment_1_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5594:1: rule__Limites__HeighLimitAssignment_1_0 : ( ruleHighLimit ) ;
    public final void rule__Limites__HeighLimitAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5598:1: ( ( ruleHighLimit ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5599:1: ( ruleHighLimit )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5599:1: ( ruleHighLimit )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5600:1: ruleHighLimit
            {
             before(grammarAccess.getLimitesAccess().getHeighLimitHighLimitParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleHighLimit_in_rule__Limites__HeighLimitAssignment_1_011477);
            ruleHighLimit();
            _fsp--;

             after(grammarAccess.getLimitesAccess().getHeighLimitHighLimitParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__HeighLimitAssignment_1_0


    // $ANTLR start rule__Limites__LowLimitAssignment_1_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5609:1: rule__Limites__LowLimitAssignment_1_1 : ( ruleLowLimit ) ;
    public final void rule__Limites__LowLimitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5613:1: ( ( ruleLowLimit ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5614:1: ( ruleLowLimit )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5614:1: ( ruleLowLimit )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5615:1: ruleLowLimit
            {
             before(grammarAccess.getLimitesAccess().getLowLimitLowLimitParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLowLimit_in_rule__Limites__LowLimitAssignment_1_111508);
            ruleLowLimit();
            _fsp--;

             after(grammarAccess.getLimitesAccess().getLowLimitLowLimitParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Limites__LowLimitAssignment_1_1


    // $ANTLR start rule__LowLimit__LlAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5624:1: rule__LowLimit__LlAssignment_1 : ( ruleLimit ) ;
    public final void rule__LowLimit__LlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5628:1: ( ( ruleLimit ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5629:1: ( ruleLimit )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5629:1: ( ruleLimit )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5630:1: ruleLimit
            {
             before(grammarAccess.getLowLimitAccess().getLlLimitParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLimit_in_rule__LowLimit__LlAssignment_111539);
            ruleLimit();
            _fsp--;

             after(grammarAccess.getLowLimitAccess().getLlLimitParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LowLimit__LlAssignment_1


    // $ANTLR start rule__HighLimit__HlAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5639:1: rule__HighLimit__HlAssignment_1 : ( ruleLimit ) ;
    public final void rule__HighLimit__HlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5643:1: ( ( ruleLimit ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5644:1: ( ruleLimit )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5644:1: ( ruleLimit )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5645:1: ruleLimit
            {
             before(grammarAccess.getHighLimitAccess().getHlLimitParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLimit_in_rule__HighLimit__HlAssignment_111570);
            ruleLimit();
            _fsp--;

             after(grammarAccess.getHighLimitAccess().getHlLimitParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HighLimit__HlAssignment_1


    // $ANTLR start rule__FL__ValueAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5654:1: rule__FL__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__FL__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5658:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5659:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5659:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5660:1: RULE_INT
            {
             before(grammarAccess.getFLAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FL__ValueAssignment_111601); 
             after(grammarAccess.getFLAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FL__ValueAssignment_1


    // $ANTLR start rule__VAL__ValueAssignment_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5669:1: rule__VAL__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__VAL__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5673:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5674:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5674:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5675:1: RULE_INT
            {
             before(grammarAccess.getVALAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VAL__ValueAssignment_011632); 
             after(grammarAccess.getVALAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VAL__ValueAssignment_0


    // $ANTLR start rule__VAL__UnitAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5684:1: rule__VAL__UnitAssignment_1 : ( ruleUnits ) ;
    public final void rule__VAL__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5688:1: ( ( ruleUnits ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5689:1: ( ruleUnits )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5689:1: ( ruleUnits )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5690:1: ruleUnits
            {
             before(grammarAccess.getVALAccess().getUnitUnitsEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnits_in_rule__VAL__UnitAssignment_111663);
            ruleUnits();
            _fsp--;

             after(grammarAccess.getVALAccess().getUnitUnitsEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VAL__UnitAssignment_1


    // $ANTLR start rule__V__VsubAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5699:1: rule__V__VsubAssignment_1 : ( ruleVsub ) ;
    public final void rule__V__VsubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5703:1: ( ( ruleVsub ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5704:1: ( ruleVsub )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5704:1: ( ruleVsub )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5705:1: ruleVsub
            {
             before(grammarAccess.getVAccess().getVsubVsubParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVsub_in_rule__V__VsubAssignment_111694);
            ruleVsub();
            _fsp--;

             after(grammarAccess.getVAccess().getVsubVsubParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__V__VsubAssignment_1


    // $ANTLR start rule__Vsub__XAssignment_0_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5714:1: rule__Vsub__XAssignment_0_1 : ( rulePoint ) ;
    public final void rule__Vsub__XAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5718:1: ( ( rulePoint ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5719:1: ( rulePoint )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5719:1: ( rulePoint )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5720:1: rulePoint
            {
             before(grammarAccess.getVsubAccess().getXPointParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__Vsub__XAssignment_0_111725);
            rulePoint();
            _fsp--;

             after(grammarAccess.getVsubAccess().getXPointParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Vsub__XAssignment_0_1


    // $ANTLR start rule__Vsub__DAssignment_1_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5729:1: rule__Vsub__DAssignment_1_1 : ( ruleDir ) ;
    public final void rule__Vsub__DAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5733:1: ( ( ruleDir ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5734:1: ( ruleDir )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5734:1: ( ruleDir )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5735:1: ruleDir
            {
             before(grammarAccess.getVsubAccess().getDDirParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDir_in_rule__Vsub__DAssignment_1_111756);
            ruleDir();
            _fsp--;

             after(grammarAccess.getVsubAccess().getDDirParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Vsub__DAssignment_1_1


    // $ANTLR start rule__DC__RadiusAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5744:1: rule__DC__RadiusAssignment_1 : ( RULE_REAL ) ;
    public final void rule__DC__RadiusAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5748:1: ( ( RULE_REAL ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5749:1: ( RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5749:1: ( RULE_REAL )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5750:1: RULE_REAL
            {
             before(grammarAccess.getDCAccess().getRadiusREALTerminalRuleCall_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__DC__RadiusAssignment_111787); 
             after(grammarAccess.getDCAccess().getRadiusREALTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DC__RadiusAssignment_1


    // $ANTLR start rule__DP__DpAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5759:1: rule__DP__DpAssignment_1 : ( rulePoint ) ;
    public final void rule__DP__DpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5763:1: ( ( rulePoint ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5764:1: ( rulePoint )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5764:1: ( rulePoint )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5765:1: rulePoint
            {
             before(grammarAccess.getDPAccess().getDpPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__DP__DpAssignment_111818);
            rulePoint();
            _fsp--;

             after(grammarAccess.getDPAccess().getDpPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DP__DpAssignment_1


    // $ANTLR start rule__Point1__LongDAssignment_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5774:1: rule__Point1__LongDAssignment_0 : ( ruleLongDegr ) ;
    public final void rule__Point1__LongDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5778:1: ( ( ruleLongDegr ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5779:1: ( ruleLongDegr )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5779:1: ( ruleLongDegr )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5780:1: ruleLongDegr
            {
             before(grammarAccess.getPoint1Access().getLongDLongDegrParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLongDegr_in_rule__Point1__LongDAssignment_011849);
            ruleLongDegr();
            _fsp--;

             after(grammarAccess.getPoint1Access().getLongDLongDegrParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__LongDAssignment_0


    // $ANTLR start rule__Point1__LongMAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5789:1: rule__Point1__LongMAssignment_1 : ( ruleMinSec ) ;
    public final void rule__Point1__LongMAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5793:1: ( ( ruleMinSec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5794:1: ( ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5794:1: ( ruleMinSec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5795:1: ruleMinSec
            {
             before(grammarAccess.getPoint1Access().getLongMMinSecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMinSec_in_rule__Point1__LongMAssignment_111880);
            ruleMinSec();
            _fsp--;

             after(grammarAccess.getPoint1Access().getLongMMinSecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__LongMAssignment_1


    // $ANTLR start rule__Point1__LongSAssignment_2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5804:1: rule__Point1__LongSAssignment_2 : ( ruleMinSec ) ;
    public final void rule__Point1__LongSAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5808:1: ( ( ruleMinSec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5809:1: ( ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5809:1: ( ruleMinSec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5810:1: ruleMinSec
            {
             before(grammarAccess.getPoint1Access().getLongSMinSecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMinSec_in_rule__Point1__LongSAssignment_211911);
            ruleMinSec();
            _fsp--;

             after(grammarAccess.getPoint1Access().getLongSMinSecParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__LongSAssignment_2


    // $ANTLR start rule__Point1__NsAssignment_3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5819:1: rule__Point1__NsAssignment_3 : ( ruleNS ) ;
    public final void rule__Point1__NsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5823:1: ( ( ruleNS ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5824:1: ( ruleNS )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5824:1: ( ruleNS )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5825:1: ruleNS
            {
             before(grammarAccess.getPoint1Access().getNsNSEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNS_in_rule__Point1__NsAssignment_311942);
            ruleNS();
            _fsp--;

             after(grammarAccess.getPoint1Access().getNsNSEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__NsAssignment_3


    // $ANTLR start rule__Point1__LatDAssignment_4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5834:1: rule__Point1__LatDAssignment_4 : ( ruleLatDegr ) ;
    public final void rule__Point1__LatDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5838:1: ( ( ruleLatDegr ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5839:1: ( ruleLatDegr )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5839:1: ( ruleLatDegr )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5840:1: ruleLatDegr
            {
             before(grammarAccess.getPoint1Access().getLatDLatDegrParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLatDegr_in_rule__Point1__LatDAssignment_411973);
            ruleLatDegr();
            _fsp--;

             after(grammarAccess.getPoint1Access().getLatDLatDegrParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__LatDAssignment_4


    // $ANTLR start rule__Point1__LatMAssignment_5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5849:1: rule__Point1__LatMAssignment_5 : ( ruleMinSec ) ;
    public final void rule__Point1__LatMAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5853:1: ( ( ruleMinSec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5854:1: ( ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5854:1: ( ruleMinSec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5855:1: ruleMinSec
            {
             before(grammarAccess.getPoint1Access().getLatMMinSecParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMinSec_in_rule__Point1__LatMAssignment_512004);
            ruleMinSec();
            _fsp--;

             after(grammarAccess.getPoint1Access().getLatMMinSecParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__LatMAssignment_5


    // $ANTLR start rule__Point1__LatSAssignment_6
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5864:1: rule__Point1__LatSAssignment_6 : ( ruleMinSec ) ;
    public final void rule__Point1__LatSAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5868:1: ( ( ruleMinSec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5869:1: ( ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5869:1: ( ruleMinSec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5870:1: ruleMinSec
            {
             before(grammarAccess.getPoint1Access().getLatSMinSecParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMinSec_in_rule__Point1__LatSAssignment_612035);
            ruleMinSec();
            _fsp--;

             after(grammarAccess.getPoint1Access().getLatSMinSecParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__LatSAssignment_6


    // $ANTLR start rule__Point1__WeAssignment_7
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5879:1: rule__Point1__WeAssignment_7 : ( ruleWE ) ;
    public final void rule__Point1__WeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5883:1: ( ( ruleWE ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5884:1: ( ruleWE )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5884:1: ( ruleWE )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5885:1: ruleWE
            {
             before(grammarAccess.getPoint1Access().getWeWEEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleWE_in_rule__Point1__WeAssignment_712066);
            ruleWE();
            _fsp--;

             after(grammarAccess.getPoint1Access().getWeWEEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point1__WeAssignment_7


    // $ANTLR start rule__Point2__LongDAssignment_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5894:1: rule__Point2__LongDAssignment_0 : ( ruleLongDegr ) ;
    public final void rule__Point2__LongDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5898:1: ( ( ruleLongDegr ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5899:1: ( ruleLongDegr )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5899:1: ( ruleLongDegr )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5900:1: ruleLongDegr
            {
             before(grammarAccess.getPoint2Access().getLongDLongDegrParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLongDegr_in_rule__Point2__LongDAssignment_012097);
            ruleLongDegr();
            _fsp--;

             after(grammarAccess.getPoint2Access().getLongDLongDegrParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__LongDAssignment_0


    // $ANTLR start rule__Point2__LongMfAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5909:1: rule__Point2__LongMfAssignment_1 : ( ruleMinDec ) ;
    public final void rule__Point2__LongMfAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5913:1: ( ( ruleMinDec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5914:1: ( ruleMinDec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5914:1: ( ruleMinDec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5915:1: ruleMinDec
            {
             before(grammarAccess.getPoint2Access().getLongMfMinDecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMinDec_in_rule__Point2__LongMfAssignment_112128);
            ruleMinDec();
            _fsp--;

             after(grammarAccess.getPoint2Access().getLongMfMinDecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__LongMfAssignment_1


    // $ANTLR start rule__Point2__NsAssignment_2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5924:1: rule__Point2__NsAssignment_2 : ( ruleNS ) ;
    public final void rule__Point2__NsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5928:1: ( ( ruleNS ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5929:1: ( ruleNS )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5929:1: ( ruleNS )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5930:1: ruleNS
            {
             before(grammarAccess.getPoint2Access().getNsNSEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNS_in_rule__Point2__NsAssignment_212159);
            ruleNS();
            _fsp--;

             after(grammarAccess.getPoint2Access().getNsNSEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__NsAssignment_2


    // $ANTLR start rule__Point2__LatDAssignment_3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5939:1: rule__Point2__LatDAssignment_3 : ( ruleLatDegr ) ;
    public final void rule__Point2__LatDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5943:1: ( ( ruleLatDegr ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5944:1: ( ruleLatDegr )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5944:1: ( ruleLatDegr )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5945:1: ruleLatDegr
            {
             before(grammarAccess.getPoint2Access().getLatDLatDegrParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLatDegr_in_rule__Point2__LatDAssignment_312190);
            ruleLatDegr();
            _fsp--;

             after(grammarAccess.getPoint2Access().getLatDLatDegrParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__LatDAssignment_3


    // $ANTLR start rule__Point2__LatMfAssignment_4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5954:1: rule__Point2__LatMfAssignment_4 : ( ruleMinDec ) ;
    public final void rule__Point2__LatMfAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5958:1: ( ( ruleMinDec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5959:1: ( ruleMinDec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5959:1: ( ruleMinDec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5960:1: ruleMinDec
            {
             before(grammarAccess.getPoint2Access().getLatMfMinDecParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMinDec_in_rule__Point2__LatMfAssignment_412221);
            ruleMinDec();
            _fsp--;

             after(grammarAccess.getPoint2Access().getLatMfMinDecParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__LatMfAssignment_4


    // $ANTLR start rule__Point2__WeAssignment_5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5969:1: rule__Point2__WeAssignment_5 : ( ruleWE ) ;
    public final void rule__Point2__WeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5973:1: ( ( ruleWE ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5974:1: ( ruleWE )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5974:1: ( ruleWE )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5975:1: ruleWE
            {
             before(grammarAccess.getPoint2Access().getWeWEEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleWE_in_rule__Point2__WeAssignment_512252);
            ruleWE();
            _fsp--;

             after(grammarAccess.getPoint2Access().getWeWEEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point2__WeAssignment_5


    // $ANTLR start rule__Point3__LongDAssignment_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5984:1: rule__Point3__LongDAssignment_0 : ( ruleLongDegr ) ;
    public final void rule__Point3__LongDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5988:1: ( ( ruleLongDegr ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5989:1: ( ruleLongDegr )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5989:1: ( ruleLongDegr )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5990:1: ruleLongDegr
            {
             before(grammarAccess.getPoint3Access().getLongDLongDegrParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLongDegr_in_rule__Point3__LongDAssignment_012283);
            ruleLongDegr();
            _fsp--;

             after(grammarAccess.getPoint3Access().getLongDLongDegrParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__LongDAssignment_0


    // $ANTLR start rule__Point3__LongMAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:5999:1: rule__Point3__LongMAssignment_1 : ( ruleMinSec ) ;
    public final void rule__Point3__LongMAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6003:1: ( ( ruleMinSec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6004:1: ( ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6004:1: ( ruleMinSec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6005:1: ruleMinSec
            {
             before(grammarAccess.getPoint3Access().getLongMMinSecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMinSec_in_rule__Point3__LongMAssignment_112314);
            ruleMinSec();
            _fsp--;

             after(grammarAccess.getPoint3Access().getLongMMinSecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__LongMAssignment_1


    // $ANTLR start rule__Point3__LongSAssignment_2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6014:1: rule__Point3__LongSAssignment_2 : ( ruleSecDec ) ;
    public final void rule__Point3__LongSAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6018:1: ( ( ruleSecDec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6019:1: ( ruleSecDec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6019:1: ( ruleSecDec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6020:1: ruleSecDec
            {
             before(grammarAccess.getPoint3Access().getLongSSecDecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSecDec_in_rule__Point3__LongSAssignment_212345);
            ruleSecDec();
            _fsp--;

             after(grammarAccess.getPoint3Access().getLongSSecDecParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__LongSAssignment_2


    // $ANTLR start rule__Point3__NsAssignment_3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6029:1: rule__Point3__NsAssignment_3 : ( ruleNS ) ;
    public final void rule__Point3__NsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6033:1: ( ( ruleNS ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6034:1: ( ruleNS )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6034:1: ( ruleNS )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6035:1: ruleNS
            {
             before(grammarAccess.getPoint3Access().getNsNSEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNS_in_rule__Point3__NsAssignment_312376);
            ruleNS();
            _fsp--;

             after(grammarAccess.getPoint3Access().getNsNSEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__NsAssignment_3


    // $ANTLR start rule__Point3__LatDAssignment_4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6044:1: rule__Point3__LatDAssignment_4 : ( ruleLatDegr ) ;
    public final void rule__Point3__LatDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6048:1: ( ( ruleLatDegr ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6049:1: ( ruleLatDegr )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6049:1: ( ruleLatDegr )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6050:1: ruleLatDegr
            {
             before(grammarAccess.getPoint3Access().getLatDLatDegrParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLatDegr_in_rule__Point3__LatDAssignment_412407);
            ruleLatDegr();
            _fsp--;

             after(grammarAccess.getPoint3Access().getLatDLatDegrParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__LatDAssignment_4


    // $ANTLR start rule__Point3__LatMAssignment_5
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6059:1: rule__Point3__LatMAssignment_5 : ( ruleMinSec ) ;
    public final void rule__Point3__LatMAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6063:1: ( ( ruleMinSec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6064:1: ( ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6064:1: ( ruleMinSec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6065:1: ruleMinSec
            {
             before(grammarAccess.getPoint3Access().getLatMMinSecParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMinSec_in_rule__Point3__LatMAssignment_512438);
            ruleMinSec();
            _fsp--;

             after(grammarAccess.getPoint3Access().getLatMMinSecParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__LatMAssignment_5


    // $ANTLR start rule__Point3__LatSAssignment_6
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6074:1: rule__Point3__LatSAssignment_6 : ( ruleSecDec ) ;
    public final void rule__Point3__LatSAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6078:1: ( ( ruleSecDec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6079:1: ( ruleSecDec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6079:1: ( ruleSecDec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6080:1: ruleSecDec
            {
             before(grammarAccess.getPoint3Access().getLatSSecDecParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleSecDec_in_rule__Point3__LatSAssignment_612469);
            ruleSecDec();
            _fsp--;

             after(grammarAccess.getPoint3Access().getLatSSecDecParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__LatSAssignment_6


    // $ANTLR start rule__Point3__WeAssignment_7
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6089:1: rule__Point3__WeAssignment_7 : ( ruleWE ) ;
    public final void rule__Point3__WeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6093:1: ( ( ruleWE ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6094:1: ( ruleWE )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6094:1: ( ruleWE )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6095:1: ruleWE
            {
             before(grammarAccess.getPoint3Access().getWeWEEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleWE_in_rule__Point3__WeAssignment_712500);
            ruleWE();
            _fsp--;

             after(grammarAccess.getPoint3Access().getWeWEEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point3__WeAssignment_7


    // $ANTLR start rule__Point4__LongDAssignment_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6104:1: rule__Point4__LongDAssignment_0 : ( ruleLongDec ) ;
    public final void rule__Point4__LongDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6108:1: ( ( ruleLongDec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6109:1: ( ruleLongDec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6109:1: ( ruleLongDec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6110:1: ruleLongDec
            {
             before(grammarAccess.getPoint4Access().getLongDLongDecParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLongDec_in_rule__Point4__LongDAssignment_012531);
            ruleLongDec();
            _fsp--;

             after(grammarAccess.getPoint4Access().getLongDLongDecParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__LongDAssignment_0


    // $ANTLR start rule__Point4__NsAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6119:1: rule__Point4__NsAssignment_1 : ( ruleNS ) ;
    public final void rule__Point4__NsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6123:1: ( ( ruleNS ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6124:1: ( ruleNS )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6124:1: ( ruleNS )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6125:1: ruleNS
            {
             before(grammarAccess.getPoint4Access().getNsNSEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNS_in_rule__Point4__NsAssignment_112562);
            ruleNS();
            _fsp--;

             after(grammarAccess.getPoint4Access().getNsNSEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__NsAssignment_1


    // $ANTLR start rule__Point4__LatDAssignment_2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6134:1: rule__Point4__LatDAssignment_2 : ( ruleLatDec ) ;
    public final void rule__Point4__LatDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6138:1: ( ( ruleLatDec ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6139:1: ( ruleLatDec )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6139:1: ( ruleLatDec )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6140:1: ruleLatDec
            {
             before(grammarAccess.getPoint4Access().getLatDLatDecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLatDec_in_rule__Point4__LatDAssignment_212593);
            ruleLatDec();
            _fsp--;

             after(grammarAccess.getPoint4Access().getLatDLatDecParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__LatDAssignment_2


    // $ANTLR start rule__Point4__WeAssignment_3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6149:1: rule__Point4__WeAssignment_3 : ( ruleWE ) ;
    public final void rule__Point4__WeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6153:1: ( ( ruleWE ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6154:1: ( ruleWE )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6154:1: ( ruleWE )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6155:1: ruleWE
            {
             before(grammarAccess.getPoint4Access().getWeWEEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWE_in_rule__Point4__WeAssignment_312624);
            ruleWE();
            _fsp--;

             after(grammarAccess.getPoint4Access().getWeWEEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Point4__WeAssignment_3


    // $ANTLR start rule__LongDegr__ValueAssignment
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6164:1: rule__LongDegr__ValueAssignment : ( RULE_INT ) ;
    public final void rule__LongDegr__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6168:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6169:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6169:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6170:1: RULE_INT
            {
             before(grammarAccess.getLongDegrAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LongDegr__ValueAssignment12655); 
             after(grammarAccess.getLongDegrAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LongDegr__ValueAssignment


    // $ANTLR start rule__LatDegr__ValueAssignment
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6179:1: rule__LatDegr__ValueAssignment : ( RULE_INT ) ;
    public final void rule__LatDegr__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6183:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6184:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6184:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6185:1: RULE_INT
            {
             before(grammarAccess.getLatDegrAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LatDegr__ValueAssignment12686); 
             after(grammarAccess.getLatDegrAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LatDegr__ValueAssignment


    // $ANTLR start rule__MinSec__ValueAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6194:1: rule__MinSec__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__MinSec__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6198:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6199:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6199:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6200:1: RULE_INT
            {
             before(grammarAccess.getMinSecAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MinSec__ValueAssignment_112717); 
             after(grammarAccess.getMinSecAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MinSec__ValueAssignment_1


    // $ANTLR start rule__SecDec__ValueAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6209:1: rule__SecDec__ValueAssignment_1 : ( RULE_REAL ) ;
    public final void rule__SecDec__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6213:1: ( ( RULE_REAL ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6214:1: ( RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6214:1: ( RULE_REAL )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6215:1: RULE_REAL
            {
             before(grammarAccess.getSecDecAccess().getValueREALTerminalRuleCall_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__SecDec__ValueAssignment_112748); 
             after(grammarAccess.getSecDecAccess().getValueREALTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecDec__ValueAssignment_1


    // $ANTLR start rule__MinDec__ValueAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6224:1: rule__MinDec__ValueAssignment_1 : ( RULE_REAL ) ;
    public final void rule__MinDec__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6228:1: ( ( RULE_REAL ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6229:1: ( RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6229:1: ( RULE_REAL )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6230:1: RULE_REAL
            {
             before(grammarAccess.getMinDecAccess().getValueREALTerminalRuleCall_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__MinDec__ValueAssignment_112779); 
             after(grammarAccess.getMinDecAccess().getValueREALTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MinDec__ValueAssignment_1


    // $ANTLR start rule__LongDec__ValueAssignment
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6239:1: rule__LongDec__ValueAssignment : ( RULE_REAL ) ;
    public final void rule__LongDec__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6243:1: ( ( RULE_REAL ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6244:1: ( RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6244:1: ( RULE_REAL )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6245:1: RULE_REAL
            {
             before(grammarAccess.getLongDecAccess().getValueREALTerminalRuleCall_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__LongDec__ValueAssignment12810); 
             after(grammarAccess.getLongDecAccess().getValueREALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LongDec__ValueAssignment


    // $ANTLR start rule__LatDec__ValueAssignment
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6254:1: rule__LatDec__ValueAssignment : ( RULE_REAL ) ;
    public final void rule__LatDec__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6258:1: ( ( RULE_REAL ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6259:1: ( RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6259:1: ( RULE_REAL )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6260:1: RULE_REAL
            {
             before(grammarAccess.getLatDecAccess().getValueREALTerminalRuleCall_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__LatDec__ValueAssignment12841); 
             after(grammarAccess.getLatDecAccess().getValueREALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LatDec__ValueAssignment


    // $ANTLR start rule__DA__DaAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6269:1: rule__DA__DaAssignment_1 : ( ruleDaParams ) ;
    public final void rule__DA__DaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6273:1: ( ( ruleDaParams ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6274:1: ( ruleDaParams )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6274:1: ( ruleDaParams )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6275:1: ruleDaParams
            {
             before(grammarAccess.getDAAccess().getDaDaParamsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDaParams_in_rule__DA__DaAssignment_112872);
            ruleDaParams();
            _fsp--;

             after(grammarAccess.getDAAccess().getDaDaParamsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DA__DaAssignment_1


    // $ANTLR start rule__DaParams1__RadiusAssignment_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6284:1: rule__DaParams1__RadiusAssignment_0 : ( RULE_REAL ) ;
    public final void rule__DaParams1__RadiusAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6288:1: ( ( RULE_REAL ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6289:1: ( RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6289:1: ( RULE_REAL )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6290:1: RULE_REAL
            {
             before(grammarAccess.getDaParams1Access().getRadiusREALTerminalRuleCall_0_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__DaParams1__RadiusAssignment_012903); 
             after(grammarAccess.getDaParams1Access().getRadiusREALTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__RadiusAssignment_0


    // $ANTLR start rule__DaParams1__AngleStartAssignment_2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6299:1: rule__DaParams1__AngleStartAssignment_2 : ( RULE_INT ) ;
    public final void rule__DaParams1__AngleStartAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6303:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6304:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6304:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6305:1: RULE_INT
            {
             before(grammarAccess.getDaParams1Access().getAngleStartINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DaParams1__AngleStartAssignment_212934); 
             after(grammarAccess.getDaParams1Access().getAngleStartINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__AngleStartAssignment_2


    // $ANTLR start rule__DaParams1__AngleEndAssignment_4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6314:1: rule__DaParams1__AngleEndAssignment_4 : ( RULE_INT ) ;
    public final void rule__DaParams1__AngleEndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6318:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6319:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6319:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6320:1: RULE_INT
            {
             before(grammarAccess.getDaParams1Access().getAngleEndINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DaParams1__AngleEndAssignment_412965); 
             after(grammarAccess.getDaParams1Access().getAngleEndINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams1__AngleEndAssignment_4


    // $ANTLR start rule__DaParams2__RadiusAssignment_0
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6329:1: rule__DaParams2__RadiusAssignment_0 : ( RULE_INT ) ;
    public final void rule__DaParams2__RadiusAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6333:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6334:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6334:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6335:1: RULE_INT
            {
             before(grammarAccess.getDaParams2Access().getRadiusINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DaParams2__RadiusAssignment_012996); 
             after(grammarAccess.getDaParams2Access().getRadiusINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__RadiusAssignment_0


    // $ANTLR start rule__DaParams2__AngleStartAssignment_2
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6344:1: rule__DaParams2__AngleStartAssignment_2 : ( RULE_INT ) ;
    public final void rule__DaParams2__AngleStartAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6348:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6349:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6349:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6350:1: RULE_INT
            {
             before(grammarAccess.getDaParams2Access().getAngleStartINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DaParams2__AngleStartAssignment_213027); 
             after(grammarAccess.getDaParams2Access().getAngleStartINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__AngleStartAssignment_2


    // $ANTLR start rule__DaParams2__AngleEndAssignment_4
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6359:1: rule__DaParams2__AngleEndAssignment_4 : ( RULE_INT ) ;
    public final void rule__DaParams2__AngleEndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6363:1: ( ( RULE_INT ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6364:1: ( RULE_INT )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6364:1: ( RULE_INT )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6365:1: RULE_INT
            {
             before(grammarAccess.getDaParams2Access().getAngleEndINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DaParams2__AngleEndAssignment_413058); 
             after(grammarAccess.getDaParams2Access().getAngleEndINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DaParams2__AngleEndAssignment_4


    // $ANTLR start rule__DB__Dp0Assignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6374:1: rule__DB__Dp0Assignment_1 : ( rulePoint ) ;
    public final void rule__DB__Dp0Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6378:1: ( ( rulePoint ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6379:1: ( rulePoint )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6379:1: ( rulePoint )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6380:1: rulePoint
            {
             before(grammarAccess.getDBAccess().getDp0PointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__DB__Dp0Assignment_113089);
            rulePoint();
            _fsp--;

             after(grammarAccess.getDBAccess().getDp0PointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DB__Dp0Assignment_1


    // $ANTLR start rule__DB__Dp1Assignment_3
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6389:1: rule__DB__Dp1Assignment_3 : ( rulePoint ) ;
    public final void rule__DB__Dp1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6393:1: ( ( rulePoint ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6394:1: ( rulePoint )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6394:1: ( rulePoint )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6395:1: rulePoint
            {
             before(grammarAccess.getDBAccess().getDp1PointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__DB__Dp1Assignment_313120);
            rulePoint();
            _fsp--;

             after(grammarAccess.getDBAccess().getDp1PointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DB__Dp1Assignment_3


    // $ANTLR start rule__AT__LpAssignment_1
    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6404:1: rule__AT__LpAssignment_1 : ( rulePoint ) ;
    public final void rule__AT__LpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6408:1: ( ( rulePoint ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6409:1: ( rulePoint )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6409:1: ( rulePoint )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6410:1: rulePoint
            {
             before(grammarAccess.getATAccess().getLpPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__AT__LpAssignment_113151);
            rulePoint();
            _fsp--;

             after(grammarAccess.getATAccess().getLpPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AT__LpAssignment_1


 

    public static final BitSet FOLLOW_ruleOpenAir_in_entryRuleOpenAir61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenAir68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenAir__AirspacesAssignment_in_ruleOpenAir94 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleAirspace_in_entryRuleAirspace122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAirspace129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Airspace__Group__0_in_ruleAirspace155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheDef_in_entryRuleTheDef182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheDef189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__Group__0_in_ruleTheDef215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsClass_in_entryRuleAsClass242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsClass249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AsClass__Group__0_in_ruleAsClass275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSP_in_entryRuleSP302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSP309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__0_in_ruleSP335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSB_in_entryRuleSB362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSB369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SB__Group__0_in_ruleSB395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsName_in_entryRuleAsName422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsName429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AsName__Group__0_in_ruleAsName455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimites_in_entryRuleLimites482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimites489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__Alternatives_in_ruleLimites515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheGeom_in_entryRuleTheGeom542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheGeom549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheGeom__Alternatives_in_ruleTheGeom575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLowLimit_in_entryRuleLowLimit602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLowLimit609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LowLimit__Group__0_in_ruleLowLimit635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighLimit_in_entryRuleHighLimit662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighLimit669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighLimit__Group__0_in_ruleHighLimit695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimit_in_entryRuleLimit722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimit729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limit__Alternatives_in_ruleLimit755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFL_in_entryRuleFL782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFL789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FL__Group__0_in_ruleFL815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSFC_in_entryRuleSFC842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSFC849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SFC__Group__0_in_ruleSFC875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGND_in_entryRuleGND902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGND909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GND__Group__0_in_ruleGND935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNL_in_entryRuleUNL962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNL969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNL__Group__0_in_ruleUNL995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAL_in_entryRuleVAL1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAL1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAL__Group__0_in_ruleVAL1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleV_in_entryRuleV1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleV1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__V__Group__0_in_ruleV1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVsub_in_entryRuleVsub1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVsub1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vsub__Alternatives_in_ruleVsub1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDir_in_entryRuleDir1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDir1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dir__Alternatives_in_ruleDir1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlus_in_entryRulePlus1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlus1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plus__Group__0_in_rulePlus1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_entryRuleMinus1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinus1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Minus__Group__0_in_ruleMinus1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDC_in_entryRuleDC1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDC1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DC__Group__0_in_ruleDC1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDP_in_entryRuleDP1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDP1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DP__Group__0_in_ruleDP1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Alternatives_in_rulePoint1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint1_in_entryRulePoint11562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint11569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__Group__0_in_rulePoint11595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint2_in_entryRulePoint21622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint21629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__Group__0_in_rulePoint21655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint3_in_entryRulePoint31682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint31689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__Group__0_in_rulePoint31715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint4_in_entryRulePoint41742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint41749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point4__Group__0_in_rulePoint41775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_entryRuleLongDegr1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongDegr1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongDegr__ValueAssignment_in_ruleLongDegr1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatDegr_in_entryRuleLatDegr1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLatDegr1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LatDegr__ValueAssignment_in_ruleLatDegr1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSec_in_entryRuleMinSec1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinSec1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinSec__Group__0_in_ruleMinSec1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecDec_in_entryRuleSecDec1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecDec1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecDec__Group__0_in_ruleSecDec2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinDec_in_entryRuleMinDec2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinDec2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinDec__Group__0_in_ruleMinDec2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDec_in_entryRuleLongDec2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongDec2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongDec__ValueAssignment_in_ruleLongDec2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatDec_in_entryRuleLatDec2162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLatDec2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LatDec__ValueAssignment_in_ruleLatDec2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_entryRuleSep2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSep2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSep2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDA_in_entryRuleDA2284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDA2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DA__Group__0_in_ruleDA2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams_in_entryRuleDaParams2344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaParams2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams__Alternatives_in_ruleDaParams2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams1_in_entryRuleDaParams12404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaParams12411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams1__Group__0_in_ruleDaParams12437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams2_in_entryRuleDaParams22464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaParams22471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams2__Group__0_in_ruleDaParams22497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDB_in_entryRuleDB2524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDB2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DB__Group__0_in_ruleDB2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAT_in_entryRuleAT2584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAT2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AT__Group__0_in_ruleAT2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Alternatives_in_ruleClassType2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Units__Alternatives_in_ruleUnits2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WE__Alternatives_in_ruleWE2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NS__Alternatives_in_ruleNS2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__Group_0__0_in_rule__Limites__Alternatives2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__Group_1__0_in_rule__Limites__Alternatives2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleV_in_rule__TheGeom__Alternatives2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDP_in_rule__TheGeom__Alternatives2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDA_in_rule__TheGeom__Alternatives2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDB_in_rule__TheGeom__Alternatives2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDC_in_rule__TheGeom__Alternatives2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFL_in_rule__Limit__Alternatives2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSFC_in_rule__Limit__Alternatives2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGND_in_rule__Limit__Alternatives2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNL_in_rule__Limit__Alternatives2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAL_in_rule__Limit__Alternatives3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vsub__Group_0__0_in_rule__Vsub__Alternatives3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vsub__Group_1__0_in_rule__Vsub__Alternatives3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlus_in_rule__Dir__Alternatives3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_rule__Dir__Alternatives3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint1_in_rule__Point__Alternatives3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint2_in_rule__Point__Alternatives3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint3_in_rule__Point__Alternatives3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint4_in_rule__Point__Alternatives3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams1_in_rule__DaParams__Alternatives3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams2_in_rule__DaParams__Alternatives3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ClassType__Alternatives3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ClassType__Alternatives3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ClassType__Alternatives3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ClassType__Alternatives3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ClassType__Alternatives3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ClassType__Alternatives3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ClassType__Alternatives3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ClassType__Alternatives3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ClassType__Alternatives3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClassType__Alternatives3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassType__Alternatives3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ClassType__Alternatives3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ClassType__Alternatives3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ClassType__Alternatives3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ClassType__Alternatives3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ClassType__Alternatives3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Units__Alternatives3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Units__Alternatives3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Units__Alternatives3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Units__Alternatives3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Units__Alternatives3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Units__Alternatives3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Units__Alternatives3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Units__Alternatives3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Units__Alternatives3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Units__Alternatives3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__WE__Alternatives3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WE__Alternatives3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__NS__Alternatives3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__NS__Alternatives3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Airspace__Group__0__Impl_in_rule__Airspace__Group__03968 = new BitSet(new long[]{0x1E10000000000002L});
    public static final BitSet FOLLOW_rule__Airspace__Group__1_in_rule__Airspace__Group__03971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Airspace__ThedefAssignment_0_in_rule__Airspace__Group__0__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Airspace__Group__1__Impl_in_rule__Airspace__Group__14028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Airspace__ThegeomAssignment_1_in_rule__Airspace__Group__1__Impl4055 = new BitSet(new long[]{0x1E10000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__Group__0__Impl_in_rule__TheDef__Group__04090 = new BitSet(new long[]{0x0000340000000000L});
    public static final BitSet FOLLOW_rule__TheDef__Group__1_in_rule__TheDef__Group__04093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__AsclassAssignment_0_in_rule__TheDef__Group__0__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__Group__1__Impl_in_rule__TheDef__Group__14150 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_rule__TheDef__Group__2_in_rule__TheDef__Group__14153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__SpAssignment_1_in_rule__TheDef__Group__1__Impl4180 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__TheDef__Group__2__Impl_in_rule__TheDef__Group__24211 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TheDef__Group__3_in_rule__TheDef__Group__24214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__SbAssignment_2_in_rule__TheDef__Group__2__Impl4241 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__TheDef__Group__3__Impl_in_rule__TheDef__Group__34272 = new BitSet(new long[]{0x2000C00000000000L});
    public static final BitSet FOLLOW_rule__TheDef__Group__4_in_rule__TheDef__Group__34275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__NameAssignment_3_in_rule__TheDef__Group__3__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__Group__4__Impl_in_rule__TheDef__Group__44332 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_rule__TheDef__Group__5_in_rule__TheDef__Group__44335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__AtAssignment_4_in_rule__TheDef__Group__4__Impl4362 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__Group__5__Impl_in_rule__TheDef__Group__54393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TheDef__LimitAssignment_5_in_rule__TheDef__Group__5__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AsClass__Group__0__Impl_in_rule__AsClass__Group__04462 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__AsClass__Group__1_in_rule__AsClass__Group__04465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AsClass__Group__1__Impl_in_rule__AsClass__Group__14523 = new BitSet(new long[]{0x000000001FFFE002L});
    public static final BitSet FOLLOW_rule__AsClass__Group__2_in_rule__AsClass__Group__14526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__AsClass__Group__1__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AsClass__Group__2__Impl_in_rule__AsClass__Group__24585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AsClass__NameAssignment_2_in_rule__AsClass__Group__2__Impl4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__0__Impl_in_rule__SP__Group__04649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SP__Group__1_in_rule__SP__Group__04652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SP__Group__0__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__1__Impl_in_rule__SP__Group__14711 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SP__Group__2_in_rule__SP__Group__14714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Sp0Assignment_1_in_rule__SP__Group__1__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__2__Impl_in_rule__SP__Group__24771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SP__Group__3_in_rule__SP__Group__24774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SP__Group__2__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__3__Impl_in_rule__SP__Group__34833 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SP__Group__4_in_rule__SP__Group__34836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Sp1Assignment_3_in_rule__SP__Group__3__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__4__Impl_in_rule__SP__Group__44893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SP__Group__5_in_rule__SP__Group__44896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SP__Group__4__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__5__Impl_in_rule__SP__Group__54955 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SP__Group__6_in_rule__SP__Group__54958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Sp2Assignment_5_in_rule__SP__Group__5__Impl4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__6__Impl_in_rule__SP__Group__65015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SP__Group__7_in_rule__SP__Group__65018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SP__Group__6__Impl5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__7__Impl_in_rule__SP__Group__75077 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SP__Group__8_in_rule__SP__Group__75080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Sp3Assignment_7_in_rule__SP__Group__7__Impl5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__8__Impl_in_rule__SP__Group__85137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SP__Group__9_in_rule__SP__Group__85140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SP__Group__8__Impl5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Group__9__Impl_in_rule__SP__Group__95199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SP__Sp4Assignment_9_in_rule__SP__Group__9__Impl5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SB__Group__0__Impl_in_rule__SB__Group__05276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SB__Group__1_in_rule__SB__Group__05279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SB__Group__0__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SB__Group__1__Impl_in_rule__SB__Group__15338 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SB__Group__2_in_rule__SB__Group__15341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SB__SbVal1Assignment_1_in_rule__SB__Group__1__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SB__Group__2__Impl_in_rule__SB__Group__25398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SB__Group__3_in_rule__SB__Group__25401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SB__Group__2__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SB__Group__3__Impl_in_rule__SB__Group__35460 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SB__Group__4_in_rule__SB__Group__35463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SB__SbVal2Assignment_3_in_rule__SB__Group__3__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SB__Group__4__Impl_in_rule__SB__Group__45520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SB__Group__5_in_rule__SB__Group__45523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SB__Group__4__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SB__Group__5__Impl_in_rule__SB__Group__55582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SB__SbVal3Assignment_5_in_rule__SB__Group__5__Impl5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AsName__Group__0__Impl_in_rule__AsName__Group__05651 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AsName__Group__1_in_rule__AsName__Group__05654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AsName__Group__0__Impl5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AsName__Group__1__Impl_in_rule__AsName__Group__15713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AsName__NameAssignment_1_in_rule__AsName__Group__1__Impl5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__Group_0__0__Impl_in_rule__Limites__Group_0__05774 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Limites__Group_0__1_in_rule__Limites__Group_0__05777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__LowLimitAssignment_0_0_in_rule__Limites__Group_0__0__Impl5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__Group_0__1__Impl_in_rule__Limites__Group_0__15834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__HighLimitAssignment_0_1_in_rule__Limites__Group_0__1__Impl5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__Group_1__0__Impl_in_rule__Limites__Group_1__05895 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Limites__Group_1__1_in_rule__Limites__Group_1__05898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__HeighLimitAssignment_1_0_in_rule__Limites__Group_1__0__Impl5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__Group_1__1__Impl_in_rule__Limites__Group_1__15955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Limites__LowLimitAssignment_1_1_in_rule__Limites__Group_1__1__Impl5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LowLimit__Group__0__Impl_in_rule__LowLimit__Group__06016 = new BitSet(new long[]{0x000F000000000010L});
    public static final BitSet FOLLOW_rule__LowLimit__Group__1_in_rule__LowLimit__Group__06019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__LowLimit__Group__0__Impl6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LowLimit__Group__1__Impl_in_rule__LowLimit__Group__16078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LowLimit__LlAssignment_1_in_rule__LowLimit__Group__1__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighLimit__Group__0__Impl_in_rule__HighLimit__Group__06139 = new BitSet(new long[]{0x000F000000000010L});
    public static final BitSet FOLLOW_rule__HighLimit__Group__1_in_rule__HighLimit__Group__06142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__HighLimit__Group__0__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighLimit__Group__1__Impl_in_rule__HighLimit__Group__16201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HighLimit__HlAssignment_1_in_rule__HighLimit__Group__1__Impl6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FL__Group__0__Impl_in_rule__FL__Group__06262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FL__Group__1_in_rule__FL__Group__06265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FL__Group__0__Impl6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FL__Group__1__Impl_in_rule__FL__Group__16324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FL__ValueAssignment_1_in_rule__FL__Group__1__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SFC__Group__0__Impl_in_rule__SFC__Group__06385 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__SFC__Group__1_in_rule__SFC__Group__06388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SFC__Group__1__Impl_in_rule__SFC__Group__16446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SFC__Group__1__Impl6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GND__Group__0__Impl_in_rule__GND__Group__06509 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__GND__Group__1_in_rule__GND__Group__06512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GND__Group__1__Impl_in_rule__GND__Group__16570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__GND__Group__1__Impl6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNL__Group__0__Impl_in_rule__UNL__Group__06633 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__UNL__Group__1_in_rule__UNL__Group__06636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNL__Group__1__Impl_in_rule__UNL__Group__16694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__UNL__Group__1__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAL__Group__0__Impl_in_rule__VAL__Group__06757 = new BitSet(new long[]{0x0000007FE0000000L});
    public static final BitSet FOLLOW_rule__VAL__Group__1_in_rule__VAL__Group__06760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAL__ValueAssignment_0_in_rule__VAL__Group__0__Impl6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAL__Group__1__Impl_in_rule__VAL__Group__16817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VAL__UnitAssignment_1_in_rule__VAL__Group__1__Impl6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__V__Group__0__Impl_in_rule__V__Group__06878 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_rule__V__Group__1_in_rule__V__Group__06881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__V__Group__0__Impl6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__V__Group__1__Impl_in_rule__V__Group__16940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__V__VsubAssignment_1_in_rule__V__Group__1__Impl6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vsub__Group_0__0__Impl_in_rule__Vsub__Group_0__07001 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Vsub__Group_0__1_in_rule__Vsub__Group_0__07004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Vsub__Group_0__0__Impl7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vsub__Group_0__1__Impl_in_rule__Vsub__Group_0__17063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vsub__XAssignment_0_1_in_rule__Vsub__Group_0__1__Impl7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vsub__Group_1__0__Impl_in_rule__Vsub__Group_1__07124 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_rule__Vsub__Group_1__1_in_rule__Vsub__Group_1__07127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Vsub__Group_1__0__Impl7155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vsub__Group_1__1__Impl_in_rule__Vsub__Group_1__17186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vsub__DAssignment_1_1_in_rule__Vsub__Group_1__1__Impl7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plus__Group__0__Impl_in_rule__Plus__Group__07247 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Plus__Group__1_in_rule__Plus__Group__07250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Plus__Group__1__Impl_in_rule__Plus__Group__17308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Plus__Group__1__Impl7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Minus__Group__0__Impl_in_rule__Minus__Group__07371 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Minus__Group__1_in_rule__Minus__Group__07374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Minus__Group__1__Impl_in_rule__Minus__Group__17432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Minus__Group__1__Impl7460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DC__Group__0__Impl_in_rule__DC__Group__07495 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DC__Group__1_in_rule__DC__Group__07498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__DC__Group__0__Impl7526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DC__Group__1__Impl_in_rule__DC__Group__17557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DC__RadiusAssignment_1_in_rule__DC__Group__1__Impl7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DP__Group__0__Impl_in_rule__DP__Group__07618 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__DP__Group__1_in_rule__DP__Group__07621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__DP__Group__0__Impl7649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DP__Group__1__Impl_in_rule__DP__Group__17680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DP__DpAssignment_1_in_rule__DP__Group__1__Impl7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__Group__0__Impl_in_rule__Point1__Group__07741 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Point1__Group__1_in_rule__Point1__Group__07744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__LongDAssignment_0_in_rule__Point1__Group__0__Impl7771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__Group__1__Impl_in_rule__Point1__Group__17801 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Point1__Group__2_in_rule__Point1__Group__17804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__LongMAssignment_1_in_rule__Point1__Group__1__Impl7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__Group__2__Impl_in_rule__Point1__Group__27861 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Point1__Group__3_in_rule__Point1__Group__27864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__LongSAssignment_2_in_rule__Point1__Group__2__Impl7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__Group__3__Impl_in_rule__Point1__Group__37921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Point1__Group__4_in_rule__Point1__Group__37924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__NsAssignment_3_in_rule__Point1__Group__3__Impl7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__Group__4__Impl_in_rule__Point1__Group__47981 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Point1__Group__5_in_rule__Point1__Group__47984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__LatDAssignment_4_in_rule__Point1__Group__4__Impl8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__Group__5__Impl_in_rule__Point1__Group__58041 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Point1__Group__6_in_rule__Point1__Group__58044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__LatMAssignment_5_in_rule__Point1__Group__5__Impl8071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__Group__6__Impl_in_rule__Point1__Group__68101 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_rule__Point1__Group__7_in_rule__Point1__Group__68104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__LatSAssignment_6_in_rule__Point1__Group__6__Impl8131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__Group__7__Impl_in_rule__Point1__Group__78161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point1__WeAssignment_7_in_rule__Point1__Group__7__Impl8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__Group__0__Impl_in_rule__Point2__Group__08234 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Point2__Group__1_in_rule__Point2__Group__08237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__LongDAssignment_0_in_rule__Point2__Group__0__Impl8264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__Group__1__Impl_in_rule__Point2__Group__18294 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Point2__Group__2_in_rule__Point2__Group__18297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__LongMfAssignment_1_in_rule__Point2__Group__1__Impl8324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__Group__2__Impl_in_rule__Point2__Group__28354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Point2__Group__3_in_rule__Point2__Group__28357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__NsAssignment_2_in_rule__Point2__Group__2__Impl8384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__Group__3__Impl_in_rule__Point2__Group__38414 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Point2__Group__4_in_rule__Point2__Group__38417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__LatDAssignment_3_in_rule__Point2__Group__3__Impl8444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__Group__4__Impl_in_rule__Point2__Group__48474 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_rule__Point2__Group__5_in_rule__Point2__Group__48477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__LatMfAssignment_4_in_rule__Point2__Group__4__Impl8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__Group__5__Impl_in_rule__Point2__Group__58534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point2__WeAssignment_5_in_rule__Point2__Group__5__Impl8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__Group__0__Impl_in_rule__Point3__Group__08603 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Point3__Group__1_in_rule__Point3__Group__08606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__LongDAssignment_0_in_rule__Point3__Group__0__Impl8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__Group__1__Impl_in_rule__Point3__Group__18663 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Point3__Group__2_in_rule__Point3__Group__18666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__LongMAssignment_1_in_rule__Point3__Group__1__Impl8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__Group__2__Impl_in_rule__Point3__Group__28723 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Point3__Group__3_in_rule__Point3__Group__28726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__LongSAssignment_2_in_rule__Point3__Group__2__Impl8753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__Group__3__Impl_in_rule__Point3__Group__38783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Point3__Group__4_in_rule__Point3__Group__38786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__NsAssignment_3_in_rule__Point3__Group__3__Impl8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__Group__4__Impl_in_rule__Point3__Group__48843 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Point3__Group__5_in_rule__Point3__Group__48846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__LatDAssignment_4_in_rule__Point3__Group__4__Impl8873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__Group__5__Impl_in_rule__Point3__Group__58903 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Point3__Group__6_in_rule__Point3__Group__58906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__LatMAssignment_5_in_rule__Point3__Group__5__Impl8933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__Group__6__Impl_in_rule__Point3__Group__68963 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_rule__Point3__Group__7_in_rule__Point3__Group__68966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__LatSAssignment_6_in_rule__Point3__Group__6__Impl8993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__Group__7__Impl_in_rule__Point3__Group__79023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point3__WeAssignment_7_in_rule__Point3__Group__7__Impl9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point4__Group__0__Impl_in_rule__Point4__Group__09096 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Point4__Group__1_in_rule__Point4__Group__09099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point4__LongDAssignment_0_in_rule__Point4__Group__0__Impl9126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point4__Group__1__Impl_in_rule__Point4__Group__19156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Point4__Group__2_in_rule__Point4__Group__19159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point4__NsAssignment_1_in_rule__Point4__Group__1__Impl9186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point4__Group__2__Impl_in_rule__Point4__Group__29216 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_rule__Point4__Group__3_in_rule__Point4__Group__29219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point4__LatDAssignment_2_in_rule__Point4__Group__2__Impl9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point4__Group__3__Impl_in_rule__Point4__Group__39276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point4__WeAssignment_3_in_rule__Point4__Group__3__Impl9303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinSec__Group__0__Impl_in_rule__MinSec__Group__09341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MinSec__Group__1_in_rule__MinSec__Group__09344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_rule__MinSec__Group__0__Impl9371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinSec__Group__1__Impl_in_rule__MinSec__Group__19400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinSec__ValueAssignment_1_in_rule__MinSec__Group__1__Impl9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecDec__Group__0__Impl_in_rule__SecDec__Group__09461 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SecDec__Group__1_in_rule__SecDec__Group__09464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_rule__SecDec__Group__0__Impl9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecDec__Group__1__Impl_in_rule__SecDec__Group__19520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecDec__ValueAssignment_1_in_rule__SecDec__Group__1__Impl9547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinDec__Group__0__Impl_in_rule__MinDec__Group__09581 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__MinDec__Group__1_in_rule__MinDec__Group__09584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_rule__MinDec__Group__0__Impl9611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinDec__Group__1__Impl_in_rule__MinDec__Group__19640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinDec__ValueAssignment_1_in_rule__MinDec__Group__1__Impl9667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DA__Group__0__Impl_in_rule__DA__Group__09701 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__DA__Group__1_in_rule__DA__Group__09704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__DA__Group__0__Impl9732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DA__Group__1__Impl_in_rule__DA__Group__19763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DA__DaAssignment_1_in_rule__DA__Group__1__Impl9790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams1__Group__0__Impl_in_rule__DaParams1__Group__09824 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DaParams1__Group__1_in_rule__DaParams1__Group__09827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams1__RadiusAssignment_0_in_rule__DaParams1__Group__0__Impl9854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams1__Group__1__Impl_in_rule__DaParams1__Group__19884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DaParams1__Group__2_in_rule__DaParams1__Group__19887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DaParams1__Group__1__Impl9915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams1__Group__2__Impl_in_rule__DaParams1__Group__29946 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DaParams1__Group__3_in_rule__DaParams1__Group__29949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams1__AngleStartAssignment_2_in_rule__DaParams1__Group__2__Impl9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams1__Group__3__Impl_in_rule__DaParams1__Group__310006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DaParams1__Group__4_in_rule__DaParams1__Group__310009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DaParams1__Group__3__Impl10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams1__Group__4__Impl_in_rule__DaParams1__Group__410068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams1__AngleEndAssignment_4_in_rule__DaParams1__Group__4__Impl10095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams2__Group__0__Impl_in_rule__DaParams2__Group__010135 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DaParams2__Group__1_in_rule__DaParams2__Group__010138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams2__RadiusAssignment_0_in_rule__DaParams2__Group__0__Impl10165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams2__Group__1__Impl_in_rule__DaParams2__Group__110195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DaParams2__Group__2_in_rule__DaParams2__Group__110198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DaParams2__Group__1__Impl10226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams2__Group__2__Impl_in_rule__DaParams2__Group__210257 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DaParams2__Group__3_in_rule__DaParams2__Group__210260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams2__AngleStartAssignment_2_in_rule__DaParams2__Group__2__Impl10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams2__Group__3__Impl_in_rule__DaParams2__Group__310317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DaParams2__Group__4_in_rule__DaParams2__Group__310320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DaParams2__Group__3__Impl10348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams2__Group__4__Impl_in_rule__DaParams2__Group__410379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DaParams2__AngleEndAssignment_4_in_rule__DaParams2__Group__4__Impl10406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DB__Group__0__Impl_in_rule__DB__Group__010446 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__DB__Group__1_in_rule__DB__Group__010449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__DB__Group__0__Impl10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DB__Group__1__Impl_in_rule__DB__Group__110508 = new BitSet(new long[]{0x0000080000000050L});
    public static final BitSet FOLLOW_rule__DB__Group__2_in_rule__DB__Group__110511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DB__Dp0Assignment_1_in_rule__DB__Group__1__Impl10538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DB__Group__2__Impl_in_rule__DB__Group__210568 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__DB__Group__3_in_rule__DB__Group__210571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DB__Group__2__Impl10600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DB__Group__3__Impl_in_rule__DB__Group__310633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DB__Dp1Assignment_3_in_rule__DB__Group__3__Impl10660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AT__Group__0__Impl_in_rule__AT__Group__010698 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__AT__Group__1_in_rule__AT__Group__010701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__AT__Group__0__Impl10729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AT__Group__1__Impl_in_rule__AT__Group__110760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AT__LpAssignment_1_in_rule__AT__Group__1__Impl10787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAirspace_in_rule__OpenAir__AirspacesAssignment10826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheDef_in_rule__Airspace__ThedefAssignment_010857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheGeom_in_rule__Airspace__ThegeomAssignment_110888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsClass_in_rule__TheDef__AsclassAssignment_010919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSP_in_rule__TheDef__SpAssignment_110950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSB_in_rule__TheDef__SbAssignment_210981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsName_in_rule__TheDef__NameAssignment_311012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAT_in_rule__TheDef__AtAssignment_411043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimites_in_rule__TheDef__LimitAssignment_511074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_rule__AsClass__NameAssignment_211105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SP__Sp0Assignment_111136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SP__Sp1Assignment_311167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SP__Sp2Assignment_511198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SP__Sp3Assignment_711229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SP__Sp4Assignment_911260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SB__SbVal1Assignment_111291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SB__SbVal2Assignment_311322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SB__SbVal3Assignment_511353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AsName__NameAssignment_111384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLowLimit_in_rule__Limites__LowLimitAssignment_0_011415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighLimit_in_rule__Limites__HighLimitAssignment_0_111446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighLimit_in_rule__Limites__HeighLimitAssignment_1_011477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLowLimit_in_rule__Limites__LowLimitAssignment_1_111508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimit_in_rule__LowLimit__LlAssignment_111539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimit_in_rule__HighLimit__HlAssignment_111570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FL__ValueAssignment_111601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VAL__ValueAssignment_011632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnits_in_rule__VAL__UnitAssignment_111663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVsub_in_rule__V__VsubAssignment_111694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__Vsub__XAssignment_0_111725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDir_in_rule__Vsub__DAssignment_1_111756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__DC__RadiusAssignment_111787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__DP__DpAssignment_111818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_rule__Point1__LongDAssignment_011849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSec_in_rule__Point1__LongMAssignment_111880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSec_in_rule__Point1__LongSAssignment_211911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNS_in_rule__Point1__NsAssignment_311942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatDegr_in_rule__Point1__LatDAssignment_411973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSec_in_rule__Point1__LatMAssignment_512004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSec_in_rule__Point1__LatSAssignment_612035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWE_in_rule__Point1__WeAssignment_712066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_rule__Point2__LongDAssignment_012097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinDec_in_rule__Point2__LongMfAssignment_112128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNS_in_rule__Point2__NsAssignment_212159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatDegr_in_rule__Point2__LatDAssignment_312190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinDec_in_rule__Point2__LatMfAssignment_412221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWE_in_rule__Point2__WeAssignment_512252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_rule__Point3__LongDAssignment_012283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSec_in_rule__Point3__LongMAssignment_112314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecDec_in_rule__Point3__LongSAssignment_212345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNS_in_rule__Point3__NsAssignment_312376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatDegr_in_rule__Point3__LatDAssignment_412407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSec_in_rule__Point3__LatMAssignment_512438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecDec_in_rule__Point3__LatSAssignment_612469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWE_in_rule__Point3__WeAssignment_712500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDec_in_rule__Point4__LongDAssignment_012531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNS_in_rule__Point4__NsAssignment_112562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatDec_in_rule__Point4__LatDAssignment_212593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWE_in_rule__Point4__WeAssignment_312624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LongDegr__ValueAssignment12655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LatDegr__ValueAssignment12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MinSec__ValueAssignment_112717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__SecDec__ValueAssignment_112748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__MinDec__ValueAssignment_112779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__LongDec__ValueAssignment12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__LatDec__ValueAssignment12841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams_in_rule__DA__DaAssignment_112872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__DaParams1__RadiusAssignment_012903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DaParams1__AngleStartAssignment_212934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DaParams1__AngleEndAssignment_412965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DaParams2__RadiusAssignment_012996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DaParams2__AngleStartAssignment_213027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DaParams2__AngleEndAssignment_413058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__DB__Dp0Assignment_113089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__DB__Dp1Assignment_313120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__AT__LpAssignment_113151 = new BitSet(new long[]{0x0000000000000002L});

}