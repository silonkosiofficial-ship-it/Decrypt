.class final Lcom/google/android/gms/internal/ads/Xj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ3/c$a;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/mr;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Zj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Zj;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Xj;->a:Lcom/google/android/gms/internal/ads/mr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xj;->b:Lcom/google/android/gms/internal/ads/Zj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final L0(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Xj;->a:Lcom/google/android/gms/internal/ads/mr;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xj;->b:Lcom/google/android/gms/internal/ads/Zj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Zj;->b(Lcom/google/android/gms/internal/ads/Zj;)Lcom/google/android/gms/internal/ads/Lj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Lj;->j0()Lcom/google/android/gms/internal/ads/Tj;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xj;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final y0(I)V
    .locals 3

    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onConnectionSuspended: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Xj;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method
