package S7;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends O7.n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S7.a f12614c = new S7.a();

    private a() {
        super("package", false);
    }

    @Override // O7.n0
    public java.lang.Integer a(O7.n0 n0Var) {
        int i6;
        p247y7.AbstractC7350t.f(n0Var, "visibility");
        if (this == n0Var) {
            i6 = 0;
        } else {
            i6 = O7.m0.f8167a.b(n0Var) ? 1 : -1;
        }
        return java.lang.Integer.valueOf(i6);
    }

    @Override // O7.n0
    public java.lang.String b() {
        return "public/*package*/";
    }

    @Override // O7.n0
    public O7.n0 d() {
        return O7.m0.g.f8176c;
    }
}
