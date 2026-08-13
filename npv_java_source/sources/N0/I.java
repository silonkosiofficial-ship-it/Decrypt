package N0;

/* JADX INFO: loaded from: classes.dex */
final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N0.l0 f7525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7526b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f7527c;

    public I(N0.l0 l0Var) {
        this.f7525a = l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    private final float a(int i6, boolean z6, boolean z10, boolean z11) {
        boolean z12;
        int i10 = 1;
        if (z6) {
            int iA = N0.K.a(this.f7525a.i(), i6, z6);
            int iV = this.f7525a.v(iA);
            int iP = this.f7525a.p(iA);
            if (i6 == iV || i6 == iP) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        int i11 = i6 * 4;
        if (!z11) {
            i10 = z12 ? 2 : 3;
        } else if (z12) {
            i10 = 0;
        }
        int i12 = i11 + i10;
        if (this.f7526b == i12) {
            return this.f7527c;
        }
        float fA = z11 ? this.f7525a.A(i6, z6) : this.f7525a.D(i6, z6);
        if (z10) {
            this.f7526b = i12;
            this.f7527c = fA;
        }
        return fA;
    }

    public final float b(int i6) {
        return a(i6, false, false, true);
    }

    public final float c(int i6) {
        return a(i6, true, true, true);
    }

    public final float d(int i6) {
        return a(i6, false, false, false);
    }

    public final float e(int i6) {
        return a(i6, true, true, false);
    }
}
