.class public abstract LK0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF0/J;Z)LK0/o;
    .locals 10

    .prologue
    invoke-virtual {p0}, LF0/J;->k0()LF0/b0;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    invoke-static {v0}, LF0/b0;->c(LF0/b0;)I

    move-result v2

    and-int/2addr v2, v1

    const/4 v3, 0x0

    if-eqz v2, :cond_8

    invoke-virtual {v0}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_7

    move-object v2, v0

    move-object v4, v3

    :goto_1
    if-eqz v2, :cond_7

    instance-of v5, v2, LF0/z0;

    if-eqz v5, :cond_0

    move-object v3, v2

    goto :goto_4

    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/d$c;->v1()I

    move-result v5

    and-int/2addr v5, v1

    if-eqz v5, :cond_6

    instance-of v5, v2, LF0/m;

    if-eqz v5, :cond_6

    move-object v5, v2

    check-cast v5, LF0/m;

    invoke-virtual {v5}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_2
    const/4 v8, 0x1

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->v1()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v2, v5

    goto :goto_3

    :cond_1
    if-nez v4, :cond_2

    new-instance v4, LX/b;

    const/16 v8, 0x10

    new-array v8, v8, [Landroidx/compose/ui/d$c;

    invoke-direct {v4, v8, v6}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v4, v2}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v2, v3

    :cond_3
    invoke-virtual {v4, v5}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    invoke-virtual {v5}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v5

    goto :goto_2

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v4}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v2

    goto :goto_1

    :cond_7
    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->q1()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v0

    goto :goto_0

    :cond_8
    :goto_4
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v3, LF0/z0;

    invoke-interface {v3}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {p0}, LF0/J;->I()LK0/k;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v2, LK0/o;

    invoke-direct {v2, v0, p1, p0, v1}, LK0/o;-><init>(Landroidx/compose/ui/d$c;ZLF0/J;LK0/k;)V

    return-object v2
.end method

.method public static final synthetic b(LK0/o;)I
    .locals 0

    invoke-static {p0}, LK0/p;->e(LK0/o;)I

    move-result p0

    return p0
.end method

.method public static final synthetic c(LK0/o;)LK0/h;
    .locals 0

    invoke-static {p0}, LK0/p;->h(LK0/o;)LK0/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LK0/o;)I
    .locals 0

    invoke-static {p0}, LK0/p;->i(LK0/o;)I

    move-result p0

    return p0
.end method

.method private static final e(LK0/o;)I
    .locals 1

    invoke-virtual {p0}, LK0/o;->o()I

    move-result p0

    const v0, 0x77359400

    add-int/2addr p0, v0

    return p0
.end method

.method public static final f(LF0/J;Lx7/l;)LF0/J;
    .locals 1

    .prologue
    :cond_0
    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final g(LF0/J;)LF0/z0;
    .locals 9

    .prologue
    invoke-virtual {p0}, LF0/J;->k0()LF0/b0;

    move-result-object p0

    const/16 v0, 0x8

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-static {p0}, LF0/b0;->c(LF0/b0;)I

    move-result v1

    and-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    invoke-virtual {p0}, LF0/b0;->k()Landroidx/compose/ui/d$c;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_8

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    move-object v1, p0

    move-object v3, v2

    :goto_1
    if-eqz v1, :cond_7

    instance-of v4, v1, LF0/z0;

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, LF0/z0;

    invoke-interface {v4}, LF0/z0;->k1()Z

    move-result v4

    if-eqz v4, :cond_6

    move-object v2, v1

    goto :goto_4

    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->v1()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_6

    instance-of v4, v1, LF0/m;

    if-eqz v4, :cond_6

    move-object v4, v1

    check-cast v4, LF0/m;

    invoke-virtual {v4}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v5

    :goto_2
    const/4 v7, 0x1

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->v1()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_1

    move-object v1, v4

    goto :goto_3

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, LX/b;

    const/16 v7, 0x10

    new-array v7, v7, [Landroidx/compose/ui/d$c;

    invoke-direct {v3, v7, v5}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v3, v1}, LX/b;->d(Ljava/lang/Object;)Z

    move-object v1, v2

    :cond_3
    invoke-virtual {v3, v4}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    invoke-virtual {v4}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v4

    goto :goto_2

    :cond_5
    if-ne v6, v7, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v3}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object v1

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->q1()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p0

    goto :goto_0

    :cond_8
    :goto_4
    check-cast v2, LF0/z0;

    return-object v2
.end method

.method private static final h(LK0/o;)LK0/h;
    .locals 1

    invoke-virtual {p0}, LK0/o;->w()LK0/k;

    move-result-object p0

    sget-object v0, LK0/r;->a:LK0/r;

    invoke-virtual {v0}, LK0/r;->y()LK0/v;

    move-result-object v0

    invoke-static {p0, v0}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LK0/h;

    return-object p0
.end method

.method private static final i(LK0/o;)I
    .locals 1

    invoke-virtual {p0}, LK0/o;->o()I

    move-result p0

    const v0, 0x3b9aca00

    add-int/2addr p0, v0

    return p0
.end method
