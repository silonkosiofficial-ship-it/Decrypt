package K0;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a A[EDGE_INSN: B:41:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    public static final K0.o a(F0.J j6, boolean z6) {
        F0.C0910b0 c0910b0K0 = j6.k0();
        int iA = F0.AbstractC0918f0.a(8);
        java.lang.Object obj = null;
        if ((c0910b0K0.i() & iA) != 0) {
            loop0: for (androidx.compose.ui.d.c cVarK = c0910b0K0.k(); cVarK != null; cVarK = cVarK.r1()) {
                if ((cVarK.v1() & iA) == 0) {
                    if ((cVarK.q1() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    androidx.compose.ui.d.c cVarG = cVarK;
                    X.b bVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof F0.z0) {
                            obj = cVarG;
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
                    if ((cVarK.q1() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        p247y7.AbstractC7350t.c(obj);
        androidx.compose.ui.d.c cVarE0 = ((F0.z0) obj).E0();
        K0.k kVarI = j6.I();
        p247y7.AbstractC7350t.c(kVarI);
        return new K0.o(cVarE0, z6, j6, kVarI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(K0.o oVar) {
        return oVar.o() + 2000000000;
    }

    public static final F0.J f(F0.J j6, p237x7.l lVar) {
        do {
            j6 = j6.o0();
            if (j6 == null) {
                return null;
            }
        } while (!((java.lang.Boolean) lVar.l(j6)).booleanValue());
        return j6;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    public static final F0.z0 g(F0.J j6) {
        F0.C0910b0 c0910b0K0 = j6.k0();
        int iA = F0.AbstractC0918f0.a(8);
        java.lang.Object obj = null;
        if ((c0910b0K0.i() & iA) != 0) {
            loop0: for (androidx.compose.ui.d.c cVarK = c0910b0K0.k(); cVarK != null; cVarK = cVarK.r1()) {
                if ((cVarK.v1() & iA) == 0) {
                    if ((cVarK.q1() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    androidx.compose.ui.d.c cVarG = cVarK;
                    X.b bVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof F0.z0) {
                            if (((F0.z0) cVarG).k1()) {
                                obj = cVarG;
                                break loop0;
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
                    if ((cVarK.q1() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        return (F0.z0) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K0.h h(K0.o oVar) {
        return (K0.h) K0.l.a(oVar.w(), K0.r.f6030a.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(K0.o oVar) {
        return oVar.o() + 1000000000;
    }
}
