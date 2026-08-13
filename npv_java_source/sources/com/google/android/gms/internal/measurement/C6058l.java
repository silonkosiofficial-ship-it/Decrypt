package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6058l implements com.google.android.gms.internal.measurement.InterfaceC6117s {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.InterfaceC6117s f41020C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f41021D;

    public C6058l(java.lang.String str) {
        this.f41020C = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
        this.f41021D = str;
    }

    public C6058l(java.lang.String str, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        this.f41020C = interfaceC6117s;
        this.f41021D = str;
    }

    public final com.google.android.gms.internal.measurement.InterfaceC6117s a() {
        return this.f41020C;
    }

    public final java.lang.String b() {
        return this.f41021D;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s c() {
        return new com.google.android.gms.internal.measurement.C6058l(this.f41021D, this.f41020C.c());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Double d() {
        throw new java.lang.IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.String e() {
        throw new java.lang.IllegalStateException("Control is not a String");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.C6058l)) {
            return false;
        }
        com.google.android.gms.internal.measurement.C6058l c6058l = (com.google.android.gms.internal.measurement.C6058l) obj;
        return this.f41021D.equals(c6058l.f41021D) && this.f41020C.equals(c6058l.f41020C);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Boolean f() {
        throw new java.lang.IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.util.Iterator g() {
        return null;
    }

    public final int hashCode() {
        return (this.f41021D.hashCode() * 31) + this.f41020C.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s n(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        throw new java.lang.IllegalStateException("Control does not have functions");
    }
}
