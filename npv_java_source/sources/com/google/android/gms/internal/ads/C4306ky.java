package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4306ky implements com.google.android.gms.internal.ads.InterfaceC2633Nb, com.google.android.gms.internal.ads.InterfaceC3131aD, p204u3.z, com.google.android.gms.internal.ads.ZC {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3758fy f37035C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3868gy f37036D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2469Il f37038F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.concurrent.Executor f37039G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final V3.f f37040H;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.Set f37037E = new java.util.HashSet();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f37041I = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4196jy f37042J = new com.google.android.gms.internal.ads.C4196jy();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f37043K = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private java.lang.ref.WeakReference f37044L = new java.lang.ref.WeakReference(this);

    public C4306ky(com.google.android.gms.internal.ads.C2358Fl c2358Fl, com.google.android.gms.internal.ads.C3868gy c3868gy, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C3758fy c3758fy, V3.f fVar) {
        this.f37035C = c3758fy;
        com.google.android.gms.internal.ads.InterfaceC4940ql interfaceC4940ql = com.google.android.gms.internal.ads.AbstractC5269tl.f39020b;
        this.f37038F = c2358Fl.a("google.afma.activeView.handleUpdate", interfaceC4940ql, interfaceC4940ql);
        this.f37036D = c3868gy;
        this.f37039G = executor;
        this.f37040H = fVar;
    }

    private final void e() {
        java.util.Iterator it = this.f37037E.iterator();
        while (it.hasNext()) {
            this.f37035C.f((com.google.android.gms.internal.ads.InterfaceC2698Ot) it.next());
        }
        this.f37035C.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2633Nb
    public final synchronized void L(com.google.android.gms.internal.ads.C2596Mb c2596Mb) {
        com.google.android.gms.internal.ads.C4196jy c4196jy = this.f37042J;
        c4196jy.f36872a = c2596Mb.f29800j;
        c4196jy.f36877f = c2596Mb;
        a();
    }

    @Override // p204u3.z
    public final void T2() {
    }

    public final synchronized void a() {
        try {
            if (this.f37044L.get() == null) {
                d();
                return;
            }
            if (this.f37043K || !this.f37041I.get()) {
                return;
            }
            try {
                this.f37042J.f36875d = this.f37040H.c();
                final org.json.JSONObject jSONObjectA = this.f37036D.c(this.f37042J);
                for (final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot : this.f37037E) {
                    this.f37039G.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.iy
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC2698Ot.G0("AFMA_updateActiveView", jSONObjectA);
                        }
                    });
                }
                com.google.android.gms.internal.ads.AbstractC3854gr.b(this.f37038F.c(jSONObjectA), "ActiveViewListener.callActiveViewJs");
            } catch (java.lang.Exception e6) {
                p214v3.AbstractC7265q0.l("Failed to call ActiveViewJS", e6);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f37037E.add(interfaceC2698Ot);
        this.f37035C.d(interfaceC2698Ot);
    }

    public final void c(java.lang.Object obj) {
        this.f37044L = new java.lang.ref.WeakReference(obj);
    }

    public final synchronized void d() {
        e();
        this.f37043K = true;
    }

    @Override // p204u3.z
    public final void d2() {
    }

    @Override // p204u3.z
    public final synchronized void f3() {
        this.f37042J.f36873b = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final synchronized void g(android.content.Context context) {
        this.f37042J.f36876e = "u";
        a();
        e();
        this.f37043K = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final synchronized void k(android.content.Context context) {
        this.f37042J.f36873b = true;
        a();
    }

    @Override // p204u3.z
    public final void p4(int i6) {
    }

    @Override // p204u3.z
    public final void q0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final synchronized void r(android.content.Context context) {
        this.f37042J.f36873b = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final synchronized void t() {
        if (this.f37041I.compareAndSet(false, true)) {
            this.f37035C.c(this);
            a();
        }
    }

    @Override // p204u3.z
    public final synchronized void y0() {
        this.f37042J.f36873b = true;
        a();
    }
}
