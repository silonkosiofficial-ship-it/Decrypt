package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes3.dex */
public class c implements P5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final V3.f f44062j = V3.i.d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final java.util.Random f44063k = new java.util.Random();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final java.util.Map f44064l = new java.util.HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f44065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f44066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f44067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q4.f f44068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final G5.e f44069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final R4.c f44070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F5.b f44071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f44072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.Map f44073i;

    private static class a implements com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.InterfaceC0470a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.util.concurrent.atomic.AtomicReference f44074a = new java.util.concurrent.atomic.AtomicReference();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(android.content.Context context) {
            android.app.Application application = (android.app.Application) context.getApplicationContext();
            java.util.concurrent.atomic.AtomicReference atomicReference = f44074a;
            if (atomicReference.get() == null) {
                com.google.firebase.remoteconfig.c.a aVar = new com.google.firebase.remoteconfig.c.a();
                if (p200u.AbstractC7162c0.a(atomicReference, null, aVar)) {
                    com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.c(application);
                    com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.b().a(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.InterfaceC0470a
        public void a(boolean z6) {
            com.google.firebase.remoteconfig.c.r(z6);
        }
    }

    c(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, Q4.f fVar, G5.e eVar, R4.c cVar, F5.b bVar) {
        this(context, scheduledExecutorService, fVar, eVar, cVar, bVar, true);
    }

    protected c(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, Q4.f fVar, G5.e eVar, R4.c cVar, F5.b bVar, boolean z6) {
        this.f44065a = new java.util.HashMap();
        this.f44073i = new java.util.HashMap();
        this.f44066b = context;
        this.f44067c = scheduledExecutorService;
        this.f44068d = fVar;
        this.f44069e = eVar;
        this.f44070f = cVar;
        this.f44071g = bVar;
        this.f44072h = fVar.n().c();
        com.google.firebase.remoteconfig.c.a.c(context);
        if (z6) {
            p115l4.AbstractC6934o.c(scheduledExecutorService, new java.util.concurrent.Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f44061a.g();
                }
            });
        }
    }

    private com.google.firebase.remoteconfig.internal.f f(java.lang.String str, java.lang.String str2) {
        return com.google.firebase.remoteconfig.internal.f.h(this.f44067c, com.google.firebase.remoteconfig.internal.u.c(this.f44066b, java.lang.String.format("%s_%s_%s_%s.json", "frc", this.f44072h, str, str2)));
    }

    private com.google.firebase.remoteconfig.internal.o j(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new com.google.firebase.remoteconfig.internal.o(this.f44067c, fVar, fVar2);
    }

    static com.google.firebase.remoteconfig.internal.p k(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return new com.google.firebase.remoteconfig.internal.p(context.getSharedPreferences(java.lang.String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static com.google.firebase.remoteconfig.internal.v l(Q4.f fVar, java.lang.String str, F5.b bVar) {
        if (p(fVar) && str.equals("firebase")) {
            return new com.google.firebase.remoteconfig.internal.v(bVar);
        }
        return null;
    }

    private O5.e n(com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.f fVar2) {
        return new O5.e(fVar, O5.a.a(fVar, fVar2), this.f44067c);
    }

    private static boolean o(Q4.f fVar, java.lang.String str) {
        return str.equals("firebase") && p(fVar);
    }

    private static boolean p(Q4.f fVar) {
        return fVar.m().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ T4.a q() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void r(boolean z6) {
        java.util.Iterator it = f44064l.values().iterator();
        while (it.hasNext()) {
            ((com.google.firebase.remoteconfig.a) it.next()).x(z6);
        }
    }

    @Override // P5.a
    public void a(java.lang.String str, Q5.f fVar) {
        e(str).n().h(fVar);
    }

    synchronized com.google.firebase.remoteconfig.a d(Q4.f fVar, java.lang.String str, G5.e eVar, R4.c cVar, java.util.concurrent.Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.o oVar, com.google.firebase.remoteconfig.internal.p pVar, O5.e eVar2) {
        try {
            if (!this.f44065a.containsKey(str)) {
                com.google.firebase.remoteconfig.a aVar = new com.google.firebase.remoteconfig.a(this.f44066b, fVar, eVar, o(fVar, str) ? cVar : null, executor, fVar2, fVar3, fVar4, mVar, oVar, pVar, m(fVar, eVar, mVar, fVar3, this.f44066b, str, pVar), eVar2);
                aVar.A();
                this.f44065a.put(str, aVar);
                f44064l.put(str, aVar);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (com.google.firebase.remoteconfig.a) this.f44065a.get(str);
    }

    public synchronized com.google.firebase.remoteconfig.a e(java.lang.String str) {
        com.google.firebase.remoteconfig.internal.f fVarF;
        com.google.firebase.remoteconfig.internal.f fVarF2;
        com.google.firebase.remoteconfig.internal.f fVarF3;
        com.google.firebase.remoteconfig.internal.p pVarK;
        com.google.firebase.remoteconfig.internal.o oVarJ;
        try {
            fVarF = f(str, "fetch");
            fVarF2 = f(str, "activate");
            fVarF3 = f(str, "defaults");
            pVarK = k(this.f44066b, this.f44072h, str);
            oVarJ = j(fVarF2, fVarF3);
            final com.google.firebase.remoteconfig.internal.v vVarL = l(this.f44068d, str, this.f44071g);
            if (vVarL != null) {
                oVarJ.b(new V3.d() { // from class: N5.o
                    @Override // V3.d
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        vVarL.a((java.lang.String) obj, (com.google.firebase.remoteconfig.internal.g) obj2);
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return d(this.f44068d, str, this.f44069e, this.f44070f, this.f44067c, fVarF, fVarF2, fVarF3, h(str, fVarF, pVarK), oVarJ, pVarK, n(fVarF2, fVarF3));
    }

    com.google.firebase.remoteconfig.a g() {
        return e("firebase");
    }

    synchronized com.google.firebase.remoteconfig.internal.m h(java.lang.String str, com.google.firebase.remoteconfig.internal.f fVar, com.google.firebase.remoteconfig.internal.p pVar) {
        try {
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return new com.google.firebase.remoteconfig.internal.m(this.f44069e, p(this.f44068d) ? this.f44071g : new F5.b() { // from class: N5.p
            @Override // F5.b
            public final java.lang.Object get() {
                return com.google.firebase.remoteconfig.c.q();
            }
        }, this.f44067c, f44062j, f44063k, fVar, i(this.f44068d.n().b(), str, pVar), pVar, this.f44073i);
    }

    com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient i(java.lang.String str, java.lang.String str2, com.google.firebase.remoteconfig.internal.p pVar) {
        return new com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient(this.f44066b, this.f44068d.n().c(), str, str2, pVar.b(), pVar.b());
    }

    synchronized com.google.firebase.remoteconfig.internal.q m(Q4.f fVar, G5.e eVar, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.f fVar2, android.content.Context context, java.lang.String str, com.google.firebase.remoteconfig.internal.p pVar) {
        return new com.google.firebase.remoteconfig.internal.q(fVar, eVar, mVar, fVar2, context, str, pVar, this.f44067c);
    }
}
