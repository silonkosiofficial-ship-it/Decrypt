package T;

/* JADX INFO: renamed from: T.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1645d implements T.u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p071h0.c.InterfaceC0526c f12807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p071h0.c.InterfaceC0526c f12808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12809c;

    public C1645d(p071h0.c.InterfaceC0526c interfaceC0526c, p071h0.c.InterfaceC0526c interfaceC0526c2, int i6) {
        this.f12807a = interfaceC0526c;
        this.f12808b = interfaceC0526c2;
        this.f12809c = i6;
    }

    @Override // T.u.b
    public int a(Y0.r rVar, long j6, int i6) {
        int iA = this.f12808b.a(0, rVar.f());
        return rVar.i() + iA + (-this.f12807a.a(0, i6)) + this.f12809c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T.C1645d)) {
            return false;
        }
        T.C1645d c1645d = (T.C1645d) obj;
        return p247y7.AbstractC7350t.b(this.f12807a, c1645d.f12807a) && p247y7.AbstractC7350t.b(this.f12808b, c1645d.f12808b) && this.f12809c == c1645d.f12809c;
    }

    public int hashCode() {
        return (((this.f12807a.hashCode() * 31) + this.f12808b.hashCode()) * 31) + this.f12809c;
    }

    public java.lang.String toString() {
        return "Vertical(menuAlignment=" + this.f12807a + ", anchorAlignment=" + this.f12808b + ", offset=" + this.f12809c + ')';
    }
}
