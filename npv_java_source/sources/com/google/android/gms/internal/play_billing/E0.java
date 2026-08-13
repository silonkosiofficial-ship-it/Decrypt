package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class E0 extends com.google.android.gms.internal.play_billing.AbstractC6248l0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final transient com.google.android.gms.internal.play_billing.AbstractC6224h0 f41336E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient com.google.android.gms.internal.play_billing.AbstractC6206e0 f41337F;

    E0(com.google.android.gms.internal.play_billing.AbstractC6224h0 abstractC6224h0, com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0) {
        this.f41336E = abstractC6224h0;
        this.f41337F = abstractC6206e0;
    }

    @Override // com.google.android.gms.internal.play_billing.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f41336E.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int d(java.lang.Object[] objArr, int i6) {
        return this.f41337F.d(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6248l0, com.google.android.gms.internal.play_billing.Z
    public final com.google.android.gms.internal.play_billing.AbstractC6206e0 g() {
        return this.f41337F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.f41337F.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41336E.size();
    }
}
