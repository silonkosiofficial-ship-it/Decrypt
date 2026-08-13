package j$.util;

/* JADX INFO: renamed from: j$.util.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6726s implements java.util.Map, java.io.Serializable, j$.util.Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f48188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient java.util.Set f48189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient java.util.Set f48190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient java.util.Collection f48191d;

    C6726s(java.util.Map map) {
        map.getClass();
        this.f48188a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return this.f48188a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.f48188a.containsValue(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        if (this.f48190c == null) {
            this.f48190c = new j$.util.r(this.f48188a.entrySet());
        }
        return this.f48190c;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return obj == this || this.f48188a.equals(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.EL.a(this.f48188a, biConsumer);
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        return this.f48188a.get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.EL.getOrDefault(this.f48188a, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f48188a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f48188a.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        if (this.f48189b == null) {
            this.f48189b = j$.util.DesugarCollections.unmodifiableSet(this.f48188a.keySet());
        }
        return this.f48189b;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f48188a.size();
    }

    public final java.lang.String toString() {
        return this.f48188a.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.f48191d == null) {
            this.f48191d = j$.util.DesugarCollections.unmodifiableCollection(this.f48188a.values());
        }
        return this.f48191d;
    }
}
