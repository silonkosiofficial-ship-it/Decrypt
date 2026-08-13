package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2599Mc0 implements java.lang.Comparable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f29808E;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f29807D = -9223372036854775807L;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f29806C = new com.google.android.gms.internal.ads.C5128sR();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C2599Mc0 c2599Mc0 = (com.google.android.gms.internal.ads.C2599Mc0) obj;
        int iCompare = java.lang.Long.compare(this.f29807D, c2599Mc0.f29807D);
        return iCompare != 0 ? iCompare : java.lang.Long.compare(this.f29808E, c2599Mc0.f29808E);
    }

    public final void i(long j6, long j10, com.google.android.gms.internal.ads.C5128sR c5128sR) {
        com.google.android.gms.internal.ads.LC.f(j6 != -9223372036854775807L);
        this.f29807D = j6;
        this.f29808E = j10;
        this.f29806C.i(c5128sR.r());
        java.lang.System.arraycopy(c5128sR.n(), c5128sR.t(), this.f29806C.n(), 0, c5128sR.r());
    }
}
