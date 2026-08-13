package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5573wW implements com.google.android.gms.internal.ads.ZH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f39612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BM f39613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f39614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p224w3.a f39615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f39616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P4.d f39617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f39618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4166jj f39619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f39620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC5240tT f39621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f39622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f39623l;

    C5573wW(android.content.Context context, com.google.android.gms.internal.ads.BM bm, com.google.android.gms.internal.ads.C4546n70 c4546n70, p224w3.a aVar, com.google.android.gms.internal.ads.R60 r60, P4.d dVar, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.C4166jj c4166jj, boolean z6, com.google.android.gms.internal.ads.BinderC5240tT binderC5240tT, com.google.android.gms.internal.ads.YN yn, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        this.f39612a = context;
        this.f39613b = bm;
        this.f39614c = c4546n70;
        this.f39615d = aVar;
        this.f39616e = r60;
        this.f39617f = dVar;
        this.f39618g = interfaceC2698Ot;
        this.f39619h = c4166jj;
        this.f39620i = z6;
        this.f39621j = binderC5240tT;
        this.f39622k = yn;
        this.f39623l = c3588eO;
    }

    @Override // com.google.android.gms.internal.ads.ZH
    public final void a(boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot;
        com.google.android.gms.internal.ads.AbstractC3806gM abstractC3806gM = (com.google.android.gms.internal.ads.AbstractC3806gM) com.google.android.gms.internal.ads.AbstractC2652Nk0.q(this.f39617f);
        try {
            com.google.android.gms.internal.ads.R60 r60 = this.f39616e;
            if (this.f39618g.j1()) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25460X0)).booleanValue()) {
                    final com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698OtA = this.f39613b.a(this.f39614c.f37512e, null, null);
                    com.google.android.gms.internal.ads.C5925zj.b(interfaceC2698OtA, abstractC3806gM.i());
                    final com.google.android.gms.internal.ads.GM gm = new com.google.android.gms.internal.ads.GM();
                    gm.a(this.f39612a, interfaceC2698OtA.N());
                    abstractC3806gM.l().i(interfaceC2698OtA, true, this.f39620i ? this.f39619h : null, this.f39622k.a());
                    interfaceC2698OtA.M().D(new com.google.android.gms.internal.ads.InterfaceC2478Iu() { // from class: com.google.android.gms.internal.ads.uW
                        @Override // com.google.android.gms.internal.ads.InterfaceC2478Iu
                        public final void a(boolean z10, int i6, java.lang.String str, java.lang.String str2) {
                            gm.b();
                            com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot2 = interfaceC2698OtA;
                            interfaceC2698Ot2.I0();
                            interfaceC2698Ot2.M().u();
                        }
                    });
                    interfaceC2698OtA.M().K(new com.google.android.gms.internal.ads.InterfaceC2515Ju() { // from class: com.google.android.gms.internal.ads.vW
                        @Override // com.google.android.gms.internal.ads.InterfaceC2515Ju
                        public final void a() {
                            interfaceC2698OtA.f0();
                        }
                    });
                    com.google.android.gms.internal.ads.W60 w60 = r60.f31196s;
                    interfaceC2698OtA.d1(w60.f32685b, w60.f32684a, null);
                    interfaceC2698Ot = interfaceC2698OtA;
                } else {
                    interfaceC2698Ot = this.f39618g;
                }
            } else {
                interfaceC2698Ot = this.f39618g;
            }
            interfaceC2698Ot.f1(true);
            boolean zE = this.f39620i ? this.f39619h.e(false) : false;
            p174r3.v.t();
            android.content.Context context2 = this.f39612a;
            boolean z10 = this.f39620i;
            boolean zJ = p214v3.E0.j(context2);
            boolean zD = z10 ? this.f39619h.d() : false;
            float fA = this.f39620i ? this.f39619h.a() : 0.0f;
            com.google.android.gms.internal.ads.R60 r61 = this.f39616e;
            p174r3.l lVar = new p174r3.l(zE, zJ, zD, fA, -1, z6, r61.f31148O, r61.f31149P);
            if (sc != null) {
                sc.e();
            }
            p174r3.v.m();
            com.google.android.gms.internal.ads.NH nhJ = abstractC3806gM.j();
            com.google.android.gms.internal.ads.R60 r62 = this.f39616e;
            p224w3.a aVar = this.f39615d;
            int i6 = r62.f31150Q;
            java.lang.String str = r62.f31135B;
            com.google.android.gms.internal.ads.W60 w61 = r62.f31196s;
            java.lang.String str2 = w61.f32685b;
            java.lang.String str3 = w61.f32684a;
            com.google.android.gms.internal.ads.C4546n70 c4546n70 = this.f39614c;
            p204u3.y.a(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, nhJ, null, interfaceC2698Ot, i6, aVar, str, lVar, str2, str3, c4546n70.f37513f, sc, r62.b() ? this.f39621j : null, interfaceC2698Ot.t()), true, this.f39623l);
        } catch (com.google.android.gms.internal.ads.C3530du e6) {
            p224w3.p.e("", e6);
        }
    }
}
