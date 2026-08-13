package p107k7;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends p097j7.AbstractC6868j implements java.util.Set, java.io.Serializable, p256z7.f {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final k7.h.a f49759D = new k7.h.a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final p107k7.h f49760E = new p107k7.h(p107k7.d.f49734P.e());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p107k7.d f49761C;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public h() {
        this(new p107k7.d());
    }

    public h(p107k7.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "backing");
        this.f49761C = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        return this.f49761C.k(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        this.f49761C.o();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f49761C.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f49761C.containsKey(obj);
    }

    @Override // p097j7.AbstractC6868j
    public int d() {
        return this.f49761C.size();
    }

    public final java.util.Set e() {
        this.f49761C.m();
        return size() > 0 ? this : f49760E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f49761C.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return this.f49761C.J();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        return this.f49761C.S(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        this.f49761C.o();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        this.f49761C.o();
        return super.retainAll(collection);
    }
}
