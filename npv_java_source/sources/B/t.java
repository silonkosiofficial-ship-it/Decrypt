package B;

/* JADX INFO: loaded from: classes.dex */
public final class t implements B.l, D.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.c.b f467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p071h0.c.InterfaceC0526c f468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Y0.v f469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.lang.Object f475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.lang.Object f476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator f477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f483t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f488y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int[] f489z;

    private t(int i6, java.util.List list, boolean z6, h0.c.b bVar, p071h0.c.InterfaceC0526c interfaceC0526c, Y0.v vVar, boolean z10, int i10, int i11, int i12, long j6, java.lang.Object obj, java.lang.Object obj2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10) {
        this.f464a = i6;
        this.f465b = list;
        this.f466c = z6;
        this.f467d = bVar;
        this.f468e = interfaceC0526c;
        this.f469f = vVar;
        this.f470g = z10;
        this.f471h = i10;
        this.f472i = i11;
        this.f473j = i12;
        this.f474k = j6;
        this.f475l = obj;
        this.f476m = obj2;
        this.f477n = lazyLayoutItemAnimator;
        this.f478o = j10;
        this.f482s = 1;
        this.f486w = Integer.MIN_VALUE;
        int size = list.size();
        int iW0 = 0;
        int iMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            D0.X x6 = (D0.X) list.get(i13);
            iW0 += i() ? x6.w0() : x6.I0();
            iMax = java.lang.Math.max(iMax, !i() ? x6.w0() : x6.I0());
        }
        this.f480q = iW0;
        this.f483t = E7.j.d(a() + this.f473j, 0);
        this.f484u = iMax;
        this.f489z = new int[this.f465b.size() * 2];
    }

    public /* synthetic */ t(int i6, java.util.List list, boolean z6, h0.c.b bVar, p071h0.c.InterfaceC0526c interfaceC0526c, Y0.v vVar, boolean z10, int i10, int i11, int i12, long j6, java.lang.Object obj, java.lang.Object obj2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, list, z6, bVar, interfaceC0526c, vVar, z10, i10, i11, i12, j6, obj, obj2, lazyLayoutItemAnimator, j10);
    }

    private final int o(long j6) {
        return i() ? Y0.p.i(j6) : Y0.p.h(j6);
    }

    private final int p(D0.X x6) {
        return i() ? x6.w0() : x6.I0();
    }

    @Override // B.l
    public int a() {
        return this.f480q;
    }

    @Override // D.y
    public int b() {
        return this.f465b.size();
    }

    @Override // B.l
    public int c() {
        return this.f479p;
    }

    @Override // D.y
    public void d(boolean z6) {
        this.f485v = z6;
    }

    @Override // D.y
    public int e() {
        return this.f483t;
    }

    @Override // D.y
    public int f() {
        return this.f482s;
    }

    @Override // D.y
    public java.lang.Object g(int i6) {
        return ((D0.X) this.f465b.get(i6)).Z();
    }

    @Override // B.l, D.y
    public int getIndex() {
        return this.f464a;
    }

    @Override // D.y
    public java.lang.Object getKey() {
        return this.f475l;
    }

    @Override // D.y
    public long h() {
        return this.f478o;
    }

    @Override // D.y
    public boolean i() {
        return this.f466c;
    }

    @Override // D.y
    public long j(int i6) {
        int[] iArr = this.f489z;
        int i10 = i6 * 2;
        return Y0.q.a(iArr[i10], iArr[i10 + 1]);
    }

    @Override // D.y
    public int k() {
        return this.f481r;
    }

    public final void l(int i6, boolean z6) {
        if (q()) {
            return;
        }
        this.f479p = c() + i6;
        int length = this.f489z.length;
        for (int i10 = 0; i10 < length; i10++) {
            if ((i() && i10 % 2 == 1) || (!i() && i10 % 2 == 0)) {
                int[] iArr = this.f489z;
                iArr[i10] = iArr[i10] + i6;
            }
        }
        if (z6) {
            int iB = b();
            for (int i11 = 0; i11 < iB; i11++) {
                this.f477n.d(getKey(), i11);
            }
        }
    }

    public final int m() {
        return this.f484u;
    }

    @Override // D.y
    public void n(int i6, int i10, int i11, int i12) {
        s(i6, i11, i12);
    }

    public boolean q() {
        return this.f485v;
    }

    public final void r(D0.X.a aVar, boolean z6) {
        if (this.f486w == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("position() should be called first".toString());
        }
        int iB = b();
        for (int i6 = 0; i6 < iB; i6++) {
            D0.X x6 = (D0.X) this.f465b.get(i6);
            p(x6);
            long j6 = j(i6);
            this.f477n.d(getKey(), i6);
            if (this.f470g) {
                j6 = Y0.q.a(i() ? Y0.p.h(j6) : (this.f486w - Y0.p.h(j6)) - p(x6), i() ? (this.f486w - Y0.p.i(j6)) - p(x6) : Y0.p.i(j6));
            }
            long jL = Y0.p.l(j6, this.f474k);
            if (i()) {
                D0.X.a.y(aVar, x6, jL, 0.0f, null, 6, null);
            } else {
                D0.X.a.s(aVar, x6, jL, 0.0f, null, 6, null);
            }
        }
    }

    public final void s(int i6, int i10, int i11) {
        int iI0;
        this.f479p = i6;
        this.f486w = i() ? i11 : i10;
        java.util.List list = this.f465b;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            D0.X x6 = (D0.X) list.get(i12);
            int i13 = i12 * 2;
            if (i()) {
                int[] iArr = this.f489z;
                h0.c.b bVar = this.f467d;
                if (bVar == null) {
                    throw new java.lang.IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
                iArr[i13] = bVar.a(x6.I0(), i10, this.f469f);
                this.f489z[i13 + 1] = i6;
                iI0 = x6.w0();
            } else {
                int[] iArr2 = this.f489z;
                iArr2[i13] = i6;
                int i14 = i13 + 1;
                p071h0.c.InterfaceC0526c interfaceC0526c = this.f468e;
                if (interfaceC0526c == null) {
                    throw new java.lang.IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
                iArr2[i14] = interfaceC0526c.a(x6.w0(), i11);
                iI0 = x6.I0();
            }
            i6 += iI0;
        }
        this.f487x = -this.f471h;
        this.f488y = this.f486w + this.f472i;
    }

    public final void t(int i6) {
        this.f486w = i6;
        this.f488y = i6 + this.f472i;
    }
}
