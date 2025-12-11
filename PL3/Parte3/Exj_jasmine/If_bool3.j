.class public If_bool3
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 0
   ifeq L0
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "nunca"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto L1
L0:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "siempre"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L1:
   return

.end method
