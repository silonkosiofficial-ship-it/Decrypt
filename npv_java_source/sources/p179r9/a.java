package p179r9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final java.lang.String a(byte[] bArr, int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i6;
        int i19 = 3;
        p247y7.AbstractC7350t.f(bArr, "<this>");
        if (i18 < 0 || i10 > bArr.length || i18 > i10) {
            throw new java.lang.IndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i18 + " endIndex=" + i10);
        }
        char[] cArr = new char[i10 - i18];
        int i20 = 0;
        while (i18 < i10) {
            byte b6 = bArr[i18];
            if (b6 >= 0) {
                i16 = i20 + 1;
                cArr[i20] = (char) b6;
                i18++;
                while (i18 < i10) {
                    byte b10 = bArr[i18];
                    if (b10 < 0) {
                        break;
                    }
                    i18++;
                    cArr[i16] = (char) b10;
                    i16++;
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } else {
                if ((b6 >> 5) == -2) {
                    int i21 = i18 + 1;
                    if (i10 <= i21) {
                        i16 = i20 + 1;
                        cArr[i20] = (char) 65533;
                    } else {
                        byte b11 = bArr[i21];
                        if ((b11 & 192) == 128) {
                            int i22 = (b6 << 6) ^ (b11 ^ 3968);
                            if (i22 < 128) {
                                i16 = i20 + 1;
                                cArr[i20] = (char) 65533;
                            } else {
                                i16 = i20 + 1;
                                cArr[i20] = (char) i22;
                            }
                            p087i7.M m10 = p087i7.M.f46721a;
                            i17 = 2;
                        } else {
                            i16 = i20 + 1;
                            cArr[i20] = (char) 65533;
                        }
                        i18 += i17;
                    }
                    p087i7.M m11 = p087i7.M.f46721a;
                    i17 = 1;
                    i18 += i17;
                } else if ((b6 >> 4) == -2) {
                    int i23 = i18 + 2;
                    if (i10 <= i23) {
                        i13 = i20 + 1;
                        cArr[i20] = (char) 65533;
                        p087i7.M m12 = p087i7.M.f46721a;
                        int i24 = i18 + 1;
                        i15 = (i10 <= i24 || (bArr[i24] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b12 = bArr[i18 + 1];
                        if ((b12 & 192) == 128) {
                            byte b13 = bArr[i23];
                            if ((b13 & 192) == 128) {
                                int i25 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b6 << 12);
                                if (i25 < 2048) {
                                    i14 = i20 + 1;
                                    cArr[i20] = (char) 65533;
                                } else if (55296 > i25 || i25 >= 57344) {
                                    char c6 = (char) i25;
                                    i14 = i20 + 1;
                                    cArr[i20] = c6;
                                } else {
                                    i14 = i20 + 1;
                                    cArr[i20] = (char) 65533;
                                }
                                p087i7.M m13 = p087i7.M.f46721a;
                                i13 = i14;
                                i15 = i19;
                            } else {
                                i13 = i20 + 1;
                                cArr[i20] = (char) 65533;
                                p087i7.M m14 = p087i7.M.f46721a;
                            }
                        } else {
                            i13 = i20 + 1;
                            cArr[i20] = (char) 65533;
                            p087i7.M m15 = p087i7.M.f46721a;
                        }
                    }
                    i18 += i15;
                    i20 = i13;
                } else {
                    if ((b6 >> 3) == -2) {
                        int i26 = i18 + 3;
                        if (i10 <= i26) {
                            i11 = i20 + 1;
                            cArr[i20] = 65533;
                            p087i7.M m16 = p087i7.M.f46721a;
                            int i27 = i18 + 1;
                            if (i10 <= i27 || (bArr[i27] & 192) != 128) {
                                i19 = 1;
                            } else {
                                int i28 = i18 + 2;
                                if (i10 <= i28 || (bArr[i28] & 192) != 128) {
                                    i19 = 2;
                                }
                            }
                        } else {
                            byte b14 = bArr[i18 + 1];
                            if ((b14 & 192) == 128) {
                                byte b15 = bArr[i18 + 2];
                                if ((b15 & 192) == 128) {
                                    byte b16 = bArr[i26];
                                    if ((b16 & 192) == 128) {
                                        int i29 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b6 << 18);
                                        if (i29 > 1114111) {
                                            i11 = i20 + 1;
                                            cArr[i20] = 65533;
                                        } else {
                                            if ((55296 > i29 || i29 >= 57344) && i29 >= 65536) {
                                                if (i29 != 65533) {
                                                    cArr[i20] = (char) ((i29 >>> 10) + 55232);
                                                    i12 = i20 + 2;
                                                    cArr[i20 + 1] = (char) ((i29 & 1023) + 56320);
                                                } else {
                                                    cArr[i20] = 65533;
                                                    i12 = i20 + 1;
                                                }
                                                p087i7.M m17 = p087i7.M.f46721a;
                                                i11 = i12;
                                            } else {
                                                i11 = i20 + 1;
                                                cArr[i20] = 65533;
                                            }
                                            i19 = 4;
                                        }
                                        p087i7.M m18 = p087i7.M.f46721a;
                                        i19 = 4;
                                    } else {
                                        i11 = i20 + 1;
                                        cArr[i20] = 65533;
                                        p087i7.M m19 = p087i7.M.f46721a;
                                        i19 = 3;
                                    }
                                } else {
                                    i11 = i20 + 1;
                                    cArr[i20] = 65533;
                                    p087i7.M m20 = p087i7.M.f46721a;
                                    i19 = 2;
                                }
                            } else {
                                i11 = i20 + 1;
                                cArr[i20] = 65533;
                                p087i7.M m21 = p087i7.M.f46721a;
                                i19 = 1;
                            }
                        }
                        i18 += i19;
                    } else {
                        i11 = i20 + 1;
                        cArr[i20] = 65533;
                        i18++;
                    }
                    i20 = i11;
                }
                i19 = 3;
            }
            i20 = i16;
            i19 = 3;
        }
        return S8.r.A(cArr, 0, i20);
    }

    public static /* synthetic */ java.lang.String b(byte[] bArr, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = bArr.length;
        }
        return a(bArr, i6, i10);
    }
}
