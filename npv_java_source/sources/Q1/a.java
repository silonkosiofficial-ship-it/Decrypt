package Q1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final java.util.Set a(java.util.Set set) {
        p247y7.AbstractC7350t.f(set, "set");
        java.util.Set setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(p097j7.AbstractC6879v.Y0(set));
        p247y7.AbstractC7350t.e(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final java.util.Map b(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "map");
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(map);
        p247y7.AbstractC7350t.e(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }
}
