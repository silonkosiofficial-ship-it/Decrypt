package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5398uu0 implements com.google.android.gms.internal.ads.Bu0 {
    @Override // com.google.android.gms.internal.ads.Bu0
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.String str, java.security.Provider provider) {
        return provider == null ? javax.crypto.KeyAgreement.getInstance(str) : javax.crypto.KeyAgreement.getInstance(str, provider);
    }
}
