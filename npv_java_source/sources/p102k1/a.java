package p102k1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p092j1.e {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final float f49360s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p092j1.g gVar) {
        super(gVar, j1.g.e.ALIGN_VERTICALLY);
        p247y7.AbstractC7350t.f(gVar, "state");
        this.f49360s0 = 0.5f;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0008 A[SYNTHETIC] */
    @Override // p092j1.e, p092j1.a, p092j1.f
    public void apply() {
        java.lang.Object objY;
        java.lang.Object objE;
        float f6;
        java.util.Iterator it = X0().iterator();
        while (it.hasNext()) {
            p092j1.a aVarD = W0().d(it.next());
            p247y7.AbstractC7350t.c(aVarD);
            aVarD.t();
            if (Y() != null) {
                objY = Y();
                p247y7.AbstractC7350t.c(objY);
            } else {
                if (X() != null) {
                    java.lang.Object objX = X();
                    p247y7.AbstractC7350t.c(objX);
                    aVarD.I0(objX);
                } else {
                    objY = 0;
                }
                if (F() != null) {
                    java.lang.Object objF = F();
                    p247y7.AbstractC7350t.c(objF);
                    aVarD.z(objF);
                } else {
                    if (E() != null) {
                        objE = E();
                        p247y7.AbstractC7350t.c(objE);
                    } else {
                        objE = 0;
                    }
                    aVarD.y(objE);
                }
                f6 = this.f49360s0;
                if (f6 == 0.5f) {
                    aVarD.e0(f6);
                }
            }
            aVarD.J0(objY);
            if (F() != null) {
                java.lang.Object objF2 = F();
                p247y7.AbstractC7350t.c(objF2);
                aVarD.z(objF2);
            } else {
                if (E() != null) {
                    objE = E();
                    p247y7.AbstractC7350t.c(objE);
                } else {
                    objE = 0;
                }
                aVarD.y(objE);
            }
            f6 = this.f49360s0;
            if (f6 == 0.5f) {
                aVarD.e0(f6);
            }
        }
    }
}
