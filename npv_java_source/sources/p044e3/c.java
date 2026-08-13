package p044e3;

/* JADX INFO: loaded from: classes.dex */
public class c implements p044e3.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.logging.Logger f44652f = java.util.logging.Logger.getLogger(Y2.u.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p054f3.x f44653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f44654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Z2.e f44655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p064g3.InterfaceC6599d f44656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p074h3.b f44657e;

    public c(java.util.concurrent.Executor executor, Z2.e eVar, p054f3.x xVar, p064g3.InterfaceC6599d interfaceC6599d, p074h3.b bVar) {
        this.f44654b = executor;
        this.f44655c = eVar;
        this.f44653a = xVar;
        this.f44656d = interfaceC6599d;
        this.f44657e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object d(Y2.p pVar, Y2.i iVar) {
        this.f44656d.U0(pVar, iVar);
        this.f44653a.a(pVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final Y2.p pVar, W2.j jVar, Y2.i iVar) {
        try {
            Z2.m mVarD = this.f44655c.d(pVar.b());
            if (mVarD == null) {
                java.lang.String str = java.lang.String.format("Transport backend '%s' is not registered", pVar.b());
                f44652f.warning(str);
                jVar.a(new java.lang.IllegalArgumentException(str));
            } else {
                final Y2.i iVarA = mVarD.a(iVar);
                this.f44657e.f(new h3.b.a() { // from class: e3.b
                    @Override // h3.b.a
                    public final java.lang.Object n() {
                        return this.f44649a.d(pVar, iVarA);
                    }
                });
                jVar.a(null);
            }
        } catch (java.lang.Exception e6) {
            f44652f.warning("Error scheduling event " + e6.getMessage());
            jVar.a(e6);
        }
    }

    @Override // p044e3.e
    public void a(final Y2.p pVar, final Y2.i iVar, final W2.j jVar) {
        this.f44654b.execute(new java.lang.Runnable() { // from class: e3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f44645C.e(pVar, jVar, iVar);
            }
        });
    }
}
