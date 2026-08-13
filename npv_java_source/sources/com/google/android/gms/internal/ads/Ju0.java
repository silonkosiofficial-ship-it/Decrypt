package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ju0 {
    static {
        java.lang.String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+");
        java.lang.String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+");
    }

    public static void a(int i6) throws java.security.InvalidAlgorithmParameterException {
        if (i6 != 16 && i6 != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i6 * 8)));
        }
    }
}
