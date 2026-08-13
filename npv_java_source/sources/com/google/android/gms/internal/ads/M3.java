package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f29644a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static com.google.android.gms.internal.ads.X0 a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        return c(interfaceC5300u0, true, false);
    }

    public static com.google.android.gms.internal.ads.X0 b(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, boolean z6) {
        return c(interfaceC5300u0, false, z6);
    }

    private static com.google.android.gms.internal.ads.X0 c(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, boolean z6, boolean z10) {
        int i6;
        com.google.android.gms.internal.ads.C5128sR c5128sR;
        int i10;
        int[] iArr;
        long jF = interfaceC5300u0.f();
        long j6 = -1;
        long j10 = 4096;
        if (jF != -1 && jF <= 4096) {
            j10 = jF;
        }
        com.google.android.gms.internal.ads.C5128sR c5128sR2 = new com.google.android.gms.internal.ads.C5128sR(64);
        int i11 = (int) j10;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        while (i13 < i11) {
            c5128sR2.i(8);
            boolean z12 = true;
            if (!interfaceC5300u0.L(c5128sR2.n(), i12, 8, true)) {
                break;
            }
            long jK = c5128sR2.K();
            int iW = c5128sR2.w();
            if (jK == 1) {
                interfaceC5300u0.N(c5128sR2.n(), 8, 8);
                i6 = 16;
                c5128sR2.k(16);
                jK = c5128sR2.J();
            } else {
                if (jK == 0) {
                    long jF2 = interfaceC5300u0.f();
                    if (jF2 != j6) {
                        jK = (jF2 - interfaceC5300u0.d()) + 8;
                    }
                }
                i6 = 8;
            }
            long j11 = jK;
            long j12 = i6;
            if (j11 < j12) {
                return new com.google.android.gms.internal.ads.C3989i3(iW, j11, i6);
            }
            i13 += i6;
            if (iW == 1836019574) {
                i11 += (int) j11;
                if (jF != -1 && i11 > jF) {
                    i11 = (int) jF;
                }
                c5128sR2 = c5128sR2;
                j6 = -1;
                i12 = 0;
            } else {
                if (iW == 1836019558 || iW == 1836475768) {
                    i12 = 1;
                    break;
                }
                z11 |= !(iW != 1835295092);
                long j13 = jF;
                if ((((long) i13) + j11) - j12 >= i11) {
                    i12 = 0;
                    break;
                }
                int i14 = (int) (j11 - j12);
                i13 += i14;
                if (iW != 1718909296) {
                    c5128sR = c5128sR2;
                    i10 = 0;
                    if (i14 != 0) {
                        interfaceC5300u0.D(i14);
                    }
                } else {
                    if (i14 < 8) {
                        return new com.google.android.gms.internal.ads.C3989i3(1718909296, i14, 8);
                    }
                    c5128sR = c5128sR2;
                    c5128sR.i(i14);
                    i10 = 0;
                    interfaceC5300u0.N(c5128sR.n(), 0, i14);
                    int iW2 = c5128sR.w();
                    boolean zD = d(iW2, z10) | z11;
                    c5128sR.m(4);
                    int iR = c5128sR.r() / 4;
                    if (!zD && iR > 0) {
                        iArr = new int[iR];
                        int i15 = 0;
                        while (true) {
                            if (i15 >= iR) {
                                z12 = zD;
                                break;
                            }
                            int iW3 = c5128sR.w();
                            iArr[i15] = iW3;
                            if (d(iW3, z10)) {
                                break;
                            }
                            i15++;
                        }
                    } else {
                        z12 = zD;
                        iArr = null;
                    }
                    if (!z12) {
                        return new com.google.android.gms.internal.ads.R3(iW2, iArr);
                    }
                    z11 = z12;
                }
                c5128sR2 = c5128sR;
                i12 = i10;
                jF = j13;
                j6 = -1;
            }
        }
        if (!z11) {
            return com.google.android.gms.internal.ads.H3.f27954a;
        }
        if (z6 != i12) {
            return i12 != 0 ? com.google.android.gms.internal.ads.C3.f26134a : com.google.android.gms.internal.ads.C3.f26135b;
        }
        return null;
    }

    private static boolean d(int i6, boolean z6) {
        if ((i6 >>> 8) == 3368816) {
            return true;
        }
        if (i6 == 1751476579) {
            if (z6) {
                return true;
            }
            i6 = 1751476579;
        }
        int[] iArr = f29644a;
        for (int i10 = 0; i10 < 29; i10++) {
            if (iArr[i10] == i6) {
                return true;
            }
        }
        return false;
    }
}
