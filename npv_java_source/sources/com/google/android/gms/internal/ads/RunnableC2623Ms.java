package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2623Ms implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f29838C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f29839D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ int f29840E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ int f29841F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC2880Ts f29842G;

    RunnableC2623Ms(com.google.android.gms.internal.ads.AbstractC2880Ts abstractC2880Ts, java.lang.String str, java.lang.String str2, int i6, int i10, boolean z6) {
        this.f29838C = str;
        this.f29839D = str2;
        this.f29840E = i6;
        this.f29841F = i10;
        this.f29842G = abstractC2880Ts;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f29838C);
        map.put("cachedSrc", this.f29839D);
        map.put("bytesLoaded", java.lang.Integer.toString(this.f29840E));
        map.put("totalBytes", java.lang.Integer.toString(this.f29841F));
        map.put("cacheReady", "0");
        com.google.android.gms.internal.ads.AbstractC2880Ts.b(this.f29842G, "onPrecacheEvent", map);
    }
}
