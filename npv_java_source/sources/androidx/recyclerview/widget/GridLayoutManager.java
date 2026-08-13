package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f22965I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    int f22966J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    int[] f22967K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    android.view.View[] f22968L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final android.util.SparseIntArray f22969M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final android.util.SparseIntArray f22970N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    androidx.recyclerview.widget.GridLayoutManager.c f22971O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    final android.graphics.Rect f22972P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f22973Q;

    public static final class a extends androidx.recyclerview.widget.GridLayoutManager.c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i6, int i10) {
            return i6 % i10;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i6) {
            return 1;
        }
    }

    public static class b extends androidx.recyclerview.widget.RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f22975f;

        public b(int i6, int i10) {
            super(i6, i10);
            this.f22974e = -1;
            this.f22975f = 0;
        }

        public b(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22974e = -1;
            this.f22975f = 0;
        }

        public b(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22974e = -1;
            this.f22975f = 0;
        }

        public b(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f22974e = -1;
            this.f22975f = 0;
        }

        public int e() {
            return this.f22974e;
        }

        public int f() {
            return this.f22975f;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.util.SparseIntArray f22976a = new android.util.SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.util.SparseIntArray f22977b = new android.util.SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22978c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22979d = false;

        static int a(android.util.SparseIntArray sparseIntArray, int i6) {
            int size = sparseIntArray.size() - 1;
            int i10 = 0;
            while (i10 <= size) {
                int i11 = (i10 + size) >>> 1;
                if (sparseIntArray.keyAt(i11) < i6) {
                    i10 = i11 + 1;
                } else {
                    size = i11 - 1;
                }
            }
            int i12 = i10 - 1;
            if (i12 < 0 || i12 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i12);
        }

        int b(int i6, int i10) {
            if (!this.f22979d) {
                return d(i6, i10);
            }
            int i11 = this.f22977b.get(i6, -1);
            if (i11 != -1) {
                return i11;
            }
            int iD = d(i6, i10);
            this.f22977b.put(i6, iD);
            return iD;
        }

        int c(int i6, int i10) {
            if (!this.f22978c) {
                return e(i6, i10);
            }
            int i11 = this.f22976a.get(i6, -1);
            if (i11 != -1) {
                return i11;
            }
            int iE = e(i6, i10);
            this.f22976a.put(i6, iE);
            return iE;
        }

        public int d(int i6, int i10) {
            int i11;
            int i12;
            int iC;
            int iA;
            if (!this.f22979d || (iA = a(this.f22977b, i6)) == -1) {
                i11 = 0;
                i12 = 0;
                iC = 0;
            } else {
                i11 = this.f22977b.get(iA);
                i12 = iA + 1;
                iC = c(iA, i10) + f(iA);
                if (iC == i10) {
                    i11++;
                    iC = 0;
                }
            }
            int iF = f(i6);
            while (i12 < i6) {
                int iF2 = f(i12);
                iC += iF2;
                if (iC == i10) {
                    i11++;
                    iC = 0;
                } else if (iC > i10) {
                    i11++;
                    iC = iF2;
                }
                i12++;
            }
            return iC + iF > i10 ? i11 + 1 : i11;
        }

        public abstract int e(int i6, int i10);

        public abstract int f(int i6);

        public void g() {
            this.f22977b.clear();
        }

        public void h() {
            this.f22976a.clear();
        }
    }

    public GridLayoutManager(android.content.Context context, int i6, int i10, boolean z6) {
        super(context, i10, z6);
        this.f22965I = false;
        this.f22966J = -1;
        this.f22969M = new android.util.SparseIntArray();
        this.f22970N = new android.util.SparseIntArray();
        this.f22971O = new androidx.recyclerview.widget.GridLayoutManager.a();
        this.f22972P = new android.graphics.Rect();
        d3(i6);
    }

    public GridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        super(context, attributeSet, i6, i10);
        this.f22965I = false;
        this.f22966J = -1;
        this.f22969M = new android.util.SparseIntArray();
        this.f22970N = new android.util.SparseIntArray();
        this.f22971O = new androidx.recyclerview.widget.GridLayoutManager.a();
        this.f22972P = new android.graphics.Rect();
        d3(androidx.recyclerview.widget.RecyclerView.p.m0(context, attributeSet, i6, i10).f23194b);
    }

    private void N2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, int i6, boolean z6) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z6) {
            i12 = 1;
            i11 = i6;
            i10 = 0;
        } else {
            i10 = i6 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            android.view.View view = this.f22968L[i10];
            androidx.recyclerview.widget.GridLayoutManager.b bVar = (androidx.recyclerview.widget.GridLayoutManager.b) view.getLayoutParams();
            int iZ2 = Z2(vVar, a6, l0(view));
            bVar.f22975f = iZ2;
            bVar.f22974e = i13;
            i13 += iZ2;
            i10 += i12;
        }
    }

    private void O2() {
        int iO = O();
        for (int i6 = 0; i6 < iO; i6++) {
            androidx.recyclerview.widget.GridLayoutManager.b bVar = (androidx.recyclerview.widget.GridLayoutManager.b) N(i6).getLayoutParams();
            int iA = bVar.a();
            this.f22969M.put(iA, bVar.f());
            this.f22970N.put(iA, bVar.e());
        }
    }

    private void P2(int i6) {
        this.f22967K = Q2(this.f22967K, this.f22966J, i6);
    }

    static int[] Q2(int[] iArr, int i6, int i10) {
        int i11;
        if (iArr == null || iArr.length != i6 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i6 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i10 / i6;
        int i14 = i10 % i6;
        int i15 = 0;
        for (int i16 = 1; i16 <= i6; i16++) {
            i12 += i14;
            if (i12 <= 0 || i6 - i12 >= i14) {
                i11 = i13;
            } else {
                i11 = i13 + 1;
                i12 -= i6;
            }
            i15 += i11;
            iArr[i16] = i15;
        }
        return iArr;
    }

    private void R2() {
        this.f22969M.clear();
        this.f22970N.clear();
    }

    private int S2(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() != 0 && a6.b() != 0) {
            X1();
            boolean zR2 = r2();
            android.view.View viewB2 = b2(!zR2, true);
            android.view.View viewA2 = a2(!zR2, true);
            if (viewB2 != null && viewA2 != null) {
                int iB = this.f22971O.b(l0(viewB2), this.f22966J);
                int iB2 = this.f22971O.b(l0(viewA2), this.f22966J);
                int iMax = this.f22993x ? java.lang.Math.max(0, ((this.f22971O.b(a6.b() - 1, this.f22966J) + 1) - java.lang.Math.max(iB, iB2)) - 1) : java.lang.Math.max(0, java.lang.Math.min(iB, iB2));
                if (zR2) {
                    return java.lang.Math.round((iMax * (java.lang.Math.abs(this.f22990u.d(viewA2) - this.f22990u.g(viewB2)) / ((this.f22971O.b(l0(viewA2), this.f22966J) - this.f22971O.b(l0(viewB2), this.f22966J)) + 1))) + (this.f22990u.m() - this.f22990u.g(viewB2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int T2(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() != 0 && a6.b() != 0) {
            X1();
            android.view.View viewB2 = b2(!r2(), true);
            android.view.View viewA2 = a2(!r2(), true);
            if (viewB2 != null && viewA2 != null) {
                if (!r2()) {
                    return this.f22971O.b(a6.b() - 1, this.f22966J) + 1;
                }
                return (int) (((this.f22990u.d(viewA2) - this.f22990u.g(viewB2)) / ((this.f22971O.b(l0(viewA2), this.f22966J) - this.f22971O.b(l0(viewB2), this.f22966J)) + 1)) * (this.f22971O.b(a6.b() - 1, this.f22966J) + 1));
            }
        }
        return 0;
    }

    private void U2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.LinearLayoutManager.a aVar, int i6) {
        boolean z6 = i6 == 1;
        int iY2 = Y2(vVar, a6, aVar.f22997b);
        if (z6) {
            while (iY2 > 0) {
                int i10 = aVar.f22997b;
                if (i10 <= 0) {
                    return;
                }
                int i11 = i10 - 1;
                aVar.f22997b = i11;
                iY2 = Y2(vVar, a6, i11);
            }
            return;
        }
        int iB = a6.b() - 1;
        int i12 = aVar.f22997b;
        while (i12 < iB) {
            int i13 = i12 + 1;
            int iY3 = Y2(vVar, a6, i13);
            if (iY3 <= iY2) {
                break;
            }
            i12 = i13;
            iY2 = iY3;
        }
        aVar.f22997b = i12;
    }

    private void V2() {
        android.view.View[] viewArr = this.f22968L;
        if (viewArr == null || viewArr.length != this.f22966J) {
            this.f22968L = new android.view.View[this.f22966J];
        }
    }

    private int X2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, int i6) {
        if (!a6.e()) {
            return this.f22971O.b(i6, this.f22966J);
        }
        int iF = vVar.f(i6);
        if (iF != -1) {
            return this.f22971O.b(iF, this.f22966J);
        }
        java.lang.String str = "Cannot find span size for pre layout position. " + i6;
        return 0;
    }

    private int Y2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, int i6) {
        if (!a6.e()) {
            return this.f22971O.c(i6, this.f22966J);
        }
        int i10 = this.f22970N.get(i6, -1);
        if (i10 != -1) {
            return i10;
        }
        int iF = vVar.f(i6);
        if (iF != -1) {
            return this.f22971O.c(iF, this.f22966J);
        }
        java.lang.String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6;
        return 0;
    }

    private int Z2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, int i6) {
        if (!a6.e()) {
            return this.f22971O.f(i6);
        }
        int i10 = this.f22969M.get(i6, -1);
        if (i10 != -1) {
            return i10;
        }
        int iF = vVar.f(i6);
        if (iF != -1) {
            return this.f22971O.f(iF);
        }
        java.lang.String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6;
        return 1;
    }

    private void a3(float f6, int i6) {
        P2(java.lang.Math.max(java.lang.Math.round(f6 * this.f22966J), i6));
    }

    private void b3(android.view.View view, int i6, boolean z6) {
        int iP;
        int iP2;
        androidx.recyclerview.widget.GridLayoutManager.b bVar = (androidx.recyclerview.widget.GridLayoutManager.b) view.getLayoutParams();
        android.graphics.Rect rect = bVar.f23198b;
        int i10 = rect.top + rect.bottom + ((android.view.ViewGroup.MarginLayoutParams) bVar).topMargin + ((android.view.ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i11 = rect.left + rect.right + ((android.view.ViewGroup.MarginLayoutParams) bVar).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iW2 = W2(bVar.f22974e, bVar.f22975f);
        if (this.f22988s == 1) {
            iP2 = androidx.recyclerview.widget.RecyclerView.p.P(iW2, i6, i11, ((android.view.ViewGroup.MarginLayoutParams) bVar).width, false);
            iP = androidx.recyclerview.widget.RecyclerView.p.P(this.f22990u.n(), c0(), i10, ((android.view.ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iP3 = androidx.recyclerview.widget.RecyclerView.p.P(iW2, i6, i10, ((android.view.ViewGroup.MarginLayoutParams) bVar).height, false);
            int iP4 = androidx.recyclerview.widget.RecyclerView.p.P(this.f22990u.n(), t0(), i11, ((android.view.ViewGroup.MarginLayoutParams) bVar).width, true);
            iP = iP3;
            iP2 = iP4;
        }
        c3(view, iP2, iP, z6);
    }

    private void c3(android.view.View view, int i6, int i10, boolean z6) {
        androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
        if (z6 ? L1(view, i6, i10, qVar) : J1(view, i6, i10, qVar)) {
            view.measure(i6, i10);
        }
    }

    private void e3() {
        int iB0;
        int iK0;
        if (p2() == 1) {
            iB0 = s0() - j0();
            iK0 = i0();
        } else {
            iB0 = b0() - h0();
            iK0 = k0();
        }
        P2(iB0 - iK0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A(androidx.recyclerview.widget.RecyclerView.A a6) {
        return this.f22973Q ? T2(a6) : super.A(a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        e3();
        V2();
        return super.A1(i6, vVar, a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        e3();
        V2();
        return super.C1(i6, vVar, a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(boolean z6) {
        if (z6) {
            throw new java.lang.UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(android.graphics.Rect rect, int i6, int i10) {
        int iS;
        int iS2;
        if (this.f22967K == null) {
            super.G1(rect, i6, i10);
        }
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f22988s == 1) {
            iS2 = androidx.recyclerview.widget.RecyclerView.p.s(i10, rect.height() + iK0, f0());
            int[] iArr = this.f22967K;
            iS = androidx.recyclerview.widget.RecyclerView.p.s(i6, iArr[iArr.length - 1] + iI0, g0());
        } else {
            iS = androidx.recyclerview.widget.RecyclerView.p.s(i6, rect.width() + iI0, g0());
            int[] iArr2 = this.f22967K;
            iS2 = androidx.recyclerview.widget.RecyclerView.p.s(i10, iArr2[iArr2.length - 1] + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public androidx.recyclerview.widget.RecyclerView.q I() {
        return this.f22988s == 0 ? new androidx.recyclerview.widget.GridLayoutManager.b(-2, -1) : new androidx.recyclerview.widget.GridLayoutManager.b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public androidx.recyclerview.widget.RecyclerView.q J(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.recyclerview.widget.GridLayoutManager.b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public androidx.recyclerview.widget.RecyclerView.q K(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new androidx.recyclerview.widget.GridLayoutManager.b((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new androidx.recyclerview.widget.GridLayoutManager.b(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View N0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.A r27) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$A):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f22983D == null && !this.f22965I;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void R1(androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.LinearLayoutManager.c cVar, androidx.recyclerview.widget.RecyclerView.p.c cVar2) {
        int iF = this.f22966J;
        for (int i6 = 0; i6 < this.f22966J && cVar.c(a6) && iF > 0; i6++) {
            int i10 = cVar.f23008d;
            cVar2.a(i10, java.lang.Math.max(0, cVar.f23011g));
            iF -= this.f22971O.f(i10);
            cVar.f23008d += cVar.f23009e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int S(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (this.f22988s == 1) {
            return this.f22966J;
        }
        if (a6.b() < 1) {
            return 0;
        }
        return X2(vVar, a6, a6.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, android.view.View view, C1.B b6) {
        int iE;
        int iF;
        boolean z6;
        boolean z10;
        int iF2;
        int iE2;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof androidx.recyclerview.widget.GridLayoutManager.b)) {
            super.S0(view, b6);
            return;
        }
        androidx.recyclerview.widget.GridLayoutManager.b bVar = (androidx.recyclerview.widget.GridLayoutManager.b) layoutParams;
        int iX2 = X2(vVar, a6, bVar.a());
        if (this.f22988s == 0) {
            iE2 = bVar.e();
            iF2 = bVar.f();
            z6 = false;
            z10 = false;
            iF = 1;
            iE = iX2;
        } else {
            iE = bVar.e();
            iF = bVar.f();
            z6 = false;
            z10 = false;
            iF2 = 1;
            iE2 = iX2;
        }
        b6.p0(C1.B.f.a(iE2, iF2, iE, iF, z6, z10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
        this.f22971O.h();
        this.f22971O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f22971O.h();
        this.f22971O.g();
    }

    int W2(int i6, int i10) {
        if (this.f22988s != 1 || !q2()) {
            int[] iArr = this.f22967K;
            return iArr[i10 + i6] - iArr[i6];
        }
        int[] iArr2 = this.f22967K;
        int i11 = this.f22966J;
        return iArr2[i11 - i6] - iArr2[(i11 - i6) - i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10, int i11) {
        this.f22971O.h();
        this.f22971O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
        this.f22971O.h();
        this.f22971O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10, java.lang.Object obj) {
        this.f22971O.h();
        this.f22971O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void b1(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (a6.e()) {
            O2();
        }
        super.b1(vVar, a6);
        R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void c1(androidx.recyclerview.widget.RecyclerView.A a6) {
        super.c1(a6);
        this.f22965I = false;
    }

    public void d3(int i6) {
        if (i6 == this.f22966J) {
            return;
        }
        this.f22965I = true;
        if (i6 >= 1) {
            this.f22966J = i6;
            this.f22971O.h();
            x1();
        } else {
            throw new java.lang.IllegalArgumentException("Span count should be at least 1. Provided " + i6);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    android.view.View j2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, boolean z6, boolean z10) {
        int i6;
        int iO;
        int iO2 = O();
        int i10 = 1;
        if (z10) {
            iO = O() - 1;
            i6 = -1;
            i10 = -1;
        } else {
            i6 = iO2;
            iO = 0;
        }
        int iB = a6.b();
        X1();
        int iM = this.f22990u.m();
        int i11 = this.f22990u.i();
        android.view.View view = null;
        android.view.View view2 = null;
        while (iO != i6) {
            android.view.View viewN = N(iO);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < iB && Y2(vVar, a6, iL0) == 0) {
                if (((androidx.recyclerview.widget.RecyclerView.q) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f22990u.g(viewN) < i11 && this.f22990u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            iO += i10;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int o0(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (this.f22988s == 0) {
            return this.f22966J;
        }
        if (a6.b() < 1) {
            return 0;
        }
        return X2(vVar, a6, a6.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(androidx.recyclerview.widget.RecyclerView.q qVar) {
        return qVar instanceof androidx.recyclerview.widget.GridLayoutManager.b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void s2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.LinearLayoutManager.c cVar, androidx.recyclerview.widget.LinearLayoutManager.b bVar) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int iF;
        int i14;
        int iF2;
        int iF3;
        int i15;
        int iP;
        int iP2;
        android.view.View viewD;
        int iL = this.f22990u.l();
        boolean z6 = iL != 1073741824;
        int i16 = O() > 0 ? this.f22967K[this.f22966J] : 0;
        if (z6) {
            e3();
        }
        boolean z10 = cVar.f23009e == 1;
        int iY2 = this.f22966J;
        if (!z10) {
            iY2 = Y2(vVar, a6, cVar.f23008d) + Z2(vVar, a6, cVar.f23008d);
        }
        int i17 = 0;
        while (i17 < this.f22966J && cVar.c(a6) && iY2 > 0) {
            int i18 = cVar.f23008d;
            int iZ2 = Z2(vVar, a6, i18);
            if (iZ2 > this.f22966J) {
                throw new java.lang.IllegalArgumentException("Item at position " + i18 + " requires " + iZ2 + " spans but GridLayoutManager has only " + this.f22966J + " spans.");
            }
            iY2 -= iZ2;
            if (iY2 < 0 || (viewD = cVar.d(vVar)) == null) {
                break;
            }
            this.f22968L[i17] = viewD;
            i17++;
        }
        if (i17 == 0) {
            bVar.f23002b = true;
            return;
        }
        N2(vVar, a6, i17, z10);
        float f6 = 0.0f;
        int i19 = 0;
        for (int i20 = 0; i20 < i17; i20++) {
            android.view.View view = this.f22968L[i20];
            if (cVar.f23016l == null) {
                if (z10) {
                    i(view);
                } else {
                    j(view, 0);
                }
            } else if (z10) {
                g(view);
            } else {
                h(view, 0);
            }
            o(view, this.f22972P);
            b3(view, iL, false);
            int iE = this.f22990u.e(view);
            if (iE > i19) {
                i19 = iE;
            }
            float f10 = (this.f22990u.f(view) * 1.0f) / ((androidx.recyclerview.widget.GridLayoutManager.b) view.getLayoutParams()).f22975f;
            if (f10 > f6) {
                f6 = f10;
            }
        }
        if (z6) {
            a3(f6, i16);
            i19 = 0;
            for (int i21 = 0; i21 < i17; i21++) {
                android.view.View view2 = this.f22968L[i21];
                b3(view2, 1073741824, true);
                int iE2 = this.f22990u.e(view2);
                if (iE2 > i19) {
                    i19 = iE2;
                }
            }
        }
        for (int i22 = 0; i22 < i17; i22++) {
            android.view.View view3 = this.f22968L[i22];
            if (this.f22990u.e(view3) != i19) {
                androidx.recyclerview.widget.GridLayoutManager.b bVar2 = (androidx.recyclerview.widget.GridLayoutManager.b) view3.getLayoutParams();
                android.graphics.Rect rect = bVar2.f23198b;
                int i23 = rect.top + rect.bottom + ((android.view.ViewGroup.MarginLayoutParams) bVar2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i24 = rect.left + rect.right + ((android.view.ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iW2 = W2(bVar2.f22974e, bVar2.f22975f);
                if (this.f22988s == 1) {
                    iP2 = androidx.recyclerview.widget.RecyclerView.p.P(iW2, 1073741824, i24, ((android.view.ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iP = android.view.View.MeasureSpec.makeMeasureSpec(i19 - i23, 1073741824);
                } else {
                    int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i19 - i24, 1073741824);
                    iP = androidx.recyclerview.widget.RecyclerView.p.P(iW2, 1073741824, i23, ((android.view.ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iP2 = iMakeMeasureSpec;
                }
                c3(view3, iP2, iP, true);
            }
        }
        bVar.f23001a = i19;
        if (this.f22988s == 1) {
            if (cVar.f23010f == -1) {
                iF = cVar.f23006b;
                i15 = iF - i19;
            } else {
                i15 = cVar.f23006b;
                iF = i15 + i19;
            }
            i12 = i15;
            i13 = 0;
            i11 = 0;
        } else {
            if (cVar.f23010f == -1) {
                i10 = cVar.f23006b;
                i6 = i10 - i19;
            } else {
                i6 = cVar.f23006b;
                i10 = i6 + i19;
            }
            i11 = i6;
            i12 = 0;
            i13 = i10;
            iF = 0;
        }
        int i25 = 0;
        while (i25 < i17) {
            android.view.View view4 = this.f22968L[i25];
            androidx.recyclerview.widget.GridLayoutManager.b bVar3 = (androidx.recyclerview.widget.GridLayoutManager.b) view4.getLayoutParams();
            if (this.f22988s == 1) {
                if (q2()) {
                    int iI0 = i0() + this.f22967K[this.f22966J - bVar3.f22974e];
                    iF2 = iI0;
                    iF3 = iI0 - this.f22990u.f(view4);
                } else {
                    int iI1 = i0() + this.f22967K[bVar3.f22974e];
                    iF3 = iI1;
                    iF2 = this.f22990u.f(view4) + iI1;
                }
                i14 = i12;
            } else {
                int iK0 = k0() + this.f22967K[bVar3.f22974e];
                i14 = iK0;
                iF2 = i13;
                iF3 = i11;
                iF = this.f22990u.f(view4) + iK0;
            }
            D0(view4, iF3, i14, iF2, iF);
            if (bVar3.c() || bVar3.b()) {
                bVar.f23003c = true;
            }
            bVar.f23004d |= view4.hasFocusable();
            i25++;
            iF = iF;
            i13 = iF2;
            i11 = iF3;
            i12 = i14;
        }
        java.util.Arrays.fill(this.f22968L, (java.lang.Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void u2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.LinearLayoutManager.a aVar, int i6) {
        super.u2(vVar, a6, aVar, i6);
        e3();
        if (a6.b() > 0 && !a6.e()) {
            U2(vVar, a6, aVar, i6);
        }
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w(androidx.recyclerview.widget.RecyclerView.A a6) {
        return this.f22973Q ? S2(a6) : super.w(a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int x(androidx.recyclerview.widget.RecyclerView.A a6) {
        return this.f22973Q ? T2(a6) : super.x(a6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z(androidx.recyclerview.widget.RecyclerView.A a6) {
        return this.f22973Q ? S2(a6) : super.z(a6);
    }
}
