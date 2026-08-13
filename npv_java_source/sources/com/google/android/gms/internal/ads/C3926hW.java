package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3926hW implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f36084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f36085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4244kM f36086c;

    public C3926hW(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.AbstractC4244kM abstractC4244kM) {
        this.f36084a = context;
        this.f36085b = executor;
        this.f36086c = abstractC4244kM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) {
        try {
            com.google.android.gms.internal.ads.C4546n70 c4546n70 = c3558e70.f34898a.f34012a;
            if (c4546n70.f37522o.f33505a == 3) {
                ((com.google.android.gms.internal.ads.M70) yt.f33355b).w(this.f36084a, c4546n70.f37511d, r60.f31202v.toString(), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
            } else {
                ((com.google.android.gms.internal.ads.M70) yt.f33355b).v(this.f36084a, c4546n70.f37511d, r60.f31202v.toString(), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
            }
        } catch (java.lang.Exception e6) {
            p224w3.p.h("Fail to load ad from adapter ".concat(java.lang.String.valueOf(yt.f33354a)), e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, final com.google.android.gms.internal.ads.YT yt) {
        com.google.android.gms.internal.ads.AbstractC3806gM abstractC3806gMD = this.f36086c.d(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a), new com.google.android.gms.internal.ads.C3916hM(new com.google.android.gms.internal.ads.ZH() { // from class: com.google.android.gms.internal.ads.gW
            @Override // com.google.android.gms.internal.ads.ZH
            public final void a(boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) throws com.google.android.gms.internal.ads.YH {
                com.google.android.gms.internal.ads.YT yt2 = yt;
                try {
                    ((com.google.android.gms.internal.ads.M70) yt2.f33355b).A(z6);
                    ((com.google.android.gms.internal.ads.M70) yt2.f33355b).E(context);
                } catch (com.google.android.gms.internal.ads.C5315u70 e6) {
                    throw new com.google.android.gms.internal.ads.YH(e6.getCause());
                }
            }
        }));
        abstractC3806gMD.c().F0(new com.google.android.gms.internal.ads.C2222Bx((com.google.android.gms.internal.ads.M70) yt.f33355b), this.f36085b);
        ((com.google.android.gms.internal.ads.TU) yt.f33356c).p6(abstractC3806gMD.n());
        return abstractC3806gMD.k();
    }
}
