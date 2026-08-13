package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5925zj implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5815yj f40367a;

    public C5925zj(com.google.android.gms.internal.ads.InterfaceC5815yj interfaceC5815yj) {
        this.f40367a = interfaceC5815yj;
    }

    public static void b(com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot, com.google.android.gms.internal.ads.InterfaceC5815yj interfaceC5815yj) {
        interfaceC2698Ot.g1("/reward", new com.google.android.gms.internal.ads.C5925zj(interfaceC5815yj));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f40367a.c();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f40367a.b();
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.ads.C4728op c4728op = null;
        try {
            int i6 = java.lang.Integer.parseInt((java.lang.String) map.get("amount"));
            java.lang.String str2 = (java.lang.String) map.get("type");
            if (!android.text.TextUtils.isEmpty(str2)) {
                c4728op = new com.google.android.gms.internal.ads.C4728op(str2, i6);
            }
        } catch (java.lang.NumberFormatException e6) {
            p224w3.p.h("Unable to parse reward amount.", e6);
        }
        this.f40367a.v0(c4728op);
    }
}
