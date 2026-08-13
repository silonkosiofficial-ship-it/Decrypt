package M9;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M9.e f7186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H9.r f7187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M9.d f7188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final N9.d f7189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M9.f f7192g;

    private final class a extends X9.AbstractC1844l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final long f7193D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private boolean f7194E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private long f7195F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private boolean f7196G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ M9.c f7197H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M9.c cVar, X9.X x6, long j6) {
            super(x6);
            p247y7.AbstractC7350t.f(x6, "delegate");
            this.f7197H = cVar;
            this.f7193D = j6;
        }

        private final java.io.IOException a(java.io.IOException iOException) {
            if (this.f7194E) {
                return iOException;
            }
            this.f7194E = true;
            return this.f7197H.a(this.f7195F, false, true, iOException);
        }

        @Override // X9.AbstractC1844l, X9.X
        public void F0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(c1836d, "source");
            if (!(!this.f7196G)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            long j10 = this.f7193D;
            if (j10 == -1 || this.f7195F + j6 <= j10) {
                try {
                    super.F0(c1836d, j6);
                    this.f7195F += j6;
                    return;
                } catch (java.io.IOException e6) {
                    throw a(e6);
                }
            }
            throw new java.net.ProtocolException("expected " + this.f7193D + " bytes but received " + (this.f7195F + j6));
        }

        @Override // X9.AbstractC1844l, X9.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            if (this.f7196G) {
                return;
            }
            this.f7196G = true;
            long j6 = this.f7193D;
            if (j6 != -1 && this.f7195F != j6) {
                throw new java.net.ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (java.io.IOException e6) {
                throw a(e6);
            }
        }

        @Override // X9.AbstractC1844l, X9.X, java.io.Flushable
        public void flush() throws java.io.IOException {
            try {
                super.flush();
            } catch (java.io.IOException e6) {
                throw a(e6);
            }
        }
    }

    public final class b extends X9.AbstractC1845m {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final long f7198D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private long f7199E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private boolean f7200F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private boolean f7201G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private boolean f7202H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ M9.c f7203I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(M9.c cVar, X9.Z z6, long j6) {
            super(z6);
            p247y7.AbstractC7350t.f(z6, "delegate");
            this.f7203I = cVar;
            this.f7198D = j6;
            this.f7200F = true;
            if (j6 == 0) {
                f(null);
            }
        }

        @Override // X9.AbstractC1845m, X9.Z
        public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(c1836d, "sink");
            if (!(!this.f7202H)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            try {
                long jB0 = a().b0(c1836d, j6);
                if (this.f7200F) {
                    this.f7200F = false;
                    this.f7203I.i().v(this.f7203I.g());
                }
                if (jB0 == -1) {
                    f(null);
                    return -1L;
                }
                long j10 = this.f7199E + jB0;
                long j11 = this.f7198D;
                if (j11 != -1 && j10 > j11) {
                    throw new java.net.ProtocolException("expected " + this.f7198D + " bytes but received " + j10);
                }
                this.f7199E = j10;
                if (j10 == j11) {
                    f(null);
                }
                return jB0;
            } catch (java.io.IOException e6) {
                throw f(e6);
            }
        }

        @Override // X9.AbstractC1845m, X9.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            if (this.f7202H) {
                return;
            }
            this.f7202H = true;
            try {
                super.close();
                f(null);
            } catch (java.io.IOException e6) {
                throw f(e6);
            }
        }

        public final java.io.IOException f(java.io.IOException iOException) {
            if (this.f7201G) {
                return iOException;
            }
            this.f7201G = true;
            if (iOException == null && this.f7200F) {
                this.f7200F = false;
                this.f7203I.i().v(this.f7203I.g());
            }
            return this.f7203I.a(this.f7199E, true, false, iOException);
        }
    }

    public c(M9.e eVar, H9.r rVar, M9.d dVar, N9.d dVar2) {
        p247y7.AbstractC7350t.f(eVar, "call");
        p247y7.AbstractC7350t.f(rVar, "eventListener");
        p247y7.AbstractC7350t.f(dVar, "finder");
        p247y7.AbstractC7350t.f(dVar2, "codec");
        this.f7186a = eVar;
        this.f7187b = rVar;
        this.f7188c = dVar;
        this.f7189d = dVar2;
        this.f7192g = dVar2.e();
    }

    private final void u(java.io.IOException iOException) {
        this.f7191f = true;
        this.f7188c.h(iOException);
        this.f7189d.e().H(this.f7186a, iOException);
    }

    public final java.io.IOException a(long j6, boolean z6, boolean z10, java.io.IOException iOException) {
        if (iOException != null) {
            u(iOException);
        }
        if (z10) {
            H9.r rVar = this.f7187b;
            M9.e eVar = this.f7186a;
            if (iOException != null) {
                rVar.r(eVar, iOException);
            } else {
                rVar.p(eVar, j6);
            }
        }
        if (z6) {
            if (iOException != null) {
                this.f7187b.w(this.f7186a, iOException);
            } else {
                this.f7187b.u(this.f7186a, j6);
            }
        }
        return this.f7186a.w(this, z10, z6, iOException);
    }

    public final void b() {
        this.f7189d.cancel();
    }

    public final X9.X c(H9.z zVar, boolean z6) {
        p247y7.AbstractC7350t.f(zVar, "request");
        this.f7190e = z6;
        H9.A a6 = zVar.a();
        p247y7.AbstractC7350t.c(a6);
        long jA = a6.a();
        this.f7187b.q(this.f7186a);
        return new M9.c.a(this, this.f7189d.g(zVar, jA), jA);
    }

    public final void d() {
        this.f7189d.cancel();
        this.f7186a.w(this, true, true, null);
    }

    public final void e() throws java.io.IOException {
        try {
            this.f7189d.b();
        } catch (java.io.IOException e6) {
            this.f7187b.r(this.f7186a, e6);
            u(e6);
            throw e6;
        }
    }

    public final void f() throws java.io.IOException {
        try {
            this.f7189d.f();
        } catch (java.io.IOException e6) {
            this.f7187b.r(this.f7186a, e6);
            u(e6);
            throw e6;
        }
    }

    public final M9.e g() {
        return this.f7186a;
    }

    public final M9.f h() {
        return this.f7192g;
    }

    public final H9.r i() {
        return this.f7187b;
    }

    public final M9.d j() {
        return this.f7188c;
    }

    public final boolean k() {
        return this.f7191f;
    }

    public final boolean l() {
        return !p247y7.AbstractC7350t.b(this.f7188c.d().l().h(), this.f7192g.A().a().l().h());
    }

    public final boolean m() {
        return this.f7190e;
    }

    public final V9.d.AbstractC0291d n() {
        this.f7186a.C();
        return this.f7189d.e().x(this);
    }

    public final void o() {
        this.f7189d.e().z();
    }

    public final void p() {
        this.f7186a.w(this, true, false, null);
    }

    public final H9.C q(H9.B b6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(b6, "response");
        try {
            java.lang.String strD = H9.B.D(b6, "Content-Type", null, 2, null);
            long jA = this.f7189d.a(b6);
            return new N9.h(strD, jA, X9.K.b(new M9.c.b(this, this.f7189d.c(b6), jA)));
        } catch (java.io.IOException e6) {
            this.f7187b.w(this.f7186a, e6);
            u(e6);
            throw e6;
        }
    }

    public final H9.B.a r(boolean z6) throws java.io.IOException {
        try {
            H9.B.a aVarD = this.f7189d.d(z6);
            if (aVarD != null) {
                aVarD.l(this);
            }
            return aVarD;
        } catch (java.io.IOException e6) {
            this.f7187b.w(this.f7186a, e6);
            u(e6);
            throw e6;
        }
    }

    public final void s(H9.B b6) {
        p247y7.AbstractC7350t.f(b6, "response");
        this.f7187b.x(this.f7186a, b6);
    }

    public final void t() {
        this.f7187b.y(this.f7186a);
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(H9.z zVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(zVar, "request");
        try {
            this.f7187b.t(this.f7186a);
            this.f7189d.h(zVar);
            this.f7187b.s(this.f7186a, zVar);
        } catch (java.io.IOException e6) {
            this.f7187b.r(this.f7186a, e6);
            u(e6);
            throw e6;
        }
    }
}
