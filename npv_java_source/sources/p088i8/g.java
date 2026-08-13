package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends p8.i.d implements p158p8.q {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final p088i8.g f46948J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static p158p8.r f46949K = new i8.g.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f46950E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f46951F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f46952G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private byte f46953H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f46954I;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.g a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.g(eVar, gVar);
        }
    }

    public static final class b extends p8.i.c implements p158p8.q {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f46955F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f46956G;

        private b() {
            y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.g.b x() {
            return new i8.g.b();
        }

        private void y() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public i8.g.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.g gVar2 = null;
            try {
                try {
                    p088i8.g gVar3 = (p088i8.g) p088i8.g.f46949K.a(eVar, gVar);
                    if (gVar3 != null) {
                        l(gVar3);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.g gVar4 = (p088i8.g) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        gVar2 = gVar4;
                        if (gVar2 != null) {
                            l(gVar2);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (gVar2 != null) {
                    l(gVar2);
                }
                throw th;
            }
        }

        public i8.g.b B(int i6) {
            this.f46955F |= 1;
            this.f46956G = i6;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public p088i8.g i() {
            p088i8.g gVarV = v();
            if (gVarV.d()) {
                return gVarV;
            }
            throw p158p8.a.AbstractC0680a.j(gVarV);
        }

        public p088i8.g v() {
            p088i8.g gVar = new p088i8.g(this);
            int i6 = (this.f46955F & 1) != 1 ? 0 : 1;
            gVar.f46952G = this.f46956G;
            gVar.f46951F = i6;
            return gVar;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.g.b clone() {
            return x().l(v());
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public i8.g.b l(p088i8.g gVar) {
            if (gVar == p088i8.g.D()) {
                return this;
            }
            if (gVar.G()) {
                B(gVar.F());
            }
            r(gVar);
            m(k().e(gVar.f46950E));
            return this;
        }
    }

    static {
        p088i8.g gVar = new p088i8.g(true);
        f46948J = gVar;
        gVar.H();
    }

    private g(p158p8.e eVar, p158p8.g gVar) {
        this.f46953H = (byte) -1;
        this.f46954I = -1;
        H();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        while (!z6) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f46951F |= 1;
                                this.f46952G = eVar.r();
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
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f46950E = bVarM.o();
                }
                m();
                throw th;
            }
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f46950E = bVarM.o();
        }
        m();
    }

    private g(p8.i.c cVar) {
        super(cVar);
        this.f46953H = (byte) -1;
        this.f46954I = -1;
        this.f46950E = cVar.k();
    }

    private g(boolean z6) {
        this.f46953H = (byte) -1;
        this.f46954I = -1;
        this.f46950E = p158p8.d.f52766C;
    }

    public static p088i8.g D() {
        return f46948J;
    }

    private void H() {
        this.f46952G = 0;
    }

    public static i8.g.b I() {
        return i8.g.b.x();
    }

    public static i8.g.b J(p088i8.g gVar) {
        return I().l(gVar);
    }

    @Override // p158p8.q
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public p088i8.g a() {
        return f46948J;
    }

    public int F() {
        return this.f46952G;
    }

    public boolean G() {
        return (this.f46951F & 1) == 1;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public i8.g.b c() {
        return I();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public i8.g.b e() {
        return J(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f46954I;
        if (i6 != -1) {
            return i6;
        }
        int iO = ((this.f46951F & 1) == 1 ? p158p8.f.o(1, this.f46952G) : 0) + t() + this.f46950E.size();
        this.f46954I = iO;
        return iO;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f46953H;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        if (s()) {
            this.f46953H = (byte) 1;
            return true;
        }
        this.f46953H = (byte) 0;
        return false;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        p8.i.d.a aVarY = y();
        if ((this.f46951F & 1) == 1) {
            fVar.Z(1, this.f46952G);
        }
        aVarY.a(200, fVar);
        fVar.h0(this.f46950E);
    }
}
