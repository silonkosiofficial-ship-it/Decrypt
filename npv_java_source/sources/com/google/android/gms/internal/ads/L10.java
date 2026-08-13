package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class L10 implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f29186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.pm.PackageInfo f29187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f29188c;

    public L10(com.google.android.gms.internal.ads.C4546n70 c4546n70, android.content.pm.PackageInfo packageInfo, p214v3.InterfaceC7268s0 interfaceC7268s0) {
        this.f29186a = c4546n70;
        this.f29187b = packageInfo;
        this.f29188c = interfaceC7268s0;
    }

    private final void a(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.C3505dh c3505dh = this.f29186a.f37516i;
        if (c3505dh == null || c3505dh.f34783K == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", c3505dh.f34784L);
        bundle.putInt("sccg_dir", this.f29186a.f37516i.f34783K);
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        java.util.ArrayList arrayList = this.f29186a.f37514g;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        a(c3677fC.f35302b);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C3505dh c3505dh;
        org.json.JSONArray jSONArrayOptJSONArray;
        java.lang.String str;
        java.util.ArrayList<java.lang.String> arrayList = this.f29186a.f37514g;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            c3677fC.f35301a.putInt("native_version", 0);
            return;
        }
        android.os.Bundle bundle = c3677fC.f35301a;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.f29186a.f37515h);
        com.google.android.gms.internal.ads.C3505dh c3505dh2 = this.f29186a.f37516i;
        if (c3505dh2 != null) {
            java.lang.String str2 = "any";
            if (c3505dh2.f34775C > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i6 = this.f29186a.f37516i.f34782J;
                if (i6 == 1) {
                    str = "any";
                } else if (i6 == 2) {
                    str = "landscape";
                } else if (i6 != 3) {
                    str = i6 != 4 ? "unknown" : "square";
                } else {
                    str = "portrait";
                }
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i10 = this.f29186a.f37516i.f34777E;
            if (i10 != 0) {
                if (i10 != 1) {
                    str2 = i10 != 2 ? "unknown" : "landscape";
                } else {
                    str2 = "portrait";
                }
            }
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", this.f29186a.f37516i.f34778F);
            bundle.putBoolean("use_custom_mute", this.f29186a.f37516i.f34781I);
            a(c3677fC.f35301a);
        }
        android.content.pm.PackageInfo packageInfo = this.f29187b;
        int i11 = packageInfo != null ? packageInfo.versionCode : 0;
        if (i11 > this.f29188c.a()) {
            this.f29188c.s();
            this.f29188c.z(i11);
        }
        org.json.JSONObject jSONObjectN = this.f29188c.n();
        java.lang.String string = null;
        if (jSONObjectN != null && (jSONArrayOptJSONArray = jSONObjectN.optJSONArray(this.f29186a.f37513f)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!android.text.TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i12 = this.f29186a.f37518k;
        if (i12 > 1) {
            bundle.putInt("max_num_ads", i12);
        }
        com.google.android.gms.internal.ads.C4498mk c4498mk = this.f29186a.f37509b;
        if (c4498mk != null) {
            if (android.text.TextUtils.isEmpty(c4498mk.f37398E)) {
                java.lang.String str3 = "p";
                if (c4498mk.f37396C >= 2) {
                    int i13 = c4498mk.f37399F;
                    if (i13 == 2 || i13 != 3) {
                        str3 = "l";
                    }
                } else {
                    int i14 = c4498mk.f37397D;
                    if (i14 == 1) {
                        str3 = "l";
                    } else if (i14 != 2) {
                        p224w3.p.d("Instream ad video aspect ratio " + i14 + " is wrong.");
                        str3 = "l";
                    }
                }
                bundle.putString("ia_var", str3);
            } else {
                bundle.putString("ad_tag", c4498mk.f37398E);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.f29186a.a() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Kb)).booleanValue() || (c3505dh = this.f29186a.f37516i) == null) {
            return;
        }
        if (c3505dh.f34780H != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("startMuted", this.f29186a.f37516i.f34780H.f54139C);
            bundle2.putBoolean("clickToExpandRequested", this.f29186a.f37516i.f34780H.f54141E);
            bundle2.putBoolean("customControlsRequested", this.f29186a.f37516i.f34780H.f54140D);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", this.f29186a.f37516i.f34776D);
        bundle.putInt("preferred_ad_choices_position", this.f29186a.f37516i.f34779G);
    }
}
