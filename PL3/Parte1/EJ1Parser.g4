parser grammar EJ1Parser;
//definimos la gramtica del Parser

options { tokenVocab=EJ1Lexer; }
//cogemos las reglas producidas por el lexer

// Un archivo CSV: una o más filas, y luego EOF
archivo: lines=filas EOF;

// Conjunto de filas, separadas por saltos de línea.
// El último salto de línea es opcional.
filas: lftln=fila (SALTO_DE_LINEA ln=fila)* (SALTO_DE_LINEA)?     #JsonArch;

// Una fila: campos separados por separadores.
// Permitimos campos vacíos con campo?.
fila: campo? (SEPARADOR campo?)*                                  #JsonLine;


campo : txtLit=TEXTO | strLit=STRING; // Un campo puede ser texto o una cadena entre comillas;


