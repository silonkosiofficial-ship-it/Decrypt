package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class V extends p097j7.U {
    public static java.util.Map h() {
        p097j7.J j6 = p097j7.J.f49285C;
        p247y7.AbstractC7350t.d(j6, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return j6;
    }

    public static java.lang.Object i(java.util.Map map, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(map, "<this>");
        return p097j7.T.a(map, obj);
    }

    public static java.util.HashMap j(p087i7.u... uVarArr) {
        p247y7.AbstractC7350t.f(uVarArr, "pairs");
        java.util.HashMap map = new java.util.HashMap(p097j7.S.d(uVarArr.length));
        p(map, uVarArr);
        return map;
    }

    public static java.util.Map k(p087i7.u... uVarArr) {
        p247y7.AbstractC7350t.f(uVarArr, "pairs");
        return uVarArr.length > 0 ? t(uVarArr, new java.util.LinkedHashMap(p097j7.S.d(uVarArr.length))) : p097j7.S.h();
    }

    public static java.util.Map l(p087i7.u... uVarArr) {
        p247y7.AbstractC7350t.f(uVarArr, "pairs");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p097j7.S.d(uVarArr.length));
        p(linkedHashMap, uVarArr);
        return linkedHashMap;
    }

    public static final java.util.Map m(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : p097j7.U.f(map);
        }
        return p097j7.S.h();
    }

    public static java.util.Map n(java.util.Map map, java.util.Map map2) {
        p247y7.AbstractC7350t.f(map, "<this>");
        p247y7.AbstractC7350t.f(map2, "map");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void o(java.util.Map map, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(map, "<this>");
        p247y7.AbstractC7350t.f(iterable, "pairs");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p087i7.u uVar = (p087i7.u) it.next();
            map.put(uVar.a(), uVar.b());
        }
    }

    public static final void p(java.util.Map map, p087i7.u[] uVarArr) {
        p247y7.AbstractC7350t.f(map, "<this>");
        p247y7.AbstractC7350t.f(uVarArr, "pairs");
        for (p087i7.u uVar : uVarArr) {
            map.put(uVar.a(), uVar.b());
        }
    }

    public static java.util.Map q(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (!(iterable instanceof java.util.Collection)) {
            return m(r(iterable, new java.util.LinkedHashMap()));
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return p097j7.S.h();
        }
        if (size != 1) {
            return r(iterable, new java.util.LinkedHashMap(p097j7.S.d(collection.size())));
        }
        return p097j7.S.e((p087i7.u) (iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next()));
    }

    public static final java.util.Map r(java.lang.Iterable iterable, java.util.Map map) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(map, "destination");
        o(map, iterable);
        return map;
    }

    public static java.util.Map s(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? p097j7.S.u(map) : p097j7.U.f(map);
        }
        return p097j7.S.h();
    }

    public static final java.util.Map t(p087i7.u[] uVarArr, java.util.Map map) {
        p247y7.AbstractC7350t.f(uVarArr, "<this>");
        p247y7.AbstractC7350t.f(map, "destination");
        p(map, uVarArr);
        return map;
    }

    public static java.util.Map u(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "<this>");
        return new java.util.LinkedHashMap(map);
    }
}
