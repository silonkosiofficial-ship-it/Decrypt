package W6;

/* JADX INFO: loaded from: classes3.dex */
final class s implements java.util.Map.Entry, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f15379C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object f15380D;

    public s(java.lang.Object obj, java.lang.Object obj2) {
        this.f15379C = obj;
        this.f15380D = obj2;
    }

    public void a(java.lang.Object obj) {
        this.f15380D = obj;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return p247y7.AbstractC7350t.b(entry.getKey(), getKey()) && p247y7.AbstractC7350t.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f15379C;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f15380D;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Object key = getKey();
        p247y7.AbstractC7350t.c(key);
        int iHashCode = key.hashCode() + 527;
        java.lang.Object value = getValue();
        p247y7.AbstractC7350t.c(value);
        return iHashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        a(obj);
        return getValue();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
