package S0;

/* JADX INFO: loaded from: classes.dex */
public final class S implements S0.InterfaceC1601i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12282b;

    public S(int i6, int i10) {
        this.f12281a = i6;
        this.f12282b = i10;
    }

    @Override // S0.InterfaceC1601i
    public void a(S0.C1604l c1604l) {
        if (c1604l.l()) {
            c1604l.a();
        }
        int iK = E7.j.k(this.f12281a, 0, c1604l.h());
        int iK2 = E7.j.k(this.f12282b, 0, c1604l.h());
        if (iK != iK2) {
            if (iK < iK2) {
                c1604l.n(iK, iK2);
            } else {
                c1604l.n(iK2, iK);
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0.S)) {
            return false;
        }
        S0.S s6 = (S0.S) obj;
        return this.f12281a == s6.f12281a && this.f12282b == s6.f12282b;
    }

    public int hashCode() {
        return (this.f12281a * 31) + this.f12282b;
    }

    public java.lang.String toString() {
        return "SetComposingRegionCommand(start=" + this.f12281a + ", end=" + this.f12282b + ')';
    }
}
