package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class UL {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.CC f32190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4557nD f32191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AD f32192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.MD f32193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3793gF f32194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KG f32195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f32196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2559La0 f32197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4033iT f32198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2591Lx f32199j;

    UL(com.google.android.gms.internal.ads.CC cc, com.google.android.gms.internal.ads.C4557nD c4557nD, com.google.android.gms.internal.ads.AD ad, com.google.android.gms.internal.ads.MD md, com.google.android.gms.internal.ads.C3793gF c3793gF, com.google.android.gms.internal.ads.KG kg, com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.C2559La0 c2559La0, com.google.android.gms.internal.ads.C4033iT c4033iT, com.google.android.gms.internal.ads.C2591Lx c2591Lx) {
        this.f32190a = cc;
        this.f32191b = c4557nD;
        this.f32192c = ad;
        this.f32193d = md;
        this.f32194e = c3793gF;
        this.f32195f = kg;
        this.f32196g = c3588eO;
        this.f32197h = c2559La0;
        this.f32198i = c4033iT;
        this.f32199j = c2591Lx;
    }

    public final void a(com.google.android.gms.internal.ads.VL vl, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        com.google.android.gms.internal.ads.SL sl = vl.f32491a;
        final com.google.android.gms.internal.ads.C4557nD c4557nD = this.f32191b;
        j$.util.Objects.requireNonNull(c4557nD);
        sl.b(this.f32190a, this.f32192c, this.f32193d, this.f32194e, new p204u3.InterfaceC7202d() { // from class: com.google.android.gms.internal.ads.TL
            @Override // p204u3.InterfaceC7202d
            public final void i() {
                c4557nD.b();
            }
        }, this.f32195f);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25501aa)).booleanValue() || interfaceC2698Ot == null || interfaceC2698Ot.M() == null) {
            return;
        }
        com.google.android.gms.internal.ads.InterfaceC2552Ku interfaceC2552KuM = interfaceC2698Ot.M();
        interfaceC2552KuM.J(this.f32199j, this.f32198i, this.f32197h);
        interfaceC2552KuM.B0(this.f32199j, this.f32198i, this.f32196g);
    }
}
