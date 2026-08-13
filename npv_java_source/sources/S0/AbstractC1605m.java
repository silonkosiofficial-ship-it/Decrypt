package S0;

/* JADX INFO: renamed from: S0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1605m {
    public static final long a(long j6, long j10) {
        int iL = M0.N.l(j6);
        int iK = M0.N.k(j6);
        if (M0.N.p(j10, j6)) {
            if (M0.N.d(j10, j6)) {
                iL = M0.N.l(j10);
                iK = iL;
            } else if (M0.N.d(j6, j10)) {
                iK -= M0.N.j(j10);
            } else if (M0.N.e(j10, iL)) {
                iL = M0.N.l(j10);
                iK -= M0.N.j(j10);
            } else {
                iK = M0.N.l(j10);
            }
        } else if (iK > M0.N.l(j10)) {
            iL -= M0.N.j(j10);
            iK -= M0.N.j(j10);
        }
        return M0.O.b(iL, iK);
    }
}
