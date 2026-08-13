.class final Lcom/google/android/gms/internal/ads/Uc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ3/c$b;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/Vc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Vc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Uc;->a:Lcom/google/android/gms/internal/ads/Vc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final q0(LN3/b;)V
    .locals 3

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Uc;->a:Lcom/google/android/gms/internal/ads/Vc;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Vc;->e(Lcom/google/android/gms/internal/ads/Vc;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uc;->a:Lcom/google/android/gms/internal/ads/Vc;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Vc;->k(Lcom/google/android/gms/internal/ads/Vc;Lcom/google/android/gms/internal/ads/bd;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uc;->a:Lcom/google/android/gms/internal/ads/Vc;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Vc;->c(Lcom/google/android/gms/internal/ads/Vc;)Lcom/google/android/gms/internal/ads/Yc;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Vc;->f(Lcom/google/android/gms/internal/ads/Vc;Lcom/google/android/gms/internal/ads/Yc;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uc;->a:Lcom/google/android/gms/internal/ads/Vc;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Vc;->e(Lcom/google/android/gms/internal/ads/Vc;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
