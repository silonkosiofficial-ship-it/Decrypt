.class public abstract LI7/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LI7/y$a;Z)LJ7/e;
    .locals 0

    invoke-static {p0, p1}, LI7/z;->b(LI7/y$a;Z)LJ7/e;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LI7/y$a;Z)LJ7/e;
    .locals 6

    .prologue
    sget-object v0, LI7/n;->C:LI7/n$a;

    invoke-virtual {v0}, LI7/n$a;->a()LS8/o;

    move-result-object v0

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v1

    invoke-virtual {v1}, LI7/y;->L()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LS8/o;->d(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LJ7/i;->a:LJ7/i;

    return-object p0

    :cond_0
    sget-object v0, LI7/I;->a:LI7/I;

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v1

    invoke-virtual {v1}, LI7/y;->I()LO7/U;

    move-result-object v1

    invoke-virtual {v0, v1}, LI7/I;->f(LO7/U;)LI7/i;

    move-result-object v0

    instance-of v1, v0, LI7/i$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_e

    check-cast v0, LI7/i$c;

    invoke-virtual {v0}, LI7/i$c;->f()Ll8/a$d;

    move-result-object v1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Ll8/a$d;->G()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ll8/a$d;->B()Ll8/a$c;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ll8/a$d;->H()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ll8/a$d;->C()Ll8/a$c;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v3

    invoke-virtual {v3}, LI7/y;->t()LI7/n;

    move-result-object v3

    invoke-virtual {v0}, LI7/i$c;->d()Lk8/c;

    move-result-object v4

    invoke-virtual {v1}, Ll8/a$c;->x()I

    move-result v5

    invoke-interface {v4, v5}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LI7/i$c;->d()Lk8/c;

    move-result-object v0

    invoke-virtual {v1}, Ll8/a$c;->w()I

    move-result v1

    invoke-interface {v0, v1}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, LI7/n;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_8

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->I()LO7/U;

    move-result-object v0

    invoke-static {v0}, Lr8/h;->e(LO7/k0;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->I()LO7/U;

    move-result-object v0

    invoke-interface {v0}, LO7/C;->h()LO7/u;

    move-result-object v0

    sget-object v1, LO7/t;->d:LO7/u;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object p1

    invoke-virtual {p1}, LI7/y;->I()LO7/U;

    move-result-object p1

    invoke-interface {p1}, LO7/i0;->b()LO7/m;

    move-result-object p1

    invoke-static {p1}, LJ7/k;->s(LO7/m;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->I()LO7/U;

    move-result-object v0

    invoke-static {p1, v0}, LJ7/k;->l(Ljava/lang/Class;LO7/b;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, LI7/y$a;->E()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, LJ7/h$a;

    invoke-static {p0}, LI7/z;->f(LI7/y$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LJ7/h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_4
    new-instance v0, LJ7/h$b;

    invoke-direct {v0, p1}, LJ7/h$b;-><init>(Ljava/lang/reflect/Method;)V

    goto/16 :goto_5

    :cond_5
    new-instance p1, LI7/D;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Underlying property of inline class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " should have a field"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->K()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_7

    :goto_2
    invoke-static {p0, p1, v0}, LI7/z;->c(LI7/y$a;ZLjava/lang/reflect/Field;)LJ7/f;

    move-result-object v0

    goto/16 :goto_5

    :cond_7
    new-instance p1, LI7/D;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No accessors or field is found for property "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result p1

    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {p0}, LI7/y$a;->E()Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, LJ7/f$h$a;

    invoke-static {p0}, LI7/z;->f(LI7/y$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p1, v0, v1}, LJ7/f$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    :goto_3
    move-object v0, p1

    goto/16 :goto_5

    :cond_9
    new-instance p1, LJ7/f$h$e;

    invoke-direct {p1, v0}, LJ7/f$h$e;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_3

    :cond_a
    invoke-static {p0}, LI7/z;->d(LI7/y$a;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, LI7/y$a;->E()Z

    move-result p1

    if-eqz p1, :cond_b

    new-instance p1, LJ7/f$h$b;

    invoke-direct {p1, v0}, LJ7/f$h$b;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_3

    :cond_b
    new-instance p1, LJ7/f$h$f;

    invoke-direct {p1, v0}, LJ7/f$h$f;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_3

    :cond_c
    invoke-virtual {p0}, LI7/y$a;->E()Z

    move-result p1

    if-eqz p1, :cond_d

    new-instance p1, LJ7/f$h$c;

    invoke-static {p0}, LI7/z;->f(LI7/y$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p1, v0, v1}, LJ7/f$h$c;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_3

    :cond_d
    new-instance p1, LJ7/f$h$g;

    invoke-direct {p1, v0}, LJ7/f$h$g;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_3

    :cond_e
    instance-of v1, v0, LI7/i$a;

    if-eqz v1, :cond_f

    check-cast v0, LI7/i$a;

    invoke-virtual {v0}, LI7/i$a;->b()Ljava/lang/reflect/Field;

    move-result-object v0

    goto :goto_2

    :cond_f
    instance-of v1, v0, LI7/i$b;

    if-eqz v1, :cond_13

    check-cast v0, LI7/i$b;

    if-eqz p1, :cond_10

    invoke-virtual {v0}, LI7/i$b;->b()Ljava/lang/reflect/Method;

    move-result-object p1

    goto :goto_4

    :cond_10
    invoke-virtual {v0}, LI7/i$b;->c()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_12

    :goto_4
    invoke-virtual {p0}, LI7/y$a;->E()Z

    move-result v0

    if-eqz v0, :cond_11

    new-instance v0, LJ7/f$h$a;

    invoke-static {p0}, LI7/z;->f(LI7/y$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LJ7/f$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_5

    :cond_11
    new-instance v0, LJ7/f$h$e;

    invoke-direct {v0, p1}, LJ7/f$h$e;-><init>(Ljava/lang/reflect/Method;)V

    :goto_5
    invoke-virtual {p0}, LI7/y$a;->F()LO7/T;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v1, 0x2

    invoke-static {v0, p0, p1, v1, v2}, LJ7/k;->i(LJ7/e;LO7/b;ZILjava/lang/Object;)LJ7/e;

    move-result-object p0

    return-object p0

    :cond_12
    new-instance p0, LI7/D;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No source found for setter of Java method property: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LI7/i$b;->b()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_13
    instance-of v1, v0, LI7/i$d;

    if-eqz v1, :cond_18

    check-cast v0, LI7/i$d;

    if-eqz p1, :cond_14

    invoke-virtual {v0}, LI7/i$d;->b()LI7/h$e;

    move-result-object p1

    goto :goto_6

    :cond_14
    invoke-virtual {v0}, LI7/i$d;->c()LI7/h$e;

    move-result-object p1

    if-eqz p1, :cond_17

    :goto_6
    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->t()LI7/n;

    move-result-object v0

    invoke-virtual {p1}, LI7/h$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LI7/h$e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LI7/n;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_16

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    invoke-virtual {p0}, LI7/y$a;->E()Z

    move-result v0

    if-eqz v0, :cond_15

    new-instance v0, LJ7/f$h$a;

    invoke-static {p0}, LI7/z;->f(LI7/y$a;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v0, p1, p0}, LJ7/f$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_7

    :cond_15
    new-instance v0, LJ7/f$h$e;

    invoke-direct {v0, p1}, LJ7/f$h$e;-><init>(Ljava/lang/reflect/Method;)V

    :goto_7
    return-object v0

    :cond_16
    new-instance p1, LI7/D;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No accessor found for property "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    new-instance p1, LI7/D;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No setter found for property "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method

.method private static final c(LI7/y$a;ZLjava/lang/reflect/Field;)LJ7/f;
    .locals 1

    .prologue
    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->I()LO7/U;

    move-result-object v0

    invoke-static {v0}, LI7/z;->g(LO7/U;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, LI7/z;->d(LI7/y$a;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LI7/y$a;->E()Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, LJ7/f$f$b;

    invoke-direct {p0, p2}, LJ7/f$f$b;-><init>(Ljava/lang/reflect/Field;)V

    goto/16 :goto_2

    :cond_1
    new-instance p0, LJ7/f$f$d;

    invoke-direct {p0, p2}, LJ7/f$f$d;-><init>(Ljava/lang/reflect/Field;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, LI7/y$a;->E()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, LJ7/f$g$b;

    invoke-static {p0}, LI7/z;->e(LI7/y$a;)Z

    move-result p0

    invoke-direct {p1, p2, p0}, LJ7/f$g$b;-><init>(Ljava/lang/reflect/Field;Z)V

    :goto_0
    move-object p0, p1

    goto :goto_2

    :cond_3
    new-instance p1, LJ7/f$g$d;

    invoke-static {p0}, LI7/z;->e(LI7/y$a;)Z

    move-result p0

    invoke-direct {p1, p2, p0}, LJ7/f$g$d;-><init>(Ljava/lang/reflect/Field;Z)V

    goto :goto_0

    :cond_4
    if-eqz p1, :cond_5

    new-instance p0, LJ7/f$f$e;

    invoke-direct {p0, p2}, LJ7/f$f$e;-><init>(Ljava/lang/reflect/Field;)V

    goto :goto_2

    :cond_5
    new-instance p1, LJ7/f$g$e;

    invoke-static {p0}, LI7/z;->e(LI7/y$a;)Z

    move-result p0

    invoke-direct {p1, p2, p0}, LJ7/f$g$e;-><init>(Ljava/lang/reflect/Field;Z)V

    goto :goto_0

    :cond_6
    :goto_1
    if-eqz p1, :cond_8

    invoke-virtual {p0}, LI7/y$a;->E()Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, LJ7/f$f$a;

    invoke-static {p0}, LI7/z;->f(LI7/y$a;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {p1, p2, p0}, LJ7/f$f$a;-><init>(Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    goto :goto_0

    :cond_7
    new-instance p0, LJ7/f$f$c;

    invoke-direct {p0, p2}, LJ7/f$f$c;-><init>(Ljava/lang/reflect/Field;)V

    goto :goto_2

    :cond_8
    invoke-virtual {p0}, LI7/y$a;->E()Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, LJ7/f$g$a;

    invoke-static {p0}, LI7/z;->e(LI7/y$a;)Z

    move-result v0

    invoke-static {p0}, LI7/z;->f(LI7/y$a;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {p1, p2, v0, p0}, LJ7/f$g$a;-><init>(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V

    goto :goto_0

    :cond_9
    new-instance p1, LJ7/f$g$c;

    invoke-static {p0}, LI7/z;->e(LI7/y$a;)Z

    move-result p0

    invoke-direct {p1, p2, p0}, LJ7/f$g$c;-><init>(Ljava/lang/reflect/Field;Z)V

    goto :goto_0

    :goto_2
    return-object p0
.end method

.method private static final d(LI7/y$a;)Z
    .locals 1

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object p0

    invoke-virtual {p0}, LI7/y;->I()LO7/U;

    move-result-object p0

    invoke-interface {p0}, LP7/a;->k()LP7/g;

    move-result-object p0

    invoke-static {}, LI7/M;->j()Ln8/c;

    move-result-object v0

    invoke-interface {p0, v0}, LP7/g;->H(Ln8/c;)Z

    move-result p0

    return p0
.end method

.method private static final e(LI7/y$a;)Z
    .locals 0

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object p0

    invoke-virtual {p0}, LI7/y;->I()LO7/U;

    move-result-object p0

    invoke-interface {p0}, LO7/i0;->getType()LF8/E;

    move-result-object p0

    invoke-static {p0}, LF8/q0;->l(LF8/E;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final f(LI7/y$a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object p0

    invoke-virtual {p0}, LI7/y;->G()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LO7/U;)Z
    .locals 4

    .prologue
    invoke-interface {p0}, LO7/i0;->b()LO7/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lr8/f;->x(LO7/m;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-interface {v0}, LO7/m;->b()LO7/m;

    move-result-object v0

    invoke-static {v0}, Lr8/f;->C(LO7/m;)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_2

    invoke-static {v0}, Lr8/f;->t(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v3

    goto :goto_2

    :cond_2
    :goto_1
    instance-of v0, p0, LD8/j;

    if-eqz v0, :cond_3

    check-cast p0, LD8/j;

    invoke-virtual {p0}, LD8/j;->o1()Li8/n;

    move-result-object p0

    invoke-static {p0}, Lm8/i;->f(Li8/n;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    :goto_2
    return v2
.end method
