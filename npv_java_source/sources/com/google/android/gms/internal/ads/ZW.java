package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class ZW implements com.google.android.gms.internal.ads.VT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2970Wf f33601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f33602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5429v90 f33603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4145jX f33604d;

    public ZW(com.google.android.gms.internal.ads.C5429v90 c5429v90, com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.InterfaceC2970Wf interfaceC2970Wf, com.google.android.gms.internal.ads.C4145jX c4145jX) {
        this.f33603c = c5429v90;
        this.f33602b = yk0;
        this.f33601a = interfaceC2970Wf;
        this.f33604d = c4145jX;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.W60 w60;
        return (this.f33601a == null || (w60 = r60.f31196s) == null || w60.f32684a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.C4512mr c4512mr = new com.google.android.gms.internal.ads.C4512mr();
        com.google.android.gms.internal.ads.C3597eX c3597eX = new com.google.android.gms.internal.ads.C3597eX();
        c3597eX.d(new com.google.android.gms.internal.ads.YW(this, c4512mr, c3558e70, r60, c3597eX));
        com.google.android.gms.internal.ads.W60 w60 = r60.f31196s;
        final com.google.android.gms.internal.ads.BinderC2789Rf binderC2789Rf = new com.google.android.gms.internal.ads.BinderC2789Rf(c3597eX, w60.f32685b, w60.f32684a);
        com.google.android.gms.internal.ads.EnumC4770p90 enumC4770p90 = com.google.android.gms.internal.ads.EnumC4770p90.CUSTOM_RENDER_SYN;
        return com.google.android.gms.internal.ads.AbstractC3562e90.d(new com.google.android.gms.internal.ads.Z80() { // from class: com.google.android.gms.internal.ads.XW
            @Override // com.google.android.gms.internal.ads.Z80
            public final void a() {
                this.f33140a.c(binderC2789Rf);
            }
        }, this.f33602b, enumC4770p90, this.f33603c).b(com.google.android.gms.internal.ads.EnumC4770p90.CUSTOM_RENDER_ACK).d(c4512mr).a();
    }

    final /* synthetic */ void c(com.google.android.gms.internal.ads.BinderC2789Rf binderC2789Rf) {
        this.f33601a.d1(binderC2789Rf);
    }
}
