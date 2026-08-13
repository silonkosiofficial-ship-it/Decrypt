package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3521dp0 extends java.lang.ThreadLocal {
    C3521dp0() {
    }

    protected static final javax.crypto.Cipher a() {
        try {
            javax.crypto.Cipher cipher = (javax.crypto.Cipher) com.google.android.gms.internal.ads.C5178su0.f38818b.a("AES/GCM-SIV/NoPadding");
            if (com.google.android.gms.internal.ads.C3631ep0.d(cipher)) {
                return cipher;
            }
            return null;
        } catch (java.security.GeneralSecurityException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        return a();
    }
}
