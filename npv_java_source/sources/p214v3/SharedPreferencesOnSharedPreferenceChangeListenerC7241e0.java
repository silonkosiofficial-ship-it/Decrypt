package p214v3;

/* JADX INFO: renamed from: v3.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC7241e0 implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f55879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p214v3.C7243f0 f55880b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC7241e0(p214v3.C7243f0 c7243f0, java.lang.String str) {
        this.f55880b = c7243f0;
        this.f55879a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        synchronized (this.f55880b) {
            try {
                for (p214v3.C7237c0 c7237c0 : this.f55880b.f55883b) {
                    java.lang.String str2 = this.f55879a;
                    java.util.Map map = c7237c0.f55877a;
                    if (map.containsKey(str2) && ((java.util.Set) map.get(str2)).contains(str)) {
                        p174r3.v.s().j().J(false);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
