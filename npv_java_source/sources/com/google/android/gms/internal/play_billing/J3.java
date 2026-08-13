package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
abstract class J3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41425a = 0;

    static {
        if (com.google.android.gms.internal.play_billing.G3.C() && com.google.android.gms.internal.play_billing.G3.D()) {
            int i6 = com.google.android.gms.internal.play_billing.AbstractC6190b2.f41519a;
        }
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int i6, int i10) {
        int i11 = i10 - i6;
        byte b6 = bArr[i6 - 1];
        if (i11 == 0) {
            if (b6 <= -12) {
                return b6;
            }
            return -1;
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

    static int b(java.lang.String str, byte[] bArr, int i6, int i10) {
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
                            throw new com.google.android.gms.internal.play_billing.I3(i14, length);
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
                    throw new com.google.android.gms.internal.play_billing.I3(i14 - 1, length);
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

    static int c(java.lang.String str) {
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
                                throw new com.google.android.gms.internal.play_billing.I3(i10, length2);
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

    /* JADX WARN: Code duplicated, block: B:50:0x0073 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0077 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    static boolean d(byte[] bArr, int i6, int i10) {
        while (i6 < i10 && bArr[i6] >= 0) {
            i6++;
        }
        if (i6 >= i10) {
            return true;
        }
        while (i6 < i10) {
            int i11 = i6 + 1;
            int iA = bArr[i6];
            if (iA >= 0) {
                i6 = i11;
            } else {
                if (iA >= -32) {
                    if (iA < -16) {
                        if (i11 >= i10 - 1) {
                            iA = a(bArr, i11, i10);
                        } else {
                            int i12 = i6 + 2;
                            char c6 = bArr[i11];
                            if (c6 > -65) {
                                return false;
                            }
                            if (iA == -32 && c6 < -96) {
                                return false;
                            }
                            if (iA == -19 && c6 >= -96) {
                                return false;
                            }
                            i6 += 3;
                            if (bArr[i12] > -65) {
                                return false;
                            }
                        }
                    } else if (i11 >= i10 - 2) {
                        iA = a(bArr, i11, i10);
                    } else {
                        int i13 = i6 + 2;
                        int i14 = bArr[i11];
                        if (i14 > -65 || (((iA << 28) + (i14 + 112)) >> 30) != 0) {
                            return false;
                        }
                        int i15 = i6 + 3;
                        if (bArr[i13] > -65) {
                            return false;
                        }
                        i6 += 4;
                        if (bArr[i15] > -65) {
                            return false;
                        }
                    }
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                if (i11 >= i10) {
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                if (iA < -62) {
                    return false;
                }
                i6 += 2;
                if (bArr[i11] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
