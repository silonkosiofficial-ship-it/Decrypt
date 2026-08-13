package C;

/* JADX INFO: loaded from: classes.dex */
public final class v implements C.InterfaceC0837k, D.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f1172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Y0.v f1176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.List f1179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f1180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.lang.Object f1181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator f1182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f1183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f1184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f1185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f1186p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f1187q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1190t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f1191u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f1192v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f1194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f1195y;

    private v(int i6, java.lang.Object obj, boolean z6, int i10, int i11, boolean z10, Y0.v vVar, int i12, int i13, java.util.List list, long j6, java.lang.Object obj2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10, int i14, int i15) {
        this.f1171a = i6;
        this.f1172b = obj;
        this.f1173c = z6;
        this.f1174d = i10;
        this.f1175e = z10;
        this.f1176f = vVar;
        this.f1177g = i12;
        this.f1178h = i13;
        this.f1179i = list;
        this.f1180j = j6;
        this.f1181k = obj2;
        this.f1182l = lazyLayoutItemAnimator;
        this.f1183m = j10;
        this.f1184n = i14;
        this.f1185o = i15;
        this.f1188r = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i16 = 0; i16 < size; i16++) {
            D0.X x6 = (D0.X) list.get(i16);
            iMax = java.lang.Math.max(iMax, i() ? x6.w0() : x6.I0());
        }
        this.f1186p = iMax;
        this.f1187q = E7.j.d(iMax + i11, 0);
        this.f1191u = i() ? Y0.u.a(this.f1174d, iMax) : Y0.u.a(iMax, this.f1174d);
        this.f1192v = Y0.p.f16221b.a();
        this.f1193w = -1;
        this.f1194x = -1;
    }

    public /* synthetic */ v(int i6, java.lang.Object obj, boolean z6, int i10, int i11, boolean z10, Y0.v vVar, int i12, int i13, java.util.List list, long j6, java.lang.Object obj2, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10, int i14, int i15, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, obj, z6, i10, i11, z10, vVar, i12, i13, list, j6, obj2, lazyLayoutItemAnimator, j10, i14, i15);
    }

    private final int p(long j6) {
        return i() ? Y0.p.i(j6) : Y0.p.h(j6);
    }

    private final int r(D0.X x6) {
        return i() ? x6.w0() : x6.I0();
    }

    @Override // C.InterfaceC0837k
    public long a() {
        return this.f1191u;
    }

    @Override // D.y
    public int b() {
        return this.f1179i.size();
    }

    @Override // C.InterfaceC0837k
    public int c() {
        return this.f1193w;
    }

    @Override // D.y
    public void d(boolean z6) {
        this.f1195y = z6;
    }

    @Override // D.y
    public int e() {
        return this.f1187q;
    }

    @Override // D.y
    public int f() {
        return this.f1185o;
    }

    @Override // D.y
    public java.lang.Object g(int i6) {
        return ((D0.X) this.f1179i.get(i6)).Z();
    }

    @Override // C.InterfaceC0837k, D.y
    public int getIndex() {
        return this.f1171a;
    }

    @Override // D.y
    public java.lang.Object getKey() {
        return this.f1172b;
    }

    @Override // D.y
    public long h() {
        return this.f1183m;
    }

    @Override // D.y
    public boolean i() {
        return this.f1173c;
    }

    @Override // D.y
    public long j(int i6) {
        return l();
    }

    @Override // D.y
    public int k() {
        return this.f1184n;
    }

    @Override // C.InterfaceC0837k
    public long l() {
        return this.f1192v;
    }

    @Override // C.InterfaceC0837k
    public int m() {
        return this.f1194x;
    }

    @Override // D.y
    public void n(int i6, int i10, int i11, int i12) {
        u(i6, i10, i11, i12, -1, -1);
    }

    public final void o(int i6) {
        if (s()) {
            return;
        }
        long jL = l();
        int iH = i() ? Y0.p.h(jL) : Y0.p.h(jL) + i6;
        boolean zI = i();
        int i10 = Y0.p.i(jL);
        if (zI) {
            i10 += i6;
        }
        this.f1192v = Y0.q.a(iH, i10);
        int iB = b();
        for (int i11 = 0; i11 < iB; i11++) {
            this.f1182l.d(getKey(), i11);
        }
    }

    public final int q() {
        return this.f1186p;
    }

    public boolean s() {
        return this.f1195y;
    }

    public final void t(D0.X.a aVar) {
        if (this.f1188r == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("position() should be called first".toString());
        }
        int iB = b();
        for (int i6 = 0; i6 < iB; i6++) {
            D0.X x6 = (D0.X) this.f1179i.get(i6);
            r(x6);
            long jL = l();
            this.f1182l.d(getKey(), i6);
            if (this.f1175e) {
                jL = Y0.q.a(i() ? Y0.p.h(jL) : (this.f1188r - Y0.p.h(jL)) - r(x6), i() ? (this.f1188r - Y0.p.i(jL)) - r(x6) : Y0.p.i(jL));
            }
            long jL2 = Y0.p.l(jL, this.f1180j);
            if (i()) {
                D0.X.a.y(aVar, x6, jL2, 0.0f, null, 6, null);
            } else {
                D0.X.a.s(aVar, x6, jL2, 0.0f, null, 6, null);
            }
        }
    }

    public final void u(int i6, int i10, int i11, int i12, int i13, int i14) {
        this.f1188r = i() ? i12 : i11;
        if (!i()) {
            i11 = i12;
        }
        if (i() && this.f1176f == Y0.v.Rtl) {
            i10 = (i11 - i10) - this.f1174d;
        }
        this.f1192v = i() ? Y0.q.a(i10, i6) : Y0.q.a(i6, i10);
        this.f1193w = i13;
        this.f1194x = i14;
        this.f1189s = -this.f1177g;
        this.f1190t = this.f1188r + this.f1178h;
    }

    public final void v(int i6) {
        this.f1188r = i6;
        this.f1190t = i6 + this.f1178h;
    }
}
