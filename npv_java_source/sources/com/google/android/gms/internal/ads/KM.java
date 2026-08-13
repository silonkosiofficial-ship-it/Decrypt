package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class KM implements com.google.android.gms.internal.ads.InterfaceC3131aD {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2698Ot f28901C;

    KM(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f28901C = interfaceC2698Ot;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void g(android.content.Context context) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f28901C;
        if (interfaceC2698Ot != null) {
            interfaceC2698Ot.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void k(android.content.Context context) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f28901C;
        if (interfaceC2698Ot != null) {
            interfaceC2698Ot.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3131aD
    public final void r(android.content.Context context) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = this.f28901C;
        if (interfaceC2698Ot != null) {
            interfaceC2698Ot.onResume();
        }
    }
}
