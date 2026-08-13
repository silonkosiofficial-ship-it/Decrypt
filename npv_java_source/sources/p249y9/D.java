package p249y9;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends p249y9.i implements java.util.Map<java.lang.String, p249y9.i>, p256z7.a, j$.util.Map {
    public static final y9.D.a Companion = new y9.D.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Map f57380C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p199t9.b serializer() {
            return p249y9.E.f57381a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(java.util.Map map) {
        super(null);
        p247y7.AbstractC7350t.f(map, "content");
        this.f57380C = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence M(java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "<destruct>");
        java.lang.String str = (java.lang.String) entry.getKey();
        p249y9.i iVar = (p249y9.i) entry.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        p258z9.e0.c(sb, str);
        sb.append(':');
        sb.append(iVar);
        return sb.toString();
    }

    public int C() {
        return this.f57380C.size();
    }

    public java.util.Collection D() {
        return this.f57380C.values();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public p249y9.i remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return e((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof p249y9.i) {
            return f((p249y9.i) obj);
        }
        return false;
    }

    public boolean e(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        return this.f57380C.containsKey(str);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<java.lang.String, p249y9.i>> entrySet() {
        return o();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return p247y7.AbstractC7350t.b(this.f57380C, obj);
    }

    public boolean f(p249y9.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "value");
        return this.f57380C.containsValue(iVar);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    public p249y9.i g(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        return (p249y9.i) this.f57380C.get(str);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ p249y9.i get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return g((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f57380C.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f57380C.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.lang.String> keySet() {
        return s();
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public java.util.Set o() {
        return this.f57380C.entrySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ p249y9.i put(java.lang.String str, p249y9.i iVar) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends p249y9.i> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public void replaceAll(java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public java.util.Set s() {
        return this.f57380C.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return C();
    }

    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(this.f57380C.entrySet(), ",", "{", "}", 0, null, new p237x7.l() { // from class: y9.C
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return p249y9.D.M((java.util.Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<p249y9.i> values() {
        return D();
    }
}
