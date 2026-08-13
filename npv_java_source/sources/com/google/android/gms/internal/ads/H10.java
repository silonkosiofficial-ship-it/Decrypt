package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class H10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.Q60 f27952a;

    public H10(com.google.android.gms.internal.ads.Q60 q60) {
        this.f27952a = q60;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (this.f27952a != null) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ob)).booleanValue()) {
                return;
            }
            c3677fC.f35301a.putBoolean("render_in_browser", this.f27952a.d());
            c3677fC.f35301a.putBoolean("disable_ml", this.f27952a.c());
        }
    }
}
