package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class X2 extends p085i4.h {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.H5 f42198C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Boolean f42199D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.String f42200E;

    public X2(com.google.android.gms.measurement.internal.H5 h6) {
        this(h6, null);
    }

    private X2(com.google.android.gms.measurement.internal.H5 h6, java.lang.String str) {
        Q3.AbstractC1477p.l(h6);
        this.f42198C = h6;
        this.f42200E = null;
    }

    private final void c2(java.lang.Runnable runnable) {
        Q3.AbstractC1477p.l(runnable);
        if (this.f42198C.l().J()) {
            runnable.run();
        } else {
            this.f42198C.l().G(runnable);
        }
    }

    private final void d2(java.lang.String str, boolean z6) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.f42198C.j().G().a("Measurement Service called without app package");
            throw new java.lang.SecurityException("Measurement Service called without app package");
        }
        if (z6) {
            try {
                if (this.f42199D == null) {
                    this.f42199D = java.lang.Boolean.valueOf("com.google.android.gms".equals(this.f42200E) || V3.s.a(this.f42198C.a(), android.os.Binder.getCallingUid()) || N3.C1399l.a(this.f42198C.a()).c(android.os.Binder.getCallingUid()));
                }
                if (this.f42199D.booleanValue()) {
                    return;
                }
            } catch (java.lang.SecurityException e6) {
                this.f42198C.j().G().b("Measurement Service called with invalid calling package. appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
                throw e6;
            }
        }
        if (this.f42200E == null && N3.AbstractC1398k.j(this.f42198C.a(), android.os.Binder.getCallingUid(), str)) {
            this.f42200E = str;
        }
        if (str.equals(this.f42200E)) {
        } else {
            throw new java.lang.SecurityException(java.lang.String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void n6(java.lang.Runnable runnable) {
        Q3.AbstractC1477p.l(runnable);
        if (this.f42198C.l().J()) {
            runnable.run();
        } else {
            this.f42198C.l().D(runnable);
        }
    }

    private final void p4(com.google.android.gms.measurement.internal.M5 m6, boolean z6) {
        Q3.AbstractC1477p.l(m6);
        Q3.AbstractC1477p.f(m6.f42031C);
        d2(m6.f42031C, false);
        this.f42198C.y0().k0(m6.f42032D, m6.f42047S);
    }

    private final void p6(com.google.android.gms.measurement.internal.E e6, com.google.android.gms.measurement.internal.M5 m6) {
        this.f42198C.z0();
        this.f42198C.v(e6, m6);
    }

    @Override // p085i4.InterfaceC6654f
    public final void A1(com.google.android.gms.measurement.internal.M5 m6) {
        Q3.AbstractC1477p.f(m6.f42031C);
        d2(m6.f42031C, false);
        n6(new com.google.android.gms.measurement.internal.RunnableC6436o3(this, m6));
    }

    @Override // p085i4.InterfaceC6654f
    public final void C1(final android.os.Bundle bundle, com.google.android.gms.measurement.internal.M5 m6) {
        p4(m6, false);
        final java.lang.String str = m6.f42031C;
        Q3.AbstractC1477p.l(str);
        n6(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.b3
            @Override // java.lang.Runnable
            public final void run() {
                this.f42278C.L0(bundle, str);
            }
        });
    }

    @Override // p085i4.InterfaceC6654f
    public final void D1(com.google.android.gms.measurement.internal.M5 m6) {
        Q3.AbstractC1477p.f(m6.f42031C);
        Q3.AbstractC1477p.l(m6.f42052X);
        c2(new com.google.android.gms.measurement.internal.RunnableC6429n3(this, m6));
    }

    @Override // p085i4.InterfaceC6654f
    public final void G1(com.google.android.gms.measurement.internal.Y5 y6, com.google.android.gms.measurement.internal.M5 m6) {
        Q3.AbstractC1477p.l(y6);
        p4(m6, false);
        n6(new com.google.android.gms.measurement.internal.RunnableC6477u3(this, y6, m6));
    }

    final /* synthetic */ void L0(android.os.Bundle bundle, java.lang.String str) {
        boolean zT = this.f42198C.i0().t(com.google.android.gms.measurement.internal.G.f41879f1);
        boolean zT2 = this.f42198C.i0().t(com.google.android.gms.measurement.internal.G.f41885h1);
        if (bundle.isEmpty() && zT && zT2) {
            this.f42198C.l0().d1(str);
            return;
        }
        this.f42198C.l0().F0(str, bundle);
        if (zT2 && this.f42198C.l0().h1(str)) {
            this.f42198C.l0().X(str, bundle);
        }
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List N0(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.M5 m6) {
        p4(m6, false);
        java.lang.String str3 = m6.f42031C;
        Q3.AbstractC1477p.l(str3);
        try {
            return (java.util.List) this.f42198C.l().w(new com.google.android.gms.measurement.internal.CallableC6422m3(this, str3, str, str2)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e6) {
            this.f42198C.j().G().b("Failed to get conditional user properties", e6);
            return java.util.Collections.emptyList();
        }
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List S4(java.lang.String str, java.lang.String str2, boolean z6, com.google.android.gms.measurement.internal.M5 m6) {
        p4(m6, false);
        java.lang.String str3 = m6.f42031C;
        Q3.AbstractC1477p.l(str3);
        try {
            java.util.List<com.google.android.gms.measurement.internal.a6> list = (java.util.List) this.f42198C.l().w(new com.google.android.gms.measurement.internal.CallableC6408k3(this, str3, str, str2)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.a6 a6Var : list) {
                if (z6 || !com.google.android.gms.measurement.internal.d6.J0(a6Var.f42262c)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.Y5(a6Var));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException e6) {
            e = e6;
            this.f42198C.j().G().c("Failed to query user properties. appId", com.google.android.gms.measurement.internal.C6428n2.v(m6.f42031C), e);
            return java.util.Collections.emptyList();
        } catch (java.util.concurrent.ExecutionException e10) {
            e = e10;
            this.f42198C.j().G().c("Failed to query user properties. appId", com.google.android.gms.measurement.internal.C6428n2.v(m6.f42031C), e);
            return java.util.Collections.emptyList();
        }
    }

    final com.google.android.gms.measurement.internal.E T2(com.google.android.gms.measurement.internal.E e6, com.google.android.gms.measurement.internal.M5 m6) {
        com.google.android.gms.measurement.internal.D d6;
        if ("_cmp".equals(e6.f41772C) && (d6 = e6.f41773D) != null && d6.e() != 0) {
            java.lang.String strE = e6.f41773D.E("_cis");
            if ("referrer broadcast".equals(strE) || "referrer API".equals(strE)) {
                this.f42198C.j().J().b("Event has been filtered ", e6.toString());
                return new com.google.android.gms.measurement.internal.E("_cmpx", e6.f41773D, e6.f41774E, e6.f41775F);
            }
        }
        return e6;
    }

    @Override // p085i4.InterfaceC6654f
    public final void U0(final android.os.Bundle bundle, com.google.android.gms.measurement.internal.M5 m6) {
        if (com.google.android.gms.internal.measurement.C6083n6.a() && this.f42198C.i0().t(com.google.android.gms.measurement.internal.G.f41885h1)) {
            p4(m6, false);
            final java.lang.String str = m6.f42031C;
            Q3.AbstractC1477p.l(str);
            n6(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.Z2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42236C.f3(bundle, str);
                }
            });
        }
    }

    @Override // p085i4.InterfaceC6654f
    public final void U2(long j6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        n6(new com.google.android.gms.measurement.internal.RunnableC6373f3(this, str2, str3, str, j6));
    }

    @Override // p085i4.InterfaceC6654f
    public final void U3(com.google.android.gms.measurement.internal.E e6, java.lang.String str, java.lang.String str2) {
        Q3.AbstractC1477p.l(e6);
        Q3.AbstractC1477p.f(str);
        d2(str, true);
        n6(new com.google.android.gms.measurement.internal.RunnableC6463s3(this, e6, str));
    }

    @Override // p085i4.InterfaceC6654f
    public final void W5(com.google.android.gms.measurement.internal.M5 m6) {
        p4(m6, false);
        n6(new com.google.android.gms.measurement.internal.RunnableC6366e3(this, m6));
    }

    @Override // p085i4.InterfaceC6654f
    public final void X0(com.google.android.gms.measurement.internal.M5 m6) {
        p4(m6, false);
        n6(new com.google.android.gms.measurement.internal.RunnableC6359d3(this, m6));
    }

    @Override // p085i4.InterfaceC6654f
    public final void Y2(com.google.android.gms.measurement.internal.M5 m6) {
        p4(m6, false);
        n6(new com.google.android.gms.measurement.internal.RunnableC6380g3(this, m6));
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List Z2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        d2(str, true);
        try {
            return (java.util.List) this.f42198C.l().w(new com.google.android.gms.measurement.internal.CallableC6415l3(this, str, str2, str3)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e6) {
            this.f42198C.j().G().b("Failed to get conditional user properties as", e6);
            return java.util.Collections.emptyList();
        }
    }

    @Override // p085i4.InterfaceC6654f
    public final void d6(com.google.android.gms.measurement.internal.E e6, com.google.android.gms.measurement.internal.M5 m6) {
        Q3.AbstractC1477p.l(e6);
        p4(m6, false);
        n6(new com.google.android.gms.measurement.internal.RunnableC6443p3(this, e6, m6));
    }

    final /* synthetic */ void f3(android.os.Bundle bundle, java.lang.String str) {
        if (bundle.isEmpty()) {
            this.f42198C.l0().d1(str);
        } else {
            this.f42198C.l0().F0(str, bundle);
            this.f42198C.l0().X(str, bundle);
        }
    }

    @Override // p085i4.InterfaceC6654f
    public final void f4(final com.google.android.gms.measurement.internal.M5 m6) {
        Q3.AbstractC1477p.f(m6.f42031C);
        Q3.AbstractC1477p.l(m6.f42052X);
        c2(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.a3
            @Override // java.lang.Runnable
            public final void run() {
                this.f42250C.r6(m6);
            }
        });
    }

    @Override // p085i4.InterfaceC6654f
    public final void j5(final com.google.android.gms.measurement.internal.M5 m6) {
        Q3.AbstractC1477p.f(m6.f42031C);
        Q3.AbstractC1477p.l(m6.f42052X);
        c2(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.c3
            @Override // java.lang.Runnable
            public final void run() {
                this.f42333C.q6(m6);
            }
        });
    }

    @Override // p085i4.InterfaceC6654f
    public final java.lang.String k2(com.google.android.gms.measurement.internal.M5 m6) {
        p4(m6, false);
        return this.f42198C.V(m6);
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List k5(com.google.android.gms.measurement.internal.M5 m6, android.os.Bundle bundle) {
        p4(m6, false);
        Q3.AbstractC1477p.l(m6.f42031C);
        try {
            return (java.util.List) this.f42198C.l().w(new com.google.android.gms.measurement.internal.CallableC6470t3(this, m6, bundle)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e6) {
            this.f42198C.j().G().c("Failed to get trigger URIs. appId", com.google.android.gms.measurement.internal.C6428n2.v(m6.f42031C), e6);
            return java.util.Collections.emptyList();
        }
    }

    @Override // p085i4.InterfaceC6654f
    public final byte[] l5(com.google.android.gms.measurement.internal.E e6, java.lang.String str) {
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.l(e6);
        d2(str, true);
        this.f42198C.j().F().b("Log and bundle. event", this.f42198C.n0().c(e6.f41772C));
        long jB = this.f42198C.b().b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f42198C.l().B(new com.google.android.gms.measurement.internal.CallableC6456r3(this, e6, str)).get();
            if (bArr == null) {
                this.f42198C.j().G().b("Log and bundle returned null. appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
                bArr = new byte[0];
            }
            this.f42198C.j().F().d("Log and bundle processed. event, size, time_ms", this.f42198C.n0().c(e6.f41772C), java.lang.Integer.valueOf(bArr.length), java.lang.Long.valueOf((this.f42198C.b().b() / 1000000) - jB));
            return bArr;
        } catch (java.lang.InterruptedException e10) {
            e = e10;
            this.f42198C.j().G().d("Failed to log and bundle. appId, event, error", com.google.android.gms.measurement.internal.C6428n2.v(str), this.f42198C.n0().c(e6.f41772C), e);
            return null;
        } catch (java.util.concurrent.ExecutionException e11) {
            e = e11;
            this.f42198C.j().G().d("Failed to log and bundle. appId, event, error", com.google.android.gms.measurement.internal.C6428n2.v(str), this.f42198C.n0().c(e6.f41772C), e);
            return null;
        }
    }

    @Override // p085i4.InterfaceC6654f
    public final void m3(com.google.android.gms.measurement.internal.C6362e c6362e) {
        Q3.AbstractC1477p.l(c6362e);
        Q3.AbstractC1477p.l(c6362e.f42361E);
        Q3.AbstractC1477p.f(c6362e.f42359C);
        d2(c6362e.f42359C, true);
        n6(new com.google.android.gms.measurement.internal.RunnableC6387h3(this, new com.google.android.gms.measurement.internal.C6362e(c6362e)));
    }

    final void o6(com.google.android.gms.measurement.internal.E e6, com.google.android.gms.measurement.internal.M5 m6) {
        boolean zD;
        if (!this.f42198C.r0().W(m6.f42031C)) {
            p6(e6, m6);
            return;
        }
        this.f42198C.j().K().b("EES config found for", m6.f42031C);
        com.google.android.gms.measurement.internal.I2 i2R0 = this.f42198C.r0();
        java.lang.String str = m6.f42031C;
        com.google.android.gms.internal.measurement.C c6 = android.text.TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.C) i2R0.f41982j.c(str);
        if (c6 == null) {
            this.f42198C.j().K().b("EES not loaded for", m6.f42031C);
        } else {
            try {
                java.util.Map mapQ = this.f42198C.x0().Q(e6.f41773D.w(), true);
                java.lang.String strA = p085i4.q.a(e6.f41772C);
                if (strA == null) {
                    strA = e6.f41772C;
                }
                zD = c6.d(new com.google.android.gms.internal.measurement.C5995e(strA, e6.f41775F, mapQ));
            } catch (com.google.android.gms.internal.measurement.C5996e0 unused) {
                this.f42198C.j().G().c("EES error. appId, eventName", m6.f42032D, e6.f41772C);
                zD = false;
            }
            if (zD) {
                if (c6.g()) {
                    this.f42198C.j().K().b("EES edited event", e6.f41772C);
                    e6 = this.f42198C.x0().H(c6.a().d());
                }
                p6(e6, m6);
                if (c6.f()) {
                    for (com.google.android.gms.internal.measurement.C5995e c5995e : c6.a().f()) {
                        this.f42198C.j().K().b("EES logging created event", c5995e.e());
                        p6(this.f42198C.x0().H(c5995e), m6);
                    }
                    return;
                }
                return;
            }
            this.f42198C.j().K().b("EES was not applied to event", e6.f41772C);
        }
        p6(e6, m6);
    }

    final /* synthetic */ void q6(com.google.android.gms.measurement.internal.M5 m6) {
        this.f42198C.z0();
        this.f42198C.m0(m6);
    }

    final /* synthetic */ void r6(com.google.android.gms.measurement.internal.M5 m6) {
        this.f42198C.z0();
        this.f42198C.o0(m6);
    }

    @Override // p085i4.InterfaceC6654f
    public final p085i4.C6650b s4(com.google.android.gms.measurement.internal.M5 m6) {
        p4(m6, false);
        Q3.AbstractC1477p.f(m6.f42031C);
        try {
            return (p085i4.C6650b) this.f42198C.l().B(new com.google.android.gms.measurement.internal.CallableC6450q3(this, m6)).get(10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e6) {
            this.f42198C.j().G().c("Failed to get consent. appId", com.google.android.gms.measurement.internal.C6428n2.v(m6.f42031C), e6);
            return new p085i4.C6650b(null);
        }
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List w1(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        d2(str, true);
        try {
            java.util.List<com.google.android.gms.measurement.internal.a6> list = (java.util.List) this.f42198C.l().w(new com.google.android.gms.measurement.internal.CallableC6401j3(this, str, str2, str3)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.a6 a6Var : list) {
                if (z6 || !com.google.android.gms.measurement.internal.d6.J0(a6Var.f42262c)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.Y5(a6Var));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException e6) {
            e = e6;
            this.f42198C.j().G().c("Failed to get user properties as. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e);
            return java.util.Collections.emptyList();
        } catch (java.util.concurrent.ExecutionException e10) {
            e = e10;
            this.f42198C.j().G().c("Failed to get user properties as. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e);
            return java.util.Collections.emptyList();
        }
    }

    @Override // p085i4.InterfaceC6654f
    public final void w2(com.google.android.gms.measurement.internal.C6362e c6362e, com.google.android.gms.measurement.internal.M5 m6) {
        Q3.AbstractC1477p.l(c6362e);
        Q3.AbstractC1477p.l(c6362e.f42361E);
        p4(m6, false);
        com.google.android.gms.measurement.internal.C6362e c6362e2 = new com.google.android.gms.measurement.internal.C6362e(c6362e);
        c6362e2.f42359C = m6.f42031C;
        n6(new com.google.android.gms.measurement.internal.RunnableC6394i3(this, c6362e2, m6));
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List z5(com.google.android.gms.measurement.internal.M5 m6, boolean z6) {
        p4(m6, false);
        java.lang.String str = m6.f42031C;
        Q3.AbstractC1477p.l(str);
        try {
            java.util.List<com.google.android.gms.measurement.internal.a6> list = (java.util.List) this.f42198C.l().w(new com.google.android.gms.measurement.internal.CallableC6498x3(this, str)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.a6 a6Var : list) {
                if (z6 || !com.google.android.gms.measurement.internal.d6.J0(a6Var.f42262c)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.Y5(a6Var));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException e6) {
            e = e6;
            this.f42198C.j().G().c("Failed to get user properties. appId", com.google.android.gms.measurement.internal.C6428n2.v(m6.f42031C), e);
            return null;
        } catch (java.util.concurrent.ExecutionException e10) {
            e = e10;
            this.f42198C.j().G().c("Failed to get user properties. appId", com.google.android.gms.measurement.internal.C6428n2.v(m6.f42031C), e);
            return null;
        }
    }
}
