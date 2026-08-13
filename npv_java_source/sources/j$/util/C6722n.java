package j$.util;

/* JADX INFO: renamed from: j$.util.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
class C6722n extends j$.util.C6720l implements java.util.List, j$.util.List {
    private static final long serialVersionUID = -283967356065247728L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.List f48171b;

    C6722n(java.util.List list) {
        super(list);
        this.f48171b = list;
    }

    private java.lang.Object readResolve() {
        java.util.List list = this.f48171b;
        return list instanceof java.util.RandomAccess ? new j$.util.C6852t(list) : this;
    }

    @Override // java.util.List
    public final void add(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i6, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        return obj == this || this.f48171b.equals(obj);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        return this.f48171b.get(i6);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f48171b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return this.f48171b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        return this.f48171b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new j$.util.C6721m(this, 0);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i6) {
        return new j$.util.C6721m(this, i6);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i6) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final java.lang.Object set(int i6, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public java.util.List subList(int i6, int i10) {
        return new j$.util.C6722n(this.f48171b.subList(i6, i10));
    }
}
