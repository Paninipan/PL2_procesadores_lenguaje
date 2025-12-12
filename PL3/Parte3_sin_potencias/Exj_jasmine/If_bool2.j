.class public If_bool2
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 20
   istore 0
   ldc 6
   istore 1
   iload 0
   iload 1
   if_icmpgt L2
   ldc 0
   goto L3
L2:
   ldc 1
L3:
   ifeq L0
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "a es mayor que b"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto L1
L0:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "a no es mayor que b"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L1:
   return

.end method
