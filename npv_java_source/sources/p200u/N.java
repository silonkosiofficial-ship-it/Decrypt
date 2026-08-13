package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class N implements p200u.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f54708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f54709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f54710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p200u.C7176j0 f54711d;

    public N(float f6, float f10, float f11) {
        this.f54708a = f6;
        this.f54709b = f10;
        this.f54710c = f11;
        p200u.C7176j0 c7176j0 = new p200u.C7176j0(1.0f);
        c7176j0.d(f6);
        c7176j0.f(f10);
        this.f54711d = c7176j0;
    }

    public /* synthetic */ N(float f6, float f10, float f11, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? 1.0f : f6, (i6 & 2) != 0 ? 1500.0f : f10, (i6 & 4) != 0 ? 0.01f : f11);
    }

    @Override // p200u.InterfaceC7175j
    public /* bridge */ /* synthetic */ p200u.B0 a(p200u.x0 x0Var) {
        return a(x0Var);
    }

    @Override // p200u.K, p200u.InterfaceC7175j
    public /* synthetic */ p200u.I0 a(p200u.x0 x0Var) {
        return p200u.J.c(this, x0Var);
    }

    @Override // p200u.K
    public float b(long j6, float f6, float f10, float f11) {
        this.f54711d.e(f10);
        return p200u.Y.c(this.f54711d.g(f6, f11, j6 / 1000000));
    }

    @Override // p200u.K
    public long c(float f6, float f10, float f11) {
        float fB = this.f54711d.b();
        float fA = this.f54711d.a();
        float f12 = f6 - f10;
        float f13 = this.f54710c;
        return p200u.AbstractC7174i0.b(fB, fA, f11 / f13, f12 / f13, 1.0f) * 1000000;
    }

    @Override // p200u.K
    public float d(float f6, float f10, float f11) {
        return 0.0f;
    }

    @Override // p200u.K
    public float e(long j6, float f6, float f10, float f11) {
        this.f54711d.e(f10);
        return p200u.Y.b(this.f54711d.g(f6, f11, j6 / 1000000));
    }
}
