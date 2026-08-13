package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class A80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25072a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f25074c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5867z80 f25073b = new com.google.android.gms.internal.ads.C5867z80();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25075d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25076e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25077f = 0;

    public A80() {
        long jA = p174r3.v.c().a();
        this.f25072a = jA;
        this.f25074c = jA;
    }

    public final int a() {
        return this.f25075d;
    }

    public final long b() {
        return this.f25072a;
    }

    public final long c() {
        return this.f25074c;
    }

    public final com.google.android.gms.internal.ads.C5867z80 d() {
        com.google.android.gms.internal.ads.C5867z80 c5867z80 = this.f25073b;
        com.google.android.gms.internal.ads.C5867z80 c5867z80Clone = c5867z80.clone();
        c5867z80.f40228C = false;
        c5867z80.f40229D = 0;
        return c5867z80Clone;
    }

    public final java.lang.String e() {
        return "Created: " + this.f25072a + " Last accessed: " + this.f25074c + " Accesses: " + this.f25075d + "\nEntries retrieved: Valid: " + this.f25076e + " Stale: " + this.f25077f;
    }

    public final void f() {
        this.f25074c = p174r3.v.c().a();
        this.f25075d++;
    }

    public final void g() {
        this.f25077f++;
        this.f25073b.f40229D++;
    }

    public final void h() {
        this.f25076e++;
        this.f25073b.f40228C = true;
    }
}
