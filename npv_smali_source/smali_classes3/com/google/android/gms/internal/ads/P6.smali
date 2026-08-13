.class public final Lcom/google/android/gms/internal/ads/P6;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field private static final I:Z


# instance fields
.field private final C:Ljava/util/concurrent/BlockingQueue;

.field private final D:Ljava/util/concurrent/BlockingQueue;

.field private final E:Lcom/google/android/gms/internal/ads/N6;

.field private volatile F:Z

.field private final G:Lcom/google/android/gms/internal/ads/o7;

.field private final H:Lcom/google/android/gms/internal/ads/U6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/ads/n7;->b:Z

    sput-boolean v0, Lcom/google/android/gms/internal/ads/P6;->I:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/google/android/gms/internal/ads/N6;Lcom/google/android/gms/internal/ads/U6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/P6;->F:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/P6;->C:Ljava/util/concurrent/BlockingQueue;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/P6;->D:Ljava/util/concurrent/BlockingQueue;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/P6;->E:Lcom/google/android/gms/internal/ads/N6;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/P6;->H:Lcom/google/android/gms/internal/ads/U6;

    new-instance p1, Lcom/google/android/gms/internal/ads/o7;

    invoke-direct {p1, p0, p2, p4}, Lcom/google/android/gms/internal/ads/o7;-><init>(Lcom/google/android/gms/internal/ads/P6;Ljava/util/concurrent/BlockingQueue;Lcom/google/android/gms/internal/ads/U6;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/P6;->G:Lcom/google/android/gms/internal/ads/o7;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/P6;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/P6;->D:Ljava/util/concurrent/BlockingQueue;

    return-object p0
.end method

.method private c()V
    .locals 11

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/P6;->C:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/d7;

    const-string v1, "cache-queue-take"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/d7;->C(I)V

    const/4 v2, 0x2

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->F()Z

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/P6;->E:Lcom/google/android/gms/internal/ads/N6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->s()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/N6;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/M6;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v1, "cache-miss"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/P6;->G:Lcom/google/android/gms/internal/ads/o7;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/o7;->c(Lcom/google/android/gms/internal/ads/d7;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/P6;->D:Ljava/util/concurrent/BlockingQueue;

    :goto_0
    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    goto/16 :goto_2

    :catchall_0
    move-exception v1

    goto/16 :goto_3

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/M6;->a(J)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v1, "cache-hit-expired"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/d7;->m(Lcom/google/android/gms/internal/ads/M6;)Lcom/google/android/gms/internal/ads/d7;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/P6;->G:Lcom/google/android/gms/internal/ads/o7;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/o7;->c(Lcom/google/android/gms/internal/ads/d7;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/P6;->D:Ljava/util/concurrent/BlockingQueue;

    goto :goto_0

    :cond_1
    const-string v6, "cache-hit"

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    new-instance v6, Lcom/google/android/gms/internal/ads/Z6;

    iget-object v7, v3, Lcom/google/android/gms/internal/ads/M6;->a:[B

    iget-object v8, v3, Lcom/google/android/gms/internal/ads/M6;->g:Ljava/util/Map;

    invoke-direct {v6, v7, v8}, Lcom/google/android/gms/internal/ads/Z6;-><init>([BLjava/util/Map;)V

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/d7;->q(Lcom/google/android/gms/internal/ads/Z6;)Lcom/google/android/gms/internal/ads/h7;

    move-result-object v6

    const-string v7, "cache-hit-parsed"

    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/h7;->c()Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_2

    const-string v3, "cache-parsing-failed"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/P6;->E:Lcom/google/android/gms/internal/ads/N6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->s()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Lcom/google/android/gms/internal/ads/N6;->p(Ljava/lang/String;Z)V

    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/d7;->m(Lcom/google/android/gms/internal/ads/M6;)Lcom/google/android/gms/internal/ads/d7;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/P6;->G:Lcom/google/android/gms/internal/ads/o7;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/o7;->c(Lcom/google/android/gms/internal/ads/d7;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/P6;->D:Ljava/util/concurrent/BlockingQueue;

    goto :goto_0

    :cond_2
    iget-wide v9, v3, Lcom/google/android/gms/internal/ads/M6;->f:J

    cmp-long v4, v9, v4

    if-gez v4, :cond_4

    const-string v4, "cache-hit-refresh-needed"

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/d7;->m(Lcom/google/android/gms/internal/ads/M6;)Lcom/google/android/gms/internal/ads/d7;

    iput-boolean v1, v6, Lcom/google/android/gms/internal/ads/h7;->d:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/P6;->G:Lcom/google/android/gms/internal/ads/o7;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/o7;->c(Lcom/google/android/gms/internal/ads/d7;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/P6;->H:Lcom/google/android/gms/internal/ads/U6;

    new-instance v3, Lcom/google/android/gms/internal/ads/O6;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/O6;-><init>(Lcom/google/android/gms/internal/ads/P6;Lcom/google/android/gms/internal/ads/d7;)V

    invoke-virtual {v1, v0, v6, v3}, Lcom/google/android/gms/internal/ads/U6;->b(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/h7;Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/P6;->H:Lcom/google/android/gms/internal/ads/U6;

    :goto_1
    invoke-virtual {v1, v0, v6, v8}, Lcom/google/android/gms/internal/ads/U6;->b(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/h7;Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/P6;->H:Lcom/google/android/gms/internal/ads/U6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_5
    :goto_2
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/d7;->C(I)V

    return-void

    :goto_3
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/d7;->C(I)V

    throw v1
.end method


# virtual methods
.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/P6;->F:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public final run()V
    .locals 3

    .prologue
    sget-boolean v0, Lcom/google/android/gms/internal/ads/P6;->I:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "start new dispatcher"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/n7;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/P6;->E:Lcom/google/android/gms/internal/ads/N6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/N6;->b()V

    :goto_0
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/P6;->c()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/P6;->F:Z

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :cond_1
    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/n7;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
