package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5750y5 f33279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3267bV f33280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RQ f33281c = new com.google.android.gms.internal.ads.RQ(new byte[64], 64);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33284f;

    public Y5(com.google.android.gms.internal.ads.InterfaceC5750y5 interfaceC5750y5, com.google.android.gms.internal.ads.C3267bV c3267bV) {
        this.f33279a = interfaceC5750y5;
        this.f33280b = c3267bV;
    }

    public final void a(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        long jB;
        c5128sR.h(this.f33281c.f31264a, 0, 3);
        this.f33281c.l(0);
        this.f33281c.n(8);
        this.f33282d = this.f33281c.p();
        this.f33283e = this.f33281c.p();
        this.f33281c.n(6);
        com.google.android.gms.internal.ads.RQ rq = this.f33281c;
        c5128sR.h(rq.f31264a, 0, rq.d(8));
        this.f33281c.l(0);
        if (this.f33282d) {
            this.f33281c.n(4);
            long jD = this.f33281c.d(3);
            this.f33281c.n(1);
            int iD = this.f33281c.d(15) << 15;
            this.f33281c.n(1);
            long jD2 = this.f33281c.d(15);
            this.f33281c.n(1);
            if (!this.f33284f && this.f33283e) {
                this.f33281c.n(4);
                long jD3 = ((long) this.f33281c.d(3)) << 30;
                this.f33281c.n(1);
                int iD2 = this.f33281c.d(15) << 15;
                this.f33281c.n(1);
                long jD4 = this.f33281c.d(15);
                this.f33281c.n(1);
                this.f33280b.b(((long) iD2) | jD3 | jD4);
                this.f33284f = true;
            }
            jB = this.f33280b.b((jD << 30) | ((long) iD) | jD2);
        } else {
            jB = 0;
        }
        this.f33279a.e(jB, 4);
        this.f33279a.b(c5128sR);
        this.f33279a.a(false);
    }

    public final void b() {
        this.f33284f = false;
        this.f33279a.d();
    }
}
