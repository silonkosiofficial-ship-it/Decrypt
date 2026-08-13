package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5389uq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f39287a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f39288b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f39289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3742fq f39290d;

    C5389uq(android.content.Context context, com.google.android.gms.internal.ads.C3742fq c3742fq) {
        this.f39289c = context;
        this.f39290d = c3742fq;
    }

    final /* synthetic */ void b(java.util.Map map, android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2) {
        if (map.containsKey(str) && ((java.util.Set) map.get(str)).contains(str2)) {
            this.f39290d.d();
        }
    }

    final synchronized void c(java.lang.String str) {
        try {
            if (this.f39287a.containsKey(str)) {
                return;
            }
            android.content.SharedPreferences defaultSharedPreferences = j$.util.Objects.equals(str, "__default__") ? android.preference.PreferenceManager.getDefaultSharedPreferences(this.f39289c) : this.f39289c.getSharedPreferences(str, 0);
            com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC5279tq sharedPreferencesOnSharedPreferenceChangeListenerC5279tq = new com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC5279tq(this, str);
            this.f39287a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC5279tq);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC5279tq);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    final synchronized void d(com.google.android.gms.internal.ads.C5169sq c5169sq) {
        this.f39288b.add(c5169sq);
    }
}
