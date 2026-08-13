package S0;

/* JADX INFO: loaded from: classes.dex */
public final class U implements S0.InterfaceC1601i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12286b;

    public U(int i6, int i10) {
        this.f12285a = i6;
        this.f12286b = i10;
    }

    @Override // S0.InterfaceC1601i
    public void a(S0.C1604l c1604l) {
        int iK = E7.j.k(this.f12285a, 0, c1604l.h());
        int iK2 = E7.j.k(this.f12286b, 0, c1604l.h());
        if (iK < iK2) {
            c1604l.p(iK, iK2);
        } else {
            c1604l.p(iK2, iK);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0.U)) {
            return false;
        }
        S0.U u6 = (S0.U) obj;
        return this.f12285a == u6.f12285a && this.f12286b == u6.f12286b;
    }

    public int hashCode() {
        return (this.f12285a * 31) + this.f12286b;
    }

    public java.lang.String toString() {
        return "SetSelectionCommand(start=" + this.f12285a + ", end=" + this.f12286b + ')';
    }
}
