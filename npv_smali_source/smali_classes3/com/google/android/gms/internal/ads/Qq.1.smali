.class final Lcom/google/android/gms/internal/ads/Qq;
.super Lv3/B;
.source "SourceFile"


# instance fields
.field final synthetic c:Lcom/google/android/gms/internal/ads/Uq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Uq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Qq;->c:Lcom/google/android/gms/internal/ads/Uq;

    invoke-direct {p0}, Lv3/B;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/Df;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Qq;->c:Lcom/google/android/gms/internal/ads/Uq;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Uq;->d(Lcom/google/android/gms/internal/ads/Uq;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Uq;->k(Lcom/google/android/gms/internal/ads/Uq;)Lw3/a;

    move-result-object v1

    iget-object v1, v1, Lw3/a;->C:Ljava/lang/String;

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/Df;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Qq;->c:Lcom/google/android/gms/internal/ads/Uq;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Uq;->n(Lcom/google/android/gms/internal/ads/Uq;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lr3/v;->h()Lcom/google/android/gms/internal/ads/Gf;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Qq;->c:Lcom/google/android/gms/internal/ads/Uq;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/Uq;->g(Lcom/google/android/gms/internal/ads/Uq;)Lcom/google/android/gms/internal/ads/Ff;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/Gf;->a(Lcom/google/android/gms/internal/ads/Ff;Lcom/google/android/gms/internal/ads/Df;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    const-string v2, "Cannot config CSI reporter."

    invoke-static {v2, v0}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
