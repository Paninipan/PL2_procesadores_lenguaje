.class public While4
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 2
   istore 0
   ldc 3
   istore 1
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
   ldc 3
   istore 1
L4:
   iload 1
   ldc 0
   if_icmpgt L6
   ldc 0
   goto L7
L6:
   ldc 1
L7:
   ifeq L5
   iload 1
   ldc 1
   isub
   istore 1
   iload 1
   ldc 1
   if_icmpeq L10
   ldc 0
   goto L11
L10:
   ldc 1
L11:
   ifeq L8
   goto L5
   goto L9
L8:
L9:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "fin iter j"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto L4
L5:
   iload 0
   ldc 1
   isub
   istore 0
   goto L0
L1:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "fin anidado"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   return

.end method
