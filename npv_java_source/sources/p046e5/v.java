package p046e5;

/* JADX INFO: loaded from: classes3.dex */
class v implements D5.d, D5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f44741a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.Queue f44742b = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f44743c;

    v(java.util.concurrent.Executor executor) {
        this.f44743c = executor;
    }

    private synchronized java.util.Set d(D5.a aVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(java.util.Map.Entry entry, D5.a aVar) {
        ((D5.b) entry.getKey()).a(aVar);
    }

    @Override // D5.d
    public synchronized void a(java.lang.Class cls, java.util.concurrent.Executor executor, D5.b bVar) {
        try {
            p046e5.E.b(cls);
            p046e5.E.b(bVar);
            p046e5.E.b(executor);
            if (!this.f44741a.containsKey(cls)) {
                this.f44741a.put(cls, new j$.util.concurrent.ConcurrentHashMap());
            }
            ((j$.util.concurrent.ConcurrentHashMap) this.f44741a.get(cls)).put(bVar, executor);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    void c() {
        java.util.Queue queue;
        synchronized (this) {
            try {
                queue = this.f44742b;
                if (queue != null) {
                    this.f44742b = null;
                } else {
                    queue = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            java.util.Iterator it = queue.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.D.a(it.next());
                f(null);
            }
        }
    }

    public void f(final D5.a aVar) {
        p046e5.E.b(aVar);
        synchronized (this) {
            try {
                java.util.Queue queue = this.f44742b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final java.util.Map.Entry entry : d(aVar)) {
                    ((java.util.concurrent.Executor) entry.getValue()).execute(new java.lang.Runnable(entry, aVar) { // from class: e5.u

                        /* JADX INFO: renamed from: C, reason: collision with root package name */
                        public final /* synthetic */ java.util.Map.Entry f44740C;

                        @Override // java.lang.Runnable
                        public final void run() {
                            p046e5.v.e(this.f44740C, null);
                        }
                    });
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
