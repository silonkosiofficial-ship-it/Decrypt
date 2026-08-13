package p066g5;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5.a f45541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile p086i5.a f45542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile p096j5.b f45543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f45544d;

    public d(F5.a aVar) {
        this(aVar, new p096j5.c(), new p086i5.f());
    }

    public d(F5.a aVar, p096j5.b bVar, p086i5.a aVar2) {
        this.f45541a = aVar;
        this.f45543c = bVar;
        this.f45544d = new java.util.ArrayList();
        this.f45542b = aVar2;
        f();
    }

    private void f() {
        this.f45541a.a(new F5.a.InterfaceC0063a() { // from class: g5.c
            @Override // F5.a.InterfaceC0063a
            public final void a(F5.b bVar) {
                this.f45540a.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(java.lang.String str, android.os.Bundle bundle) {
        this.f45542b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(p096j5.a aVar) {
        synchronized (this) {
            try {
                if (this.f45543c instanceof p096j5.c) {
                    this.f45544d.add(aVar);
                }
                this.f45543c.a(aVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(F5.b bVar) {
        p076h5.g.f().b("AnalyticsConnector now available.");
        T4.a aVar = (T4.a) bVar.get();
        p086i5.e eVar = new p086i5.e(aVar);
        p066g5.e eVar2 = new p066g5.e();
        if (j(aVar, eVar2) == null) {
            p076h5.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        p076h5.g.f().b("Registered Firebase Analytics listener.");
        p086i5.d dVar = new p086i5.d();
        p086i5.c cVar = new p086i5.c(eVar, 500, java.util.concurrent.TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                java.util.Iterator it = this.f45544d.iterator();
                while (it.hasNext()) {
                    dVar.a((p096j5.a) it.next());
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                this.f45543c = dVar;
                this.f45542b = cVar;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static T4.a.InterfaceC0276a j(T4.a aVar, p066g5.e eVar) {
        T4.a.InterfaceC0276a interfaceC0276aA = aVar.a("clx", eVar);
        if (interfaceC0276aA == null) {
            p076h5.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            interfaceC0276aA = aVar.a("crash", eVar);
            if (interfaceC0276aA != null) {
                p076h5.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return interfaceC0276aA;
    }

    public p086i5.a d() {
        return new p086i5.a() { // from class: g5.b
            @Override // p086i5.a
            public final void a(java.lang.String str, android.os.Bundle bundle) {
                this.f45539a.g(str, bundle);
            }
        };
    }

    public p096j5.b e() {
        return new p096j5.b() { // from class: g5.a
            @Override // p096j5.b
            public final void a(p096j5.a aVar) {
                this.f45538a.h(aVar);
            }
        };
    }
}
