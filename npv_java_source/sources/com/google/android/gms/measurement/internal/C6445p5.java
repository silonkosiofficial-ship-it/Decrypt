package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6445p5 extends com.google.android.gms.measurement.internal.AbstractC6504y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.os.Handler f42592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final com.google.android.gms.measurement.internal.C6493w5 f42594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final com.google.android.gms.measurement.internal.C6479u5 f42595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6472t5 f42596g;

    C6445p5(com.google.android.gms.measurement.internal.S2 s6) {
        super(s6);
        this.f42593d = true;
        this.f42594e = new com.google.android.gms.measurement.internal.C6493w5(this);
        this.f42595f = new com.google.android.gms.measurement.internal.C6479u5(this);
        this.f42596g = new com.google.android.gms.measurement.internal.C6472t5(this);
    }

    static /* synthetic */ void C(com.google.android.gms.measurement.internal.C6445p5 c6445p5, long j6) {
        c6445p5.n();
        c6445p5.G();
        c6445p5.j().K().b("Activity paused, time", java.lang.Long.valueOf(j6));
        c6445p5.f42596g.b(j6);
        if (c6445p5.d().V()) {
            c6445p5.f42595f.e(j6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        n();
        if (this.f42592c == null) {
            this.f42592c = new com.google.android.gms.internal.measurement.N0(android.os.Looper.getMainLooper());
        }
    }

    static /* synthetic */ void I(com.google.android.gms.measurement.internal.C6445p5 c6445p5, long j6) {
        c6445p5.n();
        c6445p5.G();
        c6445p5.j().K().b("Activity resumed, time", java.lang.Long.valueOf(j6));
        if (!c6445p5.d().t(com.google.android.gms.measurement.internal.G.f41841P0) ? c6445p5.d().V() || c6445p5.h().f42742u.b() : c6445p5.d().V() || c6445p5.f42593d) {
            c6445p5.f42595f.f(j6);
        }
        c6445p5.f42596g.a();
        com.google.android.gms.measurement.internal.C6493w5 c6493w5 = c6445p5.f42594e;
        c6493w5.f42690a.n();
        if (c6493w5.f42690a.f42679a.p()) {
            c6493w5.b(c6493w5.f42690a.b().a(), false);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6504y2
    protected final boolean A() {
        return false;
    }

    final void D(boolean z6) {
        n();
        this.f42593d = z6;
    }

    public final boolean E(boolean z6, boolean z10, long j6) {
        return this.f42595f.d(z6, z10, j6);
    }

    final boolean F() {
        n();
        return this.f42593d;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ android.content.Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ V3.f b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6376g d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6494x e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6348c f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6386h2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.d6 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6428n2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6491w3, com.google.android.gms.measurement.internal.InterfaceC6505y3
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.P2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1, com.google.android.gms.measurement.internal.AbstractC6491w3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6501y o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6379g2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6372f2 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F3 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6492w4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.F4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6336a1
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 u() {
        return super.u();
    }
}
