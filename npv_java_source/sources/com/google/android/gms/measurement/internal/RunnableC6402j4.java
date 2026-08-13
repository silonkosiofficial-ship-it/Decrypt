package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6402j4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.lang.Boolean f42455C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42456D;

    RunnableC6402j4(com.google.android.gms.measurement.internal.F3 f6, java.lang.Boolean bool) {
        this.f42455C = bool;
        this.f42456D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42456D.c0(this.f42455C, true);
    }
}
