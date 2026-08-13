package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class SP implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f31689a = new org.json.JSONObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.List f31690b;

    SP() {
    }

    public final org.json.JSONObject a() {
        return this.f31689a;
    }

    final void b(android.content.SharedPreferences sharedPreferences, java.util.List list) {
        this.f31690b = list;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            onSharedPreferenceChanged(sharedPreferences, (java.lang.String) it.next());
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if (str != null && this.f31690b.contains(str)) {
            try {
                java.lang.Object obj = sharedPreferences.getAll().get(str);
                if (obj == null) {
                    this.f31689a.remove(str);
                } else {
                    this.f31689a.put(str, obj);
                }
            } catch (org.json.JSONException e6) {
                p174r3.v.s().w(e6, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
            }
        }
    }
}
