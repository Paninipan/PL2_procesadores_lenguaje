.class public Artimetica2
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 3.0
   fstore 0
   ldc 2.5
   fstore 1
   fload 0
   fload 1
   fmul
   ldc 10
   ldc 4
   idiv
   i2f
   fadd
   fstore 2
   getstatic java/lang/System/out Ljava/io/PrintStream;
   fload 2
   invokevirtual java/io/PrintStream/println(F)V
   return

.end method
