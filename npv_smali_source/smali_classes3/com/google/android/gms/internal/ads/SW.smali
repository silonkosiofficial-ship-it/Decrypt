.class final Lcom/google/android/gms/internal/ads/SW;
.super Lcom/google/android/gms/internal/ads/Xy;
.source "SourceFile"


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/UW;Landroid/view/View;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/dA;Lcom/google/android/gms/internal/ads/S60;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1, p4, p5}, Lcom/google/android/gms/internal/ads/Xy;-><init>(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/dA;Lcom/google/android/gms/internal/ads/S60;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/util/Set;)Lcom/google/android/gms/internal/ads/sD;
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/ads/sD;

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/sD;-><init>(Ljava/util/Set;)V

    return-object p1
.end method
