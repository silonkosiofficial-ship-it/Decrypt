package X9;

/* JADX INFO: renamed from: X9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1845m implements X9.Z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final X9.Z f16180C;

    public AbstractC1845m(X9.Z z6) {
        p247y7.AbstractC7350t.f(z6, "delegate");
        this.f16180C = z6;
    }

    public final X9.Z a() {
        return this.f16180C;
    }

    @Override // X9.Z
    public long b0(X9.C1836d c1836d, long j6) {
        p247y7.AbstractC7350t.f(c1836d, "sink");
        return this.f16180C.b0(c1836d, j6);
    }

    @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16180C.close();
    }

    @Override // X9.Z
    public X9.a0 k() {
        return this.f16180C.k();
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '(' + this.f16180C + ')';
    }
}
