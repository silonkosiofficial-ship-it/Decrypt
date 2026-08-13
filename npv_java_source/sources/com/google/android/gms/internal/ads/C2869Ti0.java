package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ti0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2869Ti0 extends com.google.android.gms.internal.ads.AbstractC3398ci0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient java.lang.Object[] f31975F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final transient int f31976G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final transient int f31977H;

    C2869Ti0(java.lang.Object[] objArr, int i6, int i10) {
        this.f31975F = objArr;
        this.f31976G = i6;
        this.f31977H = i10;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.a(i6, this.f31977H, "index");
        java.lang.Object obj = this.f31975F[i6 + i6 + this.f31976G];
        j$.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31977H;
    }
}
