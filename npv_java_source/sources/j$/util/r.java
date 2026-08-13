package j$.util;

/* JADX INFO: loaded from: classes4.dex */
final class r extends j$.util.C6853u {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.C6720l, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        return this.f48169a.contains(new j$.util.C6724p((java.util.Map.Entry) obj));
    }

    @Override // j$.util.C6720l, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.C6853u, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.f48169a.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // j$.util.C6720l, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        j$.util.Collection.EL.a(this.f48169a, new j$.util.C6723o(consumer));
    }

    @Override // j$.util.C6720l, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new j$.util.C6719k(this);
    }

    @Override // j$.util.C6720l, java.util.Collection, j$.util.Collection
    public final j$.util.stream.Stream parallelStream() {
        return j$.util.stream.AbstractC6845y0.f0(spliterator(), true);
    }

    @Override // j$.util.C6720l, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public final j$.util.Spliterator spliterator() {
        return new j$.util.C6725q(j$.util.Collection.EL.c(this.f48169a));
    }

    @Override // j$.util.C6720l, java.util.Collection, j$.util.Collection
    public final j$.util.stream.Stream stream() {
        return j$.util.stream.AbstractC6845y0.f0(spliterator(), false);
    }

    @Override // j$.util.C6720l, java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] array = this.f48169a.toArray();
        for (int i6 = 0; i6 < array.length; i6++) {
            array[i6] = new j$.util.C6724p((java.util.Map.Entry) array[i6]);
        }
        return array;
    }

    @Override // j$.util.C6720l, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        java.lang.Object[] array = this.f48169a.toArray(objArr.length == 0 ? objArr : java.util.Arrays.copyOf(objArr, 0));
        for (int i6 = 0; i6 < array.length; i6++) {
            array[i6] = new j$.util.C6724p((java.util.Map.Entry) array[i6]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        java.lang.System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }
}
