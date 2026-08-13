package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4818pf extends com.google.android.gms.internal.ads.AbstractC5037rf {
    C4818pf(int i6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object a(org.json.JSONObject jSONObject) {
        return jSONObject.optString(l(), (java.lang.String) k());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object b(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(l())) : (java.lang.String) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.content.SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(l(), (java.lang.String) k());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ void d(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putString(l(), (java.lang.String) obj);
    }
}
