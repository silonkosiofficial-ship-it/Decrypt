package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesC6134u0 implements android.content.SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f41230a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f41231b = new java.util.HashSet();

    private final java.lang.Object a(java.lang.String str, java.lang.Object obj) {
        java.lang.Object obj2 = this.f41230a.get(str);
        return obj2 != null ? obj2 : obj;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(java.lang.String str) {
        return this.f41230a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final android.content.SharedPreferences.Editor edit() {
        return new com.google.android.gms.internal.measurement.SharedPreferencesEditorC6158x0(this);
    }

    @Override // android.content.SharedPreferences
    public final java.util.Map getAll() {
        return this.f41230a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(java.lang.String str, boolean z6) {
        return ((java.lang.Boolean) a(str, java.lang.Boolean.valueOf(z6))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(java.lang.String str, float f6) {
        return ((java.lang.Float) a(str, java.lang.Float.valueOf(f6))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(java.lang.String str, int i6) {
        return ((java.lang.Integer) a(str, java.lang.Integer.valueOf(i6))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(java.lang.String str, long j6) {
        return ((java.lang.Long) a(str, java.lang.Long.valueOf(j6))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return (java.lang.String) a(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final java.util.Set getStringSet(java.lang.String str, java.util.Set set) {
        return (java.util.Set) a(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f41231b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f41231b.remove(onSharedPreferenceChangeListener);
    }
}
