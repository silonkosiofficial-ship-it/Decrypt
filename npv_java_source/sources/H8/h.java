package H8;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends F8.M {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final F8.e0 f4430D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p248y8.h f4431E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final H8.j f4432F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.util.List f4433G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f4434H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.lang.String[] f4435I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.lang.String f4436J;

    public h(F8.e0 e0Var, p248y8.h hVar, H8.j jVar, java.util.List list, boolean z6, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(e0Var, "constructor");
        p247y7.AbstractC7350t.f(hVar, "memberScope");
        p247y7.AbstractC7350t.f(jVar, "kind");
        p247y7.AbstractC7350t.f(list, "arguments");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
        this.f4430D = e0Var;
        this.f4431E = hVar;
        this.f4432F = jVar;
        this.f4433G = list;
        this.f4434H = z6;
        this.f4435I = strArr;
        p247y7.V v6 = p247y7.V.f57259a;
        java.lang.String strG = jVar.g();
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        java.lang.String str = java.lang.String.format(strG, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        p247y7.AbstractC7350t.e(str, "format(...)");
        this.f4436J = str;
    }

    public /* synthetic */ h(F8.e0 e0Var, p248y8.h hVar, H8.j jVar, java.util.List list, boolean z6, java.lang.String[] strArr, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(e0Var, hVar, jVar, (i6 & 8) != 0 ? p097j7.AbstractC6879v.m() : list, (i6 & 16) != 0 ? false : z6, strArr);
    }

    @Override // F8.E
    public java.util.List U0() {
        return this.f4433G;
    }

    @Override // F8.E
    public F8.a0 V0() {
        return F8.a0.f2872D.i();
    }

    @Override // F8.E
    public F8.e0 W0() {
        return this.f4430D;
    }

    @Override // F8.E
    public boolean X0() {
        return this.f4434H;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: d1 */
    public F8.M a1(boolean z6) {
        F8.e0 e0VarW0 = W0();
        p248y8.h hVarU = u();
        H8.j jVar = this.f4432F;
        java.util.List listU0 = U0();
        java.lang.String[] strArr = this.f4435I;
        return new H8.h(e0VarW0, hVarU, jVar, listU0, z6, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: e1 */
    public F8.M c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return this;
    }

    public final java.lang.String f1() {
        return this.f4436J;
    }

    public final H8.j g1() {
        return this.f4432F;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public H8.h g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return this;
    }

    public final H8.h i1(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "newArguments");
        F8.e0 e0VarW0 = W0();
        p248y8.h hVarU = u();
        H8.j jVar = this.f4432F;
        boolean zX0 = X0();
        java.lang.String[] strArr = this.f4435I;
        return new H8.h(e0VarW0, hVarU, jVar, list, zX0, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @Override // F8.E
    public p248y8.h u() {
        return this.f4431E;
    }
}
