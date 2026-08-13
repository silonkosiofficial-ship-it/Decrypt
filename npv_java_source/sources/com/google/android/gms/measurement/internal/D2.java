package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f41751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f41752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f41753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f41754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6511z2 f41755e;

    private D2(com.google.android.gms.measurement.internal.C6511z2 c6511z2, java.lang.String str, long j6) {
        this.f41755e = c6511z2;
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.a(j6 > 0);
        this.f41751a = str + ":start";
        this.f41752b = str + ":count";
        this.f41753c = str + ":value";
        this.f41754d = j6;
    }

    private final long c() {
        return this.f41755e.J().getLong(this.f41751a, 0L);
    }

    private final void d() {
        this.f41755e.n();
        long jA = this.f41755e.b().a();
        android.content.SharedPreferences.Editor editorEdit = this.f41755e.J().edit();
        editorEdit.remove(this.f41752b);
        editorEdit.remove(this.f41753c);
        editorEdit.putLong(this.f41751a, jA);
        editorEdit.apply();
    }

    public final android.util.Pair a() {
        long jAbs;
        this.f41755e.n();
        this.f41755e.n();
        long jC = c();
        if (jC == 0) {
            d();
            jAbs = 0;
        } else {
            jAbs = java.lang.Math.abs(jC - this.f41755e.b().a());
        }
        long j6 = this.f41754d;
        if (jAbs < j6) {
            return null;
        }
        if (jAbs > (j6 << 1)) {
            d();
            return null;
        }
        java.lang.String string = this.f41755e.J().getString(this.f41753c, null);
        long j10 = this.f41755e.J().getLong(this.f41752b, 0L);
        d();
        return (string == null || j10 <= 0) ? com.google.android.gms.measurement.internal.C6511z2.f42722B : new android.util.Pair(string, java.lang.Long.valueOf(j10));
    }

    public final void b(java.lang.String str, long j6) {
        this.f41755e.n();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j10 = this.f41755e.J().getLong(this.f41752b, 0L);
        if (j10 <= 0) {
            android.content.SharedPreferences.Editor editorEdit = this.f41755e.J().edit();
            editorEdit.putString(this.f41753c, str);
            editorEdit.putLong(this.f41752b, 1L);
            editorEdit.apply();
            return;
        }
        long j11 = j10 + 1;
        boolean z6 = (this.f41755e.i().W0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j11;
        android.content.SharedPreferences.Editor editorEdit2 = this.f41755e.J().edit();
        if (z6) {
            editorEdit2.putString(this.f41753c, str);
        }
        editorEdit2.putLong(this.f41752b, j11);
        editorEdit2.apply();
    }
}
