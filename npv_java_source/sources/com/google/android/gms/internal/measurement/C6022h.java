package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6022h implements com.google.android.gms.internal.measurement.InterfaceC6117s {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f40954C;

    public C6022h(java.lang.Boolean bool) {
        this.f40954C = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s c() {
        return new com.google.android.gms.internal.measurement.C6022h(java.lang.Boolean.valueOf(this.f40954C));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Double d() {
        return java.lang.Double.valueOf(this.f40954C ? 1.0d : 0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.String e() {
        return java.lang.Boolean.toString(this.f40954C);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.gms.internal.measurement.C6022h) && this.f40954C == ((com.google.android.gms.internal.measurement.C6022h) obj).f40954C;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Boolean f() {
        return java.lang.Boolean.valueOf(this.f40954C);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.util.Iterator g() {
        return null;
    }

    public final int hashCode() {
        return java.lang.Boolean.valueOf(this.f40954C).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s n(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        if ("toString".equals(str)) {
            return new com.google.android.gms.internal.measurement.C6133u(java.lang.Boolean.toString(this.f40954C));
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s.%s is not a function.", java.lang.Boolean.toString(this.f40954C), str));
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.f40954C);
    }
}
