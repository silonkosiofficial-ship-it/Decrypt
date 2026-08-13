package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class I60 extends com.google.android.gms.internal.ads.AbstractBinderC5387up {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.E60 f28399C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5203t60 f28400D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f28401E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3668f70 f28402F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final android.content.Context f28403G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p224w3.a f28404H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z9 f28405I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f28406J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3696fM f28407K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f28408L = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25361O0)).booleanValue();

    public I60(java.lang.String str, com.google.android.gms.internal.ads.E60 e60, android.content.Context context, com.google.android.gms.internal.ads.C5203t60 c5203t60, com.google.android.gms.internal.ads.C3668f70 c3668f70, p224w3.a aVar, com.google.android.gms.internal.ads.Z9 z10, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f28401E = str;
        this.f28399C = e60;
        this.f28400D = c5203t60;
        this.f28402F = c3668f70;
        this.f28403G = context;
        this.f28404H = aVar;
        this.f28405I = z10;
        this.f28406J = c3588eO;
    }

    private final synchronized void s6(p184s3.X1 x6, com.google.android.gms.internal.ads.InterfaceC2251Cp interfaceC2251Cp, int i6) {
        try {
            if (!x6.f()) {
                boolean z6 = false;
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25772k.e()).booleanValue()) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                        z6 = true;
                    }
                }
                if (this.f28404H.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.cb)).intValue() || !z6) {
                    Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
                }
            }
            this.f28400D.w(interfaceC2251Cp);
            p174r3.v.t();
            if (p214v3.E0.i(this.f28403G) && x6.f54170U == null) {
                p224w3.p.d("Failed to load the ad because app ID is missing.");
                this.f28400D.u0(com.google.android.gms.internal.ads.P70.d(4, null, null));
                return;
            }
            if (this.f28407K != null) {
                return;
            }
            com.google.android.gms.internal.ads.C5423v60 c5423v60 = new com.google.android.gms.internal.ads.C5423v60(null);
            this.f28399C.j(i6);
            this.f28399C.b(x6, this.f28401E, c5423v60, new com.google.android.gms.internal.ads.H60(this));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void A2(com.google.android.gms.internal.ads.C2288Dp c2288Dp) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        this.f28400D.C(c2288Dp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final synchronized void K4(p184s3.X1 x6, com.google.android.gms.internal.ads.InterfaceC2251Cp interfaceC2251Cp) {
        s6(x6, interfaceC2251Cp, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void L2(p184s3.K0 k6) {
        if (k6 == null) {
            this.f28400D.i(null);
        } else {
            this.f28400D.i(new com.google.android.gms.internal.ads.G60(this, k6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void N5(p184s3.N0 n6) {
        Q3.AbstractC1477p.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!n6.e()) {
                this.f28406J.e();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.c("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f28400D.o(n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final synchronized void S2(X3.a aVar) {
        p2(aVar, this.f28408L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final synchronized void T3(boolean z6) {
        Q3.AbstractC1477p.e("setImmersiveMode must be called on the main UI thread.");
        this.f28408L = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final android.os.Bundle b() {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.C3696fM c3696fM = this.f28407K;
        return c3696fM != null ? c3696fM.i() : new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final synchronized void b3(com.google.android.gms.internal.ads.C2547Kp c2547Kp) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.C3668f70 c3668f70 = this.f28402F;
        c3668f70.f35278a = c2547Kp.f29010C;
        c3668f70.f35279b = c2547Kp.f29011D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final p184s3.U0 c() {
        com.google.android.gms.internal.ads.C3696fM c3696fM;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25235C6)).booleanValue() && (c3696fM = this.f28407K) != null) {
            return c3696fM.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final synchronized java.lang.String d() {
        com.google.android.gms.internal.ads.C3696fM c3696fM = this.f28407K;
        if (c3696fM == null || c3696fM.c() == null) {
            return null;
        }
        return c3696fM.c().i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void d3(com.google.android.gms.internal.ads.InterfaceC5827yp interfaceC5827yp) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        this.f28400D.t(interfaceC5827yp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final com.google.android.gms.internal.ads.InterfaceC5167sp f() {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.C3696fM c3696fM = this.f28407K;
        if (c3696fM != null) {
            return c3696fM.j();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final synchronized void m5(p184s3.X1 x6, com.google.android.gms.internal.ads.InterfaceC2251Cp interfaceC2251Cp) {
        s6(x6, interfaceC2251Cp, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final boolean p() {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.C3696fM c3696fM = this.f28407K;
        return (c3696fM == null || c3696fM.m()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final synchronized void p2(X3.a aVar, boolean z6) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        if (this.f28407K == null) {
            p224w3.p.g("Rewarded can not be shown before loaded");
            this.f28400D.p(com.google.android.gms.internal.ads.P70.d(9, null, null));
            return;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25418T2)).booleanValue()) {
            this.f28405I.c().c(new java.lang.Throwable().getStackTrace());
        }
        this.f28407K.o(z6, (android.app.Activity) X3.b.L0(aVar));
    }
}
