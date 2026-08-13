package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class h extends com.google.android.gms.common.api.internal.C {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p170r.C7027b f24918H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.C2148c f24919I;

    h(P3.InterfaceC1449e interfaceC1449e, com.google.android.gms.common.api.internal.C2148c c2148c, N3.C1394g c1394g) {
        super(interfaceC1449e, c1394g);
        this.f24918H = new p170r.C7027b();
        this.f24919I = c2148c;
        this.f24878C.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(android.app.Activity activity, com.google.android.gms.common.api.internal.C2148c c2148c, P3.C1446b c1446b) {
        P3.InterfaceC1449e interfaceC1449eD = com.google.android.gms.common.api.internal.LifecycleCallback.d(activity);
        com.google.android.gms.common.api.internal.h hVar = (com.google.android.gms.common.api.internal.h) interfaceC1449eD.c("ConnectionlessLifecycleHelper", com.google.android.gms.common.api.internal.h.class);
        if (hVar == null) {
            hVar = new com.google.android.gms.common.api.internal.h(interfaceC1449eD, c2148c, N3.C1394g.m());
        }
        Q3.AbstractC1477p.m(c1446b, "ApiKey cannot be null");
        hVar.f24918H.add(c1446b);
        c2148c.b(hVar);
    }

    private final void v() {
        if (this.f24918H.isEmpty()) {
            return;
        }
        this.f24919I.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.C, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.C, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f24919I.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.C
    protected final void m(N3.C1389b c1389b, int i6) {
        this.f24919I.D(c1389b, i6);
    }

    @Override // com.google.android.gms.common.api.internal.C
    protected final void n() {
        this.f24919I.E();
    }

    final p170r.C7027b t() {
        return this.f24918H;
    }
}
