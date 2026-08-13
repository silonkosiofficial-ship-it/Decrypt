package p214v3;

/* JADX INFO: renamed from: v3.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7243f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f55882a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f55883b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f55884c;

    C7243f0(android.content.Context context) {
        this.f55884c = context;
    }

    final synchronized void b(java.lang.String str) {
        try {
            if (this.f55882a.containsKey(str)) {
                return;
            }
            android.content.SharedPreferences defaultSharedPreferences = j$.util.Objects.equals(str, "__default__") ? android.preference.PreferenceManager.getDefaultSharedPreferences(this.f55884c) : this.f55884c.getSharedPreferences(str, 0);
            p214v3.SharedPreferencesOnSharedPreferenceChangeListenerC7241e0 sharedPreferencesOnSharedPreferenceChangeListenerC7241e0 = new p214v3.SharedPreferencesOnSharedPreferenceChangeListenerC7241e0(this, str);
            this.f55882a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC7241e0);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC7241e0);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final void c() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.na)).booleanValue()) {
            p174r3.v.t();
            java.util.Map mapB0 = p214v3.E0.b0((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.sa));
            java.util.Iterator it = mapB0.keySet().iterator();
            while (it.hasNext()) {
                b((java.lang.String) it.next());
            }
            d(new p214v3.C7237c0(mapB0));
        }
    }

    final synchronized void d(p214v3.C7237c0 c7237c0) {
        this.f55883b.add(c7237c0);
    }
}
