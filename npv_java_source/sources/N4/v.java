package N4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    private static java.util.Collection a(java.lang.Iterable iterable) {
        return iterable instanceof java.util.Collection ? (java.util.Collection) iterable : N4.x.g(iterable.iterator());
    }

    static java.lang.Object[] b(java.lang.Iterable iterable) {
        return a(iterable).toArray();
    }
}
