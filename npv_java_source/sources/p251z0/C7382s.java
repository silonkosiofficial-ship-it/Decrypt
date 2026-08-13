package p251z0;

/* JADX INFO: renamed from: z0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7382s extends java.util.concurrent.CancellationException {
    public C7382s(long j6) {
        super("Timed out waiting for " + j6 + " ms");
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(p251z0.V.f57521a);
        return this;
    }
}
