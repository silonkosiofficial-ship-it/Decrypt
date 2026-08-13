.class public abstract Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;
.super Ly3/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ly3/a;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract collectSignals(LA3/a;LA3/b;)V
.end method

.method public loadRtbAppOpenAd(Ly3/g;Ly3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/g;",
            "Ly3/d;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ly3/a;->loadAppOpenAd(Ly3/g;Ly3/d;)V

    return-void
.end method

.method public loadRtbBannerAd(Ly3/h;Ly3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/h;",
            "Ly3/d;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ly3/a;->loadBannerAd(Ly3/h;Ly3/d;)V

    return-void
.end method

.method public loadRtbInterscrollerAd(Ly3/h;Ly3/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/h;",
            "Ly3/d;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    new-instance v0, Lk3/b;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v1, " does not support interscroller ads."

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.google.android.gms.ads"

    const/4 v2, 0x7

    invoke-direct {v0, v2, p1, v1}, Lk3/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Ly3/d;->a(Lk3/b;)V

    return-void
.end method

.method public loadRtbInterstitialAd(Ly3/k;Ly3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/k;",
            "Ly3/d;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ly3/a;->loadInterstitialAd(Ly3/k;Ly3/d;)V

    return-void
.end method

.method public loadRtbNativeAd(Ly3/m;Ly3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/m;",
            "Ly3/d;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1, p2}, Ly3/a;->loadNativeAd(Ly3/m;Ly3/d;)V

    return-void
.end method

.method public loadRtbNativeAdMapper(Ly3/m;Ly3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/m;",
            "Ly3/d;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ly3/a;->loadNativeAdMapper(Ly3/m;Ly3/d;)V

    return-void
.end method

.method public loadRtbRewardedAd(Ly3/o;Ly3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/o;",
            "Ly3/d;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ly3/a;->loadRewardedAd(Ly3/o;Ly3/d;)V

    return-void
.end method

.method public loadRtbRewardedInterstitialAd(Ly3/o;Ly3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/o;",
            "Ly3/d;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ly3/a;->loadRewardedInterstitialAd(Ly3/o;Ly3/d;)V

    return-void
.end method
