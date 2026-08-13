package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Cu0 {
    public static byte[] a(java.lang.String str) {
        if (str.length() % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            int i10 = i6 + i6;
            int iDigit = java.lang.Character.digit(str.charAt(i10), 16);
            int iDigit2 = java.lang.Character.digit(str.charAt(i10 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new java.lang.IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i6] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }
}
