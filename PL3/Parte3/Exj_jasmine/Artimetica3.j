.class public Artimetica3
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 4
   istore 0
   ldc 0
   istore 1
   ldc 1
   istore 2
L0:
   iload 2
   iload 0
   if_icmpgt L1
   iload 1
   iload 2
   iload 2
   imul
   iadd
   istore 1
   goto L2
L2:
   iload 2
   ldc 1
   iadd
   istore 2
   goto L0
L1:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 1
   invokevirtual java/io/PrintStream/println(I)V
   return

.end method
