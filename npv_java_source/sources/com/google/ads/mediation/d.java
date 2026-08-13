package com.google.ads.mediation;

/* JADX INFO: loaded from: classes.dex */
final class d extends p104k3.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.ads.mediation.AbstractAdViewAdapter f24678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p244y3.l f24679b;

    public d(com.google.ads.mediation.AbstractAdViewAdapter abstractAdViewAdapter, p244y3.l lVar) {
        this.f24678a = abstractAdViewAdapter;
        this.f24679b = lVar;
    }

    @Override // p104k3.l
    public final void b() {
        this.f24679b.p(this.f24678a);
    }

    @Override // p104k3.l
    public final void e() {
        this.f24679b.s(this.f24678a);
    }
}
