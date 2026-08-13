package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3543e0 {
    public static void a(long j6, com.google.android.gms.internal.ads.C5128sR c5128sR, com.google.android.gms.internal.ads.InterfaceC3107a1[] interfaceC3107a1Arr) {
        int iW;
        while (true) {
            if (c5128sR.r() <= 1) {
                return;
            }
            int iC = c(c5128sR);
            int iC2 = c(c5128sR);
            int iT = c5128sR.t() + iC2;
            if (iC2 == -1 || iC2 > c5128sR.r()) {
                com.google.android.gms.internal.ads.AbstractC3586eM.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iT = c5128sR.u();
            } else if (iC == 4 && iC2 >= 8) {
                int iC3 = c5128sR.C();
                int iG = c5128sR.G();
                if (iG == 49) {
                    iW = c5128sR.w();
                    iG = 49;
                } else {
                    iW = 0;
                }
                int iC4 = c5128sR.C();
                if (iG == 47) {
                    c5128sR.m(1);
                    iG = 47;
                }
                boolean z6 = iC3 == 181 && (iG == 49 || iG == 47) && iC4 == 3;
                if (iG == 49) {
                    z6 &= iW == 1195456820;
                }
                if (z6) {
                    b(j6, c5128sR, interfaceC3107a1Arr);
                }
            }
            c5128sR.l(iT);
        }
    }

    public static void b(long j6, com.google.android.gms.internal.ads.C5128sR c5128sR, com.google.android.gms.internal.ads.InterfaceC3107a1[] interfaceC3107a1Arr) {
        int iC = c5128sR.C();
        if ((iC & 64) != 0) {
            int i6 = iC & 31;
            c5128sR.m(1);
            int iT = c5128sR.t();
            for (com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 : interfaceC3107a1Arr) {
                int i10 = i6 * 3;
                c5128sR.l(iT);
                interfaceC3107a1.a(c5128sR, i10);
                com.google.android.gms.internal.ads.LC.f(j6 != -9223372036854775807L);
                interfaceC3107a1.b(j6, 1, i10, 0, null);
            }
        }
    }

    private static int c(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int i6 = 0;
        while (c5128sR.r() != 0) {
            int iC = c5128sR.C();
            i6 += iC;
            if (iC != 255) {
                return i6;
            }
        }
        return -1;
    }
}
