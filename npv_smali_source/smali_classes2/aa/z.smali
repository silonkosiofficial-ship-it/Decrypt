.class public abstract Laa/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Laa/y;Laa/r;Laa/n;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Laa/z;->e(Laa/y;Laa/r;Laa/n;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Laa/y;Ljava/util/List;Laa/r;Laa/n;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Laa/z;->f(Laa/y;Ljava/util/List;Laa/r;Laa/n;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Laa/y;Lm7/e;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/s;->a()Laa/r;

    move-result-object v0

    invoke-static {}, Laa/o;->g()Laa/n;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Laa/z;->e(Laa/y;Laa/r;Laa/n;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Laa/y;[Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Laa/s;->a()Laa/r;

    move-result-object p1

    invoke-static {}, Laa/o;->g()Laa/n;

    move-result-object v1

    invoke-static {p0, v0, p1, v1, p2}, Laa/z;->f(Laa/y;Ljava/util/List;Laa/r;Laa/n;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Laa/y;Laa/r;Laa/n;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p3, Laa/z$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Laa/z$a;

    iget v1, v0, Laa/z$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Laa/z$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Laa/z$a;

    invoke-direct {v0, p3}, Laa/z$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p3, v0, Laa/z$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Laa/z$a;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static {p0, p2}, Laa/o;->f(Laa/m;Laa/n;)Laa/q;

    move-result-object p0

    iput v3, v0, Laa/z$a;->G:I

    invoke-static {p0, p1, v0}, Laa/A;->g(Laa/q;Laa/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string p0, "null cannot be cast to non-null type org.jetbrains.compose.resources.StringItem.Value"

    invoke-static {p3, p0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Laa/x;

    invoke-virtual {p3}, Laa/x;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Laa/y;Ljava/util/List;Laa/r;Laa/n;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p4, Laa/z$b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Laa/z$b;

    iget v1, v0, Laa/z$b;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Laa/z$b;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Laa/z$b;

    invoke-direct {v0, p4}, Laa/z$b;-><init>(Lm7/e;)V

    :goto_0
    iget-object p4, v0, Laa/z$b;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Laa/z$b;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Laa/z$b;->F:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Ljava/util/List;

    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    iput-object p1, v0, Laa/z$b;->F:Ljava/lang/Object;

    iput v3, v0, Laa/z$b;->H:I

    invoke-static {p0, p2, p3, v0}, Laa/z;->e(Laa/y;Laa/r;Laa/n;Lm7/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ljava/lang/String;

    invoke-static {p4, p1}, Laa/A;->h(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Laa/y;LV/n;I)Ljava/lang/String;
    .locals 4

    .prologue
    const-string v0, "resource"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5a9d1764

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "org.jetbrains.compose.resources.stringResource (StringResources.kt:24)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Laa/s;->b()LV/O0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p1, v1}, Laa/t;->a(LV/O0;LV/n;I)Laa/r;

    move-result-object v0

    sget-object v1, Laa/z$c;->D:Laa/z$c;

    new-instance v2, Laa/z$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Laa/z$d;-><init>(Laa/y;Laa/r;Lm7/e;)V

    and-int/lit8 p2, p2, 0xe

    or-int/lit16 p2, p2, 0x230

    invoke-static {p0, v1, v2, p1, p2}, Laa/u;->c(Ljava/lang/Object;Lx7/a;Lx7/p;LV/n;I)LV/G1;

    move-result-object p0

    invoke-static {p0}, Laa/z;->i(LV/G1;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p1}, LV/n;->J()V

    return-object p0
.end method

.method public static final h(Laa/y;[Ljava/lang/Object;LV/n;I)Ljava/lang/String;
    .locals 7

    .prologue
    const-string v0, "resource"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatArgs"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xcf4e891

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "org.jetbrains.compose.resources.stringResource (StringResources.kt:76)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Laa/s;->b()LV/O0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p2, v1}, Laa/t;->a(LV/O0;LV/n;I)Laa/r;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sget-object v3, Laa/z$e;->D:Laa/z$e;

    new-instance v4, Laa/z$f;

    const/4 p1, 0x0

    invoke-direct {v4, p0, v2, v0, p1}, Laa/z$f;-><init>(Laa/y;Ljava/util/List;Laa/r;Lm7/e;)V

    and-int/lit8 p1, p3, 0xe

    or-int/lit16 v6, p1, 0x11c0

    move-object v1, p0

    move-object v5, p2

    invoke-static/range {v1 .. v6}, Laa/u;->b(Ljava/lang/Object;Ljava/lang/Object;Lx7/a;Lx7/p;LV/n;I)LV/G1;

    move-result-object p0

    invoke-static {p0}, Laa/z;->j(LV/G1;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    invoke-interface {p2}, LV/n;->J()V

    return-object p0
.end method

.method private static final i(LV/G1;)Ljava/lang/String;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final j(LV/G1;)Ljava/lang/String;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method
