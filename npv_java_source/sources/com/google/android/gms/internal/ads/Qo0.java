package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Qo0 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long jB = b(bArr, 0, 0);
        long jB2 = b(bArr, 3, 2) & 67108611;
        long jB3 = b(bArr, 6, 4) & 67092735;
        long jB4 = b(bArr, 9, 6) & 66076671;
        long jB5 = b(bArr, 12, 8) & 1048575;
        int i6 = 17;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            int length = bArr2.length;
            if (i10 >= length) {
                long j14 = j6 + (j10 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j11 + (j14 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j12 + (j16 >> 26);
                long j19 = j18 & 67108863;
                long j20 = j13 + ((j18 >> 26) * 5);
                long j21 = j20 & 67108863;
                long j22 = j21 + 5;
                long j23 = (j10 & 67108863) + (j20 >> 26);
                long j24 = j23 + (j22 >> 26);
                long j25 = (j24 >> 26) + j15;
                long j26 = j17 + (j25 >> 26);
                long j27 = (j19 + (j26 >> 26)) - 67108864;
                long j28 = j27 >> 63;
                long j29 = ~j28;
                long j30 = (j23 & j28) | (j24 & 67108863 & j29);
                long j31 = (j15 & j28) | (j25 & 67108863 & j29);
                long j32 = (j17 & j28) | (j26 & 67108863 & j29);
                long j33 = (j19 & j28) | (j27 & j29);
                long jC = (((j28 & j21) | (j22 & 67108863 & j29) | (j30 << 26)) & 4294967295L) + c(bArr, 16);
                long jC2 = (((j30 >> 6) | (j31 << 20)) & 4294967295L) + c(bArr, 20);
                long jC3 = (((j31 >> 12) | (j32 << 14)) & 4294967295L) + c(bArr, 24);
                long jC4 = (((j32 >> 18) | (j33 << 8)) & 4294967295L) + c(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, jC & 4294967295L, 0);
                long j34 = jC2 + (jC >> 32);
                d(bArr4, j34 & 4294967295L, 4);
                long j35 = jC3 + (j34 >> 32);
                d(bArr4, j35 & 4294967295L, 8);
                d(bArr4, (jC4 + (j35 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = java.lang.Math.min(16, length - i10);
            java.lang.System.arraycopy(bArr2, i10, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                java.util.Arrays.fill(bArr3, iMin + 1, i6, (byte) 0);
            }
            long j36 = jB5 * 5;
            long j37 = jB4 * 5;
            long j38 = jB3 * 5;
            long jB6 = j13 + b(bArr3, 0, 0);
            long jB7 = j10 + b(bArr3, 3, 2);
            long jB8 = j6 + b(bArr3, 6, 4);
            long jB9 = j11 + b(bArr3, 9, 6);
            long jB10 = j12 + (b(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j39 = jB7 * jB;
            long j40 = jB7 * jB2;
            long j41 = jB7 * jB3;
            long j42 = jB9 * jB;
            long j43 = jB7 * jB4;
            long j44 = jB10 * jB;
            long j45 = (jB6 * jB) + (jB7 * j36) + (jB8 * j37) + (jB9 * j38) + (jB2 * 5 * jB10);
            long j46 = (jB6 * jB2) + j39 + (jB8 * j36) + (jB9 * j37) + (j38 * jB10) + (j45 >> 26);
            long j47 = (jB6 * jB3) + j40 + (jB8 * jB) + (jB9 * j36) + (j37 * jB10) + (j46 >> 26);
            long j48 = (jB6 * jB4) + j41 + (jB8 * jB2) + j42 + (jB10 * j36) + (j47 >> 26);
            long j49 = (jB6 * jB5) + j43 + (jB8 * jB3) + (jB9 * jB2) + j44 + (j48 >> 26);
            long j50 = (j45 & 67108863) + ((j49 >> 26) * 5);
            j10 = (j46 & 67108863) + (j50 >> 26);
            i10 += 16;
            j6 = j47 & 67108863;
            j11 = j48 & 67108863;
            j12 = j49 & 67108863;
            i6 = 17;
            j13 = j50 & 67108863;
        }
    }

    private static long b(byte[] bArr, int i6, int i10) {
        return (c(bArr, i6) >> i10) & 67108863;
    }

    private static long c(byte[] bArr, int i6) {
        int i10 = bArr[i6] & 255;
        int i11 = bArr[i6 + 1] & 255;
        int i12 = bArr[i6 + 2] & 255;
        return ((long) (((bArr[i6 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16))) & 4294967295L;
    }

    private static void d(byte[] bArr, long j6, int i6) {
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i6 + i10] = (byte) (255 & j6);
            j6 >>= 8;
        }
    }
}
