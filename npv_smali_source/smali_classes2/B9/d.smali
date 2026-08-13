.class public abstract LB9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lx7/p;IILV/n;I)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LB9/d;->f(Lx7/p;IILV/n;I)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/lifecycle/k;Le/x;LB9/f;LV/N;)LV/M;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LB9/d;->d(Landroidx/lifecycle/k;Le/x;LB9/f;LV/N;)LV/M;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lx7/p;LV/n;II)V
    .locals 9

    .prologue
    const v0, -0x210b0df

    invoke-interface {p1, v0}, LV/n;->r(I)LV/n;

    move-result-object p1

    and-int/lit8 v1, p3, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v3, p2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p2, 0x6

    if-nez v3, :cond_2

    invoke-interface {p1, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    or-int/2addr v3, p2

    goto :goto_1

    :cond_2
    move v3, p2

    :goto_1
    and-int/lit8 v4, v3, 0x3

    if-ne v4, v2, :cond_4

    invoke-interface {p1}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, LV/n;->A()V

    goto/16 :goto_5

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    sget-object p0, LB9/a;->a:LB9/a;

    invoke-virtual {p0}, LB9/a;->a()Lx7/p;

    move-result-object p0

    :cond_5
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "moe.tlaster.precompose.PreComposeApp (PreComposeApp.android.kt:19)"

    invoke-static {v0, v3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    const v0, 0x671a9c9b

    invoke-interface {p1, v0}, LV/n;->f(I)V

    sget-object v0, Ld2/a;->a:Ld2/a;

    const/4 v1, 0x6

    invoke-virtual {v0, p1, v1}, Ld2/a;->a(LV/n;I)Landroidx/lifecycle/Y;

    move-result-object v2

    if-eqz v2, :cond_f

    instance-of v0, v2, Landroidx/lifecycle/i;

    if-eqz v0, :cond_7

    move-object v0, v2

    check-cast v0, Landroidx/lifecycle/i;

    invoke-interface {v0}, Landroidx/lifecycle/i;->k()Lc2/a;

    move-result-object v0

    :goto_3
    move-object v5, v0

    goto :goto_4

    :cond_7
    sget-object v0, Lc2/a$a;->b:Lc2/a$a;

    goto :goto_3

    :goto_4
    const-class v0, LB9/f;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, p1

    invoke-static/range {v1 .. v8}, Ld2/c;->b(LF7/c;Landroidx/lifecycle/Y;Ljava/lang/String;Landroidx/lifecycle/V$c;Lc2/a;LV/n;II)Landroidx/lifecycle/T;

    move-result-object v0

    invoke-interface {p1}, LV/n;->P()V

    check-cast v0, LB9/f;

    invoke-static {}, La2/a;->a()LV/O0;

    move-result-object v1

    invoke-interface {p1, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/r;

    invoke-interface {v1}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v1

    sget-object v2, Lf/b;->a:Lf/b;

    sget v3, Lf/b;->c:I

    invoke-virtual {v2, p1, v3}, Lf/b;->a(LV/n;I)Le/A;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-interface {v2}, Le/A;->b()Le/x;

    move-result-object v2

    const v3, -0x6879b4ee

    invoke-interface {p1, v3}, LV/n;->T(I)V

    invoke-interface {p1, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p1, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p1, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_8

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_9

    :cond_8
    new-instance v4, LB9/b;

    invoke-direct {v4, v1, v2, v0}, LB9/b;-><init>(Landroidx/lifecycle/k;Le/x;LB9/f;)V

    invoke-interface {p1, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, Lx7/l;

    invoke-interface {p1}, LV/n;->J()V

    const/4 v7, 0x0

    invoke-static {v1, v4, p1, v7}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-virtual {v0}, LB9/f;->c()LF9/a;

    move-result-object v1

    invoke-virtual {v1}, LF9/a;->b()LZ8/f;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, LV/v1;->a(LZ8/f;Ljava/lang/Object;Lm7/i;LV/n;II)LV/G1;

    move-result-object v1

    invoke-static {v1}, LB9/d;->e(LV/G1;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const v3, -0x687974ac

    invoke-interface {p1, v3}, LV/n;->T(I)V

    invoke-interface {p1, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p1, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_b

    :cond_a
    new-instance v4, LB9/d$b;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v3}, LB9/d$b;-><init>(LB9/f;LV/G1;Lm7/e;)V

    invoke-interface {p1, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lx7/p;

    invoke-interface {p1}, LV/n;->J()V

    invoke-static {v2, v4, p1, v7}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-static {}, LF9/e;->c()LV/O0;

    move-result-object v1

    invoke-virtual {v1, v0}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v0

    new-instance v1, LB9/d$c;

    invoke-direct {v1, p0}, LB9/d$c;-><init>(Lx7/p;)V

    const/16 v2, 0x36

    const v3, -0x17b7ac1f

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, p1, v2}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    sget v2, LV/P0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p1, v2}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LV/q;->P()V

    :cond_c
    :goto_5
    invoke-interface {p1}, LV/n;->x()LV/e1;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, LB9/c;

    invoke-direct {v0, p0, p2, p3}, LB9/c;-><init>(Lx7/p;II)V

    invoke-interface {p1, v0}, LV/e1;->a(Lx7/p;)V

    :cond_d
    return-void

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final d(Landroidx/lifecycle/k;Le/x;LB9/f;LV/N;)LV/M;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, LB9/d$a;

    invoke-direct {p3, p1, p2}, LB9/d$a;-><init>(Le/x;LB9/f;)V

    invoke-virtual {p0, p3}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    new-instance p1, LB9/d$d;

    invoke-direct {p1, p0, p3}, LB9/d$d;-><init>(Landroidx/lifecycle/k;LB9/d$a;)V

    return-object p1
.end method

.method private static final e(LV/G1;)Z
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final f(Lx7/p;IILV/n;I)Li7/M;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LV/S0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, LB9/d;->c(Lx7/p;LV/n;II)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final synthetic g(LV/G1;)Z
    .locals 0

    invoke-static {p0}, LB9/d;->e(LV/G1;)Z

    move-result p0

    return p0
.end method
