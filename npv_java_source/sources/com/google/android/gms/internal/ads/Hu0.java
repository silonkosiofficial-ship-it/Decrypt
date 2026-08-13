package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Hu0 implements com.google.android.gms.internal.ads.Qr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.ThreadLocal f28114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f28115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.security.Key f28116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28117d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public Hu0(java.lang.String str, java.security.Key key) throws java.security.GeneralSecurityException {
        byte b6;
        int i6;
        com.google.android.gms.internal.ads.Gu0 gu0 = new com.google.android.gms.internal.ads.Gu0(this);
        this.f28114a = gu0;
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(2)) {
            throw new java.security.GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f28115b = str;
        this.f28116c = key;
        if (key.getEncoded().length < 16) {
            throw new java.security.InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b6 = 0;
                break;
            case "HMACSHA224":
                b6 = 1;
                break;
            case "HMACSHA256":
                b6 = 2;
                break;
            case "HMACSHA384":
                b6 = 3;
                break;
            case "HMACSHA512":
                b6 = 4;
                break;
            default:
                b6 = -1;
                break;
        }
        if (b6 == 0) {
            i6 = 20;
        } else if (b6 == 1) {
            i6 = 28;
        } else if (b6 == 2) {
            i6 = 32;
        } else if (b6 == 3) {
            i6 = 48;
        } else {
            if (b6 != 4) {
                throw new java.security.NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i6 = 64;
        }
        this.f28117d = i6;
        gu0.get();
    }

    @Override // com.google.android.gms.internal.ads.Qr0
    public final byte[] a(byte[] bArr, int i6) throws java.security.InvalidAlgorithmParameterException {
        if (i6 > this.f28117d) {
            throw new java.security.InvalidAlgorithmParameterException("tag size too big");
        }
        ((javax.crypto.Mac) this.f28114a.get()).update(bArr);
        return java.util.Arrays.copyOf(((javax.crypto.Mac) this.f28114a.get()).doFinal(), i6);
    }
}
