package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class y implements androidx.lifecycle.InterfaceC2077i, p233x2.f, androidx.lifecycle.Y {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.fragment.app.f f22729C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.lifecycle.X f22730D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private androidx.lifecycle.V.c f22731E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.lifecycle.C2087t f22732F = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p233x2.e f22733G = null;

    y(androidx.fragment.app.f fVar, androidx.lifecycle.X x6) {
        this.f22729C = fVar;
        this.f22730D = x6;
    }

    void a(androidx.lifecycle.AbstractC2079k.a aVar) {
        this.f22732F.i(aVar);
    }

    void c() {
        if (this.f22732F == null) {
            this.f22732F = new androidx.lifecycle.C2087t(this);
            p233x2.e eVarA = p233x2.e.a(this);
            this.f22733G = eVarA;
            eVarA.c();
        }
    }

    boolean d() {
        return this.f22732F != null;
    }

    void e(android.os.Bundle bundle) {
        this.f22733G.d(bundle);
    }

    void f(android.os.Bundle bundle) {
        this.f22733G.e(bundle);
    }

    void g(androidx.lifecycle.AbstractC2079k.b bVar) {
        this.f22732F.n(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC2077i
    public androidx.lifecycle.V.c j() {
        android.app.Application application;
        androidx.lifecycle.V.c cVarJ = this.f22729C.j();
        if (!cVarJ.equals(this.f22729C.f22521y0)) {
            this.f22731E = cVarJ;
            return cVarJ;
        }
        if (this.f22731E == null) {
            android.content.Context applicationContext = this.f22729C.p1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof android.content.ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof android.app.Application) {
                    application = (android.app.Application) applicationContext;
                    break;
                }
                applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
            }
            androidx.fragment.app.f fVar = this.f22729C;
            this.f22731E = new androidx.lifecycle.O(application, fVar, fVar.r());
        }
        return this.f22731E;
    }

    @Override // androidx.lifecycle.InterfaceC2077i
    public p023c2.a k() {
        android.app.Application application;
        android.content.Context applicationContext = this.f22729C.p1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof android.content.ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
                break;
            }
            applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
        }
        p023c2.d dVar = new p023c2.d();
        if (application != null) {
            dVar.c(androidx.lifecycle.V.a.f22795g, application);
        }
        dVar.c(androidx.lifecycle.L.f22766a, this.f22729C);
        dVar.c(androidx.lifecycle.L.f22767b, this);
        if (this.f22729C.r() != null) {
            dVar.c(androidx.lifecycle.L.f22768c, this.f22729C.r());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.Y
    public androidx.lifecycle.X n() {
        c();
        return this.f22730D;
    }

    @Override // p233x2.f
    public p233x2.d p() {
        c();
        return this.f22733G.b();
    }

    @Override // androidx.lifecycle.r
    public androidx.lifecycle.AbstractC2079k u() {
        c();
        return this.f22732F;
    }
}
