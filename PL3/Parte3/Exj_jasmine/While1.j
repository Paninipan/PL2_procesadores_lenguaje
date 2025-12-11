.class public While1
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 3
   istore 0
L0:
   iload 0
   ldc 0
   if_icmpgt L2
   ldc 0
   goto L3
L2:
   ldc 1
L3:
   ifeq L1
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 0
   invokevirtual java/io/PrintStream/println(I)V
   iload 0
   ldc 1
   isub
   istore 0
   goto L0
L1:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "fin while basico"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   return

.end method
