.class public For3
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 2
   istore 0
   ldc 0
   istore 1
L0:
   iload 1
   ldc 9
   if_icmpgt L1
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "for 3 - k vale: "
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 1
   invokevirtual java/io/PrintStream/println(I)V
   goto L2
L2:
   iload 1
   iload 0
   ldc 1
   isub
   iadd
   istore 1
   goto L0
L1:
   return

.end method
