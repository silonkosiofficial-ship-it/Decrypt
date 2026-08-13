package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2734Ps implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f30821C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f30822D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ int f30823E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ int f30824F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ long f30825G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ long f30826H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final /* synthetic */ boolean f30827I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final /* synthetic */ int f30828J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final /* synthetic */ int f30829K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC2880Ts f30830L;

    RunnableC2734Ps(com.google.android.gms.internal.ads.AbstractC2880Ts abstractC2880Ts, java.lang.String str, java.lang.String str2, int i6, int i10, long j6, long j10, boolean z6, int i11, int i12) {
        this.f30821C = str;
        this.f30822D = str2;
        this.f30823E = i6;
        this.f30824F = i10;
        this.f30825G = j6;
        this.f30826H = j10;
        this.f30827I = z6;
        this.f30828J = i11;
        this.f30829K = i12;
        this.f30830L = abstractC2880Ts;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f30821C);
        map.put("cachedSrc", this.f30822D);
        map.put("bytesLoaded", java.lang.Integer.toString(this.f30823E));
        map.put("totalBytes", java.lang.Integer.toString(this.f30824F));
        map.put("bufferedDuration", java.lang.Long.toString(this.f30825G));
        map.put("totalDuration", java.lang.Long.toString(this.f30826H));
        map.put("cacheReady", true != this.f30827I ? "0" : "1");
        map.put("playerCount", java.lang.Integer.toString(this.f30828J));
        map.put("playerPreparedCount", java.lang.Integer.toString(this.f30829K));
        com.google.android.gms.internal.ads.AbstractC2880Ts.b(this.f30830L, "onPrecacheEvent", map);
    }
}
