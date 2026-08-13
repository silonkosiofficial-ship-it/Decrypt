package j$.util;

/* JADX INFO: renamed from: j$.util.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6724p implements java.util.Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.Map.Entry f48173a;

    C6724p(java.util.Map.Entry entry) {
        this.f48173a = (java.util.Map.Entry) j$.util.Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Map.Entry entry2 = this.f48173a;
        java.lang.Object key = entry2.getKey();
        java.lang.Object key2 = entry.getKey();
        if (key == null) {
            zEquals = key2 == null;
        } else {
            zEquals = key.equals(key2);
        }
        if (zEquals) {
            java.lang.Object value = entry2.getValue();
            java.lang.Object value2 = entry.getValue();
            if (value == null) {
                zEquals2 = value2 == null;
            } else {
                zEquals2 = value.equals(value2);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f48173a.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f48173a.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f48173a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return this.f48173a.toString();
    }
}
