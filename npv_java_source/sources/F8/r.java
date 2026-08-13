package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends F8.AbstractC0956q {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final F8.M f2971D;

    public r(F8.M m6) {
        p247y7.AbstractC7350t.f(m6, "delegate");
        this.f2971D = m6;
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: d1 */
    public F8.M a1(boolean z6) {
        return z6 == X0() ? this : f1().a1(z6).c1(V0());
    }

    @Override // F8.t0
    /* JADX INFO: renamed from: e1 */
    public F8.M c1(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "newAttributes");
        return a0Var != V0() ? new F8.O(this, a0Var) : this;
    }

    @Override // F8.AbstractC0956q
    protected F8.M f1() {
        return this.f2971D;
    }
}
