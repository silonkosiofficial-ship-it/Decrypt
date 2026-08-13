package p097j7;

/* JADX INFO: loaded from: classes3.dex */
final class J implements java.util.Map, java.io.Serializable, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p097j7.J f49285C = new p097j7.J();

    private J() {
    }

    public boolean a(java.lang.Void r6) {
        p247y7.AbstractC7350t.f(r6, "value");
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.Void get(java.lang.Object obj) {
        return null;
    }

    public java.util.Set c() {
        return p097j7.K.f49286C;
    }

    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof java.lang.Void) {
            return a((java.lang.Void) obj);
        }
        return false;
    }

    public java.util.Set d() {
        return p097j7.K.f49286C;
    }

    public int e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.Map) && ((java.util.Map) obj).isEmpty();
    }

    public java.util.Collection f() {
        return p097j7.I.f49284C;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public java.lang.Void remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    public java.lang.String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return f();
    }
}
