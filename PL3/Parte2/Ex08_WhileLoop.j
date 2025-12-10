.class public Ex08_WhileLoop
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 3 sitios en la pila: para PrintStream y el entero a imprimir
   .limit stack 3
   ; reservamos 2 variables locales: args y n (contador)
   .limit locals 2

   ; inicializar n = 3 (contador)
   ldc 3
   istore_1
WHILE_START:
   ; comprobar condición while (mientras n > 0)
   iload_1
   ifle WHILE_END

   ; imprimir n
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload_1
   invokevirtual java/io/PrintStream/println(I)V

   ; decrementar contador (n--)
   iinc 1 -1
   goto WHILE_START
WHILE_END:
   ; cerrar main
   return
.end method
