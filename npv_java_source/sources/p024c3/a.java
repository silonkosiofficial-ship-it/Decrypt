package p024c3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (android.util.Log.isLoggable(e(str), 3)) {
            java.lang.String.format(str2, obj);
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable(e(str), 3)) {
            java.lang.String.format(str2, objArr);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (android.util.Log.isLoggable(e(str), 6)) {
        }
    }

    private static java.lang.String e(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (android.util.Log.isLoggable(e(str), 4)) {
            java.lang.String.format(str2, obj);
        }
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (android.util.Log.isLoggable(e(str), 5)) {
            java.lang.String.format(str2, obj);
        }
    }
}
