package F0;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2534c = X.b.f15549F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X.b f2535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f2536b;

    public Y(X.b bVar, p237x7.a aVar) {
        this.f2535a = bVar;
        this.f2536b = aVar;
    }

    public final void a(int i6, java.lang.Object obj) {
        this.f2535a.a(i6, obj);
        this.f2536b.b();
    }

    public final java.util.List b() {
        return this.f2535a.i();
    }

    public final void c() {
        this.f2535a.j();
        this.f2536b.b();
    }

    public final java.lang.Object d(int i6) {
        return this.f2535a.s()[i6];
    }

    public final int e() {
        return this.f2535a.t();
    }

    public final X.b f() {
        return this.f2535a;
    }

    public final java.lang.Object g(int i6) {
        java.lang.Object objD = this.f2535a.D(i6);
        this.f2536b.b();
        return objD;
    }
}
