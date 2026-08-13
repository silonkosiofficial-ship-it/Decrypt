package V;

/* JADX INFO: loaded from: classes.dex */
public final class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f14630a = new java.util.concurrent.atomic.AtomicReference(p031d0.i.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f14631b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object f14632c;

    public final java.lang.Object a() {
        long id = java.lang.Thread.currentThread().getId();
        return id == V.AbstractC1698b.e() ? this.f14632c : ((p031d0.h) this.f14630a.get()).b(id);
    }

    public final void b(java.lang.Object obj) {
        long id = java.lang.Thread.currentThread().getId();
        if (id == V.AbstractC1698b.e()) {
            this.f14632c = obj;
            return;
        }
        synchronized (this.f14631b) {
            p031d0.h hVar = (p031d0.h) this.f14630a.get();
            if (hVar.d(id, obj)) {
                return;
            }
            this.f14630a.set(hVar.c(id, obj));
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }
}
