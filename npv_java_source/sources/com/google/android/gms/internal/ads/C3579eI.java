package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3579eI implements com.google.android.gms.internal.ads.EC, com.google.android.gms.internal.ads.InterfaceC4893qG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4400lq f34940C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.content.Context f34941D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4840pq f34942E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final android.view.View f34943F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.lang.String f34944G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.EnumC5473vd f34945H;

    public C3579eI(com.google.android.gms.internal.ads.C4400lq c4400lq, android.content.Context context, com.google.android.gms.internal.ads.C4840pq c4840pq, android.view.View view, com.google.android.gms.internal.ads.EnumC5473vd enumC5473vd) {
        this.f34940C = c4400lq;
        this.f34941D = context;
        this.f34942E = c4840pq;
        this.f34943F = view;
        this.f34945H = enumC5473vd;
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void a() {
        this.f34940C.b(false);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void c() {
        android.view.View view = this.f34943F;
        if (view != null && this.f34944G != null) {
            this.f34942E.o(view.getContext(), this.f34944G);
        }
        this.f34940C.b(true);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893qG
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893qG
    public final void l() {
        if (this.f34945H == com.google.android.gms.internal.ads.EnumC5473vd.APP_OPEN) {
            return;
        }
        java.lang.String strC = this.f34942E.c(this.f34941D);
        this.f34944G = strC;
        this.f34944G = java.lang.String.valueOf(strC).concat(this.f34945H == com.google.android.gms.internal.ads.EnumC5473vd.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void q(com.google.android.gms.internal.ads.InterfaceC3302bp interfaceC3302bp, java.lang.String str, java.lang.String str2) {
        if (this.f34942E.p(this.f34941D)) {
            try {
                com.google.android.gms.internal.ads.C4840pq c4840pq = this.f34942E;
                android.content.Context context = this.f34941D;
                c4840pq.l(context, c4840pq.a(context), this.f34940C.a(), interfaceC3302bp.c(), interfaceC3302bp.b());
            } catch (android.os.RemoteException e6) {
                p224w3.p.h("Remote Exception to get reward item.", e6);
            }
        }
    }
}
