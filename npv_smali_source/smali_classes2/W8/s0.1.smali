.class public abstract LW8/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW8/J;)Ljava/util/concurrent/Executor;
    .locals 1

    .prologue
    instance-of v0, p0, LW8/q0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LW8/q0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LW8/q0;->z1()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, LW8/c0;

    invoke-direct {v0, p0}, LW8/c0;-><init>(LW8/J;)V

    :cond_2
    return-object v0
.end method

.method public static final b(Ljava/util/concurrent/Executor;)LW8/J;
    .locals 1

    .prologue
    instance-of v0, p0, LW8/c0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LW8/c0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, LW8/c0;->C:LW8/J;

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, LW8/r0;

    invoke-direct {v0, p0}, LW8/r0;-><init>(Ljava/util/concurrent/Executor;)V

    :cond_2
    return-object v0
.end method

.method public static final c(Ljava/util/concurrent/ExecutorService;)LW8/q0;
    .locals 1

    new-instance v0, LW8/r0;

    invoke-direct {v0, p0}, LW8/r0;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
