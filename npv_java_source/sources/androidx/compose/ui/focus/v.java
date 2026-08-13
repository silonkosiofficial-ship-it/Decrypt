package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19717a;

        static {
            int[] iArr = new int[p121m0.o.values().length];
            try {
                iArr[p121m0.o.ActiveParent.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p121m0.o.Active.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p121m0.o.Captured.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[p121m0.o.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f19717a = iArr;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.FocusTargetNode f19718D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p131n0.i f19719E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f19720F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.l f19721G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, p131n0.i iVar, int i6, p237x7.l lVar) {
            super(1);
            this.f19718D = focusTargetNode;
            this.f19719E = iVar;
            this.f19720F = i6;
            this.f19721G = lVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(D0.InterfaceC0886e.a aVar) {
            boolean zR = androidx.compose.ui.focus.v.r(this.f19718D, this.f19719E, this.f19720F, this.f19721G);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zR);
            if (zR || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        if (focusTargetNode.a2() != p121m0.o.ActiveParent) {
            throw new java.lang.IllegalStateException("Searching for active node in inactive hierarchy".toString());
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNodeB = androidx.compose.ui.focus.s.b(focusTargetNode);
        if (focusTargetNodeB != null) {
            return focusTargetNodeB;
        }
        throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    private static final boolean c(p131n0.i iVar, p131n0.i iVar2, p131n0.i iVar3, int i6) {
        if (d(iVar3, i6, iVar) || !d(iVar2, i6, iVar)) {
            return false;
        }
        if (e(iVar3, i6, iVar)) {
            androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
            if (!androidx.compose.ui.focus.d.l(i6, aVar.d()) && !androidx.compose.ui.focus.d.l(i6, aVar.g()) && f(iVar2, i6, iVar) >= g(iVar3, i6, iVar)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(p131n0.i iVar, int i6, p131n0.i iVar2) {
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (!(androidx.compose.ui.focus.d.l(i6, aVar.d()) ? true : androidx.compose.ui.focus.d.l(i6, aVar.g()))) {
            if (!(androidx.compose.ui.focus.d.l(i6, aVar.h()) ? true : androidx.compose.ui.focus.d.l(i6, aVar.a()))) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (iVar.j() > iVar2.i() && iVar.i() < iVar2.j()) {
                return true;
            }
        } else if (iVar.e() > iVar2.l() && iVar.l() < iVar2.e()) {
            return true;
        }
        return false;
    }

    private static final boolean e(p131n0.i iVar, int i6, p131n0.i iVar2) {
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (androidx.compose.ui.focus.d.l(i6, aVar.d())) {
            if (iVar2.i() < iVar.j()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.g())) {
            if (iVar2.j() > iVar.i()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.h())) {
            if (iVar2.l() < iVar.e()) {
                return false;
            }
        } else {
            if (!androidx.compose.ui.focus.d.l(i6, aVar.a())) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (iVar2.e() > iVar.l()) {
                return false;
            }
        }
        return true;
    }

    private static final float f(p131n0.i iVar, int i6, p131n0.i iVar2) {
        float fL;
        float fE;
        float fL2;
        float fE2;
        float f6;
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (!androidx.compose.ui.focus.d.l(i6, aVar.d())) {
            if (androidx.compose.ui.focus.d.l(i6, aVar.g())) {
                fL = iVar.i();
                fE = iVar2.j();
            } else if (androidx.compose.ui.focus.d.l(i6, aVar.h())) {
                fL2 = iVar2.l();
                fE2 = iVar.e();
            } else {
                if (!androidx.compose.ui.focus.d.l(i6, aVar.a())) {
                    throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                fL = iVar.l();
                fE = iVar2.e();
            }
            f6 = fL - fE;
            return java.lang.Math.max(0.0f, f6);
        }
        fL2 = iVar2.i();
        fE2 = iVar.j();
        f6 = fL2 - fE2;
        return java.lang.Math.max(0.0f, f6);
    }

    private static final float g(p131n0.i iVar, int i6, p131n0.i iVar2) {
        float fE;
        float fE2;
        float fL;
        float fL2;
        float f6;
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (!androidx.compose.ui.focus.d.l(i6, aVar.d())) {
            if (androidx.compose.ui.focus.d.l(i6, aVar.g())) {
                fE = iVar.j();
                fE2 = iVar2.j();
            } else if (androidx.compose.ui.focus.d.l(i6, aVar.h())) {
                fL = iVar2.l();
                fL2 = iVar.l();
            } else {
                if (!androidx.compose.ui.focus.d.l(i6, aVar.a())) {
                    throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                fE = iVar.e();
                fE2 = iVar2.e();
            }
            f6 = fE - fE2;
            return java.lang.Math.max(1.0f, f6);
        }
        fL = iVar2.i();
        fL2 = iVar.i();
        f6 = fL - fL2;
        return java.lang.Math.max(1.0f, f6);
    }

    private static final p131n0.i h(p131n0.i iVar) {
        return new p131n0.i(iVar.j(), iVar.e(), iVar.j(), iVar.e());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:56:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static final void i(F0.InterfaceC0924j r10, X.b r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.v.i(F0.j, X.b):void");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    private static final androidx.compose.ui.focus.FocusTargetNode j(X.b bVar, p131n0.i iVar, int i6) {
        float fH;
        p131n0.i iVarS;
        float fN;
        int iT;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode;
        java.lang.Object[] objArrS;
        int i10;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2;
        p131n0.i iVarD;
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (!androidx.compose.ui.focus.d.l(i6, aVar.d())) {
            if (androidx.compose.ui.focus.d.l(i6, aVar.g())) {
                fN = -(iVar.n() + 1);
            } else {
                if (androidx.compose.ui.focus.d.l(i6, aVar.h())) {
                    fH = iVar.h() + 1;
                } else {
                    if (!androidx.compose.ui.focus.d.l(i6, aVar.a())) {
                        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    fH = -(iVar.h() + 1);
                }
                iVarS = iVar.s(0.0f, fH);
            }
            iT = bVar.t();
            focusTargetNode = null;
            if (iT > 0) {
                objArrS = bVar.s();
                i10 = 0;
                do {
                    focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) objArrS[i10];
                    if (androidx.compose.ui.focus.s.g(focusTargetNode2)) {
                        iVarD = androidx.compose.ui.focus.s.d(focusTargetNode2);
                        if (m(iVarD, iVarS, iVar, i6)) {
                            focusTargetNode = focusTargetNode2;
                            iVarS = iVarD;
                        }
                    }
                    i10++;
                } while (i10 < iT);
            }
            return focusTargetNode;
        }
        fN = iVar.n() + 1;
        iVarS = iVar.s(fN, 0.0f);
        iT = bVar.t();
        focusTargetNode = null;
        if (iT > 0) {
            objArrS = bVar.s();
            i10 = 0;
            do {
                focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) objArrS[i10];
                if (androidx.compose.ui.focus.s.g(focusTargetNode2)) {
                    iVarD = androidx.compose.ui.focus.s.d(focusTargetNode2);
                    if (m(iVarD, iVarS, iVar, i6)) {
                        focusTargetNode = focusTargetNode2;
                        iVarS = iVarD;
                    }
                }
                i10++;
            } while (i10 < iT);
        }
        return focusTargetNode;
    }

    public static final boolean k(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6, p237x7.l lVar) {
        p131n0.i iVarH;
        X.b bVar = new X.b(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        i(focusTargetNode, bVar);
        if (bVar.t() <= 1) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) (bVar.w() ? null : bVar.s()[0]);
            if (focusTargetNode2 != null) {
                return ((java.lang.Boolean) lVar.l(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (androidx.compose.ui.focus.d.l(i6, aVar.b())) {
            i6 = aVar.g();
        }
        if (androidx.compose.ui.focus.d.l(i6, aVar.g()) ? true : androidx.compose.ui.focus.d.l(i6, aVar.a())) {
            iVarH = s(androidx.compose.ui.focus.s.d(focusTargetNode));
        } else {
            if (!(androidx.compose.ui.focus.d.l(i6, aVar.d()) ? true : androidx.compose.ui.focus.d.l(i6, aVar.h()))) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            iVarH = h(androidx.compose.ui.focus.s.d(focusTargetNode));
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNodeJ = j(bVar, iVarH, i6);
        if (focusTargetNodeJ != null) {
            return ((java.lang.Boolean) lVar.l(focusTargetNodeJ)).booleanValue();
        }
        return false;
    }

    private static final boolean l(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, p131n0.i iVar, int i6, p237x7.l lVar) {
        if (r(focusTargetNode, iVar, i6, lVar)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i6, new androidx.compose.ui.focus.v.b(focusTargetNode, iVar, i6, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(p131n0.i iVar, p131n0.i iVar2, p131n0.i iVar3, int i6) {
        if (n(iVar, i6, iVar3)) {
            return !n(iVar2, i6, iVar3) || c(iVar3, iVar, iVar2, i6) || (!c(iVar3, iVar2, iVar, i6) && q(i6, iVar3, iVar) < q(i6, iVar3, iVar2));
        }
        return false;
    }

    private static final boolean n(p131n0.i iVar, int i6, p131n0.i iVar2) {
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (androidx.compose.ui.focus.d.l(i6, aVar.d())) {
            if ((iVar2.j() <= iVar.j() && iVar2.i() < iVar.j()) || iVar2.i() <= iVar.i()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.g())) {
            if ((iVar2.i() >= iVar.i() && iVar2.j() > iVar.i()) || iVar2.j() >= iVar.j()) {
                return false;
            }
        } else if (androidx.compose.ui.focus.d.l(i6, aVar.h())) {
            if ((iVar2.e() <= iVar.e() && iVar2.l() < iVar.e()) || iVar2.l() <= iVar.l()) {
                return false;
            }
        } else {
            if (!androidx.compose.ui.focus.d.l(i6, aVar.a())) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if ((iVar2.l() >= iVar.l() && iVar2.e() > iVar.l()) || iVar2.e() >= iVar.e()) {
                return false;
            }
        }
        return true;
    }

    private static final float o(p131n0.i iVar, int i6, p131n0.i iVar2) {
        float fL;
        float fE;
        float fL2;
        float fE2;
        float f6;
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (!androidx.compose.ui.focus.d.l(i6, aVar.d())) {
            if (androidx.compose.ui.focus.d.l(i6, aVar.g())) {
                fL = iVar.i();
                fE = iVar2.j();
            } else if (androidx.compose.ui.focus.d.l(i6, aVar.h())) {
                fL2 = iVar2.l();
                fE2 = iVar.e();
            } else {
                if (!androidx.compose.ui.focus.d.l(i6, aVar.a())) {
                    throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                fL = iVar.l();
                fE = iVar2.e();
            }
            f6 = fL - fE;
            return java.lang.Math.max(0.0f, f6);
        }
        fL2 = iVar2.i();
        fE2 = iVar.j();
        f6 = fL2 - fE2;
        return java.lang.Math.max(0.0f, f6);
    }

    private static final float p(p131n0.i iVar, int i6, p131n0.i iVar2) {
        float f6;
        float fI;
        float fI2;
        float fN;
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (androidx.compose.ui.focus.d.l(i6, aVar.d()) ? true : androidx.compose.ui.focus.d.l(i6, aVar.g())) {
            f6 = 2;
            fI = iVar2.l() + (iVar2.h() / f6);
            fI2 = iVar.l();
            fN = iVar.h();
        } else {
            if (!(androidx.compose.ui.focus.d.l(i6, aVar.h()) ? true : androidx.compose.ui.focus.d.l(i6, aVar.a()))) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f6 = 2;
            fI = iVar2.i() + (iVar2.n() / f6);
            fI2 = iVar.i();
            fN = iVar.n();
        }
        return fI - (fI2 + (fN / f6));
    }

    private static final long q(int i6, p131n0.i iVar, p131n0.i iVar2) {
        long jAbs = (long) java.lang.Math.abs(o(iVar2, i6, iVar));
        long jAbs2 = (long) java.lang.Math.abs(p(iVar2, i6, iVar));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[LOOP:1: B:14:0x0050->B:44:0x00ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc A[LOOP:4: B:45:0x00b3->B:57:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x002f A[EDGE_INSN: B:63:0x002f->B:7:0x002f BREAK  A[LOOP:0: B:9:0x0036->B:64:0x0036], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00a9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00db A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:7:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:80:0x00ca
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final boolean r(androidx.compose.ui.focus.FocusTargetNode r11, p131n0.i r12, int r13, p237x7.l r14) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.v.r(androidx.compose.ui.focus.FocusTargetNode, n0.i, int, x7.l):boolean");
    }

    private static final p131n0.i s(p131n0.i iVar) {
        return new p131n0.i(iVar.i(), iVar.l(), iVar.i(), iVar.l());
    }

    public static final java.lang.Boolean t(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6, p131n0.i iVar, p237x7.l lVar) {
        boolean zL;
        p121m0.o oVarA2 = focusTargetNode.a2();
        int[] iArr = androidx.compose.ui.focus.v.a.f19717a;
        int i10 = iArr[oVarA2.ordinal()];
        if (i10 == 1) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNodeF = androidx.compose.ui.focus.s.f(focusTargetNode);
            if (focusTargetNodeF == null) {
                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int i11 = iArr[focusTargetNodeF.a2().ordinal()];
            if (i11 == 1) {
                java.lang.Boolean boolT = t(focusTargetNodeF, i6, iVar, lVar);
                if (!p247y7.AbstractC7350t.b(boolT, java.lang.Boolean.FALSE)) {
                    return boolT;
                }
                if (iVar == null) {
                    iVar = androidx.compose.ui.focus.s.d(b(focusTargetNodeF));
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        throw new p087i7.s();
                    }
                    throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                if (iVar == null) {
                    iVar = androidx.compose.ui.focus.s.d(focusTargetNodeF);
                }
            }
            zL = l(focusTargetNode, iVar, i6, lVar);
        } else {
            if (i10 != 2 && i10 != 3) {
                if (i10 != 4) {
                    throw new p087i7.s();
                }
                if (focusTargetNode.Y1().p()) {
                    return (java.lang.Boolean) lVar.l(focusTargetNode);
                }
                return java.lang.Boolean.valueOf(iVar == null ? k(focusTargetNode, i6, lVar) : r(focusTargetNode, iVar, i6, lVar));
            }
            zL = k(focusTargetNode, i6, lVar);
        }
        return java.lang.Boolean.valueOf(zL);
    }
}
