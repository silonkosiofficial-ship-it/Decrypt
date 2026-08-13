package H;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H.Q.c f3762f = new H.Q.c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p041e0.j f3763g = p041e0.a.a(H.Q.a.f3769D, H.Q.b.f3770D);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.InterfaceC1742q0 f3764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1742q0 f3765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p131n0.i f3766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f3767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V.InterfaceC1753w0 f3768e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final H.Q.a f3769D = new H.Q.a();

        a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List u(p041e0.l lVar, H.Q q6) {
            return p097j7.AbstractC6879v.p(java.lang.Float.valueOf(q6.d()), java.lang.Boolean.valueOf(q6.f() == p230x.s.Vertical));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final H.Q.b f3770D = new H.Q.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H.Q l(java.util.List list) {
            java.lang.Object obj = list.get(1);
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            p230x.s sVar = ((java.lang.Boolean) obj).booleanValue() ? p230x.s.Vertical : p230x.s.Horizontal;
            java.lang.Object obj2 = list.get(0);
            p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new H.Q(sVar, ((java.lang.Float) obj2).floatValue());
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p041e0.j a() {
            return H.Q.f3763g;
        }
    }

    public Q(p230x.s sVar, float f6) {
        this.f3764a = V.J0.a(f6);
        this.f3765b = V.J0.a(0.0f);
        this.f3766c = p131n0.i.f51317e.a();
        this.f3767d = M0.N.f6666b.a();
        this.f3768e = V.v1.h(sVar, V.v1.p());
    }

    public /* synthetic */ Q(p230x.s sVar, float f6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(sVar, (i6 & 2) != 0 ? 0.0f : f6);
    }

    private final void g(float f6) {
        this.f3765b.h(f6);
    }

    public final void b(float f6, float f10, int i6) {
        float f11;
        float fD = d();
        float f12 = i6;
        float f13 = fD + f12;
        if (f10 <= f13 && (f6 >= fD || f10 - f6 <= f12)) {
            f11 = (f6 >= fD || f10 - f6 > f12) ? 0.0f : f6 - fD;
        } else {
            f11 = f10 - f13;
        }
        h(d() + f11);
    }

    public final float c() {
        return this.f3765b.b();
    }

    public final float d() {
        return this.f3764a.b();
    }

    public final int e(long j6) {
        if (M0.N.n(j6) != M0.N.n(this.f3767d)) {
            return M0.N.n(j6);
        }
        return M0.N.i(j6) != M0.N.i(this.f3767d) ? M0.N.i(j6) : M0.N.l(j6);
    }

    public final p230x.s f() {
        return (p230x.s) this.f3768e.getValue();
    }

    public final void h(float f6) {
        this.f3764a.h(f6);
    }

    public final void i(long j6) {
        this.f3767d = j6;
    }

    public final void j(p230x.s sVar, p131n0.i iVar, int i6, int i10) {
        float f6 = i10 - i6;
        g(f6);
        if (iVar.i() != this.f3766c.i() || iVar.l() != this.f3766c.l()) {
            boolean z6 = sVar == p230x.s.Vertical;
            b(z6 ? iVar.l() : iVar.i(), z6 ? iVar.e() : iVar.j(), i6);
            this.f3766c = iVar;
        }
        h(E7.j.j(d(), 0.0f, f6));
    }
}
