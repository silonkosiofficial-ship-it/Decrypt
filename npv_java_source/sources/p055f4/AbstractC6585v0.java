package p055f4;

/* JADX INFO: renamed from: f4.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6585v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.os.Handler f45260a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.Executor f45261b = new p055f4.ExecutorC6583u0("Google consent worker");

    public static void a() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("Method must be call on main thread.");
        }
    }
}
