package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class U extends p097j7.T {
    public static java.util.Map b(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "builder");
        return ((p107k7.d) map).m();
    }

    public static java.util.Map c() {
        return new p107k7.d();
    }

    public static int d(int i6) {
        if (i6 < 0) {
            return i6;
        }
        if (i6 < 3) {
            return i6 + 1;
        }
        if (i6 < 1073741824) {
            return (int) ((i6 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static java.util.Map e(p087i7.u uVar) {
        p247y7.AbstractC7350t.f(uVar, "pair");
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(uVar.c(), uVar.d());
        p247y7.AbstractC7350t.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final java.util.Map f(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "<this>");
        java.util.Map.Entry entry = (java.util.Map.Entry) map.entrySet().iterator().next();
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        p247y7.AbstractC7350t.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static java.util.SortedMap g(java.util.Map map, java.util.Comparator comparator) {
        p247y7.AbstractC7350t.f(map, "<this>");
        p247y7.AbstractC7350t.f(comparator, "comparator");
        java.util.TreeMap treeMap = new java.util.TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
