package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5447vI0 extends com.google.android.gms.internal.ads.AbstractC4236kH0 implements com.google.android.gms.internal.ads.InterfaceC4458mI0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2683Oh0 f39369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.XF0 f39370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f39371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39372k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f39373l = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f39374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f39375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Pv0 f39376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Q7 f39377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5117sI0 f39378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3365cK0 f39379r;

    /* synthetic */ C5447vI0(com.google.android.gms.internal.ads.Q7 q10, com.google.android.gms.internal.ads.InterfaceC2683Oh0 interfaceC2683Oh0, com.google.android.gms.internal.ads.C5117sI0 c5117sI0, com.google.android.gms.internal.ads.XF0 xf0, com.google.android.gms.internal.ads.C3365cK0 c3365cK0, int i6, boolean z6, com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg0, com.google.android.gms.internal.ads.AbstractC5337uI0 abstractC5337uI0) {
        this.f39377p = q10;
        this.f39369h = interfaceC2683Oh0;
        this.f39378q = c5117sI0;
        this.f39370i = xf0;
        this.f39379r = c3365cK0;
        this.f39371j = i6;
    }

    private final void y() {
        long j6 = this.f39373l;
        boolean z6 = this.f39374m;
        boolean z10 = this.f39375n;
        com.google.android.gms.internal.ads.Q7 q7L0 = l0();
        com.google.android.gms.internal.ads.JI0 ji0 = new com.google.android.gms.internal.ads.JI0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j6, j6, 0L, 0L, z6, false, false, null, q7L0, z10 ? q7L0.f30899c : null);
        u(this.f39372k ? new com.google.android.gms.internal.ads.C5007rI0(this, ji0) : ji0);
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final void J() {
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final void b(com.google.android.gms.internal.ads.JH0 jh0) {
        ((com.google.android.gms.internal.ads.C4898qI0) jh0).z();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0, com.google.android.gms.internal.ads.NH0
    public final synchronized void c(com.google.android.gms.internal.ads.Q7 q10) {
        this.f39377p = q10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4458mI0
    public final void d(long j6, boolean z6, boolean z10) {
        if (j6 == -9223372036854775807L) {
            j6 = this.f39373l;
        }
        if (!this.f39372k && this.f39373l == j6 && this.f39374m == z6 && this.f39375n == z10) {
            return;
        }
        this.f39373l = j6;
        this.f39374m = z6;
        this.f39375n = z10;
        this.f39372k = false;
        y();
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final com.google.android.gms.internal.ads.JH0 e(com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.YJ0 yj0, long j6) {
        com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0A = this.f39369h.a();
        com.google.android.gms.internal.ads.Pv0 pv0 = this.f39376o;
        if (pv0 != null) {
            interfaceC4825pi0A.b(pv0);
        }
        com.google.android.gms.internal.ads.C4651o5 c4651o5 = l0().f30898b;
        c4651o5.getClass();
        android.net.Uri uri = c4651o5.f37715a;
        com.google.android.gms.internal.ads.C5117sI0 c5117sI0 = this.f39378q;
        m();
        return new com.google.android.gms.internal.ads.C4898qI0(uri, interfaceC4825pi0A, new com.google.android.gms.internal.ads.C4456mH0(c5117sI0.f38715a), this.f39370i, n(lh0), this.f39379r, p(lh0), this, yj0, null, this.f39371j, false, com.google.android.gms.internal.ads.EW.K(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final synchronized com.google.android.gms.internal.ads.Q7 l0() {
        return this.f39377p;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0
    protected final void t(com.google.android.gms.internal.ads.Pv0 pv0) {
        this.f39376o = pv0;
        android.os.Looper.myLooper().getClass();
        m();
        y();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0
    protected final void w() {
    }
}
