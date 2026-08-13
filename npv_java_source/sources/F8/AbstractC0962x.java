package F8;

/* JADX INFO: renamed from: F8.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0962x {
    public static final J8.i a(F8.o0 o0Var, J8.i iVar) {
        p247y7.AbstractC7350t.f(o0Var, "<this>");
        p247y7.AbstractC7350t.f(iVar, "inlineClassType");
        return b(o0Var, iVar, new java.util.HashSet());
    }

    private static final J8.i b(F8.o0 o0Var, J8.i iVar, java.util.HashSet hashSet) {
        J8.i iVarB;
        J8.i iVarB0;
        J8.m mVarU0 = o0Var.u0(iVar);
        if (!hashSet.add(mVarU0)) {
            return null;
        }
        J8.n nVarI0 = o0Var.i0(mVarU0);
        if (nVarI0 != null) {
            J8.i iVarQ = o0Var.q(nVarI0);
            iVarB = b(o0Var, iVarQ, hashSet);
            if (iVarB == null) {
                return null;
            }
            boolean z6 = o0Var.r0(o0Var.u0(iVarQ)) || ((iVarQ instanceof J8.j) && o0Var.W((J8.j) iVarQ));
            if ((iVarB instanceof J8.j) && o0Var.W((J8.j) iVarB) && o0Var.p(iVar) && z6) {
                iVarB0 = o0Var.b0(iVarQ);
            } else if (!o0Var.p(iVarB) && o0Var.e0(iVar)) {
                iVarB0 = o0Var.b0(iVarB);
            }
            return iVarB0;
        }
        if (!o0Var.r0(mVarU0)) {
            return iVar;
        }
        J8.i iVarW0 = o0Var.w0(iVar);
        if (iVarW0 == null || (iVarB = b(o0Var, iVarW0, hashSet)) == null) {
            return null;
        }
        if (o0Var.p(iVar)) {
            if (o0Var.p(iVarB)) {
                return iVar;
            }
            return ((iVarB instanceof J8.j) && o0Var.W((J8.j) iVarB)) ? iVar : o0Var.b0(iVarB);
        }
        return iVarB;
    }
}
