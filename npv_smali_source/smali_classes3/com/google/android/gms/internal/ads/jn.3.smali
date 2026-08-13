.class final Lcom/google/android/gms/internal/ads/jn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu3/z;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/zzbrw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbrw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jn;->C:Lcom/google/android/gms/internal/ads/zzbrw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final T2()V
    .locals 2

    const-string v0, "Opening AdMobCustomTabsAdapter overlay."

    invoke-static {v0}, Lw3/p;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jn;->C:Lcom/google/android/gms/internal/ads/zzbrw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbrw;->b(Lcom/google/android/gms/internal/ads/zzbrw;)Ly3/l;

    move-result-object v1

    invoke-interface {v1, v0}, Ly3/l;->s(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V

    return-void
.end method

.method public final d2()V
    .locals 1

    const-string v0, "Delay close AdMobCustomTabsAdapter overlay."

    invoke-static {v0}, Lw3/p;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final f3()V
    .locals 1

    const-string v0, "AdMobCustomTabsAdapter overlay is resumed."

    invoke-static {v0}, Lw3/p;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final p4(I)V
    .locals 1

    const-string p1, "AdMobCustomTabsAdapter overlay is closed."

    invoke-static {p1}, Lw3/p;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jn;->C:Lcom/google/android/gms/internal/ads/zzbrw;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbrw;->b(Lcom/google/android/gms/internal/ads/zzbrw;)Ly3/l;

    move-result-object v0

    invoke-interface {v0, p1}, Ly3/l;->p(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V

    return-void
.end method

.method public final q0()V
    .locals 0

    return-void
.end method

.method public final y0()V
    .locals 1

    const-string v0, "AdMobCustomTabsAdapter overlay is paused."

    invoke-static {v0}, Lw3/p;->b(Ljava/lang/String;)V

    return-void
.end method
