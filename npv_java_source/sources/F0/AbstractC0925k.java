package F0;

/* JADX INFO: renamed from: F0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0925k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(X.b bVar, androidx.compose.ui.d.c cVar) {
        X.b bVarW0 = m(cVar).w0();
        int iT = bVarW0.t();
        if (iT > 0) {
            int i6 = iT - 1;
            java.lang.Object[] objArrS = bVarW0.s();
            do {
                bVar.d(((F0.J) objArrS[i6]).k0().k());
                i6--;
            } while (i6 >= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final F0.E d(androidx.compose.ui.d.c cVar) {
        if ((F0.AbstractC0918f0.a(2) & cVar.v1()) != 0) {
            if (!(cVar instanceof F0.E)) {
                if (cVar instanceof F0.AbstractC0927m) {
                    loop0: while (true) {
                        cVar = ((F0.AbstractC0927m) cVar).U1();
                        while (cVar != 0) {
                            if (cVar instanceof F0.E) {
                                return (F0.E) cVar;
                            }
                            if (!(cVar instanceof F0.AbstractC0927m) || (F0.AbstractC0918f0.a(2) & cVar.v1()) == 0) {
                                cVar = cVar.r1();
                            }
                        }
                        break loop0;
                    }
                }
            } else {
                return (F0.E) cVar;
            }
        }
        return null;
    }

    public static final boolean e(F0.InterfaceC0924j interfaceC0924j, int i6) {
        return (interfaceC0924j.E0().q1() & i6) != 0;
    }

    public static final boolean f(F0.InterfaceC0924j interfaceC0924j) {
        return interfaceC0924j.E0() == interfaceC0924j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.d.c g(X.b bVar) {
        if (bVar == null || bVar.w()) {
            return null;
        }
        return (androidx.compose.ui.d.c) bVar.D(bVar.t() - 1);
    }

    public static final F0.AbstractC0914d0 h(F0.InterfaceC0924j interfaceC0924j, int i6) {
        F0.AbstractC0914d0 abstractC0914d0S1 = interfaceC0924j.E0().s1();
        p247y7.AbstractC7350t.c(abstractC0914d0S1);
        if (abstractC0914d0S1.n2() != interfaceC0924j || !F0.AbstractC0920g0.i(i6)) {
            return abstractC0914d0S1;
        }
        F0.AbstractC0914d0 abstractC0914d0O2 = abstractC0914d0S1.o2();
        p247y7.AbstractC7350t.c(abstractC0914d0O2);
        return abstractC0914d0O2;
    }

    public static final Y0.e i(F0.InterfaceC0924j interfaceC0924j) {
        return m(interfaceC0924j).K();
    }

    public static final p141o0.C1 j(F0.InterfaceC0924j interfaceC0924j) {
        return n(interfaceC0924j).getGraphicsContext();
    }

    public static final D0.InterfaceC0900t k(F0.InterfaceC0924j interfaceC0924j) {
        if (!interfaceC0924j.E0().A1()) {
            C0.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        D0.InterfaceC0900t interfaceC0900tM1 = h(interfaceC0924j, F0.AbstractC0918f0.a(2)).m1();
        if (!interfaceC0900tM1.K()) {
            C0.a.b("LayoutCoordinates is not attached.");
        }
        return interfaceC0900tM1;
    }

    public static final Y0.v l(F0.InterfaceC0924j interfaceC0924j) {
        return m(interfaceC0924j).getLayoutDirection();
    }

    public static final F0.J m(F0.InterfaceC0924j interfaceC0924j) {
        F0.AbstractC0914d0 abstractC0914d0S1 = interfaceC0924j.E0().s1();
        if (abstractC0914d0S1 != null) {
            return abstractC0914d0S1.o1();
        }
        C0.a.c("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new p087i7.C6665k();
    }

    public static final F0.o0 n(F0.InterfaceC0924j interfaceC0924j) {
        F0.o0 o0VarN0 = m(interfaceC0924j).n0();
        if (o0VarN0 != null) {
            return o0VarN0;
        }
        C0.a.c("This node does not have an owner.");
        throw new p087i7.C6665k();
    }
}
