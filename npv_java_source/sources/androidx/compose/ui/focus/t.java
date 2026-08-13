package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
final class t implements java.util.Comparator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final androidx.compose.ui.focus.t f19711C = new androidx.compose.ui.focus.t();

    private t() {
    }

    private final X.b b(F0.J j6) {
        X.b bVar = new X.b(new F0.J[16], 0);
        while (j6 != null) {
            bVar.a(0, j6);
            j6 = j6.o0();
        }
        return bVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusTargetNode focusTargetNode2) {
        int i6 = 0;
        if (!androidx.compose.ui.focus.s.g(focusTargetNode) || !androidx.compose.ui.focus.s.g(focusTargetNode2)) {
            if (androidx.compose.ui.focus.s.g(focusTargetNode)) {
                return -1;
            }
            return androidx.compose.ui.focus.s.g(focusTargetNode2) ? 1 : 0;
        }
        F0.J jM = F0.AbstractC0925k.m(focusTargetNode);
        F0.J jM2 = F0.AbstractC0925k.m(focusTargetNode2);
        if (p247y7.AbstractC7350t.b(jM, jM2)) {
            return 0;
        }
        X.b bVarB = b(jM);
        X.b bVarB2 = b(jM2);
        int iMin = java.lang.Math.min(bVarB.t() - 1, bVarB2.t() - 1);
        if (iMin >= 0) {
            while (p247y7.AbstractC7350t.b(bVarB.s()[i6], bVarB2.s()[i6])) {
                if (i6 != iMin) {
                    i6++;
                }
            }
            return p247y7.AbstractC7350t.g(((F0.J) bVarB.s()[i6]).p0(), ((F0.J) bVarB2.s()[i6]).p0());
        }
        throw new java.lang.IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }
}
