package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f32321a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f32322b = 0;

    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    public static com.google.android.gms.internal.ads.T a(com.google.android.gms.internal.ads.RQ rq) {
        int i6;
        int i10;
        int iD;
        int iD2 = rq.d(16);
        int iD3 = rq.d(16);
        if (iD3 == 65535) {
            iD3 = rq.d(24);
            i6 = 7;
        } else {
            i6 = 4;
        }
        int i11 = iD3 + i6;
        if (iD2 == 44097) {
            i11 += 2;
        }
        int i12 = i11;
        int iD4 = rq.d(2);
        int i13 = 0;
        if (iD4 == 3) {
            int i14 = 0;
            while (true) {
                iD = i14 + rq.d(2);
                if (!rq.p()) {
                    break;
                }
                i14 = (iD + 1) << 2;
            }
            iD4 = iD + 3;
        }
        int i15 = iD4;
        int iD5 = rq.d(10);
        if (rq.p() && rq.d(3) > 0) {
            rq.n(2);
        }
        int i16 = true != rq.p() ? 44100 : 48000;
        int iD6 = rq.d(4);
        if (i16 == 44100 && iD6 == 13) {
            i10 = f32321a[13];
        } else {
            if (i16 == 48000 && iD6 < 14) {
                i13 = f32321a[iD6];
                int i17 = iD5 % 5;
                if (i17 == 1) {
                    if (iD6 != 3 || iD6 == 8) {
                        i13++;
                    }
                } else if (i17 != 2) {
                    if (i17 != 3) {
                        if (i17 == 4 && (iD6 == 3 || iD6 == 8 || iD6 == 11)) {
                            i13++;
                        }
                    } else if (iD6 != 3) {
                        i13++;
                    } else {
                        i13++;
                    }
                } else if (iD6 == 8 || iD6 == 11) {
                    i13++;
                }
            }
            i10 = i13;
        }
        return new com.google.android.gms.internal.ads.T(i15, 2, i16, i12, i10, null);
    }

    public static void b(int i6, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        c5128sR.i(7);
        byte[] bArrN = c5128sR.n();
        bArrN[0] = -84;
        bArrN[1] = 64;
        bArrN[2] = -1;
        bArrN[3] = -1;
        bArrN[4] = (byte) ((i6 >> 16) & 255);
        bArrN[5] = (byte) ((i6 >> 8) & 255);
        bArrN[6] = (byte) (i6 & 255);
    }
}
