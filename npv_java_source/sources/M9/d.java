package M9;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M9.g f7204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H9.C1235a f7205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M9.e f7206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H9.r f7207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private M9.j.b f7208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private M9.j f7209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private H9.D f7213j;

    public d(M9.g gVar, H9.C1235a c1235a, M9.e eVar, H9.r rVar) {
        p247y7.AbstractC7350t.f(gVar, "connectionPool");
        p247y7.AbstractC7350t.f(c1235a, "address");
        p247y7.AbstractC7350t.f(eVar, "call");
        p247y7.AbstractC7350t.f(rVar, "eventListener");
        this.f7204a = gVar;
        this.f7205b = c1235a;
        this.f7206c = eVar;
        this.f7207d = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Code duplicated, block: B:74:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final M9.f b(int i6, int i10, int i11, int i12, boolean z6) throws java.io.IOException {
        java.util.List listA;
        M9.f fVar;
        M9.f fVarN;
        java.net.Socket socketZ;
        if (this.f7206c.D()) {
            throw new java.io.IOException("Canceled");
        }
        M9.f fVarN2 = this.f7206c.n();
        if (fVarN2 != null) {
            synchronized (fVarN2) {
                try {
                    socketZ = (fVarN2.p() || !g(fVarN2.A().a().l())) ? this.f7206c.z() : null;
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (this.f7206c.n() != null) {
                if (socketZ == null) {
                    return fVarN2;
                }
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (socketZ != null) {
                I9.d.n(socketZ);
            }
            this.f7207d.k(this.f7206c, fVarN2);
        }
        this.f7210g = 0;
        this.f7211h = 0;
        this.f7212i = 0;
        if (this.f7204a.a(this.f7205b, this.f7206c, null, false)) {
            fVarN = this.f7206c.n();
            p247y7.AbstractC7350t.c(fVarN);
        } else {
            H9.D dC = this.f7213j;
            try {
                if (dC != null) {
                    p247y7.AbstractC7350t.c(dC);
                    this.f7213j = null;
                } else {
                    M9.j.b bVar = this.f7208e;
                    if (bVar != null) {
                        p247y7.AbstractC7350t.c(bVar);
                        if (bVar.b()) {
                            M9.j.b bVar2 = this.f7208e;
                            p247y7.AbstractC7350t.c(bVar2);
                            dC = bVar2.c();
                        }
                        fVar = new M9.f(this.f7204a, dC);
                        this.f7206c.B(fVar);
                        fVar.f(i6, i10, i11, i12, z6, this.f7206c, this.f7207d);
                        this.f7206c.B(null);
                        this.f7206c.m().x().a(fVar.A());
                        if (!this.f7204a.a(this.f7205b, this.f7206c, listA, true)) {
                            synchronized (fVar) {
                                this.f7204a.f(fVar);
                                this.f7206c.c(fVar);
                                p087i7.M m10 = p087i7.M.f46721a;
                            }
                            this.f7207d.j(this.f7206c, fVar);
                            return fVar;
                        }
                        fVarN = this.f7206c.n();
                        p247y7.AbstractC7350t.c(fVarN);
                        this.f7213j = dC;
                        I9.d.n(fVar.E());
                    }
                    M9.j jVar = this.f7209f;
                    if (jVar == null) {
                        jVar = new M9.j(this.f7205b, this.f7206c.m().x(), this.f7206c, this.f7207d);
                        this.f7209f = jVar;
                    }
                    M9.j.b bVarC = jVar.c();
                    this.f7208e = bVarC;
                    listA = bVarC.a();
                    if (this.f7206c.D()) {
                        throw new java.io.IOException("Canceled");
                    }
                    if (this.f7204a.a(this.f7205b, this.f7206c, listA, false)) {
                        fVarN = this.f7206c.n();
                        p247y7.AbstractC7350t.c(fVarN);
                    } else {
                        dC = bVarC.c();
                        fVar = new M9.f(this.f7204a, dC);
                        this.f7206c.B(fVar);
                        fVar.f(i6, i10, i11, i12, z6, this.f7206c, this.f7207d);
                        this.f7206c.B(null);
                        this.f7206c.m().x().a(fVar.A());
                        if (!this.f7204a.a(this.f7205b, this.f7206c, listA, true)) {
                            synchronized (fVar) {
                                this.f7204a.f(fVar);
                                this.f7206c.c(fVar);
                                p087i7.M m11 = p087i7.M.f46721a;
                                this.f7207d.j(this.f7206c, fVar);
                                return fVar;
                            }
                        }
                        fVarN = this.f7206c.n();
                        p247y7.AbstractC7350t.c(fVarN);
                        this.f7213j = dC;
                        I9.d.n(fVar.E());
                    }
                }
                fVar.f(i6, i10, i11, i12, z6, this.f7206c, this.f7207d);
                this.f7206c.B(null);
                this.f7206c.m().x().a(fVar.A());
                if (!this.f7204a.a(this.f7205b, this.f7206c, listA, true)) {
                    synchronized (fVar) {
                        this.f7204a.f(fVar);
                        this.f7206c.c(fVar);
                        p087i7.M m12 = p087i7.M.f46721a;
                        this.f7207d.j(this.f7206c, fVar);
                        return fVar;
                    }
                }
                fVarN = this.f7206c.n();
                p247y7.AbstractC7350t.c(fVarN);
                this.f7213j = dC;
                I9.d.n(fVar.E());
            } catch (java.lang.Throwable th2) {
                this.f7206c.B(null);
                throw th2;
            }
            listA = null;
            fVar = new M9.f(this.f7204a, dC);
            this.f7206c.B(fVar);
        }
        this.f7207d.j(this.f7206c, fVarN);
        return fVarN;
    }

    private final M9.f c(int i6, int i10, int i11, int i12, boolean z6, boolean z10) throws java.io.IOException {
        while (true) {
            M9.f fVarB = b(i6, i10, i11, i12, z6);
            if (fVarB.u(z10)) {
                return fVarB;
            }
            fVarB.z();
            if (this.f7213j == null) {
                M9.j.b bVar = this.f7208e;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    M9.j jVar = this.f7209f;
                    if (!(jVar != null ? jVar.a() : true)) {
                        throw new java.io.IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final H9.D f() {
        M9.f fVarN;
        if (this.f7210g > 1 || this.f7211h > 1 || this.f7212i > 0 || (fVarN = this.f7206c.n()) == null) {
            return null;
        }
        synchronized (fVarN) {
            if (fVarN.q() != 0) {
                return null;
            }
            if (I9.d.j(fVarN.A().a().l(), this.f7205b.l())) {
                return fVarN.A();
            }
            return null;
        }
    }

    public final N9.d a(H9.x xVar, N9.g gVar) {
        p247y7.AbstractC7350t.f(xVar, "client");
        p247y7.AbstractC7350t.f(gVar, "chain");
        try {
            return c(gVar.f(), gVar.h(), gVar.j(), xVar.F(), xVar.L(), !p247y7.AbstractC7350t.b(gVar.i().g(), "GET")).w(xVar, gVar);
        } catch (M9.i e6) {
            h(e6.c());
            throw e6;
        } catch (java.io.IOException e10) {
            h(e10);
            throw new M9.i(e10);
        }
    }

    public final H9.C1235a d() {
        return this.f7205b;
    }

    public final boolean e() {
        M9.j jVar;
        if (this.f7210g == 0 && this.f7211h == 0 && this.f7212i == 0) {
            return false;
        }
        if (this.f7213j != null) {
            return true;
        }
        H9.D dF = f();
        if (dF != null) {
            this.f7213j = dF;
            return true;
        }
        M9.j.b bVar = this.f7208e;
        if ((bVar == null || !bVar.b()) && (jVar = this.f7209f) != null) {
            return jVar.a();
        }
        return true;
    }

    public final boolean g(H9.u uVar) {
        p247y7.AbstractC7350t.f(uVar, "url");
        H9.u uVarL = this.f7205b.l();
        return uVar.l() == uVarL.l() && p247y7.AbstractC7350t.b(uVar.h(), uVarL.h());
    }

    public final void h(java.io.IOException iOException) {
        p247y7.AbstractC7350t.f(iOException, "e");
        this.f7213j = null;
        if ((iOException instanceof P9.n) && ((P9.n) iOException).f8700C == P9.b.REFUSED_STREAM) {
            this.f7210g++;
        } else if (iOException instanceof P9.a) {
            this.f7211h++;
        } else {
            this.f7212i++;
        }
    }
}
