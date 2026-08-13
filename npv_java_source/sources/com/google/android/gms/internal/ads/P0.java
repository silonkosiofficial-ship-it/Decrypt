package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P0 {
    public static int a(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int b(java.nio.ByteBuffer byteBuffer) {
        int i6;
        if ((byteBuffer.get(5) & 2) == 0) {
            i6 = 0;
        } else {
            byte b6 = byteBuffer.get(26);
            int i10 = 28;
            int i11 = 28;
            for (int i12 = 0; i12 < b6; i12++) {
                i11 += byteBuffer.get(i12 + 27);
            }
            byte b10 = byteBuffer.get(i11 + 26);
            for (int i13 = 0; i13 < b10; i13++) {
                i10 += byteBuffer.get(i11 + 27 + i13);
            }
            i6 = i11 + i10;
        }
        int i14 = byteBuffer.get(i6 + 26) + 27 + i6;
        return (int) ((g(byteBuffer.get(i14), byteBuffer.limit() - i14 > 1 ? byteBuffer.get(i14 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int c(java.nio.ByteBuffer byteBuffer) {
        return (int) ((g(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long d(byte[] bArr) {
        return g(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static java.util.List e(byte[] bArr) {
        long jA = a(bArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(i(h(jA)));
        arrayList.add(i(h(3840L)));
        return arrayList;
    }

    public static boolean f(long j6, long j10) {
        return j6 - j10 <= h(3840L) / 1000;
    }

    private static long g(byte b6, byte b10) {
        int i6;
        int i10;
        int i11 = b6 & 255;
        int i12 = b6 & 3;
        if (i12 != 0) {
            i6 = 2;
            if (i12 != 1 && i12 != 2) {
                i6 = b10 & 63;
            }
        } else {
            i6 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        if (i13 >= 16) {
            i10 = 2500 << i14;
        } else if (i13 >= 12) {
            i10 = 10000 << (i13 & 1);
        } else {
            i10 = i14 == 3 ? 60000 : 10000 << i14;
        }
        return ((long) i6) * ((long) i10);
    }

    private static long h(long j6) {
        return (j6 * 1000000000) / 48000;
    }

    private static byte[] i(long j6) {
        return java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(j6).array();
    }
}
