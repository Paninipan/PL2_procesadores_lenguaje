.class public For4
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 5
   istore 0
L0:
   iload 0
   ldc 0
   if_icmpgt L1
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "for 4 - t vale: "
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 0
   invokevirtual java/io/PrintStream/println(I)V
   goto L2
L2:
   iload 0
   ldc 1
   ineg
   iadd
   istore 0
   goto L0
L1:
   return

.end method
