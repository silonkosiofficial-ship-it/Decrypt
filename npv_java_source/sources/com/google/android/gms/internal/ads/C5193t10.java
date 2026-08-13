package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5193t10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f38847a;

    public C5193t10(java.lang.Boolean bool) {
        this.f38847a = bool;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.lang.Boolean bool = this.f38847a;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (bool != null) {
            c3677fC.f35301a.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
