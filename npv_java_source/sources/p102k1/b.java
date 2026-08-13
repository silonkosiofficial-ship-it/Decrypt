package p102k1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p092j1.e {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final float f49361s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p092j1.g gVar) {
        super(gVar, j1.g.e.ALIGN_VERTICALLY);
        p247y7.AbstractC7350t.f(gVar, "state");
        this.f49361s0 = 0.5f;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0008 A[SYNTHETIC] */
    @Override // p092j1.e, p092j1.a, p092j1.f
    public void apply() {
        java.lang.Object objA0;
        java.lang.Object objC;
        float f6;
        java.util.Iterator it = X0().iterator();
        while (it.hasNext()) {
            p092j1.a aVarD = W0().d(it.next());
            p247y7.AbstractC7350t.c(aVarD);
            aVarD.u();
            if (a0() != null) {
                objA0 = a0();
                p247y7.AbstractC7350t.c(objA0);
            } else {
                if (Z() != null) {
                    java.lang.Object objZ = Z();
                    p247y7.AbstractC7350t.c(objZ);
                    aVarD.M0(objZ);
                } else {
                    objA0 = 0;
                }
                if (D() != null) {
                    java.lang.Object objD = D();
                    p247y7.AbstractC7350t.c(objD);
                    aVarD.p(objD);
                } else {
                    if (C() != null) {
                        objC = C();
                        p247y7.AbstractC7350t.c(objC);
                    } else {
                        objC = 0;
                    }
                    aVarD.o(objC);
                }
                f6 = this.f49361s0;
                if (f6 == 0.5f) {
                    aVarD.R0(f6);
                }
            }
            aVarD.N0(objA0);
            if (D() != null) {
                java.lang.Object objD2 = D();
                p247y7.AbstractC7350t.c(objD2);
                aVarD.p(objD2);
            } else {
                if (C() != null) {
                    objC = C();
                    p247y7.AbstractC7350t.c(objC);
                } else {
                    objC = 0;
                }
                aVarD.o(objC);
            }
            f6 = this.f49361s0;
            if (f6 == 0.5f) {
                aVarD.R0(f6);
            }
        }
    }
}
