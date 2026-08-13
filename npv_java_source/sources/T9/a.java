package T9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements W9.a, T9.b.a, H9.InterfaceC1240f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.z f13334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W9.b f13335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private M9.e f13336c;

    public a(H9.z zVar, W9.b bVar) {
        p247y7.AbstractC7350t.f(zVar, "request");
        p247y7.AbstractC7350t.f(bVar, "listener");
        this.f13334a = zVar;
        this.f13335b = bVar;
    }

    private final boolean f(H9.C c6) {
        H9.w wVarF = c6.f();
        return wVarF != null && p247y7.AbstractC7350t.b(wVarF.d(), "text") && p247y7.AbstractC7350t.b(wVarF.c(), "event-stream");
    }

    @Override // T9.b.a
    public void a(long j6) {
    }

    @Override // T9.b.a
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p247y7.AbstractC7350t.f(str3, "data");
        this.f13335b.b(this, str, str2, str3);
    }

    @Override // H9.InterfaceC1240f
    public void c(H9.InterfaceC1239e interfaceC1239e, H9.B b6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(interfaceC1239e, "call");
        p247y7.AbstractC7350t.f(b6, "response");
        g(b6);
    }

    @Override // W9.a
    public void cancel() {
        M9.e eVar = this.f13336c;
        if (eVar == null) {
            p247y7.AbstractC7350t.p("call");
            eVar = null;
        }
        eVar.cancel();
    }

    @Override // H9.InterfaceC1240f
    public void d(H9.InterfaceC1239e interfaceC1239e, java.io.IOException iOException) {
        p247y7.AbstractC7350t.f(interfaceC1239e, "call");
        p247y7.AbstractC7350t.f(iOException, "e");
        this.f13335b.c(this, iOException, null);
    }

    public final void e(H9.x xVar) {
        p247y7.AbstractC7350t.f(xVar, "client");
        H9.InterfaceC1239e interfaceC1239eE = xVar.C().d(H9.r.f4799b).a().E(this.f13334a);
        p247y7.AbstractC7350t.d(interfaceC1239eE, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall");
        M9.e eVar = (M9.e) interfaceC1239eE;
        this.f13336c = eVar;
        if (eVar == null) {
            p247y7.AbstractC7350t.p("call");
            eVar = null;
        }
        eVar.N(this);
    }

    public final void g(H9.B b6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(b6, "response");
        try {
            if (!b6.N()) {
                this.f13335b.c(this, null, b6);
                p197t7.b.a(b6, null);
                return;
            }
            H9.C cA = b6.a();
            p247y7.AbstractC7350t.c(cA);
            if (!f(cA)) {
                this.f13335b.c(this, new java.lang.IllegalStateException("Invalid content-type: " + cA.f()), b6);
                p197t7.b.a(b6, null);
                return;
            }
            M9.e eVar = this.f13336c;
            if (eVar == null) {
                p247y7.AbstractC7350t.p("call");
                eVar = null;
            }
            eVar.C();
            H9.B bC = b6.g0().b(I9.d.f5549c).c();
            T9.b bVar = new T9.b(cA.g(), this);
            try {
                this.f13335b.d(this, bC);
                do {
                } while (bVar.d());
                this.f13335b.a(this);
                p087i7.M m6 = p087i7.M.f46721a;
                p197t7.b.a(b6, null);
            } catch (java.lang.Exception e6) {
                this.f13335b.c(this, e6, bC);
                p197t7.b.a(b6, null);
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                p197t7.b.a(b6, th);
                throw th2;
            }
        }
    }
}
