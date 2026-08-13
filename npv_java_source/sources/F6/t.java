package F6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f2786a = "ktor-client";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Set f2787b;

    static {
        T6.C1673v c1673v = T6.C1673v.f13241a;
        f2787b = p097j7.Z.g(c1673v.j(), c1673v.k(), c1673v.n(), c1673v.l(), c1673v.m());
    }

    public static final java.lang.Object c(p127m7.e eVar) {
        m7.i.b bVarI = eVar.getContext().i(F6.m.f2778D);
        p247y7.AbstractC7350t.c(bVarI);
        return ((F6.m) bVarI).a();
    }

    public static final void d(final T6.InterfaceC1668p interfaceC1668p, final U6.b bVar, final p237x7.p pVar) {
        java.lang.String strD;
        java.lang.String strD2;
        p247y7.AbstractC7350t.f(interfaceC1668p, "requestHeaders");
        p247y7.AbstractC7350t.f(bVar, "content");
        p247y7.AbstractC7350t.f(pVar, "block");
        R6.d.a(new p237x7.l() { // from class: F6.p
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return F6.t.e(interfaceC1668p, bVar, (T6.C1669q) obj);
            }
        }).e(new p237x7.p() { // from class: F6.q
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return F6.t.f(pVar, (java.lang.String) obj, (java.util.List) obj2);
            }
        });
        T6.C1673v c1673v = T6.C1673v.f13241a;
        if (interfaceC1668p.d(c1673v.q()) == null && bVar.c().d(c1673v.q()) == null && g()) {
            pVar.u(c1673v.q(), f2786a);
        }
        T6.C1660h c1660hB = bVar.b();
        if ((c1660hB == null || (strD = c1660hB.toString()) == null) && (strD = bVar.c().d(c1673v.h())) == null) {
            strD = interfaceC1668p.d(c1673v.h());
        }
        java.lang.Long lA = bVar.a();
        if ((lA == null || (strD2 = lA.toString()) == null) && (strD2 = bVar.c().d(c1673v.g())) == null) {
            strD2 = interfaceC1668p.d(c1673v.g());
        }
        if (strD != null) {
            pVar.u(c1673v.h(), strD);
        }
        if (strD2 != null) {
            pVar.u(c1673v.g(), strD2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M e(T6.InterfaceC1668p interfaceC1668p, U6.b bVar, T6.C1669q c1669q) {
        p247y7.AbstractC7350t.f(c1669q, "$this$buildHeaders");
        c1669q.g(interfaceC1668p);
        c1669q.g(bVar.c());
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M f(p237x7.p pVar, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(list, "values");
        T6.C1673v c1673v = T6.C1673v.f13241a;
        if (!p247y7.AbstractC7350t.b(c1673v.g(), str) && !p247y7.AbstractC7350t.b(c1673v.h(), str)) {
            if (f2787b.contains(str)) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    pVar.u(str, (java.lang.String) it.next());
                }
            } else {
                pVar.u(str, p097j7.AbstractC6879v.r0(list, p247y7.AbstractC7350t.b(c1673v.i(), str) ? "; " : ",", null, null, 0, null, null, 62, null));
            }
            return p087i7.M.f46721a;
        }
        return p087i7.M.f46721a;
    }

    private static final boolean g() {
        return !W6.w.f15387a.a();
    }
}
