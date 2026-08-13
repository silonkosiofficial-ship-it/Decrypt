package P3;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p105k4.d implements O3.f.a, O3.f.b {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final O3.a.AbstractC0193a f8326J = p095j4.d.f49275c;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f8327C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.os.Handler f8328D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final O3.a.AbstractC0193a f8329E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.Set f8330F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Q3.C1465d f8331G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private p095j4.e f8332H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private P3.x f8333I;

    public y(android.content.Context context, android.os.Handler handler, Q3.C1465d c1465d) {
        O3.a.AbstractC0193a abstractC0193a = f8326J;
        this.f8327C = context;
        this.f8328D = handler;
        this.f8331G = (Q3.C1465d) Q3.AbstractC1477p.m(c1465d, "ClientSettings must not be null");
        this.f8330F = c1465d.g();
        this.f8329E = abstractC0193a;
    }

    static /* bridge */ /* synthetic */ void T2(P3.y yVar, p105k4.l lVar) {
        N3.C1389b c1389bE = lVar.e();
        if (c1389bE.C()) {
            Q3.O o6 = (Q3.O) Q3.AbstractC1477p.l(lVar.f());
            c1389bE = o6.e();
            if (c1389bE.C()) {
                yVar.f8333I.b(o6.f(), yVar.f8330F);
            } else {
                java.lang.String strValueOf = java.lang.String.valueOf(c1389bE);
                new java.lang.Exception();
                "Sign-in succeeded with resolve account failure: ".concat(strValueOf);
                yVar.f8333I.c(c1389bE);
            }
        } else {
            yVar.f8333I.c(c1389bE);
        }
        yVar.f8332H.h();
    }

    @Override // P3.InterfaceC1447c
    public final void L0(android.os.Bundle bundle) {
        this.f8332H.b(this);
    }

    @Override // p105k4.f
    public final void V3(p105k4.l lVar) {
        this.f8328D.post(new P3.w(this, lVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [O3.a$f, j4.e] */
    public final void f3(P3.x xVar) {
        p095j4.e eVar = this.f8332H;
        if (eVar != null) {
            eVar.h();
        }
        this.f8331G.k(java.lang.Integer.valueOf(java.lang.System.identityHashCode(this)));
        O3.a.AbstractC0193a abstractC0193a = this.f8329E;
        android.content.Context context = this.f8327C;
        android.os.Handler handler = this.f8328D;
        Q3.C1465d c1465d = this.f8331G;
        this.f8332H = abstractC0193a.a(context, handler.getLooper(), c1465d, c1465d.h(), this, this);
        this.f8333I = xVar;
        java.util.Set set = this.f8330F;
        if (set == null || set.isEmpty()) {
            this.f8328D.post(new P3.v(this));
        } else {
            this.f8332H.p();
        }
    }

    public final void p4() {
        p095j4.e eVar = this.f8332H;
        if (eVar != null) {
            eVar.h();
        }
    }

    @Override // P3.h
    public final void q0(N3.C1389b c1389b) {
        this.f8333I.c(c1389b);
    }

    @Override // P3.InterfaceC1447c
    public final void y0(int i6) {
        this.f8333I.d(i6);
    }
}
