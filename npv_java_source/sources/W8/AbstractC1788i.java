package W8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: W8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1788i {
    public static final W8.V a(W8.N n6, p127m7.i iVar, W8.P p6, p237x7.p pVar) {
        p127m7.i iVarJ = W8.H.j(n6, iVar);
        W8.W h6 = p6.i() ? new W8.H0(iVarJ, pVar) : new W8.W(iVarJ, true);
        h6.j1(p6, h6, pVar);
        return h6;
    }

    public static /* synthetic */ W8.V b(W8.N n6, p127m7.i iVar, W8.P p6, p237x7.p pVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            iVar = p127m7.j.f51198C;
        }
        if ((i6 & 2) != 0) {
            p6 = W8.P.DEFAULT;
        }
        return W8.AbstractC1784g.a(n6, iVar, p6, pVar);
    }

    public static final W8.InterfaceC1822z0 c(W8.N n6, p127m7.i iVar, W8.P p6, p237x7.p pVar) {
        p127m7.i iVarJ = W8.H.j(n6, iVar);
        W8.S0 i6 = p6.i() ? new W8.I0(iVarJ, pVar) : new W8.S0(iVarJ, true);
        i6.j1(p6, i6, pVar);
        return i6;
    }

    public static /* synthetic */ W8.InterfaceC1822z0 d(W8.N n6, p127m7.i iVar, W8.P p6, p237x7.p pVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            iVar = p127m7.j.f51198C;
        }
        if ((i6 & 2) != 0) {
            p6 = W8.P.DEFAULT;
        }
        return W8.AbstractC1784g.c(n6, iVar, p6, pVar);
    }

    public static final java.lang.Object e(p127m7.i iVar, p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objK1;
        p127m7.i context = eVar.getContext();
        p127m7.i iVarK = W8.H.k(context, iVar);
        W8.C0.l(iVarK);
        if (iVarK == context) {
            p019b9.z zVar = new p019b9.z(iVarK, eVar);
            objK1 = p029c9.b.b(zVar, zVar, pVar);
        } else {
            m7.f.b bVar = p127m7.f.f51196A;
            if (p247y7.AbstractC7350t.b(iVarK.i(bVar), context.i(bVar))) {
                W8.c1 c1Var = new W8.c1(iVarK, eVar);
                p127m7.i context2 = c1Var.getContext();
                java.lang.Object objI = p019b9.K.i(context2, null);
                try {
                    java.lang.Object objB = p029c9.b.b(c1Var, c1Var, pVar);
                    p019b9.K.f(context2, objI);
                    objK1 = objB;
                } catch (java.lang.Throwable th) {
                    p019b9.K.f(context2, objI);
                    throw th;
                }
            } else {
                W8.Z z6 = new W8.Z(iVarK, eVar);
                p029c9.a.d(pVar, z6, z6);
                objK1 = z6.k1();
            }
        }
        if (objK1 == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objK1;
    }
}
