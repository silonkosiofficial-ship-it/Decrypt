package R1;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f9360g = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private R1.a.c f9364d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p170r.Y f9361a = new p170r.Y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.ArrayList f9362b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R1.a.C0215a f9363c = new R1.a.C0215a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f9365e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9366f = false;

    /* JADX INFO: renamed from: R1.a$a, reason: collision with other inner class name */
    class C0215a {
        C0215a() {
        }

        void a() {
            R1.a.this.f9365e = android.os.SystemClock.uptimeMillis();
            R1.a aVar = R1.a.this;
            aVar.c(aVar.f9365e);
            if (R1.a.this.f9362b.size() > 0) {
                R1.a.this.e().a();
            }
        }
    }

    interface b {
        boolean a(long j6);
    }

    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final R1.a.C0215a f9368a;

        c(R1.a.C0215a c0215a) {
            this.f9368a = c0215a;
        }

        abstract void a();
    }

    private static class d extends R1.a.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.view.Choreographer f9369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.view.Choreographer.FrameCallback f9370c;

        /* JADX INFO: renamed from: R1.a$d$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0216a implements android.view.Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0216a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j6) {
                R1.a.d.this.f9368a.a();
            }
        }

        d(R1.a.C0215a c0215a) {
            super(c0215a);
            this.f9369b = android.view.Choreographer.getInstance();
            this.f9370c = new R1.a.d.ChoreographerFrameCallbackC0216a();
        }

        @Override // R1.a.c
        void a() {
            this.f9369b.postFrameCallback(this.f9370c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f9366f) {
            for (int size = this.f9362b.size() - 1; size >= 0; size--) {
                if (this.f9362b.get(size) == null) {
                    this.f9362b.remove(size);
                }
            }
            this.f9366f = false;
        }
    }

    public static R1.a d() {
        java.lang.ThreadLocal threadLocal = f9360g;
        if (threadLocal.get() == null) {
            threadLocal.set(new R1.a());
        }
        return (R1.a) threadLocal.get();
    }

    private boolean f(R1.a.b bVar, long j6) {
        java.lang.Long l6 = (java.lang.Long) this.f9361a.get(bVar);
        if (l6 == null) {
            return true;
        }
        if (l6.longValue() >= j6) {
            return false;
        }
        this.f9361a.remove(bVar);
        return true;
    }

    public void a(R1.a.b bVar, long j6) {
        if (this.f9362b.size() == 0) {
            e().a();
        }
        if (!this.f9362b.contains(bVar)) {
            this.f9362b.add(bVar);
        }
        if (j6 > 0) {
            this.f9361a.put(bVar, java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() + j6));
        }
    }

    void c(long j6) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        for (int i6 = 0; i6 < this.f9362b.size(); i6++) {
            R1.a.b bVar = (R1.a.b) this.f9362b.get(i6);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.a(j6);
            }
        }
        b();
    }

    R1.a.c e() {
        if (this.f9364d == null) {
            this.f9364d = new R1.a.d(this.f9363c);
        }
        return this.f9364d;
    }

    public void g(R1.a.b bVar) {
        this.f9361a.remove(bVar);
        int iIndexOf = this.f9362b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f9362b.set(iIndexOf, null);
            this.f9366f = true;
        }
    }
}
