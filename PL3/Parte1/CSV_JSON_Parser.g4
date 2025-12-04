parser grammar CSV_JSON_Parser;
//definimos la gramtica del Parser

options { tokenVocab=CSV_JSON_Lexer; }
//cogemos las reglas producidas por el lexer

// Un archivo CSV: una o más filas, y luego EOF
archivo: filas EOF;

// Conjunto de filas, separadas por saltos de línea.
// El último salto de línea es opcional.
filas: fila (SALTO_DE_LINEA fila)* (SALTO_DE_LINEA)?;

// Una fila: campos separados por separadores.
// Permitimos campos vacíos con campo?.
fila: campo? (SEPARADOR campo?)*;



campo : TEXTO | STRING;

    // Un campo puede ser texto o una cadena entre comillas;

