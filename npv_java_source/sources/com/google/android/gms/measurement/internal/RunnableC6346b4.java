package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6346b4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f42281C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42282D;

    RunnableC6346b4(com.google.android.gms.measurement.internal.F3 f6, android.os.Bundle bundle) {
        this.f42281C = bundle;
        this.f42282D = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.F3.U(this.f42282D, this.f42281C);
    }
}
