package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5557wI0 implements com.google.android.gms.internal.ads.SJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.ads.RJ0 f39574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.gms.internal.ads.C5557wI0 f39575d;

    public C5557wI0(long j6, int i6) {
        d(j6, 65536);
    }

    public final int a(long j6) {
        long j10 = j6 - this.f39572a;
        int i6 = this.f39574c.f31232b;
        return (int) j10;
    }

    public final com.google.android.gms.internal.ads.C5557wI0 b() {
        this.f39574c = null;
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0 = this.f39575d;
        this.f39575d = null;
        return c5557wI0;
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final com.google.android.gms.internal.ads.RJ0 c() {
        com.google.android.gms.internal.ads.RJ0 rj0 = this.f39574c;
        rj0.getClass();
        return rj0;
    }

    public final void d(long j6, int i6) {
        com.google.android.gms.internal.ads.LC.f(this.f39574c == null);
        this.f39572a = j6;
        this.f39573b = j6 + 65536;
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final com.google.android.gms.internal.ads.SJ0 f() {
        com.google.android.gms.internal.ads.C5557wI0 c5557wI0 = this.f39575d;
        if (c5557wI0 == null || c5557wI0.f39574c == null) {
            return null;
        }
        return c5557wI0;
    }
}
