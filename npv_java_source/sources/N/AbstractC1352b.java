package N;

/* JADX INFO: renamed from: N.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1352b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final N.AbstractC1352b.a f7404h = new N.AbstractC1352b.a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f7405i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C1332d f7406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M0.K f7408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S0.L f7409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final N.I f7410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f7411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private M0.C1332d f7412g;

    /* JADX INFO: renamed from: N.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private AbstractC1352b(M0.C1332d c1332d, long j6, M0.K k6, S0.L l6, N.I i6) {
        this.f7406a = c1332d;
        this.f7407b = j6;
        this.f7408c = k6;
        this.f7409d = l6;
        this.f7410e = i6;
        this.f7411f = j6;
        this.f7412g = c1332d;
    }

    public /* synthetic */ AbstractC1352b(M0.C1332d c1332d, long j6, M0.K k6, S0.L l6, N.I i6, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, j6, k6, l6, i6);
    }

    private final N.AbstractC1352b C() {
        int iL;
        v().b();
        if (w().length() > 0 && (iL = l()) != -1) {
            T(iL);
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final N.AbstractC1352b E() {
        java.lang.Integer numM;
        v().b();
        if (w().length() > 0 && (numM = m()) != null) {
            T(numM.intValue());
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final N.AbstractC1352b F() {
        int iQ;
        v().b();
        if (w().length() > 0 && (iQ = q()) != -1) {
            T(iQ);
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final N.AbstractC1352b H() {
        java.lang.Integer numT;
        v().b();
        if (w().length() > 0 && (numT = t()) != null) {
            T(numT.intValue());
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int V() {
        return this.f7409d.b(M0.N.i(this.f7411f));
    }

    private final int W() {
        return this.f7409d.b(M0.N.k(this.f7411f));
    }

    private final int X() {
        return this.f7409d.b(M0.N.l(this.f7411f));
    }

    private final int a(int i6) {
        return E7.j.g(i6, w().length() - 1);
    }

    private final int g(M0.K k6, int i6) {
        return this.f7409d.a(k6.o(k6.q(i6), true));
    }

    static /* synthetic */ int h(N.AbstractC1352b abstractC1352b, M0.K k6, int i6, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i10 & 1) != 0) {
            i6 = abstractC1352b.W();
        }
        return abstractC1352b.g(k6, i6);
    }

    private final int j(M0.K k6, int i6) {
        return this.f7409d.a(k6.u(k6.q(i6)));
    }

    static /* synthetic */ int k(N.AbstractC1352b abstractC1352b, M0.K k6, int i6, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i10 & 1) != 0) {
            i6 = abstractC1352b.X();
        }
        return abstractC1352b.j(k6, i6);
    }

    private final int n(M0.K k6, int i6) {
        while (i6 < this.f7406a.length()) {
            long jC = k6.C(a(i6));
            if (M0.N.i(jC) > i6) {
                return this.f7409d.a(M0.N.i(jC));
            }
            i6++;
        }
        return this.f7406a.length();
    }

    static /* synthetic */ int o(N.AbstractC1352b abstractC1352b, M0.K k6, int i6, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i10 & 1) != 0) {
            i6 = abstractC1352b.V();
        }
        return abstractC1352b.n(k6, i6);
    }

    private final int r(M0.K k6, int i6) {
        while (i6 > 0) {
            long jC = k6.C(a(i6));
            if (M0.N.n(jC) < i6) {
                return this.f7409d.a(M0.N.n(jC));
            }
            i6--;
        }
        return 0;
    }

    static /* synthetic */ int s(N.AbstractC1352b abstractC1352b, M0.K k6, int i6, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i10 & 1) != 0) {
            i6 = abstractC1352b.V();
        }
        return abstractC1352b.r(k6, i6);
    }

    private final boolean x() {
        M0.K k6 = this.f7408c;
        return (k6 != null ? k6.y(V()) : null) != X0.i.Rtl;
    }

    private final int y(M0.K k6, int i6) {
        int iV = V();
        if (this.f7410e.a() == null) {
            this.f7410e.c(java.lang.Float.valueOf(k6.e(iV).i()));
        }
        int iQ = k6.q(iV) + i6;
        if (iQ < 0) {
            return 0;
        }
        if (iQ >= k6.n()) {
            return w().length();
        }
        float fM = k6.m(iQ) - 1;
        java.lang.Float fA = this.f7410e.a();
        p247y7.AbstractC7350t.c(fA);
        float fFloatValue = fA.floatValue();
        if ((x() && fFloatValue >= k6.t(iQ)) || (!x() && fFloatValue <= k6.s(iQ))) {
            return k6.o(iQ, true);
        }
        return this.f7409d.a(k6.x(p131n0.h.a(fA.floatValue(), fM)));
    }

    public final N.AbstractC1352b A() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                F();
            } else {
                C();
            }
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b B() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                H();
            } else {
                E();
            }
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b D() {
        v().b();
        if (w().length() > 0) {
            int iA = H.AbstractC1233z.a(w(), M0.N.k(this.f7411f));
            if (iA == M0.N.k(this.f7411f) && iA != w().length()) {
                iA = H.AbstractC1233z.a(w(), iA + 1);
            }
            T(iA);
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b G() {
        v().b();
        if (w().length() > 0) {
            int iB = H.AbstractC1233z.b(w(), M0.N.l(this.f7411f));
            if (iB == M0.N.l(this.f7411f) && iB != 0) {
                iB = H.AbstractC1233z.b(w(), iB - 1);
            }
            T(iB);
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b I() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                C();
            } else {
                F();
            }
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b J() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                E();
            } else {
                H();
            }
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b K() {
        v().b();
        if (w().length() > 0) {
            T(w().length());
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b L() {
        v().b();
        if (w().length() > 0) {
            T(0);
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b M() {
        java.lang.Integer numF;
        v().b();
        if (w().length() > 0 && (numF = f()) != null) {
            T(numF.intValue());
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b N() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                P();
            } else {
                M();
            }
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b O() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                M();
            } else {
                P();
            }
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b P() {
        java.lang.Integer numI;
        v().b();
        if (w().length() > 0 && (numI = i()) != null) {
            T(numI.intValue());
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b Q() {
        M0.K k6;
        if (w().length() > 0 && (k6 = this.f7408c) != null) {
            T(y(k6, -1));
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b R() {
        v().b();
        if (w().length() > 0) {
            U(0, w().length());
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b S() {
        if (w().length() > 0) {
            this.f7411f = M0.O.b(M0.N.n(this.f7407b), M0.N.i(this.f7411f));
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    protected final void T(int i6) {
        U(i6, i6);
    }

    protected final void U(int i6, int i10) {
        this.f7411f = M0.O.b(i6, i10);
    }

    public final N.AbstractC1352b b(p237x7.l lVar) {
        v().b();
        if (w().length() > 0) {
            if (M0.N.h(this.f7411f)) {
                p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                lVar.l(this);
            } else {
                boolean zX = x();
                long j6 = this.f7411f;
                T(zX ? M0.N.l(j6) : M0.N.k(j6));
            }
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b c(p237x7.l lVar) {
        v().b();
        if (w().length() > 0) {
            if (M0.N.h(this.f7411f)) {
                p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                lVar.l(this);
            } else {
                boolean zX = x();
                long j6 = this.f7411f;
                T(zX ? M0.N.k(j6) : M0.N.l(j6));
            }
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.AbstractC1352b d() {
        v().b();
        if (w().length() > 0) {
            T(M0.N.i(this.f7411f));
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final M0.C1332d e() {
        return this.f7412g;
    }

    public final java.lang.Integer f() {
        M0.K k6 = this.f7408c;
        if (k6 != null) {
            return java.lang.Integer.valueOf(h(this, k6, 0, 1, null));
        }
        return null;
    }

    public final java.lang.Integer i() {
        M0.K k6 = this.f7408c;
        if (k6 != null) {
            return java.lang.Integer.valueOf(k(this, k6, 0, 1, null));
        }
        return null;
    }

    public final int l() {
        return H.A.a(this.f7412g.i(), M0.N.i(this.f7411f));
    }

    public final java.lang.Integer m() {
        M0.K k6 = this.f7408c;
        if (k6 != null) {
            return java.lang.Integer.valueOf(o(this, k6, 0, 1, null));
        }
        return null;
    }

    public final S0.L p() {
        return this.f7409d;
    }

    public final int q() {
        return H.A.b(this.f7412g.i(), M0.N.i(this.f7411f));
    }

    public final java.lang.Integer t() {
        M0.K k6 = this.f7408c;
        if (k6 != null) {
            return java.lang.Integer.valueOf(s(this, k6, 0, 1, null));
        }
        return null;
    }

    public final long u() {
        return this.f7411f;
    }

    public final N.I v() {
        return this.f7410e;
    }

    public final java.lang.String w() {
        return this.f7412g.i();
    }

    public final N.AbstractC1352b z() {
        M0.K k6;
        if (w().length() > 0 && (k6 = this.f7408c) != null) {
            T(y(k6, 1));
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
