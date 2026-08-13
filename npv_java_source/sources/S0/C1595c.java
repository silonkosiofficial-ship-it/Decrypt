package S0;

/* JADX INFO: renamed from: S0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1595c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S0.C1595c f12328a = new S0.C1595c();

    private C1595c() {
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
