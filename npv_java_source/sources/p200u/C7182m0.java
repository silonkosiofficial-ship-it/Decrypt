package p200u;

/* JADX INFO: renamed from: u.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7182m0 implements p200u.InterfaceC7175j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.InterfaceC7175j f54960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54961b;

    public C7182m0(p200u.InterfaceC7175j interfaceC7175j, long j6) {
        this.f54960a = interfaceC7175j;
        this.f54961b = j6;
    }

    @Override // p200u.InterfaceC7175j
    public p200u.B0 a(p200u.x0 x0Var) {
        return new p200u.C7184n0(this.f54960a.a(x0Var), this.f54961b);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p200u.C7182m0)) {
            return false;
        }
        p200u.C7182m0 c7182m0 = (p200u.C7182m0) obj;
        return c7182m0.f54961b == this.f54961b && p247y7.AbstractC7350t.b(c7182m0.f54960a, this.f54960a);
    }

    public int hashCode() {
        return (this.f54960a.hashCode() * 31) + p170r.r.a(this.f54961b);
    }
}
