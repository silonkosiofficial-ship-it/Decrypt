package p201u0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p201u0.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f55225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p141o0.AbstractC6984n0 f55226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f55227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.util.List f55228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f55230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f55231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p141o0.AbstractC6984n0 f55232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f55233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f55234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f55235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f55236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f55237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f55238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f55239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f55240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f55241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p161q0.m f55242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p141o0.Q1 f55243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p141o0.Q1 f55244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f55245v;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final u0.g.a f55246D = new u0.g.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p141o0.T1 b() {
            return p141o0.X.a();
        }
    }

    public g() {
        super(null);
        this.f55225b = "";
        this.f55227d = 1.0f;
        this.f55228e = p201u0.o.e();
        this.f55229f = p201u0.o.b();
        this.f55230g = 1.0f;
        this.f55233j = p201u0.o.c();
        this.f55234k = p201u0.o.d();
        this.f55235l = 4.0f;
        this.f55237n = 1.0f;
        this.f55239p = true;
        this.f55240q = true;
        p141o0.Q1 q1A = p141o0.Y.a();
        this.f55243t = q1A;
        this.f55244u = q1A;
        this.f55245v = p087i7.AbstractC6669o.a(p087i7.r.NONE, u0.g.a.f55246D);
    }

    private final p141o0.T1 f() {
        return (p141o0.T1) this.f55245v.getValue();
    }

    private final void v() {
        p201u0.k.c(this.f55228e, this.f55243t);
        w();
    }

    private final void w() {
        if (this.f55236m == 0.0f && this.f55237n == 1.0f) {
            this.f55244u = this.f55243t;
            return;
        }
        if (p247y7.AbstractC7350t.b(this.f55244u, this.f55243t)) {
            this.f55244u = p141o0.Y.a();
        } else {
            int i6 = this.f55244u.i();
            this.f55244u.n();
            this.f55244u.g(i6);
        }
        f().b(this.f55243t, false);
        float fA = f().a();
        float f6 = this.f55236m;
        float f10 = this.f55238o;
        float f11 = ((f6 + f10) % 1.0f) * fA;
        float f12 = ((this.f55237n + f10) % 1.0f) * fA;
        if (f11 <= f12) {
            f().c(f11, f12, this.f55244u, true);
        } else {
            f().c(f11, fA, this.f55244u, true);
            f().c(0.0f, f12, this.f55244u, true);
        }
    }

    @Override // p201u0.l
    public void a(p161q0.g gVar) {
        if (this.f55239p) {
            v();
        } else if (this.f55241r) {
            w();
        }
        this.f55239p = false;
        this.f55241r = false;
        p141o0.AbstractC6984n0 abstractC6984n0 = this.f55226c;
        if (abstractC6984n0 != null) {
            p161q0.f.j(gVar, this.f55244u, abstractC6984n0, this.f55227d, null, null, 0, 56, null);
        }
        p141o0.AbstractC6984n0 abstractC6984n1 = this.f55232i;
        if (abstractC6984n1 != null) {
            p161q0.m mVar = this.f55242s;
            if (this.f55240q || mVar == null) {
                mVar = new p161q0.m(this.f55231h, this.f55235l, this.f55233j, this.f55234k, null, 16, null);
                this.f55242s = mVar;
                this.f55240q = false;
            }
            p161q0.f.j(gVar, this.f55244u, abstractC6984n1, this.f55230g, mVar, null, 0, 48, null);
        }
    }

    public final p141o0.AbstractC6984n0 e() {
        return this.f55226c;
    }

    public final p141o0.AbstractC6984n0 g() {
        return this.f55232i;
    }

    public final void h(p141o0.AbstractC6984n0 abstractC6984n0) {
        this.f55226c = abstractC6984n0;
        c();
    }

    public final void i(float f6) {
        this.f55227d = f6;
        c();
    }

    public final void j(java.lang.String str) {
        this.f55225b = str;
        c();
    }

    public final void k(java.util.List list) {
        this.f55228e = list;
        this.f55239p = true;
        c();
    }

    public final void l(int i6) {
        this.f55229f = i6;
        this.f55244u.g(i6);
        c();
    }

    public final void m(p141o0.AbstractC6984n0 abstractC6984n0) {
        this.f55232i = abstractC6984n0;
        c();
    }

    public final void n(float f6) {
        this.f55230g = f6;
        c();
    }

    public final void o(int i6) {
        this.f55233j = i6;
        this.f55240q = true;
        c();
    }

    public final void p(int i6) {
        this.f55234k = i6;
        this.f55240q = true;
        c();
    }

    public final void q(float f6) {
        this.f55235l = f6;
        this.f55240q = true;
        c();
    }

    public final void r(float f6) {
        this.f55231h = f6;
        this.f55240q = true;
        c();
    }

    public final void s(float f6) {
        this.f55237n = f6;
        this.f55241r = true;
        c();
    }

    public final void t(float f6) {
        this.f55238o = f6;
        this.f55241r = true;
        c();
    }

    public java.lang.String toString() {
        return this.f55243t.toString();
    }

    public final void u(float f6) {
        this.f55236m = f6;
        this.f55241r = true;
        c();
    }
}
