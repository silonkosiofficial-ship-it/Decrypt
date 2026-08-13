package p046e5;

/* JADX INFO: loaded from: classes3.dex */
class y implements F5.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile java.util.Set f44748b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile java.util.Set f44747a = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());

    y(java.util.Collection collection) {
        this.f44747a.addAll(collection);
    }

    static p046e5.y b(java.util.Collection collection) {
        return new p046e5.y((java.util.Set) collection);
    }

    private synchronized void d() {
        try {
            java.util.Iterator it = this.f44747a.iterator();
            while (it.hasNext()) {
                this.f44748b.add(((F5.b) it.next()).get());
            }
            this.f44747a = null;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    synchronized void a(F5.b bVar) {
        java.util.Set set;
        F5.b bVar2;
        try {
            if (this.f44748b == null) {
                set = this.f44747a;
                bVar2 = bVar;
            } else {
                set = this.f44748b;
                bVar2 = bVar.get();
            }
            set.add(bVar2);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // F5.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public java.util.Set get() {
        if (this.f44748b == null) {
            synchronized (this) {
                try {
                    if (this.f44748b == null) {
                        this.f44748b = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
                        d();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return j$.util.DesugarCollections.unmodifiableSet(this.f44748b);
    }
}
