.class public final Lcom/google/android/gms/internal/ads/sd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[B

.field private b:I

.field final synthetic c:Lcom/google/android/gms/internal/ads/ud;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ud;[BLcom/google/android/gms/internal/ads/td;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ud;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sd;->a:[B

    return-void
.end method

.method public static synthetic b(Lcom/google/android/gms/internal/ads/sd;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sd;->d()V

    return-void
.end method

.method private final declared-synchronized d()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ud;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/ud;->b:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ud;->a:Lcom/google/android/gms/internal/ads/Ib;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sd;->a:[B

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ib;->o0([B)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ud;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ud;->a:Lcom/google/android/gms/internal/ads/Ib;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ib;->K(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ud;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ud;->a:Lcom/google/android/gms/internal/ads/Ib;

    iget v1, p0, Lcom/google/android/gms/internal/ads/sd;->b:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ib;->D(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ud;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ud;->a:Lcom/google/android/gms/internal/ads/Ib;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Ib;->B0([I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ud;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ud;->a:Lcom/google/android/gms/internal/ads/Ib;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ib;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    const-string v1, "Clearcut log failed"

    invoke-static {v1, v0}, Lw3/p;->c(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/internal/ads/sd;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/sd;->b:I

    return-object p0
.end method

.method public final declared-synchronized c()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sd;->c:Lcom/google/android/gms/internal/ads/ud;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ud;->a(Lcom/google/android/gms/internal/ads/ud;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/rd;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/rd;-><init>(Lcom/google/android/gms/internal/ads/sd;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
