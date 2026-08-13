package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6208e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f41548a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41549b = 0;

    static int a(byte[] bArr, int i6, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) throws com.google.android.gms.internal.play_billing.S2 {
        int iH = h(bArr, i6, c6196c2);
        int i10 = c6196c2.f41525a;
        if (i10 < 0) {
            throw new com.google.android.gms.internal.play_billing.S2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iH) {
            throw new com.google.android.gms.internal.play_billing.S2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            c6196c2.f41527c = com.google.android.gms.internal.play_billing.AbstractC6268o2.f41602D;
            return iH;
        }
        c6196c2.f41527c = com.google.android.gms.internal.play_billing.AbstractC6268o2.C(bArr, iH, i10);
        return iH + i10;
    }

    static int b(byte[] bArr, int i6) {
        int i10 = bArr[i6] & 255;
        int i11 = bArr[i6 + 1] & 255;
        int i12 = bArr[i6 + 2] & 255;
        return ((bArr[i6 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    static int c(com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3, byte[] bArr, int i6, int i10, int i11, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) throws com.google.android.gms.internal.play_billing.S2 {
        java.lang.Object objD = interfaceC6298t3.d();
        int iL = l(objD, interfaceC6298t3, bArr, i6, i10, i11, c6196c2);
        interfaceC6298t3.a(objD);
        c6196c2.f41527c = objD;
        return iL;
    }

    static int d(com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3, byte[] bArr, int i6, int i10, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) throws com.google.android.gms.internal.play_billing.S2 {
        java.lang.Object objD = interfaceC6298t3.d();
        int iM = m(objD, interfaceC6298t3, bArr, i6, i10, c6196c2);
        interfaceC6298t3.a(objD);
        c6196c2.f41527c = objD;
        return iM;
    }

    static int e(com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3, int i6, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.P2 p6, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) throws com.google.android.gms.internal.play_billing.S2 {
        int iD = d(interfaceC6298t3, bArr, i10, i11, c6196c2);
        while (true) {
            p6.add(c6196c2.f41527c);
            if (iD >= i11) {
                break;
            }
            int iH = h(bArr, iD, c6196c2);
            if (i6 != c6196c2.f41525a) {
                break;
            }
            iD = d(interfaceC6298t3, bArr, iH, i11, c6196c2);
        }
        return iD;
    }

    static int f(byte[] bArr, int i6, com.google.android.gms.internal.play_billing.P2 p6, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) throws com.google.android.gms.internal.play_billing.S2 {
        com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) p6;
        int iH = h(bArr, i6, c6196c2);
        int i10 = c6196c2.f41525a + iH;
        while (iH < i10) {
            iH = h(bArr, iH, c6196c2);
            m6.g(c6196c2.f41525a);
        }
        if (iH == i10) {
            return iH;
        }
        throw new com.google.android.gms.internal.play_billing.S2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(int i6, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.A3 a6, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) throws com.google.android.gms.internal.play_billing.S2 {
        if ((i6 >>> 3) == 0) {
            throw new com.google.android.gms.internal.play_billing.S2("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i6 & 7;
        if (i12 == 0) {
            int iK = k(bArr, i10, c6196c2);
            a6.j(i6, java.lang.Long.valueOf(c6196c2.f41526b));
            return iK;
        }
        if (i12 == 1) {
            a6.j(i6, java.lang.Long.valueOf(n(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iH = h(bArr, i10, c6196c2);
            int i13 = c6196c2.f41525a;
            if (i13 < 0) {
                throw new com.google.android.gms.internal.play_billing.S2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iH) {
                throw new com.google.android.gms.internal.play_billing.S2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            a6.j(i6, i13 == 0 ? com.google.android.gms.internal.play_billing.AbstractC6268o2.f41602D : com.google.android.gms.internal.play_billing.AbstractC6268o2.C(bArr, iH, i13));
            return iH + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new com.google.android.gms.internal.play_billing.S2("Protocol message contained an invalid tag (zero).");
            }
            a6.j(i6, java.lang.Integer.valueOf(b(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i6 & (-8)) | 4;
        com.google.android.gms.internal.play_billing.A3 a3F = com.google.android.gms.internal.play_billing.A3.f();
        int i15 = c6196c2.f41529e + 1;
        c6196c2.f41529e = i15;
        o(i15);
        int i16 = 0;
        while (i10 < i11) {
            int iH2 = h(bArr, i10, c6196c2);
            i16 = c6196c2.f41525a;
            if (i16 == i14) {
                i10 = iH2;
                break;
            }
            i10 = g(i16, bArr, iH2, i11, a3F, c6196c2);
        }
        c6196c2.f41529e--;
        if (i10 > i11 || i16 != i14) {
            throw new com.google.android.gms.internal.play_billing.S2("Failed to parse the message.");
        }
        a6.j(i6, a3F);
        return i10;
    }

    static int h(byte[] bArr, int i6, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) {
        int i10 = i6 + 1;
        byte b6 = bArr[i6];
        if (b6 < 0) {
            return i(b6, bArr, i10, c6196c2);
        }
        c6196c2.f41525a = b6;
        return i10;
    }

    static int i(int i6, byte[] bArr, int i10, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) {
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
                c6196c2.f41525a = i14 | (b10 << 14);
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
                    c6196c2.f41525a = i16 | (b12 << 28);
                    return i17;
                }
                int i18 = i16 | ((b12 & 127) << 28);
                while (true) {
                    int i19 = i17 + 1;
                    if (bArr[i17] >= 0) {
                        c6196c2.f41525a = i18;
                        return i19;
                    }
                    i17 = i19;
                }
            }
        }
        c6196c2.f41525a = i13 | i11;
        return i12;
    }

    static int j(int i6, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.P2 p6, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) {
        com.google.android.gms.internal.play_billing.M2 m6 = (com.google.android.gms.internal.play_billing.M2) p6;
        int iH = h(bArr, i10, c6196c2);
        while (true) {
            m6.g(c6196c2.f41525a);
            if (iH >= i11) {
                break;
            }
            int iH2 = h(bArr, iH, c6196c2);
            if (i6 != c6196c2.f41525a) {
                break;
            }
            iH = h(bArr, iH2, c6196c2);
        }
        return iH;
    }

    static int k(byte[] bArr, int i6, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) {
        long j6 = bArr[i6];
        int i10 = i6 + 1;
        if (j6 >= 0) {
            c6196c2.f41526b = j6;
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
        c6196c2.f41526b = j10;
        return i11;
    }

    static int l(java.lang.Object obj, com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3, byte[] bArr, int i6, int i10, int i11, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) throws com.google.android.gms.internal.play_billing.S2 {
        com.google.android.gms.internal.play_billing.C6251l3 c6251l3 = (com.google.android.gms.internal.play_billing.C6251l3) interfaceC6298t3;
        int i12 = c6196c2.f41529e + 1;
        c6196c2.f41529e = i12;
        o(i12);
        int iY = c6251l3.y(obj, bArr, i6, i10, i11, c6196c2);
        c6196c2.f41529e--;
        c6196c2.f41527c = obj;
        return iY;
    }

    static int m(java.lang.Object obj, com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3, byte[] bArr, int i6, int i10, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) throws com.google.android.gms.internal.play_billing.S2 {
        int i11 = i6 + 1;
        int i12 = bArr[i6];
        if (i12 < 0) {
            i11 = i(i12, bArr, i11, c6196c2);
            i12 = c6196c2.f41525a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw new com.google.android.gms.internal.play_billing.S2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = c6196c2.f41529e + 1;
        c6196c2.f41529e = i14;
        o(i14);
        int i15 = i12 + i13;
        interfaceC6298t3.f(obj, bArr, i13, i15, c6196c2);
        c6196c2.f41529e--;
        c6196c2.f41527c = obj;
        return i15;
    }

    static long n(byte[] bArr, int i6) {
        return (((long) bArr[i6]) & 255) | ((((long) bArr[i6 + 1]) & 255) << 8) | ((((long) bArr[i6 + 2]) & 255) << 16) | ((((long) bArr[i6 + 3]) & 255) << 24) | ((((long) bArr[i6 + 4]) & 255) << 32) | ((((long) bArr[i6 + 5]) & 255) << 40) | ((((long) bArr[i6 + 6]) & 255) << 48) | ((((long) bArr[i6 + 7]) & 255) << 56);
    }

    private static void o(int i6) throws com.google.android.gms.internal.play_billing.S2 {
        if (i6 >= f41548a) {
            throw new com.google.android.gms.internal.play_billing.S2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
