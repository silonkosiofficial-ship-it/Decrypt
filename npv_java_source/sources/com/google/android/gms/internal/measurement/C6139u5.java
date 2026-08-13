package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6139u5 implements java.lang.Comparable, java.util.Map.Entry {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Comparable f41235C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object f41236D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.AbstractC6108q5 f41237E;

    C6139u5(com.google.android.gms.internal.measurement.AbstractC6108q5 abstractC6108q5, java.lang.Comparable comparable, java.lang.Object obj) {
        this.f41237E = abstractC6108q5;
        this.f41235C = comparable;
        this.f41236D = obj;
    }

    C6139u5(com.google.android.gms.internal.measurement.AbstractC6108q5 abstractC6108q5, java.util.Map.Entry entry) {
        this(abstractC6108q5, (java.lang.Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean e(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return ((java.lang.Comparable) getKey()).compareTo((java.lang.Comparable) ((com.google.android.gms.internal.measurement.C6139u5) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return e(this.f41235C, entry.getKey()) && e(this.f41236D, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
        return this.f41235C;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f41236D;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.f41235C;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.f41236D;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.f41237E.s();
        java.lang.Object obj2 = this.f41236D;
        this.f41236D = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.f41235C) + "=" + java.lang.String.valueOf(this.f41236D);
    }
}
