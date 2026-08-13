package com.google.ads.mediation;

/* JADX INFO: loaded from: classes.dex */
final class e extends p104k3.AbstractC6887d implements p134n3.o, p134n3.m, p134n3.l {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final com.google.ads.mediation.AbstractAdViewAdapter f24680C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final p244y3.n f24681D;

    public e(com.google.ads.mediation.AbstractAdViewAdapter abstractAdViewAdapter, p244y3.n nVar) {
        this.f24680C = abstractAdViewAdapter;
        this.f24681D = nVar;
    }

    @Override // p134n3.l
    public final void a(com.google.android.gms.internal.ads.C2461Ih c2461Ih, java.lang.String str) {
        this.f24681D.k(this.f24680C, c2461Ih, str);
    }

    @Override // p134n3.o
    public final void b(p134n3.g gVar) {
        this.f24681D.j(this.f24680C, new com.google.ads.mediation.a(gVar));
    }

    @Override // p134n3.m
    public final void c(com.google.android.gms.internal.ads.C2461Ih c2461Ih) {
        this.f24681D.d(this.f24680C, c2461Ih);
    }

    @Override // p104k3.AbstractC6887d
    public final void e() {
        this.f24681D.h(this.f24680C);
    }

    @Override // p104k3.AbstractC6887d, p184s3.InterfaceC7076a
    public final void e0() {
        this.f24681D.l(this.f24680C);
    }

    @Override // p104k3.AbstractC6887d
    public final void g(p104k3.m mVar) {
        this.f24681D.m(this.f24680C, mVar);
    }

    @Override // p104k3.AbstractC6887d
    public final void i() {
        this.f24681D.r(this.f24680C);
    }

    @Override // p104k3.AbstractC6887d
    public final void k() {
    }

    @Override // p104k3.AbstractC6887d
    public final void p() {
        this.f24681D.b(this.f24680C);
    }
}
