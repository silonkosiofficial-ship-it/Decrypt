package p097j7;

/* JADX INFO: renamed from: j7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6864f implements java.util.Map, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p097j7.AbstractC6864f.a f49306C = new p097j7.AbstractC6864f.a(null);

    /* JADX INFO: renamed from: j7.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    protected AbstractC6864f() {
    }

    private final java.lang.String k(java.lang.Object obj) {
        return obj == this ? "(this Map)" : java.lang.String.valueOf(obj);
    }

    private final java.lang.String l(java.util.Map.Entry entry) {
        return k(entry.getKey()) + '=' + k(entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence m(p097j7.AbstractC6864f abstractC6864f, java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "it");
        return abstractC6864f.l(entry);
    }

    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Set setEntrySet = entrySet();
        if ((setEntrySet instanceof java.util.Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        java.util.Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (p247y7.AbstractC7350t.b(((java.util.Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(java.util.Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        java.lang.Object obj = get(key);
        if (!p247y7.AbstractC7350t.b(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    public abstract java.util.Set e();

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return e();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (size() != map.size()) {
            return false;
        }
        java.util.Set setEntrySet = map.entrySet();
        if ((setEntrySet instanceof java.util.Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        java.util.Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!d((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract java.util.Set f();

    public abstract int g();

    public abstract java.util.Collection h();

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return f();
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return g();
    }

    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(entrySet(), ", ", "{", "}", 0, null, new p237x7.l() { // from class: j7.e
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return p097j7.AbstractC6864f.m(this.f49305C, (java.util.Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return h();
    }
}
