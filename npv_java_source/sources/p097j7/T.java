package p097j7;

/* JADX INFO: loaded from: classes3.dex */
abstract class T {
    public static final java.lang.Object a(java.util.Map map, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(map, "<this>");
        if (map instanceof p097j7.Q) {
            return ((p097j7.Q) map).w(obj);
        }
        java.lang.Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new java.util.NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
