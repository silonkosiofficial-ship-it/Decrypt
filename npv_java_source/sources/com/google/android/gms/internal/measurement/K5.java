package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
abstract class K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.M5 f40563a;

    static {
        if (com.google.android.gms.internal.measurement.G5.w()) {
            com.google.android.gms.internal.measurement.G5.z();
        }
        f40563a = new com.google.android.gms.internal.measurement.L5();
    }

    static int a(java.lang.String str) {
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
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(str, i10) < 65536) {
                                throw new com.google.android.gms.internal.measurement.O5(i10, length2);
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

    static int b(java.lang.String str, byte[] bArr, int i6, int i10) {
        return f40563a.b(str, bArr, i6, i10);
    }

    static /* synthetic */ int c(byte[] bArr, int i6, int i10) {
        byte b6 = bArr[i6 - 1];
        int i11 = i10 - i6;
        if (i11 == 0) {
            if (b6 > -12) {
                return -1;
            }
            return b6;
        }
        if (i11 == 1) {
            byte b10 = bArr[i6];
            if (b6 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b6;
        }
        if (i11 != 2) {
            throw new java.lang.AssertionError();
        }
        byte b11 = bArr[i6];
        byte b12 = bArr[i6 + 1];
        if (b6 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b6);
    }

    static java.lang.String d(byte[] bArr, int i6, int i10) {
        return f40563a.c(bArr, i6, i10);
    }

    static boolean e(byte[] bArr, int i6, int i10) {
        return f40563a.a(0, bArr, i6, i10) == 0;
    }
}
