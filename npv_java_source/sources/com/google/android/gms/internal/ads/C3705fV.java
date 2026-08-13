package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3705fV implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f35352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.QH f35353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p224w3.a f35354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.Executor f35355d;

    public C3705fV(android.content.Context context, p224w3.a aVar, com.google.android.gms.internal.ads.QH qh, java.util.concurrent.Executor executor) {
        this.f35352a = context;
        this.f35354c = aVar;
        this.f35353b = qh;
        this.f35355d = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        com.google.android.gms.internal.ads.M70 m70 = (com.google.android.gms.internal.ads.M70) yt.f33355b;
        com.google.android.gms.internal.ads.C4546n70 c4546n70 = c3558e70.f34898a.f34012a;
        java.lang.String string = r60.f31202v.toString();
        java.lang.String strM = p214v3.V.m(r60.f31196s);
        m70.t(this.f35352a, c4546n70.f37511d, string, strM, (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, final com.google.android.gms.internal.ads.YT yt) {
        com.google.android.gms.internal.ads.AbstractC4455mH abstractC4455mHC = this.f35353b.c(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a), new com.google.android.gms.internal.ads.C4785pH(new com.google.android.gms.internal.ads.ZH() { // from class: com.google.android.gms.internal.ads.eV
            @Override // com.google.android.gms.internal.ads.ZH
            public final void a(boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) throws com.google.android.gms.internal.ads.YH {
                this.f34994a.c(yt, z6, context, sc);
            }
        }, null));
        abstractC4455mHC.c().F0(new com.google.android.gms.internal.ads.C2222Bx((com.google.android.gms.internal.ads.M70) yt.f33355b), this.f35355d);
        ((com.google.android.gms.internal.ads.TU) yt.f33356c).p6(abstractC4455mHC.g());
        return abstractC4455mHC.i();
    }

    final /* synthetic */ void c(com.google.android.gms.internal.ads.YT yt, boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) throws com.google.android.gms.internal.ads.YH {
        try {
            ((com.google.android.gms.internal.ads.M70) yt.f33355b).A(z6);
            if (this.f35354c.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25405S0)).intValue()) {
                ((com.google.android.gms.internal.ads.M70) yt.f33355b).C();
            } else {
                ((com.google.android.gms.internal.ads.M70) yt.f33355b).D(context);
            }
        } catch (com.google.android.gms.internal.ads.C5315u70 e6) {
            p224w3.p.f("Cannot show interstitial.");
            throw new com.google.android.gms.internal.ads.YH(e6.getCause());
        }
    }
}
