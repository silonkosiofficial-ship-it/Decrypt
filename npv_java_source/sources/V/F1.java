package V;

/* JADX INFO: loaded from: classes.dex */
public final class F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f14665a = new java.util.ArrayList();

    public final void a() {
        this.f14665a.clear();
    }

    public final int b() {
        return this.f14665a.size();
    }

    public final boolean c() {
        return this.f14665a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final java.lang.Object e() {
        return this.f14665a.get(b() - 1);
    }

    public final java.lang.Object f(int i6) {
        return this.f14665a.get(i6);
    }

    public final java.lang.Object g() {
        return this.f14665a.remove(b() - 1);
    }

    public final boolean h(java.lang.Object obj) {
        return this.f14665a.add(obj);
    }

    public final java.lang.Object[] i() {
        int size = this.f14665a.size();
        java.lang.Object[] objArr = new java.lang.Object[size];
        for (int i6 = 0; i6 < size; i6++) {
            objArr[i6] = this.f14665a.get(i6);
        }
        return objArr;
    }
}
