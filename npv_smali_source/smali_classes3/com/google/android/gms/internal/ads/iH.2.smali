.class public final Lcom/google/android/gms/internal/ads/iH;
.super Lcom/google/android/gms/internal/ads/BF;
.source "SourceFile"


# instance fields
.field private D:Z


# direct methods
.method protected constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/BF;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/fH;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/fH;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    return-void
.end method

.method public final b()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/eH;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/eH;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    return-void
.end method

.method public final declared-synchronized c()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/iH;->D:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/gH;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/gH;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/iH;->D:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/ads/hH;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/hH;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized q1()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/gH;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/gH;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/iH;->D:Z
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
