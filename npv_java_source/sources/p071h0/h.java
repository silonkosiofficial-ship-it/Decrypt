package p071h0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends java.util.concurrent.CancellationException {
    public h() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(p071h0.i.f45802a);
        return this;
    }
}
