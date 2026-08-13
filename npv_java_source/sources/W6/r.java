package W6;

/* JADX INFO: loaded from: classes3.dex */
public class r implements java.util.Set, p256z7.f {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Set f15373C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p237x7.l f15374D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p237x7.l f15375E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f15376F;

    public static final class a implements java.util.Iterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.Iterator f15377C;

        a() {
            this.f15377C = W6.r.this.f15373C.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15377C.hasNext();
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            return W6.r.this.f15374D.l(this.f15377C.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f15377C.remove();
        }
    }

    public r(java.util.Set set, p237x7.l lVar, p237x7.l lVar2) {
        p247y7.AbstractC7350t.f(set, "delegate");
        p247y7.AbstractC7350t.f(lVar, "convertTo");
        p247y7.AbstractC7350t.f(lVar2, "convert");
        this.f15373C = set;
        this.f15374D = lVar;
        this.f15375E = lVar2;
        this.f15376F = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        return this.f15373C.add(this.f15375E.l(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return this.f15373C.addAll(f(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f15373C.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f15373C.contains(this.f15375E.l(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return this.f15373C.containsAll(f(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Collection<?> collectionG = g(this.f15373C);
        return ((java.util.Set) obj).containsAll(collectionG) && collectionG.containsAll((java.util.Collection) obj);
    }

    public java.util.Collection f(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        java.util.Collection collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection2, 10));
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f15375E.l(it.next()));
        }
        return arrayList;
    }

    public java.util.Collection g(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        java.util.Collection collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection2, 10));
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f15374D.l(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f15373C.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f15373C.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new W6.r.a();
    }

    public int o() {
        return this.f15376F;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.f15373C.remove(this.f15375E.l(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return this.f15373C.removeAll(p097j7.AbstractC6879v.Y0(f(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        return this.f15373C.retainAll(p097j7.AbstractC6879v.Y0(f(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return o();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return p247y7.AbstractC7341j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "array");
        return p247y7.AbstractC7341j.b(this, objArr);
    }

    public java.lang.String toString() {
        return g(this.f15373C).toString();
    }
}
