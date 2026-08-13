package N4;

/* JADX INFO: renamed from: N4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1403c implements java.util.Map.Entry {
    AbstractC1403c() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return M4.f.a(getKey(), entry.getKey()) && M4.f.a(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getKey();

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Object key = getKey();
        java.lang.Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(getKey());
        java.lang.String strValueOf2 = java.lang.String.valueOf(getValue());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
