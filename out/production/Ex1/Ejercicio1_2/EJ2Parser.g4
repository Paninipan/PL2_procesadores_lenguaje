parser grammar EJ2Parser;
//definimos la gramtica del Parser

options { tokenVocab=EJ2Lexer; }
//cogemos las reglas producidas por el lexer

// Programa completo
//Acepta cero o mas elementos, donde cada uno puede ser una sentencia simple o un condicional
//Termina en un EOF (end of line)
programa : (sentencia | condicional)* EOF ;

// Sentencias simples:
//declaracion (asignar x = expr ;P)
//asignacion (x = expr ;P)
//impresion (mostrar expr ;P)
//bucles while ("mientras")
//control_bucle para break y continue
sentencia : declaracion | asignacion | impresion | bucle | control_bucle;

// Declarar variable e inicializar
// Exige la palabra clave asignar para inicializar una variable. Por ejemplo: asignar a =20 ;P
declaracion : ASIGNAR ID ASIGNACION expresion FIN_LINEA ;

// Asignación normal
// Reasigna una variable ya existente. Por ejemplo: a= a+1 ;P.
asignacion : ID ASIGNACION expresion FIN_LINEA ;

// Mostrar en pantalla
//envía a salida. Por ejemplo: mostrar "hola" ;P
impresion : MOSTRAR expresion FIN_LINEA ;


//Ampliación: bucle while
// while: evalúa condicion; si es verdadera, ejecuta bloque. Repite hasta que sea falsa
bucle: MIENTRAS condicion HACER FLECHA bloque TERMINAR;

//break y continue
control_bucle: ROMPER FIN_LINEA| CONTINUAR FIN_LINEA;

// Estructura condicional con posible "no ->"
//"condicion" es la parte booleana (comparacion entre dos expresiones)
//MARCA_COND es el ??? que separa la condicion del resto.
//SI FLECHA abre el bloque then (si ->)
//(NO FLECHA bloque)? es el else opcional (no ->)
//TERMINAR cierra el if (cadena "terminar")
condicional : condicion MARCA_COND SI FLECHA bloque (SI_NO FLECHA bloque)? TERMINAR;

// Bloque (permite anidar ya que permite un condicional dentro)
// Un bloque son cero o más elementos, para permitir cosas como:  a > 2 ???  si -> terminar
bloque: (sentencia | condicional)*;


//Ampliación: booleanos y expresiones complejas
// Condición = expresión booleana completa
// Dividida por prioridades
condicion : bool_o ;

// OR (menor precedencia)
//Una disyunción es una o más conjunciones separadas por OR
bool_o : bool_y (OR bool_y)* ;

// AND (precedencia intermedia)
//Una conjunción es una o más unidades booleanas separadas por AND
bool_y : bool_no (AND bool_no)* ;

// NOT y unidades (mayor precedencia; NOT se aplica antes que AND/OR. Por ejemplo, not a and b sería (not a) and b )
bool_no
  : NOT bool_no // negación
  | PAREN_ABRE condicion PAREN_CIERRA // paréntesis booleanos
  | comparacion // comparación aritmética
  | booleano // literales booleanos
  ;

// Comparaciones binarias entre expresiones aritméticas
comparacion : expresion operador_relacional expresion ;

// Literales booleanos
booleano : VERDADERO | FALSO ;

// Operadores relacionales
operador_relacional: IGUAL | DISTINTO | MENOR | MENOR_IGUAL | MAYOR | MAYOR_IGUAL;

// Expresiones de suma y resta
// Permite más de 2 operandos: termino (+|-) termino ...
expresion : termino ((SUMA | RESTA) termino)* ;

// Ampliación: multiplicación y división con mayor precedencia que +/-
termino : factor ((MULT | DIV) factor)* ;

// RESTA factor : signo menos unario (-a , -7 ...)
// PAREN_ABRE expresion PAREN_CIERRA : expresión aritmética entre paréntesis
// atomo: valor simple
factor : RESTA factor | PAREN_ABRE expresion PAREN_CIERRA | atomo ;

atomo : INT | FLOAT | STRING | ID ;