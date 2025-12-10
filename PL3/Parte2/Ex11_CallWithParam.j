.class public Ex11_CallWithParam
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 3 sitios en la pila para el argumento, el retorno y System.out
   .limit stack 3
   ; reservamos 2 variables locales (args y espacio para parámetros si hiciera falta)
   .limit locals 2

   ; cargamos el entero 7 como argumento y llamamos a inc(I) que devuelve I
   ldc 7
   invokestatic Ex11_CallWithParam/inc(I)I

   ; imprimimos el resultado: ponemos System.out y colocamos el int encima
   getstatic java/lang/System/out Ljava/io/PrintStream;
   swap
   invokevirtual java/io/PrintStream/println(I)V

   ; cerrar main
   return
.end method

.method public static inc(I)I
   ; límite de pila para cargar el parámetro y sumar
   .limit stack 2
   ; una variable local para el parámetro (index 0)
   .limit locals 1

   ; cargar el parámetro recibido (iload_0), sumar 1 y retornar
   iload_0
   iconst_1
   iadd
   ireturn
.end method
