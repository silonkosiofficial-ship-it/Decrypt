package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f30130a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f30131b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f30132c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f30133d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f30134e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f30135f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f30136g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int b(int i6) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (!m(i6) || (i10 = (i6 >>> 19) & 3) == 1 || (i11 = (i6 >>> 17) & 3) == 0 || (i12 = (i6 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i6 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = i12 - 1;
        int i16 = f30131b[i13];
        if (i10 == 2) {
            i16 /= 2;
        } else if (i10 == 0) {
            i16 /= 4;
        }
        int i17 = (i6 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f30132c[i15] : f30133d[i15]) * 12) / i16) + i17) * 4;
        }
        if (i10 == 3) {
            i14 = i11 == 2 ? f30134e[i15] : f30135f[i15];
        } else {
            i14 = f30136g[i15];
        }
        if (i10 == 3) {
            return ((i14 * 144) / i16) + i17;
        }
        return (((i11 == 1 ? 72 : 144) * i14) / i16) + i17;
    }

    public static int c(int i6) {
        int i10;
        int i11;
        if (!m(i6) || (i10 = (i6 >>> 19) & 3) == 1 || (i11 = (i6 >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = i6 >>> 12;
        int i13 = (i6 >>> 10) & 3;
        int i14 = i12 & 15;
        if (i14 == 0 || i14 == 15 || i13 == 3) {
            return -1;
        }
        return l(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i6, int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 384 : 1152;
        }
        return i6 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(int i6) {
        return (i6 & (-2097152)) == -2097152;
    }
}
