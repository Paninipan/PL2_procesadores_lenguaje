.class public If_bool1
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 20
   istore 0
   ldc 6
   istore 1
   iload 0
   ldc 10
   if_icmpgt L2
   ldc 0
   goto L3
L2:
   ldc 1
L3:
   iload 1
   ldc 0
   if_icmple L6
   ldc 0
   goto L7
L6:
   ldc 1
L7:
   ifeq L4
   ldc 0
   goto L5
L4:
   ldc 1
L5:
   iand
   ldc 1
   ior
   ifeq L0
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "rama THEN 1"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto L1
L0:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "rama ELSE 1"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L1:
   return

.end method
