.class final Lcom/google/android/gms/internal/ads/yX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/kY;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/zX;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zX;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yX;->a:Lcom/google/android/gms/internal/ads/zX;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yX;->a:Lcom/google/android/gms/internal/ads/zX;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yX;->a:Lcom/google/android/gms/internal/ads/zX;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zX;->p6(Lcom/google/android/gms/internal/ads/zX;Lcom/google/android/gms/internal/ads/Qy;)V

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yX;->a:Lcom/google/android/gms/internal/ads/zX;

    check-cast p1, Lcom/google/android/gms/internal/ads/Qy;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yX;->a:Lcom/google/android/gms/internal/ads/zX;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zX;->o6(Lcom/google/android/gms/internal/ads/zX;)Lcom/google/android/gms/internal/ads/Qy;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zX;->o6(Lcom/google/android/gms/internal/ads/zX;)Lcom/google/android/gms/internal/ads/Qy;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/fA;->a()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yX;->a:Lcom/google/android/gms/internal/ads/zX;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/zX;->p6(Lcom/google/android/gms/internal/ads/zX;Lcom/google/android/gms/internal/ads/Qy;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/yX;->a:Lcom/google/android/gms/internal/ads/zX;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zX;->o6(Lcom/google/android/gms/internal/ads/zX;)Lcom/google/android/gms/internal/ads/Qy;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->b()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
