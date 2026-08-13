package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4754p10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37902a;

    public C4754p10(boolean z6) {
        this.f37902a = z6;
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.C3677fC) obj).f35302b.putBoolean("is_gbid", this.f37902a);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.C3677fC) obj).f35301a.putBoolean("is_gbid", this.f37902a);
    }
}
