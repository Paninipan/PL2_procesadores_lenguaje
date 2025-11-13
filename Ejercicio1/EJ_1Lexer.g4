lexer grammar EJ_1Lexer;
//definimos la gramtica del Lexer

TEXTO : ~[,;|\n"]+ ;
    //:~[A] si no esta dentro de los valores A, estos cuales son prohibidos
        //separadores , ; |
        //salto de lienas \n
        //cadenas de texto entre comillas "xxx"
    //debe aparecer 1 vez o mas caracteres seguidos cadena vacia no es nada


STRING : '"'('""'| ~'"' )*'"';
    // Cominza con el caracter ' ' comillas "
    // ('""'| ~'"' ) entre las comillas hay texto.
        // Puede haber o no comillas entre medias del String ' "" '
        // o |
        // Lo no que sean ~ comillas ' " ', es decir letras o números
    // Esta regla se puede dar 0+ vecer
    // Termian con el caracter ' ' comillas "


SEPARADOR :[,;|] ;
    //los saparadores son aquellos que diferencian las cadenas del CSV , ; o |
    //:[B] si esta dentro de los valores B, estos cuales son válidos


SALTO_DE_LINEA:'\n';
    //el salto de linea para pasar a otra coluna nueva


ESPACIO : [ \t]+ -> skip ;
    //Si hay algún espacio o tabulaciones. ' '\t
        // el espacio normal se pone como un espacio normal
    //Puede haber mas de uno, entoces no hace nada
