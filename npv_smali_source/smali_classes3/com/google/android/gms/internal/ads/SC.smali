.class public final Lcom/google/android/gms/internal/ads/SC;
.super Lcom/google/android/gms/internal/ads/BF;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/IC;


# instance fields
.field private final D:Ljava/util/concurrent/ScheduledExecutorService;

.field private E:Ljava/util/concurrent/ScheduledFuture;

.field private F:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/RC;Ljava/util/Set;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/BF;-><init>(Ljava/util/Set;)V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/SC;->F:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/SC;->D:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-super {p0, p1, p3}, Lcom/google/android/gms/internal/ads/BF;->F0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method public final F(Lcom/google/android/gms/internal/ads/YH;)V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/SC;->F:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SC;->E:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/NC;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/NC;-><init>(Lcom/google/android/gms/internal/ads/YH;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    return-void
.end method

.method public final b()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/KC;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/KC;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    return-void
.end method

.method public final declared-synchronized d()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SC;->E:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final e()V
    .locals 5

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Ca:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    new-instance v1, Lcom/google/android/gms/internal/ads/MC;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/MC;-><init>(Lcom/google/android/gms/internal/ads/SC;)V

    int-to-long v2, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SC;->D:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/SC;->E:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public final p(Ls3/W0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/JC;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/JC;-><init>(Ls3/W0;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    return-void
.end method

.method final synthetic q1()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "Timeout waiting for show call succeed to be called."

    invoke-static {v0}, Lw3/p;->d(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/YH;

    const-string v1, "Timeout for show call succeed."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/YH;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/SC;->F(Lcom/google/android/gms/internal/ads/YH;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/SC;->F:Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
