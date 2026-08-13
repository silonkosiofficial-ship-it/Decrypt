package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f26866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f26867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.D0 f26868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2227Cb f26869l;

    private E0(int i6, int i10, int i11, int i12, int i13, int i14, int i15, long j6, com.google.android.gms.internal.ads.D0 d6, com.google.android.gms.internal.ads.C2227Cb c2227Cb) {
        this.f26858a = i6;
        this.f26859b = i10;
        this.f26860c = i11;
        this.f26861d = i12;
        this.f26862e = i13;
        this.f26863f = i(i13);
        this.f26864g = i14;
        this.f26865h = i15;
        this.f26866i = h(i15);
        this.f26867j = j6;
        this.f26868k = d6;
        this.f26869l = c2227Cb;
    }

    public E0(byte[] bArr, int i6) {
        com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ(bArr, bArr.length);
        rq.l(i6 * 8);
        this.f26858a = rq.d(16);
        this.f26859b = rq.d(16);
        this.f26860c = rq.d(24);
        this.f26861d = rq.d(24);
        int iD = rq.d(20);
        this.f26862e = iD;
        this.f26863f = i(iD);
        this.f26864g = rq.d(3) + 1;
        int iD2 = rq.d(5) + 1;
        this.f26865h = iD2;
        this.f26866i = h(iD2);
        this.f26867j = rq.e(36);
        this.f26868k = null;
        this.f26869l = null;
    }

    private static int h(int i6) {
        if (i6 == 8) {
            return 1;
        }
        if (i6 == 12) {
            return 2;
        }
        if (i6 == 16) {
            return 4;
        }
        if (i6 != 20) {
            return i6 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int i(int i6) {
        switch (i6) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j6 = this.f26867j;
        if (j6 == 0) {
            return -9223372036854775807L;
        }
        return (j6 * 1000000) / ((long) this.f26862e);
    }

    public final long b(long j6) {
        return java.lang.Math.max(0L, java.lang.Math.min((j6 * ((long) this.f26862e)) / 1000000, this.f26867j - 1));
    }

    public final com.google.android.gms.internal.ads.D c(byte[] bArr, com.google.android.gms.internal.ads.C2227Cb c2227Cb) {
        bArr[4] = -128;
        com.google.android.gms.internal.ads.C2227Cb c2227CbD = d(c2227Cb);
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.B("audio/flac");
        int i6 = this.f26861d;
        if (i6 <= 0) {
            i6 = -1;
        }
        c4682oK0.r(i6);
        c4682oK0.r0(this.f26864g);
        c4682oK0.C(this.f26862e);
        c4682oK0.u(com.google.android.gms.internal.ads.EW.F(this.f26865h));
        c4682oK0.n(java.util.Collections.singletonList(bArr));
        c4682oK0.t(c2227CbD);
        return c4682oK0.H();
    }

    public final com.google.android.gms.internal.ads.C2227Cb d(com.google.android.gms.internal.ads.C2227Cb c2227Cb) {
        com.google.android.gms.internal.ads.C2227Cb c2227Cb2 = this.f26869l;
        return c2227Cb2 == null ? c2227Cb : c2227Cb2.d(c2227Cb);
    }

    public final com.google.android.gms.internal.ads.E0 e(java.util.List list) {
        return new com.google.android.gms.internal.ads.E0(this.f26858a, this.f26859b, this.f26860c, this.f26861d, this.f26862e, this.f26864g, this.f26865h, this.f26867j, this.f26868k, d(new com.google.android.gms.internal.ads.C2227Cb(list)));
    }

    public final com.google.android.gms.internal.ads.E0 f(com.google.android.gms.internal.ads.D0 d6) {
        return new com.google.android.gms.internal.ads.E0(this.f26858a, this.f26859b, this.f26860c, this.f26861d, this.f26862e, this.f26864g, this.f26865h, this.f26867j, d6, this.f26869l);
    }

    public final com.google.android.gms.internal.ads.E0 g(java.util.List list) {
        return new com.google.android.gms.internal.ads.E0(this.f26858a, this.f26859b, this.f26860c, this.f26861d, this.f26862e, this.f26864g, this.f26865h, this.f26867j, this.f26868k, d(com.google.android.gms.internal.ads.AbstractC3765g1.b(list)));
    }
}
