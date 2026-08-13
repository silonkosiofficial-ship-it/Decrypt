package p019b9;

/* JADX INFO: renamed from: b9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2118e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Collection f24353a = R8.k.M(R8.k.g(java.util.ServiceLoader.load(W8.K.class, W8.K.class.getClassLoader()).iterator()));

    public static final java.util.Collection a() {
        return f24353a;
    }

    public static final void b(java.lang.Throwable th) {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
