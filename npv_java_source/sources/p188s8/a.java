package p188s8;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends F8.M implements J8.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final F8.i0 f54402D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p188s8.b f54403E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f54404F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final F8.a0 f54405G;

    public a(F8.i0 i0Var, p188s8.b bVar, boolean z6, F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(i0Var, "typeProjection");
        p247y7.AbstractC7350t.f(bVar, "constructor");
        p247y7.AbstractC7350t.f(a0Var, "attributes");
        this.f54402D = i0Var;
        this.f54403E = bVar;
        this.f54404F = z6;
        this.f54405G = a0Var;
    }

    public /* synthetic */ a(F8.i0 i0Var, p188s8.b bVar, boolean z6, F8.a0 a0Var, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(i0Var, (i6 & 2) != 0 ? new p188s8.c(i0Var) : bVar, (i6 & 4) != 0 ? false : z6, (i6 & 8) != 0 ? F8.a0.f2872D.i() : a0Var);
    }

    @Override // F8.E
    public java.util.List U0() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // F8.E
    public F8.a0 V0() {
        return this.f54405G;
    }

    @Override // F8.E
    public boolean X0() {
        return this.f54404F;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: e1 */
    public F8.M c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return new p188s8.a(this.f54402D, W0(), X0(), a0Var);
    }

    @Override // F8.E
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public p188s8.b W0() {
        return this.f54403E;
    }

    @Override // F8.M
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public p188s8.a a1(boolean z6) {
        return z6 == X0() ? this : new p188s8.a(this.f54402D, W0(), z6, V0());
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public p188s8.a g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        F8.i0 i0VarV = this.f54402D.v(gVar);
        p247y7.AbstractC7350t.e(i0VarV, "refine(...)");
        return new p188s8.a(i0VarV, W0(), X0(), V0());
    }

    @Override // F8.M
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Captured(");
        sb.append(this.f54402D);
        sb.append(')');
        sb.append(X0() ? "?" : "");
        return sb.toString();
    }

    @Override // F8.E
    public p248y8.h u() {
        return H8.k.a(H8.g.CAPTURED_TYPE_SCOPE, true, new java.lang.String[0]);
    }
}
