package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5697xf implements com.google.android.gms.internal.ads.InterfaceC2828Sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.content.SharedPreferences f39892a;

    C5697xf(com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC5807yf sharedPreferencesOnSharedPreferenceChangeListenerC5807yf, android.content.SharedPreferences sharedPreferences) {
        this.f39892a = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2828Sg
    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        return this.f39892a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2828Sg
    public final java.lang.Double b(java.lang.String str, double d6) {
        try {
            return java.lang.Double.valueOf(this.f39892a.getFloat(str, (float) d6));
        } catch (java.lang.ClassCastException unused) {
            return java.lang.Double.valueOf(this.f39892a.getString(str, java.lang.String.valueOf(d6)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2828Sg
    public final java.lang.Long c(java.lang.String str, long j6) {
        try {
            return java.lang.Long.valueOf(this.f39892a.getLong(str, j6));
        } catch (java.lang.ClassCastException unused) {
            return java.lang.Long.valueOf(this.f39892a.getInt(str, (int) j6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2828Sg
    public final java.lang.Boolean d(java.lang.String str, boolean z6) {
        try {
            return java.lang.Boolean.valueOf(this.f39892a.getBoolean(str, z6));
        } catch (java.lang.ClassCastException unused) {
            return java.lang.Boolean.valueOf(this.f39892a.getString(str, java.lang.String.valueOf(z6)));
        }
    }
}
