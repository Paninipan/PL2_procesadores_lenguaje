lexer grammar CSVLexer;
//definimos la gramática del Lexer

TEXTO : ~[,;|\r\n"]+ ;
    //:~[A] si no esta dentro de los valores A, los cuales son prohibidos
        //separadores , ; |
        //salto de líneas \n
        //cadenas de texto entre comillas "xxx"
    //debe aparecer 1 vez o mas caracteres seguidos cadena vacía no es nada


STRING : '"'('""'| ~'"' )*'"';
    // Comienza con el caracter ' ' comillas "
    // ('""'| ~'"' ) entre las comillas hay texto.
        // Puede haber o no comillas entre medias del String ' "" '
        // o |
        // Lo no que sean ~ comillas ' " ', es decir letras o números
    // Esta regla se puede dar 0+ vecer
    // Termian con el caracter ' ' comillas "


SEPARADOR :[,;|] ;
    //los separadores son aquellos que diferencian las cadenas del CSV , ; o |
    //:[B] si esta dentro de los valores B, estos cuales son válidos


SALTO_DE_LINEA : '\r'? '\n' ; // o '\r\n' | '\n'
    //el salto de linea para pasar a otra columna nueva


ESPACIO : [ \t]+ -> skip ;
    //Si hay algún espacio o tabulaciones. ' '\t
        // el espacio normal se pone como un espacio normal
    //Puede haber mas de uno, entoces no hace nada
