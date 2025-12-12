.class public While2
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 5
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
   iload 0
   ldc 1
   isub
   istore 0
   iload 0
   ldc 2
   if_icmpgt L6
   ldc 0
   goto L7
L6:
   ldc 1
L7:
   ifeq L4
   goto L0
   goto L5
L4:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "x <= 2"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L5:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "solo se ve si no hubo continuar"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto L0
L1:
   return

.end method
