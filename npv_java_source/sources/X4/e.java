package X4;

/* JADX INFO: loaded from: classes3.dex */
public class e implements V4.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.String f15871f = "X4.e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y4.m f15872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f15873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f15874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Y4.n f15875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p115l4.AbstractC6931l f15876e;

    public e(Q4.f fVar, F5.b bVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.Executor executor3) {
        Q3.AbstractC1477p.l(fVar);
        this.f15872a = new Y4.m(fVar);
        this.f15873b = executor;
        this.f15874c = executor3;
        this.f15875d = new Y4.n();
        if (bVar.get() == null) {
            this.f15876e = f(fVar, executor2);
        } else {
            androidx.appcompat.app.D.a(bVar.get());
            throw null;
        }
    }

    static p115l4.AbstractC6931l f(final Q4.f fVar, java.util.concurrent.Executor executor) {
        final p115l4.C6932m c6932m = new p115l4.C6932m();
        executor.execute(new java.lang.Runnable() { // from class: X4.a
            @Override // java.lang.Runnable
            public final void run() {
                X4.e.g(fVar, c6932m);
            }
        });
        return c6932m.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Q4.f fVar, p115l4.C6932m c6932m) {
        X4.g gVar = new X4.g(fVar.k(), fVar.o());
        java.lang.String strA = gVar.a();
        if (strA == null) {
            strA = java.util.UUID.randomUUID().toString();
            gVar.b(strA);
        }
        java.lang.String str = f15871f;
        java.lang.String str2 = "Enter this debug secret into the allow list in the Firebase Console for your project: " + strA;
        c6932m.c(strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Y4.a h(X4.f fVar) {
        return this.f15872a.b(fVar.a().getBytes("UTF-8"), 2, this.f15875d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l i(java.lang.String str) {
        final X4.f fVar = new X4.f(str);
        return p115l4.AbstractC6934o.c(this.f15874c, new java.util.concurrent.Callable() { // from class: X4.d
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f15869a.h(fVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p115l4.AbstractC6931l j(Y4.a aVar) {
        return p115l4.AbstractC6934o.e(Y4.b.c(aVar));
    }

    @Override // V4.a
    public p115l4.AbstractC6931l a() {
        return this.f15876e.p(this.f15873b, new p115l4.InterfaceC6930k() { // from class: X4.b
            @Override // p115l4.InterfaceC6930k
            public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                return this.f15868a.i((java.lang.String) obj);
            }
        }).p(this.f15873b, new p115l4.InterfaceC6930k() { // from class: X4.c
            @Override // p115l4.InterfaceC6930k
            public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                return X4.e.j((Y4.a) obj);
            }
        });
    }
}
