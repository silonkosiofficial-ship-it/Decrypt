package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class DW implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f26717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f26718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4244kM f26719c;

    public DW(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.AbstractC4244kM abstractC4244kM) {
        this.f26717a = context;
        this.f26718b = executor;
        this.f26719c = abstractC4244kM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) {
        try {
            ((com.google.android.gms.internal.ads.M70) yt.f33355b).p(c3558e70.f34898a.f34012a.f37511d, r60.f31202v.toString());
        } catch (java.lang.Exception e6) {
            p224w3.p.h("Fail to load ad from adapter ".concat(java.lang.String.valueOf(yt.f33354a)), e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        if (((com.google.android.gms.internal.ads.M70) yt.f33355b).c()) {
            e(c3558e70, r60, yt);
            return;
        }
        ((com.google.android.gms.internal.ads.UU) yt.f33356c).q6(new com.google.android.gms.internal.ads.BW(this, c3558e70, r60, yt));
        java.lang.Object obj = yt.f33355b;
        android.content.Context context = this.f26717a;
        com.google.android.gms.internal.ads.C4546n70 c4546n70 = c3558e70.f34898a.f34012a;
        ((com.google.android.gms.internal.ads.M70) obj).m(context, c4546n70.f37511d, null, (com.google.android.gms.internal.ads.InterfaceC4618np) yt.f33356c, r60.f31202v.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, final com.google.android.gms.internal.ads.YT yt) {
        com.google.android.gms.internal.ads.AbstractC3806gM abstractC3806gMD = this.f26719c.d(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a), new com.google.android.gms.internal.ads.C3916hM(new com.google.android.gms.internal.ads.ZH() { // from class: com.google.android.gms.internal.ads.zW
            @Override // com.google.android.gms.internal.ads.ZH
            public final void a(boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) throws com.google.android.gms.internal.ads.YH {
                com.google.android.gms.internal.ads.YT yt2 = yt;
                try {
                    ((com.google.android.gms.internal.ads.M70) yt2.f33355b).A(z6);
                    ((com.google.android.gms.internal.ads.M70) yt2.f33355b).a();
                } catch (com.google.android.gms.internal.ads.C5315u70 e6) {
                    p224w3.p.h("Cannot show rewarded video.", e6);
                    throw new com.google.android.gms.internal.ads.YH(e6.getCause());
                }
            }
        }));
        abstractC3806gMD.c().F0(new com.google.android.gms.internal.ads.C2222Bx((com.google.android.gms.internal.ads.M70) yt.f33355b), this.f26718b);
        com.google.android.gms.internal.ads.C4557nD c4557nDD = abstractC3806gMD.d();
        com.google.android.gms.internal.ads.CC ccA = abstractC3806gMD.a();
        ((com.google.android.gms.internal.ads.UU) yt.f33356c).p6(new com.google.android.gms.internal.ads.CW(this, abstractC3806gMD.h(), ccA, c4557nDD, abstractC3806gMD.i()));
        return abstractC3806gMD.k();
    }
}
