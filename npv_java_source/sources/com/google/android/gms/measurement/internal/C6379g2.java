package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6379g2 extends com.google.android.gms.measurement.internal.AbstractC6504y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f42394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f42395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f42397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f42398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f42399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.List f42400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.lang.String f42401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private java.lang.String f42403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private java.lang.String f42404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private java.lang.String f42405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f42406o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private java.lang.String f42407p;

    C6379g2(com.google.android.gms.measurement.internal.S2 s6, long j6) {
        super(s6);
        this.f42406o = 0L;
        this.f42407p = null;
        this.f42399h = j6;
    }

    private final java.lang.String J() {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2N;
        java.lang.String str;
        if (com.google.android.gms.internal.measurement.x7.a() && d().t(com.google.android.gms.measurement.internal.G.f41912s0)) {
            c6442p2N = j().K();
            str = "Disabled IID for tests.";
        } else {
            try {
                java.lang.Class<?> clsLoadClass = a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    return null;
                }
                try {
                    java.lang.Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", android.content.Context.class).invoke(null, a());
                    if (objInvoke == null) {
                        return null;
                    }
                    try {
                        return (java.lang.String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    } catch (java.lang.Exception unused) {
                        c6442p2N = j().M();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (java.lang.Exception unused2) {
                    c6442p2N = j().N();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (java.lang.ClassNotFoundException unused3) {
                return null;
            }
        }
        c6442p2N.a(str);
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6504y2
    protected final boolean A() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0166  */
    /* JADX WARN: Code duplicated, block: B:46:0x0169  */
    /* JADX WARN: Code duplicated, block: B:52:0x01af  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ce  */
    final com.google.android.gms.measurement.internal.M5 B(java.lang.String str) {
        java.util.List list;
        java.lang.String str2;
        long j6;
        boolean z6;
        boolean z10;
        java.lang.String str3;
        java.lang.Boolean boolE;
        boolean zBooleanValue;
        int iY0;
        long jQ0;
        n();
        java.lang.String strF = F();
        java.lang.String strG = G();
        v();
        java.lang.String str4 = this.f42395d;
        long jD = D();
        v();
        Q3.AbstractC1477p.l(this.f42397f);
        java.lang.String str5 = this.f42397f;
        v();
        n();
        if (this.f42398g == 0) {
            this.f42398g = this.f42679a.L().z(a(), a().getPackageName());
        }
        long j10 = this.f42398g;
        boolean zP = this.f42679a.p();
        boolean z11 = !h().f42741t;
        n();
        java.lang.String strJ = !this.f42679a.p() ? null : J();
        com.google.android.gms.measurement.internal.S2 s6 = this.f42679a;
        long jA = s6.F().f42728g.a();
        long jMin = jA == 0 ? s6.f42123H : java.lang.Math.min(s6.f42123H, jA);
        int iC = C();
        boolean zU = d().U();
        com.google.android.gms.measurement.internal.C6511z2 c6511z2H = h();
        c6511z2H.n();
        boolean z12 = c6511z2H.J().getBoolean("deferred_analytics_collection", false);
        java.lang.String strE = E();
        java.lang.Boolean boolE2 = d().E("google_analytics_default_allow_ad_personalization_signals");
        java.lang.Boolean boolValueOf = boolE2 == null ? null : java.lang.Boolean.valueOf(!boolE2.booleanValue());
        long j11 = this.f42399h;
        java.util.List list2 = this.f42400i;
        java.lang.String strX = h().M().x();
        if (this.f42401j == null) {
            this.f42401j = i().U0();
        }
        java.lang.String str6 = this.f42401j;
        if (com.google.android.gms.internal.measurement.C6038i6.a()) {
            list = list2;
            str2 = str6;
            if (d().t(com.google.android.gms.measurement.internal.G.f41859Y0) && !h().M().m(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE)) {
                z6 = zP;
                z10 = z11;
                j6 = 0;
                str3 = null;
            }
            boolE = d().E("google_analytics_sgtm_upload_enabled");
            if (boolE == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = boolE.booleanValue();
            }
            long jZ0 = i().z0(F());
            int iB = h().M().b();
            java.lang.String strJ2 = h().L().j();
            if (com.google.android.gms.internal.measurement.C6066l7.a() || !d().t(com.google.android.gms.measurement.internal.G.f41829J0)) {
                iY0 = 0;
            } else {
                i();
                iY0 = com.google.android.gms.measurement.internal.d6.y0();
            }
            if (com.google.android.gms.internal.measurement.C6066l7.a() || !d().t(com.google.android.gms.measurement.internal.G.f41829J0)) {
                jQ0 = j6;
            } else {
                jQ0 = i().Q0();
            }
            return new com.google.android.gms.measurement.internal.M5(strF, strG, str4, jD, str5, 106000L, j10, str, z6, z10, strJ, 0L, jMin, iC, zU, z12, strE, boolValueOf, j11, list, (java.lang.String) null, strX, str2, str3, zBooleanValue, jZ0, iB, strJ2, iY0, jQ0, d().T(), new com.google.android.gms.measurement.internal.B1(d().B("google_analytics_default_allow_ad_personalization_signals", true)).c());
        }
        list = list2;
        str2 = str6;
        n();
        j6 = 0;
        if (this.f42406o != 0) {
            z6 = zP;
            z10 = z11;
            long jA2 = b().a() - this.f42406o;
            if (this.f42405n != null && jA2 > 86400000 && this.f42407p == null) {
                I();
            }
        } else {
            z6 = zP;
            z10 = z11;
        }
        if (this.f42405n == null) {
            I();
        }
        str3 = this.f42405n;
        boolE = d().E("google_analytics_sgtm_upload_enabled");
        if (boolE == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolE.booleanValue();
        }
        long jZ1 = i().z0(F());
        int iB2 = h().M().b();
        java.lang.String strJ3 = h().L().j();
        if (com.google.android.gms.internal.measurement.C6066l7.a()) {
            iY0 = 0;
        } else {
            iY0 = 0;
        }
        if (com.google.android.gms.internal.measurement.C6066l7.a()) {
            jQ0 = j6;
        } else {
            jQ0 = j6;
        }
        return new com.google.android.gms.measurement.internal.M5(strF, strG, str4, jD, str5, 106000L, j10, str, z6, z10, strJ, 0L, jMin, iC, zU, z12, strE, boolValueOf, j11, list, (java.lang.String) null, strX, str2, str3, zBooleanValue, jZ1, iB2, strJ3, iY0, jQ0, d().T(), new com.google.android.gms.measurement.internal.B1(d().B("google_analytics_default_allow_ad_personalization_signals", true)).c());
    }

    final int C() {
        v();
        return this.f42402k;
    }

    final int D() {
        v();
        return this.f42396e;
    }

    final java.lang.String E() {
        v();
        return this.f42404m;
    }

    final java.lang.String F() {
        v();
        Q3.AbstractC1477p.l(this.f42394c);
        return this.f42394c;
    }

    final java.lang.String G() {
        n();
        v();
        Q3.AbstractC1477p.l(this.f42403l);
        return this.f42403l;
    }

    final java.util.List H() {
        return this.f42400i;
    }

    final void I() {
        java.lang.String str;
        n();
        if (h().M().m(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            i().W0().nextBytes(bArr);
            str = java.lang.String.format(java.util.Locale.US, "%032x", new java.math.BigInteger(1, bArr));
        } else {
            j().F().a("Analytics Storage consent is not granted");
            str = null;
        }
        j().F().a(java.lang.String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f42405n = str;
        this.f42406o = b().a();
    }

    final boolean K(java.lang.String str) {
        java.lang.String str2 = this.f42407p;
        boolean z6 = (str2 == null || str2.equals(str)) ? false : true;
        this.f42407p = str;
        return z6;
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

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6501y o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6379g2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6372f2 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F3 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6492w4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 u() {
        return super.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.measurement.internal.AbstractC6504y2
    protected final void y() {
        java.lang.String str;
        com.google.android.gms.measurement.internal.C6442p2 c6442p2K;
        java.lang.String str2;
        java.lang.String packageName = a().getPackageName();
        android.content.pm.PackageManager packageManager = a().getPackageManager();
        java.lang.String str3 = "";
        java.lang.String installerPackageName = "unknown";
        java.lang.String str4 = "Unknown";
        int i6 = Integer.MIN_VALUE;
        if (packageManager == null) {
            j().G().b("PackageManager is null, app identity information might be inaccurate. appId", com.google.android.gms.measurement.internal.C6428n2.v(packageName));
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (java.lang.IllegalArgumentException unused) {
                j().G().b("Error retrieving app installer package name. appId", com.google.android.gms.measurement.internal.C6428n2.v(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(a().getPackageName(), 0);
                if (packageInfo != null) {
                    java.lang.CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    java.lang.String string = !android.text.TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        str4 = packageInfo.versionName;
                        i6 = packageInfo.versionCode;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                        str = str4;
                        str4 = string;
                        j().G().c("Error retrieving package info. appId, appName", com.google.android.gms.measurement.internal.C6428n2.v(packageName), str4);
                        str4 = str;
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
        }
        this.f42394c = packageName;
        this.f42397f = installerPackageName;
        this.f42395d = str4;
        this.f42396e = i6;
        this.f42398g = 0L;
        java.lang.Object[] objArr = !android.text.TextUtils.isEmpty(this.f42679a.M()) && "am".equals(this.f42679a.N());
        int iX = this.f42679a.x();
        com.google.android.gms.measurement.internal.C6428n2 c6428n2J = j();
        switch (iX) {
            case 0:
                c6442p2K = c6428n2J.K();
                str2 = "App measurement collection enabled";
                break;
            case 1:
                c6442p2K = c6428n2J.J();
                str2 = "App measurement deactivated via the manifest";
                break;
            case 2:
                c6442p2K = c6428n2J.K();
                str2 = "App measurement deactivated via the init parameters";
                break;
            case 3:
                c6442p2K = c6428n2J.J();
                str2 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                break;
            case 4:
                c6442p2K = c6428n2J.J();
                str2 = "App measurement disabled via the manifest";
                break;
            case 5:
                c6442p2K = c6428n2J.K();
                str2 = "App measurement disabled via the init parameters";
                break;
            case 6:
                c6442p2K = c6428n2J.M();
                str2 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                break;
            case 7:
                c6442p2K = c6428n2J.J();
                str2 = "App measurement disabled via the global data collection setting";
                break;
            case 8:
                c6442p2K = c6428n2J.J();
                str2 = "App measurement disabled due to denied storage consent";
                break;
            default:
                c6428n2J.J().a("App measurement disabled");
                c6442p2K = j().I();
                str2 = "Invalid scion state in identity";
                break;
        }
        c6442p2K.a(str2);
        boolean z6 = iX == 0;
        this.f42403l = "";
        this.f42404m = "";
        if (objArr != false) {
            this.f42404m = this.f42679a.M();
        }
        try {
            java.lang.String strB = new p085i4.n(a(), this.f42679a.P()).b("google_app_id");
            if (!android.text.TextUtils.isEmpty(strB)) {
                str3 = strB;
            }
            this.f42403l = str3;
            if (!android.text.TextUtils.isEmpty(strB)) {
                this.f42404m = new p085i4.n(a(), this.f42679a.P()).b("admob_app_id");
            }
            if (z6) {
                j().K().c("App measurement enabled for app package, google app id", this.f42394c, android.text.TextUtils.isEmpty(this.f42403l) ? this.f42404m : this.f42403l);
            }
        } catch (java.lang.IllegalStateException e6) {
            j().G().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.C6428n2.v(packageName), e6);
        }
        this.f42400i = null;
        java.util.List listJ = d().J("analytics.safelisted_events");
        if (listJ == null) {
            this.f42400i = listJ;
        } else if (listJ.isEmpty()) {
            j().M().a("Safelisted event list is empty. Ignoring");
        } else {
            java.util.Iterator it = listJ.iterator();
            do {
                if (!it.hasNext()) {
                    this.f42400i = listJ;
                }
            } while (i().w0("safelisted event", (java.lang.String) it.next()));
        }
        if (packageManager != null) {
            this.f42402k = W3.b.a(a()) ? 1 : 0;
        } else {
            this.f42402k = 0;
        }
    }
}
