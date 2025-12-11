.class public While3
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 3
   istore 0
L0:
   ldc 1
   ifeq L1
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 0
   invokevirtual java/io/PrintStream/println(I)V
   iload 0
   ldc 1
   isub
   istore 0
   iload 0
   ldc 0
   if_icmpeq L4
   ldc 0
   goto L5
L4:
   ldc 1
L5:
   ifeq L2
   goto L1
   goto L3
L2:
L3:
   goto L0
L1:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "fin while con romper"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   return

.end method
