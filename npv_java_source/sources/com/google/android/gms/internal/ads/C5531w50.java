package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5531w50 implements com.google.android.gms.internal.ads.InterfaceC4821pg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.B50 f39535a;

    C5531w50(com.google.android.gms.internal.ads.B50 b50) {
        this.f39535a = b50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        p224w3.p.e("", (com.google.android.gms.internal.ads.AR) obj);
        p214v3.AbstractC7265q0.k("Failed to get a cache key, reverting to legacy flow.");
        com.google.android.gms.internal.ads.B50 b50 = this.f39535a;
        b50.f25901d = new com.google.android.gms.internal.ads.C5751y50(null, b50.e(), null);
        return this.f39535a.f25901d;
    }
}
