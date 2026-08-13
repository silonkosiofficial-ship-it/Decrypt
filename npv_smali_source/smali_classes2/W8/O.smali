.class public abstract LW8/O;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm7/i;)LW8/N;
    .locals 3

    .prologue
    new-instance v0, Lb9/d;

    sget-object v1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, LW8/C0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object v1

    invoke-interface {p0, v1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lb9/d;-><init>(Lm7/i;)V

    return-object v0
.end method

.method public static final b()LW8/N;
    .locals 3

    new-instance v0, Lb9/d;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LW8/U0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object v1

    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v2

    invoke-interface {v1, v2}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v1

    invoke-direct {v0, v1}, Lb9/d;-><init>(Lm7/i;)V

    return-object v0
.end method

.method public static final c(LW8/N;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p1, p2}, LW8/o0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-static {p0, p1}, LW8/O;->d(LW8/N;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final d(LW8/N;Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .prologue
    invoke-interface {p0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v0

    sget-object v1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    check-cast v0, LW8/z0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scope cannot be cancelled because it does not have a job: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic e(LW8/N;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LW8/O;->d(LW8/N;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final f(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, Lb9/z;

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lb9/z;-><init>(Lm7/i;Lm7/e;)V

    invoke-static {v0, v0, p0}, Lc9/b;->b(Lb9/z;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    return-object p0
.end method

.method public static final g(LW8/N;)V
    .locals 0

    invoke-interface {p0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p0

    invoke-static {p0}, LW8/C0;->l(Lm7/i;)V

    return-void
.end method

.method public static final h(LW8/N;)Z
    .locals 1

    .prologue
    invoke-interface {p0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p0

    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p0

    check-cast p0, LW8/z0;

    if-eqz p0, :cond_0

    invoke-interface {p0}, LW8/z0;->f()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static final i(LW8/N;Lm7/i;)LW8/N;
    .locals 1

    new-instance v0, Lb9/d;

    invoke-interface {p0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p0

    invoke-interface {p0, p1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    invoke-direct {v0, p0}, Lb9/d;-><init>(Lm7/i;)V

    return-object v0
.end method
