package M;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final long a(long j6, boolean z6, int i6, float f6) {
        return Y0.C1859b.f16201b.b(0, c(j6, z6, i6, f6), 0, Y0.C1859b.k(j6));
    }

    public static final int b(boolean z6, int i6, int i10) {
        if (z6 || !X0.u.e(i6, X0.u.f15666a.b())) {
            return E7.j.d(i10, 1);
        }
        return 1;
    }

    public static final int c(long j6, boolean z6, int i6, float f6) {
        int iL = ((z6 || X0.u.e(i6, X0.u.f15666a.b())) && Y0.C1859b.h(j6)) ? Y0.C1859b.l(j6) : Integer.MAX_VALUE;
        return Y0.C1859b.n(j6) == iL ? iL : E7.j.k(H.E.a(f6), Y0.C1859b.n(j6), iL);
    }
}
