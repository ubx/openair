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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:205:1: ruleTheDef returns [EObject current=null] : ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ( (lv_at_6_0= ruleAT ) )* ) ;
    public final EObject ruleTheDef() throws RecognitionException {
        EObject current = null;

        EObject lv_asclass_0_0 = null;

        EObject lv_sp_1_0 = null;

        EObject lv_sb_2_0 = null;

        EObject lv_name_3_0 = null;

        EObject lv_at_4_0 = null;

        EObject lv_limit_5_0 = null;

        EObject lv_at_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:210:6: ( ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ( (lv_at_6_0= ruleAT ) )* ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:211:1: ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ( (lv_at_6_0= ruleAT ) )* )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:211:1: ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ( (lv_at_6_0= ruleAT ) )* )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:211:2: ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ( (lv_at_6_0= ruleAT ) )*
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:355:2: ( (lv_at_6_0= ruleAT ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:356:1: (lv_at_6_0= ruleAT )
            	    {
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:356:1: (lv_at_6_0= ruleAT )
            	    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:357:3: lv_at_6_0= ruleAT
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTheDefAccess().getAtATParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAT_in_ruleTheDef465);
            	    lv_at_6_0=ruleAT();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTheDefRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"at",
            	    	        		lv_at_6_0, 
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
            	    break loop6;
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
    // $ANTLR end ruleTheDef


    // $ANTLR start entryRuleAsClass
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:387:1: entryRuleAsClass returns [EObject current=null] : iv_ruleAsClass= ruleAsClass EOF ;
    public final EObject entryRuleAsClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsClass = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:388:2: (iv_ruleAsClass= ruleAsClass EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:389:2: iv_ruleAsClass= ruleAsClass EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAsClassRule(), currentNode); 
            pushFollow(FOLLOW_ruleAsClass_in_entryRuleAsClass502);
            iv_ruleAsClass=ruleAsClass();
            _fsp--;

             current =iv_ruleAsClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsClass512); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:396:1: ruleAsClass returns [EObject current=null] : ( () 'AC' ( (lv_name_2_0= ruleClassType ) )? ) ;
    public final EObject ruleAsClass() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:401:6: ( ( () 'AC' ( (lv_name_2_0= ruleClassType ) )? ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:402:1: ( () 'AC' ( (lv_name_2_0= ruleClassType ) )? )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:402:1: ( () 'AC' ( (lv_name_2_0= ruleClassType ) )? )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:402:2: () 'AC' ( (lv_name_2_0= ruleClassType ) )?
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:402:2: ()
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:403:5: 
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

            match(input,12,FOLLOW_12_in_ruleAsClass556); 

                    createLeafNode(grammarAccess.getAsClassAccess().getACKeyword_1(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:417:1: ( (lv_name_2_0= ruleClassType ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=34 && LA7_0<=49)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:418:1: (lv_name_2_0= ruleClassType )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:418:1: (lv_name_2_0= ruleClassType )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:419:3: lv_name_2_0= ruleClassType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAsClassAccess().getNameClassTypeEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleClassType_in_ruleAsClass577);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:449:1: entryRuleSP returns [EObject current=null] : iv_ruleSP= ruleSP EOF ;
    public final EObject entryRuleSP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSP = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:450:2: (iv_ruleSP= ruleSP EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:451:2: iv_ruleSP= ruleSP EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSPRule(), currentNode); 
            pushFollow(FOLLOW_ruleSP_in_entryRuleSP614);
            iv_ruleSP=ruleSP();
            _fsp--;

             current =iv_ruleSP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSP624); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:458:1: ruleSP returns [EObject current=null] : ( 'SP' ( (lv_sp0_1_0= RULE_INT ) ) ',' ( (lv_sp1_3_0= RULE_INT ) ) ',' ( (lv_sp2_5_0= RULE_INT ) ) ',' ( (lv_sp3_7_0= RULE_INT ) ) ',' ( (lv_sp4_9_0= RULE_INT ) ) ) ;
    public final EObject ruleSP() throws RecognitionException {
        EObject current = null;

        Token lv_sp0_1_0=null;
        Token lv_sp1_3_0=null;
        Token lv_sp2_5_0=null;
        Token lv_sp3_7_0=null;
        Token lv_sp4_9_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:463:6: ( ( 'SP' ( (lv_sp0_1_0= RULE_INT ) ) ',' ( (lv_sp1_3_0= RULE_INT ) ) ',' ( (lv_sp2_5_0= RULE_INT ) ) ',' ( (lv_sp3_7_0= RULE_INT ) ) ',' ( (lv_sp4_9_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:464:1: ( 'SP' ( (lv_sp0_1_0= RULE_INT ) ) ',' ( (lv_sp1_3_0= RULE_INT ) ) ',' ( (lv_sp2_5_0= RULE_INT ) ) ',' ( (lv_sp3_7_0= RULE_INT ) ) ',' ( (lv_sp4_9_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:464:1: ( 'SP' ( (lv_sp0_1_0= RULE_INT ) ) ',' ( (lv_sp1_3_0= RULE_INT ) ) ',' ( (lv_sp2_5_0= RULE_INT ) ) ',' ( (lv_sp3_7_0= RULE_INT ) ) ',' ( (lv_sp4_9_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:464:3: 'SP' ( (lv_sp0_1_0= RULE_INT ) ) ',' ( (lv_sp1_3_0= RULE_INT ) ) ',' ( (lv_sp2_5_0= RULE_INT ) ) ',' ( (lv_sp3_7_0= RULE_INT ) ) ',' ( (lv_sp4_9_0= RULE_INT ) )
            {
            match(input,13,FOLLOW_13_in_ruleSP659); 

                    createLeafNode(grammarAccess.getSPAccess().getSPKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:468:1: ( (lv_sp0_1_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:469:1: (lv_sp0_1_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:469:1: (lv_sp0_1_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:470:3: lv_sp0_1_0= RULE_INT
            {
            lv_sp0_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSP676); 

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

            match(input,14,FOLLOW_14_in_ruleSP691); 

                    createLeafNode(grammarAccess.getSPAccess().getCommaKeyword_2(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:496:1: ( (lv_sp1_3_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:497:1: (lv_sp1_3_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:497:1: (lv_sp1_3_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:498:3: lv_sp1_3_0= RULE_INT
            {
            lv_sp1_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSP708); 

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

            match(input,14,FOLLOW_14_in_ruleSP723); 

                    createLeafNode(grammarAccess.getSPAccess().getCommaKeyword_4(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:524:1: ( (lv_sp2_5_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:525:1: (lv_sp2_5_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:525:1: (lv_sp2_5_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:526:3: lv_sp2_5_0= RULE_INT
            {
            lv_sp2_5_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSP740); 

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

            match(input,14,FOLLOW_14_in_ruleSP755); 

                    createLeafNode(grammarAccess.getSPAccess().getCommaKeyword_6(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:552:1: ( (lv_sp3_7_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:553:1: (lv_sp3_7_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:553:1: (lv_sp3_7_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:554:3: lv_sp3_7_0= RULE_INT
            {
            lv_sp3_7_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSP772); 

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

            match(input,14,FOLLOW_14_in_ruleSP787); 

                    createLeafNode(grammarAccess.getSPAccess().getCommaKeyword_8(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:580:1: ( (lv_sp4_9_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:581:1: (lv_sp4_9_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:581:1: (lv_sp4_9_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:582:3: lv_sp4_9_0= RULE_INT
            {
            lv_sp4_9_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSP804); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:612:1: entryRuleSB returns [EObject current=null] : iv_ruleSB= ruleSB EOF ;
    public final EObject entryRuleSB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSB = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:613:2: (iv_ruleSB= ruleSB EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:614:2: iv_ruleSB= ruleSB EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSBRule(), currentNode); 
            pushFollow(FOLLOW_ruleSB_in_entryRuleSB845);
            iv_ruleSB=ruleSB();
            _fsp--;

             current =iv_ruleSB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSB855); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:621:1: ruleSB returns [EObject current=null] : ( 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) ',' ( (lv_sbVal2_3_0= RULE_INT ) ) ',' ( (lv_sbVal3_5_0= RULE_INT ) ) ) ;
    public final EObject ruleSB() throws RecognitionException {
        EObject current = null;

        Token lv_sbVal1_1_0=null;
        Token lv_sbVal2_3_0=null;
        Token lv_sbVal3_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:626:6: ( ( 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) ',' ( (lv_sbVal2_3_0= RULE_INT ) ) ',' ( (lv_sbVal3_5_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:627:1: ( 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) ',' ( (lv_sbVal2_3_0= RULE_INT ) ) ',' ( (lv_sbVal3_5_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:627:1: ( 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) ',' ( (lv_sbVal2_3_0= RULE_INT ) ) ',' ( (lv_sbVal3_5_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:627:3: 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) ',' ( (lv_sbVal2_3_0= RULE_INT ) ) ',' ( (lv_sbVal3_5_0= RULE_INT ) )
            {
            match(input,15,FOLLOW_15_in_ruleSB890); 

                    createLeafNode(grammarAccess.getSBAccess().getSBKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:631:1: ( (lv_sbVal1_1_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:632:1: (lv_sbVal1_1_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:632:1: (lv_sbVal1_1_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:633:3: lv_sbVal1_1_0= RULE_INT
            {
            lv_sbVal1_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSB907); 

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

            match(input,14,FOLLOW_14_in_ruleSB922); 

                    createLeafNode(grammarAccess.getSBAccess().getCommaKeyword_2(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:659:1: ( (lv_sbVal2_3_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:660:1: (lv_sbVal2_3_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:660:1: (lv_sbVal2_3_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:661:3: lv_sbVal2_3_0= RULE_INT
            {
            lv_sbVal2_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSB939); 

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

            match(input,14,FOLLOW_14_in_ruleSB954); 

                    createLeafNode(grammarAccess.getSBAccess().getCommaKeyword_4(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:687:1: ( (lv_sbVal3_5_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:688:1: (lv_sbVal3_5_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:688:1: (lv_sbVal3_5_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:689:3: lv_sbVal3_5_0= RULE_INT
            {
            lv_sbVal3_5_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSB971); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:719:1: entryRuleAsName returns [EObject current=null] : iv_ruleAsName= ruleAsName EOF ;
    public final EObject entryRuleAsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsName = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:720:2: (iv_ruleAsName= ruleAsName EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:721:2: iv_ruleAsName= ruleAsName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAsNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleAsName_in_entryRuleAsName1012);
            iv_ruleAsName=ruleAsName();
            _fsp--;

             current =iv_ruleAsName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsName1022); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:728:1: ruleAsName returns [EObject current=null] : ( 'AN' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAsName() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:733:6: ( ( 'AN' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:734:1: ( 'AN' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:734:1: ( 'AN' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:734:3: 'AN' ( (lv_name_1_0= RULE_STRING ) )
            {
            match(input,16,FOLLOW_16_in_ruleAsName1057); 

                    createLeafNode(grammarAccess.getAsNameAccess().getANKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:738:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:739:1: (lv_name_1_0= RULE_STRING )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:739:1: (lv_name_1_0= RULE_STRING )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:740:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAsName1074); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:770:1: entryRuleLimites returns [EObject current=null] : iv_ruleLimites= ruleLimites EOF ;
    public final EObject entryRuleLimites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimites = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:771:2: (iv_ruleLimites= ruleLimites EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:772:2: iv_ruleLimites= ruleLimites EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLimitesRule(), currentNode); 
            pushFollow(FOLLOW_ruleLimites_in_entryRuleLimites1115);
            iv_ruleLimites=ruleLimites();
            _fsp--;

             current =iv_ruleLimites; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimites1125); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:779:1: ruleLimites returns [EObject current=null] : ( ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) | ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) ) ) ;
    public final EObject ruleLimites() throws RecognitionException {
        EObject current = null;

        EObject lv_lowLimit_0_0 = null;

        EObject lv_highLimit_1_0 = null;

        EObject lv_heighLimit_2_0 = null;

        EObject lv_lowLimit_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:784:6: ( ( ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) | ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:785:1: ( ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) | ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:785:1: ( ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) | ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("785:1: ( ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) | ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:785:2: ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:785:2: ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:785:3: ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:785:3: ( (lv_lowLimit_0_0= ruleLowLimit ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:786:1: (lv_lowLimit_0_0= ruleLowLimit )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:786:1: (lv_lowLimit_0_0= ruleLowLimit )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:787:3: lv_lowLimit_0_0= ruleLowLimit
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLimitesAccess().getLowLimitLowLimitParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLowLimit_in_ruleLimites1172);
                    lv_lowLimit_0_0=ruleLowLimit();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLimitesRule().getType().getClassifier());
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

                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:809:2: ( (lv_highLimit_1_0= ruleHighLimit ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:810:1: (lv_highLimit_1_0= ruleHighLimit )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:810:1: (lv_highLimit_1_0= ruleHighLimit )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:811:3: lv_highLimit_1_0= ruleHighLimit
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLimitesAccess().getHighLimitHighLimitParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleHighLimit_in_ruleLimites1193);
                    lv_highLimit_1_0=ruleHighLimit();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLimitesRule().getType().getClassifier());
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
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:834:6: ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:834:6: ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:834:7: ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:834:7: ( (lv_heighLimit_2_0= ruleHighLimit ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:835:1: (lv_heighLimit_2_0= ruleHighLimit )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:835:1: (lv_heighLimit_2_0= ruleHighLimit )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:836:3: lv_heighLimit_2_0= ruleHighLimit
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLimitesAccess().getHeighLimitHighLimitParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleHighLimit_in_ruleLimites1222);
                    lv_heighLimit_2_0=ruleHighLimit();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLimitesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"heighLimit",
                    	        		lv_heighLimit_2_0, 
                    	        		"HighLimit", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:858:2: ( (lv_lowLimit_3_0= ruleLowLimit ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:859:1: (lv_lowLimit_3_0= ruleLowLimit )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:859:1: (lv_lowLimit_3_0= ruleLowLimit )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:860:3: lv_lowLimit_3_0= ruleLowLimit
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLimitesAccess().getLowLimitLowLimitParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLowLimit_in_ruleLimites1243);
                    lv_lowLimit_3_0=ruleLowLimit();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLimitesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"lowLimit",
                    	        		lv_lowLimit_3_0, 
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


    // $ANTLR start entryRuleTheGeom
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:890:1: entryRuleTheGeom returns [EObject current=null] : iv_ruleTheGeom= ruleTheGeom EOF ;
    public final EObject entryRuleTheGeom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheGeom = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:891:2: (iv_ruleTheGeom= ruleTheGeom EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:892:2: iv_ruleTheGeom= ruleTheGeom EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTheGeomRule(), currentNode); 
            pushFollow(FOLLOW_ruleTheGeom_in_entryRuleTheGeom1280);
            iv_ruleTheGeom=ruleTheGeom();
            _fsp--;

             current =iv_ruleTheGeom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTheGeom1290); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:899:1: ruleTheGeom returns [EObject current=null] : (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC ) ;
    public final EObject ruleTheGeom() throws RecognitionException {
        EObject current = null;

        EObject this_V_0 = null;

        EObject this_DP_1 = null;

        EObject this_DA_2 = null;

        EObject this_DB_3 = null;

        EObject this_DC_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:904:6: ( (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:905:1: (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:905:1: (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("905:1: (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:906:5: this_V_0= ruleV
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTheGeomAccess().getVParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleV_in_ruleTheGeom1337);
                    this_V_0=ruleV();
                    _fsp--;

                     
                            current = this_V_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:916:5: this_DP_1= ruleDP
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTheGeomAccess().getDPParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDP_in_ruleTheGeom1364);
                    this_DP_1=ruleDP();
                    _fsp--;

                     
                            current = this_DP_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:926:5: this_DA_2= ruleDA
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTheGeomAccess().getDAParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDA_in_ruleTheGeom1391);
                    this_DA_2=ruleDA();
                    _fsp--;

                     
                            current = this_DA_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:936:5: this_DB_3= ruleDB
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTheGeomAccess().getDBParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDB_in_ruleTheGeom1418);
                    this_DB_3=ruleDB();
                    _fsp--;

                     
                            current = this_DB_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:946:5: this_DC_4= ruleDC
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTheGeomAccess().getDCParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDC_in_ruleTheGeom1445);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:962:1: entryRuleLowLimit returns [EObject current=null] : iv_ruleLowLimit= ruleLowLimit EOF ;
    public final EObject entryRuleLowLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowLimit = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:963:2: (iv_ruleLowLimit= ruleLowLimit EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:964:2: iv_ruleLowLimit= ruleLowLimit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLowLimitRule(), currentNode); 
            pushFollow(FOLLOW_ruleLowLimit_in_entryRuleLowLimit1480);
            iv_ruleLowLimit=ruleLowLimit();
            _fsp--;

             current =iv_ruleLowLimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLowLimit1490); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:971:1: ruleLowLimit returns [EObject current=null] : ( 'AL' ( (lv_ll_1_0= ruleLimit ) ) ) ;
    public final EObject ruleLowLimit() throws RecognitionException {
        EObject current = null;

        EObject lv_ll_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:976:6: ( ( 'AL' ( (lv_ll_1_0= ruleLimit ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:977:1: ( 'AL' ( (lv_ll_1_0= ruleLimit ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:977:1: ( 'AL' ( (lv_ll_1_0= ruleLimit ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:977:3: 'AL' ( (lv_ll_1_0= ruleLimit ) )
            {
            match(input,17,FOLLOW_17_in_ruleLowLimit1525); 

                    createLeafNode(grammarAccess.getLowLimitAccess().getALKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:981:1: ( (lv_ll_1_0= ruleLimit ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:982:1: (lv_ll_1_0= ruleLimit )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:982:1: (lv_ll_1_0= ruleLimit )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:983:3: lv_ll_1_0= ruleLimit
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLowLimitAccess().getLlLimitParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLimit_in_ruleLowLimit1546);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1013:1: entryRuleHighLimit returns [EObject current=null] : iv_ruleHighLimit= ruleHighLimit EOF ;
    public final EObject entryRuleHighLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighLimit = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1014:2: (iv_ruleHighLimit= ruleHighLimit EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1015:2: iv_ruleHighLimit= ruleHighLimit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHighLimitRule(), currentNode); 
            pushFollow(FOLLOW_ruleHighLimit_in_entryRuleHighLimit1582);
            iv_ruleHighLimit=ruleHighLimit();
            _fsp--;

             current =iv_ruleHighLimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighLimit1592); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1022:1: ruleHighLimit returns [EObject current=null] : ( 'AH' ( (lv_hl_1_0= ruleLimit ) ) ) ;
    public final EObject ruleHighLimit() throws RecognitionException {
        EObject current = null;

        EObject lv_hl_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1027:6: ( ( 'AH' ( (lv_hl_1_0= ruleLimit ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1028:1: ( 'AH' ( (lv_hl_1_0= ruleLimit ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1028:1: ( 'AH' ( (lv_hl_1_0= ruleLimit ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1028:3: 'AH' ( (lv_hl_1_0= ruleLimit ) )
            {
            match(input,18,FOLLOW_18_in_ruleHighLimit1627); 

                    createLeafNode(grammarAccess.getHighLimitAccess().getAHKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1032:1: ( (lv_hl_1_0= ruleLimit ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1033:1: (lv_hl_1_0= ruleLimit )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1033:1: (lv_hl_1_0= ruleLimit )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1034:3: lv_hl_1_0= ruleLimit
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHighLimitAccess().getHlLimitParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLimit_in_ruleHighLimit1648);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1064:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1065:2: (iv_ruleLimit= ruleLimit EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1066:2: iv_ruleLimit= ruleLimit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLimitRule(), currentNode); 
            pushFollow(FOLLOW_ruleLimit_in_entryRuleLimit1684);
            iv_ruleLimit=ruleLimit();
            _fsp--;

             current =iv_ruleLimit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimit1694); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1073:1: ruleLimit returns [EObject current=null] : (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        EObject this_FL_0 = null;

        EObject this_SFC_1 = null;

        EObject this_GND_2 = null;

        EObject this_UNL_3 = null;

        EObject this_VAL_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1078:6: ( (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1079:1: (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1079:1: (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            case RULE_INT:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1079:1: (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1080:5: this_FL_0= ruleFL
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitAccess().getFLParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFL_in_ruleLimit1741);
                    this_FL_0=ruleFL();
                    _fsp--;

                     
                            current = this_FL_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1090:5: this_SFC_1= ruleSFC
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitAccess().getSFCParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSFC_in_ruleLimit1768);
                    this_SFC_1=ruleSFC();
                    _fsp--;

                     
                            current = this_SFC_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1100:5: this_GND_2= ruleGND
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitAccess().getGNDParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGND_in_ruleLimit1795);
                    this_GND_2=ruleGND();
                    _fsp--;

                     
                            current = this_GND_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1110:5: this_UNL_3= ruleUNL
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitAccess().getUNLParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUNL_in_ruleLimit1822);
                    this_UNL_3=ruleUNL();
                    _fsp--;

                     
                            current = this_UNL_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1120:5: this_VAL_4= ruleVAL
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLimitAccess().getVALParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVAL_in_ruleLimit1849);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1136:1: entryRuleFL returns [EObject current=null] : iv_ruleFL= ruleFL EOF ;
    public final EObject entryRuleFL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFL = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1137:2: (iv_ruleFL= ruleFL EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1138:2: iv_ruleFL= ruleFL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFLRule(), currentNode); 
            pushFollow(FOLLOW_ruleFL_in_entryRuleFL1884);
            iv_ruleFL=ruleFL();
            _fsp--;

             current =iv_ruleFL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFL1894); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1145:1: ruleFL returns [EObject current=null] : ( 'FL' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleFL() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1150:6: ( ( 'FL' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1151:1: ( 'FL' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1151:1: ( 'FL' ( (lv_value_1_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1151:3: 'FL' ( (lv_value_1_0= RULE_INT ) )
            {
            match(input,19,FOLLOW_19_in_ruleFL1929); 

                    createLeafNode(grammarAccess.getFLAccess().getFLKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1155:1: ( (lv_value_1_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1156:1: (lv_value_1_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1156:1: (lv_value_1_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1157:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFL1946); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1187:1: entryRuleSFC returns [EObject current=null] : iv_ruleSFC= ruleSFC EOF ;
    public final EObject entryRuleSFC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFC = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1188:2: (iv_ruleSFC= ruleSFC EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1189:2: iv_ruleSFC= ruleSFC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSFCRule(), currentNode); 
            pushFollow(FOLLOW_ruleSFC_in_entryRuleSFC1987);
            iv_ruleSFC=ruleSFC();
            _fsp--;

             current =iv_ruleSFC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSFC1997); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1196:1: ruleSFC returns [EObject current=null] : ( () 'SFC' ) ;
    public final EObject ruleSFC() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1201:6: ( ( () 'SFC' ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1202:1: ( () 'SFC' )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1202:1: ( () 'SFC' )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1202:2: () 'SFC'
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1202:2: ()
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1203:5: 
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

            match(input,20,FOLLOW_20_in_ruleSFC2041); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1225:1: entryRuleGND returns [EObject current=null] : iv_ruleGND= ruleGND EOF ;
    public final EObject entryRuleGND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGND = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1226:2: (iv_ruleGND= ruleGND EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1227:2: iv_ruleGND= ruleGND EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGNDRule(), currentNode); 
            pushFollow(FOLLOW_ruleGND_in_entryRuleGND2077);
            iv_ruleGND=ruleGND();
            _fsp--;

             current =iv_ruleGND; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGND2087); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1234:1: ruleGND returns [EObject current=null] : ( () 'GND' ) ;
    public final EObject ruleGND() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1239:6: ( ( () 'GND' ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1240:1: ( () 'GND' )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1240:1: ( () 'GND' )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1240:2: () 'GND'
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1240:2: ()
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1241:5: 
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

            match(input,21,FOLLOW_21_in_ruleGND2131); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1263:1: entryRuleUNL returns [EObject current=null] : iv_ruleUNL= ruleUNL EOF ;
    public final EObject entryRuleUNL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNL = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1264:2: (iv_ruleUNL= ruleUNL EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1265:2: iv_ruleUNL= ruleUNL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUNLRule(), currentNode); 
            pushFollow(FOLLOW_ruleUNL_in_entryRuleUNL2167);
            iv_ruleUNL=ruleUNL();
            _fsp--;

             current =iv_ruleUNL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNL2177); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1272:1: ruleUNL returns [EObject current=null] : ( () 'UNL' ) ;
    public final EObject ruleUNL() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1277:6: ( ( () 'UNL' ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1278:1: ( () 'UNL' )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1278:1: ( () 'UNL' )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1278:2: () 'UNL'
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1278:2: ()
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1279:5: 
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

            match(input,22,FOLLOW_22_in_ruleUNL2221); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1301:1: entryRuleVAL returns [EObject current=null] : iv_ruleVAL= ruleVAL EOF ;
    public final EObject entryRuleVAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAL = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1302:2: (iv_ruleVAL= ruleVAL EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1303:2: iv_ruleVAL= ruleVAL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVALRule(), currentNode); 
            pushFollow(FOLLOW_ruleVAL_in_entryRuleVAL2257);
            iv_ruleVAL=ruleVAL();
            _fsp--;

             current =iv_ruleVAL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAL2267); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1310:1: ruleVAL returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) ) ;
    public final EObject ruleVAL() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_unit_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1315:6: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1316:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1316:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1316:2: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1316:2: ( (lv_value_0_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1317:1: (lv_value_0_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1317:1: (lv_value_0_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1318:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVAL2309); 

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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1340:2: ( (lv_unit_1_0= ruleUnits ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1341:1: (lv_unit_1_0= ruleUnits )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1341:1: (lv_unit_1_0= ruleUnits )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1342:3: lv_unit_1_0= ruleUnits
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVALAccess().getUnitUnitsEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUnits_in_ruleVAL2335);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1372:1: entryRuleV returns [EObject current=null] : iv_ruleV= ruleV EOF ;
    public final EObject entryRuleV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1373:2: (iv_ruleV= ruleV EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1374:2: iv_ruleV= ruleV EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVRule(), currentNode); 
            pushFollow(FOLLOW_ruleV_in_entryRuleV2371);
            iv_ruleV=ruleV();
            _fsp--;

             current =iv_ruleV; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleV2381); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1381:1: ruleV returns [EObject current=null] : ( 'V' ( (lv_vsub_1_0= ruleVsub ) ) ) ;
    public final EObject ruleV() throws RecognitionException {
        EObject current = null;

        EObject lv_vsub_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1386:6: ( ( 'V' ( (lv_vsub_1_0= ruleVsub ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1387:1: ( 'V' ( (lv_vsub_1_0= ruleVsub ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1387:1: ( 'V' ( (lv_vsub_1_0= ruleVsub ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1387:3: 'V' ( (lv_vsub_1_0= ruleVsub ) )
            {
            match(input,23,FOLLOW_23_in_ruleV2416); 

                    createLeafNode(grammarAccess.getVAccess().getVKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1391:1: ( (lv_vsub_1_0= ruleVsub ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1392:1: (lv_vsub_1_0= ruleVsub )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1392:1: (lv_vsub_1_0= ruleVsub )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1393:3: lv_vsub_1_0= ruleVsub
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVAccess().getVsubVsubParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVsub_in_ruleV2437);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1423:1: entryRuleVsub returns [EObject current=null] : iv_ruleVsub= ruleVsub EOF ;
    public final EObject entryRuleVsub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVsub = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1424:2: (iv_ruleVsub= ruleVsub EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1425:2: iv_ruleVsub= ruleVsub EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVsubRule(), currentNode); 
            pushFollow(FOLLOW_ruleVsub_in_entryRuleVsub2473);
            iv_ruleVsub=ruleVsub();
            _fsp--;

             current =iv_ruleVsub; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVsub2483); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1432:1: ruleVsub returns [EObject current=null] : ( ( 'X=' ( (lv_x_1_0= rulePoint ) ) ) | ( 'D=' ( (lv_d_3_0= ruleDir ) ) ) ) ;
    public final EObject ruleVsub() throws RecognitionException {
        EObject current = null;

        EObject lv_x_1_0 = null;

        EObject lv_d_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1437:6: ( ( ( 'X=' ( (lv_x_1_0= rulePoint ) ) ) | ( 'D=' ( (lv_d_3_0= ruleDir ) ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1438:1: ( ( 'X=' ( (lv_x_1_0= rulePoint ) ) ) | ( 'D=' ( (lv_d_3_0= ruleDir ) ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1438:1: ( ( 'X=' ( (lv_x_1_0= rulePoint ) ) ) | ( 'D=' ( (lv_d_3_0= ruleDir ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1438:1: ( ( 'X=' ( (lv_x_1_0= rulePoint ) ) ) | ( 'D=' ( (lv_d_3_0= ruleDir ) ) ) )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1438:2: ( 'X=' ( (lv_x_1_0= rulePoint ) ) )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1438:2: ( 'X=' ( (lv_x_1_0= rulePoint ) ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1438:4: 'X=' ( (lv_x_1_0= rulePoint ) )
                    {
                    match(input,24,FOLLOW_24_in_ruleVsub2519); 

                            createLeafNode(grammarAccess.getVsubAccess().getXKeyword_0_0(), null); 
                        
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1442:1: ( (lv_x_1_0= rulePoint ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1443:1: (lv_x_1_0= rulePoint )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1443:1: (lv_x_1_0= rulePoint )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1444:3: lv_x_1_0= rulePoint
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVsubAccess().getXPointParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePoint_in_ruleVsub2540);
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
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1467:6: ( 'D=' ( (lv_d_3_0= ruleDir ) ) )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1467:6: ( 'D=' ( (lv_d_3_0= ruleDir ) ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1467:8: 'D=' ( (lv_d_3_0= ruleDir ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleVsub2558); 

                            createLeafNode(grammarAccess.getVsubAccess().getDKeyword_1_0(), null); 
                        
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1471:1: ( (lv_d_3_0= ruleDir ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1472:1: (lv_d_3_0= ruleDir )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1472:1: (lv_d_3_0= ruleDir )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1473:3: lv_d_3_0= ruleDir
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVsubAccess().getDDirParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDir_in_ruleVsub2579);
                    lv_d_3_0=ruleDir();
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
                    	        		"Dir", 
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


    // $ANTLR start entryRuleDir
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1503:1: entryRuleDir returns [EObject current=null] : iv_ruleDir= ruleDir EOF ;
    public final EObject entryRuleDir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDir = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1504:2: (iv_ruleDir= ruleDir EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1505:2: iv_ruleDir= ruleDir EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDirRule(), currentNode); 
            pushFollow(FOLLOW_ruleDir_in_entryRuleDir2616);
            iv_ruleDir=ruleDir();
            _fsp--;

             current =iv_ruleDir; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDir2626); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDir


    // $ANTLR start ruleDir
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1512:1: ruleDir returns [EObject current=null] : (this_Plus_0= rulePlus | this_Minus_1= ruleMinus ) ;
    public final EObject ruleDir() throws RecognitionException {
        EObject current = null;

        EObject this_Plus_0 = null;

        EObject this_Minus_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1517:6: ( (this_Plus_0= rulePlus | this_Minus_1= ruleMinus ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1518:1: (this_Plus_0= rulePlus | this_Minus_1= ruleMinus )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1518:1: (this_Plus_0= rulePlus | this_Minus_1= ruleMinus )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1518:1: (this_Plus_0= rulePlus | this_Minus_1= ruleMinus )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1519:5: this_Plus_0= rulePlus
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDirAccess().getPlusParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePlus_in_ruleDir2673);
                    this_Plus_0=rulePlus();
                    _fsp--;

                     
                            current = this_Plus_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1529:5: this_Minus_1= ruleMinus
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDirAccess().getMinusParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMinus_in_ruleDir2700);
                    this_Minus_1=ruleMinus();
                    _fsp--;

                     
                            current = this_Minus_1; 
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
    // $ANTLR end ruleDir


    // $ANTLR start entryRulePlus
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1545:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1546:2: (iv_rulePlus= rulePlus EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1547:2: iv_rulePlus= rulePlus EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPlusRule(), currentNode); 
            pushFollow(FOLLOW_rulePlus_in_entryRulePlus2735);
            iv_rulePlus=rulePlus();
            _fsp--;

             current =iv_rulePlus; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlus2745); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePlus


    // $ANTLR start rulePlus
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1554:1: rulePlus returns [EObject current=null] : ( () '+' ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1559:6: ( ( () '+' ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1560:1: ( () '+' )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1560:1: ( () '+' )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1560:2: () '+'
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1560:2: ()
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1561:5: 
            {
             
                    temp=factory.create(grammarAccess.getPlusAccess().getPlusAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPlusAccess().getPlusAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,26,FOLLOW_26_in_rulePlus2789); 

                    createLeafNode(grammarAccess.getPlusAccess().getPlusSignKeyword_1(), null); 
                

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
    // $ANTLR end rulePlus


    // $ANTLR start entryRuleMinus
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1583:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1584:2: (iv_ruleMinus= ruleMinus EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1585:2: iv_ruleMinus= ruleMinus EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMinusRule(), currentNode); 
            pushFollow(FOLLOW_ruleMinus_in_entryRuleMinus2825);
            iv_ruleMinus=ruleMinus();
            _fsp--;

             current =iv_ruleMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinus2835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMinus


    // $ANTLR start ruleMinus
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1592:1: ruleMinus returns [EObject current=null] : ( () '-' ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1597:6: ( ( () '-' ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1598:1: ( () '-' )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1598:1: ( () '-' )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1598:2: () '-'
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1598:2: ()
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1599:5: 
            {
             
                    temp=factory.create(grammarAccess.getMinusAccess().getMinusAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getMinusAccess().getMinusAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,27,FOLLOW_27_in_ruleMinus2879); 

                    createLeafNode(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1(), null); 
                

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
    // $ANTLR end ruleMinus


    // $ANTLR start entryRuleDC
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1621:1: entryRuleDC returns [EObject current=null] : iv_ruleDC= ruleDC EOF ;
    public final EObject entryRuleDC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDC = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1622:2: (iv_ruleDC= ruleDC EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1623:2: iv_ruleDC= ruleDC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDCRule(), currentNode); 
            pushFollow(FOLLOW_ruleDC_in_entryRuleDC2915);
            iv_ruleDC=ruleDC();
            _fsp--;

             current =iv_ruleDC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDC2925); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1630:1: ruleDC returns [EObject current=null] : ( 'DC' ( (lv_radius_1_0= ruleRadius ) ) ) ;
    public final EObject ruleDC() throws RecognitionException {
        EObject current = null;

        EObject lv_radius_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1635:6: ( ( 'DC' ( (lv_radius_1_0= ruleRadius ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1636:1: ( 'DC' ( (lv_radius_1_0= ruleRadius ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1636:1: ( 'DC' ( (lv_radius_1_0= ruleRadius ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1636:3: 'DC' ( (lv_radius_1_0= ruleRadius ) )
            {
            match(input,28,FOLLOW_28_in_ruleDC2960); 

                    createLeafNode(grammarAccess.getDCAccess().getDCKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1640:1: ( (lv_radius_1_0= ruleRadius ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1641:1: (lv_radius_1_0= ruleRadius )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1641:1: (lv_radius_1_0= ruleRadius )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1642:3: lv_radius_1_0= ruleRadius
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDCAccess().getRadiusRadiusParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRadius_in_ruleDC2981);
            lv_radius_1_0=ruleRadius();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"radius",
            	        		lv_radius_1_0, 
            	        		"Radius", 
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
    // $ANTLR end ruleDC


    // $ANTLR start entryRuleRadius
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1672:1: entryRuleRadius returns [EObject current=null] : iv_ruleRadius= ruleRadius EOF ;
    public final EObject entryRuleRadius() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadius = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1673:2: (iv_ruleRadius= ruleRadius EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1674:2: iv_ruleRadius= ruleRadius EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRadiusRule(), currentNode); 
            pushFollow(FOLLOW_ruleRadius_in_entryRuleRadius3017);
            iv_ruleRadius=ruleRadius();
            _fsp--;

             current =iv_ruleRadius; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadius3027); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRadius


    // $ANTLR start ruleRadius
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1681:1: ruleRadius returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_reakValuer_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleRadius() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Token lv_reakValuer_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1686:6: ( ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_reakValuer_1_0= RULE_REAL ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1687:1: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_reakValuer_1_0= RULE_REAL ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1687:1: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_reakValuer_1_0= RULE_REAL ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_REAL) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1687:1: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_reakValuer_1_0= RULE_REAL ) ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1687:2: ( (lv_intValue_0_0= RULE_INT ) )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1687:2: ( (lv_intValue_0_0= RULE_INT ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1688:1: (lv_intValue_0_0= RULE_INT )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1688:1: (lv_intValue_0_0= RULE_INT )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1689:3: lv_intValue_0_0= RULE_INT
                    {
                    lv_intValue_0_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRadius3069); 

                    			createLeafNode(grammarAccess.getRadiusAccess().getIntValueINTTerminalRuleCall_0_0(), "intValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRadiusRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"intValue",
                    	        		lv_intValue_0_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1712:6: ( (lv_reakValuer_1_0= RULE_REAL ) )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1712:6: ( (lv_reakValuer_1_0= RULE_REAL ) )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1713:1: (lv_reakValuer_1_0= RULE_REAL )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1713:1: (lv_reakValuer_1_0= RULE_REAL )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1714:3: lv_reakValuer_1_0= RULE_REAL
                    {
                    lv_reakValuer_1_0=(Token)input.LT(1);
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleRadius3097); 

                    			createLeafNode(grammarAccess.getRadiusAccess().getReakValuerREALTerminalRuleCall_1_0(), "reakValuer"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRadiusRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"reakValuer",
                    	        		lv_reakValuer_1_0, 
                    	        		"REAL", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
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
    // $ANTLR end ruleRadius


    // $ANTLR start entryRuleDP
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1744:1: entryRuleDP returns [EObject current=null] : iv_ruleDP= ruleDP EOF ;
    public final EObject entryRuleDP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDP = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1745:2: (iv_ruleDP= ruleDP EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1746:2: iv_ruleDP= ruleDP EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDPRule(), currentNode); 
            pushFollow(FOLLOW_ruleDP_in_entryRuleDP3138);
            iv_ruleDP=ruleDP();
            _fsp--;

             current =iv_ruleDP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDP3148); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1753:1: ruleDP returns [EObject current=null] : ( 'DP' ( (lv_dp_1_0= rulePoint ) ) ) ;
    public final EObject ruleDP() throws RecognitionException {
        EObject current = null;

        EObject lv_dp_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1758:6: ( ( 'DP' ( (lv_dp_1_0= rulePoint ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1759:1: ( 'DP' ( (lv_dp_1_0= rulePoint ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1759:1: ( 'DP' ( (lv_dp_1_0= rulePoint ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1759:3: 'DP' ( (lv_dp_1_0= rulePoint ) )
            {
            match(input,29,FOLLOW_29_in_ruleDP3183); 

                    createLeafNode(grammarAccess.getDPAccess().getDPKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1763:1: ( (lv_dp_1_0= rulePoint ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1764:1: (lv_dp_1_0= rulePoint )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1764:1: (lv_dp_1_0= rulePoint )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1765:3: lv_dp_1_0= rulePoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDPAccess().getDpPointParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleDP3204);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1795:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1796:2: (iv_rulePoint= rulePoint EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1797:2: iv_rulePoint= rulePoint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPointRule(), currentNode); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint3240);
            iv_rulePoint=rulePoint();
            _fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint3250); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1804:1: rulePoint returns [EObject current=null] : (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        EObject this_Point1_0 = null;

        EObject this_Point2_1 = null;

        EObject this_Point3_2 = null;

        EObject this_Point4_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1809:6: ( (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1810:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1810:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==30) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==RULE_INT) ) {
                        int LA14_4 = input.LA(4);

                        if ( (LA14_4==30) ) {
                            int LA14_6 = input.LA(5);

                            if ( (LA14_6==RULE_INT) ) {
                                alt14=1;
                            }
                            else if ( (LA14_6==RULE_REAL) ) {
                                alt14=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1810:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )", 14, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1810:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )", 14, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA14_3==RULE_REAL) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1810:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )", 14, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1810:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==RULE_REAL) ) {
                alt14=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1810:1: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1811:5: this_Point1_0= rulePoint1
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPointAccess().getPoint1ParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePoint1_in_rulePoint3297);
                    this_Point1_0=rulePoint1();
                    _fsp--;

                     
                            current = this_Point1_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1821:5: this_Point2_1= rulePoint2
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPointAccess().getPoint2ParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePoint2_in_rulePoint3324);
                    this_Point2_1=rulePoint2();
                    _fsp--;

                     
                            current = this_Point2_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1831:5: this_Point3_2= rulePoint3
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPointAccess().getPoint3ParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePoint3_in_rulePoint3351);
                    this_Point3_2=rulePoint3();
                    _fsp--;

                     
                            current = this_Point3_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1841:5: this_Point4_3= rulePoint4
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPointAccess().getPoint4ParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePoint4_in_rulePoint3378);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1857:1: entryRulePoint1 returns [EObject current=null] : iv_rulePoint1= rulePoint1 EOF ;
    public final EObject entryRulePoint1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint1 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1858:2: (iv_rulePoint1= rulePoint1 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1859:2: iv_rulePoint1= rulePoint1 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPoint1Rule(), currentNode); 
            pushFollow(FOLLOW_rulePoint1_in_entryRulePoint13413);
            iv_rulePoint1=rulePoint1();
            _fsp--;

             current =iv_rulePoint1; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint13423); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1866:1: rulePoint1 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) ) ;
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
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1871:6: ( ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1872:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1872:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1872:2: ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1872:2: ( (lv_longD_0_0= ruleLongDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1873:1: (lv_longD_0_0= ruleLongDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1873:1: (lv_longD_0_0= ruleLongDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1874:3: lv_longD_0_0= ruleLongDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLongDLongDegrParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLongDegr_in_rulePoint13469);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1896:2: ( (lv_longM_1_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1897:1: (lv_longM_1_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1897:1: (lv_longM_1_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1898:3: lv_longM_1_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLongMMinSecParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint13490);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1920:2: ( (lv_longS_2_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1921:1: (lv_longS_2_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1921:1: (lv_longS_2_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1922:3: lv_longS_2_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLongSMinSecParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint13511);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1944:2: ( (lv_ns_3_0= ruleNS ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1945:1: (lv_ns_3_0= ruleNS )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1945:1: (lv_ns_3_0= ruleNS )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1946:3: lv_ns_3_0= ruleNS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getNsNSEnumRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNS_in_rulePoint13532);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1968:2: ( (lv_latD_4_0= ruleLatDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1969:1: (lv_latD_4_0= ruleLatDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1969:1: (lv_latD_4_0= ruleLatDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1970:3: lv_latD_4_0= ruleLatDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLatDLatDegrParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLatDegr_in_rulePoint13553);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1992:2: ( (lv_latM_5_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1993:1: (lv_latM_5_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1993:1: (lv_latM_5_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:1994:3: lv_latM_5_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLatMMinSecParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint13574);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2016:2: ( (lv_latS_6_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2017:1: (lv_latS_6_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2017:1: (lv_latS_6_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2018:3: lv_latS_6_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getLatSMinSecParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint13595);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2040:2: ( (lv_we_7_0= ruleWE ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2041:1: (lv_we_7_0= ruleWE )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2041:1: (lv_we_7_0= ruleWE )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2042:3: lv_we_7_0= ruleWE
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint1Access().getWeWEEnumRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWE_in_rulePoint13616);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2072:1: entryRulePoint2 returns [EObject current=null] : iv_rulePoint2= rulePoint2 EOF ;
    public final EObject entryRulePoint2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint2 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2073:2: (iv_rulePoint2= rulePoint2 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2074:2: iv_rulePoint2= rulePoint2 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPoint2Rule(), currentNode); 
            pushFollow(FOLLOW_rulePoint2_in_entryRulePoint23652);
            iv_rulePoint2=rulePoint2();
            _fsp--;

             current =iv_rulePoint2; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint23662); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2081:1: rulePoint2 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) ) ;
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
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2086:6: ( ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2087:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2087:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2087:2: ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2087:2: ( (lv_longD_0_0= ruleLongDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2088:1: (lv_longD_0_0= ruleLongDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2088:1: (lv_longD_0_0= ruleLongDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2089:3: lv_longD_0_0= ruleLongDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getLongDLongDegrParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLongDegr_in_rulePoint23708);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2111:2: ( (lv_longMf_1_0= ruleMinDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2112:1: (lv_longMf_1_0= ruleMinDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2112:1: (lv_longMf_1_0= ruleMinDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2113:3: lv_longMf_1_0= ruleMinDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getLongMfMinDecParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinDec_in_rulePoint23729);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2135:2: ( (lv_ns_2_0= ruleNS ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2136:1: (lv_ns_2_0= ruleNS )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2136:1: (lv_ns_2_0= ruleNS )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2137:3: lv_ns_2_0= ruleNS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getNsNSEnumRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNS_in_rulePoint23750);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2159:2: ( (lv_latD_3_0= ruleLatDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2160:1: (lv_latD_3_0= ruleLatDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2160:1: (lv_latD_3_0= ruleLatDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2161:3: lv_latD_3_0= ruleLatDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getLatDLatDegrParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLatDegr_in_rulePoint23771);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2183:2: ( (lv_latMf_4_0= ruleMinDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2184:1: (lv_latMf_4_0= ruleMinDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2184:1: (lv_latMf_4_0= ruleMinDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2185:3: lv_latMf_4_0= ruleMinDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getLatMfMinDecParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinDec_in_rulePoint23792);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2207:2: ( (lv_we_5_0= ruleWE ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2208:1: (lv_we_5_0= ruleWE )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2208:1: (lv_we_5_0= ruleWE )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2209:3: lv_we_5_0= ruleWE
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint2Access().getWeWEEnumRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWE_in_rulePoint23813);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2239:1: entryRulePoint3 returns [EObject current=null] : iv_rulePoint3= rulePoint3 EOF ;
    public final EObject entryRulePoint3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint3 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2240:2: (iv_rulePoint3= rulePoint3 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2241:2: iv_rulePoint3= rulePoint3 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPoint3Rule(), currentNode); 
            pushFollow(FOLLOW_rulePoint3_in_entryRulePoint33849);
            iv_rulePoint3=rulePoint3();
            _fsp--;

             current =iv_rulePoint3; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint33859); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2248:1: rulePoint3 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) ) ;
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
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2253:6: ( ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2254:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2254:1: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2254:2: ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2254:2: ( (lv_longD_0_0= ruleLongDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2255:1: (lv_longD_0_0= ruleLongDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2255:1: (lv_longD_0_0= ruleLongDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2256:3: lv_longD_0_0= ruleLongDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLongDLongDegrParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLongDegr_in_rulePoint33905);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2278:2: ( (lv_longM_1_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2279:1: (lv_longM_1_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2279:1: (lv_longM_1_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2280:3: lv_longM_1_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLongMMinSecParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint33926);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2302:2: ( (lv_longS_2_0= ruleSecDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2303:1: (lv_longS_2_0= ruleSecDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2303:1: (lv_longS_2_0= ruleSecDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2304:3: lv_longS_2_0= ruleSecDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLongSSecDecParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSecDec_in_rulePoint33947);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2326:2: ( (lv_ns_3_0= ruleNS ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2327:1: (lv_ns_3_0= ruleNS )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2327:1: (lv_ns_3_0= ruleNS )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2328:3: lv_ns_3_0= ruleNS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getNsNSEnumRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNS_in_rulePoint33968);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2350:2: ( (lv_latD_4_0= ruleLatDegr ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2351:1: (lv_latD_4_0= ruleLatDegr )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2351:1: (lv_latD_4_0= ruleLatDegr )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2352:3: lv_latD_4_0= ruleLatDegr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLatDLatDegrParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLatDegr_in_rulePoint33989);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2374:2: ( (lv_latM_5_0= ruleMinSec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2375:1: (lv_latM_5_0= ruleMinSec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2375:1: (lv_latM_5_0= ruleMinSec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2376:3: lv_latM_5_0= ruleMinSec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLatMMinSecParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMinSec_in_rulePoint34010);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2398:2: ( (lv_latS_6_0= ruleSecDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2399:1: (lv_latS_6_0= ruleSecDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2399:1: (lv_latS_6_0= ruleSecDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2400:3: lv_latS_6_0= ruleSecDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getLatSSecDecParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSecDec_in_rulePoint34031);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2422:2: ( (lv_we_7_0= ruleWE ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2423:1: (lv_we_7_0= ruleWE )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2423:1: (lv_we_7_0= ruleWE )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2424:3: lv_we_7_0= ruleWE
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint3Access().getWeWEEnumRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWE_in_rulePoint34052);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2454:1: entryRulePoint4 returns [EObject current=null] : iv_rulePoint4= rulePoint4 EOF ;
    public final EObject entryRulePoint4() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint4 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2455:2: (iv_rulePoint4= rulePoint4 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2456:2: iv_rulePoint4= rulePoint4 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPoint4Rule(), currentNode); 
            pushFollow(FOLLOW_rulePoint4_in_entryRulePoint44088);
            iv_rulePoint4=rulePoint4();
            _fsp--;

             current =iv_rulePoint4; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint44098); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2463:1: rulePoint4 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) ) ;
    public final EObject rulePoint4() throws RecognitionException {
        EObject current = null;

        EObject lv_longD_0_0 = null;

        Enumerator lv_ns_1_0 = null;

        EObject lv_latD_2_0 = null;

        Enumerator lv_we_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2468:6: ( ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2469:1: ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2469:1: ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2469:2: ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2469:2: ( (lv_longD_0_0= ruleLongDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2470:1: (lv_longD_0_0= ruleLongDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2470:1: (lv_longD_0_0= ruleLongDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2471:3: lv_longD_0_0= ruleLongDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint4Access().getLongDLongDecParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLongDec_in_rulePoint44144);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2493:2: ( (lv_ns_1_0= ruleNS ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2494:1: (lv_ns_1_0= ruleNS )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2494:1: (lv_ns_1_0= ruleNS )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2495:3: lv_ns_1_0= ruleNS
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint4Access().getNsNSEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNS_in_rulePoint44165);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2517:2: ( (lv_latD_2_0= ruleLatDec ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2518:1: (lv_latD_2_0= ruleLatDec )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2518:1: (lv_latD_2_0= ruleLatDec )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2519:3: lv_latD_2_0= ruleLatDec
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint4Access().getLatDLatDecParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLatDec_in_rulePoint44186);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2541:2: ( (lv_we_3_0= ruleWE ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2542:1: (lv_we_3_0= ruleWE )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2542:1: (lv_we_3_0= ruleWE )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2543:3: lv_we_3_0= ruleWE
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPoint4Access().getWeWEEnumRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWE_in_rulePoint44207);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2573:1: entryRuleLongDegr returns [EObject current=null] : iv_ruleLongDegr= ruleLongDegr EOF ;
    public final EObject entryRuleLongDegr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongDegr = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2574:2: (iv_ruleLongDegr= ruleLongDegr EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2575:2: iv_ruleLongDegr= ruleLongDegr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLongDegrRule(), currentNode); 
            pushFollow(FOLLOW_ruleLongDegr_in_entryRuleLongDegr4243);
            iv_ruleLongDegr=ruleLongDegr();
            _fsp--;

             current =iv_ruleLongDegr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongDegr4253); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2582:1: ruleLongDegr returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLongDegr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2587:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2588:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2588:1: ( (lv_value_0_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2589:1: (lv_value_0_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2589:1: (lv_value_0_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2590:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLongDegr4294); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2620:1: entryRuleLatDegr returns [EObject current=null] : iv_ruleLatDegr= ruleLatDegr EOF ;
    public final EObject entryRuleLatDegr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLatDegr = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2621:2: (iv_ruleLatDegr= ruleLatDegr EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2622:2: iv_ruleLatDegr= ruleLatDegr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLatDegrRule(), currentNode); 
            pushFollow(FOLLOW_ruleLatDegr_in_entryRuleLatDegr4334);
            iv_ruleLatDegr=ruleLatDegr();
            _fsp--;

             current =iv_ruleLatDegr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLatDegr4344); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2629:1: ruleLatDegr returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLatDegr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2634:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2635:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2635:1: ( (lv_value_0_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2636:1: (lv_value_0_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2636:1: (lv_value_0_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2637:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLatDegr4385); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2667:1: entryRuleMinSec returns [EObject current=null] : iv_ruleMinSec= ruleMinSec EOF ;
    public final EObject entryRuleMinSec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinSec = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2668:2: (iv_ruleMinSec= ruleMinSec EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2669:2: iv_ruleMinSec= ruleMinSec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMinSecRule(), currentNode); 
            pushFollow(FOLLOW_ruleMinSec_in_entryRuleMinSec4425);
            iv_ruleMinSec=ruleMinSec();
            _fsp--;

             current =iv_ruleMinSec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinSec4435); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2676:1: ruleMinSec returns [EObject current=null] : ( ruleSep ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMinSec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2681:6: ( ( ruleSep ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2682:1: ( ruleSep ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2682:1: ( ruleSep ( (lv_value_1_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2683:5: ruleSep ( (lv_value_1_0= RULE_INT ) )
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMinSecAccess().getSepParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleSep_in_ruleMinSec4476);
            ruleSep();
            _fsp--;

             
                    currentNode = currentNode.getParent();
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2690:1: ( (lv_value_1_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2691:1: (lv_value_1_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2691:1: (lv_value_1_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2692:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMinSec4492); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2722:1: entryRuleSecDec returns [EObject current=null] : iv_ruleSecDec= ruleSecDec EOF ;
    public final EObject entryRuleSecDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecDec = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2723:2: (iv_ruleSecDec= ruleSecDec EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2724:2: iv_ruleSecDec= ruleSecDec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSecDecRule(), currentNode); 
            pushFollow(FOLLOW_ruleSecDec_in_entryRuleSecDec4533);
            iv_ruleSecDec=ruleSecDec();
            _fsp--;

             current =iv_ruleSecDec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecDec4543); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2731:1: ruleSecDec returns [EObject current=null] : ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleSecDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2736:6: ( ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2737:1: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2737:1: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2738:5: ruleSep ( (lv_value_1_0= RULE_REAL ) )
            {
             
                    currentNode=createCompositeNode(grammarAccess.getSecDecAccess().getSepParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleSep_in_ruleSecDec4584);
            ruleSep();
            _fsp--;

             
                    currentNode = currentNode.getParent();
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2745:1: ( (lv_value_1_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2746:1: (lv_value_1_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2746:1: (lv_value_1_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2747:3: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleSecDec4600); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2777:1: entryRuleMinDec returns [EObject current=null] : iv_ruleMinDec= ruleMinDec EOF ;
    public final EObject entryRuleMinDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinDec = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2778:2: (iv_ruleMinDec= ruleMinDec EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2779:2: iv_ruleMinDec= ruleMinDec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMinDecRule(), currentNode); 
            pushFollow(FOLLOW_ruleMinDec_in_entryRuleMinDec4641);
            iv_ruleMinDec=ruleMinDec();
            _fsp--;

             current =iv_ruleMinDec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinDec4651); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2786:1: ruleMinDec returns [EObject current=null] : ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleMinDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2791:6: ( ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2792:1: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2792:1: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2793:5: ruleSep ( (lv_value_1_0= RULE_REAL ) )
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMinDecAccess().getSepParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleSep_in_ruleMinDec4692);
            ruleSep();
            _fsp--;

             
                    currentNode = currentNode.getParent();
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2800:1: ( (lv_value_1_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2801:1: (lv_value_1_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2801:1: (lv_value_1_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2802:3: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleMinDec4708); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2832:1: entryRuleLongDec returns [EObject current=null] : iv_ruleLongDec= ruleLongDec EOF ;
    public final EObject entryRuleLongDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongDec = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2833:2: (iv_ruleLongDec= ruleLongDec EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2834:2: iv_ruleLongDec= ruleLongDec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLongDecRule(), currentNode); 
            pushFollow(FOLLOW_ruleLongDec_in_entryRuleLongDec4749);
            iv_ruleLongDec=ruleLongDec();
            _fsp--;

             current =iv_ruleLongDec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongDec4759); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2841:1: ruleLongDec returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleLongDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2846:6: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2847:1: ( (lv_value_0_0= RULE_REAL ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2847:1: ( (lv_value_0_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2848:1: (lv_value_0_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2848:1: (lv_value_0_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2849:3: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleLongDec4800); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2879:1: entryRuleLatDec returns [EObject current=null] : iv_ruleLatDec= ruleLatDec EOF ;
    public final EObject entryRuleLatDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLatDec = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2880:2: (iv_ruleLatDec= ruleLatDec EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2881:2: iv_ruleLatDec= ruleLatDec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLatDecRule(), currentNode); 
            pushFollow(FOLLOW_ruleLatDec_in_entryRuleLatDec4840);
            iv_ruleLatDec=ruleLatDec();
            _fsp--;

             current =iv_ruleLatDec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLatDec4850); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2888:1: ruleLatDec returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleLatDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2893:6: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2894:1: ( (lv_value_0_0= RULE_REAL ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2894:1: ( (lv_value_0_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2895:1: (lv_value_0_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2895:1: (lv_value_0_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2896:3: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleLatDec4891); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2926:1: entryRuleSep returns [String current=null] : iv_ruleSep= ruleSep EOF ;
    public final String entryRuleSep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSep = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2927:2: (iv_ruleSep= ruleSep EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2928:2: iv_ruleSep= ruleSep EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSepRule(), currentNode); 
            pushFollow(FOLLOW_ruleSep_in_entryRuleSep4932);
            iv_ruleSep=ruleSep();
            _fsp--;

             current =iv_ruleSep.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSep4943); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2935:1: ruleSep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleSep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2940:6: (kw= ':' )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2942:2: kw= ':'
            {
            kw=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleSep4980); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2955:1: entryRuleDA returns [EObject current=null] : iv_ruleDA= ruleDA EOF ;
    public final EObject entryRuleDA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDA = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2956:2: (iv_ruleDA= ruleDA EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2957:2: iv_ruleDA= ruleDA EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDARule(), currentNode); 
            pushFollow(FOLLOW_ruleDA_in_entryRuleDA5019);
            iv_ruleDA=ruleDA();
            _fsp--;

             current =iv_ruleDA; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDA5029); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2964:1: ruleDA returns [EObject current=null] : ( 'DA' ( (lv_da_1_0= ruleDaParams ) ) ) ;
    public final EObject ruleDA() throws RecognitionException {
        EObject current = null;

        EObject lv_da_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2969:6: ( ( 'DA' ( (lv_da_1_0= ruleDaParams ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2970:1: ( 'DA' ( (lv_da_1_0= ruleDaParams ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2970:1: ( 'DA' ( (lv_da_1_0= ruleDaParams ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2970:3: 'DA' ( (lv_da_1_0= ruleDaParams ) )
            {
            match(input,31,FOLLOW_31_in_ruleDA5064); 

                    createLeafNode(grammarAccess.getDAAccess().getDAKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2974:1: ( (lv_da_1_0= ruleDaParams ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2975:1: (lv_da_1_0= ruleDaParams )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2975:1: (lv_da_1_0= ruleDaParams )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:2976:3: lv_da_1_0= ruleDaParams
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDAAccess().getDaDaParamsParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDaParams_in_ruleDA5085);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3006:1: entryRuleDaParams returns [EObject current=null] : iv_ruleDaParams= ruleDaParams EOF ;
    public final EObject entryRuleDaParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaParams = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3007:2: (iv_ruleDaParams= ruleDaParams EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3008:2: iv_ruleDaParams= ruleDaParams EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDaParamsRule(), currentNode); 
            pushFollow(FOLLOW_ruleDaParams_in_entryRuleDaParams5121);
            iv_ruleDaParams=ruleDaParams();
            _fsp--;

             current =iv_ruleDaParams; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaParams5131); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3015:1: ruleDaParams returns [EObject current=null] : (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 ) ;
    public final EObject ruleDaParams() throws RecognitionException {
        EObject current = null;

        EObject this_DaParams1_0 = null;

        EObject this_DaParams2_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3020:6: ( (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3021:1: (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3021:1: (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_REAL) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3021:1: (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3022:5: this_DaParams1_0= ruleDaParams1
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDaParamsAccess().getDaParams1ParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDaParams1_in_ruleDaParams5178);
                    this_DaParams1_0=ruleDaParams1();
                    _fsp--;

                     
                            current = this_DaParams1_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3032:5: this_DaParams2_1= ruleDaParams2
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDaParamsAccess().getDaParams2ParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDaParams2_in_ruleDaParams5205);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3048:1: entryRuleDaParams1 returns [EObject current=null] : iv_ruleDaParams1= ruleDaParams1 EOF ;
    public final EObject entryRuleDaParams1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaParams1 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3049:2: (iv_ruleDaParams1= ruleDaParams1 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3050:2: iv_ruleDaParams1= ruleDaParams1 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDaParams1Rule(), currentNode); 
            pushFollow(FOLLOW_ruleDaParams1_in_entryRuleDaParams15240);
            iv_ruleDaParams1=ruleDaParams1();
            _fsp--;

             current =iv_ruleDaParams1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaParams15250); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3057:1: ruleDaParams1 returns [EObject current=null] : ( ( (lv_radius_0_0= RULE_REAL ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDaParams1() throws RecognitionException {
        EObject current = null;

        Token lv_radius_0_0=null;
        Token lv_angleStart_2_0=null;
        Token lv_angleEnd_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3062:6: ( ( ( (lv_radius_0_0= RULE_REAL ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3063:1: ( ( (lv_radius_0_0= RULE_REAL ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3063:1: ( ( (lv_radius_0_0= RULE_REAL ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3063:2: ( (lv_radius_0_0= RULE_REAL ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3063:2: ( (lv_radius_0_0= RULE_REAL ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3064:1: (lv_radius_0_0= RULE_REAL )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3064:1: (lv_radius_0_0= RULE_REAL )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3065:3: lv_radius_0_0= RULE_REAL
            {
            lv_radius_0_0=(Token)input.LT(1);
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleDaParams15292); 

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

            match(input,14,FOLLOW_14_in_ruleDaParams15307); 

                    createLeafNode(grammarAccess.getDaParams1Access().getCommaKeyword_1(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3091:1: ( (lv_angleStart_2_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3092:1: (lv_angleStart_2_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3092:1: (lv_angleStart_2_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3093:3: lv_angleStart_2_0= RULE_INT
            {
            lv_angleStart_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaParams15324); 

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

            match(input,14,FOLLOW_14_in_ruleDaParams15339); 

                    createLeafNode(grammarAccess.getDaParams1Access().getCommaKeyword_3(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3119:1: ( (lv_angleEnd_4_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3120:1: (lv_angleEnd_4_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3120:1: (lv_angleEnd_4_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3121:3: lv_angleEnd_4_0= RULE_INT
            {
            lv_angleEnd_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaParams15356); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3151:1: entryRuleDaParams2 returns [EObject current=null] : iv_ruleDaParams2= ruleDaParams2 EOF ;
    public final EObject entryRuleDaParams2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaParams2 = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3152:2: (iv_ruleDaParams2= ruleDaParams2 EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3153:2: iv_ruleDaParams2= ruleDaParams2 EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDaParams2Rule(), currentNode); 
            pushFollow(FOLLOW_ruleDaParams2_in_entryRuleDaParams25397);
            iv_ruleDaParams2=ruleDaParams2();
            _fsp--;

             current =iv_ruleDaParams2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaParams25407); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3160:1: ruleDaParams2 returns [EObject current=null] : ( ( (lv_radius_0_0= RULE_INT ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDaParams2() throws RecognitionException {
        EObject current = null;

        Token lv_radius_0_0=null;
        Token lv_angleStart_2_0=null;
        Token lv_angleEnd_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3165:6: ( ( ( (lv_radius_0_0= RULE_INT ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3166:1: ( ( (lv_radius_0_0= RULE_INT ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3166:1: ( ( (lv_radius_0_0= RULE_INT ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3166:2: ( (lv_radius_0_0= RULE_INT ) ) ',' ( (lv_angleStart_2_0= RULE_INT ) ) ',' ( (lv_angleEnd_4_0= RULE_INT ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3166:2: ( (lv_radius_0_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3167:1: (lv_radius_0_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3167:1: (lv_radius_0_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3168:3: lv_radius_0_0= RULE_INT
            {
            lv_radius_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaParams25449); 

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

            match(input,14,FOLLOW_14_in_ruleDaParams25464); 

                    createLeafNode(grammarAccess.getDaParams2Access().getCommaKeyword_1(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3194:1: ( (lv_angleStart_2_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3195:1: (lv_angleStart_2_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3195:1: (lv_angleStart_2_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3196:3: lv_angleStart_2_0= RULE_INT
            {
            lv_angleStart_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaParams25481); 

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

            match(input,14,FOLLOW_14_in_ruleDaParams25496); 

                    createLeafNode(grammarAccess.getDaParams2Access().getCommaKeyword_3(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3222:1: ( (lv_angleEnd_4_0= RULE_INT ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3223:1: (lv_angleEnd_4_0= RULE_INT )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3223:1: (lv_angleEnd_4_0= RULE_INT )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3224:3: lv_angleEnd_4_0= RULE_INT
            {
            lv_angleEnd_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaParams25513); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3254:1: entryRuleDB returns [EObject current=null] : iv_ruleDB= ruleDB EOF ;
    public final EObject entryRuleDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDB = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3255:2: (iv_ruleDB= ruleDB EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3256:2: iv_ruleDB= ruleDB EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDBRule(), currentNode); 
            pushFollow(FOLLOW_ruleDB_in_entryRuleDB5554);
            iv_ruleDB=ruleDB();
            _fsp--;

             current =iv_ruleDB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDB5564); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3263:1: ruleDB returns [EObject current=null] : ( 'DB' ( (lv_dp0_1_0= rulePoint ) ) ( ',' )? ( (lv_dp1_3_0= rulePoint ) ) ) ;
    public final EObject ruleDB() throws RecognitionException {
        EObject current = null;

        EObject lv_dp0_1_0 = null;

        EObject lv_dp1_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3268:6: ( ( 'DB' ( (lv_dp0_1_0= rulePoint ) ) ( ',' )? ( (lv_dp1_3_0= rulePoint ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3269:1: ( 'DB' ( (lv_dp0_1_0= rulePoint ) ) ( ',' )? ( (lv_dp1_3_0= rulePoint ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3269:1: ( 'DB' ( (lv_dp0_1_0= rulePoint ) ) ( ',' )? ( (lv_dp1_3_0= rulePoint ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3269:3: 'DB' ( (lv_dp0_1_0= rulePoint ) ) ( ',' )? ( (lv_dp1_3_0= rulePoint ) )
            {
            match(input,32,FOLLOW_32_in_ruleDB5599); 

                    createLeafNode(grammarAccess.getDBAccess().getDBKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3273:1: ( (lv_dp0_1_0= rulePoint ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3274:1: (lv_dp0_1_0= rulePoint )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3274:1: (lv_dp0_1_0= rulePoint )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3275:3: lv_dp0_1_0= rulePoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDBAccess().getDp0PointParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleDB5620);
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

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3297:2: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3297:4: ','
                    {
                    match(input,14,FOLLOW_14_in_ruleDB5631); 

                            createLeafNode(grammarAccess.getDBAccess().getCommaKeyword_2(), null); 
                        

                    }
                    break;

            }

            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3301:3: ( (lv_dp1_3_0= rulePoint ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3302:1: (lv_dp1_3_0= rulePoint )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3302:1: (lv_dp1_3_0= rulePoint )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3303:3: lv_dp1_3_0= rulePoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDBAccess().getDp1PointParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleDB5654);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3333:1: entryRuleAT returns [EObject current=null] : iv_ruleAT= ruleAT EOF ;
    public final EObject entryRuleAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAT = null;


        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3334:2: (iv_ruleAT= ruleAT EOF )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3335:2: iv_ruleAT= ruleAT EOF
            {
             currentNode = createCompositeNode(grammarAccess.getATRule(), currentNode); 
            pushFollow(FOLLOW_ruleAT_in_entryRuleAT5690);
            iv_ruleAT=ruleAT();
            _fsp--;

             current =iv_ruleAT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAT5700); 

            }

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3342:1: ruleAT returns [EObject current=null] : ( 'AT' ( (lv_lp_1_0= rulePoint ) ) ) ;
    public final EObject ruleAT() throws RecognitionException {
        EObject current = null;

        EObject lv_lp_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3347:6: ( ( 'AT' ( (lv_lp_1_0= rulePoint ) ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3348:1: ( 'AT' ( (lv_lp_1_0= rulePoint ) ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3348:1: ( 'AT' ( (lv_lp_1_0= rulePoint ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3348:3: 'AT' ( (lv_lp_1_0= rulePoint ) )
            {
            match(input,33,FOLLOW_33_in_ruleAT5735); 

                    createLeafNode(grammarAccess.getATAccess().getATKeyword_0(), null); 
                
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3352:1: ( (lv_lp_1_0= rulePoint ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3353:1: (lv_lp_1_0= rulePoint )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3353:1: (lv_lp_1_0= rulePoint )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3354:3: lv_lp_1_0= rulePoint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getATAccess().getLpPointParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleAT5756);
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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3384:1: ruleClassType returns [Enumerator current=null] : ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'Q' ) | ( 'R' ) | ( 'W' ) | ( 'P' ) | ( 'GP' ) | ( 'TMZ' ) | ( 'CTR' ) | ( 'Restricted' ) | ( 'UKN' ) ) ;
    public final Enumerator ruleClassType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3388:6: ( ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'Q' ) | ( 'R' ) | ( 'W' ) | ( 'P' ) | ( 'GP' ) | ( 'TMZ' ) | ( 'CTR' ) | ( 'Restricted' ) | ( 'UKN' ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3389:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'Q' ) | ( 'R' ) | ( 'W' ) | ( 'P' ) | ( 'GP' ) | ( 'TMZ' ) | ( 'CTR' ) | ( 'Restricted' ) | ( 'UKN' ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3389:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'Q' ) | ( 'R' ) | ( 'W' ) | ( 'P' ) | ( 'GP' ) | ( 'TMZ' ) | ( 'CTR' ) | ( 'Restricted' ) | ( 'UKN' ) )
            int alt17=16;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt17=1;
                }
                break;
            case 35:
                {
                alt17=2;
                }
                break;
            case 36:
                {
                alt17=3;
                }
                break;
            case 37:
                {
                alt17=4;
                }
                break;
            case 38:
                {
                alt17=5;
                }
                break;
            case 39:
                {
                alt17=6;
                }
                break;
            case 40:
                {
                alt17=7;
                }
                break;
            case 41:
                {
                alt17=8;
                }
                break;
            case 42:
                {
                alt17=9;
                }
                break;
            case 43:
                {
                alt17=10;
                }
                break;
            case 44:
                {
                alt17=11;
                }
                break;
            case 45:
                {
                alt17=12;
                }
                break;
            case 46:
                {
                alt17=13;
                }
                break;
            case 47:
                {
                alt17=14;
                }
                break;
            case 48:
                {
                alt17=15;
                }
                break;
            case 49:
                {
                alt17=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3389:1: ( ( 'A' ) | ( 'B' ) | ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'Q' ) | ( 'R' ) | ( 'W' ) | ( 'P' ) | ( 'GP' ) | ( 'TMZ' ) | ( 'CTR' ) | ( 'Restricted' ) | ( 'UKN' ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3389:2: ( 'A' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3389:2: ( 'A' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3389:4: 'A'
                    {
                    match(input,34,FOLLOW_34_in_ruleClassType5804); 

                            current = grammarAccess.getClassTypeAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getAEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3395:6: ( 'B' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3395:6: ( 'B' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3395:8: 'B'
                    {
                    match(input,35,FOLLOW_35_in_ruleClassType5819); 

                            current = grammarAccess.getClassTypeAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getBEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3401:6: ( 'C' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3401:6: ( 'C' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3401:8: 'C'
                    {
                    match(input,36,FOLLOW_36_in_ruleClassType5834); 

                            current = grammarAccess.getClassTypeAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getCEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3407:6: ( 'D' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3407:6: ( 'D' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3407:8: 'D'
                    {
                    match(input,37,FOLLOW_37_in_ruleClassType5849); 

                            current = grammarAccess.getClassTypeAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getDEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3413:6: ( 'E' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3413:6: ( 'E' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3413:8: 'E'
                    {
                    match(input,38,FOLLOW_38_in_ruleClassType5864); 

                            current = grammarAccess.getClassTypeAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getEEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3419:6: ( 'F' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3419:6: ( 'F' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3419:8: 'F'
                    {
                    match(input,39,FOLLOW_39_in_ruleClassType5879); 

                            current = grammarAccess.getClassTypeAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getFEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3425:6: ( 'G' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3425:6: ( 'G' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3425:8: 'G'
                    {
                    match(input,40,FOLLOW_40_in_ruleClassType5894); 

                            current = grammarAccess.getClassTypeAccess().getGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getGEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3431:6: ( 'Q' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3431:6: ( 'Q' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3431:8: 'Q'
                    {
                    match(input,41,FOLLOW_41_in_ruleClassType5909); 

                            current = grammarAccess.getClassTypeAccess().getQEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getQEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3437:6: ( 'R' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3437:6: ( 'R' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3437:8: 'R'
                    {
                    match(input,42,FOLLOW_42_in_ruleClassType5924); 

                            current = grammarAccess.getClassTypeAccess().getREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getREnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3443:6: ( 'W' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3443:6: ( 'W' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3443:8: 'W'
                    {
                    match(input,43,FOLLOW_43_in_ruleClassType5939); 

                            current = grammarAccess.getClassTypeAccess().getWEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getWEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3449:6: ( 'P' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3449:6: ( 'P' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3449:8: 'P'
                    {
                    match(input,44,FOLLOW_44_in_ruleClassType5954); 

                            current = grammarAccess.getClassTypeAccess().getPEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getPEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3455:6: ( 'GP' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3455:6: ( 'GP' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3455:8: 'GP'
                    {
                    match(input,45,FOLLOW_45_in_ruleClassType5969); 

                            current = grammarAccess.getClassTypeAccess().getGPEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getGPEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3461:6: ( 'TMZ' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3461:6: ( 'TMZ' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3461:8: 'TMZ'
                    {
                    match(input,46,FOLLOW_46_in_ruleClassType5984); 

                            current = grammarAccess.getClassTypeAccess().getTMZEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getTMZEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3467:6: ( 'CTR' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3467:6: ( 'CTR' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3467:8: 'CTR'
                    {
                    match(input,47,FOLLOW_47_in_ruleClassType5999); 

                            current = grammarAccess.getClassTypeAccess().getCTREnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getCTREnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3473:6: ( 'Restricted' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3473:6: ( 'Restricted' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3473:8: 'Restricted'
                    {
                    match(input,48,FOLLOW_48_in_ruleClassType6014); 

                            current = grammarAccess.getClassTypeAccess().getRestrictedEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getClassTypeAccess().getRestrictedEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3479:6: ( 'UKN' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3479:6: ( 'UKN' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3479:8: 'UKN'
                    {
                    match(input,49,FOLLOW_49_in_ruleClassType6029); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3489:1: ruleUnits returns [Enumerator current=null] : ( ( 'ft' ) | ( 'm' ) | ( 'MSL' ) | ( 'm MSL' ) | ( 'ft MSL' ) | ( 'AGL' ) | ( 'm AGL' ) | ( 'ft AGL' ) | ( 'AMSL' ) | ( 'm AMSL' ) ) ;
    public final Enumerator ruleUnits() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3493:6: ( ( ( 'ft' ) | ( 'm' ) | ( 'MSL' ) | ( 'm MSL' ) | ( 'ft MSL' ) | ( 'AGL' ) | ( 'm AGL' ) | ( 'ft AGL' ) | ( 'AMSL' ) | ( 'm AMSL' ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3494:1: ( ( 'ft' ) | ( 'm' ) | ( 'MSL' ) | ( 'm MSL' ) | ( 'ft MSL' ) | ( 'AGL' ) | ( 'm AGL' ) | ( 'ft AGL' ) | ( 'AMSL' ) | ( 'm AMSL' ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3494:1: ( ( 'ft' ) | ( 'm' ) | ( 'MSL' ) | ( 'm MSL' ) | ( 'ft MSL' ) | ( 'AGL' ) | ( 'm AGL' ) | ( 'ft AGL' ) | ( 'AMSL' ) | ( 'm AMSL' ) )
            int alt18=10;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt18=1;
                }
                break;
            case 51:
                {
                alt18=2;
                }
                break;
            case 52:
                {
                alt18=3;
                }
                break;
            case 53:
                {
                alt18=4;
                }
                break;
            case 54:
                {
                alt18=5;
                }
                break;
            case 55:
                {
                alt18=6;
                }
                break;
            case 56:
                {
                alt18=7;
                }
                break;
            case 57:
                {
                alt18=8;
                }
                break;
            case 58:
                {
                alt18=9;
                }
                break;
            case 59:
                {
                alt18=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3494:1: ( ( 'ft' ) | ( 'm' ) | ( 'MSL' ) | ( 'm MSL' ) | ( 'ft MSL' ) | ( 'AGL' ) | ( 'm AGL' ) | ( 'ft AGL' ) | ( 'AMSL' ) | ( 'm AMSL' ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3494:2: ( 'ft' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3494:2: ( 'ft' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3494:4: 'ft'
                    {
                    match(input,50,FOLLOW_50_in_ruleUnits6072); 

                            current = grammarAccess.getUnitsAccess().getFeedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getFeedEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3500:6: ( 'm' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3500:6: ( 'm' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3500:8: 'm'
                    {
                    match(input,51,FOLLOW_51_in_ruleUnits6087); 

                            current = grammarAccess.getUnitsAccess().getMeterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getMeterEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3506:6: ( 'MSL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3506:6: ( 'MSL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3506:8: 'MSL'
                    {
                    match(input,52,FOLLOW_52_in_ruleUnits6102); 

                            current = grammarAccess.getUnitsAccess().getMslEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getMslEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3512:6: ( 'm MSL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3512:6: ( 'm MSL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3512:8: 'm MSL'
                    {
                    match(input,53,FOLLOW_53_in_ruleUnits6117); 

                            current = grammarAccess.getUnitsAccess().getM_mslEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getM_mslEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3518:6: ( 'ft MSL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3518:6: ( 'ft MSL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3518:8: 'ft MSL'
                    {
                    match(input,54,FOLLOW_54_in_ruleUnits6132); 

                            current = grammarAccess.getUnitsAccess().getFt_mslEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getFt_mslEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3524:6: ( 'AGL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3524:6: ( 'AGL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3524:8: 'AGL'
                    {
                    match(input,55,FOLLOW_55_in_ruleUnits6147); 

                            current = grammarAccess.getUnitsAccess().getAglEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getAglEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3530:6: ( 'm AGL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3530:6: ( 'm AGL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3530:8: 'm AGL'
                    {
                    match(input,56,FOLLOW_56_in_ruleUnits6162); 

                            current = grammarAccess.getUnitsAccess().getM_aglEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getM_aglEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3536:6: ( 'ft AGL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3536:6: ( 'ft AGL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3536:8: 'ft AGL'
                    {
                    match(input,57,FOLLOW_57_in_ruleUnits6177); 

                            current = grammarAccess.getUnitsAccess().getFt_AGLEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getFt_AGLEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3542:6: ( 'AMSL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3542:6: ( 'AMSL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3542:8: 'AMSL'
                    {
                    match(input,58,FOLLOW_58_in_ruleUnits6192); 

                            current = grammarAccess.getUnitsAccess().getAMSLEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnitsAccess().getAMSLEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3548:6: ( 'm AMSL' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3548:6: ( 'm AMSL' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3548:8: 'm AMSL'
                    {
                    match(input,59,FOLLOW_59_in_ruleUnits6207); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3558:1: ruleWE returns [Enumerator current=null] : ( ( 'W' ) | ( 'E' ) ) ;
    public final Enumerator ruleWE() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3562:6: ( ( ( 'W' ) | ( 'E' ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3563:1: ( ( 'W' ) | ( 'E' ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3563:1: ( ( 'W' ) | ( 'E' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3563:1: ( ( 'W' ) | ( 'E' ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3563:2: ( 'W' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3563:2: ( 'W' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3563:4: 'W'
                    {
                    match(input,43,FOLLOW_43_in_ruleWE6250); 

                            current = grammarAccess.getWEAccess().getWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getWEAccess().getWEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3569:6: ( 'E' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3569:6: ( 'E' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3569:8: 'E'
                    {
                    match(input,38,FOLLOW_38_in_ruleWE6265); 

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
    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3579:1: ruleNS returns [Enumerator current=null] : ( ( 'N' ) | ( 'S' ) ) ;
    public final Enumerator ruleNS() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3583:6: ( ( ( 'N' ) | ( 'S' ) ) )
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3584:1: ( ( 'N' ) | ( 'S' ) )
            {
            // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3584:1: ( ( 'N' ) | ( 'S' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==60) ) {
                alt20=1;
            }
            else if ( (LA20_0==61) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3584:1: ( ( 'N' ) | ( 'S' ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3584:2: ( 'N' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3584:2: ( 'N' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3584:4: 'N'
                    {
                    match(input,60,FOLLOW_60_in_ruleNS6308); 

                            current = grammarAccess.getNSAccess().getNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNSAccess().getNEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3590:6: ( 'S' )
                    {
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3590:6: ( 'S' )
                    // ../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g:3590:8: 'S'
                    {
                    match(input,61,FOLLOW_61_in_ruleNS6323); 

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
    public static final BitSet FOLLOW_ruleLimites_in_ruleTheDef444 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleAT_in_ruleTheDef465 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleAsClass_in_entryRuleAsClass502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsClass512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAsClass556 = new BitSet(new long[]{0x0003FFFC00000002L});
    public static final BitSet FOLLOW_ruleClassType_in_ruleAsClass577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSP_in_entryRuleSP614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSP624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSP659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSP676 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSP691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSP708 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSP723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSP740 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSP755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSP772 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSP787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSP804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSB_in_entryRuleSB845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSB855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSB890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSB907 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSB922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSB939 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSB954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSB971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsName_in_entryRuleAsName1012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsName1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAsName1057 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAsName1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimites_in_entryRuleLimites1115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimites1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLowLimit_in_ruleLimites1172 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleHighLimit_in_ruleLimites1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighLimit_in_ruleLimites1222 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleLowLimit_in_ruleLimites1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTheGeom_in_entryRuleTheGeom1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTheGeom1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleV_in_ruleTheGeom1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDP_in_ruleTheGeom1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDA_in_ruleTheGeom1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDB_in_ruleTheGeom1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDC_in_ruleTheGeom1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLowLimit_in_entryRuleLowLimit1480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLowLimit1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLowLimit1525 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_ruleLimit_in_ruleLowLimit1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighLimit_in_entryRuleHighLimit1582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighLimit1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleHighLimit1627 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_ruleLimit_in_ruleHighLimit1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimit_in_entryRuleLimit1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimit1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFL_in_ruleLimit1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSFC_in_ruleLimit1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGND_in_ruleLimit1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNL_in_ruleLimit1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAL_in_ruleLimit1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFL_in_entryRuleFL1884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFL1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFL1929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFL1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSFC_in_entryRuleSFC1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSFC1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSFC2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGND_in_entryRuleGND2077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGND2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleGND2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNL_in_entryRuleUNL2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNL2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleUNL2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAL_in_entryRuleVAL2257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAL2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVAL2309 = new BitSet(new long[]{0x0FFC000000000000L});
    public static final BitSet FOLLOW_ruleUnits_in_ruleVAL2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleV_in_entryRuleV2371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleV2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleV2416 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleVsub_in_ruleV2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVsub_in_entryRuleVsub2473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVsub2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVsub2519 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePoint_in_ruleVsub2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleVsub2558 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleDir_in_ruleVsub2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDir_in_entryRuleDir2616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDir2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlus_in_ruleDir2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_ruleDir2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlus_in_entryRulePlus2735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlus2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePlus2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_entryRuleMinus2825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinus2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMinus2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDC_in_entryRuleDC2915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDC2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDC2960 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleRadius_in_ruleDC2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadius_in_entryRuleRadius3017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadius3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRadius3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleRadius3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDP_in_entryRuleDP3138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDP3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDP3183 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePoint_in_ruleDP3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint3240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint1_in_rulePoint3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint2_in_rulePoint3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint3_in_rulePoint3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint4_in_rulePoint3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint1_in_entryRulePoint13413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint13423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_rulePoint13469 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint13490 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint13511 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleNS_in_rulePoint13532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLatDegr_in_rulePoint13553 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint13574 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint13595 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_ruleWE_in_rulePoint13616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint2_in_entryRulePoint23652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint23662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_rulePoint23708 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinDec_in_rulePoint23729 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleNS_in_rulePoint23750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLatDegr_in_rulePoint23771 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinDec_in_rulePoint23792 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_ruleWE_in_rulePoint23813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint3_in_entryRulePoint33849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint33859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_rulePoint33905 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint33926 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleSecDec_in_rulePoint33947 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleNS_in_rulePoint33968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLatDegr_in_rulePoint33989 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleMinSec_in_rulePoint34010 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleSecDec_in_rulePoint34031 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_ruleWE_in_rulePoint34052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint4_in_entryRulePoint44088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint44098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDec_in_rulePoint44144 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_ruleNS_in_rulePoint44165 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleLatDec_in_rulePoint44186 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_ruleWE_in_rulePoint44207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDegr_in_entryRuleLongDegr4243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongDegr4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLongDegr4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatDegr_in_entryRuleLatDegr4334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLatDegr4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLatDegr4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinSec_in_entryRuleMinSec4425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinSec4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_ruleMinSec4476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMinSec4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecDec_in_entryRuleSecDec4533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecDec4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_ruleSecDec4584 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleSecDec4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinDec_in_entryRuleMinDec4641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinDec4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_ruleMinDec4692 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleMinDec4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongDec_in_entryRuleLongDec4749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongDec4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleLongDec4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLatDec_in_entryRuleLatDec4840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLatDec4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleLatDec4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSep_in_entryRuleSep4932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSep4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSep4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDA_in_entryRuleDA5019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDA5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDA5064 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleDaParams_in_ruleDA5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams_in_entryRuleDaParams5121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaParams5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams1_in_ruleDaParams5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams2_in_ruleDaParams5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams1_in_entryRuleDaParams15240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaParams15250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleDaParams15292 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDaParams15307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaParams15324 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDaParams15339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaParams15356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaParams2_in_entryRuleDaParams25397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaParams25407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaParams25449 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDaParams25464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaParams25481 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDaParams25496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaParams25513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDB_in_entryRuleDB5554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDB5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDB5599 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePoint_in_ruleDB5620 = new BitSet(new long[]{0x0000000000004050L});
    public static final BitSet FOLLOW_14_in_ruleDB5631 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePoint_in_ruleDB5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAT_in_entryRuleAT5690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAT5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAT5735 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePoint_in_ruleAT5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleClassType5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleClassType5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleClassType5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleClassType5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleClassType5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleClassType5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleClassType5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleClassType5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleClassType5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleClassType5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleClassType5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleClassType5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleClassType5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleClassType5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleClassType6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleClassType6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleUnits6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleUnits6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUnits6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUnits6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleUnits6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleUnits6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleUnits6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleUnits6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUnits6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleUnits6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleWE6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleWE6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNS6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNS6323 = new BitSet(new long[]{0x0000000000000002L});

}