package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2851Sz implements com.google.android.gms.internal.ads.InterfaceC5326uD, com.google.android.gms.internal.ads.ZC {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f31819C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f31820D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f31821E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p224w3.a f31822F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private com.google.android.gms.internal.ads.QT f31823G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f31824H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.OT f31825I;

    public C2851Sz(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.R60 r60, p224w3.a aVar, com.google.android.gms.internal.ads.OT ot) {
        this.f31819C = context;
        this.f31820D = interfaceC2698Ot;
        this.f31821E = r60;
        this.f31822F = aVar;
        this.f31825I = ot;
    }

    private final synchronized void a() {
        com.google.android.gms.internal.ads.NT nt;
        com.google.android.gms.internal.ads.MT mt;
        try {
            if (this.f31821E.f31153T && this.f31820D != null) {
                if (p174r3.v.b().f(this.f31819C)) {
                    p224w3.a aVar = this.f31822F;
                    java.lang.String str = aVar.f56218D + "." + aVar.f56219E;
                    com.google.android.gms.internal.ads.C4876q70 c4876q70 = this.f31821E.f31155V;
                    java.lang.String strA = c4876q70.a();
                    if (c4876q70.c() == 1) {
                        mt = com.google.android.gms.internal.ads.MT.VIDEO;
                        nt = com.google.android.gms.internal.ads.NT.DEFINED_BY_JAVASCRIPT;
                    } else {
                        com.google.android.gms.internal.ads.R60 r60 = this.f31821E;
                        com.google.android.gms.internal.ads.MT mt2 = com.google.android.gms.internal.ads.MT.HTML_DISPLAY;
                        nt = r60.f31168e == 1 ? com.google.android.gms.internal.ads.NT.ONE_PIXEL : com.google.android.gms.internal.ads.NT.BEGIN_TO_RENDER;
                        mt = mt2;
                    }
                    this.f31823G = p174r3.v.b().k(str, this.f31820D.i0(), "", "javascript", strA, nt, mt, this.f31821E.f31183l0);
                    android.view.View viewN = this.f31820D.N();
                    com.google.android.gms.internal.ads.QT qt = this.f31823G;
                    if (qt != null) {
                        com.google.android.gms.internal.ads.AbstractC2191Bb0 abstractC2191Bb0A = qt.a();
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25541e5)).booleanValue()) {
                            p174r3.v.b().c(abstractC2191Bb0A, this.f31820D.i0());
                            java.util.Iterator it = this.f31820D.X0().iterator();
                            while (it.hasNext()) {
                                p174r3.v.b().d(abstractC2191Bb0A, (android.view.View) it.next());
                            }
                        } else {
                            p174r3.v.b().c(abstractC2191Bb0A, viewN);
                        }
                        this.f31820D.n1(this.f31823G);
                        p174r3.v.b().e(abstractC2191Bb0A);
                        this.f31824H = true;
                        this.f31820D.O("onSdkLoaded", new p170r.C7026a());
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final boolean b() {
        return ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25552f5)).booleanValue() && this.f31825I.d();
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final synchronized void t() {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot;
        if (b()) {
            this.f31825I.b();
            return;
        }
        if (!this.f31824H) {
            a();
        }
        if (!this.f31821E.f31153T || this.f31823G == null || (interfaceC2698Ot = this.f31820D) == null) {
            return;
        }
        interfaceC2698Ot.O("onSdkImpression", new p170r.C7026a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final synchronized void u() {
        if (b()) {
            this.f31825I.c();
        } else {
            if (this.f31824H) {
                return;
            }
            a();
        }
    }
}
