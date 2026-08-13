package X7;

/* JADX INFO: renamed from: X7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1829g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X7.C1829g f16014a = new X7.C1829g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Map f16015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f16016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Set f16017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.Set f16018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Set f16019f;

    static {
        p138n8.d dVar = L7.j.a.f6401s;
        p087i7.u uVarA = p087i7.B.a(X7.AbstractC1830h.d(dVar, "name"), L7.j.f6311k);
        p087i7.u uVarA2 = p087i7.B.a(X7.AbstractC1830h.d(dVar, "ordinal"), p138n8.f.o("ordinal"));
        p087i7.u uVarA3 = p087i7.B.a(X7.AbstractC1830h.c(L7.j.a.f6360V, "size"), p138n8.f.o("size"));
        p138n8.c cVar = L7.j.a.f6364Z;
        java.util.Map mapK = p097j7.S.k(uVarA, uVarA2, uVarA3, p087i7.B.a(X7.AbstractC1830h.c(cVar, "size"), p138n8.f.o("size")), p087i7.B.a(X7.AbstractC1830h.d(L7.j.a.f6377g, "length"), p138n8.f.o("length")), p087i7.B.a(X7.AbstractC1830h.c(cVar, "keys"), p138n8.f.o("keySet")), p087i7.B.a(X7.AbstractC1830h.c(cVar, "values"), p138n8.f.o("values")), p087i7.B.a(X7.AbstractC1830h.c(cVar, "entries"), p138n8.f.o("entrySet")));
        f16015b = mapK;
        java.util.Set<java.util.Map.Entry> setEntrySet = mapK.entrySet();
        java.util.ArrayList<p087i7.u> arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(setEntrySet, 10));
        for (java.util.Map.Entry entry : setEntrySet) {
            arrayList.add(new p087i7.u(((p138n8.c) entry.getKey()).g(), entry.getValue()));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (p087i7.u uVar : arrayList) {
            p138n8.f fVar = (p138n8.f) uVar.d();
            java.lang.Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((java.util.List) arrayList2).add((p138n8.f) uVar.c());
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(p097j7.S.d(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), p097j7.AbstractC6879v.b0((java.lang.Iterable) entry2.getValue()));
        }
        f16016c = linkedHashMap2;
        java.util.Map map = f16015b;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry entry3 : map.entrySet()) {
            N7.c cVar2 = N7.c.f7820a;
            p138n8.d dVarJ = ((p138n8.c) entry3.getKey()).e().j();
            p247y7.AbstractC7350t.e(dVarJ, "toUnsafe(...)");
            p138n8.b bVarN = cVar2.n(dVarJ);
            p247y7.AbstractC7350t.c(bVarN);
            linkedHashSet.add(bVarN.b().c((p138n8.f) entry3.getValue()));
        }
        f16017d = linkedHashSet;
        java.util.Set setKeySet = f16015b.keySet();
        f16018e = setKeySet;
        java.util.Set set = setKeySet;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(set, 10));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((p138n8.c) it.next()).g());
        }
        f16019f = p097j7.AbstractC6879v.Y0(arrayList3);
    }

    private C1829g() {
    }

    public final java.util.Map a() {
        return f16015b;
    }

    public final java.util.List b(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name1");
        java.util.List list = (java.util.List) f16016c.get(fVar);
        return list == null ? p097j7.AbstractC6879v.m() : list;
    }

    public final java.util.Set c() {
        return f16018e;
    }

    public final java.util.Set d() {
        return f16019f;
    }
}
