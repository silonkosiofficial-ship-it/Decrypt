package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements p248y8.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y8.b.a f57309d = new y8.b.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f57310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p248y8.h[] f57311c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p248y8.h a(java.lang.String str, java.lang.Iterable iterable) {
            p247y7.AbstractC7350t.f(str, "debugName");
            p247y7.AbstractC7350t.f(iterable, "scopes");
            P8.f fVar = new P8.f();
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                p248y8.h hVar = (p248y8.h) it.next();
                if (hVar != y8.h.b.f57356b) {
                    if (hVar instanceof p248y8.b) {
                        p097j7.AbstractC6879v.D(fVar, ((p248y8.b) hVar).f57311c);
                    } else {
                        fVar.add(hVar);
                    }
                }
            }
            return b(str, fVar);
        }

        public final p248y8.h b(java.lang.String str, java.util.List list) {
            p247y7.AbstractC7350t.f(str, "debugName");
            p247y7.AbstractC7350t.f(list, "scopes");
            int size = list.size();
            if (size != 0) {
                return size != 1 ? new p248y8.b(str, (p248y8.h[]) list.toArray(new p248y8.h[0]), null) : (p248y8.h) list.get(0);
            }
            return y8.h.b.f57356b;
        }
    }

    private b(java.lang.String str, p248y8.h[] hVarArr) {
        this.f57310b = str;
        this.f57311c = hVarArr;
    }

    public /* synthetic */ b(java.lang.String str, p248y8.h[] hVarArr, p247y7.AbstractC7342k abstractC7342k) {
        this(str, hVarArr);
    }

    @Override // p248y8.h
    public java.util.Set a() {
        p248y8.h[] hVarArr = this.f57311c;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (p248y8.h hVar : hVarArr) {
            p097j7.AbstractC6879v.C(linkedHashSet, hVar.a());
        }
        return linkedHashSet;
    }

    @Override // p248y8.h
    public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
        java.util.Collection collectionM;
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        p248y8.h[] hVarArr = this.f57311c;
        int length = hVarArr.length;
        if (length != 0) {
            if (length == 1) {
                return hVarArr[0].b(fVar, bVar);
            }
            java.util.Collection collectionA = null;
            for (p248y8.h hVar : hVarArr) {
                collectionA = O8.a.a(collectionA, hVar.b(fVar, bVar));
            }
            if (collectionA != null) {
                return collectionA;
            }
            collectionM = p097j7.Z.d();
        } else {
            collectionM = p097j7.AbstractC6879v.m();
        }
        return collectionM;
    }

    @Override // p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        java.util.Collection collectionM;
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        p248y8.h[] hVarArr = this.f57311c;
        int length = hVarArr.length;
        if (length != 0) {
            if (length == 1) {
                return hVarArr[0].c(fVar, bVar);
            }
            java.util.Collection collectionA = null;
            for (p248y8.h hVar : hVarArr) {
                collectionA = O8.a.a(collectionA, hVar.c(fVar, bVar));
            }
            if (collectionA != null) {
                return collectionA;
            }
            collectionM = p097j7.Z.d();
        } else {
            collectionM = p097j7.AbstractC6879v.m();
        }
        return collectionM;
    }

    @Override // p248y8.h
    public java.util.Set d() {
        p248y8.h[] hVarArr = this.f57311c;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (p248y8.h hVar : hVarArr) {
            p097j7.AbstractC6879v.C(linkedHashSet, hVar.d());
        }
        return linkedHashSet;
    }

    @Override // p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        java.util.Collection collectionM;
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        p248y8.h[] hVarArr = this.f57311c;
        int length = hVarArr.length;
        if (length != 0) {
            if (length == 1) {
                return hVarArr[0].e(dVar, lVar);
            }
            java.util.Collection collectionA = null;
            for (p248y8.h hVar : hVarArr) {
                collectionA = O8.a.a(collectionA, hVar.e(dVar, lVar));
            }
            if (collectionA != null) {
                return collectionA;
            }
            collectionM = p097j7.Z.d();
        } else {
            collectionM = p097j7.AbstractC6879v.m();
        }
        return collectionM;
    }

    @Override // p248y8.h
    public java.util.Set f() {
        return p248y8.j.a(p097j7.AbstractC6872n.N(this.f57311c));
    }

    @Override // p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        O7.InterfaceC1427h interfaceC1427h = null;
        for (p248y8.h hVar : this.f57311c) {
            O7.InterfaceC1427h interfaceC1427hG = hVar.g(fVar, bVar);
            if (interfaceC1427hG != null) {
                if (!(interfaceC1427hG instanceof O7.InterfaceC1428i) || !((O7.InterfaceC1428i) interfaceC1427hG).R()) {
                    return interfaceC1427hG;
                }
                if (interfaceC1427h == null) {
                    interfaceC1427h = interfaceC1427hG;
                }
            }
        }
        return interfaceC1427h;
    }

    public java.lang.String toString() {
        return this.f57310b;
    }
}
