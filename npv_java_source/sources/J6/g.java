package J6;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements java.io.Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final W6.C1767a f5736C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f5737D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p237x7.l f5738E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p237x7.a f5739F;

    public g(W6.C1767a c1767a, java.lang.Object obj, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(c1767a, "key");
        p247y7.AbstractC7350t.f(obj, "config");
        p247y7.AbstractC7350t.f(lVar, "body");
        this.f5736C = c1767a;
        this.f5737D = obj;
        this.f5738E = lVar;
        this.f5739F = new p237x7.a() { // from class: J6.f
            @Override // p237x7.a
            public final java.lang.Object b() {
                return J6.g.f();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M f() {
        return p087i7.M.f46721a;
    }

    public final void A0(C6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "scope");
        J6.d dVar = new J6.d(this.f5736C, cVar, this.f5737D);
        this.f5738E.l(dVar);
        this.f5739F = dVar.d();
        java.util.Iterator it = dVar.c().iterator();
        while (it.hasNext()) {
            ((J6.j) it.next()).a(cVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5739F.b();
    }
}
