package T;

/* JADX INFO: loaded from: classes.dex */
public final class I implements T.u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p071h0.c.InterfaceC0526c f12784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12785b;

    public I(p071h0.c.InterfaceC0526c interfaceC0526c, int i6) {
        this.f12784a = interfaceC0526c;
        this.f12785b = i6;
    }

    @Override // T.u.b
    public int a(Y0.r rVar, long j6, int i6) {
        return i6 >= Y0.t.f(j6) - (this.f12785b * 2) ? p071h0.c.f45778a.i().a(i6, Y0.t.f(j6)) : E7.j.k(this.f12784a.a(i6, Y0.t.f(j6)), this.f12785b, (Y0.t.f(j6) - this.f12785b) - i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T.I)) {
            return false;
        }
        T.I i6 = (T.I) obj;
        return p247y7.AbstractC7350t.b(this.f12784a, i6.f12784a) && this.f12785b == i6.f12785b;
    }

    public int hashCode() {
        return (this.f12784a.hashCode() * 31) + this.f12785b;
    }

    public java.lang.String toString() {
        return "Vertical(alignment=" + this.f12784a + ", margin=" + this.f12785b + ')';
    }
}
