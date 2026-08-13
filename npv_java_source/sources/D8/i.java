package D8;

/* JADX INFO: loaded from: classes2.dex */
public class i extends D8.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final O7.K f2057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f2058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p138n8.c f2059i;

    public i(O7.K k6, p088i8.l lVar, p108k8.c cVar, p108k8.a aVar, D8.f fVar, B8.k kVar, java.lang.String str, p237x7.a aVar2) {
        p247y7.AbstractC7350t.f(k6, "packageDescriptor");
        p247y7.AbstractC7350t.f(lVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(aVar, "metadataVersion");
        p247y7.AbstractC7350t.f(kVar, "components");
        p247y7.AbstractC7350t.f(str, "debugName");
        p247y7.AbstractC7350t.f(aVar2, "classNames");
        p088i8.t tVarV = lVar.V();
        p247y7.AbstractC7350t.e(tVarV, "getTypeTable(...)");
        p108k8.g gVar = new p108k8.g(tVarV);
        k8.h.a aVar3 = p108k8.h.f49817b;
        p088i8.w wVarW = lVar.W();
        p247y7.AbstractC7350t.e(wVarW, "getVersionRequirementTable(...)");
        B8.m mVarA = kVar.a(k6, cVar, gVar, aVar3.a(wVarW), aVar, fVar);
        java.util.List listO = lVar.O();
        p247y7.AbstractC7350t.e(listO, "getFunctionList(...)");
        java.util.List listR = lVar.R();
        p247y7.AbstractC7350t.e(listR, "getPropertyList(...)");
        java.util.List listU = lVar.U();
        p247y7.AbstractC7350t.e(listU, "getTypeAliasList(...)");
        super(mVarA, listO, listR, listU, aVar2);
        this.f2057g = k6;
        this.f2058h = str;
        this.f2059i = k6.e();
    }

    @Override // D8.h, p248y8.i, p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        z(fVar, bVar);
        return super.g(fVar, bVar);
    }

    @Override // D8.h
    protected void i(java.util.Collection collection, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(collection, "result");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
    }

    @Override // D8.h
    protected p138n8.b m(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        return new p138n8.b(this.f2059i, fVar);
    }

    @Override // D8.h
    protected java.util.Set s() {
        return p097j7.Z.d();
    }

    @Override // D8.h
    protected java.util.Set t() {
        return p097j7.Z.d();
    }

    public java.lang.String toString() {
        return this.f2058h;
    }

    @Override // D8.h
    protected java.util.Set u() {
        return p097j7.Z.d();
    }

    @Override // D8.h
    protected boolean w(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        if (!super.w(fVar)) {
            java.lang.Iterable iterableL = p().c().l();
            if (!(iterableL instanceof java.util.Collection) || !((java.util.Collection) iterableL).isEmpty()) {
                java.util.Iterator it = iterableL.iterator();
                while (it.hasNext()) {
                    if (((Q7.b) it.next()).b(this.f2059i, fVar)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p248y8.i, p248y8.k
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public java.util.List e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        java.util.Collection collectionJ = j(dVar, lVar, W7.d.WHEN_GET_ALL_DESCRIPTORS);
        java.lang.Iterable iterableL = p().c().l();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(arrayList, ((Q7.b) it.next()).a(this.f2059i));
        }
        return p097j7.AbstractC6879v.C0(collectionJ, arrayList);
    }

    public void z(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        V7.a.b(p().c().p(), bVar, this.f2057g, fVar);
    }
}
