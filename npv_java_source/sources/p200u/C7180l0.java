package p200u;

/* JADX INFO: renamed from: u.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7180l0 implements p200u.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f54957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f54958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f54959c;

    public C7180l0(float f6, float f10, java.lang.Object obj) {
        this.f54957a = f6;
        this.f54958b = f10;
        this.f54959c = obj;
    }

    public /* synthetic */ C7180l0(float f6, float f10, java.lang.Object obj, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? 1.0f : f6, (i6 & 2) != 0 ? 1500.0f : f10, (i6 & 4) != 0 ? null : obj);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p200u.C7180l0)) {
            return false;
        }
        p200u.C7180l0 c7180l0 = (p200u.C7180l0) obj;
        return c7180l0.f54957a == this.f54957a && c7180l0.f54958b == this.f54958b && p247y7.AbstractC7350t.b(c7180l0.f54959c, this.f54959c);
    }

    public final float f() {
        return this.f54957a;
    }

    public final float g() {
        return this.f54958b;
    }

    public final java.lang.Object h() {
        return this.f54959c;
    }

    public int hashCode() {
        java.lang.Object obj = this.f54959c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + java.lang.Float.floatToIntBits(this.f54957a)) * 31) + java.lang.Float.floatToIntBits(this.f54958b);
    }

    @Override // p200u.I, p200u.InterfaceC7175j
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p200u.O0 a(p200u.x0 x0Var) {
        return new p200u.O0(this.f54957a, this.f54958b, p200u.AbstractC7177k.b(x0Var, this.f54959c));
    }
}
