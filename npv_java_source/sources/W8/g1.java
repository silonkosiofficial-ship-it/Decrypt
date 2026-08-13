package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g1 {
    public static final java.lang.Object a(p127m7.e eVar) {
        java.lang.Object objG;
        p127m7.i context = eVar.getContext();
        W8.C0.l(context);
        p127m7.e eVarD = p137n7.b.d(eVar);
        p019b9.C2121h c2121h = eVarD instanceof p019b9.C2121h ? (p019b9.C2121h) eVarD : null;
        if (c2121h == null) {
            objG = p087i7.M.f46721a;
        } else {
            if (c2121h.f24356F.v1(context)) {
                c2121h.m(context, p087i7.M.f46721a);
            } else {
                W8.f1 f1Var = new W8.f1();
                p127m7.i iVarO0 = context.o0(f1Var);
                p087i7.M m6 = p087i7.M.f46721a;
                c2121h.m(iVarO0, m6);
                if (f1Var.f15501D && !p019b9.AbstractC2122i.c(c2121h)) {
                    objG = m6;
                }
            }
            objG = p137n7.b.g();
        }
        if (objG == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objG == p137n7.b.g() ? objG : p087i7.M.f46721a;
    }
}
