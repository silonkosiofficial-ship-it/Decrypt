package N;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p131n0.i f7518a = new p131n0.i(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(p131n0.i iVar, long j6) {
        float fI = iVar.i();
        float fJ = iVar.j();
        float fM = p131n0.g.m(j6);
        if (fI <= fM && fM <= fJ) {
            float fL = iVar.l();
            float fE = iVar.e();
            float fN = p131n0.g.n(j6);
            if (fL <= fN && fN <= fE) {
                return true;
            }
        }
        return false;
    }

    public static final p131n0.i b(D0.InterfaceC0900t interfaceC0900t) {
        p131n0.i iVarC = D0.AbstractC0901u.c(interfaceC0900t);
        return p131n0.j.a(interfaceC0900t.W(iVarC.m()), interfaceC0900t.W(iVarC.f()));
    }
}
