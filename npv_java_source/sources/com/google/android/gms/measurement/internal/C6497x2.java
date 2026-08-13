package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6497x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f42693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 f42697e;

    public C6497x2(com.google.android.gms.measurement.internal.C6511z2 c6511z2, java.lang.String str, boolean z6) {
        this.f42697e = c6511z2;
        Q3.AbstractC1477p.f(str);
        this.f42693a = str;
        this.f42694b = z6;
    }

    public final void a(boolean z6) {
        android.content.SharedPreferences.Editor editorEdit = this.f42697e.J().edit();
        editorEdit.putBoolean(this.f42693a, z6);
        editorEdit.apply();
        this.f42696d = z6;
    }

    public final boolean b() {
        if (!this.f42695c) {
            this.f42695c = true;
            this.f42696d = this.f42697e.J().getBoolean(this.f42693a, this.f42694b);
        }
        return this.f42696d;
    }
}
