package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class H20 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Bundle f27953a;

    public H20(android.os.Bundle bundle) {
        this.f27953a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (this.f27953a.isEmpty()) {
            return;
        }
        c3677fC.f35302b.putBundle("shared_pref", this.f27953a);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (this.f27953a.isEmpty()) {
            return;
        }
        c3677fC.f35301a.putBundle("shared_pref", this.f27953a);
    }
}
