package www.ubx.ch.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import www.ubx.ch.services.OpenAirGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenAirParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_REAL", "RULE_SL_COMMENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AC'", "'SP'", "','", "'SB'", "'AN'", "'AL'", "'AH'", "'FL'", "'SFC'", "'GND'", "'UNL'", "'V'", "'X='", "'D='", "'+'", "'-'", "'DC'", "'DP'", "':'", "'DA'", "'DB'", "'AT'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'Q'", "'R'", "'W'", "'P'", "'GP'", "'TMZ'", "'CTR'", "'Restricted'", "'UKN'", "'ft'", "'m'", "'MSL'", "'m MSL'", "'ft MSL'", "'AGL'", "'m AGL'", "'ft AGL'", "'AMSL'", "'m AMSL'", "'N'", "'S'"
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
    public String getGrammarFileName() { return "../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g"; }



     	private OpenAirGrammarAccess grammarAccess;
     	
        public InternalOpenAirParser(TokenStream input, IAstFactory factory, OpenAirGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("www/ubx/ch/parser/antlr/internal/InternalOpenAir.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "OpenAir";	
       	}
       	
       	@Override
       	protected OpenAirGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleOpenAir
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:78:1: entryRuleOpenAir returns [EObject current=null] : iv_ruleOpenAir= ruleOpenAir EOF ;
    public final EObject entryRuleOpenAir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenAir = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:79:2: (iv_ruleOpenAir= ruleOpenAir EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:80:2: iv_ruleOpenAir= ruleOpenAir EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOpenAirRule(), currentNode); 
            pushFollow(FOLLOW_ruleOpenAir_in_entryRuleOpenAir75);
            iv_ruleOpenAir=ruleOpenAir();
            _fsp--;

             current =iv_ruleOpenAir; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenAir85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOpenAir


    // $ANTLR start ruleOpenAir
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:87:1: ruleOpenAir returns [EObject current=null] : ( (lv_airspaces_0_0= ruleAirspace ) )* ;
    public final EObject ruleOpenAir() throws RecognitionException {
        EObject current = null;

        EObject lv_airspaces_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:92:6: ( ( (lv_airspaces_0_0= ruleAirspace ) )* )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:93:1: ( (lv_airspaces_0_0= ruleAirspace ) )*
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:93:1: ( (lv_airspaces_0_0= ruleAirspace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:94:1: (lv_airspaces_0_0= ruleAirspace )
            	    {
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:94:1: (lv_airspaces_0_0= ruleAirspace )
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:95:3: lv_airspaces_0_0= ruleAirspace
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOpenAirAccess().getAirspacesAirspaceParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAirspace_in_ruleOpenAir130);
            	    lv_airspaces_0_0=ruleAirspace();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOpenAirRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"airspaces",
            	    	        		lv_airspaces_0_0, 
            	    	        		"Airspace", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOpenAir


    // $ANTLR start entryRuleAirspace
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:125:1: entryRuleAirspace returns [EObject current=null] : iv_ruleAirspace= ruleAirspace EOF ;
    public final EObject entryRuleAirspace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAirspace = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:126:2: (iv_ruleAirspace= ruleAirspace EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:127:2: iv_ruleAirspace= ruleAirspace EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAirspaceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAirspace_in_entryRuleAirspace166);
            iv_ruleAirspace=ruleAirspace();
            _fsp--;

             current =iv_ruleAirspace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAirspace176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAirspace


    // $ANTLR start ruleAirspace
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:134:1: ruleAirspace returns [EObject current=null] : ( ( (lv_thedef_0_0= ruleTheDef ) ) ( (lv_thegeom_1_0= ruleTheGeom ) )* ) ;
    public final EObject ruleAirspace() throws RecognitionException {
        EObject current = null;

        EObject lv_thedef_0_0 = null;

        EObject lv_thegeom_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:139:6: ( ( ( (lv_thedef_0_0= ruleTheDef ) ) ( (lv_thegeom_1_0= ruleTheGeom ) )* ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:140:1: ( ( (lv_thedef_0_0= ruleTheDef ) ) ( (lv_thegeom_1_0= ruleTheGeom ) )* )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:140:1: ( ( (lv_thedef_0_0= ruleTheDef ) ) ( (lv_thegeom_1_0= ruleTheGeom ) )* )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:140:2: ( (lv_thedef_0_0= ruleTheDef ) ) ( (lv_thegeom_1_0= ruleTheGeom ) )*
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:140:2: ( (lv_thedef_0_0= ruleTheDef ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:141:1: (lv_thedef_0_0= ruleTheDef )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:141:1: (lv_thedef_0_0= ruleTheDef )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:142:3: lv_thedef_0_0= ruleTheDef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAirspaceAccess().getThedefTheDefParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTheDef_in_ruleAirspace222);
            lv_thedef_0_0=ruleTheDef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAirspaceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"thedef",
            	        		lv_thedef_0_0, 
            	        		"TheDef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:164:2: ( (lv_thegeom_1_0= ruleTheGeom ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23||(LA2_0>=28 && LA2_0<=29)||(LA2_0>=31 && LA2_0<=32)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:165:1: (lv_thegeom_1_0= ruleTheGeom )
            	    {
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:165:1: (lv_thegeom_1_0= ruleTheGeom )
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:166:3: lv_thegeom_1_0= ruleTheGeom
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAirspaceAccess().getThegeomTheGeomParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTheGeom_in_ruleAirspace243);
            	    lv_thegeom_1_0=ruleTheGeom();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAirspaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"thegeom",
            	    	        		lv_thegeom_1_0, 
            	    	        		"TheGeom", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAirspace


    // $ANTLR start entryRuleTheDef
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:196:1: entryRuleTheDef returns [EObject current=null] : iv_ruleTheDef= ruleTheDef EOF ;
    public final EObject entryRuleTheDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheDef = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:197:2: (iv_ruleTheDef= ruleTheDef EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:198:2: iv_ruleTheDef= ruleTheDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTheDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleTheDef_in_entryRuleTheDef280);
            iv_ruleTheDef=ruleTheDef();
            _fsp--;

             current =iv_ruleTheDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheDef290); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTheDef


    // $ANTLR start ruleTheDef
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:205:1: ruleTheDef returns [EObject current=null] : ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ) ;
    public final EObject ruleTheDef() throws RecognitionException {
        EObject current = null;

        EObject lv_asclass_0_0 = null;

        EObject lv_sp_1_0 = null;

        EObject lv_sb_2_0 = null;

        EObject lv_name_3_0 = null;

        EObject lv_at_4_0 = null;

        EObject lv_limit_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:210:6: ( ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:211:1: ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:211:1: ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:211:2: ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:211:2: ( (lv_asclass_0_0= ruleAsClass ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:212:1: (lv_asclass_0_0= ruleAsClass )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:212:1: (lv_asclass_0_0= ruleAsClass )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:213:3: lv_asclass_0_0= ruleAsClass
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTheDefAccess().getAsclassAsClassParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAsClass_in_ruleTheDef336);
            lv_asclass_0_0=ruleAsClass();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTheDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"asclass",
            	        		lv_asclass_0_0, 
            	        		"AsClass", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:235:2: ( (lv_sp_1_0= ruleSP ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:236:1: (lv_sp_1_0= ruleSP )
            	    {
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:236:1: (lv_sp_1_0= ruleSP )
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:237:3: lv_sp_1_0= ruleSP
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTheDefAccess().getSpSPParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSP_in_ruleTheDef357);
            	    lv_sp_1_0=ruleSP();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTheDefRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sp",
            	    	        		lv_sp_1_0, 
            	    	        		"SP", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:259:3: ( (lv_sb_2_0= ruleSB ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:260:1: (lv_sb_2_0= ruleSB )
            	    {
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:260:1: (lv_sb_2_0= ruleSB )
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:261:3: lv_sb_2_0= ruleSB
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTheDefAccess().getSbSBParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSB_in_ruleTheDef379);
            	    lv_sb_2_0=ruleSB();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTheDefRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sb",
            	    	        		lv_sb_2_0, 
            	    	        		"SB", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:283:3: ( (lv_name_3_0= ruleAsName ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:284:1: (lv_name_3_0= ruleAsName )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:284:1: (lv_name_3_0= ruleAsName )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:285:3: lv_name_3_0= ruleAsName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTheDefAccess().getNameAsNameParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAsName_in_ruleTheDef401);
            lv_name_3_0=ruleAsName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTheDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"AsName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:307:2: ( (lv_at_4_0= ruleAT ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:308:1: (lv_at_4_0= ruleAT )
            	    {
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:308:1: (lv_at_4_0= ruleAT )
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:309:3: lv_at_4_0= ruleAT
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTheDefAccess().getAtATParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAT_in_ruleTheDef422);
            	    lv_at_4_0=ruleAT();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTheDefRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"at",
            	    	        		lv_at_4_0, 
            	    	        		"AT", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:331:3: ( (lv_limit_5_0= ruleLimites ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:332:1: (lv_limit_5_0= ruleLimites )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:332:1: (lv_limit_5_0= ruleLimites )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:333:3: lv_limit_5_0= ruleLimites
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTheDefAccess().getLimitLimitesParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLimites_in_ruleTheDef444);
            lv_limit_5_0=ruleLimites();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTheDefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"limit",
            	        		lv_limit_5_0, 
            	        		"Limites", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTheDef


    // $ANTLR start entryRuleAsClass
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:363:1: entryRuleAsClass returns [EObject current=null] : iv_ruleAsClass= ruleAsClass EOF ;
    public final EObject entryRuleAsClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsClass = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:364:2: (iv_ruleAsClass= ruleAsClass EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:365:2: iv_ruleAsClass= ruleAsClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAsClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleAsClass_in_entryRuleAsClass480);
            iv_ruleAsClass=ruleAsClass();
            _fsp--;

             current =iv_ruleAsClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsClass490); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAsClass


    // $ANTLR start ruleAsClass
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:372:1: ruleAsClass returns [EObject current=null] : ( () 'AC' ( (lv_name_2_0= ruleClassType ) )? ) ;
    public final EObject ruleAsClass() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:377:6: ( ( () 'AC' ( (lv_name_2_0= ruleClassType ) )? ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:378:1: ( () 'AC' ( (lv_name_2_0= ruleClassType ) )? )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:378:1: ( () 'AC' ( (lv_name_2_0= ruleClassType ) )? )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:378:2: () 'AC' ( (lv_name_2_0= ruleClassType ) )?
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:378:2: ()
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:379:5: 
            {
             
                    temp=factory.create(grammarAccess.getAsClassAccess().getAsClassAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAsClassAccess().getAsClassAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,12,FOLLOW_12_in_ruleAsClass534); 

                    createLeafNode(grammarAccess.getAsClassAccess().getACKeyword_1(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:393:1: ( (lv_name_2_0= ruleClassType ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=34 && LA6_0<=49)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:394:1: (lv_name_2_0= ruleClassType )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:394:1: (lv_name_2_0= ruleClassType )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:395:3: lv_name_2_0= ruleClassType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAsClassAccess().getNameClassTypeEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleClassType_in_ruleAsClass555);
                    lv_name_2_0=ruleClassType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAsClassRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_0, 
                    	        		"ClassType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAsClass


    // $ANTLR start entryRuleSP
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:425:1: entryRuleSP returns [EObject current=null] : iv_ruleSP= ruleSP EOF ;
    public final EObject entryRuleSP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSP = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:426:2: (iv_ruleSP= ruleSP EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:427:2: iv_ruleSP= ruleSP EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSPRule(), currentNode); 
            pushFollow(FOLLOW_ruleSP_in_entryRuleSP592);
            iv_ruleSP=ruleSP();
            _fsp--;

             current =iv_ruleSP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSP602); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSP


    // $ANTLR start ruleSP
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:434:1: ruleSP returns [EObject current=null] : ( 'SP' ( (lv_sp0_1_0= RULE_INT ) ) ',' ( (lv_sp1_3_0= RULE_INT ) ) ',' ( (lv_sp2_5_0= RULE_INT ) ) ',' ( (lv_sp3_7_0= RULE_INT ) ) ',' ( (lv_sp4_9_0= RULE_INT ) ) ) ;
    public final EObject ruleSP() throws RecognitionException {
        EObject current = null;

        Token lv_sp0_1_0=null;
        Token lv_sp1_3_0=null;
        Token lv_sp2_5_0=null;
        Token lv_sp3_7_0=null;
        Token lv_sp4_9_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:439:6: ( ( 'SP' ( (lv_sp0_1_0= RULE_INT ) ) ',' ( (lv_sp1_3_0= RULE_INT ) ) ',' ( (lv_sp2_5_0= RULE_INT ) ) ',' ( (lv_sp3_7_0= RULE_INT ) ) ',' ( (lv_sp4_9_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:440:1: ( 'SP' ( (lv_sp0_1_0= RULE_INT ) ) ',' ( (lv_sp1_3_0= RULE_INT ) ) ',' ( (lv_sp2_5_0= RULE_INT ) ) ',' ( (lv_sp3_7_0= RULE_INT ) ) ',' ( (lv_sp4_9_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:440:1: ( 'SP' ( (lv_sp0_1_0= RULE_INT ) ) ',' ( (lv_sp1_3_0= RULE_INT ) ) ',' ( (lv_sp2_5_0= RULE_INT ) ) ',' ( (lv_sp3_7_0= RULE_INT ) ) ',' ( (lv_sp4_9_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:440:3: 'SP' ( (lv_sp0_1_0= RULE_INT ) ) ',' ( (lv_sp1_3_0= RULE_INT ) ) ',' ( (lv_sp2_5_0= RULE_INT ) ) ',' ( (lv_sp3_7_0= RULE_INT ) ) ',' ( (lv_sp4_9_0= RULE_INT ) )
            {
            match(input,13,FOLLOW_13_in_ruleSP637); 

                    createLeafNode(grammarAccess.getSPAccess().getSPKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:444:1: ( (lv_sp0_1_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:445:1: (lv_sp0_1_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:445:1: (lv_sp0_1_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:446:3: lv_sp0_1_0= RULE_INT
            {
            lv_sp0_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSP654); 

            			createLeafNode(grammarAccess.getSPAccess().getSp0INTTerminalRuleCall_1_0(), "sp0"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSPRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"sp0",
            	        		lv_sp0_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleSP669); 

                    createLeafNode(grammarAccess.getSPAccess().getCommaKeyword_2(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:472:1: ( (lv_sp1_3_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:473:1: (lv_sp1_3_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:473:1: (lv_sp1_3_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:474:3: lv_sp1_3_0= RULE_INT
            {
            lv_sp1_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSP686); 

            			createLeafNode(grammarAccess.getSPAccess().getSp1INTTerminalRuleCall_3_0(), "sp1"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSPRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"sp1",
            	        		lv_sp1_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleSP701); 

                    createLeafNode(grammarAccess.getSPAccess().getCommaKeyword_4(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:500:1: ( (lv_sp2_5_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:501:1: (lv_sp2_5_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:501:1: (lv_sp2_5_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:502:3: lv_sp2_5_0= RULE_INT
            {
            lv_sp2_5_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSP718); 

            			createLeafNode(grammarAccess.getSPAccess().getSp2INTTerminalRuleCall_5_0(), "sp2"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSPRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"sp2",
            	        		lv_sp2_5_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleSP733); 

                    createLeafNode(grammarAccess.getSPAccess().getCommaKeyword_6(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:528:1: ( (lv_sp3_7_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:529:1: (lv_sp3_7_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:529:1: (lv_sp3_7_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:530:3: lv_sp3_7_0= RULE_INT
            {
            lv_sp3_7_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSP750); 

            			createLeafNode(grammarAccess.getSPAccess().getSp3INTTerminalRuleCall_7_0(), "sp3"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSPRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"sp3",
            	        		lv_sp3_7_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleSP765); 

                    createLeafNode(grammarAccess.getSPAccess().getCommaKeyword_8(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:556:1: ( (lv_sp4_9_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:557:1: (lv_sp4_9_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:557:1: (lv_sp4_9_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:558:3: lv_sp4_9_0= RULE_INT
            {
            lv_sp4_9_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSP782); 

            			createLeafNode(grammarAccess.getSPAccess().getSp4INTTerminalRuleCall_9_0(), "sp4"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSPRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"sp4",
            	        		lv_sp4_9_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSP


    // $ANTLR start entryRuleSB
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:588:1: entryRuleSB returns [EObject current=null] : iv_ruleSB= ruleSB EOF ;
    public final EObject entryRuleSB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSB = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:589:2: (iv_ruleSB= ruleSB EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:590:2: iv_ruleSB= ruleSB EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSBRule(), currentNode); 
            pushFollow(FOLLOW_ruleSB_in_entryRuleSB823);
            iv_ruleSB=ruleSB();
            _fsp--;

             current =iv_ruleSB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSB833); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSB


    // $ANTLR start ruleSB
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:597:1: ruleSB returns [EObject current=null] : ( 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) ',' ( (lv_sbVal2_3_0= RULE_INT ) ) ',' ( (lv_sbVal3_5_0= RULE_INT ) ) ) ;
    public final EObject ruleSB() throws RecognitionException {
        EObject current = null;

        Token lv_sbVal1_1_0=null;
        Token lv_sbVal2_3_0=null;
        Token lv_sbVal3_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:602:6: ( ( 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) ',' ( (lv_sbVal2_3_0= RULE_INT ) ) ',' ( (lv_sbVal3_5_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:603:1: ( 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) ',' ( (lv_sbVal2_3_0= RULE_INT ) ) ',' ( (lv_sbVal3_5_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:603:1: ( 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) ',' ( (lv_sbVal2_3_0= RULE_INT ) ) ',' ( (lv_sbVal3_5_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:603:3: 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) ',' ( (lv_sbVal2_3_0= RULE_INT ) ) ',' ( (lv_sbVal3_5_0= RULE_INT ) )
            {
            match(input,15,FOLLOW_15_in_ruleSB868); 

                    createLeafNode(grammarAccess.getSBAccess().getSBKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:607:1: ( (lv_sbVal1_1_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:608:1: (lv_sbVal1_1_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:608:1: (lv_sbVal1_1_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:609:3: lv_sbVal1_1_0= RULE_INT
            {
            lv_sbVal1_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSB885); 

            			createLeafNode(grammarAccess.getSBAccess().getSbVal1INTTerminalRuleCall_1_0(), "sbVal1"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSBRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"sbVal1",
            	        		lv_sbVal1_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleSB900); 

                    createLeafNode(grammarAccess.getSBAccess().getCommaKeyword_2(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:635:1: ( (lv_sbVal2_3_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:636:1: (lv_sbVal2_3_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:636:1: (lv_sbVal2_3_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:637:3: lv_sbVal2_3_0= RULE_INT
            {
            lv_sbVal2_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSB917); 

            			createLeafNode(grammarAccess.getSBAccess().getSbVal2INTTerminalRuleCall_3_0(), "sbVal2"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSBRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"sbVal2",
            	        		lv_sbVal2_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleSB932); 

                    createLeafNode(grammarAccess.getSBAccess().getCommaKeyword_4(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:663:1: ( (lv_sbVal3_5_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:664:1: (lv_sbVal3_5_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:664:1: (lv_sbVal3_5_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:665:3: lv_sbVal3_5_0= RULE_INT
            {
            lv_sbVal3_5_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSB949); 

            			createLeafNode(grammarAccess.getSBAccess().getSbVal3INTTerminalRuleCall_5_0(), "sbVal3"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSBRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"sbVal3",
            	        		lv_sbVal3_5_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSB


    // $ANTLR start entryRuleAsName
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:695:1: entryRuleAsName returns [EObject current=null] : iv_ruleAsName= ruleAsName EOF ;
    public final EObject entryRuleAsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsName = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:696:2: (iv_ruleAsName= ruleAsName EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:697:2: iv_ruleAsName= ruleAsName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAsNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleAsName_in_entryRuleAsName990);
            iv_ruleAsName=ruleAsName();
            _fsp--;

             current =iv_ruleAsName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsName1000); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAsName


    // $ANTLR start ruleAsName
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:704:1: ruleAsName returns [EObject current=null] : ( 'AN' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAsName() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:709:6: ( ( 'AN' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:710:1: ( 'AN' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:710:1: ( 'AN' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:710:3: 'AN' ( (lv_name_1_0= RULE_STRING ) )
            {
            match(input,16,FOLLOW_16_in_ruleAsName1035); 

                    createLeafNode(grammarAccess.getAsNameAccess().getANKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:714:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:715:1: (lv_name_1_0= RULE_STRING )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:715:1: (lv_name_1_0= RULE_STRING )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:716:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAsName1052); 

            			createLeafNode(grammarAccess.getAsNameAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAsNameRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAsName


    // $ANTLR start entryRuleLimites
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:746:1: entryRuleLimites returns [EObject current=null] : iv_ruleLimites= ruleLimites EOF ;
    public final EObject entryRuleLimites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimites = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:747:2: (iv_ruleLimites= ruleLimites EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:748:2: iv_ruleLimites= ruleLimites EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLimitesRule(), currentNode); 
            pushFollow(FOLLOW_ruleLimites_in_entryRuleLimites1093);
            iv_ruleLimites=ruleLimites();
            _fsp--;

             current =iv_ruleLimites; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimites1103); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLimites


    // $ANTLR start ruleLimites
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:755:1: ruleLimites returns [EObject current=null] : (this_LLimit_0= ruleLLimit | this_HLimit_1= ruleHLimit ) ;
    public final EObject ruleLimites() throws RecognitionException {
        EObject current = null;

        EObject this_LLimit_0 = null;

        EObject this_HLimit_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:760:6: ( (this_LLimit_0= ruleLLimit | this_HLimit_1= ruleHLimit ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:761:1: (this_LLimit_0= ruleLLimit | this_HLimit_1= ruleHLimit )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:761:1: (this_LLimit_0= ruleLLimit | this_HLimit_1= ruleHLimit )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("761:1: (this_LLimit_0= ruleLLimit | this_HLimit_1= ruleHLimit )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:762:5: this_LLimit_0= ruleLLimit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitesAccess().getLLimitParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLLimit_in_ruleLimites1150);
                    this_LLimit_0=ruleLLimit();
                    _fsp--;

                     
                            current = this_LLimit_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:772:5: this_HLimit_1= ruleHLimit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitesAccess().getHLimitParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHLimit_in_ruleLimites1177);
                    this_HLimit_1=ruleHLimit();
                    _fsp--;

                     
                            current = this_HLimit_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLimites


    // $ANTLR start entryRuleLLimit
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:788:1: entryRuleLLimit returns [EObject current=null] : iv_ruleLLimit= ruleLLimit EOF ;
    public final EObject entryRuleLLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLLimit = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:789:2: (iv_ruleLLimit= ruleLLimit EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:790:2: iv_ruleLLimit= ruleLLimit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLLimitRule(), currentNode); 
            pushFollow(FOLLOW_ruleLLimit_in_entryRuleLLimit1212);
            iv_ruleLLimit=ruleLLimit();
            _fsp--;

             current =iv_ruleLLimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLLimit1222); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLLimit


    // $ANTLR start ruleLLimit
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:797:1: ruleLLimit returns [EObject current=null] : ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) ;
    public final EObject ruleLLimit() throws RecognitionException {
        EObject current = null;

        EObject lv_lowLimit_0_0 = null;

        EObject lv_highLimit_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:802:6: ( ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:803:1: ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:803:1: ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:803:2: ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:803:2: ( (lv_lowLimit_0_0= ruleLowLimit ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:804:1: (lv_lowLimit_0_0= ruleLowLimit )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:804:1: (lv_lowLimit_0_0= ruleLowLimit )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:805:3: lv_lowLimit_0_0= ruleLowLimit
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLLimitAccess().getLowLimitLowLimitParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLowLimit_in_ruleLLimit1268);
            lv_lowLimit_0_0=ruleLowLimit();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLLimitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lowLimit",
            	        		lv_lowLimit_0_0, 
            	        		"LowLimit", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:827:2: ( (lv_highLimit_1_0= ruleHighLimit ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:828:1: (lv_highLimit_1_0= ruleHighLimit )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:828:1: (lv_highLimit_1_0= ruleHighLimit )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:829:3: lv_highLimit_1_0= ruleHighLimit
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLLimitAccess().getHighLimitHighLimitParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleHighLimit_in_ruleLLimit1289);
            lv_highLimit_1_0=ruleHighLimit();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLLimitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"highLimit",
            	        		lv_highLimit_1_0, 
            	        		"HighLimit", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLLimit


    // $ANTLR start entryRuleHLimit
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:859:1: entryRuleHLimit returns [EObject current=null] : iv_ruleHLimit= ruleHLimit EOF ;
    public final EObject entryRuleHLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHLimit = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:860:2: (iv_ruleHLimit= ruleHLimit EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:861:2: iv_ruleHLimit= ruleHLimit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHLimitRule(), currentNode); 
            pushFollow(FOLLOW_ruleHLimit_in_entryRuleHLimit1325);
            iv_ruleHLimit=ruleHLimit();
            _fsp--;

             current =iv_ruleHLimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHLimit1335); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleHLimit


    // $ANTLR start ruleHLimit
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:868:1: ruleHLimit returns [EObject current=null] : ( ( (lv_heighLimit_0_0= ruleHighLimit ) ) ( (lv_lowLimit_1_0= ruleLowLimit ) ) ) ;
    public final EObject ruleHLimit() throws RecognitionException {
        EObject current = null;

        EObject lv_heighLimit_0_0 = null;

        EObject lv_lowLimit_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:873:6: ( ( ( (lv_heighLimit_0_0= ruleHighLimit ) ) ( (lv_lowLimit_1_0= ruleLowLimit ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:874:1: ( ( (lv_heighLimit_0_0= ruleHighLimit ) ) ( (lv_lowLimit_1_0= ruleLowLimit ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:874:1: ( ( (lv_heighLimit_0_0= ruleHighLimit ) ) ( (lv_lowLimit_1_0= ruleLowLimit ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:874:2: ( (lv_heighLimit_0_0= ruleHighLimit ) ) ( (lv_lowLimit_1_0= ruleLowLimit ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:874:2: ( (lv_heighLimit_0_0= ruleHighLimit ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:875:1: (lv_heighLimit_0_0= ruleHighLimit )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:875:1: (lv_heighLimit_0_0= ruleHighLimit )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:876:3: lv_heighLimit_0_0= ruleHighLimit
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHLimitAccess().getHeighLimitHighLimitParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleHighLimit_in_ruleHLimit1381);
            lv_heighLimit_0_0=ruleHighLimit();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHLimitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"heighLimit",
            	        		lv_heighLimit_0_0, 
            	        		"HighLimit", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:898:2: ( (lv_lowLimit_1_0= ruleLowLimit ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:899:1: (lv_lowLimit_1_0= ruleLowLimit )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:899:1: (lv_lowLimit_1_0= ruleLowLimit )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:900:3: lv_lowLimit_1_0= ruleLowLimit
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHLimitAccess().getLowLimitLowLimitParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLowLimit_in_ruleHLimit1402);
            lv_lowLimit_1_0=ruleLowLimit();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHLimitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lowLimit",
            	        		lv_lowLimit_1_0, 
            	        		"LowLimit", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleHLimit


    // $ANTLR start entryRuleTheGeom
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:930:1: entryRuleTheGeom returns [EObject current=null] : iv_ruleTheGeom= ruleTheGeom EOF ;
    public final EObject entryRuleTheGeom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheGeom = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:931:2: (iv_ruleTheGeom= ruleTheGeom EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:932:2: iv_ruleTheGeom= ruleTheGeom EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTheGeomRule(), currentNode); 
            pushFollow(FOLLOW_ruleTheGeom_in_entryRuleTheGeom1438);
            iv_ruleTheGeom=ruleTheGeom();
            _fsp--;

             current =iv_ruleTheGeom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheGeom1448); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTheGeom


    // $ANTLR start ruleTheGeom
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:939:1: ruleTheGeom returns [EObject current=null] : (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC ) ;
    public final EObject ruleTheGeom() throws RecognitionException {
        EObject current = null;

        EObject this_V_0 = null;

        EObject this_DP_1 = null;

        EObject this_DA_2 = null;

        EObject this_DB_3 = null;

        EObject this_DC_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:944:6: ( (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:945:1: (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:945:1: (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("945:1: (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:946:5: this_V_0= ruleV
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTheGeomAccess().getVParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleV_in_ruleTheGeom1495);
                    this_V_0=ruleV();
                    _fsp--;

                     
                            current = this_V_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:956:5: this_DP_1= ruleDP
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTheGeomAccess().getDPParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDP_in_ruleTheGeom1522);
                    this_DP_1=ruleDP();
                    _fsp--;

                     
                            current = this_DP_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:966:5: this_DA_2= ruleDA
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTheGeomAccess().getDAParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDA_in_ruleTheGeom1549);
                    this_DA_2=ruleDA();
                    _fsp--;

                     
                            current = this_DA_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:976:5: this_DB_3= ruleDB
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTheGeomAccess().getDBParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDB_in_ruleTheGeom1576);
                    this_DB_3=ruleDB();
                    _fsp--;

                     
                            current = this_DB_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:986:5: this_DC_4= ruleDC
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTheGeomAccess().getDCParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDC_in_ruleTheGeom1603);
                    this_DC_4=ruleDC();
                    _fsp--;

                     
                            current = this_DC_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTheGeom


    // $ANTLR start entryRuleLowLimit
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1002:1: entryRuleLowLimit returns [EObject current=null] : iv_ruleLowLimit= ruleLowLimit EOF ;
    public final EObject entryRuleLowLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowLimit = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1003:2: (iv_ruleLowLimit= ruleLowLimit EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1004:2: iv_ruleLowLimit= ruleLowLimit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLowLimitRule(), currentNode); 
            pushFollow(FOLLOW_ruleLowLimit_in_entryRuleLowLimit1638);
            iv_ruleLowLimit=ruleLowLimit();
            _fsp--;

             current =iv_ruleLowLimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLowLimit1648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLowLimit


    // $ANTLR start ruleLowLimit
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1011:1: ruleLowLimit returns [EObject current=null] : ( 'AL' ( (lv_ll_1_0= ruleLimit ) ) ) ;
    public final EObject ruleLowLimit() throws RecognitionException {
        EObject current = null;

        EObject lv_ll_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1016:6: ( ( 'AL' ( (lv_ll_1_0= ruleLimit ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1017:1: ( 'AL' ( (lv_ll_1_0= ruleLimit ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1017:1: ( 'AL' ( (lv_ll_1_0= ruleLimit ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1017:3: 'AL' ( (lv_ll_1_0= ruleLimit ) )
            {
            match(input,17,FOLLOW_17_in_ruleLowLimit1683); 

                    createLeafNode(grammarAccess.getLowLimitAccess().getALKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1021:1: ( (lv_ll_1_0= ruleLimit ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1022:1: (lv_ll_1_0= ruleLimit )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1022:1: (lv_ll_1_0= ruleLimit )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1023:3: lv_ll_1_0= ruleLimit
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLowLimitAccess().getLlLimitParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLimit_in_ruleLowLimit1704);
            lv_ll_1_0=ruleLimit();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLowLimitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ll",
            	        		lv_ll_1_0, 
            	        		"Limit", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLowLimit


    // $ANTLR start entryRuleHighLimit
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1053:1: entryRuleHighLimit returns [EObject current=null] : iv_ruleHighLimit= ruleHighLimit EOF ;
    public final EObject entryRuleHighLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighLimit = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1054:2: (iv_ruleHighLimit= ruleHighLimit EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1055:2: iv_ruleHighLimit= ruleHighLimit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHighLimitRule(), currentNode); 
            pushFollow(FOLLOW_ruleHighLimit_in_entryRuleHighLimit1740);
            iv_ruleHighLimit=ruleHighLimit();
            _fsp--;

             current =iv_ruleHighLimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighLimit1750); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleHighLimit


    // $ANTLR start ruleHighLimit
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1062:1: ruleHighLimit returns [EObject current=null] : ( 'AH' ( (lv_hl_1_0= ruleLimit ) ) ) ;
    public final EObject ruleHighLimit() throws RecognitionException {
        EObject current = null;

        EObject lv_hl_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1067:6: ( ( 'AH' ( (lv_hl_1_0= ruleLimit ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1068:1: ( 'AH' ( (lv_hl_1_0= ruleLimit ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1068:1: ( 'AH' ( (lv_hl_1_0= ruleLimit ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1068:3: 'AH' ( (lv_hl_1_0= ruleLimit ) )
            {
            match(input,18,FOLLOW_18_in_ruleHighLimit1785); 

                    createLeafNode(grammarAccess.getHighLimitAccess().getAHKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1072:1: ( (lv_hl_1_0= ruleLimit ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1073:1: (lv_hl_1_0= ruleLimit )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1073:1: (lv_hl_1_0= ruleLimit )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1074:3: lv_hl_1_0= ruleLimit
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHighLimitAccess().getHlLimitParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLimit_in_ruleHighLimit1806);
            lv_hl_1_0=ruleLimit();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHighLimitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"hl",
            	        		lv_hl_1_0, 
            	        		"Limit", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleHighLimit


    // $ANTLR start entryRuleLimit
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1104:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1105:2: (iv_ruleLimit= ruleLimit EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1106:2: iv_ruleLimit= ruleLimit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLimitRule(), currentNode); 
            pushFollow(FOLLOW_ruleLimit_in_entryRuleLimit1842);
            iv_ruleLimit=ruleLimit();
            _fsp--;

             current =iv_ruleLimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimit1852); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLimit


    // $ANTLR start ruleLimit
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1113:1: ruleLimit returns [EObject current=null] : (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        EObject this_FL_0 = null;

        EObject this_SFC_1 = null;

        EObject this_GND_2 = null;

        EObject this_UNL_3 = null;

        EObject this_VAL_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1118:6: ( (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1119:1: (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1119:1: (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case RULE_INT:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1119:1: (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1120:5: this_FL_0= ruleFL
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitAccess().getFLParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFL_in_ruleLimit1899);
                    this_FL_0=ruleFL();
                    _fsp--;

                     
                            current = this_FL_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1130:5: this_SFC_1= ruleSFC
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitAccess().getSFCParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSFC_in_ruleLimit1926);
                    this_SFC_1=ruleSFC();
                    _fsp--;

                     
                            current = this_SFC_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1140:5: this_GND_2= ruleGND
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitAccess().getGNDParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGND_in_ruleLimit1953);
                    this_GND_2=ruleGND();
                    _fsp--;

                     
                            current = this_GND_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1150:5: this_UNL_3= ruleUNL
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitAccess().getUNLParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUNL_in_ruleLimit1980);
                    this_UNL_3=ruleUNL();
                    _fsp--;

                     
                            current = this_UNL_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1160:5: this_VAL_4= ruleVAL
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitAccess().getVALParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVAL_in_ruleLimit2007);
                    this_VAL_4=ruleVAL();
                    _fsp--;

                     
                            current = this_VAL_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLimit


    // $ANTLR start entryRuleFL
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1176:1: entryRuleFL returns [EObject current=null] : iv_ruleFL= ruleFL EOF ;
    public final EObject entryRuleFL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFL = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1177:2: (iv_ruleFL= ruleFL EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1178:2: iv_ruleFL= ruleFL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFLRule(), currentNode); 
            pushFollow(FOLLOW_ruleFL_in_entryRuleFL2042);
            iv_ruleFL=ruleFL();
            _fsp--;

             current =iv_ruleFL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFL2052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFL


    // $ANTLR start ruleFL
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1185:1: ruleFL returns [EObject current=null] : ( 'FL' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleFL() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1190:6: ( ( 'FL' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1191:1: ( 'FL' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1191:1: ( 'FL' ( (lv_value_1_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1191:3: 'FL' ( (lv_value_1_0= RULE_INT ) )
            {
            match(input,19,FOLLOW_19_in_ruleFL2087); 

                    createLeafNode(grammarAccess.getFLAccess().getFLKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1195:1: ( (lv_value_1_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1196:1: (lv_value_1_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1196:1: (lv_value_1_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1197:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFL2104); 

            			createLeafNode(grammarAccess.getFLAccess().getValueINTTerminalRuleCall_1_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFLRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFL


    // $ANTLR start entryRuleSFC
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1227:1: entryRuleSFC returns [EObject current=null] : iv_ruleSFC= ruleSFC EOF ;
    public final EObject entryRuleSFC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFC = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1228:2: (iv_ruleSFC= ruleSFC EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1229:2: iv_ruleSFC= ruleSFC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSFCRule(), currentNode); 
            pushFollow(FOLLOW_ruleSFC_in_entryRuleSFC2145);
            iv_ruleSFC=ruleSFC();
            _fsp--;

             current =iv_ruleSFC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSFC2155); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSFC


    // $ANTLR start ruleSFC
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1236:1: ruleSFC returns [EObject current=null] : ( () 'SFC' ) ;
    public final EObject ruleSFC() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1241:6: ( ( () 'SFC' ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1242:1: ( () 'SFC' )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1242:1: ( () 'SFC' )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1242:2: () 'SFC'
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1242:2: ()
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1243:5: 
            {
             
                    temp=factory.create(grammarAccess.getSFCAccess().getSFCAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSFCAccess().getSFCAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,20,FOLLOW_20_in_ruleSFC2199); 

                    createLeafNode(grammarAccess.getSFCAccess().getSFCKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSFC


    // $ANTLR start entryRuleGND
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1265:1: entryRuleGND returns [EObject current=null] : iv_ruleGND= ruleGND EOF ;
    public final EObject entryRuleGND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGND = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1266:2: (iv_ruleGND= ruleGND EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1267:2: iv_ruleGND= ruleGND EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGNDRule(), currentNode); 
            pushFollow(FOLLOW_ruleGND_in_entryRuleGND2235);
            iv_ruleGND=ruleGND();
            _fsp--;

             current =iv_ruleGND; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGND2245); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGND


    // $ANTLR start ruleGND
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1274:1: ruleGND returns [EObject current=null] : ( () 'GND' ) ;
    public final EObject ruleGND() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1279:6: ( ( () 'GND' ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1280:1: ( () 'GND' )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1280:1: ( () 'GND' )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1280:2: () 'GND'
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1280:2: ()
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1281:5: 
            {
             
                    temp=factory.create(grammarAccess.getGNDAccess().getGNDAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getGNDAccess().getGNDAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,21,FOLLOW_21_in_ruleGND2289); 

                    createLeafNode(grammarAccess.getGNDAccess().getGNDKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGND


    // $ANTLR start entryRuleUNL
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1303:1: entryRuleUNL returns [EObject current=null] : iv_ruleUNL= ruleUNL EOF ;
    public final EObject entryRuleUNL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNL = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1304:2: (iv_ruleUNL= ruleUNL EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1305:2: iv_ruleUNL= ruleUNL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUNLRule(), currentNode); 
            pushFollow(FOLLOW_ruleUNL_in_entryRuleUNL2325);
            iv_ruleUNL=ruleUNL();
            _fsp--;

             current =iv_ruleUNL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNL2335); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUNL


    // $ANTLR start ruleUNL
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1312:1: ruleUNL returns [EObject current=null] : ( () 'UNL' ) ;
    public final EObject ruleUNL() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1317:6: ( ( () 'UNL' ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1318:1: ( () 'UNL' )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1318:1: ( () 'UNL' )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1318:2: () 'UNL'
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1318:2: ()
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1319:5: 
            {
             
                    temp=factory.create(grammarAccess.getUNLAccess().getUNLAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getUNLAccess().getUNLAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,22,FOLLOW_22_in_ruleUNL2379); 

                    createLeafNode(grammarAccess.getUNLAccess().getUNLKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUNL


    // $ANTLR start entryRuleVAL
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1341:1: entryRuleVAL returns [EObject current=null] : iv_ruleVAL= ruleVAL EOF ;
    public final EObject entryRuleVAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAL = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1342:2: (iv_ruleVAL= ruleVAL EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1343:2: iv_ruleVAL= ruleVAL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVALRule(), currentNode); 
            pushFollow(FOLLOW_ruleVAL_in_entryRuleVAL2415);
            iv_ruleVAL=ruleVAL();
            _fsp--;

             current =iv_ruleVAL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAL2425); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVAL


    // $ANTLR start ruleVAL
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1350:1: ruleVAL returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) ) ;
    public final EObject ruleVAL() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_unit_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1355:6: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1356:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1356:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1356:2: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1356:2: ( (lv_value_0_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1357:1: (lv_value_0_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1357:1: (lv_value_0_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1358:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVAL2467); 

            			createLeafNode(grammarAccess.getVALAccess().getValueINTTerminalRuleCall_0_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVALRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1380:2: ( (lv_unit_1_0= ruleUnits ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1381:1: (lv_unit_1_0= ruleUnits )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1381:1: (lv_unit_1_0= ruleUnits )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1382:3: lv_unit_1_0= ruleUnits
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVALAccess().getUnitUnitsEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUnits_in_ruleVAL2493);
            lv_unit_1_0=ruleUnits();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVALRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"unit",
            	        		lv_unit_1_0, 
            	        		"Units", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVAL


    // $ANTLR start entryRuleV
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1412:1: entryRuleV returns [EObject current=null] : iv_ruleV= ruleV EOF ;
    public final EObject entryRuleV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1413:2: (iv_ruleV= ruleV EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1414:2: iv_ruleV= ruleV EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVRule(), currentNode); 
            pushFollow(FOLLOW_ruleV_in_entryRuleV2529);
            iv_ruleV=ruleV();
            _fsp--;

             current =iv_ruleV; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleV2539); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleV


    // $ANTLR start ruleV
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1421:1: ruleV returns [EObject current=null] : ( 'V' ( (lv_vsub_1_0= ruleVsub ) ) ) ;
    public final EObject ruleV() throws RecognitionException {
        EObject current = null;

        EObject lv_vsub_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1426:6: ( ( 'V' ( (lv_vsub_1_0= ruleVsub ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1427:1: ( 'V' ( (lv_vsub_1_0= ruleVsub ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1427:1: ( 'V' ( (lv_vsub_1_0= ruleVsub ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1427:3: 'V' ( (lv_vsub_1_0= ruleVsub ) )
            {
            match(input,23,FOLLOW_23_in_ruleV2574); 

                    createLeafNode(grammarAccess.getVAccess().getVKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1431:1: ( (lv_vsub_1_0= ruleVsub ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1432:1: (lv_vsub_1_0= ruleVsub )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1432:1: (lv_vsub_1_0= ruleVsub )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1433:3: lv_vsub_1_0= ruleVsub
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVAccess().getVsubVsubParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVsub_in_ruleV2595);
            lv_vsub_1_0=ruleVsub();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"vsub",
            	        		lv_vsub_1_0, 
            	        		"Vsub", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleV


    // $ANTLR start entryRuleVsub
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1463:1: entryRuleVsub returns [EObject current=null] : iv_ruleVsub= ruleVsub EOF ;
    public final EObject entryRuleVsub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVsub = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1464:2: (iv_ruleVsub= ruleVsub EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1465:2: iv_ruleVsub= ruleVsub EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVsubRule(), currentNode); 
            pushFollow(FOLLOW_ruleVsub_in_entryRuleVsub2631);
            iv_ruleVsub=ruleVsub();
            _fsp--;

             current =iv_ruleVsub; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVsub2641); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVsub


    // $ANTLR start ruleVsub
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1472:1: ruleVsub returns [EObject current=null] : ( ( 'X=' ( (lv_x_1_0= rulePoint ) ) ) | ( 'D=' ( (lv_d_3_0= ruleD ) ) ) ) ;
    public final EObject ruleVsub() throws RecognitionException {
        EObject current = null;

        EObject lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_d_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1477:6: ( ( ( 'X=' ( (lv_x_1_0= rulePoint ) ) ) | ( 'D=' ( (lv_d_3_0= ruleD ) ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1478:1: ( ( 'X=' ( (lv_x_1_0= rulePoint ) ) ) | ( 'D=' ( (lv_d_3_0= ruleD ) ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1478:1: ( ( 'X=' ( (lv_x_1_0= rulePoint ) ) ) | ( 'D=' ( (lv_d_3_0= ruleD ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1478:1: ( ( 'X=' ( (lv_x_1_0= rulePoint ) ) ) | ( 'D=' ( (lv_d_3_0= ruleD ) ) ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1478:2: ( 'X=' ( (lv_x_1_0= rulePoint ) ) )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1478:2: ( 'X=' ( (lv_x_1_0= rulePoint ) ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1478:4: 'X=' ( (lv_x_1_0= rulePoint ) )
                    {
                    match(input,24,FOLLOW_24_in_ruleVsub2677); 

                            createLeafNode(grammarAccess.getVsubAccess().getXKeyword_0_0(), null); 
                        
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1482:1: ( (lv_x_1_0= rulePoint ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1483:1: (lv_x_1_0= rulePoint )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1483:1: (lv_x_1_0= rulePoint )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1484:3: lv_x_1_0= rulePoint
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVsubAccess().getXPointParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePoint_in_ruleVsub2698);
                    lv_x_1_0=rulePoint();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVsubRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"x",
                    	        		lv_x_1_0, 
                    	        		"Point", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1507:6: ( 'D=' ( (lv_d_3_0= ruleD ) ) )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1507:6: ( 'D=' ( (lv_d_3_0= ruleD ) ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1507:8: 'D=' ( (lv_d_3_0= ruleD ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleVsub2716); 

                            createLeafNode(grammarAccess.getVsubAccess().getDKeyword_1_0(), null); 
                        
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1511:1: ( (lv_d_3_0= ruleD ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1512:1: (lv_d_3_0= ruleD )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1512:1: (lv_d_3_0= ruleD )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1513:3: lv_d_3_0= ruleD
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVsubAccess().getDDParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleD_in_ruleVsub2737);
                    lv_d_3_0=ruleD();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVsubRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"d",
                    	        		lv_d_3_0, 
                    	        		"D", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVsub


    // $ANTLR start entryRuleD
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1543:1: entryRuleD returns [String current=null] : iv_ruleD= ruleD EOF ;
    public final String entryRuleD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleD = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1544:2: (iv_ruleD= ruleD EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1545:2: iv_ruleD= ruleD EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDRule(), currentNode); 
            pushFollow(FOLLOW_ruleD_in_entryRuleD2775);
            iv_ruleD=ruleD();
            _fsp--;

             current =iv_ruleD.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleD2786); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleD


    // $ANTLR start ruleD
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1552:1: ruleD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1557:6: ( (kw= '+' | kw= '-' ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1558:1: (kw= '+' | kw= '-' )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1558:1: (kw= '+' | kw= '-' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1558:1: (kw= '+' | kw= '-' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1559:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleD2824); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDAccess().getPlusSignKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1566:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruleD2843); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDAccess().getHyphenMinusKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleD


    // $ANTLR start entryRuleDC
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1579:1: entryRuleDC returns [EObject current=null] : iv_ruleDC= ruleDC EOF ;
    public final EObject entryRuleDC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDC = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1580:2: (iv_ruleDC= ruleDC EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1581:2: iv_ruleDC= ruleDC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDCRule(), currentNode); 
            pushFollow(FOLLOW_ruleDC_in_entryRuleDC2883);
            iv_ruleDC=ruleDC();
            _fsp--;

             current =iv_ruleDC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDC2893); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDC


    // $ANTLR start ruleDC
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1588:1: ruleDC returns [EObject current=null] : ( 'DC' ( (lv_radius_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleDC() throws RecognitionException {
        EObject current = null;

        Token lv_radius_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1593:6: ( ( 'DC' ( (lv_radius_1_0= RULE_REAL ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1594:1: ( 'DC' ( (lv_radius_1_0= RULE_REAL ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1594:1: ( 'DC' ( (lv_radius_1_0= RULE_REAL ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1594:3: 'DC' ( (lv_radius_1_0= RULE_REAL ) )
            {
            match(input,28,FOLLOW_28_in_ruleDC2928); 

                    createLeafNode(grammarAccess.getDCAccess().getDCKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1598:1: ( (lv_radius_1_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1599:1: (lv_radius_1_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1599:1: (lv_radius_1_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1600:3: lv_radius_1_0= RULE_REAL
            {
            lv_radius_1_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleDC2945); 

            			createLeafNode(grammarAccess.getDCAccess().getRadiusREALTerminalRuleCall_1_0(), "radius"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"radius",
            	        		lv_radius_1_0, 
            	        		"REAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDC


    // $ANTLR start entryRuleDP
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1630:1: entryRuleDP returns [EObject current=null] : iv_ruleDP= ruleDP EOF ;
    public final EObject entryRuleDP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDP = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1631:2: (iv_ruleDP= ruleDP EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1632:2: iv_ruleDP= ruleDP EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDPRule(), currentNode); 
            pushFollow(FOLLOW_ruleDP_in_entryRuleDP2986);
            iv_ruleDP=ruleDP();
            _fsp--;

             current =iv_ruleDP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDP2996); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDP


    // $ANTLR start ruleDP
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1639:1: ruleDP returns [EObject current=null] : ( 'DP' ( (lv_dp_1_0= rulePoint ) ) ) ;
    public final EObject ruleDP() throws RecognitionException {
        EObject current = null;

        EObject lv_dp_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1644:6: ( ( 'DP' ( (lv_dp_1_0= rulePoint ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1645:1: ( 'DP' ( (lv_dp_1_0= rulePoint ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1645:1: ( 'DP' ( (lv_dp_1_0= rulePoint ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1645:3: 'DP' ( (lv_dp_1_0= rulePoint ) )
            {
            match(input,29,FOLLOW_29_in_ruleDP3031); 

                    createLeafNode(grammarAccess.getDPAccess().getDPKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1649:1: ( (lv_dp_1_0= rulePoint ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1650:1: (lv_dp_1_0= rulePoint )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1650:1: (lv_dp_1_0= rulePoint )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1651:3: lv_dp_1_0= rulePoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDPAccess().getDpPointParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleDP3052);
            lv_dp_1_0=rulePoint();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDPRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"dp",
            	        		lv_dp_1_0, 
            	        		"Point", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDP


    // $ANTLR start entryRulePoint
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1681:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1682:2: (iv_rulePoint= rulePoint EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1683:2: iv_rulePoint= rulePoint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPointRule(), currentNode); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint3088);
            iv_rulePoint=rulePoint();
            _fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint3098); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePoint


    // $ANTLR start rulePoint
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1690:1: rulePoint returns [EObject current=null] : (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        EObject this_Point1_0 = null;

        EObject this_Point2_1 = null;

        EObject this_Point3_2 = null;

        EObject this_Point4_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1695:6: ( (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1696:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1696:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==30) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==RULE_INT) ) {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4==30) ) {
                            int LA12_6 = input.LA(5);

                            if ( (LA12_6==RULE_INT) ) {
                                alt12=1;
                            }
                            else if ( (LA12_6==RULE_REAL) ) {
                                alt12=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1696:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )", 12, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1696:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )", 12, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA12_3==RULE_REAL) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1696:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1696:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_REAL) ) {
                alt12=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1696:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1697:5: this_Point1_0= rulePoint1
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPointAccess().getPoint1ParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePoint1_in_rulePoint3145);
                    this_Point1_0=rulePoint1();
                    _fsp--;

                     
                            current = this_Point1_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1707:5: this_Point2_1= rulePoint2
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPointAccess().getPoint2ParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePoint2_in_rulePoint3172);
                    this_Point2_1=rulePoint2();
                    _fsp--;

                     
                            current = this_Point2_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1717:5: this_Point3_2= rulePoint3
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPointAccess().getPoint3ParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePoint3_in_rulePoint3199);
                    this_Point3_2=rulePoint3();
                    _fsp--;

                     
                            current = this_Point3_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1727:5: this_Point4_3= rulePoint4
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPointAccess().getPoint4ParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePoint4_in_rulePoint3226);
                    this_Point4_3=rulePoint4();
                    _fsp--;

                     
                            current = this_Point4_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePoint


    // $ANTLR start entryRulePoint1
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1743:1: entryRulePoint1 returns [EObject current=null] : iv_rulePoint1= rulePoint1 EOF ;
    public final EObject entryRulePoint1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint1 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1744:2: (iv_rulePoint1= rulePoint1 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1745:2: iv_rulePoint1= rulePoint1 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPoint1Rule(), currentNode); 
            pushFollow(FOLLOW_rulePoint1_in_entryRulePoint13261);
            iv_rulePoint1=rulePoint1();
            _fsp--;

             current =iv_rulePoint1; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint13271); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePoint1


    // $ANTLR start rulePoint1
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1752:1: rulePoint1 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) ) ;
    public final EObject rulePoint1() throws RecognitionException {
        EObject current = null;

        EObject lv_longD_0_0 = null;

        EObject lv_longM_1_0 = null;

        EObject lv_longS_2_0 = null;

        Enumerator lv_ns_3_0 = null;

        EObject lv_latD_4_0 = null;

        EObject lv_latM_5_0 = null;

        EObject lv_latS_6_0 = null;

        Enumerator lv_we_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1757:6: ( ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1758:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1758:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1758:2: ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1758:2: ( (lv_longD_0_0= ruleLongDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1759:1: (lv_longD_0_0= ruleLongDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1759:1: (lv_longD_0_0= ruleLongDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1760:3: lv_longD_0_0= ruleLongDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLongDLongDegrParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLongDegr_in_rulePoint13317);
            lv_longD_0_0=ruleLongDegr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"longD",
            	        		lv_longD_0_0, 
            	        		"LongDegr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1782:2: ( (lv_longM_1_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1783:1: (lv_longM_1_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1783:1: (lv_longM_1_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1784:3: lv_longM_1_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLongMMinSecParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint13338);
            lv_longM_1_0=ruleMinSec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"longM",
            	        		lv_longM_1_0, 
            	        		"MinSec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1806:2: ( (lv_longS_2_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1807:1: (lv_longS_2_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1807:1: (lv_longS_2_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1808:3: lv_longS_2_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLongSMinSecParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint13359);
            lv_longS_2_0=ruleMinSec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"longS",
            	        		lv_longS_2_0, 
            	        		"MinSec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1830:2: ( (lv_ns_3_0= ruleNS ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1831:1: (lv_ns_3_0= ruleNS )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1831:1: (lv_ns_3_0= ruleNS )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1832:3: lv_ns_3_0= ruleNS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getNsNSEnumRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNS_in_rulePoint13380);
            lv_ns_3_0=ruleNS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ns",
            	        		lv_ns_3_0, 
            	        		"NS", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1854:2: ( (lv_latD_4_0= ruleLatDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1855:1: (lv_latD_4_0= ruleLatDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1855:1: (lv_latD_4_0= ruleLatDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1856:3: lv_latD_4_0= ruleLatDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLatDLatDegrParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLatDegr_in_rulePoint13401);
            lv_latD_4_0=ruleLatDegr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"latD",
            	        		lv_latD_4_0, 
            	        		"LatDegr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1878:2: ( (lv_latM_5_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1879:1: (lv_latM_5_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1879:1: (lv_latM_5_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1880:3: lv_latM_5_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLatMMinSecParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint13422);
            lv_latM_5_0=ruleMinSec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"latM",
            	        		lv_latM_5_0, 
            	        		"MinSec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1902:2: ( (lv_latS_6_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1903:1: (lv_latS_6_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1903:1: (lv_latS_6_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1904:3: lv_latS_6_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLatSMinSecParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint13443);
            lv_latS_6_0=ruleMinSec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"latS",
            	        		lv_latS_6_0, 
            	        		"MinSec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1926:2: ( (lv_we_7_0= ruleWE ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1927:1: (lv_we_7_0= ruleWE )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1927:1: (lv_we_7_0= ruleWE )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1928:3: lv_we_7_0= ruleWE
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getWeWEEnumRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWE_in_rulePoint13464);
            lv_we_7_0=ruleWE();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"we",
            	        		lv_we_7_0, 
            	        		"WE", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePoint1


    // $ANTLR start entryRulePoint2
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1958:1: entryRulePoint2 returns [EObject current=null] : iv_rulePoint2= rulePoint2 EOF ;
    public final EObject entryRulePoint2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint2 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1959:2: (iv_rulePoint2= rulePoint2 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1960:2: iv_rulePoint2= rulePoint2 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPoint2Rule(), currentNode); 
            pushFollow(FOLLOW_rulePoint2_in_entryRulePoint23500);
            iv_rulePoint2=rulePoint2();
            _fsp--;

             current =iv_rulePoint2; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint23510); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePoint2


    // $ANTLR start rulePoint2
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1967:1: rulePoint2 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) ) ;
    public final EObject rulePoint2() throws RecognitionException {
        EObject current = null;

        EObject lv_longD_0_0 = null;

        EObject lv_longMf_1_0 = null;

        Enumerator lv_ns_2_0 = null;

        EObject lv_latD_3_0 = null;

        EObject lv_latMf_4_0 = null;

        Enumerator lv_we_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1972:6: ( ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1973:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1973:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1973:2: ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1973:2: ( (lv_longD_0_0= ruleLongDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1974:1: (lv_longD_0_0= ruleLongDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1974:1: (lv_longD_0_0= ruleLongDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1975:3: lv_longD_0_0= ruleLongDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getLongDLongDegrParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLongDegr_in_rulePoint23556);
            lv_longD_0_0=ruleLongDegr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"longD",
            	        		lv_longD_0_0, 
            	        		"LongDegr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1997:2: ( (lv_longMf_1_0= ruleMinDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1998:1: (lv_longMf_1_0= ruleMinDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1998:1: (lv_longMf_1_0= ruleMinDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1999:3: lv_longMf_1_0= ruleMinDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getLongMfMinDecParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinDec_in_rulePoint23577);
            lv_longMf_1_0=ruleMinDec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"longMf",
            	        		lv_longMf_1_0, 
            	        		"MinDec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2021:2: ( (lv_ns_2_0= ruleNS ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2022:1: (lv_ns_2_0= ruleNS )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2022:1: (lv_ns_2_0= ruleNS )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2023:3: lv_ns_2_0= ruleNS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getNsNSEnumRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNS_in_rulePoint23598);
            lv_ns_2_0=ruleNS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ns",
            	        		lv_ns_2_0, 
            	        		"NS", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2045:2: ( (lv_latD_3_0= ruleLatDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2046:1: (lv_latD_3_0= ruleLatDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2046:1: (lv_latD_3_0= ruleLatDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2047:3: lv_latD_3_0= ruleLatDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getLatDLatDegrParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLatDegr_in_rulePoint23619);
            lv_latD_3_0=ruleLatDegr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"latD",
            	        		lv_latD_3_0, 
            	        		"LatDegr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2069:2: ( (lv_latMf_4_0= ruleMinDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2070:1: (lv_latMf_4_0= ruleMinDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2070:1: (lv_latMf_4_0= ruleMinDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2071:3: lv_latMf_4_0= ruleMinDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getLatMfMinDecParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinDec_in_rulePoint23640);
            lv_latMf_4_0=ruleMinDec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"latMf",
            	        		lv_latMf_4_0, 
            	        		"MinDec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2093:2: ( (lv_we_5_0= ruleWE ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2094:1: (lv_we_5_0= ruleWE )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2094:1: (lv_we_5_0= ruleWE )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2095:3: lv_we_5_0= ruleWE
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getWeWEEnumRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWE_in_rulePoint23661);
            lv_we_5_0=ruleWE();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"we",
            	        		lv_we_5_0, 
            	        		"WE", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePoint2


    // $ANTLR start entryRulePoint3
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2125:1: entryRulePoint3 returns [EObject current=null] : iv_rulePoint3= rulePoint3 EOF ;
    public final EObject entryRulePoint3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint3 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2126:2: (iv_rulePoint3= rulePoint3 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2127:2: iv_rulePoint3= rulePoint3 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPoint3Rule(), currentNode); 
            pushFollow(FOLLOW_rulePoint3_in_entryRulePoint33697);
            iv_rulePoint3=rulePoint3();
            _fsp--;

             current =iv_rulePoint3; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint33707); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePoint3


    // $ANTLR start rulePoint3
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2134:1: rulePoint3 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) ) ;
    public final EObject rulePoint3() throws RecognitionException {
        EObject current = null;

        EObject lv_longD_0_0 = null;

        EObject lv_longM_1_0 = null;

        EObject lv_longS_2_0 = null;

        Enumerator lv_ns_3_0 = null;

        EObject lv_latD_4_0 = null;

        EObject lv_latM_5_0 = null;

        EObject lv_latS_6_0 = null;

        Enumerator lv_we_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2139:6: ( ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2140:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2140:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2140:2: ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2140:2: ( (lv_longD_0_0= ruleLongDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2141:1: (lv_longD_0_0= ruleLongDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2141:1: (lv_longD_0_0= ruleLongDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2142:3: lv_longD_0_0= ruleLongDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLongDLongDegrParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLongDegr_in_rulePoint33753);
            lv_longD_0_0=ruleLongDegr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"longD",
            	        		lv_longD_0_0, 
            	        		"LongDegr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2164:2: ( (lv_longM_1_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2165:1: (lv_longM_1_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2165:1: (lv_longM_1_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2166:3: lv_longM_1_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLongMMinSecParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint33774);
            lv_longM_1_0=ruleMinSec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"longM",
            	        		lv_longM_1_0, 
            	        		"MinSec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2188:2: ( (lv_longS_2_0= ruleSecDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2189:1: (lv_longS_2_0= ruleSecDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2189:1: (lv_longS_2_0= ruleSecDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2190:3: lv_longS_2_0= ruleSecDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLongSSecDecParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSecDec_in_rulePoint33795);
            lv_longS_2_0=ruleSecDec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"longS",
            	        		lv_longS_2_0, 
            	        		"SecDec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2212:2: ( (lv_ns_3_0= ruleNS ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2213:1: (lv_ns_3_0= ruleNS )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2213:1: (lv_ns_3_0= ruleNS )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2214:3: lv_ns_3_0= ruleNS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getNsNSEnumRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNS_in_rulePoint33816);
            lv_ns_3_0=ruleNS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ns",
            	        		lv_ns_3_0, 
            	        		"NS", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2236:2: ( (lv_latD_4_0= ruleLatDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2237:1: (lv_latD_4_0= ruleLatDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2237:1: (lv_latD_4_0= ruleLatDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2238:3: lv_latD_4_0= ruleLatDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLatDLatDegrParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLatDegr_in_rulePoint33837);
            lv_latD_4_0=ruleLatDegr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"latD",
            	        		lv_latD_4_0, 
            	        		"LatDegr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2260:2: ( (lv_latM_5_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2261:1: (lv_latM_5_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2261:1: (lv_latM_5_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2262:3: lv_latM_5_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLatMMinSecParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint33858);
            lv_latM_5_0=ruleMinSec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"latM",
            	        		lv_latM_5_0, 
            	        		"MinSec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2284:2: ( (lv_latS_6_0= ruleSecDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2285:1: (lv_latS_6_0= ruleSecDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2285:1: (lv_latS_6_0= ruleSecDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2286:3: lv_latS_6_0= ruleSecDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLatSSecDecParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSecDec_in_rulePoint33879);
            lv_latS_6_0=ruleSecDec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"latS",
            	        		lv_latS_6_0, 
            	        		"SecDec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2308:2: ( (lv_we_7_0= ruleWE ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2309:1: (lv_we_7_0= ruleWE )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2309:1: (lv_we_7_0= ruleWE )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2310:3: lv_we_7_0= ruleWE
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getWeWEEnumRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWE_in_rulePoint33900);
            lv_we_7_0=ruleWE();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint3Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"we",
            	        		lv_we_7_0, 
            	        		"WE", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePoint3


    // $ANTLR start entryRulePoint4
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2340:1: entryRulePoint4 returns [EObject current=null] : iv_rulePoint4= rulePoint4 EOF ;
    public final EObject entryRulePoint4() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint4 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2341:2: (iv_rulePoint4= rulePoint4 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2342:2: iv_rulePoint4= rulePoint4 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPoint4Rule(), currentNode); 
            pushFollow(FOLLOW_rulePoint4_in_entryRulePoint43936);
            iv_rulePoint4=rulePoint4();
            _fsp--;

             current =iv_rulePoint4; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint43946); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePoint4


    // $ANTLR start rulePoint4
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2349:1: rulePoint4 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) ) ;
    public final EObject rulePoint4() throws RecognitionException {
        EObject current = null;

        EObject lv_longD_0_0 = null;

        Enumerator lv_ns_1_0 = null;

        EObject lv_latD_2_0 = null;

        Enumerator lv_we_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2354:6: ( ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2355:1: ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2355:1: ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2355:2: ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2355:2: ( (lv_longD_0_0= ruleLongDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2356:1: (lv_longD_0_0= ruleLongDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2356:1: (lv_longD_0_0= ruleLongDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2357:3: lv_longD_0_0= ruleLongDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint4Access().getLongDLongDecParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLongDec_in_rulePoint43992);
            lv_longD_0_0=ruleLongDec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint4Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"longD",
            	        		lv_longD_0_0, 
            	        		"LongDec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2379:2: ( (lv_ns_1_0= ruleNS ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2380:1: (lv_ns_1_0= ruleNS )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2380:1: (lv_ns_1_0= ruleNS )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2381:3: lv_ns_1_0= ruleNS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint4Access().getNsNSEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNS_in_rulePoint44013);
            lv_ns_1_0=ruleNS();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint4Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ns",
            	        		lv_ns_1_0, 
            	        		"NS", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2403:2: ( (lv_latD_2_0= ruleLatDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2404:1: (lv_latD_2_0= ruleLatDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2404:1: (lv_latD_2_0= ruleLatDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2405:3: lv_latD_2_0= ruleLatDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint4Access().getLatDLatDecParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLatDec_in_rulePoint44034);
            lv_latD_2_0=ruleLatDec();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint4Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"latD",
            	        		lv_latD_2_0, 
            	        		"LatDec", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2427:2: ( (lv_we_3_0= ruleWE ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2428:1: (lv_we_3_0= ruleWE )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2428:1: (lv_we_3_0= ruleWE )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2429:3: lv_we_3_0= ruleWE
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint4Access().getWeWEEnumRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWE_in_rulePoint44055);
            lv_we_3_0=ruleWE();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPoint4Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"we",
            	        		lv_we_3_0, 
            	        		"WE", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePoint4


    // $ANTLR start entryRuleLongDegr
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2459:1: entryRuleLongDegr returns [EObject current=null] : iv_ruleLongDegr= ruleLongDegr EOF ;
    public final EObject entryRuleLongDegr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongDegr = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2460:2: (iv_ruleLongDegr= ruleLongDegr EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2461:2: iv_ruleLongDegr= ruleLongDegr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLongDegrRule(), currentNode); 
            pushFollow(FOLLOW_ruleLongDegr_in_entryRuleLongDegr4091);
            iv_ruleLongDegr=ruleLongDegr();
            _fsp--;

             current =iv_ruleLongDegr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongDegr4101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLongDegr


    // $ANTLR start ruleLongDegr
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2468:1: ruleLongDegr returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLongDegr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2473:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2474:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2474:1: ( (lv_value_0_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2475:1: (lv_value_0_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2475:1: (lv_value_0_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2476:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLongDegr4142); 

            			createLeafNode(grammarAccess.getLongDegrAccess().getValueINTTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLongDegrRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLongDegr


    // $ANTLR start entryRuleLatDegr
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2506:1: entryRuleLatDegr returns [EObject current=null] : iv_ruleLatDegr= ruleLatDegr EOF ;
    public final EObject entryRuleLatDegr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLatDegr = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2507:2: (iv_ruleLatDegr= ruleLatDegr EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2508:2: iv_ruleLatDegr= ruleLatDegr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLatDegrRule(), currentNode); 
            pushFollow(FOLLOW_ruleLatDegr_in_entryRuleLatDegr4182);
            iv_ruleLatDegr=ruleLatDegr();
            _fsp--;

             current =iv_ruleLatDegr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLatDegr4192); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLatDegr


    // $ANTLR start ruleLatDegr
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2515:1: ruleLatDegr returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLatDegr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2520:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2521:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2521:1: ( (lv_value_0_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2522:1: (lv_value_0_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2522:1: (lv_value_0_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2523:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLatDegr4233); 

            			createLeafNode(grammarAccess.getLatDegrAccess().getValueINTTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLatDegrRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLatDegr


    // $ANTLR start entryRuleMinSec
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2553:1: entryRuleMinSec returns [EObject current=null] : iv_ruleMinSec= ruleMinSec EOF ;
    public final EObject entryRuleMinSec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinSec = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2554:2: (iv_ruleMinSec= ruleMinSec EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2555:2: iv_ruleMinSec= ruleMinSec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMinSecRule(), currentNode); 
            pushFollow(FOLLOW_ruleMinSec_in_entryRuleMinSec4273);
            iv_ruleMinSec=ruleMinSec();
            _fsp--;

             current =iv_ruleMinSec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinSec4283); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMinSec


    // $ANTLR start ruleMinSec
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2562:1: ruleMinSec returns [EObject current=null] : ( ruleSep ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMinSec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2567:6: ( ( ruleSep ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2568:1: ( ruleSep ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2568:1: ( ruleSep ( (lv_value_1_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2569:5: ruleSep ( (lv_value_1_0= RULE_INT ) )
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMinSecAccess().getSepParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleSep_in_ruleMinSec4324);
            ruleSep();
            _fsp--;

             
                    currentNode = currentNode.getParent();
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2576:1: ( (lv_value_1_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2577:1: (lv_value_1_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2577:1: (lv_value_1_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2578:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMinSec4340); 

            			createLeafNode(grammarAccess.getMinSecAccess().getValueINTTerminalRuleCall_1_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMinSecRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_1_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMinSec


    // $ANTLR start entryRuleSecDec
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2608:1: entryRuleSecDec returns [EObject current=null] : iv_ruleSecDec= ruleSecDec EOF ;
    public final EObject entryRuleSecDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecDec = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2609:2: (iv_ruleSecDec= ruleSecDec EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2610:2: iv_ruleSecDec= ruleSecDec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSecDecRule(), currentNode); 
            pushFollow(FOLLOW_ruleSecDec_in_entryRuleSecDec4381);
            iv_ruleSecDec=ruleSecDec();
            _fsp--;

             current =iv_ruleSecDec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecDec4391); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSecDec


    // $ANTLR start ruleSecDec
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2617:1: ruleSecDec returns [EObject current=null] : ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleSecDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2622:6: ( ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2623:1: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2623:1: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2624:5: ruleSep ( (lv_value_1_0= RULE_REAL ) )
            {
             
                    currentNode=createCompositeNode(grammarAccess.getSecDecAccess().getSepParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleSep_in_ruleSecDec4432);
            ruleSep();
            _fsp--;

             
                    currentNode = currentNode.getParent();
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2631:1: ( (lv_value_1_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2632:1: (lv_value_1_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2632:1: (lv_value_1_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2633:3: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleSecDec4448); 

            			createLeafNode(grammarAccess.getSecDecAccess().getValueREALTerminalRuleCall_1_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSecDecRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_1_0, 
            	        		"REAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSecDec


    // $ANTLR start entryRuleMinDec
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2663:1: entryRuleMinDec returns [EObject current=null] : iv_ruleMinDec= ruleMinDec EOF ;
    public final EObject entryRuleMinDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinDec = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2664:2: (iv_ruleMinDec= ruleMinDec EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2665:2: iv_ruleMinDec= ruleMinDec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMinDecRule(), currentNode); 
            pushFollow(FOLLOW_ruleMinDec_in_entryRuleMinDec4489);
            iv_ruleMinDec=ruleMinDec();
            _fsp--;

             current =iv_ruleMinDec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinDec4499); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMinDec


    // $ANTLR start ruleMinDec
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2672:1: ruleMinDec returns [EObject current=null] : ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleMinDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2677:6: ( ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2678:1: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2678:1: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2679:5: ruleSep ( (lv_value_1_0= RULE_REAL ) )
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMinDecAccess().getSepParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleSep_in_ruleMinDec4540);
            ruleSep();
            _fsp--;

             
                    currentNode = currentNode.getParent();
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2686:1: ( (lv_value_1_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2687:1: (lv_value_1_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2687:1: (lv_value_1_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2688:3: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleMinDec4556); 

            			createLeafNode(grammarAccess.getMinDecAccess().getValueREALTerminalRuleCall_1_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMinDecRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_1_0, 
            	        		"REAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMinDec


    // $ANTLR start entryRuleLongDec
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2718:1: entryRuleLongDec returns [EObject current=null] : iv_ruleLongDec= ruleLongDec EOF ;
    public final EObject entryRuleLongDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongDec = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2719:2: (iv_ruleLongDec= ruleLongDec EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2720:2: iv_ruleLongDec= ruleLongDec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLongDecRule(), currentNode); 
            pushFollow(FOLLOW_ruleLongDec_in_entryRuleLongDec4597);
            iv_ruleLongDec=ruleLongDec();
            _fsp--;

             current =iv_ruleLongDec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongDec4607); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLongDec


    // $ANTLR start ruleLongDec
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2727:1: ruleLongDec returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleLongDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2732:6: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2733:1: ( (lv_value_0_0= RULE_REAL ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2733:1: ( (lv_value_0_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2734:1: (lv_value_0_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2734:1: (lv_value_0_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2735:3: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleLongDec4648); 

            			createLeafNode(grammarAccess.getLongDecAccess().getValueREALTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLongDecRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"REAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLongDec


    // $ANTLR start entryRuleLatDec
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2765:1: entryRuleLatDec returns [EObject current=null] : iv_ruleLatDec= ruleLatDec EOF ;
    public final EObject entryRuleLatDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLatDec = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2766:2: (iv_ruleLatDec= ruleLatDec EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2767:2: iv_ruleLatDec= ruleLatDec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLatDecRule(), currentNode); 
            pushFollow(FOLLOW_ruleLatDec_in_entryRuleLatDec4688);
            iv_ruleLatDec=ruleLatDec();
            _fsp--;

             current =iv_ruleLatDec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLatDec4698); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLatDec


    // $ANTLR start ruleLatDec
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2774:1: ruleLatDec returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleLatDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2779:6: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2780:1: ( (lv_value_0_0= RULE_REAL ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2780:1: ( (lv_value_0_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2781:1: (lv_value_0_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2781:1: (lv_value_0_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2782:3: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleLatDec4739); 

            			createLeafNode(grammarAccess.getLatDecAccess().getValueREALTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLatDecRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"REAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLatDec


    // $ANTLR start entryRuleSep
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2812:1: entryRuleSep returns [String current=null] : iv_ruleSep= ruleSep EOF ;
    public final String entryRuleSep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSep = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2813:2: (iv_ruleSep= ruleSep EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2814:2: iv_ruleSep= ruleSep EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSepRule(), currentNode); 
            pushFollow(FOLLOW_ruleSep_in_entryRuleSep4780);
            iv_ruleSep=ruleSep();
            _fsp--;

             current =iv_ruleSep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSep4791); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSep


    // $ANTLR start ruleSep
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2821:1: ruleSep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleSep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2826:6: (kw= ':' )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2828:2: kw= ':'
            {
            kw=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleSep4828); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getSepAccess().getColonKeyword(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSep


    // $ANTLR start entryRuleDA
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2841:1: entryRuleDA returns [EObject current=null] : iv_ruleDA= ruleDA EOF ;
    public final EObject entryRuleDA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDA = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2842:2: (iv_ruleDA= ruleDA EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2843:2: iv_ruleDA= ruleDA EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDARule(), currentNode); 
            pushFollow(FOLLOW_ruleDA_in_entryRuleDA4867);
            iv_ruleDA=ruleDA();
            _fsp--;

             current =iv_ruleDA; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDA4877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDA


    // $ANTLR start ruleDA
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2850:1: ruleDA returns [EObject current=null] : ( 'DA' ( (lv_da_1_0= ruleDaParams ) ) ) ;
    public final EObject ruleDA() throws RecognitionException {
        EObject current = null;

        EObject lv_da_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2855:6: ( ( 'DA' ( (lv_da_1_0= ruleDaParams ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2856:1: ( 'DA' ( (lv_da_1_0= ruleDaParams ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2856:1: ( 'DA' ( (lv_da_1_0= ruleDaParams ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2856:3: 'DA' ( (lv_da_1_0= ruleDaParams ) )
            {
            match(input,31,FOLLOW_31_in_ruleDA4912); 

                    createLeafNode(grammarAccess.getDAAccess().getDAKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2860:1: ( (lv_da_1_0= ruleDaParams ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2861:1: (lv_da_1_0= ruleDaParams )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2861:1: (lv_da_1_0= ruleDaParams )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2862:3: lv_da_1_0= ruleDaParams
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDAAccess().getDaDaParamsParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDaParams_in_ruleDA4933);
            lv_da_1_0=ruleDaParams();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDARule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"da",
            	        		lv_da_1_0, 
            	        		"DaParams", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDA


    // $ANTLR start entryRuleDaParams
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2892:1: entryRuleDaParams returns [EObject current=null] : iv_ruleDaParams= ruleDaParams EOF ;
    public final EObject entryRuleDaParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaParams = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2893:2: (iv_ruleDaParams= ruleDaParams EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2894:2: iv_ruleDaParams= ruleDaParams EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDaParamsRule(), currentNode); 
            pushFollow(FOLLOW_ruleDaParams_in_entryRuleDaParams4969);
            iv_ruleDaParams=ruleDaParams();
            _fsp--;

             current =iv_ruleDaParams; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaParams4979); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDaParams


    // $ANTLR start ruleDaParams
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2901:1: ruleDaParams returns [EObject current=null] : (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 ) ;
    public final EObject ruleDaParams() throws RecognitionException {
        EObject current = null;

        EObject this_DaParams1_0 = null;

        EObject this_DaParams2_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2906:6: ( (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2907:1: (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2907:1: (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_REAL) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2907:1: (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2908:5: this_DaParams1_0= ruleDaParams1
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDaParamsAccess().getDaParams1ParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDaParams1_in_ruleDaParams5026);
                    this_DaParams1_0=ruleDaParams1();
                    _fsp--;

                     
                            current = this_DaParams1_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2918:5: this_DaParams2_1= ruleDaParams2
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDaParamsAccess().getDaParams2ParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDaParams2_in_ruleDaParams5053);
                    this_DaParams2_1=ruleDaParams2();
                    _fsp--;

                     
                            current = this_DaParams2_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDaParams


    // $ANTLR start entryRuleDaParams1
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2934:1: entryRuleDaParams1 returns [EObject current=null] : iv_ruleDaParams1= ruleDaParams1 EOF ;
    public final EObject entryRuleDaParams1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaParams1 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2935:2: (iv_ruleDaParams1= ruleDaParams1 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2936:2: iv_ruleDaParams1= ruleDaParams1 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDaParams1Rule(), currentNode); 
            pushFollow(FOLLOW_ruleDaParams1_in_entryRuleDaParams15088);
            iv_ruleDaParams1=ruleDaParams1();
            _fsp--;

             current =iv_ruleDaParams1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaParams15098); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDaParams1


    // $ANTLR start ruleDaParams1
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2943:1: ruleDaParams1 returns [EObject current=null] : ( ( (lv_radius_0_0= RULE_REAL ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDaParams1() throws RecognitionException {
        EObject current = null;

        Token lv_radius_0_0=null;
        Token lv_angleStart_2_0=null;
        Token lv_angleEnd_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2948:6: ( ( ( (lv_radius_0_0= RULE_REAL ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2949:1: ( ( (lv_radius_0_0= RULE_REAL ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2949:1: ( ( (lv_radius_0_0= RULE_REAL ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2949:2: ( (lv_radius_0_0= RULE_REAL ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2949:2: ( (lv_radius_0_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2950:1: (lv_radius_0_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2950:1: (lv_radius_0_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2951:3: lv_radius_0_0= RULE_REAL
            {
            lv_radius_0_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleDaParams15140); 

            			createLeafNode(grammarAccess.getDaParams1Access().getRadiusREALTerminalRuleCall_0_0(), "radius"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDaParams1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"radius",
            	        		lv_radius_0_0, 
            	        		"REAL", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleDaParams15155); 

                    createLeafNode(grammarAccess.getDaParams1Access().getCommaKeyword_1(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2977:1: ( (lv_angleStart_2_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2978:1: (lv_angleStart_2_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2978:1: (lv_angleStart_2_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2979:3: lv_angleStart_2_0= RULE_INT
            {
            lv_angleStart_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaParams15172); 

            			createLeafNode(grammarAccess.getDaParams1Access().getAngleStartINTTerminalRuleCall_2_0(), "angleStart"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDaParams1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"angleStart",
            	        		lv_angleStart_2_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleDaParams15187); 

                    createLeafNode(grammarAccess.getDaParams1Access().getCommaKeyword_3(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3005:1: ( (lv_angleEnd_4_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3006:1: (lv_angleEnd_4_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3006:1: (lv_angleEnd_4_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3007:3: lv_angleEnd_4_0= RULE_INT
            {
            lv_angleEnd_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaParams15204); 

            			createLeafNode(grammarAccess.getDaParams1Access().getAngleEndINTTerminalRuleCall_4_0(), "angleEnd"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDaParams1Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"angleEnd",
            	        		lv_angleEnd_4_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDaParams1


    // $ANTLR start entryRuleDaParams2
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3037:1: entryRuleDaParams2 returns [EObject current=null] : iv_ruleDaParams2= ruleDaParams2 EOF ;
    public final EObject entryRuleDaParams2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaParams2 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3038:2: (iv_ruleDaParams2= ruleDaParams2 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3039:2: iv_ruleDaParams2= ruleDaParams2 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDaParams2Rule(), currentNode); 
            pushFollow(FOLLOW_ruleDaParams2_in_entryRuleDaParams25245);
            iv_ruleDaParams2=ruleDaParams2();
            _fsp--;

             current =iv_ruleDaParams2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaParams25255); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDaParams2


    // $ANTLR start ruleDaParams2
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3046:1: ruleDaParams2 returns [EObject current=null] : ( ( (lv_radius_0_0= RULE_INT ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDaParams2() throws RecognitionException {
        EObject current = null;

        Token lv_radius_0_0=null;
        Token lv_angleStart_2_0=null;
        Token lv_angleEnd_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3051:6: ( ( ( (lv_radius_0_0= RULE_INT ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3052:1: ( ( (lv_radius_0_0= RULE_INT ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3052:1: ( ( (lv_radius_0_0= RULE_INT ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3052:2: ( (lv_radius_0_0= RULE_INT ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3052:2: ( (lv_radius_0_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3053:1: (lv_radius_0_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3053:1: (lv_radius_0_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3054:3: lv_radius_0_0= RULE_INT
            {
            lv_radius_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaParams25297); 

            			createLeafNode(grammarAccess.getDaParams2Access().getRadiusINTTerminalRuleCall_0_0(), "radius"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDaParams2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"radius",
            	        		lv_radius_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleDaParams25312); 

                    createLeafNode(grammarAccess.getDaParams2Access().getCommaKeyword_1(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3080:1: ( (lv_angleStart_2_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3081:1: (lv_angleStart_2_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3081:1: (lv_angleStart_2_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3082:3: lv_angleStart_2_0= RULE_INT
            {
            lv_angleStart_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaParams25329); 

            			createLeafNode(grammarAccess.getDaParams2Access().getAngleStartINTTerminalRuleCall_2_0(), "angleStart"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDaParams2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"angleStart",
            	        		lv_angleStart_2_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleDaParams25344); 

                    createLeafNode(grammarAccess.getDaParams2Access().getCommaKeyword_3(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3108:1: ( (lv_angleEnd_4_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3109:1: (lv_angleEnd_4_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3109:1: (lv_angleEnd_4_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3110:3: lv_angleEnd_4_0= RULE_INT
            {
            lv_angleEnd_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaParams25361); 

            			createLeafNode(grammarAccess.getDaParams2Access().getAngleEndINTTerminalRuleCall_4_0(), "angleEnd"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDaParams2Rule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"angleEnd",
            	        		lv_angleEnd_4_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDaParams2


    // $ANTLR start entryRuleDB
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3140:1: entryRuleDB returns [EObject current=null] : iv_ruleDB= ruleDB EOF ;
    public final EObject entryRuleDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDB = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3141:2: (iv_ruleDB= ruleDB EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3142:2: iv_ruleDB= ruleDB EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDBRule(), currentNode); 
            pushFollow(FOLLOW_ruleDB_in_entryRuleDB5402);
            iv_ruleDB=ruleDB();
            _fsp--;

             current =iv_ruleDB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDB5412); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDB


    // $ANTLR start ruleDB
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3149:1: ruleDB returns [EObject current=null] : ( 'DB' ( (lv_dp0_1_0= rulePoint ) ) ( ',' )? ( (lv_dp1_3_0= rulePoint ) ) ) ;
    public final EObject ruleDB() throws RecognitionException {
        EObject current = null;

        EObject lv_dp0_1_0 = null;

        EObject lv_dp1_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3154:6: ( ( 'DB' ( (lv_dp0_1_0= rulePoint ) ) ( ',' )? ( (lv_dp1_3_0= rulePoint ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3155:1: ( 'DB' ( (lv_dp0_1_0= rulePoint ) ) ( ',' )? ( (lv_dp1_3_0= rulePoint ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3155:1: ( 'DB' ( (lv_dp0_1_0= rulePoint ) ) ( ',' )? ( (lv_dp1_3_0= rulePoint ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3155:3: 'DB' ( (lv_dp0_1_0= rulePoint ) ) ( ',' )? ( (lv_dp1_3_0= rulePoint ) )
            {
            match(input,32,FOLLOW_32_in_ruleDB5447); 

                    createLeafNode(grammarAccess.getDBAccess().getDBKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3159:1: ( (lv_dp0_1_0= rulePoint ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3160:1: (lv_dp0_1_0= rulePoint )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3160:1: (lv_dp0_1_0= rulePoint )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3161:3: lv_dp0_1_0= rulePoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDBAccess().getDp0PointParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleDB5468);
            lv_dp0_1_0=rulePoint();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDBRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"dp0",
            	        		lv_dp0_1_0, 
            	        		"Point", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3183:2: ( ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3183:4: ','
                    {
                    match(input,14,FOLLOW_14_in_ruleDB5479); 

                            createLeafNode(grammarAccess.getDBAccess().getCommaKeyword_2(), null); 
                        

                    }
                    break;

            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3187:3: ( (lv_dp1_3_0= rulePoint ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3188:1: (lv_dp1_3_0= rulePoint )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3188:1: (lv_dp1_3_0= rulePoint )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3189:3: lv_dp1_3_0= rulePoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDBAccess().getDp1PointParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleDB5502);
            lv_dp1_3_0=rulePoint();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDBRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"dp1",
            	        		lv_dp1_3_0, 
            	        		"Point", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDB


    // $ANTLR start entryRuleAT
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3219:1: entryRuleAT returns [EObject current=null] : iv_ruleAT= ruleAT EOF ;
    public final EObject entryRuleAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAT = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3220:2: (iv_ruleAT= ruleAT EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3221:2: iv_ruleAT= ruleAT EOF
            {
             currentNode = createCompositeNode(grammarAccess.getATRule(), currentNode); 
            pushFollow(FOLLOW_ruleAT_in_entryRuleAT5538);
            iv_ruleAT=ruleAT();
            _fsp--;

             current =iv_ruleAT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAT5548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAT


    // $ANTLR start ruleAT
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3228:1: ruleAT returns [EObject current=null] : ( 'AT' ( (lv_lp_1_0= rulePoint ) ) ) ;
    public final EObject ruleAT() throws RecognitionException {
        EObject current = null;

        EObject lv_lp_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3233:6: ( ( 'AT' ( (lv_lp_1_0= rulePoint ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3234:1: ( 'AT' ( (lv_lp_1_0= rulePoint ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3234:1: ( 'AT' ( (lv_lp_1_0= rulePoint ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3234:3: 'AT' ( (lv_lp_1_0= rulePoint ) )
            {
            match(input,33,FOLLOW_33_in_ruleAT5583); 

                    createLeafNode(grammarAccess.getATAccess().getATKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3238:1: ( (lv_lp_1_0= rulePoint ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3239:1: (lv_lp_1_0= rulePoint )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3239:1: (lv_lp_1_0= rulePoint )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3240:3: lv_lp_1_0= rulePoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getATAccess().getLpPointParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleAT5604);
            lv_lp_1_0=rulePoint();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getATRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"lp",
            	        		lv_lp_1_0, 
            	        		"Point", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAT


    // $ANTLR start ruleClassType
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3270:1: ruleClassType returns [Enumerator current=null] : ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'Q' ) | ( 'R' ) | ( 'W' ) | ( 'P' ) | ( 'GP' ) | ( 'TMZ' ) | ( 'CTR' ) | ( 'Restricted' ) | ( 'UKN' ) ) ;
    public final Enumerator ruleClassType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3274:6: ( ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'Q' ) | ( 'R' ) | ( 'W' ) | ( 'P' ) | ( 'GP' ) | ( 'TMZ' ) | ( 'CTR' ) | ( 'Restricted' ) | ( 'UKN' ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3275:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'Q' ) | ( 'R' ) | ( 'W' ) | ( 'P' ) | ( 'GP' ) | ( 'TMZ' ) | ( 'CTR' ) | ( 'Restricted' ) | ( 'UKN' ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3275:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'Q' ) | ( 'R' ) | ( 'W' ) | ( 'P' ) | ( 'GP' ) | ( 'TMZ' ) | ( 'CTR' ) | ( 'Restricted' ) | ( 'UKN' ) )
            int alt15=16;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt15=1;
                }
                break;
            case 35:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            case 37:
                {
                alt15=4;
                }
                break;
            case 38:
                {
                alt15=5;
                }
                break;
            case 39:
                {
                alt15=6;
                }
                break;
            case 40:
                {
                alt15=7;
                }
                break;
            case 41:
                {
                alt15=8;
                }
                break;
            case 42:
                {
                alt15=9;
                }
                break;
            case 43:
                {
                alt15=10;
                }
                break;
            case 44:
                {
                alt15=11;
                }
                break;
            case 45:
                {
                alt15=12;
                }
                break;
            case 46:
                {
                alt15=13;
                }
                break;
            case 47:
                {
                alt15=14;
                }
                break;
            case 48:
                {
                alt15=15;
                }
                break;
            case 49:
                {
                alt15=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3275:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'Q' ) | ( 'R' ) | ( 'W' ) | ( 'P' ) | ( 'GP' ) | ( 'TMZ' ) | ( 'CTR' ) | ( 'Restricted' ) | ( 'UKN' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3275:2: ( 'A' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3275:2: ( 'A' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3275:4: 'A'
                    {
                    match(input,34,FOLLOW_34_in_ruleClassType5652); 

                            current = grammarAccess.getClassTypeAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getAEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3281:6: ( 'B' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3281:6: ( 'B' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3281:8: 'B'
                    {
                    match(input,35,FOLLOW_35_in_ruleClassType5667); 

                            current = grammarAccess.getClassTypeAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getBEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3287:6: ( 'C' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3287:6: ( 'C' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3287:8: 'C'
                    {
                    match(input,36,FOLLOW_36_in_ruleClassType5682); 

                            current = grammarAccess.getClassTypeAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getCEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3293:6: ( 'D' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3293:6: ( 'D' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3293:8: 'D'
                    {
                    match(input,37,FOLLOW_37_in_ruleClassType5697); 

                            current = grammarAccess.getClassTypeAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getDEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3299:6: ( 'E' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3299:6: ( 'E' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3299:8: 'E'
                    {
                    match(input,38,FOLLOW_38_in_ruleClassType5712); 

                            current = grammarAccess.getClassTypeAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getEEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3305:6: ( 'F' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3305:6: ( 'F' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3305:8: 'F'
                    {
                    match(input,39,FOLLOW_39_in_ruleClassType5727); 

                            current = grammarAccess.getClassTypeAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getFEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3311:6: ( 'G' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3311:6: ( 'G' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3311:8: 'G'
                    {
                    match(input,40,FOLLOW_40_in_ruleClassType5742); 

                            current = grammarAccess.getClassTypeAccess().getGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getGEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3317:6: ( 'Q' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3317:6: ( 'Q' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3317:8: 'Q'
                    {
                    match(input,41,FOLLOW_41_in_ruleClassType5757); 

                            current = grammarAccess.getClassTypeAccess().getQEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getQEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3323:6: ( 'R' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3323:6: ( 'R' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3323:8: 'R'
                    {
                    match(input,42,FOLLOW_42_in_ruleClassType5772); 

                            current = grammarAccess.getClassTypeAccess().getREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getREnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3329:6: ( 'W' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3329:6: ( 'W' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3329:8: 'W'
                    {
                    match(input,43,FOLLOW_43_in_ruleClassType5787); 

                            current = grammarAccess.getClassTypeAccess().getWEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getWEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3335:6: ( 'P' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3335:6: ( 'P' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3335:8: 'P'
                    {
                    match(input,44,FOLLOW_44_in_ruleClassType5802); 

                            current = grammarAccess.getClassTypeAccess().getPEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getPEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3341:6: ( 'GP' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3341:6: ( 'GP' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3341:8: 'GP'
                    {
                    match(input,45,FOLLOW_45_in_ruleClassType5817); 

                            current = grammarAccess.getClassTypeAccess().getGPEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getGPEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3347:6: ( 'TMZ' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3347:6: ( 'TMZ' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3347:8: 'TMZ'
                    {
                    match(input,46,FOLLOW_46_in_ruleClassType5832); 

                            current = grammarAccess.getClassTypeAccess().getTMZEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getTMZEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3353:6: ( 'CTR' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3353:6: ( 'CTR' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3353:8: 'CTR'
                    {
                    match(input,47,FOLLOW_47_in_ruleClassType5847); 

                            current = grammarAccess.getClassTypeAccess().getCTREnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getCTREnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3359:6: ( 'Restricted' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3359:6: ( 'Restricted' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3359:8: 'Restricted'
                    {
                    match(input,48,FOLLOW_48_in_ruleClassType5862); 

                            current = grammarAccess.getClassTypeAccess().getRestrictedEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getRestrictedEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3365:6: ( 'UKN' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3365:6: ( 'UKN' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3365:8: 'UKN'
                    {
                    match(input,49,FOLLOW_49_in_ruleClassType5877); 

                            current = grammarAccess.getClassTypeAccess().getUKNEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getUKNEnumLiteralDeclaration_15(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleClassType


    // $ANTLR start ruleUnits
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3375:1: ruleUnits returns [Enumerator current=null] : ( ( 'ft' ) | ( 'm' ) | ( 'MSL' ) | ( 'm MSL' ) | ( 'ft MSL' ) | ( 'AGL' ) | ( 'm AGL' ) | ( 'ft AGL' ) | ( 'AMSL' ) | ( 'm AMSL' ) ) ;
    public final Enumerator ruleUnits() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3379:6: ( ( ( 'ft' ) | ( 'm' ) | ( 'MSL' ) | ( 'm MSL' ) | ( 'ft MSL' ) | ( 'AGL' ) | ( 'm AGL' ) | ( 'ft AGL' ) | ( 'AMSL' ) | ( 'm AMSL' ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3380:1: ( ( 'ft' ) | ( 'm' ) | ( 'MSL' ) | ( 'm MSL' ) | ( 'ft MSL' ) | ( 'AGL' ) | ( 'm AGL' ) | ( 'ft AGL' ) | ( 'AMSL' ) | ( 'm AMSL' ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3380:1: ( ( 'ft' ) | ( 'm' ) | ( 'MSL' ) | ( 'm MSL' ) | ( 'ft MSL' ) | ( 'AGL' ) | ( 'm AGL' ) | ( 'ft AGL' ) | ( 'AMSL' ) | ( 'm AMSL' ) )
            int alt16=10;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt16=1;
                }
                break;
            case 51:
                {
                alt16=2;
                }
                break;
            case 52:
                {
                alt16=3;
                }
                break;
            case 53:
                {
                alt16=4;
                }
                break;
            case 54:
                {
                alt16=5;
                }
                break;
            case 55:
                {
                alt16=6;
                }
                break;
            case 56:
                {
                alt16=7;
                }
                break;
            case 57:
                {
                alt16=8;
                }
                break;
            case 58:
                {
                alt16=9;
                }
                break;
            case 59:
                {
                alt16=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3380:1: ( ( 'ft' ) | ( 'm' ) | ( 'MSL' ) | ( 'm MSL' ) | ( 'ft MSL' ) | ( 'AGL' ) | ( 'm AGL' ) | ( 'ft AGL' ) | ( 'AMSL' ) | ( 'm AMSL' ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3380:2: ( 'ft' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3380:2: ( 'ft' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3380:4: 'ft'
                    {
                    match(input,50,FOLLOW_50_in_ruleUnits5920); 

                            current = grammarAccess.getUnitsAccess().getFeedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getFeedEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3386:6: ( 'm' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3386:6: ( 'm' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3386:8: 'm'
                    {
                    match(input,51,FOLLOW_51_in_ruleUnits5935); 

                            current = grammarAccess.getUnitsAccess().getMeterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getMeterEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3392:6: ( 'MSL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3392:6: ( 'MSL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3392:8: 'MSL'
                    {
                    match(input,52,FOLLOW_52_in_ruleUnits5950); 

                            current = grammarAccess.getUnitsAccess().getMslEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getMslEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3398:6: ( 'm MSL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3398:6: ( 'm MSL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3398:8: 'm MSL'
                    {
                    match(input,53,FOLLOW_53_in_ruleUnits5965); 

                            current = grammarAccess.getUnitsAccess().getM_mslEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getM_mslEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3404:6: ( 'ft MSL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3404:6: ( 'ft MSL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3404:8: 'ft MSL'
                    {
                    match(input,54,FOLLOW_54_in_ruleUnits5980); 

                            current = grammarAccess.getUnitsAccess().getFt_mslEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getFt_mslEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3410:6: ( 'AGL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3410:6: ( 'AGL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3410:8: 'AGL'
                    {
                    match(input,55,FOLLOW_55_in_ruleUnits5995); 

                            current = grammarAccess.getUnitsAccess().getAglEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getAglEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3416:6: ( 'm AGL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3416:6: ( 'm AGL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3416:8: 'm AGL'
                    {
                    match(input,56,FOLLOW_56_in_ruleUnits6010); 

                            current = grammarAccess.getUnitsAccess().getM_aglEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getM_aglEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3422:6: ( 'ft AGL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3422:6: ( 'ft AGL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3422:8: 'ft AGL'
                    {
                    match(input,57,FOLLOW_57_in_ruleUnits6025); 

                            current = grammarAccess.getUnitsAccess().getFt_AGLEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getFt_AGLEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3428:6: ( 'AMSL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3428:6: ( 'AMSL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3428:8: 'AMSL'
                    {
                    match(input,58,FOLLOW_58_in_ruleUnits6040); 

                            current = grammarAccess.getUnitsAccess().getAMSLEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getAMSLEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3434:6: ( 'm AMSL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3434:6: ( 'm AMSL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3434:8: 'm AMSL'
                    {
                    match(input,59,FOLLOW_59_in_ruleUnits6055); 

                            current = grammarAccess.getUnitsAccess().getM_AMSLEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getM_AMSLEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnits


    // $ANTLR start ruleWE
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3444:1: ruleWE returns [Enumerator current=null] : ( ( 'W' ) | ( 'E' ) ) ;
    public final Enumerator ruleWE() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3448:6: ( ( ( 'W' ) | ( 'E' ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3449:1: ( ( 'W' ) | ( 'E' ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3449:1: ( ( 'W' ) | ( 'E' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            else if ( (LA17_0==38) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3449:1: ( ( 'W' ) | ( 'E' ) )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3449:2: ( 'W' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3449:2: ( 'W' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3449:4: 'W'
                    {
                    match(input,43,FOLLOW_43_in_ruleWE6098); 

                            current = grammarAccess.getWEAccess().getWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getWEAccess().getWEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3455:6: ( 'E' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3455:6: ( 'E' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3455:8: 'E'
                    {
                    match(input,38,FOLLOW_38_in_ruleWE6113); 

                            current = grammarAccess.getWEAccess().getEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getWEAccess().getEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWE


    // $ANTLR start ruleNS
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3465:1: ruleNS returns [Enumerator current=null] : ( ( 'N' ) | ( 'S' ) ) ;
    public final Enumerator ruleNS() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3469:6: ( ( ( 'N' ) | ( 'S' ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3470:1: ( ( 'N' ) | ( 'S' ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3470:1: ( ( 'N' ) | ( 'S' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==60) ) {
                alt18=1;
            }
            else if ( (LA18_0==61) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3470:1: ( ( 'N' ) | ( 'S' ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3470:2: ( 'N' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3470:2: ( 'N' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3470:4: 'N'
                    {
                    match(input,60,FOLLOW_60_in_ruleNS6156); 

                            current = grammarAccess.getNSAccess().getNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNSAccess().getNEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3476:6: ( 'S' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3476:6: ( 'S' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3476:8: 'S'
                    {
                    match(input,61,FOLLOW_61_in_ruleNS6171); 

                            current = grammarAccess.getNSAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNSAccess().getSEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNS


 

    public static final BitSet FOLLOW_ruleOpenAir_in_entryRuleOpenAir75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenAir85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAirspace_in_ruleOpenAir130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleAirspace_in_entryRuleAirspace166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAirspace176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheDef_in_ruleAirspace222 = new BitSet(new long[]{0x00000001B0800002L});
    public static final BitSet FOLLOW_ruleTheGeom_in_ruleAirspace243 = new BitSet(new long[]{0x00000001B0800002L});
    public static final BitSet FOLLOW_ruleTheDef_in_entryRuleTheDef280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheDef290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsClass_in_ruleTheDef336 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_ruleSP_in_ruleTheDef357 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_ruleSB_in_ruleTheDef379 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleAsName_in_ruleTheDef401 = new BitSet(new long[]{0x0000000200060000L});
    public static final BitSet FOLLOW_ruleAT_in_ruleTheDef422 = new BitSet(new long[]{0x0000000200060000L});
    public static final BitSet FOLLOW_ruleLimites_in_ruleTheDef444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsClass_in_entryRuleAsClass480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsClass490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAsClass534 = new BitSet(new long[]{0x0003FFFC00000002L});
    public static final BitSet FOLLOW_ruleClassType_in_ruleAsClass555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSP_in_entryRuleSP592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSP602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSP637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSP654 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSP669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSP686 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSP701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSP718 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSP733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSP750 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSP765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSP782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSB_in_entryRuleSB823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSB833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSB868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSB885 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSB900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSB917 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSB932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSB949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsName_in_entryRuleAsName990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsName1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAsName1035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAsName1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimites_in_entryRuleLimites1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimites1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLLimit_in_ruleLimites1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHLimit_in_ruleLimites1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLLimit_in_entryRuleLLimit1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLLimit1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLowLimit_in_ruleLLimit1268 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleHighLimit_in_ruleLLimit1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHLimit_in_entryRuleHLimit1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHLimit1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighLimit_in_ruleHLimit1381 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleLowLimit_in_ruleHLimit1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheGeom_in_entryRuleTheGeom1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheGeom1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleV_in_ruleTheGeom1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDP_in_ruleTheGeom1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDA_in_ruleTheGeom1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDB_in_ruleTheGeom1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDC_in_ruleTheGeom1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLowLimit_in_entryRuleLowLimit1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLowLimit1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLowLimit1683 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_ruleLimit_in_ruleLowLimit1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighLimit_in_entryRuleHighLimit1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighLimit1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleHighLimit1785 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_ruleLimit_in_ruleHighLimit1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimit_in_entryRuleLimit1842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimit1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFL_in_ruleLimit1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSFC_in_ruleLimit1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGND_in_ruleLimit1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNL_in_ruleLimit1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAL_in_ruleLimit2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFL_in_entryRuleFL2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFL2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFL2087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFL2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSFC_in_entryRuleSFC2145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSFC2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSFC2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGND_in_entryRuleGND2235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGND2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleGND2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNL_in_entryRuleUNL2325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNL2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleUNL2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAL_in_entryRuleVAL2415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAL2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVAL2467 = new BitSet(new long[]{0x0FFC000000000000L});
    public static final BitSet FOLLOW_ruleUnits_in_ruleVAL2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleV_in_entryRuleV2529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleV2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleV2574 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleVsub_in_ruleV2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVsub_in_entryRuleVsub2631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVsub2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVsub2677 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePoint_in_ruleVsub2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVsub2716 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleD_in_ruleVsub2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleD_in_entryRuleD2775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleD2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleD2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleD2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDC_in_entryRuleDC2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDC2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDC2928 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleDC2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDP_in_entryRuleDP2986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDP2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDP3031 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePoint_in_ruleDP3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint3088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint1_in_rulePoint3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint2_in_rulePoint3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint3_in_rulePoint3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint4_in_rulePoint3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint1_in_entryRulePoint13261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint13271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_rulePoint13317 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint13338 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint13359 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleNS_in_rulePoint13380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLatDegr_in_rulePoint13401 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint13422 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint13443 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_ruleWE_in_rulePoint13464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint2_in_entryRulePoint23500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint23510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_rulePoint23556 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinDec_in_rulePoint23577 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleNS_in_rulePoint23598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLatDegr_in_rulePoint23619 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinDec_in_rulePoint23640 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_ruleWE_in_rulePoint23661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint3_in_entryRulePoint33697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint33707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_rulePoint33753 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint33774 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleSecDec_in_rulePoint33795 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleNS_in_rulePoint33816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLatDegr_in_rulePoint33837 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint33858 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleSecDec_in_rulePoint33879 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_ruleWE_in_rulePoint33900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint4_in_entryRulePoint43936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint43946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDec_in_rulePoint43992 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleNS_in_rulePoint44013 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLatDec_in_rulePoint44034 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_ruleWE_in_rulePoint44055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_entryRuleLongDegr4091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongDegr4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLongDegr4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatDegr_in_entryRuleLatDegr4182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLatDegr4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLatDegr4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSec_in_entryRuleMinSec4273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinSec4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_ruleMinSec4324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMinSec4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecDec_in_entryRuleSecDec4381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecDec4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_ruleSecDec4432 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleSecDec4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinDec_in_entryRuleMinDec4489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinDec4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_ruleMinDec4540 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleMinDec4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDec_in_entryRuleLongDec4597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongDec4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleLongDec4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatDec_in_entryRuleLatDec4688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLatDec4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleLatDec4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_entryRuleSep4780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSep4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSep4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDA_in_entryRuleDA4867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDA4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDA4912 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleDaParams_in_ruleDA4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams_in_entryRuleDaParams4969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaParams4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams1_in_ruleDaParams5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams2_in_ruleDaParams5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams1_in_entryRuleDaParams15088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaParams15098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleDaParams15140 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDaParams15155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaParams15172 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDaParams15187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaParams15204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams2_in_entryRuleDaParams25245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaParams25255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaParams25297 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDaParams25312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaParams25329 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDaParams25344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaParams25361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDB_in_entryRuleDB5402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDB5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDB5447 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePoint_in_ruleDB5468 = new BitSet(new long[]{0x0000000000004050L});
    public static final BitSet FOLLOW_14_in_ruleDB5479 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePoint_in_ruleDB5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAT_in_entryRuleAT5538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAT5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAT5583 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePoint_in_ruleAT5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleClassType5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleClassType5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleClassType5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleClassType5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleClassType5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleClassType5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleClassType5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleClassType5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleClassType5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleClassType5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleClassType5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleClassType5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleClassType5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleClassType5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleClassType5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleClassType5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleUnits5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleUnits5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUnits5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUnits5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleUnits5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleUnits5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleUnits6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleUnits6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUnits6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleUnits6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWE6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleWE6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNS6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNS6171 = new BitSet(new long[]{0x0000000000000002L});

}