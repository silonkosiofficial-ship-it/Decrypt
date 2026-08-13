package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3641eu0 extends java.lang.ThreadLocal {
    C3641eu0() {
    }

    protected static final javax.crypto.Cipher a() {
        try {
            return (javax.crypto.Cipher) com.google.android.gms.internal.ads.C5178su0.f38818b.a("AES/CTR/NoPadding");
        } catch (java.security.GeneralSecurityException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        return a();
    }
}
