package H7;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final F7.c a(F7.d dVar) {
        java.lang.Object obj;
        F7.c cVarB;
        p247y7.AbstractC7350t.f(dVar, "<this>");
        if (dVar instanceof F7.c) {
            return (F7.c) dVar;
        }
        if (!(dVar instanceof F7.p)) {
            throw new I7.D("Cannot calculate JVM erasure for type: " + dVar);
        }
        java.util.List upperBounds = ((F7.p) dVar).getUpperBounds();
        java.util.Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            F7.o oVar = (F7.o) next;
            p247y7.AbstractC7350t.d(oVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            O7.InterfaceC1427h interfaceC1427hW = ((I7.A) oVar).f().W0().w();
            O7.InterfaceC1424e interfaceC1424e = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
            if (interfaceC1424e != null && interfaceC1424e.j() != O7.EnumC1425f.INTERFACE && interfaceC1424e.j() != O7.EnumC1425f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        F7.o oVar2 = (F7.o) obj;
        if (oVar2 == null) {
            oVar2 = (F7.o) p097j7.AbstractC6879v.k0(upperBounds);
        }
        return (oVar2 == null || (cVarB = b(oVar2)) == null) ? p247y7.P.b(java.lang.Object.class) : cVarB;
    }

    public static final F7.c b(F7.o oVar) {
        F7.c cVarA;
        p247y7.AbstractC7350t.f(oVar, "<this>");
        F7.d dVarB = oVar.b();
        if (dVarB != null && (cVarA = a(dVarB)) != null) {
            return cVarA;
        }
        throw new I7.D("Cannot calculate JVM erasure for type: " + oVar);
    }
}
