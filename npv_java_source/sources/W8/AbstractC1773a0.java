package W8;

/* JADX INFO: renamed from: W8.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1773a0 extends p039d9.h {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f15482E;

    public AbstractC1773a0(int i6) {
        this.f15482E = i6;
    }

    public void a(java.lang.Object obj, java.lang.Throwable th) {
    }

    public abstract p127m7.e c();

    public java.lang.Throwable d(java.lang.Object obj) {
        W8.A a6 = obj instanceof W8.A ? (W8.A) obj : null;
        if (a6 != null) {
            return a6.f15423a;
        }
        return null;
    }

    public java.lang.Object g(java.lang.Object obj) {
        return obj;
    }

    public final void h(java.lang.Throwable th) {
        W8.L.a(c().getContext(), new W8.Q("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract java.lang.Object i();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object objB;
        try {
            p127m7.e eVarC = c();
            p247y7.AbstractC7350t.d(eVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            p019b9.C2121h c2121h = (p019b9.C2121h) eVarC;
            p127m7.e eVar = c2121h.f24357G;
            java.lang.Object obj = c2121h.f24359I;
            p127m7.i context = eVar.getContext();
            java.lang.Object objI = p019b9.K.i(context, obj);
            W8.InterfaceC1822z0 interfaceC1822z0 = null;
            W8.c1 c1VarM = objI != p019b9.K.f24335a ? W8.H.m(eVar, context, objI) : null;
            try {
                p127m7.i context2 = eVar.getContext();
                java.lang.Object objI2 = i();
                java.lang.Throwable thD = d(objI2);
                if (thD == null && W8.AbstractC1775b0.b(this.f15482E)) {
                    interfaceC1822z0 = (W8.InterfaceC1822z0) context2.i(W8.InterfaceC1822z0.f15544h);
                }
                if (interfaceC1822z0 != null && !interfaceC1822z0.f()) {
                    java.util.concurrent.CancellationException cancellationExceptionE0 = interfaceC1822z0.e0();
                    a(objI2, cancellationExceptionE0);
                    i7.w.a aVar = p087i7.w.f46751D;
                    objB = p087i7.w.b(p087i7.x.a(cancellationExceptionE0));
                } else if (thD != null) {
                    i7.w.a aVar2 = p087i7.w.f46751D;
                    objB = p087i7.w.b(p087i7.x.a(thD));
                } else {
                    i7.w.a aVar3 = p087i7.w.f46751D;
                    objB = p087i7.w.b(g(objI2));
                }
                eVar.t(objB);
                p087i7.M m6 = p087i7.M.f46721a;
            } finally {
                if (c1VarM == null || c1VarM.k1()) {
                    p019b9.K.f(context, objI);
                }
            }
        } catch (java.lang.Throwable th) {
            h(th);
        }
    }
}
