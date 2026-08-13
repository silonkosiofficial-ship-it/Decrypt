package com.google.ads.mediation;

/* JADX INFO: loaded from: classes.dex */
final class b extends p104k3.AbstractC6887d implements p114l3.c, p184s3.InterfaceC7076a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final com.google.ads.mediation.AbstractAdViewAdapter f24674C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final p244y3.i f24675D;

    public b(com.google.ads.mediation.AbstractAdViewAdapter abstractAdViewAdapter, p244y3.i iVar) {
        this.f24674C = abstractAdViewAdapter;
        this.f24675D = iVar;
    }

    @Override // p104k3.AbstractC6887d
    public final void e() {
        this.f24675D.a(this.f24674C);
    }

    @Override // p104k3.AbstractC6887d, p184s3.InterfaceC7076a
    public final void e0() {
        this.f24675D.e(this.f24674C);
    }

    @Override // p104k3.AbstractC6887d
    public final void g(p104k3.m mVar) {
        this.f24675D.q(this.f24674C, mVar);
    }

    @Override // p104k3.AbstractC6887d
    public final void k() {
        this.f24675D.i(this.f24674C);
    }

    @Override // p114l3.c
    public final void o(java.lang.String str, java.lang.String str2) {
        this.f24675D.g(this.f24674C, str, str2);
    }

    @Override // p104k3.AbstractC6887d
    public final void p() {
        this.f24675D.o(this.f24674C);
    }
}
