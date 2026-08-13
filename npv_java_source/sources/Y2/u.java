package Y2;

/* JADX INFO: loaded from: classes.dex */
public class u implements Y2.t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Y2.v f16338e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p084i3.a f16339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p084i3.a f16340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p044e3.e f16341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p054f3.r f16342d;

    u(p084i3.a aVar, p084i3.a aVar2, p044e3.e eVar, p054f3.r rVar, p054f3.v vVar) {
        this.f16339a = aVar;
        this.f16340b = aVar2;
        this.f16341c = eVar;
        this.f16342d = rVar;
        vVar.c();
    }

    private Y2.i b(Y2.o oVar) {
        Y2.i.a aVarG = Y2.i.a().i(this.f16339a.a()).o(this.f16340b.a()).n(oVar.g()).h(new Y2.h(oVar.b(), oVar.d())).g(oVar.c().a());
        oVar.c().e();
        oVar.c().b();
        return aVarG.d();
    }

    public static Y2.u c() {
        Y2.v vVar = f16338e;
        if (vVar != null) {
            return vVar.f();
        }
        throw new java.lang.IllegalStateException("Not initialized!");
    }

    private static java.util.Set d(Y2.f fVar) {
        return fVar instanceof Y2.g ? j$.util.DesugarCollections.unmodifiableSet(((Y2.g) fVar).a()) : java.util.Collections.singleton(W2.b.b("proto"));
    }

    public static void f(android.content.Context context) {
        if (f16338e == null) {
            synchronized (Y2.u.class) {
                try {
                    if (f16338e == null) {
                        f16338e = Y2.e.a().a(context).i();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // Y2.t
    public void a(Y2.o oVar, W2.j jVar) {
        this.f16341c.a(oVar.f().f(oVar.c().d()), b(oVar), jVar);
    }

    public p054f3.r e() {
        return this.f16342d;
    }

    public W2.i g(Y2.f fVar) {
        return new Y2.q(d(fVar), Y2.p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
