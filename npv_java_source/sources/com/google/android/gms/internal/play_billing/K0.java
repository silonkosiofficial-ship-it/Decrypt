package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class K0 extends com.google.android.gms.internal.play_billing.AbstractC6248l0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.lang.Object f41427E;

    K0(java.lang.Object obj) {
        obj.getClass();
        this.f41427E = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f41427E.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int d(java.lang.Object[] objArr, int i6) {
        objArr[0] = this.f41427E;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6248l0, com.google.android.gms.internal.play_billing.Z
    public final com.google.android.gms.internal.play_billing.AbstractC6206e0 g() {
        return com.google.android.gms.internal.play_billing.AbstractC6206e0.M(this.f41427E);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6248l0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f41427E.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.play_billing.C6272p0(this.f41427E);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return "[" + this.f41427E.toString() + "]";
    }
}
