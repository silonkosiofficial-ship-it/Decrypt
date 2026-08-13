package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.Boolean f15117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.Boolean f15118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.Boolean f15119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static java.lang.Boolean f15120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static java.lang.Boolean f15121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static java.lang.Boolean f15122f;

    public static boolean a(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (f15121e == null) {
            boolean z6 = false;
            if (V3.n.i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z6 = true;
            }
            f15121e = java.lang.Boolean.valueOf(z6);
        }
        return f15121e.booleanValue();
    }

    public static boolean b(android.content.Context context) {
        if (f15122f == null) {
            boolean z6 = false;
            if (V3.n.k() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z6 = true;
            }
            f15122f = java.lang.Boolean.valueOf(z6);
        }
        return f15122f.booleanValue();
    }

    public static boolean c(android.content.Context context) {
        if (f15119c == null) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            boolean z6 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z6 = true;
            }
            f15119c = java.lang.Boolean.valueOf(z6);
        }
        return f15119c.booleanValue();
    }

    public static boolean d(android.content.Context context) {
        return h(context);
    }

    public static boolean e() {
        int i6 = N3.AbstractC1398k.f7664a;
        return "user".equals(android.os.Build.TYPE);
    }

    public static boolean f(android.content.Context context) {
        return j(context.getPackageManager());
    }

    public static boolean g(android.content.Context context) {
        if (f(context) && !V3.n.h()) {
            return true;
        }
        if (h(context)) {
            return !V3.n.i() || V3.n.k();
        }
        return false;
    }

    public static boolean h(android.content.Context context) {
        if (f15118b == null) {
            boolean z6 = false;
            if (V3.n.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z6 = true;
            }
            f15118b = java.lang.Boolean.valueOf(z6);
        }
        return f15118b.booleanValue();
    }

    public static boolean i(android.content.Context context) {
        if (f15120d == null) {
            boolean z6 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z6 = false;
            }
            f15120d = java.lang.Boolean.valueOf(z6);
        }
        return f15120d.booleanValue();
    }

    public static boolean j(android.content.pm.PackageManager packageManager) {
        if (f15117a == null) {
            boolean z6 = false;
            if (V3.n.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z6 = true;
            }
            f15117a = java.lang.Boolean.valueOf(z6);
        }
        return f15117a.booleanValue();
    }
}
