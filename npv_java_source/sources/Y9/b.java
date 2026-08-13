package Y9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f16575a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(byte[] bArr, int i6) {
        byte b6;
        int i10;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                int i14 = i13 + 1;
                if (i13 == i6) {
                    return i12;
                }
                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                    return -1;
                }
                i12 += b10 < 65536 ? 1 : 2;
                i11++;
                while (true) {
                    i13 = i14;
                    if (i11 >= length || (b6 = bArr[i11]) < 0) {
                        break;
                    }
                    i11++;
                    i14 = i13 + 1;
                    if (i13 == i6) {
                        return i12;
                    }
                    if ((b6 != 10 && b6 != 13 && ((b6 >= 0 && b6 < 32) || (127 <= b6 && b6 < 160))) || b6 == 65533) {
                        return -1;
                    }
                    i12 += b6 < 65536 ? 1 : 2;
                }
            } else {
                if ((b10 >> 5) == -2) {
                    int i15 = i11 + 1;
                    if (length <= i15) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    byte b11 = bArr[i15];
                    if ((b11 & 192) != 128) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    int i16 = (b11 ^ 3968) ^ (b10 << 6);
                    if (i16 < 128) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    i10 = i13 + 1;
                    if (i13 == i6) {
                        return i12;
                    }
                    if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                        return -1;
                    }
                    i12 += i16 < 65536 ? 1 : 2;
                    p087i7.M m6 = p087i7.M.f46721a;
                    i11 += 2;
                } else if ((b10 >> 4) == -2) {
                    int i17 = i11 + 2;
                    if (length <= i17) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    byte b12 = bArr[i11 + 1];
                    if ((b12 & 192) != 128) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    byte b13 = bArr[i17];
                    if ((b13 & 192) != 128) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    int i18 = ((b12 << 6) ^ ((-123008) ^ b13)) ^ (b10 << 12);
                    if (i18 < 2048) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    if (55296 <= i18 && i18 < 57344) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    i10 = i13 + 1;
                    if (i13 == i6) {
                        return i12;
                    }
                    if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                        return -1;
                    }
                    i12 += i18 < 65536 ? 1 : 2;
                    p087i7.M m10 = p087i7.M.f46721a;
                    i11 += 3;
                } else {
                    if ((b10 >> 3) != -2) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    int i19 = i11 + 3;
                    if (length <= i19) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    byte b14 = bArr[i11 + 1];
                    if ((b14 & 192) != 128) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    byte b15 = bArr[i11 + 2];
                    if ((b15 & 192) != 128) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    byte b16 = bArr[i19];
                    if ((b16 & 192) != 128) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    int i20 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                    if (i20 > 1114111) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    if (55296 <= i20 && i20 < 57344) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    if (i20 < 65536) {
                        if (i13 == i6) {
                            return i12;
                        }
                        return -1;
                    }
                    i10 = i13 + 1;
                    if (i13 == i6) {
                        return i12;
                    }
                    if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                        return -1;
                    }
                    i12 += i20 < 65536 ? 1 : 2;
                    p087i7.M m11 = p087i7.M.f46721a;
                    i11 += 4;
                }
                i13 = i10;
            }
        }
        return i12;
    }

    public static final void d(X9.C1839g c1839g, X9.C1836d c1836d, int i6, int i10) {
        p247y7.AbstractC7350t.f(c1839g, "<this>");
        p247y7.AbstractC7350t.f(c1836d, "buffer");
        c1836d.write(c1839g.o(), i6, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('a' <= c6 && c6 < 'g') {
            return c6 - 'W';
        }
        if ('A' <= c6 && c6 < 'G') {
            return c6 - '7';
        }
        throw new java.lang.IllegalArgumentException("Unexpected hex digit: " + c6);
    }

    public static final char[] f() {
        return f16575a;
    }
}
