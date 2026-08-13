package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4362lU implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f37175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2334Ey f37176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f37177c;

    C4362lU(android.content.Context context, com.google.android.gms.internal.ads.AbstractC2334Ey abstractC2334Ey, java.util.concurrent.Executor executor) {
        this.f37175a = context;
        this.f37176b = abstractC2334Ey;
        this.f37177c = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        com.google.android.gms.internal.ads.M70 m70 = (com.google.android.gms.internal.ads.M70) yt.f33355b;
        com.google.android.gms.internal.ads.C4546n70 c4546n70 = c3558e70.f34898a.f34012a;
        java.lang.String string = r60.f31202v.toString();
        m70.q(this.f37175a, c4546n70.f37511d, string, (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, final com.google.android.gms.internal.ads.YT yt) {
        com.google.android.gms.internal.ads.AbstractC2186Ay abstractC2186AyA = this.f37176b.a(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a), new com.google.android.gms.internal.ads.C4785pH(new com.google.android.gms.internal.ads.ZH() { // from class: com.google.android.gms.internal.ads.kU
            @Override // com.google.android.gms.internal.ads.ZH
            public final void a(boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) throws com.google.android.gms.internal.ads.YH {
                com.google.android.gms.internal.ads.YT yt2 = yt;
                try {
                    ((com.google.android.gms.internal.ads.M70) yt2.f33355b).A(z6);
                    ((com.google.android.gms.internal.ads.M70) yt2.f33355b).B(context);
                } catch (com.google.android.gms.internal.ads.C5315u70 e6) {
                    throw new com.google.android.gms.internal.ads.YH(e6.getCause());
                }
            }
        }, null), new com.google.android.gms.internal.ads.C2223By(r60.f31161a0));
        abstractC2186AyA.c().F0(new com.google.android.gms.internal.ads.C2222Bx((com.google.android.gms.internal.ads.M70) yt.f33355b), this.f37177c);
        ((com.google.android.gms.internal.ads.TU) yt.f33356c).p6(abstractC2186AyA.g());
        return abstractC2186AyA.h();
    }
}
