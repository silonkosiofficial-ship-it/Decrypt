package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
abstract class H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f40529a = 100;

    static double a(byte[] bArr, int i6) {
        return java.lang.Double.longBitsToDouble(t(bArr, i6));
    }

    static int b(int i6, byte[] bArr, int i10, int i11, com.google.android.gms.internal.measurement.D4 d6, com.google.android.gms.internal.measurement.K3 k6) {
        com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) d6;
        int iR = r(bArr, i10, k6);
        while (true) {
            c6154w4.g(k6.f40554a);
            if (iR >= i11) {
                break;
            }
            int iR2 = r(bArr, iR, k6);
            if (i6 != k6.f40554a) {
                break;
            }
            iR = r(bArr, iR2, k6);
        }
        return iR;
    }

    static int c(int i6, byte[] bArr, int i10, int i11, com.google.android.gms.internal.measurement.E5 e6, com.google.android.gms.internal.measurement.K3 k6) {
        if ((i6 >>> 3) == 0) {
            throw com.google.android.gms.internal.measurement.C4.b();
        }
        int i12 = i6 & 7;
        if (i12 == 0) {
            int iS = s(bArr, i10, k6);
            e6.e(i6, java.lang.Long.valueOf(k6.f40555b));
            return iS;
        }
        if (i12 == 1) {
            e6.e(i6, java.lang.Long.valueOf(t(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iR = r(bArr, i10, k6);
            int i13 = k6.f40554a;
            if (i13 < 0) {
                throw com.google.android.gms.internal.measurement.C4.d();
            }
            if (i13 > bArr.length - iR) {
                throw com.google.android.gms.internal.measurement.C4.g();
            }
            e6.e(i6, i13 == 0 ? com.google.android.gms.internal.measurement.L3.f40566D : com.google.android.gms.internal.measurement.L3.w(bArr, iR, i13));
            return iR + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw com.google.android.gms.internal.measurement.C4.b();
            }
            e6.e(i6, java.lang.Integer.valueOf(q(bArr, i10)));
            return i10 + 4;
        }
        com.google.android.gms.internal.measurement.E5 e5L = com.google.android.gms.internal.measurement.E5.l();
        int i14 = (i6 & (-8)) | 4;
        int i15 = k6.f40558e + 1;
        k6.f40558e = i15;
        m(i15);
        int i16 = 0;
        while (i10 < i11) {
            int iR2 = r(bArr, i10, k6);
            int i17 = k6.f40554a;
            i16 = i17;
            if (i17 == i14) {
                i10 = iR2;
                break;
            }
            int iC = c(i16, bArr, iR2, i11, e5L, k6);
            i16 = i17;
            i10 = iC;
        }
        k6.f40558e--;
        if (i10 > i11 || i16 != i14) {
            throw com.google.android.gms.internal.measurement.C4.e();
        }
        e6.e(i6, e5L);
        return i10;
    }

    static int d(int i6, byte[] bArr, int i10, int i11, java.lang.Object obj, com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, com.google.android.gms.internal.measurement.F5 f6, com.google.android.gms.internal.measurement.K3 k6) {
        k6.f40557d.b(interfaceC5965a5, i6 >>> 3);
        return c(i6, bArr, i10, i11, com.google.android.gms.internal.measurement.C5992d5.I(obj), k6);
    }

    static int e(int i6, byte[] bArr, int i10, com.google.android.gms.internal.measurement.K3 k6) {
        int i11;
        int i12 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i13 = i10 + 1;
        byte b6 = bArr[i10];
        if (b6 >= 0) {
            i11 = b6 << 7;
        } else {
            int i14 = i12 | ((b6 & 127) << 7);
            int i15 = i10 + 2;
            byte b10 = bArr[i13];
            if (b10 >= 0) {
                k6.f40554a = i14 | (b10 << 14);
                return i15;
            }
            i12 = i14 | ((b10 & 127) << 14);
            i13 = i10 + 3;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i11 = b11 << 21;
            } else {
                int i16 = i12 | ((b11 & 127) << 21);
                int i17 = i10 + 4;
                byte b12 = bArr[i13];
                if (b12 >= 0) {
                    k6.f40554a = i16 | (b12 << 28);
                    return i17;
                }
                int i18 = i16 | ((b12 & 127) << 28);
                while (true) {
                    int i19 = i17 + 1;
                    if (bArr[i17] >= 0) {
                        k6.f40554a = i18;
                        return i19;
                    }
                    i17 = i19;
                }
            }
        }
        k6.f40554a = i12 | i11;
        return i13;
    }

    static int f(com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5, int i6, byte[] bArr, int i10, int i11, com.google.android.gms.internal.measurement.D4 d6, com.google.android.gms.internal.measurement.K3 k6) {
        int i12 = (i6 & (-8)) | 4;
        int iG = g(interfaceC6100p5, bArr, i10, i11, i12, k6);
        while (true) {
            d6.add(k6.f40556c);
            if (iG >= i11) {
                break;
            }
            int iR = r(bArr, iG, k6);
            if (i6 != k6.f40554a) {
                break;
            }
            iG = g(interfaceC6100p5, bArr, iR, i11, i12, k6);
        }
        return iG;
    }

    private static int g(com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5, byte[] bArr, int i6, int i10, int i11, com.google.android.gms.internal.measurement.K3 k6) {
        java.lang.Object objA = interfaceC6100p5.a();
        int i12 = i(objA, interfaceC6100p5, bArr, i6, i10, i11, k6);
        interfaceC6100p5.e(objA);
        k6.f40556c = objA;
        return i12;
    }

    static int h(com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5, byte[] bArr, int i6, int i10, com.google.android.gms.internal.measurement.K3 k6) {
        java.lang.Object objA = interfaceC6100p5.a();
        int iJ = j(objA, interfaceC6100p5, bArr, i6, i10, k6);
        interfaceC6100p5.e(objA);
        k6.f40556c = objA;
        return iJ;
    }

    static int i(java.lang.Object obj, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5, byte[] bArr, int i6, int i10, int i11, com.google.android.gms.internal.measurement.K3 k6) {
        com.google.android.gms.internal.measurement.C5992d5 c5992d5 = (com.google.android.gms.internal.measurement.C5992d5) interfaceC6100p5;
        int i12 = k6.f40558e + 1;
        k6.f40558e = i12;
        m(i12);
        int iM = c5992d5.m(obj, bArr, i6, i10, i11, k6);
        k6.f40558e--;
        k6.f40556c = obj;
        return iM;
    }

    static int j(java.lang.Object obj, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5, byte[] bArr, int i6, int i10, com.google.android.gms.internal.measurement.K3 k6) {
        int iE = i6 + 1;
        int i11 = bArr[i6];
        if (i11 < 0) {
            iE = e(i11, bArr, iE, k6);
            i11 = k6.f40554a;
        }
        int i12 = iE;
        if (i11 < 0 || i11 > i10 - i12) {
            throw com.google.android.gms.internal.measurement.C4.g();
        }
        int i13 = k6.f40558e + 1;
        k6.f40558e = i13;
        m(i13);
        int i14 = i11 + i12;
        interfaceC6100p5.h(obj, bArr, i12, i14, k6);
        k6.f40558e--;
        k6.f40556c = obj;
        return i14;
    }

    static int k(byte[] bArr, int i6, com.google.android.gms.internal.measurement.K3 k6) {
        int iR = r(bArr, i6, k6);
        int i10 = k6.f40554a;
        if (i10 < 0) {
            throw com.google.android.gms.internal.measurement.C4.d();
        }
        if (i10 > bArr.length - iR) {
            throw com.google.android.gms.internal.measurement.C4.g();
        }
        if (i10 == 0) {
            k6.f40556c = com.google.android.gms.internal.measurement.L3.f40566D;
            return iR;
        }
        k6.f40556c = com.google.android.gms.internal.measurement.L3.w(bArr, iR, i10);
        return iR + i10;
    }

    static int l(byte[] bArr, int i6, com.google.android.gms.internal.measurement.D4 d6, com.google.android.gms.internal.measurement.K3 k6) {
        com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) d6;
        int iR = r(bArr, i6, k6);
        int i10 = k6.f40554a + iR;
        while (iR < i10) {
            iR = r(bArr, iR, k6);
            c6154w4.g(k6.f40554a);
        }
        if (iR == i10) {
            return iR;
        }
        throw com.google.android.gms.internal.measurement.C4.g();
    }

    private static void m(int i6) throws com.google.android.gms.internal.measurement.C4 {
        if (i6 >= f40529a) {
            throw com.google.android.gms.internal.measurement.C4.f();
        }
    }

    static float n(byte[] bArr, int i6) {
        return java.lang.Float.intBitsToFloat(q(bArr, i6));
    }

    static int o(com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5, int i6, byte[] bArr, int i10, int i11, com.google.android.gms.internal.measurement.D4 d6, com.google.android.gms.internal.measurement.K3 k6) {
        int iH = h(interfaceC6100p5, bArr, i10, i11, k6);
        while (true) {
            d6.add(k6.f40556c);
            if (iH >= i11) {
                break;
            }
            int iR = r(bArr, iH, k6);
            if (i6 != k6.f40554a) {
                break;
            }
            iH = h(interfaceC6100p5, bArr, iR, i11, k6);
        }
        return iH;
    }

    static int p(byte[] bArr, int i6, com.google.android.gms.internal.measurement.K3 k6) {
        int iR = r(bArr, i6, k6);
        int i10 = k6.f40554a;
        if (i10 < 0) {
            throw com.google.android.gms.internal.measurement.C4.d();
        }
        if (i10 == 0) {
            k6.f40556c = "";
            return iR;
        }
        k6.f40556c = com.google.android.gms.internal.measurement.K5.d(bArr, iR, i10);
        return iR + i10;
    }

    static int q(byte[] bArr, int i6) {
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    static int r(byte[] bArr, int i6, com.google.android.gms.internal.measurement.K3 k6) {
        int i10 = i6 + 1;
        byte b6 = bArr[i6];
        if (b6 < 0) {
            return e(b6, bArr, i10, k6);
        }
        k6.f40554a = b6;
        return i10;
    }

    static int s(byte[] bArr, int i6, com.google.android.gms.internal.measurement.K3 k6) {
        int i10 = i6 + 1;
        long j6 = bArr[i6];
        if (j6 >= 0) {
            k6.f40555b = j6;
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
        k6.f40555b = j10;
        return i11;
    }

    static long t(byte[] bArr, int i6) {
        return ((((long) bArr[i6 + 7]) & 255) << 56) | (((long) bArr[i6]) & 255) | ((((long) bArr[i6 + 1]) & 255) << 8) | ((((long) bArr[i6 + 2]) & 255) << 16) | ((((long) bArr[i6 + 3]) & 255) << 24) | ((((long) bArr[i6 + 4]) & 255) << 32) | ((((long) bArr[i6 + 5]) & 255) << 40) | ((((long) bArr[i6 + 6]) & 255) << 48);
    }
}
