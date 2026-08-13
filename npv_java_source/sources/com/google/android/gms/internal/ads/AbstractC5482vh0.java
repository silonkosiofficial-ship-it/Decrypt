package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5482vh0 implements java.util.Map.Entry {
    AbstractC5482vh0() {
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (com.google.android.gms.internal.ads.AbstractC5700xg0.a(getKey(), entry.getKey()) && com.google.android.gms.internal.ads.AbstractC5700xg0.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getKey();

    @Override // java.util.Map.Entry
    public abstract java.lang.Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object key = getKey();
        java.lang.Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(getKey()) + "=" + java.lang.String.valueOf(getValue());
    }
}
