.class public Ex02_PrintString
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 2 sitios en la pila: uno para PrintStream y otro para la cadena
   .limit stack 2
   ; reservamos 1 variable local (no usada aquí)
   .limit locals 1

   ; ponemos java.lang.System.out (objeto PrintStream) en la pila
   getstatic java/lang/System/out Ljava/io/PrintStream;

   ; cargamos la cadena a imprimir en la pila
   ldc "Hola desde Jasmin"

   ; invocamos println con la cadena (PrintStream, String) -> void
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

   ; y cerramos el main
   return
.end method
