package p097j7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C extends p097j7.B {
    public static boolean C(java.util.Collection collection, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        p247y7.AbstractC7350t.f(iterable, "elements");
        if (iterable instanceof java.util.Collection) {
            return collection.addAll((java.util.Collection) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z6 = true;
            }
        }
        return z6;
    }

    public static boolean D(java.util.Collection collection, java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        p247y7.AbstractC7350t.f(objArr, "elements");
        return collection.addAll(p097j7.AbstractC6872n.d(objArr));
    }

    public static final java.util.Collection E(java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        if (!(iterable instanceof java.util.Collection)) {
            iterable = p097j7.AbstractC6879v.T0(iterable);
        }
        return (java.util.Collection) iterable;
    }

    private static final boolean F(java.lang.Iterable iterable, p237x7.l lVar, boolean z6) {
        java.util.Iterator it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((java.lang.Boolean) lVar.l(it.next())).booleanValue() == z6) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean G(java.util.List list, p237x7.l lVar, boolean z6) {
        int i6;
        if (!(list instanceof java.util.RandomAccess)) {
            p247y7.AbstractC7350t.d(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return F(p247y7.W.b(list), lVar, z6);
        }
        int iO = p097j7.AbstractC6879v.o(list);
        if (iO >= 0) {
            int i10 = 0;
            i6 = 0;
            while (true) {
                java.lang.Object obj = list.get(i10);
                if (((java.lang.Boolean) lVar.l(obj)).booleanValue() != z6) {
                    if (i6 != i10) {
                        list.set(i6, obj);
                    }
                    i6++;
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        } else {
            i6 = 0;
        }
        if (i6 >= list.size()) {
            return false;
        }
        int iO2 = p097j7.AbstractC6879v.o(list);
        if (i6 > iO2) {
            return true;
        }
        while (true) {
            list.remove(iO2);
            if (iO2 == i6) {
                return true;
            }
            iO2--;
        }
    }

    public static boolean H(java.lang.Iterable iterable, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(iterable, "<this>");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        return F(iterable, lVar, true);
    }

    public static boolean I(java.util.List list, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(list, "<this>");
        p247y7.AbstractC7350t.f(lVar, "predicate");
        return G(list, lVar, true);
    }

    public static java.lang.Object J(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static java.lang.Object K(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static java.lang.Object L(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(p097j7.AbstractC6879v.o(list));
    }

    public static java.lang.Object M(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(p097j7.AbstractC6879v.o(list));
    }

    public static final boolean N(java.util.Collection collection, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        p247y7.AbstractC7350t.f(iterable, "elements");
        return collection.retainAll(E(iterable));
    }
}
