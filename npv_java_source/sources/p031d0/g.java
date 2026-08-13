package p031d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends java.util.concurrent.CancellationException {
    public g(java.lang.String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
