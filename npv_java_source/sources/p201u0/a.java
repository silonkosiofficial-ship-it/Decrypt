package p201u0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p141o0.E1 f55163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p141o0.InterfaceC6993q0 f55164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Y0.e f55165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Y0.v f55166d = Y0.v.Ltr;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f55167e = Y0.t.f16230b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55168f = p141o0.F1.f52118b.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p161q0.a f55169g = new p161q0.a();

    private final void a(p161q0.g gVar) {
        p161q0.f.m(gVar, p141o0.C7016y0.f52264b.a(), 0L, 0L, 0.0f, null, null, p141o0.AbstractC6960f0.f52197a.a(), 62, null);
    }

    public final void b(int i6, long j6, Y0.e eVar, Y0.v vVar, p237x7.l lVar) {
        this.f55165c = eVar;
        this.f55166d = vVar;
        p141o0.E1 e1B = this.f55163a;
        p141o0.InterfaceC6993q0 interfaceC6993q0A = this.f55164b;
        if (e1B == null || interfaceC6993q0A == null || Y0.t.g(j6) > e1B.getWidth() || Y0.t.f(j6) > e1B.getHeight() || !p141o0.F1.i(this.f55168f, i6)) {
            e1B = p141o0.G1.b(Y0.t.g(j6), Y0.t.f(j6), i6, false, null, 24, null);
            interfaceC6993q0A = p141o0.AbstractC6998s0.a(e1B);
            this.f55163a = e1B;
            this.f55164b = interfaceC6993q0A;
            this.f55168f = i6;
        }
        this.f55167e = j6;
        p161q0.a aVar = this.f55169g;
        long jD = Y0.u.d(j6);
        p161q0.a.C0685a c0685aH = aVar.H();
        Y0.e eVarA = c0685aH.a();
        Y0.v vVarB = c0685aH.b();
        p141o0.InterfaceC6993q0 interfaceC6993q0C = c0685aH.c();
        long jD2 = c0685aH.d();
        p161q0.a.C0685a c0685aH2 = aVar.H();
        c0685aH2.j(eVar);
        c0685aH2.k(vVar);
        c0685aH2.i(interfaceC6993q0A);
        c0685aH2.l(jD);
        interfaceC6993q0A.m();
        a(aVar);
        lVar.l(aVar);
        interfaceC6993q0A.s();
        p161q0.a.C0685a c0685aH3 = aVar.H();
        c0685aH3.j(eVarA);
        c0685aH3.k(vVarB);
        c0685aH3.i(interfaceC6993q0C);
        c0685aH3.l(jD2);
        e1B.a();
    }

    public final void c(p161q0.g gVar, float f6, p141o0.AbstractC7019z0 abstractC7019z0) {
        p141o0.E1 e6 = this.f55163a;
        if (!(e6 != null)) {
            C0.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        p161q0.f.f(gVar, e6, 0L, this.f55167e, 0L, 0L, f6, null, abstractC7019z0, 0, 0, 858, null);
    }

    public final p141o0.E1 d() {
        return this.f55163a;
    }
}
