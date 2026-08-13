package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public class DesugarCollections {
    public static <T> java.util.Collection<T> synchronizedCollection(java.util.Collection<T> collection) {
        return new j$.util.C6714f(collection);
    }

    public static <T> java.util.List<T> synchronizedList(java.util.List<T> list) {
        return list instanceof java.util.RandomAccess ? new j$.util.C6717i(list) : new j$.util.C6715g(list);
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new j$.util.C6716h(map);
    }

    public static <T> java.util.Set<T> synchronizedSet(java.util.Set<T> set) {
        return new j$.util.C6718j(set);
    }

    public static <T> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T> collection) {
        return new j$.util.C6720l(collection);
    }

    public static <T> java.util.List<T> unmodifiableList(java.util.List<? extends T> list) {
        return list instanceof java.util.RandomAccess ? new j$.util.C6852t(list) : new j$.util.C6722n(list);
    }

    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> map) {
        return new j$.util.C6726s(map);
    }

    public static <T> java.util.Set<T> unmodifiableSet(java.util.Set<? extends T> set) {
        return new j$.util.C6853u(set);
    }
}
