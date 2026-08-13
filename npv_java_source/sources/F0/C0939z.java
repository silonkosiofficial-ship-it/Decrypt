package F0;

/* JADX INFO: renamed from: F0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0939z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0.J f2731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1753w0 f2732b;

    public C0939z(F0.J j6, D0.I i6) {
        this.f2731a = j6;
        this.f2732b = V.A1.d(i6, null, 2, null);
    }

    private final D0.I a() {
        return (D0.I) this.f2732b.getValue();
    }

    private final void j(D0.I i6) {
        this.f2732b.setValue(i6);
    }

    public final int b(int i6) {
        return a().j(this.f2731a.m0(), this.f2731a.G(), i6);
    }

    public final int c(int i6) {
        return a().a(this.f2731a.m0(), this.f2731a.G(), i6);
    }

    public final int d(int i6) {
        return a().j(this.f2731a.m0(), this.f2731a.F(), i6);
    }

    public final int e(int i6) {
        return a().a(this.f2731a.m0(), this.f2731a.F(), i6);
    }

    public final int f(int i6) {
        return a().e(this.f2731a.m0(), this.f2731a.G(), i6);
    }

    public final int g(int i6) {
        return a().c(this.f2731a.m0(), this.f2731a.G(), i6);
    }

    public final int h(int i6) {
        return a().e(this.f2731a.m0(), this.f2731a.F(), i6);
    }

    public final int i(int i6) {
        return a().c(this.f2731a.m0(), this.f2731a.F(), i6);
    }

    public final void k(D0.I i6) {
        j(i6);
    }
}
