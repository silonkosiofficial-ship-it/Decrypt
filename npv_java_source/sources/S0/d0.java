package S0;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S0.X f12329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S0.P f12330b;

    public d0(S0.X x6, S0.P p6) {
        this.f12329a = x6;
        this.f12330b = p6;
    }

    public final void a() {
        this.f12329a.g(this);
    }

    public final boolean b() {
        return p247y7.AbstractC7350t.b(this.f12329a.a(), this);
    }

    public final boolean c(p131n0.i iVar) {
        boolean zB = b();
        if (zB) {
            this.f12330b.f(iVar);
        }
        return zB;
    }

    public final boolean d(S0.V v6, S0.V v10) {
        boolean zB = b();
        if (zB) {
            this.f12330b.b(v6, v10);
        }
        return zB;
    }

    public final boolean e(S0.V v6, S0.L l6, M0.K k6, p237x7.l lVar, p131n0.i iVar, p131n0.i iVar2) {
        boolean zB = b();
        if (zB) {
            this.f12330b.d(v6, l6, k6, lVar, iVar, iVar2);
        }
        return zB;
    }
}
