package R6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final java.lang.Throwable a(java.lang.Throwable th) {
        p247y7.AbstractC7350t.f(th, "<this>");
        java.lang.Throwable cause = th;
        while (cause instanceof java.util.concurrent.CancellationException) {
            java.util.concurrent.CancellationException cancellationException = (java.util.concurrent.CancellationException) cause;
            if (p247y7.AbstractC7350t.b(cause, cancellationException.getCause())) {
                return th;
            }
            cause = cancellationException.getCause();
        }
        return cause == null ? th : cause;
    }
}
