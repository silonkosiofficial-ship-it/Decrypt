.class final Lcom/google/android/gms/internal/ads/Kk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final C:Ljava/util/concurrent/Future;

.field final D:Lcom/google/android/gms/internal/ads/Jk0;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Future;Lcom/google/android/gms/internal/ads/Jk0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Kk0;->C:Ljava/util/concurrent/Future;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Kk0;->D:Lcom/google/android/gms/internal/ads/Jk0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kk0;->C:Ljava/util/concurrent/Future;

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/sl0;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/sl0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/tl0;->a(Lcom/google/android/gms/internal/ads/sl0;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Kk0;->D:Lcom/google/android/gms/internal/ads/Jk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Jk0;->a(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kk0;->C:Ljava/util/concurrent/Future;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->p(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Kk0;->D:Lcom/google/android/gms/internal/ads/Jk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Jk0;->c(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Kk0;->D:Lcom/google/android/gms/internal/ads/Jk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Jk0;->a(Ljava/lang/Throwable;)V

    return-void

    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Kk0;->D:Lcom/google/android/gms/internal/ads/Jk0;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Jk0;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/wg0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ug0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Kk0;->D:Lcom/google/android/gms/internal/ads/Jk0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ug0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ug0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ug0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
