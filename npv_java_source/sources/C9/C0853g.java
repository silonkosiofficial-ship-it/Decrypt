package C9;

/* JADX INFO: renamed from: C9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0853g implements androidx.lifecycle.r, androidx.lifecycle.Y {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f1436C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private D9.c f1437D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f1438E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.Map f1439F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final C9.Q f1440G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final C9.G f1441H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private C9.P f1442I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f1443J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f1444K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f1445L;

    /* JADX INFO: renamed from: C9.g$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1446a;

        static {
            int[] iArr = new int[androidx.lifecycle.AbstractC2079k.a.values().length];
            try {
                iArr[androidx.lifecycle.AbstractC2079k.a.ON_DESTROY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            f1446a = iArr;
        }
    }

    public C0853g(java.lang.String str, D9.c cVar, java.lang.String str2, java.util.Map map, C9.Q q6, C9.G g6) {
        p247y7.AbstractC7350t.f(str, "stateId");
        p247y7.AbstractC7350t.f(cVar, "routeInternal");
        p247y7.AbstractC7350t.f(str2, "path");
        p247y7.AbstractC7350t.f(map, "pathMap");
        p247y7.AbstractC7350t.f(q6, "provider");
        this.f1436C = str;
        this.f1437D = cVar;
        this.f1438E = str2;
        this.f1439F = map;
        this.f1440G = q6;
        this.f1441H = g6;
        this.f1444K = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: C9.e
            @Override // p237x7.a
            public final java.lang.Object b() {
                return C9.C0853g.t(this.f1434C);
            }
        });
        g().i(androidx.lifecycle.AbstractC2079k.a.ON_CREATE);
        this.f1445L = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: C9.f
            @Override // p237x7.a
            public final java.lang.Object b() {
                return C9.C0853g.y(this.f1435C);
            }
        });
    }

    private final androidx.lifecycle.C2087t g() {
        return (androidx.lifecycle.C2087t) this.f1444K.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.C2087t t(C9.C0853g c0853g) {
        return new androidx.lifecycle.C2087t(c0853g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.X y(C9.C0853g c0853g) {
        return c0853g.f1440G.b(c0853g.f1436C);
    }

    public final void d() {
        g().i(androidx.lifecycle.AbstractC2079k.a.ON_RESUME);
    }

    public final void e() {
        if (g().b().g(androidx.lifecycle.AbstractC2079k.b.STARTED)) {
            this.f1443J = true;
        } else {
            f();
        }
    }

    public final void f() {
        g().i(androidx.lifecycle.AbstractC2079k.a.ON_DESTROY);
        this.f1440G.a(this.f1436C);
        C9.P p6 = this.f1442I;
        if (p6 != null) {
            p6.a(this.f1436C);
        }
    }

    public final E9.a h() {
        D9.d dVarC = D9.b.c(k());
        if (dVarC != null) {
            return dVarC.d();
        }
        return null;
    }

    public final java.lang.String i() {
        return this.f1438E;
    }

    public final java.util.Map j() {
        return this.f1439F;
    }

    public final D9.c k() {
        return this.f1437D;
    }

    public final D9.c l() {
        return this.f1437D;
    }

    public final java.lang.String m() {
        return this.f1436C;
    }

    @Override // androidx.lifecycle.Y
    public androidx.lifecycle.X n() {
        return (androidx.lifecycle.X) this.f1445L.getValue();
    }

    public final C9.O o() {
        D9.d dVarC = D9.b.c(k());
        if (dVarC == null) {
            return null;
        }
        dVarC.e();
        return null;
    }

    public final C9.P q() {
        return this.f1442I;
    }

    public final boolean r(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "route");
        if (p247y7.AbstractC7350t.b(k().b(), str)) {
            return true;
        }
        k();
        return false;
    }

    public final void s() {
        g().i(androidx.lifecycle.AbstractC2079k.a.ON_STOP);
        if (this.f1443J) {
            e();
        }
    }

    @Override // androidx.lifecycle.r
    public androidx.lifecycle.AbstractC2079k u() {
        return g();
    }

    public final void v(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(rVar, "source");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (C9.C0853g.a.f1446a[aVar.ordinal()] == 1) {
            e();
        } else {
            g().i(aVar);
        }
    }

    public final void w(D9.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<set-?>");
        this.f1437D = cVar;
    }

    public final void x(C9.P p6) {
        this.f1442I = p6;
    }
}
