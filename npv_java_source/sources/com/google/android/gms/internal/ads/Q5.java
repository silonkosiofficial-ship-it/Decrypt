package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Q5 {
    public static com.google.android.gms.internal.ads.N5 a(com.google.android.gms.internal.ads.RQ rq) throws com.google.android.gms.internal.ads.C4708of {
        int iD;
        int i6;
        char c6;
        int i10;
        int iD2;
        char c10;
        int iD3 = rq.d(8);
        int i11 = 5;
        int iD4 = rq.d(5);
        if (iD4 != 31) {
            switch (iD4) {
                case 0:
                    iD = 96000;
                    break;
                case 1:
                    iD = 88200;
                    break;
                case 2:
                    iD = 64000;
                    break;
                case 3:
                    iD = 48000;
                    break;
                case 4:
                    iD = 44100;
                    break;
                case 5:
                    iD = 32000;
                    break;
                case 6:
                    iD = 24000;
                    break;
                case 7:
                    iD = 22050;
                    break;
                case 8:
                    iD = 16000;
                    break;
                case 9:
                    iD = 12000;
                    break;
                case 10:
                    iD = 11025;
                    break;
                case 11:
                    iD = 8000;
                    break;
                case 12:
                    iD = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw com.google.android.gms.internal.ads.C4708of.c("Unsupported sampling rate index " + iD4);
                case 15:
                    iD = 57600;
                    break;
                case 16:
                    iD = 51200;
                    break;
                case 17:
                    iD = 40000;
                    break;
                case 18:
                    iD = 38400;
                    break;
                case 19:
                    iD = 34150;
                    break;
                case 20:
                    iD = 28800;
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    iD = 25600;
                    break;
                case 22:
                    iD = 20000;
                    break;
                case 23:
                    iD = 19200;
                    break;
                case 24:
                    iD = 17075;
                    break;
                case 25:
                    iD = 14400;
                    break;
                case 26:
                    iD = 12800;
                    break;
                case 27:
                    iD = 9600;
                    break;
            }
        } else {
            iD = rq.d(24);
        }
        int iD5 = rq.d(3);
        int i12 = 1;
        if (iD5 == 0) {
            i6 = 768;
        } else if (iD5 == 1) {
            i6 = 1024;
        } else if (iD5 == 2 || iD5 == 3) {
            i6 = 2048;
        } else {
            if (iD5 != 4) {
                throw com.google.android.gms.internal.ads.C4708of.c("Unsupported coreSbrFrameLengthIndex " + iD5);
            }
            i6 = 4096;
        }
        if (iD5 == 0 || iD5 == 1) {
            c6 = 0;
        } else if (iD5 == 2) {
            c6 = 2;
        } else if (iD5 == 3) {
            c6 = 3;
        } else {
            if (iD5 != 4) {
                throw com.google.android.gms.internal.ads.C4708of.c("Unsupported coreSbrFrameLengthIndex " + iD5);
            }
            c6 = 1;
        }
        rq.n(2);
        e(rq);
        int iD6 = rq.d(5);
        int i13 = 0;
        int iC = 0;
        while (true) {
            int i14 = 16;
            if (i13 < iD6 + 1) {
                int iD7 = rq.d(3);
                iC += c(rq, 5, 8, 16) + 1;
                if ((iD7 == 0 || iD7 == 2) && rq.p()) {
                    e(rq);
                }
                i13++;
            } else {
                int iC2 = c(rq, 4, 8, 16) + 1;
                rq.m();
                int i15 = 0;
                while (true) {
                    double d6 = 2.0d;
                    if (i15 >= iC2) {
                        int i16 = iD3;
                        byte[] bArr = null;
                        if (rq.p()) {
                            int iC3 = c(rq, 2, 4, 8) + 1;
                            for (int i17 = 0; i17 < iC3; i17++) {
                                int iC4 = c(rq, 4, 8, 16);
                                int iC5 = c(rq, 4, 8, 16);
                                if (iC4 == 7) {
                                    int iD8 = rq.d(4) + 1;
                                    rq.n(4);
                                    byte[] bArr2 = new byte[iD8];
                                    for (int i18 = 0; i18 < iD8; i18++) {
                                        bArr2[i18] = (byte) rq.d(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    rq.n(iC5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iD) {
                            case 14700:
                            case 16000:
                                d6 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d6 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d6 = 1.0d;
                                break;
                            default:
                                throw com.google.android.gms.internal.ads.C4708of.c("Unsupported sampling rate " + iD);
                        }
                        return new com.google.android.gms.internal.ads.N5(i16, (int) (((double) iD) * d6), (int) (((double) i6) * d6), bArr3, null);
                    }
                    int iD9 = rq.d(2);
                    if (iD9 == 0) {
                        i10 = iD3;
                        f(rq);
                        if (c6 > 0) {
                            d(rq);
                        }
                    } else if (iD9 != i12) {
                        if (iD9 == 3) {
                            c(rq, 4, 8, i14);
                            int iC6 = c(rq, 4, 8, i14);
                            if (rq.p()) {
                                c(rq, 8, i14, 0);
                            }
                            rq.m();
                            if (iC6 > 0) {
                                rq.n(iC6 * 8);
                            }
                        }
                        i10 = iD3;
                    } else {
                        if (f(rq)) {
                            rq.m();
                        }
                        if (c6 > 0) {
                            d(rq);
                            iD2 = rq.d(2);
                            c10 = c6;
                        } else {
                            iD2 = 0;
                            c10 = 0;
                        }
                        if (iD2 > 0) {
                            rq.n(6);
                            int iD10 = rq.d(2);
                            rq.n(4);
                            if (rq.p()) {
                                rq.n(i11);
                            }
                            if (iD2 == 2 || iD2 == 3) {
                                rq.n(6);
                            }
                            if (iD10 == 2) {
                                rq.m();
                            }
                        }
                        i10 = iD3;
                        int iFloor = ((int) java.lang.Math.floor(java.lang.Math.log(iC - 1) / java.lang.Math.log(2.0d))) + 1;
                        int iD11 = rq.d(2);
                        if (iD11 > 0 && rq.p()) {
                            rq.n(iFloor);
                        }
                        if (rq.p()) {
                            rq.n(iFloor);
                        }
                        if (c10 == 0 && iD11 == 0) {
                            rq.m();
                        }
                    }
                    i15++;
                    iD3 = i10;
                    i11 = 5;
                    i12 = 1;
                    i14 = 16;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042  */
    public static boolean b(com.google.android.gms.internal.ads.RQ rq, com.google.android.gms.internal.ads.M5 m6) throws com.google.android.gms.internal.ads.C4708of {
        long jE;
        rq.b();
        int iC = c(rq, 3, 8, 8);
        m6.f29651a = iC;
        if (iC == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.LC.d(java.lang.Math.max(java.lang.Math.max(2, 8), 32) <= 63);
        com.google.android.gms.internal.ads.AbstractC2281Dj0.a(com.google.android.gms.internal.ads.AbstractC2281Dj0.a(3L, 255L), 4294967296L);
        if (rq.a() < 2) {
            jE = -1;
        } else {
            jE = rq.e(2);
            if (jE == 3) {
                if (rq.a() < 8) {
                    jE = -1;
                } else {
                    long jE2 = rq.e(8);
                    long j6 = 3 + jE2;
                    if (jE2 != 255) {
                        jE = j6;
                    } else if (rq.a() < 32) {
                        jE = -1;
                    } else {
                        jE = rq.e(32) + j6;
                    }
                }
            }
        }
        m6.f29652b = jE;
        if (jE == -1) {
            return false;
        }
        if (jE > 16) {
            throw com.google.android.gms.internal.ads.C4708of.c("Contains sub-stream with an invalid packet label " + jE);
        }
        if (jE == 0) {
            int i6 = m6.f29651a;
            if (i6 == 1) {
                throw com.google.android.gms.internal.ads.C4708of.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i6 == 2) {
                throw com.google.android.gms.internal.ads.C4708of.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i6 == 17) {
                throw com.google.android.gms.internal.ads.C4708of.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iC2 = c(rq, 11, 24, 24);
        m6.f29653c = iC2;
        return iC2 != -1;
    }

    private static int c(com.google.android.gms.internal.ads.RQ rq, int i6, int i10, int i11) {
        com.google.android.gms.internal.ads.LC.d(java.lang.Math.max(java.lang.Math.max(i6, i10), i11) <= 31);
        int i12 = (1 << i6) - 1;
        int i13 = (1 << i10) - 1;
        com.google.android.gms.internal.ads.AbstractC2207Bj0.a(com.google.android.gms.internal.ads.AbstractC2207Bj0.a(i12, i13), 1 << i11);
        if (rq.a() < i6) {
            return -1;
        }
        int iD = rq.d(i6);
        if (iD != i12) {
            return iD;
        }
        if (rq.a() < i10) {
            return -1;
        }
        int iD2 = rq.d(i10);
        int i14 = iD + iD2;
        if (iD2 != i13) {
            return i14;
        }
        if (rq.a() < i11) {
            return -1;
        }
        return i14 + rq.d(i11);
    }

    private static void d(com.google.android.gms.internal.ads.RQ rq) {
        rq.n(3);
        rq.n(8);
        boolean zP = rq.p();
        boolean zP2 = rq.p();
        if (zP) {
            rq.n(5);
        }
        if (zP2) {
            rq.n(6);
        }
    }

    private static void e(com.google.android.gms.internal.ads.RQ rq) {
        int iD;
        int iD2 = rq.d(2);
        if (iD2 == 0) {
            rq.n(6);
            return;
        }
        int iC = c(rq, 5, 8, 16) + 1;
        if (iD2 == 1) {
            rq.n(iC * 7);
            return;
        }
        if (iD2 == 2) {
            boolean zP = rq.p();
            int i6 = true != zP ? 5 : 1;
            int i10 = true == zP ? 7 : 5;
            int i11 = true == zP ? 8 : 6;
            int i12 = 0;
            while (i12 < iC) {
                if (rq.p()) {
                    rq.n(7);
                    iD = 0;
                } else {
                    if (rq.d(2) == 3 && rq.d(i10) * i6 != 0) {
                        rq.m();
                    }
                    iD = rq.d(i11) * i6;
                    if (iD != 0 && iD != 180) {
                        rq.m();
                    }
                    rq.m();
                }
                if (iD != 0 && iD != 180 && rq.p()) {
                    i12++;
                }
                i12++;
            }
        }
    }

    private static boolean f(com.google.android.gms.internal.ads.RQ rq) {
        rq.n(3);
        boolean zP = rq.p();
        if (zP) {
            rq.n(13);
        }
        return zP;
    }
}
