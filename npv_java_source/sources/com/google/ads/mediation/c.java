package com.google.ads.mediation;

/* JADX INFO: loaded from: classes.dex */
final class c extends p234x3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.ads.mediation.AbstractAdViewAdapter f24676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p244y3.l f24677b;

    public c(com.google.ads.mediation.AbstractAdViewAdapter abstractAdViewAdapter, p244y3.l lVar) {
        this.f24676a = abstractAdViewAdapter;
        this.f24677b = lVar;
    }

    @Override // p104k3.AbstractC6888e
    public final void a(p104k3.m mVar) {
        this.f24677b.f(this.f24676a, mVar);
    }

    @Override // p104k3.AbstractC6888e
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        com.google.ads.mediation.AbstractAdViewAdapter abstractAdViewAdapter = this.f24676a;
        p234x3.a aVar = (p234x3.a) obj;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        aVar.c(new com.google.ads.mediation.d(abstractAdViewAdapter, this.f24677b));
        this.f24677b.n(this.f24676a);
    }
}
