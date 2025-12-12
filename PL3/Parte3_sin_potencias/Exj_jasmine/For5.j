.class public For5
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 0
   istore 0
L0:
   iload 0
   ldc 10
   if_icmpgt L1
   iload 0
   ldc 0
   if_icmpeq L5
   ldc 0
   goto L6
L5:
   ldc 1
L6:
   ifeq L3
   goto L2
   goto L4
L3:
L4:
   iload 0
   ldc 4
   if_icmpeq L9
   ldc 0
   goto L10
L9:
   ldc 1
L10:
   ifeq L7
   goto L1
   goto L8
L7:
L8:
   iload 0
   ldc 1
   if_icmpge L13
   ldc 0
   goto L14
L13:
   ldc 1
L14:
   iload 0
   ldc 3
   if_icmple L15
   ldc 0
   goto L16
L15:
   ldc 1
L16:
   iand
   ifeq L11
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "for 5 - x valido: "
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 0
   invokevirtual java/io/PrintStream/println(I)V
   goto L12
L11:
L12:
   goto L2
L2:
   iload 0
   ldc 1
   iadd
   istore 0
   goto L0
L1:
   return

.end method
