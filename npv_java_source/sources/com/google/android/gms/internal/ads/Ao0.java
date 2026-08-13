package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Ao0 extends java.lang.ThreadLocal {
    Ao0() {
    }

    protected static final javax.crypto.Cipher a() {
        try {
            javax.crypto.Cipher cipher = (javax.crypto.Cipher) com.google.android.gms.internal.ads.C5178su0.f38818b.a("ChaCha20-Poly1305");
            if (com.google.android.gms.internal.ads.Bo0.f(cipher)) {
                return cipher;
            }
            return null;
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        return a();
    }
}
