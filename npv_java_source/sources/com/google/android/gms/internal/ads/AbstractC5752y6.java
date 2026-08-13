package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5752y6 {
    public static android.util.Pair a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws com.google.android.gms.internal.ads.C4708of {
        interfaceC5300u0.j();
        com.google.android.gms.internal.ads.C5642x6 c5642x6D = d(1684108385, interfaceC5300u0, new com.google.android.gms.internal.ads.C5128sR(8));
        interfaceC5300u0.I(8);
        return android.util.Pair.create(java.lang.Long.valueOf(interfaceC5300u0.e()), java.lang.Long.valueOf(c5642x6D.f39788b));
    }

    public static com.google.android.gms.internal.ads.C5532w6 b(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws com.google.android.gms.internal.ads.C4708of {
        byte[] bArr;
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(16);
        com.google.android.gms.internal.ads.C5642x6 c5642x6D = d(1718449184, interfaceC5300u0, c5128sR);
        com.google.android.gms.internal.ads.LC.f(c5642x6D.f39788b >= 16);
        interfaceC5300u0.N(c5128sR.n(), 0, 16);
        c5128sR.l(0);
        int iA = c5128sR.A();
        int iA2 = c5128sR.A();
        int iZ = c5128sR.z();
        int iZ2 = c5128sR.z();
        int iA3 = c5128sR.A();
        int iA4 = c5128sR.A();
        int i6 = ((int) c5642x6D.f39788b) - 16;
        if (i6 > 0) {
            byte[] bArr2 = new byte[i6];
            interfaceC5300u0.N(bArr2, 0, i6);
            bArr = bArr2;
        } else {
            bArr = com.google.android.gms.internal.ads.EW.f27066f;
        }
        interfaceC5300u0.I((int) (interfaceC5300u0.d() - interfaceC5300u0.e()));
        return new com.google.android.gms.internal.ads.C5532w6(iA, iA2, iZ, iZ2, iA3, iA4, bArr);
    }

    public static boolean c(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(8);
        int i6 = com.google.android.gms.internal.ads.C5642x6.a(interfaceC5300u0, c5128sR).f39787a;
        if (i6 != 1380533830 && i6 != 1380333108) {
            return false;
        }
        interfaceC5300u0.N(c5128sR.n(), 0, 4);
        c5128sR.l(0);
        int iW = c5128sR.w();
        if (iW == 1463899717) {
            return true;
        }
        com.google.android.gms.internal.ads.AbstractC3586eM.c("WavHeaderReader", "Unsupported form type: " + iW);
        return false;
    }

    private static com.google.android.gms.internal.ads.C5642x6 d(int i6, com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.C5128sR c5128sR) throws com.google.android.gms.internal.ads.C4708of {
        while (true) {
            com.google.android.gms.internal.ads.C5642x6 c5642x6A = com.google.android.gms.internal.ads.C5642x6.a(interfaceC5300u0, c5128sR);
            int i10 = c5642x6A.f39787a;
            if (i10 == i6) {
                return c5642x6A;
            }
            com.google.android.gms.internal.ads.AbstractC3586eM.f("WavHeaderReader", "Ignoring unknown WAV chunk: " + i10);
            long j6 = c5642x6A.f39788b;
            long j10 = 8 + j6;
            if ((1 & j6) != 0) {
                j10 = j6 + 9;
            }
            if (j10 > 2147483647L) {
                throw com.google.android.gms.internal.ads.C4708of.c("Chunk is too large (~2GB+) to skip; id: " + c5642x6A.f39787a);
            }
            interfaceC5300u0.I((int) j10);
        }
    }
}
