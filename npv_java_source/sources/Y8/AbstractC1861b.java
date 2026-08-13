package Y8;

/* JADX INFO: renamed from: Y8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1861b {
    public static final Y8.C a(W8.N n6, p127m7.i iVar, int i6, W8.P p6, p237x7.l lVar, p237x7.p pVar) {
        Y8.C1860a c1860a;
        Y8.C1860a c1860a2;
        Y8.C1860a wVar;
        p127m7.i iVarJ = W8.H.j(n6, iVar);
        Y8.j jVarB = Y8.m.b(i6, null, null, 6, null);
        if (p6.i()) {
            wVar = new Y8.w(iVarJ, jVarB, pVar);
        } else {
            c1860a = new Y8.C1860a(iVarJ, jVarB, true);
        }
        if (lVar != null) {
            c1860a2 = c1860a;
            c1860a2 = wVar;
            c1860a2.e1(lVar);
        }
        c1860a2 = c1860a;
        c1860a2 = wVar;
        c1860a2.j1(p6, c1860a2, pVar);
        return c1860a2;
    }

    public static /* synthetic */ Y8.C b(W8.N n6, p127m7.i iVar, int i6, W8.P p6, p237x7.l lVar, p237x7.p pVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            iVar = p127m7.j.f51198C;
        }
        p127m7.i iVar2 = iVar;
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        int i11 = i6;
        if ((i10 & 4) != 0) {
            p6 = W8.P.DEFAULT;
        }
        W8.P p10 = p6;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        return a(n6, iVar2, i11, p10, lVar, pVar);
    }
}
