package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5792yV implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f40079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4567nI f40080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4282km f40081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p224w3.a f40082d;

    public C5792yV(android.content.Context context, com.google.android.gms.internal.ads.AbstractC4567nI abstractC4567nI, p224w3.a aVar) {
        this.f40079a = context;
        this.f40080b = abstractC4567nI;
        this.f40082d = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        try {
            ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).J0(r60.f31159Z);
            com.google.android.gms.internal.ads.AbstractC5682xV abstractC5682xV = null;
            if (this.f40082d.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25373P1)).intValue()) {
                ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).L5(r60.f31154U, r60.f31202v.toString(), c3558e70.f34898a.f34012a.f37511d, X3.b.c2(this.f40079a), new com.google.android.gms.internal.ads.BinderC5572wV(this, yt, abstractC5682xV), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
            } else {
                ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).G2(r60.f31154U, r60.f31202v.toString(), c3558e70.f34898a.f34012a.f37511d, X3.b.c2(this.f40079a), new com.google.android.gms.internal.ads.BinderC5572wV(this, yt, abstractC5682xV), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c, c3558e70.f34898a.f34012a.f37516i);
            }
        } catch (android.os.RemoteException e6) {
            throw new com.google.android.gms.internal.ads.C5315u70(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.XV {
        if (!c3558e70.f34898a.f34012a.f37514g.contains(java.lang.Integer.toString(6))) {
            throw new com.google.android.gms.internal.ads.XV(2, "Unified must be used for RTB.");
        }
        com.google.android.gms.internal.ads.C3581eJ c3581eJG0 = com.google.android.gms.internal.ads.C3581eJ.g0(this.f40081c);
        com.google.android.gms.internal.ads.C4546n70 c4546n70 = c3558e70.f34898a.f34012a;
        if (!c4546n70.f37514g.contains(java.lang.Integer.toString(c3581eJG0.P()))) {
            throw new com.google.android.gms.internal.ads.XV(1, "No corresponding native ad listener");
        }
        com.google.android.gms.internal.ads.AbstractC3801gJ abstractC3801gJD = this.f40080b.d(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a), new com.google.android.gms.internal.ads.C4899qJ(c3581eJG0), new com.google.android.gms.internal.ads.C4351lK(null, null, this.f40081c));
        ((com.google.android.gms.internal.ads.TU) yt.f33356c).p6(abstractC3801gJD.f());
        return abstractC3801gJD.h();
    }
}
