package K5;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f6134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.SharedPreferences f6135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D5.c f6136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6137d;

    public a(android.content.Context context, java.lang.String str, D5.c cVar) {
        android.content.Context contextA = a(context);
        this.f6134a = contextA;
        this.f6135b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f6136c = cVar;
        this.f6137d = c();
    }

    private static android.content.Context a(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f6135b.contains("firebase_data_collection_default_enabled") ? this.f6135b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        try {
            android.content.pm.PackageManager packageManager = this.f6134a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f6134a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f6137d;
    }
}
