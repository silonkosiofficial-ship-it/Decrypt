package I7;

/* JADX INFO: loaded from: classes2.dex */
public class G extends p247y7.Q {
    private static I7.AbstractC1278n o(p247y7.AbstractC7337f abstractC7337f) {
        F7.e eVarK = abstractC7337f.k();
        return eVarK instanceof I7.AbstractC1278n ? (I7.AbstractC1278n) eVarK : I7.C1270f.f5355F;
    }

    @Override // p247y7.Q
    public F7.f a(p247y7.AbstractC7347p abstractC7347p) {
        return new I7.o(o(abstractC7347p), abstractC7347p.getName(), abstractC7347p.n(), abstractC7347p.f());
    }

    @Override // p247y7.Q
    public F7.c b(java.lang.Class cls) {
        return I7.AbstractC1267c.c(cls);
    }

    @Override // p247y7.Q
    public F7.e c(java.lang.Class cls, java.lang.String str) {
        return I7.AbstractC1267c.d(cls);
    }

    @Override // p247y7.Q
    public F7.o d(F7.o oVar) {
        return I7.K.a(oVar);
    }

    @Override // p247y7.Q
    public F7.h e(p247y7.AbstractC7354x abstractC7354x) {
        return new I7.p(o(abstractC7354x), abstractC7354x.getName(), abstractC7354x.n(), abstractC7354x.f());
    }

    @Override // p247y7.Q
    public F7.i f(p247y7.AbstractC7356z abstractC7356z) {
        return new I7.q(o(abstractC7356z), abstractC7356z.getName(), abstractC7356z.n(), abstractC7356z.f());
    }

    @Override // p247y7.Q
    public F7.l g(p247y7.D d6) {
        return new I7.v(o(d6), d6.getName(), d6.n(), d6.f());
    }

    @Override // p247y7.Q
    public F7.m h(p247y7.F f6) {
        return new I7.w(o(f6), f6.getName(), f6.n(), f6.f());
    }

    @Override // p247y7.Q
    public F7.n i(p247y7.H h6) {
        return new I7.x(o(h6), h6.getName(), h6.n());
    }

    @Override // p247y7.Q
    public java.lang.String j(p247y7.InterfaceC7346o interfaceC7346o) {
        I7.o oVarC;
        F7.f fVarA = H7.d.a(interfaceC7346o);
        return (fVarA == null || (oVarC = I7.M.c(fVarA)) == null) ? super.j(interfaceC7346o) : I7.H.f5329a.e(oVarC.F());
    }

    @Override // p247y7.Q
    public java.lang.String k(p247y7.AbstractC7352v abstractC7352v) {
        return j(abstractC7352v);
    }

    @Override // p247y7.Q
    public void l(F7.p pVar, java.util.List list) {
    }

    @Override // p247y7.Q
    public F7.o m(F7.d dVar, java.util.List list, boolean z6) {
        return dVar instanceof p247y7.InterfaceC7339h ? I7.AbstractC1267c.a(((p247y7.InterfaceC7339h) dVar).e(), list, z6) : G7.c.b(dVar, list, z6, java.util.Collections.emptyList());
    }

    @Override // p247y7.Q
    public F7.p n(java.lang.Object obj, java.lang.String str, F7.r rVar, boolean z6) {
        java.util.List<F7.p> listG;
        if (obj instanceof F7.c) {
            listG = ((F7.c) obj).g();
        } else {
            if (!(obj instanceof F7.b)) {
                throw new java.lang.IllegalArgumentException("Type parameter container must be a class or a callable: " + obj);
            }
            listG = ((F7.b) obj).g();
        }
        for (F7.p pVar : listG) {
            if (pVar.getName().equals(str)) {
                return pVar;
            }
        }
        throw new java.lang.IllegalArgumentException("Type parameter " + str + " is not found in container: " + obj);
    }
}
