package S0;

/* JADX INFO: renamed from: S0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1600h implements S0.InterfaceC1601i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12359b;

    public C1600h(int i6, int i10) {
        this.f12358a = i6;
        this.f12359b = i10;
        if (i6 < 0 || i10 < 0) {
            throw new java.lang.IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i6 + " and " + i10 + " respectively.").toString());
        }
    }

    @Override // S0.InterfaceC1601i
    public void a(S0.C1604l c1604l) {
        int i6 = this.f12358a;
        int iK = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = iK + 1;
            if (c1604l.k() <= i11) {
                iK = c1604l.k();
                break;
            }
            iK = S0.AbstractC1602j.b(c1604l.c((c1604l.k() - i11) + (-1)), c1604l.c(c1604l.k() - i11)) ? iK + 2 : i11;
        }
        int i12 = this.f12359b;
        int iH = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iH + 1;
            if (c1604l.j() + i14 >= c1604l.h()) {
                iH = c1604l.h() - c1604l.j();
                break;
            }
            iH = S0.AbstractC1602j.b(c1604l.c((c1604l.j() + i14) + (-1)), c1604l.c(c1604l.j() + i14)) ? iH + 2 : i14;
        }
        c1604l.b(c1604l.j(), c1604l.j() + iH);
        c1604l.b(c1604l.k() - iK, c1604l.k());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0.C1600h)) {
            return false;
        }
        S0.C1600h c1600h = (S0.C1600h) obj;
        return this.f12358a == c1600h.f12358a && this.f12359b == c1600h.f12359b;
    }

    public int hashCode() {
        return (this.f12358a * 31) + this.f12359b;
    }

    public java.lang.String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f12358a + ", lengthAfterCursor=" + this.f12359b + ')';
    }
}
