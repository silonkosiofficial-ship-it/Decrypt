package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class AL implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2830Sh f25146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PL f25147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f25148c;

    public AL(com.google.android.gms.internal.ads.C4789pJ c4789pJ, com.google.android.gms.internal.ads.C3581eJ c3581eJ, com.google.android.gms.internal.ads.PL pl, com.google.android.gms.internal.ads.Uy0 uy0) {
        this.f25146a = c4789pJ.c(c3581eJ.a());
        this.f25147b = pl;
        this.f25148c = uy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("asset");
        try {
            this.f25146a.y3((com.google.android.gms.internal.ads.InterfaceC2424Hh) this.f25148c.b(), str);
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Failed to call onCustomClick for asset " + str + ".", e6);
        }
    }

    public final void b() {
        if (this.f25146a == null) {
            return;
        }
        this.f25147b.l("/nativeAdCustomClick", this);
    }
}
