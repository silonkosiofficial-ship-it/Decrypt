package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2685Oi0 extends com.google.android.gms.internal.ads.AbstractC3398ci0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final com.google.android.gms.internal.ads.AbstractC3398ci0 f30551H = new com.google.android.gms.internal.ads.C2685Oi0(new java.lang.Object[0], 0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final transient java.lang.Object[] f30552F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final transient int f30553G;

    C2685Oi0(java.lang.Object[] objArr, int i6) {
        this.f30552F = objArr;
        this.f30553G = i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3398ci0, com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int d(java.lang.Object[] objArr, int i6) {
        java.lang.System.arraycopy(this.f30552F, 0, objArr, i6, this.f30553G);
        return i6 + this.f30553G;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int e() {
        return this.f30553G;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int f() {
        return 0;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.a(i6, this.f30553G, "index");
        java.lang.Object obj = this.f30552F[i6];
        j$.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final boolean o() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final java.lang.Object[] s() {
        return this.f30552F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30553G;
    }
}
