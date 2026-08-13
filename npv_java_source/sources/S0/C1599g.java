package S0;

/* JADX INFO: renamed from: S0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1599g implements S0.InterfaceC1601i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12354b;

    public C1599g(int i6, int i10) {
        this.f12353a = i6;
        this.f12354b = i10;
        if (i6 < 0 || i10 < 0) {
            throw new java.lang.IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i6 + " and " + i10 + " respectively.").toString());
        }
    }

    @Override // S0.InterfaceC1601i
    public void a(S0.C1604l c1604l) {
        int iJ = c1604l.j();
        int i6 = this.f12354b;
        int iH = iJ + i6;
        if (((iJ ^ iH) & (i6 ^ iH)) < 0) {
            iH = c1604l.h();
        }
        c1604l.b(c1604l.j(), java.lang.Math.min(iH, c1604l.h()));
        int iK = c1604l.k();
        int i10 = this.f12353a;
        int i11 = iK - i10;
        if (((iK ^ i11) & (i10 ^ iK)) < 0) {
            i11 = 0;
        }
        c1604l.b(java.lang.Math.max(0, i11), c1604l.k());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0.C1599g)) {
            return false;
        }
        S0.C1599g c1599g = (S0.C1599g) obj;
        return this.f12353a == c1599g.f12353a && this.f12354b == c1599g.f12354b;
    }

    public int hashCode() {
        return (this.f12353a * 31) + this.f12354b;
    }

    public java.lang.String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f12353a + ", lengthAfterCursor=" + this.f12354b + ')';
    }
}
