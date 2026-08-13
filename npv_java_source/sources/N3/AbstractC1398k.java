package N3;

/* JADX INFO: renamed from: N3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1398k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f7664a = 12451000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f7667d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final java.util.concurrent.atomic.AtomicBoolean f7665b = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicBoolean f7668e = new java.util.concurrent.atomic.AtomicBoolean();

    public static int a(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static java.lang.String b(int i6) {
        return N3.C1389b.D(i6);
    }

    public static android.content.Context c(android.content.Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static android.content.res.Resources d(android.content.Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(android.content.Context context) {
        if (!f7667d) {
            try {
                android.content.pm.PackageInfo packageInfoF = W3.e.a(context).f("com.google.android.gms", 64);
                N3.C1399l.a(context);
                if (packageInfoF == null || N3.C1399l.e(packageInfoF, false) || !N3.C1399l.e(packageInfoF, true)) {
                    f7666c = false;
                } else {
                    f7666c = true;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            } catch (java.lang.Throwable th) {
                f7667d = true;
                throw th;
            }
            f7667d = true;
        }
        return f7666c || !V3.j.e();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00c5, please report this as an issue */
    public static int f(android.content.Context context, int i6) {
        java.lang.String strValueOf;
        java.lang.String str;
        android.content.pm.PackageInfo packageInfo;
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(N3.AbstractC1400m.f7672a);
        } catch (java.lang.Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f7668e.get()) {
            int iA = Q3.Y.a(context);
            if (iA == 0) {
                throw new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException();
            }
            if (iA != f7664a) {
                throw new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException(iA);
            }
        }
        boolean z6 = (V3.j.g(context) || V3.j.i(context)) ? false : true;
        Q3.AbstractC1477p.a(i6 >= 0);
        java.lang.String packageName = context.getPackageName();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (z6) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                strValueOf = java.lang.String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        } else {
            packageInfo = null;
        }
        try {
            android.content.pm.PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            N3.C1399l.a(context);
            if (!N3.C1399l.e(packageInfo2, true)) {
                strValueOf = java.lang.String.valueOf(packageName);
                str = " requires Google Play services, but their signature is invalid.";
            } else {
                if (!z6) {
                    if (z6) {
                    }
                    if (V3.t.a(packageInfo2.versionCode) < V3.t.a(i6)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    java.lang.String str2 = "Google Play services out of date for " + packageName + ".  Requires " + i6 + " but found " + packageInfo2.versionCode;
                    return 2;
                }
                Q3.AbstractC1477p.l(packageInfo);
                if (!N3.C1399l.e(packageInfo, true)) {
                    strValueOf = java.lang.String.valueOf(packageName);
                    str = " requires Google Play Store, but its signature is invalid.";
                } else {
                    if (z6 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        if (V3.t.a(packageInfo2.versionCode) < V3.t.a(i6)) {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                                    java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info.");
                                    return 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                return 3;
                            }
                            return 0;
                        }
                        java.lang.String str3 = "Google Play services out of date for " + packageName + ".  Requires " + i6 + " but found " + packageInfo2.versionCode;
                        return 2;
                    }
                    strValueOf = java.lang.String.valueOf(packageName);
                    str = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
                }
            }
            strValueOf.concat(str);
            return 9;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
            java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
            return 1;
        }
    }

    public static boolean g(android.content.Context context, int i6) {
        if (i6 == 18) {
            return true;
        }
        if (i6 == 1) {
            return k(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean h(android.content.Context context) {
        if (!V3.n.c()) {
            return false;
        }
        java.lang.Object systemService = context.getSystemService("user");
        Q3.AbstractC1477p.l(systemService);
        android.os.Bundle applicationRestrictions = ((android.os.UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean i(int i6) {
        return i6 == 1 || i6 == 2 || i6 == 3 || i6 == 9;
    }

    public static boolean j(android.content.Context context, int i6, java.lang.String str) {
        return V3.s.b(context, i6, str);
    }

    static boolean k(android.content.Context context, java.lang.String str) {
        boolean zEquals = str.equals("com.google.android.gms");
        if (V3.n.f()) {
            try {
                java.util.Iterator<android.content.pm.PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !h(context);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
        }
    }
}
