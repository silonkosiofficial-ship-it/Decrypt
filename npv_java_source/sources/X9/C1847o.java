package X9;

/* JADX INFO: renamed from: X9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1847o implements X9.Z {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private byte f16182C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final X9.T f16183D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.zip.Inflater f16184E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final X9.C1848p f16185F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.zip.CRC32 f16186G;

    public C1847o(X9.Z z6) {
        p247y7.AbstractC7350t.f(z6, "source");
        X9.T t6 = new X9.T(z6);
        this.f16183D = t6;
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        this.f16184E = inflater;
        this.f16185F = new X9.C1848p((X9.InterfaceC1838f) t6, inflater);
        this.f16186G = new java.util.zip.CRC32();
    }

    private final void a(java.lang.String str, int i6, int i10) throws java.io.IOException {
        if (i10 == i6) {
            return;
        }
        throw new java.io.IOException(str + ": actual 0x" + S8.r.B0(X9.AbstractC1834b.l(i10), 8, '0') + " != expected 0x" + S8.r.B0(X9.AbstractC1834b.l(i6), 8, '0'));
    }

    private final void f() throws java.io.IOException {
        this.f16183D.q(10L);
        byte bR0 = this.f16183D.f16091D.r0(3L);
        boolean z6 = ((bR0 >> 1) & 1) == 1;
        if (z6) {
            i(this.f16183D.f16091D, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f16183D.p());
        this.f16183D.skip(8L);
        if (((bR0 >> 2) & 1) == 1) {
            this.f16183D.q(2L);
            if (z6) {
                i(this.f16183D.f16091D, 0L, 2L);
            }
            long jZ0 = this.f16183D.f16091D.Z0() & 65535;
            this.f16183D.q(jZ0);
            if (z6) {
                i(this.f16183D.f16091D, 0L, jZ0);
            }
            this.f16183D.skip(jZ0);
        }
        if (((bR0 >> 3) & 1) == 1) {
            long jA = this.f16183D.a((byte) 0);
            if (jA == -1) {
                throw new java.io.EOFException();
            }
            if (z6) {
                i(this.f16183D.f16091D, 0L, jA + 1);
            }
            this.f16183D.skip(jA + 1);
        }
        if (((bR0 >> 4) & 1) == 1) {
            long jA2 = this.f16183D.a((byte) 0);
            if (jA2 == -1) {
                throw new java.io.EOFException();
            }
            if (z6) {
                i(this.f16183D.f16091D, 0L, jA2 + 1);
            }
            this.f16183D.skip(jA2 + 1);
        }
        if (z6) {
            a("FHCRC", this.f16183D.Z0(), (short) this.f16186G.getValue());
            this.f16186G.reset();
        }
    }

    private final void g() throws java.io.IOException {
        a("CRC", this.f16183D.O0(), (int) this.f16186G.getValue());
        a("ISIZE", this.f16183D.O0(), (int) this.f16184E.getBytesWritten());
    }

    private final void i(X9.C1836d c1836d, long j6, long j10) {
        X9.U u6 = c1836d.f16138C;
        while (true) {
            p247y7.AbstractC7350t.c(u6);
            int i6 = u6.f16097c;
            int i10 = u6.f16096b;
            if (j6 < i6 - i10) {
                break;
            }
            j6 -= (long) (i6 - i10);
            u6 = u6.f16100f;
        }
        while (j10 > 0) {
            int i11 = (int) (((long) u6.f16096b) + j6);
            int iMin = (int) java.lang.Math.min(u6.f16097c - i11, j10);
            this.f16186G.update(u6.f16095a, i11, iMin);
            j10 -= (long) iMin;
            u6 = u6.f16100f;
            p247y7.AbstractC7350t.c(u6);
            j6 = 0;
        }
    }

    @Override // X9.Z
    public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1836d, "sink");
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        if (j6 == 0) {
            return 0L;
        }
        if (this.f16182C == 0) {
            f();
            this.f16182C = (byte) 1;
        }
        if (this.f16182C == 1) {
            long jD1 = c1836d.d1();
            long jB0 = this.f16185F.b0(c1836d, j6);
            if (jB0 != -1) {
                i(c1836d, jD1, jB0);
                return jB0;
            }
            this.f16182C = (byte) 2;
        }
        if (this.f16182C == 2) {
            g();
            this.f16182C = (byte) 3;
            if (!this.f16183D.j()) {
                throw new java.io.IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16185F.close();
    }

    @Override // X9.Z
    public X9.a0 k() {
        return this.f16183D.k();
    }
}
