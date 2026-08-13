package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2169Aj implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f25774a;

    public C2169Aj(android.content.Context context) {
        this.f25774a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        if (!map.containsKey("text") || android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("text"))) {
            return;
        }
        p214v3.AbstractC7265q0.k("Opening Share Sheet with text: ".concat(java.lang.String.valueOf((java.lang.String) map.get("text"))));
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (java.lang.String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (java.lang.String) map.get("title"));
        }
        try {
            p174r3.v.t();
            p214v3.E0.t(this.f25774a, intent);
        } catch (java.lang.RuntimeException e6) {
            p224w3.p.h("Failed to open Share Sheet", e6);
            p174r3.v.s().x(e6, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
