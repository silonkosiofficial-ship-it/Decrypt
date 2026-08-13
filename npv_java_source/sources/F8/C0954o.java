package F8;

/* JADX INFO: renamed from: F8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0954o extends F8.AbstractC0956q implements F8.InterfaceC0952m, J8.e {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final F8.C0954o.a f2958F = new F8.C0954o.a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final F8.M f2959D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f2960E;

    /* JADX INFO: renamed from: F8.o$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final boolean a(F8.t0 t0Var) {
            t0Var.W0();
            return (t0Var.W0().w() instanceof O7.f0) || (t0Var instanceof G8.i);
        }

        public static /* synthetic */ F8.C0954o c(F8.C0954o.a aVar, F8.t0 t0Var, boolean z6, boolean z10, int i6, java.lang.Object obj) {
            if ((i6 & 2) != 0) {
                z6 = false;
            }
            if ((i6 & 4) != 0) {
                z10 = false;
            }
            return aVar.b(t0Var, z6, z10);
        }

        private final boolean d(F8.t0 t0Var, boolean z6) {
            if (!a(t0Var)) {
                return false;
            }
            O7.InterfaceC1427h interfaceC1427hW = t0Var.W0().w();
            R7.K k6 = interfaceC1427hW instanceof R7.K ? (R7.K) interfaceC1427hW : null;
            if (k6 == null || k6.c1()) {
                return (z6 && (t0Var.W0().w() instanceof O7.f0)) ? F8.q0.l(t0Var) : !G8.n.f3160a.a(t0Var);
            }
            return true;
        }

        public final F8.C0954o b(F8.t0 t0Var, boolean z6, boolean z10) {
            p247y7.AbstractC7350t.f(t0Var, "type");
            if (t0Var instanceof F8.C0954o) {
                return (F8.C0954o) t0Var;
            }
            p247y7.AbstractC7342k abstractC7342k = null;
            if (!z10 && !d(t0Var, z6)) {
                return null;
            }
            if (t0Var instanceof F8.AbstractC0963y) {
                F8.AbstractC0963y abstractC0963y = (F8.AbstractC0963y) t0Var;
                p247y7.AbstractC7350t.b(abstractC0963y.e1().W0(), abstractC0963y.f1().W0());
            }
            return new F8.C0954o(F8.B.c(t0Var).a1(false), z6, abstractC7342k);
        }
    }

    private C0954o(F8.M m6, boolean z6) {
        this.f2959D = m6;
        this.f2960E = z6;
    }

    public /* synthetic */ C0954o(F8.M m6, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(m6, z6);
    }

    @Override // F8.InterfaceC0952m
    public boolean J0() {
        f1().W0();
        return f1().W0().w() instanceof O7.f0;
    }

    @Override // F8.InterfaceC0952m
    public F8.E Q(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "replacement");
        return F8.Q.e(e6.Z0(), this.f2960E);
    }

    @Override // F8.AbstractC0956q, F8.E
    public boolean X0() {
        return false;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: d1 */
    public F8.M a1(boolean z6) {
        return z6 ? f1().a1(z6) : this;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: e1 */
    public F8.M c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return new F8.C0954o(f1().c1(a0Var), this.f2960E);
    }

    @Override // F8.AbstractC0956q
    protected F8.M f1() {
        return this.f2959D;
    }

    public final F8.M i1() {
        return this.f2959D;
    }

    @Override // F8.AbstractC0956q
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public F8.C0954o h1(F8.M m6) {
        p247y7.AbstractC7350t.f(m6, "delegate");
        return new F8.C0954o(m6, this.f2960E);
    }

    @Override // F8.M
    public java.lang.String toString() {
        return f1() + " & Any";
    }
}
