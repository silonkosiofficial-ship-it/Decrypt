package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class SharedPreferencesEditorC6158x0 implements android.content.SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.Set f41274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.Map f41275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.SharedPreferencesC6134u0 f41276d;

    private SharedPreferencesEditorC6158x0(com.google.android.gms.internal.measurement.SharedPreferencesC6134u0 sharedPreferencesC6134u0) {
        this.f41276d = sharedPreferencesC6134u0;
        this.f41273a = false;
        this.f41274b = new java.util.HashSet();
        this.f41275c = new java.util.HashMap();
    }

    private final void a(java.lang.String str, java.lang.Object obj) {
        if (obj != null) {
            this.f41275c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor clear() {
        this.f41273a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f41273a) {
            this.f41276d.f41230a.clear();
        }
        this.f41276d.f41230a.keySet().removeAll(this.f41274b);
        for (java.util.Map.Entry entry : this.f41275c.entrySet()) {
            this.f41276d.f41230a.put((java.lang.String) entry.getKey(), entry.getValue());
        }
        for (android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f41276d.f41231b) {
            N4.S sD = N4.M.c(this.f41274b, this.f41275c.keySet()).iterator();
            while (sD.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f41276d, (java.lang.String) sD.next());
            }
        }
        return (!this.f41273a && this.f41274b.isEmpty() && this.f41275c.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z6) {
        a(str, java.lang.Boolean.valueOf(z6));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f6) {
        a(str, java.lang.Float.valueOf(f6));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putInt(java.lang.String str, int i6) {
        a(str, java.lang.Integer.valueOf(i6));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putLong(java.lang.String str, long j6) {
        a(str, java.lang.Long.valueOf(j6));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor remove(java.lang.String str) {
        this.f41274b.add(str);
        return this;
    }
}
