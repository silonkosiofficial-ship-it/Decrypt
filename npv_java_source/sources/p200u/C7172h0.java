package p200u;

/* JADX INFO: renamed from: u.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7172h0 implements p200u.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54933a;

    public C7172h0(int i6) {
        this.f54933a = i6;
    }

    @Override // p200u.I, p200u.InterfaceC7175j
    public p200u.F0 a(p200u.x0 x0Var) {
        return new p200u.N0(this.f54933a);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p200u.C7172h0) && ((p200u.C7172h0) obj).f54933a == this.f54933a;
    }

    public int hashCode() {
        return this.f54933a;
    }
}
