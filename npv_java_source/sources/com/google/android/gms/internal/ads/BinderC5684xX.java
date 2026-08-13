package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5684xX extends p184s3.M {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3708fY f39875C;

    public BinderC5684xX(android.content.Context context, com.google.android.gms.internal.ads.AbstractC2846Su abstractC2846Su, com.google.android.gms.internal.ads.C4326l70 c4326l70, com.google.android.gms.internal.ads.C4789pJ c4789pJ, p184s3.H h6) {
        com.google.android.gms.internal.ads.C4038iY c4038iY = new com.google.android.gms.internal.ads.C4038iY(c4789pJ, abstractC2846Su.q());
        c4038iY.e(h6);
        this.f39875C = new com.google.android.gms.internal.ads.C3708fY(new com.google.android.gms.internal.ads.C5135sY(abstractC2846Su, context, c4038iY, c4326l70), c4326l70.l());
    }

    @Override // p184s3.N
    public final void H5(p184s3.X1 x6) {
        this.f39875C.d(x6, 1);
    }

    @Override // p184s3.N
    public final synchronized void J2(p184s3.X1 x6, int i6) {
        this.f39875C.d(x6, i6);
    }

    @Override // p184s3.N
    public final synchronized java.lang.String d() {
        return this.f39875C.a();
    }

    @Override // p184s3.N
    public final synchronized java.lang.String e() {
        return this.f39875C.b();
    }

    @Override // p184s3.N
    public final synchronized boolean h() {
        return this.f39875C.e();
    }
}
