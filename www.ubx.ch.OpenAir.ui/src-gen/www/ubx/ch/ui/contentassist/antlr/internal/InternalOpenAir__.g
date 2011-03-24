lexer grammar InternalOpenAir;
@header {
package www.ubx.ch.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : ':' ;
T13 : 'A' ;
T14 : 'B' ;
T15 : 'C' ;
T16 : 'D' ;
T17 : 'E' ;
T18 : 'F' ;
T19 : 'G' ;
T20 : 'Q' ;
T21 : 'R' ;
T22 : 'W' ;
T23 : 'P' ;
T24 : 'GP' ;
T25 : 'TMZ' ;
T26 : 'CTR' ;
T27 : 'Restricted' ;
T28 : 'UKN' ;
T29 : 'ft' ;
T30 : 'm' ;
T31 : 'MSL' ;
T32 : 'm MSL' ;
T33 : 'ft MSL' ;
T34 : 'AGL' ;
T35 : 'm AGL' ;
T36 : 'ft AGL' ;
T37 : 'AMSL' ;
T38 : 'm AMSL' ;
T39 : 'N' ;
T40 : 'S' ;
T41 : 'AC' ;
T42 : 'SP' ;
T43 : ',' ;
T44 : 'SB' ;
T45 : 'AN' ;
T46 : 'AL' ;
T47 : 'AH' ;
T48 : 'FL' ;
T49 : 'SFC' ;
T50 : 'GND' ;
T51 : 'UNL' ;
T52 : 'V' ;
T53 : 'X=' ;
T54 : 'D=' ;
T55 : '+' ;
T56 : '-' ;
T57 : 'DC' ;
T58 : 'DP' ;
T59 : 'DA' ;
T60 : 'DB' ;
T61 : 'AT' ;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6420
RULE_REAL : '-'? RULE_INT+ '.' RULE_INT+;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6422
RULE_SL_COMMENT : '*' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6424
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6426
RULE_INT : ('0'..'9')+;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6428
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6430
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6432
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6434
RULE_ANY_OTHER : .;


