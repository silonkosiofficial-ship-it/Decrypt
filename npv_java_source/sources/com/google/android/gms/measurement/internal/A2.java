package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f41700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f41703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 f41704e;

    public A2(com.google.android.gms.measurement.internal.C6511z2 c6511z2, java.lang.String str, long j6) {
        this.f41704e = c6511z2;
        Q3.AbstractC1477p.f(str);
        this.f41700a = str;
        this.f41701b = j6;
    }

    public final long a() {
        if (!this.f41702c) {
            this.f41702c = true;
            this.f41703d = this.f41704e.J().getLong(this.f41700a, this.f41701b);
        }
        return this.f41703d;
    }

    public final void b(long j6) {
        android.content.SharedPreferences.Editor editorEdit = this.f41704e.J().edit();
        editorEdit.putLong(this.f41700a, j6);
        editorEdit.apply();
        this.f41703d = j6;
    }
}
