package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class S20 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31528b;

    S20(int i6, int i10) {
        this.f31527a = i6;
        this.f31528b = i10;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a;
        int i6 = this.f31527a;
        if (i6 == -1 || this.f31528b == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i6);
        bundle.putInt("crashes_without_flags", this.f31528b);
        int i10 = p184s3.C7147y.f54347g;
        if (p184s3.A.c().e()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
