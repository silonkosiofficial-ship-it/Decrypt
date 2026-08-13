package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Kq0 {
    static {
        java.nio.charset.Charset.forName("UTF-8");
    }

    public static final com.google.android.gms.internal.ads.Lu0 a(java.lang.String str) throws java.security.GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new java.security.GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i6] = (byte) cCharAt;
        }
        return com.google.android.gms.internal.ads.Lu0.b(bArr);
    }

    public static final com.google.android.gms.internal.ads.Lu0 b(java.lang.String str) {
        byte[] bArr = new byte[str.length()];
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new com.google.android.gms.internal.ads.Jq0("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i6] = (byte) cCharAt;
        }
        return com.google.android.gms.internal.ads.Lu0.b(bArr);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i6 = 0; i6 < bArr.length; i6++) {
            if (bArr2[i6] != bArr[i6]) {
                return false;
            }
        }
        return true;
    }
}
