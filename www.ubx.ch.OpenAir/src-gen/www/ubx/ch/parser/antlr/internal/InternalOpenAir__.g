lexer grammar InternalOpenAir;
@header {
package www.ubx.ch.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'AC' ;
T13 : 'SP' ;
T14 : ',' ;
T15 : 'SB' ;
T16 : 'AN' ;
T17 : 'AL' ;
T18 : 'AH' ;
T19 : 'FL' ;
T20 : 'SFC' ;
T21 : 'GND' ;
T22 : 'UNL' ;
T23 : 'V' ;
T24 : 'X=' ;
T25 : 'D=' ;
T26 : '+' ;
T27 : '-' ;
T28 : 'DC' ;
T29 : 'DP' ;
T30 : ':' ;
T31 : 'DA' ;
T32 : 'DB' ;
T33 : 'AT' ;
T34 : 'A' ;
T35 : 'B' ;
T36 : 'C' ;
T37 : 'D' ;
T38 : 'E' ;
T39 : 'F' ;
T40 : 'G' ;
T41 : 'Q' ;
T42 : 'R' ;
T43 : 'W' ;
T44 : 'P' ;
T45 : 'GP' ;
T46 : 'TMZ' ;
T47 : 'CTR' ;
T48 : 'Restricted' ;
T49 : 'UKN' ;
T50 : 'ft' ;
T51 : 'm' ;
T52 : 'MSL' ;
T53 : 'm MSL' ;
T54 : 'ft MSL' ;
T55 : 'AGL' ;
T56 : 'm AGL' ;
T57 : 'ft AGL' ;
T58 : 'AMSL' ;
T59 : 'm AMSL' ;
T60 : 'N' ;
T61 : 'S' ;

// $ANTLR src "../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g" 3444
RULE_REAL : '-'? RULE_INT+ '.' RULE_INT+;

// $ANTLR src "../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g" 3446
RULE_SL_COMMENT : '*' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g" 3448
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g" 3450
RULE_INT : ('0'..'9')+;

// $ANTLR src "../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g" 3452
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g" 3454
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g" 3456
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../www.ubx.ch.OpenAir/src-gen/www/ubx/ch/parser/antlr/internal/InternalOpenAir.g" 3458
RULE_ANY_OTHER : .;


