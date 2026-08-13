package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6173z implements com.google.android.gms.internal.measurement.InterfaceC6117s {
    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s c() {
        return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Double d() {
        return java.lang.Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.String e() {
        return "undefined";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof com.google.android.gms.internal.measurement.C6173z;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Boolean f() {
        return java.lang.Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.util.Iterator g() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s n(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        throw new java.lang.IllegalStateException(java.lang.String.format("Undefined has no function %s", str));
    }
}
