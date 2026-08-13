package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends java.util.concurrent.CancellationException {
    public k() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
