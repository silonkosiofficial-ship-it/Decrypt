package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5090s5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RQ f38634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f38635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f38636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f38638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f38639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f38642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f38643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f38644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f38646m;

    public C5090s5(java.lang.String str, int i6) {
        com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ(new byte[16], 16);
        this.f38634a = rq;
        this.f38635b = new com.google.android.gms.internal.ads.C5128sR(rq.f31264a);
        this.f38640g = 0;
        this.f38641h = 0;
        this.f38642i = false;
        this.f38646m = -9223372036854775807L;
        this.f38636c = str;
        this.f38637d = i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        com.google.android.gms.internal.ads.LC.b(this.f38639f);
        while (c5128sR.r() > 0) {
            int i6 = this.f38640g;
            if (i6 == 0) {
                while (true) {
                    if (c5128sR.r() > 0) {
                        if (this.f38642i) {
                            int iC = c5128sR.C();
                            this.f38642i = iC == 172;
                            if (iC != 64) {
                                if (iC == 65) {
                                    iC = 65;
                                }
                            }
                            this.f38640g = 1;
                            com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f38635b;
                            c5128sR2.n()[0] = -84;
                            c5128sR2.n()[1] = iC == 65 ? (byte) 65 : (byte) 64;
                            this.f38641h = 2;
                        } else {
                            this.f38642i = c5128sR.C() == 172;
                        }
                    }
                }
            } else if (i6 != 1) {
                int iMin = java.lang.Math.min(c5128sR.r(), this.f38645l - this.f38641h);
                this.f38639f.a(c5128sR, iMin);
                int i10 = this.f38641h + iMin;
                this.f38641h = i10;
                if (i10 == this.f38645l) {
                    com.google.android.gms.internal.ads.LC.f(this.f38646m != -9223372036854775807L);
                    this.f38639f.b(this.f38646m, 1, this.f38645l, 0, null);
                    this.f38646m += this.f38643j;
                    this.f38640g = 0;
                }
            } else {
                byte[] bArrN = this.f38635b.n();
                int iMin2 = java.lang.Math.min(c5128sR.r(), 16 - this.f38641h);
                c5128sR.h(bArrN, this.f38641h, iMin2);
                int i11 = this.f38641h + iMin2;
                this.f38641h = i11;
                if (i11 == 16) {
                    this.f38634a.l(0);
                    com.google.android.gms.internal.ads.T tA = com.google.android.gms.internal.ads.V.a(this.f38634a);
                    com.google.android.gms.internal.ads.D d6 = this.f38644k;
                    if (d6 == null || d6.f26551D != 2 || tA.f31827a != d6.f26552E || !"audio/ac4".equals(d6.f26574o)) {
                        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                        c4682oK0.m(this.f38638e);
                        c4682oK0.B("audio/ac4");
                        c4682oK0.r0(2);
                        c4682oK0.C(tA.f31827a);
                        c4682oK0.q(this.f38636c);
                        c4682oK0.y(this.f38637d);
                        com.google.android.gms.internal.ads.D dH = c4682oK0.H();
                        this.f38644k = dH;
                        this.f38639f.c(dH);
                    }
                    this.f38645l = tA.f31828b;
                    this.f38643j = (((long) tA.f31829c) * 1000000) / ((long) this.f38644k.f26552E);
                    this.f38635b.l(0);
                    this.f38639f.a(this.f38635b, 16);
                    this.f38640g = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f38638e = c4543n6.b();
        this.f38639f = interfaceC5520w0.S(c4543n6.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f38640g = 0;
        this.f38641h = 0;
        this.f38642i = false;
        this.f38646m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f38646m = j6;
    }
}
