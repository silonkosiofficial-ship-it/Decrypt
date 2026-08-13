package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6375f5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ android.content.ComponentName f42387C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 f42388D;

    RunnableC6375f5(com.google.android.gms.measurement.internal.ServiceConnectionC6361d5 serviceConnectionC6361d5, android.content.ComponentName componentName) {
        this.f42387C = componentName;
        this.f42388D = serviceConnectionC6361d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.F4.K(this.f42388D.f42350c, this.f42387C);
    }
}
