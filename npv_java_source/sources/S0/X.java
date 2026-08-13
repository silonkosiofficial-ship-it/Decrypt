package S0;

/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S0.P f12294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f12295b = new java.util.concurrent.atomic.AtomicReference(null);

    public X(S0.P p6) {
        this.f12294a = p6;
    }

    public final S0.d0 a() {
        return (S0.d0) this.f12295b.get();
    }

    public final void b() {
        this.f12294a.h();
    }

    public final void c() {
        if (a() != null) {
            this.f12294a.c();
        }
    }

    public S0.d0 d(S0.V v6, S0.C1610s c1610s, p237x7.l lVar, p237x7.l lVar2) {
        this.f12294a.g(v6, c1610s, lVar, lVar2);
        S0.d0 d0Var = new S0.d0(this, this.f12294a);
        this.f12295b.set(d0Var);
        return d0Var;
    }

    public final void e() {
        this.f12294a.a();
        this.f12295b.set(new S0.d0(this, this.f12294a));
    }

    public final void f() {
        this.f12294a.e();
    }

    public void g(S0.d0 d0Var) {
        if (p200u.AbstractC7162c0.a(this.f12295b, d0Var, null)) {
            this.f12294a.e();
        }
    }
}
