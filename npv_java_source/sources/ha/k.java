package ha;

/* JADX INFO: loaded from: classes2.dex */
public class k implements fa.d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f46601C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile fa.d f46602D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Boolean f46603E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.reflect.Method f46604F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ga.a f46605G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.Queue f46606H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f46607I;

    public k(java.lang.String str, java.util.Queue queue, boolean z6) {
        this.f46601C = str;
        this.f46606H = queue;
        this.f46607I = z6;
    }

    private fa.d i() {
        if (this.f46605G == null) {
            this.f46605G = new ga.a(this, this.f46606H);
        }
        return this.f46605G;
    }

    @Override // fa.d
    public boolean a() {
        return h().a();
    }

    @Override // fa.d
    public boolean b() {
        return h().b();
    }

    @Override // fa.d
    public boolean c() {
        return h().c();
    }

    @Override // fa.d
    public boolean d(ga.b bVar) {
        return h().d(bVar);
    }

    @Override // fa.d
    public boolean e() {
        return h().e();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f46601C.equals(((ha.k) obj).f46601C);
    }

    @Override // fa.d
    public boolean f() {
        return h().f();
    }

    @Override // fa.d
    public void g(java.lang.String str) {
        h().g(str);
    }

    public fa.d h() {
        if (this.f46602D != null) {
            return this.f46602D;
        }
        return this.f46607I ? ha.e.f46584C : i();
    }

    public int hashCode() {
        return this.f46601C.hashCode();
    }

    public java.lang.String j() {
        return this.f46601C;
    }

    public boolean k() {
        java.lang.Boolean bool = this.f46603E;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f46604F = this.f46602D.getClass().getMethod("log", ga.c.class);
            this.f46603E = java.lang.Boolean.TRUE;
        } catch (java.lang.NoSuchMethodException unused) {
            this.f46603E = java.lang.Boolean.FALSE;
        }
        return this.f46603E.booleanValue();
    }

    public boolean l() {
        return this.f46602D instanceof ha.e;
    }

    public boolean m() {
        return this.f46602D == null;
    }

    public void n(ga.c cVar) {
        if (k()) {
            try {
                this.f46604F.invoke(this.f46602D, cVar);
            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    public void o(fa.d dVar) {
        this.f46602D = dVar;
    }
}
