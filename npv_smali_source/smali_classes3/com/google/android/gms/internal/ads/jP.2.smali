.class final Lcom/google/android/gms/internal/ads/jP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/pP;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/pP;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jP;->a:Lcom/google/android/gms/internal/ads/pP;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 6

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jP;->a:Lcom/google/android/gms/internal/ads/pP;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/pP;->i(Lcom/google/android/gms/internal/ads/pP;Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jP;->a:Lcom/google/android/gms/internal/ads/pP;

    const-string v0, "com.google.android.gms.ads.MobileAds"

    const-string v1, "Internal Error."

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->c()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/jP;->a:Lcom/google/android/gms/internal/ads/pP;

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/pP;->a(Lcom/google/android/gms/internal/ads/pP;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v2, v2

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/pP;->k(Lcom/google/android/gms/internal/ads/pP;Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jP;->a:Lcom/google/android/gms/internal/ads/pP;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/pP;->b(Lcom/google/android/gms/internal/ads/pP;)Lcom/google/android/gms/internal/ads/mr;

    move-result-object p1

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 8

    .prologue
    check-cast p1, Ljava/lang/String;

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jP;->a:Lcom/google/android/gms/internal/ads/pP;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/pP;->i(Lcom/google/android/gms/internal/ads/pP;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jP;->a:Lcom/google/android/gms/internal/ads/pP;

    const-string v2, "com.google.android.gms.ads.MobileAds"

    const-string v3, ""

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v4

    invoke-interface {v4}, LV3/f;->c()J

    move-result-wide v4

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/jP;->a:Lcom/google/android/gms/internal/ads/pP;

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/pP;->a(Lcom/google/android/gms/internal/ads/pP;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v0, v2, v1, v3, v4}, Lcom/google/android/gms/internal/ads/pP;->k(Lcom/google/android/gms/internal/ads/pP;Ljava/lang/String;ZLjava/lang/String;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jP;->a:Lcom/google/android/gms/internal/ads/pP;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/pP;->h(Lcom/google/android/gms/internal/ads/pP;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/iP;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/iP;-><init>(Lcom/google/android/gms/internal/ads/jP;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
