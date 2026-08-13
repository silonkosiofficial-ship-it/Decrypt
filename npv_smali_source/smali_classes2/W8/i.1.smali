.class abstract synthetic LW8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW8/N;Lm7/i;LW8/P;Lx7/p;)LW8/V;
    .locals 1

    .prologue
    invoke-static {p0, p1}, LW8/H;->j(LW8/N;Lm7/i;)Lm7/i;

    move-result-object p0

    invoke-virtual {p2}, LW8/P;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LW8/H0;

    invoke-direct {p1, p0, p3}, LW8/H0;-><init>(Lm7/i;Lx7/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, LW8/W;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LW8/W;-><init>(Lm7/i;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LW8/a;->j1(LW8/P;Ljava/lang/Object;Lx7/p;)V

    return-object p1
.end method

.method public static synthetic b(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/V;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lm7/j;->C:Lm7/j;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, LW8/P;->C:LW8/P;

    :cond_1
    invoke-static {p0, p1, p2, p3}, LW8/g;->a(LW8/N;Lm7/i;LW8/P;Lx7/p;)LW8/V;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LW8/N;Lm7/i;LW8/P;Lx7/p;)LW8/z0;
    .locals 1

    .prologue
    invoke-static {p0, p1}, LW8/H;->j(LW8/N;Lm7/i;)Lm7/i;

    move-result-object p0

    invoke-virtual {p2}, LW8/P;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, LW8/I0;

    invoke-direct {p1, p0, p3}, LW8/I0;-><init>(Lm7/i;Lx7/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, LW8/S0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LW8/S0;-><init>(Lm7/i;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LW8/a;->j1(LW8/P;Ljava/lang/Object;Lx7/p;)V

    return-object p1
.end method

.method public static synthetic d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lm7/j;->C:Lm7/j;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, LW8/P;->C:LW8/P;

    :cond_1
    invoke-static {p0, p1, p2, p3}, LW8/g;->c(LW8/N;Lm7/i;LW8/P;Lx7/p;)LW8/z0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {v0, p0}, LW8/H;->k(Lm7/i;Lm7/i;)Lm7/i;

    move-result-object p0

    invoke-static {p0}, LW8/C0;->l(Lm7/i;)V

    if-ne p0, v0, :cond_0

    new-instance v0, Lb9/z;

    invoke-direct {v0, p0, p2}, Lb9/z;-><init>(Lm7/i;Lm7/e;)V

    invoke-static {v0, v0, p1}, Lc9/b;->b(Lb9/z;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v1, Lm7/f;->A:Lm7/f$b;

    invoke-interface {p0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v2

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    invoke-static {v2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LW8/c1;

    invoke-direct {v0, p0, p2}, LW8/c1;-><init>(Lm7/i;Lm7/e;)V

    invoke-virtual {v0}, LW8/a;->getContext()Lm7/i;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lb9/K;->i(Lm7/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :try_start_0
    invoke-static {v0, v0, p1}, Lc9/b;->b(Lb9/z;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, v1}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    move-object p0, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p0, v1}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    throw p1

    :cond_1
    new-instance v0, LW8/Z;

    invoke-direct {v0, p0, p2}, LW8/Z;-><init>(Lm7/i;Lm7/e;)V

    invoke-static {p1, v0, v0}, Lc9/a;->d(Lx7/p;Ljava/lang/Object;Lm7/e;)V

    invoke-virtual {v0}, LW8/Z;->k1()Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_2
    return-object p0
.end method
