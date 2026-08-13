.class final Lcom/google/android/gms/internal/ads/R40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/kY;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/S40;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/S40;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/R40;->a:Lcom/google/android/gms/internal/ads/S40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/R40;->a:Lcom/google/android/gms/internal/ads/S40;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R40;->a:Lcom/google/android/gms/internal/ads/S40;

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/google/android/gms/internal/ads/S40;->M:Lcom/google/android/gms/internal/ads/Ky;

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
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/R40;->a:Lcom/google/android/gms/internal/ads/S40;

    check-cast p1, Lcom/google/android/gms/internal/ads/Ky;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R40;->a:Lcom/google/android/gms/internal/ads/S40;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/S40;->M:Lcom/google/android/gms/internal/ads/Ky;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/fA;->a()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R40;->a:Lcom/google/android/gms/internal/ads/S40;

    iput-object p1, v1, Lcom/google/android/gms/internal/ads/S40;->M:Lcom/google/android/gms/internal/ads/Ky;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/Ky;->j(Lcom/google/android/gms/internal/ads/zc;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/R40;->a:Lcom/google/android/gms/internal/ads/S40;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/S40;->p6(Lcom/google/android/gms/internal/ads/S40;)Lcom/google/android/gms/internal/ads/K40;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/Ly;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/S40;->p6(Lcom/google/android/gms/internal/ads/S40;)Lcom/google/android/gms/internal/ads/K40;

    move-result-object v4

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/S40;->o6(Lcom/google/android/gms/internal/ads/S40;)Lcom/google/android/gms/internal/ads/eO;

    move-result-object v5

    invoke-direct {v3, p1, v1, v4, v5}, Lcom/google/android/gms/internal/ads/Ly;-><init>(Lcom/google/android/gms/internal/ads/Ky;Ls3/V;Lcom/google/android/gms/internal/ads/K40;Lcom/google/android/gms/internal/ads/eO;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/K40;->c(Lcom/google/android/gms/internal/ads/Hc;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->b()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
