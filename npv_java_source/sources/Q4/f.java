package Q4;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final java.lang.Object f9036k = new java.lang.Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final java.util.Map f9037l = new p170r.C7026a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f9038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f9039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q4.o f9040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p046e5.o f9041d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p046e5.x f9044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F5.b f9045h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f9042e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f9043f = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.List f9046i = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.List f9047j = new java.util.concurrent.CopyOnWriteArrayList();

    public interface a {
        void a(boolean z6);
    }

    private static class b implements com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.InterfaceC0470a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static java.util.concurrent.atomic.AtomicReference f9048a = new java.util.concurrent.atomic.AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(android.content.Context context) {
            if (V3.n.a() && (context.getApplicationContext() instanceof android.app.Application)) {
                android.app.Application application = (android.app.Application) context.getApplicationContext();
                if (f9048a.get() == null) {
                    Q4.f.b bVar = new Q4.f.b();
                    if (p200u.AbstractC7162c0.a(f9048a, null, bVar)) {
                        com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.c(application);
                        com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.InterfaceC0470a
        public void a(boolean z6) {
            synchronized (Q4.f.f9036k) {
                try {
                    for (Q4.f fVar : new java.util.ArrayList(Q4.f.f9037l.values())) {
                        if (fVar.f9042e.get()) {
                            fVar.y(z6);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static class c extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static java.util.concurrent.atomic.AtomicReference f9049b = new java.util.concurrent.atomic.AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.Context f9050a;

        public c(android.content.Context context) {
            this.f9050a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(android.content.Context context) {
            if (f9049b.get() == null) {
                Q4.f.c cVar = new Q4.f.c(context);
                if (p200u.AbstractC7162c0.a(f9049b, null, cVar)) {
                    context.registerReceiver(cVar, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f9050a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            synchronized (Q4.f.f9036k) {
                try {
                    java.util.Iterator it = Q4.f.f9037l.values().iterator();
                    while (it.hasNext()) {
                        ((Q4.f) it.next()).p();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected f(final android.content.Context context, java.lang.String str, Q4.o oVar) {
        this.f9038a = (android.content.Context) Q3.AbstractC1477p.l(context);
        this.f9039b = Q3.AbstractC1477p.f(str);
        this.f9040c = (Q4.o) Q3.AbstractC1477p.l(oVar);
        Q4.p pVarB = com.google.firebase.provider.FirebaseInitProvider.b();
        V5.c.b("Firebase");
        V5.c.b("ComponentDiscovery");
        java.util.List listB = p046e5.C6534g.c(context, com.google.firebase.components.ComponentDiscoveryService.class).b();
        V5.c.a();
        V5.c.b("Runtime");
        e5.o.b bVarG = p046e5.o.m(p056f5.l.INSTANCE).d(listB).c(new com.google.firebase.FirebaseCommonRegistrar()).c(new com.google.firebase.concurrent.ExecutorsRegistrar()).b(p046e5.C6530c.s(context, android.content.Context.class, new java.lang.Class[0])).b(p046e5.C6530c.s(this, Q4.f.class, new java.lang.Class[0])).b(p046e5.C6530c.s(oVar, Q4.o.class, new java.lang.Class[0])).g(new V5.b());
        if (androidx.core.os.t.a(context) && com.google.firebase.provider.FirebaseInitProvider.c()) {
            bVarG.b(p046e5.C6530c.s(pVarB, Q4.p.class, new java.lang.Class[0]));
        }
        p046e5.o oVarE = bVarG.e();
        this.f9041d = oVarE;
        V5.c.a();
        this.f9044g = new p046e5.x(new F5.b() { // from class: Q4.d
            @Override // F5.b
            public final java.lang.Object get() {
                return this.f9033a.v(context);
            }
        });
        this.f9045h = oVarE.d(E5.f.class);
        g(new Q4.f.a() { // from class: Q4.e
            @Override // Q4.f.a
            public final void a(boolean z6) {
                this.f9035a.w(z6);
            }
        });
        V5.c.a();
    }

    private void i() {
        Q3.AbstractC1477p.p(!this.f9043f.get(), "FirebaseApp was deleted");
    }

    public static Q4.f l() {
        Q4.f fVar;
        synchronized (f9036k) {
            try {
                fVar = (Q4.f) f9037l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new java.lang.IllegalStateException("Default FirebaseApp is not initialized in this process " + V3.p.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((E5.f) fVar.f9045h.get()).k();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!androidx.core.os.t.a(this.f9038a)) {
            java.lang.String str = "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m();
            Q4.f.c.b(this.f9038a);
            return;
        }
        java.lang.String str2 = "Device unlocked: initializing all Firebase APIs for app " + m();
        this.f9041d.p(u());
        ((E5.f) this.f9045h.get()).k();
    }

    public static Q4.f q(android.content.Context context) {
        synchronized (f9036k) {
            try {
                if (f9037l.containsKey("[DEFAULT]")) {
                    return l();
                }
                Q4.o oVarA = Q4.o.a(context);
                if (oVarA == null) {
                    return null;
                }
                return r(context, oVarA);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static Q4.f r(android.content.Context context, Q4.o oVar) {
        return s(context, oVar, "[DEFAULT]");
    }

    public static Q4.f s(android.content.Context context, Q4.o oVar, java.lang.String str) {
        Q4.f fVar;
        Q4.f.b.c(context);
        java.lang.String strX = x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f9036k) {
            java.util.Map map = f9037l;
            Q3.AbstractC1477p.p(!map.containsKey(strX), "FirebaseApp name " + strX + " already exists!");
            Q3.AbstractC1477p.m(context, "Application context cannot be null.");
            fVar = new Q4.f(context, strX, oVar);
            map.put(strX, fVar);
        }
        fVar.p();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ K5.a v(android.content.Context context) {
        return new K5.a(context, o(), (D5.c) this.f9041d.a(D5.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(boolean z6) {
        if (z6) {
            return;
        }
        ((E5.f) this.f9045h.get()).k();
    }

    private static java.lang.String x(java.lang.String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(boolean z6) {
        java.util.Iterator it = this.f9046i.iterator();
        while (it.hasNext()) {
            ((Q4.f.a) it.next()).a(z6);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof Q4.f) {
            return this.f9039b.equals(((Q4.f) obj).m());
        }
        return false;
    }

    public void g(Q4.f.a aVar) {
        i();
        if (this.f9042e.get() && com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.b().d()) {
            aVar.a(true);
        }
        this.f9046i.add(aVar);
    }

    public void h(Q4.g gVar) {
        i();
        Q3.AbstractC1477p.l(gVar);
        this.f9047j.add(gVar);
    }

    public int hashCode() {
        return this.f9039b.hashCode();
    }

    public java.lang.Object j(java.lang.Class cls) {
        i();
        return this.f9041d.a(cls);
    }

    public android.content.Context k() {
        i();
        return this.f9038a;
    }

    public java.lang.String m() {
        i();
        return this.f9039b;
    }

    public Q4.o n() {
        i();
        return this.f9040c;
    }

    public java.lang.String o() {
        return V3.c.b(m().getBytes(java.nio.charset.Charset.defaultCharset())) + "+" + V3.c.b(n().c().getBytes(java.nio.charset.Charset.defaultCharset()));
    }

    public boolean t() {
        i();
        return ((K5.a) this.f9044g.get()).b();
    }

    public java.lang.String toString() {
        return Q3.AbstractC1475n.c(this).a("name", this.f9039b).a("options", this.f9040c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }
}
