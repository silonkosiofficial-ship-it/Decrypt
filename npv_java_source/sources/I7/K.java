package I7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K {
    public static final F7.o a(F7.o oVar) {
        p247y7.AbstractC7350t.f(oVar, "type");
        F8.E eF = ((I7.A) oVar).f();
        if (!(eF instanceof F8.M)) {
            throw new java.lang.IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + oVar).toString());
        }
        O7.InterfaceC1427h interfaceC1427hW = eF.W0().w();
        O7.InterfaceC1424e interfaceC1424e = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
        if (interfaceC1424e != null) {
            F8.M m6 = (F8.M) eF;
            F8.e0 e0VarP = b(interfaceC1424e).p();
            p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
            return new I7.A(F8.F.k(m6, null, e0VarP, null, false, 26, null), null, 2, null);
        }
        throw new java.lang.IllegalArgumentException("Non-class type cannot be a mutable collection type: " + oVar);
    }

    private static final O7.InterfaceC1424e b(O7.InterfaceC1424e interfaceC1424e) {
        p138n8.c cVarP = N7.c.f7820a.p(p218v8.c.m(interfaceC1424e));
        if (cVarP != null) {
            O7.InterfaceC1424e interfaceC1424eO = p218v8.c.j(interfaceC1424e).o(cVarP);
            p247y7.AbstractC7350t.e(interfaceC1424eO, "getBuiltInClassByFqName(...)");
            return interfaceC1424eO;
        }
        throw new java.lang.IllegalArgumentException("Not a readonly collection: " + interfaceC1424e);
    }
}
