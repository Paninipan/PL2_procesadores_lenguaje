parser grammar IkeaParser;
//definimos la gramática del Parser

options { tokenVocab=IkeaLexer; }
//cogemos las reglas producidas por el lexer

// Estructura principal: Declaración de inicio, secuencia de pasos y fin.
programa: declaracion_inicio (paso|comentario)+ declaracion_fin EOF;

// 1. Declaración de inicio de montaje
declaracion_inicio: INICIO_MONTAJE NOMBRE? NUMERO (COMO EXTENSION_DE mueble_referencia)? PUNTO ;

// 2. Definición del final del montaje
declaracion_fin: FIN PUNTO ;

// 3. Un paso de montaje: Número, guion, una o más acciones, y un punto.
paso: NUMERO GUION accion (PUNTOYCOMA accion)* PUNTO ;

//comentario para especificar detalles en lenguaje natural
comentario: CUIDADO ANUNCIO;

// 4. Bloque de Acciones (Los 10 verbos)
accion:
    // Acciones de Ensamblaje Básico
    INSERTAR herraje_lista EN (pieza|mueble_referencia) (Y pieza)* (CON herramienta_lista)?
  | UNIR (pieza|mueble_referencia) (Y (pieza))+ (distancia|posicion)*
  | MARTILLAR herraje_lista SOBRE pieza (Y pieza)* (distancia|posicion)* (CON herramienta_lista)?

    // Acciones de Posición y Espacio
  | COLOCAR NUMERO? pieza (distancia|posicion)*
  | GIRAR (EN | HACIA)? ORIENTACION

    // Acciones de Modularidad y Conexión
  | CONECTAR mueble_referencia A mueble_referencia CON herraje_lista (distancia|posicion)* (CON herramienta_lista)?

    // Acciones de Preparación y Seguridad (Pared)
  | MARCAR (PARA)? (pieza)? (distancia|posicion)* (CON herramienta_lista)? //para pieza o con pieza?
  | NIVELAR (pieza | mueble_referencia) (CON herramienta_lista)?
  | FIJAR (PAREN_ABRE OPCIONAL PAREN_CIERRA)? CON? herraje_lista (CON herramienta_lista)?
  ;

// Unidades reutilizables
pieza: PIEZA ((PAREN_ABRE (NOMBRE|NOMBRE? NUMERO)PAREN_CIERRA)|NOMBRE)? ; //por ejemplo PIEZA (4), PIEZA (tabla_derecha), PIEZA (BALDA 3) o PIEZA fondo

mueble_referencia: MUEBLE id? ;
id: NOMBRE? PAREN_ABRE NUMERO PAREN_CIERRA ;

herramienta: HERRAMIENTA TIPOHERRAMIENTA (PAREN_ABRE NUMERO PAREN_CIERRA)? ;
herramienta_lista: herramienta (Y herramienta)* ;

herraje_lista: NUMERO id_herraje (Y NUMERO id_herraje)* ; //NUMERO id_herraje puede ser ctd TORNILLO ...
id_herraje: HERRAJE TIPOHERRAJE; //id numérico del herraje (de IKEA) o su tipo

distancia: A NUMERO UD_MEDIDA ((DE BORDE)? DE (pieza|mueble_referencia))? ;
posicion: (EN (ORIENTACION | POSICION) (DE (mueble_referencia|pieza) )? )| JUNTO_A (mueble_referencia|pieza) | SOBRE (mueble_referencia|pieza) ;
