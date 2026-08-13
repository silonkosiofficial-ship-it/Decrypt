package p132n1;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements p132n1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p122m1.e f51432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p132n1.m f51433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m1.e.b f51434d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f51437g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p132n1.g f51435e = new p132n1.g(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p132n1.f f51438h = new p132n1.f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p132n1.f f51439i = new p132n1.f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n1.p.a f51440j = n1.p.a.NONE;

    public enum a {
        NONE,
        START,
        END,
        CENTER;


        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f51446H = p157p7.b.a(e());
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51447a;

        static {
            int[] iArr = new int[m1.d.b.values().length];
            try {
                iArr[m1.d.b.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[m1.d.b.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[m1.d.b.TOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[m1.d.b.BASELINE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[m1.d.b.BOTTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f51447a = iArr;
        }
    }

    public p(p122m1.e eVar) {
        this.f51432b = eVar;
    }

    private final void v(int i6, int i10) {
        p132n1.g gVar;
        int iH;
        int i11 = this.f51431a;
        if (i11 == 0) {
            gVar = this.f51435e;
            iH = h(i10, i6);
        } else if (i11 == 1) {
            int iH2 = h(this.f51435e.u(), i6);
            gVar = this.f51435e;
            iH = java.lang.Math.min(iH2, i10);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                p122m1.e eVar = this.f51432b;
                p247y7.AbstractC7350t.c(eVar);
                p132n1.l lVarK = eVar.K();
                p247y7.AbstractC7350t.c(lVarK);
                m1.e.b bVarJ = lVarK.j();
                m1.e.b bVar = m1.e.b.MATCH_CONSTRAINT;
                if (bVarJ == bVar) {
                    p122m1.e eVar2 = this.f51432b;
                    p247y7.AbstractC7350t.c(eVar2);
                    p132n1.l lVarK2 = eVar2.K();
                    p247y7.AbstractC7350t.c(lVarK2);
                    if (lVarK2.o() == 3) {
                        p122m1.e eVar3 = this.f51432b;
                        p247y7.AbstractC7350t.c(eVar3);
                        p132n1.n nVarE0 = eVar3.e0();
                        p247y7.AbstractC7350t.c(nVarE0);
                        if (nVarE0.j() == bVar) {
                            p122m1.e eVar4 = this.f51432b;
                            p247y7.AbstractC7350t.c(eVar4);
                            p132n1.n nVarE1 = eVar4.e0();
                            p247y7.AbstractC7350t.c(nVarE1);
                            if (nVarE1.o() == 3) {
                                return;
                            }
                        }
                    }
                }
                p122m1.e eVar5 = this.f51432b;
                p247y7.AbstractC7350t.c(eVar5);
                p132n1.p pVarE0 = i6 == 0 ? eVar5.e0() : eVar5.K();
                p247y7.AbstractC7350t.c(pVarE0);
                if (pVarE0.f51435e.i()) {
                    p122m1.e eVar6 = this.f51432b;
                    p247y7.AbstractC7350t.c(eVar6);
                    float fS = eVar6.s();
                    this.f51435e.k(i6 == 1 ? (int) ((pVarE0.f51435e.j() / fS) + 0.5f) : (int) ((fS * pVarE0.f51435e.j()) + 0.5f));
                    return;
                }
                return;
            }
            p122m1.e eVar7 = this.f51432b;
            p247y7.AbstractC7350t.c(eVar7);
            p122m1.e eVarO0 = eVar7.o0();
            if (eVarO0 == null) {
                return;
            }
            p132n1.p pVarK = i6 == 0 ? eVarO0.K() : eVarO0.e0();
            p247y7.AbstractC7350t.c(pVarK);
            if (!pVarK.f51435e.i()) {
                return;
            }
            p122m1.e eVar8 = this.f51432b;
            p247y7.AbstractC7350t.c(eVar8);
            i10 = (int) ((pVarK.f51435e.j() * (i6 == 0 ? eVar8.W() : eVar8.V())) + 0.5f);
            gVar = this.f51435e;
            iH = h(i10, i6);
        }
        gVar.k(iH);
    }

    public final void A(p122m1.e eVar) {
        this.f51432b = eVar;
    }

    public final void B(int i6) {
        this.f51431a = i6;
    }

    public final void C(int i6) {
        this.f51436f = i6;
    }

    public abstract boolean D();

    protected void E(p132n1.d dVar, p122m1.d dVar2, p122m1.d dVar3, int i6) {
        p132n1.f fVar;
        p247y7.AbstractC7350t.f(dVar2, "startAnchor");
        p247y7.AbstractC7350t.f(dVar3, "endAnchor");
        p132n1.f fVarR = r(dVar2);
        p132n1.f fVarR2 = r(dVar3);
        p247y7.AbstractC7350t.c(fVarR);
        if (fVarR.i()) {
            p247y7.AbstractC7350t.c(fVarR2);
            if (fVarR2.i()) {
                int iJ = fVarR.j() + dVar2.k();
                int iJ2 = fVarR2.j() - dVar3.k();
                int i10 = iJ2 - iJ;
                if (!this.f51435e.i() && this.f51434d == m1.e.b.MATCH_CONSTRAINT) {
                    v(i6, i10);
                }
                if (this.f51435e.i()) {
                    if (this.f51435e.j() == i10) {
                        this.f51438h.k(iJ);
                        fVar = this.f51439i;
                    } else {
                        p122m1.e eVar = this.f51432b;
                        p247y7.AbstractC7350t.c(eVar);
                        float fX = i6 == 0 ? eVar.x() : eVar.v0();
                        if (p247y7.AbstractC7350t.b(fVarR, fVarR2)) {
                            iJ = fVarR.j();
                            iJ2 = fVarR2.j();
                            fX = 0.5f;
                        }
                        this.f51438h.k((int) (iJ + 0.5f + (((iJ2 - iJ) - this.f51435e.j()) * fX)));
                        fVar = this.f51439i;
                        iJ2 = this.f51438h.j() + this.f51435e.j();
                    }
                    fVar.k(iJ2);
                }
            }
        }
    }

    protected void F(p132n1.d dVar) {
    }

    protected void G(p132n1.d dVar) {
    }

    @Override // p132n1.d
    public abstract void a(p132n1.d dVar);

    protected final void b(p132n1.f fVar, p132n1.f fVar2, int i6) {
        p247y7.AbstractC7350t.f(fVar, "node");
        p247y7.AbstractC7350t.f(fVar2, "target");
        fVar.g().add(fVar2);
        fVar.m(i6);
        fVar2.d().add(fVar);
    }

    protected final void c(p132n1.f fVar, p132n1.f fVar2, int i6, p132n1.g gVar) {
        p247y7.AbstractC7350t.f(fVar, "node");
        p247y7.AbstractC7350t.f(fVar2, "target");
        p247y7.AbstractC7350t.f(gVar, "dimensionDependency");
        fVar.g().add(fVar2);
        fVar.g().add(this.f51435e);
        fVar.o(i6);
        fVar.n(gVar);
        fVar2.d().add(fVar);
        gVar.d().add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final p132n1.f g() {
        return this.f51439i;
    }

    protected final int h(int i6, int i10) {
        int iMax;
        if (i10 == 0) {
            p122m1.e eVar = this.f51432b;
            p247y7.AbstractC7350t.c(eVar);
            int iS = eVar.S();
            p122m1.e eVar2 = this.f51432b;
            p247y7.AbstractC7350t.c(eVar2);
            iMax = java.lang.Math.max(eVar2.U(), i6);
            if (iS > 0) {
                iMax = java.lang.Math.min(iS, i6);
            }
            if (iMax == i6) {
                return i6;
            }
        } else {
            p122m1.e eVar3 = this.f51432b;
            p247y7.AbstractC7350t.c(eVar3);
            int iR = eVar3.R();
            p122m1.e eVar4 = this.f51432b;
            p247y7.AbstractC7350t.c(eVar4);
            iMax = java.lang.Math.max(eVar4.T(), i6);
            if (iR > 0) {
                iMax = java.lang.Math.min(iR, i6);
            }
            if (iMax == i6) {
                return i6;
            }
        }
        return iMax;
    }

    public final p132n1.g i() {
        return this.f51435e;
    }

    public final m1.e.b j() {
        return this.f51434d;
    }

    public final boolean k() {
        return this.f51437g;
    }

    public final p132n1.m l() {
        return this.f51433c;
    }

    public final n1.p.a m() {
        return this.f51440j;
    }

    public final p122m1.e n() {
        return this.f51432b;
    }

    public final int o() {
        return this.f51431a;
    }

    public final int p() {
        return this.f51436f;
    }

    public final p132n1.f q() {
        return this.f51438h;
    }

    protected final p132n1.f r(p122m1.d dVar) {
        p132n1.p pVarK;
        p132n1.p pVarK2;
        p247y7.AbstractC7350t.f(dVar, "anchor");
        if (dVar.i() == null) {
            return null;
        }
        p122m1.d dVarI = dVar.i();
        p247y7.AbstractC7350t.c(dVarI);
        p122m1.e eVarG = dVarI.g();
        p122m1.d dVarI2 = dVar.i();
        p247y7.AbstractC7350t.c(dVarI2);
        int i6 = n1.p.b.f51447a[dVarI2.j().ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                pVarK2 = eVarG.K();
            } else if (i6 == 3) {
                pVarK = eVarG.e0();
            } else {
                if (i6 == 4) {
                    p132n1.n nVarE0 = eVarG.e0();
                    p247y7.AbstractC7350t.c(nVarE0);
                    return nVarE0.H();
                }
                if (i6 != 5) {
                    return null;
                }
                pVarK2 = eVarG.e0();
            }
            p247y7.AbstractC7350t.c(pVarK2);
            return pVarK2.g();
        }
        pVarK = eVarG.K();
        p247y7.AbstractC7350t.c(pVarK);
        return pVarK.q();
    }

    protected final p132n1.f s(p122m1.d dVar, int i6) {
        p247y7.AbstractC7350t.f(dVar, "anchor");
        if (dVar.i() == null) {
            return null;
        }
        p122m1.d dVarI = dVar.i();
        p247y7.AbstractC7350t.c(dVarI);
        p122m1.e eVarG = dVarI.g();
        p132n1.p pVarK = i6 == 0 ? eVarG.K() : eVarG.e0();
        p247y7.AbstractC7350t.c(pVarK);
        p122m1.d dVarI2 = dVar.i();
        p247y7.AbstractC7350t.c(dVarI2);
        int i10 = n1.p.b.f51447a[dVarI2.j().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        return null;
                    }
                }
            }
            return pVarK.f51439i;
        }
        return pVarK.f51438h;
    }

    public long t() {
        if (this.f51435e.i()) {
            return this.f51435e.j();
        }
        return 0L;
    }

    public boolean u() {
        return this.f51437g;
    }

    public final void w(m1.e.b bVar) {
        this.f51434d = bVar;
    }

    public final void x(boolean z6) {
        this.f51437g = z6;
    }

    public final void y(p132n1.m mVar) {
        this.f51433c = mVar;
    }

    public final void z(n1.p.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "<set-?>");
        this.f51440j = aVar;
    }
}
