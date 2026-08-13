package S0;

/* JADX INFO: renamed from: S0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1597e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p251z0.Q f12331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S0.InterfaceC1612u f12332b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private S0.V f12340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private M0.K f12341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private S0.L f12342l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p131n0.i f12344n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p131n0.i f12345o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f12333c = new java.lang.Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p237x7.l f12343m = S0.C1597e.b.f12350D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final android.view.inputmethod.CursorAnchorInfo.Builder f12346p = new android.view.inputmethod.CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float[] f12347q = p141o0.J1.c(null, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final android.graphics.Matrix f12348r = new android.graphics.Matrix();

    /* JADX INFO: renamed from: S0.e$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S0.C1597e.a f12349D = new S0.C1597e.a();

        a() {
            super(1);
        }

        public final void a(float[] fArr) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((p141o0.J1) obj).r());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: S0.e$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final S0.C1597e.b f12350D = new S0.C1597e.b();

        b() {
            super(1);
        }

        public final void a(float[] fArr) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((p141o0.J1) obj).r());
            return p087i7.M.f46721a;
        }
    }

    public C1597e(p251z0.Q q6, S0.InterfaceC1612u interfaceC1612u) {
        this.f12331a = q6;
        this.f12332b = interfaceC1612u;
    }

    private final void c() {
        if (this.f12332b.f()) {
            this.f12343m.l(p141o0.J1.a(this.f12347q));
            this.f12331a.k(this.f12347q);
            p141o0.S.a(this.f12348r, this.f12347q);
            S0.InterfaceC1612u interfaceC1612u = this.f12332b;
            android.view.inputmethod.CursorAnchorInfo.Builder builder = this.f12346p;
            S0.V v6 = this.f12340j;
            p247y7.AbstractC7350t.c(v6);
            S0.L l6 = this.f12342l;
            p247y7.AbstractC7350t.c(l6);
            M0.K k6 = this.f12341k;
            p247y7.AbstractC7350t.c(k6);
            android.graphics.Matrix matrix = this.f12348r;
            p131n0.i iVar = this.f12344n;
            p247y7.AbstractC7350t.c(iVar);
            p131n0.i iVar2 = this.f12345o;
            p247y7.AbstractC7350t.c(iVar2);
            interfaceC1612u.j(S0.AbstractC1596d.b(builder, v6, l6, k6, matrix, iVar, iVar2, this.f12336f, this.f12337g, this.f12338h, this.f12339i));
            this.f12335e = false;
        }
    }

    public final void a() {
        synchronized (this.f12333c) {
            this.f12340j = null;
            this.f12342l = null;
            this.f12341k = null;
            this.f12343m = S0.C1597e.a.f12349D;
            this.f12344n = null;
            this.f12345o = null;
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    public final void b(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        synchronized (this.f12333c) {
            try {
                this.f12336f = z11;
                this.f12337g = z12;
                this.f12338h = z13;
                this.f12339i = z14;
                if (z6) {
                    this.f12335e = true;
                    if (this.f12340j != null) {
                        c();
                    }
                }
                this.f12334d = z10;
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d(S0.V v6, S0.L l6, M0.K k6, p237x7.l lVar, p131n0.i iVar, p131n0.i iVar2) {
        synchronized (this.f12333c) {
            try {
                this.f12340j = v6;
                this.f12342l = l6;
                this.f12341k = k6;
                this.f12343m = lVar;
                this.f12344n = iVar;
                this.f12345o = iVar2;
                if (this.f12335e || this.f12334d) {
                    c();
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
