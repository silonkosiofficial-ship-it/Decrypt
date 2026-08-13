package T7;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements p038d8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T7.l f13309a = new T7.l();

    public static final class a implements p038d8.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final U7.p f13310b;

        public a(U7.p pVar) {
            p247y7.AbstractC7350t.f(pVar, "javaElement");
            this.f13310b = pVar;
        }

        @Override // O7.a0
        public O7.b0 a() {
            O7.b0 b0Var = O7.b0.f8149a;
            p247y7.AbstractC7350t.e(b0Var, "NO_SOURCE_FILE");
            return b0Var;
        }

        @Override // p038d8.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public U7.p b() {
            return this.f13310b;
        }

        public java.lang.String toString() {
            return T7.l.a.class.getName() + ": " + b();
        }
    }

    private l() {
    }

    @Override // p038d8.b
    public p038d8.a a(p048e8.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "javaElement");
        return new T7.l.a((U7.p) lVar);
    }
}
