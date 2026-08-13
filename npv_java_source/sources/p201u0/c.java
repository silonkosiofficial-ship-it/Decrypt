package p201u0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p201u0.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f55172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f55173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f55174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f55175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.util.List f55176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f55177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p141o0.Q1 f55178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p237x7.l f55179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p237x7.l f55180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.lang.String f55181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f55182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f55183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f55184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f55185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f55186p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f55187q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f55188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f55189s;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(p201u0.l lVar) {
            p201u0.c.this.n(lVar);
            p237x7.l lVarB = p201u0.c.this.b();
            if (lVarB != null) {
                lVarB.l(lVar);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p201u0.l) obj);
            return p087i7.M.f46721a;
        }
    }

    public c() {
        super(null);
        this.f55173c = new java.util.ArrayList();
        this.f55174d = true;
        this.f55175e = p141o0.C7016y0.f52264b.g();
        this.f55176f = p201u0.o.e();
        this.f55177g = true;
        this.f55180j = new u0.c.a();
        this.f55181k = "";
        this.f55185o = 1.0f;
        this.f55186p = 1.0f;
        this.f55189s = true;
    }

    private final boolean h() {
        return !this.f55176f.isEmpty();
    }

    private final void k() {
        this.f55174d = false;
        this.f55175e = p141o0.C7016y0.f52264b.g();
    }

    private final void l(p141o0.AbstractC6984n0 abstractC6984n0) {
        if (this.f55174d && abstractC6984n0 != null) {
            if (abstractC6984n0 instanceof p141o0.f2) {
                m(((p141o0.f2) abstractC6984n0).b());
            } else {
                k();
            }
        }
    }

    private final void m(long j6) {
        if (this.f55174d && j6 != 16) {
            long j10 = this.f55175e;
            if (j10 == 16) {
                this.f55175e = j6;
            } else {
                if (p201u0.o.f(j10, j6)) {
                    return;
                }
                k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(p201u0.l lVar) {
        if (lVar instanceof p201u0.g) {
            p201u0.g gVar = (p201u0.g) lVar;
            l(gVar.e());
            l(gVar.g());
        } else if (lVar instanceof p201u0.c) {
            p201u0.c cVar = (p201u0.c) lVar;
            if (cVar.f55174d && this.f55174d) {
                m(cVar.f55175e);
            } else {
                k();
            }
        }
    }

    private final void x() {
        if (h()) {
            p141o0.Q1 q1A = this.f55178h;
            if (q1A == null) {
                q1A = p141o0.Y.a();
                this.f55178h = q1A;
            }
            p201u0.k.c(this.f55176f, q1A);
        }
    }

    private final void y() {
        float[] fArrC = this.f55172b;
        if (fArrC == null) {
            fArrC = p141o0.J1.c(null, 1, null);
            this.f55172b = fArrC;
        } else {
            p141o0.J1.h(fArrC);
        }
        p141o0.J1.q(fArrC, this.f55183m + this.f55187q, this.f55184n + this.f55188r, 0.0f, 4, null);
        p141o0.J1.k(fArrC, this.f55182l);
        p141o0.J1.l(fArrC, this.f55185o, this.f55186p, 1.0f);
        p141o0.J1.q(fArrC, -this.f55183m, -this.f55184n, 0.0f, 4, null);
    }

    @Override // p201u0.l
    public void a(p161q0.g gVar) {
        if (this.f55189s) {
            y();
            this.f55189s = false;
        }
        if (this.f55177g) {
            x();
            this.f55177g = false;
        }
        p161q0.d dVarF0 = gVar.F0();
        long jI = dVarF0.i();
        dVarF0.h().m();
        try {
            p161q0.j jVarC = dVarF0.c();
            float[] fArr = this.f55172b;
            if (fArr != null) {
                jVarC.a(p141o0.J1.a(fArr).r());
            }
            p141o0.Q1 q6 = this.f55178h;
            if (h() && q6 != null) {
                p161q0.i.a(jVarC, q6, 0, 2, null);
            }
            java.util.List list = this.f55173c;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((p201u0.l) list.get(i6)).a(gVar);
            }
        } finally {
            dVarF0.h().s();
            dVarF0.d(jI);
        }
    }

    @Override // p201u0.l
    public p237x7.l b() {
        return this.f55179i;
    }

    @Override // p201u0.l
    public void d(p237x7.l lVar) {
        this.f55179i = lVar;
    }

    public final int f() {
        return this.f55173c.size();
    }

    public final long g() {
        return this.f55175e;
    }

    public final void i(int i6, p201u0.l lVar) {
        if (i6 < f()) {
            this.f55173c.set(i6, lVar);
        } else {
            this.f55173c.add(lVar);
        }
        n(lVar);
        lVar.d(this.f55180j);
        c();
    }

    public final boolean j() {
        return this.f55174d;
    }

    public final void o(java.util.List list) {
        this.f55176f = list;
        this.f55177g = true;
        c();
    }

    public final void p(java.lang.String str) {
        this.f55181k = str;
        c();
    }

    public final void q(float f6) {
        this.f55183m = f6;
        this.f55189s = true;
        c();
    }

    public final void r(float f6) {
        this.f55184n = f6;
        this.f55189s = true;
        c();
    }

    public final void s(float f6) {
        this.f55182l = f6;
        this.f55189s = true;
        c();
    }

    public final void t(float f6) {
        this.f55185o = f6;
        this.f55189s = true;
        c();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.f55181k);
        java.util.List list = this.f55173c;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            p201u0.l lVar = (p201u0.l) list.get(i6);
            sb.append("\t");
            sb.append(lVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public final void u(float f6) {
        this.f55186p = f6;
        this.f55189s = true;
        c();
    }

    public final void v(float f6) {
        this.f55187q = f6;
        this.f55189s = true;
        c();
    }

    public final void w(float f6) {
        this.f55188r = f6;
        this.f55189s = true;
        c();
    }
}
