package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class e extends j$.util.concurrent.b implements java.util.Set, j$.util.Set {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return this.f48073a.f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (this.f48073a.f(entry.getKey(), entry.getValue(), false) == null) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry;
        java.lang.Object key;
        java.lang.Object obj2;
        java.lang.Object value;
        return (!(obj instanceof java.util.Map.Entry) || (key = (entry = (java.util.Map.Entry) obj).getKey()) == null || (obj2 = this.f48073a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
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
                consumer.o(new j$.util.concurrent.k(lVarA.f48084b, lVarA.f48085c, this.f48073a));
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        j$.util.concurrent.l[] lVarArr = this.f48073a.f48058a;
        int iHashCode = 0;
        if (lVarArr != null) {
            j$.util.concurrent.p pVar = new j$.util.concurrent.p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                j$.util.concurrent.l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                iHashCode += lVarA.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f48073a;
        j$.util.concurrent.l[] lVarArr = concurrentHashMap.f48058a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j$.util.concurrent.d(lVarArr, length, length, concurrentHashMap);
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
        java.util.Map.Entry entry;
        java.lang.Object key;
        java.lang.Object value;
        return (obj instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.f48073a.remove(key, value);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f48073a;
        concurrentHashMap.getClass();
        predicate.getClass();
        j$.util.concurrent.l[] lVarArr = concurrentHashMap.f48058a;
        boolean z6 = false;
        if (lVarArr != null) {
            j$.util.concurrent.p pVar = new j$.util.concurrent.p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                j$.util.concurrent.l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                java.lang.Object obj = lVarA.f48084b;
                java.lang.Object obj2 = lVarA.f48085c;
                if (predicate.test(new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection, j$.util.List
    public final j$.util.Spliterator spliterator() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f48073a;
        long j6 = concurrentHashMap.j();
        j$.util.concurrent.l[] lVarArr = concurrentHashMap.f48058a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j$.util.concurrent.f(lVarArr, length, 0, length, j6 >= 0 ? j6 : 0L, concurrentHashMap);
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
