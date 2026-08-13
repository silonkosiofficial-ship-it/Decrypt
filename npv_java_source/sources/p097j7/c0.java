package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 extends p097j7.b0 {
    public static java.util.Set h(java.util.Set set, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(set, "<this>");
        p247y7.AbstractC7350t.f(iterable, "elements");
        java.util.Collection<?> collectionE = p097j7.C.E(iterable);
        if (collectionE.isEmpty()) {
            return p097j7.AbstractC6879v.Y0(set);
        }
        if (!(collectionE instanceof java.util.Set)) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(set);
            linkedHashSet.removeAll(collectionE);
            return linkedHashSet;
        }
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        for (java.lang.Object obj : set) {
            if (!((java.util.Set) collectionE).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static java.util.Set i(java.util.Set set, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(set, "<this>");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p097j7.S.d(set.size()));
        boolean z6 = false;
        for (java.lang.Object obj2 : set) {
            boolean z10 = true;
            if (!z6 && p247y7.AbstractC7350t.b(obj2, obj)) {
                z6 = true;
                z10 = false;
            }
            if (z10) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static java.util.Set j(java.util.Set set, java.lang.Iterable iterable) {
        int size;
        p247y7.AbstractC7350t.f(set, "<this>");
        p247y7.AbstractC7350t.f(iterable, "elements");
        java.lang.Integer numY = p097j7.AbstractC6882y.y(iterable);
        if (numY != null) {
            size = set.size() + numY.intValue();
        } else {
            size = set.size() * 2;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p097j7.S.d(size));
        linkedHashSet.addAll(set);
        p097j7.AbstractC6879v.C(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static java.util.Set k(java.util.Set set, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(set, "<this>");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p097j7.S.d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
