.class public final Lcom/google/android/gms/internal/ads/WG;
.super Lcom/google/android/gms/internal/ads/BF;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/yj;


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/BF;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/TG;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/TG;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    return-void
.end method

.method public final declared-synchronized c()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/SG;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/SG;-><init>()V

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

.method public final v0(Lcom/google/android/gms/internal/ads/op;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/VG;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/VG;-><init>(Lcom/google/android/gms/internal/ads/op;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    return-void
.end method
