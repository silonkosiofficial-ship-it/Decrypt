package O3;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f8032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f8033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O3.a f8034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O3.a.d f8035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P3.C1446b f8036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.os.Looper f8037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final O3.f f8039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final P3.k f8040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.C2148c f8041j;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O3.e.a f8042c = new O3.e.a.C0195a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P3.k f8043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final android.os.Looper f8044b;

        /* JADX INFO: renamed from: O3.e$a$a, reason: collision with other inner class name */
        public static class C0195a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private P3.k f8045a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private android.os.Looper f8046b;

            /* JADX WARN: Multi-variable type inference failed */
            public O3.e.a a() {
                if (this.f8045a == null) {
                    this.f8045a = new P3.C1445a();
                }
                if (this.f8046b == null) {
                    this.f8046b = android.os.Looper.getMainLooper();
                }
                return new O3.e.a(this.f8045a, this.f8046b);
            }

            public O3.e.a.C0195a b(P3.k kVar) {
                Q3.AbstractC1477p.m(kVar, "StatusExceptionMapper must not be null.");
                this.f8045a = kVar;
                return this;
            }
        }

        private a(P3.k kVar, android.accounts.Account account, android.os.Looper looper) {
            this.f8043a = kVar;
            this.f8044b = looper;
        }
    }

    public e(android.content.Context context, O3.a aVar, O3.a.d dVar, O3.e.a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }

    private e(android.content.Context context, android.app.Activity activity, O3.a aVar, O3.a.d dVar, O3.e.a aVar2) {
        Q3.AbstractC1477p.m(context, "Null context is not permitted.");
        Q3.AbstractC1477p.m(aVar, "Api must not be null.");
        Q3.AbstractC1477p.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        android.content.Context context2 = (android.content.Context) Q3.AbstractC1477p.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f8032a = context2;
        java.lang.String attributionTag = android.os.Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : h(context);
        this.f8033b = attributionTag;
        this.f8034c = aVar;
        this.f8035d = dVar;
        this.f8037f = aVar2.f8044b;
        P3.C1446b c1446bA = P3.C1446b.a(aVar, dVar, attributionTag);
        this.f8036e = c1446bA;
        this.f8039h = new P3.q(this);
        com.google.android.gms.common.api.internal.C2148c c2148cU = com.google.android.gms.common.api.internal.C2148c.u(context2);
        this.f8041j = c2148cU;
        this.f8038g = c2148cU.l();
        this.f8040i = aVar2.f8043a;
        if (activity != null && !(activity instanceof com.google.android.gms.common.api.GoogleApiActivity) && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.h.u(activity, c2148cU, c1446bA);
        }
        c2148cU.F(this);
    }

    private final com.google.android.gms.common.api.internal.AbstractC2147b p(int i6, com.google.android.gms.common.api.internal.AbstractC2147b abstractC2147b) {
        abstractC2147b.j();
        this.f8041j.A(this, i6, abstractC2147b);
        return abstractC2147b;
    }

    private final p115l4.AbstractC6931l q(int i6, com.google.android.gms.common.api.internal.AbstractC2149d abstractC2149d) {
        p115l4.C6932m c6932m = new p115l4.C6932m();
        this.f8041j.B(this, i6, abstractC2149d, c6932m, this.f8040i);
        return c6932m.a();
    }

    public O3.f c() {
        return this.f8039h;
    }

    protected Q3.C1465d.a d() {
        Q3.C1465d.a aVar = new Q3.C1465d.a();
        aVar.d(null);
        aVar.c(java.util.Collections.emptySet());
        aVar.e(this.f8032a.getClass().getName());
        aVar.b(this.f8032a.getPackageName());
        return aVar;
    }

    public p115l4.AbstractC6931l e(com.google.android.gms.common.api.internal.AbstractC2149d abstractC2149d) {
        return q(2, abstractC2149d);
    }

    public p115l4.AbstractC6931l f(com.google.android.gms.common.api.internal.AbstractC2149d abstractC2149d) {
        return q(0, abstractC2149d);
    }

    public com.google.android.gms.common.api.internal.AbstractC2147b g(com.google.android.gms.common.api.internal.AbstractC2147b abstractC2147b) {
        p(1, abstractC2147b);
        return abstractC2147b;
    }

    protected java.lang.String h(android.content.Context context) {
        return null;
    }

    public final P3.C1446b i() {
        return this.f8036e;
    }

    public android.content.Context j() {
        return this.f8032a;
    }

    protected java.lang.String k() {
        return this.f8033b;
    }

    public android.os.Looper l() {
        return this.f8037f;
    }

    public final int m() {
        return this.f8038g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final O3.a.f n(android.os.Looper looper, com.google.android.gms.common.api.internal.n nVar) {
        Q3.C1465d c1465dA = d().a();
        O3.a.f fVarA = ((O3.a.AbstractC0193a) Q3.AbstractC1477p.l(this.f8034c.a())).a(this.f8032a, looper, c1465dA, this.f8035d, nVar, nVar);
        java.lang.String strK = k();
        if (strK != null && (fVarA instanceof Q3.AbstractC1464c)) {
            ((Q3.AbstractC1464c) fVarA).P(strK);
        }
        if (strK == null || !(fVarA instanceof P3.g)) {
            return fVarA;
        }
        androidx.appcompat.app.D.a(fVarA);
        throw null;
    }

    public final P3.y o(android.content.Context context, android.os.Handler handler) {
        return new P3.y(context, handler, d().a());
    }
}
