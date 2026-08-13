package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5813yi implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        java.lang.String str = (java.lang.String) map.get("action");
        if ("tick".equals(str)) {
            java.lang.String str2 = (java.lang.String) map.get("label");
            java.lang.String str3 = (java.lang.String) map.get("start_label");
            java.lang.String str4 = (java.lang.String) map.get("timestamp");
            if (android.text.TextUtils.isEmpty(str2)) {
                p224w3.p.g("No label given for CSI tick.");
                return;
            }
            if (android.text.TextUtils.isEmpty(str4)) {
                p224w3.p.g("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jC = p174r3.v.c().c() + (java.lang.Long.parseLong(str4) - p174r3.v.c().a());
                if (true == android.text.TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                interfaceC2698Ot.m().c(str2, str3, jC);
                return;
            } catch (java.lang.NumberFormatException e6) {
                p224w3.p.h("Malformed timestamp for CSI tick.", e6);
                return;
            }
        }
        if ("experiment".equals(str)) {
            java.lang.String str5 = (java.lang.String) map.get("value");
            if (android.text.TextUtils.isEmpty(str5)) {
                p224w3.p.g("No value given for CSI experiment.");
                return;
            } else {
                interfaceC2698Ot.m().a().d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            java.lang.String str6 = (java.lang.String) map.get("name");
            java.lang.String str7 = (java.lang.String) map.get("value");
            if (android.text.TextUtils.isEmpty(str7)) {
                p224w3.p.g("No value given for CSI extra.");
            } else if (android.text.TextUtils.isEmpty(str6)) {
                p224w3.p.g("No name given for CSI extra.");
            } else {
                interfaceC2698Ot.m().a().d(str6, str7);
            }
        }
    }
}
