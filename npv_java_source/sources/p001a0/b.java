package p001a0;

/* JADX INFO: loaded from: classes.dex */
public class b implements java.util.Map.Entry, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f16991C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f16992D;

    public b(java.lang.Object obj, java.lang.Object obj2) {
        this.f16991C = obj;
        this.f16992D = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        java.util.Map.Entry entry = obj instanceof java.util.Map.Entry ? (java.util.Map.Entry) obj : null;
        return entry != null && p247y7.AbstractC7350t.b(entry.getKey(), getKey()) && p247y7.AbstractC7350t.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f16991C;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f16992D;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        java.lang.Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
