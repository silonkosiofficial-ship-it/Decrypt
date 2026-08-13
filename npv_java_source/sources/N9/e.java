package N9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final X9.C1839g f7915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final X9.C1839g f7916b;

    static {
        X9.C1839g.a aVar = X9.C1839g.f16149F;
        f7915a = aVar.c("\"\\");
        f7916b = aVar.c("\t ,=");
    }

    public static final java.util.List a(H9.t tVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(tVar, "<this>");
        p247y7.AbstractC7350t.f(str, "headerName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = tVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (S8.r.K(str, tVar.e(i6), true)) {
                try {
                    c(new X9.C1836d().t0(tVar.s(i6)), arrayList);
                } catch (java.io.EOFException e6) {
                    Q9.k.f9149a.g().j("Unable to parse challenge", 5, e6);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(H9.B b6) {
        p247y7.AbstractC7350t.f(b6, "<this>");
        if (p247y7.AbstractC7350t.b(b6.r0().g(), "HEAD")) {
            return false;
        }
        int iO = b6.o();
        return (((iO >= 100 && iO < 200) || iO == 204 || iO == 304) && I9.d.v(b6) == -1 && !S8.r.K("chunked", H9.B.D(b6, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba A[EDGE_INSN: B:59:0x00ba->B:48:0x00ba BREAK  A[LOOP:2: B:22:0x0071->B:47:0x00b8], SYNTHETIC] */
    private static final void c(X9.C1836d c1836d, java.util.List list) throws java.io.EOFException {
        java.lang.String strE;
        while (true) {
            java.lang.String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(c1836d);
                    strE2 = e(c1836d);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(c1836d);
                java.lang.String strE3 = e(c1836d);
                if (strE3 == null) {
                    if (c1836d.j()) {
                        list.add(new H9.h(strE2, p097j7.S.h()));
                        return;
                    }
                    return;
                }
                int iJ = I9.d.J(c1836d, (byte) 61);
                boolean zG2 = g(c1836d);
                if (zG || !(zG2 || c1836d.j())) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    int iJ2 = iJ + I9.d.J(c1836d, (byte) 61);
                    while (true) {
                        if (strE3 != null) {
                            if (iJ2 != 0) {
                                break;
                                break;
                            }
                            if (iJ2 <= 1) {
                                return;
                            }
                            if (h(c1836d, (byte) 34)) {
                                strE = d(c1836d);
                            } else {
                                strE = e(c1836d);
                            }
                            if (strE != null) {
                                return;
                            }
                            if (g(c1836d)) {
                            }
                            strE3 = null;
                        } else {
                            strE3 = e(c1836d);
                            if (!g(c1836d)) {
                                iJ2 = I9.d.J(c1836d, (byte) 61);
                                if (iJ2 != 0) {
                                    break;
                                }
                                if (iJ2 <= 1 || g(c1836d)) {
                                    return;
                                }
                                if (h(c1836d, (byte) 34)) {
                                    strE = d(c1836d);
                                } else {
                                    strE = e(c1836d);
                                }
                                if (strE != null || ((java.lang.String) linkedHashMap.put(strE3, strE)) != null) {
                                    return;
                                }
                                if (g(c1836d) && !c1836d.j()) {
                                    return;
                                } else {
                                    strE3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new H9.h(strE2, linkedHashMap));
                    strE2 = strE3;
                } else {
                    java.util.Map mapSingletonMap = java.util.Collections.singletonMap(null, strE3 + S8.r.N("=", iJ));
                    p247y7.AbstractC7350t.e(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new H9.h(strE2, mapSingletonMap));
                }
            }
        }
    }

    private static final java.lang.String d(X9.C1836d c1836d) throws java.io.EOFException {
        if (c1836d.m() != 34) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        X9.C1836d c1836d2 = new X9.C1836d();
        while (true) {
            long jH0 = c1836d.h0(f7915a);
            if (jH0 == -1) {
                return null;
            }
            if (c1836d.r0(jH0) == 34) {
                c1836d2.F0(c1836d, jH0);
                c1836d.m();
                return c1836d2.Y0();
            }
            if (c1836d.d1() == jH0 + 1) {
                return null;
            }
            c1836d2.F0(c1836d, jH0);
            c1836d.m();
            c1836d2.F0(c1836d, 1L);
        }
    }

    private static final java.lang.String e(X9.C1836d c1836d) {
        long jH0 = c1836d.h0(f7916b);
        if (jH0 == -1) {
            jH0 = c1836d.d1();
        }
        if (jH0 != 0) {
            return c1836d.w(jH0);
        }
        return null;
    }

    public static final void f(H9.n nVar, H9.u uVar, H9.t tVar) {
        p247y7.AbstractC7350t.f(nVar, "<this>");
        p247y7.AbstractC7350t.f(uVar, "url");
        p247y7.AbstractC7350t.f(tVar, "headers");
        if (nVar == H9.n.f4785b) {
            return;
        }
        java.util.List listE = H9.m.f4770j.e(uVar, tVar);
        if (listE.isEmpty()) {
            return;
        }
        nVar.a(uVar, listE);
    }

    private static final boolean g(X9.C1836d c1836d) throws java.io.EOFException {
        boolean z6 = false;
        while (!c1836d.j()) {
            byte bR0 = c1836d.r0(0L);
            if (bR0 == 44) {
                c1836d.m();
                z6 = true;
            } else {
                if (bR0 != 32 && bR0 != 9) {
                    break;
                }
                c1836d.m();
            }
        }
        return z6;
    }

    private static final boolean h(X9.C1836d c1836d, byte b6) {
        return !c1836d.j() && c1836d.r0(0L) == b6;
    }
}
