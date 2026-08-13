package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static boolean a(android.content.Context context, int i6) {
        if (!b(context, i6, "com.google.android.gms")) {
            return false;
        }
        try {
            return N3.C1399l.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return android.util.Log.isLoggable("UidVerifier", 3) ? false : false;
        }
    }

    public static boolean b(android.content.Context context, int i6, java.lang.String str) {
        return W3.e.a(context).h(i6, str);
    }
}
