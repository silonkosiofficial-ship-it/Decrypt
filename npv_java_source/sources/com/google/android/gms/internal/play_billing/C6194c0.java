package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6194c0 extends com.google.android.gms.internal.play_billing.AbstractC6206e0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient com.google.android.gms.internal.play_billing.AbstractC6206e0 f41523F;

    C6194c0(com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0) {
        this.f41523F = abstractC6206e0;
    }

    private final int P(int i6) {
        return (this.f41523F.size() - 1) - i6;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6206e0, com.google.android.gms.internal.play_billing.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f41523F.contains(obj);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.a(i6, this.f41523F.size(), "index");
        return this.f41523F.get(P(i6));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6206e0, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int iLastIndexOf = this.f41523F.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return P(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6206e0, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int iIndexOf = this.f41523F.indexOf(obj);
        if (iIndexOf >= 0) {
            return P(iIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final boolean n() {
        return this.f41523F.n();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6206e0
    public final com.google.android.gms.internal.play_billing.AbstractC6206e0 s() {
        return this.f41523F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41523F.size();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6206e0, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i6, int i10) {
        return subList(i6, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6206e0
    /* JADX INFO: renamed from: w */
    public final com.google.android.gms.internal.play_billing.AbstractC6206e0 subList(int i6, int i10) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.e(i6, i10, this.f41523F.size());
        com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0 = this.f41523F;
        return abstractC6206e0.subList(abstractC6206e0.size() - i10, this.f41523F.size() - i6).s();
    }
}
