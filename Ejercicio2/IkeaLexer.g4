lexer grammar IkeaLexer;
//definimos la gramtica del Lexer

// Palabras clave de estructura
INICIO_MONTAJE : 'INICIO_MONTAJE';
FIN : 'FIN';
COMO: 'COMO';
EXTENSION_DE : 'EXTENSION_DE';

// Verbos de montaje (acciones)
INSERTAR : 'INSERTAR'| 'MARTILLAR';
UNIR : 'UNIR';
COLOCAR : 'COLOCAR';
GIRAR : 'GIRAR';
CONECTAR : 'CONECTAR';
MARCAR : 'MARCAR'('_PARED')?;
NIVELAR : 'NIVELAR';
FIJAR : 'FIJAR'('_PARED')?;

// Conectores / preposiciones
EN : 'EN';
PARA : 'PARA';
CON : 'CON' | 'USANDO';
Y : 'Y';
A : 'A';
SOBRE : 'SOBRE';
BAJO : 'BAJO';
DE: 'DE';
HACIA: 'HACIA';

// Entidades (piezas / muebles / herramientas / orientaciones)
MUEBLE : 'MUEBLE';
HERRAMIENTA : 'HERRAMIENTA'-> pushMode(modoHerramienta);
HERRAJE : ('HERRAJE''S'?)-> pushMode(modoHerraje);
PIEZA: 'PIEZA';
OPCIONAL : 'OPCIONAL';


// Orientaciones y Posiciones / modif. espaciales
ORIENTACION: 'VERTICAL' | 'HORIZONTAL' | 'HORARIO' | 'ANTIHORARIO';
POSICION: 'PARTE_SUPERIOR' | 'PARTE_INFERIOR' | 'PARTE_TRASERA'|
'PARTE_FRONTAL' |'LADO_IZQUIERDO' | 'LADO_DERECHO'| 'CENTRO'| 'JUNTA'| 'BORDE';
JUNTO_A : 'JUNTO_A';

// Unidades de medida
UD_MEDIDA : 'CM' | 'MM' | 'DISTANCIA_PIEZA';

// Símbolos y separadores de pasos
GUION : '-';
PUNTOYCOMA : ';';
PUNTO : '.';
PAREN_ABRE : '(';
PAREN_CIERRA : ')';
COMA : ',';


//comentario de alerta
CUIDADO: ('CUIDADO'|'ATENCION'|'IMPORTANTE')?'!'+ ':' ->pushMode(modoAnuncio); //ejemplo: ATENCION!!!: si no lo fijas te puedes hacer daño

// Literales y nombres

// Valores numéricos y separadores
// Números (pasos, cantidades, etc.)
NUMERO: DIGITO+;
MEDIDA : DIGITO+('.'DIGITO+)?; //medida


// Nombres genéricos en mayusculas con guiones
// Van después de las palabras clave para no colisionar

// Nombres de piezas/muebles/etiquetas libres (por ejemplo, lateral_izq, trasero, BILLY, moduloA)
NOMBRE : LETRA+;

// Espacios y comentarios
COMENTARIO : '#' ~[\r\n]* -> skip;
ESPACIO : [ \t\r\n]+ -> skip;

mode modoHerramienta;
ESPACIOHERRAMIENTA: ESPACIO -> skip;
TIPOHERRAMIENTA : (LETRA+ ('_' LETRA+)*) -> popMode;
//HERRAMIENTA: 'DESTORNILLADOR' | 'MARTILLO' | 'LLAVE_ALLEN' | 'NIVEL' | 'LAPIZ' | 'TALADRO' ;

mode modoHerraje;
ESPACIOHERRAJE: ESPACIO -> skip;
TIPOHERRAJE: (DIGITO+  | LETRA+('_' LETRA+)*)-> popMode; //'TORNILLO' | 'TORNILLO_PARED' | 'TACO' / '10291' ;

mode modoAnuncio;
ESPACIOANUNCIO: ESPACIO -> skip;
ANUNCIO: (~[\r\n]* .)-> popMode;



// Fragmentos (no crean tokens)
fragment DIGITO : [0-9];
fragment LETRA : [a-zA-Z_áéíóúÁÉÍÓÚüÜñÑÅÄÖ];


