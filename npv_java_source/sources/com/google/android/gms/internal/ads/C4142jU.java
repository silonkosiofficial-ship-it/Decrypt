package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4142jU implements com.google.android.gms.internal.ads.ZH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p224w3.a f36680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P4.d f36681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f36682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f36683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f36684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4166jj f36685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f36686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f36687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f36688i;

    C4142jU(p224w3.a aVar, P4.d dVar, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4546n70 c4546n70, boolean z6, com.google.android.gms.internal.ads.C4166jj c4166jj, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f36680a = aVar;
        this.f36681b = dVar;
        this.f36682c = r60;
        this.f36683d = interfaceC2698Ot;
        this.f36684e = c4546n70;
        this.f36686g = z6;
        this.f36685f = c4166jj;
        this.f36687h = binderC5240tT;
        this.f36688i = c3588eO;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    @Override // com.google.android.gms.internal.ads.ZH
    public final void a(boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) {
        com.google.android.gms.internal.ads.AbstractC2186Ay abstractC2186Ay = (com.google.android.gms.internal.ads.AbstractC2186Ay) com.google.android.gms.internal.ads.AbstractC2652Nk0.q(this.f36681b);
        this.f36683d.f1(true);
        boolean zE = this.f36686g ? this.f36685f.e(true) : true;
        boolean z10 = this.f36686g;
        p174r3.l lVar = new p174r3.l(zE, true, z10 ? this.f36685f.d() : false, z10 ? this.f36685f.a() : 0.0f, -1, z6, this.f36682c.f31148O, false);
        if (sc != null) {
            sc.e();
        }
        p174r3.v.m();
        com.google.android.gms.internal.ads.NH nhI = abstractC2186Ay.i();
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f36683d;
        int i6 = this.f36682c.f31150Q;
        if (i6 == -1) {
            p184s3.i2 i2Var = this.f36684e.f37517j;
            if (i2Var == null) {
                p224w3.p.b("Error setting app open orientation; no targeting orientation available.");
                i6 = this.f36682c.f31150Q;
            } else {
                int i10 = i2Var.f54278C;
                if (i10 == 1) {
                    i6 = 7;
                } else if (i10 == 2) {
                    i6 = 6;
                } else {
                    p224w3.p.b("Error setting app open orientation; no targeting orientation available.");
                    i6 = this.f36682c.f31150Q;
                }
            }
        }
        int i11 = i6;
        p224w3.a aVar = this.f36680a;
        com.google.android.gms.internal.ads.R60 r60 = this.f36682c;
        java.lang.String str = r60.f31135B;
        com.google.android.gms.internal.ads.W60 w60 = r60.f31196s;
        p204u3.y.a(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, nhI, null, interfaceC2698Ot, i11, aVar, str, lVar, w60.f32685b, w60.f32684a, this.f36684e.f37513f, sc, r60.b() ? this.f36687h : null, this.f36683d.t()), true, this.f36688i);
    }
}
