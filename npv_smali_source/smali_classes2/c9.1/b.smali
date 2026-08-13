.class public abstract Lc9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/p;Ljava/lang/Object;Lm7/e;)V
    .locals 3

    .prologue
    invoke-static {p2}, Lo7/h;->a(Lm7/e;)Lm7/e;

    move-result-object p2

    :try_start_0
    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb9/K;->i(Lm7/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p2}, Lo7/h;->b(Lm7/e;)V

    instance-of v2, p0, Lo7/a;

    if-nez v2, :cond_0

    invoke-static {p0, p1, p2}, Ln7/b;->e(Lx7/p;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    const/4 v2, 0x2

    invoke-static {p0, v2}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx7/p;

    invoke-interface {p0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-static {v0, v1}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-eq p0, p1, :cond_1

    invoke-static {p0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_1
    return-void

    :catchall_1
    move-exception p0

    goto :goto_2

    :goto_1
    :try_start_3
    invoke-static {v0, v1}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    sget-object p1, Li7/w;->D:Li7/w$a;

    invoke-static {p0}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method

.method public static final b(Lb9/z;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x2

    :try_start_0
    instance-of v1, p2, Lo7/a;

    if-nez v1, :cond_0

    invoke-static {p2, p1, p0}, Ln7/b;->e(Lx7/p;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {p2, v0}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx7/p;

    invoke-interface {p2, p1, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    new-instance p2, LW8/A;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, p1, v1, v0, v2}, LW8/A;-><init>(Ljava/lang/Throwable;ZILy7/k;)V

    move-object p1, p2

    :goto_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    :goto_2
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p0

    goto :goto_3

    :cond_1
    invoke-virtual {p0, p1}, LW8/F0;->v0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, LW8/G0;->b:Lb9/D;

    if-ne p0, p1, :cond_2

    goto :goto_2

    :cond_2
    instance-of p1, p0, LW8/A;

    if-nez p1, :cond_3

    invoke-static {p0}, LW8/G0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_3
    return-object p0

    :cond_3
    check-cast p0, LW8/A;

    iget-object p0, p0, LW8/A;->a:Ljava/lang/Throwable;

    throw p0
.end method

.method public static final c(Lb9/z;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x2

    :try_start_0
    instance-of v1, p2, Lo7/a;

    if-nez v1, :cond_0

    invoke-static {p2, p1, p0}, Ln7/b;->e(Lx7/p;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {p2, v0}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx7/p;

    invoke-interface {p2, p1, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    new-instance p2, LW8/A;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, p1, v1, v0, v2}, LW8/A;-><init>(Ljava/lang/Throwable;ZILy7/k;)V

    move-object p1, p2

    :goto_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    :goto_2
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p0

    goto :goto_4

    :cond_1
    invoke-virtual {p0, p1}, LW8/F0;->v0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LW8/G0;->b:Lb9/D;

    if-ne p2, v0, :cond_2

    goto :goto_2

    :cond_2
    instance-of v0, p2, LW8/A;

    if-eqz v0, :cond_5

    check-cast p2, LW8/A;

    iget-object p2, p2, LW8/A;->a:Ljava/lang/Throwable;

    instance-of v0, p2, LW8/Y0;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, LW8/Y0;

    iget-object v0, v0, LW8/Y0;->C:LW8/z0;

    if-ne v0, p0, :cond_4

    instance-of p0, p1, LW8/A;

    if-nez p0, :cond_3

    goto :goto_3

    :cond_3
    check-cast p1, LW8/A;

    iget-object p0, p1, LW8/A;->a:Ljava/lang/Throwable;

    throw p0

    :cond_4
    throw p2

    :cond_5
    invoke-static {p2}, LW8/G0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    move-object p0, p1

    :goto_4
    return-object p0
.end method
