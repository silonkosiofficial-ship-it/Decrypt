package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2660Ns implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f30397C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f30398D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ long f30399E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ long f30400F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ long f30401G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ long f30402H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final /* synthetic */ long f30403I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final /* synthetic */ boolean f30404J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    final /* synthetic */ int f30405K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    final /* synthetic */ int f30406L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC2880Ts f30407M;

    RunnableC2660Ns(com.google.android.gms.internal.ads.AbstractC2880Ts abstractC2880Ts, java.lang.String str, java.lang.String str2, long j6, long j10, long j11, long j12, long j13, boolean z6, int i6, int i10) {
        this.f30397C = str;
        this.f30398D = str2;
        this.f30399E = j6;
        this.f30400F = j10;
        this.f30401G = j11;
        this.f30402H = j12;
        this.f30403I = j13;
        this.f30404J = z6;
        this.f30405K = i6;
        this.f30406L = i10;
        this.f30407M = abstractC2880Ts;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f30397C);
        map.put("cachedSrc", this.f30398D);
        map.put("bufferedDuration", java.lang.Long.toString(this.f30399E));
        map.put("totalDuration", java.lang.Long.toString(this.f30400F));
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue()) {
            map.put("qoeLoadedBytes", java.lang.Long.toString(this.f30401G));
            map.put("qoeCachedBytes", java.lang.Long.toString(this.f30402H));
            map.put("totalBytes", java.lang.Long.toString(this.f30403I));
            map.put("reportTime", java.lang.Long.toString(p174r3.v.c().a()));
        }
        map.put("cacheReady", true != this.f30404J ? "0" : "1");
        map.put("playerCount", java.lang.Integer.toString(this.f30405K));
        map.put("playerPreparedCount", java.lang.Integer.toString(this.f30406L));
        com.google.android.gms.internal.ads.AbstractC2880Ts.b(this.f30407M, "onPrecacheEvent", map);
    }
}
