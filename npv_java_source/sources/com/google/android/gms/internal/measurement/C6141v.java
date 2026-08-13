package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6141v implements com.google.android.gms.internal.measurement.InterfaceC6117s {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f41245C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.ArrayList f41246D;

    public C6141v(java.lang.String str, java.util.List list) {
        this.f41245C = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f41246D = arrayList;
        arrayList.addAll(list);
    }

    public final java.lang.String a() {
        return this.f41245C;
    }

    public final java.util.ArrayList b() {
        return this.f41246D;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Double d() {
        throw new java.lang.IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.String e() {
        throw new java.lang.IllegalStateException("Statement cannot be cast as String");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.C6141v)) {
            return false;
        }
        com.google.android.gms.internal.measurement.C6141v c6141v = (com.google.android.gms.internal.measurement.C6141v) obj;
        java.lang.String str = this.f41245C;
        if (str == null ? c6141v.f41245C != null : !str.equals(c6141v.f41245C)) {
            return false;
        }
        java.util.ArrayList arrayList = this.f41246D;
        java.util.ArrayList arrayList2 = c6141v.f41246D;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        return arrayList2 == null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Boolean f() {
        throw new java.lang.IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.util.Iterator g() {
        return null;
    }

    public final int hashCode() {
        java.lang.String str = this.f41245C;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.util.ArrayList arrayList = this.f41246D;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s n(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        throw new java.lang.IllegalStateException("Statement is not an evaluated entity");
    }
}
