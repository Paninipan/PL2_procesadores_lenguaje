parser grammar IkeaParser;
//definimos la gramática del Parser

options { tokenVocab=IkeaLexer; }
//cogemos las reglas producidas por el lexer

// Estructura principal: Declaración de inicio, secuencia de pasos y fin.
programa: declaracion_inicio (paso)+ declaracion_fin EOF;

// 1. Declaración de inicio de montaje
declaracion_inicio: INICIO_MONTAJE MAYUS_NOMBRE? NUMERO (COMO EXTENSION_DE mueble_referencia)? PUNTO ;

// 2. Definición del final del montaje
declaracion_fin: FIN PUNTO ;

// 3. Un paso de montaje: Número, guion, una o más acciones, y un punto.
paso: NUMERO GUION accion (PUNTOYCOMA accion)* PUNTO ;

// 4. Bloque de Acciones (Los 10 verbos)
accion:
    // Acciones de Ensamblaje Básico
    INSERTAR herraje_lista EN pieza
  | UNIR pieza (Y pieza)+
  | FIJAR herraje_lista CON herramienta
  | MARTILLAR herraje_lista SOBRE pieza CON herramienta
    // Acciones de Posición y Espacio
  | COLOCAR NUMERO? pieza (mod_espacio)? (EN posicion)?
  | GIRAR ORIENTACION
    // Acciones de Modularidad y Conexión
  | CONECTAR ESTE_MODULO A mueble_referencia CON herraje_lista
    // Acciones de Preparación y Seguridad (Pared)
  | MARCAR_PARED CON pieza (CON herramienta)?
  | NIVELAR (pieza | MUEBLE) CON herramienta
  | FIJAR_PARED (PAREN_ABRE OPCIONAL PAREN_CIERRA)? CON herraje_lista
  ;

// Unidades reutilizables
pieza: TIPO_PIEZA (PAREN_ABRE (NUMERO | NOMBRE) PAREN_CIERRA | NOMBRE)? ; //por ejemplo PIEZA (4), PIEZA (tabla_izq) o PIEZA fondo

mueble_referencia: MUEBLE id ;
id: MAYUS_NOMBRE? PAREN_ABRE NUMERO PAREN_CIERRA ;

herramienta: HERRAMIENTA (PAREN_ABRE NUMERO PAREN_CIERRA)? ;

herraje_lista: NUMERO id_herraje (Y NUMERO id_herraje)* ;
id_herraje: NUMERO | HERRAJE ; //id numérico del herraje (de IKEA) o su tipo

posicion: ORIENTACION | ID_POSICION | JUNTO_A mueble_referencia | SOBRE mueble_referencia ;
mod_espacio: DEJAR_ESPACIO NUMERO UD_MEDIDA ;
