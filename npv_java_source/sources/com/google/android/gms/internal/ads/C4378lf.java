package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4378lf extends com.google.android.gms.internal.ads.AbstractC5037rf {
    C4378lf(int i6, java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
        super(1, str, num, num2, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object a(org.json.JSONObject jSONObject) {
        return java.lang.Integer.valueOf(jSONObject.optInt(l(), ((java.lang.Integer) k()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object b(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? java.lang.Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(l()))) : (java.lang.Integer) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Integer.valueOf(sharedPreferences.getInt(l(), ((java.lang.Integer) k()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ void d(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putInt(l(), ((java.lang.Integer) obj).intValue());
    }
}
