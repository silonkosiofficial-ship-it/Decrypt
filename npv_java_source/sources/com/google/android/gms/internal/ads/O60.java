package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class O60 extends com.google.android.gms.internal.ads.AbstractBinderC3520dp {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.E60 f30447C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5203t60 f30448D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3668f70 f30449E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3696fM f30450F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f30451G = false;

    public O60(com.google.android.gms.internal.ads.E60 e60, com.google.android.gms.internal.ads.C5203t60 c5203t60, com.google.android.gms.internal.ads.C3668f70 c3668f70) {
        this.f30447C = e60;
        this.f30448D = c5203t60;
        this.f30449E = c3668f70;
    }

    private final synchronized boolean r6() {
        com.google.android.gms.internal.ads.C3696fM c3696fM = this.f30450F;
        return (c3696fM == null || c3696fM.l()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final synchronized void I0(X3.a aVar) {
        Q3.AbstractC1477p.e("pause must be called on the main UI thread.");
        if (this.f30450F != null) {
            this.f30450F.d().r1(aVar == null ? null : (android.content.Context) X3.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final void J1(p184s3.InterfaceC7077a0 interfaceC7077a0) {
        Q3.AbstractC1477p.e("setAdMetadataListener can only be called from the UI thread.");
        if (interfaceC7077a0 == null) {
            this.f30448D.i(null);
        } else {
            this.f30448D.i(new com.google.android.gms.internal.ads.N60(this, interfaceC7077a0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final synchronized void O(boolean z6) {
        Q3.AbstractC1477p.e("setImmersiveMode must be called on the main UI thread.");
        this.f30451G = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final void Z5(com.google.android.gms.internal.ads.InterfaceC4069ip interfaceC4069ip) {
        Q3.AbstractC1477p.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f30448D.z(interfaceC4069ip);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final android.os.Bundle b() {
        Q3.AbstractC1477p.e("getAdMetadata can only be called from the UI thread.");
        com.google.android.gms.internal.ads.C3696fM c3696fM = this.f30450F;
        return c3696fM != null ? c3696fM.i() : new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final synchronized void b0(X3.a aVar) {
        Q3.AbstractC1477p.e("resume must be called on the main UI thread.");
        if (this.f30450F != null) {
            this.f30450F.d().s1(aVar == null ? null : (android.content.Context) X3.b.L0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final synchronized p184s3.U0 c() {
        com.google.android.gms.internal.ads.C3696fM c3696fM;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25235C6)).booleanValue() && (c3696fM = this.f30450F) != null) {
            return c3696fM.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final void d() {
        k0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final synchronized java.lang.String f() {
        com.google.android.gms.internal.ads.C3696fM c3696fM = this.f30450F;
        if (c3696fM == null || c3696fM.c() == null) {
            return null;
        }
        return c3696fM.c().i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final void g() {
        I0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final synchronized void g0(X3.a aVar) {
        try {
            Q3.AbstractC1477p.e("showAd must be called on the main UI thread.");
            if (this.f30450F != null) {
                android.app.Activity activity = null;
                if (aVar != null) {
                    java.lang.Object objL0 = X3.b.L0(aVar);
                    if (objL0 instanceof android.app.Activity) {
                        activity = (android.app.Activity) objL0;
                    }
                }
                this.f30450F.o(this.f30451G, activity);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final void j() {
        b0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final synchronized void k0(X3.a aVar) {
        Q3.AbstractC1477p.e("destroy must be called on the main UI thread.");
        android.content.Context context = null;
        this.f30448D.i(null);
        if (this.f30450F != null) {
            if (aVar != null) {
                context = (android.content.Context) X3.b.L0(aVar);
            }
            this.f30450F.d().q1(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25697t5)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void n4(com.google.android.gms.internal.ads.C4178jp r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            Q3.AbstractC1477p.e(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.f36739D     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.rf r1 = com.google.android.gms.internal.ads.AbstractC2161Af.f25677r5     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.yf r2 = p184s3.A.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L64
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.Uq r2 = p174r3.v.s()     // Catch: java.lang.Throwable -> L20
            r2.x(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.r6()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.rf r0 = com.google.android.gms.internal.ads.AbstractC2161Af.f25697t5     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.yf r1 = p184s3.A.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.v60 r0 = new com.google.android.gms.internal.ads.v60     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.f30450F = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.E60 r1 = r4.f30447C     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.j(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.E60 r1 = r4.f30447C     // Catch: java.lang.Throwable -> L20
            s3.X1 r2 = r5.f36738C     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.f36739D     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.M60 r3 = new com.google.android.gms.internal.ads.M60     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.b(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.O60.n4(com.google.android.gms.internal.ads.jp):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final void o2(com.google.android.gms.internal.ads.C3411cp c3411cp) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f30448D.B(c3411cp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final synchronized void s() {
        g0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final boolean u() {
        Q3.AbstractC1477p.e("isLoaded must be called on the main UI thread.");
        return r6();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final synchronized void u0(java.lang.String str) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.: setCustomData");
        this.f30449E.f35279b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final synchronized void v0(java.lang.String str) {
        Q3.AbstractC1477p.e("setUserId must be called on the main UI thread.");
        this.f30449E.f35278a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630ep
    public final boolean w() {
        com.google.android.gms.internal.ads.C3696fM c3696fM = this.f30450F;
        return c3696fM != null && c3696fM.n();
    }
}
