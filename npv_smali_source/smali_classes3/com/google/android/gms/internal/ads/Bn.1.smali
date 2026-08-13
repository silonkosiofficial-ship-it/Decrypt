.class public final Lcom/google/android/gms/internal/ads/Bn;
.super Lcom/google/android/gms/internal/ads/bi;
.source "SourceFile"


# instance fields
.field private final C:Lcom/google/android/gms/ads/nativead/NativeAd$c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/nativead/NativeAd$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bi;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Bn;->C:Lcom/google/android/gms/ads/nativead/NativeAd$c;

    return-void
.end method


# virtual methods
.method public final N3(Lcom/google/android/gms/internal/ads/ki;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/An;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/An;-><init>(Lcom/google/android/gms/internal/ads/ki;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Bn;->C:Lcom/google/android/gms/ads/nativead/NativeAd$c;

    invoke-interface {p1, v0}, Lcom/google/android/gms/ads/nativead/NativeAd$c;->a(Lcom/google/android/gms/ads/nativead/NativeAd;)V

    return-void
.end method
