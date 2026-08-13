package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2832Si implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    C2832Si() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        try {
            com.google.android.gms.internal.ads.C2677Oe0.k(interfaceC2698Ot.getContext()).l();
            com.google.android.gms.internal.ads.C2714Pe0.j(interfaceC2698Ot.getContext()).k();
            com.google.android.gms.internal.ads.C2751Qe0.a(interfaceC2698Ot.getContext()).b(null);
        } catch (java.io.IOException e6) {
            p174r3.v.s().x(e6, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
