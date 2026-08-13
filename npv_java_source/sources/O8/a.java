package O8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final java.util.Collection a(java.util.Collection collection, java.util.Collection collection2) {
        p247y7.AbstractC7350t.f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof java.util.LinkedHashSet) {
            ((java.util.LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final P8.f b(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "scopes");
        P8.f fVar = new P8.f();
        for (java.lang.Object obj : iterable) {
            p248y8.h hVar = (p248y8.h) obj;
            if (hVar != null && hVar != y8.h.b.f57356b) {
                fVar.add(obj);
            }
        }
        return fVar;
    }
}
