package G8;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends F8.M implements J8.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final J8.b f3138D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final G8.j f3139E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final F8.t0 f3140F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final F8.a0 f3141G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f3142H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final boolean f3143I;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(J8.b bVar, F8.t0 t0Var, F8.i0 i0Var, O7.f0 f0Var) {
        p247y7.AbstractC7350t.f(bVar, "captureStatus");
        p247y7.AbstractC7350t.f(i0Var, "projection");
        p247y7.AbstractC7350t.f(f0Var, "typeParameter");
        F8.a0 a0Var = null;
        boolean z6 = false;
        boolean z10 = false;
        this(bVar, new G8.j(i0Var, null, null, f0Var, 6, null), t0Var, a0Var, z6, z10, 56, null);
    }

    public i(J8.b bVar, G8.j jVar, F8.t0 t0Var, F8.a0 a0Var, boolean z6, boolean z10) {
        p247y7.AbstractC7350t.f(bVar, "captureStatus");
        p247y7.AbstractC7350t.f(jVar, "constructor");
        p247y7.AbstractC7350t.f(a0Var, "attributes");
        this.f3138D = bVar;
        this.f3139E = jVar;
        this.f3140F = t0Var;
        this.f3141G = a0Var;
        this.f3142H = z6;
        this.f3143I = z10;
    }

    public /* synthetic */ i(J8.b bVar, G8.j jVar, F8.t0 t0Var, F8.a0 a0Var, boolean z6, boolean z10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(bVar, jVar, t0Var, (i6 & 8) != 0 ? F8.a0.f2872D.i() : a0Var, (i6 & 16) != 0 ? false : z6, (i6 & 32) != 0 ? false : z10);
    }

    @Override // F8.E
    public java.util.List U0() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // F8.E
    public F8.a0 V0() {
        return this.f3141G;
    }

    @Override // F8.E
    public boolean X0() {
        return this.f3142H;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: e1 */
    public F8.M c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return new G8.i(this.f3138D, W0(), this.f3140F, a0Var, X0(), this.f3143I);
    }

    public final J8.b f1() {
        return this.f3138D;
    }

    @Override // F8.E
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public G8.j W0() {
        return this.f3139E;
    }

    public final F8.t0 h1() {
        return this.f3140F;
    }

    public final boolean i1() {
        return this.f3143I;
    }

    @Override // F8.M
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public G8.i a1(boolean z6) {
        return new G8.i(this.f3138D, W0(), this.f3140F, V0(), z6, false, 32, null);
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public G8.i g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        J8.b bVar = this.f3138D;
        G8.j jVarF = W0().v(gVar);
        F8.t0 t0Var = this.f3140F;
        return new G8.i(bVar, jVarF, t0Var != null ? gVar.a(t0Var).Z0() : null, V0(), X0(), false, 32, null);
    }

    @Override // F8.E
    public p248y8.h u() {
        return H8.k.a(H8.g.CAPTURED_TYPE_SCOPE, true, new java.lang.String[0]);
    }
}
