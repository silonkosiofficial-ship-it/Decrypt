package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H {
    private static final p127m7.i d(p127m7.i iVar, p127m7.i iVar2, final boolean z6) {
        boolean zH = h(iVar);
        boolean zH2 = h(iVar2);
        if (!zH && !zH2) {
            return iVar.o0(iVar2);
        }
        final p247y7.O o6 = new p247y7.O();
        o6.f57254C = iVar2;
        p127m7.j jVar = p127m7.j.f51198C;
        p127m7.i iVar3 = (p127m7.i) iVar.D(jVar, new p237x7.p() { // from class: W8.F
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return W8.H.e(o6, z6, (p127m7.i) obj, (m7.i.b) obj2);
            }
        });
        if (zH2) {
            o6.f57254C = ((p127m7.i) o6.f57254C).D(jVar, new p237x7.p() { // from class: W8.G
                @Override // p237x7.p
                public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                    return W8.H.f((p127m7.i) obj, (m7.i.b) obj2);
                }
            });
        }
        return iVar3.o0((p127m7.i) o6.f57254C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p127m7.i e(p247y7.O o6, boolean z6, p127m7.i iVar, m7.i.b bVar) {
        return iVar.o0(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p127m7.i f(p127m7.i iVar, m7.i.b bVar) {
        return iVar.o0(bVar);
    }

    public static final java.lang.String g(p127m7.i iVar) {
        return null;
    }

    private static final boolean h(p127m7.i iVar) {
        return ((java.lang.Boolean) iVar.D(java.lang.Boolean.FALSE, new p237x7.p() { // from class: W8.E
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(W8.H.i(((java.lang.Boolean) obj).booleanValue(), (m7.i.b) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z6, m7.i.b bVar) {
        return z6;
    }

    public static final p127m7.i j(W8.N n6, p127m7.i iVar) {
        p127m7.i iVarD = d(n6.getCoroutineContext(), iVar, true);
        return (iVarD == W8.C1779d0.a() || iVarD.i(p127m7.f.f51196A) != null) ? iVarD : iVarD.o0(W8.C1779d0.a());
    }

    public static final p127m7.i k(p127m7.i iVar, p127m7.i iVar2) {
        return !h(iVar2) ? iVar.o0(iVar2) : d(iVar, iVar2, false);
    }

    public static final W8.c1 l(p147o7.e eVar) {
        while (!(eVar instanceof W8.Z) && (eVar = eVar.e()) != null) {
            if (eVar instanceof W8.c1) {
                return (W8.c1) eVar;
            }
        }
        return null;
    }

    public static final W8.c1 m(p127m7.e eVar, p127m7.i iVar, java.lang.Object obj) {
        if (!(eVar instanceof p147o7.e) || iVar.i(W8.d1.f15495C) == null) {
            return null;
        }
        W8.c1 c1VarL = l((p147o7.e) eVar);
        if (c1VarL != null) {
            c1VarL.n1(iVar, obj);
        }
        return c1VarL;
    }
}
