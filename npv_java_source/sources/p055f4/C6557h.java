package p055f4;

/* JADX INFO: renamed from: f4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6557h extends p055f4.AbstractC6543a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p055f4.C6557h f45137b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p055f4.V0 f45138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p055f4.V0 f45139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p055f4.V0 f45140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p055f4.V0 f45141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p055f4.V0 f45142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p055f4.V0 f45143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p055f4.V0 f45144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p055f4.V0 f45145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p055f4.V0 f45146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p055f4.V0 f45147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p055f4.V0 f45148m;

    /* synthetic */ C6557h(android.app.Application application, p055f4.AbstractC6555g abstractC6555g) {
        p055f4.S0 s0B = p055f4.T0.b(application);
        this.f45138c = s0B;
        p055f4.V0 v0B = p055f4.R0.b(new p055f4.r(s0B));
        this.f45139d = v0B;
        p055f4.V0 v0B2 = p055f4.R0.b(p055f4.AbstractC6549d.f45110a);
        this.f45140e = v0B2;
        p055f4.C6553f c6553f = new p055f4.C6553f(this);
        this.f45141f = c6553f;
        p055f4.V0 v0B3 = p055f4.R0.b(new p055f4.Q(c6553f, p055f4.AbstractC6582u.f45253a));
        this.f45142g = v0B3;
        p055f4.j1 j1Var = new p055f4.j1(s0B, v0B);
        this.f45143h = j1Var;
        p055f4.V0 v0B4 = p055f4.R0.b(new p055f4.Y0(p055f4.AbstractC6582u.f45253a));
        this.f45144i = v0B4;
        p055f4.C6573p c6573p = new p055f4.C6573p(s0B, v0B, p055f4.AbstractC6582u.f45253a);
        this.f45145j = c6573p;
        p055f4.C6545b c6545b = new p055f4.C6545b(v0B4, c6573p, v0B);
        this.f45146k = c6545b;
        p055f4.q1 q1Var = new p055f4.q1(s0B, v0B2, p055f4.AbstractC6578s.f45247a, p055f4.AbstractC6582u.f45253a, v0B, v0B3, j1Var, c6545b, v0B4);
        this.f45147l = q1Var;
        this.f45148m = p055f4.R0.b(new p055f4.d1(v0B, q1Var, v0B3));
    }

    @Override // p055f4.AbstractC6543a
    public final p055f4.c1 b() {
        return (p055f4.c1) this.f45148m.a();
    }

    @Override // p055f4.AbstractC6543a
    public final p055f4.P c() {
        return (p055f4.P) this.f45142g.a();
    }
}
