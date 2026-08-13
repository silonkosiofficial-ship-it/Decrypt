package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19710b;

        static {
            int[] iArr = new int[Y0.v.values().length];
            try {
                iArr[Y0.v.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.v.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f19709a = iArr;
            int[] iArr2 = new int[p121m0.o.values().length];
            try {
                iArr2[p121m0.o.Active.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[p121m0.o.ActiveParent.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[p121m0.o.Captured.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[p121m0.o.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            f19710b = iArr2;
        }
    }

    public static final androidx.compose.ui.focus.n a(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6, Y0.v vVar) {
        p237x7.l lVarU;
        androidx.compose.ui.focus.n nVarW;
        androidx.compose.ui.focus.j jVarY1 = focusTargetNode.Y1();
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (androidx.compose.ui.focus.d.l(i6, aVar.e())) {
            return jVarY1.t();
        }
        if (androidx.compose.ui.focus.d.l(i6, aVar.f())) {
            return jVarY1.q();
        }
        if (androidx.compose.ui.focus.d.l(i6, aVar.h())) {
            return jVarY1.s();
        }
        if (androidx.compose.ui.focus.d.l(i6, aVar.a())) {
            return jVarY1.x();
        }
        if (androidx.compose.ui.focus.d.l(i6, aVar.d())) {
            int i10 = androidx.compose.ui.focus.s.a.f19709a[vVar.ordinal()];
            if (i10 == 1) {
                nVarW = jVarY1.d();
            } else {
                if (i10 != 2) {
                    throw new p087i7.s();
                }
                nVarW = jVarY1.w();
            }
            if (nVarW == androidx.compose.ui.focus.n.f19698b.b()) {
                nVarW = null;
            }
            if (nVarW == null) {
                return jVarY1.f();
            }
        } else {
            if (!androidx.compose.ui.focus.d.l(i6, aVar.g())) {
                if (androidx.compose.ui.focus.d.l(i6, aVar.b())) {
                    lVarU = jVarY1.z();
                } else {
                    if (!androidx.compose.ui.focus.d.l(i6, aVar.c())) {
                        throw new java.lang.IllegalStateException("invalid FocusDirection".toString());
                    }
                    lVarU = jVarY1.u();
                }
                return (androidx.compose.ui.focus.n) lVarU.l(androidx.compose.ui.focus.d.i(i6));
            }
            int i11 = androidx.compose.ui.focus.s.a.f19709a[vVar.ordinal()];
            if (i11 == 1) {
                nVarW = jVarY1.w();
            } else {
                if (i11 != 2) {
                    throw new p087i7.s();
                }
                nVarW = jVarY1.d();
            }
            if (nVarW == androidx.compose.ui.focus.n.f19698b.b()) {
                nVarW = null;
            }
            if (nVarW == null) {
                return jVarY1.o();
            }
        }
        return nVarW;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:61:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0065 -> B:18:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.s.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final androidx.compose.ui.focus.FocusTargetNode c(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        F0.C0910b0 c0910b0K0;
        int iA = F0.AbstractC0918f0.a(1024);
        if (!focusTargetNode.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = focusTargetNode.E0().x1();
        F0.J jM = F0.AbstractC0925k.m(focusTargetNode);
        while (jM != null) {
            if ((jM.k0().k().q1() & iA) != 0) {
                while (cVarX1 != null) {
                    if ((cVarX1.v1() & iA) != 0) {
                        androidx.compose.ui.d.c cVarG = cVarX1;
                        X.b bVar = null;
                        while (cVarG != null) {
                            if (cVarG instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) cVarG;
                                if (focusTargetNode2.Y1().p()) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVarG.v1() & iA) != 0 && (cVarG instanceof F0.AbstractC0927m)) {
                                int i6 = 0;
                                for (androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) cVarG).U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
                                    if ((cVarU1.v1() & iA) != 0) {
                                        i6++;
                                        if (i6 == 1) {
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
                                if (i6 == 1) {
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
        return null;
    }

    public static final p131n0.i d(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        p131n0.i iVarN;
        F0.AbstractC0914d0 abstractC0914d0S1 = focusTargetNode.s1();
        return (abstractC0914d0S1 == null || (iVarN = D0.AbstractC0901u.d(abstractC0914d0S1).N(abstractC0914d0S1, false)) == null) ? p131n0.i.f51317e.a() : iVarN;
    }

    public static final java.lang.Boolean e(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6, Y0.v vVar, p131n0.i iVar, p237x7.l lVar) {
        boolean zBooleanValue;
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (!(androidx.compose.ui.focus.d.l(i6, aVar.e()) ? true : androidx.compose.ui.focus.d.l(i6, aVar.f()))) {
            if (!(androidx.compose.ui.focus.d.l(i6, aVar.d()) ? true : androidx.compose.ui.focus.d.l(i6, aVar.g()) ? true : androidx.compose.ui.focus.d.l(i6, aVar.h()) ? true : androidx.compose.ui.focus.d.l(i6, aVar.a()))) {
                if (androidx.compose.ui.focus.d.l(i6, aVar.b())) {
                    int i10 = androidx.compose.ui.focus.s.a.f19709a[vVar.ordinal()];
                    if (i10 == 1) {
                        i6 = aVar.g();
                    } else {
                        if (i10 != 2) {
                            throw new p087i7.s();
                        }
                        i6 = aVar.d();
                    }
                    focusTargetNode = b(focusTargetNode);
                    if (focusTargetNode == null) {
                        return null;
                    }
                } else {
                    if (!androidx.compose.ui.focus.d.l(i6, aVar.c())) {
                        throw new java.lang.IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((java.lang.Object) androidx.compose.ui.focus.d.n(i6))).toString());
                    }
                    androidx.compose.ui.focus.FocusTargetNode focusTargetNodeB = b(focusTargetNode);
                    androidx.compose.ui.focus.FocusTargetNode focusTargetNodeC = focusTargetNodeB != null ? c(focusTargetNodeB) : null;
                    zBooleanValue = (focusTargetNodeC == null || p247y7.AbstractC7350t.b(focusTargetNodeC, focusTargetNode)) ? false : ((java.lang.Boolean) lVar.l(focusTargetNodeC)).booleanValue();
                }
            }
            return androidx.compose.ui.focus.v.t(focusTargetNode, i6, iVar, lVar);
        }
        zBooleanValue = androidx.compose.ui.focus.u.f(focusTargetNode, i6, lVar);
        return java.lang.Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:60:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0052 -> B:10:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final androidx.compose.ui.focus.FocusTargetNode f(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.s.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        F0.J jO1;
        F0.AbstractC0914d0 abstractC0914d0S1;
        F0.J jO2;
        F0.AbstractC0914d0 abstractC0914d0S2 = focusTargetNode.s1();
        return (abstractC0914d0S2 == null || (jO1 = abstractC0914d0S2.o1()) == null || !jO1.k() || (abstractC0914d0S1 = focusTargetNode.s1()) == null || (jO2 = abstractC0914d0S1.o1()) == null || !jO2.K0()) ? false : true;
    }
}
