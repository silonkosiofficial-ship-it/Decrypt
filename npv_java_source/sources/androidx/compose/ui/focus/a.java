package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final java.lang.Object a(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6, p237x7.l lVar) {
        androidx.compose.ui.d.c cVarG;
        D0.InterfaceC0886e interfaceC0886eZ1;
        int iC;
        F0.C0910b0 c0910b0K0;
        int iA = F0.AbstractC0918f0.a(1024);
        if (!focusTargetNode.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = focusTargetNode.E0().x1();
        F0.J jM = F0.AbstractC0925k.m(focusTargetNode);
        loop0: while (true) {
            if (jM == null) {
                cVarG = null;
                break;
            }
            if ((jM.k0().k().q1() & iA) != 0) {
                while (cVarX1 != null) {
                    if ((cVarX1.v1() & iA) != 0) {
                        cVarG = cVarX1;
                        X.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarG.v1() & iA) != 0 && (cVarG instanceof F0.AbstractC0927m)) {
                                int i10 = 0;
                                for (androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) cVarG).U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
                                    if ((cVarU1.v1() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarG = cVarU1;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar.d(cVarG);
                                                cVarG = null;
                                            }
                                            bVar.d(cVarU1);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarG = F0.AbstractC0925k.g(bVar);
                        }
                    }
                    cVarX1 = cVarX1.x1();
                }
            }
            jM = jM.o0();
            cVarX1 = (jM == null || (c0910b0K0 = jM.k0()) == null) ? null : c0910b0K0.o();
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) cVarG;
        if ((focusTargetNode2 != null && p247y7.AbstractC7350t.b(focusTargetNode2.Z1(), focusTargetNode.Z1())) || (interfaceC0886eZ1 = focusTargetNode.Z1()) == null) {
            return null;
        }
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (androidx.compose.ui.focus.d.l(i6, aVar.h())) {
            iC = D0.InterfaceC0886e.b.f1830a.a();
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.a())) {
            iC = D0.InterfaceC0886e.b.f1830a.d();
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.d())) {
            iC = D0.InterfaceC0886e.b.f1830a.e();
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.g())) {
            iC = D0.InterfaceC0886e.b.f1830a.f();
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.e())) {
            iC = D0.InterfaceC0886e.b.f1830a.b();
        } else {
            if (!androidx.compose.ui.focus.d.l(i6, aVar.f())) {
                throw new java.lang.IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            iC = D0.InterfaceC0886e.b.f1830a.c();
        }
        return interfaceC0886eZ1.g(iC, lVar);
    }
}
