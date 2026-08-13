package W8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: W8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1786h {
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    public static final java.lang.Object a(p127m7.i iVar, p237x7.p pVar) {
        W8.AbstractC1791j0 abstractC1791j0A;
        W8.C1810t0 c1810t0;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        p127m7.f fVar = (p127m7.f) iVar.i(p127m7.f.f51196A);
        if (fVar == null) {
            abstractC1791j0A = W8.X0.f15476a.b();
            c1810t0 = W8.C1810t0.f15533C;
            iVar = iVar.o0(abstractC1791j0A);
        } else {
            W8.AbstractC1791j0 abstractC1791j0 = fVar instanceof W8.AbstractC1791j0 ? (W8.AbstractC1791j0) fVar : null;
            if (abstractC1791j0 == null) {
                abstractC1791j0A = W8.X0.f15476a.a();
            } else {
                W8.AbstractC1791j0 abstractC1791j1 = abstractC1791j0.K1() ? abstractC1791j0 : null;
                if (abstractC1791j1 == null) {
                    abstractC1791j0A = W8.X0.f15476a.a();
                } else {
                    abstractC1791j0A = abstractC1791j1;
                }
            }
            c1810t0 = W8.C1810t0.f15533C;
        }
        W8.C1780e c1780e = new W8.C1780e(W8.H.j(c1810t0, iVar), threadCurrentThread, abstractC1791j0A);
        c1780e.j1(W8.P.DEFAULT, c1780e, pVar);
        return c1780e.k1();
    }

    public static /* synthetic */ java.lang.Object b(p127m7.i iVar, p237x7.p pVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            iVar = p127m7.j.f51198C;
        }
        return W8.AbstractC1784g.e(iVar, pVar);
    }
}
