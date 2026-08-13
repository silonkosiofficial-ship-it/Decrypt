package N4;

/* JADX INFO: renamed from: N4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C1411k extends N4.G implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.Comparator f7753C;

    C1411k(java.util.Comparator comparator) {
        this.f7753C = (java.util.Comparator) M4.h.i(comparator);
    }

    @Override // N4.G, java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.f7753C.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N4.C1411k) {
            return this.f7753C.equals(((N4.C1411k) obj).f7753C);
        }
        return false;
    }

    public int hashCode() {
        return this.f7753C.hashCode();
    }

    public java.lang.String toString() {
        return this.f7753C.toString();
    }
}
