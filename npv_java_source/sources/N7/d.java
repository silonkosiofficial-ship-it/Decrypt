package N7;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N7.d f7840a = new N7.d();

    private d() {
    }

    public static /* synthetic */ O7.InterfaceC1424e f(N7.d dVar, p138n8.c cVar, L7.g gVar, java.lang.Integer num, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, gVar, num);
    }

    public final O7.InterfaceC1424e a(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "mutable");
        p138n8.c cVarO = N7.c.f7820a.o(p178r8.f.m(interfaceC1424e));
        if (cVarO != null) {
            O7.InterfaceC1424e interfaceC1424eO = p218v8.c.j(interfaceC1424e).o(cVarO);
            p247y7.AbstractC7350t.e(interfaceC1424eO, "getBuiltInClassByFqName(...)");
            return interfaceC1424eO;
        }
        throw new java.lang.IllegalArgumentException("Given class " + interfaceC1424e + " is not a mutable collection");
    }

    public final O7.InterfaceC1424e b(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "readOnly");
        p138n8.c cVarP = N7.c.f7820a.p(p178r8.f.m(interfaceC1424e));
        if (cVarP != null) {
            O7.InterfaceC1424e interfaceC1424eO = p218v8.c.j(interfaceC1424e).o(cVarP);
            p247y7.AbstractC7350t.e(interfaceC1424eO, "getBuiltInClassByFqName(...)");
            return interfaceC1424eO;
        }
        throw new java.lang.IllegalArgumentException("Given class " + interfaceC1424e + " is not a read-only collection");
    }

    public final boolean c(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "mutable");
        return N7.c.f7820a.k(p178r8.f.m(interfaceC1424e));
    }

    public final boolean d(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "readOnly");
        return N7.c.f7820a.l(p178r8.f.m(interfaceC1424e));
    }

    public final O7.InterfaceC1424e e(p138n8.c cVar, L7.g gVar, java.lang.Integer num) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(gVar, "builtIns");
        p138n8.b bVarM = (num == null || !p247y7.AbstractC7350t.b(cVar, N7.c.f7820a.h())) ? N7.c.f7820a.m(cVar) : L7.j.a(num.intValue());
        if (bVarM != null) {
            return gVar.o(bVarM.b());
        }
        return null;
    }

    public final java.util.Collection g(p138n8.c cVar, L7.g gVar) {
        java.util.Collection collectionP;
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(gVar, "builtIns");
        O7.InterfaceC1424e interfaceC1424eF = f(this, cVar, gVar, null, 4, null);
        if (interfaceC1424eF == null) {
            collectionP = p097j7.Z.d();
        } else {
            p138n8.c cVarP = N7.c.f7820a.p(p218v8.c.m(interfaceC1424eF));
            if (cVarP == null) {
                collectionP = p097j7.Z.c(interfaceC1424eF);
            } else {
                O7.InterfaceC1424e interfaceC1424eO = gVar.o(cVarP);
                p247y7.AbstractC7350t.e(interfaceC1424eO, "getBuiltInClassByFqName(...)");
                collectionP = p097j7.AbstractC6879v.p(interfaceC1424eF, interfaceC1424eO);
            }
        }
        return collectionP;
    }
}
