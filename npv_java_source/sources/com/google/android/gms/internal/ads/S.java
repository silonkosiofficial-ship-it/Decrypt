package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f31507a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f31508b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f31509c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f31510d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f31511e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f31512f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f31513g = 0;

    public static int a(java.nio.ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f31507a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b6 = bArr[4];
            return f((b6 & 192) >> 6, b6 & 63);
        }
        int i6 = bArr[2] & 7;
        int i10 = ((bArr[3] & 255) | (i6 << 8)) + 1;
        return i10 + i10;
    }

    public static com.google.android.gms.internal.ads.D c(com.google.android.gms.internal.ads.C5128sR c5128sR, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.EH0 eh0) {
        com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ();
        rq.j(c5128sR);
        int i6 = f31508b[rq.d(2)];
        rq.n(8);
        int i10 = f31510d[rq.d(3)];
        if (rq.d(1) != 0) {
            i10++;
        }
        int i11 = f31511e[rq.d(5)] * 1000;
        rq.f();
        c5128sR.l(rq.b());
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.m(str);
        c4682oK0.B("audio/ac3");
        c4682oK0.r0(i10);
        c4682oK0.C(i6);
        c4682oK0.f(eh0);
        c4682oK0.q(str2);
        c4682oK0.q0(i11);
        c4682oK0.v(i11);
        return c4682oK0.H();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static com.google.android.gms.internal.ads.D d(com.google.android.gms.internal.ads.C5128sR c5128sR, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.EH0 eh0) {
        java.lang.String str3;
        com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ();
        rq.j(c5128sR);
        int iD = rq.d(13) * 1000;
        rq.n(3);
        int i6 = f31508b[rq.d(2)];
        rq.n(10);
        int i10 = f31510d[rq.d(3)];
        if (rq.d(1) != 0) {
            i10++;
        }
        rq.n(3);
        int iD2 = rq.d(4);
        rq.n(1);
        if (iD2 > 0) {
            rq.n(6);
            if (rq.d(1) != 0) {
                i10 += 2;
            }
            rq.n(1);
        }
        if (rq.a() > 7) {
            rq.n(7);
            if (rq.d(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        rq.f();
        c5128sR.l(rq.b());
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.m(str);
        c4682oK0.B(str3);
        c4682oK0.r0(i10);
        c4682oK0.C(i6);
        c4682oK0.f(eh0);
        c4682oK0.q(str2);
        c4682oK0.v(iD);
        return c4682oK0.H();
    }

    public static com.google.android.gms.internal.ads.P e(com.google.android.gms.internal.ads.RQ rq) {
        int i6;
        int i10;
        java.lang.String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iC = rq.c();
        rq.n(40);
        int iD = rq.d(5);
        rq.l(iC);
        int i20 = -1;
        if (iD > 10) {
            rq.n(16);
            int iD2 = rq.d(2);
            if (iD2 == 0) {
                i20 = 0;
            } else if (iD2 == 1) {
                i20 = 1;
            } else if (iD2 == 2) {
                i20 = 2;
            }
            rq.n(3);
            int iD3 = rq.d(11) + 1;
            int iD4 = rq.d(2);
            if (iD4 == 3) {
                i16 = f31509c[rq.d(2)];
                i17 = 6;
                i15 = 3;
            } else {
                int iD5 = rq.d(2);
                int i21 = f31507a[iD5];
                i15 = iD5;
                i16 = f31508b[iD4];
                i17 = i21;
            }
            int i22 = iD3 + iD3;
            int i23 = (i22 * i16) / (i17 * 32);
            int iD6 = rq.d(3);
            boolean zP = rq.p();
            i6 = f31510d[iD6] + (zP ? 1 : 0);
            rq.n(10);
            if (rq.p()) {
                rq.n(8);
            }
            if (iD6 == 0) {
                rq.n(5);
                if (rq.p()) {
                    rq.n(8);
                }
                i18 = 0;
                iD6 = 0;
            } else {
                i18 = iD6;
            }
            if (i20 == 1) {
                if (rq.p()) {
                    rq.n(16);
                }
                i19 = 1;
            } else {
                i19 = i20;
            }
            if (rq.p()) {
                if (i18 > 2) {
                    rq.n(2);
                }
                if ((i18 & 1) != 0 && i18 > 2) {
                    rq.n(6);
                }
                if ((i18 & 4) != 0) {
                    rq.n(6);
                }
                if (zP && rq.p()) {
                    rq.n(5);
                }
                if (i19 == 0) {
                    if (rq.p()) {
                        rq.n(6);
                    }
                    if (i18 == 0 && rq.p()) {
                        rq.n(6);
                    }
                    if (rq.p()) {
                        rq.n(6);
                    }
                    int iD7 = rq.d(2);
                    if (iD7 == 1) {
                        rq.n(5);
                    } else if (iD7 == 2) {
                        rq.n(12);
                    } else if (iD7 == 3) {
                        int iD8 = rq.d(5);
                        if (rq.p()) {
                            rq.n(5);
                            if (rq.p()) {
                                rq.n(4);
                            }
                            if (rq.p()) {
                                rq.n(4);
                            }
                            if (rq.p()) {
                                rq.n(4);
                            }
                            if (rq.p()) {
                                rq.n(4);
                            }
                            if (rq.p()) {
                                rq.n(4);
                            }
                            if (rq.p()) {
                                rq.n(4);
                            }
                            if (rq.p()) {
                                rq.n(4);
                            }
                            if (rq.p()) {
                                if (rq.p()) {
                                    rq.n(4);
                                }
                                if (rq.p()) {
                                    rq.n(4);
                                }
                            }
                        }
                        if (rq.p()) {
                            rq.n(5);
                            if (rq.p()) {
                                rq.n(7);
                                if (rq.p()) {
                                    rq.n(8);
                                }
                            }
                        }
                        rq.n((iD8 + 2) * 8);
                        rq.f();
                    }
                    if (i18 < 2) {
                        if (rq.p()) {
                            rq.n(14);
                        }
                        if (iD6 == 0 && rq.p()) {
                            rq.n(14);
                        }
                    }
                    if (!rq.p()) {
                        i19 = 0;
                    } else if (i15 == 0) {
                        rq.n(5);
                        i19 = 0;
                        i15 = 0;
                    } else {
                        for (int i24 = 0; i24 < i17; i24++) {
                            if (rq.p()) {
                                rq.n(5);
                            }
                        }
                        i19 = 0;
                    }
                }
            }
            if (rq.p()) {
                rq.n(5);
                if (i18 == 2) {
                    rq.n(4);
                    i18 = 2;
                }
                if (i18 >= 6) {
                    rq.n(2);
                }
                if (rq.p()) {
                    rq.n(8);
                }
                if (i18 == 0 && rq.p()) {
                    rq.n(8);
                }
                if (iD4 < 3) {
                    rq.m();
                }
            }
            if (i19 == 0 && i15 != 3) {
                rq.m();
            }
            if (i19 == 2 && (i15 == 3 || rq.p())) {
                rq.n(6);
            }
            str = (rq.p() && rq.d(6) == 1 && rq.d(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i10 = i20;
            i12 = i22;
            i13 = i16;
            i14 = i17 * 256;
            i11 = i23;
        } else {
            rq.n(32);
            int iD9 = rq.d(2);
            java.lang.String str2 = iD9 == 3 ? null : "audio/ac3";
            int iD10 = rq.d(6);
            int i25 = f31511e[iD10 / 2] * 1000;
            int iF = f(iD9, iD10);
            rq.n(8);
            int iD11 = rq.d(3);
            if ((iD11 & 1) != 0 && iD11 != 1) {
                rq.n(2);
            }
            if ((iD11 & 4) != 0) {
                rq.n(2);
            }
            if (iD11 == 2) {
                rq.n(2);
            }
            int i26 = iD9 < 3 ? f31508b[iD9] : -1;
            i6 = f31510d[iD11] + (rq.p() ? 1 : 0);
            i10 = -1;
            str = str2;
            i11 = i25;
            i12 = iF;
            i13 = i26;
            i14 = 1536;
        }
        return new com.google.android.gms.internal.ads.P(str, i10, i6, i13, i12, i14, i11, null);
    }

    private static int f(int i6, int i10) {
        int i11;
        if (i6 < 0 || i6 >= 3 || i10 < 0 || (i11 = i10 >> 1) >= 19) {
            return -1;
        }
        int i12 = f31508b[i6];
        if (i12 == 44100) {
            int i13 = f31512f[i11] + (i10 & 1);
            return i13 + i13;
        }
        int i14 = f31511e[i11];
        return i12 == 32000 ? i14 * 6 : i14 * 4;
    }
}
