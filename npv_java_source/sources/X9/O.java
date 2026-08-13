package X9;

/* JADX INFO: loaded from: classes2.dex */
final class O implements X9.X {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.io.OutputStream f16081C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final X9.a0 f16082D;

    public O(java.io.OutputStream outputStream, X9.a0 a0Var) {
        p247y7.AbstractC7350t.f(outputStream, "out");
        p247y7.AbstractC7350t.f(a0Var, "timeout");
        this.f16081C = outputStream;
        this.f16082D = a0Var;
    }

    @Override // X9.X
    public void F0(X9.C1836d c1836d, long j6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1836d, "source");
        X9.AbstractC1834b.b(c1836d.d1(), 0L, j6);
        while (j6 > 0) {
            this.f16082D.f();
            X9.U u6 = c1836d.f16138C;
            p247y7.AbstractC7350t.c(u6);
            int iMin = (int) java.lang.Math.min(j6, u6.f16097c - u6.f16096b);
            this.f16081C.write(u6.f16095a, u6.f16096b, iMin);
            u6.f16096b += iMin;
            long j10 = iMin;
            j6 -= j10;
            c1836d.c1(c1836d.d1() - j10);
            if (u6.f16096b == u6.f16097c) {
                c1836d.f16138C = u6.b();
                X9.V.b(u6);
            }
        }
    }

    @Override // X9.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.f16081C.close();
    }

    @Override // X9.X, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.f16081C.flush();
    }

    @Override // X9.X
    public X9.a0 k() {
        return this.f16082D;
    }

    public java.lang.String toString() {
        return "sink(" + this.f16081C + ')';
    }
}
