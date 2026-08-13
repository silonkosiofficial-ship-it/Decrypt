package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f30420a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f30421b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static com.google.android.gms.internal.ads.M a(byte[] bArr) {
        return b(new com.google.android.gms.internal.ads.RQ(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.M b(com.google.android.gms.internal.ads.RQ r11, boolean r12) throws com.google.android.gms.internal.ads.C4708of {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.O.b(com.google.android.gms.internal.ads.RQ, boolean):com.google.android.gms.internal.ads.M");
    }

    private static int c(com.google.android.gms.internal.ads.RQ rq) {
        int iD = rq.d(5);
        return iD == 31 ? rq.d(6) + 32 : iD;
    }

    private static int d(com.google.android.gms.internal.ads.RQ rq) throws com.google.android.gms.internal.ads.C4708of {
        int iD = rq.d(4);
        if (iD == 15) {
            if (rq.a() >= 24) {
                return rq.d(24);
            }
            throw com.google.android.gms.internal.ads.C4708of.a("AAC header insufficient data", null);
        }
        if (iD < 13) {
            return f30420a[iD];
        }
        throw com.google.android.gms.internal.ads.C4708of.a("AAC header wrong Sampling Frequency Index", null);
    }
}
