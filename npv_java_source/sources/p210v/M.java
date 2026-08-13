package p210v;

/* JADX INFO: loaded from: classes.dex */
public final class M extends java.util.concurrent.CancellationException {
    public M() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
