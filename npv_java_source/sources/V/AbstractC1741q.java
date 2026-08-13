package V;

/* JADX INFO: renamed from: V.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1741q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f15003a = new V.C1759z0("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f15004b = new V.C1759z0("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f15005c = new V.C1759z0("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.Object f15006d = new V.C1759z0("providerValues");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.Object f15007e = new V.C1759z0("providers");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.Object f15008f = new V.C1759z0("reference");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Comparator f15009g = new java.util.Comparator() { // from class: V.p
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return V.AbstractC1741q.b((V.Z) obj, (V.Z) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object A(V.C1702c0 c1702c0) {
        return c1702c0.d() != null ? new V.C1699b0(java.lang.Integer.valueOf(c1702c0.a()), c1702c0.d()) : java.lang.Integer.valueOf(c1702c0.a());
    }

    public static final java.lang.Object B() {
        return f15004b;
    }

    public static final java.lang.Object C() {
        return f15007e;
    }

    public static final java.lang.Object D() {
        return f15008f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(java.util.List list, int i6, V.R0 r6, java.lang.Object obj) {
        int iW = w(list, i6);
        if (iW < 0) {
            int i10 = -(iW + 1);
            if (!(obj instanceof V.J)) {
                obj = null;
            }
            list.add(i10, new V.Z(r6, i6, obj));
            return;
        }
        V.Z z6 = (V.Z) list.get(iW);
        if (!(obj instanceof V.J)) {
            z6.e(null);
            return;
        }
        java.lang.Object objA = z6.a();
        if (objA == null) {
            z6.e(obj);
        } else if (objA instanceof p170r.L) {
            ((p170r.L) objA).h(obj);
        } else {
            z6.e(p170r.X.b(objA, obj));
        }
    }

    public static final boolean F(V.C1715g1 c1715g1) {
        return c1715g1.k() > c1715g1.u() + 1;
    }

    public static final boolean G(V.C1727k1 c1727k1) {
        return c1727k1.a0() > c1727k1.c0() + 1;
    }

    public static final boolean H() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p170r.K I(int i6) {
        return V.C1751v0.b(new p170r.K(i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J(V.C1715g1 c1715g1, int i6, int i10, int i11) {
        if (i6 == i10) {
            return i6;
        }
        if (i6 == i11 || i10 == i11) {
            return i11;
        }
        if (c1715g1.P(i6) == i10) {
            return i10;
        }
        if (c1715g1.P(i10) == i6) {
            return i6;
        }
        if (c1715g1.P(i6) == c1715g1.P(i10)) {
            return c1715g1.P(i6);
        }
        int iU = u(c1715g1, i6, i11);
        int iU2 = u(c1715g1, i10, i11);
        int i12 = iU - iU2;
        for (int i13 = 0; i13 < i12; i13++) {
            i6 = c1715g1.P(i6);
        }
        int i14 = iU2 - iU;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = c1715g1.P(i10);
        }
        while (i6 != i10) {
            i6 = c1715g1.P(i6);
            i10 = c1715g1.P(i10);
        }
        return i6;
    }

    public static final void K(V.C1727k1 c1727k1, V.Y0 y6) {
        int iE0;
        int iQ = c1727k1.Q(c1727k1.f14907b, c1727k1.h0(c1727k1.a0() + c1727k1.k0(c1727k1.a0())));
        for (int iQ2 = c1727k1.Q(c1727k1.f14907b, c1727k1.h0(c1727k1.a0())); iQ2 < iQ; iQ2++) {
            java.lang.Object obj = c1727k1.f14908c[c1727k1.R(iQ2)];
            int iF = -1;
            if (obj instanceof V.InterfaceC1728l) {
                y6.b((V.InterfaceC1728l) obj, c1727k1.e0() - iQ2, -1, -1);
            }
            if (obj instanceof V.C1697a1) {
                int iE1 = c1727k1.e0() - iQ2;
                V.C1697a1 c1697a1 = (V.C1697a1) obj;
                V.C1704d c1704dA = c1697a1.a();
                if (c1704dA == null || !c1704dA.b()) {
                    iE0 = -1;
                } else {
                    iF = c1727k1.F(c1704dA);
                    iE0 = c1727k1.e0() - c1727k1.b1(iF);
                }
                y6.a(c1697a1.b(), iE1, iF, iE0);
            }
            if (obj instanceof V.R0) {
                ((V.R0) obj).x();
            }
        }
        c1727k1.L0();
    }

    private static final void L(V.C1727k1 c1727k1, int i6, int i10, java.lang.Object obj) {
        if (obj == c1727k1.R0(i6, i10, V.InterfaceC1734n.f14931a.a())) {
            return;
        }
        r("Slot table is out of sync");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V.Z M(java.util.List list, int i6) {
        int iW = w(list, i6);
        if (iW >= 0) {
            return (V.Z) list.remove(iW);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(java.util.List list, int i6, int i10) {
        int iV = v(list, i6);
        while (iV < list.size() && ((V.Z) list.get(iV)).b() < i10) {
            list.remove(iV);
        }
    }

    public static final void O(boolean z6) {
        if (z6) {
            return;
        }
        r("Check failed");
    }

    public static final void P() {
    }

    public static final void Q(int i6, int i10, int i11, java.lang.String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(V.Z z6, V.Z z10) {
        return p247y7.AbstractC7350t.g(z6.b(), z10.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(int i6) {
        return i6 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(boolean z6) {
        return z6 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List p(V.C1718h1 c1718h1, V.C1704d c1704d) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        V.C1715g1 c1715g1U = c1718h1.U();
        try {
            q(c1715g1U, arrayList, c1718h1.e(c1704d));
            p087i7.M m6 = p087i7.M.f46721a;
            return arrayList;
        } finally {
            c1715g1U.d();
        }
    }

    private static final void q(V.C1715g1 c1715g1, java.util.List list, int i6) {
        if (c1715g1.J(i6)) {
            list.add(c1715g1.L(i6));
            return;
        }
        int iE = i6 + 1;
        int iE2 = i6 + c1715g1.E(i6);
        while (iE < iE2) {
            q(c1715g1, list, iE);
            iE += c1715g1.E(iE);
        }
    }

    public static final void r(java.lang.String str) {
        throw new V.C1731m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final java.lang.Void s(java.lang.String str) {
        throw new V.C1731m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void t(V.C1727k1 c1727k1, V.Y0 y6) {
        int iF;
        int iE0;
        int iA0 = c1727k1.a0();
        int iB0 = c1727k1.b0();
        while (iA0 < iB0) {
            java.lang.Object objA0 = c1727k1.A0(iA0);
            if (objA0 instanceof V.InterfaceC1728l) {
                y6.c((V.InterfaceC1728l) objA0, c1727k1.e0() - c1727k1.d1(iA0), -1, -1);
            }
            int iZ0 = c1727k1.Z0(c1727k1.f14907b, c1727k1.h0(iA0));
            int i6 = iA0 + 1;
            int iQ = c1727k1.Q(c1727k1.f14907b, c1727k1.h0(i6));
            for (int i10 = iZ0; i10 < iQ; i10++) {
                int i11 = i10 - iZ0;
                java.lang.Object obj = c1727k1.f14908c[c1727k1.R(i10)];
                if (obj instanceof V.C1697a1) {
                    V.C1697a1 c1697a1 = (V.C1697a1) obj;
                    V.Z0 z0B = c1697a1.b();
                    if (!(z0B instanceof V.InterfaceC1703c1)) {
                        L(c1727k1, iA0, i11, obj);
                        int iE1 = c1727k1.e0() - i11;
                        V.C1704d c1704dA = c1697a1.a();
                        if (c1704dA == null || !c1704dA.b()) {
                            iF = -1;
                            iE0 = -1;
                        } else {
                            iF = c1727k1.F(c1704dA);
                            iE0 = c1727k1.e0() - c1727k1.b1(iF);
                        }
                        y6.a(z0B, iE1, iF, iE0);
                    }
                } else if (obj instanceof V.R0) {
                    L(c1727k1, iA0, i11, obj);
                    ((V.R0) obj).x();
                }
            }
            iA0 = i6;
        }
    }

    private static final int u(V.C1715g1 c1715g1, int i6, int i10) {
        int i11 = 0;
        while (i6 > 0 && i6 != i10) {
            i6 = c1715g1.P(i6);
            i11++;
        }
        return i11;
    }

    private static final int v(java.util.List list, int i6) {
        int iW = w(list, i6);
        return iW < 0 ? -(iW + 1) : iW;
    }

    private static final int w(java.util.List list, int i6) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iG = p247y7.AbstractC7350t.g(((V.Z) list.get(i11)).b(), i6);
            if (iG < 0) {
                i10 = i11 + 1;
            } else {
                if (iG <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V.Z x(java.util.List list, int i6, int i10) {
        int iV = v(list, i6);
        if (iV >= list.size()) {
            return null;
        }
        V.Z z6 = (V.Z) list.get(iV);
        if (z6.b() < i10) {
            return z6;
        }
        return null;
    }

    public static final java.lang.Object y() {
        return f15005c;
    }

    public static final java.lang.Object z() {
        return f15003a;
    }
}
