package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class NZ implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f30326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30327b;

    public NZ(double d6, boolean z6) {
        this.f30326a = d6;
        this.f30327b = z6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        android.os.Bundle bundleA = com.google.android.gms.internal.ads.B70.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        android.os.Bundle bundleA2 = com.google.android.gms.internal.ads.B70.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f30327b);
        bundleA2.putDouble("battery_level", this.f30326a);
    }
}
