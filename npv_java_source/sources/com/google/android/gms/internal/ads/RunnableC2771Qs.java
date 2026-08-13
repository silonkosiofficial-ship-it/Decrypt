package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2771Qs implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f31064C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f31065D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ int f31066E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC2880Ts f31067F;

    RunnableC2771Qs(com.google.android.gms.internal.ads.AbstractC2880Ts abstractC2880Ts, java.lang.String str, java.lang.String str2, int i6) {
        this.f31064C = str;
        this.f31065D = str2;
        this.f31066E = i6;
        this.f31067F = abstractC2880Ts;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f31064C);
        map.put("cachedSrc", this.f31065D);
        map.put("totalBytes", java.lang.Integer.toString(this.f31066E));
        com.google.android.gms.internal.ads.AbstractC2880Ts.b(this.f31067F, "onPrecacheEvent", map);
    }
}
