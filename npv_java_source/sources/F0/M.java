package F0;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.d.c b(F0.InterfaceC0924j interfaceC0924j) {
        int iA = F0.AbstractC0918f0.a(4);
        int iA2 = F0.AbstractC0918f0.a(2);
        androidx.compose.ui.d.c cVarR1 = interfaceC0924j.E0().r1();
        if (cVarR1 == null || (cVarR1.q1() & iA) == 0) {
            return null;
        }
        while (cVarR1 != null && (cVarR1.v1() & iA2) == 0) {
            if ((cVarR1.v1() & iA) != 0) {
                return cVarR1;
            }
            cVarR1 = cVarR1.r1();
        }
        return null;
    }
}
