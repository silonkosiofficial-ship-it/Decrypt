package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5199t40 implements com.google.android.gms.internal.ads.InterfaceC4366lY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f38857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f38858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.AbstractC2846Su f38859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.K40 f38860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.F50 f38861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p224w3.a f38862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.view.ViewGroup f38863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f38864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4326l70 f38865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private P4.d f38866j;

    protected AbstractC5199t40(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, com.google.android.gms.internal.ads.F50 f50, com.google.android.gms.internal.ads.K40 k40, com.google.android.gms.internal.ads.C4326l70 c4326l70, p224w3.a aVar) {
        this.f38857a = context;
        this.f38858b = executor;
        this.f38859c = abstractC2846Su;
        this.f38861e = f50;
        this.f38860d = k40;
        this.f38865i = c4326l70;
        this.f38862f = aVar;
        this.f38863g = new android.widget.FrameLayout(context);
        this.f38864h = abstractC2846Su.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized com.google.android.gms.internal.ads.InterfaceC4007iC m(com.google.android.gms.internal.ads.D50 d50) {
        com.google.android.gms.internal.ads.C4979r40 c4979r40 = (com.google.android.gms.internal.ads.C4979r40) d50;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25510b8)).booleanValue()) {
            com.google.android.gms.internal.ads.C2666Ny c2666Ny = new com.google.android.gms.internal.ads.C2666Ny(this.f38863g);
            com.google.android.gms.internal.ads.C4335lC c4335lC = new com.google.android.gms.internal.ads.C4335lC();
            c4335lC.f(this.f38857a);
            c4335lC.k(c4979r40.f38430a);
            com.google.android.gms.internal.ads.C4555nC c4555nCL = c4335lC.l();
            com.google.android.gms.internal.ads.CF cf = new com.google.android.gms.internal.ads.CF();
            cf.f(this.f38860d, this.f38858b);
            cf.o(this.f38860d, this.f38858b);
            return e(c2666Ny, c4555nCL, cf.q());
        }
        com.google.android.gms.internal.ads.K40 k40A = com.google.android.gms.internal.ads.K40.a(this.f38860d);
        com.google.android.gms.internal.ads.CF cf2 = new com.google.android.gms.internal.ads.CF();
        cf2.e(k40A, this.f38858b);
        cf2.j(k40A, this.f38858b);
        cf2.k(k40A, this.f38858b);
        cf2.l(k40A, this.f38858b);
        cf2.f(k40A, this.f38858b);
        cf2.o(k40A, this.f38858b);
        cf2.p(k40A);
        com.google.android.gms.internal.ads.C2666Ny c2666Ny2 = new com.google.android.gms.internal.ads.C2666Ny(this.f38863g);
        com.google.android.gms.internal.ads.C4335lC c4335lC2 = new com.google.android.gms.internal.ads.C4335lC();
        c4335lC2.f(this.f38857a);
        c4335lC2.k(c4979r40.f38430a);
        return e(c2666Ny2, c4335lC2.l(), cf2.q());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4366lY
    public final boolean a() {
        P4.d dVar = this.f38866j;
        return (dVar == null || dVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4366lY
    public final synchronized boolean b(p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.AbstractC4146jY abstractC4146jY, com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY) {
        com.google.android.gms.internal.ads.Q90 q90;
        com.google.android.gms.internal.ads.InterfaceC5955zy interfaceC5955zy;
        try {
            if (!x6.f()) {
                boolean z6 = ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25765d.e()).booleanValue() && ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue();
                if (this.f38862f.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.cb)).intValue() || !z6) {
                    Q3.AbstractC1477p.e("loadAd must be called on the main UI thread.");
                }
            }
            if (str == null) {
                p224w3.p.d("Ad unit ID should not be null for app open ad.");
                this.f38858b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.n40
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37495C.k();
                    }
                });
                return false;
            }
            if (this.f38866j != null) {
                return false;
            }
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue() || (interfaceC5955zy = (com.google.android.gms.internal.ads.InterfaceC5955zy) this.f38861e.f()) == null) {
                q90 = null;
            } else {
                com.google.android.gms.internal.ads.Q90 q90G = interfaceC5955zy.g();
                q90G.i(7);
                q90G.b(x6.f54167R);
                q90G.f(x6.f54164O);
                q90 = q90G;
            }
            com.google.android.gms.internal.ads.L70.a(this.f38857a, x6.f54157H);
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue() && x6.f54157H) {
                this.f38859c.s().p(true);
            }
            android.os.Bundle bundleA = com.google.android.gms.internal.ads.ON.a(new android.util.Pair(com.google.android.gms.internal.ads.MN.PUBLIC_API_CALL.e(), java.lang.Long.valueOf(x6.f54177b0)), new android.util.Pair(com.google.android.gms.internal.ads.MN.DYNAMITE_ENTER.e(), java.lang.Long.valueOf(p174r3.v.c().a())));
            com.google.android.gms.internal.ads.C4326l70 c4326l70 = this.f38865i;
            c4326l70.P(str);
            c4326l70.O(p184s3.c2.f());
            c4326l70.h(x6);
            c4326l70.a(bundleA);
            android.content.Context context = this.f38857a;
            com.google.android.gms.internal.ads.C4546n70 c4546n70J = c4326l70.j();
            com.google.android.gms.internal.ads.E90 e90B = com.google.android.gms.internal.ads.D90.b(context, com.google.android.gms.internal.ads.P90.f(c4546n70J), 7, x6);
            com.google.android.gms.internal.ads.C4979r40 c4979r40 = new com.google.android.gms.internal.ads.C4979r40(null);
            c4979r40.f38430a = c4546n70J;
            P4.d dVarA = this.f38861e.a(new com.google.android.gms.internal.ads.G50(c4979r40, null), new com.google.android.gms.internal.ads.E50() { // from class: com.google.android.gms.internal.ads.o40
                @Override // com.google.android.gms.internal.ads.E50
                public final com.google.android.gms.internal.ads.InterfaceC4007iC a(com.google.android.gms.internal.ads.D50 d50) {
                    return this.f37714a.m(d50);
                }
            }, null);
            this.f38866j = dVarA;
            com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarA, new com.google.android.gms.internal.ads.C4870q40(this, interfaceC4256kY, q90, e90B, c4979r40), this.f38858b);
            return true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    protected abstract com.google.android.gms.internal.ads.InterfaceC4007iC e(com.google.android.gms.internal.ads.C2666Ny c2666Ny, com.google.android.gms.internal.ads.C4555nC c4555nC, com.google.android.gms.internal.ads.EF ef);

    final /* synthetic */ void k() {
        this.f38860d.u0(com.google.android.gms.internal.ads.P70.d(6, null, null));
    }

    public final void l(p184s3.i2 i2Var) {
        this.f38865i.Q(i2Var);
    }
}
