package S;

/* JADX INFO: loaded from: classes.dex */
final class u1 implements S.t1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final S.u1.a f11811f = new S.u1.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1753w0 f11813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1753w0 f11814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.InterfaceC1745s0 f11815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V.InterfaceC1745s0 f11816e;

    public static final class a {

        /* JADX INFO: renamed from: S.u1$a$a, reason: collision with other inner class name */
        static final class C0256a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final S.u1.a.C0256a f11817D = new S.u1.a.C0256a();

            C0256a() {
                super(2);
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.List u(p041e0.l lVar, S.u1 u1Var) {
                return p097j7.AbstractC6879v.p(java.lang.Integer.valueOf(u1Var.b()), java.lang.Integer.valueOf(u1Var.a()), java.lang.Boolean.valueOf(u1Var.h()));
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final S.u1.a.b f11818D = new S.u1.a.b();

            b() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final S.u1 l(java.util.List list) {
                java.lang.Object obj = list.get(0);
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((java.lang.Integer) obj).intValue();
                java.lang.Object obj2 = list.get(1);
                p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                java.lang.Object obj3 = list.get(2);
                p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                return new S.u1(iIntValue, iIntValue2, ((java.lang.Boolean) obj3).booleanValue());
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p041e0.j a() {
            return p041e0.k.a(S.u1.a.C0256a.f11817D, S.u1.a.b.f11818D);
        }
    }

    public u1(int i6, int i10, boolean z6) {
        if (i6 < 0 || i6 >= 24) {
            throw new java.lang.IllegalArgumentException("initialHour should in [0..23] range".toString());
        }
        if (i10 < 0 || i10 >= 60) {
            throw new java.lang.IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        this.f11812a = z6;
        this.f11813b = V.A1.d(S.s1.c(S.s1.f11748b.a()), null, 2, null);
        this.f11814c = V.A1.d(java.lang.Boolean.valueOf(i6 >= 12), null, 2, null);
        this.f11815d = V.AbstractC1730l1.a(i6 % 12);
        this.f11816e = V.AbstractC1730l1.a(i10);
    }

    @Override // S.t1
    public int a() {
        return this.f11816e.d();
    }

    @Override // S.t1
    public int b() {
        return this.f11815d.d() + (i() ? 12 : 0);
    }

    @Override // S.t1
    public void c(boolean z6) {
        this.f11814c.setValue(java.lang.Boolean.valueOf(z6));
    }

    @Override // S.t1
    public void d(int i6) {
        c(i6 >= 12);
        this.f11815d.i(i6 % 12);
    }

    @Override // S.t1
    public void e(int i6) {
        this.f11816e.i(i6);
    }

    @Override // S.t1
    public void f(int i6) {
        this.f11813b.setValue(S.s1.c(i6));
    }

    @Override // S.t1
    public int g() {
        return ((S.s1) this.f11813b.getValue()).i();
    }

    @Override // S.t1
    public boolean h() {
        return this.f11812a;
    }

    @Override // S.t1
    public boolean i() {
        return ((java.lang.Boolean) this.f11814c.getValue()).booleanValue();
    }
}
