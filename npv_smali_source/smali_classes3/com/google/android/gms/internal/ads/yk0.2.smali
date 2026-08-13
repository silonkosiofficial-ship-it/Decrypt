.class abstract Lcom/google/android/gms/internal/ads/yk0;
.super Lcom/google/android/gms/internal/ads/Vk0;
.source "SourceFile"


# instance fields
.field private final E:Ljava/util/concurrent/Executor;

.field final synthetic F:Lcom/google/android/gms/internal/ads/zk0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zk0;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yk0;->F:Lcom/google/android/gms/internal/ads/zk0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Vk0;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yk0;->E:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method final d(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yk0;->F:Lcom/google/android/gms/internal/ads/zk0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zk0;->X(Lcom/google/android/gms/internal/ads/zk0;Lcom/google/android/gms/internal/ads/yk0;)V

    instance-of v0, p1, Ljava/util/concurrent/ExecutionException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yk0;->F:Lcom/google/android/gms/internal/ads/zk0;

    check-cast p1, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ak0;->h(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/yk0;->F:Lcom/google/android/gms/internal/ads/zk0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/ak0;->cancel(Z)Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yk0;->F:Lcom/google/android/gms/internal/ads/zk0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ak0;->h(Ljava/lang/Throwable;)Z

    return-void
.end method

.method final e(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yk0;->F:Lcom/google/android/gms/internal/ads/zk0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zk0;->X(Lcom/google/android/gms/internal/ads/zk0;Lcom/google/android/gms/internal/ads/yk0;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/yk0;->h(Ljava/lang/Object;)V

    return-void
.end method

.method final f()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yk0;->F:Lcom/google/android/gms/internal/ads/zk0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ak0;->isDone()Z

    move-result v0

    return v0
.end method

.method abstract h(Ljava/lang/Object;)V
.end method

.method final i()V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yk0;->E:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yk0;->F:Lcom/google/android/gms/internal/ads/zk0;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ak0;->h(Ljava/lang/Throwable;)Z

    return-void
.end method
