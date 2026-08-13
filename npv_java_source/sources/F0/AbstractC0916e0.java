package F0;

/* JADX INFO: renamed from: F0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0916e0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.d.c b(F0.InterfaceC0924j interfaceC0924j, int i6, int i10) {
        androidx.compose.ui.d.c cVarR1 = interfaceC0924j.E0().r1();
        if (cVarR1 == null || (cVarR1.q1() & i6) == 0) {
            return null;
        }
        while (cVarR1 != null) {
            int iV1 = cVarR1.v1();
            if ((iV1 & i10) != 0) {
                return null;
            }
            if ((iV1 & i6) != 0) {
                return cVarR1;
            }
            cVarR1 = cVarR1.r1();
        }
        return null;
    }
}
