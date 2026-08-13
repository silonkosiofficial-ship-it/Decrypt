package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ra0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2780Ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31295b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f31298e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f31297d = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Random f31299f = new java.util.Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f31296c = 0;

    public C2780Ra0(long j6, double d6, long j10, double d10) {
        this.f31294a = j6;
        this.f31295b = j10;
        c();
    }

    public final long a() {
        double d6 = this.f31298e;
        double d10 = 0.2d * d6;
        long j6 = (long) (d6 + d10);
        long j10 = (long) (d6 - d10);
        return j10 + ((long) (this.f31299f.nextDouble() * ((j6 - j10) + 1)));
    }

    public final void b() {
        double d6 = this.f31298e;
        this.f31298e = java.lang.Math.min((long) (d6 + d6), this.f31295b);
        this.f31296c++;
    }

    public final void c() {
        this.f31298e = this.f31294a;
        this.f31296c = 0L;
    }

    public final synchronized void d(int i6) {
        Q3.AbstractC1477p.a(i6 > 0);
        this.f31297d = i6;
    }

    public final boolean e() {
        return this.f31296c > java.lang.Math.max(this.f31297d, (long) ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25751z)).intValue()) && this.f31298e >= this.f31295b;
    }
}
