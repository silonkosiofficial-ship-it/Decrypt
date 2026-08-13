package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Tu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f32035a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f32036b = 0;

    static int a(byte[] bArr, int i6, com.google.android.gms.internal.ads.Su0 su0) throws com.google.android.gms.internal.ads.Vv0 {
        int iH = h(bArr, i6, su0);
        int i10 = su0.f31799a;
        if (i10 < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iH) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            su0.f31801c = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
            return iH;
        }
        su0.f31801c = com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArr, iH, i10);
        return iH + i10;
    }

    static int b(byte[] bArr, int i6) {
        int i10 = bArr[i6] & 255;
        int i11 = bArr[i6 + 1] & 255;
        int i12 = bArr[i6 + 2] & 255;
        return ((bArr[i6 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    static int c(com.google.android.gms.internal.ads.Ew0 ew0, byte[] bArr, int i6, int i10, int i11, com.google.android.gms.internal.ads.Su0 su0) throws com.google.android.gms.internal.ads.Vv0 {
        java.lang.Object objD = ew0.d();
        int iL = l(objD, ew0, bArr, i6, i10, i11, su0);
        ew0.a(objD);
        su0.f31801c = objD;
        return iL;
    }

    static int d(com.google.android.gms.internal.ads.Ew0 ew0, byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.Su0 su0) throws com.google.android.gms.internal.ads.Vv0 {
        java.lang.Object objD = ew0.d();
        int iM = m(objD, ew0, bArr, i6, i10, su0);
        ew0.a(objD);
        su0.f31801c = objD;
        return iM;
    }

    static int e(com.google.android.gms.internal.ads.Ew0 ew0, int i6, byte[] bArr, int i10, int i11, com.google.android.gms.internal.ads.Sv0 sv0, com.google.android.gms.internal.ads.Su0 su0) throws com.google.android.gms.internal.ads.Vv0 {
        int iD = d(ew0, bArr, i10, i11, su0);
        while (true) {
            sv0.add(su0.f31801c);
            if (iD >= i11) {
                break;
            }
            int iH = h(bArr, iD, su0);
            if (i6 != su0.f31799a) {
                break;
            }
            iD = d(ew0, bArr, iH, i11, su0);
        }
        return iD;
    }

    static int f(byte[] bArr, int i6, com.google.android.gms.internal.ads.Sv0 sv0, com.google.android.gms.internal.ads.Su0 su0) throws com.google.android.gms.internal.ads.Vv0 {
        com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) sv0;
        int iH = h(bArr, i6, su0);
        int i10 = su0.f31799a + iH;
        while (iH < i10) {
            iH = h(bArr, iH, su0);
            kv0.K(su0.f31799a);
        }
        if (iH == i10) {
            return iH;
        }
        throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(int i6, byte[] bArr, int i10, int i11, com.google.android.gms.internal.ads.Mw0 mw0, com.google.android.gms.internal.ads.Su0 su0) throws com.google.android.gms.internal.ads.Vv0 {
        if ((i6 >>> 3) == 0) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i6 & 7;
        if (i12 == 0) {
            int iK = k(bArr, i10, su0);
            mw0.j(i6, java.lang.Long.valueOf(su0.f31800b));
            return iK;
        }
        if (i12 == 1) {
            mw0.j(i6, java.lang.Long.valueOf(n(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iH = h(bArr, i10, su0);
            int i13 = su0.f31799a;
            if (i13 < 0) {
                throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iH) {
                throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            mw0.j(i6, i13 == 0 ? com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D : com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArr, iH, i13));
            return iH + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new com.google.android.gms.internal.ads.Vv0("Protocol message contained an invalid tag (zero).");
            }
            mw0.j(i6, java.lang.Integer.valueOf(b(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i6 & (-8)) | 4;
        com.google.android.gms.internal.ads.Mw0 mw0F = com.google.android.gms.internal.ads.Mw0.f();
        int i15 = su0.f31803e + 1;
        su0.f31803e = i15;
        o(i15);
        int i16 = 0;
        while (i10 < i11) {
            int iH2 = h(bArr, i10, su0);
            i16 = su0.f31799a;
            if (i16 == i14) {
                i10 = iH2;
                break;
            }
            i10 = g(i16, bArr, iH2, i11, mw0F, su0);
        }
        su0.f31803e--;
        if (i10 > i11 || i16 != i14) {
            throw new com.google.android.gms.internal.ads.Vv0("Failed to parse the message.");
        }
        mw0.j(i6, mw0F);
        return i10;
    }

    static int h(byte[] bArr, int i6, com.google.android.gms.internal.ads.Su0 su0) {
        int i10 = i6 + 1;
        byte b6 = bArr[i6];
        if (b6 < 0) {
            return i(b6, bArr, i10, su0);
        }
        su0.f31799a = b6;
        return i10;
    }

    static int i(int i6, byte[] bArr, int i10, com.google.android.gms.internal.ads.Su0 su0) {
        int i11;
        byte b6 = bArr[i10];
        int i12 = i10 + 1;
        int i13 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        if (b6 >= 0) {
            i11 = b6 << 7;
        } else {
            int i14 = i13 | ((b6 & 127) << 7);
            int i15 = i10 + 2;
            byte b10 = bArr[i12];
            if (b10 >= 0) {
                su0.f31799a = i14 | (b10 << 14);
                return i15;
            }
            i13 = i14 | ((b10 & 127) << 14);
            i12 = i10 + 3;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i11 = b11 << 21;
            } else {
                int i16 = i13 | ((b11 & 127) << 21);
                int i17 = i10 + 4;
                byte b12 = bArr[i12];
                if (b12 >= 0) {
                    su0.f31799a = i16 | (b12 << 28);
                    return i17;
                }
                int i18 = i16 | ((b12 & 127) << 28);
                while (true) {
                    int i19 = i17 + 1;
                    if (bArr[i17] >= 0) {
                        su0.f31799a = i18;
                        return i19;
                    }
                    i17 = i19;
                }
            }
        }
        su0.f31799a = i13 | i11;
        return i12;
    }

    static int j(int i6, byte[] bArr, int i10, int i11, com.google.android.gms.internal.ads.Sv0 sv0, com.google.android.gms.internal.ads.Su0 su0) {
        com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) sv0;
        int iH = h(bArr, i10, su0);
        while (true) {
            kv0.K(su0.f31799a);
            if (iH >= i11) {
                break;
            }
            int iH2 = h(bArr, iH, su0);
            if (i6 != su0.f31799a) {
                break;
            }
            iH = h(bArr, iH2, su0);
        }
        return iH;
    }

    static int k(byte[] bArr, int i6, com.google.android.gms.internal.ads.Su0 su0) {
        long j6 = bArr[i6];
        int i10 = i6 + 1;
        if (j6 >= 0) {
            su0.f31800b = j6;
            return i10;
        }
        int i11 = i6 + 2;
        byte b6 = bArr[i10];
        long j10 = (j6 & 127) | (((long) (b6 & 127)) << 7);
        int i12 = 7;
        while (b6 < 0) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            i12 += 7;
            j10 |= ((long) (b10 & 127)) << i12;
            b6 = b10;
            i11 = i13;
        }
        su0.f31800b = j10;
        return i11;
    }

    static int l(java.lang.Object obj, com.google.android.gms.internal.ads.Ew0 ew0, byte[] bArr, int i6, int i10, int i11, com.google.android.gms.internal.ads.Su0 su0) throws com.google.android.gms.internal.ads.Vv0 {
        com.google.android.gms.internal.ads.C4853pw0 c4853pw0 = (com.google.android.gms.internal.ads.C4853pw0) ew0;
        int i12 = su0.f31803e + 1;
        su0.f31803e = i12;
        o(i12);
        int iE = c4853pw0.E(obj, bArr, i6, i10, i11, su0);
        su0.f31803e--;
        su0.f31801c = obj;
        return iE;
    }

    static int m(java.lang.Object obj, com.google.android.gms.internal.ads.Ew0 ew0, byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.Su0 su0) throws com.google.android.gms.internal.ads.Vv0 {
        int i11 = i6 + 1;
        int i12 = bArr[i6];
        if (i12 < 0) {
            i11 = i(i12, bArr, i11, su0);
            i12 = su0.f31799a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = su0.f31803e + 1;
        su0.f31803e = i14;
        o(i14);
        int i15 = i12 + i13;
        ew0.h(obj, bArr, i13, i15, su0);
        su0.f31803e--;
        su0.f31801c = obj;
        return i15;
    }

    static long n(byte[] bArr, int i6) {
        return (((long) bArr[i6]) & 255) | ((((long) bArr[i6 + 1]) & 255) << 8) | ((((long) bArr[i6 + 2]) & 255) << 16) | ((((long) bArr[i6 + 3]) & 255) << 24) | ((((long) bArr[i6 + 4]) & 255) << 32) | ((((long) bArr[i6 + 5]) & 255) << 40) | ((((long) bArr[i6 + 6]) & 255) << 48) | ((((long) bArr[i6 + 7]) & 255) << 56);
    }

    private static void o(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (i6 >= f32035a) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
