package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static class a {
        static <T> T a(android.content.Context context, java.lang.Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static int b(android.app.AppOpsManager appOpsManager, java.lang.String str, java.lang.String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        static int c(android.app.AppOpsManager appOpsManager, java.lang.String str, java.lang.String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        static java.lang.String d(java.lang.String str) {
            return android.app.AppOpsManager.permissionToOp(str);
        }
    }

    static class b {
        static int a(android.app.AppOpsManager appOpsManager, java.lang.String str, int i6, java.lang.String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i6, str2);
        }

        static java.lang.String b(android.content.Context context) {
            return context.getOpPackageName();
        }

        static android.app.AppOpsManager c(android.content.Context context) {
            return (android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class);
        }
    }

    public static int a(android.content.Context context, int i6, java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return b(context, str, str2);
        }
        android.app.AppOpsManager appOpsManagerC = androidx.core.app.e.b.c(context);
        int iA = androidx.core.app.e.b.a(appOpsManagerC, str, android.os.Binder.getCallingUid(), str2);
        return iA != 0 ? iA : androidx.core.app.e.b.a(appOpsManagerC, str, i6, androidx.core.app.e.b.b(context));
    }

    public static int b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return androidx.core.app.e.a.c((android.app.AppOpsManager) androidx.core.app.e.a.a(context, android.app.AppOpsManager.class), str, str2);
    }

    public static java.lang.String c(java.lang.String str) {
        return androidx.core.app.e.a.d(str);
    }
}
