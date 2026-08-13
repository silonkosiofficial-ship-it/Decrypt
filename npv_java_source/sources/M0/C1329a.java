package M0;

/* JADX INFO: renamed from: M0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1329a implements M0.InterfaceC1344p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U0.d f6677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final N0.l0 f6681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.CharSequence f6682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f6683g;

    /* JADX INFO: renamed from: M0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0159a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6684a;

        static {
            int[] iArr = new int[X0.i.values().length];
            try {
                iArr[X0.i.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[X0.i.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f6684a = iArr;
        }
    }

    /* JADX INFO: renamed from: M0.a$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ M0.I f6685D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(M0.I i6) {
            super(2);
            this.f6685D = i6;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean u(android.graphics.RectF rectF, android.graphics.RectF rectF2) {
            return java.lang.Boolean.valueOf(this.f6685D.a(p141o0.X1.f(rectF), p141o0.X1.f(rectF2)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C1329a(U0.d dVar, int i6, boolean z6, long j6) {
        java.util.List listM;
        p131n0.i iVar;
        float fZ;
        float fK;
        float fW;
        float fB;
        int iK;
        this.f6677a = dVar;
        this.f6678b = i6;
        this.f6679c = z6;
        this.f6680d = j6;
        if (Y0.C1859b.m(j6) != 0 || Y0.C1859b.n(j6) != 0) {
            throw new java.lang.IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i6 < 1) {
            throw new java.lang.IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        M0.P pI = dVar.i();
        boolean zL = M0.AbstractC1330b.l(pI, z6);
        java.lang.CharSequence charSequenceF = dVar.f();
        this.f6682f = zL ? M0.AbstractC1330b.j(charSequenceF) : charSequenceF;
        int iM = M0.AbstractC1330b.m(pI.z());
        boolean zK = X0.j.k(pI.z(), X0.j.f15622b.c());
        int iO = M0.AbstractC1330b.o(pI.v().c());
        int iN = M0.AbstractC1330b.n(X0.f.g(pI.r()));
        int iP = M0.AbstractC1330b.p(X0.f.h(pI.r()));
        int iQ = M0.AbstractC1330b.q(X0.f.i(pI.r()));
        android.text.TextUtils.TruncateAt truncateAt = z6 ? android.text.TextUtils.TruncateAt.END : null;
        N0.l0 l0VarB = B(iM, zK ? 1 : 0, truncateAt, i6, iO, iN, iP, iQ);
        if (z6 && l0VarB.f() > Y0.C1859b.k(j6) && i6 > 1 && (iK = M0.AbstractC1330b.k(l0VarB, Y0.C1859b.k(j6))) >= 0 && iK != i6) {
            l0VarB = B(iM, zK ? 1 : 0, truncateAt, E7.j.d(iK, 1), iO, iN, iP, iQ);
        }
        this.f6681e = l0VarB;
        E().e(pI.g(), p131n0.n.a(getWidth(), getHeight()), pI.d());
        W0.b[] bVarArrD = D(this.f6681e);
        if (bVarArrD != null) {
            java.util.Iterator itA = p247y7.AbstractC7334c.a(bVarArrD);
            while (itA.hasNext()) {
                ((W0.b) itA.next()).c(p131n0.n.a(getWidth(), getHeight()));
            }
        }
        java.lang.CharSequence charSequence = this.f6682f;
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            java.lang.Object[] spans = spanned.getSpans(0, charSequence.length(), P0.j.class);
            java.util.ArrayList arrayList = new java.util.ArrayList(spans.length);
            for (java.lang.Object obj : spans) {
                P0.j jVar = (P0.j) obj;
                int spanStart = spanned.getSpanStart(jVar);
                int spanEnd = spanned.getSpanEnd(jVar);
                int iQ2 = this.f6681e.q(spanStart);
                java.lang.Object[] objArr = iQ2 >= this.f6678b;
                java.lang.Object[] objArr2 = this.f6681e.n(iQ2) > 0 && spanEnd > this.f6681e.o(iQ2);
                java.lang.Object[] objArr3 = spanEnd > this.f6681e.p(iQ2);
                if (objArr2 == true || objArr3 == true || objArr == true) {
                    iVar = null;
                } else {
                    int i10 = M0.C1329a.C0159a.f6684a[m(spanStart).ordinal()];
                    if (i10 == 1) {
                        fZ = z(spanStart, true);
                    } else {
                        if (i10 != 2) {
                            throw new p087i7.s();
                        }
                        fZ = z(spanStart, true) - jVar.d();
                    }
                    float fD = jVar.d() + fZ;
                    N0.l0 l0Var = this.f6681e;
                    switch (jVar.c()) {
                        case 0:
                            fK = l0Var.k(iQ2);
                            fW = fK - jVar.b();
                            iVar = new p131n0.i(fZ, fW, fD, jVar.b() + fW);
                            break;
                        case 1:
                            fW = l0Var.w(iQ2);
                            iVar = new p131n0.i(fZ, fW, fD, jVar.b() + fW);
                            break;
                        case 2:
                            fK = l0Var.l(iQ2);
                            fW = fK - jVar.b();
                            iVar = new p131n0.i(fZ, fW, fD, jVar.b() + fW);
                            break;
                        case 3:
                            fW = ((l0Var.w(iQ2) + l0Var.l(iQ2)) - jVar.b()) / 2;
                            iVar = new p131n0.i(fZ, fW, fD, jVar.b() + fW);
                            break;
                        case 4:
                            fB = jVar.a().ascent;
                            fW = fB + l0Var.k(iQ2);
                            iVar = new p131n0.i(fZ, fW, fD, jVar.b() + fW);
                            break;
                        case 5:
                            fW = (jVar.a().descent + l0Var.k(iQ2)) - jVar.b();
                            iVar = new p131n0.i(fZ, fW, fD, jVar.b() + fW);
                            break;
                        case 6:
                            android.graphics.Paint.FontMetricsInt fontMetricsIntA = jVar.a();
                            fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - jVar.b()) / 2;
                            fW = fB + l0Var.k(iQ2);
                            iVar = new p131n0.i(fZ, fW, fD, jVar.b() + fW);
                            break;
                        default:
                            throw new java.lang.IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(iVar);
            }
            listM = arrayList;
        } else {
            listM = p097j7.AbstractC6879v.m();
        }
        this.f6683g = listM;
    }

    public /* synthetic */ C1329a(U0.d dVar, int i6, boolean z6, long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(dVar, i6, z6, j6);
    }

    private final N0.l0 B(int i6, int i10, android.text.TextUtils.TruncateAt truncateAt, int i11, int i12, int i13, int i14, int i15) {
        return new N0.l0(this.f6682f, getWidth(), E(), i6, truncateAt, this.f6677a.j(), 1.0f, 0.0f, U0.c.b(this.f6677a.i()), true, i11, i13, i14, i15, i12, i10, null, null, this.f6677a.h(), 196736, null);
    }

    private final W0.b[] D(N0.l0 l0Var) {
        if (!(l0Var.G() instanceof android.text.Spanned)) {
            return null;
        }
        java.lang.CharSequence charSequenceG = l0Var.G();
        p247y7.AbstractC7350t.d(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!F((android.text.Spanned) charSequenceG, W0.b.class)) {
            return null;
        }
        java.lang.CharSequence charSequenceG2 = l0Var.G();
        p247y7.AbstractC7350t.d(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (W0.b[]) ((android.text.Spanned) charSequenceG2).getSpans(0, l0Var.G().length(), W0.b.class);
    }

    private final boolean F(android.text.Spanned spanned, java.lang.Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void G(p141o0.InterfaceC6993q0 interfaceC6993q0) {
        android.graphics.Canvas canvasD = p141o0.H.d(interfaceC6993q0);
        if (w()) {
            canvasD.save();
            canvasD.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f6681e.L(canvasD);
        if (w()) {
            canvasD.restore();
        }
    }

    @Override // M0.InterfaceC1344p
    public float A(int i6) {
        return this.f6681e.t(i6);
    }

    public float C(int i6) {
        return this.f6681e.k(i6);
    }

    public final U0.g E() {
        return this.f6677a.k();
    }

    @Override // M0.InterfaceC1344p
    public float a() {
        return this.f6677a.a();
    }

    @Override // M0.InterfaceC1344p
    public float b() {
        return this.f6677a.b();
    }

    @Override // M0.InterfaceC1344p
    public void c(p141o0.InterfaceC6993q0 interfaceC6993q0, long j6, p141o0.c2 c2Var, X0.k kVar, p161q0.h hVar, int i6) {
        int iB = E().b();
        U0.g gVarE = E();
        gVarE.f(j6);
        gVarE.h(c2Var);
        gVarE.i(kVar);
        gVarE.g(hVar);
        gVarE.d(i6);
        G(interfaceC6993q0);
        E().d(iB);
    }

    @Override // M0.InterfaceC1344p
    public long d(p131n0.i iVar, int i6, M0.I i10) {
        int[] iArrC = this.f6681e.C(p141o0.X1.c(iVar), M0.AbstractC1330b.r(i6), new M0.C1329a.b(i10));
        return iArrC == null ? M0.N.f6666b.a() : M0.O.b(iArrC[0], iArrC[1]);
    }

    @Override // M0.InterfaceC1344p
    public void e(long j6, float[] fArr, int i6) {
        this.f6681e.a(M0.N.l(j6), M0.N.k(j6), fArr, i6);
    }

    @Override // M0.InterfaceC1344p
    public X0.i f(int i6) {
        return this.f6681e.z(this.f6681e.q(i6)) == 1 ? X0.i.Ltr : X0.i.Rtl;
    }

    @Override // M0.InterfaceC1344p
    public float g(int i6) {
        return this.f6681e.w(i6);
    }

    @Override // M0.InterfaceC1344p
    public float getHeight() {
        return this.f6681e.f();
    }

    @Override // M0.InterfaceC1344p
    public float getWidth() {
        return Y0.C1859b.l(this.f6680d);
    }

    @Override // M0.InterfaceC1344p
    public float h() {
        return C(u() - 1);
    }

    @Override // M0.InterfaceC1344p
    public p131n0.i i(int i6) {
        if (i6 >= 0 && i6 <= this.f6682f.length()) {
            float fB = N0.l0.B(this.f6681e, i6, false, 2, null);
            int iQ = this.f6681e.q(i6);
            return new p131n0.i(fB, this.f6681e.w(iQ), fB, this.f6681e.l(iQ));
        }
        throw new java.lang.IllegalArgumentException(("offset(" + i6 + ") is out of bounds [0," + this.f6682f.length() + ']').toString());
    }

    @Override // M0.InterfaceC1344p
    public long j(int i6) {
        O0.i iVarI = this.f6681e.I();
        return M0.O.b(O0.h.b(iVarI, i6), O0.h.a(iVarI, i6));
    }

    @Override // M0.InterfaceC1344p
    public int k(int i6) {
        return this.f6681e.q(i6);
    }

    @Override // M0.InterfaceC1344p
    public float l() {
        return C(0);
    }

    @Override // M0.InterfaceC1344p
    public X0.i m(int i6) {
        return this.f6681e.K(i6) ? X0.i.Rtl : X0.i.Ltr;
    }

    @Override // M0.InterfaceC1344p
    public void n(p141o0.InterfaceC6993q0 interfaceC6993q0, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p141o0.c2 c2Var, X0.k kVar, p161q0.h hVar, int i6) {
        int iB = E().b();
        U0.g gVarE = E();
        gVarE.e(abstractC6984n0, p131n0.n.a(getWidth(), getHeight()), f6);
        gVarE.h(c2Var);
        gVarE.i(kVar);
        gVarE.g(hVar);
        gVarE.d(i6);
        G(interfaceC6993q0);
        E().d(iB);
    }

    @Override // M0.InterfaceC1344p
    public float o(int i6) {
        return this.f6681e.l(i6);
    }

    @Override // M0.InterfaceC1344p
    public int p(long j6) {
        return this.f6681e.y(this.f6681e.r((int) p131n0.g.n(j6)), p131n0.g.m(j6));
    }

    @Override // M0.InterfaceC1344p
    public p131n0.i q(int i6) {
        if (i6 >= 0 && i6 < this.f6682f.length()) {
            android.graphics.RectF rectFC = this.f6681e.c(i6);
            return new p131n0.i(rectFC.left, rectFC.top, rectFC.right, rectFC.bottom);
        }
        throw new java.lang.IllegalArgumentException(("offset(" + i6 + ") is out of bounds [0," + this.f6682f.length() + ')').toString());
    }

    @Override // M0.InterfaceC1344p
    public java.util.List r() {
        return this.f6683g;
    }

    @Override // M0.InterfaceC1344p
    public int s(int i6) {
        return this.f6681e.v(i6);
    }

    @Override // M0.InterfaceC1344p
    public int t(int i6, boolean z6) {
        return z6 ? this.f6681e.x(i6) : this.f6681e.p(i6);
    }

    @Override // M0.InterfaceC1344p
    public int u() {
        return this.f6681e.m();
    }

    @Override // M0.InterfaceC1344p
    public float v(int i6) {
        return this.f6681e.u(i6);
    }

    @Override // M0.InterfaceC1344p
    public boolean w() {
        return this.f6681e.d();
    }

    @Override // M0.InterfaceC1344p
    public int x(float f6) {
        return this.f6681e.r((int) f6);
    }

    @Override // M0.InterfaceC1344p
    public p141o0.Q1 y(int i6, int i10) {
        if (i6 >= 0 && i6 <= i10 && i10 <= this.f6682f.length()) {
            android.graphics.Path path = new android.graphics.Path();
            this.f6681e.F(i6, i10, path);
            return p141o0.Y.c(path);
        }
        throw new java.lang.IllegalArgumentException(("start(" + i6 + ") or end(" + i10 + ") is out of range [0.." + this.f6682f.length() + "], or start > end!").toString());
    }

    @Override // M0.InterfaceC1344p
    public float z(int i6, boolean z6) {
        return z6 ? N0.l0.B(this.f6681e, i6, false, 2, null) : N0.l0.E(this.f6681e, i6, false, 2, null);
    }
}
