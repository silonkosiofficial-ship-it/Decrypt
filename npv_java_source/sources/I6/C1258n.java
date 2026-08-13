package I6;

/* JADX INFO: renamed from: I6.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1258n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f5227a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f5228b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5229c = true;

    public final boolean a() {
        return this.f5229c;
    }

    public final java.util.List b() {
        return this.f5228b;
    }

    public final java.util.List c() {
        return this.f5227a;
    }

    public final void d(boolean z6) {
        this.f5229c = z6;
    }

    public final void e(p237x7.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "block");
        this.f5227a.add(pVar);
    }
}
