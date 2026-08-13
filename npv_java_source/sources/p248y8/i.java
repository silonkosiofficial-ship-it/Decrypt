package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i implements p248y8.h {
    @Override // p248y8.h
    public java.util.Set a() {
        java.util.Collection collectionE = e(p248y8.d.f57334v, P8.e.a());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : collectionE) {
            if (obj instanceof O7.Z) {
                p138n8.f name = ((O7.Z) obj).getName();
                p247y7.AbstractC7350t.e(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p248y8.h
    public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return p097j7.AbstractC6879v.m();
    }

    @Override // p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return p097j7.AbstractC6879v.m();
    }

    @Override // p248y8.h
    public java.util.Set d() {
        java.util.Collection collectionE = e(p248y8.d.f57335w, P8.e.a());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : collectionE) {
            if (obj instanceof O7.Z) {
                p138n8.f name = ((O7.Z) obj).getName();
                p247y7.AbstractC7350t.e(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return p097j7.AbstractC6879v.m();
    }

    @Override // p248y8.h
    public java.util.Set f() {
        return null;
    }

    @Override // p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return null;
    }
}
