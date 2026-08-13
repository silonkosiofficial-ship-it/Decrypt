package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class H0 extends com.google.android.gms.internal.play_billing.AbstractC6248l0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final java.lang.Object[] f41410J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    static final com.google.android.gms.internal.play_billing.H0 f41411K;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.lang.Object[] f41412E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient int f41413F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final transient java.lang.Object[] f41414G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final transient int f41415H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final transient int f41416I;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f41410J = objArr;
        f41411K = new com.google.android.gms.internal.play_billing.H0(objArr, 0, objArr, 0, 0);
    }

    H0(java.lang.Object[] objArr, int i6, java.lang.Object[] objArr2, int i10, int i11) {
        this.f41412E = objArr;
        this.f41413F = i6;
        this.f41414G = objArr2;
        this.f41415H = i10;
        this.f41416I = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6248l0
    final boolean D() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.f41414G;
            if (objArr.length != 0) {
                int iA = com.google.android.gms.internal.play_billing.W.a(obj.hashCode());
                while (true) {
                    int i6 = iA & this.f41415H;
                    java.lang.Object obj2 = objArr[i6];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iA = i6 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int d(java.lang.Object[] objArr, int i6) {
        java.lang.System.arraycopy(this.f41412E, 0, objArr, 0, this.f41416I);
        return this.f41416I;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int e() {
        return this.f41416I;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6248l0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f41413F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final java.lang.Object[] o() {
        return this.f41412E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41416I;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6248l0
    final com.google.android.gms.internal.play_billing.AbstractC6206e0 w() {
        return com.google.android.gms.internal.play_billing.AbstractC6206e0.C(this.f41412E, this.f41416I);
    }
}
