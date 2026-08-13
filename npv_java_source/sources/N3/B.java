package N3;

/* JADX INFO: loaded from: classes.dex */
abstract class B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Q3.X f7620e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static android.content.Context f7622g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final N3.z f7616a = new N3.t(N3.x.L0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final N3.z f7617b = new N3.u(N3.x.L0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final N3.z f7618c = new N3.v(N3.x.L0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final N3.z f7619d = new N3.w(N3.x.L0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.Object f7621f = new java.lang.Object();

    static N3.L a(java.lang.String str, N3.x xVar, boolean z6, boolean z10) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return f(str, xVar, z6, z10);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static N3.L b(java.lang.String str, boolean z6, boolean z10, boolean z11) {
        return g(str, z6, false, false, true);
    }

    static /* synthetic */ java.lang.String c(boolean z6, java.lang.String str, N3.x xVar) {
        java.lang.String str2 = (z6 || !f(str, xVar, true, false).f7639a) ? "not allowed" : "debug cert rejected";
        java.security.MessageDigest messageDigestB = V3.a.b("SHA-256");
        Q3.AbstractC1477p.l(messageDigestB);
        return java.lang.String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, V3.k.a(messageDigestB.digest(xVar.c2())), java.lang.Boolean.valueOf(z6), "12451000.false");
    }

    static synchronized void d(android.content.Context context) {
        if (f7622g == null) {
            if (context != null) {
                f7622g = context.getApplicationContext();
            }
        }
    }

    static boolean e() {
        boolean zH;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            h();
            zH = f7620e.h();
        } catch (android.os.RemoteException e6) {
            zH = false;
        } catch (com.google.android.gms.dynamite.DynamiteModule.a e10) {
            zH = false;
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        return zH;
    }

    private static N3.L f(final java.lang.String str, final N3.x xVar, final boolean z6, boolean z10) {
        try {
            h();
            Q3.AbstractC1477p.l(f7622g);
            try {
                return f7620e.z3(new N3.G(str, xVar, z6, z10), X3.b.c2(f7622g.getPackageManager())) ? N3.L.b() : new N3.J(new java.util.concurrent.Callable() { // from class: N3.s
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return N3.B.c(z6, str, xVar);
                    }
                }, null);
            } catch (android.os.RemoteException e6) {
                return N3.L.d("module call", e6);
            }
        } catch (com.google.android.gms.dynamite.DynamiteModule.a e10) {
            return N3.L.d("module init: ".concat(java.lang.String.valueOf(e10.getMessage())), e10);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X3.a, android.os.IBinder] */
    private static N3.L g(java.lang.String str, boolean z6, boolean z10, boolean z11, boolean z12) {
        java.lang.String strConcat;
        N3.L lD;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            Q3.AbstractC1477p.l(f7622g);
            try {
                h();
                N3.C c6 = new N3.C(str, z6, false, X3.b.c2(f7622g), false, true);
                try {
                    N3.E eF5 = z12 ? f7620e.F5(c6) : f7620e.P3(c6);
                    if (eF5.f()) {
                        lD = N3.L.f(eF5.s());
                    } else {
                        java.lang.String strE = eF5.e();
                        android.content.pm.PackageManager.NameNotFoundException nameNotFoundException = eF5.w() == 4 ? new android.content.pm.PackageManager.NameNotFoundException() : null;
                        if (strE == null) {
                            strE = "error checking package certificate";
                        }
                        lD = N3.L.g(eF5.s(), eF5.w(), strE, nameNotFoundException);
                    }
                } catch (android.os.RemoteException e6) {
                    e = e6;
                    strConcat = "module call";
                    lD = N3.L.d(strConcat, e);
                }
            } catch (com.google.android.gms.dynamite.DynamiteModule.a e10) {
                e = e10;
                strConcat = "module init: ".concat(java.lang.String.valueOf(e.getMessage()));
            }
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return lD;
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static void h() {
        if (f7620e != null) {
            return;
        }
        Q3.AbstractC1477p.l(f7622g);
        synchronized (f7621f) {
            try {
                if (f7620e == null) {
                    f7620e = Q3.W.y0(com.google.android.gms.dynamite.DynamiteModule.e(f7622g, com.google.android.gms.dynamite.DynamiteModule.f24971f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
