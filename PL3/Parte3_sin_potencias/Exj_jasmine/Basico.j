.class public Basico
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 20.0
   fstore 0
   fload 0
   ldc 2
   i2f
   fcmpg
   ifgt L2
   ldc 0
   goto L3
L2:
   ldc 1
L3:
   ifeq L0
   ldc 5
   i2d
   ldc 2
   i2d
   invokestatic java/lang/Math/pow(DD)D
   d2f
   fstore 0
   goto L1
L0:
L1:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   fload 0
   invokevirtual java/io/PrintStream/println(F)V
   return

.end method
