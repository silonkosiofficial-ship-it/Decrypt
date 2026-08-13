package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5562wL extends com.google.android.gms.internal.ads.AbstractBinderC2387Gh {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f39582C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3581eJ f39583D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.FJ f39584E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.internal.ads.ZI f39585F;

    public BinderC5562wL(android.content.Context context, com.google.android.gms.internal.ads.C3581eJ c3581eJ, com.google.android.gms.internal.ads.FJ fj, com.google.android.gms.internal.ads.ZI zi) {
        this.f39582C = context;
        this.f39583D = c3581eJ;
        this.f39584E = fj;
        this.f39585F = zi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final boolean C0(X3.a aVar) {
        com.google.android.gms.internal.ads.FJ fj;
        java.lang.Object objL0 = X3.b.L0(aVar);
        if (!(objL0 instanceof android.view.ViewGroup) || (fj = this.f39584E) == null || !fj.g((android.view.ViewGroup) objL0)) {
            return false;
        }
        this.f39583D.f0().b1(new com.google.android.gms.internal.ads.C5452vL(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final java.lang.String G0(java.lang.String str) {
        return (java.lang.String) this.f39583D.V().get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final com.google.android.gms.internal.ads.InterfaceC4712oh S(java.lang.String str) {
        return (com.google.android.gms.internal.ads.InterfaceC4712oh) this.f39583D.U().get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final void a1(X3.a aVar) {
        com.google.android.gms.internal.ads.ZI zi;
        java.lang.Object objL0 = X3.b.L0(aVar);
        if (!(objL0 instanceof android.view.View) || this.f39583D.h0() == null || (zi = this.f39585F) == null) {
            return;
        }
        zi.s((android.view.View) objL0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final p184s3.Y0 d() {
        return this.f39583D.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final com.google.android.gms.internal.ads.InterfaceC4382lh e() {
        try {
            return this.f39585F.Q().a();
        } catch (java.lang.NullPointerException e6) {
            p174r3.v.s().x(e6, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final X3.a g() {
        return X3.b.c2(this.f39582C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final boolean g0(X3.a aVar) {
        com.google.android.gms.internal.ads.FJ fj;
        java.lang.Object objL0 = X3.b.L0(aVar);
        if (!(objL0 instanceof android.view.ViewGroup) || (fj = this.f39584E) == null || !fj.f((android.view.ViewGroup) objL0)) {
            return false;
        }
        this.f39583D.d0().b1(new com.google.android.gms.internal.ads.C5452vL(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final java.lang.String h() {
        return this.f39583D.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final java.util.List k() {
        try {
            p170r.Y yU = this.f39583D.U();
            p170r.Y yV = this.f39583D.V();
            java.lang.String[] strArr = new java.lang.String[yU.size() + yV.size()];
            int i6 = 0;
            for (int i10 = 0; i10 < yU.size(); i10++) {
                strArr[i6] = (java.lang.String) yU.f(i10);
                i6++;
            }
            for (int i11 = 0; i11 < yV.size(); i11++) {
                strArr[i6] = (java.lang.String) yV.f(i11);
                i6++;
            }
            return java.util.Arrays.asList(strArr);
        } catch (java.lang.NullPointerException e6) {
            p174r3.v.s().x(e6, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new java.util.ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final void l() {
        com.google.android.gms.internal.ads.ZI zi = this.f39585F;
        if (zi != null) {
            zi.a();
        }
        this.f39585F = null;
        this.f39584E = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final void m() {
        try {
            java.lang.String strC = this.f39583D.c();
            if (j$.util.Objects.equals(strC, "Google")) {
                p224w3.p.g("Illegal argument specified for omid partner name.");
                return;
            }
            if (android.text.TextUtils.isEmpty(strC)) {
                p224w3.p.g("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            com.google.android.gms.internal.ads.ZI zi = this.f39585F;
            if (zi != null) {
                zi.T(strC, false);
            }
        } catch (java.lang.NullPointerException e6) {
            p174r3.v.s().x(e6, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final void p() {
        com.google.android.gms.internal.ads.ZI zi = this.f39585F;
        if (zi != null) {
            zi.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final void p0(java.lang.String str) {
        com.google.android.gms.internal.ads.ZI zi = this.f39585F;
        if (zi != null) {
            zi.n(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final boolean s() {
        com.google.android.gms.internal.ads.ZI zi = this.f39585F;
        return (zi == null || zi.G()) && this.f39583D.e0() != null && this.f39583D.f0() == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2424Hh
    public final boolean w() {
        com.google.android.gms.internal.ads.QT qtH0 = this.f39583D.h0();
        if (qtH0 == null) {
            p224w3.p.g("Trying to start OMID session before creation.");
            return false;
        }
        p174r3.v.b().e(qtH0.a());
        if (this.f39583D.e0() == null) {
            return true;
        }
        this.f39583D.e0().O("onSdkLoaded", new p170r.C7026a());
        return true;
    }
}
