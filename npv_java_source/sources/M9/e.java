package M9;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements H9.InterfaceC1239e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final H9.x f7214C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final H9.z f7215D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f7216E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final M9.g f7217F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final H9.r f7218G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final M9.e.c f7219H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f7220I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.lang.Object f7221J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private M9.d f7222K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private M9.f f7223L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f7224M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private M9.c f7225N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f7226O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f7227P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f7228Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private volatile boolean f7229R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private volatile M9.c f7230S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private volatile M9.f f7231T;

    public final class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final H9.InterfaceC1240f f7232C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private volatile java.util.concurrent.atomic.AtomicInteger f7233D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ M9.e f7234E;

        public a(M9.e eVar, H9.InterfaceC1240f interfaceC1240f) {
            p247y7.AbstractC7350t.f(interfaceC1240f, "responseCallback");
            this.f7234E = eVar;
            this.f7232C = interfaceC1240f;
            this.f7233D = new java.util.concurrent.atomic.AtomicInteger(0);
        }

        public final void a(java.util.concurrent.ExecutorService executorService) {
            p247y7.AbstractC7350t.f(executorService, "executorService");
            H9.p pVarR = this.f7234E.m().r();
            if (I9.d.f5554h && java.lang.Thread.holdsLock(pVarR)) {
                throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + pVarR);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (java.util.concurrent.RejectedExecutionException e6) {
                    java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e6);
                    this.f7234E.x(interruptedIOException);
                    this.f7232C.d(this.f7234E, interruptedIOException);
                    this.f7234E.m().r().e(this);
                }
            } catch (java.lang.Throwable th) {
                this.f7234E.m().r().e(this);
                throw th;
            }
        }

        public final M9.e b() {
            return this.f7234E;
        }

        public final java.util.concurrent.atomic.AtomicInteger c() {
            return this.f7233D;
        }

        public final java.lang.String d() {
            return this.f7234E.t().i().h();
        }

        public final void e(M9.e.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "other");
            this.f7233D = aVar.f7233D;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            java.lang.Throwable th;
            java.io.IOException e6;
            H9.p pVarR;
            java.lang.String str = "OkHttp " + this.f7234E.y();
            M9.e eVar = this.f7234E;
            java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
            java.lang.String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                eVar.f7219H.v();
                try {
                    try {
                        z6 = true;
                        try {
                            this.f7232C.c(eVar, eVar.u());
                            pVarR = eVar.m().r();
                        } catch (java.io.IOException e10) {
                            e6 = e10;
                            if (z6) {
                                Q9.k.f9149a.g().j("Callback failure for " + eVar.F(), 4, e6);
                            } else {
                                this.f7232C.d(eVar, e6);
                            }
                            pVarR = eVar.m().r();
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            eVar.cancel();
                            if (!z6) {
                                java.io.IOException iOException = new java.io.IOException("canceled due to " + th);
                                p087i7.AbstractC6661g.a(iOException, th);
                                this.f7232C.d(eVar, iOException);
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        eVar.m().r().e(this);
                        throw th3;
                    }
                } catch (java.io.IOException e11) {
                    z6 = false;
                    e6 = e11;
                } catch (java.lang.Throwable th4) {
                    z6 = false;
                    th = th4;
                }
                pVarR.e(this);
                threadCurrentThread.setName(name);
            } catch (java.lang.Throwable th5) {
                threadCurrentThread.setName(name);
                throw th5;
            }
        }
    }

    public static final class b extends java.lang.ref.WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f7235a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(M9.e eVar, java.lang.Object obj) {
            super(eVar);
            p247y7.AbstractC7350t.f(eVar, "referent");
            this.f7235a = obj;
        }

        public final java.lang.Object a() {
            return this.f7235a;
        }
    }

    public static final class c extends X9.C1835c {
        c() {
        }

        @Override // X9.C1835c
        protected void B() {
            M9.e.this.cancel();
        }
    }

    public e(H9.x xVar, H9.z zVar, boolean z6) {
        p247y7.AbstractC7350t.f(xVar, "client");
        p247y7.AbstractC7350t.f(zVar, "originalRequest");
        this.f7214C = xVar;
        this.f7215D = zVar;
        this.f7216E = z6;
        this.f7217F = xVar.n().b();
        this.f7218G = xVar.u().a(this);
        M9.e.c cVar = new M9.e.c();
        cVar.g(xVar.j(), java.util.concurrent.TimeUnit.MILLISECONDS);
        this.f7219H = cVar;
        this.f7220I = new java.util.concurrent.atomic.AtomicBoolean();
        this.f7228Q = true;
    }

    private final java.io.IOException E(java.io.IOException iOException) {
        if (this.f7224M || !this.f7219H.w()) {
            return iOException;
        }
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String F() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(D() ? "canceled " : "");
        sb.append(this.f7216E ? "web socket" : "call");
        sb.append(" to ");
        sb.append(y());
        return sb.toString();
    }

    private final java.io.IOException d(java.io.IOException iOException) {
        java.net.Socket socketZ;
        boolean z6 = I9.d.f5554h;
        if (z6 && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        M9.f fVar = this.f7223L;
        if (fVar != null) {
            if (z6 && java.lang.Thread.holdsLock(fVar)) {
                throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                socketZ = z();
            }
            if (this.f7223L == null) {
                if (socketZ != null) {
                    I9.d.n(socketZ);
                }
                this.f7218G.k(this, fVar);
            } else if (socketZ != null) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
        }
        java.io.IOException iOExceptionE = E(iOException);
        if (iOException != null) {
            H9.r rVar = this.f7218G;
            p247y7.AbstractC7350t.c(iOExceptionE);
            rVar.d(this, iOExceptionE);
        } else {
            this.f7218G.c(this);
        }
        return iOExceptionE;
    }

    private final void e() {
        this.f7221J = Q9.k.f9149a.g().h("response.body().close()");
        this.f7218G.e(this);
    }

    private final H9.C1235a j(H9.u uVar) {
        javax.net.ssl.SSLSocketFactory sSLSocketFactoryO;
        javax.net.ssl.HostnameVerifier hostnameVerifierY;
        H9.C1241g c1241gL;
        if (uVar.i()) {
            sSLSocketFactoryO = this.f7214C.O();
            hostnameVerifierY = this.f7214C.y();
            c1241gL = this.f7214C.l();
        } else {
            sSLSocketFactoryO = null;
            hostnameVerifierY = null;
            c1241gL = null;
        }
        return new H9.C1235a(uVar.h(), uVar.l(), this.f7214C.t(), this.f7214C.M(), sSLSocketFactoryO, hostnameVerifierY, c1241gL, this.f7214C.I(), this.f7214C.H(), this.f7214C.G(), this.f7214C.p(), this.f7214C.J());
    }

    public final boolean A() {
        M9.d dVar = this.f7222K;
        p247y7.AbstractC7350t.c(dVar);
        return dVar.e();
    }

    public final void B(M9.f fVar) {
        this.f7231T = fVar;
    }

    public final void C() {
        if (!(!this.f7224M)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f7224M = true;
        this.f7219H.w();
    }

    @Override // H9.InterfaceC1239e
    public boolean D() {
        return this.f7229R;
    }

    @Override // H9.InterfaceC1239e
    public void N(H9.InterfaceC1240f interfaceC1240f) {
        p247y7.AbstractC7350t.f(interfaceC1240f, "responseCallback");
        if (!this.f7220I.compareAndSet(false, true)) {
            throw new java.lang.IllegalStateException("Already Executed".toString());
        }
        e();
        this.f7214C.r().a(new M9.e.a(this, interfaceC1240f));
    }

    public final void c(M9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "connection");
        if (!I9.d.f5554h || java.lang.Thread.holdsLock(fVar)) {
            if (this.f7223L != null) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            this.f7223L = fVar;
            fVar.n().add(new M9.e.b(this, this.f7221J));
            return;
        }
        throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    @Override // H9.InterfaceC1239e
    public void cancel() {
        if (this.f7229R) {
            return;
        }
        this.f7229R = true;
        M9.c cVar = this.f7230S;
        if (cVar != null) {
            cVar.b();
        }
        M9.f fVar = this.f7231T;
        if (fVar != null) {
            fVar.d();
        }
        this.f7218G.f(this);
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public M9.e clone() {
        return new M9.e(this.f7214C, this.f7215D, this.f7216E);
    }

    public final void k(H9.z zVar, boolean z6) {
        p247y7.AbstractC7350t.f(zVar, "request");
        if (this.f7225N != null) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f7227P)) {
                throw new java.lang.IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f7226O)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p087i7.M m6 = p087i7.M.f46721a;
        }
        if (z6) {
            this.f7222K = new M9.d(this.f7217F, j(zVar.i()), this, this.f7218G);
        }
    }

    public final void l(boolean z6) {
        M9.c cVar;
        synchronized (this) {
            if (!this.f7228Q) {
                throw new java.lang.IllegalStateException("released".toString());
            }
            p087i7.M m6 = p087i7.M.f46721a;
        }
        if (z6 && (cVar = this.f7230S) != null) {
            cVar.d();
        }
        this.f7225N = null;
    }

    public final H9.x m() {
        return this.f7214C;
    }

    public final M9.f n() {
        return this.f7223L;
    }

    public final H9.r p() {
        return this.f7218G;
    }

    public final boolean q() {
        return this.f7216E;
    }

    public final M9.c r() {
        return this.f7225N;
    }

    public final H9.z t() {
        return this.f7215D;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    public final H9.B u() throws java.lang.Throwable {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p097j7.AbstractC6879v.C(arrayList, this.f7214C.z());
        arrayList.add(new N9.j(this.f7214C));
        arrayList.add(new N9.a(this.f7214C.q()));
        this.f7214C.h();
        arrayList.add(new K9.a(null));
        arrayList.add(M9.a.f7181a);
        if (!this.f7216E) {
            p097j7.AbstractC6879v.C(arrayList, this.f7214C.B());
        }
        arrayList.add(new N9.b(this.f7216E));
        boolean z6 = false;
        try {
            H9.B bA = new N9.g(this, arrayList, 0, null, this.f7215D, this.f7214C.m(), this.f7214C.K(), this.f7214C.Q()).a(this.f7215D);
            if (D()) {
                I9.d.m(bA);
                throw new java.io.IOException("Canceled");
            }
            x(null);
            return bA;
        } catch (java.io.IOException e6) {
            try {
                java.io.IOException iOExceptionX = x(e6);
                p247y7.AbstractC7350t.d(iOExceptionX, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionX;
            } catch (java.lang.Throwable th) {
                th = th;
                z6 = true;
                if (!z6) {
                    x(null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (!z6) {
                x(null);
            }
            throw th;
        }
    }

    public final M9.c v(N9.g gVar) throws java.io.IOException {
        p247y7.AbstractC7350t.f(gVar, "chain");
        synchronized (this) {
            if (!this.f7228Q) {
                throw new java.lang.IllegalStateException("released".toString());
            }
            if (!(!this.f7227P)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f7226O)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p087i7.M m6 = p087i7.M.f46721a;
        }
        M9.d dVar = this.f7222K;
        p247y7.AbstractC7350t.c(dVar);
        M9.c cVar = new M9.c(this, this.f7218G, dVar, dVar.a(this.f7214C, gVar));
        this.f7225N = cVar;
        this.f7230S = cVar;
        synchronized (this) {
            this.f7226O = true;
            this.f7227P = true;
        }
        if (this.f7229R) {
            throw new java.io.IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final java.io.IOException w(M9.c cVar, boolean z6, boolean z10, java.io.IOException iOException) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        p247y7.AbstractC7350t.f(cVar, "exchange");
        if (!p247y7.AbstractC7350t.b(cVar, this.f7230S)) {
            return iOException;
        }
        synchronized (this) {
            z11 = false;
            if (z6) {
                try {
                    if (this.f7226O) {
                        if (z6) {
                            this.f7226O = false;
                        }
                        if (z10) {
                            this.f7227P = false;
                        }
                        z13 = this.f7226O;
                        if (z13) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (!z13) {
                            z11 = true;
                        }
                        z12 = z11;
                        z11 = z14;
                    } else if (z10 || !this.f7227P) {
                        z12 = false;
                    } else {
                        if (z6) {
                            this.f7226O = false;
                        }
                        if (z10) {
                            this.f7227P = false;
                        }
                        z13 = this.f7226O;
                        if (z13 || this.f7227P) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (!z13 && !this.f7227P && !this.f7228Q) {
                            z11 = true;
                        }
                        z12 = z11;
                        z11 = z14;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            } else {
                if (z10) {
                }
                z12 = false;
            }
            p087i7.M m6 = p087i7.M.f46721a;
        }
        if (z11) {
            this.f7230S = null;
            M9.f fVar = this.f7223L;
            if (fVar != null) {
                fVar.s();
            }
        }
        return z12 ? d(iOException) : iOException;
    }

    public final java.io.IOException x(java.io.IOException iOException) {
        boolean z6;
        synchronized (this) {
            try {
                z6 = false;
                if (this.f7228Q) {
                    this.f7228Q = false;
                    if (!this.f7226O && !this.f7227P) {
                        z6 = true;
                    }
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6 ? d(iOException) : iOException;
    }

    public final java.lang.String y() {
        return this.f7215D.i().n();
    }

    public final java.net.Socket z() {
        M9.f fVar = this.f7223L;
        p247y7.AbstractC7350t.c(fVar);
        if (I9.d.f5554h && !java.lang.Thread.holdsLock(fVar)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        java.util.List listN = fVar.n();
        java.util.Iterator it = listN.iterator();
        int i6 = 0;
        while (true) {
            if (!it.hasNext()) {
                i6 = -1;
                break;
            }
            if (p247y7.AbstractC7350t.b(((java.lang.ref.Reference) it.next()).get(), this)) {
                break;
            }
            i6++;
        }
        if (i6 == -1) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        listN.remove(i6);
        this.f7223L = null;
        if (listN.isEmpty()) {
            fVar.C(java.lang.System.nanoTime());
            if (this.f7217F.c(fVar)) {
                return fVar.E();
            }
        }
        return null;
    }
}
