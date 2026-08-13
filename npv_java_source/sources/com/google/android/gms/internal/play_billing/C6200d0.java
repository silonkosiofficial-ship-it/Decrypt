package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6200d0 extends com.google.android.gms.internal.play_billing.AbstractC6206e0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final transient int f41538F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final transient int f41539G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.play_billing.AbstractC6206e0 f41540H;

    C6200d0(com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0, int i6, int i10) {
        this.f41540H = abstractC6206e0;
        this.f41538F = i6;
        this.f41539G = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int e() {
        return this.f41540H.f() + this.f41538F + this.f41539G;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final int f() {
        return this.f41540H.f() + this.f41538F;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.a(i6, this.f41539G, "index");
        return this.f41540H.get(i6 + this.f41538F);
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    final java.lang.Object[] o() {
        return this.f41540H.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41539G;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6206e0, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i6, int i10) {
        return subList(i6, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6206e0
    /* JADX INFO: renamed from: w */
    public final com.google.android.gms.internal.play_billing.AbstractC6206e0 subList(int i6, int i10) {
        com.google.android.gms.internal.play_billing.AbstractC6294t.e(i6, i10, this.f41539G);
        int i11 = this.f41538F;
        return this.f41540H.subList(i6 + i11, i10 + i11);
    }
}
