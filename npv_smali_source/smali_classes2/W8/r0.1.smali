.class public final LW8/r0;
.super LW8/q0;
.source "SourceFile"

# interfaces
.implements LW8/X;


# instance fields
.field private final F:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    .prologue
    invoke-direct {p0}, LW8/q0;-><init>()V

    iput-object p1, p0, LW8/r0;->F:Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, LW8/r0;->z1()Ljava/util/concurrent/Executor;

    move-result-object p1

    instance-of p1, p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LW8/r0;->z1()Ljava/util/concurrent/Executor;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    :cond_0
    return-void
.end method

.method private final A1(Lm7/i;Ljava/util/concurrent/RejectedExecutionException;)V
    .locals 1

    const-string v0, "The task was rejected"

    invoke-static {v0, p2}, LW8/o0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p2

    invoke-static {p1, p2}, LW8/C0;->d(Lm7/i;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method private final B1(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lm7/i;J)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    .prologue
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, p2, p4, p5, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p3, p1}, LW8/r0;->A1(Lm7/i;Ljava/util/concurrent/RejectedExecutionException;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public close()V
    .locals 2

    .prologue
    invoke-virtual {p0}, LW8/r0;->z1()Ljava/util/concurrent/Executor;

    move-result-object v0

    instance-of v1, v0, Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_1
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LW8/r0;

    if-eqz v0, :cond_0

    check-cast p1, LW8/r0;

    invoke-virtual {p1}, LW8/r0;->z1()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p0}, LW8/r0;->z1()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LW8/r0;->z1()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public m1(JLjava/lang/Runnable;Lm7/i;)LW8/f0;
    .locals 9

    .prologue
    invoke-virtual {p0}, LW8/r0;->z1()Ljava/util/concurrent/Executor;

    move-result-object v0

    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    if-eqz v4, :cond_1

    move-object v3, p0

    move-object v5, p3

    move-object v6, p4

    move-wide v7, p1

    invoke-direct/range {v3 .. v8}, LW8/r0;->B1(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lm7/i;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    new-instance p1, LW8/e0;

    invoke-direct {p1, v2}, LW8/e0;-><init>(Ljava/util/concurrent/Future;)V

    goto :goto_1

    :cond_2
    sget-object v0, LW8/T;->K:LW8/T;

    invoke-virtual {v0, p1, p2, p3, p4}, LW8/T;->m1(JLjava/lang/Runnable;Lm7/i;)LW8/f0;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public t1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    :try_start_0
    invoke-virtual {p0}, LW8/r0;->z1()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {}, LW8/c;->a()LW8/b;

    invoke-interface {v0, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, LW8/c;->a()LW8/b;

    invoke-direct {p0, p1, v0}, LW8/r0;->A1(Lm7/i;Ljava/util/concurrent/RejectedExecutionException;)V

    invoke-static {}, LW8/d0;->b()LW8/J;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LW8/J;->t1(Lm7/i;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LW8/r0;->z1()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x0(JLW8/l;)V
    .locals 9

    .prologue
    invoke-virtual {p0}, LW8/r0;->z1()Ljava/util/concurrent/Executor;

    move-result-object v0

    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    if-eqz v4, :cond_1

    new-instance v5, LW8/R0;

    invoke-direct {v5, p0, p3}, LW8/R0;-><init>(LW8/J;LW8/l;)V

    invoke-interface {p3}, Lm7/e;->getContext()Lm7/i;

    move-result-object v6

    move-object v3, p0

    move-wide v7, p1

    invoke-direct/range {v3 .. v8}, LW8/r0;->B1(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lm7/i;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    new-instance p1, LW8/j;

    invoke-direct {p1, v2}, LW8/j;-><init>(Ljava/util/concurrent/Future;)V

    invoke-static {p3, p1}, LW8/p;->c(LW8/l;LW8/k;)V

    return-void

    :cond_2
    sget-object v0, LW8/T;->K:LW8/T;

    invoke-virtual {v0, p1, p2, p3}, LW8/k0;->x0(JLW8/l;)V

    return-void
.end method

.method public z1()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, LW8/r0;->F:Ljava/util/concurrent/Executor;

    return-object v0
.end method
