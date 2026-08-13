package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Uw0 {
    Uw0() {
    }

    static final java.lang.String c(java.nio.ByteBuffer byteBuffer, int i6, int i10) throws com.google.android.gms.internal.ads.Vv0 {
        int i11;
        if ((((byteBuffer.limit() - i6) - i10) | i6 | i10) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10)));
        }
        int i12 = i6 + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (i6 < i12) {
            byte b6 = byteBuffer.get(i6);
            if (!com.google.android.gms.internal.ads.Tw0.d(b6)) {
                break;
            }
            i6++;
            cArr[i13] = (char) b6;
            i13++;
        }
        int i14 = i13;
        while (i6 < i12) {
            int i15 = i6 + 1;
            byte b10 = byteBuffer.get(i6);
            if (com.google.android.gms.internal.ads.Tw0.d(b10)) {
                cArr[i14] = (char) b10;
                i14++;
                i6 = i15;
                while (i6 < i12) {
                    byte b11 = byteBuffer.get(i6);
                    if (!com.google.android.gms.internal.ads.Tw0.d(b11)) {
                        break;
                    }
                    i6++;
                    cArr[i14] = (char) b11;
                    i14++;
                }
            } else {
                if (com.google.android.gms.internal.ads.Tw0.f(b10)) {
                    if (i15 >= i12) {
                        throw new com.google.android.gms.internal.ads.Vv0("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    i6 += 2;
                    com.google.android.gms.internal.ads.Tw0.c(b10, byteBuffer.get(i15), cArr, i14);
                } else if (com.google.android.gms.internal.ads.Tw0.e(b10)) {
                    if (i15 >= i12 - 1) {
                        throw new com.google.android.gms.internal.ads.Vv0("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    int i16 = i6 + 2;
                    i6 += 3;
                    com.google.android.gms.internal.ads.Tw0.b(b10, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i14);
                } else {
                    if (i15 >= i12 - 2) {
                        throw new com.google.android.gms.internal.ads.Vv0("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = byteBuffer.get(i15);
                    int i17 = i6 + 3;
                    byte b13 = byteBuffer.get(i6 + 2);
                    i6 += 4;
                    com.google.android.gms.internal.ads.Tw0.a(b10, b12, b13, byteBuffer.get(i17), cArr, i14);
                    i14 += 2;
                }
                i14 = i11;
            }
        }
        return new java.lang.String(cArr, 0, i14);
    }

    abstract int a(int i6, byte[] bArr, int i10, int i11);

    abstract java.lang.String b(byte[] bArr, int i6, int i10);
}
