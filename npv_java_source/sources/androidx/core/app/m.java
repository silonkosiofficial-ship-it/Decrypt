package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f21476c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static java.util.Set f21477d = new java.util.HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.Object f21478e = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f21479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.app.NotificationManager f21480b;

    static class a {
        static boolean a(android.app.NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(android.app.NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private m(android.content.Context context) {
        this.f21479a = context;
        this.f21480b = (android.app.NotificationManager) context.getSystemService("notification");
    }

    public static androidx.core.app.m b(android.content.Context context) {
        return new androidx.core.app.m(context);
    }

    public boolean a() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.app.m.a.a(this.f21480b);
        }
        android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) this.f21479a.getSystemService("appops");
        android.content.pm.ApplicationInfo applicationInfo = this.f21479a.getApplicationInfo();
        java.lang.String packageName = this.f21479a.getApplicationContext().getPackageName();
        int i6 = applicationInfo.uid;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(android.app.AppOpsManager.class.getName());
            java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
            java.lang.reflect.Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, java.lang.String.class);
            java.lang.Integer num = (java.lang.Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(java.lang.Integer.class);
            num.intValue();
            return ((java.lang.Integer) method.invoke(appOpsManager, num, java.lang.Integer.valueOf(i6), packageName)).intValue() == 0;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.RuntimeException | java.lang.reflect.InvocationTargetException unused) {
            return true;
        }
    }
}
