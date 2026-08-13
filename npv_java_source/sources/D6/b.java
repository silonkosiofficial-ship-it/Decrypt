package D6;

/* JADX INFO: loaded from: classes3.dex */
public class b implements W8.N {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final D6.b.a f1917G = new D6.b.a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f1918H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final W6.C1767a f1919I;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final C6.c f1920C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected O6.b f1921D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected Q6.c f1922E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f1923F;
    private volatile /* synthetic */ int received;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: D6.b$b, reason: collision with other inner class name */
    static final class C0043b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f1924F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f1925G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f1926H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f1928J;

        C0043b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f1926H = obj;
            this.f1928J |= Integer.MIN_VALUE;
            return D6.b.this.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        F7.o oVarP = null;
        F7.c cVarB = p247y7.P.b(java.lang.Object.class);
        try {
            oVarP = p247y7.P.p(java.lang.Object.class);
        } catch (java.lang.Throwable unused) {
        }
        f1919I = new W6.C1767a("CustomResponse", new p017b7.a(cVarB, oVarP));
        f1918H = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(D6.b.class, "received");
    }

    public b(C6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "client");
        this.f1920C = cVar;
        this.received = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(C6.c cVar, O6.e eVar, O6.h hVar) {
        this(cVar);
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(eVar, "requestData");
        p247y7.AbstractC7350t.f(hVar, "responseData");
        h(new O6.a(this, eVar));
        i(new Q6.a(this, hVar));
        if (hVar.a() instanceof io.ktor.utils.io.d) {
            return;
        }
        x0().f(f1919I, hVar.a());
    }

    static /* synthetic */ java.lang.Object g(D6.b bVar, p127m7.e eVar) {
        return bVar.e().b();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(p017b7.a aVar, p127m7.e eVar) throws java.lang.Throwable {
        D6.b.C0043b c0043b;
        D6.b bVar;
        D6.b bVar2;
        java.lang.Object objC;
        if (eVar instanceof D6.b.C0043b) {
            c0043b = (D6.b.C0043b) eVar;
            int i6 = c0043b.f1928J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0043b.f1928J = i6 - Integer.MIN_VALUE;
            } else {
                c0043b = new D6.b.C0043b(eVar);
            }
        } else {
            c0043b = new D6.b.C0043b(eVar);
        }
        java.lang.Object objC2 = c0043b.f1926H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = c0043b.f1928J;
        if (i10 == 0) {
            p087i7.x.b(objC2);
            try {
                if (p017b7.b.a(e(), aVar.a())) {
                    return e();
                }
                if (!b() && !I6.AbstractC1256l.f(e()) && !f1918H.compareAndSet(this, 0, 1)) {
                    throw new D6.a(this);
                }
                objC2 = x0().c(f1919I);
                if (objC2 == null) {
                    c0043b.f1924F = this;
                    c0043b.f1925G = aVar;
                    c0043b.f1928J = 1;
                    objC2 = f(c0043b);
                    if (objC2 == objG) {
                        return objG;
                    }
                }
                bVar2 = this;
            } catch (java.lang.Throwable th) {
                th = th;
                bVar = this;
                W8.O.c(bVar.e(), "Receive failed", th);
                throw th;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (p017b7.a) c0043b.f1925G;
                bVar = (D6.b) c0043b.f1924F;
                try {
                    p087i7.x.b(objC2);
                    objC = ((Q6.d) objC2).c();
                    if (!p247y7.AbstractC7350t.b(objC, U6.a.f14544a)) {
                        objC = null;
                    }
                    if (objC != null && !p017b7.b.a(objC, aVar.a())) {
                        throw new D6.c(bVar.e(), p247y7.P.b(objC.getClass()), aVar.a());
                    }
                    return objC;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    W8.O.c(bVar.e(), "Receive failed", th);
                    throw th;
                }
            }
            aVar = (p017b7.a) c0043b.f1925G;
            bVar2 = (D6.b) c0043b.f1924F;
            try {
                p087i7.x.b(objC2);
            } catch (java.lang.Throwable th3) {
                th = th3;
                bVar = bVar2;
                W8.O.c(bVar.e(), "Receive failed", th);
                throw th;
            }
        }
        Q6.d dVar = new Q6.d(aVar, objC2);
        Q6.f fVarH = bVar2.f1920C.H();
        c0043b.f1924F = bVar2;
        c0043b.f1925G = aVar;
        c0043b.f1928J = 2;
        objC2 = fVarH.d(bVar2, dVar, c0043b);
        if (objC2 == objG) {
            return objG;
        }
        bVar = bVar2;
        objC = ((Q6.d) objC2).c();
        if (!p247y7.AbstractC7350t.b(objC, U6.a.f14544a)) {
            objC = null;
        }
        if (objC != null) {
            throw new D6.c(bVar.e(), p247y7.P.b(objC.getClass()), aVar.a());
        }
        return objC;
    }

    protected boolean b() {
        return this.f1923F;
    }

    public final C6.c c() {
        return this.f1920C;
    }

    public final O6.b d() {
        O6.b bVar = this.f1921D;
        if (bVar != null) {
            return bVar;
        }
        p247y7.AbstractC7350t.p("request");
        return null;
    }

    public final Q6.c e() {
        Q6.c cVar = this.f1922E;
        if (cVar != null) {
            return cVar;
        }
        p247y7.AbstractC7350t.p("response");
        return null;
    }

    protected java.lang.Object f(p127m7.e eVar) {
        return g(this, eVar);
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return e().getCoroutineContext();
    }

    protected final void h(O6.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "<set-?>");
        this.f1921D = bVar;
    }

    protected final void i(Q6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<set-?>");
        this.f1922E = cVar;
    }

    public final void j(Q6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "response");
        i(cVar);
    }

    public java.lang.String toString() {
        return "HttpClientCall[" + d().r() + ", " + e().e() + ']';
    }

    public final W6.InterfaceC1768b x0() {
        return d().x0();
    }
}
