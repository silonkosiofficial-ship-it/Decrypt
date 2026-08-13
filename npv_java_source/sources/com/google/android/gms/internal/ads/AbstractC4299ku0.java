package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ku0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4299ku0 {
    public static final void a(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, int i6) {
        if (i6 < 0 || byteBuffer2.remaining() < i6 || byteBuffer3.remaining() < i6 || byteBuffer.remaining() < i6) {
            throw new java.lang.IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i10 = 0; i10 < i6; i10++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] b(byte[]... bArr) throws java.security.GeneralSecurityException {
        int i6 = 0;
        int i10 = 0;
        while (true) {
            if (i6 >= bArr.length) {
                byte[] bArr2 = new byte[i10];
                int i11 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    java.lang.System.arraycopy(bArr3, 0, bArr2, i11, length);
                    i11 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i6].length;
            if (i10 > Integer.MAX_VALUE - length2) {
                throw new java.security.GeneralSecurityException("exceeded size limit");
            }
            i10 += length2;
            i6++;
        }
    }

    public static final byte[] c(byte[] bArr, int i6, byte[] bArr2, int i10, int i11) {
        if (bArr.length - 16 < i6) {
            throw new java.lang.IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i12 = 0; i12 < 16; i12++) {
            bArr3[i12] = (byte) (bArr[i12 + i6] ^ bArr2[i12]);
        }
        return bArr3;
    }
}
