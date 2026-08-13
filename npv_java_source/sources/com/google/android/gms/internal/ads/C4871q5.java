package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4871q5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RQ f38168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f38169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f38170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f38172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f38173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f38176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f38177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f38178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f38180m;

    public C4871q5(java.lang.String str, int i6) {
        com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ(new byte[128], 128);
        this.f38168a = rq;
        this.f38169b = new com.google.android.gms.internal.ads.C5128sR(rq.f31264a);
        this.f38174g = 0;
        this.f38180m = -9223372036854775807L;
        this.f38170c = str;
        this.f38171d = i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0111  */
    /* JADX WARN: Code duplicated, block: B:37:0x0113  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        boolean z6;
        com.google.android.gms.internal.ads.LC.b(this.f38173f);
        while (c5128sR.r() > 0) {
            int i6 = this.f38174g;
            if (i6 == 0) {
                while (c5128sR.r() > 0) {
                    if (this.f38176i) {
                        int iC = c5128sR.C();
                        if (iC == 119) {
                            this.f38176i = false;
                            this.f38174g = 1;
                            com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f38169b;
                            c5128sR2.n()[0] = 11;
                            c5128sR2.n()[1] = 119;
                            this.f38175h = 2;
                            break;
                        }
                        if (iC == 11) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else if (c5128sR.C() == 11) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.f38176i = z6;
                }
            } else if (i6 != 1) {
                int iMin = java.lang.Math.min(c5128sR.r(), this.f38179l - this.f38175h);
                this.f38173f.a(c5128sR, iMin);
                int i10 = this.f38175h + iMin;
                this.f38175h = i10;
                if (i10 == this.f38179l) {
                    com.google.android.gms.internal.ads.LC.f(this.f38180m != -9223372036854775807L);
                    this.f38173f.b(this.f38180m, 1, this.f38179l, 0, null);
                    this.f38180m += this.f38177j;
                    this.f38174g = 0;
                }
            } else {
                byte[] bArrN = this.f38169b.n();
                int iMin2 = java.lang.Math.min(c5128sR.r(), 128 - this.f38175h);
                c5128sR.h(bArrN, this.f38175h, iMin2);
                int i11 = this.f38175h + iMin2;
                this.f38175h = i11;
                if (i11 == 128) {
                    this.f38168a.l(0);
                    com.google.android.gms.internal.ads.P pE = com.google.android.gms.internal.ads.S.e(this.f38168a);
                    com.google.android.gms.internal.ads.D d6 = this.f38178k;
                    if (d6 == null || pE.f30608c != d6.f26551D || pE.f30607b != d6.f26552E || !j$.util.Objects.equals(pE.f30606a, d6.f26574o)) {
                        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                        c4682oK0.m(this.f38172e);
                        c4682oK0.B(pE.f30606a);
                        c4682oK0.r0(pE.f30608c);
                        c4682oK0.C(pE.f30607b);
                        c4682oK0.q(this.f38170c);
                        c4682oK0.y(this.f38171d);
                        c4682oK0.v(pE.f30611f);
                        if ("audio/ac3".equals(pE.f30606a)) {
                            c4682oK0.q0(pE.f30611f);
                        }
                        com.google.android.gms.internal.ads.D dH = c4682oK0.H();
                        this.f38178k = dH;
                        this.f38173f.c(dH);
                    }
                    this.f38179l = pE.f30609d;
                    this.f38177j = (((long) pE.f30610e) * 1000000) / ((long) this.f38178k.f26552E);
                    this.f38169b.l(0);
                    this.f38173f.a(this.f38169b, 128);
                    this.f38174g = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f38172e = c4543n6.b();
        this.f38173f = interfaceC5520w0.S(c4543n6.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f38174g = 0;
        this.f38175h = 0;
        this.f38176i = false;
        this.f38180m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f38180m = j6;
    }
}
