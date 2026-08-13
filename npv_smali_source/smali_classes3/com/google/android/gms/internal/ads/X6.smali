.class public final Lcom/google/android/gms/internal/ads/X6;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field private final C:Ljava/util/concurrent/BlockingQueue;

.field private final D:Lcom/google/android/gms/internal/ads/W6;

.field private final E:Lcom/google/android/gms/internal/ads/N6;

.field private volatile F:Z

.field private final G:Lcom/google/android/gms/internal/ads/U6;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Lcom/google/android/gms/internal/ads/W6;Lcom/google/android/gms/internal/ads/N6;Lcom/google/android/gms/internal/ads/U6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/X6;->F:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/X6;->C:Ljava/util/concurrent/BlockingQueue;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/X6;->D:Lcom/google/android/gms/internal/ads/W6;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/X6;->E:Lcom/google/android/gms/internal/ads/N6;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/X6;->G:Lcom/google/android/gms/internal/ads/U6;

    return-void
.end method

.method private b()V
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/X6;->C:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/d7;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/d7;->C(I)V

    const/4 v1, 0x4

    :try_start_0
    const-string v2, "network-queue-take"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->F()Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->g()I

    move-result v2

    invoke-static {v2}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/X6;->D:Lcom/google/android/gms/internal/ads/W6;

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/W6;->a(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/Z6;

    move-result-object v2

    const-string v3, "network-http-complete"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    iget-boolean v3, v2, Lcom/google/android/gms/internal/ads/Z6;->e:Z

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->E()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v2, "not-modified"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/d7;->y(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->A()V

    goto :goto_3

    :catchall_0
    move-exception v2

    goto :goto_4

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_2

    :cond_0
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/d7;->q(Lcom/google/android/gms/internal/ads/Z6;)Lcom/google/android/gms/internal/ads/h7;

    move-result-object v2

    const-string v3, "network-parse-complete"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/h7;->b:Lcom/google/android/gms/internal/ads/M6;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/X6;->E:Lcom/google/android/gms/internal/ads/N6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->s()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/h7;->b:Lcom/google/android/gms/internal/ads/M6;

    invoke-interface {v3, v4, v5}, Lcom/google/android/gms/internal/ads/N6;->q(Ljava/lang/String;Lcom/google/android/gms/internal/ads/M6;)V

    const-string v3, "network-cache-written"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->z()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/X6;->G:Lcom/google/android/gms/internal/ads/U6;

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v2, v4}, Lcom/google/android/gms/internal/ads/U6;->b(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/h7;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/d7;->B(Lcom/google/android/gms/internal/ads/h7;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/k7; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_0
    :try_start_1
    const-string v3, "Unhandled exception %s"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    invoke-static {v2, v3, v5}, Lcom/google/android/gms/internal/ads/n7;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/k7;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/k7;-><init>(Ljava/lang/Throwable;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/X6;->G:Lcom/google/android/gms/internal/ads/U6;

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/ads/U6;->a(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/k7;)V

    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->A()V

    goto :goto_3

    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/X6;->G:Lcom/google/android/gms/internal/ads/U6;

    invoke-virtual {v3, v0, v2}, Lcom/google/android/gms/internal/ads/U6;->a(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/k7;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_3
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/d7;->C(I)V

    return-void

    :goto_4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/d7;->C(I)V

    throw v2
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/X6;->F:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public final run()V
    .locals 2

    .prologue
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    :goto_0
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/X6;->b()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/X6;->F:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/n7;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
