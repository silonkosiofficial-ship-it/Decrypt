package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class s extends j$.util.concurrent.b implements j$.util.Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f48073a.containsValue(obj);
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
                consumer.o(lVarA.f48085c);
            }
        }
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f48073a;
        j$.util.concurrent.l[] lVarArr = concurrentHashMap.f48058a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j$.util.concurrent.h(lVarArr, length, length, concurrentHashMap, 1);
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
        j$.util.concurrent.AbstractC6711a abstractC6711a;
        if (obj == null) {
            return false;
        }
        java.lang.Object it = iterator();
        do {
            abstractC6711a = (j$.util.concurrent.AbstractC6711a) it;
            if (!abstractC6711a.hasNext()) {
                return false;
            }
        } while (!obj.equals(((j$.util.concurrent.h) it).next()));
        abstractC6711a.remove();
        return true;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        java.lang.Object it = iterator();
        boolean z6 = false;
        while (true) {
            j$.util.concurrent.AbstractC6711a abstractC6711a = (j$.util.concurrent.AbstractC6711a) it;
            if (!abstractC6711a.hasNext()) {
                return z6;
            }
            if (collection.contains(((j$.util.concurrent.h) it).next())) {
                abstractC6711a.remove();
                z6 = true;
            }
        }
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
                if (predicate.test(obj2) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public final j$.util.Spliterator spliterator() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f48073a;
        long j6 = concurrentHashMap.j();
        j$.util.concurrent.l[] lVarArr = concurrentHashMap.f48058a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j$.util.concurrent.j(lVarArr, length, 0, length, j6 < 0 ? 0L : j6, 1);
    }

    @Override // java.util.Collection, java.lang.Iterable
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
