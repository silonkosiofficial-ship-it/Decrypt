package X9;

/* JADX INFO: renamed from: X9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1848p implements X9.Z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final X9.InterfaceC1838f f16187C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.zip.Inflater f16188D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f16189E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f16190F;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1848p(X9.Z z6, java.util.zip.Inflater inflater) {
        this(X9.K.b(z6), inflater);
        p247y7.AbstractC7350t.f(z6, "source");
        p247y7.AbstractC7350t.f(inflater, "inflater");
    }

    public C1848p(X9.InterfaceC1838f interfaceC1838f, java.util.zip.Inflater inflater) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        p247y7.AbstractC7350t.f(inflater, "inflater");
        this.f16187C = interfaceC1838f;
        this.f16188D = inflater;
    }

    private final void g() {
        int i6 = this.f16189E;
        if (i6 == 0) {
            return;
        }
        int remaining = i6 - this.f16188D.getRemaining();
        this.f16189E -= remaining;
        this.f16187C.skip(remaining);
    }

    public final long a(X9.C1836d c1836d, long j6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1836d, "sink");
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        if (!(!this.f16190F)) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        if (j6 == 0) {
            return 0L;
        }
        try {
            X9.U uL1 = c1836d.l1(1);
            int iMin = (int) java.lang.Math.min(j6, 8192 - uL1.f16097c);
            f();
            int iInflate = this.f16188D.inflate(uL1.f16095a, uL1.f16097c, iMin);
            g();
            if (iInflate > 0) {
                uL1.f16097c += iInflate;
                long j10 = iInflate;
                c1836d.c1(c1836d.d1() + j10);
                return j10;
            }
            if (uL1.f16096b == uL1.f16097c) {
                c1836d.f16138C = uL1.b();
                X9.V.b(uL1);
            }
            return 0L;
        } catch (java.util.zip.DataFormatException e6) {
            throw new java.io.IOException(e6);
        }
    }

    @Override // X9.Z
    public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1836d, "sink");
        do {
            long jA = a(c1836d, j6);
            if (jA > 0) {
                return jA;
            }
            if (this.f16188D.finished() || this.f16188D.needsDictionary()) {
                return -1L;
            }
        } while (!this.f16187C.j());
        throw new java.io.EOFException("source exhausted prematurely");
    }

    @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f16190F) {
            return;
        }
        this.f16188D.end();
        this.f16190F = true;
        this.f16187C.close();
    }

    public final boolean f() {
        if (!this.f16188D.needsInput()) {
            return false;
        }
        if (this.f16187C.j()) {
            return true;
        }
        X9.U u6 = this.f16187C.d().f16138C;
        p247y7.AbstractC7350t.c(u6);
        int i6 = u6.f16097c;
        int i10 = u6.f16096b;
        int i11 = i6 - i10;
        this.f16189E = i11;
        this.f16188D.setInput(u6.f16095a, i10, i11);
        return false;
    }

    @Override // X9.Z
    public X9.a0 k() {
        return this.f16187C.k();
    }
}
