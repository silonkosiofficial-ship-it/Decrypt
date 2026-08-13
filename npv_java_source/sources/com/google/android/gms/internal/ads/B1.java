package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class B1 extends com.google.android.gms.internal.ads.F1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f25836e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25839d;

    public B1(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1) {
        super(interfaceC3107a1);
    }

    @Override // com.google.android.gms.internal.ads.F1
    protected final boolean a(com.google.android.gms.internal.ads.C5128sR c5128sR) throws com.google.android.gms.internal.ads.E1 {
        com.google.android.gms.internal.ads.D dH;
        if (this.f25837b) {
            c5128sR.m(1);
        } else {
            int iC = c5128sR.C();
            int i6 = iC >> 4;
            this.f25839d = i6;
            if (i6 == 2) {
                int i10 = f25836e[(iC >> 2) & 3];
                com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                c4682oK0.B("audio/mpeg");
                c4682oK0.r0(1);
                c4682oK0.C(i10);
                dH = c4682oK0.H();
            } else {
                if (i6 == 7 || i6 == 8) {
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK1 = new com.google.android.gms.internal.ads.C4682oK0();
                    c4682oK1.B(i6 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                    c4682oK1.r0(1);
                    c4682oK1.C(8000);
                    dH = c4682oK1.H();
                } else if (i6 != 10) {
                    throw new com.google.android.gms.internal.ads.E1("Audio format not supported: " + i6);
                }
                this.f25837b = true;
            }
            this.f27269a.c(dH);
            this.f25838c = true;
            this.f25837b = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.F1
    protected final boolean b(com.google.android.gms.internal.ads.C5128sR c5128sR, long j6) {
        if (this.f25839d == 2) {
            int iR = c5128sR.r();
            this.f27269a.a(c5128sR, iR);
            this.f27269a.b(j6, 1, iR, 0, null);
            return true;
        }
        int iC = c5128sR.C();
        if (iC != 0 || this.f25838c) {
            if (this.f25839d == 10 && iC != 1) {
                return false;
            }
            int iR2 = c5128sR.r();
            this.f27269a.a(c5128sR, iR2);
            this.f27269a.b(j6, 1, iR2, 0, null);
            return true;
        }
        int iR3 = c5128sR.r();
        byte[] bArr = new byte[iR3];
        c5128sR.h(bArr, 0, iR3);
        com.google.android.gms.internal.ads.M mA = com.google.android.gms.internal.ads.O.a(bArr);
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.B("audio/mp4a-latm");
        c4682oK0.a(mA.f29623c);
        c4682oK0.r0(mA.f29622b);
        c4682oK0.C(mA.f29621a);
        c4682oK0.n(java.util.Collections.singletonList(bArr));
        this.f27269a.c(c4682oK0.H());
        this.f25838c = true;
        return false;
    }
}
