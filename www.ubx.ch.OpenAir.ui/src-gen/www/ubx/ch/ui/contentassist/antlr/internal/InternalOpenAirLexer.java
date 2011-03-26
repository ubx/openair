package www.ubx.ch.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenAirLexer extends Lexer {
    public static final int RULE_ID=8;
    public static final int RULE_ANY_OTHER=11;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=4;
    public static final int T38=38;
    public static final int RULE_REAL=6;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=62;
    public static final int RULE_SL_COMMENT=7;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=9;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=10;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalOpenAirLexer() {;} 
    public InternalOpenAirLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:10:5: ( ':' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:10:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:11:5: ( 'A' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:11:7: 'A'
            {
            match('A'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:12:5: ( 'B' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:12:7: 'B'
            {
            match('B'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:13:5: ( 'C' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:13:7: 'C'
            {
            match('C'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:14:5: ( 'D' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:14:7: 'D'
            {
            match('D'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:15:5: ( 'E' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:15:7: 'E'
            {
            match('E'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:16:5: ( 'F' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:16:7: 'F'
            {
            match('F'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:17:5: ( 'G' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:17:7: 'G'
            {
            match('G'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:18:5: ( 'Q' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:18:7: 'Q'
            {
            match('Q'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:19:5: ( 'R' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:19:7: 'R'
            {
            match('R'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:20:5: ( 'W' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:20:7: 'W'
            {
            match('W'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:21:5: ( 'P' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:21:7: 'P'
            {
            match('P'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:22:5: ( 'GP' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:22:7: 'GP'
            {
            match("GP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:23:5: ( 'TMZ' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:23:7: 'TMZ'
            {
            match("TMZ"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:24:5: ( 'CTR' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:24:7: 'CTR'
            {
            match("CTR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:25:5: ( 'Restricted' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:25:7: 'Restricted'
            {
            match("Restricted"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:26:5: ( 'UKN' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:26:7: 'UKN'
            {
            match("UKN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:27:5: ( 'ft' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:27:7: 'ft'
            {
            match("ft"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:28:5: ( 'm' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:28:7: 'm'
            {
            match('m'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:29:5: ( 'MSL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:29:7: 'MSL'
            {
            match("MSL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:30:5: ( 'm MSL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:30:7: 'm MSL'
            {
            match("m MSL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:31:5: ( 'ft MSL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:31:7: 'ft MSL'
            {
            match("ft MSL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:32:5: ( 'AGL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:32:7: 'AGL'
            {
            match("AGL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:33:5: ( 'm AGL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:33:7: 'm AGL'
            {
            match("m AGL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:34:5: ( 'ft AGL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:34:7: 'ft AGL'
            {
            match("ft AGL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:35:5: ( 'AMSL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:35:7: 'AMSL'
            {
            match("AMSL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:36:5: ( 'm AMSL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:36:7: 'm AMSL'
            {
            match("m AMSL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:37:5: ( 'N' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:37:7: 'N'
            {
            match('N'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:38:5: ( 'S' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:38:7: 'S'
            {
            match('S'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:39:5: ( 'AC' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:39:7: 'AC'
            {
            match("AC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:40:5: ( 'SP' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:40:7: 'SP'
            {
            match("SP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:41:5: ( ',' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:41:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:42:5: ( 'SB' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:42:7: 'SB'
            {
            match("SB"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:43:5: ( 'AN' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:43:7: 'AN'
            {
            match("AN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:44:5: ( 'AL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:44:7: 'AL'
            {
            match("AL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:45:5: ( 'AH' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:45:7: 'AH'
            {
            match("AH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:46:5: ( 'FL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:46:7: 'FL'
            {
            match("FL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:47:5: ( 'SFC' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:47:7: 'SFC'
            {
            match("SFC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:48:5: ( 'GND' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:48:7: 'GND'
            {
            match("GND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:49:5: ( 'UNL' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:49:7: 'UNL'
            {
            match("UNL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:50:5: ( 'V' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:50:7: 'V'
            {
            match('V'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:51:5: ( 'X=' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:51:7: 'X='
            {
            match("X="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:52:5: ( 'D=' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:52:7: 'D='
            {
            match("D="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:53:5: ( '+' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:53:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:54:5: ( '-' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:54:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:55:5: ( 'DC' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:55:7: 'DC'
            {
            match("DC"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:56:5: ( 'DP' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:56:7: 'DP'
            {
            match("DP"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:57:5: ( 'DA' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:57:7: 'DA'
            {
            match("DA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:58:5: ( 'DB' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:58:7: 'DB'
            {
            match("DB"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:59:5: ( 'AT' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:59:7: 'AT'
            {
            match("AT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6546:10: ( ( '-' | '+' )? ( '0' .. '9' )+ )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6546:12: ( '-' | '+' )? ( '0' .. '9' )+
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6546:12: ( '-' | '+' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6546:23: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6546:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_REAL
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6548:11: ( ( RULE_INT )+ '.' ( RULE_INT )+ )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6548:13: ( RULE_INT )+ '.' ( RULE_INT )+
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6548:13: ( RULE_INT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='+'||LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6548:13: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('.'); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6548:27: ( RULE_INT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='+'||LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6548:27: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_REAL

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6550:17: ( '*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6550:19: '*' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('*'); 
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6550:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6550:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6550:39: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6550:40: ( '\\r' )? '\\n'
                    {
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6550:40: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6550:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6552:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6552:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6552:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6552:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6552:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6554:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFE')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFE')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6554:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6556:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6556:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6556:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFE')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6556:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6558:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6558:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6558:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6560:16: ( . )
            // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:6560:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_INT | RULE_REAL | RULE_SL_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=58;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:114: T38
                {
                mT38(); 

                }
                break;
            case 28 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:118: T39
                {
                mT39(); 

                }
                break;
            case 29 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:122: T40
                {
                mT40(); 

                }
                break;
            case 30 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:126: T41
                {
                mT41(); 

                }
                break;
            case 31 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:130: T42
                {
                mT42(); 

                }
                break;
            case 32 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:134: T43
                {
                mT43(); 

                }
                break;
            case 33 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:138: T44
                {
                mT44(); 

                }
                break;
            case 34 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:142: T45
                {
                mT45(); 

                }
                break;
            case 35 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:146: T46
                {
                mT46(); 

                }
                break;
            case 36 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:150: T47
                {
                mT47(); 

                }
                break;
            case 37 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:154: T48
                {
                mT48(); 

                }
                break;
            case 38 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:158: T49
                {
                mT49(); 

                }
                break;
            case 39 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:162: T50
                {
                mT50(); 

                }
                break;
            case 40 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:166: T51
                {
                mT51(); 

                }
                break;
            case 41 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:170: T52
                {
                mT52(); 

                }
                break;
            case 42 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:174: T53
                {
                mT53(); 

                }
                break;
            case 43 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:178: T54
                {
                mT54(); 

                }
                break;
            case 44 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:182: T55
                {
                mT55(); 

                }
                break;
            case 45 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:186: T56
                {
                mT56(); 

                }
                break;
            case 46 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:190: T57
                {
                mT57(); 

                }
                break;
            case 47 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:194: T58
                {
                mT58(); 

                }
                break;
            case 48 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:198: T59
                {
                mT59(); 

                }
                break;
            case 49 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:202: T60
                {
                mT60(); 

                }
                break;
            case 50 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:206: T61
                {
                mT61(); 

                }
                break;
            case 51 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:210: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:219: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 53 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:229: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:245: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 55 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:253: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:265: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:281: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 58 :
                // ../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g:1:289: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\2\uffff\1\52\1\54\1\56\1\64\1\65\1\67\1\72\1\73\1\75\1\76\1\77"+
        "\3\53\1\105\1\53\1\107\1\113\1\uffff\1\115\1\53\1\120\1\121\1\122"+
        "\1\uffff\1\41\1\uffff\3\41\3\uffff\1\53\1\131\1\132\1\53\1\134\1"+
        "\135\1\136\3\uffff\1\53\2\uffff\1\140\1\141\1\142\1\143\2\uffff"+
        "\1\144\1\uffff\1\145\1\53\2\uffff\1\53\3\uffff\3\53\1\154\2\uffff"+
        "\1\53\1\uffff\1\160\1\161\1\53\4\uffff\1\122\10\uffff\1\163\2\uffff"+
        "\1\53\3\uffff\1\165\6\uffff\1\166\1\53\1\170\1\171\1\172\4\uffff"+
        "\1\177\2\uffff\1\u0080\1\uffff\1\u0081\2\uffff\1\53\12\uffff\5\53"+
        "\1\u0088\1\uffff";
    static final String DFA15_eofS =
        "\u0089\uffff";
    static final String DFA15_minS =
        "\1\0\1\uffff\13\60\1\115\1\113\1\164\1\40\1\123\2\60\1\uffff\1\60"+
        "\1\75\2\60\1\53\1\uffff\1\101\1\uffff\2\0\1\52\3\uffff\1\114\2\60"+
        "\1\123\3\60\3\uffff\1\122\2\uffff\4\60\2\uffff\1\60\1\uffff\1\60"+
        "\1\104\2\uffff\1\163\3\uffff\1\132\1\116\1\114\1\40\1\101\1\uffff"+
        "\1\114\1\uffff\2\60\1\103\4\uffff\1\53\10\uffff\1\60\2\uffff\1\114"+
        "\3\uffff\1\60\6\uffff\1\60\1\164\3\60\1\101\1\uffff\1\107\1\uffff"+
        "\1\60\2\uffff\1\60\1\uffff\1\60\2\uffff\1\162\12\uffff\1\151\1\143"+
        "\1\164\1\145\1\144\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\ufffe\1\uffff\13\172\1\115\1\116\1\164\1\172\1\123\2\172\1\uffff"+
        "\1\172\1\75\3\71\1\uffff\1\172\1\uffff\2\ufffe\1\52\3\uffff\1\114"+
        "\2\172\1\123\3\172\3\uffff\1\122\2\uffff\4\172\2\uffff\1\172\1\uffff"+
        "\1\172\1\104\2\uffff\1\163\3\uffff\1\132\1\116\1\114\1\172\1\115"+
        "\1\uffff\1\114\1\uffff\2\172\1\103\4\uffff\1\71\10\uffff\1\172\2"+
        "\uffff\1\114\3\uffff\1\172\6\uffff\1\172\1\164\3\172\1\115\1\uffff"+
        "\1\115\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\2\uffff\1\162\12"+
        "\uffff\1\151\1\143\1\164\1\145\1\144\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\22\uffff\1\40\5\uffff\1\65\1\uffff\1\66\3\uffff\1\71"+
        "\1\72\1\1\7\uffff\1\2\1\66\1\3\1\uffff\1\4\1\53\4\uffff\1\5\1\6"+
        "\1\uffff\1\7\2\uffff\1\10\1\11\1\uffff\1\12\1\13\1\14\5\uffff\1"+
        "\23\1\uffff\1\34\3\uffff\1\35\1\40\1\51\1\52\1\uffff\1\54\1\55\1"+
        "\63\1\64\1\65\1\67\1\70\1\71\1\uffff\1\42\1\36\1\uffff\1\43\1\44"+
        "\1\62\1\uffff\1\61\1\60\1\57\1\56\1\45\1\15\6\uffff\1\22\1\uffff"+
        "\1\25\1\uffff\1\41\1\37\1\uffff\1\27\1\uffff\1\17\1\47\1\uffff\1"+
        "\16\1\21\1\50\1\31\1\26\1\30\1\33\1\24\1\46\1\32\6\uffff\1\20";
    static final String DFA15_specialS =
        "\u0089\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\4\41\1\36\2\41\1"+
            "\32\1\27\1\24\1\30\1\41\1\37\12\31\1\1\6\41\1\2\1\3\1\4\1\5"+
            "\1\6\1\7\1\10\5\34\1\21\1\22\1\34\1\14\1\11\1\12\1\23\1\15\1"+
            "\16\1\25\1\13\1\26\2\34\3\41\1\33\1\34\1\41\5\34\1\17\6\34\1"+
            "\20\15\34\uff84\41",
            "",
            "\12\53\7\uffff\2\53\1\45\3\53\1\43\1\50\3\53\1\47\1\46\1\44"+
            "\5\53\1\51\6\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\23\53\1\55\6\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\3\uffff\1\57\3\uffff\1\61\1\60\1\63\14\53\1\62\12\53"+
            "\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\13\53\1\66\16\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\15\53\1\71\1\53\1\70\12\53\4\uffff\1\53\1\uffff"+
            "\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\74\25\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\100",
            "\1\101\2\uffff\1\102",
            "\1\103",
            "\1\104\17\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\106",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\1\53\1\110\3\53\1\112\11\53\1\111\12\53\4\uffff"+
            "\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\116",
            "\12\117",
            "\12\117",
            "\1\123\1\uffff\2\123\1\uffff\12\117",
            "",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\uffff\125",
            "\uffff\125",
            "\1\126",
            "",
            "",
            "",
            "\1\130",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\133",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\1\137",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\146",
            "",
            "",
            "\1\147",
            "",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153\17\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\155\13\uffff\1\156",
            "",
            "\1\157",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\162",
            "",
            "",
            "",
            "",
            "\1\123\1\uffff\2\123\1\uffff\12\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\164",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\167",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\173\13\uffff\1\174",
            "",
            "\1\175\5\uffff\1\176",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u0082",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_INT | RULE_REAL | RULE_SL_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}