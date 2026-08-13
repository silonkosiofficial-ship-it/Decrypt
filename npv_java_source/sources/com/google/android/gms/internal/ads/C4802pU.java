package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4802pU implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f38010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC2334Ey f38011b;

    C4802pU(android.content.Context context, com.google.android.gms.internal.ads.AbstractC2334Ey abstractC2334Ey) {
        this.f38010a = context;
        this.f38011b = abstractC2334Ey;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        try {
            ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).J0(r60.f31159Z);
            ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).O4(r60.f31154U, r60.f31202v.toString(), c3558e70.f34898a.f34012a.f37511d, X3.b.c2(this.f38010a), new com.google.android.gms.internal.ads.BinderC4582nU(yt, null), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
        } catch (android.os.RemoteException e6) {
            p214v3.AbstractC7265q0.l("Remote exception loading an app open RTB ad", e6);
            throw new com.google.android.gms.internal.ads.C5315u70(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) {
        com.google.android.gms.internal.ads.C3486dV c3486dV = new com.google.android.gms.internal.ads.C3486dV(r60, (com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b, p104k3.EnumC6886c.APP_OPEN_AD);
        com.google.android.gms.internal.ads.AbstractC2186Ay abstractC2186AyA = this.f38011b.a(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a), new com.google.android.gms.internal.ads.C4785pH(c3486dV, null), new com.google.android.gms.internal.ads.C2223By(r60.f31161a0));
        c3486dV.b(abstractC2186AyA.b());
        ((com.google.android.gms.internal.ads.TU) yt.f33356c).p6(abstractC2186AyA.f());
        return abstractC2186AyA.h();
    }
}
