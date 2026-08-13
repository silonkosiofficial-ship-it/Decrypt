package N4;

/* JADX INFO: loaded from: classes3.dex */
abstract class P {
    public static java.util.Comparator a(java.util.SortedSet sortedSet) {
        java.util.Comparator comparator = sortedSet.comparator();
        return comparator == null ? N4.G.c() : comparator;
    }

    public static boolean b(java.util.Comparator comparator, java.lang.Iterable iterable) {
        java.util.Comparator comparator2;
        M4.h.i(comparator);
        M4.h.i(iterable);
        if (iterable instanceof java.util.SortedSet) {
            comparator2 = a((java.util.SortedSet) iterable);
        } else {
            if (!(iterable instanceof N4.O)) {
                return false;
            }
            comparator2 = ((N4.O) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
