package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5486vj0 {
    static {
        new com.google.android.gms.internal.ads.C5266tj0();
    }

    public static java.io.InputStream a(java.io.InputStream inputStream, long j6) {
        return new com.google.android.gms.internal.ads.C5376uj0(inputStream, j6);
    }

    public static byte[] b(java.io.InputStream inputStream) throws java.io.IOException {
        inputStream.getClass();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(20);
        int iHighestOneBit = java.lang.Integer.highestOneBit(0);
        int iMin = java.lang.Math.min(8192, java.lang.Math.max(128, iHighestOneBit + iHighestOneBit));
        int i6 = 0;
        while (i6 < 2147483639) {
            int iMin2 = java.lang.Math.min(iMin, 2147483639 - i6);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < iMin2) {
                int i11 = inputStream.read(bArr, i10, iMin2 - i10);
                if (i11 == -1) {
                    return c(arrayDeque, i6);
                }
                i10 += i11;
                i6 += i11;
            }
            iMin = com.google.android.gms.internal.ads.AbstractC2466Ij0.e(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return c(arrayDeque, 2147483639);
        }
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] c(java.util.Queue queue, int i6) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i6) {
            return bArr;
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i6);
        int i10 = i6 - length;
        while (i10 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = java.lang.Math.min(i10, bArr2.length);
            java.lang.System.arraycopy(bArr2, 0, bArrCopyOf, i6 - i10, iMin);
            i10 -= iMin;
        }
        return bArrCopyOf;
    }
}
