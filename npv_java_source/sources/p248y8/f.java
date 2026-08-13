package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends p248y8.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p248y8.h f57349b;

    public f(p248y8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "workerScope");
        this.f57349b = hVar;
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Set a() {
        return this.f57349b.a();
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Set d() {
        return this.f57349b.d();
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Set f() {
        return this.f57349b.f();
    }

    @Override // p248y8.i, p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        O7.InterfaceC1427h interfaceC1427hG = this.f57349b.g(fVar, bVar);
        if (interfaceC1427hG == null) {
            return null;
        }
        O7.InterfaceC1424e interfaceC1424e = interfaceC1427hG instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hG : null;
        if (interfaceC1424e != null) {
            return interfaceC1424e;
        }
        if (interfaceC1427hG instanceof O7.e0) {
            return (O7.e0) interfaceC1427hG;
        }
        return null;
    }

    @Override // p248y8.i, p248y8.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public java.util.List e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        p248y8.d dVarN = dVar.n(p248y8.d.f57315c.c());
        if (dVarN == null) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.Collection collectionE = this.f57349b.e(dVarN, lVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionE) {
            if (obj instanceof O7.InterfaceC1428i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public java.lang.String toString() {
        return "Classes from " + this.f57349b;
    }
}
