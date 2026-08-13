.class final Lcom/google/android/gms/internal/ads/zk0;
.super Lcom/google/android/gms/internal/ads/mk0;
.source "SourceFile"


# instance fields
.field private R:Lcom/google/android/gms/internal/ads/yk0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Xh0;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/mk0;-><init>(Lcom/google/android/gms/internal/ads/Xh0;ZZ)V

    new-instance p1, Lcom/google/android/gms/internal/ads/xk0;

    invoke-direct {p1, p0, p4, p3}, Lcom/google/android/gms/internal/ads/xk0;-><init>(Lcom/google/android/gms/internal/ads/zk0;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zk0;->R:Lcom/google/android/gms/internal/ads/yk0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/mk0;->T()V

    return-void
.end method

.method static bridge synthetic X(Lcom/google/android/gms/internal/ads/zk0;Lcom/google/android/gms/internal/ads/yk0;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zk0;->R:Lcom/google/android/gms/internal/ads/yk0;

    return-void
.end method


# virtual methods
.method final R(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method final S()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zk0;->R:Lcom/google/android/gms/internal/ads/yk0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/yk0;->i()V

    :cond_0
    return-void
.end method

.method final W(I)V
    .locals 1

    .prologue
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/mk0;->W(I)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zk0;->R:Lcom/google/android/gms/internal/ads/yk0;

    :cond_0
    return-void
.end method

.method protected final t()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zk0;->R:Lcom/google/android/gms/internal/ads/yk0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Vk0;->g()V

    :cond_0
    return-void
.end method
