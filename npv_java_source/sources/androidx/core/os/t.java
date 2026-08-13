package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    static class a {
        static boolean a(android.content.Context context) {
            return ((android.os.UserManager) context.getSystemService(android.os.UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.os.t.a.a(context);
        }
        return true;
    }
}
