package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class R2 implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f42106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.P2 f42107b;

    public R2(com.google.android.gms.measurement.internal.P2 p6, java.lang.String str) {
        this.f42107b = p6;
        Q3.AbstractC1477p.l(str);
        this.f42106a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.f42107b.j().G().b(this.f42106a, th);
    }
}
