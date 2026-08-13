package p102k1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p102k1.d {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49423a;

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
            f49423a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p092j1.g gVar) {
        super(gVar, j1.g.e.VERTICAL_CHAIN);
        p247y7.AbstractC7350t.f(gVar, "state");
    }

    @Override // p092j1.e, p092j1.a, p092j1.f
    public void apply() {
        p092j1.a aVarO;
        p092j1.a aVarM0;
        java.util.Iterator it = X0().iterator();
        while (it.hasNext()) {
            p092j1.a aVarD = W0().d(it.next());
            p247y7.AbstractC7350t.c(aVarD);
            aVarD.u();
        }
        p092j1.a aVar = null;
        p092j1.a aVar2 = null;
        for (java.lang.Object obj : X0()) {
            p092j1.a aVarD2 = W0().d(obj);
            if (aVar2 == null) {
                if (a0() != null) {
                    p247y7.AbstractC7350t.c(aVarD2);
                    java.lang.Object objA0 = a0();
                    p247y7.AbstractC7350t.c(objA0);
                    aVarM0 = aVarD2.N0(objA0);
                } else {
                    java.lang.Object objZ = Z();
                    p247y7.AbstractC7350t.c(aVarD2);
                    if (objZ != null) {
                        java.lang.Object objZ2 = Z();
                        p247y7.AbstractC7350t.c(objZ2);
                        aVarM0 = aVarD2.M0(objZ2);
                    } else {
                        java.lang.String strValueOf = java.lang.String.valueOf(aVarD2.getKey());
                        p247y7.AbstractC7350t.c(aVarD2);
                        aVarD2.N0(0).j0(java.lang.Float.valueOf(g1(strValueOf))).l0(java.lang.Float.valueOf(f1(strValueOf)));
                    }
                    aVar2 = aVarD2;
                }
                aVarM0.i0(T()).k0(U());
                aVar2 = aVarD2;
            }
            if (aVar != null) {
                java.lang.String strValueOf2 = java.lang.String.valueOf(aVar.getKey());
                p247y7.AbstractC7350t.c(aVarD2);
                java.lang.String strValueOf3 = java.lang.String.valueOf(aVarD2.getKey());
                java.lang.Object key = aVarD2.getKey();
                p247y7.AbstractC7350t.c(key);
                aVar.p(key).j0(java.lang.Float.valueOf(e1(strValueOf2))).l0(java.lang.Float.valueOf(d1(strValueOf2)));
                java.lang.Object key2 = aVar.getKey();
                p247y7.AbstractC7350t.c(key2);
                aVarD2.M0(key2).j0(java.lang.Float.valueOf(g1(strValueOf3))).l0(java.lang.Float.valueOf(f1(strValueOf3)));
            }
            float fH1 = h1(obj.toString());
            if (fH1 != -1.0f) {
                p247y7.AbstractC7350t.c(aVarD2);
                aVarD2.E0(fH1);
            }
            aVar = aVarD2;
        }
        if (aVar != null) {
            if (D() != null) {
                java.lang.Object objD = D();
                p247y7.AbstractC7350t.c(objD);
                aVarO = aVar.p(objD);
            } else if (C() != null) {
                java.lang.Object objC = C();
                p247y7.AbstractC7350t.c(objC);
                aVarO = aVar.o(objC);
            } else {
                java.lang.String strValueOf4 = java.lang.String.valueOf(aVar.getKey());
                aVar.o(0).j0(java.lang.Float.valueOf(e1(strValueOf4))).l0(java.lang.Float.valueOf(d1(strValueOf4)));
            }
            aVarO.i0(J()).k0(K());
        }
        if (aVar2 == null) {
            return;
        }
        if (b1() != 0.5f) {
            aVar2.R0(b1());
        }
        int i6 = k1.j.a.f49423a[c1().ordinal()];
        if (i6 == 1) {
            aVar2.D0(0);
        } else if (i6 == 2) {
            aVar2.D0(1);
        } else {
            if (i6 != 3) {
                return;
            }
            aVar2.D0(2);
        }
    }
}
