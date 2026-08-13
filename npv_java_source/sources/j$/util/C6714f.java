package j$.util;

/* JADX INFO: renamed from: j$.util.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
class C6714f implements java.util.Collection, java.io.Serializable, j$.util.Collection {
    private static final long serialVersionUID = 3053995032091335093L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.Collection f48122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.Object f48123b;

    C6714f(java.util.Collection collection) {
        this.f48122a = (java.util.Collection) j$.util.Objects.requireNonNull(collection);
        this.f48123b = this;
    }

    C6714f(java.util.Collection collection, java.lang.Object obj) {
        this.f48122a = (java.util.Collection) j$.util.Objects.requireNonNull(collection);
        this.f48123b = j$.util.Objects.requireNonNull(obj);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) {
        synchronized (this.f48123b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        boolean zAdd;
        synchronized (this.f48123b) {
            zAdd = this.f48122a.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        boolean zAddAll;
        synchronized (this.f48123b) {
            zAddAll = this.f48122a.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f48123b) {
            this.f48122a.clear();
        }
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        boolean zContains;
        synchronized (this.f48123b) {
            zContains = this.f48122a.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        boolean zContainsAll;
        synchronized (this.f48123b) {
            zContainsAll = this.f48122a.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        synchronized (this.f48123b) {
            j$.util.Collection.EL.a(this.f48122a, consumer);
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f48123b) {
            zIsEmpty = this.f48122a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.f48122a.iterator();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.EL.b(this.f48122a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(j$.util.Collection.EL.b(this.f48122a));
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        boolean zRemove;
        synchronized (this.f48123b) {
            zRemove = this.f48122a.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f48123b) {
            zRemoveAll = this.f48122a.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.f48123b) {
            java.util.Collection collection = this.f48122a;
            zRemoveIf = collection instanceof j$.util.Collection ? ((j$.util.Collection) collection).removeIf(predicate) : j$.util.Collection.CC.$default$removeIf(collection, predicate);
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        boolean zRetainAll;
        synchronized (this.f48123b) {
            zRetainAll = this.f48122a.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f48123b) {
            size = this.f48122a.size();
        }
        return size;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public final j$.util.Spliterator spliterator() {
        return j$.util.Collection.EL.c(this.f48122a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(j$.util.Collection.EL.c(this.f48122a));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final j$.util.stream.Stream stream() {
        return j$.util.Collection.EL.stream(this.f48122a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(j$.util.Collection.EL.stream(this.f48122a));
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] array;
        synchronized (this.f48123b) {
            array = this.f48122a.toArray();
        }
        return array;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((java.lang.Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        java.lang.Object[] array;
        synchronized (this.f48123b) {
            array = this.f48122a.toArray(objArr);
        }
        return array;
    }

    public final java.lang.String toString() {
        java.lang.String string;
        synchronized (this.f48123b) {
            string = this.f48122a.toString();
        }
        return string;
    }
}
