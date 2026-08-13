package ha;

/* JADX INFO: loaded from: classes2.dex */
public class l implements fa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile boolean f46608a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.Map f46609b = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.concurrent.LinkedBlockingQueue f46610c = new java.util.concurrent.LinkedBlockingQueue();

    @Override // fa.a
    public synchronized fa.d a(java.lang.String str) {
        ha.k kVar;
        kVar = (ha.k) this.f46609b.get(str);
        if (kVar == null) {
            kVar = new ha.k(str, this.f46610c, this.f46608a);
            this.f46609b.put(str, kVar);
        }
        return kVar;
    }

    public void b() {
        this.f46609b.clear();
        this.f46610c.clear();
    }

    public java.util.concurrent.LinkedBlockingQueue c() {
        return this.f46610c;
    }

    public java.util.List d() {
        return new java.util.ArrayList(this.f46609b.values());
    }

    public void e() {
        this.f46608a = true;
    }
}
