.class final Lcom/google/android/gms/internal/ads/eY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/kY;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/fY;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/fY;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eY;->a:Lcom/google/android/gms/internal/ads/fY;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eY;->a:Lcom/google/android/gms/internal/ads/fY;

    monitor-enter v0

    :try_start_0
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
    .locals 3

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/fA;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eY;->a:Lcom/google/android/gms/internal/ads/fY;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eY;->a:Lcom/google/android/gms/internal/ads/fY;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->c()Lcom/google/android/gms/internal/ads/xC;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/fY;->c(Lcom/google/android/gms/internal/ads/fY;Ls3/U0;)V

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
