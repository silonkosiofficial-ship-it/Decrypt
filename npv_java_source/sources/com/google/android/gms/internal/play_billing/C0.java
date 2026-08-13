package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class C0 extends com.google.android.gms.internal.play_billing.AbstractC6206e0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.play_billing.D0 f41330F;

    C0(com.google.android.gms.internal.play_billing.D0 d6) {
        this.f41330F = d6;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i6) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.a(i6, this.f41330F.f41334G, "index");
        int i10 = i6 + i6;
        java.lang.Object obj = this.f41330F.f41333F[i10];
        j$.util.Objects.requireNonNull(obj);
        java.lang.Object obj2 = this.f41330F.f41333F[i10 + 1];
        j$.util.Objects.requireNonNull(obj2);
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41330F.f41334G;
    }
}
