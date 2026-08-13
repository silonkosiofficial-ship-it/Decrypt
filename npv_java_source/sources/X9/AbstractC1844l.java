package X9;

/* JADX INFO: renamed from: X9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1844l implements X9.X {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final X9.X f16179C;

    public AbstractC1844l(X9.X x6) {
        p247y7.AbstractC7350t.f(x6, "delegate");
        this.f16179C = x6;
    }

    @Override // X9.X
    public void F0(X9.C1836d c1836d, long j6) {
        p247y7.AbstractC7350t.f(c1836d, "source");
        this.f16179C.F0(c1836d, j6);
    }

    @Override // X9.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16179C.close();
    }

    @Override // X9.X, java.io.Flushable
    public void flush() {
        this.f16179C.flush();
    }

    @Override // X9.X
    public X9.a0 k() {
        return this.f16179C.k();
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '(' + this.f16179C + ')';
    }
}
