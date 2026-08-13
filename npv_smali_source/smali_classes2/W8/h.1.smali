.class abstract synthetic LW8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm7/i;Lx7/p;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    sget-object v1, Lm7/f;->A:Lm7/f$b;

    invoke-interface {p0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v1

    check-cast v1, Lm7/f;

    if-nez v1, :cond_0

    sget-object v1, LW8/X0;->a:LW8/X0;

    invoke-virtual {v1}, LW8/X0;->b()LW8/j0;

    move-result-object v1

    sget-object v2, LW8/t0;->C:LW8/t0;

    invoke-interface {p0, v1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    :goto_0
    invoke-static {v2, p0}, LW8/H;->j(LW8/N;Lm7/i;)Lm7/i;

    move-result-object p0

    goto :goto_4

    :cond_0
    instance-of v2, v1, LW8/j0;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v1, LW8/j0;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {v1}, LW8/j0;->K1()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v3, v1

    :cond_2
    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    move-object v1, v3

    goto :goto_3

    :cond_4
    :goto_2
    sget-object v1, LW8/X0;->a:LW8/X0;

    invoke-virtual {v1}, LW8/X0;->a()LW8/j0;

    move-result-object v1

    :goto_3
    sget-object v2, LW8/t0;->C:LW8/t0;

    goto :goto_0

    :goto_4
    new-instance v2, LW8/e;

    invoke-direct {v2, p0, v0, v1}, LW8/e;-><init>(Lm7/i;Ljava/lang/Thread;LW8/j0;)V

    sget-object p0, LW8/P;->C:LW8/P;

    invoke-virtual {v2, p0, v2, p1}, LW8/a;->j1(LW8/P;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v2}, LW8/e;->k1()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm7/i;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p0, Lm7/j;->C:Lm7/j;

    :cond_0
    invoke-static {p0, p1}, LW8/g;->e(Lm7/i;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
