package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3024Xs extends com.google.android.gms.internal.ads.AbstractC2880Ts {
    public C3024Xs(com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs) {
        super(interfaceC3746fs);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final boolean p(java.lang.String str) {
        java.lang.String strH = p224w3.g.h(str);
        com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) this.f32025E.get();
        if (interfaceC3746fs != null && strH != null) {
            interfaceC3746fs.y(strH, this);
        }
        p224w3.p.g("VideoStreamNoopCache is doing nothing.");
        d(str, strH, "noop", "Noop cache is a noop.");
        return false;
    }
}
