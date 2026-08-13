package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1932e extends androidx.compose.ui.platform.AbstractC1923b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static androidx.compose.ui.platform.C1932e f20100h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private M0.K f20103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private K0.o f20104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.graphics.Rect f20105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final androidx.compose.ui.platform.C1932e.a f20098f = new androidx.compose.ui.platform.C1932e.a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f20099g = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final X0.i f20101i = X0.i.Rtl;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final X0.i f20102j = X0.i.Ltr;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.compose.ui.platform.C1932e a() {
            if (androidx.compose.ui.platform.C1932e.f20100h == null) {
                androidx.compose.ui.platform.C1932e.f20100h = new androidx.compose.ui.platform.C1932e(null);
            }
            androidx.compose.ui.platform.C1932e c1932e = androidx.compose.ui.platform.C1932e.f20100h;
            p247y7.AbstractC7350t.d(c1932e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return c1932e;
        }
    }

    private C1932e() {
        this.f20105e = new android.graphics.Rect();
    }

    public /* synthetic */ C1932e(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    private final int i(int i6, X0.i iVar) {
        M0.K k6 = this.f20103c;
        M0.K k10 = null;
        if (k6 == null) {
            p247y7.AbstractC7350t.p("layoutResult");
            k6 = null;
        }
        int iU = k6.u(i6);
        M0.K k11 = this.f20103c;
        if (k11 == null) {
            p247y7.AbstractC7350t.p("layoutResult");
            k11 = null;
        }
        if (iVar != k11.y(iU)) {
            M0.K k12 = this.f20103c;
            if (k12 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
            } else {
                k10 = k12;
            }
            return k10.u(i6);
        }
        M0.K k13 = this.f20103c;
        if (k13 == null) {
            p247y7.AbstractC7350t.p("layoutResult");
            k13 = null;
        }
        return M0.K.p(k13, i6, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1938g
    public int[] a(int i6) {
        int iN;
        M0.K k6 = null;
        if (d().length() <= 0 || i6 >= d().length()) {
            return null;
        }
        try {
            K0.o oVar = this.f20104d;
            if (oVar == null) {
                p247y7.AbstractC7350t.p("node");
                oVar = null;
            }
            int iRound = java.lang.Math.round(oVar.i().h());
            int iD = E7.j.d(0, i6);
            M0.K k10 = this.f20103c;
            if (k10 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
                k10 = null;
            }
            int iQ = k10.q(iD);
            M0.K k11 = this.f20103c;
            if (k11 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
                k11 = null;
            }
            float fV = k11.v(iQ) + iRound;
            M0.K k12 = this.f20103c;
            if (k12 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
                k12 = null;
            }
            M0.K k13 = this.f20103c;
            if (k13 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
                k13 = null;
            }
            if (fV < k12.v(k13.n() - 1)) {
                M0.K k14 = this.f20103c;
                if (k14 == null) {
                    p247y7.AbstractC7350t.p("layoutResult");
                } else {
                    k6 = k14;
                }
                iN = k6.r(fV);
            } else {
                M0.K k15 = this.f20103c;
                if (k15 == null) {
                    p247y7.AbstractC7350t.p("layoutResult");
                } else {
                    k6 = k15;
                }
                iN = k6.n();
            }
            return c(iD, i(iN - 1, f20102j) + 1);
        } catch (java.lang.IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1938g
    public int[] b(int i6) {
        int iR;
        M0.K k6 = null;
        if (d().length() <= 0 || i6 <= 0) {
            return null;
        }
        try {
            K0.o oVar = this.f20104d;
            if (oVar == null) {
                p247y7.AbstractC7350t.p("node");
                oVar = null;
            }
            int iRound = java.lang.Math.round(oVar.i().h());
            int iG = E7.j.g(d().length(), i6);
            M0.K k10 = this.f20103c;
            if (k10 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
                k10 = null;
            }
            int iQ = k10.q(iG);
            M0.K k11 = this.f20103c;
            if (k11 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
                k11 = null;
            }
            float fV = k11.v(iQ) - iRound;
            if (fV > 0.0f) {
                M0.K k12 = this.f20103c;
                if (k12 == null) {
                    p247y7.AbstractC7350t.p("layoutResult");
                } else {
                    k6 = k12;
                }
                iR = k6.r(fV);
            } else {
                iR = 0;
            }
            if (iG == d().length() && iR < iQ) {
                iR++;
            }
            return c(i(iR, f20101i), iG);
        } catch (java.lang.IllegalStateException unused) {
            return null;
        }
    }

    public final void j(java.lang.String str, M0.K k6, K0.o oVar) {
        f(str);
        this.f20103c = k6;
        this.f20104d = oVar;
    }
}
