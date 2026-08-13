package V;

/* JADX INFO: loaded from: classes.dex */
final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.R0 f14819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object f14821c;

    public Z(V.R0 r6, int i6, java.lang.Object obj) {
        this.f14819a = r6;
        this.f14820b = i6;
        this.f14821c = obj;
    }

    public final java.lang.Object a() {
        return this.f14821c;
    }

    public final int b() {
        return this.f14820b;
    }

    public final V.R0 c() {
        return this.f14819a;
    }

    public final boolean d() {
        return this.f14819a.u(this.f14821c);
    }

    public final void e(java.lang.Object obj) {
        this.f14821c = obj;
    }
}
