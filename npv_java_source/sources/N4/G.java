package N4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G implements java.util.Comparator {
    protected G() {
    }

    public static N4.G a(java.util.Comparator comparator) {
        return comparator instanceof N4.G ? (N4.G) comparator : new N4.C1411k(comparator);
    }

    public static N4.G c() {
        return N4.D.f7685C;
    }

    public N4.AbstractC1415o b(java.lang.Iterable iterable) {
        return N4.AbstractC1415o.R(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(java.lang.Object obj, java.lang.Object obj2);

    N4.G d() {
        return e(N4.z.b());
    }

    public N4.G e(M4.c cVar) {
        return new N4.C1406f(cVar, this);
    }
}
