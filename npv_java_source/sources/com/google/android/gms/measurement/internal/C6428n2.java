package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6428n2 extends com.google.android.gms.measurement.internal.AbstractC6512z3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char f42540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f42541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f42542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6442p2 f42543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6442p2 f42544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6442p2 f42545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6442p2 f42546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6442p2 f42547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6442p2 f42548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6442p2 f42549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6442p2 f42550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6442p2 f42551n;

    C6428n2(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42540c = (char) 0;
        this.f42541d = -1L;
        this.f42543f = new com.google.android.gms.measurement.internal.C6442p2(this, 6, false, false);
        this.f42544g = new com.google.android.gms.measurement.internal.C6442p2(this, 6, true, false);
        this.f42545h = new com.google.android.gms.measurement.internal.C6442p2(this, 6, false, true);
        this.f42546i = new com.google.android.gms.measurement.internal.C6442p2(this, 5, false, false);
        this.f42547j = new com.google.android.gms.measurement.internal.C6442p2(this, 5, true, false);
        this.f42548k = new com.google.android.gms.measurement.internal.C6442p2(this, 5, false, true);
        this.f42549l = new com.google.android.gms.measurement.internal.C6442p2(this, 4, false, false);
        this.f42550m = new com.google.android.gms.measurement.internal.C6442p2(this, 3, false, false);
        this.f42551n = new com.google.android.gms.measurement.internal.C6442p2(this, 2, false, false);
    }

    private static java.lang.String E(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return (com.google.android.gms.internal.measurement.H6.a() && ((java.lang.Boolean) com.google.android.gms.measurement.internal.G.f41825H0.a(null)).booleanValue()) ? "" : str;
        }
        return str.substring(0, iLastIndexOf);
    }

    private final java.lang.String P() {
        java.lang.String str;
        synchronized (this) {
            try {
                if (this.f42542e == null) {
                    this.f42542e = this.f42679a.O() != null ? this.f42679a.O() : "FA";
                }
                Q3.AbstractC1477p.l(this.f42542e);
                str = this.f42542e;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return str;
    }

    protected static java.lang.Object v(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.google.android.gms.measurement.internal.C6435o2(str);
    }

    private static java.lang.String w(boolean z6, java.lang.Object obj) {
        java.lang.String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof java.lang.Integer) {
            obj = java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            if (!z6) {
                return java.lang.String.valueOf(obj);
            }
            java.lang.Long l6 = (java.lang.Long) obj;
            if (java.lang.Math.abs(l6.longValue()) < 100) {
                return java.lang.String.valueOf(obj);
            }
            java.lang.String str = java.lang.String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.Math.abs(l6.longValue()));
            return str + java.lang.Math.round(java.lang.Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + java.lang.Math.round(java.lang.Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof java.lang.Boolean) {
            return java.lang.String.valueOf(obj);
        }
        if (!(obj instanceof java.lang.Throwable)) {
            if (obj instanceof com.google.android.gms.measurement.internal.C6435o2) {
                return ((com.google.android.gms.measurement.internal.C6435o2) obj).f42566a;
            }
            return z6 ? "-" : java.lang.String.valueOf(obj);
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(z6 ? th.getClass().getName() : th.toString());
        java.lang.String strE = E(com.google.android.gms.measurement.internal.S2.class.getCanonicalName());
        for (java.lang.StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && E(className).equals(strE)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
        }
        return sb.toString();
    }

    static java.lang.String x(boolean z6, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        java.lang.String strW = w(z6, obj);
        java.lang.String strW2 = w(z6, obj2);
        java.lang.String strW3 = w(z6, obj3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        java.lang.String str3 = ", ";
        if (!android.text.TextUtils.isEmpty(strW)) {
            sb.append(str2);
            sb.append(strW);
            str2 = ", ";
        }
        if (android.text.TextUtils.isEmpty(strW2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strW2);
        }
        if (!android.text.TextUtils.isEmpty(strW3)) {
            sb.append(str3);
            sb.append(strW3);
        }
        return sb.toString();
    }

    protected final boolean C(int i6) {
        return android.util.Log.isLoggable(P(), i6);
    }

    public final com.google.android.gms.measurement.internal.C6442p2 F() {
        return this.f42550m;
    }

    public final com.google.android.gms.measurement.internal.C6442p2 G() {
        return this.f42543f;
    }

    public final com.google.android.gms.measurement.internal.C6442p2 H() {
        return this.f42545h;
    }

    public final com.google.android.gms.measurement.internal.C6442p2 I() {
        return this.f42544g;
    }

    public final com.google.android.gms.measurement.internal.C6442p2 J() {
        return this.f42549l;
    }

    public final com.google.android.gms.measurement.internal.C6442p2 K() {
        return this.f42551n;
    }

    public final com.google.android.gms.measurement.internal.C6442p2 L() {
        return this.f42546i;
    }

    public final com.google.android.gms.measurement.internal.C6442p2 M() {
        return this.f42548k;
    }

    public final com.google.android.gms.measurement.internal.C6442p2 N() {
        return this.f42547j;
    }

    public final java.lang.String O() {
        android.util.Pair pairA;
        if (h().f42727f == null || (pairA = h().f42727f.a()) == null || pairA == com.google.android.gms.measurement.internal.C6511z2.f42722B) {
            return null;
        }
        return java.lang.String.valueOf(pairA.second) + ":" + ((java.lang.String) pairA.first);
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

    @Override // com.google.android.gms.measurement.internal.AbstractC6512z3
    protected final boolean t() {
        return false;
    }

    protected final void y(int i6, java.lang.String str) {
        P();
    }

    protected final void z(int i6, boolean z6, boolean z10, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str2;
        if (!z6 && C(i6)) {
            y(i6, x(false, str, obj, obj2, obj3));
        }
        if (z10 || i6 < 5) {
            return;
        }
        Q3.AbstractC1477p.l(str);
        com.google.android.gms.measurement.internal.P2 p2G = this.f42679a.G();
        if (p2G == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (p2G.s()) {
                if (i6 < 0) {
                    i6 = 0;
                }
                if (i6 >= 9) {
                    i6 = 8;
                }
                p2G.D(new com.google.android.gms.measurement.internal.RunnableC6421m2(this, i6, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        y(6, str2);
    }
}
