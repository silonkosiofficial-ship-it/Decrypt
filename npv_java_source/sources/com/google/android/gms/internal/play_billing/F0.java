package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class F0 extends com.google.android.gms.internal.play_billing.AbstractC6206e0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient java.lang.Object[] f41339F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final transient int f41340G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final transient int f41341H;

    F0(java.lang.Object[] objArr, int i6, int i10) {
        this.f41339F = objArr;
        this.f41340G = i6;
        this.f41341H = i10;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.a(i6, this.f41341H, "index");
        java.lang.Object obj = this.f41339F[i6 + i6 + this.f41340G];
        j$.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41341H;
    }
}
