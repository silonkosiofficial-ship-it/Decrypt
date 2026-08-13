package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class q implements Q3.AbstractC1464c.InterfaceC0206c, P3.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O3.a.f f24943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P3.C1446b f24944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Q3.InterfaceC1471j f24945c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.Set f24946d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24947e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.C2148c f24948f;

    public q(com.google.android.gms.common.api.internal.C2148c c2148c, O3.a.f fVar, P3.C1446b c1446b) {
        this.f24948f = c2148c;
        this.f24943a = fVar;
        this.f24944b = c1446b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        Q3.InterfaceC1471j interfaceC1471j;
        if (!this.f24947e || (interfaceC1471j = this.f24945c) == null) {
            return;
        }
        this.f24943a.i(interfaceC1471j, this.f24946d);
    }

    @Override // Q3.AbstractC1464c.InterfaceC0206c
    public final void a(N3.C1389b c1389b) {
        this.f24948f.f24903P.post(new com.google.android.gms.common.api.internal.p(this, c1389b));
    }

    @Override // P3.x
    public final void b(Q3.InterfaceC1471j interfaceC1471j, java.util.Set set) {
        if (interfaceC1471j == null || set == null) {
            new java.lang.Exception();
            c(new N3.C1389b(4));
        } else {
            this.f24945c = interfaceC1471j;
            this.f24946d = set;
            i();
        }
    }

    @Override // P3.x
    public final void c(N3.C1389b c1389b) {
        com.google.android.gms.common.api.internal.n nVar = (com.google.android.gms.common.api.internal.n) this.f24948f.f24899L.get(this.f24944b);
        if (nVar != null) {
            nVar.F(c1389b);
        }
    }

    @Override // P3.x
    public final void d(int i6) {
        com.google.android.gms.common.api.internal.n nVar = (com.google.android.gms.common.api.internal.n) this.f24948f.f24899L.get(this.f24944b);
        if (nVar != null) {
            if (nVar.f24934K) {
                nVar.F(new N3.C1389b(17));
            } else {
                nVar.y0(i6);
            }
        }
    }
}
