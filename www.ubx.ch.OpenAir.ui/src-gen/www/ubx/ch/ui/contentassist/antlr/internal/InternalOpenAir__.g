lexer grammar InternalOpenAir;
@header {
package www.ubx.ch.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : ':' ;
T13 : '+' ;
T14 : '-' ;
T15 : 'A' ;
T16 : 'B' ;
T17 : 'C' ;
T18 : 'D' ;
T19 : 'E' ;
T20 : 'F' ;
T21 : 'G' ;
T22 : 'Q' ;
T23 : 'R' ;
T24 : 'W' ;
T25 : 'P' ;
T26 : 'GP' ;
T27 : 'TMZ' ;
T28 : 'CTR' ;
T29 : 'Restricted' ;
T30 : 'UKN' ;
T31 : 'ft' ;
T32 : 'm' ;
T33 : 'MSL' ;
T34 : 'm MSL' ;
T35 : 'ft MSL' ;
T36 : 'AGL' ;
T37 : 'm AGL' ;
T38 : 'ft AGL' ;
T39 : 'AMSL' ;
T40 : 'm AMSL' ;
T41 : 'N' ;
T42 : 'S' ;
T43 : 'AC' ;
T44 : 'SP' ;
T45 : ',' ;
T46 : 'SB' ;
T47 : 'AN' ;
T48 : 'AL' ;
T49 : 'AH' ;
T50 : 'FL' ;
T51 : 'SFC' ;
T52 : 'GND' ;
T53 : 'UNL' ;
T54 : 'V' ;
T55 : 'X=' ;
T56 : 'D=' ;
T57 : 'DC' ;
T58 : 'DP' ;
T59 : 'DA' ;
T60 : 'DB' ;
T61 : 'AT' ;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6294
RULE_REAL : '-'? RULE_INT+ '.' RULE_INT+;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6296
RULE_SL_COMMENT : '*' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6298
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6300
RULE_INT : ('0'..'9')+;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6302
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6304
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6306
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6308
RULE_ANY_OTHER : .;


