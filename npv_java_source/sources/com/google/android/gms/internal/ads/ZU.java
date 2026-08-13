package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class ZU implements com.google.android.gms.internal.ads.ZH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f33590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p224w3.a f33591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P4.d f33592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f33593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f33594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f33595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4166jj f33596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f33597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f33598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f33599j;

    ZU(android.content.Context context, p224w3.a aVar, P4.d dVar, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4546n70 c4546n70, boolean z6, com.google.android.gms.internal.ads.C4166jj c4166jj, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f33590a = context;
        this.f33591b = aVar;
        this.f33592c = dVar;
        this.f33593d = r60;
        this.f33594e = interfaceC2698Ot;
        this.f33595f = c4546n70;
        this.f33596g = c4166jj;
        this.f33597h = z6;
        this.f33598i = binderC5240tT;
        this.f33599j = c3588eO;
    }

    @Override // com.google.android.gms.internal.ads.ZH
    public final void a(boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) {
        com.google.android.gms.internal.ads.AbstractC4455mH abstractC4455mH = (com.google.android.gms.internal.ads.AbstractC4455mH) com.google.android.gms.internal.ads.AbstractC2652Nk0.q(this.f33592c);
        this.f33594e.f1(true);
        boolean zE = this.f33597h ? this.f33596g.e(false) : false;
        p174r3.v.t();
        p174r3.l lVar = new p174r3.l(zE, p214v3.E0.j(this.f33590a), this.f33597h ? this.f33596g.d() : false, this.f33597h ? this.f33596g.a() : 0.0f, -1, z6, this.f33593d.f31148O, false);
        if (sc != null) {
            sc.e();
        }
        p174r3.v.m();
        com.google.android.gms.internal.ads.NH nhJ = abstractC4455mH.j();
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f33594e;
        com.google.android.gms.internal.ads.R60 r60 = this.f33593d;
        p224w3.a aVar = this.f33591b;
        int i6 = r60.f31150Q;
        java.lang.String str = r60.f31135B;
        com.google.android.gms.internal.ads.W60 w60 = r60.f31196s;
        p204u3.y.a(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, nhJ, null, interfaceC2698Ot, i6, aVar, str, lVar, w60.f32685b, w60.f32684a, this.f33595f.f37513f, sc, r60.b() ? this.f33598i : null, this.f33594e.t()), true, this.f33599j);
    }
}
