package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class A10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f25007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f25011e;

    public A10(java.lang.String str, boolean z6, boolean z10, boolean z11, boolean z12) {
        this.f25007a = str;
        this.f25008b = z6;
        this.f25009c = z10;
        this.f25010d = z11;
        this.f25011e = z12;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35302b;
        if (!this.f25007a.isEmpty()) {
            bundle.putString("inspector_extras", this.f25007a);
        }
        bundle.putInt("test_mode", this.f25008b ? 1 : 0);
        bundle.putInt("linked_device", this.f25009c ? 1 : 0);
        if (this.f25008b || this.f25009c) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25588i9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f25011e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        if (!this.f25007a.isEmpty()) {
            bundle.putString("inspector_extras", this.f25007a);
        }
        bundle.putInt("test_mode", this.f25008b ? 1 : 0);
        bundle.putInt("linked_device", this.f25009c ? 1 : 0);
        if (this.f25008b || this.f25009c) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25544e9)).booleanValue()) {
                bundle.putInt("risd", !this.f25010d ? 1 : 0);
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25588i9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f25011e);
            }
        }
    }
}
