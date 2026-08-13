package N4;

/* JADX INFO: loaded from: classes3.dex */
final class D extends N4.G implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final N4.D f7685C = new N4.D();

    private D() {
    }

    @Override // N4.G, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        M4.h.i(comparable);
        M4.h.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public java.lang.String toString() {
        return "Ordering.natural()";
    }
}
