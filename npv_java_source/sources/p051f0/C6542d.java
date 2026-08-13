package p051f0;

/* JADX INFO: renamed from: f0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6542d extends p051f0.C6541c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p051f0.C6541c f44812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f44813t;

    public C6542d(int i6, p051f0.n nVar, p237x7.l lVar, p237x7.l lVar2, p051f0.C6541c c6541c) {
        super(i6, nVar, lVar, lVar2);
        this.f44812s = c6541c;
        c6541c.m(this);
    }

    private final void T() {
        if (this.f44813t) {
            return;
        }
        this.f44813t = true;
        this.f44812s.n(this);
    }

    @Override // p051f0.C6541c
    public p051f0.l C() {
        java.util.Map mapR;
        if (this.f44812s.D() || this.f44812s.e()) {
            return new f0.l.a(this);
        }
        p170r.L lE = E();
        int iF = f();
        if (lE != null) {
            p051f0.C6541c c6541c = this.f44812s;
            mapR = p051f0.p.R(c6541c, this, c6541c.g());
        } else {
            mapR = null;
        }
        synchronized (p051f0.p.I()) {
            try {
                p051f0.p.g0(this);
                if (lE == null || lE.c() == 0) {
                    b();
                } else {
                    p051f0.l lVarI = I(this.f44812s.f(), mapR, this.f44812s.g());
                    if (!p247y7.AbstractC7350t.b(lVarI, f0.l.b.f44828a)) {
                        return lVarI;
                    }
                    p170r.L lE2 = this.f44812s.E();
                    if (lE2 != null) {
                        lE2.j(lE);
                    } else {
                        this.f44812s.P(lE);
                        P(null);
                    }
                }
                if (this.f44812s.f() < iF) {
                    this.f44812s.B();
                }
                p051f0.C6541c c6541c2 = this.f44812s;
                c6541c2.v(c6541c2.g().C(iF).s(F()));
                this.f44812s.J(iF);
                this.f44812s.L(y());
                this.f44812s.K(F());
                this.f44812s.M(G());
                p087i7.M m6 = p087i7.M.f46721a;
                O(true);
                T();
                return f0.l.b.f44828a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p051f0.C6541c, p051f0.k
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        T();
    }
}
