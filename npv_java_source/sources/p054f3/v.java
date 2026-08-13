package p054f3;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f45004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p064g3.InterfaceC6599d f45005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p054f3.x f45006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p074h3.b f45007d;

    v(java.util.concurrent.Executor executor, p064g3.InterfaceC6599d interfaceC6599d, p054f3.x xVar, p074h3.b bVar) {
        this.f45004a = executor;
        this.f45005b = interfaceC6599d;
        this.f45006c = xVar;
        this.f45007d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object d() {
        java.util.Iterator it = this.f45005b.Y().iterator();
        while (it.hasNext()) {
            this.f45006c.a((Y2.p) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f45007d.f(new h3.b.a() { // from class: f3.u
            @Override // h3.b.a
            public final java.lang.Object n() {
                return this.f45003a.d();
            }
        });
    }

    public void c() {
        this.f45004a.execute(new java.lang.Runnable() { // from class: f3.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f45002C.e();
            }
        });
    }
}
