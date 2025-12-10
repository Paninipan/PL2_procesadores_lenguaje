.class public Ex01_Vacio
.super java/lang/Object

.method public static main([Ljava/lang/String;)V

   ; reservamos 1 sitio en la pila (mínimo para este ejemplo)
   .limit stack 1
   ; reservamos 1 variable local (aunque no la usemos)
   .limit locals 1

   ; método vacío: no realiza operaciones, simplemente terminar el main
   return
.end method
