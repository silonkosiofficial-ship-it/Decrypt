package j$.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
final class k implements java.util.Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.Object f48080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.lang.Object f48081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j$.util.concurrent.ConcurrentHashMap f48082c;

    k(java.lang.Object obj, java.lang.Object obj2, j$.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        this.f48080a = obj;
        this.f48081b = obj2;
        this.f48082c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        java.util.Map.Entry entry;
        java.lang.Object key;
        java.lang.Object value;
        java.lang.Object obj2;
        java.lang.Object obj3;
        return (obj instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f48080a) || key.equals(obj2)) && (value == (obj3 = this.f48081b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f48080a;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f48081b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f48080a.hashCode() ^ this.f48081b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        obj.getClass();
        java.lang.Object obj2 = this.f48081b;
        this.f48081b = obj;
        this.f48082c.put(this.f48080a, obj);
        return obj2;
    }

    public final java.lang.String toString() {
        return j$.util.concurrent.u.b(this.f48080a, this.f48081b);
    }
}
