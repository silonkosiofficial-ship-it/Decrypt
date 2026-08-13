package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4268kf extends com.google.android.gms.internal.ads.AbstractC5037rf {
    C4268kf(int i6, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        super(i6, str, bool, bool2, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object a(org.json.JSONObject jSONObject) {
        return java.lang.Boolean.valueOf(jSONObject.optBoolean(l(), ((java.lang.Boolean) k()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object b(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? java.lang.Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(l()))) : (java.lang.Boolean) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Boolean.valueOf(sharedPreferences.getBoolean(l(), ((java.lang.Boolean) k()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ void d(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putBoolean(l(), ((java.lang.Boolean) obj).booleanValue());
    }
}
