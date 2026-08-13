package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class B0 extends com.google.android.gms.internal.play_billing.AbstractC6206e0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final com.google.android.gms.internal.play_billing.AbstractC6206e0 f41326H = new com.google.android.gms.internal.play_billing.B0(new java.lang.Object[0], 0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final transient java.lang.Object[] f41327F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final transient int f41328G;

    B0(java.lang.Object[] objArr, int i6) {
        this.f41327F = objArr;
        this.f41328G = i6;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6206e0, com.google.android.gms.internal.play_billing.Z
    final int d(java.lang.Object[] objArr, int i6) {
        java.lang.System.arraycopy(this.f41327F, 0, objArr, 0, this.f41328G);
        return this.f41328G;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int e() {
        return this.f41328G;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int f() {
        return 0;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.a(i6, this.f41328G, "index");
        java.lang.Object obj = this.f41327F[i6];
        j$.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final java.lang.Object[] o() {
        return this.f41327F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41328G;
    }
}
