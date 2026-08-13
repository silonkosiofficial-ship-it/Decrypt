package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19706b;

        static {
            int[] iArr = new int[p121m0.a.values().length];
            try {
                iArr[p121m0.a.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p121m0.a.Redirected.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p121m0.a.Cancelled.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[p121m0.a.RedirectCancelled.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f19705a = iArr;
            int[] iArr2 = new int[p121m0.o.values().length];
            try {
                iArr2[p121m0.o.Active.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[p121m0.o.Captured.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[p121m0.o.ActiveParent.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[p121m0.o.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            f19706b = iArr2;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.FocusTargetNode f19707D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
            super(0);
            this.f19707D = focusTargetNode;
        }

        public final void a() {
            this.f19707D.Y1();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.FocusTargetNode f19708D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
            super(0);
            this.f19708D = focusTargetNode;
        }

        public final void a() {
            if (this.f19708D.E0().A1()) {
                p121m0.c.c(this.f19708D);
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    private static final boolean a(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, boolean z6, boolean z10) {
        androidx.compose.ui.focus.FocusTargetNode focusTargetNodeF = androidx.compose.ui.focus.s.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return c(focusTargetNodeF, z6, z10);
        }
        return true;
    }

    static /* synthetic */ boolean b(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, boolean z6, boolean z10, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        if ((i6 & 2) != 0) {
            z10 = true;
        }
        return a(focusTargetNode, z6, z10);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    public static final boolean c(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, boolean z6, boolean z10) {
        int i6 = androidx.compose.ui.focus.r.a.f19706b[focusTargetNode.a2().ordinal()];
        if (i6 == 1) {
            focusTargetNode.g2(p121m0.o.Inactive);
            if (z10) {
                p121m0.c.c(focusTargetNode);
            }
        } else {
            if (i6 == 2) {
                if (!z6) {
                    return z6;
                }
                focusTargetNode.g2(p121m0.o.Inactive);
                if (!z10) {
                    return z6;
                }
                p121m0.c.c(focusTargetNode);
                return z6;
            }
            if (i6 != 3) {
                if (i6 != 4) {
                    throw new p087i7.s();
                }
            } else {
                if (!a(focusTargetNode, z6, z10)) {
                    return false;
                }
                focusTargetNode.g2(p121m0.o.Inactive);
                if (z10) {
                    p121m0.c.c(focusTargetNode);
                }
            }
        }
        return true;
    }

    private static final boolean d(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        F0.j0.a(focusTargetNode, new androidx.compose.ui.focus.r.b(focusTargetNode));
        int i6 = androidx.compose.ui.focus.r.a.f19706b[focusTargetNode.a2().ordinal()];
        if (i6 != 3 && i6 != 4) {
            return true;
        }
        focusTargetNode.g2(p121m0.o.Active);
        return true;
    }

    public static final p121m0.a e(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6) {
        int i10 = androidx.compose.ui.focus.r.a.f19706b[focusTargetNode.a2().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return p121m0.a.Cancelled;
            }
            if (i10 == 3) {
                p121m0.a aVarE = e(n(focusTargetNode), i6);
                if (aVarE == p121m0.a.None) {
                    aVarE = null;
                }
                return aVarE == null ? g(focusTargetNode, i6) : aVarE;
            }
            if (i10 != 4) {
                throw new p087i7.s();
            }
        }
        return p121m0.a.None;
    }

    private static final p121m0.a f(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6) {
        if (!focusTargetNode.f19660Q) {
            focusTargetNode.f19660Q = true;
            try {
                androidx.compose.ui.focus.n nVar = (androidx.compose.ui.focus.n) focusTargetNode.Y1().z().l(androidx.compose.ui.focus.d.i(i6));
                androidx.compose.ui.focus.n.a aVar = androidx.compose.ui.focus.n.f19698b;
                if (nVar != aVar.b()) {
                    if (nVar == aVar.a()) {
                        return p121m0.a.Cancelled;
                    }
                    return nVar.d() ? p121m0.a.Redirected : p121m0.a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f19660Q = false;
            }
        }
        return p121m0.a.None;
    }

    private static final p121m0.a g(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6) {
        if (!focusTargetNode.f19659P) {
            focusTargetNode.f19659P = true;
            try {
                androidx.compose.ui.focus.n nVar = (androidx.compose.ui.focus.n) focusTargetNode.Y1().u().l(androidx.compose.ui.focus.d.i(i6));
                androidx.compose.ui.focus.n.a aVar = androidx.compose.ui.focus.n.f19698b;
                if (nVar != aVar.b()) {
                    if (nVar == aVar.a()) {
                        return p121m0.a.Cancelled;
                    }
                    return nVar.d() ? p121m0.a.Redirected : p121m0.a.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f19659P = false;
            }
        }
        return p121m0.a.None;
    }

    public static final p121m0.a h(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6) {
        androidx.compose.ui.d.c cVarG;
        F0.C0910b0 c0910b0K0;
        int i10 = androidx.compose.ui.focus.r.a.f19706b[focusTargetNode.a2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return p121m0.a.None;
        }
        if (i10 == 3) {
            return e(n(focusTargetNode), i6);
        }
        if (i10 != 4) {
            throw new p087i7.s();
        }
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
                                int i11 = 0;
                                for (androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) cVarG).U1(); cVarU1 != null; cVarU1 = cVarU1.r1()) {
                                    if ((cVarU1.v1() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
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
        if (focusTargetNode2 == null) {
            return p121m0.a.None;
        }
        int i12 = androidx.compose.ui.focus.r.a.f19706b[focusTargetNode2.a2().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return p121m0.a.Cancelled;
            }
            if (i12 == 3) {
                return h(focusTargetNode2, i6);
            }
            if (i12 != 4) {
                throw new p087i7.s();
            }
            p121m0.a aVarH = h(focusTargetNode2, i6);
            p121m0.a aVar = aVarH != p121m0.a.None ? aVarH : null;
            if (aVar != null) {
                return aVar;
            }
        }
        return f(focusTargetNode2, i6);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    public static final boolean i(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        F0.C0910b0 c0910b0K0;
        int i6 = androidx.compose.ui.focus.r.a.f19706b[focusTargetNode.a2().ordinal()];
        boolean zL = true;
        if (i6 != 1 && i6 != 2) {
            androidx.compose.ui.d.c cVar = null;
            if (i6 != 3) {
                if (i6 != 4) {
                    throw new p087i7.s();
                }
                int iA = F0.AbstractC0918f0.a(1024);
                if (!focusTargetNode.E0().A1()) {
                    throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                androidx.compose.ui.d.c cVarX1 = focusTargetNode.E0().x1();
                F0.J jM = F0.AbstractC0925k.m(focusTargetNode);
                loop0: while (jM != null) {
                    if ((jM.k0().k().q1() & iA) != 0) {
                        while (cVarX1 != null) {
                            if ((cVarX1.v1() & iA) != 0) {
                                androidx.compose.ui.d.c cVarG = cVarX1;
                                X.b bVar = null;
                                while (cVarG != null) {
                                    if (cVarG instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                        cVar = cVarG;
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
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) cVar;
                if (focusTargetNode2 != null) {
                    p121m0.o oVarA2 = focusTargetNode2.a2();
                    zL = l(focusTargetNode2, focusTargetNode);
                    if (zL && oVarA2 != focusTargetNode2.a2()) {
                        p121m0.c.c(focusTargetNode2);
                    }
                } else if (!m(focusTargetNode) || !d(focusTargetNode)) {
                    zL = false;
                }
            } else if (!b(focusTargetNode, false, false, 3, null) || !d(focusTargetNode)) {
                zL = false;
            }
        }
        if (zL) {
            p121m0.c.c(focusTargetNode);
        }
        return zL;
    }

    public static final boolean j(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        java.lang.Boolean boolK = k(focusTargetNode, androidx.compose.ui.focus.d.f19669b.b());
        if (boolK != null) {
            return boolK.booleanValue();
        }
        return false;
    }

    public static final java.lang.Boolean k(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6) {
        java.lang.Boolean boolValueOf;
        p121m0.s sVarD = p121m0.r.d(focusTargetNode);
        androidx.compose.ui.focus.r.c cVar = new androidx.compose.ui.focus.r.c(focusTargetNode);
        try {
            if (sVarD.f50224c) {
                sVarD.g();
            }
            sVarD.f();
            sVarD.f50223b.d(cVar);
            int i10 = androidx.compose.ui.focus.r.a.f19705a[h(focusTargetNode, i6).ordinal()];
            if (i10 == 1) {
                boolValueOf = java.lang.Boolean.valueOf(i(focusTargetNode));
            } else if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    throw new p087i7.s();
                }
                boolValueOf = null;
            } else {
                boolValueOf = java.lang.Boolean.TRUE;
            }
            sVarD.h();
            return boolValueOf;
        } catch (java.lang.Throwable th) {
            sVarD.h();
            throw th;
        }
    }

    private static final boolean l(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusTargetNode focusTargetNode2) {
        androidx.compose.ui.d.c cVar;
        androidx.compose.ui.d.c cVarG;
        boolean zD;
        F0.C0910b0 c0910b0K0;
        F0.C0910b0 c0910b0K1;
        int iA = F0.AbstractC0918f0.a(1024);
        if (!focusTargetNode2.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = focusTargetNode2.E0().x1();
        F0.J jM = F0.AbstractC0925k.m(focusTargetNode2);
        loop0: while (true) {
            cVar = null;
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
            cVarX1 = (jM == null || (c0910b0K1 = jM.k0()) == null) ? null : c0910b0K1.o();
        }
        if (!p247y7.AbstractC7350t.b(cVarG, focusTargetNode)) {
            throw new java.lang.IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i10 = androidx.compose.ui.focus.r.a.f19706b[focusTargetNode.a2().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    n(focusTargetNode);
                    if (b(focusTargetNode, false, false, 3, null) && d(focusTargetNode2)) {
                        return true;
                    }
                } else {
                    if (i10 != 4) {
                        throw new p087i7.s();
                    }
                    int iA2 = F0.AbstractC0918f0.a(1024);
                    if (!focusTargetNode.E0().A1()) {
                        throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                    androidx.compose.ui.d.c cVarX2 = focusTargetNode.E0().x1();
                    F0.J jM2 = F0.AbstractC0925k.m(focusTargetNode);
                    loop4: while (jM2 != null) {
                        if ((jM2.k0().k().q1() & iA2) != 0) {
                            while (cVarX2 != null) {
                                if ((cVarX2.v1() & iA2) != 0) {
                                    androidx.compose.ui.d.c cVarG2 = cVarX2;
                                    X.b bVar2 = null;
                                    while (cVarG2 != null) {
                                        if (cVarG2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                            cVar = cVarG2;
                                            break loop4;
                                        }
                                        if ((cVarG2.v1() & iA2) != 0 && (cVarG2 instanceof F0.AbstractC0927m)) {
                                            int i11 = 0;
                                            for (androidx.compose.ui.d.c cVarU2 = ((F0.AbstractC0927m) cVarG2).U1(); cVarU2 != null; cVarU2 = cVarU2.r1()) {
                                                if ((cVarU2.v1() & iA2) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        cVarG2 = cVarU2;
                                                    } else {
                                                        if (bVar2 == null) {
                                                            bVar2 = new X.b(new androidx.compose.ui.d.c[16], 0);
                                                        }
                                                        if (cVarG2 != null) {
                                                            bVar2.d(cVarG2);
                                                            cVarG2 = null;
                                                        }
                                                        bVar2.d(cVarU2);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        cVarG2 = F0.AbstractC0925k.g(bVar2);
                                    }
                                }
                                cVarX2 = cVarX2.x1();
                            }
                        }
                        jM2 = jM2.o0();
                        cVarX2 = (jM2 == null || (c0910b0K0 = jM2.k0()) == null) ? null : c0910b0K0.o();
                    }
                    androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) cVar;
                    if (focusTargetNode3 == null && m(focusTargetNode)) {
                        zD = d(focusTargetNode2);
                        if (!zD) {
                            return zD;
                        }
                    } else if (focusTargetNode3 != null && l(focusTargetNode3, focusTargetNode)) {
                        boolean zL = l(focusTargetNode, focusTargetNode2);
                        if (focusTargetNode.a2() != p121m0.o.ActiveParent) {
                            throw new java.lang.IllegalStateException("Deactivated node is focused".toString());
                        }
                        if (!zL) {
                            return zL;
                        }
                        p121m0.c.c(focusTargetNode3);
                        return zL;
                    }
                }
            }
            return false;
        }
        zD = d(focusTargetNode2);
        if (!zD) {
            return zD;
        }
        focusTargetNode.g2(p121m0.o.ActiveParent);
        return zD;
    }

    private static final boolean m(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        return F0.AbstractC0925k.n(focusTargetNode).getFocusOwner().k(null, null);
    }

    private static final androidx.compose.ui.focus.FocusTargetNode n(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.focus.FocusTargetNode focusTargetNodeF = androidx.compose.ui.focus.s.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return focusTargetNodeF;
        }
        throw new java.lang.IllegalArgumentException("ActiveParent with no focused child".toString());
    }
}
