package D;

/* JADX INFO: renamed from: D.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0868e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(X.b bVar, int i6) {
        int iT = bVar.t() - 1;
        int i10 = 0;
        while (i10 < iT) {
            int i11 = ((iT - i10) / 2) + i10;
            int iB = ((D.InterfaceC0867d.a) bVar.s()[i11]).b();
            if (iB == i6) {
                return i11;
            }
            if (iB < i6) {
                i10 = i11 + 1;
                if (i6 < ((D.InterfaceC0867d.a) bVar.s()[i10]).b()) {
                    return i11;
                }
            } else {
                iT = i11 - 1;
            }
        }
        return i10;
    }
}
