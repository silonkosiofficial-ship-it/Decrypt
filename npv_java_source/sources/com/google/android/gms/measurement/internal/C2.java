package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f41743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f41745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 f41746d;

    public C2(com.google.android.gms.measurement.internal.C6511z2 c6511z2, java.lang.String str, java.lang.String str2) {
        this.f41746d = c6511z2;
        Q3.AbstractC1477p.f(str);
        this.f41743a = str;
    }

    public final java.lang.String a() {
        if (!this.f41744b) {
            this.f41744b = true;
            this.f41745c = this.f41746d.J().getString(this.f41743a, null);
        }
        return this.f41745c;
    }

    public final void b(java.lang.String str) {
        android.content.SharedPreferences.Editor editorEdit = this.f41746d.J().edit();
        editorEdit.putString(this.f41743a, str);
        editorEdit.apply();
        this.f41745c = str;
    }
}
