package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class K5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f28837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.M0 f28838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f28839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f28841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f28842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28843g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f28847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f28848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f28849m;

    public K5(java.lang.String str, int i6) {
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(4);
        this.f28837a = c5128sR;
        c5128sR.n()[0] = -1;
        this.f28838b = new com.google.android.gms.internal.ads.M0();
        this.f28849m = -9223372036854775807L;
        this.f28839c = str;
        this.f28840d = i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        com.google.android.gms.internal.ads.LC.b(this.f28841e);
        while (c5128sR.r() > 0) {
            int i6 = this.f28843g;
            if (i6 == 0) {
                byte[] bArrN = c5128sR.n();
                int iT = c5128sR.t();
                int iU = c5128sR.u();
                while (true) {
                    if (iT >= iU) {
                        c5128sR.l(iU);
                        break;
                    }
                    int i10 = iT + 1;
                    byte b6 = bArrN[iT];
                    boolean z6 = (b6 & 255) == 255;
                    boolean z10 = this.f28846j && (b6 & 224) == 224;
                    this.f28846j = z6;
                    if (z10) {
                        c5128sR.l(i10);
                        this.f28846j = false;
                        this.f28837a.n()[1] = bArrN[iT];
                        this.f28844h = 2;
                        this.f28843g = 1;
                        break;
                        break;
                    }
                    iT = i10;
                }
            } else if (i6 != 1) {
                int iMin = java.lang.Math.min(c5128sR.r(), this.f28848l - this.f28844h);
                this.f28841e.a(c5128sR, iMin);
                int i11 = this.f28844h + iMin;
                this.f28844h = i11;
                if (i11 >= this.f28848l) {
                    com.google.android.gms.internal.ads.LC.f(this.f28849m != -9223372036854775807L);
                    this.f28841e.b(this.f28849m, 1, this.f28848l, 0, null);
                    this.f28849m += this.f28847k;
                    this.f28844h = 0;
                    this.f28843g = 0;
                }
            } else {
                int iMin2 = java.lang.Math.min(c5128sR.r(), 4 - this.f28844h);
                c5128sR.h(this.f28837a.n(), this.f28844h, iMin2);
                int i12 = this.f28844h + iMin2;
                this.f28844h = i12;
                if (i12 >= 4) {
                    this.f28837a.l(0);
                    if (!this.f28838b.a(this.f28837a.w())) {
                        this.f28844h = 0;
                        this.f28843g = 1;
                        break;
                    }
                    com.google.android.gms.internal.ads.M0 m6 = this.f28838b;
                    this.f28848l = m6.f29626c;
                    if (!this.f28845i) {
                        this.f28847k = (((long) m6.f29630g) * 1000000) / ((long) m6.f29627d);
                        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
                        c4682oK0.m(this.f28842f);
                        c4682oK0.B(this.f28838b.f29625b);
                        c4682oK0.r(4096);
                        c4682oK0.r0(this.f28838b.f29628e);
                        c4682oK0.C(this.f28838b.f29627d);
                        c4682oK0.q(this.f28839c);
                        c4682oK0.y(this.f28840d);
                        this.f28841e.c(c4682oK0.H());
                        this.f28845i = true;
                    }
                    this.f28837a.l(0);
                    this.f28841e.a(this.f28837a, 4);
                    this.f28843g = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        this.f28842f = c4543n6.b();
        this.f28841e = interfaceC5520w0.S(c4543n6.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f28843g = 0;
        this.f28844h = 0;
        this.f28846j = false;
        this.f28849m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        this.f28849m = j6;
    }
}
