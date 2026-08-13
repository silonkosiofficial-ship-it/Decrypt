package p214v3;

/* JADX INFO: renamed from: v3.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7247h0 {
    public static java.lang.Object a(android.content.Context context, java.util.concurrent.Callable callable) {
        try {
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            try {
                android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                android.os.StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Unexpected exception.", th);
            com.google.android.gms.internal.ads.C4396lo.c(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
