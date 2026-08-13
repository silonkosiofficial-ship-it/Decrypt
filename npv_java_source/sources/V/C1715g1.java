package V;

/* JADX INFO: renamed from: V.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1715g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.C1718h1 f14858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f14859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object[] f14861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.util.HashMap f14863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f14867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final V.X f14868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f14869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f14872o;

    public C1715g1(V.C1718h1 c1718h1) {
        this.f14858a = c1718h1;
        this.f14859b = c1718h1.M();
        int iN = c1718h1.N();
        this.f14860c = iN;
        this.f14861d = c1718h1.O();
        this.f14862e = c1718h1.P();
        this.f14866i = iN;
        this.f14867j = -1;
        this.f14868k = new V.X();
    }

    private final java.lang.Object M(int[] iArr, int i6) {
        return V.AbstractC1724j1.N(iArr, i6) ? this.f14861d[V.AbstractC1724j1.R(iArr, i6)] : V.InterfaceC1734n.f14931a.a();
    }

    private final java.lang.Object O(int[] iArr, int i6) {
        if (V.AbstractC1724j1.L(iArr, i6)) {
            return this.f14861d[V.AbstractC1724j1.S(iArr, i6)];
        }
        return null;
    }

    private final java.lang.Object b(int[] iArr, int i6) {
        return V.AbstractC1724j1.J(iArr, i6) ? this.f14861d[V.AbstractC1724j1.B(iArr, i6)] : V.InterfaceC1734n.f14931a.a();
    }

    public final java.lang.Object A(int i6) {
        return B(this.f14865h, i6);
    }

    public final java.lang.Object B(int i6, int i10) {
        int iV = V.AbstractC1724j1.V(this.f14859b, i6);
        int i11 = i6 + 1;
        int i12 = iV + i10;
        return i12 < (i11 < this.f14860c ? V.AbstractC1724j1.F(this.f14859b, i11) : this.f14862e) ? this.f14861d[i12] : V.InterfaceC1734n.f14931a.a();
    }

    public final int C(int i6) {
        return V.AbstractC1724j1.O(this.f14859b, i6);
    }

    public final java.lang.Object D(int i6) {
        return O(this.f14859b, i6);
    }

    public final int E(int i6) {
        return V.AbstractC1724j1.I(this.f14859b, i6);
    }

    public final boolean F(int i6) {
        return V.AbstractC1724j1.K(this.f14859b, i6);
    }

    public final boolean G(int i6) {
        return V.AbstractC1724j1.L(this.f14859b, i6);
    }

    public final boolean H() {
        return t() || this.f14865h == this.f14866i;
    }

    public final boolean I() {
        return V.AbstractC1724j1.N(this.f14859b, this.f14865h);
    }

    public final boolean J(int i6) {
        return V.AbstractC1724j1.N(this.f14859b, i6);
    }

    public final java.lang.Object K() {
        int i6;
        if (this.f14869l > 0 || (i6 = this.f14870m) >= this.f14871n) {
            this.f14872o = false;
            return V.InterfaceC1734n.f14931a.a();
        }
        this.f14872o = true;
        java.lang.Object[] objArr = this.f14861d;
        this.f14870m = i6 + 1;
        return objArr[i6];
    }

    public final java.lang.Object L(int i6) {
        if (V.AbstractC1724j1.N(this.f14859b, i6)) {
            return M(this.f14859b, i6);
        }
        return null;
    }

    public final int N(int i6) {
        return V.AbstractC1724j1.Q(this.f14859b, i6);
    }

    public final int P(int i6) {
        return V.AbstractC1724j1.T(this.f14859b, i6);
    }

    public final void Q(int i6) {
        if (!(this.f14869l == 0)) {
            V.AbstractC1741q.r("Cannot reposition while in an empty region");
        }
        this.f14865h = i6;
        int iT = i6 < this.f14860c ? V.AbstractC1724j1.T(this.f14859b, i6) : -1;
        this.f14867j = iT;
        this.f14866i = iT < 0 ? this.f14860c : iT + V.AbstractC1724j1.I(this.f14859b, iT);
        this.f14870m = 0;
        this.f14871n = 0;
    }

    public final void R(int i6) {
        int I10 = V.AbstractC1724j1.I(this.f14859b, i6) + i6;
        int i10 = this.f14865h;
        if (!(i10 >= i6 && i10 <= I10)) {
            V.AbstractC1741q.r("Index " + i6 + " is not a parent of " + i10);
        }
        this.f14867j = i6;
        this.f14866i = I10;
        this.f14870m = 0;
        this.f14871n = 0;
    }

    public final int S() {
        if (!(this.f14869l == 0)) {
            V.AbstractC1741q.r("Cannot skip while in an empty region");
        }
        int iQ = V.AbstractC1724j1.N(this.f14859b, this.f14865h) ? 1 : V.AbstractC1724j1.Q(this.f14859b, this.f14865h);
        int i6 = this.f14865h;
        this.f14865h = i6 + V.AbstractC1724j1.I(this.f14859b, i6);
        return iQ;
    }

    public final void T() {
        if (!(this.f14869l == 0)) {
            V.AbstractC1741q.r("Cannot skip the enclosing group while in an empty region");
        }
        this.f14865h = this.f14866i;
        this.f14870m = 0;
        this.f14871n = 0;
    }

    public final void U() {
        if (this.f14869l <= 0) {
            int i6 = this.f14867j;
            int i10 = this.f14865h;
            if (!(V.AbstractC1724j1.T(this.f14859b, i10) == i6)) {
                V.I0.a("Invalid slot table detected");
            }
            java.util.HashMap map = this.f14863f;
            if (map != null) {
            }
            V.X x6 = this.f14868k;
            int i11 = this.f14870m;
            int i12 = this.f14871n;
            if (i11 == 0 && i12 == 0) {
                i11 = -1;
            }
            x6.j(i11);
            this.f14867j = i10;
            this.f14866i = V.AbstractC1724j1.I(this.f14859b, i10) + i10;
            int i13 = i10 + 1;
            this.f14865h = i13;
            this.f14870m = V.AbstractC1724j1.V(this.f14859b, i10);
            this.f14871n = i10 >= this.f14860c - 1 ? this.f14862e : V.AbstractC1724j1.F(this.f14859b, i13);
        }
    }

    public final void V() {
        if (this.f14869l <= 0) {
            if (!V.AbstractC1724j1.N(this.f14859b, this.f14865h)) {
                V.I0.a("Expected a node group");
            }
            U();
        }
    }

    public final V.C1704d a(int i6) {
        java.util.ArrayList arrayListD = this.f14858a.D();
        int iU = V.AbstractC1724j1.U(arrayListD, i6, this.f14860c);
        if (iU >= 0) {
            return (V.C1704d) arrayListD.get(iU);
        }
        V.C1704d c1704d = new V.C1704d(i6);
        arrayListD.add(-(iU + 1), c1704d);
        return c1704d;
    }

    public final void c() {
        this.f14869l++;
    }

    public final void d() {
        this.f14864g = true;
        this.f14858a.f(this, this.f14863f);
    }

    public final boolean e(int i6) {
        return V.AbstractC1724j1.D(this.f14859b, i6);
    }

    public final void f() {
        if (!(this.f14869l > 0)) {
            V.I0.a("Unbalanced begin/end empty");
        }
        this.f14869l--;
    }

    public final void g() {
        if (this.f14869l == 0) {
            if (!(this.f14865h == this.f14866i)) {
                V.AbstractC1741q.r("endGroup() not called at the end of a group");
            }
            int iT = V.AbstractC1724j1.T(this.f14859b, this.f14867j);
            this.f14867j = iT;
            this.f14866i = iT < 0 ? this.f14860c : V.AbstractC1724j1.I(this.f14859b, iT) + iT;
            int i6 = this.f14868k.i();
            if (i6 < 0) {
                this.f14870m = 0;
                this.f14871n = 0;
            } else {
                this.f14870m = i6;
                this.f14871n = iT >= this.f14860c - 1 ? this.f14862e : V.AbstractC1724j1.F(this.f14859b, iT + 1);
            }
        }
    }

    public final java.util.List h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f14869l > 0) {
            return arrayList;
        }
        int I10 = this.f14865h;
        int i6 = 0;
        while (I10 < this.f14866i) {
            arrayList.add(new V.C1702c0(V.AbstractC1724j1.O(this.f14859b, I10), O(this.f14859b, I10), I10, V.AbstractC1724j1.N(this.f14859b, I10) ? 1 : V.AbstractC1724j1.Q(this.f14859b, I10), i6));
            I10 += V.AbstractC1724j1.I(this.f14859b, I10);
            i6++;
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f14864g;
    }

    public final int j() {
        return this.f14866i;
    }

    public final int k() {
        return this.f14865h;
    }

    public final java.lang.Object l() {
        int i6 = this.f14865h;
        if (i6 < this.f14866i) {
            return b(this.f14859b, i6);
        }
        return 0;
    }

    public final int m() {
        return this.f14866i;
    }

    public final int n() {
        int i6 = this.f14865h;
        if (i6 < this.f14866i) {
            return V.AbstractC1724j1.O(this.f14859b, i6);
        }
        return 0;
    }

    public final java.lang.Object o() {
        int i6 = this.f14865h;
        if (i6 < this.f14866i) {
            return O(this.f14859b, i6);
        }
        return null;
    }

    public final int p() {
        return V.AbstractC1724j1.I(this.f14859b, this.f14865h);
    }

    public final int q() {
        return this.f14870m - V.AbstractC1724j1.V(this.f14859b, this.f14867j);
    }

    public final boolean r() {
        return this.f14872o;
    }

    public final boolean s() {
        int i6 = this.f14865h;
        return i6 < this.f14866i && V.AbstractC1724j1.L(this.f14859b, i6);
    }

    public final boolean t() {
        return this.f14869l > 0;
    }

    public java.lang.String toString() {
        return "SlotReader(current=" + this.f14865h + ", key=" + n() + ", parent=" + this.f14867j + ", end=" + this.f14866i + ')';
    }

    public final int u() {
        return this.f14867j;
    }

    public final int v() {
        int i6 = this.f14867j;
        if (i6 >= 0) {
            return V.AbstractC1724j1.Q(this.f14859b, i6);
        }
        return 0;
    }

    public final int w() {
        return this.f14871n - this.f14870m;
    }

    public final int x() {
        return this.f14860c;
    }

    public final V.C1718h1 y() {
        return this.f14858a;
    }

    public final java.lang.Object z(int i6) {
        return b(this.f14859b, i6);
    }
}
