package M;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f6502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private M0.P f6503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private R0.AbstractC1494h.b f6504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f6509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Y0.e f6510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private M0.InterfaceC1344p f6511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f6512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f6513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private M.c f6514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private M0.InterfaceC1346s f6515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Y0.v f6516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f6517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f6518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6519r;

    private f(java.lang.String str, M0.P p6, R0.AbstractC1494h.b bVar, int i6, boolean z6, int i10, int i11) {
        this.f6502a = str;
        this.f6503b = p6;
        this.f6504c = bVar;
        this.f6505d = i6;
        this.f6506e = z6;
        this.f6507f = i10;
        this.f6508g = i11;
        this.f6509h = M.a.f6472a.a();
        this.f6513l = Y0.u.a(0, 0);
        this.f6517p = Y0.C1859b.f16201b.c(0, 0);
        this.f6518q = -1;
        this.f6519r = -1;
    }

    public /* synthetic */ f(java.lang.String str, M0.P p6, R0.AbstractC1494h.b bVar, int i6, boolean z6, int i10, int i11, p247y7.AbstractC7342k abstractC7342k) {
        this(str, p6, bVar, i6, z6, i10, i11);
    }

    private final M0.InterfaceC1344p g(long j6, Y0.v vVar) {
        M0.InterfaceC1346s interfaceC1346sN = n(vVar);
        return M0.AbstractC1348u.c(interfaceC1346sN, M.b.a(j6, this.f6506e, this.f6505d, interfaceC1346sN.b()), M.b.b(this.f6506e, this.f6505d, this.f6507f), X0.u.e(this.f6505d, X0.u.f15666a.b()));
    }

    private final void i() {
        this.f6511j = null;
        this.f6515n = null;
        this.f6516o = null;
        this.f6518q = -1;
        this.f6519r = -1;
        this.f6517p = Y0.C1859b.f16201b.c(0, 0);
        this.f6513l = Y0.u.a(0, 0);
        this.f6512k = false;
    }

    private final boolean l(long j6, Y0.v vVar) {
        M0.InterfaceC1346s interfaceC1346s;
        M0.InterfaceC1344p interfaceC1344p = this.f6511j;
        if (interfaceC1344p == null || (interfaceC1346s = this.f6515n) == null || interfaceC1346s.c() || vVar != this.f6516o) {
            return true;
        }
        if (Y0.C1859b.f(j6, this.f6517p)) {
            return false;
        }
        return Y0.C1859b.l(j6) != Y0.C1859b.l(this.f6517p) || ((float) Y0.C1859b.k(j6)) < interfaceC1344p.getHeight() || interfaceC1344p.w();
    }

    private final M0.InterfaceC1346s n(Y0.v vVar) {
        M0.InterfaceC1346s interfaceC1346sB = this.f6515n;
        if (interfaceC1346sB == null || vVar != this.f6516o || interfaceC1346sB.c()) {
            this.f6516o = vVar;
            java.lang.String str = this.f6502a;
            M0.P pD = M0.Q.d(this.f6503b, vVar);
            Y0.e eVar = this.f6510i;
            p247y7.AbstractC7350t.c(eVar);
            interfaceC1346sB = M0.AbstractC1347t.b(str, pD, null, null, eVar, this.f6504c, 12, null);
        }
        this.f6515n = interfaceC1346sB;
        return interfaceC1346sB;
    }

    public final Y0.e a() {
        return this.f6510i;
    }

    public final boolean b() {
        return this.f6512k;
    }

    public final long c() {
        return this.f6513l;
    }

    public final p087i7.M d() {
        M0.InterfaceC1346s interfaceC1346s = this.f6515n;
        if (interfaceC1346s != null) {
            interfaceC1346s.c();
        }
        return p087i7.M.f46721a;
    }

    public final M0.InterfaceC1344p e() {
        return this.f6511j;
    }

    public final int f(int i6, Y0.v vVar) {
        int i10 = this.f6518q;
        int i11 = this.f6519r;
        if (i6 == i10 && i10 != -1) {
            return i11;
        }
        int iA = H.E.a(g(Y0.c.a(0, i6, 0, Integer.MAX_VALUE), vVar).getHeight());
        this.f6518q = i6;
        this.f6519r = iA;
        return iA;
    }

    public final boolean h(long j6, Y0.v vVar) {
        boolean z6 = true;
        if (this.f6508g > 1) {
            M.c.a aVar = M.c.f6474h;
            M.c cVar = this.f6514m;
            M0.P p6 = this.f6503b;
            Y0.e eVar = this.f6510i;
            p247y7.AbstractC7350t.c(eVar);
            M.c cVarA = aVar.a(cVar, vVar, p6, eVar, this.f6504c);
            this.f6514m = cVarA;
            j6 = cVarA.c(j6, this.f6508g);
        }
        boolean z10 = false;
        if (l(j6, vVar)) {
            M0.InterfaceC1344p interfaceC1344pG = g(j6, vVar);
            this.f6517p = j6;
            long jF = Y0.c.f(j6, Y0.u.a(H.E.a(interfaceC1344pG.getWidth()), H.E.a(interfaceC1344pG.getHeight())));
            this.f6513l = jF;
            if (!X0.u.e(this.f6505d, X0.u.f15666a.c()) && (Y0.t.g(jF) < interfaceC1344pG.getWidth() || Y0.t.f(jF) < interfaceC1344pG.getHeight())) {
                z10 = true;
            }
            this.f6512k = z10;
            this.f6511j = interfaceC1344pG;
            return true;
        }
        if (!Y0.C1859b.f(j6, this.f6517p)) {
            M0.InterfaceC1344p interfaceC1344p = this.f6511j;
            p247y7.AbstractC7350t.c(interfaceC1344p);
            long jF2 = Y0.c.f(j6, Y0.u.a(H.E.a(java.lang.Math.min(interfaceC1344p.b(), interfaceC1344p.getWidth())), H.E.a(interfaceC1344p.getHeight())));
            this.f6513l = jF2;
            if (X0.u.e(this.f6505d, X0.u.f15666a.c()) || (Y0.t.g(jF2) >= interfaceC1344p.getWidth() && Y0.t.f(jF2) >= interfaceC1344p.getHeight())) {
                z6 = false;
            }
            this.f6512k = z6;
            this.f6517p = j6;
        }
        return false;
    }

    public final int j(Y0.v vVar) {
        return H.E.a(n(vVar).b());
    }

    public final int k(Y0.v vVar) {
        return H.E.a(n(vVar).a());
    }

    public final void m(Y0.e eVar) {
        Y0.e eVar2 = this.f6510i;
        long jD = eVar != null ? M.a.d(eVar) : M.a.f6472a.a();
        if (eVar2 == null) {
            this.f6510i = eVar;
            this.f6509h = jD;
        } else if (eVar == null || !M.a.e(this.f6509h, jD)) {
            this.f6510i = eVar;
            this.f6509h = jD;
            i();
        }
    }

    public final M0.K o(M0.P p6) {
        Y0.e eVar;
        Y0.v vVar = this.f6516o;
        if (vVar == null || (eVar = this.f6510i) == null) {
            return null;
        }
        M0.C1332d c1332d = new M0.C1332d(this.f6502a, null, null, 6, null);
        if (this.f6511j == null || this.f6515n == null) {
            return null;
        }
        long jD = Y0.C1859b.d(this.f6517p, 0, 0, 0, 0, 10, null);
        return new M0.K(new M0.J(c1332d, p6, p097j7.AbstractC6879v.m(), this.f6507f, this.f6506e, this.f6505d, eVar, vVar, this.f6504c, jD, (p247y7.AbstractC7342k) null), new M0.C1338j(new M0.C1339k(c1332d, p6, p097j7.AbstractC6879v.m(), eVar, this.f6504c), jD, this.f6507f, X0.u.e(this.f6505d, X0.u.f15666a.b()), null), this.f6513l, null);
    }

    public final void p(java.lang.String str, M0.P p6, R0.AbstractC1494h.b bVar, int i6, boolean z6, int i10, int i11) {
        this.f6502a = str;
        this.f6503b = p6;
        this.f6504c = bVar;
        this.f6505d = i6;
        this.f6506e = z6;
        this.f6507f = i10;
        this.f6508g = i11;
        i();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ParagraphLayoutCache(paragraph=");
        sb.append(this.f6511j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((java.lang.Object) M.a.h(this.f6509h));
        sb.append(')');
        return sb.toString();
    }
}
