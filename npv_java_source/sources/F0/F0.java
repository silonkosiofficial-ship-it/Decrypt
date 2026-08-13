package F0;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final F0.E0 a(F0.InterfaceC0924j interfaceC0924j, java.lang.Object obj) {
        F0.C0910b0 c0910b0K0;
        int iA = F0.AbstractC0918f0.a(262144);
        if (!interfaceC0924j.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = interfaceC0924j.E0().x1();
        F0.J jM = F0.AbstractC0925k.m(interfaceC0924j);
        while (jM != null) {
            if ((jM.k0().k().q1() & iA) != 0) {
                while (cVarX1 != null) {
                    if ((cVarX1.v1() & iA) != 0) {
                        ?? G10 = cVarX1;
                        ?? bVar = 0;
                        while (G10 != 0) {
                            if (G10 instanceof F0.E0) {
                                F0.E0 e6 = (F0.E0) G10;
                                if (p247y7.AbstractC7350t.b(obj, e6.K())) {
                                    return e6;
                                }
                            } else if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                                androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                                int i6 = 0;
                                G10 = G10;
                                bVar = bVar;
                                while (cVarU1 != null) {
                                    if ((cVarU1.v1() & iA) != 0) {
                                        i6++;
                                        if (i6 == 1) {
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
                                if (i6 == 1) {
                                }
                            }
                            G10 = F0.AbstractC0925k.g(bVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final F0.E0 b(F0.E0 e6) {
        F0.C0910b0 c0910b0K0;
        int iA = F0.AbstractC0918f0.a(262144);
        if (!e6.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = e6.E0().x1();
        F0.J jM = F0.AbstractC0925k.m(e6);
        while (jM != null) {
            if ((jM.k0().k().q1() & iA) != 0) {
                while (cVarX1 != null) {
                    if ((cVarX1.v1() & iA) != 0) {
                        ?? G10 = cVarX1;
                        ?? bVar = 0;
                        while (G10 != 0) {
                            if (G10 instanceof F0.E0) {
                                F0.E0 e10 = (F0.E0) G10;
                                if (p247y7.AbstractC7350t.b(e6.K(), e10.K()) && p071h0.b.a(e6, e10)) {
                                    return e10;
                                }
                            } else if ((G10.v1() & iA) != 0 && (G10 instanceof F0.AbstractC0927m)) {
                                androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                                int i6 = 0;
                                G10 = G10;
                                bVar = bVar;
                                while (cVarU1 != null) {
                                    if ((cVarU1.v1() & iA) != 0) {
                                        i6++;
                                        if (i6 == 1) {
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
                                if (i6 == 1) {
                                }
                            }
                            G10 = F0.AbstractC0925k.g(bVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [x7.l] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void c(F0.InterfaceC0924j interfaceC0924j, java.lang.Object obj, p237x7.l lVar) {
        F0.C0910b0 c0910b0K0;
        int iA = F0.AbstractC0918f0.a(262144);
        if (!interfaceC0924j.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = interfaceC0924j.E0().x1();
        F0.J jM = F0.AbstractC0925k.m(interfaceC0924j);
        while (jM != null) {
            if ((jM.k0().k().q1() & iA) != 0) {
                while (cVarX1 != null) {
                    if ((cVarX1.v1() & iA) != 0) {
                        ?? G10 = cVarX1;
                        ?? bVar = 0;
                        while (G10 != 0) {
                            if (G10 instanceof F0.E0) {
                                F0.E0 e6 = (F0.E0) G10;
                                if (!(p247y7.AbstractC7350t.b(obj, e6.K()) ? ((java.lang.Boolean) lVar.l(e6)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((G10.v1() & iA) != 0) && (G10 instanceof F0.AbstractC0927m)) {
                                    androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                                    int i6 = 0;
                                    while (cVarU1 != null) {
                                        if ((cVarU1.v1() & iA) != 0) {
                                            G10 = G10;
                                            bVar = bVar;
                                            i6++;
                                            if (i6 == 1) {
                                                G10 = G10;
                                                bVar = bVar;
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
                                        } else {
                                            G10 = G10;
                                            bVar = bVar;
                                            G10 = G10;
                                            bVar = bVar;
                                        }
                                        cVarU1 = cVarU1.r1();
                                        G10 = G10;
                                        bVar = bVar;
                                    }
                                    if (i6 == 1) {
                                        G10 = G10;
                                        bVar = bVar;
                                    } else {
                                        G10 = G10;
                                        bVar = bVar;
                                    }
                                }
                            }
                            G10 = F0.AbstractC0925k.g(bVar);
                        }
                    }
                    cVarX1 = cVarX1.x1();
                }
            }
            jM = jM.o0();
            cVarX1 = (jM == null || (c0910b0K0 = jM.k0()) == null) ? null : c0910b0K0.o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [x7.l] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void d(F0.E0 e6, p237x7.l lVar) {
        F0.C0910b0 c0910b0K0;
        int iA = F0.AbstractC0918f0.a(262144);
        if (!e6.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = e6.E0().x1();
        F0.J jM = F0.AbstractC0925k.m(e6);
        while (jM != null) {
            if ((jM.k0().k().q1() & iA) != 0) {
                while (cVarX1 != null) {
                    if ((cVarX1.v1() & iA) != 0) {
                        ?? G10 = cVarX1;
                        ?? bVar = 0;
                        while (G10 != 0) {
                            boolean zBooleanValue = true;
                            if (G10 instanceof F0.E0) {
                                F0.E0 e10 = (F0.E0) G10;
                                if (p247y7.AbstractC7350t.b(e6.K(), e10.K()) && p071h0.b.a(e6, e10)) {
                                    zBooleanValue = ((java.lang.Boolean) lVar.l(e10)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((G10.v1() & iA) != 0) && (G10 instanceof F0.AbstractC0927m)) {
                                    androidx.compose.ui.d.c cVarU1 = ((F0.AbstractC0927m) G10).U1();
                                    int i6 = 0;
                                    while (cVarU1 != null) {
                                        if ((cVarU1.v1() & iA) != 0) {
                                            G10 = G10;
                                            bVar = bVar;
                                            i6++;
                                            if (i6 == 1) {
                                                G10 = G10;
                                                bVar = bVar;
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
                                        } else {
                                            G10 = G10;
                                            bVar = bVar;
                                            G10 = G10;
                                            bVar = bVar;
                                        }
                                        cVarU1 = cVarU1.r1();
                                        G10 = G10;
                                        bVar = bVar;
                                    }
                                    if (i6 == 1) {
                                        G10 = G10;
                                        bVar = bVar;
                                    } else {
                                        G10 = G10;
                                        bVar = bVar;
                                    }
                                }
                            }
                            G10 = F0.AbstractC0925k.g(bVar);
                        }
                    }
                    cVarX1 = cVarX1.x1();
                }
            }
            jM = jM.o0();
            cVarX1 = (jM == null || (c0910b0K0 = jM.k0()) == null) ? null : c0910b0K0.o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x002d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[LOOP:0: B:10:0x0034->B:59:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [x7.l] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:8:0x002d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:8:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final void e(F0.InterfaceC0924j r12, java.lang.Object r13, p237x7.l r14) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = F0.AbstractC0918f0.a(r0)
            androidx.compose.ui.d$c r1 = r12.E0()
            boolean r1 = r1.A1()
            if (r1 != 0) goto L15
            java.lang.String r1 = "visitSubtreeIf called on an unattached node"
            C0.a.b(r1)
        L15:
            X.b r1 = new X.b
            r2 = 16
            androidx.compose.ui.d$c[] r3 = new androidx.compose.ui.d.c[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.d$c r3 = r12.E0()
            androidx.compose.ui.d$c r3 = r3.r1()
            if (r3 != 0) goto L31
            androidx.compose.ui.d$c r12 = r12.E0()
        L2d:
            F0.AbstractC0925k.a(r1, r12)
            goto L34
        L31:
            r1.d(r3)
        L34:
            boolean r12 = r1.x()
            if (r12 == 0) goto Lc5
            int r12 = r1.t()
            r3 = 1
            int r12 = r12 - r3
            java.lang.Object r12 = r1.D(r12)
            androidx.compose.ui.d$c r12 = (androidx.compose.ui.d.c) r12
            int r5 = r12.q1()
            r5 = r5 & r0
            if (r5 == 0) goto L2d
            r5 = r12
        L4e:
            if (r5 == 0) goto L2d
            int r6 = r5.v1()
            r6 = r6 & r0
            if (r6 == 0) goto Lc0
            r6 = 0
            r7 = r5
            r8 = r6
        L5a:
            if (r7 == 0) goto Lc0
            boolean r9 = r7 instanceof F0.E0
            if (r9 == 0) goto L7f
            F0.E0 r7 = (F0.E0) r7
            java.lang.Object r9 = r7.K()
            boolean r9 = p247y7.AbstractC7350t.b(r13, r9)
            if (r9 == 0) goto L73
            java.lang.Object r7 = r14.l(r7)
            F0.D0 r7 = (F0.D0) r7
            goto L75
        L73:
            F0.D0 r7 = F0.D0.ContinueTraversal
        L75:
            F0.D0 r9 = F0.D0.CancelTraversal
            if (r7 != r9) goto L7a
            return
        L7a:
            F0.D0 r9 = F0.D0.SkipSubtreeAndContinueTraversal
            if (r7 == r9) goto L34
            goto Lbb
        L7f:
            int r9 = r7.v1()
            r9 = r9 & r0
            if (r9 == 0) goto Lbb
            boolean r9 = r7 instanceof F0.AbstractC0927m
            if (r9 == 0) goto Lbb
            r9 = r7
            F0.m r9 = (F0.AbstractC0927m) r9
            androidx.compose.ui.d$c r9 = r9.U1()
            r10 = r4
        L92:
            if (r9 == 0) goto Lb8
            int r11 = r9.v1()
            r11 = r11 & r0
            if (r11 == 0) goto Lb3
            int r10 = r10 + 1
            if (r10 != r3) goto La1
            r7 = r9
            goto Lb3
        La1:
            if (r8 != 0) goto Laa
            X.b r8 = new X.b
            androidx.compose.ui.d$c[] r11 = new androidx.compose.ui.d.c[r2]
            r8.<init>(r11, r4)
        Laa:
            if (r7 == 0) goto Lb0
            r8.d(r7)
            r7 = r6
        Lb0:
            r8.d(r9)
        Lb3:
            androidx.compose.ui.d$c r9 = r9.r1()
            goto L92
        Lb8:
            if (r10 != r3) goto Lbb
            goto L5a
        Lbb:
            androidx.compose.ui.d$c r7 = F0.AbstractC0925k.b(r8)
            goto L5a
        Lc0:
            androidx.compose.ui.d$c r5 = r5.r1()
            goto L4e
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.F0.e(F0.j, java.lang.Object, x7.l):void");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x002d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[LOOP:0: B:10:0x0034->B:61:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [x7.l] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:8:0x002d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:8:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final void f(F0.E0 r13, p237x7.l r14) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.F0.f(F0.E0, x7.l):void");
    }
}
