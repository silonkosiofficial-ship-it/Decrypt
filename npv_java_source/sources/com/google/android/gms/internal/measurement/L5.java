package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class L5 extends com.google.android.gms.internal.measurement.M5 {
    L5() {
    }

    @Override // com.google.android.gms.internal.measurement.M5
    final int a(int i6, byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b6 = bArr[i10];
            if (b6 < 0) {
                if (b6 < -32) {
                    if (i12 >= i11) {
                        return b6;
                    }
                    if (b6 >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b6 >= -16) {
                    if (i12 >= i11 - 2) {
                        return com.google.android.gms.internal.measurement.K5.c(bArr, i12, i11);
                    }
                    int i13 = i10 + 2;
                    byte b10 = bArr[i12];
                    if (b10 <= -65 && (((b6 << 28) + (b10 + 112)) >> 30) == 0) {
                        int i14 = i10 + 3;
                        if (bArr[i13] <= -65) {
                            i10 += 4;
                            if (bArr[i14] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 1) {
                    return com.google.android.gms.internal.measurement.K5.c(bArr, i12, i11);
                }
                int i15 = i10 + 2;
                byte b11 = bArr[i12];
                if (b11 <= -65 && ((b6 != -32 || b11 >= -96) && (b6 != -19 || b11 < -96))) {
                    i10 += 3;
                    if (bArr[i15] > -65) {
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.M5
    final int b(java.lang.String str, byte[] bArr, int i6, int i10) {
        int i11;
        int i12;
        char cCharAt;
        int length = str.length();
        int i13 = i10 + i6;
        int i14 = 0;
        while (i14 < length && (i12 = i14 + i6) < i13 && (cCharAt = str.charAt(i14)) < 128) {
            bArr[i12] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i6 + length;
        }
        int i15 = i6 + i14;
        while (i14 < length) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128 && i15 < i13) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i13 - 2) {
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                i15 += 2;
                bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i15 > i13 - 3) {
                    if (i15 > i13 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i14 + 1) == str.length() || !java.lang.Character.isSurrogatePair(cCharAt2, str.charAt(i11)))) {
                            throw new com.google.android.gms.internal.measurement.O5(i14, length);
                        }
                        throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                    }
                    int i17 = i14 + 1;
                    if (i17 != str.length()) {
                        char cCharAt3 = str.charAt(i17);
                        if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i18 = i15 + 3;
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i18] = (byte) ((codePoint & 63) | 128);
                            i14 = i17;
                        } else {
                            i14 = i17;
                        }
                    }
                    throw new com.google.android.gms.internal.measurement.O5(i14 - 1, length);
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i19 = i15 + 2;
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i15 += 3;
                bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
            }
            i14++;
        }
        return i15;
    }

    @Override // com.google.android.gms.internal.measurement.M5
    final java.lang.String c(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.measurement.C4 {
        if ((i6 | i10 | ((bArr.length - i6) - i10)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10)));
        }
        int i11 = i6 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i6 < i11) {
            byte b6 = bArr[i6];
            if (b6 < 0) {
                break;
            }
            i6++;
            com.google.android.gms.internal.measurement.J5.d(b6, cArr, i12);
            i12++;
        }
        int i13 = i12;
        while (i6 < i11) {
            int i14 = i6 + 1;
            byte b10 = bArr[i6];
            if (b10 >= 0) {
                int i15 = i13 + 1;
                com.google.android.gms.internal.measurement.J5.d(b10, cArr, i13);
                while (i14 < i11) {
                    byte b11 = bArr[i14];
                    if (b11 < 0) {
                        break;
                    }
                    i14++;
                    com.google.android.gms.internal.measurement.J5.d(b11, cArr, i15);
                    i15++;
                }
                i13 = i15;
                i6 = i14;
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw com.google.android.gms.internal.measurement.C4.c();
                }
                i6 += 2;
                com.google.android.gms.internal.measurement.J5.c(b10, bArr[i14], cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw com.google.android.gms.internal.measurement.C4.c();
                }
                int i16 = i6 + 2;
                i6 += 3;
                com.google.android.gms.internal.measurement.J5.b(b10, bArr[i14], bArr[i16], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw com.google.android.gms.internal.measurement.C4.c();
                }
                byte b12 = bArr[i14];
                int i17 = i6 + 3;
                byte b13 = bArr[i6 + 2];
                i6 += 4;
                com.google.android.gms.internal.measurement.J5.a(b10, b12, b13, bArr[i17], cArr, i13);
                i13 += 2;
            }
        }
        return new java.lang.String(cArr, 0, i13);
    }
}
