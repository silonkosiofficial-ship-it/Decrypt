package p101k0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends android.view.View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y0.e f49342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f49343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.l f49344c;

    private a(Y0.e eVar, long j6, p237x7.l lVar) {
        this.f49342a = eVar;
        this.f49343b = j6;
        this.f49344c = lVar;
    }

    public /* synthetic */ a(Y0.e eVar, long j6, p237x7.l lVar, p247y7.AbstractC7342k abstractC7342k) {
        this(eVar, j6, lVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(android.graphics.Canvas canvas) {
        p161q0.a aVar = new p161q0.a();
        Y0.e eVar = this.f49342a;
        long j6 = this.f49343b;
        Y0.v vVar = Y0.v.Ltr;
        p141o0.InterfaceC6993q0 interfaceC6993q0B = p141o0.H.b(canvas);
        p237x7.l lVar = this.f49344c;
        p161q0.a.C0685a c0685aH = aVar.H();
        Y0.e eVarA = c0685aH.a();
        Y0.v vVarB = c0685aH.b();
        p141o0.InterfaceC6993q0 interfaceC6993q0C = c0685aH.c();
        long jD = c0685aH.d();
        p161q0.a.C0685a c0685aH2 = aVar.H();
        c0685aH2.j(eVar);
        c0685aH2.k(vVar);
        c0685aH2.i(interfaceC6993q0B);
        c0685aH2.l(j6);
        interfaceC6993q0B.m();
        lVar.l(aVar);
        interfaceC6993q0B.s();
        p161q0.a.C0685a c0685aH3 = aVar.H();
        c0685aH3.j(eVarA);
        c0685aH3.k(vVarB);
        c0685aH3.i(interfaceC6993q0C);
        c0685aH3.l(jD);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(android.graphics.Point point, android.graphics.Point point2) {
        Y0.e eVar = this.f49342a;
        point.set(eVar.S0(eVar.q0(p131n0.m.i(this.f49343b))), eVar.S0(eVar.q0(p131n0.m.g(this.f49343b))));
        point2.set(point.x / 2, point.y / 2);
    }
}
