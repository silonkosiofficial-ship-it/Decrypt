package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.core.os.a f21580a = new androidx.core.os.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21584e;

    /* JADX INFO: renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    private static final class C0407a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.core.os.a.C0407a f21585a = new androidx.core.os.a.C0407a();

        private C0407a() {
        }

        public final int a(int i6) {
            return android.os.ext.SdkExtensions.getExtensionVersion(i6);
        }
    }

    static {
        int i6 = android.os.Build.VERSION.SDK_INT;
        f21581b = i6 >= 30 ? androidx.core.os.a.C0407a.f21585a.a(30) : 0;
        f21582c = i6 >= 30 ? androidx.core.os.a.C0407a.f21585a.a(31) : 0;
        f21583d = i6 >= 30 ? androidx.core.os.a.C0407a.f21585a.a(33) : 0;
        f21584e = i6 >= 30 ? androidx.core.os.a.C0407a.f21585a.a(1000000) : 0;
    }

    private a() {
    }

    public static final boolean a(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "codename");
        p247y7.AbstractC7350t.f(str2, "buildCodename");
        if (p247y7.AbstractC7350t.b("REL", str2)) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = str2.toUpperCase(locale);
        p247y7.AbstractC7350t.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        java.lang.String upperCase2 = str.toUpperCase(locale);
        p247y7.AbstractC7350t.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 < 31) {
            if (i6 >= 30) {
                java.lang.String str = android.os.Build.VERSION.CODENAME;
                p247y7.AbstractC7350t.e(str, "CODENAME");
                if (a("S", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 < 33) {
            if (i6 >= 32) {
                java.lang.String str = android.os.Build.VERSION.CODENAME;
                p247y7.AbstractC7350t.e(str, "CODENAME");
                if (a("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }
}
