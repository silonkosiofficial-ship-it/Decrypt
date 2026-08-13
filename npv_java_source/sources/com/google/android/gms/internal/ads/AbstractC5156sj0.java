package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5156sj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC5156sj0 f38794a;

    static {
        new com.google.android.gms.internal.ads.C4607nj0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new com.google.android.gms.internal.ads.C4607nj0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new com.google.android.gms.internal.ads.C4827pj0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new com.google.android.gms.internal.ads.C4827pj0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f38794a = new com.google.android.gms.internal.ads.C4497mj0("base16()", "0123456789ABCDEF");
    }

    AbstractC5156sj0() {
    }

    public static com.google.android.gms.internal.ads.AbstractC5156sj0 g() {
        return f38794a;
    }

    abstract int a(byte[] bArr, java.lang.CharSequence charSequence);

    abstract void b(java.lang.Appendable appendable, byte[] bArr, int i6, int i10);

    abstract int c(int i6);

    abstract int d(int i6);

    public abstract com.google.android.gms.internal.ads.AbstractC5156sj0 e();

    abstract java.lang.CharSequence f(java.lang.CharSequence charSequence);

    public final java.lang.String h(byte[] bArr, int i6, int i10) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.k(0, i10, bArr.length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(d(i10));
        try {
            b(sb, bArr, 0, i10);
            return sb.toString();
        } catch (java.io.IOException e6) {
            throw new java.lang.AssertionError(e6);
        }
    }

    public final byte[] i(java.lang.CharSequence charSequence) {
        try {
            java.lang.CharSequence charSequenceF = f(charSequence);
            int iC = c(charSequenceF.length());
            byte[] bArr = new byte[iC];
            int iA = a(bArr, charSequenceF);
            if (iA == iC) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (com.google.android.gms.internal.ads.C4717oj0 e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }
}
