package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3433d implements com.google.android.gms.internal.ads.L, com.google.android.gms.internal.ads.InterfaceC3542e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.ArrayList f34606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4310l f34607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f34608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f34609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f34610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f34611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f34612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f34614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f34616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f34617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.I f34618n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private java.util.concurrent.Executor f34619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4090j f34620p;

    public C3433d(com.google.android.gms.internal.ads.C4090j c4090j, android.content.Context context) {
        this.f34620p = c4090j;
        this.f34605a = true != com.google.android.gms.internal.ads.EW.k(context) ? 5 : 1;
        this.f34606b = new java.util.ArrayList();
        this.f34607c = new com.google.android.gms.internal.ads.C4310l();
        this.f34614j = -9223372036854775807L;
        this.f34618n = com.google.android.gms.internal.ads.I.f28361a;
        this.f34619o = com.google.android.gms.internal.ads.C4090j.f36516o;
    }

    private final void h() {
        if (this.f34608d == null) {
            return;
        }
        new java.util.ArrayList(this.f34606b);
        com.google.android.gms.internal.ads.D d6 = this.f34608d;
        d6.getClass();
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = d6.b();
        c4682oK0B.b(com.google.android.gms.internal.ads.C4090j.v(d6.f26550C));
        c4682oK0B.H();
        com.google.android.gms.internal.ads.LC.b(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void A(int i6) {
        this.f34620p.f36523g.A(i6);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void F0(boolean z6) {
        this.f34620p.f36523g.F0(z6);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final boolean G0(boolean z6) {
        return this.f34620p.f36523g.G0(false);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void H0(boolean z6) {
        this.f34615k = false;
        this.f34614j = -9223372036854775807L;
        com.google.android.gms.internal.ads.C4090j.l(this.f34620p, z6);
        this.f34617m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void I0(int i6, com.google.android.gms.internal.ads.D d6) {
        com.google.android.gms.internal.ads.LC.f(false);
        this.f34608d = d6;
        if (this.f34615k) {
            com.google.android.gms.internal.ads.LC.f(this.f34614j != -9223372036854775807L);
            this.f34616l = true;
            this.f34617m = this.f34614j;
        } else {
            h();
            this.f34615k = true;
            this.f34616l = false;
            this.f34617m = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void J0(long j6, long j10, long j11, long j12) {
        boolean z6 = this.f34613i;
        boolean z10 = true;
        if (this.f34610f == j10 && this.f34611g == j11) {
            z10 = false;
        }
        this.f34613i = z6 | z10;
        this.f34609e = j6;
        this.f34610f = j10;
        this.f34611g = j11;
        this.f34612h = j12;
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void K0(com.google.android.gms.internal.ads.InterfaceC4200k interfaceC4200k) {
        this.f34620p.f36526j = interfaceC4200k;
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void L0(android.view.Surface surface, com.google.android.gms.internal.ads.UR ur) {
        this.f34620p.s(surface, ur);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void M0(com.google.android.gms.internal.ads.D d6) throws com.google.android.gms.internal.ads.K {
        com.google.android.gms.internal.ads.C4090j.c(this.f34620p, d6);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void N0(long j6, long j10) {
        this.f34620p.f36523g.N0(j6, j10);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void O0(boolean z6) {
        this.f34620p.f36523g.O0(z6);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void P0(java.util.List list) {
        if (this.f34606b.equals(list)) {
            return;
        }
        this.f34606b.clear();
        this.f34606b.addAll(list);
        this.f34606b.addAll(this.f34620p.f36522f);
        h();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final boolean Q0(long j6, boolean z6, long j10, long j11, com.google.android.gms.internal.ads.J j12) throws com.google.android.gms.internal.ads.K {
        com.google.android.gms.internal.ads.LC.f(false);
        long j13 = j6 - this.f34611g;
        try {
            if (this.f34620p.f36519c.a(j13, j10, j11, this.f34609e, z6, this.f34607c) != 4) {
                if (j13 < this.f34612h && !z6) {
                    com.google.android.gms.internal.ads.BK0 bk0 = (com.google.android.gms.internal.ads.BK0) j12;
                    bk0.f25945d.c1(bk0.f25942a, bk0.f25943b, bk0.f25944c);
                    return true;
                }
                this.f34620p.f36523g.N0(j10, j11);
                if (this.f34616l) {
                    long j14 = this.f34617m;
                    if (j14 == -9223372036854775807L || com.google.android.gms.internal.ads.C4090j.t(this.f34620p, j14)) {
                        h();
                        this.f34616l = false;
                        this.f34617m = -9223372036854775807L;
                    }
                }
                com.google.android.gms.internal.ads.LC.b(null);
                throw null;
            }
            return false;
        } catch (com.google.android.gms.internal.ads.Qz0 e6) {
            com.google.android.gms.internal.ads.D d6 = this.f34608d;
            com.google.android.gms.internal.ads.LC.b(d6);
            throw new com.google.android.gms.internal.ads.K(e6, d6);
        }
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void R0(com.google.android.gms.internal.ads.I i6, java.util.concurrent.Executor executor) {
        this.f34618n = i6;
        this.f34619o = executor;
    }

    @Override // com.google.android.gms.internal.ads.L
    public final android.view.Surface a() {
        com.google.android.gms.internal.ads.LC.f(false);
        com.google.android.gms.internal.ads.LC.b(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void b() {
        this.f34620p.p();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void c() {
        this.f34620p.f36523g.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3542e
    public final void d(com.google.android.gms.internal.ads.C4090j c4090j) {
        final com.google.android.gms.internal.ads.I i6 = this.f34618n;
        this.f34619o.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                i6.c(this.f34408C);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3542e
    public final void e(com.google.android.gms.internal.ads.C4090j c4090j) {
        final com.google.android.gms.internal.ads.I i6 = this.f34618n;
        this.f34619o.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.RK0
            @Override // java.lang.Runnable
            public final void run() {
                i6.a(this.f31250C);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3542e
    public final void f(com.google.android.gms.internal.ads.C4090j c4090j, final com.google.android.gms.internal.ads.C2697Os c2697Os) {
        final com.google.android.gms.internal.ads.I i6 = this.f34618n;
        this.f34619o.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.QK0
            @Override // java.lang.Runnable
            public final void run() {
                i6.b(this.f30969C, c2697Os);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void g() {
        this.f34620p.f36523g.g();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void j() {
        this.f34620p.f36523g.j();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void k() {
        this.f34620p.f36523g.k();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void l() {
        this.f34620p.r();
    }

    @Override // com.google.android.gms.internal.ads.L
    public final boolean v() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.L
    public final void w0(float f6) {
        this.f34620p.f36523g.w0(f6);
    }

    @Override // com.google.android.gms.internal.ads.L
    public final boolean z() {
        return false;
    }
}
