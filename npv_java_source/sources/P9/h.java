package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements java.io.Closeable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final P9.h.a f8639G = new P9.h.a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final java.util.logging.Logger f8640H;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final X9.InterfaceC1838f f8641C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f8642D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final P9.h.b f8643E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final P9.d.a f8644F;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.util.logging.Logger a() {
            return P9.h.f8640H;
        }

        public final int b(int i6, int i10, int i11) throws java.io.IOException {
            if ((i10 & 8) != 0) {
                i6--;
            }
            if (i11 <= i6) {
                return i6 - i11;
            }
            throw new java.io.IOException("PROTOCOL_ERROR padding " + i11 + " > remaining length " + i6);
        }
    }

    public static final class b implements X9.Z {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final X9.InterfaceC1838f f8645C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f8646D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f8647E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f8648F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f8649G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f8650H;

        public b(X9.InterfaceC1838f interfaceC1838f) {
            p247y7.AbstractC7350t.f(interfaceC1838f, "source");
            this.f8645C = interfaceC1838f;
        }

        private final void f() throws java.io.IOException {
            int i6 = this.f8648F;
            int I10 = I9.d.I(this.f8645C);
            this.f8649G = I10;
            this.f8646D = I10;
            int iD = I9.d.d(this.f8645C.m(), 255);
            this.f8647E = I9.d.d(this.f8645C.m(), 255);
            P9.h.a aVar = P9.h.f8639G;
            if (aVar.a().isLoggable(java.util.logging.Level.FINE)) {
                aVar.a().fine(P9.e.f8548a.c(true, this.f8648F, this.f8646D, iD, this.f8647E));
            }
            int iK = this.f8645C.K() & Integer.MAX_VALUE;
            this.f8648F = iK;
            if (iD == 9) {
                if (iK != i6) {
                    throw new java.io.IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new java.io.IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        public final int a() {
            return this.f8649G;
        }

        @Override // X9.Z
        public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(c1836d, "sink");
            while (true) {
                int i6 = this.f8649G;
                if (i6 != 0) {
                    long jB0 = this.f8645C.b0(c1836d, java.lang.Math.min(j6, i6));
                    if (jB0 == -1) {
                        return -1L;
                    }
                    this.f8649G -= (int) jB0;
                    return jB0;
                }
                this.f8645C.skip(this.f8650H);
                this.f8650H = 0;
                if ((this.f8647E & 4) != 0) {
                    return -1L;
                }
                f();
            }
        }

        @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final void g(int i6) {
            this.f8647E = i6;
        }

        public final void i(int i6) {
            this.f8649G = i6;
        }

        @Override // X9.Z
        public X9.a0 k() {
            return this.f8645C.k();
        }

        public final void o(int i6) {
            this.f8646D = i6;
        }

        public final void r(int i6) {
            this.f8650H = i6;
        }

        public final void s(int i6) {
            this.f8648F = i6;
        }
    }

    public interface c {
        void a();

        void e(int i6, P9.b bVar, X9.C1839g c1839g);

        void f(boolean z6, int i6, int i10, java.util.List list);

        void g(int i6, long j6);

        void k(boolean z6, P9.m mVar);

        void m(int i6, P9.b bVar);

        void n(boolean z6, int i6, X9.InterfaceC1838f interfaceC1838f, int i10);

        void p(boolean z6, int i6, int i10);

        void s(int i6, int i10, int i11, boolean z6);

        void t(int i6, int i10, java.util.List list);
    }

    static {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(P9.e.class.getName());
        p247y7.AbstractC7350t.e(logger, "getLogger(Http2::class.java.name)");
        f8640H = logger;
    }

    public h(X9.InterfaceC1838f interfaceC1838f, boolean z6) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        this.f8641C = interfaceC1838f;
        this.f8642D = z6;
        P9.h.b bVar = new P9.h.b(interfaceC1838f);
        this.f8643E = bVar;
        this.f8644F = new P9.d.a(bVar, 4096, 0, 4, null);
    }

    private final void D(P9.h.c cVar, int i6) {
        int iK = this.f8641C.K();
        cVar.s(i6, iK & Integer.MAX_VALUE, I9.d.d(this.f8641C.m(), 255) + 1, (Integer.MIN_VALUE & iK) != 0);
    }

    private final void H(P9.h.c cVar, int i6, int i10, int i11) throws java.io.IOException {
        if (i6 == 5) {
            if (i11 == 0) {
                throw new java.io.IOException("TYPE_PRIORITY streamId == 0");
            }
            D(cVar, i11);
        } else {
            throw new java.io.IOException("TYPE_PRIORITY length: " + i6 + " != 5");
        }
    }

    private final void N(P9.h.c cVar, int i6, int i10, int i11) throws java.io.IOException {
        if (i11 == 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (i10 & 8) != 0 ? I9.d.d(this.f8641C.m(), 255) : 0;
        cVar.t(i11, this.f8641C.K() & Integer.MAX_VALUE, r(f8639G.b(i6 - 4, i10, iD), iD, i10, i11));
    }

    private final void R(P9.h.c cVar, int i6, int i10, int i11) throws java.io.IOException {
        if (i6 != 4) {
            throw new java.io.IOException("TYPE_RST_STREAM length: " + i6 + " != 4");
        }
        if (i11 == 0) {
            throw new java.io.IOException("TYPE_RST_STREAM streamId == 0");
        }
        int iK = this.f8641C.K();
        P9.b bVarA = P9.b.f8500D.a(iK);
        if (bVarA != null) {
            cVar.m(i11, bVarA);
            return;
        }
        throw new java.io.IOException("TYPE_RST_STREAM unexpected error code: " + iK);
    }

    private final void e0(P9.h.c cVar, int i6, int i10, int i11) throws java.io.IOException {
        if (i11 != 0) {
            throw new java.io.IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i10 & 1) != 0) {
            if (i6 != 0) {
                throw new java.io.IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.a();
            return;
        }
        if (i6 % 6 != 0) {
            throw new java.io.IOException("TYPE_SETTINGS length % 6 != 0: " + i6);
        }
        P9.m mVar = new P9.m();
        E7.g gVarP = E7.j.p(E7.j.q(0, i6), 6);
        int iF = gVarP.f();
        int iG = gVarP.g();
        int iO = gVarP.o();
        if ((iO > 0 && iF <= iG) || (iO < 0 && iG <= iF)) {
            while (true) {
                int iE = I9.d.e(this.f8641C.p(), 65535);
                int iK = this.f8641C.K();
                if (iE != 2) {
                    if (iE == 3) {
                        iE = 4;
                    } else if (iE != 4) {
                        if (iE == 5 && (iK < 16384 || iK > 16777215)) {
                            throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + iK);
                        }
                    } else {
                        if (iK < 0) {
                            throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iE = 7;
                    }
                } else if (iK != 0 && iK != 1) {
                    throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.h(iE, iK);
                if (iF != iG) {
                    iF += iO;
                }
            }
        }
        cVar.k(false, mVar);
    }

    private final void g0(P9.h.c cVar, int i6, int i10, int i11) throws java.io.IOException {
        if (i6 != 4) {
            throw new java.io.IOException("TYPE_WINDOW_UPDATE length !=4: " + i6);
        }
        long jF = I9.d.f(this.f8641C.K(), 2147483647L);
        if (jF == 0) {
            throw new java.io.IOException("windowSizeIncrement was 0");
        }
        cVar.g(i11, jF);
    }

    private final void i(P9.h.c cVar, int i6, int i10, int i11) throws java.io.IOException {
        if (i11 == 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z6 = (i10 & 1) != 0;
        if ((i10 & 32) != 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (i10 & 8) != 0 ? I9.d.d(this.f8641C.m(), 255) : 0;
        cVar.n(z6, i11, this.f8641C, f8639G.b(i6, i10, iD));
        this.f8641C.skip(iD);
    }

    private final void o(P9.h.c cVar, int i6, int i10, int i11) throws java.io.IOException {
        if (i6 < 8) {
            throw new java.io.IOException("TYPE_GOAWAY length < 8: " + i6);
        }
        if (i11 != 0) {
            throw new java.io.IOException("TYPE_GOAWAY streamId != 0");
        }
        int iK = this.f8641C.K();
        int iK2 = this.f8641C.K();
        int i12 = i6 - 8;
        P9.b bVarA = P9.b.f8500D.a(iK2);
        if (bVarA == null) {
            throw new java.io.IOException("TYPE_GOAWAY unexpected error code: " + iK2);
        }
        X9.C1839g c1839gA = X9.C1839g.f16150G;
        if (i12 > 0) {
            c1839gA = this.f8641C.A(i12);
        }
        cVar.e(iK, bVarA, c1839gA);
    }

    private final java.util.List r(int i6, int i10, int i11, int i12) throws java.io.IOException {
        this.f8643E.i(i6);
        P9.h.b bVar = this.f8643E;
        bVar.o(bVar.a());
        this.f8643E.r(i10);
        this.f8643E.g(i11);
        this.f8643E.s(i12);
        this.f8644F.k();
        return this.f8644F.e();
    }

    private final void s(P9.h.c cVar, int i6, int i10, int i11) throws java.io.IOException {
        if (i11 == 0) {
            throw new java.io.IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z6 = (i10 & 1) != 0;
        int iD = (i10 & 8) != 0 ? I9.d.d(this.f8641C.m(), 255) : 0;
        if ((i10 & 32) != 0) {
            D(cVar, i11);
            i6 -= 5;
        }
        cVar.f(z6, i11, -1, r(f8639G.b(i6, i10, iD), iD, i10, i11));
    }

    private final void y(P9.h.c cVar, int i6, int i10, int i11) throws java.io.IOException {
        if (i6 != 8) {
            throw new java.io.IOException("TYPE_PING length != 8: " + i6);
        }
        if (i11 != 0) {
            throw new java.io.IOException("TYPE_PING streamId != 0");
        }
        cVar.p((i10 & 1) != 0, this.f8641C.K(), this.f8641C.K());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8641C.close();
    }

    public final boolean f(boolean z6, P9.h.c cVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(cVar, "handler");
        try {
            this.f8641C.q(9L);
            int I10 = I9.d.I(this.f8641C);
            if (I10 > 16384) {
                throw new java.io.IOException("FRAME_SIZE_ERROR: " + I10);
            }
            int iD = I9.d.d(this.f8641C.m(), 255);
            int iD2 = I9.d.d(this.f8641C.m(), 255);
            int iK = this.f8641C.K() & Integer.MAX_VALUE;
            java.util.logging.Logger logger = f8640H;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                logger.fine(P9.e.f8548a.c(true, iK, I10, iD, iD2));
            }
            if (z6 && iD != 4) {
                throw new java.io.IOException("Expected a SETTINGS frame but was " + P9.e.f8548a.b(iD));
            }
            switch (iD) {
                case 0:
                    i(cVar, I10, iD2, iK);
                    return true;
                case 1:
                    s(cVar, I10, iD2, iK);
                    return true;
                case 2:
                    H(cVar, I10, iD2, iK);
                    return true;
                case 3:
                    R(cVar, I10, iD2, iK);
                    return true;
                case 4:
                    e0(cVar, I10, iD2, iK);
                    return true;
                case 5:
                    N(cVar, I10, iD2, iK);
                    return true;
                case 6:
                    y(cVar, I10, iD2, iK);
                    return true;
                case 7:
                    o(cVar, I10, iD2, iK);
                    return true;
                case 8:
                    g0(cVar, I10, iD2, iK);
                    return true;
                default:
                    this.f8641C.skip(I10);
                    return true;
            }
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public final void g(P9.h.c cVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(cVar, "handler");
        if (this.f8642D) {
            if (!f(true, cVar)) {
                throw new java.io.IOException("Required SETTINGS preface not received");
            }
            return;
        }
        X9.InterfaceC1838f interfaceC1838f = this.f8641C;
        X9.C1839g c1839g = P9.e.f8549b;
        X9.C1839g c1839gA = interfaceC1838f.A(c1839g.I());
        java.util.logging.Logger logger = f8640H;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(I9.d.t("<< CONNECTION " + c1839gA.t(), new java.lang.Object[0]));
        }
        if (p247y7.AbstractC7350t.b(c1839g, c1839gA)) {
            return;
        }
        throw new java.io.IOException("Expected a connection header but was " + c1839gA.O());
    }
}
