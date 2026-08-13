package N3;

/* JADX INFO: renamed from: N3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1399l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static N3.C1399l f7669c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f7670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile java.lang.String f7671b;

    public C1399l(android.content.Context context) {
        this.f7670a = context.getApplicationContext();
    }

    public static N3.C1399l a(android.content.Context context) {
        Q3.AbstractC1477p.l(context);
        synchronized (N3.C1399l.class) {
            try {
                if (f7669c == null) {
                    N3.B.d(context);
                    f7669c = new N3.C1399l(context);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return f7669c;
    }

    static final N3.x d(android.content.pm.PackageInfo packageInfo, N3.x... xVarArr) {
        android.content.pm.Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            N3.y yVar = new N3.y(packageInfo.signatures[0].toByteArray());
            for (int i6 = 0; i6 < xVarArr.length; i6++) {
                if (xVarArr[i6].equals(yVar)) {
                    return xVarArr[i6];
                }
            }
            return null;
        }
        return null;
    }

    public static final boolean e(android.content.pm.PackageInfo packageInfo, boolean z6) {
        android.content.pm.PackageInfo packageInfo2;
        if (!z6) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z6 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            N3.x[] xVarArr = N3.A.f7615a;
            if ((z6 ? d(packageInfo2, xVarArr) : d(packageInfo2, xVarArr[0])) != null) {
                return true;
            }
        }
        return false;
    }

    private final N3.L f(java.lang.String str, boolean z6, boolean z10) {
        N3.L lC;
        android.content.pm.ApplicationInfo applicationInfo;
        java.lang.String str2 = "null pkg";
        if (str == null) {
            return N3.L.c("null pkg");
        }
        if (str.equals(this.f7671b)) {
            return N3.L.b();
        }
        if (N3.B.e()) {
            lC = N3.B.b(str, N3.AbstractC1398k.e(this.f7670a), false, false);
        } else {
            try {
                android.content.pm.PackageInfo packageInfo = this.f7670a.getPackageManager().getPackageInfo(str, 64);
                boolean zE = N3.AbstractC1398k.e(this.f7670a);
                if (packageInfo != null) {
                    android.content.pm.Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        N3.y yVar = new N3.y(packageInfo.signatures[0].toByteArray());
                        java.lang.String str3 = packageInfo.packageName;
                        N3.L lA = N3.B.a(str3, yVar, zE, false);
                        if (!lA.f7639a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !N3.B.a(str3, yVar, false, true).f7639a) {
                            lC = lA;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                    lC = N3.L.c(str2);
                } else {
                    lC = N3.L.c(str2);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                return N3.L.d("no pkg ".concat(str), e6);
            }
        }
        if (lC.f7639a) {
            this.f7671b = str;
        }
        return lC;
    }

    public boolean b(android.content.pm.PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        return e(packageInfo, true) && N3.AbstractC1398k.e(this.f7670a);
    }

    public boolean c(int i6) {
        N3.L lC;
        java.lang.String[] packagesForUid = this.f7670a.getPackageManager().getPackagesForUid(i6);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            lC = N3.L.c("no pkgs");
        } else {
            lC = null;
            for (java.lang.String str : packagesForUid) {
                lC = f(str, false, false);
                if (!lC.f7639a) {
                }
            }
            Q3.AbstractC1477p.l(lC);
        }
        lC.e();
        return lC.f7639a;
    }
}
