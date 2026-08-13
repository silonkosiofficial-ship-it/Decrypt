package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class S40 extends p184s3.U implements p204u3.z, com.google.android.gms.internal.ads.InterfaceC5911zc {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2846Su f31534C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Context f31535D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f31537F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.M40 f31538G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.K40 f31539H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p224w3.a f31540I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f31541J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5625wy f31543L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.C2556Ky f31544M;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f31536E = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f31542K = -1;

    public S40(com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.M40 m40, com.google.android.gms.internal.ads.K40 k40, p224w3.a aVar, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f31534C = abstractC2846Su;
        this.f31535D = context;
        this.f31537F = str;
        this.f31538G = m40;
        this.f31539H = k40;
        this.f31540I = aVar;
        this.f31541J = c3588eO;
        k40.e(this);
    }

    private final synchronized void q6(int i6) {
        try {
            if (this.f31536E.compareAndSet(false, true)) {
                this.f31539H.b();
                com.google.android.gms.internal.ads.C5625wy c5625wy = this.f31543L;
                if (c5625wy != null) {
                    p174r3.v.e().e(c5625wy);
                }
                if (this.f31544M != null) {
                    long jC = -1;
                    if (this.f31542K != -1) {
                        jC = p174r3.v.c().c() - this.f31542K;
                    }
                    this.f31544M.l(jC, i6);
                }
                C();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p184s3.V
    public final synchronized void C() {
        Q3.AbstractC1477p.e("destroy must be called on the main UI thread.");
        com.google.android.gms.internal.ads.C2556Ky c2556Ky = this.f31544M;
        if (c2556Ky != null) {
            c2556Ky.a();
        }
    }

    @Override // p184s3.V
    public final void F1(p184s3.InterfaceC7122p0 interfaceC7122p0) {
    }

    @Override // p184s3.V
    public final synchronized void F2(com.google.android.gms.internal.ads.InterfaceC2970Wf interfaceC2970Wf) {
    }

    @Override // p184s3.V
    public final synchronized boolean H0() {
        return false;
    }

    @Override // p184s3.V
    public final void I5(com.google.android.gms.internal.ads.InterfaceC2525Kc interfaceC2525Kc) {
        this.f31539H.o(interfaceC2525Kc);
    }

    @Override // p184s3.V
    public final synchronized void J() {
        Q3.AbstractC1477p.e("pause must be called on the main UI thread.");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // p184s3.V
    public final synchronized boolean K3(p184s3.X1 x6) {
        boolean z6;
        try {
            if (!x6.f()) {
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25765d.e()).booleanValue()) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (this.f31540I.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.cb)).intValue() || !z6) {
                    Q3.AbstractC1477p.e("loadAd must be called on the main UI thread.");
                }
            }
            p174r3.v.t();
            if (p214v3.E0.i(this.f31535D) && x6.f54170U == null) {
                p224w3.p.d("Failed to load the ad because app ID is missing.");
                this.f31539H.u0(com.google.android.gms.internal.ads.P70.d(4, null, null));
                return false;
            }
            if (P5()) {
                return false;
            }
            this.f31536E = new java.util.concurrent.atomic.AtomicBoolean();
            return this.f31538G.b(x6, this.f31537F, new com.google.android.gms.internal.ads.Q40(this), new com.google.android.gms.internal.ads.R40(this));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // p184s3.V
    public final synchronized boolean P5() {
        return this.f31538G.a();
    }

    @Override // p184s3.V
    public final synchronized void T1(p184s3.c2 c2Var) {
        Q3.AbstractC1477p.e("setAdSize must be called on the main UI thread.");
    }

    @Override // p204u3.z
    public final synchronized void T2() {
        if (this.f31544M != null) {
            this.f31542K = p174r3.v.c().c();
            int i6 = this.f31544M.i();
            if (i6 > 0) {
                com.google.android.gms.internal.ads.C5625wy c5625wy = new com.google.android.gms.internal.ads.C5625wy(this.f31534C.e(), p174r3.v.c());
                this.f31543L = c5625wy;
                c5625wy.d(i6, new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.P40
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30646C.q();
                    }
                });
            }
        }
    }

    @Override // p184s3.V
    public final void V0(p184s3.i2 i2Var) {
        this.f31538G.l(i2Var);
    }

    @Override // p184s3.V
    public final void V5(p184s3.E e6) {
    }

    @Override // p184s3.V
    public final void W0(java.lang.String str) {
    }

    @Override // p184s3.V
    public final void W2(com.google.android.gms.internal.ads.InterfaceC2947Vn interfaceC2947Vn) {
    }

    @Override // p184s3.V
    public final synchronized void X() {
    }

    @Override // p184s3.V
    public final void X1(com.google.android.gms.internal.ads.InterfaceC3055Yn interfaceC3055Yn, java.lang.String str) {
    }

    @Override // p184s3.V
    public final synchronized void Y() {
        Q3.AbstractC1477p.e("resume must be called on the main UI thread.");
    }

    @Override // p184s3.V
    public final void Y1(com.google.android.gms.internal.ads.InterfaceC4069ip interfaceC4069ip) {
    }

    @Override // p184s3.V
    public final void Y4(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5911zc
    public final void a() {
        q6(3);
    }

    @Override // p204u3.z
    public final void d2() {
    }

    @Override // p184s3.V
    public final synchronized void e6(boolean z6) {
    }

    @Override // p184s3.V
    public final android.os.Bundle f() {
        return new android.os.Bundle();
    }

    @Override // p184s3.V
    public final boolean f0() {
        return false;
    }

    @Override // p204u3.z
    public final void f3() {
    }

    @Override // p184s3.V
    public final void g3(p184s3.C7084c1 c7084c1) {
    }

    @Override // p184s3.V
    public final p184s3.H h() {
        return null;
    }

    @Override // p184s3.V
    public final synchronized void h0() {
    }

    @Override // p184s3.V
    public final synchronized p184s3.c2 i() {
        return null;
    }

    @Override // p184s3.V
    public final void i2(p184s3.InterfaceC7101i0 interfaceC7101i0) {
    }

    @Override // p184s3.V
    public final p184s3.InterfaceC7101i0 j() {
        return null;
    }

    @Override // p184s3.V
    public final synchronized void j4(p184s3.Q1 q6) {
    }

    @Override // p184s3.V
    public final synchronized p184s3.U0 k() {
        return null;
    }

    @Override // p184s3.V
    public final synchronized p184s3.Y0 l() {
        return null;
    }

    @Override // p184s3.V
    public final void l1(p184s3.N0 n6) {
    }

    @Override // p184s3.V
    public final void m6(X3.a aVar) {
    }

    @Override // p184s3.V
    public final X3.a n() {
        return null;
    }

    @Override // p184s3.V
    public final void o3(p184s3.X1 x6, p184s3.K k6) {
    }

    final /* synthetic */ void p() {
        q6(5);
    }

    @Override // p204u3.z
    public final void p4(int i6) {
        int i10;
        if (i6 == 0) {
            throw null;
        }
        int i11 = i6 - 1;
        if (i11 == 0) {
            q6(2);
            return;
        }
        if (i11 != 1) {
            i10 = i11 != 2 ? 6 : 3;
        } else {
            i10 = 4;
        }
        q6(i10);
    }

    public final void q() {
        this.f31534C.d().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.O40
            @Override // java.lang.Runnable
            public final void run() {
                this.f30443C.p();
            }
        });
    }

    @Override // p204u3.z
    public final synchronized void q0() {
        com.google.android.gms.internal.ads.C2556Ky c2556Ky = this.f31544M;
        if (c2556Ky != null) {
            c2556Ky.l(p174r3.v.c().c() - this.f31542K, 1);
        }
    }

    @Override // p184s3.V
    public final void r2(java.lang.String str) {
    }

    @Override // p184s3.V
    public final synchronized java.lang.String t() {
        return this.f31537F;
    }

    @Override // p184s3.V
    public final synchronized java.lang.String u() {
        return null;
    }

    @Override // p184s3.V
    public final void u3(p184s3.H h6) {
    }

    @Override // p184s3.V
    public final synchronized void v3(p184s3.C7113m0 c7113m0) {
    }

    @Override // p184s3.V
    public final synchronized java.lang.String w() {
        return null;
    }

    @Override // p184s3.V
    public final void x4(p184s3.InterfaceC7077a0 interfaceC7077a0) {
    }

    @Override // p204u3.z
    public final void y0() {
    }
}
