package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class G1 extends com.google.android.gms.internal.ads.F1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27625g;

    public G1(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1) {
        super(interfaceC3107a1);
        this.f27620b = new com.google.android.gms.internal.ads.C5128sR(com.google.android.gms.internal.ads.AbstractC4371lb0.f37187a);
        this.f27621c = new com.google.android.gms.internal.ads.C5128sR(4);
    }

    @Override // com.google.android.gms.internal.ads.F1
    protected final boolean a(com.google.android.gms.internal.ads.C5128sR c5128sR) throws com.google.android.gms.internal.ads.E1 {
        int iC = c5128sR.C();
        int i6 = iC >> 4;
        int i10 = iC & 15;
        if (i10 == 7) {
            this.f27625g = i6;
            return i6 != 5;
        }
        throw new com.google.android.gms.internal.ads.E1("Video format not supported: " + i10);
    }

    @Override // com.google.android.gms.internal.ads.F1
    protected final boolean b(com.google.android.gms.internal.ads.C5128sR c5128sR, long j6) throws com.google.android.gms.internal.ads.C4708of {
        int i6;
        int iC = c5128sR.C();
        long jX = c5128sR.x();
        if (iC == 0) {
            if (!this.f27623e) {
                com.google.android.gms.internal.ads.C5128sR c5128sR2 = new com.google.android.gms.internal.ads.C5128sR(new byte[c5128sR.r()]);
                c5128sR.h(c5128sR2.n(), 0, c5128sR.r());
                com.google.android.gms.internal.ads.W wA = com.google.android.gms.internal.ads.W.a(c5128sR2);
                this.f27622d = wA.f32634b;
                com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                c4682oK0.B("video/avc");
                c4682oK0.a(wA.f32644l);
                c4682oK0.G(wA.f32635c);
                c4682oK0.k(wA.f32636d);
                c4682oK0.w(wA.f32643k);
                c4682oK0.n(wA.f32633a);
                this.f27269a.c(c4682oK0.H());
                this.f27623e = true;
                return false;
            }
        } else if (iC == 1 && this.f27623e) {
            int i10 = this.f27625g == 1 ? 1 : 0;
            if (this.f27624f) {
                i6 = i10;
            } else if (i10 != 0) {
                i6 = 1;
            }
            byte[] bArrN = this.f27621c.n();
            bArrN[0] = 0;
            bArrN[1] = 0;
            bArrN[2] = 0;
            int i11 = 4 - this.f27622d;
            int i12 = 0;
            while (c5128sR.r() > 0) {
                c5128sR.h(this.f27621c.n(), i11, this.f27622d);
                this.f27621c.l(0);
                com.google.android.gms.internal.ads.C5128sR c5128sR3 = this.f27621c;
                com.google.android.gms.internal.ads.C5128sR c5128sR4 = this.f27620b;
                int iF = c5128sR3.F();
                c5128sR4.l(0);
                this.f27269a.a(this.f27620b, 4);
                this.f27269a.a(c5128sR, iF);
                i12 = i12 + 4 + iF;
            }
            this.f27269a.b(j6 + (jX * 1000), i6, i12, 0, null);
            this.f27624f = true;
            return true;
        }
        return false;
    }
}
