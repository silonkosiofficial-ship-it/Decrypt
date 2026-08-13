.class final Lcom/google/android/gms/internal/ads/QU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/RU;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/RU;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/QU;->a:Lcom/google/android/gms/internal/ads/RU;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QU;->a:Lcom/google/android/gms/internal/ads/RU;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/RU;->d(Lcom/google/android/gms/internal/ads/RU;)Lcom/google/android/gms/internal/ads/vz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vz;->d()Lcom/google/android/gms/internal/ads/LA;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/LA;->a(Ljava/lang/Throwable;)Ls3/W0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/QU;->a:Lcom/google/android/gms/internal/ads/RU;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/RU;->e(Lcom/google/android/gms/internal/ads/RU;)Lcom/google/android/gms/internal/ads/GC;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/GC;->u0(Ls3/W0;)V

    iget v0, v0, Ls3/W0;->C:I

    const-string v1, "DelayedBannerAd.onFailure"

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/L70;->b(ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/Qy;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fA;->b()V

    return-void
.end method
