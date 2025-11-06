parser grammar Parser;
//definimos la gramtica del Parser

options { tokenVocab=Lexer; }
//cogemos las reglas producidas por el lexer

archivo : fila+ EOF;

    // Un archivo CSV esta formador por una o más filas
    // El lexer añade al final del archivo el toquen EOF
        //EOF = End Of File = fin del archivo


fila : campo (SEPARADOR campo)* SALTO_DE_LINEA;

    // Las filas estan formadas por un campo o un campor separador campo
    // Procesadores,del;lenguaje|pl1
    // Ademas acaban en saltos de linea \n


campo : TEXTO | STRING | ;

    // Un campo puede ser texto o una cadena entre comillas o estar vacio;

