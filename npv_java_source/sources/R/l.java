package R;

/* JADX INFO: loaded from: classes.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f9221a = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f9222b = new java.util.LinkedHashMap();

    public final R.k a(R.n nVar) {
        return (R.k) this.f9222b.get(nVar);
    }

    public final R.n b(R.k kVar) {
        return (R.n) this.f9221a.get(kVar);
    }

    public final void c(R.k kVar) {
        R.n nVar = (R.n) this.f9221a.get(kVar);
        if (nVar != null) {
        }
        this.f9221a.remove(kVar);
    }

    public final void d(R.k kVar, R.n nVar) {
        this.f9221a.put(kVar, nVar);
        this.f9222b.put(nVar, kVar);
    }
}
