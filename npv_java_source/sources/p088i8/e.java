package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends p158p8.i implements p158p8.q {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final p088i8.e f46913H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static p158p8.r f46914I = new i8.e.a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p158p8.d f46915D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.List f46916E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private byte f46917F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f46918G;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.e a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.e(eVar, gVar);
        }
    }

    public static final class b extends p8.i.b implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f46919D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.util.List f46920E = java.util.Collections.emptyList();

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.e.b t() {
            return new i8.e.b();
        }

        private void u() {
            if ((this.f46919D & 1) != 1) {
                this.f46920E = new java.util.ArrayList(this.f46920E);
                this.f46919D |= 1;
            }
        }

        private void v() {
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p088i8.e i() {
            p088i8.e eVarQ = q();
            if (eVarQ.d()) {
                return eVarQ;
            }
            throw p158p8.a.AbstractC0680a.j(eVarQ);
        }

        public p088i8.e q() {
            p088i8.e eVar = new p088i8.e(this);
            if ((this.f46919D & 1) == 1) {
                this.f46920E = j$.util.DesugarCollections.unmodifiableList(this.f46920E);
                this.f46919D &= -2;
            }
            eVar.f46916E = this.f46920E;
            return eVar;
        }

        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public i8.e.b clone() {
            return t().l(q());
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.e.b l(p088i8.e eVar) {
            if (eVar == p088i8.e.u()) {
                return this;
            }
            if (!eVar.f46916E.isEmpty()) {
                if (this.f46920E.isEmpty()) {
                    this.f46920E = eVar.f46916E;
                    this.f46919D &= -2;
                } else {
                    u();
                    this.f46920E.addAll(eVar.f46916E);
                }
            }
            m(k().e(eVar.f46915D));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public i8.e.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.e eVar2 = null;
            try {
                try {
                    p088i8.e eVar3 = (p088i8.e) p088i8.e.f46914I.a(eVar, gVar);
                    if (eVar3 != null) {
                        l(eVar3);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.e eVar4 = (p088i8.e) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        eVar2 = eVar4;
                        if (eVar2 != null) {
                            l(eVar2);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (eVar2 != null) {
                    l(eVar2);
                }
                throw th;
            }
        }
    }

    static {
        p088i8.e eVar = new p088i8.e(true);
        f46913H = eVar;
        eVar.x();
    }

    private e(p158p8.e eVar, p158p8.g gVar) {
        this.f46917F = (byte) -1;
        this.f46918G = -1;
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
                                    this.f46916E = new java.util.ArrayList();
                                    z10 = true;
                                }
                                this.f46916E.add(eVar.t(p088i8.f.f46922M, gVar));
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
                    this.f46916E = j$.util.DesugarCollections.unmodifiableList(this.f46916E);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f46915D = bVarM.o();
                }
                m();
                throw th;
            }
        }
        if (z10) {
            this.f46916E = j$.util.DesugarCollections.unmodifiableList(this.f46916E);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f46915D = bVarM.o();
        }
        m();
    }

    private e(p8.i.b bVar) {
        super(bVar);
        this.f46917F = (byte) -1;
        this.f46918G = -1;
        this.f46915D = bVar.k();
    }

    private e(boolean z6) {
        this.f46917F = (byte) -1;
        this.f46918G = -1;
        this.f46915D = p158p8.d.f52766C;
    }

    public static p088i8.e u() {
        return f46913H;
    }

    private void x() {
        this.f46916E = java.util.Collections.emptyList();
    }

    public static i8.e.b y() {
        return i8.e.b.t();
    }

    public static i8.e.b z(p088i8.e eVar) {
        return y().l(eVar);
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public i8.e.b c() {
        return y();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public i8.e.b e() {
        return z(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f46918G;
        if (i6 != -1) {
            return i6;
        }
        int iR = 0;
        for (int i10 = 0; i10 < this.f46916E.size(); i10++) {
            iR += p158p8.f.r(1, (p158p8.p) this.f46916E.get(i10));
        }
        int size = iR + this.f46915D.size();
        this.f46918G = size;
        return size;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f46917F;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < w(); i6++) {
            if (!v(i6).d()) {
                this.f46917F = (byte) 0;
                return false;
            }
        }
        this.f46917F = (byte) 1;
        return true;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        for (int i6 = 0; i6 < this.f46916E.size(); i6++) {
            fVar.c0(1, (p158p8.p) this.f46916E.get(i6));
        }
        fVar.h0(this.f46915D);
    }

    public p088i8.f v(int i6) {
        return (p088i8.f) this.f46916E.get(i6);
    }

    public int w() {
        return this.f46916E.size();
    }
}
