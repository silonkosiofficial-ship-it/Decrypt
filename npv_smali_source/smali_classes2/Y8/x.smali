.class public abstract LY8/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LY8/z;Lx7/a;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, LY8/x$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LY8/x$a;

    iget v1, v0, LY8/x$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LY8/x$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LY8/x$a;

    invoke-direct {v0, p2}, LY8/x$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p2, v0, LY8/x$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LY8/x$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LY8/x$a;->G:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lx7/a;

    iget-object p0, v0, LY8/x$a;->F:Ljava/lang/Object;

    check-cast p0, LY8/z;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object p2

    sget-object v2, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p2, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p2

    if-ne p2, p0, :cond_5

    :try_start_1
    iput-object p0, v0, LY8/x$a;->F:Ljava/lang/Object;

    iput-object p1, v0, LY8/x$a;->G:Ljava/lang/Object;

    iput v3, v0, LY8/x$a;->I:I

    new-instance p2, LW8/n;

    invoke-static {v0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v2

    invoke-direct {p2, v2, v3}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {p2}, LW8/n;->E()V

    new-instance v2, LY8/x$b;

    invoke-direct {v2, p2}, LY8/x$b;-><init>(LW8/l;)V

    invoke-interface {p0, v2}, LY8/C;->d(Lx7/l;)V

    invoke-virtual {p2}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p0, p2, :cond_3

    invoke-static {v0}, Lo7/h;->c(Lm7/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :goto_2
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "awaitClose() can only be invoked from the producer context"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(LW8/N;Lm7/i;ILY8/d;LW8/P;Lx7/l;Lx7/p;)LY8/B;
    .locals 2

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p2, p3, v0, v1, v0}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p2

    invoke-static {p0, p1}, LW8/H;->j(LW8/N;Lm7/i;)Lm7/i;

    move-result-object p0

    new-instance p1, LY8/y;

    invoke-direct {p1, p0, p2}, LY8/y;-><init>(Lm7/i;LY8/j;)V

    if-eqz p5, :cond_0

    invoke-virtual {p1, p5}, LW8/F0;->e1(Lx7/l;)LW8/f0;

    :cond_0
    invoke-virtual {p1, p4, p1, p6}, LW8/a;->j1(LW8/P;Ljava/lang/Object;Lx7/p;)V

    return-object p1
.end method

.method public static final c(LW8/N;Lm7/i;ILx7/p;)LY8/B;
    .locals 7

    sget-object v3, LY8/d;->C:LY8/d;

    sget-object v4, LW8/P;->C:LW8/P;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, LY8/x;->b(LW8/N;Lm7/i;ILY8/d;LW8/P;Lx7/l;Lx7/p;)LY8/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LW8/N;Lm7/i;ILY8/d;LW8/P;Lx7/l;Lx7/p;ILjava/lang/Object;)LY8/B;
    .locals 7

    .prologue
    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    sget-object p1, Lm7/j;->C:Lm7/j;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    :cond_1
    move v2, p2

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    sget-object p3, LY8/d;->C:LY8/d;

    :cond_2
    move-object v3, p3

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    sget-object p4, LW8/P;->C:LW8/P;

    :cond_3
    move-object v4, p4

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    const/4 p5, 0x0

    :cond_4
    move-object v5, p5

    move-object v0, p0

    move-object v6, p6

    invoke-static/range {v0 .. v6}, LY8/x;->b(LW8/N;Lm7/i;ILY8/d;LW8/P;Lx7/l;Lx7/p;)LY8/B;

    move-result-object p0

    return-object p0
.end method
