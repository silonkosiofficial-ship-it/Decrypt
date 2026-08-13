.class public abstract Lcom/google/android/gms/internal/ads/Nk0;
.super Lcom/google/android/gms/internal/ads/Pk0;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/Lk0;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/Lk0;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ci0;->E(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Lcom/google/android/gms/internal/ads/Lk0;-><init>(ZLcom/google/android/gms/internal/ads/ci0;Lcom/google/android/gms/internal/ads/Mk0;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/Lk0;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/Lk0;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ci0;->E(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v2, p0, v1}, Lcom/google/android/gms/internal/ads/Lk0;-><init>(ZLcom/google/android/gms/internal/ads/ci0;Lcom/google/android/gms/internal/ads/Mk0;)V

    return-object v0
.end method

.method public static varargs c([LP4/d;)Lcom/google/android/gms/internal/ads/Lk0;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/Lk0;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ci0;->N([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v2, p0, v1}, Lcom/google/android/gms/internal/ads/Lk0;-><init>(ZLcom/google/android/gms/internal/ads/ci0;Lcom/google/android/gms/internal/ads/Mk0;)V

    return-object v0
.end method

.method public static d(Ljava/lang/Iterable;)LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/uk0;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ci0;->E(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/uk0;-><init>(Lcom/google/android/gms/internal/ads/Xh0;Z)V

    return-object v0
.end method

.method public static e(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Nj0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/Nj0;-><init>(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/pg0;)V

    invoke-static {p3, v0}, Lcom/google/android/gms/internal/ads/fl0;->d(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/ak0;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Mj0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/Mj0;-><init>(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;)V

    invoke-static {p3, v0}, Lcom/google/android/gms/internal/ads/fl0;->d(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/ak0;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static g(Ljava/lang/Throwable;)LP4/d;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/google/android/gms/internal/ads/Qk0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Qk0;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static h(Ljava/lang/Object;)LP4/d;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/ads/Rk0;->D:LP4/d;

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/Rk0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Rk0;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static i()LP4/d;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Rk0;->D:LP4/d;

    return-object v0
.end method

.method public static j(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)LP4/d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/pl0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/pl0;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static k(Lcom/google/android/gms/internal/ads/sk0;Ljava/util/concurrent/Executor;)LP4/d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/pl0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/pl0;-><init>(Lcom/google/android/gms/internal/ads/sk0;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static varargs l([LP4/d;)LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/uk0;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/ci0;->N([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/uk0;-><init>(Lcom/google/android/gms/internal/ads/Xh0;Z)V

    return-object v0
.end method

.method public static m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/ik0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/ik0;-><init>(LP4/d;Lcom/google/android/gms/internal/ads/pg0;)V

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/fl0;->d(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/ak0;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;
    .locals 1

    sget v0, Lcom/google/android/gms/internal/ads/jk0;->L:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/google/android/gms/internal/ads/hk0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/hk0;-><init>(LP4/d;Lcom/google/android/gms/internal/ads/tk0;)V

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/fl0;->d(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/ak0;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;
    .locals 1

    .prologue
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/ml0;->F(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/rl0;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "Future was expected to be done: %s"

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/ads/Sg0;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static q(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 1

    .prologue
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/rl0;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Error;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/Bk0;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Ljava/lang/Error;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/Bk0;-><init>(Ljava/lang/Error;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/ql0;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/ql0;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/google/android/gms/internal/ads/Kk0;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Kk0;-><init>(Ljava/util/concurrent/Future;Lcom/google/android/gms/internal/ads/Jk0;)V

    invoke-interface {p0, v0, p2}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
