package V9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements java.io.Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f15149C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final X9.C1836d f15150D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.zip.Deflater f15151E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final X9.C1840h f15152F;

    public a(boolean z6) {
        this.f15149C = z6;
        X9.C1836d c1836d = new X9.C1836d();
        this.f15150D = c1836d;
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(-1, true);
        this.f15151E = deflater;
        this.f15152F = new X9.C1840h((X9.X) c1836d, deflater);
    }

    private final boolean f(X9.C1836d c1836d, X9.C1839g c1839g) {
        return c1836d.x0(c1836d.d1() - ((long) c1839g.I()), c1839g);
    }

    public final void a(X9.C1836d c1836d) throws java.io.IOException {
        p247y7.AbstractC7350t.f(c1836d, "buffer");
        if (this.f15150D.d1() != 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f15149C) {
            this.f15151E.reset();
        }
        this.f15152F.F0(c1836d, c1836d.d1());
        this.f15152F.flush();
        if (f(this.f15150D, V9.b.f15153a)) {
            long jD1 = this.f15150D.d1() - ((long) 4);
            X9.C1836d.a aVarH0 = X9.C1836d.H0(this.f15150D, null, 1, null);
            try {
                aVarH0.g(jD1);
                p197t7.b.a(aVarH0, null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    p197t7.b.a(aVarH0, th);
                    throw th2;
                }
            }
        } else {
            this.f15150D.U(0);
        }
        X9.C1836d c1836d2 = this.f15150D;
        c1836d.F0(c1836d2, c1836d2.d1());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        this.f15152F.close();
    }
}
