package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1929d extends androidx.compose.ui.platform.AbstractC1923b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static androidx.compose.ui.platform.C1929d f20094f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private M0.K f20097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.compose.ui.platform.C1929d.a f20092d = new androidx.compose.ui.platform.C1929d.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f20093e = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final X0.i f20095g = X0.i.Rtl;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final X0.i f20096h = X0.i.Ltr;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.compose.ui.platform.C1929d a() {
            if (androidx.compose.ui.platform.C1929d.f20094f == null) {
                androidx.compose.ui.platform.C1929d.f20094f = new androidx.compose.ui.platform.C1929d(null);
            }
            androidx.compose.ui.platform.C1929d c1929d = androidx.compose.ui.platform.C1929d.f20094f;
            p247y7.AbstractC7350t.d(c1929d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return c1929d;
        }
    }

    private C1929d() {
    }

    public /* synthetic */ C1929d(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    private final int i(int i6, X0.i iVar) {
        M0.K k6 = this.f20097c;
        M0.K k10 = null;
        if (k6 == null) {
            p247y7.AbstractC7350t.p("layoutResult");
            k6 = null;
        }
        int iU = k6.u(i6);
        M0.K k11 = this.f20097c;
        if (k11 == null) {
            p247y7.AbstractC7350t.p("layoutResult");
            k11 = null;
        }
        if (iVar != k11.y(iU)) {
            M0.K k12 = this.f20097c;
            if (k12 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
            } else {
                k10 = k12;
            }
            return k10.u(i6);
        }
        M0.K k13 = this.f20097c;
        if (k13 == null) {
            p247y7.AbstractC7350t.p("layoutResult");
            k13 = null;
        }
        return M0.K.p(k13, i6, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1938g
    public int[] a(int i6) {
        int iQ;
        if (d().length() <= 0 || i6 >= d().length()) {
            return null;
        }
        if (i6 < 0) {
            M0.K k6 = this.f20097c;
            if (k6 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
                k6 = null;
            }
            iQ = k6.q(0);
        } else {
            M0.K k10 = this.f20097c;
            if (k10 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
                k10 = null;
            }
            int iQ2 = k10.q(i6);
            iQ = i(iQ2, f20095g) == i6 ? iQ2 : iQ2 + 1;
        }
        M0.K k11 = this.f20097c;
        if (k11 == null) {
            p247y7.AbstractC7350t.p("layoutResult");
            k11 = null;
        }
        if (iQ >= k11.n()) {
            return null;
        }
        return c(i(iQ, f20095g), i(iQ, f20096h) + 1);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1938g
    public int[] b(int i6) {
        int iQ;
        if (d().length() <= 0 || i6 <= 0) {
            return null;
        }
        if (i6 > d().length()) {
            M0.K k6 = this.f20097c;
            if (k6 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
                k6 = null;
            }
            iQ = k6.q(d().length());
        } else {
            M0.K k10 = this.f20097c;
            if (k10 == null) {
                p247y7.AbstractC7350t.p("layoutResult");
                k10 = null;
            }
            int iQ2 = k10.q(i6);
            iQ = i(iQ2, f20096h) + 1 == i6 ? iQ2 : iQ2 - 1;
        }
        if (iQ < 0) {
            return null;
        }
        return c(i(iQ, f20095g), i(iQ, f20096h) + 1);
    }

    public final void j(java.lang.String str, M0.K k6) {
        f(str);
        this.f20097c = k6;
    }
}
