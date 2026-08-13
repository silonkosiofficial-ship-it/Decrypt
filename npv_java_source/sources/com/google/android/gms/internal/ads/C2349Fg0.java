package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2349Fg0 extends com.google.android.gms.internal.ads.AbstractC5810yg0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f27444C;

    C2349Fg0(java.lang.Object obj) {
        this.f27444C = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5810yg0
    public final com.google.android.gms.internal.ads.AbstractC5810yg0 a(com.google.android.gms.internal.ads.InterfaceC4821pg0 interfaceC4821pg0) {
        java.lang.Object objApply = interfaceC4821pg0.apply(this.f27444C);
        com.google.android.gms.internal.ads.AbstractC2164Ag0.c(objApply, "the Function passed to Optional.transform() must not return null.");
        return new com.google.android.gms.internal.ads.C2349Fg0(objApply);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5810yg0
    public final java.lang.Object b(java.lang.Object obj) {
        return this.f27444C;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.C2349Fg0) {
            return this.f27444C.equals(((com.google.android.gms.internal.ads.C2349Fg0) obj).f27444C);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27444C.hashCode() + 1502476572;
    }

    public final java.lang.String toString() {
        return "Optional.of(" + this.f27444C.toString() + ")";
    }
}
