package W3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.content.Context f15335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.Boolean f15336b;

    public static synchronized boolean a(android.content.Context context) {
        java.lang.Boolean boolValueOf;
        java.lang.Boolean bool;
        android.content.Context applicationContext = context.getApplicationContext();
        android.content.Context context2 = f15335a;
        if (context2 != null && (bool = f15336b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f15336b = null;
        if (!V3.n.i()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f15336b = java.lang.Boolean.TRUE;
            } catch (java.lang.ClassNotFoundException unused) {
                boolValueOf = java.lang.Boolean.FALSE;
                f15336b = boolValueOf;
            }
            f15335a = applicationContext;
            return f15336b.booleanValue();
        }
        boolValueOf = java.lang.Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f15336b = boolValueOf;
        f15335a = applicationContext;
        return f15336b.booleanValue();
    }
}
