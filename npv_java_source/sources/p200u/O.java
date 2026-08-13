package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class O implements p200u.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p200u.F f54715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f54716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f54717e;

    public O(int i6, int i10, p200u.F f6) {
        this.f54713a = i6;
        this.f54714b = i10;
        this.f54715c = f6;
        this.f54716d = ((long) i6) * 1000000;
        this.f54717e = ((long) i10) * 1000000;
    }

    private final long f(long j6) {
        return E7.j.l(j6 - this.f54717e, 0L, this.f54716d);
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
        long jF = f(j6);
        if (jF < 0) {
            return 0.0f;
        }
        if (jF == 0) {
            return f11;
        }
        return (e(jF, f6, f10, f11) - e(jF - 1000000, f6, f10, f11)) * 1000.0f;
    }

    @Override // p200u.K
    public long c(float f6, float f10, float f11) {
        return ((long) (this.f54714b + this.f54713a)) * 1000000;
    }

    @Override // p200u.K
    public /* synthetic */ float d(float f6, float f10, float f11) {
        return p200u.J.a(this, f6, f10, f11);
    }

    @Override // p200u.K
    public float e(long j6, float f6, float f10, float f11) {
        float f12 = this.f54713a == 0 ? 1.0f : f(j6) / this.f54716d;
        p200u.F f13 = this.f54715c;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        return p200u.z0.k(f6, f10, f13.a(f12 <= 1.0f ? f12 : 1.0f));
    }
}
