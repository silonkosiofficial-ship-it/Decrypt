package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Td0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2859Td0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.Object f31966f = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f31967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.SharedPreferences f31968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f31969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5914zd0 f31970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31971e;

    public C2859Td0(android.content.Context context, int i6, com.google.android.gms.internal.ads.InterfaceC5914zd0 interfaceC5914zd0, boolean z6) {
        this.f31971e = false;
        this.f31967a = context;
        this.f31969c = java.lang.Integer.toString(i6 - 1);
        this.f31968b = context.getSharedPreferences("pcvmspf", 0);
        this.f31970d = interfaceC5914zd0;
        this.f31971e = z6;
    }

    private final java.io.File e(java.lang.String str) {
        return new java.io.File(new java.io.File(this.f31967a.getDir("pccache", 0), this.f31969c), str);
    }

    private static java.lang.String f(com.google.android.gms.internal.ads.C5799yb c5799yb) {
        com.google.android.gms.internal.ads.C5909zb c5909zbE0 = com.google.android.gms.internal.ads.C2190Bb.e0();
        c5909zbE0.E(c5799yb.d0().k0());
        c5909zbE0.z(c5799yb.d0().j0());
        c5909zbE0.A(c5799yb.d0().b0());
        c5909zbE0.C(c5799yb.d0().d0());
        c5909zbE0.B(c5799yb.d0().c0());
        return V3.k.a(((com.google.android.gms.internal.ads.C2190Bb) c5909zbE0.u()).l());
    }

    private final java.lang.String g() {
        return "FBAMTD".concat(java.lang.String.valueOf(this.f31969c));
    }

    private final java.lang.String h() {
        return "LATMTD".concat(java.lang.String.valueOf(this.f31969c));
    }

    private final void i(int i6, long j6) {
        this.f31970d.e(i6, j6);
    }

    private final void j(int i6, long j6, java.lang.String str) {
        this.f31970d.a(i6, j6, str);
    }

    private final com.google.android.gms.internal.ads.C2190Bb k(int i6) {
        android.content.SharedPreferences sharedPreferences;
        java.lang.String strG;
        int i10;
        if (i6 == 1) {
            sharedPreferences = this.f31968b;
            strG = h();
        } else {
            sharedPreferences = this.f31968b;
            strG = g();
        }
        java.lang.String string = sharedPreferences.getString(strG, null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            byte[] bArrC = V3.k.c(string);
            com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
            return com.google.android.gms.internal.ads.C2190Bb.i0(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrC, 0, bArrC.length), this.f31971e ? com.google.android.gms.internal.ads.C5730xv0.a() : com.google.android.gms.internal.ads.C5730xv0.b());
        } catch (com.google.android.gms.internal.ads.Vv0 unused) {
            return null;
        } catch (java.lang.NullPointerException unused2) {
            i10 = 2029;
            i(i10, jCurrentTimeMillis);
            return null;
        } catch (java.lang.RuntimeException unused3) {
            i10 = 2032;
            i(i10, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean a(com.google.android.gms.internal.ads.C5799yb c5799yb) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (f31966f) {
            try {
                if (!com.google.android.gms.internal.ads.AbstractC2601Md0.e(new java.io.File(e(c5799yb.d0().k0()), "pcbc"), c5799yb.e0().d())) {
                    i(4020, jCurrentTimeMillis);
                    return false;
                }
                java.lang.String strF = f(c5799yb);
                android.content.SharedPreferences.Editor editorEdit = this.f31968b.edit();
                editorEdit.putString(h(), strF);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    i(5015, jCurrentTimeMillis);
                } else {
                    i(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(com.google.android.gms.internal.ads.C5799yb c5799yb, com.google.android.gms.internal.ads.InterfaceC2823Sd0 interfaceC2823Sd0) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (f31966f) {
            try {
                com.google.android.gms.internal.ads.C2190Bb c2190BbK = k(1);
                java.lang.String strK0 = c5799yb.d0().k0();
                if (c2190BbK != null && c2190BbK.k0().equals(strK0)) {
                    i(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.io.File fileE = e(strK0);
                if (fileE.exists()) {
                    j(4023, jCurrentTimeMillis2, "d:" + (true != fileE.isDirectory() ? "0" : "1") + ",f:" + (true != fileE.isFile() ? "0" : "1"));
                    i(4015, jCurrentTimeMillis2);
                } else if (!fileE.mkdirs()) {
                    j(4024, jCurrentTimeMillis2, "cw:".concat(true != fileE.canWrite() ? "0" : "1"));
                    i(4015, jCurrentTimeMillis2);
                    return false;
                }
                java.io.File fileE2 = e(strK0);
                java.io.File file = new java.io.File(fileE2, "pcam.jar");
                java.io.File file2 = new java.io.File(fileE2, "pcbc");
                if (!com.google.android.gms.internal.ads.AbstractC2601Md0.e(file, c5799yb.f0().d())) {
                    i(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!com.google.android.gms.internal.ads.AbstractC2601Md0.e(file2, c5799yb.e0().d())) {
                    i(4017, jCurrentTimeMillis);
                    return false;
                }
                if (interfaceC2823Sd0 != null && !interfaceC2823Sd0.a(file)) {
                    i(4018, jCurrentTimeMillis);
                    com.google.android.gms.internal.ads.AbstractC2601Md0.d(fileE2);
                    return false;
                }
                java.lang.String strF = f(c5799yb);
                long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
                java.lang.String string = this.f31968b.getString(h(), null);
                android.content.SharedPreferences.Editor editorEdit = this.f31968b.edit();
                editorEdit.putString(h(), strF);
                if (string != null) {
                    editorEdit.putString(g(), string);
                }
                if (!editorEdit.commit()) {
                    i(4019, jCurrentTimeMillis3);
                    return false;
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                com.google.android.gms.internal.ads.C2190Bb c2190BbK2 = k(1);
                if (c2190BbK2 != null) {
                    hashSet.add(c2190BbK2.k0());
                }
                com.google.android.gms.internal.ads.C2190Bb c2190BbK3 = k(2);
                if (c2190BbK3 != null) {
                    hashSet.add(c2190BbK3.k0());
                }
                for (java.io.File file3 : new java.io.File(this.f31967a.getDir("pccache", 0), this.f31969c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        com.google.android.gms.internal.ads.AbstractC2601Md0.d(file3);
                    }
                }
                i(5014, jCurrentTimeMillis);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.android.gms.internal.ads.C2528Kd0 c(int i6) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (f31966f) {
            try {
                com.google.android.gms.internal.ads.C2190Bb c2190BbK = k(1);
                if (c2190BbK == null) {
                    i(4022, jCurrentTimeMillis);
                    return null;
                }
                java.io.File fileE = e(c2190BbK.k0());
                java.io.File file = new java.io.File(fileE, "pcam.jar");
                if (!file.exists()) {
                    file = new java.io.File(fileE, "pcam");
                }
                java.io.File file2 = new java.io.File(fileE, "pcbc");
                java.io.File file3 = new java.io.File(fileE, "pcopt");
                i(5016, jCurrentTimeMillis);
                return new com.google.android.gms.internal.ads.C2528Kd0(c2190BbK, file, file2, file3);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(int i6) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (f31966f) {
            try {
                com.google.android.gms.internal.ads.C2190Bb c2190BbK = k(1);
                if (c2190BbK == null) {
                    i(4025, jCurrentTimeMillis);
                    return false;
                }
                java.io.File fileE = e(c2190BbK.k0());
                if (!new java.io.File(fileE, "pcam.jar").exists()) {
                    i(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new java.io.File(fileE, "pcbc").exists()) {
                    i(5019, jCurrentTimeMillis);
                    return true;
                }
                i(4027, jCurrentTimeMillis);
                return false;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
