package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f19888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private R0.q f19890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private R0.o f19891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private R0.p f19892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private R0.AbstractC1494h f19893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.String f19894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private X0.a f19896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private X0.p f19897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private T0.h f19898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private X0.k f19900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p141o0.c2 f19901n;

    private N0(long j6, long j10, R0.q qVar, R0.o oVar, R0.p pVar, R0.AbstractC1494h abstractC1494h, java.lang.String str, long j11, X0.a aVar, X0.p pVar2, T0.h hVar, long j12, X0.k kVar, p141o0.c2 c2Var) {
        this.f19888a = j6;
        this.f19889b = j10;
        this.f19890c = qVar;
        this.f19891d = oVar;
        this.f19892e = pVar;
        this.f19893f = abstractC1494h;
        this.f19894g = str;
        this.f19895h = j11;
        this.f19896i = aVar;
        this.f19897j = pVar2;
        this.f19898k = hVar;
        this.f19899l = j12;
        this.f19900m = kVar;
        this.f19901n = c2Var;
    }

    public /* synthetic */ N0(long j6, long j10, R0.q qVar, R0.o oVar, R0.p pVar, R0.AbstractC1494h abstractC1494h, java.lang.String str, long j11, X0.a aVar, X0.p pVar2, T0.h hVar, long j12, X0.k kVar, p141o0.c2 c2Var, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? p141o0.C7016y0.f52264b.g() : j6, (i6 & 2) != 0 ? Y0.x.f16237b.a() : j10, (i6 & 4) != 0 ? null : qVar, (i6 & 8) != 0 ? null : oVar, (i6 & 16) != 0 ? null : pVar, (i6 & 32) != 0 ? null : abstractC1494h, (i6 & 64) != 0 ? null : str, (i6 & 128) != 0 ? Y0.x.f16237b.a() : j11, (i6 & 256) != 0 ? null : aVar, (i6 & 512) != 0 ? null : pVar2, (i6 & 1024) != 0 ? null : hVar, (i6 & 2048) != 0 ? p141o0.C7016y0.f52264b.g() : j12, (i6 & 4096) != 0 ? null : kVar, (i6 & 8192) != 0 ? null : c2Var, null);
    }

    public /* synthetic */ N0(long j6, long j10, R0.q qVar, R0.o oVar, R0.p pVar, R0.AbstractC1494h abstractC1494h, java.lang.String str, long j11, X0.a aVar, X0.p pVar2, T0.h hVar, long j12, X0.k kVar, p141o0.c2 c2Var, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, qVar, oVar, pVar, abstractC1494h, str, j11, aVar, pVar2, hVar, j12, kVar, c2Var);
    }

    public final void a(long j6) {
        this.f19899l = j6;
    }

    public final void b(X0.a aVar) {
        this.f19896i = aVar;
    }

    public final void c(long j6) {
        this.f19888a = j6;
    }

    public final void d(java.lang.String str) {
        this.f19894g = str;
    }

    public final void e(long j6) {
        this.f19889b = j6;
    }

    public final void f(R0.o oVar) {
        this.f19891d = oVar;
    }

    public final void g(R0.p pVar) {
        this.f19892e = pVar;
    }

    public final void h(R0.q qVar) {
        this.f19890c = qVar;
    }

    public final void i(long j6) {
        this.f19895h = j6;
    }

    public final void j(p141o0.c2 c2Var) {
        this.f19901n = c2Var;
    }

    public final void k(X0.k kVar) {
        this.f19900m = kVar;
    }

    public final void l(X0.p pVar) {
        this.f19897j = pVar;
    }

    public final M0.C m() {
        return new M0.C(this.f19888a, this.f19889b, this.f19890c, this.f19891d, this.f19892e, this.f19893f, this.f19894g, this.f19895h, this.f19896i, this.f19897j, this.f19898k, this.f19899l, this.f19900m, this.f19901n, null, null, 49152, null);
    }
}
