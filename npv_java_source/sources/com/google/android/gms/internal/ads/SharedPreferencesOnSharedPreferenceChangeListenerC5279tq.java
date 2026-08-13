package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC5279tq implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f39032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5389uq f39033b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC5279tq(com.google.android.gms.internal.ads.C5389uq c5389uq, java.lang.String str) {
        this.f39033b = c5389uq;
        this.f39032a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        synchronized (this.f39033b) {
            try {
                for (com.google.android.gms.internal.ads.C5169sq c5169sq : this.f39033b.f39288b) {
                    c5169sq.f38799a.b(c5169sq.f38800b, sharedPreferences, this.f39032a, str);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
