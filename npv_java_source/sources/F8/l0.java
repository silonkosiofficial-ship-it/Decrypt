package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F8.l0.b f2947a = new F8.l0.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F8.l0 f2948b = new F8.l0.a();

    public static final class a extends F8.l0 {
        a() {
        }

        @Override // F8.l0
        public /* bridge */ /* synthetic */ F8.i0 e(F8.E e6) {
            return (F8.i0) i(e6);
        }

        @Override // F8.l0
        public boolean f() {
            return true;
        }

        public java.lang.Void i(F8.E e6) {
            p247y7.AbstractC7350t.f(e6, "key");
            return null;
        }

        public java.lang.String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static final class c extends F8.l0 {
        c() {
        }

        @Override // F8.l0
        public boolean a() {
            return false;
        }

        @Override // F8.l0
        public boolean b() {
            return false;
        }

        @Override // F8.l0
        public P7.g d(P7.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "annotations");
            return F8.l0.this.d(gVar);
        }

        @Override // F8.l0
        public F8.i0 e(F8.E e6) {
            p247y7.AbstractC7350t.f(e6, "key");
            return F8.l0.this.e(e6);
        }

        @Override // F8.l0
        public boolean f() {
            return F8.l0.this.f();
        }

        @Override // F8.l0
        public F8.E g(F8.E e6, F8.u0 u0Var) {
            p247y7.AbstractC7350t.f(e6, "topLevelType");
            p247y7.AbstractC7350t.f(u0Var, "position");
            return F8.l0.this.g(e6, u0Var);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final F8.n0 c() {
        F8.n0 n0VarG = F8.n0.g(this);
        p247y7.AbstractC7350t.e(n0VarG, "create(...)");
        return n0VarG;
    }

    public P7.g d(P7.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "annotations");
        return gVar;
    }

    public abstract F8.i0 e(F8.E e6);

    public boolean f() {
        return false;
    }

    public F8.E g(F8.E e6, F8.u0 u0Var) {
        p247y7.AbstractC7350t.f(e6, "topLevelType");
        p247y7.AbstractC7350t.f(u0Var, "position");
        return e6;
    }

    public final F8.l0 h() {
        return new F8.l0.c();
    }
}
