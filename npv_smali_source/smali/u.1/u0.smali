.class public abstract Lu/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lx7/l;

.field private static final b:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lu/u0$b;->D:Lu/u0$b;

    sput-object v0, Lu/u0;->a:Lx7/l;

    sget-object v0, Li7/r;->E:Li7/r;

    sget-object v1, Lu/u0$a;->D:Lu/u0$a;

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Lu/u0;->b:Li7/n;

    return-void
.end method

.method public static final synthetic a()Lx7/l;
    .locals 1

    sget-object v0, Lu/u0;->a:Lx7/l;

    return-object v0
.end method

.method public static final b(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LV/n;I)Lu/s0;
    .locals 8

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1825)"

    const v2, -0xbd1ef36

    invoke-static {v2, p5, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, p5, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-le v0, v3, :cond_1

    invoke-interface {p4, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    and-int/lit8 v4, p5, 0x6

    if-ne v4, v3, :cond_3

    :cond_2
    move v4, v1

    goto :goto_0

    :cond_3
    move v4, v2

    :goto_0
    invoke-interface {p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_4

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_5

    :cond_4
    new-instance v5, Lu/s0;

    new-instance v4, Lu/Z;

    invoke-direct {v4, p1}, Lu/Z;-><init>(Ljava/lang/Object;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lu/s0;->k()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " > "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v5, v4, p0, p3}, Lu/s0;-><init>(Lu/v0;Lu/s0;Ljava/lang/String;)V

    invoke-interface {p4, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lu/s0;

    if-le v0, v3, :cond_6

    invoke-interface {p4, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    :cond_6
    and-int/lit8 p3, p5, 0x6

    if-ne p3, v3, :cond_7

    goto :goto_1

    :cond_7
    move v1, v2

    :cond_8
    :goto_1
    invoke-interface {p4, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p3, v1

    invoke-interface {p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_9

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p5, p3, :cond_a

    :cond_9
    new-instance p5, Lu/u0$c;

    invoke-direct {p5, p0, v5}, Lu/u0$c;-><init>(Lu/s0;Lu/s0;)V

    invoke-interface {p4, p5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast p5, Lx7/l;

    invoke-static {v5, p5, p4, v2}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-virtual {p0}, Lu/s0;->u()Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-virtual {p0}, Lu/s0;->l()J

    move-result-wide p3

    invoke-virtual {v5, p1, p2, p3, p4}, Lu/s0;->G(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto :goto_2

    :cond_b
    invoke-virtual {v5, p2}, Lu/s0;->R(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Lu/s0;->K(Z)V

    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_c

    invoke-static {}, LV/q;->P()V

    :cond_c
    return-object v5
.end method

.method public static final c(Lu/s0;Lu/x0;Ljava/lang/String;LV/n;II)Lu/s0$a;
    .locals 5

    .prologue
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const-string p2, "DeferredAnimation"

    :cond_0
    invoke-static {}, LV/q;->H()Z

    move-result p5

    if-eqz p5, :cond_1

    const/4 p5, -0x1

    const-string v0, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1779)"

    const v1, -0x662b6f20

    invoke-static {v1, p4, p5, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    and-int/lit8 p5, p4, 0xe

    xor-int/lit8 p5, p5, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-le p5, v2, :cond_2

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    and-int/lit8 v3, p4, 0x6

    if-ne v3, v2, :cond_4

    :cond_3
    move v3, v0

    goto :goto_0

    :cond_4
    move v3, v1

    :goto_0
    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_6

    :cond_5
    new-instance v4, Lu/s0$a;

    invoke-direct {v4, p0, p1, p2}, Lu/s0$a;-><init>(Lu/s0;Lu/x0;Ljava/lang/String;)V

    invoke-interface {p3, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lu/s0$a;

    if-le p5, v2, :cond_7

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    :cond_7
    and-int/lit8 p1, p4, 0x6

    if-ne p1, v2, :cond_8

    goto :goto_1

    :cond_8
    move v0, v1

    :cond_9
    :goto_1
    invoke-interface {p3, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p1, v0

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_a

    sget-object p1, LV/n;->a:LV/n$a;

    invoke-virtual {p1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_b

    :cond_a
    new-instance p2, Lu/u0$d;

    invoke-direct {p2, p0, v4}, Lu/u0$d;-><init>(Lu/s0;Lu/s0$a;)V

    invoke-interface {p3, p2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast p2, Lx7/l;

    invoke-static {v4, p2, p3, v1}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-virtual {p0}, Lu/s0;->u()Z

    move-result p0

    if-eqz p0, :cond_c

    invoke-virtual {v4}, Lu/s0$a;->d()V

    :cond_c
    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_d

    invoke-static {}, LV/q;->P()V

    :cond_d
    return-object v4
.end method

.method public static final d(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Lu/I;Lu/x0;Ljava/lang/String;LV/n;I)LV/G1;
    .locals 16

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p6

    move/from16 v10, p7

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1900)"

    const v2, -0x122b33ce

    invoke-static {v2, v10, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, v10, 0xe

    xor-int/lit8 v11, v0, 0x6

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x4

    if-le v11, v14, :cond_1

    invoke-interface {v9, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 v0, v10, 0x6

    if-ne v0, v14, :cond_3

    :cond_2
    move v0, v12

    goto :goto_0

    :cond_3
    move v0, v13

    :goto_0
    invoke-interface/range {p6 .. p6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_4

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_5

    :cond_4
    new-instance v15, Lu/s0$d;

    move-object/from16 v4, p4

    invoke-static {v4, v7}, Lu/m;->i(Lu/x0;Ljava/lang/Object;)Lu/r;

    move-result-object v3

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lu/s0$d;-><init>(Lu/s0;Ljava/lang/Object;Lu/r;Lu/x0;Ljava/lang/String;)V

    invoke-interface {v9, v15}, LV/n;->K(Ljava/lang/Object;)V

    move-object v1, v15

    :cond_5
    check-cast v1, Lu/s0$d;

    invoke-virtual/range {p0 .. p0}, Lu/s0;->u()Z

    move-result v0

    if-eqz v0, :cond_6

    move-object/from16 v0, p1

    invoke-virtual {v1, v0, v7, v8}, Lu/s0$d;->I(Ljava/lang/Object;Ljava/lang/Object;Lu/I;)V

    goto :goto_1

    :cond_6
    invoke-virtual {v1, v7, v8}, Lu/s0$d;->K(Ljava/lang/Object;Lu/I;)V

    :goto_1
    if-le v11, v14, :cond_7

    invoke-interface {v9, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_7
    and-int/lit8 v0, v10, 0x6

    if-ne v0, v14, :cond_8

    goto :goto_2

    :cond_8
    move v12, v13

    :cond_9
    :goto_2
    invoke-interface {v9, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v12

    invoke-interface/range {p6 .. p6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_a

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_b

    :cond_a
    new-instance v2, Lu/u0$e;

    invoke-direct {v2, v6, v1}, Lu/u0$e;-><init>(Lu/s0;Lu/s0$d;)V

    invoke-interface {v9, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v2, Lx7/l;

    invoke-static {v1, v2, v9, v13}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LV/q;->P()V

    :cond_c
    return-object v1
.end method

.method public static final e()Lf0/u;
    .locals 1

    sget-object v0, Lu/u0;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/u;

    return-object v0
.end method

.method public static final f(Lu/v0;Ljava/lang/String;LV/n;II)Lu/s0;
    .locals 6

    .prologue
    and-int/lit8 p4, p4, 0x2

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    invoke-static {}, LV/q;->H()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v1, "androidx.compose.animation.core.rememberTransition (Transition.kt:820)"

    const v2, 0x61f14c21

    invoke-static {v2, p3, p4, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    and-int/lit8 p4, p3, 0xe

    xor-int/lit8 p4, p4, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-le p4, v2, :cond_2

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    and-int/lit8 v4, p3, 0x6

    if-ne v4, v2, :cond_4

    :cond_3
    move v4, v1

    goto :goto_0

    :cond_4
    move v4, v3

    :goto_0
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_5

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_6

    :cond_5
    new-instance v5, Lu/s0;

    invoke-direct {v5, p0, p1}, Lu/s0;-><init>(Lu/v0;Ljava/lang/String;)V

    invoke-interface {p2, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lu/s0;

    instance-of p1, p0, Lu/g0;

    if-eqz p1, :cond_c

    const p1, 0x3d6add44

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-virtual {p0}, Lu/v0;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Lu/v0;->b()Ljava/lang/Object;

    move-result-object v4

    if-le p4, v2, :cond_7

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_9

    :cond_7
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v2, :cond_8

    goto :goto_1

    :cond_8
    move v1, v3

    :cond_9
    :goto_1
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p3

    if-nez v1, :cond_a

    sget-object p4, LV/n;->a:LV/n$a;

    invoke-virtual {p4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne p3, p4, :cond_b

    :cond_a
    new-instance p3, Lu/u0$f;

    invoke-direct {p3, p0, v0}, Lu/u0$f;-><init>(Lu/v0;Lm7/e;)V

    invoke-interface {p2, p3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast p3, Lx7/p;

    invoke-static {p1, v4, p3, p2, v3}, LV/Q;->d(Ljava/lang/Object;Ljava/lang/Object;Lx7/p;LV/n;I)V

    :goto_2
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_3

    :cond_c
    const p1, 0x3d71e83b

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-virtual {p0}, Lu/v0;->b()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v5, p0, p2, v3}, Lu/s0;->e(Ljava/lang/Object;LV/n;I)V

    goto :goto_2

    :goto_3
    invoke-interface {p2, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_d

    sget-object p0, LV/n;->a:LV/n$a;

    invoke-virtual {p0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_e

    :cond_d
    new-instance p1, Lu/u0$g;

    invoke-direct {p1, v5}, Lu/u0$g;-><init>(Lu/s0;)V

    invoke-interface {p2, p1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast p1, Lx7/l;

    invoke-static {v5, p1, p2, v3}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_f

    invoke-static {}, LV/q;->P()V

    :cond_f
    return-object v5
.end method

.method public static final g(Ljava/lang/Object;Ljava/lang/String;LV/n;II)Lu/s0;
    .locals 2

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {}, LV/q;->H()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v0, "androidx.compose.animation.core.updateTransition (Transition.kt:91)"

    const v1, 0x78f2a0ad

    invoke-static {v1, p3, p4, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p4

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p4, v1, :cond_2

    new-instance p4, Lu/s0;

    invoke-direct {p4, p0, p1}, Lu/s0;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p4, Lu/s0;

    and-int/lit8 p1, p3, 0x8

    or-int/lit8 p1, p1, 0x30

    and-int/lit8 p3, p3, 0xe

    or-int/2addr p1, p3

    invoke-virtual {p4, p0, p2, p1}, Lu/s0;->e(Ljava/lang/Object;LV/n;I)V

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    new-instance p0, Lu/u0$h;

    invoke-direct {p0, p4}, Lu/u0$h;-><init>(Lu/s0;)V

    invoke-interface {p2, p0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast p0, Lx7/l;

    const/16 p1, 0x36

    invoke-static {p4, p0, p2, p1}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    return-object p4
.end method

.method public static final h(Lu/Z;Ljava/lang/String;LV/n;II)Lu/s0;
    .locals 2

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {}, LV/q;->H()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v0, "androidx.compose.animation.core.updateTransition (Transition.kt:873)"

    const v1, 0x34a03233

    invoke-static {v1, p3, p4, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    and-int/lit8 p3, p3, 0x7e

    const/4 p4, 0x0

    invoke-static {p0, p1, p2, p3, p4}, Lu/u0;->f(Lu/v0;Ljava/lang/String;LV/n;II)Lu/s0;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return-object p0
.end method
