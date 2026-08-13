package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3509dj implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    C3509dj() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        if (map.keySet().contains("start")) {
            interfaceC2698Ot.M().m();
        } else if (map.keySet().contains("stop")) {
            interfaceC2698Ot.M().n();
        } else if (map.keySet().contains("cancel")) {
            interfaceC2698Ot.M().l();
        }
    }
}
