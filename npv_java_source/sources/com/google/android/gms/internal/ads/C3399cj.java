package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3399cj implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    C3399cj() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        java.lang.String str = (java.lang.String) map.get("action");
        if ("pause".equals(str)) {
            interfaceC2698Ot.w0();
        } else if ("resume".equals(str)) {
            interfaceC2698Ot.E();
        }
    }
}
