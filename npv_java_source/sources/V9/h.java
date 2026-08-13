package V9;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements java.io.Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f15223C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final X9.InterfaceC1837e f15224D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.Random f15225E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f15226F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f15227G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final long f15228H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final X9.C1836d f15229I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final X9.C1836d f15230J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f15231K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private V9.a f15232L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final byte[] f15233M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final X9.C1836d.a f15234N;

    public h(boolean z6, X9.InterfaceC1837e interfaceC1837e, java.util.Random random, boolean z10, boolean z11, long j6) {
        p247y7.AbstractC7350t.f(interfaceC1837e, "sink");
        p247y7.AbstractC7350t.f(random, "random");
        this.f15223C = z6;
        this.f15224D = interfaceC1837e;
        this.f15225E = random;
        this.f15226F = z10;
        this.f15227G = z11;
        this.f15228H = j6;
        this.f15229I = new X9.C1836d();
        this.f15230J = interfaceC1837e.d();
        this.f15233M = z6 ? new byte[4] : null;
        this.f15234N = z6 ? new X9.C1836d.a() : null;
    }

    private final void f(int i6, X9.C1839g c1839g) throws java.io.IOException {
        if (this.f15231K) {
            throw new java.io.IOException("closed");
        }
        int I10 = c1839g.I();
        if (I10 > 125) {
            throw new java.lang.IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f15230J.U(i6 | 128);
        if (this.f15223C) {
            this.f15230J.U(I10 | 128);
            java.util.Random random = this.f15225E;
            byte[] bArr = this.f15233M;
            p247y7.AbstractC7350t.c(bArr);
            random.nextBytes(bArr);
            this.f15230J.X0(this.f15233M);
            if (I10 > 0) {
                long jD1 = this.f15230J.d1();
                this.f15230J.h1(c1839g);
                X9.C1836d c1836d = this.f15230J;
                X9.C1836d.a aVar = this.f15234N;
                p247y7.AbstractC7350t.c(aVar);
                c1836d.E0(aVar);
                this.f15234N.i(jD1);
                V9.f.f15206a.b(this.f15234N, this.f15233M);
                this.f15234N.close();
            }
        } else {
            this.f15230J.U(I10);
            this.f15230J.h1(c1839g);
        }
        this.f15224D.flush();
    }

    public final void a(int i6, X9.C1839g c1839g) {
        X9.C1839g c1839gP0 = X9.C1839g.f16150G;
        if (i6 != 0 || c1839g != null) {
            if (i6 != 0) {
                V9.f.f15206a.c(i6);
            }
            X9.C1836d c1836d = new X9.C1836d();
            c1836d.G(i6);
            if (c1839g != null) {
                c1836d.h1(c1839g);
            }
            c1839gP0 = c1836d.P0();
        }
        try {
            f(8, c1839gP0);
        } finally {
            this.f15231K = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        V9.a aVar = this.f15232L;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void g(int i6, X9.C1839g c1839g) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1839g, "data");
        if (this.f15231K) {
            throw new java.io.IOException("closed");
        }
        this.f15229I.h1(c1839g);
        int i10 = i6 | 128;
        if (this.f15226F && c1839g.I() >= this.f15228H) {
            V9.a aVar = this.f15232L;
            if (aVar == null) {
                aVar = new V9.a(this.f15227G);
                this.f15232L = aVar;
            }
            aVar.a(this.f15229I);
            i10 = i6 | 192;
        }
        long jD1 = this.f15229I.d1();
        this.f15230J.U(i10);
        int i11 = this.f15223C ? 128 : 0;
        if (jD1 <= 125) {
            this.f15230J.U(i11 | ((int) jD1));
        } else if (jD1 <= 65535) {
            this.f15230J.U(i11 | 126);
            this.f15230J.G((int) jD1);
        } else {
            this.f15230J.U(i11 | com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION);
            this.f15230J.y1(jD1);
        }
        if (this.f15223C) {
            java.util.Random random = this.f15225E;
            byte[] bArr = this.f15233M;
            p247y7.AbstractC7350t.c(bArr);
            random.nextBytes(bArr);
            this.f15230J.X0(this.f15233M);
            if (jD1 > 0) {
                X9.C1836d c1836d = this.f15229I;
                X9.C1836d.a aVar2 = this.f15234N;
                p247y7.AbstractC7350t.c(aVar2);
                c1836d.E0(aVar2);
                this.f15234N.i(0L);
                V9.f.f15206a.b(this.f15234N, this.f15233M);
                this.f15234N.close();
            }
        }
        this.f15230J.F0(this.f15229I, jD1);
        this.f15224D.E();
    }

    public final void i(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "payload");
        f(9, c1839g);
    }

    public final void o(X9.C1839g c1839g) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1839g, "payload");
        f(10, c1839g);
    }
}
