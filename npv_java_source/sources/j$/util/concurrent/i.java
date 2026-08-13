package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends j$.util.concurrent.b implements java.util.Set, j$.util.Set {
    private static final long serialVersionUID = 7249069246763182397L;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f48073a.containsKey(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        java.util.Set set;
        return (obj instanceof java.util.Set) && ((set = (java.util.Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        consumer.getClass();
        j$.util.concurrent.l[] lVarArr = this.f48073a.f48058a;
        if (lVarArr == null) {
            return;
        }
        j$.util.concurrent.p pVar = new j$.util.concurrent.p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            j$.util.concurrent.l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                consumer.o(lVarA.f48084b);
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        java.lang.Object it = iterator();
        int iHashCode = 0;
        while (((j$.util.concurrent.AbstractC6711a) it).hasNext()) {
            iHashCode += ((j$.util.concurrent.h) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f48073a;
        j$.util.concurrent.l[] lVarArr = concurrentHashMap.f48058a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j$.util.concurrent.h(lVarArr, length, length, concurrentHashMap, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(j$.util.Collection.CC.$default$parallelStream(this));
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.f48073a.remove(obj) != null;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection, j$.util.List
    public final j$.util.Spliterator spliterator() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f48073a;
        long j6 = concurrentHashMap.j();
        j$.util.concurrent.l[] lVarArr = concurrentHashMap.f48058a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j$.util.concurrent.j(lVarArr, length, 0, length, j6 < 0 ? 0L : j6, 0);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(j$.util.Collection.CC.$default$stream(this));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((java.lang.Object[]) intFunction.apply(0));
    }
}
