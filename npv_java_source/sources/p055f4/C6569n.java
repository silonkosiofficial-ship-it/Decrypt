package p055f4;

/* JADX INFO: renamed from: f4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6569n implements p055f4.InterfaceC6588x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p055f4.C6557h f45195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p055f4.V0 f45196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p055f4.V0 f45197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p055f4.V0 f45198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p055f4.V0 f45199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p055f4.V0 f45200f;

    /* synthetic */ C6569n(p055f4.C6557h c6557h, p055f4.S s6, p055f4.AbstractC6567m abstractC6567m) {
        this.f45195a = c6557h;
        p055f4.V0 v0B = p055f4.R0.b(new p055f4.C6544a0(c6557h.f45138c));
        this.f45196b = v0B;
        p055f4.S0 s0B = p055f4.T0.b(s6);
        this.f45197c = s0B;
        p055f4.Q0 q6 = new p055f4.Q0();
        this.f45198d = q6;
        p055f4.C6554f0 c6554f0 = new p055f4.C6554f0(c6557h.f45138c, v0B, p055f4.AbstractC6578s.f45247a, p055f4.AbstractC6582u.f45253a, c6557h.f45144i, c6557h.f45145j, q6, c6557h.f45139d);
        this.f45199e = c6554f0;
        p055f4.Y y6 = new p055f4.Y(v0B, p055f4.AbstractC6578s.f45247a, c6554f0);
        this.f45200f = y6;
        p055f4.Q0.b(q6, p055f4.R0.b(new p055f4.E(c6557h.f45138c, c6557h.f45140e, v0B, c6557h.f45139d, s0B, y6)));
    }

    @Override // p055f4.InterfaceC6588x
    public final p055f4.D a() {
        return (p055f4.D) this.f45198d.a();
    }
}
