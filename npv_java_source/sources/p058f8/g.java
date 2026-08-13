package p058f8;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends F8.AbstractC0956q implements F8.J {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final F8.M f45320D;

    public g(F8.M m6) {
        p247y7.AbstractC7350t.f(m6, "delegate");
        this.f45320D = m6;
    }

    private final F8.M i1(F8.M m6) {
        F8.M mA1 = m6.a1(false);
        return !K8.a.t(m6) ? mA1 : new p058f8.g(mA1);
    }

    @Override // F8.InterfaceC0952m
    public boolean J0() {
        return true;
    }

    @Override // F8.InterfaceC0952m
    public F8.E Q(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "replacement");
        F8.t0 t0VarZ0 = e6.Z0();
        if (!K8.a.t(t0VarZ0) && !F8.q0.l(t0VarZ0)) {
            return t0VarZ0;
        }
        if (t0VarZ0 instanceof F8.M) {
            return i1((F8.M) t0VarZ0);
        }
        if (t0VarZ0 instanceof F8.AbstractC0963y) {
            F8.AbstractC0963y abstractC0963y = (F8.AbstractC0963y) t0VarZ0;
            return F8.s0.d(F8.F.d(i1(abstractC0963y.e1()), i1(abstractC0963y.f1())), F8.s0.a(t0VarZ0));
        }
        throw new java.lang.IllegalStateException(("Incorrect type: " + t0VarZ0).toString());
    }

    @Override // F8.AbstractC0956q, F8.E
    public boolean X0() {
        return false;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: d1 */
    public F8.M a1(boolean z6) {
        return z6 ? f1().a1(true) : this;
    }

    @Override // F8.AbstractC0956q
    protected F8.M f1() {
        return this.f45320D;
    }

    @Override // F8.M
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public p058f8.g c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return new p058f8.g(f1().c1(a0Var));
    }

    @Override // F8.AbstractC0956q
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public p058f8.g h1(F8.M m6) {
        p247y7.AbstractC7350t.f(m6, "delegate");
        return new p058f8.g(m6);
    }
}
