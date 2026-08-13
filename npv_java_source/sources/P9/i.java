package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final P9.i.a f8651o = new P9.i.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P9.f f8653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f8655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f8657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.ArrayDeque f8658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final P9.i.c f8660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final P9.i.b f8661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final P9.i.d f8662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final P9.i.d f8663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private P9.b f8664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private java.io.IOException f8665n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public final class b implements X9.X {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private boolean f8666C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final X9.C1836d f8667D = new X9.C1836d();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private H9.t f8668E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private boolean f8669F;

        public b(boolean z6) {
            this.f8666C = z6;
        }

        private final void a(boolean z6) throws java.io.IOException {
            long jMin;
            boolean z10;
            P9.i iVar = P9.i.this;
            synchronized (iVar) {
                try {
                    iVar.s().v();
                    while (iVar.r() >= iVar.q() && !this.f8666C && !this.f8669F && iVar.h() == null) {
                        try {
                            iVar.D();
                        } catch (java.lang.Throwable th) {
                            iVar.s().C();
                            throw th;
                        }
                    }
                    iVar.s().C();
                    iVar.c();
                    jMin = java.lang.Math.min(iVar.q() - iVar.r(), this.f8667D.d1());
                    iVar.B(iVar.r() + jMin);
                    z10 = z6 && jMin == this.f8667D.d1();
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
            P9.i.this.s().v();
            try {
                P9.i.this.g().F1(P9.i.this.j(), z10, this.f8667D, jMin);
            } finally {
                P9.i.this.s().C();
            }
        }

        @Override // X9.X
        public void F0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            p247y7.AbstractC7350t.f(c1836d, "source");
            P9.i iVar = P9.i.this;
            if (!I9.d.f5554h || !java.lang.Thread.holdsLock(iVar)) {
                this.f8667D.F0(c1836d, j6);
                while (this.f8667D.d1() >= 16384) {
                    a(false);
                }
            } else {
                throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
        }

        @Override // X9.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            P9.i iVar = P9.i.this;
            if (I9.d.f5554h && java.lang.Thread.holdsLock(iVar)) {
                throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            P9.i iVar2 = P9.i.this;
            synchronized (iVar2) {
                if (this.f8669F) {
                    return;
                }
                boolean z6 = iVar2.h() == null;
                p087i7.M m6 = p087i7.M.f46721a;
                if (!P9.i.this.o().f8666C) {
                    boolean z10 = this.f8667D.d1() > 0;
                    if (this.f8668E != null) {
                        while (this.f8667D.d1() > 0) {
                            a(false);
                        }
                        P9.f fVarG = P9.i.this.g();
                        int iJ = P9.i.this.j();
                        H9.t tVar = this.f8668E;
                        p247y7.AbstractC7350t.c(tVar);
                        fVarG.G1(iJ, z6, I9.d.N(tVar));
                    } else if (z10) {
                        while (this.f8667D.d1() > 0) {
                            a(true);
                        }
                    } else if (z6) {
                        P9.i.this.g().F1(P9.i.this.j(), true, null, 0L);
                    }
                }
                synchronized (P9.i.this) {
                    this.f8669F = true;
                    p087i7.M m10 = p087i7.M.f46721a;
                }
                P9.i.this.g().flush();
                P9.i.this.b();
            }
        }

        public final boolean f() {
            return this.f8669F;
        }

        @Override // X9.X, java.io.Flushable
        public void flush() throws java.io.IOException {
            P9.i iVar = P9.i.this;
            if (I9.d.f5554h && java.lang.Thread.holdsLock(iVar)) {
                throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            P9.i iVar2 = P9.i.this;
            synchronized (iVar2) {
                iVar2.c();
                p087i7.M m6 = p087i7.M.f46721a;
            }
            while (this.f8667D.d1() > 0) {
                a(false);
                P9.i.this.g().flush();
            }
        }

        public final boolean g() {
            return this.f8666C;
        }

        @Override // X9.X
        public X9.a0 k() {
            return P9.i.this.s();
        }
    }

    public final class c implements X9.Z {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final long f8671C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private boolean f8672D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final X9.C1836d f8673E = new X9.C1836d();

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final X9.C1836d f8674F = new X9.C1836d();

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private H9.t f8675G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private boolean f8676H;

        public c(long j6, boolean z6) {
            this.f8671C = j6;
            this.f8672D = z6;
        }

        private final void r(long j6) {
            P9.i iVar = P9.i.this;
            if (!I9.d.f5554h || !java.lang.Thread.holdsLock(iVar)) {
                P9.i.this.g().E1(j6);
                return;
            }
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        public final boolean a() {
            return this.f8676H;
        }

        @Override // X9.Z
        public long b0(X9.C1836d c1836d, long j6) throws java.io.IOException {
            java.io.IOException iOExceptionI;
            boolean z6;
            long jB0;
            p247y7.AbstractC7350t.f(c1836d, "sink");
            long j10 = 0;
            if (j6 < 0) {
                throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j6).toString());
            }
            while (true) {
                P9.i iVar = P9.i.this;
                synchronized (iVar) {
                    iVar.m().v();
                    try {
                        if (iVar.h() == null || this.f8672D) {
                            iOExceptionI = null;
                        } else {
                            iOExceptionI = iVar.i();
                            if (iOExceptionI == null) {
                                P9.b bVarH = iVar.h();
                                p247y7.AbstractC7350t.c(bVarH);
                                iOExceptionI = new P9.n(bVarH);
                            }
                        }
                        if (this.f8676H) {
                            throw new java.io.IOException("stream closed");
                        }
                        z6 = false;
                        if (this.f8674F.d1() > j10) {
                            X9.C1836d c1836d2 = this.f8674F;
                            jB0 = c1836d2.b0(c1836d, java.lang.Math.min(j6, c1836d2.d1()));
                            iVar.A(iVar.l() + jB0);
                            long jL = iVar.l() - iVar.k();
                            if (iOExceptionI == null && jL >= iVar.g().K0().c() / 2) {
                                iVar.g().K1(iVar.j(), jL);
                                iVar.z(iVar.l());
                            }
                        } else {
                            if (!this.f8672D && iOExceptionI == null) {
                                iVar.D();
                                z6 = true;
                            }
                            jB0 = -1;
                        }
                        iVar.m().C();
                        p087i7.M m6 = p087i7.M.f46721a;
                    } catch (java.lang.Throwable th) {
                        iVar.m().C();
                        throw th;
                    }
                    throw th;
                }
                if (!z6) {
                    if (jB0 != -1) {
                        return jB0;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    throw iOExceptionI;
                }
                j10 = 0;
            }
        }

        @Override // X9.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jD1;
            P9.i iVar = P9.i.this;
            synchronized (iVar) {
                this.f8676H = true;
                jD1 = this.f8674F.d1();
                this.f8674F.a();
                p247y7.AbstractC7350t.d(iVar, "null cannot be cast to non-null type java.lang.Object");
                iVar.notifyAll();
                p087i7.M m6 = p087i7.M.f46721a;
            }
            if (jD1 > 0) {
                r(jD1);
            }
            P9.i.this.b();
        }

        public final boolean f() {
            return this.f8672D;
        }

        public final void g(X9.InterfaceC1838f interfaceC1838f, long j6) throws java.io.EOFException {
            boolean z6;
            boolean z10;
            p247y7.AbstractC7350t.f(interfaceC1838f, "source");
            P9.i iVar = P9.i.this;
            if (I9.d.f5554h && java.lang.Thread.holdsLock(iVar)) {
                throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            long j10 = j6;
            while (j10 > 0) {
                synchronized (P9.i.this) {
                    z6 = this.f8672D;
                    z10 = this.f8674F.d1() + j10 > this.f8671C;
                    p087i7.M m6 = p087i7.M.f46721a;
                }
                if (z10) {
                    interfaceC1838f.skip(j10);
                    P9.i.this.f(P9.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z6) {
                    interfaceC1838f.skip(j10);
                    return;
                }
                long jB0 = interfaceC1838f.b0(this.f8673E, j10);
                if (jB0 == -1) {
                    throw new java.io.EOFException();
                }
                j10 -= jB0;
                P9.i iVar2 = P9.i.this;
                synchronized (iVar2) {
                    try {
                        if (this.f8676H) {
                            this.f8673E.a();
                        } else {
                            boolean z11 = this.f8674F.d1() == 0;
                            this.f8674F.c0(this.f8673E);
                            if (z11) {
                                p247y7.AbstractC7350t.d(iVar2, "null cannot be cast to non-null type java.lang.Object");
                                iVar2.notifyAll();
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            r(j6);
        }

        public final void i(boolean z6) {
            this.f8672D = z6;
        }

        @Override // X9.Z
        public X9.a0 k() {
            return P9.i.this.m();
        }

        public final void o(H9.t tVar) {
            this.f8675G = tVar;
        }
    }

    public final class d extends X9.C1835c {
        public d() {
        }

        @Override // X9.C1835c
        protected void B() {
            P9.i.this.f(P9.b.CANCEL);
            P9.i.this.g().y1();
        }

        public final void C() throws java.io.IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // X9.C1835c
        protected java.io.IOException x(java.io.IOException iOException) {
            java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public i(int i6, P9.f fVar, boolean z6, boolean z10, H9.t tVar) {
        p247y7.AbstractC7350t.f(fVar, "connection");
        this.f8652a = i6;
        this.f8653b = fVar;
        this.f8657f = fVar.P0().c();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.f8658g = arrayDeque;
        this.f8660i = new P9.i.c(fVar.K0().c(), z10);
        this.f8661j = new P9.i.b(z6);
        this.f8662k = new P9.i.d();
        this.f8663l = new P9.i.d();
        if (tVar == null) {
            if (!t()) {
                throw new java.lang.IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!t())) {
                throw new java.lang.IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(tVar);
        }
    }

    private final boolean e(P9.b bVar, java.io.IOException iOException) {
        if (I9.d.f5554h && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f8664m != null) {
                return false;
            }
            this.f8664m = bVar;
            this.f8665n = iOException;
            p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f8660i.f() && this.f8661j.g()) {
                return false;
            }
            p087i7.M m6 = p087i7.M.f46721a;
            this.f8653b.x1(this.f8652a);
            return true;
        }
    }

    public final void A(long j6) {
        this.f8654c = j6;
    }

    public final void B(long j6) {
        this.f8656e = j6;
    }

    public final synchronized H9.t C() {
        java.lang.Object objRemoveFirst;
        this.f8662k.v();
        while (this.f8658g.isEmpty() && this.f8664m == null) {
            try {
                D();
            } catch (java.lang.Throwable th) {
                this.f8662k.C();
                throw th;
            }
        }
        this.f8662k.C();
        if (!(!this.f8658g.isEmpty())) {
            java.io.IOException iOException = this.f8665n;
            if (iOException != null) {
                throw iOException;
            }
            P9.b bVar = this.f8664m;
            p247y7.AbstractC7350t.c(bVar);
            throw new P9.n(bVar);
        }
        objRemoveFirst = this.f8658g.removeFirst();
        p247y7.AbstractC7350t.e(objRemoveFirst, "headersQueue.removeFirst()");
        return (H9.t) objRemoveFirst;
    }

    public final void D() throws java.io.InterruptedIOException {
        try {
            p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }

    public final X9.a0 E() {
        return this.f8663l;
    }

    public final void a(long j6) {
        this.f8657f += j6;
        if (j6 > 0) {
            p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z6;
        boolean zU;
        if (I9.d.f5554h && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z6 = !this.f8660i.f() && this.f8660i.a() && (this.f8661j.g() || this.f8661j.f());
                zU = u();
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z6) {
            d(P9.b.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.f8653b.x1(this.f8652a);
        }
    }

    public final void c() throws java.io.IOException {
        if (this.f8661j.f()) {
            throw new java.io.IOException("stream closed");
        }
        if (this.f8661j.g()) {
            throw new java.io.IOException("stream finished");
        }
        if (this.f8664m != null) {
            java.io.IOException iOException = this.f8665n;
            if (iOException != null) {
                throw iOException;
            }
            P9.b bVar = this.f8664m;
            p247y7.AbstractC7350t.c(bVar);
            throw new P9.n(bVar);
        }
    }

    public final void d(P9.b bVar, java.io.IOException iOException) {
        p247y7.AbstractC7350t.f(bVar, "rstStatusCode");
        if (e(bVar, iOException)) {
            this.f8653b.I1(this.f8652a, bVar);
        }
    }

    public final void f(P9.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "errorCode");
        if (e(bVar, null)) {
            this.f8653b.J1(this.f8652a, bVar);
        }
    }

    public final P9.f g() {
        return this.f8653b;
    }

    public final synchronized P9.b h() {
        return this.f8664m;
    }

    public final java.io.IOException i() {
        return this.f8665n;
    }

    public final int j() {
        return this.f8652a;
    }

    public final long k() {
        return this.f8655d;
    }

    public final long l() {
        return this.f8654c;
    }

    public final P9.i.d m() {
        return this.f8662k;
    }

    public final X9.X n() {
        synchronized (this) {
            try {
                if (!this.f8659h && !t()) {
                    throw new java.lang.IllegalStateException("reply before requesting the sink".toString());
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return this.f8661j;
    }

    public final P9.i.b o() {
        return this.f8661j;
    }

    public final P9.i.c p() {
        return this.f8660i;
    }

    public final long q() {
        return this.f8657f;
    }

    public final long r() {
        return this.f8656e;
    }

    public final P9.i.d s() {
        return this.f8663l;
    }

    public final boolean t() {
        return this.f8653b.x0() == ((this.f8652a & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.f8664m != null) {
                return false;
            }
            if (this.f8660i.f() || this.f8660i.a()) {
                if ((this.f8661j.g() || this.f8661j.f()) && this.f8659h) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final X9.a0 v() {
        return this.f8662k;
    }

    public final void w(X9.InterfaceC1838f interfaceC1838f, int i6) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        if (!I9.d.f5554h || !java.lang.Thread.holdsLock(this)) {
            this.f8660i.g(interfaceC1838f, i6);
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void x(H9.t tVar, boolean z6) {
        boolean zU;
        p247y7.AbstractC7350t.f(tVar, "headers");
        if (I9.d.f5554h && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f8659h && z6) {
                    this.f8660i.o(tVar);
                } else {
                    this.f8659h = true;
                    this.f8658g.add(tVar);
                }
                if (z6) {
                    this.f8660i.i(true);
                }
                zU = u();
                p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (zU) {
            return;
        }
        this.f8653b.x1(this.f8652a);
    }

    public final synchronized void y(P9.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "errorCode");
        if (this.f8664m == null) {
            this.f8664m = bVar;
            p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j6) {
        this.f8655d = j6;
    }
}
