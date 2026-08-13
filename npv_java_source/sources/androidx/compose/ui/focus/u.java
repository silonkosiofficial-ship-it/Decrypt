package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19712a;

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
            f19712a = iArr;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.FocusTargetNode f19713D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.FocusTargetNode f19714E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f19715F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.l f19716G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusTargetNode focusTargetNode2, int i6, p237x7.l lVar) {
            super(1);
            this.f19713D = focusTargetNode;
            this.f19714E = focusTargetNode2;
            this.f19715F = i6;
            this.f19716G = lVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(D0.InterfaceC0886e.a aVar) {
            boolean zI = androidx.compose.ui.focus.u.i(this.f19713D, this.f19714E, this.f19715F, this.f19716G);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zI);
            if (zI || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean b(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, p237x7.l lVar) {
        p121m0.o oVarA2 = focusTargetNode.a2();
        int[] iArr = androidx.compose.ui.focus.u.a.f19712a;
        int i6 = iArr[oVarA2.ordinal()];
        if (i6 == 1) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNodeF = androidx.compose.ui.focus.s.f(focusTargetNode);
            if (focusTargetNodeF == null) {
                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            int i10 = iArr[focusTargetNodeF.a2().ordinal()];
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3) {
                    return d(focusTargetNode, focusTargetNodeF, androidx.compose.ui.focus.d.f19669b.f(), lVar);
                }
                if (i10 != 4) {
                    throw new p087i7.s();
                }
                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            if (!b(focusTargetNodeF, lVar) && !d(focusTargetNode, focusTargetNodeF, androidx.compose.ui.focus.d.f19669b.f(), lVar) && (!focusTargetNodeF.Y1().p() || !((java.lang.Boolean) lVar.l(focusTargetNodeF)).booleanValue())) {
                return false;
            }
        } else {
            if (i6 == 2 || i6 == 3) {
                return g(focusTargetNode, lVar);
            }
            if (i6 != 4) {
                throw new p087i7.s();
            }
            if (!g(focusTargetNode, lVar)) {
                if (!(focusTargetNode.Y1().p() ? ((java.lang.Boolean) lVar.l(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean c(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, p237x7.l lVar) {
        int i6 = androidx.compose.ui.focus.u.a.f19712a[focusTargetNode.a2().ordinal()];
        if (i6 == 1) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNodeF = androidx.compose.ui.focus.s.f(focusTargetNode);
            if (focusTargetNodeF != null) {
                return c(focusTargetNodeF, lVar) || d(focusTargetNode, focusTargetNodeF, androidx.compose.ui.focus.d.f19669b.e(), lVar);
            }
            throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        if (i6 != 2 && i6 != 3) {
            if (i6 != 4) {
                throw new p087i7.s();
            }
            if (focusTargetNode.Y1().p()) {
                return ((java.lang.Boolean) lVar.l(focusTargetNode)).booleanValue();
            }
        }
        return h(focusTargetNode, lVar);
    }

    private static final boolean d(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusTargetNode focusTargetNode2, int i6, p237x7.l lVar) {
        if (i(focusTargetNode, focusTargetNode2, i6, lVar)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i6, new androidx.compose.ui.focus.u.b(focusTargetNode, focusTargetNode2, i6, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.d.c cVar;
        F0.C0910b0 c0910b0K0;
        int iA = F0.AbstractC0918f0.a(1024);
        if (!focusTargetNode.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = focusTargetNode.E0().x1();
        F0.J jM = F0.AbstractC0925k.m(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (jM == null) {
                break;
            }
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
        return cVar == null;
    }

    public static final boolean f(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i6, p237x7.l lVar) {
        androidx.compose.ui.focus.d.a aVar = androidx.compose.ui.focus.d.f19669b;
        if (androidx.compose.ui.focus.d.l(i6, aVar.e())) {
            return c(focusTargetNode, lVar);
        }
        if (androidx.compose.ui.focus.d.l(i6, aVar.f())) {
            return b(focusTargetNode, lVar);
        }
        throw new java.lang.IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[LOOP:1: B:14:0x0050->B:42:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x002f A[EDGE_INSN: B:58:0x002f->B:7:0x002f BREAK  A[LOOP:0: B:9:0x0036->B:59:0x0036], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:7:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0067
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static final boolean g(androidx.compose.ui.focus.FocusTargetNode r11, p237x7.l r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.u.g(androidx.compose.ui.focus.FocusTargetNode, x7.l):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[LOOP:1: B:14:0x0050->B:42:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x002f A[EDGE_INSN: B:58:0x002f->B:7:0x002f BREAK  A[LOOP:0: B:9:0x0036->B:59:0x0036], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:7:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x001a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static final boolean h(androidx.compose.ui.focus.FocusTargetNode r11, p237x7.l r12) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.u.h(androidx.compose.ui.focus.FocusTargetNode, x7.l):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00ab A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x014c A[EDGE_INSN: B:112:0x014c->B:77:0x014c BREAK  A[LOOP:4: B:50:0x00db->B:60:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x014c A[EDGE_INSN: B:114:0x014c->B:77:0x014c BREAK  A[LOOP:5: B:66:0x0123->B:76:0x0149], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0 A[LOOP:1: B:16:0x0058->B:44:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101 A[LOOP:4: B:50:0x00db->B:60:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0122  */
    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Code duplicated, block: B:69:0x0133  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149 A[LOOP:5: B:66:0x0123->B:76:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0158  */
    /* JADX WARN: Code duplicated, block: B:87:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0037 A[EDGE_INSN: B:95:0x0037->B:9:0x0037 BREAK  A[LOOP:0: B:11:0x003e->B:96:0x003e], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0055 -> B:9:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:63:0x010e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final boolean i(androidx.compose.ui.focus.FocusTargetNode r12, androidx.compose.ui.focus.FocusTargetNode r13, int r14, p237x7.l r15) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.u.i(androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusTargetNode, int, x7.l):boolean");
    }
}
