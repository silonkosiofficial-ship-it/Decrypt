package p200u;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55122a;

    private v0() {
        this.f55122a = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);
    }

    public /* synthetic */ v0(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract java.lang.Object a();

    public abstract java.lang.Object b();

    public final boolean c() {
        return ((java.lang.Boolean) this.f55122a.getValue()).booleanValue();
    }

    public abstract void d(java.lang.Object obj);

    public final void e(boolean z6) {
        this.f55122a.setValue(java.lang.Boolean.valueOf(z6));
    }

    public abstract void f(p200u.s0 s0Var);

    public abstract void g();
}
