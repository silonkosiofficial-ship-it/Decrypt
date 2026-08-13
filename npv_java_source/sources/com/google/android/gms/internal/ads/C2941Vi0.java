package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2941Vi0 extends com.google.android.gms.internal.ads.AbstractC3947hi0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final java.lang.Object[] f32554J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    static final com.google.android.gms.internal.ads.C2941Vi0 f32555K;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.lang.Object[] f32556E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient int f32557F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final transient java.lang.Object[] f32558G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final transient int f32559H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final transient int f32560I;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f32554J = objArr;
        f32555K = new com.google.android.gms.internal.ads.C2941Vi0(objArr, 0, objArr, 0, 0);
    }

    C2941Vi0(java.lang.Object[] objArr, int i6, java.lang.Object[] objArr2, int i10, int i11) {
        this.f32556E = objArr;
        this.f32557F = i6;
        this.f32558G = objArr2;
        this.f32559H = i10;
        this.f32560I = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3947hi0
    final com.google.android.gms.internal.ads.AbstractC3398ci0 C() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.D(this.f32556E, this.f32560I);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3947hi0
    final boolean V() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.f32558G;
            if (objArr.length != 0) {
                int iB = com.google.android.gms.internal.ads.AbstractC2903Uh0.b(obj);
                while (true) {
                    int i6 = iB & this.f32559H;
                    java.lang.Object obj2 = objArr[i6];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i6 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int d(java.lang.Object[] objArr, int i6) {
        java.lang.System.arraycopy(this.f32556E, 0, objArr, i6, this.f32560I);
        return i6 + this.f32560I;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int e() {
        return this.f32560I;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3947hi0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f32557F;
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
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3011Xh0
    final java.lang.Object[] s() {
        return this.f32556E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f32560I;
    }
}
