package X9;

/* JADX INFO: renamed from: X9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1840h implements X9.X {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final X9.InterfaceC1837e f16154C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.zip.Deflater f16155D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f16156E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1840h(X9.X x6, java.util.zip.Deflater deflater) {
        this(X9.K.a(x6), deflater);
        p247y7.AbstractC7350t.f(x6, "sink");
        p247y7.AbstractC7350t.f(deflater, "deflater");
    }

    public C1840h(X9.InterfaceC1837e interfaceC1837e, java.util.zip.Deflater deflater) {
        p247y7.AbstractC7350t.f(interfaceC1837e, "sink");
        p247y7.AbstractC7350t.f(deflater, "deflater");
        this.f16154C = interfaceC1837e;
        this.f16155D = deflater;
    }

    private final void a(boolean z6) throws java.io.IOException {
        X9.U uL1;
        int iDeflate;
        X9.C1836d c1836dD = this.f16154C.d();
        while (true) {
            uL1 = c1836dD.l1(1);
            if (z6) {
                try {
                    java.util.zip.Deflater deflater = this.f16155D;
                    byte[] bArr = uL1.f16095a;
                    int i6 = uL1.f16097c;
                    iDeflate = deflater.deflate(bArr, i6, 8192 - i6, 2);
                } catch (java.lang.NullPointerException e6) {
                    throw new java.io.IOException("Deflater already closed", e6);
                }
            } else {
                java.util.zip.Deflater deflater2 = this.f16155D;
                byte[] bArr2 = uL1.f16095a;
                int i10 = uL1.f16097c;
                iDeflate = deflater2.deflate(bArr2, i10, 8192 - i10);
            }
            if (iDeflate > 0) {
                uL1.f16097c += iDeflate;
                c1836dD.c1(c1836dD.d1() + ((long) iDeflate));
                this.f16154C.d0();
            } else if (this.f16155D.needsInput()) {
                break;
            }
        }
        if (uL1.f16096b == uL1.f16097c) {
            c1836dD.f16138C = uL1.b();
            X9.V.b(uL1);
        }
    }

    @Override // X9.X
    public void F0(X9.C1836d c1836d, long j6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1836d, "source");
        X9.AbstractC1834b.b(c1836d.d1(), 0L, j6);
        while (j6 > 0) {
            X9.U u6 = c1836d.f16138C;
            p247y7.AbstractC7350t.c(u6);
            int iMin = (int) java.lang.Math.min(j6, u6.f16097c - u6.f16096b);
            this.f16155D.setInput(u6.f16095a, u6.f16096b, iMin);
            a(false);
            long j10 = iMin;
            c1836d.c1(c1836d.d1() - j10);
            int i6 = u6.f16096b + iMin;
            u6.f16096b = i6;
            if (i6 == u6.f16097c) {
                c1836d.f16138C = u6.b();
                X9.V.b(u6);
            }
            j6 -= j10;
        }
    }

    @Override // X9.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        if (this.f16156E) {
            return;
        }
        f();
        th = null;
        try {
            this.f16155D.end();
        } catch (java.lang.Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f16154C.close();
        } catch (java.lang.Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f16156E = true;
        if (th != null) {
            throw th;
        }
    }

    public final void f() throws java.io.IOException {
        this.f16155D.finish();
        a(false);
    }

    @Override // X9.X, java.io.Flushable
    public void flush() throws java.io.IOException {
        a(true);
        this.f16154C.flush();
    }

    @Override // X9.X
    public X9.a0 k() {
        return this.f16154C.k();
    }

    public java.lang.String toString() {
        return "DeflaterSink(" + this.f16154C + ')';
    }
}
