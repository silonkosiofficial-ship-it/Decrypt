package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6376g extends com.google.android.gms.measurement.internal.AbstractC6491w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Boolean f42390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f42391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.InterfaceC6390i f42392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.Boolean f42393e;

    C6376g(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42392d = new com.google.android.gms.measurement.internal.InterfaceC6390i() { // from class: com.google.android.gms.measurement.internal.f
            @Override // com.google.android.gms.measurement.internal.InterfaceC6390i
            public final java.lang.String c(java.lang.String str, java.lang.String str2) {
                return null;
            }
        };
    }

    public static long I() {
        return ((java.lang.Long) com.google.android.gms.measurement.internal.G.f41874e.a(null)).longValue();
    }

    public static long K() {
        return ((java.lang.Integer) com.google.android.gms.measurement.internal.G.f41895l.a(null)).intValue();
    }

    public static long P() {
        return ((java.lang.Long) com.google.android.gms.measurement.internal.G.f41820F.a(null)).longValue();
    }

    public static long Q() {
        return ((java.lang.Long) com.google.android.gms.measurement.internal.G.f41810A.a(null)).longValue();
    }

    private final java.lang.String c(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2G;
        java.lang.String str3;
        try {
            java.lang.String str4 = (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class).invoke(null, str, str2);
            Q3.AbstractC1477p.l(str4);
            return str4;
        } catch (java.lang.ClassNotFoundException e6) {
            e = e6;
            c6442p2G = j().G();
            str3 = "Could not find SystemProperties class";
            c6442p2G.b(str3, e);
            return str2;
        } catch (java.lang.IllegalAccessException e10) {
            e = e10;
            c6442p2G = j().G();
            str3 = "Could not access SystemProperties.get()";
            c6442p2G.b(str3, e);
            return str2;
        } catch (java.lang.NoSuchMethodException e11) {
            e = e11;
            c6442p2G = j().G();
            str3 = "Could not find SystemProperties.get() method";
            c6442p2G.b(str3, e);
            return str2;
        } catch (java.lang.reflect.InvocationTargetException e12) {
            e = e12;
            c6442p2G = j().G();
            str3 = "SystemProperties.get() threw an exception";
            c6442p2G.b(str3, e);
            return str2;
        }
    }

    private final android.os.Bundle u() {
        try {
            if (a().getPackageManager() == null) {
                j().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            android.content.pm.ApplicationInfo applicationInfoC = W3.e.a(a()).c(a().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            j().G().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            j().G().b("Failed to load metadata: Package name not found", e6);
            return null;
        }
    }

    public final long A(java.lang.String str, com.google.android.gms.measurement.internal.C6344b2 c6344b2) {
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.String strC = this.f42392d.c(str, c6344b2.b());
            if (!android.text.TextUtils.isEmpty(strC)) {
                try {
                    return ((java.lang.Long) c6344b2.a(java.lang.Long.valueOf(java.lang.Long.parseLong(strC)))).longValue();
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return ((java.lang.Long) c6344b2.a(null)).longValue();
    }

    public final p085i4.p B(java.lang.String str, boolean z6) {
        java.lang.Object obj;
        Q3.AbstractC1477p.f(str);
        android.os.Bundle bundleU = u();
        if (bundleU == null) {
            j().G().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleU.get(str);
        }
        if (obj == null) {
            return p085i4.p.UNINITIALIZED;
        }
        if (java.lang.Boolean.TRUE.equals(obj)) {
            return p085i4.p.GRANTED;
        }
        if (java.lang.Boolean.FALSE.equals(obj)) {
            return p085i4.p.DENIED;
        }
        if (z6 && "eu_consent_policy".equals(obj)) {
            return p085i4.p.POLICY;
        }
        j().L().b("Invalid manifest metadata for", str);
        return p085i4.p.UNINITIALIZED;
    }

    final long C(java.lang.String str) {
        return A(str, com.google.android.gms.measurement.internal.G.f41865b);
    }

    public final java.lang.String D(java.lang.String str, com.google.android.gms.measurement.internal.C6344b2 c6344b2) {
        return (java.lang.String) c6344b2.a(android.text.TextUtils.isEmpty(str) ? null : this.f42392d.c(str, c6344b2.b()));
    }

    final java.lang.Boolean E(java.lang.String str) {
        Q3.AbstractC1477p.f(str);
        android.os.Bundle bundleU = u();
        if (bundleU == null) {
            j().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleU.containsKey(str)) {
            return java.lang.Boolean.valueOf(bundleU.getBoolean(str));
        }
        return null;
    }

    public final boolean F(java.lang.String str, com.google.android.gms.measurement.internal.C6344b2 c6344b2) {
        return H(str, c6344b2);
    }

    final java.lang.String G(java.lang.String str) {
        return D(str, com.google.android.gms.measurement.internal.G.f41838O);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final boolean H(java.lang.String str, com.google.android.gms.measurement.internal.C6344b2 c6344b2) {
        java.lang.Object objA;
        if (android.text.TextUtils.isEmpty(str)) {
            objA = c6344b2.a(null);
        } else {
            java.lang.String strC = this.f42392d.c(str, c6344b2.b());
            if (android.text.TextUtils.isEmpty(strC)) {
                objA = c6344b2.a(null);
            } else {
                objA = c6344b2.a(java.lang.Boolean.valueOf("1".equals(strC)));
            }
        }
        return ((java.lang.Boolean) objA).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: NotFoundException -> 0x0043, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0043, blocks: (B:12:0x002b, B:15:0x003e), top: B:20:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final java.util.List J(java.lang.String str) {
        java.lang.Integer numValueOf;
        java.lang.String[] stringArray;
        Q3.AbstractC1477p.f(str);
        android.os.Bundle bundleU = u();
        if (bundleU != null) {
            if (bundleU.containsKey(str)) {
                numValueOf = java.lang.Integer.valueOf(bundleU.getInt(str));
            }
            if (numValueOf == null) {
                return null;
            }
            try {
                stringArray = a().getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    return null;
                }
                return java.util.Arrays.asList(stringArray);
            } catch (android.content.res.Resources.NotFoundException e6) {
                j().G().b("Failed to load string array from metadata: resource not found", e6);
                return null;
            }
        }
        j().G().a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf == null) {
            return null;
        }
        stringArray = a().getResources().getStringArray(numValueOf.intValue());
        if (stringArray == null) {
            return null;
        }
        return java.util.Arrays.asList(stringArray);
    }

    public final void L(java.lang.String str) {
        this.f42391c = str;
    }

    final boolean M(java.lang.String str) {
        return H(str, com.google.android.gms.measurement.internal.G.f41836N);
    }

    public final boolean N(java.lang.String str) {
        return "1".equals(this.f42392d.c(str, "gaia_collection_enabled"));
    }

    public final boolean O(java.lang.String str) {
        return "1".equals(this.f42392d.c(str, "measurement.event_sampling_enabled"));
    }

    public final java.lang.String R() {
        return c("debug.firebase.analytics.app", "");
    }

    public final java.lang.String S() {
        return c("debug.deferred.deeplink", "");
    }

    public final java.lang.String T() {
        return this.f42391c;
    }

    public final boolean U() {
        java.lang.Boolean boolE = E("google_analytics_adid_collection_enabled");
        return boolE == null || boolE.booleanValue();
    }

    public final boolean V() {
        java.lang.Boolean boolE = E("google_analytics_automatic_screen_reporting_enabled");
        return boolE == null || boolE.booleanValue();
    }

    public final boolean W() {
        java.lang.Boolean boolE = E("firebase_analytics_collection_deactivated");
        return boolE != null && boolE.booleanValue();
    }

    final boolean X() {
        if (this.f42390b == null) {
            java.lang.Boolean boolE = E("app_measurement_lite");
            this.f42390b = boolE;
            if (boolE == null) {
                this.f42390b = java.lang.Boolean.FALSE;
            }
        }
        return this.f42390b.booleanValue() || !this.f42679a.t();
    }

    public final boolean Y() {
        if (this.f42393e == null) {
            synchronized (this) {
                try {
                    if (this.f42393e == null) {
                        android.content.pm.ApplicationInfo applicationInfo = a().getApplicationInfo();
                        java.lang.String strA = V3.p.a();
                        if (applicationInfo != null) {
                            java.lang.String str = applicationInfo.processName;
                            this.f42393e = java.lang.Boolean.valueOf(str != null && str.equals(strA));
                        }
                        if (this.f42393e == null) {
                            this.f42393e = java.lang.Boolean.TRUE;
                            j().G().a("My process not in the list of running processes");
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return this.f42393e.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final double o(java.lang.String str, com.google.android.gms.measurement.internal.C6344b2 c6344b2) {
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.String strC = this.f42392d.c(str, c6344b2.b());
            if (!android.text.TextUtils.isEmpty(strC)) {
                try {
                    return ((java.lang.Double) c6344b2.a(java.lang.Double.valueOf(java.lang.Double.parseDouble(strC)))).doubleValue();
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return ((java.lang.Double) c6344b2.a(null)).doubleValue();
    }

    final int p(java.lang.String str) {
        return q(str, com.google.android.gms.measurement.internal.G.f41830K, 500, 2000);
    }

    public final int q(java.lang.String str, com.google.android.gms.measurement.internal.C6344b2 c6344b2, int i6, int i10) {
        return java.lang.Math.max(java.lang.Math.min(w(str, c6344b2), i10), i6);
    }

    final int r(java.lang.String str, boolean z6) {
        if (z6) {
            return q(str, com.google.android.gms.measurement.internal.G.f41850U, 100, 500);
        }
        return 500;
    }

    final void s(com.google.android.gms.measurement.internal.InterfaceC6390i interfaceC6390i) {
        this.f42392d = interfaceC6390i;
    }

    public final boolean t(com.google.android.gms.measurement.internal.C6344b2 c6344b2) {
        return H(null, c6344b2);
    }

    public final int v(java.lang.String str) {
        return q(str, com.google.android.gms.measurement.internal.G.f41832L, 25, 100);
    }

    public final int w(java.lang.String str, com.google.android.gms.measurement.internal.C6344b2 c6344b2) {
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.String strC = this.f42392d.c(str, c6344b2.b());
            if (!android.text.TextUtils.isEmpty(strC)) {
                try {
                    return ((java.lang.Integer) c6344b2.a(java.lang.Integer.valueOf(java.lang.Integer.parseInt(strC)))).intValue();
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return ((java.lang.Integer) c6344b2.a(null)).intValue();
    }

    final int x(java.lang.String str, boolean z6) {
        return java.lang.Math.max(r(str, z6), 256);
    }

    public final int y() {
        return i().c0(201500000, true) ? 100 : 25;
    }

    public final int z(java.lang.String str) {
        return w(str, com.google.android.gms.measurement.internal.G.f41905p);
    }
}
