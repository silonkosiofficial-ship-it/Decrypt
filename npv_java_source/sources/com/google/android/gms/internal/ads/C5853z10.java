package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5853z10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f40189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KP f40190b;

    C5853z10(com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.KP kp) {
        this.f40189a = yk0;
        this.f40190b = kp;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f40189a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.y10
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f39973a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.A10 c() {
        com.google.android.gms.internal.ads.KP kp = this.f40190b;
        java.lang.String strD = kp.d();
        boolean zS = kp.s();
        boolean zL = p174r3.v.w().l();
        com.google.android.gms.internal.ads.KP kp2 = this.f40190b;
        return new com.google.android.gms.internal.ads.A10(strD, zS, zL, kp2.q(), kp2.t());
    }
}
