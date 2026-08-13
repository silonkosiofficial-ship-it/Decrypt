package Q3;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f8879a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f8880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.String f8881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8882d;

    public static int a(android.content.Context context) {
        b(context);
        return f8882d;
    }

    private static void b(android.content.Context context) {
        synchronized (f8879a) {
            try {
                if (f8880b) {
                    return;
                }
                f8880b = true;
                try {
                    android.os.Bundle bundle = W3.e.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f8881c = bundle.getString("com.google.app.id");
                    f8882d = bundle.getInt("com.google.android.gms.version");
                } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
