.class public abstract LW8/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW8/a0;I)V
    .locals 3

    .prologue
    invoke-virtual {p0}, LW8/a0;->c()Lm7/e;

    move-result-object v0

    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    instance-of v2, v0, Lb9/h;

    if-eqz v2, :cond_2

    invoke-static {p1}, LW8/b0;->b(I)Z

    move-result p1

    iget v2, p0, LW8/a0;->E:I

    invoke-static {v2}, LW8/b0;->b(I)Z

    move-result v2

    if-ne p1, v2, :cond_2

    check-cast v0, Lb9/h;

    iget-object p1, v0, Lb9/h;->F:LW8/J;

    invoke-virtual {v0}, Lb9/h;->getContext()Lm7/i;

    move-result-object v0

    invoke-virtual {p1, v0}, LW8/J;->v1(Lm7/i;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0, p0}, LW8/J;->t1(Lm7/i;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    invoke-static {p0}, LW8/b0;->e(LW8/a0;)V

    goto :goto_1

    :cond_2
    invoke-static {p0, v0, v1}, LW8/b0;->d(LW8/a0;Lm7/e;Z)V

    :goto_1
    return-void
.end method

.method public static final b(I)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public static final c(I)Z
    .locals 1

    .prologue
    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(LW8/a0;Lm7/e;Z)V
    .locals 3

    .prologue
    invoke-virtual {p0}, LW8/a0;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LW8/a0;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object p0, Li7/w;->D:Li7/w$a;

    invoke-static {v1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_0
    sget-object v1, Li7/w;->D:Li7/w$a;

    invoke-virtual {p0, v0}, LW8/a0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :goto_1
    if-eqz p2, :cond_5

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lb9/h;

    iget-object p2, p1, Lb9/h;->G:Lm7/e;

    iget-object v0, p1, Lb9/h;->I:Ljava/lang/Object;

    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object v1

    invoke-static {v1, v0}, Lb9/K;->i(Lm7/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lb9/K;->a:Lb9/D;

    if-eq v0, v2, :cond_1

    invoke-static {p2, v1, v0}, LW8/H;->m(Lm7/e;Lm7/i;Ljava/lang/Object;)LW8/c1;

    move-result-object p2

    goto :goto_2

    :cond_1
    const/4 p2, 0x0

    :goto_2
    :try_start_0
    iget-object p1, p1, Lb9/h;->G:Lm7/e;

    invoke-interface {p1, p0}, Lm7/e;->t(Ljava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, LW8/c1;->k1()Z

    move-result p0

    if-eqz p0, :cond_6

    :cond_2
    invoke-static {v1, v0}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    goto :goto_3

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, LW8/c1;->k1()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-static {v1, v0}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    :cond_4
    throw p0

    :cond_5
    invoke-interface {p1, p0}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    return-void
.end method

.method private static final e(LW8/a0;)V
    .locals 3

    .prologue
    sget-object v0, LW8/X0;->a:LW8/X0;

    invoke-virtual {v0}, LW8/X0;->b()LW8/j0;

    move-result-object v0

    invoke-virtual {v0}, LW8/j0;->G1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, LW8/j0;->C1(LW8/a0;)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LW8/j0;->E1(Z)V

    :try_start_0
    invoke-virtual {p0}, LW8/a0;->c()Lm7/e;

    move-result-object v2

    invoke-static {p0, v2, v1}, LW8/b0;->d(LW8/a0;Lm7/e;Z)V

    :cond_1
    invoke-virtual {v0}, LW8/j0;->J1()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    :goto_0
    invoke-virtual {v0, v1}, LW8/j0;->z1(Z)V

    goto :goto_1

    :catchall_0
    move-exception v2

    :try_start_1
    invoke-virtual {p0, v2}, LW8/a0;->h(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :goto_1
    return-void

    :catchall_1
    move-exception p0

    invoke-virtual {v0, v1}, LW8/j0;->z1(Z)V

    throw p0
.end method
