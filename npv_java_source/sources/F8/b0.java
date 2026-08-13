package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 {
    public static final F8.a0 a(F8.a0 a0Var, P7.g gVar) {
        F8.a0 a0VarM;
        p247y7.AbstractC7350t.f(a0Var, "<this>");
        p247y7.AbstractC7350t.f(gVar, "newAnnotations");
        if (F8.AbstractC0949j.a(a0Var) == gVar) {
            return a0Var;
        }
        F8.C0948i c0948iB = F8.AbstractC0949j.b(a0Var);
        if (c0948iB != null && (a0VarM = a0Var.M(c0948iB)) != null) {
            a0Var = a0VarM;
        }
        return (gVar.iterator().hasNext() || !gVar.isEmpty()) ? a0Var.E(new F8.C0948i(gVar)) : a0Var;
    }

    public static final F8.a0 b(P7.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        return F8.Z.a.a(F8.C0953n.f2950a, gVar, null, null, 6, null);
    }
}
