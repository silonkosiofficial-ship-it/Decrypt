package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6353c4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f42335C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42336D;

    RunnableC6353c4(com.google.android.gms.measurement.internal.F3 f6, android.os.Bundle bundle) {
        this.f42335C = bundle;
        this.f42336D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.F3.Q0(this.f42336D, this.f42335C);
    }
}
