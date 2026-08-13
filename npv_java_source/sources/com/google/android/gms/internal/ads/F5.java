package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class F5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3446d6 f27292a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f27296e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.String f27298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f27299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.E5 f27300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27301j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27303l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f27297f = new boolean[3];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R5 f27293b = new com.google.android.gms.internal.ads.R5(7, 128);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R5 f27294c = new com.google.android.gms.internal.ads.R5(8, 128);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R5 f27295d = new com.google.android.gms.internal.ads.R5(6, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f27302k = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f27304m = new com.google.android.gms.internal.ads.C5128sR();

    public F5(com.google.android.gms.internal.ads.C3446d6 c3446d6, boolean z6, boolean z10) {
        this.f27292a = c3446d6;
    }

    private final void f(byte[] bArr, int i6, int i10) {
        if (!this.f27301j) {
            this.f27293b.a(bArr, i6, i10);
            this.f27294c.a(bArr, i6, i10);
        }
        this.f27295d.a(bArr, i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
        com.google.android.gms.internal.ads.LC.b(this.f27299h);
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        if (z6) {
            this.f27292a.c();
            this.f27300i.a(this.f27296e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int i6;
        int i10;
        com.google.android.gms.internal.ads.R5 r6;
        com.google.android.gms.internal.ads.LC.b(this.f27299h);
        int i11 = com.google.android.gms.internal.ads.EW.f27061a;
        int iT = c5128sR.t();
        int iU = c5128sR.u();
        byte[] bArrN = c5128sR.n();
        this.f27296e += (long) c5128sR.r();
        this.f27299h.a(c5128sR, c5128sR.r());
        while (true) {
            int iA = com.google.android.gms.internal.ads.AbstractC4371lb0.a(bArrN, iT, iU, this.f27297f);
            if (iA == iU) {
                f(bArrN, iT, iU);
                return;
            }
            int i12 = iA + 3;
            int i13 = bArrN[i12] & 31;
            int i14 = iA - iT;
            if (i14 > 0) {
                f(bArrN, iT, iA);
            }
            int i15 = iU - iA;
            long j6 = this.f27296e - ((long) i15);
            int i16 = i14 < 0 ? -i14 : 0;
            long j10 = this.f27302k;
            if (this.f27301j) {
                i6 = iU;
                i10 = i12;
            } else {
                this.f27293b.d(i16);
                this.f27294c.d(i16);
                if (this.f27301j) {
                    i6 = iU;
                    i10 = i12;
                    com.google.android.gms.internal.ads.R5 r10 = this.f27293b;
                    if (r10.e()) {
                        com.google.android.gms.internal.ads.C2522Ka0 c2522Ka0F = com.google.android.gms.internal.ads.AbstractC4371lb0.f(r10.f31121d, 4, r10.f31122e);
                        this.f27292a.e(c2522Ka0F.f28973m);
                        this.f27300i.c(c2522Ka0F);
                        r6 = this.f27293b;
                        r6.b();
                    } else {
                        com.google.android.gms.internal.ads.R5 r11 = this.f27294c;
                        if (r11.e()) {
                            this.f27300i.b(com.google.android.gms.internal.ads.AbstractC4371lb0.e(r11.f31121d, 4, r11.f31122e));
                        }
                    }
                } else if (this.f27293b.e() && this.f27294c.e()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.google.android.gms.internal.ads.R5 r12 = this.f27293b;
                    arrayList.add(java.util.Arrays.copyOf(r12.f31121d, r12.f31122e));
                    com.google.android.gms.internal.ads.R5 r13 = this.f27294c;
                    arrayList.add(java.util.Arrays.copyOf(r13.f31121d, r13.f31122e));
                    com.google.android.gms.internal.ads.R5 r14 = this.f27293b;
                    com.google.android.gms.internal.ads.C2522Ka0 c2522Ka0F2 = com.google.android.gms.internal.ads.AbstractC4371lb0.f(r14.f31121d, 4, r14.f31122e);
                    com.google.android.gms.internal.ads.R5 r15 = this.f27294c;
                    com.google.android.gms.internal.ads.C4149ja0 c4149ja0E = com.google.android.gms.internal.ads.AbstractC4371lb0.e(r15.f31121d, 4, r15.f31122e);
                    i10 = i12;
                    java.lang.String strC = com.google.android.gms.internal.ads.ND.c(c2522Ka0F2.f28961a, c2522Ka0F2.f28962b, c2522Ka0F2.f28963c);
                    com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 = this.f27299h;
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                    i6 = iU;
                    c4682oK0.m(this.f27298g);
                    c4682oK0.B("video/avc");
                    c4682oK0.a(strC);
                    c4682oK0.G(c2522Ka0F2.f28965e);
                    c4682oK0.k(c2522Ka0F2.f28966f);
                    com.google.android.gms.internal.ads.Oz0 oz0 = new com.google.android.gms.internal.ads.Oz0();
                    oz0.c(c2522Ka0F2.f28970j);
                    oz0.b(c2522Ka0F2.f28971k);
                    oz0.d(c2522Ka0F2.f28972l);
                    oz0.f(c2522Ka0F2.f28968h + 8);
                    oz0.a(c2522Ka0F2.f28969i + 8);
                    c4682oK0.b(oz0.g());
                    c4682oK0.w(c2522Ka0F2.f28967g);
                    c4682oK0.n(arrayList);
                    c4682oK0.s(c2522Ka0F2.f28973m);
                    interfaceC3107a1.c(c4682oK0.H());
                    this.f27301j = true;
                    this.f27300i.c(c2522Ka0F2);
                    this.f27300i.b(c4149ja0E);
                    this.f27293b.b();
                } else {
                    i6 = iU;
                    i10 = i12;
                }
                r6 = this.f27294c;
                r6.b();
            }
            if (this.f27295d.d(i16)) {
                com.google.android.gms.internal.ads.R5 r16 = this.f27295d;
                this.f27304m.j(this.f27295d.f31121d, com.google.android.gms.internal.ads.AbstractC4371lb0.b(r16.f31121d, r16.f31122e));
                this.f27304m.l(4);
                this.f27292a.a(j10, this.f27304m);
            }
            if (this.f27300i.f(j6, i15, this.f27301j)) {
                this.f27303l = false;
            }
            long j11 = this.f27302k;
            if (!this.f27301j) {
                this.f27293b.c(i13);
                this.f27294c.c(i13);
            }
            this.f27295d.c(i13);
            this.f27300i.e(j6, i13, j11, this.f27303l);
            iT = i10;
            iU = i6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f27298g = c4543n6.b();
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(c4543n6.a(), 2);
        this.f27299h = interfaceC3107a1S;
        this.f27300i = new com.google.android.gms.internal.ads.E5(interfaceC3107a1S, false, false);
        this.f27292a.b(interfaceC5520w0, c4543n6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f27296e = 0L;
        this.f27303l = false;
        this.f27302k = -9223372036854775807L;
        com.google.android.gms.internal.ads.AbstractC4371lb0.h(this.f27297f);
        this.f27293b.b();
        this.f27294c.b();
        this.f27295d.b();
        this.f27292a.c();
        com.google.android.gms.internal.ads.E5 e6 = this.f27300i;
        if (e6 != null) {
            e6.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f27302k = j6;
        int i10 = i6 & 2;
        this.f27303l = (i10 != 0) | this.f27303l;
    }
}
