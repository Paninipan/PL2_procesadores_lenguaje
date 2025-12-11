.class public Program
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
   ldc 5
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
   ldc 2
   if_icmpgt L10
   ldc 0
   goto L11
L10:
   ldc 1
L11:
   ifeq L8
   goto L4
   goto L9
L8:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "x <= 2"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L9:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "solo se ve si no hubo continuar"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto L4
L5:
   ldc 3
   istore 2
L12:
   ldc 1
   ifeq L13
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload 2
   invokevirtual java/io/PrintStream/println(I)V
   iload 2
   ldc 1
   isub
   istore 2
   iload 2
   ldc 0
   if_icmpeq L16
   ldc 0
   goto L17
L16:
   ldc 1
L17:
   ifeq L14
   goto L13
   goto L15
L14:
L15:
   goto L12
L13:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "fin while con romper"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   ldc 2
   istore 3
   ldc 3
   istore 4
L18:
   iload 3
   ldc 0
   if_icmpgt L20
   ldc 0
   goto L21
L20:
   ldc 1
L21:
   ifeq L19
   ldc 3
   istore 4
L22:
   iload 4
   ldc 0
   if_icmpgt L24
   ldc 0
   goto L25
L24:
   ldc 1
L25:
   ifeq L23
   iload 4
   ldc 1
   isub
   istore 4
   iload 4
   ldc 1
   if_icmpeq L28
   ldc 0
   goto L29
L28:
   ldc 1
L29:
   ifeq L26
   goto L23
   goto L27
L26:
L27:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "fin iter j"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   goto L22
L23:
   iload 3
   ldc 1
   isub
   istore 3
   goto L18
L19:
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "fin anidado"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   return

.end method
