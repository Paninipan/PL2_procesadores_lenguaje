parser grammar IkeaParser;
//definimos la gramtica del Parser

options { tokenVocab=IkeaLexer; }
//cogemos las reglas producidas por el lexer

// Estructura principal: Declaración de inicio, secuencia de pasos y fin.
programa: declaracion_inicio (paso)+ declaracion_fin EOF;

// 1. Declaración de inicio de montaje (maneja modularidad)
declaracion_inicio:
    'INICIO_MONTAJE' ID ('COMO' 'EXTENSION_DE' mueble_referencia)? PUNTO
    ;

// 2. Definición del final del montaje
declaracion_fin: 'FIN' PUNTO ;

// 3. Un paso de montaje: Número, guion, una o más acciones, y un punto.
paso:     PASO DASH accion (SEMI accion)* PUNTO ;

// 4. Bloque de Acciones (Los 10 verbos)
accion:
    // Acciones de Ensamblaje Básico
    'INSERTAR' CANTIDAD herraje_id 'EN' pieza
  | 'UNIR' pieza ('Y' pieza)+
  | 'FIJAR' CANTIDAD herraje_id 'CON' herramienta
  | 'MARTILLAR' CANTIDAD herraje_id 'SOBRE' pieza 'CON' 'MARTILLO'
    // Acciones de Posición y Espacio
  | 'COLOCAR' CANTIDAD pieza (MODIFICADOR_ESPACIO)? ('EN' posicion)?
  | 'GIRAR' ORIENTACION
    // Acciones de Modularidad y Conexión
  | 'CONECTAR' 'ESTE_MODULO' 'A' mueble_referencia 'CON' herraje_lista
    // Acciones de Preparación y Seguridad (Pared)
  | 'MARCAR_PARED' 'CON' pieza ('CON' herramienta)?
  | 'NIVELAR' (pieza | 'MUEBLE') ('CON' 'NIVEL')?
  | 'FIJAR_PARED' LPAREN 'OPCIONAL' RPAREN? 'CON' herraje_lista
  ;

// --- Unidades reutilizables ---
pieza:      ID_PIEZA LPAREN ID RPAREN ;
mueble_referencia: ID_MUEBLE LPAREN ID RPAREN ;
herramienta:ID_HERRAMIENTA (LPAREN ID RPAREN)? ;
herraje_id: ID_HERRAJE;
herraje_lista: (CANTIDAD herraje_id) ('Y' CANTIDAD herraje_id)* ;
posicion: ORIENTACION | ID_POSICION | 'JUNTO_A' mueble_referencia | 'SOBRE' mueble_referencia ;
