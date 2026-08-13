package F0;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements F0.p0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final F0.k0.b f2671D = new F0.k0.b(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f2672E = 8;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final p237x7.l f2673F = F0.k0.a.f2675D;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final F0.i0 f2674C;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final F0.k0.a f2675D = new F0.k0.a();

        a() {
            super(1);
        }

        public final void a(F0.k0 k0Var) {
            if (k0Var.R()) {
                k0Var.b().L0();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((F0.k0) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p237x7.l a() {
            return F0.k0.f2673F;
        }
    }

    public k0(F0.i0 i0Var) {
        this.f2674C = i0Var;
    }

    @Override // F0.p0
    public boolean R() {
        return this.f2674C.E0().A1();
    }

    public final F0.i0 b() {
        return this.f2674C;
    }
}
