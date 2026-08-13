package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4488mf extends com.google.android.gms.internal.ads.AbstractC5037rf {
    C4488mf(int i6, java.lang.String str, java.lang.Long l6, java.lang.Long l10) {
        super(1, str, l6, l10, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object a(org.json.JSONObject jSONObject) {
        return java.lang.Long.valueOf(jSONObject.optLong(l(), ((java.lang.Long) k()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object b(android.os.Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? java.lang.Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(l()))) : (java.lang.Long) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ java.lang.Object c(android.content.SharedPreferences sharedPreferences) {
        return java.lang.Long.valueOf(sharedPreferences.getLong(l(), ((java.lang.Long) k()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5037rf
    public final /* bridge */ /* synthetic */ void d(android.content.SharedPreferences.Editor editor, java.lang.Object obj) {
        editor.putLong(l(), ((java.lang.Long) obj).longValue());
    }
}
