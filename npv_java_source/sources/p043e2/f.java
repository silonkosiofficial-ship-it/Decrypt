package p043e2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p043e2.e f44639a = new p043e2.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f44640b = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f44641c = new java.util.LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f44642d;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(java.lang.AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (java.lang.Exception e6) {
                throw new java.lang.RuntimeException(e6);
            }
        }
    }

    public final void d(java.lang.String str, java.lang.AutoCloseable autoCloseable) {
        java.lang.AutoCloseable autoCloseable2;
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(autoCloseable, "closeable");
        if (this.f44642d) {
            f(autoCloseable);
            return;
        }
        synchronized (this.f44639a) {
            autoCloseable2 = (java.lang.AutoCloseable) this.f44640b.put(str, autoCloseable);
        }
        f(autoCloseable2);
    }

    public final void e() {
        if (this.f44642d) {
            return;
        }
        this.f44642d = true;
        synchronized (this.f44639a) {
            try {
                java.util.Iterator it = this.f44640b.values().iterator();
                while (it.hasNext()) {
                    f((java.lang.AutoCloseable) it.next());
                }
                java.util.Iterator it2 = this.f44641c.iterator();
                while (it2.hasNext()) {
                    f((java.lang.AutoCloseable) it2.next());
                }
                this.f44641c.clear();
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final java.lang.AutoCloseable g(java.lang.String str) {
        java.lang.AutoCloseable autoCloseable;
        p247y7.AbstractC7350t.f(str, "key");
        synchronized (this.f44639a) {
            autoCloseable = (java.lang.AutoCloseable) this.f44640b.get(str);
        }
        return autoCloseable;
    }
}
