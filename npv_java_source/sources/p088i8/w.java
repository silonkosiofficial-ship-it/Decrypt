package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends p158p8.i implements p158p8.q {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final p088i8.w f47304H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static p158p8.r f47305I = new i8.w.a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p158p8.d f47306D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.List f47307E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private byte f47308F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f47309G;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.w a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.w(eVar, gVar);
        }
    }

    public static final class b extends p8.i.b implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f47310D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.util.List f47311E = java.util.Collections.emptyList();

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.w.b t() {
            return new i8.w.b();
        }

        private void u() {
            if ((this.f47310D & 1) != 1) {
                this.f47311E = new java.util.ArrayList(this.f47311E);
                this.f47310D |= 1;
            }
        }

        private void v() {
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p088i8.w i() {
            p088i8.w wVarQ = q();
            if (wVarQ.d()) {
                return wVarQ;
            }
            throw p158p8.a.AbstractC0680a.j(wVarQ);
        }

        public p088i8.w q() {
            p088i8.w wVar = new p088i8.w(this);
            if ((this.f47310D & 1) == 1) {
                this.f47311E = j$.util.DesugarCollections.unmodifiableList(this.f47311E);
                this.f47310D &= -2;
            }
            wVar.f47307E = this.f47311E;
            return wVar;
        }

        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public i8.w.b clone() {
            return t().l(q());
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.w.b l(p088i8.w wVar) {
            if (wVar == p088i8.w.u()) {
                return this;
            }
            if (!wVar.f47307E.isEmpty()) {
                if (this.f47311E.isEmpty()) {
                    this.f47311E = wVar.f47307E;
                    this.f47310D &= -2;
                } else {
                    u();
                    this.f47311E.addAll(wVar.f47307E);
                }
            }
            m(k().e(wVar.f47306D));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public i8.w.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.w wVar = null;
            try {
                try {
                    p088i8.w wVar2 = (p088i8.w) p088i8.w.f47305I.a(eVar, gVar);
                    if (wVar2 != null) {
                        l(wVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.w wVar3 = (p088i8.w) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        wVar = wVar3;
                        if (wVar != null) {
                            l(wVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (wVar != null) {
                    l(wVar);
                }
                throw th;
            }
        }
    }

    static {
        p088i8.w wVar = new p088i8.w(true);
        f47304H = wVar;
        wVar.x();
    }

    private w(p158p8.e eVar, p158p8.g gVar) {
        this.f47308F = (byte) -1;
        this.f47309G = -1;
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
                                if (!z10) {
                                    this.f47307E = new java.util.ArrayList();
                                    z10 = true;
                                }
                                this.f47307E.add(eVar.t(p088i8.v.f47274O, gVar));
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
                    this.f47307E = j$.util.DesugarCollections.unmodifiableList(this.f47307E);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f47306D = bVarM.o();
                }
                m();
                throw th;
            }
        }
        if (z10) {
            this.f47307E = j$.util.DesugarCollections.unmodifiableList(this.f47307E);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47306D = bVarM.o();
        }
        m();
    }

    private w(p8.i.b bVar) {
        super(bVar);
        this.f47308F = (byte) -1;
        this.f47309G = -1;
        this.f47306D = bVar.k();
    }

    private w(boolean z6) {
        this.f47308F = (byte) -1;
        this.f47309G = -1;
        this.f47306D = p158p8.d.f52766C;
    }

    public static p088i8.w u() {
        return f47304H;
    }

    private void x() {
        this.f47307E = java.util.Collections.emptyList();
    }

    public static i8.w.b y() {
        return i8.w.b.t();
    }

    public static i8.w.b z(p088i8.w wVar) {
        return y().l(wVar);
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public i8.w.b c() {
        return y();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public i8.w.b e() {
        return z(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47309G;
        if (i6 != -1) {
            return i6;
        }
        int iR = 0;
        for (int i10 = 0; i10 < this.f47307E.size(); i10++) {
            iR += p158p8.f.r(1, (p158p8.p) this.f47307E.get(i10));
        }
        int size = iR + this.f47306D.size();
        this.f47309G = size;
        return size;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47308F;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        this.f47308F = (byte) 1;
        return true;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        for (int i6 = 0; i6 < this.f47307E.size(); i6++) {
            fVar.c0(1, (p158p8.p) this.f47307E.get(i6));
        }
        fVar.h0(this.f47306D);
    }

    public int v() {
        return this.f47307E.size();
    }

    public java.util.List w() {
        return this.f47307E;
    }
}
