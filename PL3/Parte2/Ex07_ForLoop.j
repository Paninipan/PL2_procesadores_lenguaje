.class public Ex07_ForLoop
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 3 sitios en la pila para operaciones y print
   .limit stack 3
   ; reservamos 2 variables locales: la 0 es args, la 1 será i
   .limit locals 2

   ; inicializar i = 1
   iconst_1
   istore_1
LOOP_START:
   ; cargar i y comparar con 5 (si i > 5 salir)
   iload_1
   ldc 5
   if_icmpgt LOOP_END

   ; imprimir i
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload_1
   invokevirtual java/io/PrintStream/println(I)V

   ; incrementar i (i++)
   iinc 1 1
   goto LOOP_START
LOOP_END:
   ; cerrar main
   return
.end method
