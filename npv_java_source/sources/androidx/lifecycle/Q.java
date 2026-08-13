package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.lifecycle.C2087t f22782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Handler f22783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.lifecycle.Q.a f22784c;

    public static final class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final androidx.lifecycle.C2087t f22785C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final androidx.lifecycle.AbstractC2079k.a f22786D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private boolean f22787E;

        public a(androidx.lifecycle.C2087t c2087t, androidx.lifecycle.AbstractC2079k.a aVar) {
            p247y7.AbstractC7350t.f(c2087t, "registry");
            p247y7.AbstractC7350t.f(aVar, "event");
            this.f22785C = c2087t;
            this.f22786D = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f22787E) {
                return;
            }
            this.f22785C.i(this.f22786D);
            this.f22787E = true;
        }
    }

    public Q(androidx.lifecycle.r rVar) {
        p247y7.AbstractC7350t.f(rVar, "provider");
        this.f22782a = new androidx.lifecycle.C2087t(rVar);
        this.f22783b = new android.os.Handler();
    }

    private final void f(androidx.lifecycle.AbstractC2079k.a aVar) {
        androidx.lifecycle.Q.a aVar2 = this.f22784c;
        if (aVar2 != null) {
            aVar2.run();
        }
        androidx.lifecycle.Q.a aVar3 = new androidx.lifecycle.Q.a(this.f22782a, aVar);
        this.f22784c = aVar3;
        android.os.Handler handler = this.f22783b;
        p247y7.AbstractC7350t.c(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public androidx.lifecycle.AbstractC2079k a() {
        return this.f22782a;
    }

    public void b() {
        f(androidx.lifecycle.AbstractC2079k.a.ON_START);
    }

    public void c() {
        f(androidx.lifecycle.AbstractC2079k.a.ON_CREATE);
    }

    public void d() {
        f(androidx.lifecycle.AbstractC2079k.a.ON_STOP);
        f(androidx.lifecycle.AbstractC2079k.a.ON_DESTROY);
    }

    public void e() {
        f(androidx.lifecycle.AbstractC2079k.a.ON_START);
    }
}
