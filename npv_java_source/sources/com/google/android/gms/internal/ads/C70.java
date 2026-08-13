package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class C70 {
    public C70() {
        try {
            com.google.android.gms.internal.ads.AbstractC3187am0.a();
        } catch (java.security.GeneralSecurityException e6) {
            p214v3.AbstractC7265q0.k("Failed to Configure Aead. ".concat(e6.toString()));
            p174r3.v.s().x(e6, "CryptoUtils.registerAead");
        }
    }

    public static final java.lang.String a() {
        byte[] byteArray;
        try {
            com.google.android.gms.internal.ads.Ol0 ol0B = com.google.android.gms.internal.ads.Ol0.b(com.google.android.gms.internal.ads.Il0.a(com.google.android.gms.internal.ads.Vp0.b().a("AES128_GCM")));
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                com.google.android.gms.internal.ads.AbstractC5710xl0.b(ol0B, com.google.android.gms.internal.ads.C5600wl0.b(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (java.io.IOException unused) {
                throw new java.security.GeneralSecurityException("Serialize keyset failed");
            }
        } catch (java.security.GeneralSecurityException e6) {
            p214v3.AbstractC7265q0.k("Failed to generate key".concat(e6.toString()));
            p174r3.v.s().x(e6, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return android.util.Base64.encodeToString(byteArray, 11);
    }

    public static final java.lang.String b(byte[] bArr, byte[] bArr2, java.lang.String str, com.google.android.gms.internal.ads.YN yn) {
        com.google.android.gms.internal.ads.Ol0 ol0C;
        if (str != null && (ol0C = c(str)) != null) {
            try {
                byte[] bArrA = ((com.google.android.gms.internal.ads.InterfaceC5380ul0) ol0C.d(com.google.android.gms.internal.ads.Bq0.d(), com.google.android.gms.internal.ads.InterfaceC5380ul0.class)).a(bArr, bArr2);
                yn.b().put("ds", "1");
                return new java.lang.String(bArrA, "UTF-8");
            } catch (java.io.UnsupportedEncodingException | java.lang.UnsupportedOperationException | java.security.GeneralSecurityException e6) {
                p214v3.AbstractC7265q0.k("Failed to decrypt ".concat(e6.toString()));
                p174r3.v.s().x(e6, "CryptoUtils.decrypt");
                yn.b().put("dsf", e6.toString());
            }
        }
        return null;
    }

    private static final com.google.android.gms.internal.ads.Ol0 c(java.lang.String str) {
        try {
            try {
                return com.google.android.gms.internal.ads.AbstractC5710xl0.a(com.google.android.gms.internal.ads.C5490vl0.b(android.util.Base64.decode(str, 11)));
            } catch (java.io.IOException unused) {
                throw new java.security.GeneralSecurityException("Parse keyset failed");
            }
        } catch (java.security.GeneralSecurityException e6) {
            p214v3.AbstractC7265q0.k("Failed to get keysethandle".concat(e6.toString()));
            p174r3.v.s().x(e6, "CryptoUtils.getHandle");
            return null;
        }
    }
}
