package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class UW implements com.google.android.gms.internal.ads.VT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f32215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC5517vz f32216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2970Wf f32217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f32218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5429v90 f32219e;

    public UW(android.content.Context context, com.google.android.gms.internal.ads.AbstractC5517vz abstractC5517vz, com.google.android.gms.internal.ads.C5429v90 c5429v90, com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.InterfaceC2970Wf interfaceC2970Wf) {
        this.f32215a = context;
        this.f32216b = abstractC5517vz;
        this.f32219e = c5429v90;
        this.f32218d = yk0;
        this.f32217c = interfaceC2970Wf;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.W60 w60;
        return (this.f32217c == null || (w60 = r60.f31196s) == null || w60.f32684a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.SW sw = new com.google.android.gms.internal.ads.SW(this, new android.view.View(this.f32215a), null, new com.google.android.gms.internal.ads.InterfaceC3454dA() { // from class: com.google.android.gms.internal.ads.QW
            @Override // com.google.android.gms.internal.ads.InterfaceC3454dA
            public final p184s3.Y0 a() {
                return null;
            }
        }, (com.google.android.gms.internal.ads.S60) r60.f31200u.get(0));
        com.google.android.gms.internal.ads.AbstractC2814Ry abstractC2814RyA = this.f32216b.a(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, null), sw);
        com.google.android.gms.internal.ads.TW twL = abstractC2814RyA.l();
        com.google.android.gms.internal.ads.W60 w60 = r60.f31196s;
        final com.google.android.gms.internal.ads.BinderC2789Rf binderC2789Rf = new com.google.android.gms.internal.ads.BinderC2789Rf(twL, w60.f32685b, w60.f32684a);
        com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90 = com.google.android.gms.internal.ads.EnumC4770p90.CUSTOM_RENDER_SYN;
        return com.google.android.gms.internal.ads.AbstractC3562e90.d(new com.google.android.gms.internal.ads.Z80() { // from class: com.google.android.gms.internal.ads.RW
            @Override // com.google.android.gms.internal.ads.Z80
            public final void a() {
                this.f31285a.c(binderC2789Rf);
            }
        }, this.f32218d, enumC4770p90, this.f32219e).b(com.google.android.gms.internal.ads.EnumC4770p90.CUSTOM_RENDER_ACK).d(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(abstractC2814RyA.h())).a();
    }

    final /* synthetic */ void c(com.google.android.gms.internal.ads.BinderC2789Rf binderC2789Rf) {
        this.f32217c.d1(binderC2789Rf);
    }
}
