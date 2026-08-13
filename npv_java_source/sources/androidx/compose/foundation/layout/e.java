package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class e implements D0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p071h0.c f19245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19246b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.foundation.layout.e.a f19247D = new androidx.compose.foundation.layout.e.a();

        a() {
            super(1);
        }

        public final void a(D0.X.a aVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f19248D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ D0.G f19249E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D0.M f19250F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f19251G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f19252H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.e f19253I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D0.X x6, D0.G g6, D0.M m6, int i6, int i10, androidx.compose.foundation.layout.e eVar) {
            super(1);
            this.f19248D = x6;
            this.f19249E = g6;
            this.f19250F = m6;
            this.f19251G = i6;
            this.f19252H = i10;
            this.f19253I = eVar;
        }

        public final void a(D0.X.a aVar) {
            androidx.compose.foundation.layout.d.i(aVar, this.f19248D, this.f19249E, this.f19250F.getLayoutDirection(), this.f19251G, this.f19252H, this.f19253I.f19245a);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X[] f19254D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.util.List f19255E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ D0.M f19256F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p247y7.M f19257G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p247y7.M f19258H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.e f19259I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(D0.X[] xArr, java.util.List list, D0.M m6, p247y7.M m10, p247y7.M m11, androidx.compose.foundation.layout.e eVar) {
            super(1);
            this.f19254D = xArr;
            this.f19255E = list;
            this.f19256F = m6;
            this.f19257G = m10;
            this.f19258H = m11;
            this.f19259I = eVar;
        }

        public final void a(D0.X.a aVar) {
            D0.X[] xArr = this.f19254D;
            java.util.List list = this.f19255E;
            D0.M m6 = this.f19256F;
            p247y7.M m10 = this.f19257G;
            p247y7.M m11 = this.f19258H;
            androidx.compose.foundation.layout.e eVar = this.f19259I;
            int length = xArr.length;
            int i6 = 0;
            int i10 = 0;
            while (i6 < length) {
                D0.X x6 = xArr[i6];
                p247y7.AbstractC7350t.d(x6, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                androidx.compose.foundation.layout.d.i(aVar, x6, (D0.G) list.get(i10), m6.getLayoutDirection(), m10.f57252C, m11.f57252C, eVar.f19245a);
                i6++;
                i10++;
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public e(p071h0.c cVar, boolean z6) {
        this.f19245a = cVar;
        this.f19246b = z6;
    }

    @Override // D0.I
    public /* synthetic */ int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return D0.H.b(this, interfaceC0896o, list, i6);
    }

    @Override // D0.I
    public D0.K b(D0.M m6, java.util.List list, long j6) {
        int iN;
        int iM;
        D0.X xU;
        if (list.isEmpty()) {
            return D0.L.b(m6, Y0.C1859b.n(j6), Y0.C1859b.m(j6), null, androidx.compose.foundation.layout.e.a.f19247D, 4, null);
        }
        long jD = this.f19246b ? j6 : Y0.C1859b.d(j6, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            D0.G g6 = (D0.G) list.get(0);
            if (androidx.compose.foundation.layout.d.g(g6)) {
                iN = Y0.C1859b.n(j6);
                iM = Y0.C1859b.m(j6);
                xU = g6.U(Y0.C1859b.f16201b.c(Y0.C1859b.n(j6), Y0.C1859b.m(j6)));
            } else {
                xU = g6.U(jD);
                iN = java.lang.Math.max(Y0.C1859b.n(j6), xU.I0());
                iM = java.lang.Math.max(Y0.C1859b.m(j6), xU.w0());
            }
            int i6 = iN;
            int i10 = iM;
            return D0.L.b(m6, i6, i10, null, new androidx.compose.foundation.layout.e.b(xU, g6, m6, i6, i10, this), 4, null);
        }
        D0.X[] xArr = new D0.X[list.size()];
        p247y7.M m10 = new p247y7.M();
        m10.f57252C = Y0.C1859b.n(j6);
        p247y7.M m11 = new p247y7.M();
        m11.f57252C = Y0.C1859b.m(j6);
        int size = list.size();
        boolean z6 = false;
        for (int i11 = 0; i11 < size; i11++) {
            D0.G g10 = (D0.G) list.get(i11);
            if (androidx.compose.foundation.layout.d.g(g10)) {
                z6 = true;
            } else {
                D0.X xU2 = g10.U(jD);
                xArr[i11] = xU2;
                m10.f57252C = java.lang.Math.max(m10.f57252C, xU2.I0());
                m11.f57252C = java.lang.Math.max(m11.f57252C, xU2.w0());
            }
        }
        if (z6) {
            int i12 = m10.f57252C;
            int i13 = i12 != Integer.MAX_VALUE ? i12 : 0;
            int i14 = m11.f57252C;
            long jA = Y0.c.a(i13, i12, i14 != Integer.MAX_VALUE ? i14 : 0, i14);
            int size2 = list.size();
            for (int i15 = 0; i15 < size2; i15++) {
                D0.G g11 = (D0.G) list.get(i15);
                if (androidx.compose.foundation.layout.d.g(g11)) {
                    xArr[i15] = g11.U(jA);
                }
            }
        }
        return D0.L.b(m6, m10.f57252C, m11.f57252C, null, new androidx.compose.foundation.layout.e.c(xArr, list, m6, m10, m11, this), 4, null);
    }

    @Override // D0.I
    public /* synthetic */ int c(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return D0.H.d(this, interfaceC0896o, list, i6);
    }

    @Override // D0.I
    public /* synthetic */ int e(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return D0.H.c(this, interfaceC0896o, list, i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.layout.e)) {
            return false;
        }
        androidx.compose.foundation.layout.e eVar = (androidx.compose.foundation.layout.e) obj;
        return p247y7.AbstractC7350t.b(this.f19245a, eVar.f19245a) && this.f19246b == eVar.f19246b;
    }

    public int hashCode() {
        return (this.f19245a.hashCode() * 31) + p190t.h.a(this.f19246b);
    }

    @Override // D0.I
    public /* synthetic */ int j(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return D0.H.a(this, interfaceC0896o, list, i6);
    }

    public java.lang.String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f19245a + ", propagateMinConstraints=" + this.f19246b + ')';
    }
}
