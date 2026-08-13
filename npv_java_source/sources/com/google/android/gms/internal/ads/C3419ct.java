package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3419ct extends com.google.android.gms.internal.ads.AbstractC2880Ts implements com.google.android.gms.internal.ads.InterfaceC2951Vr {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC2987Wr f34582F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.lang.String f34583G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f34584H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f34585I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2550Ks f34586J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f34587K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f34588L;

    public C3419ct(com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs, com.google.android.gms.internal.ads.C3636es c3636es) {
        super(interfaceC3746fs);
        com.google.android.gms.internal.ads.C5615wt c5615wt = new com.google.android.gms.internal.ads.C5615wt(interfaceC3746fs.getContext(), c3636es, (com.google.android.gms.internal.ads.InterfaceC3746fs) this.f32025E.get(), null);
        p224w3.p.f("ExoPlayerAdapter initialized.");
        this.f34582F = c5615wt;
        c5615wt.C(this);
    }

    private static java.lang.String C(java.lang.String str, java.lang.Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void D(long j6) {
        p214v3.E0.f55826l.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.bt
            @Override // java.lang.Runnable
            public final void run() throws java.lang.Throwable {
                this.f34390C.u();
            }
        }, j6);
    }

    protected static final java.lang.String w(java.lang.String str) {
        return "cache:".concat(java.lang.String.valueOf(p224w3.g.h(str)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void A(final boolean z6, final long j6) {
        final com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) this.f32025E.get();
        if (interfaceC3746fs != null) {
            com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.at
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC3746fs.F0(z6, j6);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void B(java.lang.String str, java.lang.Exception exc) {
        p224w3.p.h("Precache error", exc);
        p174r3.v.s().w(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts, O3.i
    public final void a() {
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f34582F;
        if (abstractC2987Wr != null) {
            abstractC2987Wr.C(null);
            this.f34582F.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final void c() {
        synchronized (this) {
            this.f34584H = true;
            notify();
            a();
        }
        java.lang.String str = this.f34583G;
        if (str != null) {
            d(this.f34583G, w(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final void k(int i6) {
        this.f34582F.A(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final void l(int i6) {
        this.f34582F.B(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final void m(int i6) {
        this.f34582F.D(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final void n(int i6) {
        this.f34582F.E(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final boolean p(java.lang.String str) {
        return r(str, new java.lang.String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.fs] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.Ts, com.google.android.gms.internal.ads.ct] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.ct] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.Ts] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final boolean r(java.lang.String str, java.lang.String[] strArr) throws java.lang.Throwable {
        ?? r6;
        java.lang.String str2;
        ?? r10;
        long j6;
        ?? r11;
        ?? r12;
        java.lang.String str3;
        long j10;
        ?? r15 = this;
        ?? r13 = str;
        r15.f34583G = r13;
        java.lang.String strW = w(str);
        try {
            android.net.Uri[] uriArr = new android.net.Uri[strArr.length];
            for (int i6 = 0; i6 < strArr.length; i6++) {
                uriArr[i6] = android.net.Uri.parse(strArr[i6]);
            }
            r15.f34582F.w(uriArr, r15.f32024D);
            ?? r14 = (com.google.android.gms.internal.ads.InterfaceC3746fs) r15.f32025E.get();
            if (r14 != 0) {
                r14.y(strW, r15);
            }
            V3.f fVarC = p174r3.v.c();
            long jA = fVarC.a();
            long jLongValue = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25327L)).longValue();
            long jLongValue2 = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25316K)).longValue() * 1000;
            long jIntValue = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25681s)).intValue();
            boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue();
            long j11 = -1;
            long j12 = jIntValue;
            r13 = r13;
            r15 = r15;
            while (true) {
                synchronized (this) {
                    try {
                        if (fVarC.a() - jA > jLongValue2) {
                            throw new java.io.IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (r15.f34584H) {
                            throw new java.io.IOException("Abort requested before buffering finished. ");
                        }
                        if (!r15.f34585I) {
                            if (!r15.f34582F.M()) {
                                throw new java.io.IOException("ExoPlayer was released during preloading.");
                            }
                            long jV = r15.f34582F.V();
                            if (jV > 0) {
                                long jR = r15.f34582F.R();
                                if (jR != j11) {
                                    try {
                                        long j13 = jV;
                                        str3 = strW;
                                        try {
                                            j(str, strW, jR, j13, jR > 0, zBooleanValue ? r15.f34582F.r() : -1L, zBooleanValue ? r15.f34582F.T() : -1L, zBooleanValue ? r15.f34582F.s() : -1L, com.google.android.gms.internal.ads.AbstractC2987Wr.O(), com.google.android.gms.internal.ads.AbstractC2987Wr.Q());
                                            j11 = jR;
                                            j10 = jV;
                                            r11 = j13;
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            r10 = this;
                                            r6 = str;
                                            str2 = str3;
                                            try {
                                                throw th;
                                            } catch (java.lang.Exception e6) {
                                                e = e6;
                                                p224w3.p.g("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                                p174r3.v.s().w(e, "VideoStreamExoPlayerCache.preload");
                                                a();
                                                r10.d(r6, str2, "error", C("error", e));
                                                return false;
                                            }
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        str3 = strW;
                                    }
                                } else {
                                    str3 = strW;
                                    j10 = jV;
                                    r11 = j12;
                                }
                                r12 = (jR > j10 ? 1 : (jR == j10 ? 0 : -1));
                                if (r12 >= 0) {
                                    g(str, str3, j10);
                                } else {
                                    try {
                                        com.google.android.gms.internal.ads.C3419ct c3419ct = this;
                                        r11 = str;
                                        str2 = str3;
                                        if (c3419ct.f34582F.S() < j12 || jR <= 0) {
                                            r12 = c3419ct;
                                            j6 = j12;
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        r10 = r12;
                                        r6 = r11;
                                        throw th;
                                    }
                                }
                            } else {
                                j6 = j12;
                                jLongValue2 = jLongValue2;
                                r11 = r13;
                                str2 = strW;
                                r12 = r15;
                            }
                            try {
                                r12.wait(jLongValue);
                            } catch (java.lang.InterruptedException unused) {
                                throw new java.io.IOException("Wait interrupted.");
                            }
                        }
                        return true;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        r6 = r13;
                        str2 = strW;
                        r10 = r15;
                    }
                }
                return true;
                jLongValue = jLongValue;
                r15 = r12;
                r13 = r11;
                strW = str2;
                j12 = j6;
                jLongValue2 = jLongValue2;
            }
        } catch (java.lang.Exception e10) {
            e = e10;
            r6 = r13;
            str2 = strW;
            r10 = r15;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final boolean s(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.internal.ads.C2550Ks c2550Ks) {
        this.f34583G = str;
        this.f34586J = c2550Ks;
        java.lang.String strW = w(str);
        try {
            android.net.Uri[] uriArr = new android.net.Uri[strArr.length];
            for (int i6 = 0; i6 < strArr.length; i6++) {
                uriArr[i6] = android.net.Uri.parse(strArr[i6]);
            }
            this.f34582F.w(uriArr, this.f32024D);
            com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) this.f32025E.get();
            if (interfaceC3746fs != null) {
                interfaceC3746fs.y(strW, this);
            }
            this.f34587K = p174r3.v.c().a();
            this.f34588L = -1L;
            D(0L);
            return true;
        } catch (java.lang.Exception e6) {
            p224w3.p.g("Failed to preload url " + str + " Exception: " + e6.getMessage());
            p174r3.v.s().w(e6, "VideoStreamExoPlayerCache.preload");
            a();
            d(str, strW, "error", C("error", e6));
            return false;
        }
    }

    public final com.google.android.gms.internal.ads.AbstractC2987Wr t() {
        synchronized (this) {
            this.f34585I = true;
            notify();
        }
        this.f34582F.C(null);
        com.google.android.gms.internal.ads.AbstractC2987Wr abstractC2987Wr = this.f34582F;
        this.f34582F = null;
        return abstractC2987Wr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void u() throws java.lang.Throwable {
        java.lang.String str;
        com.google.android.gms.internal.ads.C3419ct c3419ct;
        com.google.android.gms.internal.ads.C3419ct c3419ct2;
        com.google.android.gms.internal.ads.C3419ct c3419ct3;
        long j6;
        java.lang.String str2;
        com.google.android.gms.internal.ads.C3419ct c3419ct4;
        long j10;
        java.lang.String strW = w(this.f34583G);
        try {
            long jLongValue = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25316K)).longValue() * 1000;
            long jIntValue = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25681s)).intValue();
            boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue();
            try {
                synchronized (this) {
                    try {
                        if (p174r3.v.c().a() - this.f34587K > jLongValue) {
                            throw new java.io.IOException("Timeout reached. Limit: " + jLongValue + " ms");
                        }
                        if (this.f34584H) {
                            throw new java.io.IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.f34585I) {
                            if (!this.f34582F.M()) {
                                throw new java.io.IOException("ExoPlayer was released during preloading.");
                            }
                            long jV = this.f34582F.V();
                            if (jV > 0) {
                                long jR = this.f34582F.R();
                                if (jR != this.f34588L) {
                                    try {
                                        str2 = strW;
                                        try {
                                            j(this.f34583G, strW, jR, jV, jR > 0, zBooleanValue ? this.f34582F.r() : -1L, zBooleanValue ? this.f34582F.T() : -1L, zBooleanValue ? this.f34582F.s() : -1L, com.google.android.gms.internal.ads.AbstractC2987Wr.O(), com.google.android.gms.internal.ads.AbstractC2987Wr.Q());
                                            c3419ct4 = this;
                                            j6 = jR;
                                            try {
                                                c3419ct4.f34588L = j6;
                                                j10 = jV;
                                                c3419ct4 = c3419ct4;
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                str = str2;
                                                c3419ct = c3419ct4;
                                                try {
                                                    throw th;
                                                } catch (java.lang.Exception e6) {
                                                    e = e6;
                                                    p224w3.p.g("Failed to preload url " + c3419ct.f34583G + " Exception: " + e.getMessage());
                                                    p174r3.v.s().w(e, "VideoStreamExoPlayerCache.preload");
                                                    a();
                                                    c3419ct.d(c3419ct.f34583G, str, "error", C("error", e));
                                                    c3419ct2 = c3419ct;
                                                    p174r3.v.C().f(c3419ct2.f34586J);
                                                }
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            c3419ct4 = this;
                                            str = str2;
                                            c3419ct = c3419ct4;
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        str2 = strW;
                                        c3419ct4 = this;
                                    }
                                } else {
                                    j6 = jR;
                                    str2 = strW;
                                    c3419ct4 = this;
                                    j10 = jV;
                                }
                                if (j6 >= j10) {
                                    c3419ct4.g(c3419ct4.f34583G, str2, j10);
                                } else if (c3419ct4.f34582F.S() >= jIntValue && j6 > 0) {
                                    c3419ct3 = c3419ct4;
                                    c3419ct3 = c3419ct4;
                                }
                                c3419ct2 = c3419ct4;
                            } else {
                                c3419ct3 = this;
                            }
                            c3419ct3.D(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25327L)).longValue());
                            return;
                        }
                        c3419ct2 = this;
                        p174r3.v.C().f(c3419ct2.f34586J);
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        str = strW;
                        c3419ct = this;
                    }
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                c3419ct = zBooleanValue;
            }
        } catch (java.lang.Exception e10) {
            e = e10;
            str = strW;
            c3419ct = this;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void v() {
        p224w3.p.g("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void x(int i6, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void y(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2951Vr
    public final void z(java.lang.String str, java.lang.Exception exc) {
        p224w3.p.h("Precache exception", exc);
        p174r3.v.s().w(exc, "VideoStreamExoPlayerCache.onException");
    }
}
