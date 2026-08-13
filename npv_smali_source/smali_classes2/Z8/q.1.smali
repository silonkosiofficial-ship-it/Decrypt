.class abstract synthetic LZ8/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LZ8/f;Lx7/q;)LZ8/f;
    .locals 1

    new-instance v0, LZ8/q$a;

    invoke-direct {v0, p0, p1}, LZ8/q$a;-><init>(LZ8/f;Lx7/q;)V

    return-object v0
.end method

.method public static final b(LZ8/f;LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, LZ8/q$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/q$b;

    iget v1, v0, LZ8/q$b;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/q$b;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/q$b;

    invoke-direct {v0, p2}, LZ8/q$b;-><init>(Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/q$b;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/q$b;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LZ8/q$b;->F:Ljava/lang/Object;

    check-cast p0, Ly7/O;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p2, Ly7/O;

    invoke-direct {p2}, Ly7/O;-><init>()V

    :try_start_1
    new-instance v2, LZ8/q$c;

    invoke-direct {v2, p1, p2}, LZ8/q$c;-><init>(LZ8/g;Ly7/O;)V

    iput-object p2, v0, LZ8/q$b;->F:Ljava/lang/Object;

    iput v3, v0, LZ8/q$b;->H:I

    invoke-interface {p0, v2, v0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0

    :catchall_1
    move-exception p1

    move-object p0, p2

    :goto_2
    iget-object p0, p0, Ly7/O;->C:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p1, p0}, LZ8/q;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_6

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object p2

    invoke-static {p1, p2}, LZ8/q;->c(Ljava/lang/Throwable;Lm7/i;)Z

    move-result p2

    if-nez p2, :cond_6

    if-nez p0, :cond_4

    return-object p1

    :cond_4
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    if-eqz p2, :cond_5

    invoke-static {p0, p1}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p0

    :cond_5
    invoke-static {p1, p0}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p1

    :cond_6
    throw p1
.end method

.method private static final c(Ljava/lang/Throwable;Lm7/i;)Z
    .locals 1

    .prologue
    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p1, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    check-cast p1, LW8/z0;

    if-eqz p1, :cond_1

    invoke-interface {p1}, LW8/z0;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LW8/z0;->e0()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-static {p0, p1}, LZ8/q;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final d(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-static {p1, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
