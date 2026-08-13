package F8;

/* JADX INFO: loaded from: classes2.dex */
public interface X {

    public static final class a implements F8.X {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final F8.X.a f2869a = new F8.X.a();

        private a() {
        }

        @Override // F8.X
        public void a(F8.n0 n0Var, F8.E e6, F8.E e10, O7.f0 f0Var) {
            p247y7.AbstractC7350t.f(n0Var, "substitutor");
            p247y7.AbstractC7350t.f(e6, "unsubstitutedArgument");
            p247y7.AbstractC7350t.f(e10, "argument");
            p247y7.AbstractC7350t.f(f0Var, "typeParameter");
        }

        @Override // F8.X
        public void b(P7.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "annotation");
        }

        @Override // F8.X
        public void c(O7.e0 e0Var, O7.f0 f0Var, F8.E e6) {
            p247y7.AbstractC7350t.f(e0Var, "typeAlias");
            p247y7.AbstractC7350t.f(e6, "substitutedArgument");
        }

        @Override // F8.X
        public void d(O7.e0 e0Var) {
            p247y7.AbstractC7350t.f(e0Var, "typeAlias");
        }
    }

    void a(F8.n0 n0Var, F8.E e6, F8.E e10, O7.f0 f0Var);

    void b(P7.c cVar);

    void c(O7.e0 e0Var, O7.f0 f0Var, F8.E e6);

    void d(O7.e0 e0Var);
}
