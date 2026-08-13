package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Jr0 implements com.google.android.gms.internal.ads.Xq0 {
    public Jr0(com.google.android.gms.internal.ads.C3525dr0 c3525dr0) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(2)) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
