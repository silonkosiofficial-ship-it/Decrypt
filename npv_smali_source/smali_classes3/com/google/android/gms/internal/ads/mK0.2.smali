.class public final Lcom/google/android/gms/internal/ads/mK0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lcom/google/android/gms/internal/ads/fK0;

.field public static final e:Lcom/google/android/gms/internal/ads/fK0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/vK0;

.field private b:Lcom/google/android/gms/internal/ads/gK0;

.field private c:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/fK0;

    const/4 v1, 0x2

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/fK0;-><init>(IJLcom/google/android/gms/internal/ads/lK0;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/mK0;->d:Lcom/google/android/gms/internal/ads/fK0;

    new-instance v0, Lcom/google/android/gms/internal/ads/fK0;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/fK0;-><init>(IJLcom/google/android/gms/internal/ads/lK0;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/mK0;->e:Lcom/google/android/gms/internal/ads/fK0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/ads/CV;

    const-string v0, "ExoPlayer:Loader:ProgressiveMediaPeriod"

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/CV;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/dK0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/dK0;-><init>()V

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/tK0;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/rF;)Lcom/google/android/gms/internal/ads/vK0;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mK0;->a:Lcom/google/android/gms/internal/ads/vK0;

    return-void
.end method

.method public static b(ZJ)Lcom/google/android/gms/internal/ads/fK0;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/fK0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/fK0;-><init>(IJLcom/google/android/gms/internal/ads/lK0;)V

    return-object v0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/mK0;)Lcom/google/android/gms/internal/ads/gK0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/mK0;->b:Lcom/google/android/gms/internal/ads/gK0;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/mK0;)Lcom/google/android/gms/internal/ads/vK0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/mK0;->a:Lcom/google/android/gms/internal/ads/vK0;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/mK0;Lcom/google/android/gms/internal/ads/gK0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mK0;->b:Lcom/google/android/gms/internal/ads/gK0;

    return-void
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/mK0;Ljava/io/IOException;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mK0;->c:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/hK0;Lcom/google/android/gms/internal/ads/eK0;I)J
    .locals 11

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/mK0;->c:Ljava/io/IOException;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    new-instance v10, Lcom/google/android/gms/internal/ads/gK0;

    move-object v0, v10

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-wide v6, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/gK0;-><init>(Lcom/google/android/gms/internal/ads/mK0;Landroid/os/Looper;Lcom/google/android/gms/internal/ads/hK0;Lcom/google/android/gms/internal/ads/eK0;IJ)V

    const-wide/16 p1, 0x0

    invoke-virtual {v10, p1, p2}, Lcom/google/android/gms/internal/ads/gK0;->c(J)V

    return-wide v8
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mK0;->b:Lcom/google/android/gms/internal/ads/gK0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gK0;->a(Z)V

    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/mK0;->c:Ljava/io/IOException;

    return-void
.end method

.method public final i(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mK0;->c:Ljava/io/IOException;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mK0;->b:Lcom/google/android/gms/internal/ads/gK0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/gK0;->b(I)V

    :cond_0
    return-void

    :cond_1
    throw v0
.end method

.method public final j(Lcom/google/android/gms/internal/ads/iK0;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mK0;->b:Lcom/google/android/gms/internal/ads/gK0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/gK0;->a(Z)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mK0;->a:Lcom/google/android/gms/internal/ads/vK0;

    new-instance v1, Lcom/google/android/gms/internal/ads/jK0;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/jK0;-><init>(Lcom/google/android/gms/internal/ads/iK0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/mK0;->a:Lcom/google/android/gms/internal/ads/vK0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/vK0;->a()V

    return-void
.end method

.method public final k()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mK0;->c:Ljava/io/IOException;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mK0;->b:Lcom/google/android/gms/internal/ads/gK0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
