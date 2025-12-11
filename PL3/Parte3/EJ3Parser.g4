parser grammar EJ3Parser;

// cogemos las reglas producidas por el lexer
options { tokenVocab=EJ3Lexer; }

// Programa completo
programa
  : (sentencia | condicional)* EOF
  ;

// Sentencias simples
sentencia
  : declaracion
  | asignacion
  | impresion
  | bucle
  | control_bucle
  ;

// Declarar variable e inicializar
declaracion
  : ASIGNAR id=ID ASIGNACION valor=expr_general FIN_LINEA
  ;

// Asignación normal
asignacion
  : id=ID ASIGNACION valor=expr_general FIN_LINEA
  ;

// Mostrar en pantalla
impresion
  : MOSTRAR expr=expr_general FIN_LINEA
  ;

// bucle = while | for
bucle
  : bucle_mientras
  | bucle_para
  ;

// Bucle while
bucle_mientras
  : MIENTRAS cond=condicion HACER FLECHA cuerpo=bloque TERMINAR
  ;

// Bucle for:  para i desde 0 hasta 10 paso 2 hacer -> ... terminar
bucle_para
  : PARA var=ID DESDE inicio=expresion HASTA fin=expresion (PASO paso=expresion)? HACER FLECHA cuerpo=bloque TERMINAR
  ;

// break y continue
control_bucle
  : ROMPER FIN_LINEA
  | CONTINUAR FIN_LINEA
  ;

// Estructura condicional
condicional
  : cond=condicion MARCA_COND SI FLECHA thenBlock=bloque (SI_NO FLECHA elseBlock=bloque)? TERMINAR
  ;

// Bloque (permite anidar if/bucles)
bloque
  : (sentencia | condicional)*
  ;

// =====================
// EXPRESIONES BOOLEANAS
// =====================

condicion
  : raiz=bool_o
  ;

// OR (menor precedencia)
bool_o
  : left=bool_y (ops+=OR rights+=bool_y)*   #BoolOr
  ;

// AND (precedencia intermedia)
bool_y
  : left=bool_no (ops+=AND rights+=bool_no)* #BoolAnd
  ;

// NOT y unidades (mayor precedencia)
bool_no
  : NOT negado=bool_no                       #BoolNot
  | PAREN_ABRE inner=condicion PAREN_CIERRA  #BoolParen
  | comp=comparacion                         #BoolComp
  | bool=booleano                            #BoolAtom
  ;

// Operando de comparación: expresión aritmética o booleano
operando_cmp
  : expr=expresion
  | bool=booleano
  ;

// Comparaciones binarias
comparacion
  : left=operando_cmp op=operador_relacional right=operando_cmp
  ;

booleano
  : VERDADERO
  | FALSO
  | id=ID
  ;

operador_relacional
  : IGUAL
  | DISTINTO
  | MENOR
  | MENOR_IGUAL
  | MAYOR
  | MAYOR_IGUAL
  ;

// =====================
// EXPRESIONES ARITMÉTICAS
// =====================

expresion
  : left=termino (ops+=(SUMA | RESTA) rights+=termino)*   #ExprSumRes
  ;

termino
  : left=potencia (ops+=(MULT | DIV | MOD) rights+=potencia)* #ExprMulDivMod
  ;

potencia
  : base=factor (POT exp=potencia)?                       #ExprPow
  ;

factor
  : RESTA neg=factor                                      #ExprNeg
  | PAREN_ABRE inner=expresion PAREN_CIERRA               #ExprParen
  | atom=atomo                                            #ExprAtom
  ;

atomo
  : intLit=INT
  | floatLit=FLOAT
  | strLit=STRING
  | id=ID
  ;

// Expresión general (puede ser aritmética o booleana)
expr_general
  : arith=expresion   #ExprGeneralArith
  | bool=condicion    #ExprGeneralBool
  ;
