package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4364lW implements com.google.android.gms.internal.ads.InterfaceC3375cU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f37179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4244kM f37180b;

    public C4364lW(android.content.Context context, com.google.android.gms.internal.ads.AbstractC4244kM abstractC4244kM) {
        this.f37179a = context;
        this.f37180b = abstractC4244kM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) {
        try {
            ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).J0(r60.f31159Z);
            if (c3558e70.f34898a.f34012a.f37522o.f33505a == 3) {
                ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).K1(r60.f31154U, r60.f31202v.toString(), c3558e70.f34898a.f34012a.f37511d, X3.b.c2(this.f37179a), new com.google.android.gms.internal.ads.BinderC4144jW(this, yt, null), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
            } else {
                ((com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b).u2(r60.f31154U, r60.f31202v.toString(), c3558e70.f34898a.f34012a.f37511d, X3.b.c2(this.f37179a), new com.google.android.gms.internal.ads.BinderC4144jW(this, yt, null), (com.google.android.gms.internal.ads.InterfaceC3296bm) yt.f33356c);
            }
        } catch (android.os.RemoteException e6) {
            p214v3.AbstractC7265q0.l("Remote exception loading a rewarded RTB ad", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3375cU
    public final /* bridge */ /* synthetic */ java.lang.Object b(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.YT yt) {
        com.google.android.gms.internal.ads.C3486dV c3486dV = new com.google.android.gms.internal.ads.C3486dV(r60, (com.google.android.gms.internal.ads.InterfaceC2874Tm) yt.f33355b, p104k3.EnumC6886c.REWARDED);
        com.google.android.gms.internal.ads.AbstractC3806gM abstractC3806gMD = this.f37180b.d(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, yt.f33354a), new com.google.android.gms.internal.ads.C3916hM(c3486dV));
        c3486dV.b(abstractC3806gMD.b());
        ((com.google.android.gms.internal.ads.TU) yt.f33356c).p6(abstractC3806gMD.o());
        return abstractC3806gMD.k();
    }
}
