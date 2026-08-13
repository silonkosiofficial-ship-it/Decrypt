package H;

/* JADX INFO: renamed from: H.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1230w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H.D f4192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.Q0 f4193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.compose.ui.platform.InterfaceC1975s1 f4194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S0.C1603k f4195d = new S0.C1603k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private S0.d0 f4196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private D0.InterfaceC0900t f4199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private M0.C1332d f4201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4204m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4206o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final H.C1227t f4209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p237x7.l f4210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p237x7.l f4211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p237x7.l f4212u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p141o0.N1 f4213v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f4214w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4215x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final V.InterfaceC1753w0 f4216y;

    /* JADX INFO: renamed from: H.w$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(int i6) {
            H.C1230w.this.f4209r.d(i6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((S0.r) obj).p());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: H.w$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        public final void a(S0.V v6) {
            java.lang.String strI = v6.i();
            M0.C1332d c1332dW = H.C1230w.this.w();
            if (!p247y7.AbstractC7350t.b(strI, c1332dW != null ? c1332dW.i() : null)) {
                H.C1230w.this.B(H.EnumC1220l.None);
            }
            H.C1230w c1230w = H.C1230w.this;
            M0.N.a aVar = M0.N.f6666b;
            c1230w.I(aVar.a());
            H.C1230w.this.A(aVar.a());
            H.C1230w.this.f4210s.l(v6);
            H.C1230w.this.o().invalidate();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((S0.V) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: H.w$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final H.C1230w.c f4219D = new H.C1230w.c();

        c() {
            super(1);
        }

        public final void a(S0.V v6) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((S0.V) obj);
            return p087i7.M.f46721a;
        }
    }

    public C1230w(H.D d6, V.Q0 q6, androidx.compose.ui.platform.InterfaceC1975s1 interfaceC1975s1) {
        this.f4192a = d6;
        this.f4193b = q6;
        this.f4194c = interfaceC1975s1;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f4197f = V.A1.d(bool, null, 2, null);
        this.f4198g = V.A1.d(Y0.i.m(Y0.i.q(0)), null, 2, null);
        this.f4200i = V.A1.d(null, null, 2, null);
        this.f4202k = V.A1.d(H.EnumC1220l.None, null, 2, null);
        this.f4203l = V.A1.d(bool, null, 2, null);
        this.f4204m = V.A1.d(bool, null, 2, null);
        this.f4205n = V.A1.d(bool, null, 2, null);
        this.f4206o = V.A1.d(bool, null, 2, null);
        this.f4207p = true;
        this.f4208q = V.A1.d(java.lang.Boolean.TRUE, null, 2, null);
        this.f4209r = new H.C1227t(interfaceC1975s1);
        this.f4210s = H.C1230w.c.f4219D;
        this.f4211t = new H.C1230w.b();
        this.f4212u = new H.C1230w.a();
        this.f4213v = p141o0.U.a();
        this.f4214w = p141o0.C7016y0.f52264b.g();
        M0.N.a aVar = M0.N.f6666b;
        this.f4215x = V.A1.d(M0.N.b(aVar.a()), null, 2, null);
        this.f4216y = V.A1.d(M0.N.b(aVar.a()), null, 2, null);
    }

    public final void A(long j6) {
        this.f4216y.setValue(M0.N.b(j6));
    }

    public final void B(H.EnumC1220l enumC1220l) {
        this.f4202k.setValue(enumC1220l);
    }

    public final void C(boolean z6) {
        this.f4197f.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void D(boolean z6) {
        this.f4208q.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void E(S0.d0 d0Var) {
        this.f4196e = d0Var;
    }

    public final void F(D0.InterfaceC0900t interfaceC0900t) {
        this.f4199h = interfaceC0900t;
    }

    public final void G(H.V v6) {
        this.f4200i.setValue(v6);
        this.f4207p = false;
    }

    public final void H(float f6) {
        this.f4198g.setValue(Y0.i.m(f6));
    }

    public final void I(long j6) {
        this.f4215x.setValue(M0.N.b(j6));
    }

    public final void J(boolean z6) {
        this.f4206o.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void K(boolean z6) {
        this.f4203l.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void L(boolean z6) {
        this.f4205n.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void M(boolean z6) {
        this.f4204m.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void N(M0.C1332d c1332d, M0.C1332d c1332d2, M0.P p6, boolean z6, Y0.e eVar, R0.AbstractC1494h.b bVar, p237x7.l lVar, H.C1228u c1228u, p121m0.f fVar, long j6) {
        this.f4210s = lVar;
        this.f4214w = j6;
        H.C1227t c1227t = this.f4209r;
        c1227t.f(c1228u);
        c1227t.e(fVar);
        this.f4201j = c1332d;
        H.D dB = H.E.b(this.f4192a, c1332d2, p6, eVar, bVar, (448 & 32) != 0 ? true : z6, (448 & 64) != 0 ? X0.u.f15666a.a() : 0, (448 & 128) != 0 ? Integer.MAX_VALUE : 0, (448 & 256) != 0 ? 1 : 0, p097j7.AbstractC6879v.m());
        if (this.f4192a != dB) {
            this.f4207p = true;
        }
        this.f4192a = dB;
    }

    public final long c() {
        return ((M0.N) this.f4216y.getValue()).r();
    }

    public final H.EnumC1220l d() {
        return (H.EnumC1220l) this.f4202k.getValue();
    }

    public final boolean e() {
        return ((java.lang.Boolean) this.f4197f.getValue()).booleanValue();
    }

    public final p141o0.N1 f() {
        return this.f4213v;
    }

    public final S0.d0 g() {
        return this.f4196e;
    }

    public final androidx.compose.ui.platform.InterfaceC1975s1 h() {
        return this.f4194c;
    }

    public final D0.InterfaceC0900t i() {
        D0.InterfaceC0900t interfaceC0900t = this.f4199h;
        if (interfaceC0900t == null || !interfaceC0900t.K()) {
            return null;
        }
        return interfaceC0900t;
    }

    public final H.V j() {
        return (H.V) this.f4200i.getValue();
    }

    public final float k() {
        return ((Y0.i) this.f4198g.getValue()).v();
    }

    public final p237x7.l l() {
        return this.f4212u;
    }

    public final p237x7.l m() {
        return this.f4211t;
    }

    public final S0.C1603k n() {
        return this.f4195d;
    }

    public final V.Q0 o() {
        return this.f4193b;
    }

    public final long p() {
        return this.f4214w;
    }

    public final long q() {
        return ((M0.N) this.f4215x.getValue()).r();
    }

    public final boolean r() {
        return ((java.lang.Boolean) this.f4206o.getValue()).booleanValue();
    }

    public final boolean s() {
        return ((java.lang.Boolean) this.f4203l.getValue()).booleanValue();
    }

    public final boolean t() {
        return ((java.lang.Boolean) this.f4205n.getValue()).booleanValue();
    }

    public final boolean u() {
        return ((java.lang.Boolean) this.f4204m.getValue()).booleanValue();
    }

    public final H.D v() {
        return this.f4192a;
    }

    public final M0.C1332d w() {
        return this.f4201j;
    }

    public final boolean x() {
        return (M0.N.h(q()) && M0.N.h(c())) ? false : true;
    }

    public final boolean y() {
        return ((java.lang.Boolean) this.f4208q.getValue()).booleanValue();
    }

    public final boolean z() {
        return this.f4207p;
    }
}
