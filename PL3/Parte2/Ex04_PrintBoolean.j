.class public Ex04_PrintBoolean
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 3 sitios en la pila: operandos y PrintStream/boolean temporal
   .limit stack 3
   ; reservamos 1 variable local (no usada)
   .limit locals 1

   ; calcular la comparación 5 > 3
   ldc 5
   ldc 3
   ; si 5 <= 3 saltar a falso
   if_icmple LFALSE
   ; si llega aquí, la condición es verdadera -> empujar true (1)
   iconst_1
   goto LEND
LFALSE:
   ; condición falsa -> empujar false (0)
   iconst_0
LEND:
   ; ponemos System.out en la pila y colocamos el boolean encima (se usa swap)
   getstatic java/lang/System/out Ljava/io/PrintStream;
   swap
   ; imprimimos el valor booleano con println(Z)
   invokevirtual java/io/PrintStream/println(Z)V

   ; cerrar main
   return
.end method
