package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class E60 implements com.google.android.gms.internal.ads.InterfaceC4366lY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f26902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f26903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f26904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5203t60 f26905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.F50 f26906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3668f70 f26907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f26908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4326l70 f26909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private P4.d f26910i;

    public E60(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, com.google.android.gms.internal.ads.F50 f50, com.google.android.gms.internal.ads.C5203t60 c5203t60, com.google.android.gms.internal.ads.C4326l70 c4326l70, com.google.android.gms.internal.ads.C3668f70 c3668f70) {
        this.f26902a = context;
        this.f26903b = executor;
        this.f26904c = abstractC2846Su;
        this.f26906e = f50;
        this.f26905d = c5203t60;
        this.f26909h = c4326l70;
        this.f26907f = c3668f70;
        this.f26908g = abstractC2846Su.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.internal.ads.InterfaceC4134jM k(com.google.android.gms.internal.ads.D50 d50) {
        com.google.android.gms.internal.ads.InterfaceC4134jM interfaceC4134jMP = this.f26904c.p();
        com.google.android.gms.internal.ads.C4335lC c4335lC = new com.google.android.gms.internal.ads.C4335lC();
        c4335lC.f(this.f26902a);
        c4335lC.k(((com.google.android.gms.internal.ads.B60) d50).f25903a);
        c4335lC.j(this.f26907f);
        interfaceC4134jMP.a(c4335lC.l());
        interfaceC4134jMP.b(new com.google.android.gms.internal.ads.CF().q());
        return interfaceC4134jMP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4366lY
    public final boolean a() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4366lY
    public final boolean b(p184s3.X1 x6, java.lang.String str, com.google.android.gms.internal.ads.AbstractC4146jY abstractC4146jY, com.google.android.gms.internal.ads.InterfaceC4256kY interfaceC4256kY) {
        com.google.android.gms.internal.ads.Q90 q90;
        com.google.android.gms.internal.ads.C4178jp c4178jp = new com.google.android.gms.internal.ads.C4178jp(x6, str);
        if (c4178jp.f36739D == null) {
            p224w3.p.d("Ad unit ID should not be null for rewarded video ad.");
            this.f26903b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.w60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39542C.i();
                }
            });
        } else {
            P4.d dVar = this.f26910i;
            if (dVar == null || dVar.isDone()) {
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39432c.e()).booleanValue()) {
                    com.google.android.gms.internal.ads.F50 f50 = this.f26906e;
                    if (f50.f() != null) {
                        com.google.android.gms.internal.ads.Q90 q90G = ((com.google.android.gms.internal.ads.AbstractC4244kM) f50.f()).g();
                        q90G.i(5);
                        q90G.b(c4178jp.f36738C.f54167R);
                        q90G.f(c4178jp.f36738C.f54164O);
                        q90 = q90G;
                    } else {
                        q90 = null;
                    }
                } else {
                    q90 = null;
                }
                com.google.android.gms.internal.ads.L70.a(this.f26902a, c4178jp.f36738C.f54157H);
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25369O8)).booleanValue() && c4178jp.f36738C.f54157H) {
                    this.f26904c.s().p(true);
                }
                android.os.Bundle bundleA = com.google.android.gms.internal.ads.ON.a(new android.util.Pair(com.google.android.gms.internal.ads.MN.PUBLIC_API_CALL.e(), java.lang.Long.valueOf(c4178jp.f36738C.f54177b0)), new android.util.Pair(com.google.android.gms.internal.ads.MN.DYNAMITE_ENTER.e(), java.lang.Long.valueOf(p174r3.v.c().a())));
                com.google.android.gms.internal.ads.C4326l70 c4326l70 = this.f26909h;
                c4326l70.P(c4178jp.f36739D);
                c4326l70.O(p184s3.c2.w());
                c4326l70.h(c4178jp.f36738C);
                c4326l70.a(bundleA);
                android.content.Context context = this.f26902a;
                com.google.android.gms.internal.ads.C4546n70 c4546n70J = c4326l70.j();
                com.google.android.gms.internal.ads.E90 e90B = com.google.android.gms.internal.ads.D90.b(context, com.google.android.gms.internal.ads.P90.f(c4546n70J), 5, c4178jp.f36738C);
                com.google.android.gms.internal.ads.B60 b60 = new com.google.android.gms.internal.ads.B60(null);
                b60.f25903a = c4546n70J;
                P4.d dVarA = this.f26906e.a(new com.google.android.gms.internal.ads.G50(b60, null), new com.google.android.gms.internal.ads.E50() { // from class: com.google.android.gms.internal.ads.x60
                    @Override // com.google.android.gms.internal.ads.E50
                    public final com.google.android.gms.internal.ads.InterfaceC4007iC a(com.google.android.gms.internal.ads.D50 d50) {
                        return this.f39789a.k(d50);
                    }
                }, null);
                this.f26910i = dVarA;
                com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarA, new com.google.android.gms.internal.ads.A60(this, interfaceC4256kY, q90, e90B, b60), this.f26903b);
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ void i() {
        this.f26905d.u0(com.google.android.gms.internal.ads.P70.d(6, null, null));
    }

    final void j(int i6) {
        this.f26909h.L().a(i6);
    }
}
