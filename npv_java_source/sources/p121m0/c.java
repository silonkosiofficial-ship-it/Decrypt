package p121m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50207a;

        static {
            int[] iArr = new int[p121m0.o.values().length];
            try {
                iArr[p121m0.o.Active.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p121m0.o.ActiveParent.ordinal()] = 2;
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
            f50207a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:99:0x008e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ab -> B:38:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final p121m0.n a(p121m0.b r12) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p121m0.c.a(m0.b):m0.n");
    }

    public static final void b(p121m0.b bVar) {
        F0.AbstractC0925k.n(bVar).getFocusOwner().p(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static final void c(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        F0.C0910b0 c0910b0K0;
        int iA = F0.AbstractC0918f0.a(4096);
        int iA2 = F0.AbstractC0918f0.a(1024);
        androidx.compose.ui.d.c cVarE0 = focusTargetNode.E0();
        int i6 = iA | iA2;
        if (!focusTargetNode.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarE1 = focusTargetNode.E0();
        F0.J jM = F0.AbstractC0925k.m(focusTargetNode);
        while (jM != null) {
            if ((jM.k0().k().q1() & i6) != 0) {
                while (cVarE1 != null) {
                    if ((cVarE1.v1() & i6) != 0) {
                        if (cVarE1 != cVarE0 && (cVarE1.v1() & iA2) != 0) {
                            return;
                        }
                        if ((cVarE1.v1() & iA) != 0) {
                            ?? G10 = cVarE1;
                            ?? bVar = 0;
                            while (G10 != 0) {
                                if (G10 instanceof p121m0.b) {
                                    p121m0.b bVar2 = (p121m0.b) G10;
                                    bVar2.R0(a(bVar2));
                                } else if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                                    androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                                    int i10 = 0;
                                    G10 = G10;
                                    bVar = bVar;
                                    while (cVarU1 != null) {
                                        if ((cVarU1.v1() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                bVar = bVar;
                                                G10 = cVarU1;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new X.b(new androidx.compose.ui.d.c[16], 0);
                                                }
                                                if (G10 != 0) {
                                                    bVar.d(G10);
                                                    G10 = 0;
                                                }
                                                bVar.d(cVarU1);
                                            }
                                        }
                                        cVarU1 = cVarU1.r1();
                                        G10 = G10;
                                        bVar = bVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                G10 = F0.AbstractC0925k.g(bVar);
                            }
                        }
                    }
                    cVarE1 = cVarE1.x1();
                }
            }
            jM = jM.o0();
            cVarE1 = (jM == null || (c0910b0K0 = jM.k0()) == null) ? null : c0910b0K0.o();
        }
    }
}
