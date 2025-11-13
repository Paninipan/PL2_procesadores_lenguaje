lexer grammar EJ2Lexer;
//definimos la gramtica del Lexer

// Palabras clave
ASIGNAR : 'asignar';
MOSTRAR : 'mostrar';
SI : 'si';
SI_NO : 'no';
TERMINAR : 'terminar';

//Ampliación 3 y 4: bucles while y for
//While:
MIENTRAS : 'mientras';
HACER : 'hacer';
//for:  para i desde 10 hasta 0 paso -1 hacer ->  ... terminar
PARA : 'para';
DESDE : 'desde';
HASTA : 'hasta';
PASO : 'paso'; //de cuanto en cuanto "salta"
// Control de bucle
ROMPER    : 'romper';
CONTINUAR : 'continuar';

// Estructura if
MARCA_COND : '???';
FLECHA : '->';

// Fin de instruccion
FIN_LINEA : ';P';

// Operadores
IGUAL  : '==';
DISTINTO : '!=';
MENOR_IGUAL : '<=';
MAYOR_IGUAL : '>=';
MENOR : '<';
MAYOR : '>';

//Ampliación 1: and, or, not
AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;


SUMA : '+';
RESTA : '-';
ASIGNACION : '=';

//Ampliación 1: multiplicación y división:
MULT : '*' ;
DIV  : '/' ;

PAREN_ABRE : '(';
PAREN_CIERRA : ')';


// Ampliación 2: booleanos
VERDADERO : 'verdadero';
FALSO : 'falso';

// Uno o más dígitos del 0 al 9
INT : DIGIT+;

// Uno o más dígitos del 0 al 9 seguido opcionalmente por un punto y de nuevo uno o más dígitos
FLOAT : DIGIT+ ('.' DIGIT*)? ;


// Un String comienza y acaba con comillas dobles
//'\\' . indica una barra invertida seguida de cualquier carácter (para permitir escapes)
//~["\\] es cualquier carácter que no sea comillas ni barra invertida
STRING : '"' ( '\\' . | ~["\\] )* '"';


// Identificadores
//Comienzan con una letra o guión bajo.
//Pueden continuar con letras, números o guión bajo
ID : [a-zA-Z_ñÑ][a-zA-Z_0-9ñÑ]*;

// Comentarios (se ignoran)
// # inicia el comentario.
//~[\r\n]* consume todos los caracteres hasta el salto de línea.
//-> skip dice a ANTLR que ignore este token para no incluir el comentario en los tokens que se le pasen al parser
COMENTARIO : '#' ~[\r\n]* -> skip;

// Espacios y saltos de línea
//La regla agrupa espacios, tabs y saltos de línea
//-> skip los descarta igual que los comentarios
ESPACIO : [ \t\r\n]+ -> skip;

fragment DIGIT : [0-9]; //subregla reutilizable
