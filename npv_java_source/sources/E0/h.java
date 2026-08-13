package E0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    public static java.lang.Object a(E0.i iVar, E0.c cVar) {
        F0.C0910b0 c0910b0K0;
        if (!iVar.E0().A1()) {
            C0.a.a("ModifierLocal accessed from an unattached node");
        }
        int iA = F0.AbstractC0918f0.a(32);
        if (!iVar.E0().A1()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.d.c cVarX1 = iVar.E0().x1();
        F0.J jM = F0.AbstractC0925k.m(iVar);
        while (jM != null) {
            if ((jM.k0().k().q1() & iA) != 0) {
                while (cVarX1 != null) {
                    if ((cVarX1.v1() & iA) != 0) {
                        ?? G10 = cVarX1;
                        ?? bVar = 0;
                        while (G10 != 0) {
                            if (G10 instanceof E0.i) {
                                E0.i iVar2 = (E0.i) G10;
                                if (iVar2.s0().a(cVar)) {
                                    return iVar2.s0().b(cVar);
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
        return cVar.a().b();
    }

    public static E0.g b(E0.i iVar) {
        return E0.b.f2091a;
    }
}
