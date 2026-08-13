package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3599eZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f35003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f35004b;

    C3599eZ(com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context) {
        this.f35004b = yk0;
        this.f35003a = context;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        final android.content.ContentResolver contentResolver;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Kc)).booleanValue() && (contentResolver = this.f35003a.getContentResolver()) != null) {
            return this.f35004b.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.dZ
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    android.content.ContentResolver contentResolver2 = contentResolver;
                    return new com.google.android.gms.internal.ads.C3709fZ(android.provider.Settings.Secure.getString(contentResolver2, "advertising_id"), android.provider.Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
                }
            });
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C3709fZ(null, false));
    }
}
