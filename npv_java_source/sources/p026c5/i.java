package p026c5;

/* JADX INFO: loaded from: classes3.dex */
public class i implements V4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f24428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I4.InterfaceC1242a f24429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y4.m f24430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.Executor f24431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f24432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Y4.n f24433f;

    public i(Q4.f fVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2) {
        this(fVar.n().d(), I4.AbstractC1243b.a(fVar.k()), new Y4.m(fVar), executor, executor2, new Y4.n());
    }

    i(java.lang.String str, I4.InterfaceC1242a interfaceC1242a, Y4.m mVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, Y4.n nVar) {
        this.f24428a = str;
        this.f24429b = interfaceC1242a;
        this.f24430c = mVar;
        this.f24431d = executor;
        this.f24432e = executor2;
        this.f24433f = nVar;
    }

    private p115l4.AbstractC6931l g() {
        final p026c5.b bVar = new p026c5.b();
        return p115l4.AbstractC6934o.c(this.f24432e, new java.util.concurrent.Callable() { // from class: c5.g
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f24425a.h(bVar);
            }
        }).p(this.f24431d, new p115l4.InterfaceC6930k() { // from class: c5.h
            @Override // p115l4.InterfaceC6930k
            public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                return this.f24427a.i((p026c5.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p026c5.c h(p026c5.b bVar) {
        return p026c5.c.a(this.f24430c.c(bVar.a().getBytes("UTF-8"), this.f24433f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l i(p026c5.c cVar) {
        return this.f24429b.a(I4.d.b().b(java.lang.Long.parseLong(this.f24428a)).c(cVar.b()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Y4.a j(p026c5.a aVar) {
        return this.f24430c.b(aVar.a().getBytes("UTF-8"), 3, this.f24433f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l k(I4.e eVar) {
        final p026c5.a aVar = new p026c5.a(eVar.a());
        return p115l4.AbstractC6934o.c(this.f24432e, new java.util.concurrent.Callable() { // from class: c5.f
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f24423a.j(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p115l4.AbstractC6931l l(Y4.a aVar) {
        return p115l4.AbstractC6934o.e(Y4.b.c(aVar));
    }

    @Override // V4.a
    public p115l4.AbstractC6931l a() {
        return g().p(this.f24431d, new p115l4.InterfaceC6930k() { // from class: c5.d
            @Override // p115l4.InterfaceC6930k
            public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                return this.f24422a.k((I4.e) obj);
            }
        }).p(this.f24431d, new p115l4.InterfaceC6930k() { // from class: c5.e
            @Override // p115l4.InterfaceC6930k
            public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                return p026c5.i.l((Y4.a) obj);
            }
        });
    }
}
