.class public Ex12_CallWithMultipleParams
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 4 sitios en la pila para los dos operandos, el retorno y System.out
   .limit stack 4
   ; reservamos 3 variables locales (args y espacio para parámetros si hiciera falta)
   .limit locals 3

   ; cargamos los dos enteros a pasar como parámetros y llamamos a sum(II)I
   ldc 10
   ldc 20
   invokestatic Ex12_CallWithMultipleParams/sum(II)I

   ; preparamos la impresión del resultado
   getstatic java/lang/System/out Ljava/io/PrintStream;
   swap
   invokevirtual java/io/PrintStream/println(I)V

   ; cerrar main
   return
.end method

.method public static sum(II)I
   ; límite de pila para cargar los parámetros y sumar
   .limit stack 3
   ; reservamos 2 variables locales para los parámetros (index 0 y 1)
   .limit locals 2

   ; sumar los dos parámetros y retornar el resultado
   iload_0
   iload_1
   iadd
   ireturn
.end method
