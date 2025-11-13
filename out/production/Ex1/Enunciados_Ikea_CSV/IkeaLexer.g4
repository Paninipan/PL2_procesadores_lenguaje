lexer grammar IkeaLexer;
//definimos la gramtica del Lexer

// Palabras clave de estructura
INICIO_MONTAJE : 'INICIO_MONTAJE';
FIN : 'FIN';
COMO: 'COMO';
EXTENSION_DE : 'EXTENSION_DE';

// Verbos de montaje (acciones)
INSERTAR : 'INSERTAR';
UNIR : 'UNIR';
FIJAR : 'FIJAR';
MARTILLAR : 'MARTILLAR';
COLOCAR : 'COLOCAR';
GIRAR : 'GIRAR';
CONECTAR : 'CONECTAR';
MARCAR_PARED : 'MARCAR_PARED';
NIVELAR : 'NIVELAR';
FIJAR_PARED : 'FIJAR_PARED';

// Conectores / preposiciones ????????????????????????????
EN : 'EN';
CON : 'CON';
Y : 'Y';
A : 'A';
SOBRE : 'SOBRE';
DE: 'DE';

// Entidades (piezas / muebles / herramientas / orientaciones)
MUEBLE : 'MUEBLE';
ID_PIEZA: 'PIEZA' | 'PANEL' | 'BALDA' | 'ESTANTE' ;
ESTE_MODULO : 'ESTE_MODULO';
OPCIONAL : 'OPCIONAL';

// Herramientas conocidas
ID_HERRAMIENTA: 'DESTORNILLADOR' | 'MARTILLO' | 'LLAVE_ALLEN' | 'NIVEL' | 'LAPIZ' | 'TALADRO' ;
ID_MUEBLE: 'MUEBLE' ;

// Orientaciones
ORIENTACION: 'VERTICAL' | 'HORIZONTAL' | 'VOLTEAR' | 'ABAJO' | 'IZQUIERDA' | 'DERECHA' ; ////////////////////////////

// Posiciones / modif. espaciales
ID_POSICION: 'PARTE_SUPERIOR' | 'PARTE_INFERIOR' | 'LATERAL_IZQUIERDO' | 'LATERAL_DERECHO' | 'CENTRO' ;
DEJAR_ESPACIO  : 'DEJAR_ESPACIO'; ////////////////////////////
JUNTO_A : 'JUNTO_A'; ////////////////////////////

// Unidades de medida
UD_MEDIDA : 'CM' |'MM' | 'DISTANCIA_PIEZA'; ////////////////////////////pulñgadas?

// Símbolos y separadores de pasos
GUION : '-';
PUNTOYCOMA : ';';
PUNTO : '.';
PAREN_ABRE : '(';
PAREN_CIERRA : ')';
COMA : ',';

// Literales y nombres

// Valores numéricos y separadores
// Números (pasos, cantidades, IDs de herraje, etc.)
PASO: DIGITO+;
CANTIDAD: DIGITO+;
MEDIDA : DIGITO+(.DIGITO+)?; //medida
ID_HERRAJE: DIGITO+ | 'TORNILLO_PARED' | 'TACO_PARED' ;

// Nombres genéricos en mayusculas con guiones (p.ej. TACO_PARED, TORNILLO_PARED)
// Van después de las palabras clave para no colisionar
MAYUS_NOMBRE : MAYUS+ ('_' MAYUS+)*;

// Nombres de piezas/etiquetas libres (por ejemplo, lateral_izq, trasero, moduloA)
NOMBRE : LETRA_INI+;

// Espacios y comentarios
COMENTARIO : '#' ~[\r\n]* -> skip;
ESPACIO : [\t\r\n]+ -> skip;


// Fragmentos (no crean tokens)
fragment DIGITO : [0-9];
fragment MAYUS : [A-ZÁÉÍÓÚÜÑÅÄÖ];   // mayúsculas con acentos, Ñ y letras especiales que e usan mucho en IKEA
fragment LETRA_INI : [a-zA-Z_áéíóúÁÉÍÓÚüÜñÑ];
