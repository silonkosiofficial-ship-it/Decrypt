.class public final Lcom/google/android/gms/internal/ads/U6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/S6;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/S6;-><init>(Lcom/google/android/gms/internal/ads/U6;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/U6;->a:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/k7;)V
    .locals 2

    const-string v0, "post-error"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/h7;->a(Lcom/google/android/gms/internal/ads/k7;)Lcom/google/android/gms/internal/ads/h7;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/T6;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/T6;-><init>(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/h7;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/U6;->a:Ljava/util/concurrent/Executor;

    check-cast p1, Lcom/google/android/gms/internal/ads/S6;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/S6;->C:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/h7;Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/d7;->z()V

    const-string v0, "post-response"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/T6;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/T6;-><init>(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/h7;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/U6;->a:Ljava/util/concurrent/Executor;

    check-cast p1, Lcom/google/android/gms/internal/ads/S6;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/S6;->C:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
