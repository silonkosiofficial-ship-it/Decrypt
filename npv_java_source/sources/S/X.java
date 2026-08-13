package S;

/* JADX INFO: loaded from: classes.dex */
final class X extends F0.AbstractC0927m implements F0.InterfaceC0921h, F0.i0 {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final p250z.j f10563R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final boolean f10564S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final float f10565T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final p141o0.B0 f10566U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private F0.InterfaceC0924j f10567V;

    static final class a implements p141o0.B0 {
        a() {
        }

        @Override // p141o0.B0
        public final long a() {
            long jA = S.X.this.f10566U.a();
            if (jA != 16) {
                return jA;
            }
            S.G0 g6 = (S.G0) F0.AbstractC0923i.a(S.X.this, S.I0.a());
            return (g6 == null || g6.a() == 16) ? ((p141o0.C7016y0) F0.AbstractC0923i.a(S.X.this, S.J.a())).w() : g6.a();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R.g b() {
            R.g gVarB;
            S.G0 g6 = (S.G0) F0.AbstractC0923i.a(S.X.this, S.I0.a());
            return (g6 == null || (gVarB = g6.b()) == null) ? S.H0.f10011a.a() : gVarB;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        public final void a() {
            if (((S.G0) F0.AbstractC0923i.a(S.X.this, S.I0.a())) == null) {
                S.X.this.e2();
            } else if (S.X.this.f10567V == null) {
                S.X.this.d2();
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    private X(p250z.j jVar, boolean z6, float f6, p141o0.B0 b6) {
        this.f10563R = jVar;
        this.f10564S = z6;
        this.f10565T = f6;
        this.f10566U = b6;
    }

    public /* synthetic */ X(p250z.j jVar, boolean z6, float f6, p141o0.B0 b6, p247y7.AbstractC7342k abstractC7342k) {
        this(jVar, z6, f6, b6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2() {
        this.f10567V = T1(R.p.c(this.f10563R, this.f10564S, this.f10565T, new S.X.a(), new S.X.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2() {
        F0.InterfaceC0924j interfaceC0924j = this.f10567V;
        if (interfaceC0924j != null) {
            W1(interfaceC0924j);
        }
    }

    private final void f2() {
        F0.j0.a(this, new S.X.c());
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        f2();
    }

    @Override // F0.i0
    public void L0() {
        f2();
    }
}
