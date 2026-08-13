package P6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final java.util.List h(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "block");
        P6.a aVar = new P6.a();
        lVar.l(aVar);
        P6.k[] kVarArr = (P6.k[]) aVar.b().toArray(new P6.k[0]);
        return i((P6.k[]) java.util.Arrays.copyOf(kVarArr, kVarArr.length));
    }

    public static final java.util.List i(P6.k... kVarArr) {
        java.lang.Object aVar;
        p247y7.AbstractC7350t.f(kVarArr, "values");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (P6.k kVar : kVarArr) {
            java.lang.String strA = kVar.a();
            final java.lang.Object objB = kVar.b();
            T6.InterfaceC1668p interfaceC1668pC = kVar.c();
            T6.C1669q c1669q = new T6.C1669q(0, 1, null);
            T6.C1673v c1673v = T6.C1673v.f13241a;
            c1669q.e(c1673v.f(), "form-data; name=" + T6.AbstractC1667o.b(strA));
            c1669q.g(interfaceC1668pC);
            if (objB instanceof java.lang.String) {
                aVar = new U6.e.b((java.lang.String) objB, new p237x7.a() { // from class: P6.c
                    @Override // p237x7.a
                    public final java.lang.Object b() {
                        return P6.j.j();
                    }
                }, c1669q.q());
            } else if (objB instanceof java.lang.Number) {
                aVar = new U6.e.b(objB.toString(), new p237x7.a() { // from class: P6.d
                    @Override // p237x7.a
                    public final java.lang.Object b() {
                        return P6.j.k();
                    }
                }, c1669q.q());
            } else if (objB instanceof java.lang.Boolean) {
                aVar = new U6.e.b(java.lang.String.valueOf(((java.lang.Boolean) objB).booleanValue()), new p237x7.a() { // from class: P6.e
                    @Override // p237x7.a
                    public final java.lang.Object b() {
                        return P6.j.l();
                    }
                }, c1669q.q());
            } else if (objB instanceof byte[]) {
                c1669q.e(c1673v.g(), java.lang.String.valueOf(((byte[]) objB).length));
                aVar = new U6.e.a(new p237x7.a() { // from class: P6.f
                    @Override // p237x7.a
                    public final java.lang.Object b() {
                        return P6.j.m(objB);
                    }
                }, new p237x7.a() { // from class: P6.g
                    @Override // p237x7.a
                    public final java.lang.Object b() {
                        return P6.j.n();
                    }
                }, c1669q.q());
            } else {
                if (!(objB instanceof p149o9.q)) {
                    throw new java.lang.IllegalStateException(("Unknown form content type: " + objB).toString());
                }
                c1669q.e(c1673v.g(), java.lang.String.valueOf(p037d7.d.d((p149o9.q) objB)));
                aVar = new U6.e.a(new p237x7.a() { // from class: P6.h
                    @Override // p237x7.a
                    public final java.lang.Object b() {
                        return P6.j.o(objB);
                    }
                }, new p237x7.a() { // from class: P6.i
                    @Override // p237x7.a
                    public final java.lang.Object b() {
                        return P6.j.p(objB);
                    }
                }, c1669q.q());
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M j() {
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M k() {
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M l() {
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p149o9.q m(java.lang.Object obj) {
        return p037d7.d.b((byte[]) obj, 0, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M n() {
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p149o9.q o(java.lang.Object obj) {
        return p037d7.d.c((p149o9.q) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M p(java.lang.Object obj) {
        ((p149o9.q) obj).close();
        return p087i7.M.f46721a;
    }
}
