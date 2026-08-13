package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Xw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Uw0 f33227a;

    static {
        if (com.google.android.gms.internal.ads.Sw0.a() && com.google.android.gms.internal.ads.Sw0.b()) {
            int i6 = com.google.android.gms.internal.ads.Ru0.f31388a;
        }
        f33227a = new com.google.android.gms.internal.ads.Vw0();
    }

    static /* bridge */ /* synthetic */ int c(byte[] bArr, int i6, int i10) {
        int i11 = i10 - i6;
        byte b6 = bArr[i6 - 1];
        if (i11 == 0) {
            if (b6 > -12) {
                return -1;
            }
            return b6;
        }
        if (i11 == 1) {
            return i(b6, bArr[i6]);
        }
        if (i11 == 2) {
            return j(b6, bArr[i6], bArr[i6 + 1]);
        }
        throw new java.lang.AssertionError();
    }

    static int d(java.lang.String str, byte[] bArr, int i6, int i10) {
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int length = str.length();
        int i14 = 0;
        while (true) {
            i11 = i6 + i10;
            if (i14 >= length || (i13 = i14 + i6) >= i11 || (cCharAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i6 + length;
        }
        int i15 = i6 + i14;
        while (i14 < length) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 > i11 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i12 = i14 + 1) == str.length() || !java.lang.Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                            throw new com.google.android.gms.internal.ads.Ww0(i14, length);
                        }
                        throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                    }
                    int i16 = i14 + 1;
                    if (i16 != str.length()) {
                        char cCharAt3 = str.charAt(i16);
                        if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i17 = i15 + 3;
                            int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i17] = (byte) ((codePoint & 63) | 128);
                            i14 = i16;
                        } else {
                            i14 = i16;
                        }
                    }
                    throw new com.google.android.gms.internal.ads.Ww0(i14 - 1, length);
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    static int e(java.lang.String str) {
        int length = str.length();
        int i6 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i10 < length2) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i6 += (127 - cCharAt2) >>> 31;
                    } else {
                        i6 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(str, i10) < 65536) {
                                throw new com.google.android.gms.internal.ads.Ww0(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i6;
                break;
            }
            i11 += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (i11 >= length) {
            return i11;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i11) + 4294967296L));
    }

    static java.lang.String f(java.nio.ByteBuffer byteBuffer, int i6, int i10) {
        com.google.android.gms.internal.ads.Uw0 uw0 = f33227a;
        if (byteBuffer.hasArray()) {
            return uw0.b(byteBuffer.array(), byteBuffer.arrayOffset() + i6, i10);
        }
        byteBuffer.isDirect();
        return com.google.android.gms.internal.ads.Uw0.c(byteBuffer, i6, i10);
    }

    static java.lang.String g(byte[] bArr, int i6, int i10) {
        return f33227a.b(bArr, i6, i10);
    }

    static boolean h(byte[] bArr, int i6, int i10) {
        return f33227a.a(0, bArr, i6, i10) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i6, int i10) {
        if (i6 > -12 || i10 > -65) {
            return -1;
        }
        return i6 ^ (i10 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i6, int i10, int i11) {
        if (i6 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i6 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
