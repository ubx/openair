lexer grammar InternalOpenAir;
@header {
package www.ubx.ch.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '+' ;
T13 : '-' ;
T14 : 'A' ;
T15 : 'B' ;
T16 : 'C' ;
T17 : 'D' ;
T18 : 'E' ;
T19 : 'F' ;
T20 : 'G' ;
T21 : 'Q' ;
T22 : 'R' ;
T23 : 'W' ;
T24 : 'P' ;
T25 : 'GP' ;
T26 : 'TMZ' ;
T27 : 'CTR' ;
T28 : 'Restricted' ;
T29 : 'UKN' ;
T30 : 'ft' ;
T31 : 'm' ;
T32 : 'MSL' ;
T33 : 'm MSL' ;
T34 : 'ft MSL' ;
T35 : 'AGL' ;
T36 : 'm AGL' ;
T37 : 'ft AGL' ;
T38 : 'AMSL' ;
T39 : 'm AMSL' ;
T40 : 'N' ;
T41 : 'S' ;
T42 : 'AC' ;
T43 : 'SP' ;
T44 : ',' ;
T45 : 'SB' ;
T46 : 'AN' ;
T47 : 'AL' ;
T48 : 'AH' ;
T49 : 'FL' ;
T50 : 'SFC' ;
T51 : 'GND' ;
T52 : 'UNL' ;
T53 : 'V' ;
T54 : 'X=' ;
T55 : 'D=' ;
T56 : 'DC' ;
T57 : 'DP' ;
T58 : ':' ;
T59 : 'DA' ;
T60 : 'DB' ;
T61 : 'AT' ;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6270
RULE_REAL : '-'? RULE_INT+ '.' RULE_INT+;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6272
RULE_SL_COMMENT : '*' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6274
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6276
RULE_INT : ('0'..'9')+;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6278
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6280
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6282
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../www.ubx.ch.OpenAir.ui/src-gen/www/ubx/ch/ui/contentassist/antlr/internal/InternalOpenAir.g" 6284
RULE_ANY_OTHER : .;


