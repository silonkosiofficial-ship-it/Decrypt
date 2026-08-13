package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Ho0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f28108a = e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void a(int[] iArr, int i6, int i10, int i11, int i12) {
        int i13 = iArr[i6] + iArr[i10];
        iArr[i6] = i13;
        int i14 = i13 ^ iArr[i12];
        int i15 = (i14 >>> (-16)) | (i14 << 16);
        iArr[i12] = i15;
        int i16 = iArr[i11] + i15;
        iArr[i11] = i16;
        int i17 = iArr[i10] ^ i16;
        int i18 = (i17 >>> (-12)) | (i17 << 12);
        iArr[i10] = i18;
        int i19 = iArr[i6] + i18;
        iArr[i6] = i19;
        int i20 = iArr[i12] ^ i19;
        int i21 = (i20 >>> (-8)) | (i20 << 8);
        iArr[i12] = i21;
        int i22 = iArr[i11] + i21;
        iArr[i11] = i22;
        int i23 = iArr[i10] ^ i22;
        iArr[i10] = (i23 >>> (-7)) | (i23 << 7);
    }

    static void b(int[] iArr, int[] iArr2) {
        int[] iArr3 = f28108a;
        java.lang.System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        java.lang.System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void c(int[] iArr) {
        for (int i6 = 0; i6 < 10; i6++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    static int[] d(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        b(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        c(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return java.util.Arrays.copyOf(iArr3, 8);
    }

    static int[] e(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new java.lang.IllegalArgumentException("invalid input length");
        }
        java.nio.IntBuffer intBufferAsIntBuffer = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
