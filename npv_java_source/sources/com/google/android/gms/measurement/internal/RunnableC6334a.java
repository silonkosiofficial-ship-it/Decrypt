package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6334a implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42247C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ long f42248D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6501y f42249E;

    RunnableC6334a(com.google.android.gms.measurement.internal.C6501y c6501y, java.lang.String str, long j6) {
        this.f42247C = str;
        this.f42248D = j6;
        this.f42249E = c6501y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.C6501y.y(this.f42249E, this.f42247C, this.f42248D);
    }
}
