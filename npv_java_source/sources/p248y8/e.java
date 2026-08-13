package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends p248y8.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f57343d = {p247y7.P.j(new p247y7.G(p247y7.P.b(p248y8.e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.InterfaceC1424e f57344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.i f57345c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.List listI = p248y8.e.this.i();
            return p097j7.AbstractC6879v.C0(listI, p248y8.e.this.j(listI));
        }
    }

    public static final class b extends p178r8.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f57347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p248y8.e f57348b;

        b(java.util.ArrayList arrayList, p248y8.e eVar) {
            this.f57347a = arrayList;
            this.f57348b = eVar;
        }

        @Override // p178r8.k
        public void a(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "fakeOverride");
            p178r8.l.K(interfaceC1421b, null);
            this.f57347a.add(interfaceC1421b);
        }

        @Override // p178r8.j
        protected void e(O7.InterfaceC1421b interfaceC1421b, O7.InterfaceC1421b interfaceC1421b2) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "fromSuper");
            p247y7.AbstractC7350t.f(interfaceC1421b2, "fromCurrent");
            throw new java.lang.IllegalStateException(("Conflict in scope of " + this.f57348b.l() + ": " + interfaceC1421b + " vs " + interfaceC1421b2).toString());
        }
    }

    public e(E8.n nVar, O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(interfaceC1424e, "containingClass");
        this.f57344b = interfaceC1424e;
        this.f57345c = nVar.d(new y8.e.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List j(java.util.List list) {
        java.util.Collection collectionM;
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.Collection collectionU = this.f57344b.p().u();
        p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = collectionU.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(arrayList2, y8.k.a.a(((F8.E) it.next()).u(), null, null, 3, null));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if (obj instanceof O7.InterfaceC1421b) {
                arrayList3.add(obj);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : arrayList3) {
            p138n8.f name = ((O7.InterfaceC1421b) obj2).getName();
            java.lang.Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((java.util.List) arrayList4).add(obj2);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            p138n8.f fVar = (p138n8.f) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (java.lang.Object obj3 : list2) {
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((O7.InterfaceC1421b) obj3) instanceof O7.InterfaceC1443y);
                java.lang.Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new java.util.ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((java.util.List) arrayList5).add(obj3);
            }
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((java.lang.Boolean) entry2.getKey()).booleanValue();
                java.util.List list3 = (java.util.List) entry2.getValue();
                p178r8.l lVar = p178r8.l.f54007f;
                java.util.List list4 = list3;
                if (zBooleanValue) {
                    collectionM = new java.util.ArrayList();
                    for (java.lang.Object obj4 : list) {
                        if (p247y7.AbstractC7350t.b(((O7.InterfaceC1443y) obj4).getName(), fVar)) {
                            collectionM.add(obj4);
                        }
                    }
                } else {
                    collectionM = p097j7.AbstractC6879v.m();
                }
                lVar.v(fVar, list4, collectionM, this.f57344b, new y8.e.b(arrayList, this));
            }
        }
        return P8.a.c(arrayList);
    }

    private final java.util.List k() {
        return (java.util.List) E8.m.a(this.f57345c, this, f57343d[0]);
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
        java.util.List listM;
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        java.util.List listK = k();
        if (listK.isEmpty()) {
            listM = p097j7.AbstractC6879v.m();
        } else {
            P8.f fVar2 = new P8.f();
            for (java.lang.Object obj : listK) {
                if ((obj instanceof O7.Z) && p247y7.AbstractC7350t.b(((O7.Z) obj).getName(), fVar)) {
                    fVar2.add(obj);
                }
            }
            listM = fVar2;
        }
        return listM;
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        java.util.List listM;
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        java.util.List listK = k();
        if (listK.isEmpty()) {
            listM = p097j7.AbstractC6879v.m();
        } else {
            P8.f fVar2 = new P8.f();
            for (java.lang.Object obj : listK) {
                if ((obj instanceof O7.U) && p247y7.AbstractC7350t.b(((O7.U) obj).getName(), fVar)) {
                    fVar2.add(obj);
                }
            }
            listM = fVar2;
        }
        return listM;
    }

    @Override // p248y8.i, p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return !dVar.a(p248y8.d.f57328p.m()) ? p097j7.AbstractC6879v.m() : k();
    }

    protected abstract java.util.List i();

    protected final O7.InterfaceC1424e l() {
        return this.f57344b;
    }
}
