package N4;

/* JADX INFO: loaded from: classes3.dex */
final class N extends N4.r {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.lang.Object f7717E;

    N(java.lang.Object obj) {
        this.f7717E = M4.h.i(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public N4.S iterator() {
        return N4.w.c(this.f7717E);
    }

    @Override // N4.AbstractC1414n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f7717E.equals(obj);
    }

    @Override // N4.AbstractC1414n
    int d(java.lang.Object[] objArr, int i6) {
        objArr[i6] = this.f7717E;
        return i6 + 1;
    }

    @Override // N4.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7717E.hashCode();
    }

    @Override // N4.AbstractC1414n
    boolean n() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        java.lang.String string = this.f7717E.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
