package p191t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p141o0.N1 f54558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p141o0.AbstractC7019z0 f54560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f54561d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Y0.v f54562e = Y0.v.Ltr;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p237x7.l f54563f = new t0.b.a();

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(p161q0.g gVar) {
            p191t0.b.this.j(gVar);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.g) obj);
            return p087i7.M.f46721a;
        }
    }

    private final void d(float f6) {
        boolean z6;
        if (this.f54561d == f6) {
            return;
        }
        if (!a(f6)) {
            if (f6 == 1.0f) {
                p141o0.N1 n6 = this.f54558a;
                if (n6 != null) {
                    n6.b(f6);
                }
                z6 = false;
            } else {
                i().b(f6);
                z6 = true;
            }
            this.f54559b = z6;
        }
        this.f54561d = f6;
    }

    private final void e(p141o0.AbstractC7019z0 abstractC7019z0) {
        boolean z6;
        if (p247y7.AbstractC7350t.b(this.f54560c, abstractC7019z0)) {
            return;
        }
        if (!b(abstractC7019z0)) {
            if (abstractC7019z0 == null) {
                p141o0.N1 n6 = this.f54558a;
                if (n6 != null) {
                    n6.A(null);
                }
                z6 = false;
            } else {
                i().A(abstractC7019z0);
                z6 = true;
            }
            this.f54559b = z6;
        }
        this.f54560c = abstractC7019z0;
    }

    private final void f(Y0.v vVar) {
        if (this.f54562e != vVar) {
            c(vVar);
            this.f54562e = vVar;
        }
    }

    private final p141o0.N1 i() {
        p141o0.N1 n6 = this.f54558a;
        if (n6 != null) {
            return n6;
        }
        p141o0.N1 n1A = p141o0.U.a();
        this.f54558a = n1A;
        return n1A;
    }

    protected abstract boolean a(float f6);

    protected abstract boolean b(p141o0.AbstractC7019z0 abstractC7019z0);

    protected boolean c(Y0.v vVar) {
        return false;
    }

    public final void g(p161q0.g gVar, long j6, float f6, p141o0.AbstractC7019z0 abstractC7019z0) {
        d(f6);
        e(abstractC7019z0);
        f(gVar.getLayoutDirection());
        float fI = p131n0.m.i(gVar.i()) - p131n0.m.i(j6);
        float fG = p131n0.m.g(gVar.i()) - p131n0.m.g(j6);
        gVar.F0().c().f(0.0f, 0.0f, fI, fG);
        if (f6 > 0.0f) {
            try {
                if (p131n0.m.i(j6) > 0.0f && p131n0.m.g(j6) > 0.0f) {
                    if (this.f54559b) {
                        p131n0.i iVarB = p131n0.j.b(p131n0.g.f51312b.c(), p131n0.n.a(p131n0.m.i(j6), p131n0.m.g(j6)));
                        p141o0.InterfaceC6993q0 interfaceC6993q0H = gVar.F0().h();
                        try {
                            interfaceC6993q0H.u(iVarB, i());
                            j(gVar);
                            interfaceC6993q0H.s();
                        } catch (java.lang.Throwable th) {
                            interfaceC6993q0H.s();
                            throw th;
                        }
                    } else {
                        j(gVar);
                    }
                }
            } catch (java.lang.Throwable th2) {
                gVar.F0().c().f(-0.0f, -0.0f, -fI, -fG);
                throw th2;
            }
        }
        gVar.F0().c().f(-0.0f, -0.0f, -fI, -fG);
    }

    public abstract long h();

    protected abstract void j(p161q0.g gVar);
}
