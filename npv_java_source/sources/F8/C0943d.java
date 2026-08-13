package F8;

/* JADX INFO: renamed from: F8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0943d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F8.C0943d f2875a = new F8.C0943d();

    private C0943d() {
    }

    private final boolean a(J8.o oVar, J8.j jVar, J8.j jVar2) {
        if (oVar.h(jVar) == oVar.h(jVar2) && oVar.C0(jVar) == oVar.C0(jVar2)) {
            if ((oVar.t(jVar) == null) == (oVar.t(jVar2) == null) && oVar.h0(oVar.e(jVar), oVar.e(jVar2))) {
                if (oVar.U(jVar, jVar2)) {
                    return true;
                }
                int iH = oVar.h(jVar);
                for (int i6 = 0; i6 < iH; i6++) {
                    J8.l lVarC0 = oVar.c0(jVar, i6);
                    J8.l lVarC1 = oVar.c0(jVar2, i6);
                    if (oVar.E0(lVarC0) != oVar.E0(lVarC1)) {
                        return false;
                    }
                    if (!oVar.E0(lVarC0) && (oVar.u(lVarC0) != oVar.u(lVarC1) || !c(oVar, oVar.n0(lVarC0), oVar.n0(lVarC1)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(J8.o oVar, J8.i iVar, J8.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        J8.j jVarB = oVar.b(iVar);
        J8.j jVarB2 = oVar.b(iVar2);
        if (jVarB != null && jVarB2 != null) {
            return a(oVar, jVarB, jVarB2);
        }
        J8.g gVarT0 = oVar.t0(iVar);
        J8.g gVarT1 = oVar.t0(iVar2);
        if (gVarT0 == null || gVarT1 == null) {
            return false;
        }
        return a(oVar, oVar.c(gVarT0), oVar.c(gVarT1)) && a(oVar, oVar.a(gVarT0), oVar.a(gVarT1));
    }

    public final boolean b(J8.o oVar, J8.i iVar, J8.i iVar2) {
        p247y7.AbstractC7350t.f(oVar, "context");
        p247y7.AbstractC7350t.f(iVar, "a");
        p247y7.AbstractC7350t.f(iVar2, "b");
        return c(oVar, iVar, iVar2);
    }
}
