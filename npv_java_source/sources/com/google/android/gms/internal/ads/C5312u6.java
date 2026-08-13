package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5312u6 implements com.google.android.gms.internal.ads.InterfaceC5202t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5520w0 f39112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1 f39113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5532w6 f39114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.D f39115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f39116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f39117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f39119h;

    public C5312u6(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1, com.google.android.gms.internal.ads.C5532w6 c5532w6, java.lang.String str, int i6) throws com.google.android.gms.internal.ads.C4708of {
        this.f39112a = interfaceC5520w0;
        this.f39113b = interfaceC3107a1;
        this.f39114c = c5532w6;
        int i10 = c5532w6.f39537b * c5532w6.f39540e;
        int i11 = c5532w6.f39539d;
        int i12 = i10 / 8;
        if (i11 != i12) {
            throw com.google.android.gms.internal.ads.C4708of.a("Expected block size: " + i12 + "; got: " + i11, null);
        }
        int i13 = c5532w6.f39538c * i12;
        int i14 = i13 * 8;
        int iMax = java.lang.Math.max(i12, i13 / 10);
        this.f39116e = iMax;
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.B(str);
        c4682oK0.q0(i14);
        c4682oK0.v(i14);
        c4682oK0.r(iMax);
        c4682oK0.r0(c5532w6.f39537b);
        c4682oK0.C(c5532w6.f39538c);
        c4682oK0.u(i6);
        this.f39115d = c4682oK0.H();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5202t6
    public final void a(long j6) {
        this.f39117f = j6;
        this.f39118g = 0;
        this.f39119h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5202t6
    public final void e(int i6, long j6) {
        this.f39112a.R(new com.google.android.gms.internal.ads.C5862z6(this.f39114c, 1, i6, j6));
        this.f39113b.c(this.f39115d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5202t6
    public final boolean f(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, long j6) {
        int i6;
        int i10;
        long j10 = j6;
        while (j10 > 0 && (i6 = this.f39118g) < (i10 = this.f39116e)) {
            int iE = this.f39113b.e(interfaceC5300u0, (int) java.lang.Math.min(i10 - i6, j10), true);
            if (iE == -1) {
                j10 = 0;
            } else {
                this.f39118g += iE;
                j10 -= (long) iE;
            }
        }
        com.google.android.gms.internal.ads.C5532w6 c5532w6 = this.f39114c;
        int i11 = this.f39118g;
        int i12 = c5532w6.f39539d;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long jM = this.f39117f + com.google.android.gms.internal.ads.EW.M(this.f39119h, 1000000L, c5532w6.f39538c, java.math.RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.f39118g - i14;
            this.f39113b.b(jM, 1, i14, i15, null);
            this.f39119h += (long) i13;
            this.f39118g = i15;
        }
        return j10 <= 0;
    }
}
