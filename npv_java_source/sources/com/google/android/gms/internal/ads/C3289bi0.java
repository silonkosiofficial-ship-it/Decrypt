package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3289bi0 extends com.google.android.gms.internal.ads.AbstractC3398ci0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final transient int f34363F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final transient int f34364G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC3398ci0 f34365H;

    C3289bi0(com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0, int i6, int i10) {
        this.f34365H = abstractC3398ci0;
        this.f34363F = i6;
        this.f34364G = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int e() {
        return this.f34365H.f() + this.f34363F + this.f34364G;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int f() {
        return this.f34365H.f() + this.f34363F;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.a(i6, this.f34364G, "index");
        return this.f34365H.get(i6 + this.f34363F);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final java.lang.Object[] s() {
        return this.f34365H.s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34364G;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3398ci0, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i6, int i10) {
        return subList(i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3398ci0
    /* JADX INFO: renamed from: w */
    public final com.google.android.gms.internal.ads.AbstractC3398ci0 subList(int i6, int i10) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.k(i6, i10, this.f34364G);
        int i11 = this.f34363F;
        return this.f34365H.subList(i6 + i11, i10 + i11);
    }
}
