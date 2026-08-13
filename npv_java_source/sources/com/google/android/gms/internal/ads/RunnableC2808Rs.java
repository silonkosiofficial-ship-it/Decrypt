package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2808Rs implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f31370C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f31371D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ long f31372E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC2880Ts f31373F;

    RunnableC2808Rs(com.google.android.gms.internal.ads.AbstractC2880Ts abstractC2880Ts, java.lang.String str, java.lang.String str2, long j6) {
        this.f31370C = str;
        this.f31371D = str2;
        this.f31372E = j6;
        this.f31373F = abstractC2880Ts;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f31370C);
        map.put("cachedSrc", this.f31371D);
        map.put("totalDuration", java.lang.Long.toString(this.f31372E));
        com.google.android.gms.internal.ads.AbstractC2880Ts.b(this.f31373F, "onPrecacheEvent", map);
    }
}
