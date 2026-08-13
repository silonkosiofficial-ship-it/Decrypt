.class final Lcom/google/android/gms/internal/ads/bY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/kY;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/cY;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/cY;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bY;->a:Lcom/google/android/gms/internal/ads/cY;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bY;->a:Lcom/google/android/gms/internal/ads/cY;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bY;->a:Lcom/google/android/gms/internal/ads/cY;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/cY;->p6(Lcom/google/android/gms/internal/ads/cY;Lcom/google/android/gms/internal/ads/lH;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bY;->a:Lcom/google/android/gms/internal/ads/cY;

    check-cast p1, Lcom/google/android/gms/internal/ads/lH;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bY;->a:Lcom/google/android/gms/internal/ads/cY;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/cY;->p6(Lcom/google/android/gms/internal/ads/cY;Lcom/google/android/gms/internal/ads/lH;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/bY;->a:Lcom/google/android/gms/internal/ads/cY;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/cY;->o6(Lcom/google/android/gms/internal/ads/cY;)Lcom/google/android/gms/internal/ads/lH;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->b()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
