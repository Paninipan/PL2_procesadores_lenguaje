.class public Ex06_NestedIfs
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 4 sitios en la pila (operandos y PrintStream temporales)
   .limit stack 4
   ; reservamos 2 variables locales (no usadas)
   .limit locals 2

   ; ejemplo: if (5 > 3) { print "A"; if (2 < 4) { print "B"; } }
   ; comprobación del if externo: 5 > 3
   ldc 5
   ldc 3
   ; si 5 <= 3 saltamos al final del if externo
   if_icmple LEND_IF1

   ; entonces externo: imprimir "A"
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "A"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

   ; if interno: comprobar 2 < 4
   ldc 2
   ldc 4
   ; si 2 >= 4 saltamos al final del if interno
   if_icmpge LEND_INNER
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "B"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
LEND_INNER:
LEND_IF1:
   ; cerrar main
   return
.end method
