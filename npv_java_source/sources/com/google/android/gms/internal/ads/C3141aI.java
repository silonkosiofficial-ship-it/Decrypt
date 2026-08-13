package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3141aI implements com.google.android.gms.internal.ads.InterfaceC5326uD, p204u3.z, com.google.android.gms.internal.ads.ZC {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f34039C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f34040D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f34041E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p224w3.a f34042F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EnumC5473vd f34043G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.OT f34044H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    com.google.android.gms.internal.ads.QT f34045I;

    public C3141aI(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.R60 r60, p224w3.a aVar, com.google.android.gms.internal.ads.EnumC5473vd enumC5473vd, com.google.android.gms.internal.ads.OT ot) {
        this.f34039C = context;
        this.f34040D = interfaceC2698Ot;
        this.f34041E = r60;
        this.f34042F = aVar;
        this.f34043G = enumC5473vd;
        this.f34044H = ot;
    }

    private final boolean a() {
        return ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25552f5)).booleanValue() && this.f34044H.d();
    }

    @Override // p204u3.z
    public final void T2() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25607k5)).booleanValue() || this.f34040D == null) {
            return;
        }
        if (this.f34045I != null || a()) {
            if (this.f34045I != null) {
                this.f34040D.O("onSdkImpression", new p170r.C7026a());
            } else {
                this.f34044H.b();
            }
        }
    }

    @Override // p204u3.z
    public final void d2() {
    }

    @Override // p204u3.z
    public final void f3() {
    }

    @Override // p204u3.z
    public final void p4(int i6) {
        this.f34045I = null;
    }

    @Override // p204u3.z
    public final void q0() {
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void t() {
        if (a()) {
            this.f34044H.b();
            return;
        }
        if (this.f34045I == null || this.f34040D == null) {
            return;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25607k5)).booleanValue()) {
            this.f34040D.O("onSdkImpression", new p170r.C7026a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final void u() {
        com.google.android.gms.internal.ads.NT nt;
        com.google.android.gms.internal.ads.MT mt;
        com.google.android.gms.internal.ads.EnumC5473vd enumC5473vd;
        if ((((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25637n5)).booleanValue() || (enumC5473vd = this.f34043G) == com.google.android.gms.internal.ads.EnumC5473vd.REWARD_BASED_VIDEO_AD || enumC5473vd == com.google.android.gms.internal.ads.EnumC5473vd.INTERSTITIAL || enumC5473vd == com.google.android.gms.internal.ads.EnumC5473vd.APP_OPEN) && this.f34041E.f31153T && this.f34040D != null) {
            if (p174r3.v.b().f(this.f34039C)) {
                if (a()) {
                    this.f34044H.c();
                    return;
                }
                p224w3.a aVar = this.f34042F;
                java.lang.String str = aVar.f56218D + "." + aVar.f56219E;
                com.google.android.gms.internal.ads.C4876q70 c4876q70 = this.f34041E.f31155V;
                java.lang.String strA = c4876q70.a();
                if (c4876q70.c() == 1) {
                    mt = com.google.android.gms.internal.ads.MT.VIDEO;
                    nt = com.google.android.gms.internal.ads.NT.DEFINED_BY_JAVASCRIPT;
                } else {
                    nt = this.f34041E.f31158Y == 2 ? com.google.android.gms.internal.ads.NT.UNSPECIFIED : com.google.android.gms.internal.ads.NT.BEGIN_TO_RENDER;
                    mt = com.google.android.gms.internal.ads.MT.HTML_DISPLAY;
                }
                this.f34045I = p174r3.v.b().k(str, this.f34040D.i0(), "", "javascript", strA, nt, mt, this.f34041E.f31183l0);
                android.view.View viewN = this.f34040D.N();
                com.google.android.gms.internal.ads.QT qt = this.f34045I;
                if (qt != null) {
                    com.google.android.gms.internal.ads.AbstractC2191Bb0 abstractC2191Bb0A = qt.a();
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25541e5)).booleanValue()) {
                        p174r3.v.b().c(abstractC2191Bb0A, this.f34040D.i0());
                        java.util.Iterator it = this.f34040D.X0().iterator();
                        while (it.hasNext()) {
                            p174r3.v.b().d(abstractC2191Bb0A, (android.view.View) it.next());
                        }
                    } else {
                        p174r3.v.b().c(abstractC2191Bb0A, viewN);
                    }
                    this.f34040D.n1(this.f34045I);
                    p174r3.v.b().e(abstractC2191Bb0A);
                    this.f34040D.O("onSdkLoaded", new p170r.C7026a());
                }
            }
        }
    }

    @Override // p204u3.z
    public final void y0() {
    }
}
