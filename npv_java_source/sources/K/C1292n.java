package K;

/* JADX INFO: renamed from: K.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1292n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K.C1292n f5870a = new K.C1292n();

    private C1292n() {
    }

    public static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder builder, M0.K k6, p131n0.i iVar) {
        int iR;
        int iR2;
        if (!iVar.q() && (iR = k6.r(iVar.l())) <= (iR2 = k6.r(iVar.e()))) {
            while (true) {
                builder.addVisibleLineBounds(k6.s(iR), k6.v(iR), k6.t(iR), k6.m(iR));
                if (iR == iR2) {
                    break;
                }
                iR++;
            }
        }
        return builder;
    }
}
