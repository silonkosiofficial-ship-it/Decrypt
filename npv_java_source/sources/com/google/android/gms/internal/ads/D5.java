package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class D5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f26606l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4982r6 f26607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f26608b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R5 f26611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5 f26612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.String f26614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f26615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26616j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f26609c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.B5 f26610d = new com.google.android.gms.internal.ads.B5(128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f26617k = -9223372036854775807L;

    D5(com.google.android.gms.internal.ads.C4982r6 c4982r6) {
        com.google.android.gms.internal.ads.C5128sR c5128sR;
        this.f26607a = c4982r6;
        if (c4982r6 != null) {
            this.f26611e = new com.google.android.gms.internal.ads.R5(178, 128);
            c5128sR = new com.google.android.gms.internal.ads.C5128sR();
        } else {
            c5128sR = null;
            this.f26611e = null;
        }
        this.f26608b = c5128sR;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
        com.google.android.gms.internal.ads.LC.b(this.f26612f);
        if (z6) {
            this.f26612f.b(this.f26613g, 0, this.f26616j);
            this.f26612f.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c8  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int i6;
        int i10 = 3;
        com.google.android.gms.internal.ads.LC.b(this.f26612f);
        com.google.android.gms.internal.ads.LC.b(this.f26615i);
        int iT = c5128sR.t();
        int iU = c5128sR.u();
        byte[] bArrN = c5128sR.n();
        this.f26613g += (long) c5128sR.r();
        this.f26615i.a(c5128sR, c5128sR.r());
        while (true) {
            int iA = com.google.android.gms.internal.ads.AbstractC4371lb0.a(bArrN, iT, iU, this.f26609c);
            if (iA == iU) {
                break;
            }
            int i11 = iA + 3;
            int i12 = c5128sR.n()[i11] & 255;
            int i13 = iA - iT;
            if (!this.f26616j) {
                if (i13 > 0) {
                    this.f26610d.a(bArrN, iT, iA);
                }
                if (this.f26610d.c(i12, i13 < 0 ? -i13 : 0)) {
                    com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 = this.f26615i;
                    com.google.android.gms.internal.ads.B5 b6 = this.f26610d;
                    int i14 = b6.f25896d;
                    java.lang.String str = this.f26614h;
                    str.getClass();
                    byte[] bArrCopyOf = java.util.Arrays.copyOf(b6.f25897e, b6.f25895c);
                    com.google.android.gms.internal.ads.RQ rq = new com.google.android.gms.internal.ads.RQ(bArrCopyOf, bArrCopyOf.length);
                    rq.o(i14);
                    rq.o(4);
                    rq.m();
                    rq.n(8);
                    if (rq.p()) {
                        rq.n(4);
                        rq.n(i10);
                    }
                    int iD = rq.d(4);
                    float f6 = 1.0f;
                    if (iD == 15) {
                        int iD2 = rq.d(8);
                        int iD3 = rq.d(8);
                        if (iD3 == 0) {
                            com.google.android.gms.internal.ads.AbstractC3586eM.f("H263Reader", "Invalid aspect ratio");
                        } else {
                            f6 = iD2 / iD3;
                        }
                    } else if (iD < 7) {
                        f6 = f26606l[iD];
                    } else {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("H263Reader", "Invalid aspect ratio");
                    }
                    float f10 = f6;
                    if (rq.p()) {
                        rq.n(2);
                        rq.n(1);
                        if (rq.p()) {
                            rq.n(15);
                            rq.m();
                            rq.n(15);
                            rq.m();
                            rq.n(15);
                            rq.m();
                            rq.n(3);
                            rq.n(11);
                            rq.m();
                            rq.n(15);
                            rq.m();
                        }
                    }
                    if (rq.d(2) != 0) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("H263Reader", "Unhandled video object layer shape");
                    }
                    rq.m();
                    int iD4 = rq.d(16);
                    rq.m();
                    if (rq.p()) {
                        if (iD4 == 0) {
                            com.google.android.gms.internal.ads.AbstractC3586eM.f("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i15 = iD4 - 1;
                            int i16 = 0;
                            while (i15 > 0) {
                                i15 >>= 1;
                                i16++;
                            }
                            rq.n(i16);
                        }
                    }
                    rq.m();
                    int iD5 = rq.d(13);
                    rq.m();
                    int iD6 = rq.d(13);
                    rq.m();
                    rq.m();
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                    c4682oK0.m(str);
                    c4682oK0.B("video/mp4v-es");
                    c4682oK0.G(iD5);
                    c4682oK0.k(iD6);
                    c4682oK0.w(f10);
                    c4682oK0.n(java.util.Collections.singletonList(bArrCopyOf));
                    interfaceC3107a1.c(c4682oK0.H());
                    this.f26616j = true;
                }
            }
            this.f26612f.a(bArrN, iT, iA);
            com.google.android.gms.internal.ads.R5 r6 = this.f26611e;
            if (r6 != null) {
                if (i13 > 0) {
                    r6.a(bArrN, iT, iA);
                    i6 = 0;
                } else {
                    i6 = -i13;
                }
                if (this.f26611e.d(i6)) {
                    com.google.android.gms.internal.ads.R5 r10 = this.f26611e;
                    int iB = com.google.android.gms.internal.ads.AbstractC4371lb0.b(r10.f31121d, r10.f31122e);
                    com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f26608b;
                    int i17 = com.google.android.gms.internal.ads.EW.f27061a;
                    c5128sR2.j(this.f26611e.f31121d, iB);
                    this.f26607a.a(this.f26617k, this.f26608b);
                }
                if (i12 == 178) {
                    if (c5128sR.n()[iA + 2] == 1) {
                        this.f26611e.c(178);
                    }
                    i12 = 178;
                }
            }
            int i18 = iU - iA;
            this.f26612f.b(this.f26613g - ((long) i18), i18, this.f26616j);
            this.f26612f.c(i12, this.f26617k);
            iT = i11;
            i10 = 3;
        }
        if (!this.f26616j) {
            this.f26610d.a(bArrN, iT, iU);
        }
        this.f26612f.a(bArrN, iT, iU);
        com.google.android.gms.internal.ads.R5 r11 = this.f26611e;
        if (r11 != null) {
            r11.a(bArrN, iT, iU);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f26614h = c4543n6.b();
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(c4543n6.a(), 2);
        this.f26615i = interfaceC3107a1S;
        this.f26612f = new com.google.android.gms.internal.ads.C5(interfaceC3107a1S);
        com.google.android.gms.internal.ads.C4982r6 c4982r6 = this.f26607a;
        if (c4982r6 != null) {
            c4982r6.b(interfaceC5520w0, c4543n6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        com.google.android.gms.internal.ads.AbstractC4371lb0.h(this.f26609c);
        this.f26610d.b();
        com.google.android.gms.internal.ads.C5 c6 = this.f26612f;
        if (c6 != null) {
            c6.d();
        }
        com.google.android.gms.internal.ads.R5 r6 = this.f26611e;
        if (r6 != null) {
            r6.b();
        }
        this.f26613g = 0L;
        this.f26617k = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f26617k = j6;
    }
}
