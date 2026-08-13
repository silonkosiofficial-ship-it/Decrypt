package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19938a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.graphics.Outline f19939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p141o0.L1 f19940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p141o0.Q1 f19941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p141o0.Q1 f19942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p141o0.Q1 f19945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p131n0.k f19946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f19947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p141o0.Q1 f19951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p141o0.Q1 f19952o;

    public P0() {
        android.graphics.Outline outline = new android.graphics.Outline();
        outline.setAlpha(1.0f);
        this.f19939b = outline;
        this.f19948k = p131n0.g.f51312b.c();
        this.f19949l = p131n0.m.f51333b.b();
    }

    private final boolean g(p131n0.k kVar, long j6, long j10, float f6) {
        return kVar != null && p131n0.l.e(kVar) && kVar.e() == p131n0.g.m(j6) && kVar.g() == p131n0.g.n(j6) && kVar.f() == p131n0.g.m(j6) + p131n0.m.i(j10) && kVar.a() == p131n0.g.n(j6) + p131n0.m.g(j10) && p131n0.a.d(kVar.h()) == f6;
    }

    private final void i() {
        if (this.f19943f) {
            this.f19948k = p131n0.g.f51312b.c();
            this.f19947j = 0.0f;
            this.f19942e = null;
            this.f19943f = false;
            this.f19944g = false;
            p141o0.L1 l6 = this.f19940c;
            if (l6 == null || !this.f19950m || p131n0.m.i(this.f19949l) <= 0.0f || p131n0.m.g(this.f19949l) <= 0.0f) {
                this.f19939b.setEmpty();
                return;
            }
            this.f19938a = true;
            if (l6 instanceof o0.L1.b) {
                k(((o0.L1.b) l6).b());
            } else if (l6 instanceof o0.L1.c) {
                l(((o0.L1.c) l6).b());
            } else if (l6 instanceof o0.L1.a) {
                j(((o0.L1.a) l6).b());
            }
        }
    }

    private final void j(p141o0.Q1 q6) {
        if (android.os.Build.VERSION.SDK_INT > 28 || q6.c()) {
            android.graphics.Outline outline = this.f19939b;
            if (!(q6 instanceof p141o0.V)) {
                throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((p141o0.V) q6).s());
            this.f19944g = !this.f19939b.canClip();
        } else {
            this.f19938a = false;
            this.f19939b.setEmpty();
            this.f19944g = true;
        }
        this.f19942e = q6;
    }

    private final void k(p131n0.i iVar) {
        this.f19948k = p131n0.h.a(iVar.i(), iVar.l());
        this.f19949l = p131n0.n.a(iVar.n(), iVar.h());
        this.f19939b.setRect(java.lang.Math.round(iVar.i()), java.lang.Math.round(iVar.l()), java.lang.Math.round(iVar.j()), java.lang.Math.round(iVar.e()));
    }

    private final void l(p131n0.k kVar) {
        float fD = p131n0.a.d(kVar.h());
        this.f19948k = p131n0.h.a(kVar.e(), kVar.g());
        this.f19949l = p131n0.n.a(kVar.j(), kVar.d());
        if (p131n0.l.e(kVar)) {
            this.f19939b.setRoundRect(java.lang.Math.round(kVar.e()), java.lang.Math.round(kVar.g()), java.lang.Math.round(kVar.f()), java.lang.Math.round(kVar.a()), fD);
            this.f19947j = fD;
            return;
        }
        p141o0.Q1 q1A = this.f19941d;
        if (q1A == null) {
            q1A = p141o0.Y.a();
            this.f19941d = q1A;
        }
        q1A.a();
        p141o0.P1.c(q1A, kVar, null, 2, null);
        j(q1A);
    }

    public final void a(p141o0.InterfaceC6993q0 interfaceC6993q0) {
        p141o0.Q1 q1D = d();
        if (q1D != null) {
            p141o0.AbstractC6990p0.c(interfaceC6993q0, q1D, 0, 2, null);
            return;
        }
        float f6 = this.f19947j;
        if (f6 <= 0.0f) {
            p141o0.AbstractC6990p0.d(interfaceC6993q0, p131n0.g.m(this.f19948k), p131n0.g.n(this.f19948k), p131n0.g.m(this.f19948k) + p131n0.m.i(this.f19949l), p131n0.g.n(this.f19948k) + p131n0.m.g(this.f19949l), 0, 16, null);
            return;
        }
        p141o0.Q1 q1A = this.f19945h;
        p131n0.k kVar = this.f19946i;
        if (q1A == null || !g(kVar, this.f19948k, this.f19949l, f6)) {
            p131n0.k kVarC = p131n0.l.c(p131n0.g.m(this.f19948k), p131n0.g.n(this.f19948k), p131n0.g.m(this.f19948k) + p131n0.m.i(this.f19949l), p131n0.g.n(this.f19948k) + p131n0.m.g(this.f19949l), p131n0.b.b(this.f19947j, 0.0f, 2, null));
            if (q1A == null) {
                q1A = p141o0.Y.a();
            } else {
                q1A.a();
            }
            p141o0.P1.c(q1A, kVarC, null, 2, null);
            this.f19946i = kVarC;
            this.f19945h = q1A;
        }
        p141o0.AbstractC6990p0.c(interfaceC6993q0, q1A, 0, 2, null);
    }

    public final android.graphics.Outline b() {
        i();
        if (this.f19950m && this.f19938a) {
            return this.f19939b;
        }
        return null;
    }

    public final boolean c() {
        return this.f19943f;
    }

    public final p141o0.Q1 d() {
        i();
        return this.f19942e;
    }

    public final boolean e() {
        return !this.f19944g;
    }

    public final boolean f(long j6) {
        p141o0.L1 l6;
        if (this.f19950m && (l6 = this.f19940c) != null) {
            return androidx.compose.ui.platform.AbstractC1972r1.b(l6, p131n0.g.m(j6), p131n0.g.n(j6), this.f19951n, this.f19952o);
        }
        return true;
    }

    public final boolean h(p141o0.L1 l6, float f6, boolean z6, float f10, long j6) {
        this.f19939b.setAlpha(f6);
        boolean z10 = !p247y7.AbstractC7350t.b(this.f19940c, l6);
        if (z10) {
            this.f19940c = l6;
            this.f19943f = true;
        }
        this.f19949l = j6;
        boolean z11 = l6 != null && (z6 || f10 > 0.0f);
        if (this.f19950m != z11) {
            this.f19950m = z11;
            this.f19943f = true;
        }
        return z10;
    }
}
