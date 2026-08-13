package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Fz0 implements com.google.android.gms.internal.ads.AB0, com.google.android.gms.internal.ads.DB0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27601b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.EB0 f27603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3244bE0 f27605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4447mD f27606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.gms.internal.ads.EI0 f27608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D[] f27609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f27610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f27611l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f27614o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.android.gms.internal.ads.CB0 f27616q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f27600a = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.UA0 f27602c = new com.google.android.gms.internal.ads.UA0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f27612m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC4942qm f27615p = com.google.android.gms.internal.ads.AbstractC4942qm.f38311a;

    public Fz0(int i6) {
        this.f27601b = i6;
    }

    private final void J(long j6, boolean z6) {
        this.f27613n = false;
        this.f27611l = j6;
        this.f27612m = j6;
        W(j6, z6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A() {
        com.google.android.gms.internal.ads.CB0 cb0;
        synchronized (this.f27600a) {
            cb0 = this.f27616q;
        }
        if (cb0 != null) {
            cb0.a(this);
        }
    }

    protected abstract void B();

    protected abstract void C();

    protected abstract void D();

    protected abstract void E(com.google.android.gms.internal.ads.D[] dArr, long j6, long j10, com.google.android.gms.internal.ads.LH0 lh0);

    protected final boolean F() {
        if (g0()) {
            return this.f27613n;
        }
        com.google.android.gms.internal.ads.EI0 ei0 = this.f27608i;
        ei0.getClass();
        return ei0.d();
    }

    protected final com.google.android.gms.internal.ads.D[] G() {
        com.google.android.gms.internal.ads.D[] dArr = this.f27609j;
        dArr.getClass();
        return dArr;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void H() {
        com.google.android.gms.internal.ads.LC.f(this.f27607h == 0);
        com.google.android.gms.internal.ads.UA0 ua0 = this.f27602c;
        ua0.f32159b = null;
        ua0.f32158a = null;
        B();
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void I() {
        com.google.android.gms.internal.ads.LC.f(this.f27607h == 1);
        this.f27607h = 2;
        C();
    }

    protected final int K(com.google.android.gms.internal.ads.UA0 ua0, com.google.android.gms.internal.ads.C5518vz0 c5518vz0, int i6) {
        com.google.android.gms.internal.ads.EI0 ei0 = this.f27608i;
        ei0.getClass();
        int iB = ei0.b(ua0, c5518vz0, i6);
        if (iB == -4) {
            if (c5518vz0.f()) {
                this.f27612m = Long.MIN_VALUE;
                return this.f27613n ? -4 : -3;
            }
            long j6 = c5518vz0.f39488f + this.f27610k;
            c5518vz0.f39488f = j6;
            this.f27612m = java.lang.Math.max(this.f27612m, j6);
        } else if (iB == -5) {
            com.google.android.gms.internal.ads.D d6 = ua0.f32158a;
            d6.getClass();
            long j10 = d6.f26579t;
            if (j10 != Long.MAX_VALUE) {
                com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = d6.b();
                c4682oK0B.F(j10 + this.f27610k);
                ua0.f32158a = c4682oK0B.H();
                return -5;
            }
        }
        return iB;
    }

    protected final com.google.android.gms.internal.ads.Qz0 L(java.lang.Throwable th, com.google.android.gms.internal.ads.D d6, boolean z6, int i6) {
        int iH = 4;
        if (d6 != null && !this.f27614o) {
            this.f27614o = true;
            try {
                iH = h(d6) & 7;
            } catch (com.google.android.gms.internal.ads.Qz0 unused) {
            } finally {
                this.f27614o = false;
            }
        }
        return com.google.android.gms.internal.ads.Qz0.b(th, Y(), this.f27604e, d6, iH, z6, i6);
    }

    protected final int M(long j6) {
        com.google.android.gms.internal.ads.EI0 ei0 = this.f27608i;
        ei0.getClass();
        return ei0.a(j6 - this.f27610k);
    }

    protected final long N() {
        return this.f27611l;
    }

    protected final com.google.android.gms.internal.ads.AbstractC4942qm O() {
        return this.f27615p;
    }

    protected final com.google.android.gms.internal.ads.InterfaceC4447mD P() {
        com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD = this.f27606g;
        interfaceC4447mD.getClass();
        return interfaceC4447mD;
    }

    protected final com.google.android.gms.internal.ads.UA0 R() {
        com.google.android.gms.internal.ads.UA0 ua0 = this.f27602c;
        ua0.f32159b = null;
        ua0.f32158a = null;
        return ua0;
    }

    protected final com.google.android.gms.internal.ads.EB0 S() {
        com.google.android.gms.internal.ads.EB0 eb0 = this.f27603d;
        eb0.getClass();
        return eb0;
    }

    protected final com.google.android.gms.internal.ads.C3244bE0 T() {
        com.google.android.gms.internal.ads.C3244bE0 c3244bE0 = this.f27605f;
        c3244bE0.getClass();
        return c3244bE0;
    }

    protected abstract void U();

    protected abstract void V(boolean z6, boolean z10);

    protected abstract void W(long j6, boolean z6);

    @Override // com.google.android.gms.internal.ads.AB0, com.google.android.gms.internal.ads.DB0
    public final int b() {
        return this.f27601b;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void b0() {
        this.f27613n = true;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void d0() {
        com.google.android.gms.internal.ads.LC.f(this.f27607h == 2);
        this.f27607h = 1;
        D();
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void e(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        if (j$.util.Objects.equals(this.f27615p, abstractC4942qm)) {
            return;
        }
        this.f27615p = abstractC4942qm;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final int f() {
        return this.f27607h;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final boolean g0() {
        return this.f27612m == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final boolean h0() {
        return this.f27613n;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void i(com.google.android.gms.internal.ads.EB0 eb0, com.google.android.gms.internal.ads.D[] dArr, com.google.android.gms.internal.ads.EI0 ei0, long j6, boolean z6, boolean z10, long j10, long j11, com.google.android.gms.internal.ads.LH0 lh0) {
        com.google.android.gms.internal.ads.LC.f(this.f27607h == 0);
        this.f27603d = eb0;
        this.f27607h = 1;
        V(z6, z10);
        p(dArr, ei0, j10, j11, lh0);
        J(j10, z6);
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void i0() {
        com.google.android.gms.internal.ads.LC.f(this.f27607h == 0);
        y();
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public com.google.android.gms.internal.ads.InterfaceC3128aB0 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final com.google.android.gms.internal.ads.DB0 m() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void n(long j6) {
        J(j6, false);
    }

    @Override // com.google.android.gms.internal.ads.DB0
    public final void o(com.google.android.gms.internal.ads.CB0 cb0) {
        synchronized (this.f27600a) {
            this.f27616q = cb0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void p(com.google.android.gms.internal.ads.D[] dArr, com.google.android.gms.internal.ads.EI0 ei0, long j6, long j10, com.google.android.gms.internal.ads.LH0 lh0) {
        com.google.android.gms.internal.ads.LC.f(!this.f27613n);
        this.f27608i = ei0;
        if (this.f27612m == Long.MIN_VALUE) {
            this.f27612m = j6;
        }
        this.f27609j = dArr;
        this.f27610k = j10;
        E(dArr, j6, j10, lh0);
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final com.google.android.gms.internal.ads.EI0 q() {
        return this.f27608i;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void r(int i6, com.google.android.gms.internal.ads.C3244bE0 c3244bE0, com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD) {
        this.f27604e = i6;
        this.f27605f = c3244bE0;
        this.f27606g = interfaceC4447mD;
    }

    @Override // com.google.android.gms.internal.ads.DB0
    public final void s() {
        synchronized (this.f27600a) {
            this.f27616q = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final void t() {
        com.google.android.gms.internal.ads.LC.f(this.f27607h == 1);
        com.google.android.gms.internal.ads.UA0 ua0 = this.f27602c;
        ua0.f32159b = null;
        ua0.f32158a = null;
        this.f27607h = 0;
        this.f27608i = null;
        this.f27609j = null;
        this.f27613n = false;
        U();
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public final long v() {
        return this.f27612m;
    }

    @Override // com.google.android.gms.internal.ads.AB0
    public /* synthetic */ void w() {
    }

    protected abstract void y();

    @Override // com.google.android.gms.internal.ads.AB0
    public final void z() {
        com.google.android.gms.internal.ads.EI0 ei0 = this.f27608i;
        ei0.getClass();
        ei0.f();
    }
}
