.class public Ex03_Multiply
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 4 sitios en la pila (para PrintStream y dos operandos y resultado)
   .limit stack 4
   ; reservamos 1 variable local (no usada aquí)
   .limit locals 1

   ; ponemos System.out en la pila para preparar la impresión
   getstatic java/lang/System/out Ljava/io/PrintStream;

   ; cargamos los operandos enteros en la pila: 6 y 7
   ldc 6
   ldc 7
   ldc 7

   ; multiplicamos los dos valores en la pila (6 * 7)
   imul
   imul

   ; invocamos println(I) para imprimir el entero resultante
   invokevirtual java/io/PrintStream/println(I)V

   ; cerrar main
   return
.end method
