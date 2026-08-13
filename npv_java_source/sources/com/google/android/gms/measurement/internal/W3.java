package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class W3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42186C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f42187D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ java.lang.Object f42188E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final /* synthetic */ long f42189F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42190G;

    W3(com.google.android.gms.measurement.internal.F3 f6, java.lang.String str, java.lang.String str2, java.lang.Object obj, long j6) {
        this.f42186C = str;
        this.f42187D = str2;
        this.f42188E = obj;
        this.f42189F = j6;
        this.f42190G = f6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42190G.k0(this.f42186C, this.f42187D, this.f42188E, this.f42189F);
    }
}
