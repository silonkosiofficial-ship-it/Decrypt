package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4763p6 {
    public static int a(byte[] bArr, int i6, int i10) {
        while (i6 < i10 && bArr[i6] != 71) {
            i6++;
        }
        return i6;
    }

    public static long b(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6, int i10) {
        c5128sR.l(i6);
        if (c5128sR.r() < 5) {
            return -9223372036854775807L;
        }
        int iW = c5128sR.w();
        if ((8388608 & iW) != 0 || ((iW >> 8) & 8191) != i10 || (iW & 32) == 0 || c5128sR.C() < 7 || c5128sR.r() < 7 || (c5128sR.C() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c5128sR.h(bArr, 0, 6);
        long j6 = bArr[0];
        long j10 = bArr[1];
        long j11 = bArr[2];
        long j12 = bArr[3] & 255;
        return ((j6 & 255) << 25) | ((j10 & 255) << 17) | ((j11 & 255) << 9) | (j12 + j12) | ((((long) bArr[4]) & 255) >> 7);
    }
}
