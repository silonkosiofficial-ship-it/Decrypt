package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hr0 {
    public static byte[] a(byte[] bArr) {
        if (bArr.length != 16) {
            throw new java.lang.IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i6 = 0;
        while (i6 < 16) {
            int i10 = i6 + 1;
            byte b6 = bArr[i6];
            byte b10 = (byte) ((b6 + b6) & 254);
            bArr2[i6] = b10;
            if (i6 < 15) {
                bArr2[i6] = (byte) (((bArr[i10] >> 7) & 1) | b10);
            }
            i6 = i10;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
