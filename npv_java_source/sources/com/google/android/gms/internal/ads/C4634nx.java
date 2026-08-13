package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4634nx implements com.google.android.gms.internal.ads.InterfaceC3208ax {
    C4634nx() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208ax
    public final void a(java.util.Map map) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.na)).booleanValue() || map.isEmpty()) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get("is_topics_ad_personalization_allowed");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        p174r3.v.s().j().J(java.lang.Boolean.parseBoolean(str));
    }
}
