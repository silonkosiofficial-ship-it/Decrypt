package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Au0 implements com.google.android.gms.internal.ads.Bu0 {
    @Override // com.google.android.gms.internal.ads.Bu0
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.String str, java.security.Provider provider) {
        return provider == null ? java.security.Signature.getInstance(str) : java.security.Signature.getInstance(str, provider);
    }
}
