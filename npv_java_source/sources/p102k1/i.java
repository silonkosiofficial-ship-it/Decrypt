package p102k1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p102k1.d {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49422a;

        static {
            int[] iArr = new int[j1.g.a.values().length];
            try {
                iArr[j1.g.a.SPREAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[j1.g.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.g.a.PACKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f49422a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p092j1.g gVar) {
        super(gVar, j1.g.e.HORIZONTAL_CHAIN);
        p247y7.AbstractC7350t.f(gVar, "state");
    }

    @Override // p092j1.e, p092j1.a, p092j1.f
    public void apply() {
        p092j1.a aVarY;
        p092j1.a aVarI0;
        int iQ;
        p092j1.a aVarY2;
        p092j1.a aVarI1;
        p092j1.a aVarI2;
        int iO;
        p092j1.a aVarI3;
        java.util.Iterator it = X0().iterator();
        while (it.hasNext()) {
            p092j1.a aVarD = W0().d(it.next());
            p247y7.AbstractC7350t.c(aVarD);
            aVarD.t();
        }
        p092j1.a aVar = null;
        p092j1.a aVar2 = null;
        for (java.lang.Object obj : X0()) {
            p092j1.a aVarD2 = W0().d(obj);
            if (aVar2 == null) {
                if (Y() != null) {
                    p247y7.AbstractC7350t.c(aVarD2);
                    java.lang.Object objY = Y();
                    p247y7.AbstractC7350t.c(objY);
                    aVarI3 = aVarD2.J0(objY);
                } else {
                    if (X() != null) {
                        p247y7.AbstractC7350t.c(aVarD2);
                        java.lang.Object objX = X();
                        p247y7.AbstractC7350t.c(objX);
                        aVarI3 = aVarD2.I0(objX);
                    } else {
                        if (H() != null) {
                            p247y7.AbstractC7350t.c(aVarD2);
                            java.lang.Object objH = H();
                            p247y7.AbstractC7350t.c(objH);
                            aVarI1 = aVarD2.J0(objH);
                        } else {
                            java.lang.Object objI = I();
                            p247y7.AbstractC7350t.c(aVarD2);
                            if (objI != null) {
                                java.lang.Object objI2 = I();
                                p247y7.AbstractC7350t.c(objI2);
                                aVarI1 = aVarD2.I0(objI2);
                            } else {
                                java.lang.String strValueOf = java.lang.String.valueOf(aVarD2.getKey());
                                p247y7.AbstractC7350t.c(aVarD2);
                                aVarD2.J0(0).j0(java.lang.Float.valueOf(g1(strValueOf))).l0(java.lang.Float.valueOf(f1(strValueOf)));
                            }
                        }
                        aVarI2 = aVarI1.i0(N());
                        iO = O();
                        aVarI2.k0(iO);
                    }
                    aVar2 = aVarD2;
                }
                aVarI2 = aVarI3.i0(R());
                iO = S();
                aVarI2.k0(iO);
                aVar2 = aVarD2;
            }
            if (aVar != null) {
                java.lang.String strValueOf2 = java.lang.String.valueOf(aVar.getKey());
                p247y7.AbstractC7350t.c(aVarD2);
                java.lang.String strValueOf3 = java.lang.String.valueOf(aVarD2.getKey());
                java.lang.Object key = aVarD2.getKey();
                p247y7.AbstractC7350t.c(key);
                aVar.z(key).j0(java.lang.Float.valueOf(e1(strValueOf2))).l0(java.lang.Float.valueOf(d1(strValueOf2)));
                java.lang.Object key2 = aVar.getKey();
                p247y7.AbstractC7350t.c(key2);
                aVarD2.I0(key2).j0(java.lang.Float.valueOf(g1(strValueOf3))).l0(java.lang.Float.valueOf(f1(strValueOf3)));
            }
            float fH1 = h1(obj.toString());
            if (fH1 != -1.0f) {
                p247y7.AbstractC7350t.c(aVarD2);
                aVarD2.z0(fH1);
            }
            aVar = aVarD2;
        }
        if (aVar != null) {
            if (F() != null) {
                java.lang.Object objF = F();
                p247y7.AbstractC7350t.c(objF);
                aVarY2 = aVar.z(objF);
            } else if (E() != null) {
                java.lang.Object objE = E();
                p247y7.AbstractC7350t.c(objE);
                aVarY2 = aVar.y(objE);
            } else {
                if (V() != null) {
                    java.lang.Object objV = V();
                    p247y7.AbstractC7350t.c(objV);
                    aVarY = aVar.z(objV);
                } else if (W() != null) {
                    java.lang.Object objW = W();
                    p247y7.AbstractC7350t.c(objW);
                    aVarY = aVar.y(objW);
                } else {
                    java.lang.String strValueOf4 = java.lang.String.valueOf(aVar.getKey());
                    aVar.y(0).j0(java.lang.Float.valueOf(e1(strValueOf4))).l0(java.lang.Float.valueOf(d1(strValueOf4)));
                }
                aVarI0 = aVarY.i0(P());
                iQ = Q();
                aVarI0.k0(iQ);
            }
            aVarI0 = aVarY2.i0(L());
            iQ = M();
            aVarI0.k0(iQ);
        }
        if (aVar2 == null) {
            return;
        }
        if (b1() != 0.5f) {
            aVar2.e0(b1());
        }
        int i6 = k1.i.a.f49422a[c1().ordinal()];
        if (i6 == 1) {
            aVar2.y0(0);
        } else if (i6 == 2) {
            aVar2.y0(1);
        } else {
            if (i6 != 3) {
                return;
            }
            aVar2.y0(2);
        }
    }
}
