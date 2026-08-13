package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends p158p8.i implements p158p8.q {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final p088i8.v f47273N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static p158p8.r f47274O = new i8.v.a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p158p8.d f47275D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f47276E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f47277F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f47278G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private i8.v.c f47279H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f47280I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f47281J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private i8.v.d f47282K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private byte f47283L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f47284M;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.v a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.v(eVar, gVar);
        }
    }

    public static final class b extends p8.i.b implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f47285D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f47286E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47287F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f47289H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f47290I;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private i8.v.c f47288G = i8.v.c.ERROR;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private i8.v.d f47291J = i8.v.d.LANGUAGE_VERSION;

        private b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.v.b t() {
            return new i8.v.b();
        }

        private void u() {
        }

        public i8.v.b A(int i6) {
            this.f47285D |= 1;
            this.f47286E = i6;
            return this;
        }

        public i8.v.b B(int i6) {
            this.f47285D |= 2;
            this.f47287F = i6;
            return this;
        }

        public i8.v.b C(i8.v.d dVar) {
            dVar.getClass();
            this.f47285D |= 32;
            this.f47291J = dVar;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p088i8.v i() {
            p088i8.v vVarQ = q();
            if (vVarQ.d()) {
                return vVarQ;
            }
            throw p158p8.a.AbstractC0680a.j(vVarQ);
        }

        public p088i8.v q() {
            p088i8.v vVar = new p088i8.v(this);
            int i6 = this.f47285D;
            int i10 = (i6 & 1) != 1 ? 0 : 1;
            vVar.f47277F = this.f47286E;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            vVar.f47278G = this.f47287F;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            vVar.f47279H = this.f47288G;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            vVar.f47280I = this.f47289H;
            if ((i6 & 16) == 16) {
                i10 |= 16;
            }
            vVar.f47281J = this.f47290I;
            if ((i6 & 32) == 32) {
                i10 |= 32;
            }
            vVar.f47282K = this.f47291J;
            vVar.f47276E = i10;
            return vVar;
        }

        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public i8.v.b clone() {
            return t().l(q());
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public i8.v.b l(p088i8.v vVar) {
            if (vVar == p088i8.v.z()) {
                return this;
            }
            if (vVar.J()) {
                A(vVar.D());
            }
            if (vVar.K()) {
                B(vVar.E());
            }
            if (vVar.H()) {
                y(vVar.B());
            }
            if (vVar.G()) {
                x(vVar.A());
            }
            if (vVar.I()) {
                z(vVar.C());
            }
            if (vVar.L()) {
                C(vVar.F());
            }
            m(k().e(vVar.f47275D));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.v.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.v vVar = null;
            try {
                try {
                    p088i8.v vVar2 = (p088i8.v) p088i8.v.f47274O.a(eVar, gVar);
                    if (vVar2 != null) {
                        l(vVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.v vVar3 = (p088i8.v) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        vVar = vVar3;
                        if (vVar != null) {
                            l(vVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (vVar != null) {
                    l(vVar);
                }
                throw th;
            }
        }

        public i8.v.b x(int i6) {
            this.f47285D |= 8;
            this.f47289H = i6;
            return this;
        }

        public i8.v.b y(i8.v.c cVar) {
            cVar.getClass();
            this.f47285D |= 4;
            this.f47288G = cVar;
            return this;
        }

        public i8.v.b z(int i6) {
            this.f47285D |= 16;
            this.f47290I = i6;
            return this;
        }
    }

    public enum c implements p8.j.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static p8.j.b f47295G = new i8.v.c.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f47297C;

        static class a implements p8.j.b {
            a() {
            }

            @Override // p8.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i8.v.c a(int i6) {
                return i8.v.c.e(i6);
            }
        }

        c(int i6, int i10) {
            this.f47297C = i10;
        }

        public static i8.v.c e(int i6) {
            if (i6 == 0) {
                return WARNING;
            }
            if (i6 == 1) {
                return ERROR;
            }
            if (i6 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // p8.j.a
        public final int c() {
            return this.f47297C;
        }
    }

    public enum d implements p8.j.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static p8.j.b f47301G = new i8.v.d.a();

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f47303C;

        static class a implements p8.j.b {
            a() {
            }

            @Override // p8.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i8.v.d a(int i6) {
                return i8.v.d.e(i6);
            }
        }

        d(int i6, int i10) {
            this.f47303C = i10;
        }

        public static i8.v.d e(int i6) {
            if (i6 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i6 == 1) {
                return COMPILER_VERSION;
            }
            if (i6 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // p8.j.a
        public final int c() {
            return this.f47303C;
        }
    }

    static {
        p088i8.v vVar = new p088i8.v(true);
        f47273N = vVar;
        vVar.M();
    }

    private v(p158p8.e eVar, p158p8.g gVar) {
        int iM;
        this.f47283L = (byte) -1;
        this.f47284M = -1;
        M();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        while (!z6) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f47276E |= 1;
                            this.f47277F = eVar.r();
                        } else if (iJ == 16) {
                            this.f47276E |= 2;
                            this.f47278G = eVar.r();
                        } else if (iJ == 24) {
                            iM = eVar.m();
                            i8.v.c cVarE = i8.v.c.e(iM);
                            if (cVarE == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f47276E |= 4;
                                this.f47279H = cVarE;
                            }
                        } else if (iJ == 32) {
                            this.f47276E |= 8;
                            this.f47280I = eVar.r();
                        } else if (iJ == 40) {
                            this.f47276E |= 16;
                            this.f47281J = eVar.r();
                        } else if (iJ == 48) {
                            iM = eVar.m();
                            i8.v.d dVarE = i8.v.d.e(iM);
                            if (dVarE == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f47276E |= 32;
                                this.f47282K = dVarE;
                            }
                        } else if (!p(eVar, fVarI, gVar, iJ)) {
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f47275D = bVarM.o();
                    }
                    m();
                    throw th;
                }
            } catch (p158p8.k e6) {
                throw e6.i(this);
            } catch (java.io.IOException e10) {
                throw new p158p8.k(e10.getMessage()).i(this);
            }
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47275D = bVarM.o();
        }
        m();
    }

    private v(p8.i.b bVar) {
        super(bVar);
        this.f47283L = (byte) -1;
        this.f47284M = -1;
        this.f47275D = bVar.k();
    }

    private v(boolean z6) {
        this.f47283L = (byte) -1;
        this.f47284M = -1;
        this.f47275D = p158p8.d.f52766C;
    }

    private void M() {
        this.f47277F = 0;
        this.f47278G = 0;
        this.f47279H = i8.v.c.ERROR;
        this.f47280I = 0;
        this.f47281J = 0;
        this.f47282K = i8.v.d.LANGUAGE_VERSION;
    }

    public static i8.v.b N() {
        return i8.v.b.t();
    }

    public static i8.v.b O(p088i8.v vVar) {
        return N().l(vVar);
    }

    public static p088i8.v z() {
        return f47273N;
    }

    public int A() {
        return this.f47280I;
    }

    public i8.v.c B() {
        return this.f47279H;
    }

    public int C() {
        return this.f47281J;
    }

    public int D() {
        return this.f47277F;
    }

    public int E() {
        return this.f47278G;
    }

    public i8.v.d F() {
        return this.f47282K;
    }

    public boolean G() {
        return (this.f47276E & 8) == 8;
    }

    public boolean H() {
        return (this.f47276E & 4) == 4;
    }

    public boolean I() {
        return (this.f47276E & 16) == 16;
    }

    public boolean J() {
        return (this.f47276E & 1) == 1;
    }

    public boolean K() {
        return (this.f47276E & 2) == 2;
    }

    public boolean L() {
        return (this.f47276E & 32) == 32;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public i8.v.b c() {
        return N();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public i8.v.b e() {
        return O(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47284M;
        if (i6 != -1) {
            return i6;
        }
        int iO = (this.f47276E & 1) == 1 ? p158p8.f.o(1, this.f47277F) : 0;
        if ((this.f47276E & 2) == 2) {
            iO += p158p8.f.o(2, this.f47278G);
        }
        if ((this.f47276E & 4) == 4) {
            iO += p158p8.f.h(3, this.f47279H.c());
        }
        if ((this.f47276E & 8) == 8) {
            iO += p158p8.f.o(4, this.f47280I);
        }
        if ((this.f47276E & 16) == 16) {
            iO += p158p8.f.o(5, this.f47281J);
        }
        if ((this.f47276E & 32) == 32) {
            iO += p158p8.f.h(6, this.f47282K.c());
        }
        int size = iO + this.f47275D.size();
        this.f47284M = size;
        return size;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47283L;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        this.f47283L = (byte) 1;
        return true;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        if ((this.f47276E & 1) == 1) {
            fVar.Z(1, this.f47277F);
        }
        if ((this.f47276E & 2) == 2) {
            fVar.Z(2, this.f47278G);
        }
        if ((this.f47276E & 4) == 4) {
            fVar.R(3, this.f47279H.c());
        }
        if ((this.f47276E & 8) == 8) {
            fVar.Z(4, this.f47280I);
        }
        if ((this.f47276E & 16) == 16) {
            fVar.Z(5, this.f47281J);
        }
        if ((this.f47276E & 32) == 32) {
            fVar.R(6, this.f47282K.c());
        }
        fVar.h0(this.f47275D);
    }
}
