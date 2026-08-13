package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A0 {
    public static int a(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        switch (i6) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i6 - 2);
            case 6:
                return c5128sR.C() + 1;
            case 7:
                return c5128sR.G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i6 - 8);
            default:
                return -1;
        }
    }

    public static long b(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.E0 e6) throws com.google.android.gms.internal.ads.C4708of {
        interfaceC5300u0.j();
        interfaceC5300u0.D(1);
        byte[] bArr = new byte[1];
        interfaceC5300u0.N(bArr, 0, 1);
        int i6 = bArr[0] & 1;
        boolean z6 = 1 == i6;
        interfaceC5300u0.D(2);
        int i10 = 1 != i6 ? 6 : 7;
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(i10);
        c5128sR.k(com.google.android.gms.internal.ads.AbstractC5630x0.a(interfaceC5300u0, c5128sR.n(), 0, i10));
        interfaceC5300u0.j();
        com.google.android.gms.internal.ads.C5850z0 c5850z0 = new com.google.android.gms.internal.ads.C5850z0();
        if (d(c5128sR, e6, z6, c5850z0)) {
            return c5850z0.f40186a;
        }
        throw com.google.android.gms.internal.ads.C4708of.a(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae A[RETURN] */
    public static boolean c(com.google.android.gms.internal.ads.C5128sR c5128sR, com.google.android.gms.internal.ads.E0 e6, int i6, com.google.android.gms.internal.ads.C5850z0 c5850z0) {
        int iA;
        int iT = c5128sR.t();
        long jK = c5128sR.K();
        long j6 = jK >>> 16;
        if (j6 != i6) {
            return false;
        }
        boolean z6 = (j6 & 1) == 1;
        long j10 = jK >> 12;
        long j11 = jK >> 8;
        long j12 = jK >> 4;
        long j13 = jK >> 1;
        long j14 = jK & 1;
        int i10 = (int) (j12 & 15);
        if (i10 > 7 ? !(i10 > 10 || e6.f26864g != 2) : i10 == e6.f26864g - 1) {
            int i11 = (int) (j13 & 7);
            if ((i11 == 0 || i11 == e6.f26866i) && j14 != 1 && d(c5128sR, e6, z6, c5850z0) && (iA = a(c5128sR, (int) (j10 & 15))) != -1 && iA <= e6.f26859b) {
                int i12 = e6.f26862e;
                int i13 = (int) (j11 & 15);
                if (i13 != 0) {
                    if (i13 <= 11) {
                        if (i13 == e6.f26863f) {
                            if (c5128sR.C() == com.google.android.gms.internal.ads.EW.y(c5128sR.n(), iT, c5128sR.t() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i13 == 12) {
                        if (c5128sR.C() * 1000 == i12) {
                            if (c5128sR.C() == com.google.android.gms.internal.ads.EW.y(c5128sR.n(), iT, c5128sR.t() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i13 <= 14) {
                        int iG = c5128sR.G();
                        if (i13 == 14) {
                            iG *= 10;
                        }
                        if (iG == i12) {
                            if (c5128sR.C() == com.google.android.gms.internal.ads.EW.y(c5128sR.n(), iT, c5128sR.t() - 1, 0)) {
                                return true;
                            }
                        }
                    }
                } else if (c5128sR.C() == com.google.android.gms.internal.ads.EW.y(c5128sR.n(), iT, c5128sR.t() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean d(com.google.android.gms.internal.ads.C5128sR c5128sR, com.google.android.gms.internal.ads.E0 e6, boolean z6, com.google.android.gms.internal.ads.C5850z0 c5850z0) {
        try {
            long jN = c5128sR.N();
            if (!z6) {
                jN *= (long) e6.f26859b;
            }
            c5850z0.f40186a = jN;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }
}
