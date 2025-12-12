.class public If_bool4
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 20
   istore 0
   iload 0
   ldc 10
   isub
   ldc 0
   if_icmpgt L2
   ldc 0
   goto L3
L2:
   ldc 1
L3:
   ifeq L0
   iload 0
   ldc 10
   isub
   istore 0
   iload 0
   ldc 0
   if_icmpgt L6
   ldc 0
   goto L7
L6:
   ldc 1
L7:
   ifeq L4
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "a sigue siendo positivo"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto L5
L4:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "a ya no es positivo"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L5:
   goto L1
L0:
L1:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 0
   invokevirtual java/io/PrintStream/println(I)V
   return

.end method
