package W;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    private static final int c(V.C1727k1 c1727k1) {
        int iA0 = c1727k1.a0();
        int iC0 = c1727k1.c0();
        while (iC0 >= 0 && !c1727k1.r0(iC0)) {
            iC0 = c1727k1.E0(iC0);
        }
        int iK0 = iC0 + 1;
        int iC1 = 0;
        while (iK0 < iA0) {
            if (c1727k1.m0(iA0, iK0)) {
                if (c1727k1.r0(iK0)) {
                    iC1 = 0;
                }
                iK0++;
            } else {
                iC1 += c1727k1.r0(iK0) ? 1 : c1727k1.C0(iK0);
                iK0 += c1727k1.k0(iK0);
            }
        }
        return iC1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(V.C1727k1 c1727k1, V.C1704d c1704d, V.InterfaceC1713g interfaceC1713g) {
        int iF = c1727k1.F(c1704d);
        V.AbstractC1741q.O(c1727k1.a0() < iF);
        e(c1727k1, interfaceC1713g, iF);
        int iC = c(c1727k1);
        while (c1727k1.a0() < iF) {
            if (c1727k1.l0(iF)) {
                if (c1727k1.q0()) {
                    interfaceC1713g.d(c1727k1.A0(c1727k1.a0()));
                    iC = 0;
                }
                c1727k1.g1();
            } else {
                iC += c1727k1.V0();
            }
        }
        V.AbstractC1741q.O(c1727k1.a0() == iF);
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(V.C1727k1 c1727k1, V.InterfaceC1713g interfaceC1713g, int i6) {
        while (!c1727k1.n0(i6)) {
            c1727k1.W0();
            if (c1727k1.r0(c1727k1.c0())) {
                interfaceC1713g.g();
            }
            c1727k1.T();
        }
    }
}
