.class abstract synthetic LZ8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LZ8/g;Lx7/q;Ljava/lang/Throwable;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LZ8/p;->c(LZ8/g;Lx7/q;Ljava/lang/Throwable;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LZ8/g;)V
    .locals 1

    .prologue
    instance-of v0, p0, LZ8/U;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, LZ8/U;

    iget-object p0, p0, LZ8/U;->C:Ljava/lang/Throwable;

    throw p0
.end method

.method private static final c(LZ8/g;Lx7/q;Ljava/lang/Throwable;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p3, LZ8/p$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LZ8/p$a;

    iget v1, v0, LZ8/p$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/p$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/p$a;

    invoke-direct {v0, p3}, LZ8/p$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p3, v0, LZ8/p$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/p$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LZ8/p$a;->F:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Ljava/lang/Throwable;

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
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
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    iput-object p2, v0, LZ8/p$a;->F:Ljava/lang/Object;

    iput v3, v0, LZ8/p$a;->H:I

    invoke-interface {p1, p0, p2, v0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :goto_2
    if-eqz p2, :cond_4

    if-eq p2, p0, :cond_4

    invoke-static {p0, p2}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    throw p0
.end method

.method public static final d(LZ8/f;Lx7/q;)LZ8/f;
    .locals 1

    new-instance v0, LZ8/p$b;

    invoke-direct {v0, p0, p1}, LZ8/p$b;-><init>(LZ8/f;Lx7/q;)V

    return-object v0
.end method

.method public static final e(LZ8/f;Lx7/p;)LZ8/f;
    .locals 1

    new-instance v0, LZ8/p$c;

    invoke-direct {v0, p1, p0}, LZ8/p$c;-><init>(Lx7/p;LZ8/f;)V

    return-object v0
.end method
