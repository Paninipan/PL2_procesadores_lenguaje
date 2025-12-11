parser grammar EJ3Parser;
//definimos la gramtica del Parser

options { tokenVocab=EJ3Lexer; }
//cogemos las reglas producidas por el lexer

// Programa completo
//Acepta cero o mas elementos, donde cada uno puede ser una sentencia simple o un condicional
//Termina en un EOF (end of line)
programa
  : (sentencia | condicional)* EOF
  ;

// Sentencias simples:
//declaracion (asignar x = expr_gen ;P)
//asignacion (x = expr_gen ;P)
//impresion (mostrar expr_gen ;P)
//bucles while y for ("mientras")
//control_bucle para break y continue
sentencia
  : declaracion
  | asignacion
  | impresion
  | bucle
  | control_bucle
  ;

// Declarar variable e inicializar
// Exige la palabra clave asignar para inicializar una variable. Por ejemplo: asignar a =20 ;P  o   asignar a= A OR B ;P
declaracion
  : ASIGNAR id=ID ASIGNACION valor=expr_general FIN_LINEA
  ;

// Asignación normal
// Reasigna una variable ya existente. Por ejemplo: a= a+1 ;P.
asignacion
  : id=ID ASIGNACION valor=expr_general FIN_LINEA
  ;

// Mostrar en pantalla
//envía a salida. Por ejemplo: mostrar "hola" ;P
impresion
  : MOSTRAR expr=expr_general FIN_LINEA
  ;

// bucle = while | for
bucle
  : bucle_mientras
  | bucle_para
  ;

// Ampliación 3: Bucle while
// while: evalúa condicion; si es verdadera, ejecuta bloque. Repite hasta que sea falsa
bucle_mientras
  : MIENTRAS cond=condicion HACER FLECHA cuerpo=bloque TERMINAR
  ;

// Ampliación 4: bucle for tipo "para i desde 0 hasta 10 paso 2 hacer -> ... terminar"
// Recorrido entero inclusivo [inicio, fin] con paso implícito (+1) o definido
bucle_para
  : PARA var=ID DESDE inicio=expresion HASTA fin=expresion (PASO paso=expresion)? HACER FLECHA cuerpo=bloque TERMINAR
  ;

//break y continue
control_bucle
  : ROMPER FIN_LINEA
  | CONTINUAR FIN_LINEA
  ;

// Estructura condicional con posible "no ->"
//"condicion" es la parte booleana (comparacion entre dos expresiones)
//MARCA_COND es el ??? que separa la condicion del resto.
//SI FLECHA abre el bloque then (si ->)
//(NO FLECHA bloque)? es el else opcional (no ->)
//TERMINAR cierra el if (cadena "terminar")
condicional
  : cond=condicion MARCA_COND SI FLECHA thenBlock=bloque (SI_NO FLECHA elseBlock=bloque)? TERMINAR
  ;

// Bloque (permite anidar ya que permite un condicional dentro)
// Un bloque son cero o más elementos, para permitir cosas como:  a > 2 ???  si -> terminar
bloque
  : (sentencia | condicional)*
  ;

//Ampliación: booleanos y expresiones complejas
// Condición = expresión booleana completa
// Dividida por prioridades
condicion
  : raiz=bool_o
  ;

// OR (menor precedencia)
//Una disyunción es una o más conjunciones separadas por OR
bool_o
  : left=bool_y (ops+=OR rights+=bool_y)*
  ;

// AND (precedencia intermedia)
//Una conjunción es una o más unidades booleanas separadas por AND
bool_y
  : left=bool_no (ops+=AND rights+=bool_no)*
  ;

// NOT y unidades (mayor precedencia; NOT se aplica antes que AND/OR. Por ejemplo, not a and b sería (not a) and b )
bool_no
  : NOT negado=bool_no                 // negación
  | PAREN_ABRE inner=condicion PAREN_CIERRA // paréntesis booleanos
  | comp=comparacion                   // comparación aritmética
  | bool=booleano                      // literales booleanos
  ;

// Operando de comparación: puede ser expresión aritmética o booleano. Para permitir True==False o similares
operando_cmp
  : expr=expresion
  | bool=booleano
  ;

// Comparaciones binarias entre expresiones aritméticas
comparacion
  : left=operando_cmp op=operador_relacional right=operando_cmp
  ;

// booleanos. Se permiten Verdadero, falso o ID (variables booleanas)
booleano
  : VERDADERO
  | FALSO
  | id=ID
  ;

// Operadores relacionales
operador_relacional
  : IGUAL
  | DISTINTO
  | MENOR
  | MENOR_IGUAL
  | MAYOR
  | MAYOR_IGUAL
  ;

// Expresiones de suma y resta
// Permite más de 2 operandos: termino (+|-) termino ...
expresion
  : left=termino (ops+=(SUMA | RESTA) rights+=termino)*
  ;

// Ampliación: multiplicación, división y mod con mayor precedencia que +/-. Potencia con mayor prioridad
termino
  : left=potencia (ops+=(MULT | DIV | MOD) rights+=potencia)*
  ;

potencia
  : base=factor (POT exp=potencia)?
  ;

// RESTA factor : signo menos unario (-a , -7 ...)
// PAREN_ABRE expresion PAREN_CIERRA : expresión aritmética entre paréntesis
// atomo: valor simple
factor
  : RESTA neg=factor
  | PAREN_ABRE inner=expresion PAREN_CIERRA
  | atom=atomo
  ;

atomo
  : intLit=INT
  | floatLit=FLOAT
  | strLit=STRING
  | id=ID
  ;

//Expresión general
expr_general
  : arith=expresion   // aritmética
  | bool=condicion    // booleana
  ;
