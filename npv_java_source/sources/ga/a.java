package ga;

/* JADX INFO: loaded from: classes2.dex */
public class a extends ha.d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    java.lang.String f45714C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    ha.k f45715D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    java.util.Queue f45716E;

    public a(ha.k kVar, java.util.Queue queue) {
        this.f45715D = kVar;
        this.f45714C = kVar.j();
        this.f45716E = queue;
    }

    @Override // fa.d
    public boolean a() {
        return true;
    }

    @Override // fa.d
    public boolean b() {
        return true;
    }

    @Override // fa.d
    public boolean c() {
        return true;
    }

    @Override // fa.d
    public boolean e() {
        return true;
    }

    @Override // fa.d
    public boolean f() {
        return true;
    }

    @Override // ha.a
    protected void h(ga.b bVar, fa.g gVar, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th) {
        ga.d dVar = new ga.d();
        dVar.k(java.lang.System.currentTimeMillis());
        dVar.e(bVar);
        dVar.f(this.f45715D);
        dVar.g(this.f45714C);
        if (gVar != null) {
            dVar.a(gVar);
        }
        dVar.h(str);
        dVar.i(java.lang.Thread.currentThread().getName());
        dVar.d(objArr);
        dVar.j(th);
        this.f45716E.add(dVar);
    }
}
