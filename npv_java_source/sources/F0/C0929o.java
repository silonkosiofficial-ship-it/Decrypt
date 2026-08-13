package F0;

/* JADX INFO: renamed from: F0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0929o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0.C0928n f2688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F0.C0928n f2689b;

    public C0929o(boolean z6) {
        this.f2688a = new F0.C0928n(z6);
        this.f2689b = new F0.C0928n(z6);
    }

    public final void c(F0.J j6, boolean z6) {
        if (z6) {
            this.f2688a.a(j6);
        } else if (this.f2688a.b(j6)) {
            return;
        }
        this.f2689b.a(j6);
    }

    public final boolean d(F0.J j6) {
        return this.f2688a.b(j6) || this.f2689b.b(j6);
    }

    public final boolean e(F0.J j6, boolean z6) {
        boolean zB = this.f2688a.b(j6);
        if (z6) {
            return zB;
        }
        return zB || this.f2689b.b(j6);
    }

    public final boolean f() {
        return this.f2689b.d() && this.f2688a.d();
    }

    public final boolean g(boolean z6) {
        return (z6 ? this.f2688a : this.f2689b).d();
    }

    public final boolean h() {
        return !f();
    }

    public final boolean i(F0.J j6) {
        return this.f2689b.f(j6) || this.f2688a.f(j6);
    }
}
