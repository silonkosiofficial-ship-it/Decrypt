package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4598nf extends com.google.android.gms.internal.ads.AbstractC5037rf {
    C4598nf(int i6, java.lang.String str, java.lang.Float f6, java.lang.Float f10) {
        super(1, str, f6, f10, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object a(org.json.JSONObject jSONObject) {
        return java.lang.Float.valueOf((float) jSONObject.optDouble(l(), ((java.lang.Float) k()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object b(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? java.lang.Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(l()))) : (java.lang.Float) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Float.valueOf(sharedPreferences.getFloat(l(), ((java.lang.Float) k()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ void d(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putFloat(l(), ((java.lang.Float) obj).floatValue());
    }
}
