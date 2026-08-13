package p041e0;

/* JADX INFO: loaded from: classes.dex */
final class c implements p041e0.l, V.Z0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p041e0.j f44477C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p041e0.g f44478D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.String f44479E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.Object f44480F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.lang.Object[] f44481G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private e0.g.a f44482H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p237x7.a f44483I = new e0.c.a();

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        public final java.lang.Object b() {
            p041e0.j jVar = p041e0.c.this.f44477C;
            p041e0.c cVar = p041e0.c.this;
            java.lang.Object obj = cVar.f44480F;
            if (obj != null) {
                return jVar.b(cVar, obj);
            }
            throw new java.lang.IllegalArgumentException("Value should be initialized".toString());
        }
    }

    public c(p041e0.j jVar, p041e0.g gVar, java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) {
        this.f44477C = jVar;
        this.f44478D = gVar;
        this.f44479E = str;
        this.f44480F = obj;
        this.f44481G = objArr;
    }

    private final void h() {
        p041e0.g gVar = this.f44478D;
        if (this.f44482H == null) {
            if (gVar != null) {
                p041e0.b.f(gVar, this.f44483I.b());
                this.f44482H = gVar.e(this.f44479E, this.f44483I);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException(("entry(" + this.f44482H + ") is not null").toString());
    }

    @Override // p041e0.l
    public boolean a(java.lang.Object obj) {
        p041e0.g gVar = this.f44478D;
        return gVar == null || gVar.a(obj);
    }

    @Override // V.Z0
    public void b() {
        e0.g.a aVar = this.f44482H;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // V.Z0
    public void c() {
        e0.g.a aVar = this.f44482H;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // V.Z0
    public void d() {
        h();
    }

    public final java.lang.Object g(java.lang.Object[] objArr) {
        if (java.util.Arrays.equals(objArr, this.f44481G)) {
            return this.f44480F;
        }
        return null;
    }

    public final void i(p041e0.j jVar, p041e0.g gVar, java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) {
        boolean z6;
        boolean z10 = true;
        if (this.f44478D != gVar) {
            this.f44478D = gVar;
            z6 = true;
        } else {
            z6 = false;
        }
        if (p247y7.AbstractC7350t.b(this.f44479E, str)) {
            z10 = z6;
        } else {
            this.f44479E = str;
        }
        this.f44477C = jVar;
        this.f44480F = obj;
        this.f44481G = objArr;
        e0.g.a aVar = this.f44482H;
        if (aVar == null || !z10) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f44482H = null;
        h();
    }
}
