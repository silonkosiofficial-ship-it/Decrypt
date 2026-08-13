package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2647Ni implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    C2647Ni() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        int i6;
        java.lang.String str;
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            com.google.android.gms.internal.ads.AbstractC2458If0 abstractC2458If0L = com.google.android.gms.internal.ads.AbstractC2495Jf0.l();
            abstractC2458If0L.b((java.lang.String) map.get("appId"));
            abstractC2458If0L.h(interfaceC2698Ot.getWidth());
            abstractC2458If0L.g(interfaceC2698Ot.N().getWindowToken());
            if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                i6 = java.lang.Integer.parseInt((java.lang.String) map.get("gravityX")) | java.lang.Integer.parseInt((java.lang.String) map.get("gravityY"));
            } else {
                i6 = 81;
            }
            abstractC2458If0L.d(i6);
            abstractC2458If0L.e(map.containsKey("verticalMargin") ? java.lang.Float.parseFloat((java.lang.String) map.get("verticalMargin")) : 0.02f);
            if (map.containsKey("enifd")) {
                abstractC2458If0L.a((java.lang.String) map.get("enifd"));
            }
            try {
                p174r3.v.n().j(interfaceC2698Ot, abstractC2458If0L.i());
                return;
            } catch (java.lang.NullPointerException e6) {
                p174r3.v.s().x(e6, "DefaultGmsgHandlers.ShowLMDOverlay");
                str = "Missing parameters for LMD Overlay show request";
            }
        }
        p214v3.AbstractC7265q0.k(str);
    }
}
