package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements java.io.Closeable {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final P9.j.a f8679I = new P9.j.a(null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final java.util.logging.Logger f8680J = java.util.logging.Logger.getLogger(P9.e.class.getName());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final X9.InterfaceC1837e f8681C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f8682D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final X9.C1836d f8683E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f8684F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f8685G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final P9.d.b f8686H;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public j(X9.InterfaceC1837e interfaceC1837e, boolean z6) {
        p247y7.AbstractC7350t.f(interfaceC1837e, "sink");
        this.f8681C = interfaceC1837e;
        this.f8682D = z6;
        X9.C1836d c1836d = new X9.C1836d();
        this.f8683E = c1836d;
        this.f8684F = 16384;
        this.f8686H = new P9.d.b(0, false, c1836d, 3, null);
    }

    private final void g0(int i6, long j6) {
        while (j6 > 0) {
            long jMin = java.lang.Math.min(this.f8684F, j6);
            j6 -= jMin;
            o(i6, (int) jMin, 9, j6 == 0 ? 4 : 0);
            this.f8681C.F0(this.f8683E, jMin);
        }
    }

    public final synchronized void D(boolean z6, int i6, int i10) {
        if (this.f8685G) {
            throw new java.io.IOException("closed");
        }
        o(0, 8, 6, z6 ? 1 : 0);
        this.f8681C.L(i6);
        this.f8681C.L(i10);
        this.f8681C.flush();
    }

    public final synchronized void H(int i6, int i10, java.util.List list) {
        p247y7.AbstractC7350t.f(list, "requestHeaders");
        if (this.f8685G) {
            throw new java.io.IOException("closed");
        }
        this.f8686H.g(list);
        long jD1 = this.f8683E.d1();
        int iMin = (int) java.lang.Math.min(((long) this.f8684F) - 4, jD1);
        long j6 = iMin;
        o(i6, iMin + 4, 5, jD1 == j6 ? 4 : 0);
        this.f8681C.L(i10 & Integer.MAX_VALUE);
        this.f8681C.F0(this.f8683E, j6);
        if (jD1 > j6) {
            g0(i6, jD1 - j6);
        }
    }

    public final synchronized void N(int i6, P9.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "errorCode");
        if (this.f8685G) {
            throw new java.io.IOException("closed");
        }
        if (bVar.g() == -1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        o(i6, 4, 3, 0);
        this.f8681C.L(bVar.g());
        this.f8681C.flush();
    }

    public final synchronized void R(P9.m mVar) {
        int i6;
        try {
            p247y7.AbstractC7350t.f(mVar, "settings");
            if (this.f8685G) {
                throw new java.io.IOException("closed");
            }
            int i10 = 0;
            o(0, mVar.i() * 6, 4, 0);
            while (i10 < 10) {
                if (mVar.f(i10)) {
                    if (i10 != 4) {
                        i6 = i10 != 7 ? i10 : 4;
                    } else {
                        i6 = 3;
                    }
                    this.f8681C.G(i6);
                    this.f8681C.L(mVar.a(i10));
                }
                i10++;
            }
            this.f8681C.flush();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(P9.m mVar) {
        try {
            p247y7.AbstractC7350t.f(mVar, "peerSettings");
            if (this.f8685G) {
                throw new java.io.IOException("closed");
            }
            this.f8684F = mVar.e(this.f8684F);
            if (mVar.b() != -1) {
                this.f8686H.e(mVar.b());
            }
            o(0, 0, 4, 1);
            this.f8681C.flush();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f8685G = true;
        this.f8681C.close();
    }

    public final synchronized void e0(int i6, long j6) {
        if (this.f8685G) {
            throw new java.io.IOException("closed");
        }
        if (j6 == 0 || j6 > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j6).toString());
        }
        o(i6, 4, 8, 0);
        this.f8681C.L((int) j6);
        this.f8681C.flush();
    }

    public final synchronized void f() {
        try {
            if (this.f8685G) {
                throw new java.io.IOException("closed");
            }
            if (this.f8682D) {
                java.util.logging.Logger logger = f8680J;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    logger.fine(I9.d.t(">> CONNECTION " + P9.e.f8549b.t(), new java.lang.Object[0]));
                }
                this.f8681C.h1(P9.e.f8549b);
                this.f8681C.flush();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.f8685G) {
            throw new java.io.IOException("closed");
        }
        this.f8681C.flush();
    }

    public final synchronized void g(boolean z6, int i6, X9.C1836d c1836d, int i10) {
        if (this.f8685G) {
            throw new java.io.IOException("closed");
        }
        i(i6, z6 ? 1 : 0, c1836d, i10);
    }

    public final void i(int i6, int i10, X9.C1836d c1836d, int i11) {
        o(i6, i11, 0, i10);
        if (i11 > 0) {
            X9.InterfaceC1837e interfaceC1837e = this.f8681C;
            p247y7.AbstractC7350t.c(c1836d);
            interfaceC1837e.F0(c1836d, i11);
        }
    }

    public final void o(int i6, int i10, int i11, int i12) {
        java.util.logging.Logger logger = f8680J;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(P9.e.f8548a.c(false, i6, i10, i11, i12));
        }
        if (i10 > this.f8684F) {
            throw new java.lang.IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f8684F + ": " + i10).toString());
        }
        if ((Integer.MIN_VALUE & i6) != 0) {
            throw new java.lang.IllegalArgumentException(("reserved bit set: " + i6).toString());
        }
        I9.d.a0(this.f8681C, i10);
        this.f8681C.U(i11 & 255);
        this.f8681C.U(i12 & 255);
        this.f8681C.L(i6 & Integer.MAX_VALUE);
    }

    public final synchronized void r(int i6, P9.b bVar, byte[] bArr) {
        try {
            p247y7.AbstractC7350t.f(bVar, "errorCode");
            p247y7.AbstractC7350t.f(bArr, "debugData");
            if (this.f8685G) {
                throw new java.io.IOException("closed");
            }
            if (bVar.g() == -1) {
                throw new java.lang.IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            o(0, bArr.length + 8, 7, 0);
            this.f8681C.L(i6);
            this.f8681C.L(bVar.g());
            if (!(bArr.length == 0)) {
                this.f8681C.X0(bArr);
            }
            this.f8681C.flush();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void s(boolean z6, int i6, java.util.List list) {
        p247y7.AbstractC7350t.f(list, "headerBlock");
        if (this.f8685G) {
            throw new java.io.IOException("closed");
        }
        this.f8686H.g(list);
        long jD1 = this.f8683E.d1();
        long jMin = java.lang.Math.min(this.f8684F, jD1);
        int i10 = jD1 == jMin ? 4 : 0;
        if (z6) {
            i10 |= 1;
        }
        o(i6, (int) jMin, 1, i10);
        this.f8681C.F0(this.f8683E, jMin);
        if (jD1 > jMin) {
            g0(i6, jD1 - jMin);
        }
    }

    public final int y() {
        return this.f8684F;
    }
}
