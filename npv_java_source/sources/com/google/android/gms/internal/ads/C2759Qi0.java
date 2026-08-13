package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2759Qi0 extends com.google.android.gms.internal.ads.AbstractC3398ci0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2796Ri0 f31032F;

    C2759Qi0(com.google.android.gms.internal.ads.C2796Ri0 c2796Ri0) {
        this.f31032F = c2796Ri0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i6) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.a(i6, this.f31032F.f31342G, "index");
        int i10 = i6 + i6;
        java.lang.Object obj = this.f31032F.f31341F[i10];
        j$.util.Objects.requireNonNull(obj);
        java.lang.Object obj2 = this.f31032F.f31341F[i10 + 1];
        j$.util.Objects.requireNonNull(obj2);
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    public final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31032F.f31342G;
    }
}
