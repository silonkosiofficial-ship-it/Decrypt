package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4143jV implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f36689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.QH f36690b;

    public C4143jV(android.content.Context context, com.google.android.gms.internal.ads.QH qh) {
        this.f36689a = context;
        this.f36690b = qh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) throws com.google.android.gms.internal.ads.C5315u70 {
        try {
            ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).J0(r60.f31159Z);
            ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).T5(r60.f31154U, r60.f31202v.toString(), c3558e70.f34898a.f34012a.f37511d, X3.b.c2(this.f36689a), new com.google.android.gms.internal.ads.BinderC3925hV(this, yt, null), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
        } catch (android.os.RemoteException e6) {
            p214v3.AbstractC7265q0.l("Remote exception loading a interstitial RTB ad", e6);
            throw new com.google.android.gms.internal.ads.C5315u70(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) {
        com.google.android.gms.internal.ads.C3486dV c3486dV = new com.google.android.gms.internal.ads.C3486dV(r60, (com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b, p104k3.EnumC6886c.INTERSTITIAL);
        com.google.android.gms.internal.ads.AbstractC4455mH abstractC4455mHC = this.f36690b.c(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a), new com.google.android.gms.internal.ads.C4785pH(c3486dV, null));
        c3486dV.b(abstractC4455mHC.b());
        ((com.google.android.gms.internal.ads.TU) yt.f33356c).p6(abstractC4455mHC.f());
        return abstractC4455mHC.i();
    }
}
