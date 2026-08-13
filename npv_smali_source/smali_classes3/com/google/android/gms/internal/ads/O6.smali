.class final Lcom/google/android/gms/internal/ads/O6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/d7;

.field final synthetic D:Lcom/google/android/gms/internal/ads/P6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/P6;Lcom/google/android/gms/internal/ads/d7;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/O6;->C:Lcom/google/android/gms/internal/ads/d7;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/O6;->D:Lcom/google/android/gms/internal/ads/P6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O6;->D:Lcom/google/android/gms/internal/ads/P6;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/P6;->a(Lcom/google/android/gms/internal/ads/P6;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/O6;->C:Lcom/google/android/gms/internal/ads/d7;

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method
