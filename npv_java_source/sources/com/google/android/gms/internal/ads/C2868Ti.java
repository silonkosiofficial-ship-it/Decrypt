package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2868Ti implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    C2868Ti() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        try {
            java.lang.String str = (java.lang.String) map.get("enabled");
            if (!com.google.android.gms.internal.ads.AbstractC3723fg0.c("true", str) && !com.google.android.gms.internal.ads.AbstractC3723fg0.c("false", str)) {
                return;
            }
            com.google.android.gms.internal.ads.C2567Le0.a(interfaceC2698Ot.getContext()).b(java.lang.Boolean.parseBoolean(str));
        } catch (java.io.IOException e6) {
            p174r3.v.s().x(e6, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
