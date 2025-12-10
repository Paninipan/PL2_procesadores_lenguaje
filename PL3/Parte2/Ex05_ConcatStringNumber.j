.class public Ex05_ConcatStringNumber
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 4 sitios en la pila para el StringBuilder, la cadena y el número
   .limit stack 4
   ; reservamos 2 variables locales (no usadas aquí)
   .limit locals 2

   ; construir un StringBuilder para concatenar cadena + número
   new java/lang/StringBuilder
   dup
   invokespecial java/lang/StringBuilder/<init>()V

   ; añadimos la cadena "La suma es: "
   ldc "La suma es: "
   invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;

   ; añadimos el entero 42 al StringBuilder
   ldc 42
   invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;

   ; convertimos el StringBuilder a String
   invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;

   ; ponemos System.out y colocamos la cadena encima antes de llamar println
   getstatic java/lang/System/out Ljava/io/PrintStream;
   swap
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

   ; cerrar main
   return
.end method
