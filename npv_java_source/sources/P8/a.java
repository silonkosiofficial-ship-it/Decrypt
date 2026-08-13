package P8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(java.util.Collection collection, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        if (obj != null) {
            collection.add(obj);
        }
    }

    private static final int b(int i6) {
        if (i6 < 3) {
            return 3;
        }
        return i6 + (i6 / 3) + 1;
    }

    public static final java.util.List c(java.util.ArrayList arrayList) {
        p247y7.AbstractC7350t.f(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return p097j7.AbstractC6879v.m();
        }
        if (size == 1) {
            return p097j7.AbstractC6879v.e(p097j7.AbstractC6879v.i0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final java.util.Map d(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = iterable.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), java.lang.Integer.valueOf(i6));
            i6++;
        }
        return linkedHashMap;
    }

    public static final java.util.HashMap e(int i6) {
        return new java.util.HashMap(b(i6));
    }

    public static final java.util.HashSet f(int i6) {
        return new java.util.HashSet(b(i6));
    }

    public static final java.util.LinkedHashSet g(int i6) {
        return new java.util.LinkedHashSet(b(i6));
    }
}
