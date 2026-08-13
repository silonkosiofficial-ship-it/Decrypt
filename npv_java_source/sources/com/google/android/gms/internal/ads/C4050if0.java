package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.if0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4050if0 extends com.google.android.gms.internal.ads.AbstractC2605Mf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f36328b;

    /* synthetic */ C4050if0(int i6, java.lang.String str, com.google.android.gms.internal.ads.AbstractC3941hf0 abstractC3941hf0) {
        this.f36327a = i6;
        this.f36328b = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2605Mf0
    public final int a() {
        return this.f36327a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2605Mf0
    public final java.lang.String b() {
        return this.f36328b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.AbstractC2605Mf0) {
            com.google.android.gms.internal.ads.AbstractC2605Mf0 abstractC2605Mf0 = (com.google.android.gms.internal.ads.AbstractC2605Mf0) obj;
            if (this.f36327a == abstractC2605Mf0.a()) {
                java.lang.String str = this.f36328b;
                java.lang.String strB = abstractC2605Mf0.b();
                if (str != null ? str.equals(strB) : strB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f36328b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f36327a ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "OverlayDisplayState{statusCode=" + this.f36327a + ", sessionToken=" + this.f36328b + "}";
    }
}
