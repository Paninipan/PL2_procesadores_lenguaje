.class public Basico
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 20
   istore 0
   iload 0
   ldc 2
   if_icmpgt L2
   ldc 0
   goto L3
L2:
   ldc 1
L3:
   ifeq L0
   ldc 5
   ldc 2
   isub
   istore 0
   goto L1
L0:
L1:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 0
   invokevirtual java/io/PrintStream/println(I)V
   return

.end method
