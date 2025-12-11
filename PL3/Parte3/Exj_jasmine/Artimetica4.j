.class public Artimetica4
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc 1
   istore 0
   ldc 0
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
   ldc "factorial mayor que suma"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto L1
L0:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "factorial menor o igual que suma"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L1:
   return

.end method
