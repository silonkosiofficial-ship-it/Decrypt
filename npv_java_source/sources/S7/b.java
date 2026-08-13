package S7;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends O7.n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S7.b f12615c = new S7.b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // O7.n0
    public java.lang.Integer a(O7.n0 n0Var) {
        p247y7.AbstractC7350t.f(n0Var, "visibility");
        if (p247y7.AbstractC7350t.b(this, n0Var)) {
            return 0;
        }
        if (n0Var == O7.m0.b.f8171c) {
            return null;
        }
        return java.lang.Integer.valueOf(O7.m0.f8167a.b(n0Var) ? 1 : -1);
    }

    @Override // O7.n0
    public java.lang.String b() {
        return "protected/*protected and package*/";
    }

    @Override // O7.n0
    public O7.n0 d() {
        return O7.m0.g.f8176c;
    }
}
