package R7;

/* JADX INFO: loaded from: classes2.dex */
public class H extends p248y8.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.G f9552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p138n8.c f9553c;

    public H(O7.G g6, p138n8.c cVar) {
        p247y7.AbstractC7350t.f(g6, "moduleDescriptor");
        p247y7.AbstractC7350t.f(cVar, "fqName");
        this.f9552b = g6;
        this.f9553c = cVar;
    }

    @Override // p248y8.i, p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        if (!dVar.a(p248y8.d.f57315c.f()) || (this.f9553c.d() && dVar.l().contains(y8.c.b.f57314a))) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.Collection collectionX = this.f9552b.x(this.f9553c, lVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionX.size());
        java.util.Iterator it = collectionX.iterator();
        while (it.hasNext()) {
            p138n8.f fVarG = ((p138n8.c) it.next()).g();
            p247y7.AbstractC7350t.e(fVarG, "shortName(...)");
            if (((java.lang.Boolean) lVar.l(fVarG)).booleanValue()) {
                P8.a.a(arrayList, h(fVarG));
            }
        }
        return arrayList;
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Set f() {
        return p097j7.Z.d();
    }

    protected final O7.P h(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        if (fVar.q()) {
            return null;
        }
        O7.G g6 = this.f9552b;
        p138n8.c cVarC = this.f9553c.c(fVar);
        p247y7.AbstractC7350t.e(cVarC, "child(...)");
        O7.P pS0 = g6.s0(cVarC);
        if (pS0.isEmpty()) {
            return null;
        }
        return pS0;
    }

    public java.lang.String toString() {
        return "subpackages of " + this.f9553c + " from " + this.f9552b;
    }
}
