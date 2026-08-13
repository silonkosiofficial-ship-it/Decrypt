.class abstract synthetic LW8/D0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW8/z0;)LW8/y;
    .locals 1

    new-instance v0, LW8/B0;

    invoke-direct {v0, p0}, LW8/B0;-><init>(LW8/z0;)V

    return-object v0
.end method

.method public static synthetic b(LW8/z0;ILjava/lang/Object;)LW8/y;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LW8/C0;->a(LW8/z0;)LW8/y;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LW8/z0;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p1, p2}, LW8/o0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-interface {p0, p1}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final d(Lm7/i;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .prologue
    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p0

    check-cast p0, LW8/z0;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static synthetic e(LW8/z0;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LW8/C0;->c(LW8/z0;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic f(Lm7/i;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LW8/C0;->d(Lm7/i;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final g(LW8/z0;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-interface {p0, p1}, LW8/z0;->g0(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final h(LW8/z0;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .prologue
    invoke-interface {p0}, LW8/z0;->N()LR8/h;

    move-result-object p0

    invoke-interface {p0}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW8/z0;

    invoke-interface {v0, p1}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic i(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LW8/C0;->h(LW8/z0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final j(LW8/z0;LW8/f0;)LW8/f0;
    .locals 3

    new-instance v0, LW8/h0;

    invoke-direct {v0, p1}, LW8/h0;-><init>(LW8/f0;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, p1, v1}, LW8/C0;->o(LW8/z0;ZLW8/E0;ILjava/lang/Object;)LW8/f0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(LW8/z0;)V
    .locals 1

    .prologue
    invoke-interface {p0}, LW8/z0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, LW8/z0;->e0()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method

.method public static final l(Lm7/i;)V
    .locals 1

    .prologue
    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p0

    check-cast p0, LW8/z0;

    if-eqz p0, :cond_0

    invoke-static {p0}, LW8/C0;->k(LW8/z0;)V

    :cond_0
    return-void
.end method

.method public static final m(Lm7/i;)LW8/z0;
    .locals 3

    .prologue
    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    check-cast v0, LW8/z0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final n(LW8/z0;ZLW8/E0;)LW8/f0;
    .locals 2

    .prologue
    instance-of v0, p0, LW8/F0;

    if-eqz v0, :cond_0

    check-cast p0, LW8/F0;

    invoke-virtual {p0, p1, p2}, LW8/F0;->j0(ZLW8/E0;)LW8/f0;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LW8/E0;->w()Z

    move-result v0

    new-instance v1, LW8/D0$a;

    invoke-direct {v1, p2}, LW8/D0$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p0, v0, p1, v1}, LW8/z0;->E0(ZZLx7/l;)LW8/f0;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static synthetic o(LW8/z0;ZLW8/E0;ILjava/lang/Object;)LW8/f0;
    .locals 0

    .prologue
    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    move p1, p4

    :cond_0
    invoke-static {p0, p1, p2}, LW8/C0;->n(LW8/z0;ZLW8/E0;)LW8/f0;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lm7/i;)Z
    .locals 1

    .prologue
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
