.class final Lcom/google/ads/mediation/c;
.super Lx3/b;
.source "SourceFile"


# instance fields
.field final a:Lcom/google/ads/mediation/AbstractAdViewAdapter;

.field final b:Ly3/l;


# direct methods
.method public constructor <init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Ly3/l;)V
    .locals 0

    invoke-direct {p0}, Lx3/b;-><init>()V

    iput-object p1, p0, Lcom/google/ads/mediation/c;->a:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    iput-object p2, p0, Lcom/google/ads/mediation/c;->b:Ly3/l;

    return-void
.end method


# virtual methods
.method public final a(Lk3/m;)V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/c;->b:Ly3/l;

    iget-object v1, p0, Lcom/google/ads/mediation/c;->a:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {v0, v1, p1}, Ly3/l;->f(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;Lk3/b;)V

    return-void
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/ads/mediation/c;->a:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    check-cast p1, Lx3/a;

    iput-object p1, v0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lx3/a;

    iget-object v1, p0, Lcom/google/ads/mediation/c;->b:Ly3/l;

    new-instance v2, Lcom/google/ads/mediation/d;

    invoke-direct {v2, v0, v1}, Lcom/google/ads/mediation/d;-><init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Ly3/l;)V

    invoke-virtual {p1, v2}, Lx3/a;->c(Lk3/l;)V

    iget-object p1, p0, Lcom/google/ads/mediation/c;->b:Ly3/l;

    iget-object v0, p0, Lcom/google/ads/mediation/c;->a:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {p1, v0}, Ly3/l;->n(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V

    return-void
.end method
