.class public Ex10_CallReturnInt
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 2 sitios en la pila: para el entero retornado y System.out
   .limit stack 2
   ; reservamos 1 variable local (args)
   .limit locals 1

   ; invocamos el método que devuelve un int en la pila
   invokestatic Ex10_CallReturnInt/getValue()I

   ; preparamos la impresión: obtenemos System.out y colocamos el int encima
   getstatic java/lang/System/out Ljava/io/PrintStream;
   swap
   invokevirtual java/io/PrintStream/println(I)V

   ; cerrar main
   return
.end method

.method public static getValue()I
   ; límite de pila para cargar el entero y retornarlo
   .limit stack 2
   ; no se usan variables locales
   .limit locals 0

   ; cargamos el valor entero 123 y lo retornamos
   ldc 123
   ireturn
.end method
