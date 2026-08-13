package D;

/* JADX INFO: loaded from: classes.dex */
final class B implements D0.V, D0.V.a, D.D.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f1571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D.D f1572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1745s0 f1573c = V.AbstractC1730l1.a(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.InterfaceC1745s0 f1574d = V.AbstractC1730l1.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V.InterfaceC1753w0 f1575e = V.A1.d(null, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V.InterfaceC1753w0 f1576f = V.A1.d(null, null, 2, null);

    public B(java.lang.Object obj, D.D d6) {
        this.f1571a = obj;
        this.f1572b = d6;
    }

    private final D0.V.a c() {
        return (D0.V.a) this.f1575e.getValue();
    }

    private final int e() {
        return this.f1574d.d();
    }

    private final D0.V f() {
        return (D0.V) this.f1576f.getValue();
    }

    private final void i(D0.V.a aVar) {
        this.f1575e.setValue(aVar);
    }

    private final void k(int i6) {
        this.f1574d.i(i6);
    }

    private final void l(D0.V v6) {
        this.f1576f.setValue(v6);
    }

    @Override // D0.V.a
    public void a() {
        if (e() <= 0) {
            throw new java.lang.IllegalStateException("Release should only be called once".toString());
        }
        k(e() - 1);
        if (e() == 0) {
            this.f1572b.C(this);
            D0.V.a aVarC = c();
            if (aVarC != null) {
                aVarC.a();
            }
            i(null);
        }
    }

    @Override // D0.V
    public D0.V.a b() {
        if (e() == 0) {
            this.f1572b.s(this);
            D0.V vD = d();
            i(vD != null ? vD.b() : null);
        }
        k(e() + 1);
        return this;
    }

    public final D0.V d() {
        return f();
    }

    public final void g() {
        int iE = e();
        for (int i6 = 0; i6 < iE; i6++) {
            a();
        }
    }

    @Override // D.D.a
    public int getIndex() {
        return this.f1573c.d();
    }

    @Override // D.D.a
    public java.lang.Object getKey() {
        return this.f1571a;
    }

    public void h(int i6) {
        this.f1573c.i(i6);
    }

    public final void j(D0.V v6) {
        f0.k.a aVar = p051f0.k.f44821e;
        p051f0.k kVarD = aVar.d();
        p237x7.l lVarH = kVarD != null ? kVarD.h() : null;
        p051f0.k kVarF = aVar.f(kVarD);
        try {
            if (v6 != f()) {
                l(v6);
                if (e() > 0) {
                    D0.V.a aVarC = c();
                    if (aVarC != null) {
                        aVarC.a();
                    }
                    i(v6 != null ? v6.b() : null);
                }
            }
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            aVar.m(kVarD, kVarF, lVarH);
        }
    }
}
