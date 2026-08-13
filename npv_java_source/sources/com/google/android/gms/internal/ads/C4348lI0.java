package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4348lI0 implements com.google.android.gms.internal.ads.InterfaceC3914hK0, com.google.android.gms.internal.ads.InterfaceC5885zH0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.net.Uri f37143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5510vv0 f37144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3580eI0 f37145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5520w0 f37146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.QE f37147f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f37149h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f37151j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f37153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f37154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4898qI0 f37155n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q0 f37148g = new com.google.android.gms.internal.ads.Q0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37150i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f37142a = com.google.android.gms.internal.ads.BH0.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3843gl0 f37152k = h(0);

    public C4348lI0(com.google.android.gms.internal.ads.C4898qI0 c4898qI0, android.net.Uri uri, com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, com.google.android.gms.internal.ads.InterfaceC3580eI0 interfaceC3580eI0, com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.QE qe) {
        this.f37155n = c4898qI0;
        this.f37143b = uri;
        this.f37144c = new com.google.android.gms.internal.ads.C5510vv0(interfaceC4825pi0);
        this.f37145d = interfaceC3580eI0;
        this.f37146e = interfaceC5520w0;
        this.f37147f = qe;
    }

    static /* bridge */ /* synthetic */ void f(com.google.android.gms.internal.ads.C4348lI0 c4348lI0, long j6, long j10) {
        c4348lI0.f37148g.f30855a = j6;
        c4348lI0.f37151j = j10;
        c4348lI0.f37150i = true;
        c4348lI0.f37154m = false;
    }

    private final com.google.android.gms.internal.ads.C3843gl0 h(long j6) {
        com.google.android.gms.internal.ads.C3621ek0 c3621ek0 = new com.google.android.gms.internal.ads.C3621ek0();
        c3621ek0.d(this.f37143b);
        c3621ek0.c(j6);
        c3621ek0.a(6);
        c3621ek0.b(com.google.android.gms.internal.ads.C4898qI0.f38204p0);
        return c3621ek0.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5885zH0
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        long jMax = !this.f37154m ? this.f37151j : java.lang.Math.max(com.google.android.gms.internal.ads.C4898qI0.T(this.f37155n, true), this.f37151j);
        int iR = c5128sR.r();
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 = this.f37153l;
        interfaceC3107a1.getClass();
        interfaceC3107a1.a(c5128sR, iR);
        interfaceC3107a1.b(jMax, 1, iR, 0, null);
        this.f37154m = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01e1 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3914hK0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4348lI0.g():void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3914hK0
    public final void i() {
        this.f37149h = true;
    }
}
