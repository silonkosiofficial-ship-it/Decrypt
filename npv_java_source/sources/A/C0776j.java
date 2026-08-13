package A;

/* JADX INFO: renamed from: A.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0776j implements D0.I, A.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A.C0768b.m f119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0.c.b f120b;

    /* JADX INFO: renamed from: A.j$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X[] f121D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ A.C0776j f122E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f123F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f124G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ D0.M f125H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int[] f126I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X[] xArr, A.C0776j c0776j, int i6, int i10, D0.M m6, int[] iArr) {
            super(1);
            this.f121D = xArr;
            this.f122E = c0776j;
            this.f123F = i6;
            this.f124G = i10;
            this.f125H = m6;
            this.f126I = iArr;
        }

        public final void a(D0.X.a aVar) {
            D0.X[] xArr = this.f121D;
            A.C0776j c0776j = this.f122E;
            int i6 = this.f123F;
            int i10 = this.f124G;
            D0.M m6 = this.f125H;
            int[] iArr = this.f126I;
            int length = xArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                D0.X x6 = xArr[i11];
                p247y7.AbstractC7350t.c(x6);
                D0.X.a.h(aVar, x6, c0776j.l(x6, A.D.d(x6), i6, i10, m6.getLayoutDirection()), iArr[i12], 0.0f, 4, null);
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

    public C0776j(A.C0768b.m mVar, h0.c.b bVar) {
        this.f119a = mVar;
        this.f120b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l(D0.X x6, A.H h6, int i6, int i10, Y0.v vVar) {
        A.AbstractC0780n abstractC0780nA = h6 != null ? h6.a() : null;
        return abstractC0780nA != null ? abstractC0780nA.a(i6 - x6.I0(), vVar, x6, i10) : this.f120b.a(0, i6 - x6.I0(), vVar);
    }

    @Override // D0.I
    public int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return A.C0789x.f165a.f(list, i6, interfaceC0896o.S0(this.f119a.a()));
    }

    @Override // D0.I
    public D0.K b(D0.M m6, java.util.List list, long j6) {
        return A.G.a(this, Y0.C1859b.m(j6), Y0.C1859b.n(j6), Y0.C1859b.k(j6), Y0.C1859b.l(j6), m6.S0(this.f119a.a()), m6, list, new D0.X[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // D0.I
    public int c(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return A.C0789x.f165a.h(list, i6, interfaceC0896o.S0(this.f119a.a()));
    }

    @Override // A.F
    public long d(int i6, int i10, int i11, int i12, boolean z6) {
        return A.AbstractC0775i.b(z6, i6, i10, i11, i12);
    }

    @Override // D0.I
    public int e(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return A.C0789x.f165a.g(list, i6, interfaceC0896o.S0(this.f119a.a()));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A.C0776j)) {
            return false;
        }
        A.C0776j c0776j = (A.C0776j) obj;
        return p247y7.AbstractC7350t.b(this.f119a, c0776j.f119a) && p247y7.AbstractC7350t.b(this.f120b, c0776j.f120b);
    }

    @Override // A.F
    public void f(int i6, int[] iArr, int[] iArr2, D0.M m6) {
        this.f119a.b(m6, i6, iArr, iArr2);
    }

    @Override // A.F
    public int g(D0.X x6) {
        return x6.I0();
    }

    @Override // A.F
    public D0.K h(D0.X[] xArr, D0.M m6, int i6, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        return D0.L.b(m6, i11, i10, null, new A.C0776j.a(xArr, this, i11, i6, m6, iArr), 4, null);
    }

    public int hashCode() {
        return (this.f119a.hashCode() * 31) + this.f120b.hashCode();
    }

    @Override // A.F
    public int i(D0.X x6) {
        return x6.w0();
    }

    @Override // D0.I
    public int j(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return A.C0789x.f165a.e(list, i6, interfaceC0896o.S0(this.f119a.a()));
    }

    public java.lang.String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f119a + ", horizontalAlignment=" + this.f120b + ')';
    }
}
