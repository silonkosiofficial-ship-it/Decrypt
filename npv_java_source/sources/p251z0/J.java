package p251z0;

/* JADX INFO: loaded from: classes.dex */
public final class J extends java.util.concurrent.CancellationException {
    public J() {
        super("Pointer input was reset");
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(p251z0.V.f57521a);
        return this;
    }
}
