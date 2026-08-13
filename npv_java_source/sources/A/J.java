package A;

/* JADX INFO: loaded from: classes.dex */
public final class J implements D0.I, A.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A.C0768b.e f10a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p071h0.c.InterfaceC0526c f11b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X[] f12D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ A.J f13E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f14F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f15G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ int[] f16H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X[] xArr, A.J j6, int i6, int i10, int[] iArr) {
            super(1);
            this.f12D = xArr;
            this.f13E = j6;
            this.f14F = i6;
            this.f15G = i10;
            this.f16H = iArr;
        }

        public final void a(D0.X.a aVar) {
            D0.X[] xArr = this.f12D;
            A.J j6 = this.f13E;
            int i6 = this.f14F;
            int i10 = this.f15G;
            int[] iArr = this.f16H;
            int length = xArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                D0.X x6 = xArr[i11];
                p247y7.AbstractC7350t.c(x6);
                D0.X.a.h(aVar, x6, iArr[i12], j6.l(x6, A.D.d(x6), i6, i10), 0.0f, 4, null);
                i11++;
                i12++;
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public J(A.C0768b.e eVar, p071h0.c.InterfaceC0526c interfaceC0526c) {
        this.f10a = eVar;
        this.f11b = interfaceC0526c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l(D0.X x6, A.H h6, int i6, int i10) {
        A.AbstractC0780n abstractC0780nA = h6 != null ? h6.a() : null;
        return abstractC0780nA != null ? abstractC0780nA.a(i6 - x6.w0(), Y0.v.Ltr, x6, i10) : this.f11b.a(0, i6 - x6.w0());
    }

    @Override // D0.I
    public int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return A.C0789x.f165a.b(list, i6, interfaceC0896o.S0(this.f10a.a()));
    }

    @Override // D0.I
    public D0.K b(D0.M m6, java.util.List list, long j6) {
        return A.G.a(this, Y0.C1859b.n(j6), Y0.C1859b.m(j6), Y0.C1859b.l(j6), Y0.C1859b.k(j6), m6.S0(this.f10a.a()), m6, list, new D0.X[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // D0.I
    public int c(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return A.C0789x.f165a.d(list, i6, interfaceC0896o.S0(this.f10a.a()));
    }

    @Override // A.F
    public long d(int i6, int i10, int i11, int i12, boolean z6) {
        return A.I.a(z6, i6, i10, i11, i12);
    }

    @Override // D0.I
    public int e(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return A.C0789x.f165a.c(list, i6, interfaceC0896o.S0(this.f10a.a()));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A.J)) {
            return false;
        }
        A.J j6 = (A.J) obj;
        return p247y7.AbstractC7350t.b(this.f10a, j6.f10a) && p247y7.AbstractC7350t.b(this.f11b, j6.f11b);
    }

    @Override // A.F
    public void f(int i6, int[] iArr, int[] iArr2, D0.M m6) {
        this.f10a.c(m6, i6, iArr, m6.getLayoutDirection(), iArr2);
    }

    @Override // A.F
    public int g(D0.X x6) {
        return x6.w0();
    }

    @Override // A.F
    public D0.K h(D0.X[] xArr, D0.M m6, int i6, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        return D0.L.b(m6, i10, i11, null, new A.J.a(xArr, this, i11, i6, iArr), 4, null);
    }

    public int hashCode() {
        return (this.f10a.hashCode() * 31) + this.f11b.hashCode();
    }

    @Override // A.F
    public int i(D0.X x6) {
        return x6.I0();
    }

    @Override // D0.I
    public int j(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return A.C0789x.f165a.a(list, i6, interfaceC0896o.S0(this.f10a.a()));
    }

    public java.lang.String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f10a + ", verticalAlignment=" + this.f11b + ')';
    }
}
