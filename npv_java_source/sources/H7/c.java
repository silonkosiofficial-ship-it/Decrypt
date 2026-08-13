package H7;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final java.lang.reflect.Constructor a(F7.f fVar) {
        J7.e eVarS;
        p247y7.AbstractC7350t.f(fVar, "<this>");
        I7.AbstractC1274j abstractC1274jB = I7.M.b(fVar);
        java.lang.reflect.Member memberN = (abstractC1274jB == null || (eVarS = abstractC1274jB.s()) == null) ? null : eVarS.n();
        if (memberN instanceof java.lang.reflect.Constructor) {
            return (java.lang.reflect.Constructor) memberN;
        }
        return null;
    }

    public static final java.lang.reflect.Field b(F7.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "<this>");
        I7.y yVarD = I7.M.d(kVar);
        if (yVarD != null) {
            return yVarD.K();
        }
        return null;
    }

    public static final java.lang.reflect.Method c(F7.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "<this>");
        return d(kVar.d());
    }

    public static final java.lang.reflect.Method d(F7.f fVar) {
        J7.e eVarS;
        p247y7.AbstractC7350t.f(fVar, "<this>");
        I7.AbstractC1274j abstractC1274jB = I7.M.b(fVar);
        java.lang.reflect.Member memberN = (abstractC1274jB == null || (eVarS = abstractC1274jB.s()) == null) ? null : eVarS.n();
        if (memberN instanceof java.lang.reflect.Method) {
            return (java.lang.reflect.Method) memberN;
        }
        return null;
    }

    public static final java.lang.reflect.Method e(F7.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        return d(gVar.i());
    }

    public static final java.lang.reflect.Type f(F7.o oVar) {
        p247y7.AbstractC7350t.f(oVar, "<this>");
        java.lang.reflect.Type typeC = ((I7.A) oVar).c();
        return typeC == null ? F7.u.f(oVar) : typeC;
    }
}
