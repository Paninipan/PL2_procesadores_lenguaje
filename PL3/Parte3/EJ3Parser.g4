parser grammar EJ3Parser;
//definimos la gramtica del Parser

options { tokenVocab=EJ3Lexer; }
//cogemos las reglas producidas por el lexer

// Programa completo
//Acepta cero o mas elementos, donde cada uno puede ser una sentencia simple o un condicional
//Termina en un EOF (end of line)
programa : (sentencia | condicional)* EOF ;

// Sentencias simples:
//declaracion (asignar x = expr_gen ;P)
//asignacion (x = expr_gen ;P)
//impresion (mostrar expr_gen ;P)
//bucles while y for ("mientras")
//control_bucle para break y continue
sentencia : declaracion | asignacion | impresion | bucle | control_bucle;

// Declarar variable e inicializar
// Exige la palabra clave asignar para inicializar una variable. Por ejemplo: asignar a =20 ;P  o   asignar a= A OR B ;P
declaracion : ASIGNAR ID ASIGNACION expr_general FIN_LINEA ;

// Asignación normal
// Reasigna una variable ya existente. Por ejemplo: a= a+1 ;P.
asignacion : ID ASIGNACION expr_general FIN_LINEA ;

// Mostrar en pantalla
//envía a salida. Por ejemplo: mostrar "hola" ;P
impresion : MOSTRAR expr_general FIN_LINEA ;


// bucle = while | for
bucle: bucle_mientras | bucle_para ;

// Ampliación 3: Bucle while
// while: evalúa condicion; si es verdadera, ejecuta bloque. Repite hasta que sea falsa
bucle_mientras : MIENTRAS condicion HACER FLECHA bloque TERMINAR ;

// Ampliación 4: bucle for tipo "para i desde 0 hasta 10 paso 2 hacer -> ... terminar"
// Recorrido entero inclusivo [inicio, fin] con paso implícito (+1) o definido
bucle_para : PARA ID DESDE expresion HASTA expresion (PASO expresion)? HACER FLECHA bloque TERMINAR ;

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


// Operando de comparación: puede ser expresión aritmética o booleano. Para permitir True==False o similares
operando_cmp: expresion | booleano;

// Comparaciones binarias entre expresiones aritméticas
comparacion : operando_cmp operador_relacional operando_cmp ;

// booleanos. Se permiten Verdadero, falso o ID (variables booleanas)
booleano : VERDADERO | FALSO | ID;

// Operadores relacionales
operador_relacional: IGUAL | DISTINTO | MENOR | MENOR_IGUAL | MAYOR | MAYOR_IGUAL;

// Expresiones de suma y resta
// Permite más de 2 operandos: termino (+|-) termino ...
expresion : (termino ((SUMA | RESTA) termino)*) ;

// Ampliación: multiplicación y división con mayor precedencia que +/-
termino : factor ((MULT | DIV) factor)* ;

// RESTA factor : signo menos unario (-a , -7 ...)
// PAREN_ABRE expresion PAREN_CIERRA : expresión aritmética entre paréntesis
// atomo: valor simple
factor : RESTA factor | PAREN_ABRE expresion PAREN_CIERRA | atomo ;

atomo : INT | FLOAT | STRING | ID ;

//Expresión general
expr_general
  : expresion   // aritmética
  | condicion   // booleana
  ;