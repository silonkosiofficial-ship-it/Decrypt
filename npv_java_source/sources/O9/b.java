package O9;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements N9.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O9.b.d f8207h = new O9.b.d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.x f8208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M9.f f8209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X9.InterfaceC1838f f8210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final X9.InterfaceC1837e f8211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O9.a f8213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private H9.t f8214g;

    private abstract class a implements X9.Z {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final X9.C1846n f8215C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f8216D;

        public a() {
            this.f8215C = new X9.C1846n(O9.b.this.f8210c.k());
        }

        protected final boolean a() {
            return this.f8216D;
        }

        @Override // X9.Z
        public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(c1836d, "sink");
            try {
                return O9.b.this.f8210c.b0(c1836d, j6);
            } catch (java.io.IOException e6) {
                O9.b.this.e().z();
                f();
                throw e6;
            }
        }

        public final void f() {
            if (O9.b.this.f8212e == 6) {
                return;
            }
            if (O9.b.this.f8212e == 5) {
                O9.b.this.r(this.f8215C);
                O9.b.this.f8212e = 6;
            } else {
                throw new java.lang.IllegalStateException("state: " + O9.b.this.f8212e);
            }
        }

        protected final void g(boolean z6) {
            this.f8216D = z6;
        }

        @Override // X9.Z
        public X9.a0 k() {
            return this.f8215C;
        }
    }

    /* JADX INFO: renamed from: O9.b$b, reason: collision with other inner class name */
    private final class C0198b implements X9.X {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final X9.C1846n f8218C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f8219D;

        public C0198b() {
            this.f8218C = new X9.C1846n(O9.b.this.f8211d.k());
        }

        @Override // X9.X
        public void F0(X9.C1836d c1836d, long j6) {
            p247y7.AbstractC7350t.f(c1836d, "source");
            if (!(!this.f8219D)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            if (j6 == 0) {
                return;
            }
            O9.b.this.f8211d.D0(j6);
            O9.b.this.f8211d.t0("\r\n");
            O9.b.this.f8211d.F0(c1836d, j6);
            O9.b.this.f8211d.t0("\r\n");
        }

        @Override // X9.X, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f8219D) {
                return;
            }
            this.f8219D = true;
            O9.b.this.f8211d.t0("0\r\n\r\n");
            O9.b.this.r(this.f8218C);
            O9.b.this.f8212e = 3;
        }

        @Override // X9.X, java.io.Flushable
        public synchronized void flush() {
            if (this.f8219D) {
                return;
            }
            O9.b.this.f8211d.flush();
        }

        @Override // X9.X
        public X9.a0 k() {
            return this.f8218C;
        }
    }

    private final class c extends O9.b.a {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final H9.u f8221F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private long f8222G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private boolean f8223H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ O9.b f8224I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(O9.b bVar, H9.u uVar) {
            super();
            p247y7.AbstractC7350t.f(uVar, "url");
            this.f8224I = bVar;
            this.f8221F = uVar;
            this.f8222G = -1L;
            this.f8223H = true;
        }

        private final void i() throws java.net.ProtocolException {
            if (this.f8222G != -1) {
                this.f8224I.f8210c.N0();
            }
            try {
                this.f8222G = this.f8224I.f8210c.q1();
                java.lang.String string = S8.r.u1(this.f8224I.f8210c.N0()).toString();
                if (this.f8222G < 0 || (string.length() > 0 && !S8.r.V(string, ";", false, 2, null))) {
                    throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + this.f8222G + string + '\"');
                }
                if (this.f8222G == 0) {
                    this.f8223H = false;
                    O9.b bVar = this.f8224I;
                    bVar.f8214g = bVar.f8213f.a();
                    H9.x xVar = this.f8224I.f8208a;
                    p247y7.AbstractC7350t.c(xVar);
                    H9.n nVarQ = xVar.q();
                    H9.u uVar = this.f8221F;
                    H9.t tVar = this.f8224I.f8214g;
                    p247y7.AbstractC7350t.c(tVar);
                    N9.e.f(nVarQ, uVar, tVar);
                    f();
                }
            } catch (java.lang.NumberFormatException e6) {
                throw new java.net.ProtocolException(e6.getMessage());
            }
        }

        @Override // O9.b.a, X9.Z
        public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(c1836d, "sink");
            if (j6 < 0) {
                throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j6).toString());
            }
            if (!(!a())) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            if (!this.f8223H) {
                return -1L;
            }
            long j10 = this.f8222G;
            if (j10 == 0 || j10 == -1) {
                i();
                if (!this.f8223H) {
                    return -1L;
                }
            }
            long jB0 = super.b0(c1836d, java.lang.Math.min(j6, this.f8222G));
            if (jB0 != -1) {
                this.f8222G -= jB0;
                return jB0;
            }
            this.f8224I.e().z();
            java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
            f();
            throw protocolException;
        }

        @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f8223H && !I9.d.s(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                this.f8224I.e().z();
                f();
            }
            g(true);
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private final class e extends O9.b.a {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private long f8225F;

        public e(long j6) {
            super();
            this.f8225F = j6;
            if (j6 == 0) {
                f();
            }
        }

        @Override // O9.b.a, X9.Z
        public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(c1836d, "sink");
            if (j6 < 0) {
                throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j6).toString());
            }
            if (!(!a())) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            long j10 = this.f8225F;
            if (j10 == 0) {
                return -1L;
            }
            long jB0 = super.b0(c1836d, java.lang.Math.min(j10, j6));
            if (jB0 == -1) {
                O9.b.this.e().z();
                java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
                f();
                throw protocolException;
            }
            long j11 = this.f8225F - jB0;
            this.f8225F = j11;
            if (j11 == 0) {
                f();
            }
            return jB0;
        }

        @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f8225F != 0 && !I9.d.s(this, 100, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                O9.b.this.e().z();
                f();
            }
            g(true);
        }
    }

    private final class f implements X9.X {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final X9.C1846n f8227C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f8228D;

        public f() {
            this.f8227C = new X9.C1846n(O9.b.this.f8211d.k());
        }

        @Override // X9.X
        public void F0(X9.C1836d c1836d, long j6) {
            p247y7.AbstractC7350t.f(c1836d, "source");
            if (!(!this.f8228D)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            I9.d.l(c1836d.d1(), 0L, j6);
            O9.b.this.f8211d.F0(c1836d, j6);
        }

        @Override // X9.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f8228D) {
                return;
            }
            this.f8228D = true;
            O9.b.this.r(this.f8227C);
            O9.b.this.f8212e = 3;
        }

        @Override // X9.X, java.io.Flushable
        public void flush() {
            if (this.f8228D) {
                return;
            }
            O9.b.this.f8211d.flush();
        }

        @Override // X9.X
        public X9.a0 k() {
            return this.f8227C;
        }
    }

    private final class g extends O9.b.a {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private boolean f8230F;

        public g() {
            super();
        }

        @Override // O9.b.a, X9.Z
        public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(c1836d, "sink");
            if (j6 < 0) {
                throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j6).toString());
            }
            if (!(!a())) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            if (this.f8230F) {
                return -1L;
            }
            long jB0 = super.b0(c1836d, j6);
            if (jB0 != -1) {
                return jB0;
            }
            this.f8230F = true;
            f();
            return -1L;
        }

        @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f8230F) {
                f();
            }
            g(true);
        }
    }

    public b(H9.x xVar, M9.f fVar, X9.InterfaceC1838f interfaceC1838f, X9.InterfaceC1837e interfaceC1837e) {
        p247y7.AbstractC7350t.f(fVar, "connection");
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        p247y7.AbstractC7350t.f(interfaceC1837e, "sink");
        this.f8208a = xVar;
        this.f8209b = fVar;
        this.f8210c = interfaceC1838f;
        this.f8211d = interfaceC1837e;
        this.f8213f = new O9.a(interfaceC1838f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(X9.C1846n c1846n) {
        X9.a0 a0VarI = c1846n.i();
        c1846n.j(X9.a0.f16113e);
        a0VarI.a();
        a0VarI.b();
    }

    private final boolean s(H9.z zVar) {
        return S8.r.K("chunked", zVar.d("Transfer-Encoding"), true);
    }

    private final boolean t(H9.B b6) {
        return S8.r.K("chunked", H9.B.D(b6, "Transfer-Encoding", null, 2, null), true);
    }

    private final X9.X u() {
        if (this.f8212e == 1) {
            this.f8212e = 2;
            return new O9.b.C0198b();
        }
        throw new java.lang.IllegalStateException(("state: " + this.f8212e).toString());
    }

    private final X9.Z v(H9.u uVar) {
        if (this.f8212e == 4) {
            this.f8212e = 5;
            return new O9.b.c(this, uVar);
        }
        throw new java.lang.IllegalStateException(("state: " + this.f8212e).toString());
    }

    private final X9.Z w(long j6) {
        if (this.f8212e == 4) {
            this.f8212e = 5;
            return new O9.b.e(j6);
        }
        throw new java.lang.IllegalStateException(("state: " + this.f8212e).toString());
    }

    private final X9.X x() {
        if (this.f8212e == 1) {
            this.f8212e = 2;
            return new O9.b.f();
        }
        throw new java.lang.IllegalStateException(("state: " + this.f8212e).toString());
    }

    private final X9.Z y() {
        if (this.f8212e == 4) {
            this.f8212e = 5;
            e().z();
            return new O9.b.g();
        }
        throw new java.lang.IllegalStateException(("state: " + this.f8212e).toString());
    }

    public final void A(H9.t tVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(tVar, "headers");
        p247y7.AbstractC7350t.f(str, "requestLine");
        if (this.f8212e != 0) {
            throw new java.lang.IllegalStateException(("state: " + this.f8212e).toString());
        }
        this.f8211d.t0(str).t0("\r\n");
        int size = tVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f8211d.t0(tVar.e(i6)).t0(": ").t0(tVar.s(i6)).t0("\r\n");
        }
        this.f8211d.t0("\r\n");
        this.f8212e = 1;
    }

    @Override // N9.d
    public long a(H9.B b6) {
        p247y7.AbstractC7350t.f(b6, "response");
        if (!N9.e.b(b6)) {
            return 0L;
        }
        if (t(b6)) {
            return -1L;
        }
        return I9.d.v(b6);
    }

    @Override // N9.d
    public void b() {
        this.f8211d.flush();
    }

    @Override // N9.d
    public X9.Z c(H9.B b6) {
        long jV;
        p247y7.AbstractC7350t.f(b6, "response");
        if (!N9.e.b(b6)) {
            jV = 0;
        } else {
            if (t(b6)) {
                return v(b6.r0().i());
            }
            jV = I9.d.v(b6);
            if (jV == -1) {
                return y();
            }
        }
        return w(jV);
    }

    @Override // N9.d
    public void cancel() {
        e().d();
    }

    @Override // N9.d
    public H9.B.a d(boolean z6) {
        int i6 = this.f8212e;
        if (i6 != 1 && i6 != 2 && i6 != 3) {
            throw new java.lang.IllegalStateException(("state: " + this.f8212e).toString());
        }
        try {
            N9.k kVarA = N9.k.f7933d.a(this.f8213f.b());
            H9.B.a aVarK = new H9.B.a().p(kVarA.f7934a).g(kVarA.f7935b).m(kVarA.f7936c).k(this.f8213f.a());
            if (z6 && kVarA.f7935b == 100) {
                return null;
            }
            int i10 = kVarA.f7935b;
            if (i10 != 100 && (102 > i10 || i10 >= 200)) {
                this.f8212e = 4;
                return aVarK;
            }
            this.f8212e = 3;
            return aVarK;
        } catch (java.io.EOFException e6) {
            throw new java.io.IOException("unexpected end of stream on " + e().A().a().l().n(), e6);
        }
    }

    @Override // N9.d
    public M9.f e() {
        return this.f8209b;
    }

    @Override // N9.d
    public void f() {
        this.f8211d.flush();
    }

    @Override // N9.d
    public X9.X g(H9.z zVar, long j6) throws java.net.ProtocolException {
        p247y7.AbstractC7350t.f(zVar, "request");
        if (zVar.a() != null && zVar.a().c()) {
            throw new java.net.ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(zVar)) {
            return u();
        }
        if (j6 != -1) {
            return x();
        }
        throw new java.lang.IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // N9.d
    public void h(H9.z zVar) {
        p247y7.AbstractC7350t.f(zVar, "request");
        N9.i iVar = N9.i.f7930a;
        java.net.Proxy.Type type = e().A().b().type();
        p247y7.AbstractC7350t.e(type, "connection.route().proxy.type()");
        A(zVar.e(), iVar.a(zVar, type));
    }

    public final void z(H9.B b6) {
        p247y7.AbstractC7350t.f(b6, "response");
        long jV = I9.d.v(b6);
        if (jV == -1) {
            return;
        }
        X9.Z zW = w(jV);
        I9.d.K(zW, Integer.MAX_VALUE, java.util.concurrent.TimeUnit.MILLISECONDS);
        zW.close();
    }
}
