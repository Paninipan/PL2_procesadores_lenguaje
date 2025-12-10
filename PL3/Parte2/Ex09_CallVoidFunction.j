.class public Ex09_CallVoidFunction
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 2 sitios en la pila para la llamada al método
   .limit stack 2
   ; reservamos 1 variable local (args)
   .limit locals 1

   ; llamamos al método estático greet() que no devuelve valor
   invokestatic Ex09_CallVoidFunction/greet()V
   ; cerrar main
   return
.end method

.method public static greet()V
   ; limite de pila para ejecutar println dentro de la función
   .limit stack 2
   ; no usamos variables locales en esta función
   .limit locals 0

   ; dentro de greet: obtener System.out y cargar la cadena
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Hola desde la función"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   ; retornar void
   return
.end method
