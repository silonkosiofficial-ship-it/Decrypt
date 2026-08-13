package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends p158p8.i implements p158p8.q {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final p088i8.p f47129H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static p158p8.r f47130I = new i8.p.a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p158p8.d f47131D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p158p8.n f47132E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private byte f47133F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f47134G;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.p a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.p(eVar, gVar);
        }
    }

    public static final class b extends p8.i.b implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f47135D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private p158p8.n f47136E = p158p8.m.f52825D;

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.p.b t() {
            return new i8.p.b();
        }

        private void u() {
            if ((this.f47135D & 1) != 1) {
                this.f47136E = new p158p8.m(this.f47136E);
                this.f47135D |= 1;
            }
        }

        private void v() {
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p088i8.p i() {
            p088i8.p pVarQ = q();
            if (pVarQ.d()) {
                return pVarQ;
            }
            throw p158p8.a.AbstractC0680a.j(pVarQ);
        }

        public p088i8.p q() {
            p088i8.p pVar = new p088i8.p(this);
            if ((this.f47135D & 1) == 1) {
                this.f47136E = this.f47136E.l();
                this.f47135D &= -2;
            }
            pVar.f47132E = this.f47136E;
            return pVar;
        }

        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public i8.p.b clone() {
            return t().l(q());
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.p.b l(p088i8.p pVar) {
            if (pVar == p088i8.p.u()) {
                return this;
            }
            if (!pVar.f47132E.isEmpty()) {
                if (this.f47136E.isEmpty()) {
                    this.f47136E = pVar.f47132E;
                    this.f47135D &= -2;
                } else {
                    u();
                    this.f47136E.addAll(pVar.f47132E);
                }
            }
            m(k().e(pVar.f47131D));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public i8.p.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.p pVar = null;
            try {
                try {
                    p088i8.p pVar2 = (p088i8.p) p088i8.p.f47130I.a(eVar, gVar);
                    if (pVar2 != null) {
                        l(pVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.p pVar3 = (p088i8.p) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        pVar = pVar3;
                        if (pVar != null) {
                            l(pVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (pVar != null) {
                    l(pVar);
                }
                throw th;
            }
        }
    }

    static {
        p088i8.p pVar = new p088i8.p(true);
        f47129H = pVar;
        pVar.x();
    }

    private p(p158p8.e eVar, p158p8.g gVar) {
        this.f47133F = (byte) -1;
        this.f47134G = -1;
        x();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        boolean z10 = false;
        while (!z6) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                p158p8.d dVarK = eVar.k();
                                if (!z10) {
                                    this.f47132E = new p158p8.m();
                                    z10 = true;
                                }
                                this.f47132E.p(dVarK);
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        }
                        z6 = true;
                    } catch (p158p8.k e6) {
                        throw e6.i(this);
                    }
                } catch (java.io.IOException e10) {
                    throw new p158p8.k(e10.getMessage()).i(this);
                }
            } catch (java.lang.Throwable th) {
                if (z10) {
                    this.f47132E = this.f47132E.l();
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f47131D = bVarM.o();
                }
                m();
                throw th;
            }
        }
        if (z10) {
            this.f47132E = this.f47132E.l();
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47131D = bVarM.o();
        }
        m();
    }

    private p(p8.i.b bVar) {
        super(bVar);
        this.f47133F = (byte) -1;
        this.f47134G = -1;
        this.f47131D = bVar.k();
    }

    private p(boolean z6) {
        this.f47133F = (byte) -1;
        this.f47134G = -1;
        this.f47131D = p158p8.d.f52766C;
    }

    public static p088i8.p u() {
        return f47129H;
    }

    private void x() {
        this.f47132E = p158p8.m.f52825D;
    }

    public static i8.p.b y() {
        return i8.p.b.t();
    }

    public static i8.p.b z(p088i8.p pVar) {
        return y().l(pVar);
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public i8.p.b c() {
        return y();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public i8.p.b e() {
        return z(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47134G;
        if (i6 != -1) {
            return i6;
        }
        int iE = 0;
        for (int i10 = 0; i10 < this.f47132E.size(); i10++) {
            iE += p158p8.f.e(this.f47132E.z(i10));
        }
        int size = iE + w().size() + this.f47131D.size();
        this.f47134G = size;
        return size;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47133F;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        this.f47133F = (byte) 1;
        return true;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        for (int i6 = 0; i6 < this.f47132E.size(); i6++) {
            fVar.N(1, this.f47132E.z(i6));
        }
        fVar.h0(this.f47131D);
    }

    public java.lang.String v(int i6) {
        return (java.lang.String) this.f47132E.get(i6);
    }

    public p158p8.s w() {
        return this.f47132E;
    }
}
