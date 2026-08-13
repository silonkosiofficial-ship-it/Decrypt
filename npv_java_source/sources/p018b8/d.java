package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements p248y8.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f24190f = {p247y7.P.j(new p247y7.G(p247y7.P.b(p018b8.d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p008a8.g f24191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p018b8.h f24192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p018b8.i f24193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E8.i f24194e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p248y8.h[] b() {
            java.util.Collection collectionValues = p018b8.d.this.f24192c.W0().values();
            p018b8.d dVar = p018b8.d.this;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                p248y8.h hVarB = dVar.f24191b.a().b().b(dVar.f24192c, (p068g8.t) it.next());
                if (hVarB != null) {
                    arrayList.add(hVarB);
                }
            }
            return (p248y8.h[]) O8.a.b(arrayList).toArray(new p248y8.h[0]);
        }
    }

    public d(p008a8.g gVar, p048e8.u uVar, p018b8.h hVar) {
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(uVar, "jPackage");
        p247y7.AbstractC7350t.f(hVar, "packageFragment");
        this.f24191b = gVar;
        this.f24192c = hVar;
        this.f24193d = new p018b8.i(gVar, uVar, hVar);
        this.f24194e = gVar.e().d(new b8.d.a());
    }

    private final p248y8.h[] k() {
        return (p248y8.h[]) E8.m.a(this.f24194e, this, f24190f[0]);
    }

    @Override // p248y8.h
    public java.util.Set a() {
        p248y8.h[] hVarArrK = k();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (p248y8.h hVar : hVarArrK) {
            p097j7.AbstractC6879v.C(linkedHashSet, hVar.a());
        }
        linkedHashSet.addAll(this.f24193d.a());
        return linkedHashSet;
    }

    @Override // p248y8.h
    public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        l(fVar, bVar);
        p018b8.i iVar = this.f24193d;
        p248y8.h[] hVarArrK = k();
        java.util.Collection collectionB = iVar.b(fVar, bVar);
        for (p248y8.h hVar : hVarArrK) {
            collectionB = O8.a.a(collectionB, hVar.b(fVar, bVar));
        }
        return collectionB == null ? p097j7.Z.d() : collectionB;
    }

    @Override // p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        l(fVar, bVar);
        p018b8.i iVar = this.f24193d;
        p248y8.h[] hVarArrK = k();
        java.util.Collection collectionC = iVar.c(fVar, bVar);
        for (p248y8.h hVar : hVarArrK) {
            collectionC = O8.a.a(collectionC, hVar.c(fVar, bVar));
        }
        return collectionC == null ? p097j7.Z.d() : collectionC;
    }

    @Override // p248y8.h
    public java.util.Set d() {
        p248y8.h[] hVarArrK = k();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (p248y8.h hVar : hVarArrK) {
            p097j7.AbstractC6879v.C(linkedHashSet, hVar.d());
        }
        linkedHashSet.addAll(this.f24193d.d());
        return linkedHashSet;
    }

    @Override // p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        p018b8.i iVar = this.f24193d;
        p248y8.h[] hVarArrK = k();
        java.util.Collection collectionE = iVar.e(dVar, lVar);
        for (p248y8.h hVar : hVarArrK) {
            collectionE = O8.a.a(collectionE, hVar.e(dVar, lVar));
        }
        return collectionE == null ? p097j7.Z.d() : collectionE;
    }

    @Override // p248y8.h
    public java.util.Set f() {
        java.util.Set setA = p248y8.j.a(p097j7.AbstractC6872n.N(k()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.f24193d.f());
        return setA;
    }

    @Override // p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        l(fVar, bVar);
        O7.InterfaceC1424e interfaceC1424eQ = this.f24193d.g(fVar, bVar);
        if (interfaceC1424eQ != null) {
            return interfaceC1424eQ;
        }
        O7.InterfaceC1427h interfaceC1427h = null;
        for (p248y8.h hVar : k()) {
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

    public final p018b8.i j() {
        return this.f24193d;
    }

    public void l(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        V7.a.b(this.f24191b.a().l(), bVar, this.f24192c, fVar);
    }

    public java.lang.String toString() {
        return "scope for " + this.f24192c;
    }
}
