package p200u;

/* JADX INFO: renamed from: u.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7160b0 extends java.util.concurrent.CancellationException {
    public C7160b0() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
