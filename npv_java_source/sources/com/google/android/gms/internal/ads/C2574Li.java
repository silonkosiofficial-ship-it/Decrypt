package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2574Li implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    C2574Li() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        org.json.JSONObject jSONObjectB;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        com.google.android.gms.internal.ads.InterfaceC3395ch interfaceC3395chB0 = interfaceC2698Ot.b0();
        if (interfaceC3395chB0 == null || (jSONObjectB = interfaceC3395chB0.b()) == null) {
            interfaceC2698Ot.a("nativeClickMetaReady", new org.json.JSONObject());
        } else {
            interfaceC2698Ot.a("nativeClickMetaReady", jSONObjectB);
        }
    }
}
