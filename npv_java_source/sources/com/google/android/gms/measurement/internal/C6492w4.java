package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6492w4 extends com.google.android.gms.measurement.internal.AbstractC6504y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.google.android.gms.measurement.internal.C6499x4 f42680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.google.android.gms.measurement.internal.C6499x4 f42681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.google.android.gms.measurement.internal.C6499x4 f42682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Map f42683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.app.Activity f42684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f42685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile com.google.android.gms.measurement.internal.C6499x4 f42686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.measurement.internal.C6499x4 f42687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.lang.Object f42689l;

    public C6492w4(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42689l = new java.lang.Object();
        this.f42683f = new j$.util.concurrent.ConcurrentHashMap();
    }

    private final java.lang.String D(java.lang.Class cls, java.lang.String str) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        java.lang.String[] strArrSplit = canonicalName.split("\\.");
        java.lang.String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > d().r(null, false) ? str2.substring(0, d().r(null, false)) : str2;
    }

    private final void G(android.app.Activity activity, com.google.android.gms.measurement.internal.C6499x4 c6499x4, boolean z6) {
        com.google.android.gms.measurement.internal.C6499x4 c6499x5;
        com.google.android.gms.measurement.internal.C6499x4 c6499x6 = this.f42680c == null ? this.f42681d : this.f42680c;
        if (c6499x4.f42701b == null) {
            c6499x5 = new com.google.android.gms.measurement.internal.C6499x4(c6499x4.f42700a, activity != null ? D(activity.getClass(), "Activity") : null, c6499x4.f42702c, c6499x4.f42704e, c6499x4.f42705f);
        } else {
            c6499x5 = c6499x4;
        }
        this.f42681d = this.f42680c;
        this.f42680c = c6499x5;
        l().D(new com.google.android.gms.measurement.internal.RunnableC6506y4(this, c6499x5, c6499x6, b().c(), z6));
    }

    static /* synthetic */ void J(com.google.android.gms.measurement.internal.C6492w4 c6492w4, android.os.Bundle bundle, com.google.android.gms.measurement.internal.C6499x4 c6499x4, com.google.android.gms.measurement.internal.C6499x4 c6499x5, long j6) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c6492w4.N(c6499x4, c6499x5, j6, true, c6492w4.i().F(null, "screen_view", bundle, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    public final void N(com.google.android.gms.measurement.internal.C6499x4 c6499x4, com.google.android.gms.measurement.internal.C6499x4 c6499x5, long j6, boolean z6, android.os.Bundle bundle) {
        long j10;
        n();
        boolean z10 = false;
        boolean z11 = (c6499x5 != null && c6499x5.f42702c == c6499x4.f42702c && j$.util.Objects.equals(c6499x5.f42701b, c6499x4.f42701b) && j$.util.Objects.equals(c6499x5.f42700a, c6499x4.f42700a)) ? false : true;
        if (z6 && this.f42682e != null) {
            z10 = true;
        }
        if (z11) {
            android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
            com.google.android.gms.measurement.internal.d6.X(c6499x4, bundle2, true);
            if (c6499x5 != null) {
                java.lang.String str = c6499x5.f42700a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                java.lang.String str2 = c6499x5.f42701b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", c6499x5.f42702c);
            }
            if (z10) {
                long jA = u().f42595f.a(j6);
                if (jA > 0) {
                    i().M(bundle2, jA);
                }
            }
            if (!d().V()) {
                bundle2.putLong("_mst", 1L);
            }
            java.lang.String str3 = c6499x4.f42704e ? "app" : "auto";
            long jA2 = b().a();
            if (c6499x4.f42704e) {
                long j11 = c6499x4.f42705f;
                if (j11 != 0) {
                    j10 = j11;
                } else {
                    j10 = jA2;
                }
            } else {
                j10 = jA2;
            }
            r().e0(str3, "_vs", j10, bundle2);
        }
        if (z10) {
            O(this.f42682e, true, j6);
        }
        this.f42682e = c6499x4;
        if (c6499x4.f42704e) {
            this.f42687j = c6499x4;
        }
        t().J(c6499x4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(com.google.android.gms.measurement.internal.C6499x4 c6499x4, boolean z6, long j6) {
        o().v(b().c());
        if (!u().E(c6499x4 != null && c6499x4.f42703d, z6, j6) || c6499x4 == null) {
            return;
        }
        c6499x4.f42703d = false;
    }

    private final com.google.android.gms.measurement.internal.C6499x4 T(android.app.Activity activity) {
        Q3.AbstractC1477p.l(activity);
        com.google.android.gms.measurement.internal.C6499x4 c6499x4 = (com.google.android.gms.measurement.internal.C6499x4) this.f42683f.get(java.lang.Integer.valueOf(activity.hashCode()));
        if (c6499x4 == null) {
            com.google.android.gms.measurement.internal.C6499x4 c6499x5 = new com.google.android.gms.measurement.internal.C6499x4(null, D(activity.getClass(), "Activity"), i().R0());
            this.f42683f.put(java.lang.Integer.valueOf(activity.hashCode()), c6499x5);
            c6499x4 = c6499x5;
        }
        return this.f42686i != null ? this.f42686i : c6499x4;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6504y2
    protected final boolean A() {
        return false;
    }

    public final com.google.android.gms.measurement.internal.C6499x4 C(boolean z6) {
        v();
        n();
        if (!z6) {
            return this.f42682e;
        }
        com.google.android.gms.measurement.internal.C6499x4 c6499x4 = this.f42682e;
        return c6499x4 != null ? c6499x4 : this.f42687j;
    }

    public final void E(android.app.Activity activity) {
        synchronized (this.f42689l) {
            try {
                if (activity == this.f42684g) {
                    this.f42684g = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (d().V()) {
            this.f42683f.remove(java.lang.Integer.valueOf(activity.hashCode()));
        }
    }

    public final void F(android.app.Activity activity, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        if (!d().V() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f42683f.put(java.lang.Integer.valueOf(activity.hashCode()), new com.google.android.gms.measurement.internal.C6499x4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void H(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        if (!d().V()) {
            j().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        com.google.android.gms.measurement.internal.C6499x4 c6499x4 = this.f42680c;
        if (c6499x4 == null) {
            j().M().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f42683f.get(java.lang.Integer.valueOf(activity.hashCode())) == null) {
            j().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = D(activity.getClass(), "Activity");
        }
        boolean zEquals = j$.util.Objects.equals(c6499x4.f42701b, str2);
        boolean zEquals2 = j$.util.Objects.equals(c6499x4.f42700a, str);
        if (zEquals && zEquals2) {
            j().M().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > d().r(null, false))) {
            j().M().b("Invalid screen name length in setCurrentScreen. Length", java.lang.Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > d().r(null, false))) {
            j().M().b("Invalid class name length in setCurrentScreen. Length", java.lang.Integer.valueOf(str2.length()));
            return;
        }
        j().K().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        com.google.android.gms.measurement.internal.C6499x4 c6499x5 = new com.google.android.gms.measurement.internal.C6499x4(str, str2, i().R0());
        this.f42683f.put(java.lang.Integer.valueOf(activity.hashCode()), c6499x5);
        G(activity, c6499x5, true);
    }

    public final void I(android.os.Bundle bundle, long j6) {
        java.lang.String str;
        synchronized (this.f42689l) {
            try {
                if (!this.f42688k) {
                    j().M().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                java.lang.String strD = null;
                if (bundle != null) {
                    java.lang.String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > d().r(null, false))) {
                        j().M().b("Invalid screen name length for screen view. Length", java.lang.Integer.valueOf(string.length()));
                        return;
                    }
                    java.lang.String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > d().r(null, false))) {
                        j().M().b("Invalid screen class length for screen view. Length", java.lang.Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str = string;
                        strD = string2;
                    }
                } else {
                    str = null;
                }
                if (strD == null) {
                    android.app.Activity activity = this.f42684g;
                    strD = activity != null ? D(activity.getClass(), "Activity") : "Activity";
                }
                java.lang.String str2 = strD;
                com.google.android.gms.measurement.internal.C6499x4 c6499x4 = this.f42680c;
                if (this.f42685h && c6499x4 != null) {
                    this.f42685h = false;
                    boolean zEquals = j$.util.Objects.equals(c6499x4.f42701b, str2);
                    boolean zEquals2 = j$.util.Objects.equals(c6499x4.f42700a, str);
                    if (zEquals && zEquals2) {
                        j().M().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                j().K().c("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
                com.google.android.gms.measurement.internal.C6499x4 c6499x5 = this.f42680c == null ? this.f42681d : this.f42680c;
                com.google.android.gms.measurement.internal.C6499x4 c6499x6 = new com.google.android.gms.measurement.internal.C6499x4(str, str2, i().R0(), true, j6);
                this.f42680c = c6499x6;
                this.f42681d = c6499x5;
                this.f42686i = c6499x6;
                l().D(new com.google.android.gms.measurement.internal.RunnableC6513z4(this, bundle, c6499x6, c6499x5, b().c()));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.android.gms.measurement.internal.C6499x4 P() {
        return this.f42680c;
    }

    public final void Q(android.app.Activity activity) {
        synchronized (this.f42689l) {
            this.f42688k = false;
            this.f42685h = true;
        }
        long jC = b().c();
        if (!d().V()) {
            this.f42680c = null;
            l().D(new com.google.android.gms.measurement.internal.A4(this, jC));
        } else {
            com.google.android.gms.measurement.internal.C6499x4 c6499x4T = T(activity);
            this.f42681d = this.f42680c;
            this.f42680c = null;
            l().D(new com.google.android.gms.measurement.internal.D4(this, c6499x4T, jC));
        }
    }

    public final void R(android.app.Activity activity, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.C6499x4 c6499x4;
        if (!d().V() || bundle == null || (c6499x4 = (com.google.android.gms.measurement.internal.C6499x4) this.f42683f.get(java.lang.Integer.valueOf(activity.hashCode()))) == null) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putLong("id", c6499x4.f42702c);
        bundle2.putString("name", c6499x4.f42700a);
        bundle2.putString("referrer_name", c6499x4.f42701b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void S(android.app.Activity activity) {
        synchronized (this.f42689l) {
            this.f42688k = true;
            if (activity != this.f42684g) {
                synchronized (this.f42689l) {
                    this.f42684g = activity;
                    this.f42685h = false;
                }
                if (d().V()) {
                    this.f42686i = null;
                    l().D(new com.google.android.gms.measurement.internal.C4(this));
                }
            }
        }
        if (!d().V()) {
            this.f42680c = this.f42686i;
            l().D(new com.google.android.gms.measurement.internal.B4(this));
        } else {
            G(activity, T(activity), false);
            com.google.android.gms.measurement.internal.C6501y c6501yO = o();
            c6501yO.l().D(new com.google.android.gms.measurement.internal.Y(c6501yO, c6501yO.b().c()));
        }
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
}
