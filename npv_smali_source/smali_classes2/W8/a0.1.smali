.class public abstract LW8/a0;
.super Ld9/h;
.source "SourceFile"


# instance fields
.field public E:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ld9/h;-><init>()V

    iput p1, p0, LW8/a0;->E:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public abstract c()Lm7/e;
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    .prologue
    instance-of v0, p1, LW8/A;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LW8/A;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, LW8/A;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method public g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final h(Ljava/lang/Throwable;)V
    .locals 3

    new-instance v0, LW8/Q;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fatal exception in coroutines machinery for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LW8/Q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, LW8/a0;->c()Lm7/e;

    move-result-object p1

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object p1

    invoke-static {p1, v0}, LW8/L;->a(Lm7/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public abstract i()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 9

    .prologue
    :try_start_0
    invoke-virtual {p0}, LW8/a0;->c()Lm7/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb9/h;

    iget-object v1, v0, Lb9/h;->G:Lm7/e;

    iget-object v0, v0, Lb9/h;->I:Ljava/lang/Object;

    invoke-interface {v1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v2

    invoke-static {v2, v0}, Lb9/K;->i(Lm7/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lb9/K;->a:Lb9/D;

    const/4 v4, 0x0

    if-eq v0, v3, :cond_0

    invoke-static {v1, v2, v0}, LW8/H;->m(Lm7/e;Lm7/i;Ljava/lang/Object;)LW8/c1;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    move-object v3, v4

    :goto_0
    :try_start_1
    invoke-interface {v1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v5

    invoke-virtual {p0}, LW8/a0;->i()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v6}, LW8/a0;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-nez v7, :cond_1

    iget v8, p0, LW8/a0;->E:I

    invoke-static {v8}, LW8/b0;->b(I)Z

    move-result v8

    if-eqz v8, :cond_1

    sget-object v4, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v5, v4}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v4

    check-cast v4, LW8/z0;

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_4

    :cond_1
    :goto_1
    if-eqz v4, :cond_2

    invoke-interface {v4}, LW8/z0;->f()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-interface {v4}, LW8/z0;->e0()Ljava/util/concurrent/CancellationException;

    move-result-object v4

    invoke-virtual {p0, v6, v4}, LW8/a0;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object v5, Li7/w;->D:Li7/w$a;

    invoke-static {v4}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :goto_2
    invoke-interface {v1, v4}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    if-eqz v7, :cond_3

    sget-object v4, Li7/w;->D:Li7/w$a;

    invoke-static {v7}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_2

    :cond_3
    sget-object v4, Li7/w;->D:Li7/w$a;

    invoke-virtual {p0, v6}, LW8/a0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_2

    :goto_3
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_4

    :try_start_2
    invoke-virtual {v3}, LW8/c1;->k1()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_4
    invoke-static {v2, v0}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    goto :goto_6

    :goto_4
    if-eqz v3, :cond_5

    invoke-virtual {v3}, LW8/c1;->k1()Z

    move-result v3

    if-eqz v3, :cond_6

    :cond_5
    invoke-static {v2, v0}, Lb9/K;->f(Lm7/i;Ljava/lang/Object;)V

    :cond_6
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_5
    invoke-virtual {p0, v0}, LW8/a0;->h(Ljava/lang/Throwable;)V

    :cond_7
    :goto_6
    return-void
.end method
