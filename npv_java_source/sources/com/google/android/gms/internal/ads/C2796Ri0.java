package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ri0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2796Ri0 extends com.google.android.gms.internal.ads.AbstractC3947hi0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final transient com.google.android.gms.internal.ads.AbstractC3727fi0 f31340E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient java.lang.Object[] f31341F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final transient int f31342G;

    C2796Ri0(com.google.android.gms.internal.ads.AbstractC3727fi0 abstractC3727fi0, java.lang.Object[] objArr, int i6, int i10) {
        this.f31340E = abstractC3727fi0;
        this.f31341F = objArr;
        this.f31342G = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3947hi0
    final com.google.android.gms.internal.ads.AbstractC3398ci0 C() {
        return new com.google.android.gms.internal.ads.C2759Qi0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && value.equals(this.f31340E.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int d(java.lang.Object[] objArr, int i6) {
        return g().d(objArr, i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3947hi0, com.google.android.gms.internal.ads.AbstractC3011Xh0
    public final com.google.android.gms.internal.ads.AbstractC4167jj0 n() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31342G;
    }
}
