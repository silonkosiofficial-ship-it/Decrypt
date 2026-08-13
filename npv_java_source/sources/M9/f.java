package M9;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends P9.f.c implements H9.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final M9.f.a f7237t = new M9.f.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M9.g f7238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H9.D f7239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.net.Socket f7240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.net.Socket f7241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private H9.s f7242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private H9.y f7243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private P9.f f7244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private X9.InterfaceC1838f f7245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private X9.InterfaceC1837e f7246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f7251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f7252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final java.util.List f7253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f7254s;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7255a;

        static {
            int[] iArr = new int[java.net.Proxy.Type.values().length];
            try {
                iArr[java.net.Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[java.net.Proxy.Type.HTTP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f7255a = iArr;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ H9.C1241g f7256D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ H9.s f7257E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ H9.C1235a f7258F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(H9.C1241g c1241g, H9.s sVar, H9.C1235a c1235a) {
            super(0);
            this.f7256D = c1241g;
            this.f7257E = sVar;
            this.f7258F = c1235a;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            U9.c cVarD = this.f7256D.d();
            p247y7.AbstractC7350t.c(cVarD);
            return cVarD.a(this.f7257E.d(), this.f7258F.l().h());
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {
        d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            H9.s sVar = M9.f.this.f7242g;
            p247y7.AbstractC7350t.c(sVar);
            java.util.List<java.security.cert.Certificate> listD = sVar.d();
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listD, 10));
            for (java.security.cert.Certificate certificate : listD) {
                p247y7.AbstractC7350t.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((java.security.cert.X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public static final class e extends V9.d.AbstractC0291d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ M9.c f7260F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(X9.InterfaceC1838f interfaceC1838f, X9.InterfaceC1837e interfaceC1837e, M9.c cVar) {
            super(true, interfaceC1838f, interfaceC1837e);
            this.f7260F = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f7260F.a(-1L, true, true, null);
        }
    }

    public f(M9.g gVar, H9.D d6) {
        p247y7.AbstractC7350t.f(gVar, "connectionPool");
        p247y7.AbstractC7350t.f(d6, "route");
        this.f7238c = gVar;
        this.f7239d = d6;
        this.f7252q = 1;
        this.f7253r = new java.util.ArrayList();
        this.f7254s = Long.MAX_VALUE;
    }

    private final boolean B(java.util.List list) {
        java.util.List<H9.D> list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return false;
        }
        for (H9.D d6 : list2) {
            java.net.Proxy.Type type = d6.b().type();
            java.net.Proxy.Type type2 = java.net.Proxy.Type.DIRECT;
            if (type == type2 && this.f7239d.b().type() == type2 && p247y7.AbstractC7350t.b(this.f7239d.d(), d6.d())) {
                return true;
            }
        }
        return false;
    }

    private final void F(int i6) throws java.net.SocketException {
        java.net.Socket socket = this.f7241f;
        p247y7.AbstractC7350t.c(socket);
        X9.InterfaceC1838f interfaceC1838f = this.f7245j;
        p247y7.AbstractC7350t.c(interfaceC1838f);
        X9.InterfaceC1837e interfaceC1837e = this.f7246k;
        p247y7.AbstractC7350t.c(interfaceC1837e);
        socket.setSoTimeout(0);
        P9.f fVarA = new P9.f.a(true, L9.e.f6461i).q(socket, this.f7239d.a().l().h(), interfaceC1838f, interfaceC1837e).k(this).l(i6).a();
        this.f7244i = fVarA;
        this.f7252q = P9.f.f8553e0.a().d();
        P9.f.D1(fVarA, false, null, 3, null);
    }

    private final boolean G(H9.u uVar) {
        H9.s sVar;
        if (I9.d.f5554h && !java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        H9.u uVarL = this.f7239d.a().l();
        if (uVar.l() != uVarL.l()) {
            return false;
        }
        if (p247y7.AbstractC7350t.b(uVar.h(), uVarL.h())) {
            return true;
        }
        if (this.f7248m || (sVar = this.f7242g) == null) {
            return false;
        }
        p247y7.AbstractC7350t.c(sVar);
        return e(uVar, sVar);
    }

    private final boolean e(H9.u uVar, H9.s sVar) {
        java.util.List listD = sVar.d();
        if (!listD.isEmpty()) {
            U9.d dVar = U9.d.f14626a;
            java.lang.String strH = uVar.h();
            java.lang.Object obj = listD.get(0);
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(strH, (java.security.cert.X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    private final void h(int i6, int i10, H9.InterfaceC1239e interfaceC1239e, H9.r rVar) throws java.io.IOException {
        java.net.Socket socketCreateSocket;
        java.net.Proxy proxyB = this.f7239d.b();
        H9.C1235a c1235aA = this.f7239d.a();
        java.net.Proxy.Type type = proxyB.type();
        int i11 = type == null ? -1 : M9.f.b.f7255a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = c1235aA.j().createSocket();
            p247y7.AbstractC7350t.c(socketCreateSocket);
        } else {
            socketCreateSocket = new java.net.Socket(proxyB);
        }
        this.f7240e = socketCreateSocket;
        rVar.i(interfaceC1239e, this.f7239d.d(), proxyB);
        socketCreateSocket.setSoTimeout(i10);
        try {
            Q9.k.f9149a.g().f(socketCreateSocket, this.f7239d.d(), i6);
            try {
                this.f7245j = X9.K.b(X9.K.g(socketCreateSocket));
                this.f7246k = X9.K.a(X9.K.d(socketCreateSocket));
            } catch (java.lang.NullPointerException e6) {
                if (p247y7.AbstractC7350t.b(e6.getMessage(), "throw with null exception")) {
                    throw new java.io.IOException(e6);
                }
            }
        } catch (java.net.ConnectException e10) {
            java.net.ConnectException connectException = new java.net.ConnectException("Failed to connect to " + this.f7239d.d());
            connectException.initCause(e10);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void i(M9.b bVar) throws java.lang.Throwable {
        H9.C1235a c1235aA = this.f7239d.a();
        javax.net.ssl.SSLSocketFactory sSLSocketFactoryK = c1235aA.k();
        javax.net.ssl.SSLSocket sSLSocket = null;
        try {
            p247y7.AbstractC7350t.c(sSLSocketFactoryK);
            java.net.Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.f7240e, c1235aA.l().h(), c1235aA.l().l(), true);
            p247y7.AbstractC7350t.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            javax.net.ssl.SSLSocket sSLSocket2 = (javax.net.ssl.SSLSocket) socketCreateSocket;
            try {
                H9.l lVarA = bVar.a(sSLSocket2);
                if (lVarA.h()) {
                    Q9.k.f9149a.g().e(sSLSocket2, c1235aA.l().h(), c1235aA.f());
                }
                sSLSocket2.startHandshake();
                javax.net.ssl.SSLSession session = sSLSocket2.getSession();
                H9.s.a aVar = H9.s.f4800e;
                p247y7.AbstractC7350t.e(session, "sslSocketSession");
                H9.s sVarA = aVar.a(session);
                javax.net.ssl.HostnameVerifier hostnameVerifierE = c1235aA.e();
                p247y7.AbstractC7350t.c(hostnameVerifierE);
                if (hostnameVerifierE.verify(c1235aA.l().h(), session)) {
                    H9.C1241g c1241gA = c1235aA.a();
                    p247y7.AbstractC7350t.c(c1241gA);
                    this.f7242g = new H9.s(sVarA.e(), sVarA.a(), sVarA.c(), new M9.f.c(c1241gA, sVarA, c1235aA));
                    c1241gA.b(c1235aA.l().h(), new M9.f.d());
                    java.lang.String strG = lVarA.h() ? Q9.k.f9149a.g().g(sSLSocket2) : null;
                    this.f7241f = sSLSocket2;
                    this.f7245j = X9.K.b(X9.K.g(sSLSocket2));
                    this.f7246k = X9.K.a(X9.K.d(sSLSocket2));
                    this.f7243h = strG != null ? H9.y.f4899D.a(strG) : H9.y.HTTP_1_1;
                    Q9.k.f9149a.g().b(sSLSocket2);
                    return;
                }
                java.util.List listD = sVarA.d();
                if (!(!listD.isEmpty())) {
                    throw new javax.net.ssl.SSLPeerUnverifiedException("Hostname " + c1235aA.l().h() + " not verified (no certificates)");
                }
                java.lang.Object obj = listD.get(0);
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) obj;
                throw new javax.net.ssl.SSLPeerUnverifiedException(S8.r.q("\n              |Hostname " + c1235aA.l().h() + " not verified:\n              |    certificate: " + H9.C1241g.f4621c.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + U9.d.f14626a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (java.lang.Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Q9.k.f9149a.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    I9.d.n(sSLSocket);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private final void j(int i6, int i10, int i11, H9.InterfaceC1239e interfaceC1239e, H9.r rVar) throws java.io.IOException {
        H9.z zVarL = l();
        H9.u uVarI = zVarL.i();
        for (int i12 = 0; i12 < 21; i12++) {
            h(i6, i10, interfaceC1239e, rVar);
            zVarL = k(i10, i11, zVarL, uVarI);
            if (zVarL == null) {
                return;
            }
            java.net.Socket socket = this.f7240e;
            if (socket != null) {
                I9.d.n(socket);
            }
            this.f7240e = null;
            this.f7246k = null;
            this.f7245j = null;
            rVar.g(interfaceC1239e, this.f7239d.d(), this.f7239d.b(), null);
        }
    }

    private final H9.z k(int i6, int i10, H9.z zVar, H9.u uVar) throws java.io.IOException {
        java.lang.String str = "CONNECT " + I9.d.R(uVar, true) + " HTTP/1.1";
        while (true) {
            X9.InterfaceC1838f interfaceC1838f = this.f7245j;
            p247y7.AbstractC7350t.c(interfaceC1838f);
            X9.InterfaceC1837e interfaceC1837e = this.f7246k;
            p247y7.AbstractC7350t.c(interfaceC1837e);
            O9.b bVar = new O9.b(null, this, interfaceC1838f, interfaceC1837e);
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            interfaceC1838f.k().g(i6, timeUnit);
            interfaceC1837e.k().g(i10, timeUnit);
            bVar.A(zVar.e(), str);
            bVar.b();
            H9.B.a aVarD = bVar.d(false);
            p247y7.AbstractC7350t.c(aVarD);
            H9.B bC = aVarD.r(zVar).c();
            bVar.z(bC);
            int iO = bC.o();
            if (iO == 200) {
                if (interfaceC1838f.d().j() && interfaceC1837e.d().j()) {
                    return null;
                }
                throw new java.io.IOException("TLS tunnel buffered too many bytes!");
            }
            if (iO != 407) {
                throw new java.io.IOException("Unexpected response code for CONNECT: " + bC.o());
            }
            H9.z zVarA = this.f7239d.a().h().a(this.f7239d, bC);
            if (zVarA == null) {
                throw new java.io.IOException("Failed to authenticate with proxy");
            }
            if (S8.r.K("close", H9.B.D(bC, "Connection", null, 2, null), true)) {
                return zVarA;
            }
            zVar = zVarA;
        }
    }

    private final H9.z l() {
        H9.z zVarB = new H9.z.a().g(this.f7239d.a().l()).e("CONNECT", null).c("Host", I9.d.R(this.f7239d.a().l(), true)).c("Proxy-Connection", "Keep-Alive").c("User-Agent", "okhttp/4.12.0").b();
        H9.z zVarA = this.f7239d.a().h().a(this.f7239d, new H9.B.a().r(zVarB).p(H9.y.HTTP_1_1).g(407).m("Preemptive Authenticate").b(I9.d.f5549c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return zVarA == null ? zVarB : zVarA;
    }

    private final void m(M9.b bVar, int i6, H9.InterfaceC1239e interfaceC1239e, H9.r rVar) throws java.lang.Throwable {
        if (this.f7239d.a().k() != null) {
            rVar.B(interfaceC1239e);
            i(bVar);
            rVar.A(interfaceC1239e, this.f7242g);
            if (this.f7243h == H9.y.HTTP_2) {
                F(i6);
                return;
            }
            return;
        }
        java.util.List listF = this.f7239d.a().f();
        H9.y yVar = H9.y.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(yVar)) {
            this.f7241f = this.f7240e;
            this.f7243h = H9.y.HTTP_1_1;
        } else {
            this.f7241f = this.f7240e;
            this.f7243h = yVar;
            F(i6);
        }
    }

    public H9.D A() {
        return this.f7239d;
    }

    public final void C(long j6) {
        this.f7254s = j6;
    }

    public final void D(boolean z6) {
        this.f7247l = z6;
    }

    public java.net.Socket E() {
        java.net.Socket socket = this.f7241f;
        p247y7.AbstractC7350t.c(socket);
        return socket;
    }

    public final synchronized void H(M9.e eVar, java.io.IOException iOException) {
        int i6;
        try {
            p247y7.AbstractC7350t.f(eVar, "call");
            if (iOException instanceof P9.n) {
                if (((P9.n) iOException).f8700C == P9.b.REFUSED_STREAM) {
                    int i10 = this.f7251p + 1;
                    this.f7251p = i10;
                    if (i10 > 1) {
                        this.f7247l = true;
                        i6 = this.f7249n;
                        this.f7249n = i6 + 1;
                    }
                } else if (((P9.n) iOException).f8700C != P9.b.CANCEL || !eVar.D()) {
                    this.f7247l = true;
                    i6 = this.f7249n;
                    this.f7249n = i6 + 1;
                }
            } else if (!v() || (iOException instanceof P9.a)) {
                this.f7247l = true;
                if (this.f7250o == 0) {
                    if (iOException != null) {
                        g(eVar.m(), this.f7239d, iOException);
                    }
                    i6 = this.f7249n;
                    this.f7249n = i6 + 1;
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // P9.f.c
    public synchronized void a(P9.f fVar, P9.m mVar) {
        p247y7.AbstractC7350t.f(fVar, "connection");
        p247y7.AbstractC7350t.f(mVar, "settings");
        this.f7252q = mVar.d();
    }

    @Override // P9.f.c
    public void b(P9.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "stream");
        iVar.d(P9.b.REFUSED_STREAM, null);
    }

    public final void d() {
        java.net.Socket socket = this.f7240e;
        if (socket != null) {
            I9.d.n(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0141  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:64:0x0094->B:74:?, LOOP_END, SYNTHETIC] */
    public final void f(int i6, int i10, int i11, int i12, boolean z6, H9.InterfaceC1239e interfaceC1239e, H9.r rVar) throws java.lang.Throwable {
        java.net.Socket socket;
        java.net.Socket socket2;
        p247y7.AbstractC7350t.f(interfaceC1239e, "call");
        p247y7.AbstractC7350t.f(rVar, "eventListener");
        if (this.f7243h != null) {
            throw new java.lang.IllegalStateException("already connected".toString());
        }
        java.util.List listB = this.f7239d.a().b();
        M9.b bVar = new M9.b(listB);
        if (this.f7239d.a().k() == null) {
            if (!listB.contains(H9.l.f4761k)) {
                throw new M9.i(new java.net.UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            java.lang.String strH = this.f7239d.a().l().h();
            if (!Q9.k.f9149a.g().i(strH)) {
                throw new M9.i(new java.net.UnknownServiceException("CLEARTEXT communication to " + strH + " not permitted by network security policy"));
            }
        } else if (this.f7239d.a().f().contains(H9.y.H2_PRIOR_KNOWLEDGE)) {
            throw new M9.i(new java.net.UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        M9.i iVar = null;
        while (true) {
            try {
                if (this.f7239d.c()) {
                    j(i6, i10, i11, interfaceC1239e, rVar);
                    if (this.f7240e == null) {
                        break;
                    }
                } else {
                    try {
                        h(i6, i10, interfaceC1239e, rVar);
                    } catch (java.io.IOException e6) {
                        e = e6;
                        socket = this.f7241f;
                        if (socket != null) {
                            I9.d.n(socket);
                        }
                        socket2 = this.f7240e;
                        if (socket2 != null) {
                            I9.d.n(socket2);
                        }
                        this.f7241f = null;
                        this.f7240e = null;
                        this.f7245j = null;
                        this.f7246k = null;
                        this.f7242g = null;
                        this.f7243h = null;
                        this.f7244i = null;
                        this.f7252q = 1;
                        rVar.h(interfaceC1239e, this.f7239d.d(), this.f7239d.b(), null, e);
                        if (iVar == null) {
                            iVar = new M9.i(e);
                        } else {
                            iVar.a(e);
                        }
                        if (z6) {
                            throw iVar;
                        }
                        if (bVar.b(e)) {
                            throw iVar;
                        }
                    }
                }
                try {
                    m(bVar, i12, interfaceC1239e, rVar);
                    rVar.g(interfaceC1239e, this.f7239d.d(), this.f7239d.b(), this.f7243h);
                    break;
                } catch (java.io.IOException e10) {
                    e = e10;
                    socket = this.f7241f;
                    if (socket != null) {
                        I9.d.n(socket);
                    }
                    socket2 = this.f7240e;
                    if (socket2 != null) {
                        I9.d.n(socket2);
                    }
                    this.f7241f = null;
                    this.f7240e = null;
                    this.f7245j = null;
                    this.f7246k = null;
                    this.f7242g = null;
                    this.f7243h = null;
                    this.f7244i = null;
                    this.f7252q = 1;
                    rVar.h(interfaceC1239e, this.f7239d.d(), this.f7239d.b(), null, e);
                    if (iVar == null) {
                        iVar = new M9.i(e);
                    } else {
                        iVar.a(e);
                    }
                    if (z6) {
                        throw iVar;
                    }
                    if (bVar.b(e)) {
                        throw iVar;
                    }
                }
            } catch (java.io.IOException e11) {
                e = e11;
            }
        }
        if (this.f7239d.c() && this.f7240e == null) {
            throw new M9.i(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f7254s = java.lang.System.nanoTime();
    }

    public final void g(H9.x xVar, H9.D d6, java.io.IOException iOException) {
        p247y7.AbstractC7350t.f(xVar, "client");
        p247y7.AbstractC7350t.f(d6, "failedRoute");
        p247y7.AbstractC7350t.f(iOException, "failure");
        if (d6.b().type() != java.net.Proxy.Type.DIRECT) {
            H9.C1235a c1235aA = d6.a();
            c1235aA.i().connectFailed(c1235aA.l().q(), d6.b().address(), iOException);
        }
        xVar.x().b(d6);
    }

    public final java.util.List n() {
        return this.f7253r;
    }

    public final long o() {
        return this.f7254s;
    }

    public final boolean p() {
        return this.f7247l;
    }

    public final int q() {
        return this.f7249n;
    }

    public H9.s r() {
        return this.f7242g;
    }

    public final synchronized void s() {
        this.f7250o++;
    }

    public final boolean t(H9.C1235a c1235a, java.util.List list) {
        p247y7.AbstractC7350t.f(c1235a, "address");
        if (I9.d.f5554h && !java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f7253r.size() >= this.f7252q || this.f7247l || !this.f7239d.a().d(c1235a)) {
            return false;
        }
        if (p247y7.AbstractC7350t.b(c1235a.l().h(), A().a().l().h())) {
            return true;
        }
        if (this.f7244i == null || list == null || !B(list) || c1235a.e() != U9.d.f14626a || !G(c1235a.l())) {
            return false;
        }
        try {
            H9.C1241g c1241gA = c1235a.a();
            p247y7.AbstractC7350t.c(c1241gA);
            java.lang.String strH = c1235a.l().h();
            H9.s sVarR = r();
            p247y7.AbstractC7350t.c(sVarR);
            c1241gA.a(strH, sVarR.d());
            return true;
        } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public java.lang.String toString() {
        java.lang.Object objA;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Connection{");
        sb.append(this.f7239d.a().l().h());
        sb.append(':');
        sb.append(this.f7239d.a().l().l());
        sb.append(", proxy=");
        sb.append(this.f7239d.b());
        sb.append(" hostAddress=");
        sb.append(this.f7239d.d());
        sb.append(" cipherSuite=");
        H9.s sVar = this.f7242g;
        if (sVar == null || (objA = sVar.a()) == null) {
            objA = "none";
        }
        sb.append(objA);
        sb.append(" protocol=");
        sb.append(this.f7243h);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(boolean z6) {
        long j6;
        if (I9.d.f5554h && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = java.lang.System.nanoTime();
        java.net.Socket socket = this.f7240e;
        p247y7.AbstractC7350t.c(socket);
        java.net.Socket socket2 = this.f7241f;
        p247y7.AbstractC7350t.c(socket2);
        X9.InterfaceC1838f interfaceC1838f = this.f7245j;
        p247y7.AbstractC7350t.c(interfaceC1838f);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        P9.f fVar = this.f7244i;
        if (fVar != null) {
            return fVar.e1(jNanoTime);
        }
        synchronized (this) {
            j6 = jNanoTime - this.f7254s;
        }
        if (j6 < 10000000000L || !z6) {
            return true;
        }
        return I9.d.F(socket2, interfaceC1838f);
    }

    public final boolean v() {
        return this.f7244i != null;
    }

    public final N9.d w(H9.x xVar, N9.g gVar) throws java.net.SocketException {
        p247y7.AbstractC7350t.f(xVar, "client");
        p247y7.AbstractC7350t.f(gVar, "chain");
        java.net.Socket socket = this.f7241f;
        p247y7.AbstractC7350t.c(socket);
        X9.InterfaceC1838f interfaceC1838f = this.f7245j;
        p247y7.AbstractC7350t.c(interfaceC1838f);
        X9.InterfaceC1837e interfaceC1837e = this.f7246k;
        p247y7.AbstractC7350t.c(interfaceC1837e);
        P9.f fVar = this.f7244i;
        if (fVar != null) {
            return new P9.g(xVar, this, gVar, fVar);
        }
        socket.setSoTimeout(gVar.k());
        X9.a0 a0VarK = interfaceC1838f.k();
        long jH = gVar.h();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        a0VarK.g(jH, timeUnit);
        interfaceC1837e.k().g(gVar.j(), timeUnit);
        return new O9.b(xVar, this, interfaceC1838f, interfaceC1837e);
    }

    public final V9.d.AbstractC0291d x(M9.c cVar) throws java.net.SocketException {
        p247y7.AbstractC7350t.f(cVar, "exchange");
        java.net.Socket socket = this.f7241f;
        p247y7.AbstractC7350t.c(socket);
        X9.InterfaceC1838f interfaceC1838f = this.f7245j;
        p247y7.AbstractC7350t.c(interfaceC1838f);
        X9.InterfaceC1837e interfaceC1837e = this.f7246k;
        p247y7.AbstractC7350t.c(interfaceC1837e);
        socket.setSoTimeout(0);
        z();
        return new M9.f.e(interfaceC1838f, interfaceC1837e, cVar);
    }

    public final synchronized void y() {
        this.f7248m = true;
    }

    public final synchronized void z() {
        this.f7247l = true;
    }
}
