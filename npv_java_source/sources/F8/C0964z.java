package F8;

/* JADX INFO: renamed from: F8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0964z extends F8.AbstractC0963y implements F8.InterfaceC0952m {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final F8.C0964z.a f2989G = new F8.C0964z.a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static boolean f2990H;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f2991F;

    /* JADX INFO: renamed from: F8.z$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0964z(F8.M m6, F8.M m10) {
        super(m6, m10);
        p247y7.AbstractC7350t.f(m6, "lowerBound");
        p247y7.AbstractC7350t.f(m10, "upperBound");
    }

    private final void i1() {
        if (!f2990H || this.f2991F) {
            return;
        }
        this.f2991F = true;
        F8.B.b(e1());
        F8.B.b(f1());
        p247y7.AbstractC7350t.b(e1(), f1());
        G8.e.f3134a.d(e1(), f1());
    }

    @Override // F8.InterfaceC0952m
    public boolean J0() {
        return (e1().W0().w() instanceof O7.f0) && p247y7.AbstractC7350t.b(e1().W0(), f1().W0());
    }

    @Override // F8.InterfaceC0952m
    public F8.E Q(F8.E e6) {
        F8.t0 t0VarD;
        p247y7.AbstractC7350t.f(e6, "replacement");
        F8.t0 t0VarZ0 = e6.Z0();
        if (t0VarZ0 instanceof F8.AbstractC0963y) {
            t0VarD = t0VarZ0;
        } else {
            if (!(t0VarZ0 instanceof F8.M)) {
                throw new p087i7.s();
            }
            F8.M m6 = (F8.M) t0VarZ0;
            t0VarD = F8.F.d(m6, m6.a1(true));
        }
        return F8.s0.b(t0VarD, t0VarZ0);
    }

    @Override // F8.t0
    public F8.t0 a1(boolean z6) {
        return F8.F.d(e1().a1(z6), f1().a1(z6));
    }

    @Override // F8.t0
    public F8.t0 c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return F8.F.d(e1().c1(a0Var), f1().c1(a0Var));
    }

    @Override // F8.AbstractC0963y
    public F8.M d1() {
        i1();
        return e1();
    }

    @Override // F8.AbstractC0963y
    public java.lang.String g1(p168q8.c cVar, p168q8.f fVar) {
        p247y7.AbstractC7350t.f(cVar, "renderer");
        p247y7.AbstractC7350t.f(fVar, "options");
        if (!fVar.n()) {
            return cVar.t(cVar.w(e1()), cVar.w(f1()), K8.a.i(this));
        }
        return '(' + cVar.w(e1()) + ".." + cVar.w(f1()) + ')';
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public F8.AbstractC0963y g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        F8.E eA = gVar.a(e1());
        p247y7.AbstractC7350t.d(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        F8.E eA2 = gVar.a(f1());
        p247y7.AbstractC7350t.d(eA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new F8.C0964z((F8.M) eA, (F8.M) eA2);
    }

    @Override // F8.AbstractC0963y
    public java.lang.String toString() {
        return '(' + e1() + ".." + f1() + ')';
    }
}
