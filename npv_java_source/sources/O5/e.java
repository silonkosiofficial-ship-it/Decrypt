package O5;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.firebase.remoteconfig.internal.f f8059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private O5.a f8060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.concurrent.Executor f8061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.Set f8062d = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());

    public e(com.google.firebase.remoteconfig.internal.f fVar, O5.a aVar, java.util.concurrent.Executor executor) {
        this.f8059a = fVar;
        this.f8060b = aVar;
        this.f8061c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(p115l4.AbstractC6931l abstractC6931l, final Q5.f fVar, com.google.firebase.remoteconfig.internal.g gVar) {
        try {
            com.google.firebase.remoteconfig.internal.g gVar2 = (com.google.firebase.remoteconfig.internal.g) abstractC6931l.l();
            if (gVar2 != null) {
                final Q5.e eVarB = this.f8060b.b(gVar2);
                this.f8061c.execute(new java.lang.Runnable() { // from class: O5.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (N5.k e6) {
        }
    }

    public void g(com.google.firebase.remoteconfig.internal.g gVar) {
        try {
            final Q5.e eVarB = this.f8060b.b(gVar);
            for (final Q5.f fVar : this.f8062d) {
                this.f8061c.execute(new java.lang.Runnable() { // from class: O5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(eVarB);
                    }
                });
            }
        } catch (N5.k e6) {
        }
    }

    public void h(final Q5.f fVar) {
        this.f8062d.add(fVar);
        final p115l4.AbstractC6931l abstractC6931lE = this.f8059a.e();
        abstractC6931lE.f(this.f8061c, new p115l4.InterfaceC6927h() { // from class: O5.b
            @Override // p115l4.InterfaceC6927h
            public final void a(java.lang.Object obj) {
                this.f8052a.f(abstractC6931lE, fVar, (com.google.firebase.remoteconfig.internal.g) obj);
            }
        });
    }
}
