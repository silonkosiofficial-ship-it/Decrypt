.class public final Lcom/google/android/gms/internal/ads/OG;
.super Lcom/google/android/gms/internal/ads/BF;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/BF;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/NG;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/NG;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V
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
