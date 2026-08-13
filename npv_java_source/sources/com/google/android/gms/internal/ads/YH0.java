package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class YH0 implements com.google.android.gms.internal.ads.IJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.IJ0 f33329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2728Pm f33330b;

    public YH0(com.google.android.gms.internal.ads.IJ0 ij0, com.google.android.gms.internal.ads.C2728Pm c2728Pm) {
        this.f33329a = ij0;
        this.f33330b = c2728Pm;
    }

    @Override // com.google.android.gms.internal.ads.MJ0
    public final com.google.android.gms.internal.ads.D F(int i6) {
        return this.f33330b.b(this.f33329a.r(i6));
    }

    @Override // com.google.android.gms.internal.ads.MJ0
    public final int G(int i6) {
        return this.f33329a.G(i6);
    }

    @Override // com.google.android.gms.internal.ads.IJ0
    public final int b() {
        return this.f33329a.b();
    }

    @Override // com.google.android.gms.internal.ads.IJ0
    public final com.google.android.gms.internal.ads.D e() {
        return this.f33330b.b(this.f33329a.b());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.YH0)) {
            return false;
        }
        com.google.android.gms.internal.ads.YH0 yh0 = (com.google.android.gms.internal.ads.YH0) obj;
        return this.f33329a.equals(yh0.f33329a) && this.f33330b.equals(yh0.f33330b);
    }

    @Override // com.google.android.gms.internal.ads.MJ0
    public final int f() {
        return this.f33329a.f();
    }

    public final int hashCode() {
        return ((this.f33330b.hashCode() + 527) * 31) + this.f33329a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.MJ0
    public final com.google.android.gms.internal.ads.C2728Pm i() {
        return this.f33330b;
    }

    @Override // com.google.android.gms.internal.ads.MJ0
    public final int r(int i6) {
        return this.f33329a.r(i6);
    }
}
