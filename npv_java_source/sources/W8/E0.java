package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E0 extends p019b9.C2128o implements W8.InterfaceC1783f0, W8.InterfaceC1814v0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public W8.F0 f15426F;

    @Override // W8.InterfaceC1814v0
    public W8.K0 a() {
        return null;
    }

    @Override // W8.InterfaceC1783f0
    public void e() {
        v().M0(this);
    }

    @Override // W8.InterfaceC1814v0
    public boolean f() {
        return true;
    }

    @Override // p019b9.C2128o
    public java.lang.String toString() {
        return W8.S.a(this) + '@' + W8.S.b(this) + "[job@" + W8.S.b(v()) + ']';
    }

    public final W8.F0 v() {
        W8.F0 f6 = this.f15426F;
        if (f6 != null) {
            return f6;
        }
        p247y7.AbstractC7350t.p("job");
        return null;
    }

    public abstract boolean w();

    public abstract void x(java.lang.Throwable th);

    public final void y(W8.F0 f6) {
        this.f15426F = f6;
    }
}
