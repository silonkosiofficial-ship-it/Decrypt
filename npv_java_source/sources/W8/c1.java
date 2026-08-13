package W8;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends p019b9.z {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.lang.ThreadLocal f15490G;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public c1(p127m7.i iVar, p127m7.e eVar) {
        W8.d1 d1Var = W8.d1.f15495C;
        super(iVar.i(d1Var) == null ? iVar.o0(d1Var) : iVar, eVar);
        this.f15490G = new java.lang.ThreadLocal();
        if (eVar.getContext().i(p127m7.f.f51196A) instanceof W8.J) {
            return;
        }
        java.lang.Object objI = p019b9.K.i(iVar, null);
        p019b9.K.f(iVar, objI);
        n1(iVar, objI);
    }

    @Override // p019b9.z, W8.AbstractC1772a
    protected void g1(java.lang.Object obj) {
        if (this.threadLocalIsSet) {
            p087i7.u uVar = (p087i7.u) this.f15490G.get();
            if (uVar != null) {
                p019b9.K.f((p127m7.i) uVar.a(), uVar.b());
            }
            this.f15490G.remove();
        }
        java.lang.Object objA = W8.C.a(obj, this.f24391F);
        p127m7.e eVar = this.f24391F;
        p127m7.i context = eVar.getContext();
        java.lang.Object objI = p019b9.K.i(context, null);
        W8.c1 c1VarM = objI != p019b9.K.f24335a ? W8.H.m(eVar, context, objI) : null;
        try {
            this.f24391F.t(objA);
            p087i7.M m6 = p087i7.M.f46721a;
        } finally {
            if (c1VarM == null || c1VarM.k1()) {
                p019b9.K.f(context, objI);
            }
        }
    }

    public final boolean k1() {
        boolean z6 = this.threadLocalIsSet && this.f15490G.get() == null;
        this.f15490G.remove();
        return !z6;
    }

    public final void n1(p127m7.i iVar, java.lang.Object obj) {
        this.threadLocalIsSet = true;
        this.f15490G.set(p087i7.B.a(iVar, obj));
    }
}
