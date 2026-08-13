package K4;

/* JADX INFO: renamed from: K4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1307d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final java.util.Map f6106o = new java.util.HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f6107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K4.x f6108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f6109c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.content.Intent f6114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final K4.E f6115i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private android.content.ServiceConnection f6119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private android.os.IInterface f6120n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f6110d = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Set f6111e = new java.util.HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.Object f6112f = new java.lang.Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final android.os.IBinder.DeathRecipient f6117k = new android.os.IBinder.DeathRecipient() { // from class: K4.A
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            K4.C1307d.k(this.f6095a);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f6118l = new java.util.concurrent.atomic.AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.lang.ref.WeakReference f6116j = new java.lang.ref.WeakReference(null);

    public C1307d(android.content.Context context, K4.x xVar, java.lang.String str, android.content.Intent intent, K4.E e6, K4.D d6) {
        this.f6107a = context;
        this.f6108b = xVar;
        this.f6109c = str;
        this.f6114h = intent;
        this.f6115i = e6;
    }

    public static /* synthetic */ void k(K4.C1307d c1307d) {
        c1307d.f6108b.c("reportBinderDeath", new java.lang.Object[0]);
        androidx.appcompat.app.D.a(c1307d.f6116j.get());
        c1307d.f6108b.c("%s : Binder has died.", c1307d.f6109c);
        java.util.Iterator it = c1307d.f6110d.iterator();
        while (it.hasNext()) {
            ((K4.y) it.next()).a(c1307d.w());
        }
        c1307d.f6110d.clear();
        synchronized (c1307d.f6112f) {
            c1307d.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(final K4.C1307d c1307d, final p115l4.C6932m c6932m) {
        c1307d.f6111e.add(c6932m);
        c6932m.a().c(new p115l4.InterfaceC6925f() { // from class: K4.z
            @Override // p115l4.InterfaceC6925f
            public final void a(p115l4.AbstractC6931l abstractC6931l) {
                this.f6132a.u(c6932m, abstractC6931l);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(K4.C1307d c1307d, K4.y yVar) {
        if (c1307d.f6120n != null || c1307d.f6113g) {
            if (!c1307d.f6113g) {
                yVar.run();
                return;
            } else {
                c1307d.f6108b.c("Waiting to bind to the service.", new java.lang.Object[0]);
                c1307d.f6110d.add(yVar);
                return;
            }
        }
        c1307d.f6108b.c("Initiate binding to the service.", new java.lang.Object[0]);
        c1307d.f6110d.add(yVar);
        K4.ServiceConnectionC1306c serviceConnectionC1306c = new K4.ServiceConnectionC1306c(c1307d, null);
        c1307d.f6119m = serviceConnectionC1306c;
        c1307d.f6113g = true;
        if (c1307d.f6107a.bindService(c1307d.f6114h, serviceConnectionC1306c, 1)) {
            return;
        }
        c1307d.f6108b.c("Failed to bind to the service.", new java.lang.Object[0]);
        c1307d.f6113g = false;
        java.util.Iterator it = c1307d.f6110d.iterator();
        while (it.hasNext()) {
            ((K4.y) it.next()).a(new K4.C1308e());
        }
        c1307d.f6110d.clear();
    }

    static /* bridge */ /* synthetic */ void r(K4.C1307d c1307d) {
        c1307d.f6108b.c("linkToDeath", new java.lang.Object[0]);
        try {
            c1307d.f6120n.asBinder().linkToDeath(c1307d.f6117k, 0);
        } catch (android.os.RemoteException e6) {
            c1307d.f6108b.b(e6, "linkToDeath failed", new java.lang.Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(K4.C1307d c1307d) {
        c1307d.f6108b.c("unlinkToDeath", new java.lang.Object[0]);
        c1307d.f6120n.asBinder().unlinkToDeath(c1307d.f6117k, 0);
    }

    private final android.os.RemoteException w() {
        return new android.os.RemoteException(java.lang.String.valueOf(this.f6109c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        java.util.Iterator it = this.f6111e.iterator();
        while (it.hasNext()) {
            ((p115l4.C6932m) it.next()).d(w());
        }
        this.f6111e.clear();
    }

    public final android.os.Handler c() {
        android.os.Handler handler;
        java.util.Map map = f6106o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f6109c)) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.f6109c, 10);
                    handlerThread.start();
                    map.put(this.f6109c, new android.os.Handler(handlerThread.getLooper()));
                }
                handler = (android.os.Handler) map.get(this.f6109c);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final android.os.IInterface e() {
        return this.f6120n;
    }

    public final void t(K4.y yVar, p115l4.C6932m c6932m) {
        c().post(new K4.B(this, yVar.c(), c6932m, yVar));
    }

    final /* synthetic */ void u(p115l4.C6932m c6932m, p115l4.AbstractC6931l abstractC6931l) {
        synchronized (this.f6112f) {
            this.f6111e.remove(c6932m);
        }
    }

    public final void v(p115l4.C6932m c6932m) {
        synchronized (this.f6112f) {
            this.f6111e.remove(c6932m);
        }
        c().post(new K4.C(this));
    }
}
