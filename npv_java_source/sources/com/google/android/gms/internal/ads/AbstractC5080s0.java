package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5080s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f38600a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f38601b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f38602c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f38603d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f38604e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f38605f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f38606g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f38607h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f38608i = {5, 8, 10, 12};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f38609j = 0;

    public static int a(byte[] bArr) {
        com.google.android.gms.internal.ads.RQ rqG = g(bArr);
        rqG.n(42);
        return rqG.d(true != rqG.p() ? 8 : 12) + 1;
    }

    public static int b(byte[] bArr) {
        com.google.android.gms.internal.ads.RQ rqG = g(bArr);
        rqG.n(32);
        return f(rqG, f38608i, true) + 1;
    }

    public static com.google.android.gms.internal.ads.D c(byte[] bArr, java.lang.String str, java.lang.String str2, int i6, com.google.android.gms.internal.ads.EH0 eh0) {
        com.google.android.gms.internal.ads.RQ rqG = g(bArr);
        rqG.n(60);
        int i10 = f38600a[rqG.d(6)];
        int i11 = f38601b[rqG.d(4)];
        int iD = rqG.d(5);
        int i12 = iD >= 29 ? -1 : (f38602c[iD] * 1000) / 2;
        rqG.n(10);
        int i13 = i10 + (rqG.d(2) > 0 ? 1 : 0);
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.m(str);
        c4682oK0.B("audio/vnd.dts");
        c4682oK0.q0(i12);
        c4682oK0.r0(i13);
        c4682oK0.C(i11);
        c4682oK0.f(null);
        c4682oK0.q(str2);
        c4682oK0.y(i6);
        return c4682oK0.H();
    }

    public static com.google.android.gms.internal.ads.C4861q0 d(byte[] bArr) throws com.google.android.gms.internal.ads.C4708of {
        int iD;
        int i6;
        int iD2;
        long jM;
        int i10;
        com.google.android.gms.internal.ads.RQ rqG = g(bArr);
        rqG.n(40);
        int iD3 = rqG.d(2);
        boolean zP = rqG.p();
        int i11 = true != zP ? 16 : 20;
        rqG.n(true != zP ? 8 : 12);
        int iD4 = rqG.d(i11) + 1;
        boolean zP2 = rqG.p();
        int i12 = 0;
        if (zP2) {
            iD = rqG.d(2);
            int iD5 = rqG.d(3) + 1;
            if (rqG.p()) {
                rqG.n(36);
            }
            int iD6 = rqG.d(3) + 1;
            int iD7 = rqG.d(3) + 1;
            if (iD6 != 1 || iD7 != 1) {
                throw com.google.android.gms.internal.ads.C4708of.c("Multiple audio presentations or assets not supported");
            }
            int i13 = iD3 + 1;
            int iD8 = rqG.d(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                if (((iD8 >> i14) & 1) == 1) {
                    rqG.n(8);
                }
            }
            int i15 = iD5 * 512;
            if (rqG.p()) {
                rqG.n(2);
                int iD9 = (rqG.d(2) + 1) << 2;
                int iD10 = rqG.d(2) + 1;
                while (i12 < iD10) {
                    rqG.n(iD9);
                    i12++;
                }
            }
            i12 = i15;
        } else {
            iD = -1;
        }
        rqG.n(i11);
        rqG.n(12);
        if (zP2) {
            if (rqG.p()) {
                rqG.n(4);
            }
            if (rqG.p()) {
                rqG.n(24);
            }
            if (rqG.p()) {
                rqG.o(rqG.d(10) + 1);
            }
            rqG.n(5);
            int i16 = f38603d[rqG.d(4)];
            iD2 = rqG.d(8) + 1;
            i6 = i16;
        } else {
            i6 = -2147483647;
            iD2 = -1;
        }
        if (zP2) {
            if (iD == 0) {
                i10 = 32000;
            } else if (iD == 1) {
                i10 = 44100;
            } else {
                if (iD != 2) {
                    throw com.google.android.gms.internal.ads.C4708of.a("Unsupported reference clock code in DTS HD header: " + iD, null);
                }
                i10 = 48000;
            }
            jM = com.google.android.gms.internal.ads.EW.M(i12, 1000000L, i10, java.math.RoundingMode.DOWN);
        } else {
            jM = -9223372036854775807L;
        }
        return new com.google.android.gms.internal.ads.C4861q0("audio/vnd.dts.hd;profile=lbr", iD2, i6, iD4, jM, 0, null);
    }

    public static com.google.android.gms.internal.ads.C4861q0 e(byte[] bArr, java.util.concurrent.atomic.AtomicInteger atomicInteger) throws com.google.android.gms.internal.ads.C4708of {
        long jM;
        int iD;
        int i6;
        int i10;
        com.google.android.gms.internal.ads.RQ rqG = g(bArr);
        int iD2 = rqG.d(32);
        int iF = f(rqG, f38604e, true);
        int i11 = iF + 1;
        char c6 = iD2 == 1078008818 ? (char) 1 : (char) 0;
        if (c6 == 0) {
            jM = -9223372036854775807L;
            iD = -2147483647;
        } else {
            if (!rqG.p()) {
                throw com.google.android.gms.internal.ads.C4708of.c("Only supports full channel mask-based audio presentation");
            }
            int i12 = iF - 1;
            if (((bArr[iF] & 255) | ((char) (bArr[i12] << 8))) != com.google.android.gms.internal.ads.EW.w(bArr, 0, i12, 65535)) {
                throw com.google.android.gms.internal.ads.C4708of.a("CRC check failed", null);
            }
            int iD3 = rqG.d(2);
            if (iD3 == 0) {
                i6 = 512;
            } else if (iD3 == 1) {
                i6 = 480;
            } else {
                if (iD3 != 2) {
                    throw com.google.android.gms.internal.ads.C4708of.a("Unsupported base duration index in DTS UHD header: " + iD3, null);
                }
                i6 = 384;
            }
            int iD4 = rqG.d(3) + 1;
            int iD5 = rqG.d(2);
            if (iD5 == 0) {
                i10 = 32000;
            } else if (iD5 == 1) {
                i10 = 44100;
            } else {
                if (iD5 != 2) {
                    throw com.google.android.gms.internal.ads.C4708of.a("Unsupported clock rate index in DTS UHD header: " + iD5, null);
                }
                i10 = 48000;
            }
            if (rqG.p()) {
                rqG.n(36);
            }
            iD = (1 << rqG.d(2)) * i10;
            jM = com.google.android.gms.internal.ads.EW.M(i6 * iD4, 1000000L, i10, java.math.RoundingMode.DOWN);
        }
        int i13 = iD;
        long j6 = jM;
        int iF2 = 0;
        for (char c10 = 0; c10 < c6; c10 = 1) {
            iF2 += f(rqG, f38605f, true);
        }
        for (int i14 = 0; i14 <= 0; i14++) {
            if (c6 != 0) {
                atomicInteger.set(f(rqG, f38606g, true));
            }
            iF2 += atomicInteger.get() != 0 ? f(rqG, f38607h, true) : 0;
        }
        return new com.google.android.gms.internal.ads.C4861q0("audio/vnd.dts.uhd;profile=p2", 2, i13, i11 + iF2, j6, 0, null);
    }

    private static int f(com.google.android.gms.internal.ads.RQ rq, int[] iArr, boolean z6) {
        int i6 = 0;
        for (int i10 = 0; i10 < 3 && rq.p(); i10++) {
            i6++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i6; i12++) {
            i11 += 1 << iArr[i12];
        }
        return i11 + rq.d(iArr[i6]);
    }

    private static com.google.android.gms.internal.ads.RQ g(byte[] bArr) {
        byte b6 = bArr[0];
        if (b6 == 127 || b6 == 100 || b6 == 64 || b6 == 113) {
            return new com.google.android.gms.internal.ads.RQ(bArr, bArr.length);
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        byte b10 = bArrCopyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i6 = 0; i6 < bArrCopyOf.length - 1; i6 += 2) {
                byte b11 = bArrCopyOf[i6];
                int i10 = i6 + 1;
                bArrCopyOf[i6] = bArrCopyOf[i10];
                bArrCopyOf[i10] = b11;
            }
        }
        int length = bArrCopyOf.length;
        com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            com.google.android.gms.internal.ads.RQ rq2 = new com.google.android.gms.internal.ads.RQ(bArrCopyOf, length);
            while (rq2.a() >= 16) {
                rq2.n(2);
                rq.g(rq2.d(14), 14);
            }
        }
        rq.k(bArrCopyOf, bArrCopyOf.length);
        return rq;
    }
}
