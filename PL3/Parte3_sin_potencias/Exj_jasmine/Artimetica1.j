.class public Artimetica1
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 5
   istore 0
   ldc 1
   istore 1
   ldc 1
   istore 2
L0:
   iload 1
   iload 0
   if_icmple L2
   ldc 0
   goto L3
L2:
   ldc 1
L3:
   ifeq L1
   iload 2
   iload 1
   imul
   istore 2
   iload 1
   ldc 1
   iadd
   istore 1
   goto L0
L1:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 2
   invokevirtual java/io/PrintStream/println(I)V
   return

.end method
