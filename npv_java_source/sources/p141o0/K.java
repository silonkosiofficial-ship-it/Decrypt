package p141o0;

/* JADX INFO: loaded from: classes.dex */
final class K implements p141o0.C1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0.K.a f52136e = new o0.K.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f52137f = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.ViewGroup f52138a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p181s0.a f52140c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f52139b = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.content.ComponentCallbacks2 f52141d = null;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o0.K.b f52142a = new o0.K.b();

        private b() {
        }

        public static final long a(android.view.View view) {
            return view.getUniqueDrawingId();
        }
    }

    public K(android.view.ViewGroup viewGroup) {
        this.f52138a = viewGroup;
    }

    private final long c(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return o0.K.b.a(view);
        }
        return -1L;
    }

    private final p181s0.a d(android.view.ViewGroup viewGroup) {
        p181s0.a aVar = this.f52140c;
        if (aVar != null) {
            return aVar;
        }
        p181s0.b bVar = new p181s0.b(viewGroup.getContext());
        viewGroup.addView(bVar);
        this.f52140c = bVar;
        return bVar;
    }

    @Override // p141o0.C1
    public void a(p171r0.C7053c c7053c) {
        synchronized (this.f52139b) {
            c7053c.H();
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    @Override // p141o0.C1
    public p171r0.C7053c b() {
        p171r0.InterfaceC7055e f6;
        p171r0.C7053c c7053c;
        synchronized (this.f52139b) {
            try {
                long jC = c(this.f52138a);
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    f6 = new p171r0.E(jC, null, null, 6, null);
                } else if (f52137f) {
                    try {
                        f6 = new p171r0.C7057g(this.f52138a, jC, null, null, 12, null);
                    } catch (java.lang.Throwable unused) {
                        f52137f = false;
                        f6 = new p171r0.F(d(this.f52138a), jC, null, null, 12, null);
                    }
                } else {
                    f6 = new p171r0.F(d(this.f52138a), jC, null, null, 12, null);
                }
                c7053c = new p171r0.C7053c(f6, null);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c7053c;
    }
}
