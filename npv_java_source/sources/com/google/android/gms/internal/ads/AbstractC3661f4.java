package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3661f4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f35259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f35260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3113a4 f35261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f35262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f35263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f35264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35266i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f35268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f35269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f35270m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Y3 f35258a = new com.google.android.gms.internal.ads.Y3();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3332c4 f35267j = new com.google.android.gms.internal.ads.C3332c4();

    protected abstract long a(com.google.android.gms.internal.ads.C5128sR c5128sR);

    protected void b(boolean z6) {
        int i6;
        if (z6) {
            this.f35267j = new com.google.android.gms.internal.ads.C3332c4();
            this.f35263f = 0L;
            i6 = 0;
        } else {
            i6 = 1;
        }
        this.f35265h = i6;
        this.f35262e = -1L;
        this.f35264g = 0L;
    }

    protected abstract boolean c(com.google.android.gms.internal.ads.C5128sR c5128sR, long j6, com.google.android.gms.internal.ads.C3332c4 c3332c4);

    final int d(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        com.google.android.gms.internal.ads.LC.b(this.f35259b);
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        int i10 = this.f35265h;
        if (i10 == 0) {
            while (this.f35258a.e(interfaceC5300u0)) {
                long jE = interfaceC5300u0.e();
                long j6 = this.f35263f;
                this.f35268k = jE - j6;
                if (!c(this.f35258a.a(), j6, this.f35267j)) {
                    com.google.android.gms.internal.ads.D d6 = this.f35267j.f34441a;
                    this.f35266i = d6.f26552E;
                    if (!this.f35270m) {
                        this.f35259b.c(d6);
                        this.f35270m = true;
                    }
                    com.google.android.gms.internal.ads.InterfaceC3113a4 interfaceC3113a4 = this.f35267j.f34442b;
                    if (interfaceC3113a4 != null) {
                        this.f35261d = interfaceC3113a4;
                    } else if (interfaceC5300u0.f() == -1) {
                        this.f35261d = new com.google.android.gms.internal.ads.C3442d4(null);
                    } else {
                        com.google.android.gms.internal.ads.Z3 z3B = this.f35258a.b();
                        this.f35261d = new com.google.android.gms.internal.ads.U3(this, this.f35263f, interfaceC5300u0.f(), z3B.f33468d + z3B.f33469e, z3B.f33466b, (z3B.f33465a & 4) != 0);
                    }
                    this.f35265h = 2;
                    this.f35258a.d();
                    return 0;
                }
                this.f35263f = interfaceC5300u0.e();
            }
            this.f35265h = 3;
            return -1;
        }
        if (i10 == 1) {
            interfaceC5300u0.I((int) this.f35263f);
            this.f35265h = 2;
            return 0;
        }
        if (i10 != 2) {
            return -1;
        }
        long jA = this.f35261d.a(interfaceC5300u0);
        if (jA >= 0) {
            q6.f30855a = jA;
            return 1;
        }
        if (jA < -1) {
            h(-(jA + 2));
        }
        if (!this.f35269l) {
            com.google.android.gms.internal.ads.T0 t0D = this.f35261d.d();
            com.google.android.gms.internal.ads.LC.b(t0D);
            this.f35260c.R(t0D);
            this.f35269l = true;
        }
        if (this.f35268k > 0 || this.f35258a.e(interfaceC5300u0)) {
            this.f35268k = 0L;
            com.google.android.gms.internal.ads.C5128sR c5128sRA = this.f35258a.a();
            long jA2 = a(c5128sRA);
            if (jA2 >= 0) {
                long j10 = this.f35264g;
                if (j10 + jA2 >= this.f35262e) {
                    long jE2 = e(j10);
                    this.f35259b.a(c5128sRA, c5128sRA.u());
                    this.f35259b.b(jE2, 1, c5128sRA.u(), 0, null);
                    this.f35262e = -1L;
                }
            }
            this.f35264g += jA2;
            return 0;
        }
        this.f35265h = 3;
        return -1;
    }

    protected final long e(long j6) {
        return (j6 * 1000000) / ((long) this.f35266i);
    }

    protected final long f(long j6) {
        return (((long) this.f35266i) * j6) / 1000000;
    }

    final void g(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1) {
        this.f35260c = interfaceC5520w0;
        this.f35259b = interfaceC3107a1;
        b(true);
    }

    protected void h(long j6) {
        this.f35264g = j6;
    }

    final void i(long j6, long j10) {
        this.f35258a.c();
        if (j6 == 0) {
            b(!this.f35269l);
            return;
        }
        if (this.f35265h != 0) {
            long jF = f(j10);
            this.f35262e = jF;
            com.google.android.gms.internal.ads.InterfaceC3113a4 interfaceC3113a4 = this.f35261d;
            int i6 = com.google.android.gms.internal.ads.EW.f27061a;
            interfaceC3113a4.b(jF);
            this.f35265h = 2;
        }
    }
}
