package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Si0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2833Si0 extends com.google.android.gms.internal.ads.AbstractC3947hi0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final transient com.google.android.gms.internal.ads.AbstractC3727fi0 f31736E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient com.google.android.gms.internal.ads.AbstractC3398ci0 f31737F;

    C2833Si0(com.google.android.gms.internal.ads.AbstractC3727fi0 abstractC3727fi0, com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0) {
        this.f31736E = abstractC3727fi0;
        this.f31737F = abstractC3398ci0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f31736E.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int d(java.lang.Object[] objArr, int i6) {
        return this.f31737F.d(objArr, i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3947hi0, com.google.android.gms.internal.ads.AbstractC3011Xh0
    public final com.google.android.gms.internal.ads.AbstractC3398ci0 g() {
        return this.f31737F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.f31737F.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3947hi0, com.google.android.gms.internal.ads.AbstractC3011Xh0
    public final com.google.android.gms.internal.ads.AbstractC4167jj0 n() {
        return this.f31737F.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31736E.size();
    }
}
