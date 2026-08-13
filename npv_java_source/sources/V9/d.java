package V9;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements H9.F, V9.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.z f15160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H9.G f15161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Random f15162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f15163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private V9.e f15164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f15165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f15166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private H9.InterfaceC1239e f15167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private L9.a f15168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private V9.g f15169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private V9.h f15170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private L9.d f15171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private java.lang.String f15172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private V9.d.AbstractC0291d f15173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final java.util.ArrayDeque f15174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final java.util.ArrayDeque f15175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f15176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f15177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f15178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private java.lang.String f15179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f15180u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f15181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f15182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f15183x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f15184y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final V9.d.b f15159z = new V9.d.b(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final java.util.List f15158A = p097j7.AbstractC6879v.e(H9.y.HTTP_1_1);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final X9.C1839g f15186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f15187c;

        public a(int i6, X9.C1839g c1839g, long j6) {
            this.f15185a = i6;
            this.f15186b = c1839g;
            this.f15187c = j6;
        }

        public final long a() {
            return this.f15187c;
        }

        public final int b() {
            return this.f15185a;
        }

        public final X9.C1839g c() {
            return this.f15186b;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final X9.C1839g f15189b;

        public c(int i6, X9.C1839g c1839g) {
            p247y7.AbstractC7350t.f(c1839g, "data");
            this.f15188a = i6;
            this.f15189b = c1839g;
        }

        public final X9.C1839g a() {
            return this.f15189b;
        }

        public final int b() {
            return this.f15188a;
        }
    }

    /* JADX INFO: renamed from: V9.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC0291d implements java.io.Closeable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final boolean f15190C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final X9.InterfaceC1838f f15191D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final X9.InterfaceC1837e f15192E;

        public AbstractC0291d(boolean z6, X9.InterfaceC1838f interfaceC1838f, X9.InterfaceC1837e interfaceC1837e) {
            p247y7.AbstractC7350t.f(interfaceC1838f, "source");
            p247y7.AbstractC7350t.f(interfaceC1837e, "sink");
            this.f15190C = z6;
            this.f15191D = interfaceC1838f;
            this.f15192E = interfaceC1837e;
        }

        public final boolean a() {
            return this.f15190C;
        }

        public final X9.InterfaceC1837e f() {
            return this.f15192E;
        }

        public final X9.InterfaceC1838f g() {
            return this.f15191D;
        }
    }

    private final class e extends L9.a {
        public e() {
            super(V9.d.this.f15172m + " writer", false, 2, null);
        }

        @Override // L9.a
        public long f() {
            try {
                return V9.d.this.w() ? 0L : -1L;
            } catch (java.io.IOException e6) {
                V9.d.this.p(e6, null);
                return -1L;
            }
        }
    }

    public static final class f implements H9.InterfaceC1240f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ H9.z f15195b;

        f(H9.z zVar) {
            this.f15195b = zVar;
        }

        @Override // H9.InterfaceC1240f
        public void c(H9.InterfaceC1239e interfaceC1239e, H9.B b6) {
            p247y7.AbstractC7350t.f(interfaceC1239e, "call");
            p247y7.AbstractC7350t.f(b6, "response");
            M9.c cVarR = b6.r();
            try {
                V9.d.this.m(b6, cVarR);
                p247y7.AbstractC7350t.c(cVarR);
                V9.d.AbstractC0291d abstractC0291dN = cVarR.n();
                V9.e eVarA = V9.e.f15199g.a(b6.H());
                V9.d.this.f15164e = eVarA;
                if (!V9.d.this.s(eVarA)) {
                    V9.d dVar = V9.d.this;
                    synchronized (dVar) {
                        dVar.f15175p.clear();
                        dVar.f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    V9.d.this.r(I9.d.f5555i + " WebSocket " + this.f15195b.i().n(), abstractC0291dN);
                    V9.d.this.q().f(V9.d.this, b6);
                    V9.d.this.t();
                } catch (java.lang.Exception e6) {
                    V9.d.this.p(e6, null);
                }
            } catch (java.io.IOException e10) {
                V9.d.this.p(e10, b6);
                I9.d.m(b6);
                if (cVarR != null) {
                    cVarR.v();
                }
            }
        }

        @Override // H9.InterfaceC1240f
        public void d(H9.InterfaceC1239e interfaceC1239e, java.io.IOException iOException) {
            p247y7.AbstractC7350t.f(interfaceC1239e, "call");
            p247y7.AbstractC7350t.f(iOException, "e");
            V9.d.this.p(iOException, null);
        }
    }

    public static final class g extends L9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ V9.d f15196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f15197f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(java.lang.String str, V9.d dVar, long j6) {
            super(str, false, 2, null);
            this.f15196e = dVar;
            this.f15197f = j6;
        }

        @Override // L9.a
        public long f() {
            this.f15196e.x();
            return this.f15197f;
        }
    }

    public static final class h extends L9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ V9.d f15198e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(java.lang.String str, boolean z6, V9.d dVar) {
            super(str, z6);
            this.f15198e = dVar;
        }

        @Override // L9.a
        public long f() {
            this.f15198e.cancel();
            return -1L;
        }
    }

    public d(L9.e eVar, H9.z zVar, H9.G g6, java.util.Random random, long j6, V9.e eVar2, long j10) {
        p247y7.AbstractC7350t.f(eVar, "taskRunner");
        p247y7.AbstractC7350t.f(zVar, "originalRequest");
        p247y7.AbstractC7350t.f(g6, "listener");
        p247y7.AbstractC7350t.f(random, "random");
        this.f15160a = zVar;
        this.f15161b = g6;
        this.f15162c = random;
        this.f15163d = j6;
        this.f15164e = eVar2;
        this.f15165f = j10;
        this.f15171l = eVar.i();
        this.f15174o = new java.util.ArrayDeque();
        this.f15175p = new java.util.ArrayDeque();
        this.f15178s = -1;
        if (!p247y7.AbstractC7350t.b("GET", zVar.g())) {
            throw new java.lang.IllegalArgumentException(("Request must be GET: " + zVar.g()).toString());
        }
        X9.C1839g.a aVar = X9.C1839g.f16149F;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        p087i7.M m6 = p087i7.M.f46721a;
        this.f15166g = X9.C1839g.a.e(aVar, bArr, 0, 0, 3, null).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s(V9.e eVar) {
        if (!eVar.f15205f && eVar.f15201b == null) {
            return eVar.f15203d == null || new E7.i(8, 15).D(eVar.f15203d.intValue());
        }
        return false;
    }

    private final void u() {
        if (!I9.d.f5554h || java.lang.Thread.holdsLock(this)) {
            L9.a aVar = this.f15168i;
            if (aVar != null) {
                L9.d.j(this.f15171l, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final synchronized boolean v(X9.C1839g c1839g, int i6) {
        if (!this.f15180u && !this.f15177r) {
            if (this.f15176q + ((long) c1839g.I()) > 16777216) {
                f(1001, null);
                return false;
            }
            this.f15176q += (long) c1839g.I();
            this.f15175p.add(new V9.d.c(i6, c1839g));
            u();
            return true;
        }
        return false;
    }

    @Override // V9.g.a
    public void a(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "bytes");
        this.f15161b.d(this, c1839g);
    }

    @Override // H9.F
    public boolean b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "text");
        return v(X9.C1839g.f16149F.c(str), 1);
    }

    @Override // H9.F
    public boolean c(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "bytes");
        return v(c1839g, 2);
    }

    @Override // H9.F
    public void cancel() {
        H9.InterfaceC1239e interfaceC1239e = this.f15167h;
        p247y7.AbstractC7350t.c(interfaceC1239e);
        interfaceC1239e.cancel();
    }

    @Override // V9.g.a
    public synchronized void d(X9.C1839g c1839g) {
        try {
            p247y7.AbstractC7350t.f(c1839g, "payload");
            if (!this.f15180u && (!this.f15177r || !this.f15175p.isEmpty())) {
                this.f15174o.add(c1839g);
                u();
                this.f15182w++;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // V9.g.a
    public void e(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "text");
        this.f15161b.e(this, str);
    }

    @Override // H9.F
    public boolean f(int i6, java.lang.String str) {
        return n(i6, str, 60000L);
    }

    @Override // V9.g.a
    public synchronized void g(X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(c1839g, "payload");
        this.f15183x++;
        this.f15184y = false;
    }

    @Override // V9.g.a
    public void h(int i6, java.lang.String str) {
        V9.d.AbstractC0291d abstractC0291d;
        V9.g gVar;
        V9.h hVar;
        p247y7.AbstractC7350t.f(str, "reason");
        if (i6 == -1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            try {
                if (this.f15178s != -1) {
                    throw new java.lang.IllegalStateException("already closed".toString());
                }
                this.f15178s = i6;
                this.f15179t = str;
                abstractC0291d = null;
                if (this.f15177r && this.f15175p.isEmpty()) {
                    V9.d.AbstractC0291d abstractC0291d2 = this.f15173n;
                    this.f15173n = null;
                    gVar = this.f15169j;
                    this.f15169j = null;
                    hVar = this.f15170k;
                    this.f15170k = null;
                    this.f15171l.n();
                    abstractC0291d = abstractC0291d2;
                } else {
                    gVar = null;
                    hVar = null;
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        try {
            this.f15161b.b(this, i6, str);
            if (abstractC0291d != null) {
                this.f15161b.a(this, i6, str);
            }
        } finally {
            if (abstractC0291d != null) {
                I9.d.m(abstractC0291d);
            }
            if (gVar != null) {
                I9.d.m(gVar);
            }
            if (hVar != null) {
                I9.d.m(hVar);
            }
        }
    }

    public final void m(H9.B b6, M9.c cVar) throws java.net.ProtocolException {
        p247y7.AbstractC7350t.f(b6, "response");
        if (b6.o() != 101) {
            throw new java.net.ProtocolException("Expected HTTP 101 response but was '" + b6.o() + ' ' + b6.R() + '\'');
        }
        java.lang.String strD = H9.B.D(b6, "Connection", null, 2, null);
        if (!S8.r.K("Upgrade", strD, true)) {
            throw new java.net.ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strD + '\'');
        }
        java.lang.String strD2 = H9.B.D(b6, "Upgrade", null, 2, null);
        if (!S8.r.K("websocket", strD2, true)) {
            throw new java.net.ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strD2 + '\'');
        }
        java.lang.String strD3 = H9.B.D(b6, "Sec-WebSocket-Accept", null, 2, null);
        java.lang.String strE = X9.C1839g.f16149F.c(this.f15166g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").G().e();
        if (p247y7.AbstractC7350t.b(strE, strD3)) {
            if (cVar == null) {
                throw new java.net.ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new java.net.ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strE + "' but was '" + strD3 + '\'');
    }

    public final synchronized boolean n(int i6, java.lang.String str, long j6) {
        X9.C1839g c1839gC;
        try {
            V9.f.f15206a.c(i6);
            if (str != null) {
                c1839gC = X9.C1839g.f16149F.c(str);
                if (c1839gC.I() > 123) {
                    throw new java.lang.IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                c1839gC = null;
            }
            if (!this.f15180u && !this.f15177r) {
                this.f15177r = true;
                this.f15175p.add(new V9.d.a(i6, c1839gC, j6));
                u();
                return true;
            }
            return false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final void o(H9.x xVar) {
        p247y7.AbstractC7350t.f(xVar, "client");
        if (this.f15160a.d("Sec-WebSocket-Extensions") != null) {
            p(new java.net.ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        H9.x xVarA = xVar.C().d(H9.r.f4799b).K(f15158A).a();
        H9.z zVarB = this.f15160a.h().c("Upgrade", "websocket").c("Connection", "Upgrade").c("Sec-WebSocket-Key", this.f15166g).c("Sec-WebSocket-Version", "13").c("Sec-WebSocket-Extensions", "permessage-deflate").b();
        M9.e eVar = new M9.e(xVarA, zVarB, true);
        this.f15167h = eVar;
        p247y7.AbstractC7350t.c(eVar);
        eVar.N(new V9.d.f(zVarB));
    }

    public final void p(java.lang.Exception exc, H9.B b6) {
        p247y7.AbstractC7350t.f(exc, "e");
        synchronized (this) {
            if (this.f15180u) {
                return;
            }
            this.f15180u = true;
            V9.d.AbstractC0291d abstractC0291d = this.f15173n;
            this.f15173n = null;
            V9.g gVar = this.f15169j;
            this.f15169j = null;
            V9.h hVar = this.f15170k;
            this.f15170k = null;
            this.f15171l.n();
            p087i7.M m6 = p087i7.M.f46721a;
            try {
                this.f15161b.c(this, exc, b6);
            } finally {
                if (abstractC0291d != null) {
                    I9.d.m(abstractC0291d);
                }
                if (gVar != null) {
                    I9.d.m(gVar);
                }
                if (hVar != null) {
                    I9.d.m(hVar);
                }
            }
        }
    }

    public final H9.G q() {
        return this.f15161b;
    }

    public final void r(java.lang.String str, V9.d.AbstractC0291d abstractC0291d) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(abstractC0291d, "streams");
        V9.e eVar = this.f15164e;
        p247y7.AbstractC7350t.c(eVar);
        synchronized (this) {
            try {
                this.f15172m = str;
                this.f15173n = abstractC0291d;
                this.f15170k = new V9.h(abstractC0291d.a(), abstractC0291d.f(), this.f15162c, eVar.f15200a, eVar.a(abstractC0291d.a()), this.f15165f);
                this.f15168i = new V9.d.e();
                long j6 = this.f15163d;
                if (j6 != 0) {
                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j6);
                    this.f15171l.i(new V9.d.g(str + " ping", this, nanos), nanos);
                }
                if (!this.f15175p.isEmpty()) {
                    u();
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.f15169j = new V9.g(abstractC0291d.a(), abstractC0291d.g(), this, eVar.f15200a, eVar.a(!abstractC0291d.a()));
    }

    public final void t() {
        while (this.f15178s == -1) {
            V9.g gVar = this.f15169j;
            p247y7.AbstractC7350t.c(gVar);
            gVar.a();
        }
    }

    public final boolean w() {
        java.lang.String str;
        V9.g gVar;
        V9.h hVar;
        int i6;
        V9.d.AbstractC0291d abstractC0291d;
        synchronized (this) {
            try {
                if (this.f15180u) {
                    return false;
                }
                V9.h hVar2 = this.f15170k;
                java.lang.Object objPoll = this.f15174o.poll();
                java.lang.Object obj = null;
                if (objPoll == null) {
                    java.lang.Object objPoll2 = this.f15175p.poll();
                    if (objPoll2 instanceof V9.d.a) {
                        i6 = this.f15178s;
                        str = this.f15179t;
                        if (i6 != -1) {
                            abstractC0291d = this.f15173n;
                            this.f15173n = null;
                            gVar = this.f15169j;
                            this.f15169j = null;
                            hVar = this.f15170k;
                            this.f15170k = null;
                            this.f15171l.n();
                        } else {
                            long jA = ((V9.d.a) objPoll2).a();
                            this.f15171l.i(new V9.d.h(this.f15172m + " cancel", true, this), java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(jA));
                            abstractC0291d = null;
                            gVar = null;
                            hVar = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        gVar = null;
                        hVar = null;
                        i6 = -1;
                        abstractC0291d = null;
                    }
                    obj = objPoll2;
                } else {
                    str = null;
                    gVar = null;
                    hVar = null;
                    i6 = -1;
                    abstractC0291d = null;
                }
                p087i7.M m6 = p087i7.M.f46721a;
                try {
                    if (objPoll != null) {
                        p247y7.AbstractC7350t.c(hVar2);
                        hVar2.o((X9.C1839g) objPoll);
                    } else if (obj instanceof V9.d.c) {
                        V9.d.c cVar = (V9.d.c) obj;
                        p247y7.AbstractC7350t.c(hVar2);
                        hVar2.g(cVar.b(), cVar.a());
                        synchronized (this) {
                            this.f15176q -= (long) cVar.a().I();
                        }
                    } else {
                        if (!(obj instanceof V9.d.a)) {
                            throw new java.lang.AssertionError();
                        }
                        V9.d.a aVar = (V9.d.a) obj;
                        p247y7.AbstractC7350t.c(hVar2);
                        hVar2.a(aVar.b(), aVar.c());
                        if (abstractC0291d != null) {
                            H9.G g6 = this.f15161b;
                            p247y7.AbstractC7350t.c(str);
                            g6.a(this, i6, str);
                        }
                    }
                    if (abstractC0291d != null) {
                        I9.d.m(abstractC0291d);
                    }
                    if (gVar != null) {
                        I9.d.m(gVar);
                    }
                    if (hVar != null) {
                        I9.d.m(hVar);
                    }
                    return true;
                } catch (java.lang.Throwable th) {
                    if (abstractC0291d != null) {
                        I9.d.m(abstractC0291d);
                    }
                    if (gVar != null) {
                        I9.d.m(gVar);
                    }
                    if (hVar != null) {
                        I9.d.m(hVar);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        synchronized (this) {
            try {
                if (this.f15180u) {
                    return;
                }
                V9.h hVar = this.f15170k;
                if (hVar == null) {
                    return;
                }
                int i6 = this.f15184y ? this.f15181v : -1;
                this.f15181v++;
                this.f15184y = true;
                p087i7.M m6 = p087i7.M.f46721a;
                if (i6 == -1) {
                    try {
                        hVar.i(X9.C1839g.f16150G);
                        return;
                    } catch (java.io.IOException e6) {
                        p(e6, null);
                        return;
                    }
                }
                p(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + this.f15163d + "ms (after " + (i6 - 1) + " successful ping/pongs)"), null);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
