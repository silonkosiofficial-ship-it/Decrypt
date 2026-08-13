package H7;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final boolean a(F7.b bVar) {
        J7.e eVarX;
        p247y7.AbstractC7350t.f(bVar, "<this>");
        if (bVar instanceof F7.g) {
            F7.k kVar = (F7.k) bVar;
            java.lang.reflect.Field fieldB = H7.c.b(kVar);
            if (!(fieldB != null ? fieldB.isAccessible() : true)) {
                return false;
            }
            java.lang.reflect.Method methodC = H7.c.c(kVar);
            if (!(methodC != null ? methodC.isAccessible() : true)) {
                return false;
            }
            java.lang.reflect.Method methodE = H7.c.e((F7.g) bVar);
            if (!(methodE != null ? methodE.isAccessible() : true)) {
                return false;
            }
        } else if (bVar instanceof F7.k) {
            F7.k kVar2 = (F7.k) bVar;
            java.lang.reflect.Field fieldB2 = H7.c.b(kVar2);
            if (!(fieldB2 != null ? fieldB2.isAccessible() : true)) {
                return false;
            }
            java.lang.reflect.Method methodC2 = H7.c.c(kVar2);
            if (!(methodC2 != null ? methodC2.isAccessible() : true)) {
                return false;
            }
        } else if (bVar instanceof F7.k.b) {
            java.lang.reflect.Field fieldB3 = H7.c.b(((F7.k.b) bVar).a());
            if (!(fieldB3 != null ? fieldB3.isAccessible() : true)) {
                return false;
            }
            java.lang.reflect.Method methodD = H7.c.d((F7.f) bVar);
            if (!(methodD != null ? methodD.isAccessible() : true)) {
                return false;
            }
        } else if (bVar instanceof F7.g.a) {
            java.lang.reflect.Field fieldB4 = H7.c.b(((F7.g.a) bVar).a());
            if (!(fieldB4 != null ? fieldB4.isAccessible() : true)) {
                return false;
            }
            java.lang.reflect.Method methodD2 = H7.c.d((F7.f) bVar);
            if (!(methodD2 != null ? methodD2.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(bVar instanceof F7.f)) {
                throw new java.lang.UnsupportedOperationException("Unknown callable: " + bVar + " (" + bVar.getClass() + ')');
            }
            F7.f fVar = (F7.f) bVar;
            java.lang.reflect.Method methodD3 = H7.c.d(fVar);
            if (!(methodD3 != null ? methodD3.isAccessible() : true)) {
                return false;
            }
            I7.AbstractC1274j abstractC1274jB = I7.M.b(bVar);
            java.lang.reflect.Member memberN = (abstractC1274jB == null || (eVarX = abstractC1274jB.x()) == null) ? null : eVarX.n();
            java.lang.reflect.AccessibleObject accessibleObject = memberN instanceof java.lang.reflect.AccessibleObject ? (java.lang.reflect.AccessibleObject) memberN : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            java.lang.reflect.Constructor constructorA = H7.c.a(fVar);
            if (!(constructorA != null ? constructorA.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
