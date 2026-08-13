package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class D0 extends com.google.android.gms.internal.play_billing.AbstractC6248l0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final transient com.google.android.gms.internal.play_billing.AbstractC6224h0 f41332E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient java.lang.Object[] f41333F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final transient int f41334G;

    D0(com.google.android.gms.internal.play_billing.AbstractC6224h0 abstractC6224h0, java.lang.Object[] objArr, int i6, int i10) {
        this.f41332E = abstractC6224h0;
        this.f41333F = objArr;
        this.f41334G = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && value.equals(this.f41332E.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int d(java.lang.Object[] objArr, int i6) {
        return g().d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41334G;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6248l0
    final com.google.android.gms.internal.play_billing.AbstractC6206e0 w() {
        return new com.google.android.gms.internal.play_billing.C0(this);
    }
}
