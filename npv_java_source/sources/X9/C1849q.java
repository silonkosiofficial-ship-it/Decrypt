package X9;

/* JADX INFO: renamed from: X9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1849q implements X9.Z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.io.InputStream f16191C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final X9.a0 f16192D;

    public C1849q(java.io.InputStream inputStream, X9.a0 a0Var) {
        p247y7.AbstractC7350t.f(inputStream, "input");
        p247y7.AbstractC7350t.f(a0Var, "timeout");
        this.f16191C = inputStream;
        this.f16192D = a0Var;
    }

    @Override // X9.Z
    public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1836d, "sink");
        if (j6 == 0) {
            return 0L;
        }
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        try {
            this.f16192D.f();
            X9.U uL1 = c1836d.l1(1);
            int i6 = this.f16191C.read(uL1.f16095a, uL1.f16097c, (int) java.lang.Math.min(j6, 8192 - uL1.f16097c));
            if (i6 != -1) {
                uL1.f16097c += i6;
                long j10 = i6;
                c1836d.c1(c1836d.d1() + j10);
                return j10;
            }
            if (uL1.f16096b != uL1.f16097c) {
                return -1L;
            }
            c1836d.f16138C = uL1.b();
            X9.V.b(uL1);
            return -1L;
        } catch (java.lang.AssertionError e6) {
            if (X9.K.c(e6)) {
                throw new java.io.IOException(e6);
            }
            throw e6;
        }
    }

    @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.f16191C.close();
    }

    @Override // X9.Z
    public X9.a0 k() {
        return this.f16192D;
    }

    public java.lang.String toString() {
        return "source(" + this.f16191C + ')';
    }
}
