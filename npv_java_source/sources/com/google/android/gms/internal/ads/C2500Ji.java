package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2500Ji implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    C2500Ji() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        android.view.WindowManager windowManager = (android.view.WindowManager) interfaceC2698Ot.getContext().getSystemService("window");
        p174r3.v.t();
        android.util.DisplayMetrics displayMetricsZ = p214v3.E0.Z(windowManager);
        int i6 = displayMetricsZ.widthPixels;
        int i10 = displayMetricsZ.heightPixels;
        int[] iArr = new int[2];
        java.util.HashMap map2 = new java.util.HashMap();
        ((android.view.View) interfaceC2698Ot).getLocationInWindow(iArr);
        map2.put("xInPixels", java.lang.Integer.valueOf(iArr[0]));
        map2.put("yInPixels", java.lang.Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", java.lang.Integer.valueOf(i6));
        map2.put("windowHeightInPixels", java.lang.Integer.valueOf(i10));
        interfaceC2698Ot.O("locationReady", map2);
        p224w3.p.g("GET LOCATION COMPILED");
    }
}
