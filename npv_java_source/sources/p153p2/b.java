package p153p2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2.b.a f52719c = new p2.b.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Map f52720d = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantLock f52721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p153p2.c f52722b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final p153p2.c c(java.lang.String str) {
            return new p153p2.c(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.concurrent.locks.ReentrantLock d(java.lang.String str) {
            java.util.concurrent.locks.ReentrantLock reentrantLock;
            synchronized (this) {
                try {
                    java.util.Map map = p153p2.b.f52720d;
                    java.lang.Object reentrantLock2 = map.get(str);
                    if (reentrantLock2 == null) {
                        reentrantLock2 = new java.util.concurrent.locks.ReentrantLock();
                        map.put(str, reentrantLock2);
                    }
                    reentrantLock = (java.util.concurrent.locks.ReentrantLock) reentrantLock2;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return reentrantLock;
        }
    }

    public b(java.lang.String str, boolean z6) {
        p247y7.AbstractC7350t.f(str, "filename");
        p2.b.a aVar = f52719c;
        this.f52721a = aVar.d(str);
        this.f52722b = z6 ? aVar.c(str) : null;
    }

    public final java.lang.Object b(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "block");
        this.f52721a.lock();
        try {
            p153p2.c cVar = this.f52722b;
            if (cVar != null) {
                cVar.a();
            }
            try {
                java.lang.Object objB = aVar.b();
                p153p2.c cVar2 = this.f52722b;
                if (cVar2 != null) {
                    cVar2.b();
                }
                this.f52721a.unlock();
                return objB;
            } catch (java.lang.Throwable th) {
                p153p2.c cVar3 = this.f52722b;
                if (cVar3 != null) {
                    cVar3.b();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.f52721a.unlock();
            throw th2;
        }
    }
}
