package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6509z0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42719C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ long f42720D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6501y f42721E;

    RunnableC6509z0(com.google.android.gms.measurement.internal.C6501y c6501y, java.lang.String str, long j6) {
        this.f42719C = str;
        this.f42720D = j6;
        this.f42721E = c6501y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.C6501y.C(this.f42721E, this.f42719C, this.f42720D);
    }
}
