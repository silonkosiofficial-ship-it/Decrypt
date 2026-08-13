package Q3;

/* JADX INFO: renamed from: Q3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1469h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f8966a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Q3.q0 f8967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static android.os.HandlerThread f8968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static java.util.concurrent.Executor f8969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f8970e;

    public static Q3.AbstractC1469h a(android.content.Context context) {
        synchronized (f8966a) {
            try {
                if (f8967b == null) {
                    f8967b = new Q3.q0(context.getApplicationContext(), f8970e ? b().getLooper() : context.getMainLooper(), f8969d);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return f8967b;
    }

    public static android.os.HandlerThread b() {
        synchronized (f8966a) {
            try {
                android.os.HandlerThread handlerThread = f8968c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("GoogleApiHandler", 9);
                f8968c = handlerThread2;
                handlerThread2.start();
                return f8968c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void c(Q3.l0 l0Var, android.content.ServiceConnection serviceConnection, java.lang.String str);

    public final void d(java.lang.String str, java.lang.String str2, int i6, android.content.ServiceConnection serviceConnection, java.lang.String str3, boolean z6) {
        c(new Q3.l0(str, str2, 4225, z6), serviceConnection, str3);
    }

    protected abstract boolean e(Q3.l0 l0Var, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor);
}
