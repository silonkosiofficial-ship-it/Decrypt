.class public abstract LC9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LF9/a;LC9/d$a;LV/N;)LV/M;
    .locals 0

    invoke-static {p0, p1, p2}, LC9/d;->g(LF9/a;LC9/d$a;LV/N;)LV/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLx7/p;IILV/n;I)Li7/M;
    .locals 0

    invoke-static/range {p0 .. p5}, LC9/d;->h(ZLx7/p;IILV/n;I)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LC9/d$a;ZLF9/a;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2}, LC9/d;->f(LC9/d$a;ZLF9/a;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static final d(ZLx7/p;LV/n;II)V
    .locals 8

    .prologue
    const-string v0, "onBack"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x21f75fef

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v3, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    invoke-interface {p2, p0}, LV/n;->d(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, p3

    goto :goto_1

    :cond_2
    move v3, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_5

    invoke-interface {p2, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_7

    invoke-interface {p2}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LV/n;->A()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    const/4 v4, 0x1

    if-eqz v1, :cond_8

    move p0, v4

    :cond_8
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v5, "moe.tlaster.precompose.navigation.PredictiveBackHandler (BackHandler.kt:83)"

    invoke-static {v0, v3, v1, v5}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_9
    shr-int/lit8 v0, v3, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {p1, p2, v0}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v0

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    sget-object v5, LV/n;->a:LV/n$a;

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v1, v6, :cond_a

    sget-object v1, Lm7/j;->C:Lm7/j;

    invoke-static {v1, p2}, LV/Q;->h(Lm7/i;LV/n;)LW8/N;

    move-result-object v1

    new-instance v6, LV/C;

    invoke-direct {v6, v1}, LV/C;-><init>(LW8/N;)V

    invoke-interface {p2, v6}, LV/n;->K(Ljava/lang/Object;)V

    move-object v1, v6

    :cond_a
    check-cast v1, LV/C;

    invoke-virtual {v1}, LV/C;->a()LW8/N;

    move-result-object v1

    const v6, 0x331743c1

    invoke-interface {p2, v6}, LV/n;->T(I)V

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_b

    new-instance v6, LC9/d$a;

    invoke-direct {v6, p0, v1, v0}, LC9/d$a;-><init>(ZLW8/N;LV/G1;)V

    invoke-interface {p2, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, LC9/d$a;

    invoke-interface {p2}, LV/n;->J()V

    invoke-static {}, LF9/e;->c()LV/O0;

    move-result-object v0

    invoke-interface {p2, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_13

    check-cast v0, LF9/b;

    invoke-interface {v0}, LF9/b;->c()LF9/a;

    move-result-object v0

    const v1, 0x33183662

    invoke-interface {p2, v1}, LV/n;->T(I)V

    invoke-interface {p2, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v3, v3, 0xe

    const/4 v7, 0x0

    if-ne v3, v2, :cond_c

    goto :goto_5

    :cond_c
    move v4, v7

    :goto_5
    or-int/2addr v1, v4

    invoke-interface {p2, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_d

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_e

    :cond_d
    new-instance v2, LC9/a;

    invoke-direct {v2, v6, p0, v0}, LC9/a;-><init>(LC9/d$a;ZLF9/a;)V

    invoke-interface {p2, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v2, Lx7/a;

    invoke-interface {p2}, LV/n;->J()V

    invoke-static {v2, p2, v7}, LV/Q;->f(Lx7/a;LV/n;I)V

    invoke-static {}, La2/a;->a()LV/O0;

    move-result-object v1

    invoke-interface {p2, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/r;

    const v2, 0x3318572f

    invoke-interface {p2, v2}, LV/n;->T(I)V

    invoke-interface {p2, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_f

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_10

    :cond_f
    new-instance v3, LC9/b;

    invoke-direct {v3, v0, v6}, LC9/b;-><init>(LF9/a;LC9/d$a;)V

    invoke-interface {p2, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lx7/l;

    invoke-interface {p2}, LV/n;->J()V

    invoke-static {v1, v0, v3, p2, v7}, LV/Q;->a(Ljava/lang/Object;Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LV/q;->P()V

    :cond_11
    :goto_6
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_12

    new-instance v0, LC9/c;

    invoke-direct {v0, p0, p1, p3, p4}, LC9/c;-><init>(ZLx7/p;II)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_12
    return-void

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final e(LV/G1;)Lx7/p;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx7/p;

    return-object p0
.end method

.method private static final f(LC9/d$a;ZLF9/a;)Li7/M;
    .locals 1

    .prologue
    invoke-virtual {p0}, LC9/d$a;->isEnabled()Z

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p2}, LF9/a;->g()V

    :cond_0
    invoke-virtual {p0, p1}, LC9/d$a;->e(Z)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final g(LF9/a;LC9/d$a;LV/N;)LV/M;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LF9/a;->i(LF9/c;)V

    new-instance p2, LC9/d$b;

    invoke-direct {p2, p0, p1}, LC9/d$b;-><init>(LF9/a;LC9/d$a;)V

    return-object p2
.end method

.method private static final h(ZLx7/p;IILV/n;I)Li7/M;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LC9/d;->d(ZLx7/p;LV/n;II)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final synthetic i(LV/G1;)Lx7/p;
    .locals 0

    invoke-static {p0}, LC9/d;->e(LV/G1;)Lx7/p;

    move-result-object p0

    return-object p0
.end method
