package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends p8.i.d implements p158p8.q {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final p088i8.d f46900L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static p158p8.r f46901M = new i8.d.a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p158p8.d f46902E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f46903F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f46904G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.util.List f46905H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.util.List f46906I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private byte f46907J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f46908K;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.d a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.d(eVar, gVar);
        }
    }

    public static final class b extends p8.i.c implements p158p8.q {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f46909F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f46910G = 6;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private java.util.List f46911H = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private java.util.List f46912I = java.util.Collections.emptyList();

        private b() {
            A();
        }

        private void A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.d.b x() {
            return new i8.d.b();
        }

        private void y() {
            if ((this.f46909F & 2) != 2) {
                this.f46911H = new java.util.ArrayList(this.f46911H);
                this.f46909F |= 2;
            }
        }

        private void z() {
            if ((this.f46909F & 4) != 4) {
                this.f46912I = new java.util.ArrayList(this.f46912I);
                this.f46909F |= 4;
            }
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public i8.d.b l(p088i8.d dVar) {
            if (dVar == p088i8.d.H()) {
                return this;
            }
            if (dVar.O()) {
                E(dVar.J());
            }
            if (!dVar.f46905H.isEmpty()) {
                if (this.f46911H.isEmpty()) {
                    this.f46911H = dVar.f46905H;
                    this.f46909F &= -3;
                } else {
                    y();
                    this.f46911H.addAll(dVar.f46905H);
                }
            }
            if (!dVar.f46906I.isEmpty()) {
                if (this.f46912I.isEmpty()) {
                    this.f46912I = dVar.f46906I;
                    this.f46909F &= -5;
                } else {
                    z();
                    this.f46912I.addAll(dVar.f46906I);
                }
            }
            r(dVar);
            m(k().e(dVar.f46902E));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public i8.d.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.d dVar = null;
            try {
                try {
                    p088i8.d dVar2 = (p088i8.d) p088i8.d.f46901M.a(eVar, gVar);
                    if (dVar2 != null) {
                        l(dVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.d dVar3 = (p088i8.d) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        dVar = dVar3;
                        if (dVar != null) {
                            l(dVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (dVar != null) {
                    l(dVar);
                }
                throw th;
            }
        }

        public i8.d.b E(int i6) {
            this.f46909F |= 1;
            this.f46910G = i6;
            return this;
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public p088i8.d i() {
            p088i8.d dVarV = v();
            if (dVarV.d()) {
                return dVarV;
            }
            throw p158p8.a.AbstractC0680a.j(dVarV);
        }

        public p088i8.d v() {
            p088i8.d dVar = new p088i8.d(this);
            int i6 = (this.f46909F & 1) != 1 ? 0 : 1;
            dVar.f46904G = this.f46910G;
            if ((this.f46909F & 2) == 2) {
                this.f46911H = j$.util.DesugarCollections.unmodifiableList(this.f46911H);
                this.f46909F &= -3;
            }
            dVar.f46905H = this.f46911H;
            if ((this.f46909F & 4) == 4) {
                this.f46912I = j$.util.DesugarCollections.unmodifiableList(this.f46912I);
                this.f46909F &= -5;
            }
            dVar.f46906I = this.f46912I;
            dVar.f46903F = i6;
            return dVar;
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.d.b clone() {
            return x().l(v());
        }
    }

    static {
        p088i8.d dVar = new p088i8.d(true);
        f46900L = dVar;
        dVar.P();
    }

    private d(p158p8.e eVar, p158p8.g gVar) {
        java.util.List list;
        java.lang.Object objT;
        this.f46907J = (byte) -1;
        this.f46908K = -1;
        P();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        int i6 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ != 8) {
                                if (iJ == 18) {
                                    if ((i6 & 2) != 2) {
                                        this.f46905H = new java.util.ArrayList();
                                        i6 |= 2;
                                    }
                                    list = this.f46905H;
                                    objT = eVar.t(p088i8.u.f47255P, gVar);
                                } else if (iJ == 248) {
                                    if ((i6 & 4) != 4) {
                                        this.f46906I = new java.util.ArrayList();
                                        i6 |= 4;
                                    }
                                    list = this.f46906I;
                                    objT = java.lang.Integer.valueOf(eVar.r());
                                } else if (iJ == 250) {
                                    int i10 = eVar.i(eVar.z());
                                    if ((i6 & 4) != 4 && eVar.e() > 0) {
                                        this.f46906I = new java.util.ArrayList();
                                        i6 |= 4;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f46906I.add(java.lang.Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i10);
                                } else if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                                list.add(objT);
                            } else {
                                this.f46903F |= 1;
                                this.f46904G = eVar.r();
                            }
                        }
                        z6 = true;
                    } catch (java.io.IOException e6) {
                        throw new p158p8.k(e6.getMessage()).i(this);
                    }
                } catch (p158p8.k e10) {
                    throw e10.i(this);
                }
            } catch (java.lang.Throwable th) {
                if ((i6 & 2) == 2) {
                    this.f46905H = j$.util.DesugarCollections.unmodifiableList(this.f46905H);
                }
                if ((i6 & 4) == 4) {
                    this.f46906I = j$.util.DesugarCollections.unmodifiableList(this.f46906I);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f46902E = bVarM.o();
                }
                m();
                throw th;
            }
        }
        if ((i6 & 2) == 2) {
            this.f46905H = j$.util.DesugarCollections.unmodifiableList(this.f46905H);
        }
        if ((i6 & 4) == 4) {
            this.f46906I = j$.util.DesugarCollections.unmodifiableList(this.f46906I);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f46902E = bVarM.o();
        }
        m();
    }

    private d(p8.i.c cVar) {
        super(cVar);
        this.f46907J = (byte) -1;
        this.f46908K = -1;
        this.f46902E = cVar.k();
    }

    private d(boolean z6) {
        this.f46907J = (byte) -1;
        this.f46908K = -1;
        this.f46902E = p158p8.d.f52766C;
    }

    public static p088i8.d H() {
        return f46900L;
    }

    private void P() {
        this.f46904G = 6;
        this.f46905H = java.util.Collections.emptyList();
        this.f46906I = java.util.Collections.emptyList();
    }

    public static i8.d.b Q() {
        return i8.d.b.x();
    }

    public static i8.d.b R(p088i8.d dVar) {
        return Q().l(dVar);
    }

    @Override // p158p8.q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public p088i8.d a() {
        return f46900L;
    }

    public int J() {
        return this.f46904G;
    }

    public p088i8.u K(int i6) {
        return (p088i8.u) this.f46905H.get(i6);
    }

    public int L() {
        return this.f46905H.size();
    }

    public java.util.List M() {
        return this.f46905H;
    }

    public java.util.List N() {
        return this.f46906I;
    }

    public boolean O() {
        return (this.f46903F & 1) == 1;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public i8.d.b c() {
        return Q();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public i8.d.b e() {
        return R(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f46908K;
        if (i6 != -1) {
            return i6;
        }
        int iO = (this.f46903F & 1) == 1 ? p158p8.f.o(1, this.f46904G) : 0;
        for (int i10 = 0; i10 < this.f46905H.size(); i10++) {
            iO += p158p8.f.r(2, (p158p8.p) this.f46905H.get(i10));
        }
        int iP = 0;
        for (int i11 = 0; i11 < this.f46906I.size(); i11++) {
            iP += p158p8.f.p(((java.lang.Integer) this.f46906I.get(i11)).intValue());
        }
        int size = iO + iP + (N().size() * 2) + t() + this.f46902E.size();
        this.f46908K = size;
        return size;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f46907J;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < L(); i6++) {
            if (!K(i6).d()) {
                this.f46907J = (byte) 0;
                return false;
            }
        }
        if (s()) {
            this.f46907J = (byte) 1;
            return true;
        }
        this.f46907J = (byte) 0;
        return false;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        p8.i.d.a aVarY = y();
        if ((this.f46903F & 1) == 1) {
            fVar.Z(1, this.f46904G);
        }
        for (int i6 = 0; i6 < this.f46905H.size(); i6++) {
            fVar.c0(2, (p158p8.p) this.f46905H.get(i6));
        }
        for (int i10 = 0; i10 < this.f46906I.size(); i10++) {
            fVar.Z(31, ((java.lang.Integer) this.f46906I.get(i10)).intValue());
        }
        aVarY.a(19000, fVar);
        fVar.h0(this.f46902E);
    }
}
